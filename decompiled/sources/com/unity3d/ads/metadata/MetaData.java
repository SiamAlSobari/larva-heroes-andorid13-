package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.f;
import com.unity3d.services.core.device.h;
import com.unity3d.services.core.device.i;
import com.unity3d.services.core.log.a;
import com.unity3d.services.core.misc.g;
import com.unity3d.services.core.misc.j;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MetaData extends g {
    private String _category;
    protected Context _context;

    public MetaData(Context context) {
        this._context = context.getApplicationContext();
    }

    private String getActualKey(String str) {
        if (getCategory() == null) {
            return str;
        }
        return getCategory() + "." + str;
    }

    private synchronized boolean set(String str, boolean z) {
        return set(str, Boolean.valueOf(z));
    }

    public void commit() {
        if (!i.a(this._context)) {
            a.c("Unity Ads could not commit metadata due to storage error");
            return;
        }
        f fVarA = i.a(i.a.PUBLIC);
        if (getData() == null || fVarA == null) {
            return;
        }
        Iterator<String> itKeys = getData().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objA = get(next);
            if (fVarA.get(next) != null && (fVarA.get(next) instanceof JSONObject) && (get(next) instanceof JSONObject)) {
                try {
                    objA = j.a((JSONObject) objA, (JSONObject) fVarA.get(next));
                } catch (Exception e) {
                    a.a("Exception merging JSONs", e);
                }
            }
            fVarA.set(next, objA);
        }
        fVarA.f();
        fVarA.a(h.SET, getData());
    }

    public String getCategory() {
        return this._category;
    }

    public void setCategory(String str) {
        this._category = str;
    }

    protected synchronized boolean setRaw(String str, Object obj) {
        initData();
        return super.set(getActualKey(str), obj);
    }

    private synchronized boolean set(String str, int i) {
        return set(str, Integer.valueOf(i));
    }

    private synchronized boolean set(String str, long j) {
        return set(str, Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0044  */
    @Override // com.unity3d.services.core.misc.g
    public synchronized boolean set(String str, Object obj) {
        boolean z;
        initData();
        if (super.set(getActualKey(str) + ".value", obj)) {
            if (super.set(getActualKey(str) + ".ts", Long.valueOf(System.currentTimeMillis()))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z;
    }
}
