package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzamw {
    private static final zzamw zza = new zzamw(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamw() {
        this(0, new int[8], new Object[8], true);
    }

    private zzamw(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzamw zzc() {
        return zza;
    }

    static zzamw zze(zzamw zzamwVar, zzamw zzamwVar2) {
        int i = zzamwVar.zzb + zzamwVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzamwVar.zzc, i);
        System.arraycopy(zzamwVar2.zzc, 0, iArrCopyOf, zzamwVar.zzb, zzamwVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzamwVar.zzd, i);
        System.arraycopy(zzamwVar2.zzd, 0, objArrCopyOf, zzamwVar.zzb, zzamwVar2.zzb);
        return new zzamw(i, iArrCopyOf, objArrCopyOf, true);
    }

    static zzamw zzf() {
        return new zzamw(0, new int[8], new Object[8], true);
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
        if (obj == null || !(obj instanceof zzamw)) {
            return false;
        }
        zzamw zzamwVar = (zzamw) obj;
        int i = this.zzb;
        if (i == zzamwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamwVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzamwVar.zzd;
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
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
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
                    iZzA2 = zzajs.zzA(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzajf zzajfVar = (zzajf) this.zzd[i3];
                    int i8 = zzajs.zzf;
                    int iZzd = zzajfVar.zzd();
                    iZzA2 = zzajs.zzA(i7) + zzajs.zzA(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int i9 = i5 << 3;
                    int i10 = zzajs.zzf;
                    iZzB = ((zzamw) this.zzd[i3]).zza();
                    int iZzA3 = zzajs.zzA(i9);
                    iZzA = iZzA3 + iZzA3;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(zzaks.zza());
                    }
                    ((Integer) this.zzd[i3]).intValue();
                    iZzA2 = zzajs.zzA(i5 << 3) + 4;
                }
                i2 += iZzA2;
            } else {
                int i11 = i5 << 3;
                iZzB = zzajs.zzB(((Long) this.zzd[i3]).longValue());
                iZzA = zzajs.zzA(i11);
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
            zzajf zzajfVar = (zzajf) this.zzd[i2];
            int i4 = zzajs.zzf;
            int iZzd = zzajfVar.zzd();
            int iZzA2 = zzajs.zzA(iZzd) + iZzd;
            int iZzA3 = zzajs.zzA(16);
            int iZzA4 = zzajs.zzA(i3);
            int iZzA5 = zzajs.zzA(8);
            iZzA += iZzA5 + iZzA5 + iZzA3 + iZzA4 + zzajs.zzA(24) + iZzA2;
        }
        this.zze = iZzA;
        return iZzA;
    }

    final zzamw zzd(zzamw zzamwVar) {
        if (zzamwVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzamwVar.zzb;
        zzl(i);
        System.arraycopy(zzamwVar.zzc, 0, this.zzc, this.zzb, zzamwVar.zzb);
        System.arraycopy(zzamwVar.zzd, 0, this.zzd, this.zzb, zzamwVar.zzb);
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
            zzalr.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
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

    public final void zzk(zzajt zzajtVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzajtVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzajtVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzajtVar.zzd(i4, (zzajf) obj);
                } else if (i3 == 3) {
                    zzajtVar.zzE(i4);
                    ((zzamw) obj).zzk(zzajtVar);
                    zzajtVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzaks.zza());
                    }
                    zzajtVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
