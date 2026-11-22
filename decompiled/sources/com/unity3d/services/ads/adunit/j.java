package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.core.misc.k;

/* JADX INFO: compiled from: WebViewHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class j implements f {
    @Override // com.unity3d.services.ads.adunit.f
    public void a(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void a(AdUnitActivity adUnitActivity, Bundle bundle) {
    }

    @Override // com.unity3d.services.ads.adunit.f
    public boolean a() {
        if (com.unity3d.services.core.webview.a.c() == null || com.unity3d.services.core.webview.a.c().g() == null) {
            return true;
        }
        k.a(com.unity3d.services.core.webview.a.c().g());
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.f
    public View b() {
        if (com.unity3d.services.core.webview.a.c() != null) {
            return com.unity3d.services.core.webview.a.c().g();
        }
        return null;
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void b(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void c(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void d(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.f
    public boolean e(AdUnitActivity adUnitActivity) {
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void f(AdUnitActivity adUnitActivity) {
        a();
    }
}
