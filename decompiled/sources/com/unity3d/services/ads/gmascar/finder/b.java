package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.services.ads.gmascar.bridges.d;
import com.unity3d.services.ads.gmascar.bridges.e;

/* JADX INFO: compiled from: PresenceDetector.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    private e a;
    private d b;
    private com.unity3d.services.ads.gmascar.bridges.c c;
    private com.unity3d.services.ads.gmascar.bridges.a d;

    public b(e eVar, d dVar, com.unity3d.services.ads.gmascar.bridges.c cVar, com.unity3d.services.ads.gmascar.bridges.a aVar) {
        this.a = eVar;
        this.b = dVar;
        this.c = cVar;
        this.d = aVar;
    }

    public boolean a() {
        e eVar = this.a;
        return eVar != null && this.b != null && this.c != null && this.d != null && eVar.f() && this.b.f() && this.c.f() && this.d.f();
    }
}
