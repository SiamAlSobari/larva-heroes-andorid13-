package com.unity3d.services.core.device.reader;

import java.util.Map;

/* JADX INFO: compiled from: DeviceInfoReaderWithMetrics.java */
/* JADX INFO: loaded from: classes2.dex */
public class i implements p {
    private final p a;

    public i(p pVar) {
        this.a = pVar;
    }

    @Override // com.unity3d.services.core.device.reader.p
    public Map<String, Object> a() {
        p pVar = this.a;
        if (pVar == null) {
            return null;
        }
        Map<String, Object> mapA = pVar.a();
        a(mapA);
        return mapA;
    }

    private void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("unifiedconfig.data.gameSessionId");
            if ((obj instanceof Long) && ((Long) obj).longValue() == 0) {
                com.unity3d.services.core.request.metrics.i.a().sendMetric(com.unity3d.services.core.request.metrics.j.c());
            }
        }
    }
}
