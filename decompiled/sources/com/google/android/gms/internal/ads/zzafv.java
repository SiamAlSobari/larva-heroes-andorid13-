package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafv {
    private final zzfb zza = new zzfb(8);
    private int zzb;

    private final long zzb(zzabc zzabcVar) throws IOException {
        zzaar zzaarVar = (zzaar) zzabcVar;
        int i = 0;
        zzaarVar.zzm(this.zza.zzI(), 0, 1, false);
        int i2 = this.zza.zzI()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ (-1));
        zzaarVar.zzm(this.zza.zzI(), 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.zza.zzI()[i] & 255) + (i5 << 8);
        }
        this.zzb += i4 + 1;
        return i5;
    }

    public final boolean zza(zzabc zzabcVar) throws IOException {
        long jZzd = zzabcVar.zzd();
        long j = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j = jZzd;
        }
        zzaar zzaarVar = (zzaar) zzabcVar;
        zzaarVar.zzm(this.zza.zzI(), 0, 4, false);
        long jZzt = this.zza.zzt();
        this.zzb = 4;
        while (jZzt != 440786851) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzaarVar.zzm(this.zza.zzI(), 0, 1, false);
            jZzt = ((jZzt << 8) & (-256)) | ((long) (this.zza.zzI()[0] & 255));
        }
        long jZzb = zzb(zzabcVar);
        long j2 = this.zzb;
        if (jZzb != Long.MIN_VALUE && (jZzd == -1 || j2 + jZzb < jZzd)) {
            while (true) {
                long j3 = this.zzb;
                long j4 = j2 + jZzb;
                if (j3 < j4) {
                    if (zzb(zzabcVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jZzb2 = zzb(zzabcVar);
                    if (jZzb2 < 0) {
                        return false;
                    }
                    if (jZzb2 != 0) {
                        int i3 = (int) jZzb2;
                        zzaarVar.zzl(i3, false);
                        this.zzb += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }
}
