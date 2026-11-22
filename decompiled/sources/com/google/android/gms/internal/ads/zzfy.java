package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfy {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzdy.zzf(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zzf(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zzf(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zzf(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    zzf(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static zzfv zzc(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iZzb;
        int i6;
        int i7;
        zzfz zzfzVar = new zzfz(bArr, i, i2);
        int i8 = 4;
        zzfzVar.zze(4);
        int iZza = zzfzVar.zza(3);
        zzfzVar.zzd();
        int iZza2 = zzfzVar.zza(2);
        boolean zZzf = zzfzVar.zzf();
        int iZza3 = zzfzVar.zza(5);
        int i9 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            if (zzfzVar.zzf()) {
                i9 |= 1 << i10;
            }
        }
        int i11 = 6;
        int[] iArr = new int[6];
        for (int i12 = 0; i12 < 6; i12++) {
            iArr[i12] = zzfzVar.zza(8);
        }
        int iZza4 = zzfzVar.zza(8);
        int i13 = 0;
        for (int i14 = 0; i14 < iZza; i14++) {
            if (zzfzVar.zzf()) {
                i13 += 89;
            }
            if (zzfzVar.zzf()) {
                i13 += 8;
            }
        }
        zzfzVar.zze(i13);
        if (iZza > 0) {
            int i15 = 8 - iZza;
            zzfzVar.zze(i15 + i15);
        }
        int iZzc = zzfzVar.zzc();
        int iZzc2 = zzfzVar.zzc();
        if (iZzc2 == 3) {
            zzfzVar.zzd();
            iZzc2 = 3;
        }
        int iZzc3 = zzfzVar.zzc();
        int iZzc4 = zzfzVar.zzc();
        if (zzfzVar.zzf()) {
            int iZzc5 = zzfzVar.zzc();
            int iZzc6 = zzfzVar.zzc();
            int iZzc7 = zzfzVar.zzc();
            int iZzc8 = zzfzVar.zzc();
            if (iZzc2 == 1) {
                i7 = 2;
            } else if (iZzc2 == 2) {
                iZzc2 = 2;
                i7 = 2;
            } else {
                i7 = 1;
            }
            iZzc3 -= i7 * (iZzc5 + iZzc6);
            iZzc4 -= (iZzc2 == 1 ? 2 : 1) * (iZzc7 + iZzc8);
        }
        int i16 = iZzc3;
        int i17 = iZzc2;
        int i18 = iZzc4;
        int iZzc9 = zzfzVar.zzc();
        int iZzc10 = zzfzVar.zzc();
        int iZzc11 = zzfzVar.zzc();
        for (int i19 = true != zzfzVar.zzf() ? iZza : 0; i19 <= iZza; i19++) {
            zzfzVar.zzc();
            zzfzVar.zzc();
            zzfzVar.zzc();
        }
        zzfzVar.zzc();
        zzfzVar.zzc();
        zzfzVar.zzc();
        zzfzVar.zzc();
        zzfzVar.zzc();
        zzfzVar.zzc();
        if (zzfzVar.zzf() && zzfzVar.zzf()) {
            int i20 = 0;
            while (i20 < i8) {
                int i21 = 0;
                while (i21 < i11) {
                    if (zzfzVar.zzf()) {
                        int iMin = Math.min(64, 1 << ((i20 + i20) + 4));
                        if (i20 > 1) {
                            zzfzVar.zzb();
                        }
                        for (int i22 = 0; i22 < iMin; i22++) {
                            zzfzVar.zzb();
                        }
                    } else {
                        zzfzVar.zzc();
                    }
                    i21 += i20 == 3 ? 3 : 1;
                    i11 = 6;
                }
                i20++;
                i8 = 4;
                i11 = 6;
            }
        }
        zzfzVar.zze(2);
        if (zzfzVar.zzf()) {
            zzfzVar.zze(8);
            zzfzVar.zzc();
            zzfzVar.zzc();
            zzfzVar.zzd();
        }
        int iZzc12 = zzfzVar.zzc();
        int i23 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        while (i23 < iZzc12) {
            if (i23 == 0 || !zzfzVar.zzf()) {
                int iZzc13 = zzfzVar.zzc();
                int iZzc14 = zzfzVar.zzc();
                int[] iArr3 = new int[iZzc13];
                for (int i27 = 0; i27 < iZzc13; i27++) {
                    iArr3[i27] = zzfzVar.zzc() + 1;
                    zzfzVar.zzd();
                }
                int i28 = 1;
                int[] iArr4 = new int[iZzc14];
                int i29 = 0;
                while (i29 < iZzc14) {
                    iArr4[i29] = zzfzVar.zzc() + i28;
                    zzfzVar.zzd();
                    i29++;
                    i28 = 1;
                }
                i26 = iZzc14;
                iArrCopyOf = iArr4;
                i25 = iZzc13;
                iArr2 = iArr3;
            } else {
                int i30 = i25 + i26;
                boolean zZzf2 = zzfzVar.zzf();
                int iZzc15 = zzfzVar.zzc() + 1;
                int i31 = 1 - ((zZzf2 ? 1 : 0) + (zZzf2 ? 1 : 0));
                int i32 = i30 + 1;
                boolean[] zArr = new boolean[i32];
                for (int i33 = 0; i33 <= i30; i33++) {
                    if (zzfzVar.zzf()) {
                        zArr[i33] = true;
                    } else {
                        zArr[i33] = zzfzVar.zzf();
                    }
                }
                int i34 = i26 - 1;
                int[] iArr5 = new int[i32];
                int[] iArr6 = new int[i32];
                int i35 = 0;
                while (true) {
                    i6 = i31 * iZzc15;
                    if (i34 < 0) {
                        break;
                    }
                    int i36 = iArrCopyOf[i34] + i6;
                    if (i36 < 0 && zArr[i25 + i34]) {
                        iArr5[i35] = i36;
                        i35++;
                    }
                    i34--;
                }
                if (i6 < 0 && zArr[i30]) {
                    iArr5[i35] = i6;
                    i35++;
                }
                int i37 = i35;
                for (int i38 = 0; i38 < i25; i38++) {
                    int i39 = iArr2[i38] + i6;
                    if (i39 < 0 && zArr[i38]) {
                        iArr5[i37] = i39;
                        i37++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i37);
                int i40 = 0;
                for (int i41 = i25 - 1; i41 >= 0; i41--) {
                    int i42 = iArr2[i41] + i6;
                    if (i42 > 0 && zArr[i41]) {
                        iArr6[i40] = i42;
                        i40++;
                    }
                }
                if (i6 > 0 && zArr[i30]) {
                    iArr6[i40] = i6;
                    i40++;
                }
                int i43 = i40;
                for (int i44 = 0; i44 < i26; i44++) {
                    int i45 = iArrCopyOf[i44] + i6;
                    if (i45 > 0 && zArr[i25 + i44]) {
                        iArr6[i43] = i45;
                        i43++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i43);
                i26 = i43;
                iArr2 = iArrCopyOf2;
                i25 = i37;
            }
            i23++;
            i17 = i17;
            i9 = i9;
            iZzc12 = iZzc12;
            iArr = iArr;
        }
        int i46 = i9;
        int i47 = i17;
        int[] iArr7 = iArr;
        if (zzfzVar.zzf()) {
            for (int i48 = 0; i48 < zzfzVar.zzc(); i48++) {
                zzfzVar.zze(iZzc11 + 5);
            }
        }
        zzfzVar.zze(2);
        float f = 1.0f;
        if (zzfzVar.zzf()) {
            if (zzfzVar.zzf()) {
                int iZza5 = zzfzVar.zza(8);
                if (iZza5 == 255) {
                    int iZza6 = zzfzVar.zza(16);
                    int iZza7 = zzfzVar.zza(16);
                    if (iZza6 != 0 && iZza7 != 0) {
                        f = iZza6 / iZza7;
                    }
                } else if (iZza5 < 17) {
                    f = zzb[iZza5];
                } else {
                    zzes.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza5);
                }
            }
            if (zzfzVar.zzf()) {
                zzfzVar.zzd();
            }
            if (zzfzVar.zzf()) {
                zzfzVar.zze(3);
                int i49 = true != zzfzVar.zzf() ? 2 : 1;
                if (zzfzVar.zzf()) {
                    int iZza8 = zzfzVar.zza(8);
                    int iZza9 = zzfzVar.zza(8);
                    zzfzVar.zze(8);
                    int iZza10 = zzs.zza(iZza8);
                    iZzb = zzs.zzb(iZza9);
                    i4 = iZza10;
                    i24 = i49;
                } else {
                    i24 = i49;
                    i4 = -1;
                    iZzb = -1;
                }
            } else {
                i4 = -1;
                iZzb = -1;
            }
            if (zzfzVar.zzf()) {
                zzfzVar.zzc();
                zzfzVar.zzc();
            }
            zzfzVar.zzd();
            if (zzfzVar.zzf()) {
                i18 += i18;
            }
            i5 = iZzb;
            i3 = i18;
        } else {
            i3 = i18;
            i4 = -1;
            i5 = -1;
        }
        return new zzfv(iZza2, zZzf, iZza3, i46, i47, iZzc9, iZzc10, iArr7, iZza4, iZzc, i16, i3, f, i4, i24, i5);
    }

    public static zzfw zzd(byte[] bArr, int i, int i2) {
        zzfz zzfzVar = new zzfz(bArr, 4, i2);
        int iZzc = zzfzVar.zzc();
        int iZzc2 = zzfzVar.zzc();
        zzfzVar.zzd();
        return new zzfw(iZzc, iZzc2, zzfzVar.zzf());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:113:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:66:0x0117  */
    /* JADX WARN: Code duplicated, block: B:68:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x012f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:80:0x014e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0154  */
    /* JADX WARN: Code duplicated, block: B:84:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x016f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x018b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0193  */
    /* JADX WARN: Code duplicated, block: B:98:0x019c  */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x0178, please report this as an issue */
    public static zzfx zze(byte[] bArr, int i, int i2) {
        int iZzc;
        int i3;
        boolean zZzf;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int iZzb;
        int i8;
        int iZzc2;
        boolean z2;
        boolean zZzf2;
        int i9;
        int i10;
        int i11;
        int iZza;
        float f;
        int i12;
        int iZzb2;
        float f2;
        int i13;
        int iZza2;
        int iZza3;
        int i14;
        int i15;
        zzfz zzfzVar = new zzfz(bArr, i, i2);
        int iZza4 = zzfzVar.zza(8);
        int iZza5 = zzfzVar.zza(8);
        int iZza6 = zzfzVar.zza(8);
        int iZzc3 = zzfzVar.zzc();
        if (iZza4 == 100 || iZza4 == 110 || iZza4 == 122 || iZza4 == 244 || iZza4 == 44 || iZza4 == 83 || iZza4 == 86 || iZza4 == 118 || iZza4 == 128) {
            iZzc = zzfzVar.zzc();
            if (iZzc == 3) {
                zZzf = zzfzVar.zzf();
                i3 = 3;
            } else {
                i3 = iZzc;
                zZzf = false;
            }
            zzfzVar.zzc();
            zzfzVar.zzc();
            zzfzVar.zzd();
            if (zzfzVar.zzf()) {
                if (i3 != 3) {
                    i4 = 8;
                } else {
                    i4 = 12;
                }
                for (i5 = 0; i5 < i4; i5++) {
                    if (!zzfzVar.zzf()) {
                        if (i5 < 6) {
                            i6 = 16;
                        } else {
                            i6 = 64;
                        }
                        iZzb = 8;
                        i8 = 8;
                        for (i7 = 0; i7 < i6; i7++) {
                            if (iZzb != 0) {
                                iZzb = ((i8 + zzfzVar.zzb()) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i8 = iZzb;
                            }
                        }
                    }
                }
            }
            z = zZzf;
        } else if (iZza4 == 138) {
            iZza4 = 138;
            iZzc = zzfzVar.zzc();
            if (iZzc == 3) {
                zZzf = zzfzVar.zzf();
                i3 = 3;
            } else {
                i3 = iZzc;
                zZzf = false;
            }
            zzfzVar.zzc();
            zzfzVar.zzc();
            zzfzVar.zzd();
            if (zzfzVar.zzf()) {
                if (i3 != 3) {
                    i4 = 8;
                } else {
                    i4 = 12;
                }
                while (i5 < i4) {
                    if (!zzfzVar.zzf()) {
                        if (i5 < 6) {
                            i6 = 16;
                        } else {
                            i6 = 64;
                        }
                        iZzb = 8;
                        i8 = 8;
                        while (i7 < i6) {
                            if (iZzb != 0) {
                                iZzb = ((i8 + zzfzVar.zzb()) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i8 = iZzb;
                            }
                        }
                    }
                }
            }
            z = zZzf;
        } else {
            iZzc = 1;
            z = false;
        }
        int iZzc4 = zzfzVar.zzc() + 4;
        int iZzc5 = zzfzVar.zzc();
        if (iZzc5 != 0) {
            if (iZzc5 == 1) {
                boolean zZzf3 = zzfzVar.zzf();
                zzfzVar.zzb();
                zzfzVar.zzb();
                iZza4 = iZza4;
                long jZzc = zzfzVar.zzc();
                for (int i16 = 0; i16 < jZzc; i16++) {
                    zzfzVar.zzc();
                }
                z2 = zZzf3;
                iZzc5 = 1;
                iZzc2 = 0;
            } else {
                iZzc2 = 0;
            }
            int iZzc6 = zzfzVar.zzc();
            zzfzVar.zzd();
            int iZzc7 = zzfzVar.zzc() + 1;
            int iZzc8 = zzfzVar.zzc() + 1;
            zZzf2 = zzfzVar.zzf();
            i9 = 2 - (zZzf2 ? 1 : 0);
            if (!zZzf2) {
                zzfzVar.zzd();
            }
            zzfzVar.zzd();
            i10 = iZzc7 * 16;
            i11 = iZzc8 * i9 * 16;
            if (zzfzVar.zzf()) {
                int iZzc9 = zzfzVar.zzc();
                int iZzc10 = zzfzVar.zzc();
                int iZzc11 = zzfzVar.zzc();
                int iZzc12 = zzfzVar.zzc();
                if (iZzc == 0) {
                    i14 = 1;
                } else {
                    if (iZzc == 3) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    if (iZzc == 1) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    i9 *= i15;
                }
                i10 -= (iZzc9 + iZzc10) * i14;
                i11 -= (iZzc11 + iZzc12) * i9;
            }
            int i17 = i10;
            if (zzfzVar.zzf()) {
                if (zzfzVar.zzf()) {
                    iZza2 = zzfzVar.zza(8);
                    if (iZza2 == 255) {
                        iZza3 = zzfzVar.zza(16);
                        int iZza7 = zzfzVar.zza(16);
                        if (iZza3 != 0 || iZza7 == 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = iZza3 / iZza7;
                        }
                    } else if (iZza2 < 17) {
                        f2 = zzb[iZza2];
                    } else {
                        zzes.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza2);
                        f2 = 1.0f;
                    }
                } else {
                    f2 = 1.0f;
                }
                if (zzfzVar.zzf()) {
                    zzfzVar.zzd();
                }
                if (zzfzVar.zzf()) {
                    zzfzVar.zze(3);
                    i13 = true != zzfzVar.zzf() ? 2 : 1;
                    if (zzfzVar.zzf()) {
                        int iZza8 = zzfzVar.zza(8);
                        int iZza9 = zzfzVar.zza(8);
                        zzfzVar.zze(8);
                        iZza = zzs.zza(iZza8);
                        iZzb2 = zzs.zzb(iZza9);
                        f = f2;
                        i12 = i13;
                    } else {
                        f = f2;
                        i12 = i13;
                        iZza = -1;
                        iZzb2 = -1;
                    }
                } else {
                    f = f2;
                    iZza = -1;
                }
                return new zzfx(iZza4, iZza5, iZza6, iZzc3, iZzc6, i17, i11, f, z, zZzf2, iZzc4, iZzc5, iZzc2, z2, iZza, i12, iZzb2);
            }
            iZza = -1;
            f = 1.0f;
            i12 = -1;
            iZzb2 = -1;
            return new zzfx(iZza4, iZza5, iZza6, iZzc3, iZzc6, i17, i11, f, z, zZzf2, iZzc4, iZzc5, iZzc2, z2, iZza, i12, iZzb2);
        }
        iZzc2 = zzfzVar.zzc() + 4;
        z2 = false;
        int iZzc13 = zzfzVar.zzc();
        zzfzVar.zzd();
        int iZzc14 = zzfzVar.zzc() + 1;
        int iZzc15 = zzfzVar.zzc() + 1;
        zZzf2 = zzfzVar.zzf();
        i9 = 2 - (zZzf2 ? 1 : 0);
        if (!zZzf2) {
            zzfzVar.zzd();
        }
        zzfzVar.zzd();
        i10 = iZzc14 * 16;
        i11 = iZzc15 * i9 * 16;
        if (zzfzVar.zzf()) {
            int iZzc16 = zzfzVar.zzc();
            int iZzc17 = zzfzVar.zzc();
            int iZzc18 = zzfzVar.zzc();
            int iZzc19 = zzfzVar.zzc();
            if (iZzc == 0) {
                i14 = 1;
            } else {
                if (iZzc == 3) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                if (iZzc == 1) {
                    i15 = 2;
                } else {
                    i15 = 1;
                }
                i9 *= i15;
            }
            i10 -= (iZzc16 + iZzc17) * i14;
            i11 -= (iZzc18 + iZzc19) * i9;
        }
        int i18 = i10;
        if (zzfzVar.zzf()) {
            if (zzfzVar.zzf()) {
                f2 = 1.0f;
            } else {
                iZza2 = zzfzVar.zza(8);
                if (iZza2 == 255) {
                    iZza3 = zzfzVar.zza(16);
                    int iZza10 = zzfzVar.zza(16);
                    if (iZza3 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                } else if (iZza2 < 17) {
                    f2 = zzb[iZza2];
                } else {
                    zzes.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza2);
                    f2 = 1.0f;
                }
            }
            if (zzfzVar.zzf()) {
                zzfzVar.zzd();
            }
            if (zzfzVar.zzf()) {
                zzfzVar.zze(3);
                if (true != zzfzVar.zzf()) {
                }
                if (zzfzVar.zzf()) {
                    int iZza11 = zzfzVar.zza(8);
                    int iZza12 = zzfzVar.zza(8);
                    zzfzVar.zze(8);
                    iZza = zzs.zza(iZza11);
                    iZzb2 = zzs.zzb(iZza12);
                    f = f2;
                    i12 = i13;
                } else {
                    f = f2;
                    i12 = i13;
                    iZza = -1;
                    iZzb2 = -1;
                }
            } else {
                f = f2;
                iZza = -1;
            }
            return new zzfx(iZza4, iZza5, iZza6, iZzc3, iZzc13, i18, i11, f, z, zZzf2, iZzc4, iZzc5, iZzc2, z2, iZza, i12, iZzb2);
        }
        iZza = -1;
        f = 1.0f;
        i12 = -1;
        iZzb2 = -1;
        return new zzfx(iZza4, iZza5, iZza6, iZzc3, iZzc13, i18, i11, f, z, zZzf2, iZzc4, iZzc5, iZzc2, z2, iZza, i12, iZzb2);
    }

    public static void zzf(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = zzd[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }
}
