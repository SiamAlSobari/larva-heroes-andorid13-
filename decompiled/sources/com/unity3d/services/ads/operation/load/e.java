package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.IInitializationNotificationCenter;
import com.unity3d.services.core.misc.j;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: LoadModuleDecoratorInitializationBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends d implements IInitializationListener {
    private ConcurrentHashMap<h, com.unity3d.services.core.webview.bridge.b> b;

    /* JADX INFO: compiled from: LoadModuleDecoratorInitializationBuffer.java */
    class a implements Runnable {
        final /* synthetic */ h a;
        final /* synthetic */ UnityAds.UnityAdsLoadError b;
        final /* synthetic */ String c;

        a(h hVar, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.a = hVar;
            this.b = unityAdsLoadError;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = this.a;
            hVar.h.onUnityAdsFailedToLoad(hVar.c, this.b, this.c);
        }
    }

    /* JADX INFO: compiled from: LoadModuleDecoratorInitializationBuffer.java */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.unity3d.services.core.properties.d.a.values().length];
            a = iArr;
            try {
                iArr[com.unity3d.services.core.properties.d.a.INITIALIZED_SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.unity3d.services.core.properties.d.a.INITIALIZED_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public e(com.unity3d.services.ads.operation.load.a aVar, IInitializationNotificationCenter iInitializationNotificationCenter) {
        super(aVar);
        iInitializationNotificationCenter.addListener(this);
        this.b = new ConcurrentHashMap<>();
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public synchronized void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
        Iterator<h> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            a(it.next(), UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failure");
        }
        this.b.clear();
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public synchronized void onSdkInitialized() {
        for (Map.Entry<h, com.unity3d.services.core.webview.bridge.b> entry : this.b.entrySet()) {
            super.a(entry.getValue(), entry.getKey());
        }
        this.b.clear();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.c
    public void a(com.unity3d.services.core.webview.bridge.b bVar, h hVar) {
        if (hVar == null) {
            return;
        }
        int i = b.a[com.unity3d.services.core.properties.d.e().ordinal()];
        if (i == 1) {
            super.a(bVar, hVar);
        } else if (i != 2) {
            this.b.put(hVar, bVar);
        } else {
            a(hVar, UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failed");
        }
    }

    private void a(h hVar, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        if (hVar == null || hVar.h == null) {
            return;
        }
        a().a(com.unity3d.services.core.request.metrics.b.a(unityAdsLoadError, Long.valueOf(hVar.d())));
        j.a(new a(hVar, unityAdsLoadError, str));
    }
}
