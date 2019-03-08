
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/public_ip_address_geolocation_provider.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface PublicIpAddressGeolocationProvider extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PublicIpAddressGeolocationProvider, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PublicIpAddressGeolocationProvider, PublicIpAddressGeolocationProvider.Proxy> MANAGER = PublicIpAddressGeolocationProvider_Internal.MANAGER;


    void createGeolocation(
org.chromium.network.mojom.MutablePartialNetworkTrafficAnnotationTag tag, org.chromium.mojo.bindings.InterfaceRequest<Geolocation> request);


}
