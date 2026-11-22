package com.unity3d.services.core.device.reader;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DeviceInfoReaderWithStorageInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class m implements p {
    private final p a;
    private final List<com.unity3d.services.core.misc.c> b;
    private final com.unity3d.services.core.misc.f c;

    public m(p pVar, com.unity3d.services.core.misc.f fVar, com.unity3d.services.core.misc.c... cVarArr) {
        this.a = pVar;
        this.c = fVar;
        this.b = Arrays.asList(cVarArr);
    }

    @Override // com.unity3d.services.core.device.reader.p
    public Map<String, Object> a() {
        Map<String, Object> mapA = this.a.a();
        return mapA != null ? com.unity3d.services.core.misc.j.a(mapA, new com.unity3d.services.core.misc.e(new com.unity3d.services.core.misc.h(this.b).getData()).a(".", this.c)) : mapA;
    }
}
