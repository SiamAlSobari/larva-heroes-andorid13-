package com.unity3d.services.core.configuration;

import com.unity3d.services.core.request.h;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PrivacyConfigurationLoader implements IConfigurationLoader {
    private final IConfigurationLoader a;
    private final ConfigurationRequestFactory b;
    private final PrivacyConfigStorage c;

    class a implements IPrivacyConfigurationListener {
        a() {
        }

        @Override // com.unity3d.services.core.configuration.IPrivacyConfigurationListener
        public void onError(String str) {
            com.unity3d.services.core.log.a.e("Couldn't fetch privacy configuration: " + str);
            PrivacyConfigurationLoader.this.c.setPrivacyConfig(new PrivacyConfig());
        }

        @Override // com.unity3d.services.core.configuration.IPrivacyConfigurationListener
        public void onSuccess(PrivacyConfig privacyConfig) {
            PrivacyConfigurationLoader.this.c.setPrivacyConfig(privacyConfig);
        }
    }

    public PrivacyConfigurationLoader(IConfigurationLoader iConfigurationLoader, ConfigurationRequestFactory configurationRequestFactory, PrivacyConfigStorage privacyConfigStorage) {
        this.a = iConfigurationLoader;
        this.b = configurationRequestFactory;
        this.c = privacyConfigStorage;
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public Configuration getLocalConfiguration() {
        return this.a.getLocalConfiguration();
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener) throws Exception {
        if (this.c.getPrivacyConfig().getPrivacyStatus() == PrivacyConfigStatus.UNKNOWN) {
            a(new a());
        }
        this.a.loadConfiguration(iConfigurationLoaderListener);
    }

    private void a(IPrivacyConfigurationListener iPrivacyConfigurationListener) throws Exception {
        try {
            h webRequest = this.b.getWebRequest();
            InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestStart();
            String strN = webRequest.n();
            try {
                if (webRequest.j() / 100 == 2) {
                    InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(true);
                    iPrivacyConfigurationListener.onSuccess(new PrivacyConfig(new JSONObject(strN)));
                } else {
                    InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                    iPrivacyConfigurationListener.onError("Privacy request failed with code: " + webRequest.j());
                }
            } catch (Exception unused) {
                InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                iPrivacyConfigurationListener.onError("Could not create web request");
            }
        } catch (Exception e) {
            iPrivacyConfigurationListener.onError("Could not create web request: " + e);
        }
    }
}
