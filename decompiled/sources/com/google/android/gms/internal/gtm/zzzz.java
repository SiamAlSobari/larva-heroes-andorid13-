package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzz {
    private static final zzzz zza = new zzzz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzzz() {
        this(0, new int[8], new Object[8], true);
    }

    private zzzz(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzzz zzc() {
        return zza;
    }

    static zzzz zze(zzzz zzzzVar, zzzz zzzzVar2) {
        int i = zzzzVar.zzb + zzzzVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzzzVar.zzc, i);
        System.arraycopy(zzzzVar2.zzc, 0, iArrCopyOf, zzzzVar.zzb, zzzzVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzzzVar.zzd, i);
        System.arraycopy(zzzzVar2.zzd, 0, objArrCopyOf, zzzzVar.zzb, zzzzVar2.zzb);
        return new zzzz(i, iArrCopyOf, objArrCopyOf, true);
    }

    static zzzz zzf() {
        return new zzzz(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
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
        if (obj == null || !(obj instanceof zzzz)) {
            return false;
        }
        zzzz zzzzVar = (zzzz) obj;
        int i = this.zzb;
        if (i == zzzzVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzzzVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzzzVar.zzd;
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
        int iZzE;
        int iZzD;
        int iZzD2;
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
                    iZzD2 = zzuq.zzD(i5 << 3) + 8;
                } else if (i6 == 2) {
                    zzud zzudVar = (zzud) this.zzd[i3];
                    int i7 = zzuq.zzf;
                    int iZzd = zzudVar.zzd();
                    iZzD2 = zzuq.zzD(i5 << 3) + zzuq.zzD(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int i8 = i5 << 3;
                    int i9 = zzuq.zzf;
                    iZzE = ((zzzz) this.zzd[i3]).zza();
                    int iZzD3 = zzuq.zzD(i8);
                    iZzD = iZzD3 + iZzD3;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(zzxu.zza());
                    }
                    ((Integer) this.zzd[i3]).intValue();
                    iZzD2 = zzuq.zzD(i5 << 3) + 4;
                }
                i2 += iZzD2;
            } else {
                int i10 = i5 << 3;
                iZzE = zzuq.zzE(((Long) this.zzd[i3]).longValue());
                iZzD = zzuq.zzD(i10);
            }
            iZzD2 = iZzD + iZzE;
            i2 += iZzD2;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzD = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzud zzudVar = (zzud) this.zzd[i2];
            int i4 = zzuq.zzf;
            int iZzd = zzudVar.zzd();
            int iZzD2 = zzuq.zzD(iZzd) + iZzd;
            int iZzD3 = zzuq.zzD(16);
            int iZzD4 = zzuq.zzD(i3);
            int iZzD5 = zzuq.zzD(8);
            iZzD += iZzD5 + iZzD5 + iZzD3 + iZzD4 + zzuq.zzD(24) + iZzD2;
        }
        this.zze = iZzD;
        return iZzD;
    }

    final zzzz zzd(zzzz zzzzVar) {
        if (zzzzVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzzzVar.zzb;
        zzm(i);
        System.arraycopy(zzzzVar.zzc, 0, this.zzc, this.zzb, zzzzVar.zzb);
        System.arraycopy(zzzzVar.zzd, 0, this.zzd, this.zzb, zzzzVar.zzb);
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
            zzyw.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final void zzk(zzur zzurVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzurVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzur zzurVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzurVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzurVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzurVar.zzd(i4, (zzud) obj);
                } else if (i3 == 3) {
                    zzurVar.zzF(i4);
                    ((zzzz) obj).zzl(zzurVar);
                    zzurVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzxu.zza());
                    }
                    zzurVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
