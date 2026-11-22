package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzaan {
    protected final zzaah zza;
    protected final zzaam zzb;
    protected zzaaj zzc;
    private final int zzd;

    protected zzaan(zzaak zzaakVar, zzaam zzaamVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzaamVar;
        this.zzd = i;
        this.zza = new zzaah(zzaakVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzabc zzabcVar, long j, zzabx zzabxVar) {
        if (j == zzabcVar.zzf()) {
            return 0;
        }
        zzabxVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzabc zzabcVar, long j) throws IOException {
        long jZzf = j - zzabcVar.zzf();
        if (jZzf < 0 || jZzf > 262144) {
            return false;
        }
        ((zzaar) zzabcVar).zzo((int) jZzf, false);
        return true;
    }

    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        while (true) {
            zzaaj zzaajVar = this.zzc;
            zzdy.zzb(zzaajVar);
            long j = zzaajVar.zzf;
            long j2 = zzaajVar.zzg - j;
            long j3 = zzaajVar.zzh;
            if (j2 <= this.zzd) {
                zzc(false, j);
                return zzf(zzabcVar, j, zzabxVar);
            }
            if (!zzg(zzabcVar, j3)) {
                return zzf(zzabcVar, j3, zzabxVar);
            }
            zzabcVar.zzj();
            zzaal zzaalVarZza = this.zzb.zza(zzabcVar, zzaajVar.zzb);
            int i = zzaalVarZza.zzb;
            if (i == -3) {
                zzc(false, j3);
                return zzf(zzabcVar, j3, zzabxVar);
            }
            if (i == -2) {
                zzaaj.zzh(zzaajVar, zzaalVarZza.zzc, zzaalVarZza.zzd);
            } else {
                if (i != -1) {
                    zzg(zzabcVar, zzaalVarZza.zzd);
                    zzc(true, zzaalVarZza.zzd);
                    return zzf(zzabcVar, zzaalVarZza.zzd, zzabxVar);
                }
                zzaaj.zzg(zzaajVar, zzaalVarZza.zzc, zzaalVarZza.zzd);
            }
        }
    }

    public final zzaca zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        zzaaj zzaajVar = this.zzc;
        if (zzaajVar == null || zzaajVar.zza != j) {
            long jZzf = this.zza.zzf(j);
            zzaah zzaahVar = this.zza;
            this.zzc = new zzaaj(j, jZzf, 0L, zzaahVar.zzc, zzaahVar.zzd, zzaahVar.zze, zzaahVar.zzf);
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
