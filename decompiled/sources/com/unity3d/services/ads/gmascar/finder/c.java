package com.unity3d.services.ads.gmascar.finder;

import com.google.ads.AdRequest;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.gmascar.bridges.e;

/* JADX INFO: compiled from: ScarVersionFinder.java */
/* JADX INFO: loaded from: classes2.dex */
public class c implements com.unity3d.services.ads.gmascar.listeners.a {
    private static e a;
    private b b;
    private a c;
    private long d = -1;

    public c(e eVar, b bVar, a aVar) {
        a = eVar;
        this.b = bVar;
        this.c = aVar;
        aVar.a().a(this);
    }

    public void a(boolean z) {
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.INIT_GMA, GMAEvent.VERSION, z ? a.j() : AdRequest.VERSION);
    }

    public void b() {
        try {
            if (!this.b.a()) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.INIT_GMA, GMAEvent.VERSION, AdRequest.VERSION);
            } else if (this.c.c()) {
                a(true);
            } else {
                this.c.b();
            }
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Got exception finding GMA SDK: %s", e.getLocalizedMessage());
        }
    }

    public long a() {
        String strJ;
        if (this.d == -1 && (strJ = a.j()) != null) {
            String[] strArrSplit = strJ.split("\\.");
            if (strArrSplit.length > 1) {
                this.d = Long.parseLong(strArrSplit[1]);
            }
        }
        return this.d;
    }

    @Override // com.unity3d.services.ads.gmascar.listeners.a
    public void a(Object obj) {
        a(this.c.a(obj));
    }
}
