package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeii extends zzbvn {
    final /* synthetic */ zzcyo zza;
    final /* synthetic */ zzcwg zzb;
    final /* synthetic */ zzcxp zzc;
    final /* synthetic */ zzdef zzd;

    zzeii(zzeij zzeijVar, zzcyo zzcyoVar, zzcwg zzcwgVar, zzcxp zzcxpVar, zzdef zzdefVar) {
        this.zza = zzcyoVar;
        this.zzb = zzcwgVar;
        this.zzc = zzcxpVar;
        this.zzd = zzdefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzby(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzbv();
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzm(IObjectWrapper iObjectWrapper, zzbvp zzbvpVar) {
        this.zzd.zza(zzbvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
