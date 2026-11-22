package com.unity3d.services.ads.gmascar;

import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarAdapter;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.ads.gmascar.bridges.d;
import com.unity3d.services.ads.gmascar.bridges.e;
import com.unity3d.services.ads.gmascar.finder.b;
import com.unity3d.services.ads.gmascar.finder.c;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: GMAScarAdapterBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private IScarAdapter a;
    private final e b;
    private final c c;
    private final d d;
    private final com.unity3d.services.ads.gmascar.bridges.c e;
    private final com.unity3d.services.ads.gmascar.bridges.a f;
    private final b g;
    private final com.unity3d.services.ads.gmascar.finder.a h;
    private final com.unity3d.services.ads.gmascar.handlers.e i;
    private final com.unity3d.services.ads.gmascar.adapters.a j;
    private final com.unity3d.services.ads.gmascar.utils.a k;

    public a() {
        e eVar = new e();
        this.b = eVar;
        com.unity3d.services.ads.gmascar.bridges.c cVar = new com.unity3d.services.ads.gmascar.bridges.c();
        this.e = cVar;
        d dVar = new d();
        this.d = dVar;
        com.unity3d.services.ads.gmascar.bridges.a aVar = new com.unity3d.services.ads.gmascar.bridges.a();
        this.f = aVar;
        this.i = new com.unity3d.services.ads.gmascar.handlers.e();
        this.j = new com.unity3d.services.ads.gmascar.adapters.a();
        b bVar = new b(eVar, dVar, cVar, aVar);
        this.g = bVar;
        com.unity3d.services.ads.gmascar.finder.a aVar2 = new com.unity3d.services.ads.gmascar.finder.a(eVar, dVar, cVar, aVar);
        this.h = aVar2;
        this.c = new c(eVar, bVar, aVar2);
        this.k = new com.unity3d.services.ads.gmascar.utils.a();
    }

    public void a(String[] strArr, String[] strArr2) {
        this.a = a();
        com.unity3d.services.ads.gmascar.handlers.d dVar = new com.unity3d.services.ads.gmascar.handlers.d();
        IScarAdapter iScarAdapter = this.a;
        if (iScarAdapter != null) {
            iScarAdapter.getSCARSignals(com.unity3d.services.core.properties.a.e(), strArr, strArr2, dVar);
        } else {
            this.i.handleError(GMAAdsError.InternalSignalsError("Could not create SCAR adapter object"));
        }
    }

    public void b() {
        this.c.b();
    }

    public void c() {
        if (!this.g.a()) {
            this.i.handleError(new GMAAdsError(GMAEvent.SCAR_NOT_PRESENT, new Object[0]));
        } else {
            this.k.a(GMAEvent.SCAR_PRESENT, new Object[0]);
            this.h.b();
        }
    }

    public boolean d() {
        return this.h.c();
    }

    private void b(ScarAdMetadata scarAdMetadata) {
        this.a.loadRewardedAd(com.unity3d.services.core.properties.a.e(), scarAdMetadata, new com.unity3d.services.ads.gmascar.handlers.c(scarAdMetadata, a(scarAdMetadata.getVideoLengthMs())));
    }

    public void a(boolean z, String str, String str2, String str3, String str4, int i) {
        ScarAdMetadata scarAdMetadata = new ScarAdMetadata(str, str2, str4, str3, Integer.valueOf(i));
        IScarAdapter iScarAdapterA = a();
        this.a = iScarAdapterA;
        if (iScarAdapterA == null) {
            this.i.handleError(GMAAdsError.InternalLoadError(scarAdMetadata, "Scar Adapter object is null"));
        } else if (z) {
            a(scarAdMetadata);
        } else {
            b(scarAdMetadata);
        }
    }

    private void a(ScarAdMetadata scarAdMetadata) {
        this.a.loadInterstitialAd(com.unity3d.services.core.properties.a.e(), scarAdMetadata, new com.unity3d.services.ads.gmascar.handlers.b(scarAdMetadata, a(scarAdMetadata.getVideoLengthMs())));
    }

    public void a(String str, String str2, boolean z) {
        ScarAdMetadata scarAdMetadata = new ScarAdMetadata(str, str2);
        IScarAdapter iScarAdapterA = a();
        this.a = iScarAdapterA;
        if (iScarAdapterA != null) {
            iScarAdapterA.show(com.unity3d.services.core.properties.a.a(), str2, str);
        } else {
            this.i.handleError(GMAAdsError.InternalShowError(scarAdMetadata, "Scar Adapter object is null"));
        }
    }

    private com.unity3d.services.core.misc.a a(Integer num) {
        return new com.unity3d.services.core.misc.a(new ArrayDeque(Arrays.asList(GMAEvent.FIRST_QUARTILE, GMAEvent.MIDPOINT, GMAEvent.THIRD_QUARTILE, GMAEvent.LAST_QUARTILE)), num, new com.unity3d.services.core.timer.b());
    }

    private IScarAdapter a() {
        if (this.a == null) {
            this.a = this.j.a(this.c.a(), this.i);
        }
        return this.a;
    }
}
