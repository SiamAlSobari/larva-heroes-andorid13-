package com.unity3d.services.banners;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.misc.k;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class UnityBanners {
    private static UnityBanners a;
    private IUnityBannerListener b;
    private com.unity3d.services.banners.view.a c = com.unity3d.services.banners.view.a.NONE;
    private d d;

    class a extends BannerView.Listener {
        final /* synthetic */ UnityBanners a;
        final /* synthetic */ d b;

        a(UnityBanners unityBanners, d dVar) {
            this.a = unityBanners;
            this.b = dVar;
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerView) {
            if (this.a.b != null) {
                this.a.b.onUnityBannerClick(bannerView.getPlacementId());
            }
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            if (this.a.b != null) {
                this.a.b.onUnityBannerError(bannerView.getPlacementId() + " " + bannerErrorInfo.errorMessage);
            }
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerView) {
            if (this.a.b != null) {
                this.a.b.onUnityBannerLoaded(bannerView.getPlacementId(), this.b);
            }
        }
    }

    static class b implements Runnable {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IUnityBannerListener bannerListener = UnityBanners.getBannerListener();
            if (bannerListener != null) {
                bannerListener.onUnityBannerError(this.a);
            }
        }
    }

    private class c extends RelativeLayout {
        private String a;
        private boolean b;
        private long c;
        private BannerView d;
        private boolean e;
        private boolean f;
        private d g;
        private Handler h;
        private Runnable i;
        private long j;

        class a implements Runnable {
            final /* synthetic */ UnityBanners a;
            final /* synthetic */ c b;

            a(UnityBanners unityBanners, c cVar) {
                this.a = unityBanners;
                this.b = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.b.c();
            }
        }

        class b implements Runnable {
            final /* synthetic */ c a;

            b(c cVar) {
                this.a = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.removeAllViews();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.banners.UnityBanners$c$c, reason: collision with other inner class name */
        class C0037c extends d {
            final /* synthetic */ c b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0037c(c cVar) {
                super(c.this, null);
                this.b = cVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                this.b.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                this.b.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                this.b.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                this.b.f();
            }
        }

        private class d implements Application.ActivityLifecycleCallbacks {
            private d() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
            }

            /* synthetic */ d(c cVar, a aVar) {
                this();
            }
        }

        public c(Activity activity, String str, UnityBannerSize unityBannerSize) {
            super(activity);
            this.b = false;
            this.c = 30L;
            this.e = false;
            this.f = false;
            this.a = str;
            this.h = new Handler();
            this.i = new a(UnityBanners.this, this);
            d();
            setBackgroundColor(0);
            BannerView bannerView = new BannerView(activity, str, unityBannerSize);
            this.d = bannerView;
            addView(bannerView);
        }

        private void d() {
            setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = this.j;
            if (jUptimeMillis < j) {
                this.h.postAtTime(this.i, j);
            } else {
                c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            Runnable runnable;
            Handler handler = this.h;
            if (handler == null || (runnable = this.i) == null) {
                return;
            }
            handler.removeCallbacks(runnable);
        }

        private void g() {
            if (this.f || com.unity3d.services.core.properties.a.d() == null) {
                return;
            }
            this.g = new C0037c(this);
            this.f = true;
            com.unity3d.services.core.properties.a.d().registerActivityLifecycleCallbacks(this.g);
        }

        private void h() {
            if (!this.f || this.g == null || com.unity3d.services.core.properties.a.d() == null) {
                return;
            }
            this.f = false;
            com.unity3d.services.core.properties.a.d().unregisterActivityLifecycleCallbacks(this.g);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            g();
            if (this.e) {
                e();
            } else {
                this.e = true;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            f();
            h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.d.load();
            long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.SECONDS.toMillis(this.c);
            this.j = jUptimeMillis;
            this.h.postAtTime(this.i, jUptimeMillis);
        }

        public void a(BannerView.IListener iListener) {
            this.d.setListener(iListener);
        }

        public void b() {
            if (this.b) {
                return;
            }
            this.b = true;
            Integer numA = com.unity3d.services.banners.properties.a.a().a(this.a);
            if (numA != null) {
                this.c = numA.longValue();
            }
            c();
        }

        public void a() {
            f();
            this.d.destroy();
            j.a(new b(this));
            this.d = null;
        }
    }

    private UnityBanners() {
    }

    private static UnityBanners b() {
        if (a == null) {
            a = new UnityBanners();
        }
        return a;
    }

    @Deprecated
    public static void destroy() {
        b().a();
    }

    @Deprecated
    public static IUnityBannerListener getBannerListener() {
        return b().b;
    }

    @Deprecated
    public static void loadBanner(Activity activity, String str) {
        com.unity3d.services.core.log.a.a();
        if (!UnityAds.isSupported()) {
            a("Unity Ads is not supported on this device.");
        }
        if (!UnityAds.isInitialized()) {
            a("UnityAds is not initialized.");
        } else {
            com.unity3d.services.core.properties.a.a(activity);
            b().a(activity, str);
        }
    }

    @Deprecated
    public static void setBannerListener(IUnityBannerListener iUnityBannerListener) {
        b().b = iUnityBannerListener;
    }

    @Deprecated
    public static void setBannerPosition(com.unity3d.services.banners.view.a aVar) {
        b().c = aVar;
    }

    private class d extends FrameLayout {
        private com.unity3d.services.banners.view.a a;
        private c b;

        class a implements Runnable {
            final /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.removeAllViews();
                k.a(this.a);
            }
        }

        public d(Context context, c cVar) {
            super(context);
            this.a = com.unity3d.services.banners.view.a.NONE;
            this.b = cVar;
            addView(cVar);
            b();
            setBackgroundColor(0);
        }

        private void b() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = this.a.a();
            setLayoutParams(layoutParams);
        }

        public void a(com.unity3d.services.banners.view.a aVar) {
            this.a = aVar;
            b();
        }

        public void a() {
            j.a(new a(this));
            c cVar = this.b;
            if (cVar != null) {
                cVar.a();
                this.b = null;
            }
        }
    }

    private void a(Activity activity, String str) {
        if (this.d != null) {
            a("A Banner is already in use, please call destroy before loading another banner!");
            return;
        }
        c cVar = new c(activity, str, new UnityBannerSize(320, 50));
        d dVar = new d(activity, cVar);
        dVar.a(this.c);
        this.d = dVar;
        cVar.a(new a(this, dVar));
        cVar.b();
    }

    private void a() {
        d dVar = this.d;
        if (dVar != null) {
            dVar.a();
            this.d = null;
        }
    }

    private static void a(String str) {
        j.a(new b(str));
    }
}
