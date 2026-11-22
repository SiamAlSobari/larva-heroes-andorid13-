package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.configuration.Configuration;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: SDKMetrics.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i {
    private static c a;
    private static g b;
    private static final AtomicBoolean c = new AtomicBoolean(false);

    /* JADX INFO: compiled from: SDKMetrics.java */
    private static final class a implements c {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        public void a(String str) {
            com.unity3d.services.core.log.a.b("Metric " + str + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.c
        public boolean a() {
            return false;
        }

        @Override // com.unity3d.services.core.request.metrics.c
        public String b() {
            return this.a;
        }

        @Override // com.unity3d.services.core.request.metrics.c
        public void sendMetric(d dVar) {
            com.unity3d.services.core.log.a.b("Metric " + dVar + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.c
        public void a(String str, Map<String, String> map) {
            a(str);
        }

        @Override // com.unity3d.services.core.request.metrics.c
        public void a(List<d> list) {
            com.unity3d.services.core.log.a.b("Metrics: " + list + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.c
        public void a(d dVar) {
            sendMetric(dVar);
        }
    }

    public static synchronized c a() {
        if (a == null) {
            a = new a(null);
        }
        if (b == null) {
            b = new g(a);
        }
        return b;
    }

    public static void b(Configuration configuration) {
        if (configuration == null) {
            com.unity3d.services.core.log.a.b("Metrics will not be sent from the device for this session due to misconfiguration");
            return;
        }
        if (a(configuration)) {
            c cVar = a;
            if (cVar instanceof f) {
                ((f) cVar).c();
            }
            if (configuration.getMetricSampleRate() >= new Random().nextInt(99) + 1) {
                a = new f(configuration, new com.unity3d.services.core.properties.b());
            } else {
                com.unity3d.services.core.log.a.b("Metrics will not be sent from the device for this session");
                a = new a("nullInstanceMetricsUrl");
            }
            g gVar = b;
            if (gVar == null) {
                b = new g(a);
            } else {
                gVar.a(a);
            }
            b.c();
        }
    }

    private static boolean a(Configuration configuration) {
        return !TextUtils.isEmpty(configuration.getMetricsUrl()) && c.compareAndSet(false, true);
    }
}
