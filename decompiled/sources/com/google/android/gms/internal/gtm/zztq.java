package com.google.android.gms.internal.gtm;

import com.google.common.base.Ascii;
import java.io.IOException;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zztq {
    static int zza(byte[] bArr, int i, zztp zztpVar) throws zzxu {
        int iZzj = zzj(bArr, i, zztpVar);
        int i2 = zztpVar.zza;
        if (i2 < 0) {
            throw zzxu.zzf();
        }
        if (i2 > bArr.length - iZzj) {
            throw zzxu.zzj();
        }
        if (i2 == 0) {
            zztpVar.zzc = zzud.zzb;
            return iZzj;
        }
        zztpVar.zzc = zzud.zzl(bArr, iZzj, i2);
        return iZzj + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzzh zzzhVar, byte[] bArr, int i, int i2, int i3, zztp zztpVar) throws IOException {
        Object objZze = zzzhVar.zze();
        int iZzn = zzn(objZze, zzzhVar, bArr, i, i2, i3, zztpVar);
        zzzhVar.zzf(objZze);
        zztpVar.zzc = objZze;
        return iZzn;
    }

    static int zzd(zzzh zzzhVar, byte[] bArr, int i, int i2, zztp zztpVar) throws IOException {
        Object objZze = zzzhVar.zze();
        int iZzo = zzo(objZze, zzzhVar, bArr, i, i2, zztpVar);
        zzzhVar.zzf(objZze);
        zztpVar.zzc = objZze;
        return iZzo;
    }

    static int zze(zzzh zzzhVar, int i, byte[] bArr, int i2, int i3, zzxr zzxrVar, zztp zztpVar) throws IOException {
        int iZzd = zzd(zzzhVar, bArr, i2, i3, zztpVar);
        zzxrVar.add(zztpVar.zzc);
        while (iZzd < i3) {
            int iZzj = zzj(bArr, iZzd, zztpVar);
            if (i != zztpVar.zza) {
                break;
            }
            iZzd = zzd(zzzhVar, bArr, iZzj, i3, zztpVar);
            zzxrVar.add(zztpVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i, zzxr zzxrVar, zztp zztpVar) throws IOException {
        zzxk zzxkVar = (zzxk) zzxrVar;
        int iZzj = zzj(bArr, i, zztpVar);
        int i2 = zztpVar.zza + iZzj;
        while (iZzj < i2) {
            iZzj = zzj(bArr, iZzj, zztpVar);
            zzxkVar.zzh(zztpVar.zza);
        }
        if (iZzj == i2) {
            return iZzj;
        }
        throw zzxu.zzj();
    }

    static int zzg(byte[] bArr, int i, zztp zztpVar) throws zzxu {
        int iZzj = zzj(bArr, i, zztpVar);
        int i2 = zztpVar.zza;
        if (i2 < 0) {
            throw zzxu.zzf();
        }
        if (i2 == 0) {
            zztpVar.zzc = "";
            return iZzj;
        }
        zztpVar.zzc = new String(bArr, iZzj, i2, zzxs.zzb);
        return iZzj + i2;
    }

    static int zzh(byte[] bArr, int i, zztp zztpVar) throws zzxu {
        int iZzj = zzj(bArr, i, zztpVar);
        int i2 = zztpVar.zza;
        if (i2 < 0) {
            throw zzxu.zzf();
        }
        if (i2 == 0) {
            zztpVar.zzc = "";
            return iZzj;
        }
        zztpVar.zzc = zzaan.zzd(bArr, iZzj, i2);
        return iZzj + i2;
    }

    static int zzi(int i, byte[] bArr, int i2, int i3, zzzz zzzzVar, zztp zztpVar) throws zzxu {
        if ((i >>> 3) == 0) {
            throw zzxu.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzm = zzm(bArr, i2, zztpVar);
            zzzzVar.zzj(i, Long.valueOf(zztpVar.zzb));
            return iZzm;
        }
        if (i4 == 1) {
            zzzzVar.zzj(i, Long.valueOf(zzq(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzj = zzj(bArr, i2, zztpVar);
            int i5 = zztpVar.zza;
            if (i5 < 0) {
                throw zzxu.zzf();
            }
            if (i5 > bArr.length - iZzj) {
                throw zzxu.zzj();
            }
            if (i5 == 0) {
                zzzzVar.zzj(i, zzud.zzb);
            } else {
                zzzzVar.zzj(i, zzud.zzl(bArr, iZzj, i5));
            }
            return iZzj + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzxu.zzc();
            }
            zzzzVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzzz zzzzVarZzf = zzzz.zzf();
        int i7 = 0;
        while (i2 < i3) {
            int iZzj2 = zzj(bArr, i2, zztpVar);
            int i8 = zztpVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = iZzj2;
                break;
            }
            int iZzi = zzi(i7, bArr, iZzj2, i3, zzzzVarZzf, zztpVar);
            i7 = i8;
            i2 = iZzi;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzxu.zzg();
        }
        zzzzVar.zzj(i, zzzzVarZzf);
        return i2;
    }

    static int zzj(byte[] bArr, int i, zztp zztpVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzk(b, bArr, i2, zztpVar);
        }
        zztpVar.zza = b;
        return i2;
    }

    static int zzk(int i, byte[] bArr, int i2, zztp zztpVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & WorkQueueKt.MASK;
        if (b >= 0) {
            zztpVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zztpVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zztpVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zztpVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zztpVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzxr zzxrVar, zztp zztpVar) {
        zzxk zzxkVar = (zzxk) zzxrVar;
        int iZzj = zzj(bArr, i2, zztpVar);
        zzxkVar.zzh(zztpVar.zza);
        while (iZzj < i3) {
            int iZzj2 = zzj(bArr, iZzj, zztpVar);
            if (i != zztpVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zztpVar);
            zzxkVar.zzh(zztpVar.zza);
        }
        return iZzj;
    }

    static int zzm(byte[] bArr, int i, zztp zztpVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zztpVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            i3 = i5;
            b = b2;
        }
        zztpVar.zzb = j2;
        return i3;
    }

    static int zzn(Object obj, zzzh zzzhVar, byte[] bArr, int i, int i2, int i3, zztp zztpVar) throws IOException {
        int iZzc = ((zzyx) zzzhVar).zzc(obj, bArr, i, i2, i3, zztpVar);
        zztpVar.zzc = obj;
        return iZzc;
    }

    static int zzo(Object obj, zzzh zzzhVar, byte[] bArr, int i, int i2, zztp zztpVar) throws IOException {
        int iZzk = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzk = zzk(i3, bArr, iZzk, zztpVar);
            i3 = zztpVar.zza;
        }
        int i4 = iZzk;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzxu.zzj();
        }
        int i5 = i3 + i4;
        zzzhVar.zzi(obj, bArr, i4, i5, zztpVar);
        zztpVar.zzc = obj;
        return i5;
    }

    static long zzq(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    static int zzp(int i, byte[] bArr, int i2, int i3, zztp zztpVar) throws zzxu {
        if ((i >>> 3) == 0) {
            throw zzxu.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzm(bArr, i2, zztpVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzj(bArr, i2, zztpVar) + zztpVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzxu.zzc();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzj(bArr, i2, zztpVar);
            i6 = zztpVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzp(i6, bArr, i2, i3, zztpVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzxu.zzg();
        }
        return i2;
    }
}
