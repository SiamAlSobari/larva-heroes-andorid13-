package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckf implements zzdsp {
    private final zzciz zza;
    private Context zzb;
    private zzbjp zzc;

    /* synthetic */ zzckf(zzciz zzcizVar, zzcke zzckeVar) {
        this.zza = zzcizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsp
    public final /* synthetic */ zzdsp zza(zzbjp zzbjpVar) {
        zzbjpVar.getClass();
        this.zzc = zzbjpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsp
    public final /* synthetic */ zzdsp zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsp
    public final zzdsq zzc() {
        zzgzb.zzc(this.zzb, Context.class);
        zzgzb.zzc(this.zzc, zzbjp.class);
        return new zzckh(this.zza, this.zzb, this.zzc, null);
    }
}
