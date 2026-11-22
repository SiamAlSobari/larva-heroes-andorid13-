package com.unity3d.services.core.configuration;

import android.text.TextUtils;
import com.google.firebase.messaging.ServiceStarter;
import com.mrgames.larvaheroesfree.network.GpTouchConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.a;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.properties.d;
import com.unity3d.services.core.request.h;
import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Configuration {
    private String A;
    private ConfigurationRequestFactory B;
    private Map<String, IModuleConfiguration> C;
    private String[] D;
    private Class[] E;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private int g;
    private int h;
    private long i;
    private double j;
    private int k;
    private int l;
    private long m;
    private int n;
    private int o;
    private int p;
    private String q;
    private double r;
    private long s;
    private String t;
    private String u;
    private String v;
    private String w;
    private ExperimentsReader x;
    private int y;
    private int z;

    public Configuration() {
        this.D = new String[]{"com.unity3d.services.core.configuration.CoreModuleConfiguration", "com.unity3d.services.ads.configuration.AdsModuleConfiguration", "com.unity3d.services.analytics.core.configuration.AnalyticsModuleConfiguration", "com.unity3d.services.banners.configuration.BannersModuleConfiguration", "com.unity3d.services.store.core.configuration.StoreModuleConfiguration"};
        this.x = new ExperimentsReader();
        b(new JSONObject(), false);
    }

    protected void a(JSONObject jSONObject, boolean z) throws JSONException, MalformedURLException {
        String string;
        try {
            string = !jSONObject.isNull("url") ? jSONObject.getString("url") : null;
        } catch (JSONException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            throw new MalformedURLException("WebView URL is null or empty");
        }
        this.a = string;
        try {
            this.b = !jSONObject.isNull("hash") ? jSONObject.getString("hash") : null;
        } catch (JSONException unused2) {
            this.b = null;
        }
        this.v = !jSONObject.isNull("tkn") ? jSONObject.optString("tkn") : null;
        this.w = jSONObject.isNull("sid") ? null : jSONObject.optString("sid");
        b(jSONObject, z);
        this.t = a(jSONObject).toString();
    }

    protected void b() throws Exception {
        if (this.u == null) {
            throw new MalformedURLException("Base URL is null");
        }
        h webRequest = this.B.getWebRequest();
        InitializeEventsMetricSender.getInstance().didConfigRequestStart();
        a(new JSONObject(webRequest.n()), true);
        saveToDisk();
    }

    public String getConfigUrl() {
        return this.u;
    }

    public int getConnectedEventThreshold() {
        return this.k;
    }

    public boolean getDelayWebViewUpdate() {
        return this.f;
    }

    public Experiments getExperiments() {
        return this.x.getCurrentlyActiveExperiments();
    }

    public ExperimentsReader getExperimentsReader() {
        return this.x;
    }

    public String getJSONString() {
        return this.t;
    }

    public int getLoadTimeout() {
        return this.o;
    }

    public int getMaxRetries() {
        return this.h;
    }

    public int getMaximumConnectedEvents() {
        return this.l;
    }

    public double getMetricSampleRate() {
        return this.r;
    }

    public String getMetricsUrl() {
        return this.q;
    }

    public IModuleConfiguration getModuleConfiguration(String str) {
        Map<String, IModuleConfiguration> map = this.C;
        if (map != null && map.containsKey(str)) {
            return this.C.get(str);
        }
        try {
            IModuleConfiguration iModuleConfiguration = (IModuleConfiguration) Class.forName(str).newInstance();
            if (iModuleConfiguration != null) {
                if (this.C == null) {
                    HashMap map2 = new HashMap();
                    this.C = map2;
                    map2.put(str, iModuleConfiguration);
                }
                return iModuleConfiguration;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String[] getModuleConfigurationList() {
        return this.D;
    }

    public long getNetworkErrorTimeout() {
        return this.m;
    }

    public int getPrivacyRequestWaitTimeout() {
        return this.z;
    }

    public int getResetWebappTimeout() {
        return this.g;
    }

    public long getRetryDelay() {
        return this.i;
    }

    public double getRetryScalingFactor() {
        return this.j;
    }

    public String getSdkVersion() {
        return this.e;
    }

    public int getShowTimeout() {
        return this.n;
    }

    public String getSrc() {
        String str = this.A;
        return str != null ? str : "";
    }

    public String getStateId() {
        String str = this.w;
        return str != null ? str : "";
    }

    public int getTokenTimeout() {
        return this.y;
    }

    public String getUnifiedAuctionToken() {
        return this.v;
    }

    public Class[] getWebAppApiClassList() {
        if (this.E == null) {
            a();
        }
        return this.E;
    }

    public long getWebViewAppCreateTimeout() {
        return this.s;
    }

    public int getWebViewBridgeTimeout() {
        return this.p;
    }

    public String getWebViewData() {
        return this.d;
    }

    public String getWebViewHash() {
        return this.b;
    }

    public String getWebViewUrl() {
        return this.a;
    }

    public String getWebViewVersion() {
        return this.c;
    }

    public void saveToDisk() {
        j.a(new File(d.k()), getJSONString());
    }

    public void setWebViewData(String str) {
        this.d = str;
    }

    public void setWebViewHash(String str) {
        this.b = str;
    }

    public void setWebViewUrl(String str) {
        this.a = str;
    }

    public Configuration(String str) {
        this(str, new Experiments());
    }

    public Configuration(JSONObject jSONObject) throws JSONException, MalformedURLException {
        this.D = new String[]{"com.unity3d.services.core.configuration.CoreModuleConfiguration", "com.unity3d.services.ads.configuration.AdsModuleConfiguration", "com.unity3d.services.analytics.core.configuration.AnalyticsModuleConfiguration", "com.unity3d.services.banners.configuration.BannersModuleConfiguration", "com.unity3d.services.store.core.configuration.StoreModuleConfiguration"};
        this.x = new ExperimentsReader();
        a(jSONObject, false);
    }

    private void b(JSONObject jSONObject, boolean z) {
        this.c = jSONObject.optString(MediationMetaData.KEY_VERSION, null);
        this.f = jSONObject.optBoolean("dwu", false);
        this.g = jSONObject.optInt("rwt", 10000);
        this.h = jSONObject.optInt("mr", 6);
        this.i = jSONObject.optLong("rd", 5000L);
        this.j = jSONObject.optDouble("rcf", 2.0d);
        this.k = jSONObject.optInt("cet", 10000);
        this.l = jSONObject.optInt("mce", ServiceStarter.ERROR_UNKNOWN);
        this.m = jSONObject.optLong("net", 60000L);
        this.e = jSONObject.optString("sdkv", "");
        this.n = jSONObject.optInt("sto", 10000);
        this.o = jSONObject.optInt("lto", 30000);
        this.p = jSONObject.optInt("wto", GpTouchConstants.SYNC_INTERVAL);
        this.q = jSONObject.optString("murl", "");
        this.r = jSONObject.optDouble("msr", 100.0d);
        this.s = jSONObject.optLong("wct", 60000L);
        this.y = jSONObject.optInt("tto", GpTouchConstants.SYNC_INTERVAL);
        this.z = jSONObject.optInt("prwto", 3000);
        this.A = jSONObject.optString("src", null);
        if (z) {
            this.x.updateRemoteExperiments(new Experiments(jSONObject.optJSONObject("exp")));
        } else {
            this.x.updateLocalExperiments(new Experiments(jSONObject.optJSONObject("exp")));
        }
    }

    private void a() {
        ArrayList arrayList = new ArrayList();
        for (String str : getModuleConfigurationList()) {
            IModuleConfiguration moduleConfiguration = getModuleConfiguration(str);
            if (moduleConfiguration != null && moduleConfiguration.getWebAppApiClassList() != null) {
                arrayList.addAll(Arrays.asList(moduleConfiguration.getWebAppApiClassList()));
            }
        }
        this.E = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    private JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (!next.equals("tkn") && !next.equals("sid")) {
                jSONObject2.put(next, objOpt);
            }
        }
        return jSONObject2;
    }

    public Configuration(String str, ExperimentsReader experimentsReader) {
        this(str, experimentsReader.getCurrentlyActiveExperiments());
        this.x = experimentsReader;
    }

    public Configuration(String str, Experiments experiments) {
        this();
        this.u = str;
        this.B = new ConfigurationRequestFactory(this, new a(new ConfigurationReader(), PrivacyConfigStorage.getInstance()));
        this.x.updateLocalExperiments(experiments);
    }
}
