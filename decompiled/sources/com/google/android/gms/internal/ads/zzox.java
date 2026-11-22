package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzox {
    private final Handler zza;
    private final zzoy zzb;

    public zzox(Handler handler, zzoy zzoyVar) {
        this.zza = zzoyVar == null ? null : handler;
        this.zzb = zzoyVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzon
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzot
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(exc);
                }
            });
        }
    }

    public final void zzc(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzos
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(str, j, j2);
                }
            });
        }
    }

    public final void zzd(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(str);
                }
            });
        }
    }

    public final void zze(final zzid zzidVar) {
        zzidVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzidVar);
                }
            });
        }
    }

    public final void zzf(final zzid zzidVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzop
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(zzidVar);
                }
            });
        }
    }

    public final void zzg(final zzam zzamVar, final zzie zzieVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzov
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(zzamVar, zzieVar);
                }
            });
        }
    }

    final /* synthetic */ void zzh(Exception exc) {
        zzoy zzoyVar = this.zzb;
        int i = zzfk.zza;
        zzoyVar.zzb(exc);
    }

    final /* synthetic */ void zzi(Exception exc) {
        zzoy zzoyVar = this.zzb;
        int i = zzfk.zza;
        zzoyVar.zzi(exc);
    }

    final /* synthetic */ void zzj(String str, long j, long j2) {
        zzoy zzoyVar = this.zzb;
        int i = zzfk.zza;
        zzoyVar.zzc(str, j, j2);
    }

    final /* synthetic */ void zzk(String str) {
        zzoy zzoyVar = this.zzb;
        int i = zzfk.zza;
        zzoyVar.zzd(str);
    }

    final /* synthetic */ void zzl(zzid zzidVar) {
        zzidVar.zza();
        zzoy zzoyVar = this.zzb;
        int i = zzfk.zza;
        zzoyVar.zze(zzidVar);
    }

    final /* synthetic */ void zzm(zzid zzidVar) {
        zzoy zzoyVar = this.zzb;
        int i = zzfk.zza;
        zzoyVar.zzf(zzidVar);
    }

    final /* synthetic */ void zzn(zzam zzamVar, zzie zzieVar) {
        int i = zzfk.zza;
        this.zzb.zzg(zzamVar, zzieVar);
    }

    final /* synthetic */ void zzo(long j) {
        zzoy zzoyVar = this.zzb;
        int i = zzfk.zza;
        zzoyVar.zzh(j);
    }

    final /* synthetic */ void zzp(boolean z) {
        zzoy zzoyVar = this.zzb;
        int i = zzfk.zza;
        zzoyVar.zzm(z);
    }

    final /* synthetic */ void zzq(int i, long j, long j2) {
        zzoy zzoyVar = this.zzb;
        int i2 = zzfk.zza;
        zzoyVar.zzj(i, j, j2);
    }

    public final void zzr(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(j);
                }
            });
        }
    }

    public final void zzs(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(z);
                }
            });
        }
    }

    public final void zzt(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzow
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(i, j, j2);
                }
            });
        }
    }
}
