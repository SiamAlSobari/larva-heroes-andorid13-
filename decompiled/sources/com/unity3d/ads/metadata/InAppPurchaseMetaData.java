package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.f;
import com.unity3d.services.core.device.h;
import com.unity3d.services.core.device.i;
import com.unity3d.services.core.log.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class InAppPurchaseMetaData extends MetaData {
    public static final String IAP_KEY = "iap";
    public static final String KEY_CURRENCY = "currency";
    public static final String KEY_PRICE = "price";
    public static final String KEY_PRODUCT_ID = "productId";
    public static final String KEY_RECEIPT_PURCHASE_DATA = "receiptPurchaseData";
    public static final String KEY_SIGNATURE = "signature";

    public InAppPurchaseMetaData(Context context) {
        super(context);
    }

    @Override // com.unity3d.ads.metadata.MetaData
    public void commit() {
        JSONArray jSONArray;
        if (!i.a(this._context)) {
            a.c("Unity Ads could not commit metadata due to storage error or the data is null");
            return;
        }
        f fVarA = i.a(i.a.PUBLIC);
        if (getData() == null || fVarA == null) {
            return;
        }
        Object obj = fVarA.get("iap.purchases");
        if (obj != null) {
            try {
                jSONArray = (JSONArray) obj;
            } catch (Exception unused) {
                a.c("Invalid object type for purchases");
                jSONArray = null;
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        JSONObject data = getData();
        try {
            data.put("ts", System.currentTimeMillis());
            jSONArray.put(data);
            fVarA.set("iap.purchases", jSONArray);
            fVarA.f();
            fVarA.a(h.SET, fVarA.get("iap.purchases"));
        } catch (JSONException unused2) {
            a.c("Error constructing purchase object");
        }
    }

    @Override // com.unity3d.ads.metadata.MetaData, com.unity3d.services.core.misc.g
    public synchronized boolean set(String str, Object obj) {
        return setRaw(str, obj);
    }

    public void setCurrency(String str) {
        set("currency", str);
    }

    public void setPrice(Double d) {
        set("price", d);
    }

    public void setProductId(String str) {
        set(KEY_PRODUCT_ID, str);
    }

    public void setReceiptPurchaseData(String str) {
        set(KEY_RECEIPT_PURCHASE_DATA, str);
    }

    public void setSignature(String str) {
        set(KEY_SIGNATURE, str);
    }
}
