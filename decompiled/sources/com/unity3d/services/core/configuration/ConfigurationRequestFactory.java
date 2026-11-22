package com.unity3d.services.core.configuration;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import com.unity3d.services.core.device.reader.a;
import com.unity3d.services.core.device.reader.b;
import com.unity3d.services.core.device.reader.c;
import com.unity3d.services.core.properties.d;
import com.unity3d.services.core.request.h;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigurationRequestFactory {
    private final Configuration a;
    private final a b;

    public ConfigurationRequestFactory(Configuration configuration, a aVar) {
        this.a = configuration;
        this.b = aVar;
    }

    public Configuration getConfiguration() {
        return this.a;
    }

    public h getWebRequest() throws MalformedURLException {
        h hVar;
        String configUrl = this.a.getConfigUrl();
        if (configUrl == null) {
            throw new MalformedURLException("Base URL is null");
        }
        StringBuilder sb = new StringBuilder(configUrl);
        Experiments experiments = this.a.getExperiments();
        if (experiments == null || !experiments.isTwoStageInitializationEnabled()) {
            sb.append("?ts=");
            sb.append(System.currentTimeMillis());
            sb.append("&sdkVersion=");
            sb.append(d.n());
            sb.append("&sdkVersionName=");
            sb.append(d.o());
            sb.append("&gameId=");
            sb.append(com.unity3d.services.core.properties.a.f());
            hVar = new h(sb.toString(), ShareTarget.METHOD_GET);
        } else {
            HashMap map = new HashMap();
            map.put(HttpHeaders.CONTENT_ENCODING, Collections.singletonList("gzip"));
            hVar = new h(sb.toString(), ShareTarget.METHOD_POST, map);
            hVar.a(new c(new b(this.b.a())).c());
        }
        com.unity3d.services.core.log.a.b("Requesting configuration with: " + ((Object) sb));
        return hVar;
    }
}
