package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzelk {
    private final zzdin zza;
    private final zzekx zzb;
    private final zzcwl zzc;

    public zzelk(zzdin zzdinVar, zzfgo zzfgoVar) {
        this.zza = zzdinVar;
        final zzekx zzekxVar = new zzekx(zzfgoVar);
        this.zzb = zzekxVar;
        final zzblj zzbljVarZzg = zzdinVar.zzg();
        this.zzc = new zzcwl() { // from class: com.google.android.gms.internal.ads.zzelj
            @Override // com.google.android.gms.internal.ads.zzcwl
            public final void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzekx zzekxVar2 = zzekxVar;
                zzblj zzbljVar = zzbljVarZzg;
                zzekxVar2.zzbF(zzeVar);
                if (zzbljVar != null) {
                    try {
                        zzbljVar.zzf(zzeVar);
                    } catch (RemoteException e) {
                        zzcaa.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbljVar != null) {
                    try {
                        zzbljVar.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        zzcaa.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zzcwl zza() {
        return this.zzc;
    }

    public final zzcxw zzb() {
        return this.zzb;
    }

    public final zzdgh zzc() {
        return new zzdgh(this.zza, this.zzb.zzg());
    }

    public final zzekx zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zzj(zzbhVar);
    }
}
