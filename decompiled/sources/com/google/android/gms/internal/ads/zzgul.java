package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgul {
    private static final zzgul zza = new zzgul(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgul() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgul(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgul zzc() {
        return zza;
    }

    static zzgul zze(zzgul zzgulVar, zzgul zzgulVar2) {
        int i = zzgulVar.zzb + zzgulVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgulVar.zzc, i);
        System.arraycopy(zzgulVar2.zzc, 0, iArrCopyOf, zzgulVar.zzb, zzgulVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgulVar.zzd, i);
        System.arraycopy(zzgulVar2.zzd, 0, objArrCopyOf, zzgulVar.zzb, zzgulVar2.zzb);
        return new zzgul(i, iArrCopyOf, objArrCopyOf, true);
    }

    static zzgul zzf() {
        return new zzgul(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgul)) {
            return false;
        }
        zzgul zzgulVar = (zzgul) obj;
        int i = this.zzb;
        if (i == zzgulVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgulVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzgulVar.zzd;
            int i3 = this.zzb;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 * 31) + i3;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return (i5 * 31) + iHashCode;
    }

    public final int zza() {
        int iZzB;
        int iZzA;
        int iZzA2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.zzd[i3]).longValue();
                    iZzA2 = zzgqx.zzA(i5 << 3) + 8;
                } else if (i6 == 2) {
                    zzgqi zzgqiVar = (zzgqi) this.zzd[i3];
                    int i7 = zzgqx.zzf;
                    int iZzd = zzgqiVar.zzd();
                    iZzA2 = zzgqx.zzA(i5 << 3) + zzgqx.zzA(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int i8 = i5 << 3;
                    int i9 = zzgqx.zzf;
                    iZzB = ((zzgul) this.zzd[i3]).zza();
                    int iZzA3 = zzgqx.zzA(i8);
                    iZzA = iZzA3 + iZzA3;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(zzgsc.zza());
                    }
                    ((Integer) this.zzd[i3]).intValue();
                    iZzA2 = zzgqx.zzA(i5 << 3) + 4;
                }
                i2 += iZzA2;
            } else {
                int i10 = i5 << 3;
                iZzB = zzgqx.zzB(((Long) this.zzd[i3]).longValue());
                iZzA = zzgqx.zzA(i10);
            }
            iZzA2 = iZzA + iZzB;
            i2 += iZzA2;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzA = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzgqi zzgqiVar = (zzgqi) this.zzd[i2];
            int i4 = zzgqx.zzf;
            int iZzd = zzgqiVar.zzd();
            int iZzA2 = zzgqx.zzA(iZzd) + iZzd;
            int iZzA3 = zzgqx.zzA(16);
            int iZzA4 = zzgqx.zzA(i3);
            int iZzA5 = zzgqx.zzA(8);
            iZzA += iZzA5 + iZzA5 + iZzA3 + iZzA4 + zzgqx.zzA(24) + iZzA2;
        }
        this.zze = iZzA;
        return iZzA;
    }

    final zzgul zzd(zzgul zzgulVar) {
        if (zzgulVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzgulVar.zzb;
        zzl(i);
        System.arraycopy(zzgulVar.zzc, 0, this.zzc, this.zzb, zzgulVar.zzb);
        System.arraycopy(zzgulVar.zzd, 0, this.zzd, this.zzb, zzgulVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzgtc.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzgqy zzgqyVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzgqyVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzgqyVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzgqyVar.zzd(i4, (zzgqi) obj);
                } else if (i3 == 3) {
                    zzgqyVar.zzE(i4);
                    ((zzgul) obj).zzk(zzgqyVar);
                    zzgqyVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzgsc.zza());
                    }
                    zzgqyVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
