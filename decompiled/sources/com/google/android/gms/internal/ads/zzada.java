package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzada implements zzaam {
    private final zzabo zza;
    private final int zzb;
    private final zzabj zzc = new zzabj();

    /* synthetic */ zzada(zzabo zzaboVar, int i, zzacz zzaczVar) {
        this.zza = zzaboVar;
        this.zzb = i;
    }

    private final long zzc(zzabc zzabcVar) throws IOException {
        while (zzabcVar.zze() < zzabcVar.zzd() - 6) {
            zzabo zzaboVar = this.zza;
            int i = this.zzb;
            zzabj zzabjVar = this.zzc;
            long jZze = zzabcVar.zze();
            byte[] bArr = new byte[2];
            zzaar zzaarVar = (zzaar) zzabcVar;
            zzaarVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzabcVar.zzj();
                zzaarVar.zzl((int) (jZze - zzabcVar.zzf()), false);
            } else {
                zzfb zzfbVar = new zzfb(16);
                System.arraycopy(bArr, 0, zzfbVar.zzI(), 0, 2);
                zzfbVar.zzF(zzabf.zza(zzabcVar, zzfbVar.zzI(), 2, 14));
                zzabcVar.zzj();
                zzaarVar.zzl((int) (jZze - zzabcVar.zzf()), false);
                if (zzabk.zzc(zzfbVar, zzaboVar, i, zzabjVar)) {
                    break;
                }
            }
            zzaarVar.zzl(1, false);
        }
        if (zzabcVar.zze() < zzabcVar.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzaar) zzabcVar).zzl((int) (zzabcVar.zzd() - zzabcVar.zze()), false);
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaal zza(zzabc zzabcVar, long j) throws IOException {
        long jZzf = zzabcVar.zzf();
        long jZzc = zzc(zzabcVar);
        long jZze = zzabcVar.zze();
        ((zzaar) zzabcVar).zzl(Math.max(6, this.zza.zzc), false);
        long jZzc2 = zzc(zzabcVar);
        long jZze2 = zzabcVar.zze();
        if (jZzc > j || jZzc2 <= j) {
            return jZzc2 <= j ? zzaal.zzf(jZzc2, jZze2) : zzaal.zzd(jZzc, jZzf);
        }
        return zzaal.zze(jZze);
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final /* synthetic */ void zzb() {
    }
}
