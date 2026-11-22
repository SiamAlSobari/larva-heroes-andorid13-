package com.unity3d.services.ads.token;

import android.util.Base64;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: NativeTokenGenerator.java */
/* JADX INFO: loaded from: classes2.dex */
public class d implements b {
    private ExecutorService a;
    private com.unity3d.services.core.device.reader.a b;
    private String c;

    /* JADX INFO: compiled from: NativeTokenGenerator.java */
    class a implements Runnable {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strEncodeToString = Base64.encodeToString(new com.unity3d.services.core.device.reader.b(d.this.b.a()).b(), 2);
                if (d.this.c == null || d.this.c.isEmpty()) {
                    this.a.a(strEncodeToString);
                } else {
                    StringBuilder sb = new StringBuilder(d.this.c.length() + strEncodeToString.length());
                    sb.append(d.this.c);
                    sb.append(strEncodeToString);
                    this.a.a(sb.toString());
                }
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Unity Ads failed to generate token.", e);
                this.a.a(null);
            }
        }
    }

    public d(ExecutorService executorService, com.unity3d.services.core.device.reader.a aVar) {
        this(executorService, aVar, "1:");
    }

    public d(ExecutorService executorService, com.unity3d.services.core.device.reader.a aVar, String str) {
        this.a = executorService;
        this.b = aVar;
        this.c = str;
    }

    @Override // com.unity3d.services.ads.token.b
    public void a(c cVar) {
        this.a.execute(new a(cVar));
    }
}
