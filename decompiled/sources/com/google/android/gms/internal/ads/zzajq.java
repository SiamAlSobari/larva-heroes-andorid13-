package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzajq implements zzaam {
    private final zzfi zza;
    private final zzfb zzb = new zzfb();
    private final int zzc;

    public zzajq(int i, zzfi zzfiVar, int i2) {
        this.zzc = i;
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaal zza(zzabc zzabcVar, long j) throws IOException {
        int iZza;
        int iZza2;
        long j2;
        long jZzf = zzabcVar.zzf();
        int iMin = (int) Math.min(112800L, zzabcVar.zzd() - jZzf);
        this.zzb.zzD(iMin);
        ((zzaar) zzabcVar).zzm(this.zzb.zzI(), 0, iMin, false);
        zzfb zzfbVar = this.zzb;
        int iZzd = zzfbVar.zzd();
        long j3 = -1;
        long j4 = -9223372036854775807L;
        long j5 = -1;
        while (zzfbVar.zza() >= 188 && (iZza2 = (iZza = zzakc.zza(zzfbVar.zzI(), zzfbVar.zzc(), iZzd)) + 188) <= iZzd) {
            long jZzb = zzakc.zzb(zzfbVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZzb2 = this.zza.zzb(jZzb);
                if (jZzb2 > j) {
                    if (j4 == -9223372036854775807L) {
                        return zzaal.zzd(jZzb2, jZzf);
                    }
                    j2 = jZzf + j5;
                } else if (100000 + jZzb2 > j) {
                    j2 = jZzf + ((long) iZza);
                } else {
                    j5 = iZza;
                    j4 = jZzb2;
                }
                return zzaal.zze(j2);
            }
            zzfbVar.zzG(iZza2);
            j3 = iZza2;
        }
        return j4 != -9223372036854775807L ? zzaal.zzf(j4, jZzf + j3) : zzaal.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzb() {
        zzfb zzfbVar = this.zzb;
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        zzfbVar.zzE(bArr, 0);
    }
}
