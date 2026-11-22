package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzka implements zzku {
    private final Object zza;
    private final zztu zzb;
    private zzcw zzc;

    public zzka(Object obj, zztn zztnVar) {
        this.zza = obj;
        this.zzb = zztnVar;
        this.zzc = zztnVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final zzcw zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzcw zzcwVar) {
        this.zzc = zzcwVar;
    }
}
