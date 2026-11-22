package com.unity3d.services.core.configuration;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PrivacyConfig {
    private final PrivacyConfigStatus a;

    public PrivacyConfig() {
        this(PrivacyConfigStatus.UNKNOWN);
    }

    private boolean a(JSONObject jSONObject) {
        return jSONObject.optBoolean("pas", false);
    }

    public boolean allowedToSendPii() {
        return this.a.equals(PrivacyConfigStatus.ALLOWED);
    }

    public PrivacyConfigStatus getPrivacyStatus() {
        return this.a;
    }

    public PrivacyConfig(JSONObject jSONObject) {
        this.a = a(jSONObject) ? PrivacyConfigStatus.ALLOWED : PrivacyConfigStatus.DENIED;
    }

    public PrivacyConfig(PrivacyConfigStatus privacyConfigStatus) {
        this.a = privacyConfigStatus;
    }
}
