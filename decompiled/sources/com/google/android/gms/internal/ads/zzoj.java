package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzoj {
    public static final zzoj zza = new zzoj(new int[]{2}, 10);
    private static final zzfud zzb = zzfud.zzo(2, 5, 6);
    private static final zzfug zzc;
    private final int[] zzd;
    private final int zze;

    static {
        zzfuf zzfufVar = new zzfuf();
        zzfufVar.zza(5, 6);
        zzfufVar.zza(17, 6);
        zzfufVar.zza(7, 6);
        zzfufVar.zza(30, 10);
        zzfufVar.zza(18, 6);
        zzfufVar.zza(6, 8);
        zzfufVar.zza(8, 8);
        zzfufVar.zza(14, 8);
        zzc = zzfufVar.zzc();
    }

    public zzoj(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, 1);
        this.zzd = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.zze = 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoj)) {
            return false;
        }
        zzoj zzojVar = (zzoj) obj;
        if (!Arrays.equals(this.zzd, zzojVar.zzd)) {
            return false;
        }
        int i = zzojVar.zze;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzd) * 31) + 10;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=10, supportedEncodings=" + Arrays.toString(this.zzd) + "]";
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038 A[PHI: r0
  0x0038: PHI (r0v3 int) = (r0v2 int), (r0v6 int) binds: [B:11:0x002b, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    public final Pair zza(zzam zzamVar) {
        String str = zzamVar.zzm;
        str.getClass();
        int iZza = zzcc.zza(str, zzamVar.zzj);
        zzfug zzfugVar = zzc;
        if (!zzfugVar.containsKey(Integer.valueOf(iZza))) {
            return null;
        }
        int i = 6;
        if (iZza != 18) {
            if (iZza != 8) {
                if (iZza == 30 && !zzc(30)) {
                    iZza = 7;
                }
            } else if (zzc(8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else if (zzc(18)) {
            iZza = 18;
            if (iZza != 8) {
                if (iZza == 30) {
                    iZza = 7;
                }
            } else if (zzc(8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else {
            iZza = 6;
        }
        if (!zzc(iZza)) {
            return null;
        }
        int iIntValue = zzamVar.zzz;
        if (iIntValue == -1 || iZza == 18) {
            int i2 = zzamVar.zzA;
            if (i2 == -1) {
                i2 = 48000;
            }
            if (zzfk.zza >= 29) {
                iIntValue = zzoi.zza(iZza, i2);
            } else {
                Integer num = (Integer) zzfugVar.getOrDefault(Integer.valueOf(iZza), 0);
                num.getClass();
                iIntValue = num.intValue();
            }
        } else if (zzamVar.zzm.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (iIntValue > 10) {
                return null;
            }
        } else if (iIntValue > 10) {
            return null;
        }
        if (zzfk.zza > 28) {
            i = iIntValue;
        } else if (iIntValue == 7) {
            i = 8;
        } else if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5) {
            i = iIntValue;
        }
        if (zzfk.zza <= 26 && "fugu".equals(zzfk.zzb) && i == 1) {
            i = 2;
        }
        int iZzg = zzfk.zzg(i);
        if (iZzg == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iZza), Integer.valueOf(iZzg));
    }

    public final boolean zzc(int i) {
        return Arrays.binarySearch(this.zzd, i) >= 0;
    }
}
