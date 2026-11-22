package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;

/* JADX INFO: compiled from: ScarAdHandlerBase.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements IScarAdListenerWrapper {
    protected final ScarAdMetadata a;
    protected final com.unity3d.services.core.misc.a<GMAEvent> b;
    protected final com.unity3d.services.ads.gmascar.utils.a c = new com.unity3d.services.ads.gmascar.utils.a();

    /* JADX INFO: renamed from: com.unity3d.services.ads.gmascar.handlers.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ScarAdHandlerBase.java */
    class C0032a implements com.unity3d.services.core.misc.b<GMAEvent> {
        C0032a() {
        }

        @Override // com.unity3d.services.core.misc.b
        public void a(GMAEvent gMAEvent) {
            a.this.c.a(gMAEvent, new Object[0]);
        }
    }

    public a(ScarAdMetadata scarAdMetadata, com.unity3d.services.core.misc.a<GMAEvent> aVar) {
        this.a = scarAdMetadata;
        this.b = aVar;
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        this.c.a(GMAEvent.AD_CLOSED, new Object[0]);
        this.b.e();
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdFailedToLoad(int i, String str) {
        this.c.a(GMAEvent.LOAD_ERROR, this.a.getPlacementId(), this.a.getQueryId(), str, Integer.valueOf(i));
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdLoaded() {
        this.c.a(GMAEvent.AD_LOADED, this.a.getPlacementId(), this.a.getQueryId());
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdOpened() {
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.GMA, GMAEvent.AD_STARTED, new Object[0]);
        this.b.a(new C0032a());
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdSkipped() {
        this.c.a(GMAEvent.AD_SKIPPED, new Object[0]);
    }
}
