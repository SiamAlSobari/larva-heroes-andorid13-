package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsx implements zztq, zztp {
    public final zztq zza;
    long zzb;
    private zztp zzc;
    private zzsw[] zzd = new zzsw[0];
    private long zze = 0;

    public zzsx(zztq zztqVar, boolean z, long j, long j2) {
        this.zza = zztqVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zza(long j, zzlr zzlrVar) {
        if (j == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(zzlrVar.zzf, j));
        long j2 = zzlrVar.zzg;
        long j3 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j));
        if (jMax != zzlrVar.zzf || jMax2 != zzlrVar.zzg) {
            zzlrVar = new zzlr(jMax, jMax2);
        }
        return this.zza.zza(j, zzlrVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzb < j) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzc < j) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j;
        }
        long jZzd2 = this.zza.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        zzdy.zzf(jZzd2 >= 0);
        long j2 = this.zzb;
        zzdy.zzf(j2 == Long.MIN_VALUE || jZzd2 <= j2);
        return jZzd2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.zztq
    public final long zze(long j) {
        this.zze = -9223372036854775807L;
        boolean z = false;
        for (zzsw zzswVar : this.zzd) {
            if (zzswVar != null) {
                zzswVar.zzc();
            }
        }
        long jZze = this.zza.zze(j);
        if (jZze == j) {
            z = true;
        } else if (jZze >= 0) {
            long j2 = this.zzb;
            if (j2 == Long.MIN_VALUE || jZze <= j2) {
                z = true;
            }
        }
        zzdy.zzf(z);
        return jZze;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] zzxfVarArr, boolean[] zArr, zzvj[] zzvjVarArr, boolean[] zArr2, long j) {
        int length = zzvjVarArr.length;
        this.zzd = new zzsw[length];
        zzvj[] zzvjVarArr2 = new zzvj[length];
        int i = 0;
        while (true) {
            zzvj zzvjVar = null;
            if (i >= zzvjVarArr.length) {
                break;
            }
            zzsw[] zzswVarArr = this.zzd;
            zzsw zzswVar = (zzsw) zzvjVarArr[i];
            zzswVarArr[i] = zzswVar;
            if (zzswVar != null) {
                zzvjVar = zzswVar.zza;
            }
            zzvjVarArr2[i] = zzvjVar;
            i++;
        }
        long jZzf = this.zza.zzf(zzxfVarArr, zArr, zzvjVarArr2, zArr2, j);
        long j2 = (zzq() && j == 0) ? 0L : j;
        this.zze = -9223372036854775807L;
        boolean z = true;
        if (jZzf != j2) {
            if (jZzf >= 0) {
                long j3 = this.zzb;
                if (j3 != Long.MIN_VALUE && jZzf > j3) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        zzdy.zzf(z);
        for (int i2 = 0; i2 < zzvjVarArr.length; i2++) {
            zzvj zzvjVar2 = zzvjVarArr2[i2];
            if (zzvjVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzsw[] zzswVarArr2 = this.zzd;
                zzsw zzswVar2 = zzswVarArr2[i2];
                if (zzswVar2 == null || zzswVar2.zza != zzvjVar2) {
                    zzswVarArr2[i2] = new zzsw(this, zzvjVar2);
                }
            }
            zzvjVarArr[i2] = this.zzd[i2];
        }
        return jZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final /* bridge */ /* synthetic */ void zzg(zzvl zzvlVar) {
        zztp zztpVar = this.zzc;
        zztpVar.getClass();
        zztpVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztpVar, long j) {
        this.zzc = zztpVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j) {
        return this.zza.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        return this.zza.zzp();
    }

    final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztqVar) {
        zztp zztpVar = this.zzc;
        zztpVar.getClass();
        zztpVar.zzi(this);
    }
}
