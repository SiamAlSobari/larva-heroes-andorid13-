package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.InitRequestType;
import java.util.Map;

/* JADX INFO: compiled from: DeviceInfoReaderWithRequestType.java */
/* JADX INFO: loaded from: classes2.dex */
public class l implements p {
    private final p a;
    private final InitRequestType b;

    public l(p pVar, InitRequestType initRequestType) {
        this.a = pVar;
        this.b = initRequestType;
    }

    @Override // com.unity3d.services.core.device.reader.p
    public Map<String, Object> a() {
        Map<String, Object> mapA = this.a.a();
        InitRequestType initRequestType = this.b;
        if (initRequestType != null) {
            mapA.put("callType", initRequestType.toString().toLowerCase());
        }
        return mapA;
    }
}
