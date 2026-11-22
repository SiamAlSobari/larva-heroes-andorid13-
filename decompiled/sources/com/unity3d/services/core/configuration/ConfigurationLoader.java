package com.unity3d.services.core.configuration;

import com.unity3d.services.core.request.h;
import com.unity3d.services.core.request.metrics.i;
import com.unity3d.services.core.request.metrics.j;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigurationLoader implements IConfigurationLoader {
    private final Configuration a;
    private final ConfigurationRequestFactory b;

    public ConfigurationLoader(ConfigurationRequestFactory configurationRequestFactory) {
        this.a = configurationRequestFactory.getConfiguration();
        this.b = configurationRequestFactory;
    }

    private void a(String str, String str2) {
        if (this.a.getExperiments() == null || !this.a.getExperiments().isTwoStageInitializationEnabled()) {
            return;
        }
        if (str == null || str.isEmpty()) {
            i.a().sendMetric(j.e());
        }
        if (str2 == null || str2.isEmpty()) {
            i.a().sendMetric(j.d());
        }
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public Configuration getLocalConfiguration() {
        return this.a;
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener) throws Exception {
        try {
            h webRequest = this.b.getWebRequest();
            InitializeEventsMetricSender.getInstance().didConfigRequestStart();
            String strN = webRequest.n();
            if (!(webRequest.j() / 100 == 2)) {
                iConfigurationLoaderListener.onError("Non 2xx HTTP status received from ads configuration request.");
                return;
            }
            try {
                this.a.a(new JSONObject(strN), true);
                a(this.a.getUnifiedAuctionToken(), this.a.getStateId());
                iConfigurationLoaderListener.onSuccess(this.a);
            } catch (Exception unused) {
                iConfigurationLoaderListener.onError("Could not create web request");
            }
        } catch (Exception e) {
            iConfigurationLoaderListener.onError("Could not create web request: " + e);
        }
    }
}
