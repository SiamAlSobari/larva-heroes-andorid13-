package com.unity3d.services.core.configuration;

import android.os.ConditionVariable;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.token.h;
import com.unity3d.services.core.api.DownloadLatestWebViewStatus;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.connectivity.e;
import com.unity3d.services.core.device.reader.f;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.properties.d;
import com.unity3d.services.core.request.metrics.i;
import com.unity3d.services.core.webview.WebView;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class InitializeThread extends Thread {
    private static InitializeThread a;
    private c b;
    private String c;
    private boolean d = false;
    private boolean e = false;
    private long f;

    public static class InitializeStateCheckForCachedWebViewUpdate extends c {
        private Configuration a;

        public InitializeStateCheckForCachedWebViewUpdate(Configuration configuration) {
            super(null);
            this.a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            try {
                byte[] bArrB = InitializeThread.b(new File(d.m()));
                if (j.a(bArrB).equals(this.a.getWebViewHash())) {
                    return new InitializeStateUpdateCache(this.a, new String(bArrB, "UTF-8"));
                }
            } catch (Exception unused) {
            }
            return new InitializeStateDownloadWebView(this.a);
        }

        public Configuration getConfiguration() {
            return this.a;
        }
    }

    public static class InitializeStateCheckForUpdatedWebView extends c {
        private Configuration a;
        private byte[] b;
        private Configuration c;

        public InitializeStateCheckForUpdatedWebView(Configuration configuration, byte[] bArr, Configuration configuration2) {
            super(null);
            this.a = configuration;
            this.b = bArr;
            this.c = configuration2;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            try {
                String strA = j.a(this.b);
                if (!strA.equals(this.a.getWebViewHash())) {
                    d.a(this.a);
                }
                if (!TextUtils.isEmpty(strA)) {
                    Configuration configuration = this.c;
                    if (configuration != null && configuration.getWebViewHash() != null && this.c.getWebViewHash().equals(strA) && d.o().equals(this.c.getSdkVersion())) {
                        return new InitializeStateCreate(this.c, new String(this.b, "UTF-8"));
                    }
                    Configuration configuration2 = this.a;
                    if (configuration2 != null && configuration2.getWebViewHash().equals(strA)) {
                        return new InitializeStateCreate(this.a, new String(this.b, "UTF-8"));
                    }
                }
            } catch (Exception unused) {
            }
            return new InitializeStateCleanCache(this.a, new InitializeStateLoadWeb(this.a));
        }
    }

    public static class InitializeStateCleanCache extends c {
        private Configuration a;
        private c b;

        public InitializeStateCleanCache(Configuration configuration, c cVar) {
            super(null);
            this.a = configuration;
            this.b = cVar;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            try {
                File file = new File(d.k());
                File file2 = new File(d.m());
                file.delete();
                file2.delete();
            } catch (Exception e) {
                com.unity3d.services.core.log.a.c("Failure trying to clean cache: " + e.getMessage());
            }
            return this.b;
        }

        public Configuration getConfiguration() {
            return this.a;
        }
    }

    public static class InitializeStateCleanCacheIgnoreError extends InitializeStateCleanCache {
        public InitializeStateCleanCacheIgnoreError(Configuration configuration, c cVar) {
            super(configuration, cVar);
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateCleanCache, com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            try {
                c cVarExecute = super.execute();
                if (cVarExecute instanceof InitializeStateError) {
                    return null;
                }
                return cVarExecute;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class InitializeStateComplete extends c {
        private Configuration a;

        public InitializeStateComplete(Configuration configuration) {
            super(null);
            this.a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            for (String str : this.a.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this.a.getModuleConfiguration(str);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initCompleteState(this.a);
                }
            }
            return null;
        }
    }

    public static class InitializeStateConfig extends c {
        private Configuration a;
        private Configuration b;
        private int c;
        private long d;
        private int e;
        private double f;
        private c g;

        class a implements IConfigurationLoaderListener {
            final /* synthetic */ Configuration a;

            a(Configuration configuration) {
                this.a = configuration;
            }

            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onError(String str) {
                i.a().sendMetric(com.unity3d.services.core.request.metrics.j.a());
                InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                initializeStateConfig.g = initializeStateConfig.executeLegacy(this.a);
            }

            @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
            public void onSuccess(Configuration configuration) {
                InitializeStateConfig.this.a = configuration;
                InitializeStateConfig.this.a.saveToDisk();
                if (InitializeStateConfig.this.a.getDelayWebViewUpdate()) {
                    InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                    initializeStateConfig.g = new InitializeStateLoadCacheConfigAndWebView(initializeStateConfig.a, InitializeStateConfig.this.b);
                }
                h.a(InitializeStateConfig.this.a.getUnifiedAuctionToken());
                boolean zIsNativeWebViewCacheEnabled = InitializeStateConfig.this.a.getExperiments().isNativeWebViewCacheEnabled();
                InitializeStateConfig initializeStateConfig2 = InitializeStateConfig.this;
                initializeStateConfig2.g = zIsNativeWebViewCacheEnabled ? new InitializeStateCreateWithRemote(initializeStateConfig2.a) : new InitializeStateLoadCache(initializeStateConfig2.a);
            }
        }

        public InitializeStateConfig(Configuration configuration) {
            super(null);
            this.a = new Configuration(d.d(), configuration.getExperimentsReader());
            this.c = 0;
            this.d = configuration.getRetryDelay();
            this.e = configuration.getMaxRetries();
            this.f = configuration.getRetryScalingFactor();
            this.b = configuration;
            this.g = null;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            com.unity3d.services.core.log.a.d("Unity Ads init: load configuration from " + d.d());
            return (this.a.getExperiments() == null || !this.a.getExperiments().isTwoStageInitializationEnabled()) ? executeLegacy(this.a) : executeWithLoader();
        }

        public c executeLegacy(Configuration configuration) {
            try {
                configuration.b();
                if (configuration.getDelayWebViewUpdate()) {
                    return new InitializeStateLoadCacheConfigAndWebView(configuration, this.b);
                }
                c initializeStateCreateWithRemote = configuration.getExperiments().isNativeWebViewCacheEnabled() ? new InitializeStateCreateWithRemote(configuration) : new InitializeStateLoadCache(configuration);
                this.g = initializeStateCreateWithRemote;
                return initializeStateCreateWithRemote;
            } catch (Exception e) {
                if (this.c >= this.e) {
                    return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, e, this, this.b);
                }
                double d = this.d;
                double d2 = this.f;
                Double.isNaN(d);
                this.d = (long) (d * d2);
                this.c++;
                InitializeEventsMetricSender.getInstance().onRetryConfig();
                return new InitializeStateRetry(this, this.d);
            }
        }

        public c executeWithLoader() {
            PrivacyConfigStorage privacyConfigStorage = PrivacyConfigStorage.getInstance();
            IConfigurationLoader configurationLoader = new ConfigurationLoader(new ConfigurationRequestFactory(this.a, new com.unity3d.services.core.device.reader.a(new ConfigurationReader(), privacyConfigStorage)));
            if (this.a.getExperiments().isPrivacyRequestEnabled()) {
                configurationLoader = new PrivacyConfigurationLoader(configurationLoader, new ConfigurationRequestFactory(this.a, new f(new ConfigurationReader(), privacyConfigStorage)), privacyConfigStorage);
            }
            try {
                configurationLoader.loadConfiguration(new a(new Configuration(d.d())));
                return this.g;
            } catch (Exception e) {
                int i = this.c;
                if (i >= this.e) {
                    return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, e, this, this.a);
                }
                double d = this.d;
                double d2 = this.f;
                Double.isNaN(d);
                this.d = (long) (d * d2);
                this.c = i + 1;
                InitializeEventsMetricSender.getInstance().onRetryConfig();
                return new InitializeStateRetry(this, this.d);
            }
        }

        public Configuration getConfiguration() {
            return this.a;
        }
    }

    public static class InitializeStateCreate extends c {
        private Configuration a;
        private String b;

        public InitializeStateCreate(Configuration configuration, String str) {
            super(null);
            this.a = configuration;
            this.b = str;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            com.unity3d.services.core.log.a.b("Unity Ads init: creating webapp");
            Configuration configuration = this.a;
            configuration.setWebViewData(this.b);
            try {
                ErrorState errorStateA = com.unity3d.services.core.webview.a.a(configuration, false);
                if (errorStateA == null) {
                    return new InitializeStateComplete(this.a);
                }
                String strF = com.unity3d.services.core.webview.a.c().f() != null ? com.unity3d.services.core.webview.a.c().f() : "Unity Ads WebApp creation failed";
                com.unity3d.services.core.log.a.c(strF);
                return new InitializeStateError(errorStateA, new Exception(strF), this.a);
            } catch (IllegalThreadStateException e) {
                com.unity3d.services.core.log.a.a("Illegal Thread", e);
                return new InitializeStateError(ErrorState.CreateWebApp, e, this.a);
            }
        }

        public Configuration getConfiguration() {
            return this.a;
        }

        public String getWebData() {
            return this.b;
        }
    }

    public static class InitializeStateCreateWithRemote extends c {
        private Configuration a;

        public InitializeStateCreateWithRemote(Configuration configuration) {
            super(null);
            this.a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            com.unity3d.services.core.log.a.b("Unity Ads init: creating webapp");
            try {
                ErrorState errorStateA = com.unity3d.services.core.webview.a.a(this.a, true);
                if (errorStateA == null) {
                    return new InitializeStateComplete(this.a);
                }
                String strF = com.unity3d.services.core.webview.a.c().f() != null ? com.unity3d.services.core.webview.a.c().f() : "Unity Ads WebApp creation failed";
                com.unity3d.services.core.log.a.c(strF);
                return new InitializeStateError(errorStateA, new Exception(strF), this.a);
            } catch (IllegalThreadStateException e) {
                com.unity3d.services.core.log.a.a("Illegal Thread", e);
                return new InitializeStateError(ErrorState.CreateWebApp, e, this.a);
            }
        }

        public Configuration getConfiguration() {
            return this.a;
        }
    }

    public static class InitializeStateDownloadWebView extends c {
        private Configuration a;
        private int b;
        private long c;

        public InitializeStateDownloadWebView(Configuration configuration) {
            super(null);
            this.a = configuration;
            this.b = 0;
            this.c = configuration.getRetryDelay();
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            com.unity3d.services.core.log.a.d("Unity Ads init: downloading webapp from " + this.a.getWebViewUrl());
            try {
                try {
                    String strN = new com.unity3d.services.core.request.h(this.a.getWebViewUrl(), ShareTarget.METHOD_GET, null).n();
                    String webViewHash = this.a.getWebViewHash();
                    if (strN == null || webViewHash == null || !j.a(strN).equals(webViewHash)) {
                        return null;
                    }
                    return new InitializeStateUpdateCache(this.a, strN);
                } catch (Exception unused) {
                    if (this.b >= this.a.getMaxRetries()) {
                        return null;
                    }
                    double d = this.c;
                    double retryScalingFactor = this.a.getRetryScalingFactor();
                    Double.isNaN(d);
                    long j = (long) (d * retryScalingFactor);
                    this.c = j;
                    this.b++;
                    return new InitializeStateRetry(this, j);
                }
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Malformed URL", e);
                return null;
            }
        }
    }

    public static class InitializeStateError extends c {
        ErrorState a;
        Exception b;
        protected Configuration c;

        public InitializeStateError(ErrorState errorState, Exception exc, Configuration configuration) {
            super(null);
            this.a = errorState;
            this.b = exc;
            this.c = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            com.unity3d.services.core.log.a.c("Unity Ads init: halting init in " + this.a.getMetricName() + ": " + this.b.getMessage());
            for (String str : this.c.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this.c.getModuleConfiguration(str);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initErrorState(this.c, this.a, this.b.getMessage());
                }
            }
            return null;
        }
    }

    public static class InitializeStateForceReset extends InitializeStateReset {
        public InitializeStateForceReset() {
            super(new Configuration());
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateReset, com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            d.a(d.a.NOT_INITIALIZED);
            super.execute();
            return null;
        }
    }

    public static class InitializeStateInitModules extends c {
        private Configuration a;

        public InitializeStateInitModules(Configuration configuration) {
            super(null);
            this.a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            for (String str : this.a.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this.a.getModuleConfiguration(str);
                if (moduleConfiguration != null && !moduleConfiguration.initModuleState(this.a)) {
                    return new InitializeStateError(ErrorState.InitModules, new Exception("Unity Ads config server resolves to loopback address (due to ad blocker?)"), this.a);
                }
            }
            return new InitializeStateConfig(this.a);
        }

        public Configuration getConfiguration() {
            return this.a;
        }
    }

    public static class InitializeStateLoadCache extends c {
        private Configuration a;

        public InitializeStateLoadCache(Configuration configuration) {
            super(null);
            this.a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() throws Throwable {
            com.unity3d.services.core.log.a.b("Unity Ads init: check if webapp can be loaded from local cache");
            try {
                byte[] bArrA = j.a(new File(d.m()));
                String strA = j.a(bArrA);
                if (strA == null || !strA.equals(this.a.getWebViewHash())) {
                    return new InitializeStateLoadWeb(this.a);
                }
                try {
                    String str = new String(bArrA, "UTF-8");
                    com.unity3d.services.core.log.a.d("Unity Ads init: webapp loaded from local cache");
                    return new InitializeStateCreate(this.a, str);
                } catch (Exception e) {
                    return new InitializeStateError(ErrorState.LoadCache, e, this.a);
                }
            } catch (Exception e2) {
                com.unity3d.services.core.log.a.b("Unity Ads init: webapp not found in local cache: " + e2.getMessage());
                return new InitializeStateLoadWeb(this.a);
            }
        }

        public Configuration getConfiguration() {
            return this.a;
        }
    }

    public static class InitializeStateLoadCacheConfigAndWebView extends c {
        private Configuration a;
        private Configuration b;

        public InitializeStateLoadCacheConfigAndWebView(Configuration configuration, Configuration configuration2) {
            super(null);
            this.a = configuration;
            this.b = configuration2;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            try {
                return new InitializeStateCheckForUpdatedWebView(this.a, InitializeThread.b(new File(d.m())), this.b);
            } catch (Exception unused) {
                return new InitializeStateCleanCache(this.a, new InitializeStateLoadWeb(this.a));
            }
        }

        public Configuration getConfiguration() {
            return this.a;
        }
    }

    public static class InitializeStateLoadConfigFile extends c {
        private Configuration a;

        public InitializeStateLoadConfigFile(Configuration configuration) {
            super(null);
            this.a = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            com.unity3d.services.core.log.a.b("Unity Ads init: Loading Config File Parameters");
            File file = new File(d.k());
            try {
                if (!file.exists()) {
                    return new InitializeStateReset(this.a);
                }
                try {
                    Configuration configuration = new Configuration(new JSONObject(new String(j.a(file))));
                    this.a = configuration;
                    return new InitializeStateReset(configuration);
                } catch (Exception unused) {
                    com.unity3d.services.core.log.a.b("Unity Ads init: Using default configuration parameters");
                    return new InitializeStateReset(this.a);
                }
            } catch (Throwable unused2) {
                return new InitializeStateReset(this.a);
            }
        }
    }

    public static class InitializeStateLoadWeb extends c {
        private Configuration a;
        private int b;
        private long c;
        private int d;
        private double e;

        public InitializeStateLoadWeb(Configuration configuration) {
            super(null);
            this.a = configuration;
            this.b = 0;
            this.c = configuration.getRetryDelay();
            this.d = configuration.getMaxRetries();
            this.e = configuration.getRetryScalingFactor();
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            com.unity3d.services.core.log.a.d("Unity Ads init: loading webapp from " + this.a.getWebViewUrl());
            try {
                try {
                    String strN = new com.unity3d.services.core.request.h(this.a.getWebViewUrl(), ShareTarget.METHOD_GET, null).n();
                    String webViewHash = this.a.getWebViewHash();
                    if (webViewHash != null && !j.a(strN).equals(webViewHash)) {
                        return new InitializeStateError(ErrorState.InvalidHash, new Exception("Invalid webViewHash"), this.a);
                    }
                    if (webViewHash != null) {
                        j.a(new File(d.m()), strN);
                    }
                    return new InitializeStateCreate(this.a, strN);
                } catch (Exception e) {
                    if (this.b >= this.d) {
                        return new InitializeStateNetworkError(ErrorState.NetworkWebviewRequest, e, this, this.a);
                    }
                    double d = this.c;
                    double d2 = this.e;
                    Double.isNaN(d);
                    this.c = (long) (d * d2);
                    this.b++;
                    InitializeEventsMetricSender.getInstance().onRetryWebview();
                    return new InitializeStateRetry(this, this.c);
                }
            } catch (MalformedURLException e2) {
                com.unity3d.services.core.log.a.a("Malformed URL", e2);
                return new InitializeStateError(ErrorState.MalformedWebviewRequest, e2, this.a);
            }
        }

        public Configuration getConfiguration() {
            return this.a;
        }
    }

    public static class InitializeStateNetworkError extends InitializeStateError implements e {
        private static int d;
        private static long e;
        private ErrorState f;
        private c g;
        private ConditionVariable h;
        private long i;
        private int j;
        private int k;

        public InitializeStateNetworkError(ErrorState errorState, Exception exc, c cVar, Configuration configuration) {
            super(errorState, exc, configuration);
            this.f = errorState;
            d = 0;
            e = 0L;
            this.g = cVar;
            this.i = configuration.getNetworkErrorTimeout();
            this.j = configuration.getMaximumConnectedEvents();
            this.k = configuration.getConnectedEventThreshold();
        }

        private boolean a() {
            return System.currentTimeMillis() - e >= ((long) this.k) && d <= this.j;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateError, com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            com.unity3d.services.core.log.a.c("Unity Ads init: network error, waiting for connection events");
            this.h = new ConditionVariable();
            com.unity3d.services.core.connectivity.c.a(this);
            if (this.h.block(this.i)) {
                com.unity3d.services.core.connectivity.c.b(this);
                return this.g;
            }
            com.unity3d.services.core.connectivity.c.b(this);
            return new InitializeStateError(this.f, new Exception("No connected events within the timeout!"), this.c);
        }

        @Override // com.unity3d.services.core.connectivity.e
        public void onConnected() {
            d++;
            com.unity3d.services.core.log.a.b("Unity Ads init got connected event");
            if (a()) {
                this.h.open();
            }
            if (d > this.j) {
                com.unity3d.services.core.connectivity.c.b(this);
            }
            e = System.currentTimeMillis();
        }

        @Override // com.unity3d.services.core.connectivity.e
        public void onDisconnected() {
            com.unity3d.services.core.log.a.b("Unity Ads init got disconnected event");
        }
    }

    public static class InitializeStateReset extends c {
        private Configuration a;
        private int b;

        class a implements Runnable {
            final /* synthetic */ com.unity3d.services.core.webview.a a;
            final /* synthetic */ ConditionVariable b;

            a(com.unity3d.services.core.webview.a aVar, ConditionVariable conditionVariable) {
                this.a = aVar;
                this.b = conditionVariable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.g().destroy();
                this.a.a((WebView) null);
                this.b.open();
            }
        }

        public InitializeStateReset(Configuration configuration) {
            super(null);
            this.a = configuration;
            this.b = configuration.getResetWebappTimeout();
        }

        private void a() {
            if (Lifecycle.getLifecycleListener() != null) {
                if (com.unity3d.services.core.properties.a.d() != null) {
                    com.unity3d.services.core.properties.a.d().unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
                }
                Lifecycle.setLifecycleListener(null);
            }
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            boolean zBlock;
            com.unity3d.services.core.log.a.b("Unity Ads init: starting init");
            ConditionVariable conditionVariable = new ConditionVariable();
            com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
            if (aVarC != null) {
                aVarC.j();
                if (aVarC.g() != null) {
                    j.a(new a(aVarC, conditionVariable));
                    zBlock = conditionVariable.block(this.b);
                } else {
                    zBlock = true;
                }
                if (!zBlock) {
                    return new InitializeStateError(ErrorState.ResetWebApp, new Exception("Reset failed on opening ConditionVariable"), this.a);
                }
            }
            a();
            d.a((com.unity3d.services.core.cache.a) null);
            if (d.a() == null) {
                return new InitializeStateError(ErrorState.ResetWebApp, new Exception("Cache directory is NULL"), this.a);
            }
            d.b(false);
            for (String str : this.a.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = this.a.getModuleConfiguration(str);
                if (moduleConfiguration != null) {
                    moduleConfiguration.resetState(this.a);
                }
            }
            return new InitializeStateInitModules(this.a);
        }

        public Configuration getConfiguration() {
            return this.a;
        }
    }

    public static class InitializeStateRetry extends c {
        c a;
        long b;

        public InitializeStateRetry(c cVar, long j) {
            super(null);
            this.a = cVar;
            this.b = j;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            com.unity3d.services.core.log.a.b("Unity Ads init: retrying in " + this.b + " milliseconds");
            try {
                Thread.sleep(this.b);
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Init retry interrupted", e);
            }
            return this.a;
        }
    }

    public static class InitializeStateUpdateCache extends c {
        private Configuration a;
        private String b;

        public InitializeStateUpdateCache(Configuration configuration, String str) {
            super(null);
            this.a = configuration;
            this.b = str;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.c
        public c execute() {
            if (this.a != null && this.b != null) {
                try {
                    j.a(new File(d.m()), this.b);
                    j.a(new File(d.k()), this.a.getJSONString());
                } catch (Exception unused) {
                    return new InitializeStateCleanCacheIgnoreError(this.a, null);
                }
            }
            return null;
        }

        public Configuration getConfiguration() {
            return this.a;
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK encountered an error during initialization, cancel initialization");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK");
        }
    }

    private static abstract class c {
        private c() {
        }

        public abstract c execute();

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    private InitializeThread(c cVar) {
        this.b = cVar;
    }

    private int a() {
        return 15;
    }

    private void b(c cVar) {
        if (this.c == null || d(cVar) || this.c.equals("native_retry_state")) {
            return;
        }
        i.a().sendMetric(new com.unity3d.services.core.request.metrics.d(this.c, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f)), null));
    }

    private void c(c cVar) {
        if (d(cVar)) {
            this.e = true;
        } else {
            if (!this.e) {
                this.f = System.nanoTime();
            }
            this.e = false;
        }
        this.c = a(cVar);
    }

    private boolean d(c cVar) {
        return cVar instanceof InitializeStateRetry;
    }

    public static synchronized DownloadLatestWebViewStatus downloadLatestWebView() {
        if (a != null) {
            return DownloadLatestWebViewStatus.INIT_QUEUE_NOT_EMPTY;
        }
        if (d.j() == null) {
            return DownloadLatestWebViewStatus.MISSING_LATEST_CONFIG;
        }
        InitializeThread initializeThread = new InitializeThread(new InitializeStateCheckForCachedWebViewUpdate(d.j()));
        a = initializeThread;
        initializeThread.setName("UnityAdsDownloadThread");
        a.start();
        return DownloadLatestWebViewStatus.BACKGROUND_DOWNLOAD_STARTED;
    }

    public static synchronized void initialize(Configuration configuration) {
        if (a == null) {
            InitializeEventsMetricSender.getInstance().didInitStart();
            com.unity3d.services.core.lifecycle.a.b();
            InitializeThread initializeThread = new InitializeThread(new InitializeStateLoadConfigFile(configuration));
            a = initializeThread;
            initializeThread.setName("UnityAdsInitializeThread");
            a.start();
        }
    }

    public static synchronized void reset() {
        if (a == null) {
            InitializeThread initializeThread = new InitializeThread(new InitializeStateForceReset());
            a = initializeThread;
            initializeThread.setName("UnityAdsResetThread");
            a.start();
        }
    }

    public void quit() {
        this.d = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                c cVar = this.b;
                if (cVar == null || this.d) {
                    break;
                }
                try {
                    c(cVar);
                    c cVarExecute = this.b.execute();
                    this.b = cVarExecute;
                    b(cVarExecute);
                } catch (Exception e) {
                    com.unity3d.services.core.log.a.a("Unity Ads SDK encountered an error during initialization, cancel initialization", e);
                    j.a(new a());
                    this.b = new InitializeStateForceReset();
                } catch (OutOfMemoryError e2) {
                    com.unity3d.services.core.log.a.a("Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK", new Exception(e2));
                    j.a(new b());
                    this.b = new InitializeStateForceReset();
                }
            } catch (OutOfMemoryError unused) {
            }
        }
        a = null;
    }

    private String a(c cVar) {
        if (cVar == null) {
            return null;
        }
        String simpleName = cVar.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            return null;
        }
        String lowerCase = simpleName.substring(a()).toLowerCase();
        StringBuilder sb = new StringBuilder(lowerCase.length() + 7 + 6);
        sb.append("native_");
        sb.append(lowerCase);
        sb.append("_state");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(File file) throws IOException {
        if (file != null && file.exists()) {
            try {
                return j.a(file);
            } catch (IOException unused) {
                throw new IOException("could not read from file");
            }
        }
        throw new IOException("file not found");
    }
}
