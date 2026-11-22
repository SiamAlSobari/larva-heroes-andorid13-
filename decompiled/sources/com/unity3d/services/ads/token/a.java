package com.unity3d.services.ads.token;

import android.os.Handler;
import android.os.Looper;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.j;
import com.unity3d.services.core.request.metrics.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: AsyncTokenStorage.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static a a;
    private final Handler c;
    private com.unity3d.services.ads.token.b g;
    private final List<d> b = new LinkedList();
    private boolean d = false;
    private boolean e = false;
    private Configuration f = new Configuration();
    private final com.unity3d.services.core.properties.b h = new com.unity3d.services.core.properties.b();

    /* JADX INFO: renamed from: com.unity3d.services.ads.token.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsyncTokenStorage.java */
    class RunnableC0033a implements Runnable {
        final /* synthetic */ d a;

        RunnableC0033a(d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.a, null, j.TOKEN_NATIVE);
        }
    }

    /* JADX INFO: compiled from: AsyncTokenStorage.java */
    class b implements com.unity3d.services.ads.token.c {
        final /* synthetic */ d a;

        /* JADX INFO: renamed from: com.unity3d.services.ads.token.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AsyncTokenStorage.java */
        class RunnableC0034a implements Runnable {
            final /* synthetic */ String a;

            RunnableC0034a(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                a.this.a(bVar.a, this.a, j.TOKEN_NATIVE);
            }
        }

        b(d dVar) {
            this.a = dVar;
        }

        @Override // com.unity3d.services.ads.token.c
        public void a(String str) {
            a.this.c.post(new RunnableC0034a(str));
        }
    }

    /* JADX INFO: compiled from: AsyncTokenStorage.java */
    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j.values().length];
            a = iArr;
            try {
                iArr[j.TOKEN_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j.TOKEN_REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: AsyncTokenStorage.java */
    class d {
        public IUnityAdsTokenListener a;
        public Runnable b;
        public boolean c;

        d() {
        }
    }

    public a(com.unity3d.services.ads.token.b bVar, Handler handler) {
        this.c = handler;
        this.g = bVar;
    }

    public synchronized void b(Configuration configuration) {
        this.f = configuration;
        boolean zA = a(configuration);
        this.e = zA;
        if (zA) {
            if (this.g == null) {
                com.unity3d.services.core.device.reader.a aVar = new com.unity3d.services.core.device.reader.a(new ConfigurationReader(), PrivacyConfigStorage.getInstance());
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                this.g = new com.unity3d.services.ads.token.d(executorServiceNewSingleThreadExecutor, aVar);
                if (configuration.getExperiments().shouldNativeTokenAwaitPrivacy()) {
                    this.g = new e(executorServiceNewSingleThreadExecutor, this.g, configuration.getPrivacyRequestWaitTimeout());
                }
            }
            Iterator it = new ArrayList(this.b).iterator();
            while (it.hasNext()) {
                a((d) it.next());
            }
        }
    }

    public static a a() {
        if (a == null) {
            a = new a(null, new Handler(Looper.getMainLooper()));
        }
        return a;
    }

    private synchronized d a(IUnityAdsTokenListener iUnityAdsTokenListener) {
        d dVar;
        dVar = new d();
        dVar.a = iUnityAdsTokenListener;
        dVar.b = new RunnableC0033a(dVar);
        this.b.add(dVar);
        this.c.postDelayed(dVar.b, this.f.getTokenTimeout());
        return dVar;
    }

    private synchronized void a(j jVar) {
        String strC;
        while (!this.b.isEmpty() && (strC = h.c()) != null) {
            a(this.b.get(0), strC, jVar);
        }
    }

    public synchronized void b(j jVar) {
        this.d = true;
        if (this.e) {
            a(jVar);
        }
    }

    public synchronized void b(IUnityAdsTokenListener iUnityAdsTokenListener) {
        if (com.unity3d.services.core.properties.d.e() == com.unity3d.services.core.properties.d.a.INITIALIZED_FAILED) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
            a(null, j.TOKEN_REMOTE);
        } else if (com.unity3d.services.core.properties.d.e() == com.unity3d.services.core.properties.d.a.NOT_INITIALIZED) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
            a(null, j.TOKEN_REMOTE);
        } else {
            d dVarA = a(iUnityAdsTokenListener);
            if (this.e) {
                a(dVarA);
            }
        }
    }

    private void a(d dVar) {
        if (dVar.c) {
            return;
        }
        dVar.c = true;
        if (!this.d && this.f.getExperiments().isNativeTokenEnabled()) {
            this.g.a(new b(dVar));
            return;
        }
        String strC = h.c();
        if (strC == null || strC.isEmpty()) {
            return;
        }
        a(dVar, strC, j.TOKEN_REMOTE);
    }

    private void b(String str) {
        if (str != null && !str.isEmpty()) {
            i.a().sendMetric(com.unity3d.services.core.request.metrics.j.a(b()));
        } else {
            i.a().sendMetric(com.unity3d.services.core.request.metrics.j.b(b()));
        }
    }

    private Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("state", this.h.a(com.unity3d.services.core.properties.d.e()));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(d dVar, String str, j jVar) {
        if (this.b.remove(dVar)) {
            dVar.a.onUnityAdsTokenReady(str);
            try {
                this.c.removeCallbacks(dVar.b);
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Failed to remove callback from a handler", e);
            }
        }
        a(str, jVar);
    }

    private void a(String str, j jVar) {
        int i = c.a[jVar.ordinal()];
        if (i == 1) {
            a(str);
        } else if (i != 2) {
            com.unity3d.services.core.log.a.c("Unknown token type passed to sendTokenMetrics");
        } else {
            b(str);
        }
    }

    private void a(String str) {
        if (str == null) {
            i.a().sendMetric(com.unity3d.services.core.request.metrics.j.d(b()));
        } else {
            i.a().sendMetric(com.unity3d.services.core.request.metrics.j.c(b()));
        }
    }

    private boolean a(Configuration configuration) {
        return (configuration == null || configuration.getExperiments() == null) ? false : true;
    }
}
