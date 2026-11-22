package com.unity3d.services.core.configuration;

import com.unity3d.services.core.misc.d;
import com.unity3d.services.core.misc.i;

/* JADX INFO: loaded from: classes2.dex */
public class PrivacyConfigStorage extends i<PrivacyConfig> {
    private static PrivacyConfigStorage b;
    private PrivacyConfig c = new PrivacyConfig();

    private PrivacyConfigStorage() {
    }

    public static PrivacyConfigStorage getInstance() {
        if (b == null) {
            b = new PrivacyConfigStorage();
        }
        return b;
    }

    public synchronized PrivacyConfig getPrivacyConfig() {
        return this.c;
    }

    @Override // com.unity3d.services.core.misc.i
    public synchronized void registerObserver(d<PrivacyConfig> dVar) {
        super.registerObserver(dVar);
        if (this.c.getPrivacyStatus() != PrivacyConfigStatus.UNKNOWN) {
            dVar.a(this.c);
        }
    }

    public synchronized void setPrivacyConfig(PrivacyConfig privacyConfig) {
        this.c = privacyConfig;
        a(privacyConfig);
    }
}
