package com.unity3d.services.analytics.core.api;

import com.unity3d.services.analytics.interfaces.b;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;

/* JADX INFO: loaded from: classes2.dex */
public class Analytics {
    public static b analyticsInterface;

    static class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Analytics.analyticsInterface.a(this.a);
        }
    }

    @WebViewExposed
    public static void addExtras(String str, l lVar) {
        if (analyticsInterface == null) {
            lVar.a(com.unity3d.services.analytics.interfaces.a.API_NOT_FOUND, str);
        } else {
            j.a(new a(str));
            lVar.a(new Object[0]);
        }
    }

    public static void setAnalyticsInterface(b bVar) {
        analyticsInterface = bVar;
    }
}
