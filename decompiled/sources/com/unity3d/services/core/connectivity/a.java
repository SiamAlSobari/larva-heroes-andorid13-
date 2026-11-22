package com.unity3d.services.core.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: ConnectivityChangeReceiver.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends BroadcastReceiver {
    private static a a;

    public static void a() {
        if (a == null) {
            a = new a();
            com.unity3d.services.core.properties.a.e().registerReceiver(a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public static void b() {
        if (a != null) {
            com.unity3d.services.core.properties.a.e().unregisterReceiver(a);
            a = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo;
        if (intent.getBooleanExtra("noConnectivity", false)) {
            c.c();
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return;
        }
        c.a();
    }
}
