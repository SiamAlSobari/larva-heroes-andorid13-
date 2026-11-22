package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvc {
    private final zzfb zza = new zzfb(32);
    private zzvb zzb;
    private zzvb zzc;
    private zzvb zzd;
    private long zze;
    private final zzxu zzf;

    public zzvc(zzxu zzxuVar) {
        this.zzf = zzxuVar;
        zzvb zzvbVar = new zzvb(0L, 65536);
        this.zzb = zzvbVar;
        this.zzc = zzvbVar;
        this.zzd = zzvbVar;
    }

    private final int zzi(int i) {
        zzvb zzvbVar = this.zzd;
        if (zzvbVar.zzc == null) {
            zzxn zzxnVarZzb = this.zzf.zzb();
            zzvb zzvbVar2 = new zzvb(this.zzd.zzb, 65536);
            zzvbVar.zzc = zzxnVarZzb;
            zzvbVar.zzd = zzvbVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvb zzj(zzvb zzvbVar, long j) {
        while (j >= zzvbVar.zzb) {
            zzvbVar = zzvbVar.zzd;
        }
        return zzvbVar;
    }

    private static zzvb zzk(zzvb zzvbVar, long j, ByteBuffer byteBuffer, int i) {
        zzvb zzvbVarZzj = zzj(zzvbVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (zzvbVarZzj.zzb - j));
            byteBuffer.put(zzvbVarZzj.zzc.zza, zzvbVarZzj.zza(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == zzvbVarZzj.zzb) {
                zzvbVarZzj = zzvbVarZzj.zzd;
            }
        }
        return zzvbVarZzj;
    }

    private static zzvb zzl(zzvb zzvbVar, long j, byte[] bArr, int i) {
        zzvb zzvbVarZzj = zzj(zzvbVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (zzvbVarZzj.zzb - j));
            System.arraycopy(zzvbVarZzj.zzc.zza, zzvbVarZzj.zza(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == zzvbVarZzj.zzb) {
                zzvbVarZzj = zzvbVarZzj.zzd;
            }
        }
        return zzvbVarZzj;
    }

    private static zzvb zzm(zzvb zzvbVar, zzht zzhtVar, zzve zzveVar, zzfb zzfbVar) {
        zzvb zzvbVarZzl;
        int iZzp;
        if (zzhtVar.zzl()) {
            long j = zzveVar.zzb;
            zzfbVar.zzD(1);
            zzvb zzvbVarZzl2 = zzl(zzvbVar, j, zzfbVar.zzI(), 1);
            long j2 = j + 1;
            byte b = zzfbVar.zzI()[0];
            int i = b & 128;
            int i2 = b & 127;
            zzhq zzhqVar = zzhtVar.zza;
            byte[] bArr = zzhqVar.zza;
            if (bArr == null) {
                zzhqVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            zzvbVarZzl = zzl(zzvbVarZzl2, j2, zzhqVar.zza, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                zzfbVar.zzD(2);
                zzvbVarZzl = zzl(zzvbVarZzl, j3, zzfbVar.zzI(), 2);
                j3 += 2;
                iZzp = zzfbVar.zzp();
            } else {
                iZzp = 1;
            }
            int[] iArr = zzhqVar.zzd;
            if (iArr == null || iArr.length < iZzp) {
                iArr = new int[iZzp];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhqVar.zze;
            if (iArr3 == null || iArr3.length < iZzp) {
                iArr3 = new int[iZzp];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = iZzp * 6;
                zzfbVar.zzD(i3);
                zzvbVarZzl = zzl(zzvbVarZzl, j3, zzfbVar.zzI(), i3);
                j3 += (long) i3;
                zzfbVar.zzG(0);
                for (int i4 = 0; i4 < iZzp; i4++) {
                    iArr2[i4] = zzfbVar.zzp();
                    iArr4[i4] = zzfbVar.zzo();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzveVar.zza - ((int) (j3 - zzveVar.zzb));
            }
            zzacd zzacdVar = zzveVar.zzc;
            int i5 = zzfk.zza;
            zzhqVar.zzc(iZzp, iArr2, iArr4, zzacdVar.zzb, zzhqVar.zza, zzacdVar.zza, zzacdVar.zzc, zzacdVar.zzd);
            long j4 = zzveVar.zzb;
            int i6 = (int) (j3 - j4);
            zzveVar.zzb = j4 + ((long) i6);
            zzveVar.zza -= i6;
        } else {
            zzvbVarZzl = zzvbVar;
        }
        if (!zzhtVar.zze()) {
            zzhtVar.zzj(zzveVar.zza);
            return zzk(zzvbVarZzl, zzveVar.zzb, zzhtVar.zzb, zzveVar.zza);
        }
        zzfbVar.zzD(4);
        zzvb zzvbVarZzl3 = zzl(zzvbVarZzl, zzveVar.zzb, zzfbVar.zzI(), 4);
        int iZzo = zzfbVar.zzo();
        zzveVar.zzb += 4;
        zzveVar.zza -= 4;
        zzhtVar.zzj(iZzo);
        zzvb zzvbVarZzk = zzk(zzvbVarZzl3, zzveVar.zzb, zzhtVar.zzb, iZzo);
        zzveVar.zzb += (long) iZzo;
        int i7 = zzveVar.zza - iZzo;
        zzveVar.zza = i7;
        ByteBuffer byteBuffer = zzhtVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            zzhtVar.zze = ByteBuffer.allocate(i7);
        } else {
            zzhtVar.zze.clear();
        }
        return zzk(zzvbVarZzk, zzveVar.zzb, zzhtVar.zze, zzveVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + ((long) i);
        this.zze = j;
        zzvb zzvbVar = this.zzd;
        if (j == zzvbVar.zzb) {
            this.zzd = zzvbVar.zzd;
        }
    }

    public final int zza(zzt zztVar, int i, boolean z) throws IOException {
        int iZzi = zzi(i);
        zzvb zzvbVar = this.zzd;
        int iZza = zztVar.zza(zzvbVar.zzc.zza, zzvbVar.zza(this.zze), iZzi);
        if (iZza != -1) {
            zzn(iZza);
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzvb zzvbVar;
        if (j != -1) {
            while (true) {
                zzvbVar = this.zzb;
                if (j < zzvbVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvbVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvbVar.zza) {
                this.zzc = zzvbVar;
            }
        }
    }

    public final void zzd(zzht zzhtVar, zzve zzveVar) {
        zzm(this.zzc, zzhtVar, zzveVar, this.zza);
    }

    public final void zze(zzht zzhtVar, zzve zzveVar) {
        this.zzc = zzm(this.zzc, zzhtVar, zzveVar, this.zza);
    }

    public final void zzf() {
        zzvb zzvbVar = this.zzb;
        if (zzvbVar.zzc != null) {
            this.zzf.zzd(zzvbVar);
            zzvbVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzvb zzvbVar2 = this.zzb;
        this.zzc = zzvbVar2;
        this.zzd = zzvbVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfb zzfbVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            zzvb zzvbVar = this.zzd;
            zzfbVar.zzC(zzvbVar.zzc.zza, zzvbVar.zza(this.zze), iZzi);
            i -= iZzi;
            zzn(iZzi);
        }
    }
}
