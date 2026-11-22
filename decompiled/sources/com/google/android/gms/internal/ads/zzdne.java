package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdne extends zzdmo implements zzddw {
    private zzddw zza;

    @Override // com.google.android.gms.internal.ads.zzddw
    public final synchronized void zzbK() {
        zzddw zzddwVar = this.zza;
        if (zzddwVar != null) {
            zzddwVar.zzbK();
        }
    }

    protected final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhh zzbhhVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbhj zzbhjVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, zzddw zzddwVar) {
        super.zzh(zzaVar, zzbhhVar, zzoVar, zzbhjVar, zzzVar);
        this.zza = zzddwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final synchronized void zzs() {
        zzddw zzddwVar = this.zza;
        if (zzddwVar != null) {
            zzddwVar.zzs();
        }
    }
}
