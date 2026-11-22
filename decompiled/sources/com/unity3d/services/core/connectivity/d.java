package com.unity3d.services.core.connectivity;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;

/* JADX INFO: compiled from: ConnectivityNetworkCallback.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends ConnectivityManager.NetworkCallback {
    private static d a;

    public static synchronized void a() {
        if (a == null) {
            a = new d();
            ((ConnectivityManager) com.unity3d.services.core.properties.a.e().getSystemService("connectivity")).registerNetworkCallback(new NetworkRequest.Builder().build(), a);
        }
    }

    public static synchronized void b() {
        if (a != null) {
            ((ConnectivityManager) com.unity3d.services.core.properties.a.e().getSystemService("connectivity")).unregisterNetworkCallback(a);
            a = null;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        c.a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        c.b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        c.b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        c.c();
    }
}
