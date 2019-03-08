
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


public final class MediaSessionInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0),new org.chromium.mojo.bindings.DataHeader(24, 1)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[1];

    public static final class SessionState {


        public static final int ACTIVE = 0;

        public static final int DUCKING = ACTIVE + 1;

        public static final int SUSPENDED = DUCKING + 1;

        public static final int INACTIVE = SUSPENDED + 1;

        public static final int MIN_VALUE = (int) (0);
        public static final int MAX_VALUE = (int) (3);

        private static final boolean IS_EXTENSIBLE = true;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private SessionState() {}

    }
    public int state;
    public boolean forceDuck;
    public int playbackState;

    private MediaSessionInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public MediaSessionInfo() {
        this(1);
    }

    public static MediaSessionInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static MediaSessionInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static MediaSessionInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        MediaSessionInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new MediaSessionInfo(elementsOrVersion);
                {
                    
                result.state = decoder0.readInt(8);
                    MediaSessionInfo.SessionState.validate(result.state);
                }
                {
                    
                result.forceDuck = decoder0.readBoolean(12, 0);
                }
            if (elementsOrVersion >= 1) {
                {
                    
                result.playbackState = decoder0.readInt(16);
                    MediaPlaybackState.validate(result.playbackState);
                }
            }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.state, 8);
        
        encoder0.encode(this.forceDuck, 12, 0);
        
        encoder0.encode(this.playbackState, 16);
    }
}