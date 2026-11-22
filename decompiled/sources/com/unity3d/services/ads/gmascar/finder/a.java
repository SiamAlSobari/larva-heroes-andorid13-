package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.gmascar.bridges.d;
import com.unity3d.services.ads.gmascar.bridges.e;

/* JADX INFO: compiled from: GMAInitializer.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private e a;
    private d b;
    private com.unity3d.services.ads.gmascar.bridges.c c;
    private com.unity3d.services.ads.gmascar.bridges.a d;
    private com.unity3d.services.ads.gmascar.utils.a e = new com.unity3d.services.ads.gmascar.utils.a();

    public a(e eVar, d dVar, com.unity3d.services.ads.gmascar.bridges.c cVar, com.unity3d.services.ads.gmascar.bridges.a aVar) {
        this.a = eVar;
        this.b = dVar;
        this.c = cVar;
        this.d = aVar;
    }

    public boolean a(Object obj) {
        Object obj2 = this.c.a(obj).get(this.a.g());
        if (obj2 != null) {
            if (this.d.a(obj2)) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.GMA, GMAEvent.INIT_SUCCESS, new Object[0]);
                return true;
            }
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.GMA, GMAEvent.INIT_ERROR, new Object[0]);
        }
        return false;
    }

    public void b() {
        if (c()) {
            this.e.a(GMAEvent.ALREADY_INITIALIZED, new Object[0]);
        } else {
            this.a.a(com.unity3d.services.core.properties.a.e(), this.b.i());
        }
    }

    public boolean c() {
        try {
            try {
                return a(this.a.i());
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("ERROR: Could not get initialization status of GMA SDK - %s", e.getLocalizedMessage());
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public d a() {
        return this.b;
    }
}
