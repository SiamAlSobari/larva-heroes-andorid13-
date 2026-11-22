package com.unity3d.services.ads.configuration;

import android.os.ConditionVariable;
import com.unity3d.services.ads.adunit.d;
import com.unity3d.services.ads.adunit.h;
import com.unity3d.services.ads.adunit.i;
import com.unity3d.services.ads.adunit.j;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.ads.api.GMAScar;
import com.unity3d.services.ads.api.Load;
import com.unity3d.services.ads.api.Show;
import com.unity3d.services.ads.api.Token;
import com.unity3d.services.ads.api.VideoPlayer;
import com.unity3d.services.ads.api.WebPlayer;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AdsModuleConfiguration implements IAdsModuleConfiguration {
    private InetAddress a;

    class a extends Thread {
        final /* synthetic */ String a;
        final /* synthetic */ ConditionVariable b;

        a(String str, ConditionVariable conditionVariable) {
            this.a = str;
            this.b = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                AdsModuleConfiguration.this.a = InetAddress.getByName(this.a);
                this.b.open();
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Couldn't get address. Host: " + this.a, e);
                this.b.open();
            }
        }
    }

    @Override // com.unity3d.services.ads.configuration.IAdsModuleConfiguration
    public Map<String, Class> getAdUnitViewHandlers() {
        HashMap map = new HashMap();
        map.put("videoplayer", h.class);
        map.put("webplayer", i.class);
        map.put("webview", j.class);
        return map;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public Class[] getWebAppApiClassList() {
        return new Class[]{AdUnit.class, VideoPlayer.class, WebPlayer.class, Load.class, Show.class, Token.class, GMAScar.class};
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initCompleteState(Configuration configuration) {
        d.a(configuration);
        com.unity3d.services.ads.a.a(configuration);
        com.unity3d.services.ads.token.a.a().b(configuration);
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initErrorState(Configuration configuration, ErrorState errorState, String str) {
        com.unity3d.services.ads.token.h.a((String) null);
        com.unity3d.services.ads.token.h.a();
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initModuleState(Configuration configuration) {
        InetAddress inetAddress;
        com.unity3d.services.core.log.a.b("Unity Ads init: checking for ad blockers");
        try {
            String host = new URL(configuration.getConfigUrl()).getHost();
            ConditionVariable conditionVariable = new ConditionVariable();
            new a(host, conditionVariable).start();
            if (conditionVariable.block(2000L) && (inetAddress = this.a) != null && inetAddress.isLoopbackAddress()) {
                com.unity3d.services.core.log.a.c("Unity Ads init: halting init because Unity Ads config resolves to loopback address (due to ad blocker?)");
                return false;
            }
            d.a(configuration);
            com.unity3d.services.ads.a.a(configuration);
            com.unity3d.services.ads.token.a.a().b(configuration);
            return true;
        } catch (MalformedURLException unused) {
        }
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean resetState(Configuration configuration) {
        d.a(configuration);
        com.unity3d.services.ads.a.a(configuration);
        com.unity3d.services.ads.token.h.a();
        com.unity3d.services.ads.token.a.a().b(configuration);
        return true;
    }
}
