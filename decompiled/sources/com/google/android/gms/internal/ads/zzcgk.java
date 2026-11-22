package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcgk extends zzcgl {
    public zzcgk(zzcfi zzcfiVar, zzaxe zzaxeVar, boolean z, zzecs zzecsVar) {
        super(zzcfiVar, zzaxeVar, z, zzecsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzN(webView, str, null);
    }
}
