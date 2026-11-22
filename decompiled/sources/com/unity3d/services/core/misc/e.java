package com.unity3d.services.core.misc;

import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JsonFlattener.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    private final JSONObject a;

    public e(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public JSONObject a(String str, f fVar) {
        return fVar == null ? new JSONObject() : a(str, fVar.c(), fVar.a(), fVar.b());
    }

    public JSONObject a(String str, List<String> list, List<String> list2, List<String> list3) {
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> itKeys = this.a.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (a(next, list, list3)) {
                    Object objOpt = this.a.opt(next);
                    if (objOpt instanceof JSONObject) {
                        new e((JSONObject) objOpt).a(str, next, jSONObject, list2, list3);
                    } else {
                        jSONObject.put(next, objOpt);
                    }
                }
            }
        } catch (JSONException e) {
            com.unity3d.services.core.log.a.b("Could not flatten JSON: %s", e.getMessage());
        }
        return jSONObject;
    }

    public void a(String str, String str2, JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        Iterator<String> itKeys = this.a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!list2.contains(next)) {
                Object obj = this.a.get(next);
                String str3 = list.contains(next) ? str2 : String.format("%s%s%s", str2, str, next);
                if (obj instanceof JSONObject) {
                    new e((JSONObject) obj).a(str, str3, jSONObject, list, list2);
                } else {
                    jSONObject.put(str3, obj);
                }
            }
        }
    }

    private boolean a(String str, List<String> list, List<String> list2) {
        if (!list2.contains(str) && list.size() > 0) {
            return list.contains(str);
        }
        return false;
    }
}
