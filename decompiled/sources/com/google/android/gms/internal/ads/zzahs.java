package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzahs {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzfb zzg = new zzfb(255);

    zzahs() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzabc zzabcVar, boolean z) throws IOException {
        zza();
        this.zzg.zzD(27);
        if (zzabf.zzc(zzabcVar, this.zzg.zzI(), 0, 27, z) && this.zzg.zzt() == 1332176723) {
            if (this.zzg.zzl() != 0) {
                if (z) {
                    return false;
                }
                throw zzcd.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzl();
            this.zzb = this.zzg.zzq();
            this.zzg.zzr();
            this.zzg.zzr();
            this.zzg.zzr();
            int iZzl = this.zzg.zzl();
            this.zzc = iZzl;
            this.zzd = iZzl + 27;
            this.zzg.zzD(iZzl);
            if (zzabf.zzc(zzabcVar, this.zzg.zzI(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzl();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzabc zzabcVar, long j) throws IOException {
        zzdy.zzd(zzabcVar.zzf() == zzabcVar.zze());
        this.zzg.zzD(4);
        while (true) {
            if ((j != -1 && zzabcVar.zzf() + 4 >= j) || !zzabf.zzc(zzabcVar, this.zzg.zzI(), 0, 4, true)) {
                break;
            }
            this.zzg.zzG(0);
            if (this.zzg.zzt() == 1332176723) {
                zzabcVar.zzj();
                return true;
            }
            ((zzaar) zzabcVar).zzo(1, false);
        }
        do {
            if (j != -1 && zzabcVar.zzf() >= j) {
                break;
            }
        } while (zzabcVar.zzc(1) != -1);
        return false;
    }
}
