package com.google.android.gms.internal.ads;

import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafn implements zzafp {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzafw zzc = new zzafw();
    private zzafo zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzabc zzabcVar, int i) throws IOException {
        ((zzaar) zzabcVar).zzn(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.zza[i2] & 255));
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zza(zzafo zzafoVar) {
        this.zzd = zzafoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[LOOP:0: B:3:0x0005->B:37:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x0130  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[LOOP:2: B:61:0x013d->B:64:0x0145, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:72:0x016d  */
    /* JADX WARN: Code duplicated, block: B:74:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0154, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x017a, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zzc(zzabc zzabcVar) throws IOException {
        int i;
        zzafs zzafsVar;
        zzafu zzafuVar;
        long j;
        long j2;
        int i2;
        byte[] bArr;
        String str;
        int i3;
        long j3;
        int i4;
        long jZzd;
        double dLongBitsToDouble;
        zzaar zzaarVar;
        int iZzb;
        int iZzc;
        zzdy.zzb(this.zzd);
        while (true) {
            zzafm zzafmVar = (zzafm) this.zzb.peek();
            if (zzafmVar != null && zzabcVar.zzf() >= zzafmVar.zzb) {
                ((zzafs) this.zzd).zza.zzh(((zzafm) this.zzb.pop()).zza);
                return true;
            }
            int i5 = this.zze;
            if (i5 != 0) {
                if (i5 == 1) {
                }
                zzafo zzafoVar = this.zzd;
                i = this.zzf;
                zzafsVar = (zzafs) zzafoVar;
                zzafuVar = zzafsVar.zza;
                switch (i) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        j = this.zzg;
                        if (j <= 8) {
                            throw zzcd.zza("Invalid integer size: " + j, null);
                        }
                        zzafsVar.zza.zzj(i, zzd(zzabcVar, (int) j));
                        this.zze = 0;
                        return true;
                    case 134:
                    case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                    case 21358:
                    case 2274716:
                        j2 = this.zzg;
                        if (j2 <= 2147483647L) {
                            throw zzcd.zza("String element size: " + j2, null);
                        }
                        i2 = (int) j2;
                        if (i2 == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i2];
                            ((zzaar) zzabcVar).zzn(bArr, 0, i2, false);
                            while (i2 > 0) {
                                i3 = i2 - 1;
                                if (bArr[i3] == 0) {
                                    i2 = i3;
                                } else {
                                    str = new String(bArr, 0, i2);
                                }
                            }
                            str = new String(bArr, 0, i2);
                        }
                        zzafsVar.zza.zzl(i, str);
                        this.zze = 0;
                        return true;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jZzf = zzabcVar.zzf();
                        this.zzb.push(new zzafm(i, this.zzg + jZzf, null));
                        ((zzafs) this.zzd).zza.zzk(this.zzf, jZzf, this.zzg);
                        this.zze = 0;
                        return true;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        zzafuVar.zzg(i, (int) this.zzg, zzabcVar);
                        this.zze = 0;
                        return true;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        j3 = this.zzg;
                        if (j3 == 4 && j3 != 8) {
                            throw zzcd.zza("Invalid float size: " + j3, null);
                        }
                        i4 = (int) j3;
                        jZzd = zzd(zzabcVar, i4);
                        if (i4 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                        }
                        zzafsVar.zza.zzi(i, dLongBitsToDouble);
                        this.zze = 0;
                        return true;
                    default:
                        ((zzaar) zzabcVar).zzo((int) this.zzg, false);
                        this.zze = 0;
                        break;
                }
            } else {
                long jZzd2 = this.zzc.zzd(zzabcVar, true, false, 4);
                if (jZzd2 == -2) {
                    zzabcVar.zzj();
                    while (true) {
                        zzaarVar = (zzaar) zzabcVar;
                        zzaarVar.zzm(this.zza, 0, 4, false);
                        iZzb = zzafw.zzb(this.zza[0]);
                        if (iZzb != -1 && iZzb <= 4) {
                            iZzc = (int) zzafw.zzc(this.zza, iZzb, false);
                            zzafu zzafuVar2 = ((zzafs) this.zzd).zza;
                            if (iZzc != 357149030 && iZzc != 524531317 && iZzc != 475249515) {
                                if (iZzc == 374648427) {
                                    iZzc = 374648427;
                                }
                            }
                        }
                        zzaarVar.zzo(1, false);
                    }
                    zzaarVar.zzo(iZzb, false);
                    jZzd2 = iZzc;
                }
                if (jZzd2 == -1) {
                    return false;
                }
                this.zzf = (int) jZzd2;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzd(zzabcVar, false, true, 8);
            this.zze = 2;
            zzafo zzafoVar2 = this.zzd;
            i = this.zzf;
            zzafsVar = (zzafs) zzafoVar2;
            zzafuVar = zzafsVar.zza;
            switch (i) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    j = this.zzg;
                    if (j <= 8) {
                        throw zzcd.zza("Invalid integer size: " + j, null);
                    }
                    zzafsVar.zza.zzj(i, zzd(zzabcVar, (int) j));
                    this.zze = 0;
                    return true;
                case 134:
                case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                case 21358:
                case 2274716:
                    j2 = this.zzg;
                    if (j2 <= 2147483647L) {
                        throw zzcd.zza("String element size: " + j2, null);
                    }
                    i2 = (int) j2;
                    if (i2 == 0) {
                        str = "";
                    } else {
                        bArr = new byte[i2];
                        ((zzaar) zzabcVar).zzn(bArr, 0, i2, false);
                        while (i2 > 0) {
                            i3 = i2 - 1;
                            if (bArr[i3] == 0) {
                                i2 = i3;
                            } else {
                                str = new String(bArr, 0, i2);
                            }
                        }
                        str = new String(bArr, 0, i2);
                    }
                    zzafsVar.zza.zzl(i, str);
                    this.zze = 0;
                    return true;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long jZzf2 = zzabcVar.zzf();
                    this.zzb.push(new zzafm(i, this.zzg + jZzf2, null));
                    ((zzafs) this.zzd).zza.zzk(this.zzf, jZzf2, this.zzg);
                    this.zze = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    zzafuVar.zzg(i, (int) this.zzg, zzabcVar);
                    this.zze = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    j3 = this.zzg;
                    if (j3 == 4) {
                        break;
                    }
                    i4 = (int) j3;
                    jZzd = zzd(zzabcVar, i4);
                    if (i4 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                    }
                    zzafsVar.zza.zzi(i, dLongBitsToDouble);
                    this.zze = 0;
                    return true;
                default:
                    ((zzaar) zzabcVar).zzo((int) this.zzg, false);
                    this.zze = 0;
                    break;
            }
        }
    }
}
