package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsp {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzsj {
        int i;
        int iMax = zzd;
        if (iMax == -1) {
            zzrw zzrwVarZzc = zzc("video/avc", false, false);
            if (zzrwVarZzc != null) {
                int iMax2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzrwVarZzc.zzh()) {
                    int i2 = codecProfileLevel.level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                }
                iMax = Math.max(iMax2, zzfk.zza >= 21 ? 345600 : 172800);
            } else {
                iMax = 0;
            }
            zzd = iMax;
        }
        return iMax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:139:0x024b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c5 A[Catch: NumberFormatException -> 0x02d5, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x02d5, blocks: (B:148:0x026a, B:150:0x027c, B:161:0x0298, B:177:0x02c5), top: B:489:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:252:0x0436  */
    /* JADX WARN: Code duplicated, block: B:334:0x0568  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v170 int, still in use, count: 1, list:
  (r2v170 int) from 0x012c: SWITCH (r2v170 int)
 case 1567: goto B:81:0x0160
 case 1568: goto B:78:0x0150
 case 1569: goto B:75:0x0140
 case 1570: goto B:72:0x0130
 default: goto B:67:0x0122 A[RegionRef:SW:70]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair zzb(zzam zzamVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b;
        Integer num;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Integer num2;
        Integer num3;
        String str = zzamVar.zzj;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        int i13 = 2;
        if ("video/dolby-vision".equals(zzamVar.zzm)) {
            String str2 = zzamVar.zzj;
            if (strArrSplit.length < 3) {
                zzes.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str2)));
            } else {
                Matcher matcher = zzb.matcher(strArrSplit[1]);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (strGroup != null) {
                        switch (strGroup) {
                            case "00":
                                num2 = 1;
                                break;
                            case "01":
                                num2 = 2;
                                break;
                            case "02":
                                num2 = 4;
                                break;
                            case "03":
                                num2 = 8;
                                break;
                            case "04":
                                num2 = 16;
                                break;
                            case "05":
                                num2 = 32;
                                break;
                            case "06":
                                num2 = 64;
                                break;
                            case "07":
                                num2 = 128;
                                break;
                            case "08":
                                num2 = 256;
                                break;
                            case "09":
                                num2 = 512;
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                    } else {
                        num2 = null;
                    }
                    if (num2 == null) {
                        zzes.zzf("MediaCodecUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(strGroup)));
                    } else {
                        String str3 = strArrSplit[2];
                        if (str3 != null) {
                            switch (str3) {
                                case "01":
                                    num3 = 1;
                                    break;
                                case "02":
                                    num3 = 2;
                                    break;
                                case "03":
                                    num3 = 4;
                                    break;
                                case "04":
                                    num3 = 8;
                                    break;
                                case "05":
                                    num3 = 16;
                                    break;
                                case "06":
                                    num3 = 32;
                                    break;
                                case "07":
                                    num3 = 64;
                                    break;
                                case "08":
                                    num3 = 128;
                                    break;
                                case "09":
                                    num3 = 256;
                                    break;
                                default:
                                    switch (str3) {
                                        case 1567:
                                            if (!str3.equals("10")) {
                                                num3 = null;
                                            } else {
                                                num3 = 512;
                                            }
                                            break;
                                        case 1568:
                                            if (!str3.equals("11")) {
                                                num3 = null;
                                            } else {
                                                num3 = 1024;
                                            }
                                            break;
                                        case 1569:
                                            if (!str3.equals("12")) {
                                                num3 = null;
                                            } else {
                                                num3 = 2048;
                                            }
                                            break;
                                        case 1570:
                                            if (!str3.equals("13")) {
                                                num3 = null;
                                            } else {
                                                num3 = 4096;
                                            }
                                            break;
                                        default:
                                            num3 = null;
                                            break;
                                    }
                            }
                        } else {
                            num3 = null;
                        }
                        if (num3 != null) {
                            return new Pair(num2, num3);
                        }
                        zzes.zzf("MediaCodecUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str3)));
                    }
                } else {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str2)));
                }
            }
            return null;
        }
        switch (strArrSplit[0]) {
            case "avc1":
            case "avc2":
                String str4 = zzamVar.zzj;
                int length = strArrSplit.length;
                if (length < 2) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i2 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else if (length >= 3) {
                            i = Integer.parseInt(strArrSplit[1]);
                            i2 = Integer.parseInt(strArrSplit[2]);
                        } else {
                            zzes.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str4);
                        }
                        if (i == 66) {
                            i3 = -1;
                            i13 = 1;
                        } else if (i == 77) {
                            i3 = -1;
                        } else if (i == 88) {
                            i3 = -1;
                            i13 = 4;
                        } else if (i == 100) {
                            i3 = -1;
                            i13 = 8;
                        } else if (i == 110) {
                            i3 = -1;
                            i13 = 16;
                        } else if (i == 122) {
                            i3 = -1;
                            i13 = 32;
                        } else if (i != 244) {
                            i3 = -1;
                            i13 = -1;
                        } else {
                            i3 = -1;
                            i13 = 64;
                        }
                        if (i13 == i3) {
                            zzes.zzf("MediaCodecUtil", "Unknown AVC profile: " + i);
                        } else {
                            switch (i2) {
                                case 10:
                                    i4 = 1;
                                    break;
                                case 11:
                                    i4 = 4;
                                    break;
                                case 12:
                                    i4 = 8;
                                    break;
                                case 13:
                                    i4 = 16;
                                    break;
                                default:
                                    switch (i2) {
                                        case 20:
                                            i4 = 32;
                                            break;
                                        case 21:
                                            i4 = 64;
                                            break;
                                        case 22:
                                            i4 = 128;
                                            break;
                                        default:
                                            switch (i2) {
                                                case 30:
                                                    i4 = 256;
                                                    break;
                                                case 31:
                                                    i4 = 512;
                                                    break;
                                                case 32:
                                                    i4 = 1024;
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 40:
                                                            i4 = 2048;
                                                            break;
                                                        case 41:
                                                            i4 = 4096;
                                                            break;
                                                        case 42:
                                                            i4 = 8192;
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case 50:
                                                                    i4 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i4 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i4 = 65536;
                                                                    break;
                                                                default:
                                                                    i4 = -1;
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            if (i4 != -1) {
                                return new Pair(Integer.valueOf(i13), Integer.valueOf(i4));
                            }
                            zzes.zzf("MediaCodecUtil", "Unknown AVC level: " + i2);
                        }
                    } catch (NumberFormatException unused) {
                        zzes.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                    }
                }
                return null;
            case "vp09":
                int i14 = 2048;
                String str5 = zzamVar.zzj;
                if (strArrSplit.length < 3) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                } else {
                    try {
                        int i15 = Integer.parseInt(strArrSplit[1]);
                        int i16 = Integer.parseInt(strArrSplit[2]);
                        if (i15 == 0) {
                            i5 = 1;
                        } else if (i15 == 1) {
                            i5 = 2;
                        } else if (i15 != 2) {
                            i5 = i15 != 3 ? -1 : 8;
                        } else {
                            i5 = 4;
                        }
                        if (i5 == -1) {
                            zzes.zzf("MediaCodecUtil", "Unknown VP9 profile: " + i15);
                        } else {
                            if (i16 == 10) {
                                i6 = -1;
                                i14 = 1;
                            } else if (i16 == 11) {
                                i6 = -1;
                                i14 = 2;
                            } else if (i16 == 20) {
                                i6 = -1;
                                i14 = 4;
                            } else if (i16 == 21) {
                                i6 = -1;
                                i14 = 8;
                            } else if (i16 == 30) {
                                i6 = -1;
                                i14 = 16;
                            } else if (i16 == 31) {
                                i6 = -1;
                                i14 = 32;
                            } else if (i16 == 40) {
                                i6 = -1;
                                i14 = 64;
                            } else if (i16 == 41) {
                                i6 = -1;
                                i14 = 128;
                            } else if (i16 == 50) {
                                i6 = -1;
                                i14 = 256;
                            } else if (i16 != 51) {
                                switch (i16) {
                                    case 60:
                                        i6 = -1;
                                        break;
                                    case 61:
                                        i6 = -1;
                                        i14 = 4096;
                                        break;
                                    case 62:
                                        i6 = -1;
                                        i14 = 8192;
                                        break;
                                    default:
                                        i6 = -1;
                                        i14 = -1;
                                        break;
                                }
                            } else {
                                i6 = -1;
                                i14 = 512;
                            }
                            if (i14 != i6) {
                                return new Pair(Integer.valueOf(i5), Integer.valueOf(i14));
                            }
                            zzes.zzf("MediaCodecUtil", "Unknown VP9 level: " + i16);
                        }
                    } catch (NumberFormatException unused2) {
                        zzes.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                    }
                }
                return null;
            case "hev1":
            case "hvc1":
                String str6 = zzamVar.zzj;
                zzs zzsVar = zzamVar.zzy;
                if (strArrSplit.length < 4) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str6)));
                } else {
                    Matcher matcher2 = zzb.matcher(strArrSplit[1]);
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        if ("1".equals(strGroup2)) {
                            i7 = 1;
                        } else if ("2".equals(strGroup2)) {
                            i7 = (zzsVar == null || zzsVar.zzf != 6) ? 2 : 4096;
                        } else {
                            zzes.zzf("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup2)));
                        }
                        String str7 = strArrSplit[3];
                        if (str7 != null) {
                            switch (str7.hashCode()) {
                                case 70821:
                                    if (!str7.equals("H30")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.CR;
                                    }
                                    break;
                                case 70914:
                                    if (!str7.equals("H60")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.SO;
                                    }
                                    break;
                                case 70917:
                                    if (!str7.equals("H63")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.SI;
                                    }
                                    break;
                                case 71007:
                                    if (!str7.equals("H90")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.DLE;
                                    }
                                    break;
                                case 71010:
                                    if (!str7.equals("H93")) {
                                        b = -1;
                                    } else {
                                        b = 17;
                                    }
                                    break;
                                case 74665:
                                    if (!str7.equals("L30")) {
                                        b = -1;
                                    } else {
                                        b = 0;
                                    }
                                    break;
                                case 74758:
                                    if (!str7.equals("L60")) {
                                        b = -1;
                                    } else {
                                        b = 1;
                                    }
                                    break;
                                case 74761:
                                    if (!str7.equals("L63")) {
                                        b = -1;
                                    } else {
                                        b = 2;
                                    }
                                    break;
                                case 74851:
                                    if (!str7.equals("L90")) {
                                        b = -1;
                                    } else {
                                        b = 3;
                                    }
                                    break;
                                case 74854:
                                    if (!str7.equals("L93")) {
                                        b = -1;
                                    } else {
                                        b = 4;
                                    }
                                    break;
                                case 2193639:
                                    if (!str7.equals("H120")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.DC2;
                                    }
                                    break;
                                case 2193642:
                                    if (!str7.equals("H123")) {
                                        b = -1;
                                    } else {
                                        b = 19;
                                    }
                                    break;
                                case 2193732:
                                    if (!str7.equals("H150")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.DC4;
                                    }
                                    break;
                                case 2193735:
                                    if (!str7.equals("H153")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.NAK;
                                    }
                                    break;
                                case 2193738:
                                    if (!str7.equals("H156")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.SYN;
                                    }
                                    break;
                                case 2193825:
                                    if (!str7.equals("H180")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.ETB;
                                    }
                                    break;
                                case 2193828:
                                    if (!str7.equals("H183")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.CAN;
                                    }
                                    break;
                                case 2193831:
                                    if (!str7.equals("H186")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.EM;
                                    }
                                    break;
                                case 2312803:
                                    if (!str7.equals("L120")) {
                                        b = -1;
                                    } else {
                                        b = 5;
                                    }
                                    break;
                                case 2312806:
                                    if (!str7.equals("L123")) {
                                        b = -1;
                                    } else {
                                        b = 6;
                                    }
                                    break;
                                case 2312896:
                                    if (!str7.equals("L150")) {
                                        b = -1;
                                    } else {
                                        b = 7;
                                    }
                                    break;
                                case 2312899:
                                    if (!str7.equals("L153")) {
                                        b = -1;
                                    } else {
                                        b = 8;
                                    }
                                    break;
                                case 2312902:
                                    if (!str7.equals("L156")) {
                                        b = -1;
                                    } else {
                                        b = 9;
                                    }
                                    break;
                                case 2312989:
                                    if (!str7.equals("L180")) {
                                        b = -1;
                                    } else {
                                        b = 10;
                                    }
                                    break;
                                case 2312992:
                                    if (!str7.equals("L183")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.VT;
                                    }
                                    break;
                                case 2312995:
                                    if (!str7.equals("L186")) {
                                        b = -1;
                                    } else {
                                        b = Ascii.FF;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    num = 1;
                                    break;
                                case 1:
                                    num = 4;
                                    break;
                                case 2:
                                    num = 16;
                                    break;
                                case 3:
                                    num = 64;
                                    break;
                                case 4:
                                    num = 256;
                                    break;
                                case 5:
                                    num = 1024;
                                    break;
                                case 6:
                                    num = 4096;
                                    break;
                                case 7:
                                    num = 16384;
                                    break;
                                case 8:
                                    num = 65536;
                                    break;
                                case 9:
                                    num = 262144;
                                    break;
                                case 10:
                                    num = 1048576;
                                    break;
                                case 11:
                                    num = 4194304;
                                    break;
                                case 12:
                                    num = 16777216;
                                    break;
                                case 13:
                                    num = 2;
                                    break;
                                case 14:
                                    num = 8;
                                    break;
                                case 15:
                                    num = 32;
                                    break;
                                case 16:
                                    num = 128;
                                    break;
                                case 17:
                                    num = 512;
                                    break;
                                case 18:
                                    num = 2048;
                                    break;
                                case 19:
                                    num = 8192;
                                    break;
                                case 20:
                                    num = 32768;
                                    break;
                                case 21:
                                    num = 131072;
                                    break;
                                case 22:
                                    num = 524288;
                                    break;
                                case 23:
                                    num = 2097152;
                                    break;
                                case 24:
                                    num = 8388608;
                                    break;
                                case 25:
                                    num = 33554432;
                                    break;
                                default:
                                    num = null;
                                    break;
                            }
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            return new Pair(Integer.valueOf(i7), num);
                        }
                        zzes.zzf("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(str7)));
                    } else {
                        zzes.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str6)));
                    }
                }
                return null;
            case "av01":
                String str8 = zzamVar.zzj;
                zzs zzsVar2 = zzamVar.zzy;
                if (strArrSplit.length < 4) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str8)));
                } else {
                    try {
                        int i17 = Integer.parseInt(strArrSplit[1]);
                        int i18 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i19 = Integer.parseInt(strArrSplit[3]);
                        if (i17 != 0) {
                            zzes.zzf("MediaCodecUtil", "Unknown AV1 profile: " + i17);
                        } else {
                            if (i19 == 8) {
                                i8 = 1;
                            } else if (i19 != 10) {
                                zzes.zzf("MediaCodecUtil", "Unknown AV1 bit depth: " + i19);
                            } else {
                                i8 = (zzsVar2 == null || !(zzsVar2.zzg != null || (i10 = zzsVar2.zzf) == 7 || i10 == 6)) ? 2 : 4096;
                            }
                            switch (i18) {
                                case 0:
                                    i9 = -1;
                                    i13 = 1;
                                    break;
                                case 1:
                                    i9 = -1;
                                    break;
                                case 2:
                                    i9 = -1;
                                    i13 = 4;
                                    break;
                                case 3:
                                    i9 = -1;
                                    i13 = 8;
                                    break;
                                case 4:
                                    i9 = -1;
                                    i13 = 16;
                                    break;
                                case 5:
                                    i9 = -1;
                                    i13 = 32;
                                    break;
                                case 6:
                                    i9 = -1;
                                    i13 = 64;
                                    break;
                                case 7:
                                    i9 = -1;
                                    i13 = 128;
                                    break;
                                case 8:
                                    i9 = -1;
                                    i13 = 256;
                                    break;
                                case 9:
                                    i9 = -1;
                                    i13 = 512;
                                    break;
                                case 10:
                                    i9 = -1;
                                    i13 = 1024;
                                    break;
                                case 11:
                                    i9 = -1;
                                    i13 = 2048;
                                    break;
                                case 12:
                                    i9 = -1;
                                    i13 = 4096;
                                    break;
                                case 13:
                                    i9 = -1;
                                    i13 = 8192;
                                    break;
                                case 14:
                                    i13 = 16384;
                                    i9 = -1;
                                    break;
                                case 15:
                                    i13 = 32768;
                                    i9 = -1;
                                    break;
                                case 16:
                                    i13 = 65536;
                                    i9 = -1;
                                    break;
                                case 17:
                                    i13 = 131072;
                                    i9 = -1;
                                    break;
                                case 18:
                                    i13 = 262144;
                                    i9 = -1;
                                    break;
                                case 19:
                                    i13 = 524288;
                                    i9 = -1;
                                    break;
                                case 20:
                                    i13 = 1048576;
                                    i9 = -1;
                                    break;
                                case 21:
                                    i13 = 2097152;
                                    i9 = -1;
                                    break;
                                case 22:
                                    i13 = 4194304;
                                    i9 = -1;
                                    break;
                                case 23:
                                    i13 = 8388608;
                                    i9 = -1;
                                    break;
                                default:
                                    i9 = -1;
                                    i13 = -1;
                                    break;
                            }
                            if (i13 != i9) {
                                return new Pair(Integer.valueOf(i8), Integer.valueOf(i13));
                            }
                            zzes.zzf("MediaCodecUtil", "Unknown AV1 level: " + i18);
                        }
                    } catch (NumberFormatException unused3) {
                        zzes.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str8)));
                    }
                }
                return null;
            case "mp4a":
                String str9 = zzamVar.zzj;
                if (strArrSplit.length != 3) {
                    zzes.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str9)));
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(zzcc.zzd(Integer.parseInt(strArrSplit[1], 16)))) {
                            int i20 = Integer.parseInt(strArrSplit[2]);
                            if (i20 != 17) {
                                if (i20 == 20) {
                                    i12 = -1;
                                    i11 = 20;
                                } else if (i20 == 23) {
                                    i11 = 23;
                                } else if (i20 == 29) {
                                    i11 = 29;
                                } else if (i20 == 39) {
                                    i11 = 39;
                                } else if (i20 != 42) {
                                    switch (i20) {
                                        case 1:
                                            i12 = -1;
                                            i11 = 1;
                                            break;
                                        case 2:
                                            i12 = -1;
                                            i11 = 2;
                                            break;
                                        case 3:
                                            i12 = -1;
                                            i11 = 3;
                                            break;
                                        case 4:
                                            i12 = -1;
                                            i11 = 4;
                                            break;
                                        case 5:
                                            i12 = -1;
                                            i11 = 5;
                                            break;
                                        case 6:
                                            i12 = -1;
                                            i11 = 6;
                                            break;
                                        default:
                                            i12 = -1;
                                            i11 = -1;
                                            break;
                                    }
                                } else {
                                    i11 = 42;
                                }
                                if (i11 != i12) {
                                    return new Pair(Integer.valueOf(i11), 0);
                                }
                            } else {
                                i11 = 17;
                            }
                            i12 = -1;
                            if (i11 != i12) {
                                return new Pair(Integer.valueOf(i11), 0);
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        zzes.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str9)));
                    }
                }
                return null;
            default:
                return null;
        }
    }

    public static zzrw zzc(String str, boolean z, boolean z2) throws zzsj {
        List listZzg = zzg(str, false, false);
        if (listZzg.isEmpty()) {
            return null;
        }
        return (zzrw) listZzg.get(0);
    }

    public static zzrw zzd() throws zzsj {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzam zzamVar) {
        Pair pairZzb;
        if ("audio/eac3-joc".equals(zzamVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzamVar.zzm) || (pairZzb = zzb(zzamVar)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairZzb.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List zzf(zzsc zzscVar, zzam zzamVar, boolean z, boolean z2) throws zzsj {
        String strZze = zze(zzamVar);
        return strZze == null ? zzfud.zzl() : zzg(strZze, z, z2);
    }

    public static synchronized List zzg(String str, boolean z, boolean z2) throws zzsj {
        int i;
        zzsh zzshVar = new zzsh(str, z, z2);
        HashMap map = zzc;
        List list = (List) map.get(zzshVar);
        if (list != null) {
            return list;
        }
        ArrayList arrayListZzj = zzj(zzshVar, zzfk.zza >= 21 ? new zzsn(z, z2) : new zzsm(null));
        if (z && arrayListZzj.isEmpty() && (i = zzfk.zza) >= 21 && i <= 23) {
            arrayListZzj = zzj(zzshVar, new zzsm(null));
            if (!arrayListZzj.isEmpty()) {
                zzes.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzrw) arrayListZzj.get(0)).zza);
            }
        }
        if ("audio/raw".equals(str)) {
            if (zzfk.zza < 26 && zzfk.zzb.equals("R9") && arrayListZzj.size() == 1 && ((zzrw) arrayListZzj.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzj.add(zzrw.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            zzk(arrayListZzj, new zzso() { // from class: com.google.android.gms.internal.ads.zzsf
                @Override // com.google.android.gms.internal.ads.zzso
                public final int zza(Object obj) {
                    int i2 = zzsp.zza;
                    String str2 = ((zzrw) obj).zza;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (zzfk.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        if (zzfk.zza < 21 && arrayListZzj.size() > 1) {
            String str2 = ((zzrw) arrayListZzj.get(0)).zza;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                zzk(arrayListZzj, new zzso() { // from class: com.google.android.gms.internal.ads.zzsg
                    @Override // com.google.android.gms.internal.ads.zzso
                    public final int zza(Object obj) {
                        int i2 = zzsp.zza;
                        return ((zzrw) obj).zza.startsWith("OMX.google") ? 1 : 0;
                    }
                });
            }
        }
        if (zzfk.zza < 32 && arrayListZzj.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzrw) arrayListZzj.get(0)).zza)) {
            arrayListZzj.add((zzrw) arrayListZzj.remove(0));
        }
        zzfud zzfudVarZzj = zzfud.zzj(arrayListZzj);
        map.put(zzshVar, zzfudVarZzj);
        return zzfudVarZzj;
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzh(zzsc zzscVar, zzam zzamVar, boolean z, boolean z2) throws zzsj {
        List listZzg = zzg(zzamVar.zzm, z, z2);
        List listZzf = zzf(zzscVar, zzamVar, z, z2);
        zzfua zzfuaVar = new zzfua();
        zzfuaVar.zzh(listZzg);
        zzfuaVar.zzh(listZzf);
        return zzfuaVar.zzi();
    }

    public static List zzi(List list, final zzam zzamVar) {
        ArrayList arrayList = new ArrayList(list);
        zzk(arrayList, new zzso() { // from class: com.google.android.gms.internal.ads.zzsd
            @Override // com.google.android.gms.internal.ads.zzso
            public final int zza(Object obj) {
                zzam zzamVar2 = zzamVar;
                int i = zzsp.zza;
                return ((zzrw) obj).zzd(zzamVar2) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01d5 A[EDGE_INSN: B:116:0x01d5->B:117:0x01d6 BREAK  A[LOOP:1: B:85:0x0165->B:89:0x0171]] */
    /* JADX WARN: Code duplicated, block: B:126:0x01fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:128:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0202  */
    /* JADX WARN: Code duplicated, block: B:132:0x0209 A[Catch: Exception -> 0x02b3, TryCatch #4 {Exception -> 0x02b3, blocks: (B:118:0x01d8, B:124:0x01ef, B:130:0x0203, B:132:0x0209, B:137:0x0218, B:139:0x0222, B:149:0x024c, B:140:0x0227, B:142:0x0237, B:144:0x023f, B:133:0x020f), top: B:198:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x020f A[Catch: Exception -> 0x02b3, TryCatch #4 {Exception -> 0x02b3, blocks: (B:118:0x01d8, B:124:0x01ef, B:130:0x0203, B:132:0x0209, B:137:0x0218, B:139:0x0222, B:149:0x024c, B:140:0x0227, B:142:0x0237, B:144:0x023f, B:133:0x020f), top: B:198:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0215  */
    /* JADX WARN: Code duplicated, block: B:136:0x0217  */
    /* JADX WARN: Code duplicated, block: B:139:0x0222 A[Catch: Exception -> 0x02b3, TryCatch #4 {Exception -> 0x02b3, blocks: (B:118:0x01d8, B:124:0x01ef, B:130:0x0203, B:132:0x0209, B:137:0x0218, B:139:0x0222, B:149:0x024c, B:140:0x0227, B:142:0x0237, B:144:0x023f, B:133:0x020f), top: B:198:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0227 A[Catch: Exception -> 0x02b3, TryCatch #4 {Exception -> 0x02b3, blocks: (B:118:0x01d8, B:124:0x01ef, B:130:0x0203, B:132:0x0209, B:137:0x0218, B:139:0x0222, B:149:0x024c, B:140:0x0227, B:142:0x0237, B:144:0x023f, B:133:0x020f), top: B:198:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0237 A[Catch: Exception -> 0x02b3, TryCatch #4 {Exception -> 0x02b3, blocks: (B:118:0x01d8, B:124:0x01ef, B:130:0x0203, B:132:0x0209, B:137:0x0218, B:139:0x0222, B:149:0x024c, B:140:0x0227, B:142:0x0237, B:144:0x023f, B:133:0x020f), top: B:198:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0249  */
    /* JADX WARN: Code duplicated, block: B:149:0x024c A[Catch: Exception -> 0x02b3, TRY_LEAVE, TryCatch #4 {Exception -> 0x02b3, blocks: (B:118:0x01d8, B:124:0x01ef, B:130:0x0203, B:132:0x0209, B:137:0x0218, B:139:0x0222, B:149:0x024c, B:140:0x0227, B:142:0x0237, B:144:0x023f, B:133:0x020f), top: B:198:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0250 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x0256  */
    /* JADX WARN: Code duplicated, block: B:163:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x02c2 A[Catch: Exception -> 0x0310, TRY_ENTER, TryCatch #1 {Exception -> 0x0310, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0033, B:14:0x0041, B:16:0x0047, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:30:0x007d, B:33:0x0085, B:35:0x008d, B:37:0x0095, B:39:0x009d, B:41:0x00a7, B:43:0x00b1, B:45:0x00bb, B:47:0x00c5, B:49:0x00cf, B:51:0x00d9, B:53:0x00e3, B:55:0x00ed, B:58:0x00f5, B:60:0x00fd, B:62:0x0105, B:64:0x010f, B:66:0x0119, B:68:0x0121, B:70:0x012b, B:72:0x0135, B:74:0x0139, B:76:0x0141, B:78:0x0149, B:80:0x014f, B:82:0x0157, B:84:0x015f, B:86:0x0167, B:176:0x02ba, B:179:0x02c2, B:181:0x02c8, B:182:0x02e2, B:183:0x0303, B:89:0x0171, B:90:0x0176, B:92:0x017e, B:95:0x0189, B:97:0x0191, B:100:0x019c, B:102:0x01a4, B:105:0x01af, B:107:0x01b7, B:110:0x01c2, B:112:0x01ca), top: B:192:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x02e2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0304 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    private static ArrayList zzj(zzsh zzshVar, zzsk zzskVar) throws zzsj {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        String str4;
        boolean zZzd;
        boolean zZzc;
        boolean zIsHardwareAccelerated;
        boolean zZzl;
        String strZza;
        boolean zIsVendor;
        zzsh zzshVar2 = zzshVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = zzshVar2.zza;
            boolean zZze = zzskVar.zze();
            int i3 = 0;
            for (int iZza = zzskVar.zza(); i3 < iZza; iZza = i2) {
                MediaCodecInfo mediaCodecInfoZzb = zzskVar.zzb(i3);
                if (zzfk.zza < 29 || !mediaCodecInfoZzb.isAlias()) {
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || ((!zZze && name.endsWith(".secure")) || ((zzfk.zza < 21 && ("CIPAACDecoder".equals(name) || "CIPMP3Decoder".equals(name) || "CIPVorbisDecoder".equals(name) || "CIPAMRNBDecoder".equals(name) || "AACDecoder".equals(name) || "MP3Decoder".equals(name))) || ((zzfk.zza < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(zzfk.zzc) && (zzfk.zzb.startsWith("zeroflte") || zzfk.zzb.startsWith("zerolte") || zzfk.zzb.startsWith("zenlte") || "SC-05G".equals(zzfk.zzb) || "marinelteatt".equals(zzfk.zzb) || "404SC".equals(zzfk.zzb) || "SC-04G".equals(zzfk.zzb) || "SCV31".equals(zzfk.zzb)))) || ((zzfk.zza <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(zzfk.zzc) && (zzfk.zzb.startsWith("d2") || zzfk.zzb.startsWith("serrano") || zzfk.zzb.startsWith("jflte") || zzfk.zzb.startsWith("santos") || zzfk.zzb.startsWith("t0"))) || ((zzfk.zza <= 19 && zzfk.zzb.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(name)) || (zzfk.zza <= 23 && "audio/eac3-joc".equals(str5) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)))))))) {
                        i = i3;
                        i2 = iZza;
                        str4 = str5;
                    } else {
                        String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                str = supportedTypes[i4];
                                if (!str.equalsIgnoreCase(str5)) {
                                    i4++;
                                }
                            } else if (str5.equals("video/dolby-vision")) {
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                } else {
                                    str = "video/hevcdv";
                                }
                            } else if (str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (!str5.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                    str2 = null;
                                    break;
                                }
                                str = "audio/lg-ac3";
                            }
                            str2 = str;
                            break;
                        }
                        if (str2 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str2);
                                boolean zZzd2 = zzskVar.zzd("tunneled-playback", str2, capabilitiesForType);
                                boolean zZzc2 = zzskVar.zzc("tunneled-playback", str2, capabilitiesForType);
                                if (zzshVar2.zzc) {
                                    if (zZzd2) {
                                        zZzd = zzskVar.zzd("secure-playback", str2, capabilitiesForType);
                                        zZzc = zzskVar.zzc("secure-playback", str2, capabilitiesForType);
                                        if (zzshVar2.zzb) {
                                            if (zZzd) {
                                                zZzd = true;
                                                if (zzfk.zza >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                                zZzl = zzl(mediaCodecInfoZzb, str5);
                                                if (zzfk.zza >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfqo.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    if (!zZze) {
                                                        if (!zzshVar2.zzb) {
                                                            i = i3;
                                                            i2 = iZza;
                                                            str4 = str5;
                                                            arrayList.add(zzrw.zzc(name, str5, str2, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                        }
                                                    }
                                                    i = i3;
                                                    i2 = iZza;
                                                    str4 = str5;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                } else {
                                                    if (!zZze) {
                                                        if (!zzshVar2.zzb) {
                                                            i = i3;
                                                            i2 = iZza;
                                                            str4 = str5;
                                                            arrayList.add(zzrw.zzc(name, str5, str2, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                        }
                                                    }
                                                    i = i3;
                                                    i2 = iZza;
                                                    str4 = str5;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (!zZzc) {
                                            if (zzfk.zza >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (zzfk.zza >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfqo.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzshVar2.zzb) {
                                                        i = i3;
                                                        i2 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrw.zzc(name, str5, str2, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    }
                                                }
                                                i = i3;
                                                i2 = iZza;
                                                str4 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzshVar2.zzb) {
                                                        i = i3;
                                                        i2 = iZza;
                                                        str4 = str5;
                                                        arrayList.add(zzrw.zzc(name, str5, str2, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                    }
                                                }
                                                i = i3;
                                                i2 = iZza;
                                                str4 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (!zZzc2) {
                                    zZzd = zzskVar.zzd("secure-playback", str2, capabilitiesForType);
                                    zZzc = zzskVar.zzc("secure-playback", str2, capabilitiesForType);
                                    if (zzshVar2.zzb) {
                                        if (!zZzc) {
                                            if (zzfk.zza >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzl(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzl = zzl(mediaCodecInfoZzb, str5);
                                            if (zzfk.zza >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfqo.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = true;
                                                }
                                            }
                                            if (zZze || zzshVar2.zzb != zZzd) {
                                                if (!zZze) {
                                                    try {
                                                        if (!zzshVar2.zzb) {
                                                            i = i3;
                                                            i2 = iZza;
                                                            str4 = str5;
                                                            try {
                                                                arrayList.add(zzrw.zzc(name, str5, str2, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                            } catch (Exception e) {
                                                                e = e;
                                                                str3 = name;
                                                                if (zzfk.zza <= 23) {
                                                                }
                                                                zzes.zzc("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                                throw e;
                                                            }
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        i = i3;
                                                        i2 = iZza;
                                                        str4 = str5;
                                                        str3 = name;
                                                        if (zzfk.zza <= 23) {
                                                        }
                                                        zzes.zzc("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                        throw e;
                                                    }
                                                }
                                                i = i3;
                                                i2 = iZza;
                                                str4 = str5;
                                                if (zZze && zZzd) {
                                                    StringBuilder sb = new StringBuilder();
                                                    try {
                                                        sb.append(name);
                                                        sb.append(".secure");
                                                        str3 = name;
                                                        try {
                                                            arrayList.add(zzrw.zzc(sb.toString(), str4, str2, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, true));
                                                            return arrayList;
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            if (zzfk.zza <= 23 || arrayList.isEmpty()) {
                                                                zzes.zzc("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                                throw e;
                                                            }
                                                            zzes.zzc("MediaCodecUtil", "Skipping codec " + str3 + " (failed to query capabilities)");
                                                            i3 = i + 1;
                                                            zzshVar2 = zzshVar;
                                                            str5 = str4;
                                                        }
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        str3 = name;
                                                    }
                                                }
                                            } else {
                                                i = i3;
                                                i2 = iZza;
                                                str4 = str5;
                                                arrayList.add(zzrw.zzc(name, str5, str2, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                            }
                                        }
                                    } else if (zZzd) {
                                        zZzd = true;
                                        if (zzfk.zza >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzl(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzl = zzl(mediaCodecInfoZzb, str5);
                                        if (zzfk.zza >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfqo.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!zzshVar2.zzb) {
                                                    i = i3;
                                                    i2 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrw.zzc(name, str5, str2, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                }
                                            }
                                            i = i3;
                                            i2 = iZza;
                                            str4 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!zzshVar2.zzb) {
                                                    i = i3;
                                                    i2 = iZza;
                                                    str4 = str5;
                                                    arrayList.add(zzrw.zzc(name, str5, str2, capabilitiesForType, zIsHardwareAccelerated, zZzl, zIsVendor, false, false));
                                                }
                                            }
                                            i = i3;
                                            i2 = iZza;
                                            str4 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i = i3;
                                i2 = iZza;
                                str4 = str5;
                            } catch (Exception e5) {
                                e = e5;
                                str3 = name;
                                i = i3;
                                i2 = iZza;
                                str4 = str5;
                            }
                        } else {
                            i = i3;
                            i2 = iZza;
                            str4 = str5;
                        }
                    }
                } else {
                    i = i3;
                    i2 = iZza;
                    str4 = str5;
                }
                i3 = i + 1;
                zzshVar2 = zzshVar;
                str5 = str4;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new zzsj(e6, null);
        }
    }

    private static void zzk(List list, final zzso zzsoVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzse
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzso zzsoVar2 = zzsoVar;
                int i = zzsp.zza;
                return zzsoVar2.zza(obj2) - zzsoVar2.zza(obj);
            }
        });
    }

    private static boolean zzl(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzfk.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzcc.zzf(str)) {
            return true;
        }
        String strZza = zzfqo.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }
}
