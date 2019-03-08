// Copyright 2018 The Feed Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.android.libraries.feed.basicstream.internal.scroll;

import static com.google.android.libraries.feed.common.Validators.checkNotNull;
import static com.google.android.libraries.feed.common.Validators.checkState;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState;
import com.google.android.libraries.feed.common.logging.Logger;
import com.google.android.libraries.feed.host.config.Configuration;
import com.google.android.libraries.feed.host.config.Configuration.ConfigKey;

/**
 * Class which is able to save a scroll position for a RecyclerView and restore to that scroll
 * position at a later time.
 */
public class ScrollRestorer {

  private static final String TAG = "ScrollRestorer";

  private static final boolean ABANDON_RESTORE_BELOW_FOLD_DEFAULT = true;
  private static final int ABANDON_RESTORE_BELOW_FOLD_THRESHOLD_DEFAULT = 10;

  private final Configuration configuration;
  private final RecyclerView recyclerView;
  private final StreamScrollMonitor streamScrollMonitor;
  private final int scrollPosition;
  private final int scrollOffset;

  private boolean canRestore;

  public ScrollRestorer(
      Configuration configuration,
      RecyclerView recyclerView,
      StreamScrollMonitor streamScrollMonitor,
      /*@Nullable*/ ScrollState scrollState) {
    this.configuration = configuration;
    this.recyclerView = recyclerView;
    this.streamScrollMonitor = streamScrollMonitor;

    if (scrollState != null) {
      canRestore = true;
      scrollPosition = scrollState.getPosition();
      scrollOffset = scrollState.getOffset();
    } else {
      this.scrollPosition = 0;
      this.scrollOffset = 0;
    }
  }

  private ScrollRestorer(
      Configuration configuration,
      RecyclerView recyclerView,
      StreamScrollMonitor streamScrollMonitor) {
    canRestore = false;
    this.configuration = configuration;
    this.recyclerView = recyclerView;
    this.streamScrollMonitor = streamScrollMonitor;
    scrollPosition = 0;
    scrollOffset = 0;
  }

  /**
   * Creates a {@code StreamRestorer} which will never restore state. This can be used to fulfill
   * {@code StreamRestorer} requests when no restore state is present.
   */
  public static ScrollRestorer nonRestoringRestorer(
      Configuration configuration,
      RecyclerView recyclerView,
      StreamScrollMonitor streamScrollMonitor) {
    return new ScrollRestorer(configuration, recyclerView, streamScrollMonitor);
  }

  /**
   * Disables the ability of the {@code ScrollRestorer} from restoring the scroll. This should be
   * call if the previous scroll position is no longer valid. An example use case of this would be
   * if the restoring session is no longer valid.
   */
  public void abandonRestoringScroll() {
    canRestore = false;
  }

  /**
   * Attempts to restore scroll position if possible. If the scroll position has already been
   * restored, then this method will no-op.
   */
  public void maybeRestoreScroll() {
    if (!canRestore) {
      return;
    }
    Logger.d(TAG, "Restoring scroll");
    getLayoutManager().scrollToPositionWithOffset(scrollPosition, scrollOffset);
    streamScrollMonitor.onProgrammaticScroll();
    canRestore = false;
  }

  /**
   * Returns a bundle which can be used for restoring scroll state on an activity restart.
   *
   * @param currentHeaderCount The amount of headers which appear before Stream content.
   */
  /*@Nullable*/
  public ScrollState getScrollStateForScrollRestore(int currentHeaderCount) {
    LinearLayoutManager layoutManager = getLayoutManager();

    int scrollPosition = layoutManager.findFirstVisibleItemPosition();
    if (scrollPosition == RecyclerView.NO_POSITION) {
      return null;
    }

    View view = layoutManager.findViewByPosition(scrollPosition);
    if (view == null) {
      return null;
    }

    // Determine if we can restore past the fold.
    if (configuration.getValueOrDefault(
        ConfigKey.ABANDON_RESTORE_BELOW_FOLD, ABANDON_RESTORE_BELOW_FOLD_DEFAULT)) {
      int bottomScrollPosition = layoutManager.findLastVisibleItemPosition();
      int threshold =
          configuration.getValueOrDefault(
              ConfigKey.ABANDON_RESTORE_BELOW_FOLD_THRESHOLD,
              ABANDON_RESTORE_BELOW_FOLD_THRESHOLD_DEFAULT);

      if (bottomScrollPosition == RecyclerView.NO_POSITION
          || bottomScrollPosition - currentHeaderCount > threshold) {
        Logger.w(
            TAG,
            "Abandoning scroll due to fold threshold.  Bottom scroll index: %d, Header "
                + "count: %d, Configured Threshold: %d",
            bottomScrollPosition,
            currentHeaderCount,
            threshold);
        return null;
      }
    }

    return ScrollState.newBuilder().setPosition(scrollPosition).setOffset(view.getTop()).build();
  }

  private LinearLayoutManager getLayoutManager() {
    checkState(
        recyclerView.getLayoutManager() instanceof LinearLayoutManager,
        "Scroll state can only be restored when using a LinearLayoutManager.");
    return checkNotNull((LinearLayoutManager) recyclerView.getLayoutManager());
  }
}
