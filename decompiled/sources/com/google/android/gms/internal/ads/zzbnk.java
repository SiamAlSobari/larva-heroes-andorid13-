package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbnk implements zzcau {
    final /* synthetic */ zzcas zza;
    final /* synthetic */ zzbmo zzb;

    zzbnk(zzbnm zzbnmVar, zzcas zzcasVar, zzbmo zzbmoVar) {
        this.zza = zzcasVar;
        this.zzb = zzbmoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zza() {
        this.zza.zzd(new zzbmx("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
