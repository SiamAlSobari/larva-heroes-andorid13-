package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxj {
    final /* synthetic */ zzaxk zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzaxj(zzaxk zzaxkVar, byte[] bArr, zzaxi zzaxiVar) {
        this.zza = zzaxkVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzaxk zzaxkVar = this.zza;
            if (zzaxkVar.zzb) {
                zzaxkVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzcaa.zzf("Clearcut log failed", e);
        }
    }

    public final zzaxj zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        this.zza.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaxh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }
}
