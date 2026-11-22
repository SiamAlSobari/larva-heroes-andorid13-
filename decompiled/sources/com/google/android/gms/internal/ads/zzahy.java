package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzahy {
    private zzace zzb;
    private zzabe zzc;
    private zzaht zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzahr zza = new zzahr();
    private zzahv zzj = new zzahv();

    protected abstract long zza(zzfb zzfbVar);

    protected void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzahv();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzfb zzfbVar, long j, zzahv zzahvVar) throws IOException;

    final int zze(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        zzdy.zzb(this.zzb);
        int i = zzfk.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzabcVar)) {
                long jZzf = zzabcVar.zzf();
                long j = this.zzf;
                this.zzk = jZzf - j;
                if (!zzc(this.zza.zza(), j, this.zzj)) {
                    zzam zzamVar = this.zzj.zza;
                    this.zzi = zzamVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzamVar);
                        this.zzm = true;
                    }
                    zzaht zzahtVar = this.zzj.zzb;
                    if (zzahtVar != null) {
                        this.zzd = zzahtVar;
                    } else if (zzabcVar.zzd() == -1) {
                        this.zzd = new zzahx(null);
                    } else {
                        zzahs zzahsVarZzb = this.zza.zzb();
                        this.zzd = new zzahm(this, this.zzf, zzabcVar.zzd(), zzahsVarZzb.zzd + zzahsVarZzb.zze, zzahsVarZzb.zzb, (zzahsVarZzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
                this.zzf = zzabcVar.zzf();
            }
            this.zzh = 3;
            return -1;
        }
        if (i2 == 1) {
            ((zzaar) zzabcVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long jZzd = this.zzd.zzd(zzabcVar);
        if (jZzd >= 0) {
            zzabxVar.zza = jZzd;
            return 1;
        }
        if (jZzd < -1) {
            zzi(-(jZzd + 2));
        }
        if (!this.zzl) {
            zzaca zzacaVarZze = this.zzd.zze();
            zzdy.zzb(zzacaVarZze);
            this.zzc.zzN(zzacaVarZze);
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzabcVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzfb zzfbVarZza = this.zza.zza();
        long jZza = zza(zzfbVarZza);
        if (jZza >= 0) {
            long j2 = this.zzg;
            if (j2 + jZza >= this.zze) {
                long jZzf2 = zzf(j2);
                zzacc.zzb(this.zzb, zzfbVarZza, zzfbVarZza.zzd());
                this.zzb.zzs(jZzf2, 1, zzfbVarZza.zzd(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += jZza;
        return 0;
    }

    protected final long zzf(long j) {
        return (j * 1000000) / ((long) this.zzi);
    }

    protected final long zzg(long j) {
        return (((long) this.zzi) * j) / 1000000;
    }

    final void zzh(zzabe zzabeVar, zzace zzaceVar) {
        this.zzc = zzabeVar;
        this.zzb = zzaceVar;
        zzb(true);
    }

    protected void zzi(long j) {
        this.zzg = j;
    }

    final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzaht zzahtVar = this.zzd;
            int i = zzfk.zza;
            zzahtVar.zzg(this.zze);
            this.zzh = 2;
        }
    }
}
