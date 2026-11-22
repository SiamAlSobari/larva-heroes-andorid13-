package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzz {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzzy zza(byte[] bArr) throws zzcd {
        return zzb(new zzfa(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        if (r11 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzzy zzb(zzfa zzfaVar, boolean z) throws zzcd {
        int iZzc = zzc(zzfaVar);
        int iZzd = zzd(zzfaVar);
        int iZzd2 = zzfaVar.zzd(4);
        String str = "mp4a.40." + iZzc;
        int i = 22;
        if (iZzc == 5 || iZzc == 29) {
            iZzd = zzd(zzfaVar);
            iZzc = zzc(zzfaVar);
            if (iZzc == 22) {
                iZzd2 = zzfaVar.zzd(4);
            }
        }
        if (z) {
            int i2 = 3;
            if (iZzc != 1 && iZzc != 2 && iZzc != 3 && iZzc != 4 && iZzc != 6 && iZzc != 7 && iZzc != 17) {
                switch (iZzc) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw zzcd.zzc("Unsupported audio object type: " + iZzc);
                }
            }
            if (zzfaVar.zzn()) {
                zzes.zzf("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzfaVar.zzn()) {
                zzfaVar.zzl(14);
            }
            boolean zZzn = zzfaVar.zzn();
            if (iZzd2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iZzc == 6) {
                zzfaVar.zzl(3);
            } else if (iZzc == 20) {
                iZzc = 20;
                zzfaVar.zzl(3);
            }
            if (zZzn) {
                if (iZzc == 22) {
                    zzfaVar.zzl(16);
                } else {
                    i = iZzc;
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    zzfaVar.zzl(3);
                }
                zzfaVar.zzl(1);
            }
            switch (iZzc) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iZzd3 = zzfaVar.zzd(2);
                    if (iZzd3 == 2) {
                        i2 = iZzd3;
                    }
                    throw zzcd.zzc("Unsupported epConfig: " + i2);
            }
        }
        int i3 = zzc[iZzd2];
        if (i3 != -1) {
            return new zzzy(iZzd, i3, str, null);
        }
        throw zzcd.zza(null, null);
    }

    private static int zzc(zzfa zzfaVar) {
        int iZzd = zzfaVar.zzd(5);
        return iZzd == 31 ? zzfaVar.zzd(6) + 32 : iZzd;
    }

    private static int zzd(zzfa zzfaVar) throws zzcd {
        int iZzd = zzfaVar.zzd(4);
        if (iZzd == 15) {
            if (zzfaVar.zza() >= 24) {
                return zzfaVar.zzd(24);
            }
            throw zzcd.zza("AAC header insufficient data", null);
        }
        if (iZzd < 13) {
            return zzb[iZzd];
        }
        throw zzcd.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
