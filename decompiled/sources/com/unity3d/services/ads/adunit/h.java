package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.api.VideoPlayer;
import com.unity3d.services.core.misc.k;

/* JADX INFO: compiled from: VideoPlayerHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class h implements f {
    private RelativeLayout a;
    private com.unity3d.services.ads.video.c b;

    @Override // com.unity3d.services.ads.adunit.f
    public void a(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.f
    public boolean a() {
        com.unity3d.services.core.log.a.a();
        com.unity3d.services.ads.video.c cVar = this.b;
        if (cVar != null) {
            cVar.e();
            this.b.stopPlayback();
            k.a(this.b);
            if (this.b.equals(VideoPlayer.getVideoPlayerView())) {
                VideoPlayer.setVideoPlayerView(null);
            }
            this.b = null;
        }
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout == null) {
            return true;
        }
        k.a(relativeLayout);
        this.a = null;
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.f
    public View b() {
        return this.a;
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void c(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void d(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.f
    public boolean e(AdUnitActivity adUnitActivity) {
        com.unity3d.services.core.log.a.a();
        if (this.a == null) {
            this.a = new RelativeLayout(adUnitActivity);
        }
        if (this.b != null) {
            return true;
        }
        this.b = new com.unity3d.services.ads.video.c(adUnitActivity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.b.setLayoutParams(layoutParams);
        this.a.addView(this.b);
        VideoPlayer.setVideoPlayerView(this.b);
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void f(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void b(AdUnitActivity adUnitActivity) {
        a();
    }

    @Override // com.unity3d.services.ads.adunit.f
    public void a(AdUnitActivity adUnitActivity, Bundle bundle) {
        e(adUnitActivity);
    }
}
