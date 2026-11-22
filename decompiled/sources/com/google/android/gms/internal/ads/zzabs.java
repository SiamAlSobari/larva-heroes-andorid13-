package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabs {
    private final zzfb zza = new zzfb(10);

    public final zzbz zza(zzabc zzabcVar, zzaep zzaepVar) throws Throwable {
        zzbz zzbzVarZza = null;
        int i = 0;
        while (true) {
            try {
                ((zzaar) zzabcVar).zzm(this.zza.zzI(), 0, 10, false);
                this.zza.zzG(0);
                if (this.zza.zzn() != 4801587) {
                    break;
                }
                this.zza.zzH(3);
                int iZzk = this.zza.zzk();
                int i2 = iZzk + 10;
                if (zzbzVarZza == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzI(), 0, bArr, 0, 10);
                    ((zzaar) zzabcVar).zzm(bArr, 10, iZzk, false);
                    zzbzVarZza = zzaer.zza(bArr, i2, zzaepVar, new zzads());
                } else {
                    ((zzaar) zzabcVar).zzl(iZzk, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzabcVar.zzj();
        ((zzaar) zzabcVar).zzl(i, false);
        return zzbzVarZza;
    }
}
