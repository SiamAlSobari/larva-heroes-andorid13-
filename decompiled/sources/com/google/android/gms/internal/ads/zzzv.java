package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzv {
    private final Handler zza;
    private final zzzw zzb;

    public zzzv(Handler handler, zzzw zzzwVar) {
        this.zza = zzzwVar == null ? null : handler;
        this.zzb = zzzwVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzr
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzu
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzid zzidVar) {
        zzidVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(zzidVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzid zzidVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(zzidVar);
                }
            });
        }
    }

    public final void zzf(final zzam zzamVar, final zzie zzieVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzs
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzamVar, zzieVar);
                }
            });
        }
    }

    final /* synthetic */ void zzg(String str, long j, long j2) {
        zzzw zzzwVar = this.zzb;
        int i = zzfk.zza;
        zzzwVar.zzo(str, j, j2);
    }

    final /* synthetic */ void zzh(String str) {
        zzzw zzzwVar = this.zzb;
        int i = zzfk.zza;
        zzzwVar.zzp(str);
    }

    final /* synthetic */ void zzi(zzid zzidVar) {
        zzidVar.zza();
        zzzw zzzwVar = this.zzb;
        int i = zzfk.zza;
        zzzwVar.zzq(zzidVar);
    }

    final /* synthetic */ void zzj(int i, long j) {
        zzzw zzzwVar = this.zzb;
        int i2 = zzfk.zza;
        zzzwVar.zzk(i, j);
    }

    final /* synthetic */ void zzk(zzid zzidVar) {
        zzzw zzzwVar = this.zzb;
        int i = zzfk.zza;
        zzzwVar.zzr(zzidVar);
    }

    final /* synthetic */ void zzl(zzam zzamVar, zzie zzieVar) {
        int i = zzfk.zza;
        this.zzb.zzt(zzamVar, zzieVar);
    }

    final /* synthetic */ void zzm(Object obj, long j) {
        zzzw zzzwVar = this.zzb;
        int i = zzfk.zza;
        zzzwVar.zzl(obj, j);
    }

    final /* synthetic */ void zzn(long j, int i) {
        zzzw zzzwVar = this.zzb;
        int i2 = zzfk.zza;
        zzzwVar.zzs(j, i);
    }

    final /* synthetic */ void zzo(Exception exc) {
        zzzw zzzwVar = this.zzb;
        int i = zzfk.zza;
        zzzwVar.zzn(exc);
    }

    final /* synthetic */ void zzp(zzdn zzdnVar) {
        zzzw zzzwVar = this.zzb;
        int i = zzfk.zza;
        zzzwVar.zzu(zzdnVar);
    }

    public final void zzq(final Object obj) {
        if (this.zza != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzm
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzn
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzdn zzdnVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzt
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(zzdnVar);
                }
            });
        }
    }
}
