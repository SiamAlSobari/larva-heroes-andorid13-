package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ConfigurationReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: ShowModuleDecoratorTimeout.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends d {
    private final ExecutorService b;
    private final boolean c;

    /* JADX INFO: compiled from: ShowModuleDecoratorTimeout.java */
    class a implements com.unity3d.services.core.timer.g {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        @Override // com.unity3d.services.core.timer.g
        public void a() {
            e.this.a(this.a, UnityAds.UnityAdsShowError.TIMEOUT, "[UnityAds] Timeout while trying to show " + this.a.c);
        }
    }

    /* JADX INFO: compiled from: ShowModuleDecoratorTimeout.java */
    class b implements Runnable {
        final /* synthetic */ g a;

        b(g gVar) {
            this.a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = this.a;
            if (gVar.e.block(gVar.d.getShowTimeout())) {
                return;
            }
            e.this.a(this.a, UnityAds.UnityAdsShowError.TIMEOUT, "[UnityAds] Timeout while trying to show " + this.a.c);
        }
    }

    public e(com.unity3d.services.ads.operation.show.a aVar, ConfigurationReader configurationReader) {
        super(aVar);
        this.b = Executors.newSingleThreadExecutor();
        this.c = configurationReader.getCurrentConfiguration().getExperiments().isNewLifecycleTimer();
    }

    private void d(String str) {
        g gVarC;
        com.unity3d.services.ads.operation.show.b bVar = get(str);
        if (bVar == null || (gVarC = bVar.c()) == null) {
            return;
        }
        if (!this.c) {
            if (bVar.c().e == null) {
                return;
            }
            bVar.c().e.open();
        } else {
            com.unity3d.services.core.timer.a aVar = gVarC.g;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    @Override // com.unity3d.services.ads.operation.show.d, com.unity3d.services.ads.operation.show.a
    public void b(String str) {
        d(str);
        super.b(str);
    }

    @Override // com.unity3d.services.ads.operation.show.d, com.unity3d.services.ads.operation.show.a
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        d(str);
        super.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    @Override // com.unity3d.services.ads.operation.show.d, com.unity3d.services.ads.operation.show.a
    public void onUnityAdsShowStart(String str) {
        d(str);
        super.onUnityAdsShowStart(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.c
    public void a(com.unity3d.services.core.webview.bridge.b bVar, g gVar) {
        a().a(com.unity3d.services.core.request.metrics.b.b());
        gVar.e();
        a(gVar);
        super.a(bVar, gVar);
    }

    private void a(g gVar) {
        if (!this.c) {
            this.b.submit(new b(gVar));
        } else {
            if (gVar == null) {
                return;
            }
            com.unity3d.services.core.timer.a aVar = new com.unity3d.services.core.timer.a(Integer.valueOf(gVar.d.getShowTimeout()), new a(gVar));
            gVar.g = aVar;
            aVar.a(Executors.newSingleThreadScheduledExecutor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(g gVar, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        if (gVar != null) {
            a().a(com.unity3d.services.core.request.metrics.b.b(com.unity3d.services.core.request.metrics.a.timeout, Long.valueOf(gVar.d())));
            a(gVar.b);
            gVar.a(unityAdsShowError, str);
        }
    }
}
