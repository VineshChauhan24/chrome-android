
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface NetworkContext extends org.chromium.mojo.bindings.Interface {



    public static final class DomainReliabilityClearMode {


        public static final int CLEAR_CONTEXTS = 0;

        public static final int CLEAR_BEACONS = CLEAR_CONTEXTS + 1;

        public static final int MIN_VALUE = (int) (0);
        public static final int MAX_VALUE = (int) (1);

        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private DomainReliabilityClearMode() {}

    }


    public interface Proxy extends NetworkContext, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NetworkContext, NetworkContext.Proxy> MANAGER = NetworkContext_Internal.MANAGER;


    void setClient(
NetworkContextClient client);



    void createUrlLoaderFactory(
org.chromium.mojo.bindings.InterfaceRequest<UrlLoaderFactory> urlLoaderFactory, UrlLoaderFactoryParams params);



    void resetUrlLoaderFactories(
);



    void getCookieManager(
org.chromium.mojo.bindings.InterfaceRequest<CookieManager> cookieManager);



    void getRestrictedCookieManager(
org.chromium.mojo.bindings.InterfaceRequest<RestrictedCookieManager> restrictedCookieManager, org.chromium.url.mojom.Origin origin);



    void clearNetworkingHistorySince(
org.chromium.mojo_base.mojom.Time startTime, 
ClearNetworkingHistorySinceResponse callback);

    interface ClearNetworkingHistorySinceResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearHttpCache(
org.chromium.mojo_base.mojom.Time startTime, org.chromium.mojo_base.mojom.Time endTime, ClearDataFilter filter, 
ClearHttpCacheResponse callback);

    interface ClearHttpCacheResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void computeHttpCacheSize(
org.chromium.mojo_base.mojom.Time startTime, org.chromium.mojo_base.mojom.Time endTime, 
ComputeHttpCacheSizeResponse callback);

    interface ComputeHttpCacheSizeResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Boolean, Long> { }



    void writeCacheMetadata(
org.chromium.url.mojom.Url url, int priority, org.chromium.mojo_base.mojom.Time expectedResponseTime, byte[] data);



    void clearChannelIds(
org.chromium.mojo_base.mojom.Time startTime, org.chromium.mojo_base.mojom.Time endTime, ClearDataFilter filter, 
ClearChannelIdsResponse callback);

    interface ClearChannelIdsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearHostCache(
ClearDataFilter filter, 
ClearHostCacheResponse callback);

    interface ClearHostCacheResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearHttpAuthCache(
org.chromium.mojo_base.mojom.Time startTime, 
ClearHttpAuthCacheResponse callback);

    interface ClearHttpAuthCacheResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearReportingCacheReports(
ClearDataFilter filter, 
ClearReportingCacheReportsResponse callback);

    interface ClearReportingCacheReportsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearReportingCacheClients(
ClearDataFilter filter, 
ClearReportingCacheClientsResponse callback);

    interface ClearReportingCacheClientsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearNetworkErrorLogging(
ClearDataFilter filter, 
ClearNetworkErrorLoggingResponse callback);

    interface ClearNetworkErrorLoggingResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearDomainReliability(
ClearDataFilter filter, int mode, 
ClearDomainReliabilityResponse callback);

    interface ClearDomainReliabilityResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void getDomainReliabilityJson(

GetDomainReliabilityJsonResponse callback);

    interface GetDomainReliabilityJsonResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.Value> { }



    void queueReport(
String type, String group, org.chromium.url.mojom.Url url, String userAgent, org.chromium.mojo_base.mojom.DictionaryValue body);



    void closeAllConnections(

CloseAllConnectionsResponse callback);

    interface CloseAllConnectionsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void closeIdleConnections(

CloseIdleConnectionsResponse callback);

    interface CloseIdleConnectionsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void setNetworkConditions(
org.chromium.mojo_base.mojom.UnguessableToken throttlingProfileId, NetworkConditions conditions);



    void setAcceptLanguage(
String newAcceptLanguage);



    void setEnableReferrers(
boolean enableReferrers);



    void setCtPolicy(
String[] requiredHosts, String[] excludedHosts, String[] excludedSpkis, String[] excludedLegacySpkis);



    void addExpectCt(
String host, org.chromium.mojo_base.mojom.Time expiry, boolean enforce, org.chromium.url.mojom.Url reportUri, 
AddExpectCtResponse callback);

    interface AddExpectCtResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void setExpectCtTestReport(
org.chromium.url.mojom.Url reportUri, 
SetExpectCtTestReportResponse callback);

    interface SetExpectCtTestReportResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void getExpectCtState(
String domain, 
GetExpectCtStateResponse callback);

    interface GetExpectCtStateResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.DictionaryValue> { }



    void createUdpSocket(
org.chromium.mojo.bindings.InterfaceRequest<UdpSocket> request, UdpSocketReceiver receiver);



    void createTcpServerSocket(
IpEndPoint localAddr, int backlog, MutableNetworkTrafficAnnotationTag trafficAnnotation, org.chromium.mojo.bindings.InterfaceRequest<TcpServerSocket> socket, 
CreateTcpServerSocketResponse callback);

    interface CreateTcpServerSocketResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, IpEndPoint> { }



    void createTcpConnectedSocket(
IpEndPoint localAddr, AddressList remoteAddrList, TcpConnectedSocketOptions tcpConnectedSocketOptions, MutableNetworkTrafficAnnotationTag trafficAnnotation, org.chromium.mojo.bindings.InterfaceRequest<TcpConnectedSocket> socket, SocketObserver observer, 
CreateTcpConnectedSocketResponse callback);

    interface CreateTcpConnectedSocketResponse extends org.chromium.mojo.bindings.Callbacks.Callback5<Integer, IpEndPoint, IpEndPoint, org.chromium.mojo.system.DataPipe.ConsumerHandle, org.chromium.mojo.system.DataPipe.ProducerHandle> { }



    void createTcpBoundSocket(
IpEndPoint localAddr, MutableNetworkTrafficAnnotationTag trafficAnnotation, org.chromium.mojo.bindings.InterfaceRequest<TcpBoundSocket> socket, 
CreateTcpBoundSocketResponse callback);

    interface CreateTcpBoundSocketResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, IpEndPoint> { }



    void createProxyResolvingSocketFactory(
org.chromium.mojo.bindings.InterfaceRequest<ProxyResolvingSocketFactory> factory);



    void lookUpProxyForUrl(
org.chromium.url.mojom.Url url, ProxyLookupClient proxyLookupClient);



    void forceReloadProxyConfig(

ForceReloadProxyConfigResponse callback);

    interface ForceReloadProxyConfigResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearBadProxiesCache(

ClearBadProxiesCacheResponse callback);

    interface ClearBadProxiesCacheResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void createWebSocket(
org.chromium.mojo.bindings.InterfaceRequest<WebSocket> request, int processId, int renderFrameId, org.chromium.url.mojom.Origin origin, AuthenticationHandler authHandler);



    void createNetLogExporter(
org.chromium.mojo.bindings.InterfaceRequest<NetLogExporter> exporter);



    void preconnectSockets(
int numStreams, org.chromium.url.mojom.Url url, int loadFlags, boolean privacyModeEnabled);



    void createP2pSocketManager(
P2pTrustedSocketManagerClient client, org.chromium.mojo.bindings.InterfaceRequest<P2pTrustedSocketManager> trustedSocketManager, org.chromium.mojo.bindings.InterfaceRequest<P2pSocketManager> socketManager);



    void createMdnsResponder(
org.chromium.mojo.bindings.InterfaceRequest<MdnsResponder> responderRequest);



    void resolveHost(
HostPortPair host, ResolveHostParameters optionalParameters, ResolveHostClient responseClient);



    void createHostResolver(
DnsConfigOverrides configOverrides, org.chromium.mojo.bindings.InterfaceRequest<HostResolver> hostResolver);



    void verifyCertForSignedExchange(
X509Certificate certificate, org.chromium.url.mojom.Url url, String ocspResponse, String sctList, 
VerifyCertForSignedExchangeResponse callback);

    interface VerifyCertForSignedExchangeResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Integer, CertVerifyResult, CtVerifyResult> { }



    void addHsts(
String host, org.chromium.mojo_base.mojom.Time expiry, boolean includeSubdomains, 
AddHstsResponse callback);

    interface AddHstsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void isHstsActiveForHost(
String host, 
IsHstsActiveForHostResponse callback);

    interface IsHstsActiveForHostResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void getHstsState(
String domain, 
GetHstsStateResponse callback);

    interface GetHstsStateResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.DictionaryValue> { }



    void setCorsOriginAccessListsForOrigin(
org.chromium.url.mojom.Origin sourceOrigin, CorsOriginPattern[] allowPatterns, CorsOriginPattern[] blockPatterns, 
SetCorsOriginAccessListsForOriginResponse callback);

    interface SetCorsOriginAccessListsForOriginResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void deleteDynamicDataForHost(
String host, 
DeleteDynamicDataForHostResponse callback);

    interface DeleteDynamicDataForHostResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void lookupBasicAuthCredentials(
org.chromium.url.mojom.Url url, 
LookupBasicAuthCredentialsResponse callback);

    interface LookupBasicAuthCredentialsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<AuthCredentials> { }



    void enableStaticKeyPinningForTesting(

EnableStaticKeyPinningForTestingResponse callback);

    interface EnableStaticKeyPinningForTestingResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void setFailingHttpTransactionForTesting(
int rv, 
SetFailingHttpTransactionForTestingResponse callback);

    interface SetFailingHttpTransactionForTestingResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void verifyCertificateForTesting(
X509Certificate certificate, String hostname, String ocspResponse, 
VerifyCertificateForTestingResponse callback);

    interface VerifyCertificateForTestingResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void addDomainReliabilityContextForTesting(
org.chromium.url.mojom.Url origin, org.chromium.url.mojom.Url uploadUrl, 
AddDomainReliabilityContextForTestingResponse callback);

    interface AddDomainReliabilityContextForTestingResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void forceDomainReliabilityUploadsForTesting(

ForceDomainReliabilityUploadsForTestingResponse callback);

    interface ForceDomainReliabilityUploadsForTestingResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


}
