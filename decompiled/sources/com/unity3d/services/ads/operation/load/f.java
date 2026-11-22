package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ConfigurationReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: LoadModuleDecoratorTimeout.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends d {
    private final ExecutorService b;
    private final boolean c;

    /* JADX INFO: compiled from: LoadModuleDecoratorTimeout.java */
    class a implements com.unity3d.services.core.timer.g {
        final /* synthetic */ h a;

        a(h hVar) {
            this.a = hVar;
        }

        @Override // com.unity3d.services.core.timer.g
        public void a() {
            f.this.a(this.a);
        }
    }

    /* JADX INFO: compiled from: LoadModuleDecoratorTimeout.java */
    class b implements Runnable {
        final /* synthetic */ h a;

        b(h hVar) {
            this.a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = this.a;
            if (hVar.e.block(hVar.d.getLoadTimeout())) {
                return;
            }
            f.this.a(this.a);
        }
    }

    public f(com.unity3d.services.ads.operation.load.a aVar, ConfigurationReader configurationReader) {
        super(aVar);
        this.b = Executors.newCachedThreadPool();
        this.c = configurationReader.getCurrentConfiguration().getExperiments().isNewLifecycleTimer();
    }

    private void b(h hVar) {
        if (!this.c) {
            this.b.submit(new b(hVar));
        } else {
            if (hVar == null) {
                return;
            }
            com.unity3d.services.core.timer.a aVar = new com.unity3d.services.core.timer.a(Integer.valueOf(hVar.d.getLoadTimeout()), new a(hVar));
            hVar.g = aVar;
            aVar.a(Executors.newSingleThreadScheduledExecutor());
        }
    }

    private void d(String str) {
        h hVarB;
        com.unity3d.services.ads.operation.load.b bVar = get(str);
        if (bVar == null || (hVarB = bVar.b()) == null) {
            return;
        }
        if (!this.c) {
            if (bVar.b().e == null) {
                return;
            }
            bVar.b().e.open();
        } else {
            com.unity3d.services.core.timer.a aVar = hVarB.g;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    @Override // com.unity3d.services.ads.operation.load.d, com.unity3d.services.ads.operation.load.a
    public void onUnityAdsAdLoaded(String str) {
        d(str);
        super.onUnityAdsAdLoaded(str);
    }

    @Override // com.unity3d.services.ads.operation.load.d, com.unity3d.services.ads.operation.load.a
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        d(str);
        super.onUnityAdsFailedToLoad(str, unityAdsLoadError, str2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.c
    public void a(com.unity3d.services.core.webview.bridge.b bVar, h hVar) {
        a().a(com.unity3d.services.core.request.metrics.b.a());
        hVar.e();
        b(hVar);
        super.a(bVar, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h hVar) {
        if (hVar != null) {
            a().a(com.unity3d.services.core.request.metrics.b.a(com.unity3d.services.core.request.metrics.a.timeout, Long.valueOf(hVar.d())));
            a(hVar.b);
            hVar.a(UnityAds.UnityAdsLoadError.TIMEOUT, "[UnityAds] Timeout while loading " + hVar.c);
        }
    }
}
