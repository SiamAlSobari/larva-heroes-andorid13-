package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgpv {
    static int zza(byte[] bArr, int i, zzgpu zzgpuVar) throws zzgsc {
        int iZzh = zzh(bArr, i, zzgpuVar);
        int i2 = zzgpuVar.zza;
        if (i2 < 0) {
            throw zzgsc.zzf();
        }
        if (i2 > bArr.length - iZzh) {
            throw zzgsc.zzj();
        }
        if (i2 == 0) {
            zzgpuVar.zzc = zzgqi.zzb;
            return iZzh;
        }
        zzgpuVar.zzc = zzgqi.zzv(bArr, iZzh, i2);
        return iZzh + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzgtt zzgttVar, byte[] bArr, int i, int i2, int i3, zzgpu zzgpuVar) throws IOException {
        Object objZze = zzgttVar.zze();
        int iZzl = zzl(objZze, zzgttVar, bArr, i, i2, i3, zzgpuVar);
        zzgttVar.zzf(objZze);
        zzgpuVar.zzc = objZze;
        return iZzl;
    }

    static int zzd(zzgtt zzgttVar, byte[] bArr, int i, int i2, zzgpu zzgpuVar) throws IOException {
        Object objZze = zzgttVar.zze();
        int iZzm = zzm(objZze, zzgttVar, bArr, i, i2, zzgpuVar);
        zzgttVar.zzf(objZze);
        zzgpuVar.zzc = objZze;
        return iZzm;
    }

    static int zze(zzgtt zzgttVar, int i, byte[] bArr, int i2, int i3, zzgrz zzgrzVar, zzgpu zzgpuVar) throws IOException {
        int iZzd = zzd(zzgttVar, bArr, i2, i3, zzgpuVar);
        zzgrzVar.add(zzgpuVar.zzc);
        while (iZzd < i3) {
            int iZzh = zzh(bArr, iZzd, zzgpuVar);
            if (i != zzgpuVar.zza) {
                break;
            }
            iZzd = zzd(zzgttVar, bArr, iZzh, i3, zzgpuVar);
            zzgrzVar.add(zzgpuVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i, zzgrz zzgrzVar, zzgpu zzgpuVar) throws IOException {
        zzgrr zzgrrVar = (zzgrr) zzgrzVar;
        int iZzh = zzh(bArr, i, zzgpuVar);
        int i2 = zzgpuVar.zza + iZzh;
        while (iZzh < i2) {
            iZzh = zzh(bArr, iZzh, zzgpuVar);
            zzgrrVar.zzh(zzgpuVar.zza);
        }
        if (iZzh == i2) {
            return iZzh;
        }
        throw zzgsc.zzj();
    }

    static int zzg(int i, byte[] bArr, int i2, int i3, zzgul zzgulVar, zzgpu zzgpuVar) throws zzgsc {
        if ((i >>> 3) == 0) {
            throw zzgsc.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzk = zzk(bArr, i2, zzgpuVar);
            zzgulVar.zzj(i, Long.valueOf(zzgpuVar.zzb));
            return iZzk;
        }
        if (i4 == 1) {
            zzgulVar.zzj(i, Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzh = zzh(bArr, i2, zzgpuVar);
            int i5 = zzgpuVar.zza;
            if (i5 < 0) {
                throw zzgsc.zzf();
            }
            if (i5 > bArr.length - iZzh) {
                throw zzgsc.zzj();
            }
            if (i5 == 0) {
                zzgulVar.zzj(i, zzgqi.zzb);
            } else {
                zzgulVar.zzj(i, zzgqi.zzv(bArr, iZzh, i5));
            }
            return iZzh + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzgsc.zzc();
            }
            zzgulVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzgul zzgulVarZzf = zzgul.zzf();
        int i7 = 0;
        while (i2 < i3) {
            int iZzh2 = zzh(bArr, i2, zzgpuVar);
            int i8 = zzgpuVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = iZzh2;
                break;
            }
            int iZzg = zzg(i7, bArr, iZzh2, i3, zzgulVarZzf, zzgpuVar);
            i7 = i8;
            i2 = iZzg;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzgsc.zzg();
        }
        zzgulVar.zzj(i, zzgulVarZzf);
        return i2;
    }

    static int zzh(byte[] bArr, int i, zzgpu zzgpuVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzi(b, bArr, i2, zzgpuVar);
        }
        zzgpuVar.zza = b;
        return i2;
    }

    static int zzi(int i, byte[] bArr, int i2, zzgpu zzgpuVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & WorkQueueKt.MASK;
        if (b >= 0) {
            zzgpuVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzgpuVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgpuVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgpuVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgpuVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzj(int i, byte[] bArr, int i2, int i3, zzgrz zzgrzVar, zzgpu zzgpuVar) {
        zzgrr zzgrrVar = (zzgrr) zzgrzVar;
        int iZzh = zzh(bArr, i2, zzgpuVar);
        zzgrrVar.zzh(zzgpuVar.zza);
        while (iZzh < i3) {
            int iZzh2 = zzh(bArr, iZzh, zzgpuVar);
            if (i != zzgpuVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzgpuVar);
            zzgrrVar.zzh(zzgpuVar.zza);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i, zzgpu zzgpuVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgpuVar.zzb = j;
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
        zzgpuVar.zzb = j2;
        return i3;
    }

    static int zzl(Object obj, zzgtt zzgttVar, byte[] bArr, int i, int i2, int i3, zzgpu zzgpuVar) throws IOException {
        int iZzc = ((zzgtd) zzgttVar).zzc(obj, bArr, i, i2, i3, zzgpuVar);
        zzgpuVar.zzc = obj;
        return iZzc;
    }

    static int zzm(Object obj, zzgtt zzgttVar, byte[] bArr, int i, int i2, zzgpu zzgpuVar) throws IOException {
        int iZzi = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzi = zzi(i3, bArr, iZzi, zzgpuVar);
            i3 = zzgpuVar.zza;
        }
        int i4 = iZzi;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzgsc.zzj();
        }
        int i5 = i3 + i4;
        zzgttVar.zzi(obj, bArr, i4, i5, zzgpuVar);
        zzgpuVar.zzc = obj;
        return i5;
    }

    static long zzn(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
