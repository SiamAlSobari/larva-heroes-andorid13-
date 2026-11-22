package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzkq {
    public final zztq zza;
    public final Object zzb;
    public boolean zzd;
    public boolean zze;
    public zzkr zzf;
    public boolean zzg;
    private final zzlp[] zzi;
    private final zzxl zzj;
    private final zzlf zzk;
    private zzkq zzl;
    private zzxm zzn;
    private long zzo;
    private zzvs zzm = zzvs.zza;
    public final zzvj[] zzc = new zzvj[2];
    private final boolean[] zzh = new boolean[2];

    public zzkq(zzlp[] zzlpVarArr, long j, zzxl zzxlVar, zzxu zzxuVar, zzlf zzlfVar, zzkr zzkrVar, zzxm zzxmVar) {
        this.zzi = zzlpVarArr;
        this.zzo = j;
        this.zzj = zzxlVar;
        this.zzk = zzlfVar;
        this.zzb = zzkrVar.zza.zza;
        this.zzf = zzkrVar;
        this.zzn = zzxmVar;
        zzts zztsVar = zzkrVar.zza;
        long j2 = zzkrVar.zzb;
        long j3 = zzkrVar.zzd;
        zztq zztqVarZzp = zzlfVar.zzp(zztsVar, zzxuVar, j2);
        this.zza = j3 != -9223372036854775807L ? new zzsx(zztqVarZzp, true, 0L, j3) : zztqVarZzp;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzxm zzxmVar = this.zzn;
            if (i >= zzxmVar.zza) {
                return;
            }
            zzxmVar.zzb(i);
            zzxf zzxfVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzxm zzxmVar = this.zzn;
            if (i >= zzxmVar.zza) {
                return;
            }
            zzxmVar.zzb(i);
            zzxf zzxfVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzxm zzxmVar, long j, boolean z) {
        return zzb(zzxmVar, j, false, new boolean[2]);
    }

    public final long zzb(zzxm zzxmVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzxmVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzxmVar.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzlpVarArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzxmVar;
        zzt();
        long jZzf = this.zza.zzf(zzxmVar.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzlp[] zzlpVarArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzlpVarArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zzvj[] zzvjVarArr = this.zzc;
            if (i4 >= 2) {
                return jZzf;
            }
            if (zzvjVarArr[i4] != null) {
                zzdy.zzf(zzxmVar.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzdy.zzf(zzxmVar.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long jZzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzf.zze : jZzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzkq zzg() {
        return this.zzl;
    }

    public final zzvs zzh() {
        return this.zzm;
    }

    public final zzxm zzi() {
        return this.zzn;
    }

    public final zzxm zzj(float f, zzcw zzcwVar) throws zzil {
        zzxm zzxmVarZzo = this.zzj.zzo(this.zzi, this.zzm, this.zzf.zza, zzcwVar);
        for (zzxf zzxfVar : zzxmVarZzo.zzc) {
        }
        return zzxmVarZzo;
    }

    public final void zzk(long j) {
        zzdy.zzf(zzu());
        this.zza.zzo(j - this.zzo);
    }

    public final void zzl(float f, zzcw zzcwVar) throws zzil {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzxm zzxmVarZzj = zzj(f, zzcwVar);
        zzkr zzkrVar = this.zzf;
        long jMax = zzkrVar.zzb;
        long j = zzkrVar.zze;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jZza = zza(zzxmVarZzj, jMax, false);
        long j2 = this.zzo;
        zzkr zzkrVar2 = this.zzf;
        this.zzo = j2 + (zzkrVar2.zzb - jZza);
        this.zzf = zzkrVar2.zzb(jZza);
    }

    public final void zzm(long j) {
        zzdy.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzlf zzlfVar = this.zzk;
        zztq zztqVar = this.zza;
        try {
            if (zztqVar instanceof zzsx) {
                zzlfVar.zzi(((zzsx) zztqVar).zza);
            } else {
                zzlfVar.zzi(zztqVar);
            }
        } catch (RuntimeException e) {
            zzes.zzd("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzkq zzkqVar) {
        if (zzkqVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzkqVar;
        zzt();
    }

    public final void zzp(long j) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zztq zztqVar = this.zza;
        if (zztqVar instanceof zzsx) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzsx) zztqVar).zzn(0L, j);
        }
    }

    public final boolean zzr() {
        if (this.zzd) {
            return !this.zze || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }
}
