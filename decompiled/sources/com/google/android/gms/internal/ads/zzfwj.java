package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfwj {
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r3 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        int i3 = i / 8;
        int i4 = i - (i3 * 8);
        if (i4 == 0) {
            return i3;
        }
        boolean z = true;
        int i5 = ((i ^ 8) >> 31) | 1;
        switch (zzfwi.zza[roundingMode.ordinal()]) {
            case 1:
                if (i4 != 0) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    z = false;
                }
                break;
            case 4:
                return i3 + i5;
            case 5:
                if (i5 <= 0) {
                    z = false;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(8) - iAbs);
                if (iAbs2 != 0) {
                    if (iAbs2 <= 0) {
                        z = false;
                    }
                } else if (roundingMode != RoundingMode.HALF_UP) {
                    if (((roundingMode == RoundingMode.HALF_EVEN ? 1 : 0) & i3 & 1) == 0) {
                        z = false;
                    }
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}
