package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PurchaseBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends b {
    private final Object f;

    /* JADX INFO: compiled from: PurchaseBridge.java */
    class a extends HashMap<String, Class<?>[]> {
        a() {
            put("getSignature", new Class[0]);
        }
    }

    public c(Object obj) {
        super(obj, new a());
        this.f = obj;
    }

    @Override // com.unity3d.services.core.reflection.a
    protected String g() {
        return "com.android.billingclient.api.Purchase";
    }

    public String j() {
        return (String) a("getSignature", this.f, new Object[0]);
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseData", i());
            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, j());
        } catch (JSONException e) {
            com.unity3d.services.core.log.a.c("Could not build Purchase result Json: ", e.getMessage());
        }
        return jSONObject;
    }
}
