package com.unity3d.services.banners.api;

import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;

/* JADX INFO: loaded from: classes2.dex */
public class BannerListener {
    @WebViewExposed
    public static void sendClickEvent(String str, l lVar) {
        BannerViewCache.getInstance().triggerBannerClickEvent(str);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void sendErrorEvent(String str, Integer num, String str2, l lVar) {
        BannerViewCache.getInstance().triggerBannerErrorEvent(str, new BannerErrorInfo(str2, BannerErrorCode.values()[num.intValue()]));
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void sendLeaveApplicationEvent(String str, l lVar) {
        BannerViewCache.getInstance().triggerBannerLeftApplicationEvent(str);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void sendLoadEvent(String str, l lVar) {
        BannerViewCache.getInstance().triggerBannerLoadEvent(str);
        lVar.a(new Object[0]);
    }
}
