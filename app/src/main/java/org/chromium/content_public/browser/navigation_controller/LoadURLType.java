
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../content/public/browser/navigation_controller.h

package org.chromium.content_public.browser.navigation_controller;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    LoadURLType.DEFAULT, LoadURLType.HTTP_POST, LoadURLType.DATA
})
@Retention(RetentionPolicy.SOURCE)
public @interface LoadURLType {
  /**
   * For loads that do not fall into any types below.
   */
  int DEFAULT = 0;
  /**
   * An http post load request.  The post data is passed in |post_data|.
   */
  int HTTP_POST = 1;
  /**
   * Loads a 'data:' scheme URL with specified base URL and a history entry URL. This is only safe
   * to be used for browser-initiated data: URL navigations, since it shows arbitrary content as if
   * it comes from |virtual_url_for_data_url|. Adding new LoadURLType? Also update
   * LoadUrlParams.java static constants.
   */
  int DATA = 2;
}
