
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/media_session/public/mojom/media_session.mojom
//

package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface MediaSession extends org.chromium.mojo.bindings.Interface {



    public static final class SuspendType {


        public static final int SYSTEM = 0;

        public static final int UI = SYSTEM + 1;

        public static final int CONTENT = UI + 1;

        public static final int MIN_VALUE = (int) (0);
        public static final int MAX_VALUE = (int) (2);

        private static final boolean IS_EXTENSIBLE = true;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private SuspendType() {}

    }


    public interface Proxy extends MediaSession, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<MediaSession, MediaSession.Proxy> MANAGER = MediaSession_Internal.MANAGER;


    void getMediaSessionInfo(

GetMediaSessionInfoResponse callback);

    interface GetMediaSessionInfoResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<MediaSessionInfo> { }



    void getDebugInfo(

GetDebugInfoResponse callback);

    interface GetDebugInfoResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<MediaSessionDebugInfo> { }



    void startDucking(
);



    void stopDucking(
);



    void suspend(
int suspendType);



    void resume(
int suspendType);



    void addObserver(
MediaSessionObserver observer);



    void previousTrack(
);



    void nextTrack(
);



    void seek(
org.chromium.mojo_base.mojom.TimeDelta seekTime);


}
