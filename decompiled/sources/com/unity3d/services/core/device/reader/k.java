package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DeviceInfoReaderWithPrivacy.java */
/* JADX INFO: loaded from: classes2.dex */
public class k implements p {
    private final p a;
    private final PrivacyConfigStorage b;
    private final com.unity3d.services.core.device.reader.pii.b c;
    private final com.unity3d.services.core.device.reader.pii.f d;

    public k(p pVar, PrivacyConfigStorage privacyConfigStorage, com.unity3d.services.core.device.reader.pii.b bVar, com.unity3d.services.core.device.reader.pii.f fVar) {
        this.a = pVar;
        this.b = privacyConfigStorage;
        this.c = bVar;
        this.d = fVar;
    }

    private Map<String, Object> b() {
        HashMap map = new HashMap();
        String strA = this.c.a();
        if (strA != null) {
            map.put("unifiedconfig.pii.advertisingTrackingId", strA);
        }
        map.put("user.nonBehavioral", Boolean.valueOf(this.d.c()));
        return map;
    }

    @Override // com.unity3d.services.core.device.reader.p
    public Map<String, Object> a() {
        Map<String, Object> mapA = this.a.a();
        PrivacyConfigStorage privacyConfigStorage = this.b;
        if (privacyConfigStorage != null && privacyConfigStorage.getPrivacyConfig() != null && this.b.getPrivacyConfig().allowedToSendPii()) {
            mapA.putAll(b());
        }
        return mapA;
    }
}
