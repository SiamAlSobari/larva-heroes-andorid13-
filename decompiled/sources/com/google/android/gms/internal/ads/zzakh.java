package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakh implements zzakg {
    private final zzabe zza;
    private final zzace zzb;
    private final zzakj zzc;
    private final zzam zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzakh(zzabe zzabeVar, zzace zzaceVar, zzakj zzakjVar, String str, int i) throws zzcd {
        this.zza = zzabeVar;
        this.zzb = zzaceVar;
        this.zzc = zzakjVar;
        int i2 = zzakjVar.zzb * zzakjVar.zze;
        int i3 = zzakjVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzcd.zza("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = zzakjVar.zzc * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.zze = iMax;
        zzak zzakVar = new zzak();
        zzakVar.zzS(str);
        zzakVar.zzv(i6);
        zzakVar.zzO(i6);
        zzakVar.zzL(iMax);
        zzakVar.zzw(zzakjVar.zzb);
        zzakVar.zzT(zzakjVar.zzc);
        zzakVar.zzN(i);
        this.zzd = zzakVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zza(int i, long j) {
        this.zza.zzN(new zzakm(this.zzc, 1, i, j));
        this.zzb.zzk(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final boolean zzc(zzabc zzabcVar, long j) throws IOException {
        long j2;
        int i;
        int i2;
        long j3 = j;
        while (j3 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int iZza = zzacc.zza(this.zzb, zzabcVar, (int) Math.min(i2 - i, j3), true);
            if (iZza == -1) {
                j3 = 0;
            } else {
                this.zzg += iZza;
                j3 -= (long) iZza;
            }
        }
        zzakj zzakjVar = this.zzc;
        int i3 = zzakjVar.zzd;
        int i4 = this.zzg / i3;
        if (i4 > 0) {
            long jZzq = this.zzf + zzfk.zzq(this.zzh, 1000000L, zzakjVar.zzc);
            int i5 = i4 * i3;
            int i6 = this.zzg - i5;
            this.zzb.zzs(jZzq, 1, i5, i6, null);
            this.zzh += (long) i4;
            this.zzg = i6;
            j2 = 0;
        } else {
            j2 = 0;
        }
        return j3 <= j2;
    }
}
