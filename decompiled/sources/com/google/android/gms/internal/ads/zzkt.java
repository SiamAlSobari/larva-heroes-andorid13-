package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzkt {
    private final zzct zza = new zzct();
    private final zzcv zzb = new zzcv();
    private final zzlx zzc;
    private final zzej zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzkq zzh;
    private zzkq zzi;
    private zzkq zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzkt(zzlx zzlxVar, zzej zzejVar) {
        this.zzc = zzlxVar;
        this.zzd = zzejVar;
    }

    private final boolean zzA(zzcw zzcwVar, zzts zztsVar) {
        if (zzC(zztsVar)) {
            return zzcwVar.zze(zzcwVar.zzn(zztsVar.zza, this.zza).zzd, this.zzb, 0L).zzq == zzcwVar.zza(zztsVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzcw zzcwVar) {
        zzkq zzkqVarZzg = this.zzh;
        if (zzkqVarZzg == null) {
            return true;
        }
        int iZza = zzcwVar.zza(zzkqVarZzg.zzb);
        while (true) {
            iZza = zzcwVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzkqVarZzg.zzg() != null && !zzkqVarZzg.zzf.zzg) {
                zzkqVarZzg = zzkqVarZzg.zzg();
            }
            zzkq zzkqVarZzg2 = zzkqVarZzg.zzg();
            if (iZza == -1 || zzkqVarZzg2 == null || zzcwVar.zza(zzkqVarZzg2.zzb) != iZza) {
                break;
            }
            zzkqVarZzg = zzkqVarZzg2;
        }
        boolean zZzm = zzm(zzkqVarZzg);
        zzkqVarZzg.zzf = zzg(zzcwVar, zzkqVarZzg.zzf);
        return !zZzm;
    }

    private static final boolean zzC(zzts zztsVar) {
        return !zztsVar.zzb() && zztsVar.zze == -1;
    }

    private final long zzs(zzcw zzcwVar, Object obj, int i) {
        zzcwVar.zzn(obj, this.zza);
        this.zza.zzi(i);
        this.zza.zzk(i);
        return 0L;
    }

    private final zzkr zzt(zzcw zzcwVar, zzkq zzkqVar, long j) {
        long j2;
        zzkr zzkrVar = zzkqVar.zzf;
        long jZze = (zzkqVar.zze() + zzkrVar.zze) - j;
        if (zzkrVar.zzg) {
            long j3 = 0;
            int iZzi = zzcwVar.zzi(zzcwVar.zza(zzkrVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (iZzi != -1) {
                int i = zzcwVar.zzd(iZzi, this.zza, true).zzd;
                Object obj = this.zza.zzc;
                obj.getClass();
                long j4 = zzkrVar.zza.zzd;
                if (zzcwVar.zze(i, this.zzb, 0L).zzp == iZzi) {
                    Pair pairZzm = zzcwVar.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm != null) {
                        obj = pairZzm.first;
                        long jLongValue = ((Long) pairZzm.second).longValue();
                        zzkq zzkqVarZzg = zzkqVar.zzg();
                        if (zzkqVarZzg == null || !zzkqVarZzg.zzb.equals(obj)) {
                            j4 = this.zze;
                            this.zze = 1 + j4;
                        } else {
                            j4 = zzkqVarZzg.zzf.zza.zzd;
                        }
                        j2 = jLongValue;
                        j3 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                zzts zztsVarZzx = zzx(zzcwVar, obj, j2, j4, this.zzb, this.zza);
                if (j3 != -9223372036854775807L && zzkrVar.zzc != -9223372036854775807L) {
                    zzcwVar.zzn(zzkrVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzu(zzcwVar, zztsVarZzx, j3, j2);
            }
        } else {
            zzts zztsVar = zzkrVar.zza;
            zzcwVar.zzn(zztsVar.zza, this.zza);
            if (!zztsVar.zzb()) {
                int i2 = zztsVar.zze;
                if (i2 != -1) {
                    this.zza.zzm(i2);
                }
                int iZze = this.zza.zze(zztsVar.zze);
                this.zza.zzn(zztsVar.zze);
                if (iZze != this.zza.zza(zztsVar.zze)) {
                    return zzv(zzcwVar, zztsVar.zza, zztsVar.zze, iZze, zzkrVar.zze, zztsVar.zzd);
                }
                zzs(zzcwVar, zztsVar.zza, zztsVar.zze);
                return zzw(zzcwVar, zztsVar.zza, 0L, zzkrVar.zze, zztsVar.zzd);
            }
            int i3 = zztsVar.zzb;
            if (this.zza.zza(i3) != -1) {
                int iZzf = this.zza.zzf(i3, zztsVar.zzc);
                if (iZzf < 0) {
                    return zzv(zzcwVar, zztsVar.zza, i3, iZzf, zzkrVar.zzc, zztsVar.zzd);
                }
                long jLongValue2 = zzkrVar.zzc;
                if (jLongValue2 == -9223372036854775807L) {
                    zzcv zzcvVar = this.zzb;
                    zzct zzctVar = this.zza;
                    Pair pairZzm2 = zzcwVar.zzm(zzcvVar, zzctVar, zzctVar.zzd, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm2 != null) {
                        jLongValue2 = ((Long) pairZzm2.second).longValue();
                    }
                }
                zzs(zzcwVar, zztsVar.zza, zztsVar.zzb);
                return zzw(zzcwVar, zztsVar.zza, Math.max(0L, jLongValue2), zzkrVar.zzc, zztsVar.zzd);
            }
        }
        return null;
    }

    private final zzkr zzu(zzcw zzcwVar, zzts zztsVar, long j, long j2) {
        zzcwVar.zzn(zztsVar.zza, this.zza);
        return zztsVar.zzb() ? zzv(zzcwVar, zztsVar.zza, zztsVar.zzb, zztsVar.zzc, j, zztsVar.zzd) : zzw(zzcwVar, zztsVar.zza, j2, j, zztsVar.zzd);
    }

    private final zzkr zzv(zzcw zzcwVar, Object obj, int i, int i2, long j, long j2) {
        zzts zztsVar = new zzts(obj, i, i2, j2);
        long jZzh = zzcwVar.zzn(zztsVar.zza, this.zza).zzh(zztsVar.zzb, zztsVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzj();
        }
        this.zza.zzn(zztsVar.zzb);
        long jMax = 0;
        if (jZzh != -9223372036854775807L && jZzh <= 0) {
            jMax = Math.max(0L, (-1) + jZzh);
        }
        return new zzkr(zztsVar, jMax, j, -9223372036854775807L, jZzh, false, false, false, false);
    }

    private final zzkr zzw(zzcw zzcwVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long jMax = j;
        zzcwVar.zzn(obj, this.zza);
        int iZzc = this.zza.zzc(jMax);
        if (iZzc != -1) {
            this.zza.zzm(iZzc);
        }
        if (iZzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzn(iZzc);
        }
        zzts zztsVar = new zzts(obj, j3, iZzc);
        boolean zZzC = zzC(zztsVar);
        boolean zZzA = zzA(zzcwVar, zztsVar);
        boolean zZzz = zzz(zzcwVar, zztsVar, zZzC);
        if (iZzc != -1) {
            this.zza.zzn(iZzc);
        }
        if (iZzc != -1) {
            this.zza.zzi(iZzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j5 = 0;
            j6 = 0;
        } else {
            j5 = j4;
            j6 = this.zza.zze;
        }
        if (j6 != -9223372036854775807L && jMax >= j6) {
            jMax = Math.max(0L, j6 - 1);
        }
        return new zzkr(zztsVar, jMax, j2, j5, j6, false, zZzC, zZzA, zZzz);
    }

    private static zzts zzx(zzcw zzcwVar, Object obj, long j, long j2, zzcv zzcvVar, zzct zzctVar) {
        zzcwVar.zzn(obj, zzctVar);
        zzcwVar.zze(zzctVar.zzd, zzcvVar, 0L);
        zzcwVar.zza(obj);
        zzctVar.zzb();
        zzcwVar.zzn(obj, zzctVar);
        int iZzd = zzctVar.zzd(j);
        return iZzd == -1 ? new zzts(obj, j2, zzctVar.zzc(j)) : new zzts(obj, iZzd, zzctVar.zze(iZzd), j2);
    }

    private final void zzy() {
        final zzfua zzfuaVar = new zzfua();
        for (zzkq zzkqVarZzg = this.zzh; zzkqVarZzg != null; zzkqVarZzg = zzkqVarZzg.zzg()) {
            zzfuaVar.zzf(zzkqVarZzg.zzf.zza);
        }
        zzkq zzkqVar = this.zzi;
        final zzts zztsVar = zzkqVar == null ? null : zzkqVar.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzks
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(zzfuaVar, zztsVar);
            }
        });
    }

    private final boolean zzz(zzcw zzcwVar, zzts zztsVar, boolean z) {
        int iZza = zzcwVar.zza(zztsVar.zza);
        return !zzcwVar.zze(zzcwVar.zzd(iZza, this.zza, false).zzd, this.zzb, 0L).zzj && zzcwVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    public final zzkq zza() {
        zzkq zzkqVar = this.zzh;
        if (zzkqVar == null) {
            return null;
        }
        if (zzkqVar == this.zzi) {
            this.zzi = zzkqVar.zzg();
        }
        zzkqVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzkq zzkqVar2 = this.zzh;
            this.zzl = zzkqVar2.zzb;
            this.zzm = zzkqVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzkq zzb() {
        zzkq zzkqVar = this.zzi;
        boolean z = false;
        if (zzkqVar != null && zzkqVar.zzg() != null) {
            z = true;
        }
        zzdy.zzf(z);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzkq zzc() {
        return this.zzj;
    }

    public final zzkq zzd() {
        return this.zzh;
    }

    public final zzkq zze() {
        return this.zzi;
    }

    public final zzkr zzf(long j, zzlg zzlgVar) {
        zzkq zzkqVar = this.zzj;
        return zzkqVar == null ? zzu(zzlgVar.zza, zzlgVar.zzb, zzlgVar.zzc, zzlgVar.zzr) : zzt(zzlgVar.zza, zzkqVar, j);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final zzkr zzg(zzcw zzcwVar, zzkr zzkrVar) {
        long j;
        long jZzh;
        long j2;
        long j3;
        int i;
        int i2;
        zzts zztsVar = zzkrVar.zza;
        boolean zZzC = zzC(zztsVar);
        boolean zZzA = zzA(zzcwVar, zztsVar);
        boolean zZzz = zzz(zzcwVar, zztsVar, zZzC);
        zzcwVar.zzn(zzkrVar.zza.zza, this.zza);
        if (zztsVar.zzb() || (i2 = zztsVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            this.zza.zzi(i2);
            j = 0;
        }
        if (!zztsVar.zzb()) {
            if (j != -9223372036854775807L) {
                j2 = 0;
                j3 = 0;
            } else {
                jZzh = this.zza.zze;
            }
            if (zztsVar.zzb()) {
                this.zza.zzn(zztsVar.zzb);
            } else {
                i = zztsVar.zze;
                if (i != -1) {
                    this.zza.zzn(i);
                }
            }
            return new zzkr(zztsVar, zzkrVar.zzb, zzkrVar.zzc, j2, j3, false, zZzC, zZzA, zZzz);
        }
        jZzh = this.zza.zzh(zztsVar.zzb, zztsVar.zzc);
        j2 = j;
        j3 = jZzh;
        if (zztsVar.zzb()) {
            this.zza.zzn(zztsVar.zzb);
        } else {
            i = zztsVar.zze;
            if (i != -1) {
                this.zza.zzn(i);
            }
        }
        return new zzkr(zztsVar, zzkrVar.zzb, zzkrVar.zzc, j2, j3, false, zZzC, zZzA, zZzz);
    }

    public final zzts zzh(zzcw zzcwVar, Object obj, long j) {
        long j2;
        int iZza;
        int i = zzcwVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (iZza = zzcwVar.zza(obj2)) == -1 || zzcwVar.zzd(iZza, this.zza, false).zzd != i) {
            zzkq zzkqVarZzg = this.zzh;
            while (true) {
                if (zzkqVarZzg == null) {
                    zzkq zzkqVarZzg2 = this.zzh;
                    while (true) {
                        if (zzkqVarZzg2 != null) {
                            int iZza2 = zzcwVar.zza(zzkqVarZzg2.zzb);
                            if (iZza2 != -1 && zzcwVar.zzd(iZza2, this.zza, false).zzd == i) {
                                j2 = zzkqVarZzg2.zzf.zza.zzd;
                                break;
                            }
                            zzkqVarZzg2 = zzkqVarZzg2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh != null) {
                                break;
                            }
                            this.zzl = obj;
                            this.zzm = j2;
                            break;
                        }
                    }
                } else {
                    if (zzkqVarZzg.zzb.equals(obj)) {
                        j2 = zzkqVarZzg.zzf.zza.zzd;
                        break;
                    }
                    zzkqVarZzg = zzkqVarZzg.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzcwVar.zzn(obj, this.zza);
        zzcwVar.zze(this.zza.zzd, this.zzb, 0L);
        int iZza3 = zzcwVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcv zzcvVar = this.zzb;
            if (iZza3 < zzcvVar.zzp) {
                return zzx(zzcwVar, obj3, j, j3, zzcvVar, this.zza);
            }
            zzcwVar.zzd(iZza3, this.zza, true);
            this.zza.zzb();
            zzct zzctVar = this.zza;
            if (zzctVar.zzd(zzctVar.zze) != -1) {
                obj3 = this.zza.zzc;
                obj3.getClass();
            }
            iZza3--;
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzkq zzkqVarZzg = this.zzh;
        zzdy.zzb(zzkqVarZzg);
        this.zzl = zzkqVarZzg.zzb;
        this.zzm = zzkqVarZzg.zzf.zza.zzd;
        while (zzkqVarZzg != null) {
            zzkqVarZzg.zzn();
            zzkqVarZzg = zzkqVarZzg.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    final /* synthetic */ void zzj(zzfua zzfuaVar, zzts zztsVar) {
        this.zzc.zzQ(zzfuaVar.zzi(), zztsVar);
    }

    public final void zzk(long j) {
        zzkq zzkqVar = this.zzj;
        if (zzkqVar != null) {
            zzkqVar.zzm(j);
        }
    }

    public final boolean zzl(zztq zztqVar) {
        zzkq zzkqVar = this.zzj;
        return zzkqVar != null && zzkqVar.zza == zztqVar;
    }

    public final boolean zzm(zzkq zzkqVar) {
        boolean z = false;
        zzdy.zzf(zzkqVar != null);
        if (zzkqVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzkqVar;
        while (zzkqVar.zzg() != null) {
            zzkqVar = zzkqVar.zzg();
            if (zzkqVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzkqVar.zzn();
            this.zzk--;
        }
        this.zzj.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzkq zzkqVar = this.zzj;
        if (zzkqVar != null) {
            return !zzkqVar.zzf.zzi && zzkqVar.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    public final boolean zzo(zzcw zzcwVar, long j, long j2) {
        zzkr zzkrVarZzg;
        boolean z;
        zzkq zzkqVar = null;
        for (zzkq zzkqVarZzg = this.zzh; zzkqVarZzg != null; zzkqVarZzg = zzkqVarZzg.zzg()) {
            zzkr zzkrVar = zzkqVarZzg.zzf;
            if (zzkqVar == null) {
                zzkrVarZzg = zzg(zzcwVar, zzkrVar);
            } else {
                zzkr zzkrVarZzt = zzt(zzcwVar, zzkqVar, j);
                if (zzkrVarZzt == null) {
                    return !zzm(zzkqVar);
                }
                if (zzkrVar.zzb != zzkrVarZzt.zzb || !zzkrVar.zza.equals(zzkrVarZzt.zza)) {
                    return !zzm(zzkqVar);
                }
                zzkrVarZzg = zzkrVarZzt;
            }
            zzkqVarZzg.zzf = zzkrVarZzg.zza(zzkrVar.zzc);
            long j3 = zzkrVar.zze;
            long j4 = zzkrVarZzg.zze;
            if (j3 != -9223372036854775807L && j3 != j4) {
                zzkqVarZzg.zzq();
                long j5 = zzkrVarZzg.zze;
                long jZze = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + zzkqVarZzg.zze();
                if (zzkqVarZzg == this.zzi) {
                    boolean z2 = zzkqVarZzg.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= jZze) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return (zzm(zzkqVarZzg) || z) ? false : true;
            }
            zzkqVar = zzkqVarZzg;
        }
        return true;
    }

    public final boolean zzp(zzcw zzcwVar, int i) {
        this.zzf = i;
        return zzB(zzcwVar);
    }

    public final boolean zzq(zzcw zzcwVar, boolean z) {
        this.zzg = z;
        return zzB(zzcwVar);
    }

    public final zzkq zzr(zzlp[] zzlpVarArr, zzxl zzxlVar, zzxu zzxuVar, zzlf zzlfVar, zzkr zzkrVar, zzxm zzxmVar) {
        zzkq zzkqVar = this.zzj;
        zzkq zzkqVar2 = new zzkq(zzlpVarArr, zzkqVar == null ? 1000000000000L : (zzkqVar.zze() + zzkqVar.zzf.zze) - zzkrVar.zzb, zzxlVar, zzxuVar, zzlfVar, zzkrVar, zzxmVar);
        zzkq zzkqVar3 = this.zzj;
        if (zzkqVar3 != null) {
            zzkqVar3.zzo(zzkqVar2);
        } else {
            this.zzh = zzkqVar2;
            this.zzi = zzkqVar2;
        }
        this.zzl = null;
        this.zzj = zzkqVar2;
        this.zzk++;
        zzy();
        return zzkqVar2;
    }
}
