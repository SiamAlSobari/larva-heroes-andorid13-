package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.common.base.Ascii;
import java.io.IOException;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzait {
    static int zza(byte[] bArr, int i, zzais zzaisVar) throws zzaks {
        int iZzh = zzh(bArr, i, zzaisVar);
        int i2 = zzaisVar.zza;
        if (i2 < 0) {
            throw zzaks.zzf();
        }
        if (i2 > bArr.length - iZzh) {
            throw zzaks.zzj();
        }
        if (i2 == 0) {
            zzaisVar.zzc = zzajf.zzb;
            return iZzh;
        }
        zzaisVar.zzc = zzajf.zzn(bArr, iZzh, i2);
        return iZzh + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzamb zzambVar, byte[] bArr, int i, int i2, int i3, zzais zzaisVar) throws IOException {
        Object objZze = zzambVar.zze();
        int iZzl = zzl(objZze, zzambVar, bArr, i, i2, i3, zzaisVar);
        zzambVar.zzf(objZze);
        zzaisVar.zzc = objZze;
        return iZzl;
    }

    static int zzd(zzamb zzambVar, byte[] bArr, int i, int i2, zzais zzaisVar) throws IOException {
        Object objZze = zzambVar.zze();
        int iZzm = zzm(objZze, zzambVar, bArr, i, i2, zzaisVar);
        zzambVar.zzf(objZze);
        zzaisVar.zzc = objZze;
        return iZzm;
    }

    static int zze(zzamb zzambVar, int i, byte[] bArr, int i2, int i3, zzakp zzakpVar, zzais zzaisVar) throws IOException {
        int iZzd = zzd(zzambVar, bArr, i2, i3, zzaisVar);
        zzakpVar.add(zzaisVar.zzc);
        while (iZzd < i3) {
            int iZzh = zzh(bArr, iZzd, zzaisVar);
            if (i != zzaisVar.zza) {
                break;
            }
            iZzd = zzd(zzambVar, bArr, iZzh, i3, zzaisVar);
            zzakpVar.add(zzaisVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i, zzakp zzakpVar, zzais zzaisVar) throws IOException {
        zzakl zzaklVar = (zzakl) zzakpVar;
        int iZzh = zzh(bArr, i, zzaisVar);
        int i2 = zzaisVar.zza + iZzh;
        while (iZzh < i2) {
            iZzh = zzh(bArr, iZzh, zzaisVar);
            zzaklVar.zzf(zzaisVar.zza);
        }
        if (iZzh == i2) {
            return iZzh;
        }
        throw zzaks.zzj();
    }

    static int zzg(int i, byte[] bArr, int i2, int i3, zzamw zzamwVar, zzais zzaisVar) throws zzaks {
        if ((i >>> 3) == 0) {
            throw zzaks.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzk = zzk(bArr, i2, zzaisVar);
            zzamwVar.zzj(i, Long.valueOf(zzaisVar.zzb));
            return iZzk;
        }
        if (i4 == 1) {
            zzamwVar.zzj(i, Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzh = zzh(bArr, i2, zzaisVar);
            int i5 = zzaisVar.zza;
            if (i5 < 0) {
                throw zzaks.zzf();
            }
            if (i5 > bArr.length - iZzh) {
                throw zzaks.zzj();
            }
            if (i5 == 0) {
                zzamwVar.zzj(i, zzajf.zzb);
            } else {
                zzamwVar.zzj(i, zzajf.zzn(bArr, iZzh, i5));
            }
            return iZzh + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzaks.zzc();
            }
            zzamwVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzamw zzamwVarZzf = zzamw.zzf();
        int i7 = 0;
        while (i2 < i3) {
            int iZzh2 = zzh(bArr, i2, zzaisVar);
            int i8 = zzaisVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = iZzh2;
                break;
            }
            int iZzg = zzg(i7, bArr, iZzh2, i3, zzamwVarZzf, zzaisVar);
            i7 = i8;
            i2 = iZzg;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzaks.zzg();
        }
        zzamwVar.zzj(i, zzamwVarZzf);
        return i2;
    }

    static int zzh(byte[] bArr, int i, zzais zzaisVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzi(b, bArr, i2, zzaisVar);
        }
        zzaisVar.zza = b;
        return i2;
    }

    static int zzi(int i, byte[] bArr, int i2, zzais zzaisVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & WorkQueueKt.MASK;
        if (b >= 0) {
            zzaisVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzaisVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzaisVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzaisVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzaisVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzj(int i, byte[] bArr, int i2, int i3, zzakp zzakpVar, zzais zzaisVar) {
        zzakl zzaklVar = (zzakl) zzakpVar;
        int iZzh = zzh(bArr, i2, zzaisVar);
        zzaklVar.zzf(zzaisVar.zza);
        while (iZzh < i3) {
            int iZzh2 = zzh(bArr, iZzh, zzaisVar);
            if (i != zzaisVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzaisVar);
            zzaklVar.zzf(zzaisVar.zza);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i, zzais zzaisVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzaisVar.zzb = j;
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
        zzaisVar.zzb = j2;
        return i3;
    }

    static int zzl(Object obj, zzamb zzambVar, byte[] bArr, int i, int i2, int i3, zzais zzaisVar) throws IOException {
        int iZzc = ((zzals) zzambVar).zzc(obj, bArr, i, i2, i3, zzaisVar);
        zzaisVar.zzc = obj;
        return iZzc;
    }

    static int zzm(Object obj, zzamb zzambVar, byte[] bArr, int i, int i2, zzais zzaisVar) throws IOException {
        int iZzi = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzi = zzi(i3, bArr, iZzi, zzaisVar);
            i3 = zzaisVar.zza;
        }
        int i4 = iZzi;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzaks.zzj();
        }
        int i5 = i3 + i4;
        zzambVar.zzi(obj, bArr, i4, i5, zzaisVar);
        zzaisVar.zzc = obj;
        return i5;
    }

    static long zzn(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
