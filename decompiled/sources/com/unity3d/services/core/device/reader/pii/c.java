package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.misc.j;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: PiiDataSelector.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    private final f a;
    private final com.unity3d.services.core.misc.c b;
    private final Experiments c;

    /* JADX INFO: compiled from: PiiDataSelector.java */
    class a extends HashMap<String, Object> {
        a() {
            put("user.nonBehavioral", Boolean.valueOf(c.this.a.c()));
        }
    }

    /* JADX INFO: compiled from: PiiDataSelector.java */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(f fVar, com.unity3d.services.core.misc.c cVar, Experiments experiments) {
        this.a = fVar;
        this.b = cVar;
        this.c = experiments;
    }

    private Map<String, Object> b() {
        HashMap map = new HashMap();
        com.unity3d.services.core.misc.c cVar = this.b;
        if (cVar == null) {
            return map;
        }
        Object obj = cVar.get("unifiedconfig.pii");
        return obj instanceof JSONObject ? j.a(map, (JSONObject) obj, "unifiedconfig.pii.") : map;
    }

    private HashMap<String, Object> c() {
        return new a();
    }

    private d d() {
        if (this.a.c()) {
            return new d(com.unity3d.services.core.device.reader.pii.a.INCLUDE, c());
        }
        d dVarA = a();
        dVarA.a(c());
        return dVarA;
    }

    private d e() {
        return new d(com.unity3d.services.core.device.reader.pii.a.EXCLUDE);
    }

    public d f() {
        int i = b.a[this.a.a().ordinal()];
        if (i == 1 || i == 2) {
            return a();
        }
        return i != 3 ? e() : d();
    }

    private d a() {
        return new d(this.c.isUpdatePiiFields() ? com.unity3d.services.core.device.reader.pii.a.UPDATE : com.unity3d.services.core.device.reader.pii.a.INCLUDE, b());
    }
}
