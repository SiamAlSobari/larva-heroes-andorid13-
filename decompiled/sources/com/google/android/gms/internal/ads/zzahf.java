package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzahf {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzabc zzabcVar) throws IOException {
        return zzc(zzabcVar, true, false);
    }

    public static boolean zzb(zzabc zzabcVar, boolean z) throws IOException {
        return zzc(zzabcVar, false, false);
    }

    private static boolean zzc(zzabc zzabcVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        long jZzs;
        int i;
        long jZzd = zzabcVar.zzd();
        long j = 4096;
        long j2 = -1;
        if (jZzd != -1 && jZzd <= 4096) {
            j = jZzd;
        }
        zzfb zzfbVar = new zzfb(64);
        int i2 = (int) j;
        int i3 = 0;
        boolean z4 = false;
        while (true) {
            if (i3 < i2) {
                zzfbVar.zzD(8);
                if (zzabcVar.zzm(zzfbVar.zzI(), 0, 8, true)) {
                    long jZzt = zzfbVar.zzt();
                    int iZzf = zzfbVar.zzf();
                    if (jZzt == 1) {
                        zzabcVar.zzh(zzfbVar.zzI(), 8, 8);
                        i = 16;
                        zzfbVar.zzF(16);
                        jZzs = zzfbVar.zzs();
                    } else {
                        if (jZzt == 0) {
                            long jZzd2 = zzabcVar.zzd();
                            if (jZzd2 != j2) {
                                jZzt = 8 + (jZzd2 - zzabcVar.zze());
                            }
                        }
                        jZzs = jZzt;
                        i = 8;
                    }
                    long j3 = i;
                    if (jZzs < j3) {
                        return false;
                    }
                    i3 += i;
                    if (iZzf == 1836019574) {
                        i2 += (int) jZzs;
                        if (jZzd != -1 && i2 > jZzd) {
                            i2 = (int) jZzd;
                        }
                        j2 = -1;
                    } else {
                        if (iZzf == 1836019558 || iZzf == 1836475768) {
                            z3 = true;
                            return !z4 && z == z3;
                        }
                        long j4 = jZzd;
                        if ((((long) i3) + jZzs) - j3 < i2) {
                            int i4 = (int) (jZzs - j3);
                            i3 += i4;
                            if (iZzf == 1718909296) {
                                if (i4 < 8) {
                                    return false;
                                }
                                zzfbVar.zzD(i4);
                                zzabcVar.zzh(zzfbVar.zzI(), 0, i4);
                                int i5 = i4 >> 2;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if (i6 != 1) {
                                        int iZzf2 = zzfbVar.zzf();
                                        if ((iZzf2 >>> 8) != 3368816) {
                                            if (iZzf2 == 1751476579) {
                                                iZzf2 = 1751476579;
                                            }
                                            int[] iArr = zza;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 >= 29) {
                                                    continue;
                                                } else if (iArr[i7] != iZzf2) {
                                                    i7++;
                                                }
                                            }
                                        }
                                        z4 = true;
                                        break;
                                    }
                                    zzfbVar.zzH(4);
                                }
                                if (!z4) {
                                    return false;
                                }
                            } else if (i4 != 0) {
                                zzabcVar.zzg(i4);
                            }
                            j2 = -1;
                            jZzd = j4;
                        }
                    }
                }
            }
            z3 = false;
            if (z4) {
            }
        }
    }
}
