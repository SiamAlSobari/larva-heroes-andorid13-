package com.unity3d.ads;

import com.unity3d.services.core.log.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class UnityAdsBaseOptions {
    private String b = "objectId";
    private JSONObject a = new JSONObject();

    public JSONObject getData() {
        return this.a;
    }

    public void set(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            this.a.put(str, str2);
        } catch (JSONException e) {
            a.a("Failed to set Unity Ads options", e);
        }
    }

    public void setObjectId(String str) {
        set(this.b, str);
    }
}
