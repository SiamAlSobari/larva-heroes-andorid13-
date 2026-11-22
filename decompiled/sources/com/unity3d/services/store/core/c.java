package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.WebViewAdsError;

/* JADX INFO: compiled from: StoreWebViewError.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends WebViewAdsError {
    public c(Enum<?> r1, String str, Object... objArr) {
        super(r1, str, objArr);
    }

    @Override // com.unity3d.scar.adapter.common.WebViewAdsError, com.unity3d.scar.adapter.common.IUnityAdsError
    public String getDomain() {
        return com.unity3d.services.core.webview.b.STORE.name();
    }
}
