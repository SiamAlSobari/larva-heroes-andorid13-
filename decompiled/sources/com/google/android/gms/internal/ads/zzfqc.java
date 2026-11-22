package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfqc extends zzfpy {
    final /* synthetic */ zzfqi zza;

    zzfqc(zzfqi zzfqiVar) {
        this.zza = zzfqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpy
    public final void zza() {
        synchronized (this.zza.zzg) {
            if (this.zza.zzl.get() > 0 && this.zza.zzl.decrementAndGet() > 0) {
                this.zza.zzc.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzfqi zzfqiVar = this.zza;
            if (zzfqiVar.zzn != null) {
                zzfqiVar.zzc.zzc("Unbind from service.", new Object[0]);
                zzfqi zzfqiVar2 = this.zza;
                zzfqiVar2.zzb.unbindService(zzfqiVar2.zzm);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
