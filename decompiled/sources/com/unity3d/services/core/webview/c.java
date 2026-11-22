package com.unity3d.services.core.webview;

import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.request.metrics.i;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: compiled from: WebViewUrlBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    private final String a;

    public c(String str, Configuration configuration) {
        String str2 = ("?platform=android" + a("origin", configuration.getWebViewUrl())) + a(MediationMetaData.KEY_VERSION, configuration.getWebViewVersion());
        if (configuration.getExperiments() != null && configuration.getExperiments().isForwardExperimentsToWebViewEnabled()) {
            str2 = str2 + a("experiments", configuration.getExperiments().getExperimentData().toString());
        }
        this.a = str + (str2 + a("isNativeCollectingMetrics", String.valueOf(i.a().a())));
    }

    public String a() {
        return this.a;
    }

    private String a(String str, String str2) {
        if (str2 != null) {
            try {
                return "&" + str + "=" + URLEncoder.encode(str2, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                com.unity3d.services.core.log.a.a(String.format("Unsupported charset when encoding %s", str), e);
            }
        }
        return "";
    }
}
