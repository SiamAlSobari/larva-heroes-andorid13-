package com.unity3d.services.banners;

import android.app.Activity;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.webplayer.e;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.misc.k;
import com.unity3d.services.core.properties.d;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class BannerView extends RelativeLayout {
    private String a;
    private String b;
    private UnityBannerSize c;
    private IListener d;
    private com.unity3d.services.banners.view.b e;
    private IInitializationListener f;

    public interface IListener {
        void onBannerClick(BannerView bannerView);

        void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo);

        void onBannerLeftApplication(BannerView bannerView);

        void onBannerLoaded(BannerView bannerView);
    }

    public static abstract class Listener implements IListener {
        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerView) {
        }
    }

    class a implements Runnable {
        final /* synthetic */ BannerView a;

        a(BannerView bannerView) {
            this.a = bannerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = this.a.getParent();
            if (parent == null || !(parent instanceof ViewManager)) {
                return;
            }
            ((ViewManager) parent).removeView(this.a);
        }
    }

    class b implements Runnable {
        final /* synthetic */ BannerView a;
        final /* synthetic */ UnityBannerSize b;

        b(BannerView bannerView, UnityBannerSize unityBannerSize) {
            this.a = bannerView;
            this.b = unityBannerSize;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectC = e.a().c(this.a.b);
            JSONObject jSONObjectB = e.a().b(this.a.b);
            JSONObject jSONObjectA = e.a().a(this.a.b);
            if (this.a.e != null) {
                this.a.e.a(jSONObjectC, jSONObjectB);
                this.a.e.setWebPlayerEventSettings(jSONObjectA);
            } else {
                this.a.e = new com.unity3d.services.banners.view.b(this.a.getContext(), this.a.b, jSONObjectC, jSONObjectB, jSONObjectA, this.b);
                BannerView bannerView = this.a;
                bannerView.addView(bannerView.e);
            }
        }
    }

    class c implements IInitializationListener {
        final /* synthetic */ BannerView a;

        c(BannerView bannerView) {
            this.a = bannerView;
        }

        @Override // com.unity3d.services.core.configuration.IInitializationListener
        public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
            this.a.d();
            if (this.a.getListener() != null) {
                this.a.getListener().onBannerFailedToLoad(this.a, new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR));
            }
        }

        @Override // com.unity3d.services.core.configuration.IInitializationListener
        public void onSdkInitialized() {
            this.a.d();
            this.a.a();
        }
    }

    public BannerView(Activity activity, String str, UnityBannerSize unityBannerSize) {
        super(activity);
        this.b = UUID.randomUUID().toString();
        this.a = str;
        this.c = unityBannerSize;
        c();
        setBackgroundColor(0);
        com.unity3d.services.core.properties.a.a(activity);
        BannerViewCache.getInstance().addBannerView(this);
    }

    public void destroy() {
        BannerViewCache.getInstance().removeBannerView(this.b);
        d();
        com.unity3d.services.banners.bridge.a.a(this.a);
        j.a(new a(this));
        com.unity3d.services.banners.view.b bVar = this.e;
        if (bVar != null) {
            bVar.a();
        }
        com.unity3d.services.core.log.a.d("Banner [" + this.a + "] was destroyed");
        this.b = null;
        this.d = null;
        this.e = null;
    }

    public IListener getListener() {
        return this.d;
    }

    public String getPlacementId() {
        return this.a;
    }

    public UnityBannerSize getSize() {
        return this.c;
    }

    String getViewId() {
        return this.b;
    }

    public void load() {
        if (d.q()) {
            a();
        } else {
            b();
        }
    }

    public void setListener(IListener iListener) {
        this.d = iListener;
    }

    private void b() {
        d();
        this.f = new c(this);
        InitializationNotificationCenter.getInstance().addListener(this.f);
    }

    private void c() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(k.b(getContext(), this.c.getWidth())), Math.round(k.b(getContext(), this.c.getHeight()))));
        setGravity(17);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f != null) {
            InitializationNotificationCenter.getInstance().removeListener(this.f);
        }
        this.f = null;
    }

    void a(UnityBannerSize unityBannerSize) {
        j.a(new b(this, unityBannerSize));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.unity3d.services.banners.bridge.a.a(this.a, this.b, this.c);
    }
}
