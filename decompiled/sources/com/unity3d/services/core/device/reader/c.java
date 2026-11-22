package com.unity3d.services.core.device.reader;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DeviceInfoReaderCompressorWithMetrics.java */
/* JADX INFO: loaded from: classes2.dex */
public class c implements n {
    private final n a;
    private long b;
    private long c;
    private long d;

    public c(n nVar) {
        this.a = nVar;
    }

    private long b() {
        return TimeUnit.NANOSECONDS.toMillis(this.d - this.c);
    }

    private long d() {
        return TimeUnit.NANOSECONDS.toMillis(this.c - this.b);
    }

    private void e() {
        com.unity3d.services.core.request.metrics.i.a().sendMetric(com.unity3d.services.core.request.metrics.j.a(Long.valueOf(d())));
        com.unity3d.services.core.request.metrics.i.a().sendMetric(com.unity3d.services.core.request.metrics.j.b(Long.valueOf(b())));
    }

    @Override // com.unity3d.services.core.device.reader.o
    public Map<String, Object> a() {
        return this.a.a();
    }

    public byte[] c() {
        if (this.a == null) {
            return new byte[0];
        }
        this.b = System.nanoTime();
        byte[] bArrA = a(a());
        e();
        return bArrA;
    }

    @Override // com.unity3d.services.core.device.reader.n
    public byte[] a(Map<String, Object> map) {
        this.c = System.nanoTime();
        byte[] bArrA = this.a.a(map);
        this.d = System.nanoTime();
        return bArrA;
    }
}
