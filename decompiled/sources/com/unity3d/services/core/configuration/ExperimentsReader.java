package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.a;
import com.unity3d.services.core.misc.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ExperimentsReader {
    private static final Set<String> a = new HashSet(Arrays.asList("tsi", "tsi_upii", "tsi_p", "tsi_nt", "tsi_prr", "tsi_prw"));
    private Experiments b;
    private Experiments c;

    private JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!a.contains(next)) {
                map.put(next, String.valueOf(jSONObject.optBoolean(next)));
            }
        }
        return new JSONObject(map);
    }

    private JSONObject b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (a.contains(next)) {
                map.put(next, String.valueOf(jSONObject.optBoolean(next)));
            }
        }
        return new JSONObject(map);
    }

    public synchronized Experiments getCurrentlyActiveExperiments() {
        Experiments experiments = this.c;
        if (experiments == null && this.b == null) {
            return new Experiments();
        }
        if (experiments == null) {
            return this.b;
        }
        if (this.b == null) {
            this.b = new Experiments();
        }
        try {
            return new Experiments(j.a(b(this.b.getExperimentData()), a(this.c.getExperimentData())));
        } catch (JSONException unused) {
            a.c("Couldn't get active experiments, reverting to default experiments");
            return new Experiments();
        }
    }

    public synchronized void updateLocalExperiments(Experiments experiments) {
        this.b = experiments;
    }

    public synchronized void updateRemoteExperiments(Experiments experiments) {
        this.c = experiments;
    }
}
