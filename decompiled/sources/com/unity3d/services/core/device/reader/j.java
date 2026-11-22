package com.unity3d.services.core.device.reader;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DeviceInfoReaderWithPII.java */
/* JADX INFO: loaded from: classes2.dex */
public class j implements p {
    private p a;
    private com.unity3d.services.core.device.reader.pii.b b;
    private com.unity3d.services.core.device.reader.pii.c c;

    /* JADX INFO: compiled from: DeviceInfoReaderWithPII.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.unity3d.services.core.device.reader.pii.a.values().length];
            a = iArr;
            try {
                iArr[com.unity3d.services.core.device.reader.pii.a.INCLUDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.unity3d.services.core.device.reader.pii.a.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.unity3d.services.core.device.reader.pii.a.EXCLUDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(p pVar, com.unity3d.services.core.device.reader.pii.c cVar, com.unity3d.services.core.device.reader.pii.b bVar) {
        this.a = pVar;
        this.c = cVar;
        this.b = bVar;
    }

    private Map<String, Object> b(com.unity3d.services.core.device.reader.pii.d dVar) {
        return dVar.a();
    }

    @Override // com.unity3d.services.core.device.reader.p
    public Map<String, Object> a() {
        Map<String, Object> mapA = this.a.a();
        com.unity3d.services.core.device.reader.pii.d dVarF = this.c.f();
        int i = a.a[dVarF.b().ordinal()];
        if (i == 1) {
            mapA.putAll(b(dVarF));
        } else if (i == 2) {
            mapA.putAll(a(dVarF));
        }
        return mapA;
    }

    private Map<String, Object> a(com.unity3d.services.core.device.reader.pii.d dVar) {
        HashMap map = new HashMap();
        String strA = this.b.a();
        if (strA != null) {
            map.put("unifiedconfig.pii.advertisingTrackingId", strA);
        }
        if (dVar.c() != null) {
            map.put("user.nonBehavioral", dVar.c());
        }
        return map;
    }
}
