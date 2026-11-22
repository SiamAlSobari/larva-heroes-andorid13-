package com.unity3d.services.core.request;

import android.os.Bundle;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: WebRequestRunnable.java */
/* JADX INFO: loaded from: classes2.dex */
public class k implements Runnable {
    private h a;
    private boolean b = false;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final int g;
    private final Map<String, List<String>> h;
    private final c i;

    public k(String str, String str2, String str3, int i, int i2, Map<String, List<String>> map, c cVar) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = i2;
        this.h = map;
        this.i = cVar;
    }

    public void a(boolean z) {
        h hVar;
        this.b = z;
        if (!z || (hVar = this.a) == null) {
            return;
        }
        hVar.a();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.unity3d.services.core.log.a.b("Handling request message: " + this.c + " type=" + this.d);
        try {
            a(this.c, this.d, this.h, this.e, this.f, this.g);
        } catch (MalformedURLException e) {
            com.unity3d.services.core.log.a.a("Malformed URL", e);
            a("Malformed URL");
        }
    }

    private void a(String str, String str2, Map<String, List<String>> map, String str3, int i, int i2) throws MalformedURLException {
        if (this.b) {
            return;
        }
        h hVar = new h(str, str2, map, i, i2);
        this.a = hVar;
        if (str3 != null) {
            hVar.a(str3);
        }
        try {
            String strN = this.a.n();
            if (this.a.m()) {
                return;
            }
            Bundle bundle = new Bundle();
            for (String str4 : this.a.k().keySet()) {
                if (str4 != null && !str4.contentEquals("null")) {
                    String[] strArr = new String[this.a.k().get(str4).size()];
                    for (int i3 = 0; i3 < this.a.k().get(str4).size(); i3++) {
                        strArr[i3] = this.a.k().get(str4).get(i3);
                    }
                    bundle.putStringArray(str4, strArr);
                }
            }
            if (this.a.m()) {
                return;
            }
            a(strN, this.a.j(), a(bundle));
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Error completing request", e);
            a(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    private void a(String str, int i, Map<String, List<String>> map) {
        this.i.a(this.c, str, i, map);
    }

    private void a(String str) {
        this.i.a(this.c, str);
    }

    private Map<String, List<String>> a(Bundle bundle) {
        if (bundle.size() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            String[] stringArray = bundle.getStringArray(str);
            if (stringArray != null) {
                map.put(str, new ArrayList(Arrays.asList(stringArray)));
            }
        }
        return map;
    }
}
