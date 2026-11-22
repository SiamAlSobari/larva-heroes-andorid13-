package com.unity3d.services.core.misc;

import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JsonStorageAggregator.java */
/* JADX INFO: loaded from: classes2.dex */
public class h implements c {
    private final List<c> a;

    public h(List<c> list) {
        this.a = list;
    }

    @Override // com.unity3d.services.core.misc.c
    public Object get(String str) {
        c next;
        Iterator<c> it = this.a.iterator();
        Object obj = null;
        while (it.hasNext() && ((next = it.next()) == null || (obj = next.get(str)) == null)) {
        }
        return obj;
    }

    @Override // com.unity3d.services.core.misc.c
    public JSONObject getData() {
        JSONObject jSONObject = new JSONObject();
        for (c cVar : this.a) {
            if (cVar != null) {
                try {
                    jSONObject = j.a(jSONObject, cVar.getData());
                } catch (JSONException unused) {
                    com.unity3d.services.core.log.a.c("Failed to merge storage: " + cVar);
                }
            }
        }
        return jSONObject;
    }
}
