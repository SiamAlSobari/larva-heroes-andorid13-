package com.unity3d.services.banners.bridge;

import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.webview.b;

/* JADX INFO: compiled from: BannerBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: com.unity3d.services.banners.bridge.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerBridge.java */
    public enum EnumC0038a {
        BANNER_VISIBILITY_CHANGED,
        BANNER_RESIZED,
        BANNER_LOADED,
        BANNER_DESTROYED,
        BANNER_ATTACHED,
        BANNER_DETACHED,
        BANNER_LOAD_PLACEMENT,
        BANNER_DESTROY_BANNER
    }

    public static void a(String str, String str2, UnityBannerSize unityBannerSize) {
        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
        if (aVarC != null) {
            aVarC.a(b.BANNER, EnumC0038a.BANNER_LOAD_PLACEMENT, str, str2, Integer.valueOf(unityBannerSize.getWidth()), Integer.valueOf(unityBannerSize.getHeight()));
            return;
        }
        BannerView bannerView = BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView == null || bannerView.getListener() == null) {
            return;
        }
        bannerView.getListener().onBannerFailedToLoad(bannerView, new BannerErrorInfo("WebViewApp was not available, this is likely because UnityAds has not been initialized", BannerErrorCode.WEBVIEW_ERROR));
    }

    public static void b(String str) {
        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
        if (aVarC != null) {
            aVarC.a(b.BANNER, EnumC0038a.BANNER_ATTACHED, str);
        }
    }

    public static void c(String str) {
        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
        if (aVarC != null) {
            aVarC.a(b.BANNER, EnumC0038a.BANNER_DETACHED, str);
        }
    }

    public static void d(String str) {
        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
        if (aVarC != null) {
            aVarC.a(b.BANNER, EnumC0038a.BANNER_LOADED, str);
        }
    }

    public static void a(String str) {
        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
        if (aVarC != null) {
            aVarC.a(b.BANNER, EnumC0038a.BANNER_DESTROY_BANNER, str);
        }
    }

    public static void a(String str, int i, int i2, int i3, int i4, float f) {
        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
        if (aVarC != null) {
            aVarC.a(b.BANNER, EnumC0038a.BANNER_RESIZED, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f));
        }
    }

    public static void a(String str, int i) {
        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
        if (aVarC != null) {
            aVarC.a(b.BANNER, EnumC0038a.BANNER_VISIBILITY_CHANGED, str, Integer.valueOf(i));
        }
    }
}
