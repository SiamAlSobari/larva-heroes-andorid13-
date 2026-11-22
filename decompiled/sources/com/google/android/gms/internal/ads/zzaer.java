package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaer {
    public static final zzaep zza = new zzaep() { // from class: com.google.android.gms.internal.ads.zzaeo
    };

    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:58:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc A[SYNTHETIC] */
    public static final zzbz zza(byte[] bArr, int i, zzaep zzaepVar, zzads zzadsVar) throws Throwable {
        boolean z;
        zzaeq zzaeqVar;
        int i2;
        int iZze;
        zzaes zzaesVarZzf;
        ArrayList arrayList = new ArrayList();
        zzfb zzfbVar = new zzfb(bArr, i);
        boolean z2 = false;
        if (zzfbVar.zza() < 10) {
            zzes.zzf("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzn = zzfbVar.zzn();
            if (iZzn == 4801587) {
                int iZzl = zzfbVar.zzl();
                zzfbVar.zzH(1);
                int iZzl2 = zzfbVar.zzl();
                int iZzk = zzfbVar.zzk();
                if (iZzl != 2) {
                    if (iZzl == 3) {
                        if ((iZzl2 & 64) != 0) {
                            int iZzf = zzfbVar.zzf();
                            zzfbVar.zzH(iZzf);
                            iZzk -= iZzf + 4;
                        }
                    } else if (iZzl == 4) {
                        if ((iZzl2 & 64) != 0) {
                            int iZzk2 = zzfbVar.zzk();
                            zzfbVar.zzH(iZzk2 - 4);
                            iZzk -= iZzk2;
                        }
                        if ((iZzl2 & 16) != 0) {
                            iZzk -= 10;
                        }
                    } else {
                        zzes.zzf("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iZzl);
                    }
                    if (iZzl < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zzaeqVar = new zzaeq(iZzl, z, iZzk);
                } else if ((iZzl2 & 64) != 0) {
                    zzes.zzf("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZzl < 4 || (iZzl2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zzaeqVar = new zzaeq(iZzl, z, iZzk);
                }
                if (zzaeqVar == null) {
                    return null;
                }
                int iZzc = zzfbVar.zzc();
                i2 = zzaeqVar.zza == 2 ? 6 : 10;
                iZze = zzaeqVar.zzc;
                if (zzaeqVar.zzb) {
                    iZze = zze(zzfbVar, zzaeqVar.zzc);
                }
                zzfbVar.zzF(iZzc + iZze);
                if (!zzk(zzfbVar, zzaeqVar.zza, i2, false)) {
                    if (zzaeqVar.zza == 4 || !zzk(zzfbVar, 4, i2, true)) {
                        zzes.zzf("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + zzaeqVar.zza);
                        return null;
                    }
                    z2 = true;
                }
                while (zzfbVar.zza() >= i2) {
                    zzaesVarZzf = zzf(zzaeqVar.zza, zzfbVar, z2, i2, zzaepVar);
                    if (zzaesVarZzf != null) {
                        arrayList.add(zzaesVarZzf);
                    }
                }
                return new zzbz(arrayList);
            }
            zzes.zzf("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(iZzn)))));
        }
        zzaeqVar = null;
        if (zzaeqVar == null) {
            return null;
        }
        int iZzc2 = zzfbVar.zzc();
        if (zzaeqVar.zza == 2) {
        }
        iZze = zzaeqVar.zzc;
        if (zzaeqVar.zzb) {
            iZze = zze(zzfbVar, zzaeqVar.zzc);
        }
        zzfbVar.zzF(iZzc2 + iZze);
        if (!zzk(zzfbVar, zzaeqVar.zza, i2, false)) {
            if (zzaeqVar.zza == 4) {
            }
            zzes.zzf("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + zzaeqVar.zza);
            return null;
        }
        while (zzfbVar.zza() >= i2) {
            zzaesVarZzf = zzf(zzaeqVar.zza, zzfbVar, z2, i2, zzaepVar);
            if (zzaesVarZzf != null) {
                arrayList.add(zzaesVarZzf);
            }
        }
        return new zzbz(arrayList);
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int iZzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iZzd;
        }
        while (true) {
            int length = bArr.length;
            if (iZzd >= length - 1) {
                return length;
            }
            if ((iZzd - i) % 2 == 0 && bArr[iZzd + 1] == 0) {
                return iZzd;
            }
            iZzd = zzd(bArr, iZzd + 1);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzfb zzfbVar, int i) {
        byte[] bArrZzI = zzfbVar.zzI();
        int iZzc = zzfbVar.zzc();
        int i2 = iZzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iZzc + i) {
                return i;
            }
            if ((bArrZzI[i2] & 255) == 255 && bArrZzI[i3] == 0) {
                System.arraycopy(bArrZzI, i2 + 2, bArrZzI, i3, (i - (i2 - iZzc)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0287 A[Catch: all -> 0x0521, TryCatch #0 {all -> 0x0521, blocks: (B:226:0x04fc, B:125:0x0219, B:143:0x0275, B:145:0x0287, B:152:0x02cc, B:149:0x02a9, B:151:0x02c2, B:164:0x030e, B:173:0x0355, B:176:0x038a, B:179:0x039b, B:180:0x03a3, B:182:0x03a9, B:184:0x03b0, B:185:0x03b4, B:192:0x03d6, B:196:0x0401, B:198:0x040b, B:199:0x043e, B:200:0x044a, B:202:0x0450, B:204:0x0457, B:205:0x045b, B:209:0x0470, B:218:0x049b, B:220:0x04c5, B:221:0x04d4, B:224:0x04eb), top: B:238:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a9 A[Catch: all -> 0x0521, TryCatch #0 {all -> 0x0521, blocks: (B:226:0x04fc, B:125:0x0219, B:143:0x0275, B:145:0x0287, B:152:0x02cc, B:149:0x02a9, B:151:0x02c2, B:164:0x030e, B:173:0x0355, B:176:0x038a, B:179:0x039b, B:180:0x03a3, B:182:0x03a9, B:184:0x03b0, B:185:0x03b4, B:192:0x03d6, B:196:0x0401, B:198:0x040b, B:199:0x043e, B:200:0x044a, B:202:0x0450, B:204:0x0457, B:205:0x045b, B:209:0x0470, B:218:0x049b, B:220:0x04c5, B:221:0x04d4, B:224:0x04eb), top: B:238:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02c2 A[Catch: all -> 0x0521, TryCatch #0 {all -> 0x0521, blocks: (B:226:0x04fc, B:125:0x0219, B:143:0x0275, B:145:0x0287, B:152:0x02cc, B:149:0x02a9, B:151:0x02c2, B:164:0x030e, B:173:0x0355, B:176:0x038a, B:179:0x039b, B:180:0x03a3, B:182:0x03a9, B:184:0x03b0, B:185:0x03b4, B:192:0x03d6, B:196:0x0401, B:198:0x040b, B:199:0x043e, B:200:0x044a, B:202:0x0450, B:204:0x0457, B:205:0x045b, B:209:0x0470, B:218:0x049b, B:220:0x04c5, B:221:0x04d4, B:224:0x04eb), top: B:238:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:167:0x0349 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x034b  */
    /* JADX WARN: Code duplicated, block: B:187:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:210:0x0481  */
    /* JADX WARN: Code duplicated, block: B:212:0x0489  */
    /* JADX WARN: Code duplicated, block: B:214:0x048f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0497  */
    /* JADX WARN: Code duplicated, block: B:222:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:223:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:226:0x04fc A[Catch: all -> 0x0521, TRY_LEAVE, TryCatch #0 {all -> 0x0521, blocks: (B:226:0x04fc, B:125:0x0219, B:143:0x0275, B:145:0x0287, B:152:0x02cc, B:149:0x02a9, B:151:0x02c2, B:164:0x030e, B:173:0x0355, B:176:0x038a, B:179:0x039b, B:180:0x03a3, B:182:0x03a9, B:184:0x03b0, B:185:0x03b4, B:192:0x03d6, B:196:0x0401, B:198:0x040b, B:199:0x043e, B:200:0x044a, B:202:0x0450, B:204:0x0457, B:205:0x045b, B:209:0x0470, B:218:0x049b, B:220:0x04c5, B:221:0x04d4, B:224:0x04eb), top: B:238:0x00f4 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:226:0x04fc, please report this as an issue */
    private static zzaes zzf(int i, zzfb zzfbVar, boolean z, int i2, zzaep zzaepVar) throws Throwable {
        int iZzo;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        int iZzd;
        String strZza;
        int iZzl = zzfbVar.zzl();
        int iZzl2 = zzfbVar.zzl();
        int iZzl3 = zzfbVar.zzl();
        int iZzl4 = i >= 3 ? zzfbVar.zzl() : 0;
        if (i == 4) {
            iZzo = zzfbVar.zzo();
            if (!z) {
                iZzo = ((iZzo >> 24) << 21) | (iZzo & 255) | (((iZzo >> 8) & 255) << 7) | (((iZzo >> 16) & 255) << 14);
            }
        } else {
            iZzo = i == 3 ? zzfbVar.zzo() : zzfbVar.zzn();
        }
        int iZzp = i >= 3 ? zzfbVar.zzp() : 0;
        zzaes zzaefVar = null;
        if (iZzl == 0 && iZzl2 == 0 && iZzl3 == 0 && iZzl4 == 0 && iZzo == 0 && iZzp == 0) {
            zzfbVar.zzG(zzfbVar.zzd());
            return null;
        }
        int iZzc = zzfbVar.zzc() + iZzo;
        String str = "Id3Decoder";
        if (iZzc > zzfbVar.zzd()) {
            zzes.zzf("Id3Decoder", "Frame size exceeds remaining tag data");
            zzfbVar.zzG(zzfbVar.zzd());
            return null;
        }
        if (zzaepVar != null) {
            zzfbVar.zzG(iZzc);
            return null;
        }
        if (i == 3) {
            i3 = (iZzp & 128) != 0 ? 1 : 0;
            boolean z5 = (iZzp & 64) != 0;
            z2 = (iZzp & 32) != 0;
            z3 = z5;
            z4 = false;
            i4 = i3;
        } else if (i == 4) {
            boolean z6 = (iZzp & 64) != 0;
            i4 = (iZzp & 8) != 0 ? 1 : 0;
            z3 = (iZzp & 4) != 0;
            z4 = (iZzp & 2) != 0;
            int i8 = iZzp & 1;
            z2 = z6;
            i3 = i8;
        } else {
            i3 = 0;
            z2 = false;
            i4 = 0;
            z3 = false;
            z4 = false;
        }
        if (i4 != 0 || z3) {
            zzes.zzf("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzfbVar.zzG(iZzc);
            return null;
        }
        if (z2) {
            zzfbVar.zzH(1);
            iZzo--;
        }
        if (i3 != 0) {
            zzfbVar.zzH(4);
            iZzo -= 4;
        }
        if (z4) {
            iZzo = zze(zzfbVar, iZzo);
        }
        try {
            try {
                if (iZzl != 84 || iZzl2 != 88 || iZzl3 != 88 || (i != 2 && iZzl4 != 88)) {
                    if (iZzl == 84) {
                        String strZzi = zzi(i, 84, iZzl2, iZzl3, iZzl4);
                        if (iZzo > 0) {
                            int iZzl5 = zzfbVar.zzl();
                            int i9 = iZzo - 1;
                            byte[] bArr2 = new byte[i9];
                            zzfbVar.zzC(bArr2, 0, i9);
                            zzaefVar = new zzafa(strZzi, null, zzg(bArr2, iZzl5, 0));
                        }
                        i7 = iZzl4;
                        iZzc = iZzc;
                        if (zzaefVar == null) {
                            zzes.zzf(str, "Failed to decode frame: id=" + zzi(i, iZzl, iZzl2, iZzl3, i7) + ", frameSize=" + iZzo);
                        }
                        zzfbVar.zzG(iZzc);
                        return zzaefVar;
                    }
                    if (iZzl != 87) {
                        i5 = iZzl;
                    } else if (iZzl2 != 88 || iZzl3 != 88 || (i != 2 && iZzl4 != 88)) {
                        i5 = 87;
                    } else if (iZzo > 0) {
                        int iZzl6 = zzfbVar.zzl();
                        int i10 = iZzo - 1;
                        byte[] bArr3 = new byte[i10];
                        zzfbVar.zzC(bArr3, 0, i10);
                        int iZzc2 = zzc(bArr3, 0, iZzl6);
                        String str2 = new String(bArr3, 0, iZzc2, zzj(iZzl6));
                        int iZzb = iZzc2 + zzb(iZzl6);
                        zzaefVar = new zzafc("WXXX", str2, zzh(bArr3, iZzb, zzd(bArr3, iZzb), zzfqu.zzb));
                    }
                    if (i5 != 87) {
                        if (i5 == 80) {
                            if (iZzl2 == 82 && iZzl3 == 73 && iZzl4 == 86) {
                                byte[] bArr4 = new byte[iZzo];
                                zzfbVar.zzC(bArr4, 0, iZzo);
                                int iZzd2 = zzd(bArr4, 0);
                                zzaefVar = new zzaey(new String(bArr4, 0, iZzd2, zzfqu.zzb), zzl(bArr4, iZzd2 + 1, iZzo));
                            } else {
                                i5 = 80;
                            }
                        }
                        if (i5 == 71) {
                            if (iZzl2 == 69 && iZzl3 == 79 && (iZzl4 == 66 || i == 2)) {
                                try {
                                    int iZzl7 = zzfbVar.zzl();
                                    Charset charsetZzj = zzj(iZzl7);
                                    int i11 = iZzo - 1;
                                    byte[] bArr5 = new byte[i11];
                                    zzfbVar.zzC(bArr5, 0, i11);
                                    int iZzd3 = zzd(bArr5, 0);
                                    iZzc = iZzc;
                                    String str3 = new String(bArr5, 0, iZzd3, zzfqu.zzb);
                                    int i12 = iZzd3 + 1;
                                    int iZzc3 = zzc(bArr5, i12, iZzl7);
                                    String strZzh = zzh(bArr5, i12, iZzc3, charsetZzj);
                                    int iZzb2 = iZzc3 + zzb(iZzl7);
                                    int iZzc4 = zzc(bArr5, iZzb2, iZzl7);
                                    iZzl = iZzl;
                                    str = "Id3Decoder";
                                    zzaefVar = new zzaen(str3, strZzh, zzh(bArr5, iZzb2, iZzc4, charsetZzj), zzl(bArr5, iZzc4 + zzb(iZzl7), i11));
                                } catch (Throwable th) {
                                    th = th;
                                    zzfbVar.zzG(iZzc);
                                    throw th;
                                }
                            } else {
                                i5 = 71;
                            }
                            i7 = iZzl4;
                            if (zzaefVar == null) {
                                zzes.zzf(str, "Failed to decode frame: id=" + zzi(i, iZzl, iZzl2, iZzl3, i7) + ", frameSize=" + iZzo);
                            }
                            zzfbVar.zzG(iZzc);
                            return zzaefVar;
                        }
                        if (i == 2) {
                            if (i5 == 80 && iZzl2 == 73 && iZzl3 == 67) {
                                int iZzl8 = zzfbVar.zzl();
                                Charset charsetZzj2 = zzj(iZzl8);
                                int i13 = iZzo - 1;
                                bArr = new byte[i13];
                                zzfbVar.zzC(bArr, 0, i13);
                                if (i == 2) {
                                    strZza = "image/".concat(String.valueOf(zzfqo.zza(new String(bArr, 0, 3, zzfqu.zzb))));
                                    if ("image/jpg".equals(strZza)) {
                                        strZza = "image/jpeg";
                                    }
                                    iZzd = 2;
                                } else {
                                    iZzd = zzd(bArr, 0);
                                    strZza = zzfqo.zza(new String(bArr, 0, iZzd, zzfqu.zzb));
                                    if (strZza.indexOf(47) == -1) {
                                        strZza = "image/".concat(String.valueOf(strZza));
                                    }
                                }
                                int i14 = bArr[iZzd + 1] & 255;
                                int i15 = iZzd + 2;
                                int iZzc5 = zzc(bArr, i15, iZzl8);
                                str = "Id3Decoder";
                                iZzl = iZzl;
                                zzaefVar = new zzaed(strZza, new String(bArr, i15, iZzc5 - i15, charsetZzj2), i14, zzl(bArr, iZzc5 + zzb(iZzl8), i13));
                            } else {
                                iZzl = iZzl;
                                str = "Id3Decoder";
                                if (i5 != 67 && iZzl2 == 79 && iZzl3 == 77 && (iZzl4 == 77 || i == 2)) {
                                    if (iZzo < 4) {
                                        iZzl2 = iZzl2;
                                        iZzl3 = iZzl3;
                                        i7 = iZzl4;
                                        zzaefVar = null;
                                    } else {
                                        int iZzl9 = zzfbVar.zzl();
                                        Charset charsetZzj3 = zzj(iZzl9);
                                        byte[] bArr6 = new byte[3];
                                        zzfbVar.zzC(bArr6, 0, 3);
                                        String str4 = new String(bArr6, 0, 3);
                                        int i16 = iZzo - 4;
                                        byte[] bArr7 = new byte[i16];
                                        zzfbVar.zzC(bArr7, 0, i16);
                                        int iZzc6 = zzc(bArr7, 0, iZzl9);
                                        String str5 = new String(bArr7, 0, iZzc6, charsetZzj3);
                                        int iZzb3 = iZzc6 + zzb(iZzl9);
                                        zzaefVar = new zzael(str4, str5, zzh(bArr7, iZzb3, zzc(bArr7, iZzb3, iZzl9), charsetZzj3));
                                    }
                                } else if (i5 != 67 && iZzl2 == 72 && iZzl3 == 65 && iZzl4 == 80) {
                                    int iZzc7 = zzfbVar.zzc();
                                    int iZzd4 = zzd(zzfbVar.zzI(), iZzc7);
                                    String str6 = new String(zzfbVar.zzI(), iZzc7, iZzd4 - iZzc7, zzfqu.zzb);
                                    zzfbVar.zzG(iZzd4 + 1);
                                    int iZzf = zzfbVar.zzf();
                                    int iZzf2 = zzfbVar.zzf();
                                    long jZzt = zzfbVar.zzt();
                                    if (jZzt == 4294967295L) {
                                        jZzt = -1;
                                    }
                                    long j = jZzt;
                                    long jZzt2 = zzfbVar.zzt();
                                    if (jZzt2 == 4294967295L) {
                                        jZzt2 = -1;
                                    }
                                    long j2 = jZzt2;
                                    ArrayList arrayList = new ArrayList();
                                    int i17 = iZzc7 + iZzo;
                                    while (zzfbVar.zzc() < i17) {
                                        zzaes zzaesVarZzf = zzf(i, zzfbVar, z, i2, null);
                                        if (zzaesVarZzf != null) {
                                            arrayList.add(zzaesVarZzf);
                                        }
                                    }
                                    zzaefVar = new zzaeh(str6, iZzf, iZzf2, j, j2, (zzaes[]) arrayList.toArray(new zzaes[0]));
                                } else if (i5 != 67 && iZzl2 == 84 && iZzl3 == 79 && iZzl4 == 67) {
                                    int iZzc8 = zzfbVar.zzc();
                                    int iZzd5 = zzd(zzfbVar.zzI(), iZzc8);
                                    String str7 = new String(zzfbVar.zzI(), iZzc8, iZzd5 - iZzc8, zzfqu.zzb);
                                    zzfbVar.zzG(iZzd5 + 1);
                                    int iZzl10 = zzfbVar.zzl();
                                    boolean z7 = (iZzl10 & 2) != 0;
                                    int i18 = iZzl10 & 1;
                                    int iZzl11 = zzfbVar.zzl();
                                    String[] strArr = new String[iZzl11];
                                    int i19 = 0;
                                    while (i19 < iZzl11) {
                                        int iZzc9 = zzfbVar.zzc();
                                        int iZzd6 = zzd(zzfbVar.zzI(), iZzc9);
                                        strArr[i19] = new String(zzfbVar.zzI(), iZzc9, iZzd6 - iZzc9, zzfqu.zzb);
                                        zzfbVar.zzG(iZzd6 + 1);
                                        i19++;
                                        iZzl11 = iZzl11;
                                        iZzl4 = iZzl4;
                                        iZzl3 = iZzl3;
                                        iZzl2 = iZzl2;
                                    }
                                    int i20 = iZzl2;
                                    int i21 = iZzl3;
                                    int i22 = iZzl4;
                                    ArrayList arrayList2 = new ArrayList();
                                    int i23 = iZzc8 + iZzo;
                                    while (zzfbVar.zzc() < i23) {
                                        zzaes zzaesVarZzf2 = zzf(i, zzfbVar, z, i2, null);
                                        if (zzaesVarZzf2 != null) {
                                            arrayList2.add(zzaesVarZzf2);
                                        }
                                    }
                                    zzaefVar = new zzaej(str7, z7, 1 == i18, strArr, (zzaes[]) arrayList2.toArray(new zzaes[0]));
                                    i7 = i22;
                                    iZzl3 = i21;
                                    iZzl2 = i20;
                                } else {
                                    i6 = iZzl4;
                                    if (i5 == 77) {
                                        iZzl2 = iZzl2;
                                        if (iZzl2 == 76) {
                                            iZzl3 = iZzl3;
                                            i7 = i6;
                                            if (iZzl3 != 76 && i7 == 84) {
                                                int iZzp2 = zzfbVar.zzp();
                                                int iZzn = zzfbVar.zzn();
                                                int iZzn2 = zzfbVar.zzn();
                                                int iZzl12 = zzfbVar.zzl();
                                                int iZzl13 = zzfbVar.zzl();
                                                zzfa zzfaVar = new zzfa();
                                                zzfaVar.zzh(zzfbVar);
                                                int i24 = ((iZzo - 10) * 8) / (iZzl12 + iZzl13);
                                                int[] iArr = new int[i24];
                                                int[] iArr2 = new int[i24];
                                                for (int i25 = 0; i25 < i24; i25++) {
                                                    int iZzd7 = zzfaVar.zzd(iZzl12);
                                                    int iZzd8 = zzfaVar.zzd(iZzl13);
                                                    iArr[i25] = iZzd7;
                                                    iArr2[i25] = iZzd8;
                                                }
                                                zzaefVar = new zzaew(iZzp2, iZzn, iZzn2, iArr, iArr2);
                                            }
                                        } else {
                                            i7 = i6;
                                            iZzl3 = iZzl3;
                                        }
                                    } else {
                                        i7 = i6;
                                        iZzl3 = iZzl3;
                                        iZzl2 = iZzl2;
                                    }
                                    String strZzi2 = zzi(i, i5, iZzl2, iZzl3, i7);
                                    byte[] bArr8 = new byte[iZzo];
                                    zzfbVar.zzC(bArr8, 0, iZzo);
                                    zzaefVar = new zzaef(strZzi2, bArr8);
                                }
                            }
                            if (zzaefVar == null) {
                                zzes.zzf(str, "Failed to decode frame: id=" + zzi(i, iZzl, iZzl2, iZzl3, i7) + ", frameSize=" + iZzo);
                            }
                            zzfbVar.zzG(iZzc);
                            return zzaefVar;
                        }
                        if (i5 != 65 || iZzl2 != 80 || iZzl3 != 73 || iZzl4 != 67) {
                            iZzl = iZzl;
                            str = "Id3Decoder";
                            if (i5 != 67) {
                                if (i5 != 67) {
                                }
                                if (i5 != 67) {
                                    i6 = iZzl4;
                                    if (i5 == 77) {
                                        iZzl2 = iZzl2;
                                        if (iZzl2 == 76) {
                                            iZzl3 = iZzl3;
                                            i7 = i6;
                                            if (iZzl3 != 76) {
                                            }
                                        } else {
                                            i7 = i6;
                                            iZzl3 = iZzl3;
                                        }
                                    } else {
                                        i7 = i6;
                                        iZzl3 = iZzl3;
                                        iZzl2 = iZzl2;
                                    }
                                    String strZzi3 = zzi(i, i5, iZzl2, iZzl3, i7);
                                    byte[] bArr9 = new byte[iZzo];
                                    zzfbVar.zzC(bArr9, 0, iZzo);
                                    zzaefVar = new zzaef(strZzi3, bArr9);
                                } else {
                                    i6 = iZzl4;
                                    if (i5 == 77) {
                                        iZzl2 = iZzl2;
                                        if (iZzl2 == 76) {
                                            iZzl3 = iZzl3;
                                            i7 = i6;
                                            if (iZzl3 != 76) {
                                            }
                                        } else {
                                            i7 = i6;
                                            iZzl3 = iZzl3;
                                        }
                                    } else {
                                        i7 = i6;
                                        iZzl3 = iZzl3;
                                        iZzl2 = iZzl2;
                                    }
                                    String strZzi4 = zzi(i, i5, iZzl2, iZzl3, i7);
                                    byte[] bArr10 = new byte[iZzo];
                                    zzfbVar.zzC(bArr10, 0, iZzo);
                                    zzaefVar = new zzaef(strZzi4, bArr10);
                                }
                            } else {
                                if (i5 != 67) {
                                }
                                if (i5 != 67) {
                                    i6 = iZzl4;
                                    if (i5 == 77) {
                                        iZzl2 = iZzl2;
                                        if (iZzl2 == 76) {
                                            iZzl3 = iZzl3;
                                            i7 = i6;
                                            if (iZzl3 != 76) {
                                            }
                                        } else {
                                            i7 = i6;
                                            iZzl3 = iZzl3;
                                        }
                                    } else {
                                        i7 = i6;
                                        iZzl3 = iZzl3;
                                        iZzl2 = iZzl2;
                                    }
                                    String strZzi5 = zzi(i, i5, iZzl2, iZzl3, i7);
                                    byte[] bArr11 = new byte[iZzo];
                                    zzfbVar.zzC(bArr11, 0, iZzo);
                                    zzaefVar = new zzaef(strZzi5, bArr11);
                                } else {
                                    i6 = iZzl4;
                                    if (i5 == 77) {
                                        iZzl2 = iZzl2;
                                        if (iZzl2 == 76) {
                                            iZzl3 = iZzl3;
                                            i7 = i6;
                                            if (iZzl3 != 76) {
                                            }
                                        } else {
                                            i7 = i6;
                                            iZzl3 = iZzl3;
                                        }
                                    } else {
                                        i7 = i6;
                                        iZzl3 = iZzl3;
                                        iZzl2 = iZzl2;
                                    }
                                    String strZzi6 = zzi(i, i5, iZzl2, iZzl3, i7);
                                    byte[] bArr12 = new byte[iZzo];
                                    zzfbVar.zzC(bArr12, 0, iZzo);
                                    zzaefVar = new zzaef(strZzi6, bArr12);
                                }
                            }
                            if (zzaefVar == null) {
                                zzes.zzf(str, "Failed to decode frame: id=" + zzi(i, iZzl, iZzl2, iZzl3, i7) + ", frameSize=" + iZzo);
                            }
                            zzfbVar.zzG(iZzc);
                            return zzaefVar;
                        }
                        int iZzl14 = zzfbVar.zzl();
                        Charset charsetZzj4 = zzj(iZzl14);
                        int i110 = iZzo - 1;
                        bArr = new byte[i110];
                        zzfbVar.zzC(bArr, 0, i110);
                        if (i == 2) {
                            strZza = "image/".concat(String.valueOf(zzfqo.zza(new String(bArr, 0, 3, zzfqu.zzb))));
                            if ("image/jpg".equals(strZza)) {
                                strZza = "image/jpeg";
                            }
                            iZzd = 2;
                        } else {
                            iZzd = zzd(bArr, 0);
                            strZza = zzfqo.zza(new String(bArr, 0, iZzd, zzfqu.zzb));
                            if (strZza.indexOf(47) == -1) {
                                strZza = "image/".concat(String.valueOf(strZza));
                            }
                        }
                        int i111 = bArr[iZzd + 1] & 255;
                        int i112 = iZzd + 2;
                        int iZzc10 = zzc(bArr, i112, iZzl14);
                        str = "Id3Decoder";
                        iZzl = iZzl;
                        zzaefVar = new zzaed(strZza, new String(bArr, i112, iZzc10 - i112, charsetZzj4), i111, zzl(bArr, iZzc10 + zzb(iZzl14), i110));
                        i7 = iZzl4;
                        if (zzaefVar == null) {
                            zzes.zzf(str, "Failed to decode frame: id=" + zzi(i, iZzl, iZzl2, iZzl3, i7) + ", frameSize=" + iZzo);
                        }
                        zzfbVar.zzG(iZzc);
                        return zzaefVar;
                    }
                    String strZzi7 = zzi(i, 87, iZzl2, iZzl3, iZzl4);
                    byte[] bArr13 = new byte[iZzo];
                    zzfbVar.zzC(bArr13, 0, iZzo);
                    zzaefVar = new zzafc(strZzi7, null, new String(bArr13, 0, zzd(bArr13, 0), zzfqu.zzb));
                } else if (iZzo > 0) {
                    int iZzl15 = zzfbVar.zzl();
                    int i26 = iZzo - 1;
                    byte[] bArr14 = new byte[i26];
                    zzfbVar.zzC(bArr14, 0, i26);
                    int iZzc11 = zzc(bArr14, 0, iZzl15);
                    zzaefVar = new zzafa("TXXX", new String(bArr14, 0, iZzc11, zzj(iZzl15)), zzg(bArr14, iZzl15, iZzc11 + zzb(iZzl15)));
                }
                i7 = iZzl4;
                iZzc = iZzc;
                if (zzaefVar == null) {
                    zzes.zzf(str, "Failed to decode frame: id=" + zzi(i, iZzl, iZzl2, iZzl3, i7) + ", frameSize=" + iZzo);
                }
                zzfbVar.zzG(iZzc);
                return zzaefVar;
            } catch (Throwable th2) {
                th = th2;
                iZzc = iZzc;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static zzfud zzg(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfud.zzm("");
        }
        zzfua zzfuaVar = new zzfua();
        int iZzc = zzc(bArr, i2, i);
        while (i2 < iZzc) {
            zzfuaVar.zzf(new String(bArr, i2, iZzc - i2, zzj(i)));
            i2 = zzb(i) + iZzc;
            iZzc = zzc(bArr, i2, i);
        }
        zzfud zzfudVarZzi = zzfuaVar.zzi();
        return zzfudVarZzi.isEmpty() ? zzfud.zzm("") : zzfudVarZzi;
    }

    private static String zzh(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static boolean zzk(zzfb zzfbVar, int i, int i2, boolean z) {
        int iZzn;
        long jZzn;
        int iZzp;
        int i3;
        int iZzc = zzfbVar.zzc();
        while (true) {
            try {
                int i4 = 1;
                if (zzfbVar.zza() < i2) {
                    zzfbVar.zzG(iZzc);
                    return true;
                }
                if (i >= 3) {
                    iZzn = zzfbVar.zzf();
                    jZzn = zzfbVar.zzt();
                    iZzp = zzfbVar.zzp();
                } else {
                    iZzn = zzfbVar.zzn();
                    jZzn = zzfbVar.zzn();
                    iZzp = 0;
                }
                if (iZzn == 0 && jZzn == 0 && iZzp == 0) {
                    zzfbVar.zzG(iZzc);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jZzn) != 0) {
                        zzfbVar.zzG(iZzc);
                        return false;
                    }
                    jZzn = ((jZzn >> 24) << 21) | (((jZzn >> 16) & 255) << 14) | (jZzn & 255) | (((jZzn >> 8) & 255) << 7);
                }
                if (i == 4) {
                    i4 = iZzp & 1;
                    i3 = (iZzp & 64) == 0 ? 0 : 1;
                } else {
                    if (i == 3) {
                        i3 = (iZzp & 32) != 0 ? 1 : 0;
                        if ((iZzp & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    i4 = 0;
                }
                if (i4 != 0) {
                    i3 += 4;
                }
                if (jZzn < i3) {
                    zzfbVar.zzG(iZzc);
                    return false;
                }
                if (zzfbVar.zza() < jZzn) {
                    zzfbVar.zzG(iZzc);
                    return false;
                }
                zzfbVar.zzH((int) jZzn);
            } catch (Throwable th) {
                zzfbVar.zzG(iZzc);
                throw th;
            }
        }
    }

    private static byte[] zzl(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzfk.zzf : Arrays.copyOfRange(bArr, i, i2);
    }

    private static Charset zzj(int i) {
        if (i == 1) {
            return zzfqu.zzf;
        }
        if (i != 2) {
            return i != 3 ? zzfqu.zzb : zzfqu.zzc;
        }
        return zzfqu.zzd;
    }
}
