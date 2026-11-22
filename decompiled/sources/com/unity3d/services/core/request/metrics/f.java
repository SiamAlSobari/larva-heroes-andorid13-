package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.unity3d.services.core.configuration.Configuration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: compiled from: MetricSender.java */
/* JADX INFO: loaded from: classes2.dex */
public class f implements c {
    private final e a;
    private final String b;
    private final String c;
    private final ExecutorService d = Executors.newSingleThreadExecutor();
    private final com.unity3d.services.core.properties.b e;

    /* JADX INFO: compiled from: MetricSender.java */
    class a implements Runnable {
        final /* synthetic */ List a;

        a(List list) {
            this.a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = new JSONObject(new h(f.this.c, f.this.a, this.a).a()).toString();
                com.unity3d.services.core.request.h hVar = new com.unity3d.services.core.request.h(f.this.b, ShareTarget.METHOD_POST, null);
                hVar.a(string);
                hVar.n();
                if (hVar.j() / 100 == 2) {
                    com.unity3d.services.core.log.a.b("Metric " + this.a + " sent to " + f.this.b);
                } else {
                    com.unity3d.services.core.log.a.b("Metric " + this.a + " failed to send with response code: " + hVar.j());
                }
            } catch (Exception e) {
                com.unity3d.services.core.log.a.b("Metric " + this.a + " failed to send from exception: " + e.getMessage());
            }
        }
    }

    public f(Configuration configuration, com.unity3d.services.core.properties.b bVar) {
        this.b = configuration.getMetricsUrl();
        this.c = String.valueOf((int) Math.round(configuration.getMetricSampleRate()));
        this.e = bVar;
        e eVar = new e();
        this.a = eVar;
        eVar.a(configuration);
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public boolean a() {
        return true;
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public void sendMetric(d dVar) {
        a(new ArrayList(Collections.singletonList(dVar)));
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public void a(String str, Map<String, String> map) {
        if (str != null && !str.isEmpty()) {
            a(str, null, map);
            return;
        }
        com.unity3d.services.core.log.a.b("Metric event not sent due to being null or empty: " + str);
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public String b() {
        return this.b;
    }

    void c() {
        this.a.d();
        this.d.shutdown();
    }

    public void a(String str, String str2, Map<String, String> map) {
        a(new ArrayList(Collections.singletonList(new d(str, str2, map))));
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public void a(List<d> list) {
        if (list != null && list.size() > 0) {
            if (TextUtils.isEmpty(this.b)) {
                com.unity3d.services.core.log.a.b("Metrics: " + list + " was not sent to null or empty endpoint: " + this.b);
                return;
            }
            if (this.d.isShutdown()) {
                com.unity3d.services.core.log.a.b("Metrics " + list + " was not sent due to misconfiguration");
                return;
            }
            this.d.submit(new a(list));
            return;
        }
        com.unity3d.services.core.log.a.b("Metrics event not send due to being null or empty");
    }

    @Override // com.unity3d.services.core.request.metrics.c
    public void a(d dVar) {
        if (dVar == null || dVar.b() == null) {
            return;
        }
        dVar.b().put("state", this.e.a(com.unity3d.services.core.properties.d.e()));
        sendMetric(dVar);
    }
}
