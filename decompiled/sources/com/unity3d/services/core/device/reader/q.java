package com.unity3d.services.core.device.reader;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MinimalDeviceInfoReader.java */
/* JADX INFO: loaded from: classes2.dex */
public class q implements p {
    @Override // com.unity3d.services.core.device.reader.p
    public Map<String, Object> a() {
        HashMap map = new HashMap();
        map.put("platform", "android");
        map.put("sdkVersion", Integer.valueOf(com.unity3d.services.core.properties.d.n()));
        map.put("sdkVersionName", com.unity3d.services.core.properties.d.o());
        map.put("idfi", com.unity3d.services.core.device.b.v());
        map.put("ts", Long.valueOf(System.currentTimeMillis()));
        map.put("gameId", com.unity3d.services.core.properties.a.f());
        return map;
    }
}
