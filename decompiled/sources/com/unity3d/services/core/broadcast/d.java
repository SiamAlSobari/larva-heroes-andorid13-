package com.unity3d.services.core.broadcast;

import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: BroadcastMonitor.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    private static Map<String, c> a;

    public static void a(String str, String str2, String[] strArr) {
        a(str);
        IntentFilter intentFilter = new IntentFilter();
        for (String str3 : strArr) {
            intentFilter.addAction(str3);
        }
        if (str2 != null) {
            intentFilter.addDataScheme(str2);
        }
        if (a == null) {
            a = new HashMap();
        }
        c cVar = new c(str);
        a.put(str, cVar);
        com.unity3d.services.core.properties.a.e().registerReceiver(cVar, intentFilter);
    }

    public static void a(String str) {
        Map<String, c> map = a;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        com.unity3d.services.core.properties.a.e().unregisterReceiver(a.get(str));
        a.remove(str);
    }

    public static void a() {
        Map<String, c> map = a;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                com.unity3d.services.core.properties.a.e().unregisterReceiver(a.get(it.next()));
            }
            a = null;
        }
    }
}
