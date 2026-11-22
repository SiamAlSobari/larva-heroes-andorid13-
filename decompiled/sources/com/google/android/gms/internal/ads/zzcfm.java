package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcfm implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbxb zza;
    final /* synthetic */ zzcfp zzb;

    zzcfm(zzcfp zzcfpVar, zzbxb zzbxbVar) {
        this.zzb = zzcfpVar;
        this.zza = zzbxbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzR(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
