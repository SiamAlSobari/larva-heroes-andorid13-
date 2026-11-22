package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlg {
    private static final zzts zzt = new zzts(new Object());
    public final zzcw zza;
    public final zzts zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzil zzf;
    public final boolean zzg;
    public final zzvs zzh;
    public final zzxm zzi;
    public final List zzj;
    public final zzts zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzch zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzlg(zzcw zzcwVar, zzts zztsVar, long j, long j2, int i, zzil zzilVar, boolean z, zzvs zzvsVar, zzxm zzxmVar, List list, zzts zztsVar2, boolean z2, int i2, zzch zzchVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzcwVar;
        this.zzb = zztsVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzilVar;
        this.zzg = z;
        this.zzh = zzvsVar;
        this.zzi = zzxmVar;
        this.zzj = list;
        this.zzk = zztsVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzchVar;
        this.zzp = j3;
        this.zzq = j4;
        this.zzr = j5;
        this.zzs = j6;
        this.zzo = z3;
    }

    public static zzlg zzi(zzxm zzxmVar) {
        zzcw zzcwVar = zzcw.zza;
        zzts zztsVar = zzt;
        return new zzlg(zzcwVar, zztsVar, -9223372036854775807L, 0L, 1, null, false, zzvs.zza, zzxmVar, zzfud.zzl(), zztsVar, false, 0, zzch.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzts zzj() {
        return zzt;
    }

    public final long zza() {
        long j;
        long j2;
        if (!zzk()) {
            return this.zzr;
        }
        do {
            j = this.zzs;
            j2 = this.zzr;
        } while (j != this.zzs);
        return zzfk.zzp(zzfk.zzr(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.zzn.zzc)));
    }

    public final zzlg zzb() {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, zza(), SystemClock.elapsedRealtime(), this.zzo);
    }

    public final zzlg zzc(zzts zztsVar) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zztsVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzd(zzts zztsVar, long j, long j2, long j3, long j4, zzvs zzvsVar, zzxm zzxmVar, List list) {
        return new zzlg(this.zza, zztsVar, j2, j3, this.zze, this.zzf, this.zzg, zzvsVar, zzxmVar, list, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, j4, j, SystemClock.elapsedRealtime(), this.zzo);
    }

    public final zzlg zze(boolean z, int i) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzf(zzil zzilVar) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzilVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzg(int i) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzh(zzcw zzcwVar) {
        return new zzlg(zzcwVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final boolean zzk() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}
