package com.unity3d.services.ads.token;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: NativeTokenGeneratorWithPrivacyAwait.java */
/* JADX INFO: loaded from: classes2.dex */
public class e implements com.unity3d.services.ads.token.b {
    private final com.unity3d.services.ads.token.b a;
    private final ConditionVariable b = new ConditionVariable();
    private final ExecutorService c;
    private final int d;

    /* JADX INFO: compiled from: NativeTokenGeneratorWithPrivacyAwait.java */
    class a implements com.unity3d.services.core.misc.d<PrivacyConfig> {
        a() {
        }

        @Override // com.unity3d.services.core.misc.d
        public void a(PrivacyConfig privacyConfig) {
            e.this.b.open();
        }
    }

    /* JADX INFO: compiled from: NativeTokenGeneratorWithPrivacyAwait.java */
    class b implements Runnable {
        final /* synthetic */ com.unity3d.services.core.misc.d a;
        final /* synthetic */ c b;

        b(com.unity3d.services.core.misc.d dVar, c cVar) {
            this.a = dVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.b.block(e.this.d);
            PrivacyConfigStorage.getInstance().unregisterObserver(this.a);
            e.this.a.a(this.b);
        }
    }

    public e(ExecutorService executorService, com.unity3d.services.ads.token.b bVar, int i) {
        this.c = executorService;
        this.a = bVar;
        this.d = i;
    }

    @Override // com.unity3d.services.ads.token.b
    public void a(c cVar) {
        a aVar = new a();
        PrivacyConfigStorage.getInstance().registerObserver(aVar);
        this.c.execute(new b(aVar, cVar));
    }
}
