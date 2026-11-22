package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewAdsError implements IUnityAdsError {
    protected String a;
    private Enum b;
    protected Object[] c;

    public WebViewAdsError(Enum<?> r1, String str, Object... objArr) {
        this.b = r1;
        this.a = str;
        this.c = objArr;
    }

    @Override // com.unity3d.scar.adapter.common.IUnityAdsError
    public int getCode() {
        return -1;
    }

    @Override // com.unity3d.scar.adapter.common.IUnityAdsError
    public String getDescription() {
        return this.a;
    }

    @Override // com.unity3d.scar.adapter.common.IUnityAdsError
    public String getDomain() {
        return null;
    }

    public Object[] getErrorArguments() {
        return this.c;
    }

    public Enum<?> getErrorCategory() {
        return this.b;
    }
}
