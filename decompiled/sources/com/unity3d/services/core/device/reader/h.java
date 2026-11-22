package com.unity3d.services.core.device.reader;

import java.util.Map;

/* JADX INFO: compiled from: DeviceInfoReaderWithLifecycle.java */
/* JADX INFO: loaded from: classes2.dex */
public class h implements p {
    private final p a;
    private final com.unity3d.services.core.lifecycle.c b;

    public h(p pVar, com.unity3d.services.core.lifecycle.c cVar) {
        this.a = pVar;
        this.b = cVar;
    }

    @Override // com.unity3d.services.core.device.reader.p
    public Map<String, Object> a() {
        Map<String, Object> mapA = this.a.a();
        mapA.put("appActive", Boolean.valueOf(this.b.a()));
        return mapA;
    }
}
