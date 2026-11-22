package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MetricCommonTags.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private Map<String, String> k;
    private final com.unity3d.services.core.misc.d<PrivacyConfig> l;

    /* JADX INFO: compiled from: MetricCommonTags.java */
    class a implements com.unity3d.services.core.misc.d<PrivacyConfig> {
        a() {
        }

        @Override // com.unity3d.services.core.misc.d
        public void a(PrivacyConfig privacyConfig) {
            e.this.i = privacyConfig.getPrivacyStatus().toString().toLowerCase();
        }
    }

    public e() {
        a aVar = new a();
        this.l = aVar;
        this.a = com.unity3d.services.core.device.b.y();
        this.b = "android";
        this.c = com.unity3d.services.core.properties.d.o();
        this.d = com.unity3d.services.core.device.b.G();
        this.i = PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase();
        this.e = com.unity3d.services.core.properties.d.s();
        PrivacyConfigStorage.getInstance().registerObserver(aVar);
    }

    private boolean b() {
        String str = this.f;
        return str == null || str.isEmpty();
    }

    private void c() {
        try {
            com.unity3d.services.core.device.f fVarA = com.unity3d.services.core.device.i.a(com.unity3d.services.core.device.i.a.PUBLIC);
            if (fVarA == null || !fVarA.c()) {
                return;
            }
            this.f = (String) fVarA.get("mediation.name.value");
            this.g = (String) fVarA.get("mediation.version.value");
            this.h = (String) fVarA.get("mediation.adapter_version.value");
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Failed to refreshMediationData: %s", e.getLocalizedMessage());
        }
    }

    public void d() {
        PrivacyConfigStorage.getInstance().unregisterObserver(this.l);
    }

    public void a(Configuration configuration) {
        this.j = configuration.getSrc();
        if (configuration.getExperiments() != null) {
            this.k = configuration.getExperiments().getExperimentTags();
        }
    }

    public Map<String, String> a() {
        if (b()) {
            c();
        }
        HashMap map = new HashMap();
        String str = this.a;
        if (str != null) {
            map.put("iso", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            map.put("plt", str2);
        }
        if (this.a != null) {
            map.put("sdk", this.c);
        }
        String str3 = this.d;
        if (str3 != null) {
            map.put("system", str3);
        }
        String str4 = this.i;
        if (str4 != null) {
            map.put("prvc", str4);
        }
        String str5 = this.j;
        if (str5 != null) {
            map.put("src", str5);
        }
        String str6 = this.f;
        if (str6 != null) {
            map.put("m_name", str6);
        }
        String str7 = this.g;
        if (str7 != null) {
            map.put("m_ver", str7);
        }
        String str8 = this.h;
        if (str8 != null) {
            map.put("m_ad_ver", str8);
        }
        Map<String, String> map2 = this.k;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.put("tm", String.valueOf(this.e));
        return map;
    }
}
