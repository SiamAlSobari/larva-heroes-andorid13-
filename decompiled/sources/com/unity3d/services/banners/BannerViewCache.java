package com.unity3d.services.banners;

import com.unity3d.services.core.misc.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class BannerViewCache {
    private static BannerViewCache a;
    private HashMap<String, WeakReference<BannerView>> b = new HashMap<>();

    class a implements Runnable {
        final /* synthetic */ BannerView.IListener a;
        final /* synthetic */ BannerView b;

        a(BannerView.IListener iListener, BannerView bannerView) {
            this.a = iListener;
            this.b = bannerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            BannerView.IListener iListener = this.a;
            if (iListener != null) {
                iListener.onBannerLoaded(this.b);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ BannerView.IListener a;
        final /* synthetic */ BannerView b;

        b(BannerView.IListener iListener, BannerView bannerView) {
            this.a = iListener;
            this.b = bannerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            BannerView.IListener iListener = this.a;
            if (iListener != null) {
                iListener.onBannerClick(this.b);
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ BannerView.IListener a;
        final /* synthetic */ BannerView b;
        final /* synthetic */ BannerErrorInfo c;

        c(BannerView.IListener iListener, BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            this.a = iListener;
            this.b = bannerView;
            this.c = bannerErrorInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            BannerView.IListener iListener = this.a;
            if (iListener != null) {
                iListener.onBannerFailedToLoad(this.b, this.c);
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ BannerView.IListener a;
        final /* synthetic */ BannerView b;

        d(BannerView.IListener iListener, BannerView bannerView) {
            this.a = iListener;
            this.b = bannerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            BannerView.IListener iListener = this.a;
            if (iListener != null) {
                iListener.onBannerLeftApplication(this.b);
            }
        }
    }

    public static BannerViewCache getInstance() {
        if (a == null) {
            a = new BannerViewCache();
        }
        return a;
    }

    public synchronized String addBannerView(BannerView bannerView) {
        this.b.put(bannerView.getViewId(), new WeakReference<>(bannerView));
        return bannerView.getViewId();
    }

    public synchronized BannerView getBannerView(String str) {
        WeakReference<BannerView> weakReference = this.b.get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return weakReference.get();
    }

    public synchronized boolean loadWebPlayer(String str, UnityBannerSize unityBannerSize) {
        BannerView bannerView = getBannerView(str);
        if (bannerView == null) {
            return false;
        }
        bannerView.a(unityBannerSize);
        return true;
    }

    public synchronized void removeBannerView(String str) {
        this.b.remove(str);
    }

    public synchronized void triggerBannerClickEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            j.a(new b(bannerView.getListener(), bannerView));
        }
    }

    public synchronized void triggerBannerErrorEvent(String str, BannerErrorInfo bannerErrorInfo) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            j.a(new c(bannerView.getListener(), bannerView, bannerErrorInfo));
        }
    }

    public synchronized void triggerBannerLeftApplicationEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            j.a(new d(bannerView.getListener(), bannerView));
        }
    }

    public synchronized void triggerBannerLoadEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            j.a(new a(bannerView.getListener(), bannerView));
        }
    }
}
