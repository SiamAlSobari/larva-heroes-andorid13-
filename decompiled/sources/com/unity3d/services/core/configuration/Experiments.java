package com.unity3d.services.core.configuration;

import com.android.billingclient.api.BillingClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Experiments {
    private final JSONObject a;

    public Experiments() {
        this(null);
    }

    public JSONObject getExperimentData() {
        return this.a;
    }

    public Map<String, String> getExperimentTags() {
        HashMap map = new HashMap();
        Iterator<String> itKeys = this.a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, String.valueOf(this.a.opt(next)));
        }
        return map;
    }

    public boolean isForwardExperimentsToWebViewEnabled() {
        return this.a.optBoolean(BillingClient.FeatureType.PRODUCT_DETAILS, false);
    }

    public boolean isNativeTokenEnabled() {
        return this.a.optBoolean("tsi_nt", false);
    }

    public boolean isNativeWebViewCacheEnabled() {
        return this.a.optBoolean("nwc", false);
    }

    public boolean isNewLifecycleTimer() {
        return this.a.optBoolean("nlt", false);
    }

    public boolean isPrivacyRequestEnabled() {
        return this.a.optBoolean("tsi_prr", false);
    }

    public boolean isTwoStageInitializationEnabled() {
        return this.a.optBoolean("tsi", false);
    }

    public boolean isUpdatePiiFields() {
        return this.a.optBoolean("tsi_upii", false);
    }

    public boolean isWebAssetAdCaching() {
        return this.a.optBoolean("wac", false);
    }

    public boolean shouldNativeTokenAwaitPrivacy() {
        return this.a.optBoolean("tsi_prw", false);
    }

    public Experiments(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.a = new JSONObject();
        } else {
            this.a = jSONObject;
        }
    }
}
