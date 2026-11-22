package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.WebViewAdsError;

/* JADX INFO: compiled from: WebViewErrorHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class e implements IAdsErrorHandler<WebViewAdsError> {
    @Override // com.unity3d.scar.adapter.common.IAdsErrorHandler
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleError(WebViewAdsError webViewAdsError) {
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.valueOf(webViewAdsError.getDomain()), webViewAdsError.getErrorCategory(), webViewAdsError.getErrorArguments());
    }
}
