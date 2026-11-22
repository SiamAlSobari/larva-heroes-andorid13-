package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.core.misc.k;

/* JADX INFO: compiled from: WebPlayerHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class i implements f {
    private static String a = "webplayer";
    private com.unity3d.services.ads.webplayer.f b;

    @Override // com.unity3d.services.ads.adunit.f
    public void a(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.f
    public boolean a() {
        com.unity3d.services.ads.webplayer.f fVar = this.b;
        if (fVar != null) {
            k.a(fVar);
            this.b.destroy();
        }
        com.unity3d.services.ads.webplayer.g.a().b(a);
        this.b = null;
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.f
    public View b() {
        return this.b;
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
        if (this.b != null) {
            return true;
        }
        com.unity3d.services.ads.webplayer.e eVarA = com.unity3d.services.ads.webplayer.e.a();
        String str = a;
        com.unity3d.services.ads.webplayer.f fVar = new com.unity3d.services.ads.webplayer.f(adUnitActivity, str, eVarA.c(str), eVarA.b(a));
        this.b = fVar;
        fVar.setEventSettings(eVarA.a(a));
        com.unity3d.services.ads.webplayer.g.a().a(a, this.b);
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void f(AdUnitActivity adUnitActivity) {
        if (adUnitActivity.isFinishing()) {
            a();
        }
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void a(AdUnitActivity adUnitActivity, Bundle bundle) {
        e(adUnitActivity);
    }
}
