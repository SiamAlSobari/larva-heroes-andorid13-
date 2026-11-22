package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: MetricSenderWithBatch.java */
/* JADX INFO: loaded from: classes2.dex */
public class g implements c {
    private c b;
    private final LinkedBlockingQueue<d> a = new LinkedBlockingQueue<>();
    private final com.unity3d.services.core.properties.b c = new com.unity3d.services.core.properties.b();

    public g(c cVar) {
        this.b = cVar;
    }

    public void a(c cVar) {
        this.b = cVar;
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public String b() {
        c cVar = this.b;
        if (cVar == null) {
            return null;
        }
        return cVar.b();
    }

    public void c() {
        a(new ArrayList());
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public void sendMetric(d dVar) {
        a(new ArrayList(Collections.singletonList(dVar)));
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public boolean a() {
        return this.b.a();
    }

    public void a(String str, String str2, Map<String, String> map) {
        if (str != null && !str.isEmpty()) {
            a(new ArrayList(Collections.singletonList(new d(str, str2, map))));
            return;
        }
        com.unity3d.services.core.log.a.b("Metric event not sent due to being null or empty: " + str);
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public void a(String str, Map<String, String> map) {
        a(str, null, map);
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public synchronized void a(List<d> list) {
        this.a.addAll(list);
        if (!TextUtils.isEmpty(this.b.b()) && this.a.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this.a.drainTo(arrayList);
            this.b.a(arrayList);
        }
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public void a(d dVar) {
        if (dVar == null || dVar.b() == null) {
            return;
        }
        dVar.b().put("state", this.c.a(com.unity3d.services.core.properties.d.e()));
        sendMetric(dVar);
    }
}
