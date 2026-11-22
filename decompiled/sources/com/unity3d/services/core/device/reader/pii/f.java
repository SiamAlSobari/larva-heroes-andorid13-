package com.unity3d.services.core.device.reader.pii;

/* JADX INFO: compiled from: PiiTrackingStatusReader.java */
/* JADX INFO: loaded from: classes2.dex */
public class f {
    private final com.unity3d.services.core.misc.c a;

    public f(com.unity3d.services.core.misc.c cVar) {
        this.a = cVar;
    }

    private e b() {
        return a("privacy.spm.value");
    }

    private e d() {
        return a("privacy.mode.value");
    }

    public e a() {
        e eVarD = d();
        e eVar = e.NULL;
        if (eVarD == eVar && b() == eVar) {
            return eVar;
        }
        e eVarD2 = d();
        e eVar2 = e.APP;
        if (eVarD2 != eVar2 && b() != eVar2) {
            e eVarD3 = d();
            eVar2 = e.MIXED;
            if (eVarD3 != eVar2 && b() != eVar2) {
                e eVarD4 = d();
                eVar2 = e.NONE;
                if (eVarD4 != eVar2 && b() != eVar2) {
                    return e.UNDEFINED;
                }
            }
        }
        return eVar2;
    }

    public boolean c() {
        com.unity3d.services.core.misc.c cVar = this.a;
        if (cVar != null) {
            Object obj = cVar.get("user.nonbehavioral.value");
            if (obj == null) {
                obj = this.a.get("user.nonBehavioral.value");
            }
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    private e a(String str) {
        String str2;
        com.unity3d.services.core.misc.c cVar = this.a;
        if (cVar != null) {
            Object obj = cVar.get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        return e.a(str2);
    }
}
