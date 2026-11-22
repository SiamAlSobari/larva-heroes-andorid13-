package com.google.android.gms.internal.measurement;

import com.google.android.gms.drive.DriveFile;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlo<T> implements zzlw<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmx.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzll zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkz zzm;
    private final zzmn zzn;
    private final zzjr zzo;
    private final zzlq zzp;
    private final zzlg zzq;

    private zzlo(int[] iArr, Object[] objArr, int i, int i2, zzll zzllVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlq zzlqVar, zzkz zzkzVar, zzmn zzmnVar, zzjr zzjrVar, zzlg zzlgVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjrVar != null && zzjrVar.zzc(zzllVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzlqVar;
        this.zzm = zzkzVar;
        this.zzn = zzmnVar;
        this.zzo = zzjrVar;
        this.zzg = zzllVar;
        this.zzq = zzlgVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmx.zzf(obj, j)).longValue();
    }

    private final zzki zzD(int i) {
        int i2 = i / 3;
        return (zzki) this.zzd[i2 + i2 + 1];
    }

    private final zzlw zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlw zzlwVar = (zzlw) this.zzd[i3];
        if (zzlwVar != null) {
            return zzlwVar;
        }
        zzlw zzlwVarZzb = zzlt.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzlwVarZzb;
        return zzlwVarZzb;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzG(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        long jZzB = zzB(i) & 1048575;
        if (zzO(obj2, i)) {
            Object objZzf = zzmx.zzf(obj, jZzB);
            Object objZzf2 = zzmx.zzf(obj2, jZzB);
            if (objZzf != null && objZzf2 != null) {
                zzmx.zzs(obj, jZzB, zzkm.zzg(objZzf, objZzf2));
                zzJ(obj, i);
            } else if (objZzf2 != null) {
                zzmx.zzs(obj, jZzB, objZzf2);
                zzJ(obj, i);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int iZzB = zzB(i);
        int i2 = this.zzc[i];
        long j = iZzB & 1048575;
        if (zzR(obj2, i2, i)) {
            Object objZzf = zzR(obj, i2, i) ? zzmx.zzf(obj, j) : null;
            Object objZzf2 = zzmx.zzf(obj2, j);
            if (objZzf != null && objZzf2 != null) {
                zzmx.zzs(obj, j, zzkm.zzg(objZzf, objZzf2));
                zzK(obj, i2, i);
            } else if (objZzf2 != null) {
                zzmx.zzs(obj, j, objZzf2);
                zzK(obj, i2, i);
            }
        }
    }

    private final void zzJ(Object obj, int i) {
        int iZzy = zzy(i);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzmx.zzq(obj, j, (1 << (iZzy >>> 20)) | zzmx.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzmx.zzq(obj, zzy(i2) & 1048575, i);
    }

    private final void zzL(Object obj, zznf zznfVar) throws IOException {
        int i;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < length) {
            int iZzB = zzB(i3);
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iZzB & i2;
            switch (iZzA) {
                case 0:
                    if ((i4 & i) != 0) {
                        zznfVar.zzf(i6, zzmx.zza(obj, j));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i4 & i) != 0) {
                        zznfVar.zzo(i6, zzmx.zzb(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i4 & i) != 0) {
                        zznfVar.zzt(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i4 & i) != 0) {
                        zznfVar.zzJ(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i4 & i) != 0) {
                        zznfVar.zzr(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i4 & i) != 0) {
                        zznfVar.zzm(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i4 & i) != 0) {
                        zznfVar.zzk(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i4 & i) != 0) {
                        zznfVar.zzb(i6, zzmx.zzw(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i4 & i) != 0) {
                        zzT(i6, unsafe.getObject(obj, j), zznfVar);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i4 & i) != 0) {
                        zznfVar.zzv(i6, unsafe.getObject(obj, j), zzE(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i4 & i) != 0) {
                        zznfVar.zzd(i6, (zzjd) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i4 & i) != 0) {
                        zznfVar.zzH(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i4 & i) != 0) {
                        zznfVar.zzi(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i4 & i) != 0) {
                        zznfVar.zzw(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i4 & i) != 0) {
                        zznfVar.zzy(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i4 & i) != 0) {
                        zznfVar.zzA(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i4 & i) != 0) {
                        zznfVar.zzC(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i4 & i) != 0) {
                        zznfVar.zzq(i6, unsafe.getObject(obj, j), zzE(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    zzly.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    zzly.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    zzly.zzQ(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    zzly.zzY(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    zzly.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    zzly.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    zzly.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    zzly.zzH(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    zzly.zzW(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar);
                    break;
                case 27:
                    zzly.zzR(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, zzE(i3));
                    break;
                case 28:
                    zzly.zzI(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar);
                    break;
                case 29:
                    zzly.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    break;
                case 30:
                    zzly.zzK(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    break;
                case 31:
                    zzly.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    break;
                case 32:
                    zzly.zzT(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    break;
                case 33:
                    zzly.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    break;
                case 34:
                    zzly.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, false);
                    break;
                case 35:
                    zzly.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 36:
                    zzly.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 37:
                    zzly.zzQ(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 38:
                    zzly.zzY(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 39:
                    zzly.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 40:
                    zzly.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 41:
                    zzly.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 42:
                    zzly.zzH(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 43:
                    zzly.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 44:
                    zzly.zzK(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 45:
                    zzly.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 46:
                    zzly.zzT(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 47:
                    zzly.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 48:
                    zzly.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, true);
                    break;
                case 49:
                    zzly.zzO(this.zzc[i3], (List) unsafe.getObject(obj, j), zznfVar, zzE(i3));
                    break;
                case 50:
                    zzM(zznfVar, i6, unsafe.getObject(obj, j), i3);
                    break;
                case 51:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzt(i6, zzC(obj, j));
                    }
                    break;
                case 54:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzJ(i6, zzC(obj, j));
                    }
                    break;
                case 55:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzr(i6, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzm(i6, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzk(i6, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzb(i6, zzS(obj, j));
                    }
                    break;
                case 59:
                    if (zzR(obj, i6, i3)) {
                        zzT(i6, unsafe.getObject(obj, j), zznfVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzv(i6, unsafe.getObject(obj, j), zzE(i3));
                    }
                    break;
                case 61:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzd(i6, (zzjd) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzH(i6, zzr(obj, j));
                    }
                    break;
                case 63:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzi(i6, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzw(i6, zzr(obj, j));
                    }
                    break;
                case 65:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzy(i6, zzC(obj, j));
                    }
                    break;
                case 66:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzA(i6, zzr(obj, j));
                    }
                    break;
                case 67:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzC(i6, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzR(obj, i6, i3)) {
                        zznfVar.zzq(i6, unsafe.getObject(obj, j), zzE(i3));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        zzmn zzmnVar = this.zzn;
        zzmnVar.zzi(zzmnVar.zzc(obj), zznfVar);
    }

    private final void zzM(zznf zznfVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        return zzO(obj, i) == zzO(obj2, i);
    }

    private final boolean zzO(Object obj, int i) {
        int iZzy = zzy(i);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzmx.zzc(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i);
        long j2 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmx.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmx.zzb(obj, j2)) != 0;
            case 2:
                return zzmx.zzd(obj, j2) != 0;
            case 3:
                return zzmx.zzd(obj, j2) != 0;
            case 4:
                return zzmx.zzc(obj, j2) != 0;
            case 5:
                return zzmx.zzd(obj, j2) != 0;
            case 6:
                return zzmx.zzc(obj, j2) != 0;
            case 7:
                return zzmx.zzw(obj, j2);
            case 8:
                Object objZzf = zzmx.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzjd) {
                    return !zzjd.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmx.zzf(obj, j2) != null;
            case 10:
                return !zzjd.zzb.equals(zzmx.zzf(obj, j2));
            case 11:
                return zzmx.zzc(obj, j2) != 0;
            case 12:
                return zzmx.zzc(obj, j2) != 0;
            case 13:
                return zzmx.zzc(obj, j2) != 0;
            case 14:
                return zzmx.zzd(obj, j2) != 0;
            case 15:
                return zzmx.zzc(obj, j2) != 0;
            case 16:
                return zzmx.zzd(obj, j2) != 0;
            case 17:
                return zzmx.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzO(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzQ(Object obj, int i, zzlw zzlwVar) {
        return zzlwVar.zzk(zzmx.zzf(obj, i & 1048575));
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzmx.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzmx.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zznf zznfVar) throws IOException {
        if (obj instanceof String) {
            zznfVar.zzF(i, (String) obj);
        } else {
            zznfVar.zzd(i, (zzjd) obj);
        }
    }

    static zzmo zzd(Object obj) {
        zzke zzkeVar = (zzke) obj;
        zzmo zzmoVar = zzkeVar.zzc;
        if (zzmoVar != zzmo.zzc()) {
            return zzmoVar;
        }
        zzmo zzmoVarZze = zzmo.zze();
        zzkeVar.zzc = zzmoVarZze;
        return zzmoVarZze;
    }

    static zzlo zzl(Class cls, zzli zzliVar, zzlq zzlqVar, zzkz zzkzVar, zzmn zzmnVar, zzjr zzjrVar, zzlg zzlgVar) {
        if (zzliVar instanceof zzlv) {
            return zzm((zzlv) zzliVar, zzlqVar, zzkzVar, zzmnVar, zzjrVar, zzlgVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0260  */
    /* JADX WARN: Code duplicated, block: B:127:0x0278  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:162:0x032b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0378  */
    /* JADX WARN: Code duplicated, block: B:180:0x0385  */
    static zzlo zzm(zzlv zzlvVar, zzlq zzlqVar, zzkz zzkzVar, zzmn zzmnVar, zzjr zzjrVar, zzlg zzlgVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int i20;
        int iObjectFieldOffset2;
        Field fieldZzG;
        char cCharAt9;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldZzG2;
        int i25;
        Object obj2;
        Field fieldZzG3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        boolean z = zzlvVar.zzc() == 2;
        String strZzd = zzlvVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (strZzd.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int iCharAt4 = strZzd.charAt(i);
        if (iCharAt4 >= 55296) {
            int i32 = iCharAt4 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                cCharAt13 = strZzd.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            iCharAt4 = i32 | (cCharAt13 << i33);
            i31 = i29;
        }
        if (iCharAt4 == 0) {
            iArr = zza;
            i3 = 0;
            iCharAt = 0;
            i5 = 0;
            iCharAt2 = 0;
            i4 = 0;
            iCharAt3 = 0;
            i2 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt5 = strZzd.charAt(i31);
            if (iCharAt5 >= 55296) {
                int i35 = iCharAt5 & 8191;
                int i36 = 13;
                while (true) {
                    i13 = i34 + 1;
                    cCharAt8 = strZzd.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i13;
                }
                iCharAt5 = i35 | (cCharAt8 << i36);
                i34 = i13;
            }
            int i37 = i34 + 1;
            int iCharAt6 = strZzd.charAt(i34);
            if (iCharAt6 >= 55296) {
                int i38 = iCharAt6 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    cCharAt7 = strZzd.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i12;
                }
                iCharAt6 = i38 | (cCharAt7 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            iCharAt = strZzd.charAt(i37);
            if (iCharAt >= 55296) {
                int i41 = iCharAt & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    cCharAt6 = strZzd.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i11;
                }
                iCharAt = i41 | (cCharAt6 << i42);
                i40 = i11;
            }
            int i43 = i40 + 1;
            int iCharAt7 = strZzd.charAt(i40);
            if (iCharAt7 >= 55296) {
                int i44 = iCharAt7 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    cCharAt5 = strZzd.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i10;
                }
                iCharAt7 = i44 | (cCharAt5 << i45);
                i43 = i10;
            }
            int i46 = i43 + 1;
            iCharAt2 = strZzd.charAt(i43);
            if (iCharAt2 >= 55296) {
                int i47 = iCharAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    cCharAt4 = strZzd.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i9;
                }
                iCharAt2 = i47 | (cCharAt4 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            int iCharAt8 = strZzd.charAt(i46);
            if (iCharAt8 >= 55296) {
                int i50 = iCharAt8 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    cCharAt3 = strZzd.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i8;
                }
                iCharAt8 = i50 | (cCharAt3 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int iCharAt9 = strZzd.charAt(i49);
            if (iCharAt9 >= 55296) {
                int i53 = iCharAt9 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    cCharAt2 = strZzd.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i7;
                }
                iCharAt9 = i53 | (cCharAt2 << i54);
                i52 = i7;
            }
            int i55 = i52 + 1;
            iCharAt3 = strZzd.charAt(i52);
            if (iCharAt3 >= 55296) {
                int i56 = iCharAt3 & 8191;
                int i57 = 13;
                while (true) {
                    i6 = i55 + 1;
                    cCharAt = strZzd.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i55 = i6;
                }
                iCharAt3 = i56 | (cCharAt << i57);
                i55 = i6;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i2 = iCharAt5 + iCharAt5 + iCharAt6;
            i3 = iCharAt5;
            i31 = i55;
            int i58 = iCharAt8;
            i4 = iCharAt7;
            i5 = i58;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzlvVar.zze();
        Class<?> cls = zzlvVar.zza().getClass();
        int[] iArr2 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 + iCharAt2];
        int i59 = iCharAt3 + i5;
        int i60 = iCharAt3;
        int i61 = i59;
        int i62 = 0;
        int i63 = 0;
        while (i31 < length) {
            int i64 = i31 + 1;
            int iCharAt10 = strZzd.charAt(i31);
            if (iCharAt10 >= c) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    cCharAt12 = strZzd.charAt(i66);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i65 |= (cCharAt12 & 8191) << i67;
                    i67 += 13;
                    i66 = i28;
                }
                iCharAt10 = i65 | (cCharAt12 << i67);
                i14 = i28;
            } else {
                i14 = i64;
            }
            int i68 = i14 + 1;
            int iCharAt11 = strZzd.charAt(i14);
            if (iCharAt11 >= c) {
                int i69 = iCharAt11 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt11 = strZzd.charAt(i70);
                    i15 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                    length = i15;
                }
                iCharAt11 = i69 | (cCharAt11 << i71);
                i16 = i27;
            } else {
                i15 = length;
                i16 = i68;
            }
            int i72 = iCharAt11 & 255;
            int i73 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            if (i72 >= 51) {
                int i74 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i26 = i76 + 1;
                        cCharAt10 = strZzd.charAt(i76);
                        i17 = i4;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i75 |= (cCharAt10 & 8191) << i77;
                        i77 += 13;
                        i76 = i26;
                        i4 = i17;
                    }
                    iCharAt12 = i75 | (cCharAt10 << i77);
                    i22 = i26;
                } else {
                    i17 = i4;
                    i22 = i74;
                }
                int i78 = i72 - 51;
                i19 = i22;
                if (i78 == 9 || i78 == 17) {
                    int i79 = i62 / 3;
                    i23 = i2 + 1;
                    objArr[i79 + i79 + 1] = objArrZze[i2];
                } else {
                    if (i78 == 12 && !z) {
                        int i80 = i62 / 3;
                        i23 = i2 + 1;
                        objArr[i80 + i80 + 1] = objArrZze[i2];
                    }
                    i24 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i24];
                    if (obj instanceof Field) {
                        fieldZzG2 = (Field) obj;
                    } else {
                        fieldZzG2 = zzG(cls, (String) obj);
                        objArrZze[i24] = fieldZzG2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzG2);
                    i25 = i24 + 1;
                    obj2 = objArrZze[i25];
                    if (obj2 instanceof Field) {
                        fieldZzG3 = (Field) obj2;
                    } else {
                        fieldZzG3 = zzG(cls, (String) obj2);
                        objArrZze[i25] = fieldZzG3;
                    }
                    strZzd = strZzd;
                    i3 = i3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i20 = 0;
                }
                i2 = i23;
                i24 = iCharAt12 + iCharAt12;
                obj = objArrZze[i24];
                if (obj instanceof Field) {
                    fieldZzG2 = (Field) obj;
                } else {
                    fieldZzG2 = zzG(cls, (String) obj);
                    objArrZze[i24] = fieldZzG2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzG2);
                i25 = i24 + 1;
                obj2 = objArrZze[i25];
                if (obj2 instanceof Field) {
                    fieldZzG3 = (Field) obj2;
                } else {
                    fieldZzG3 = zzG(cls, (String) obj2);
                    objArrZze[i25] = fieldZzG3;
                }
                strZzd = strZzd;
                i3 = i3;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i20 = 0;
            } else {
                i17 = i4;
                int i81 = i2 + 1;
                Field fieldZzG4 = zzG(cls, (String) objArrZze[i2]);
                if (i72 == 9 || i72 == 17) {
                    int i82 = i62 / 3;
                    objArr[i82 + i82 + 1] = fieldZzG4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        int i83 = i62 / 3;
                        i21 = i81 + 1;
                        objArr[i83 + i83 + 1] = objArrZze[i81];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        if (!z) {
                            int i84 = i62 / 3;
                            i21 = i81 + 1;
                            objArr[i84 + i84 + 1] = objArrZze[i81];
                        }
                    } else if (i72 == 50) {
                        int i85 = i60 + 1;
                        iArr[i60] = i62;
                        int i86 = i62 / 3;
                        int i87 = i86 + i86;
                        int i88 = i81 + 1;
                        objArr[i87] = objArrZze[i81];
                        if ((iCharAt11 & 2048) != 0) {
                            i81 = i88 + 1;
                            objArr[i87 + 1] = objArrZze[i88];
                            i60 = i85;
                        } else {
                            i60 = i85;
                            i18 = i88;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                        if ((iCharAt11 & 4096) == 4096 || i72 > 17) {
                            i19 = i16;
                            i20 = 0;
                            iObjectFieldOffset2 = 1048575;
                        } else {
                            int i89 = i16 + 1;
                            int iCharAt13 = strZzd.charAt(i16);
                            if (iCharAt13 >= 55296) {
                                int i90 = iCharAt13 & 8191;
                                int i91 = 13;
                                while (true) {
                                    i19 = i89 + 1;
                                    cCharAt9 = strZzd.charAt(i89);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i90 |= (cCharAt9 & 8191) << i91;
                                    i91 += 13;
                                    i89 = i19;
                                }
                                iCharAt13 = i90 | (cCharAt9 << i91);
                            } else {
                                i19 = i89;
                            }
                            int i92 = i3 + i3 + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i92];
                            if (obj3 instanceof Field) {
                                fieldZzG = (Field) obj3;
                            } else {
                                fieldZzG = zzG(cls, (String) obj3);
                                objArrZze[i92] = fieldZzG;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG);
                            i20 = iCharAt13 % 32;
                        }
                        if (i72 >= 18 && i72 <= 49) {
                            iArr[i61] = iObjectFieldOffset;
                            i61++;
                        }
                        i2 = i18;
                    }
                    i18 = i21;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                    if ((iCharAt11 & 4096) == 4096) {
                        i19 = i16;
                        i20 = 0;
                        iObjectFieldOffset2 = 1048575;
                    } else {
                        i19 = i16;
                        i20 = 0;
                        iObjectFieldOffset2 = 1048575;
                    }
                    if (i72 >= 18) {
                        iArr[i61] = iObjectFieldOffset;
                        i61++;
                    }
                    i2 = i18;
                }
                i18 = i81;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                if ((iCharAt11 & 4096) == 4096) {
                    i19 = i16;
                    i20 = 0;
                    iObjectFieldOffset2 = 1048575;
                } else {
                    i19 = i16;
                    i20 = 0;
                    iObjectFieldOffset2 = 1048575;
                }
                if (i72 >= 18) {
                    iArr[i61] = iObjectFieldOffset;
                    i61++;
                }
                i2 = i18;
            }
            int i93 = i62 + 1;
            iArr2[i62] = iCharAt10;
            int i94 = i93 + 1;
            iArr2[i93] = ((iCharAt11 & 256) != 0 ? DriveFile.MODE_READ_ONLY : 0) | ((iCharAt11 & 512) != 0 ? DriveFile.MODE_WRITE_ONLY : 0) | (i72 << 20) | iObjectFieldOffset;
            i62 = i94 + 1;
            iArr2[i94] = (i20 << 20) | iObjectFieldOffset2;
            i3 = i3;
            iCharAt = iCharAt;
            iCharAt3 = i73;
            i31 = i19;
            length = i15;
            objArr = objArr;
            strZzd = strZzd;
            iArr2 = iArr2;
            i4 = i17;
            c = 55296;
        }
        return new zzlo(iArr2, objArr, iCharAt, i4, zzlvVar.zza(), z, false, iArr, iCharAt3, i59, zzlqVar, zzkzVar, zzmnVar, zzjrVar, zzlgVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmx.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmx.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int i2;
        int iZzu;
        int iZzi;
        int iZzz;
        int iZzA8;
        int iZzA9;
        int iZzA10;
        int iZzA11;
        int iZzA12;
        int iZzB2;
        int iZzA13;
        int iZzd2;
        int iZzA14;
        int i3;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 0;
        int iZzA15 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i5 < this.zzc.length) {
            int iZzB3 = zzB(i5);
            int[] iArr = this.zzc;
            int i8 = iArr[i5];
            int iZzA16 = zzA(iZzB3);
            if (iZzA16 <= 17) {
                int i9 = iArr[i5 + 2];
                int i10 = i9 & i4;
                i = 1 << (i9 >>> 20);
                if (i10 != i7) {
                    i6 = unsafe.getInt(obj, i10);
                    i7 = i10;
                }
            } else {
                i = 0;
            }
            long j = iZzB3 & i4;
            switch (iZzA16) {
                case 0:
                    if ((i6 & i) != 0) {
                        iZzA = zzjl.zzA(i8 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 1:
                    if ((i6 & i) != 0) {
                        iZzA2 = zzjl.zzA(i8 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 2:
                    if ((i6 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzA3 = zzjl.zzA(i8 << 3);
                        iZzB = zzjl.zzB(j2);
                        iZzA15 += iZzA3 + iZzB;
                    }
                    break;
                case 3:
                    if ((i6 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzA3 = zzjl.zzA(i8 << 3);
                        iZzB = zzjl.zzB(j3);
                        iZzA15 += iZzA3 + iZzB;
                    }
                    break;
                case 4:
                    if ((i6 & i) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzv(i11);
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                    }
                    break;
                case 5:
                    if ((i6 & i) != 0) {
                        iZzA = zzjl.zzA(i8 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 6:
                    if ((i6 & i) != 0) {
                        iZzA2 = zzjl.zzA(i8 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 7:
                    if ((i6 & i) != 0) {
                        iZzA5 = zzjl.zzA(i8 << 3) + 1;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 8:
                    if ((i6 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzjd)) {
                            iZzA4 = zzjl.zzA(i8 << 3);
                            iZzv = zzjl.zzy((String) object);
                            i2 = iZzA4 + iZzv;
                            iZzA15 += i2;
                        } else {
                            iZzA6 = zzjl.zzA(i8 << 3);
                            iZzd = ((zzjd) object).zzd();
                            iZzA7 = zzjl.zzA(iZzd);
                            i2 = iZzA6 + iZzA7 + iZzd;
                            iZzA15 += i2;
                        }
                    }
                    break;
                case 9:
                    if ((i6 & i) != 0) {
                        iZzA5 = zzly.zzo(i8, unsafe.getObject(obj, j), zzE(i5));
                        iZzA15 += iZzA5;
                    }
                    break;
                case 10:
                    if ((i6 & i) != 0) {
                        zzjd zzjdVar = (zzjd) unsafe.getObject(obj, j);
                        iZzA6 = zzjl.zzA(i8 << 3);
                        iZzd = zzjdVar.zzd();
                        iZzA7 = zzjl.zzA(iZzd);
                        i2 = iZzA6 + iZzA7 + iZzd;
                        iZzA15 += i2;
                    }
                    break;
                case 11:
                    if ((i6 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzA(i12);
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                    }
                    break;
                case 12:
                    if ((i6 & i) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzv(i13);
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                    }
                    break;
                case 13:
                    if ((i6 & i) != 0) {
                        iZzA2 = zzjl.zzA(i8 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 14:
                    if ((i6 & i) != 0) {
                        iZzA = zzjl.zzA(i8 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 15:
                    if ((i6 & i) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        iZzA4 = zzjl.zzA(i8 << 3);
                        iZzv = zzjl.zzA((i14 >> 31) ^ (i14 + i14));
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                    }
                    break;
                case 16:
                    if ((i & i6) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        iZzA15 += zzjl.zzA(i8 << 3) + zzjl.zzB((j4 >> 63) ^ (j4 + j4));
                    }
                    break;
                case 17:
                    if ((i6 & i) != 0) {
                        iZzA5 = zzjl.zzu(i8, (zzll) unsafe.getObject(obj, j), zzE(i5));
                        iZzA15 += iZzA5;
                    }
                    break;
                case 18:
                    iZzA5 = zzly.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 19:
                    iZzA5 = zzly.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 20:
                    iZzA5 = zzly.zzm(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 21:
                    iZzA5 = zzly.zzx(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 22:
                    iZzA5 = zzly.zzk(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 23:
                    iZzA5 = zzly.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 24:
                    iZzA5 = zzly.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 25:
                    iZzA5 = zzly.zza(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 26:
                    iZzu = zzly.zzu(i8, (List) unsafe.getObject(obj, j));
                    iZzA15 += iZzu;
                    break;
                case 27:
                    iZzu = zzly.zzp(i8, (List) unsafe.getObject(obj, j), zzE(i5));
                    iZzA15 += iZzu;
                    break;
                case 28:
                    iZzu = zzly.zzc(i8, (List) unsafe.getObject(obj, j));
                    iZzA15 += iZzu;
                    break;
                case 29:
                    iZzu = zzly.zzv(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzu;
                    break;
                case 30:
                    iZzu = zzly.zzd(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzu;
                    break;
                case 31:
                    iZzu = zzly.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzu;
                    break;
                case 32:
                    iZzu = zzly.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzu;
                    break;
                case 33:
                    iZzu = zzly.zzq(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzu;
                    break;
                case 34:
                    iZzu = zzly.zzs(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzu;
                    break;
                case 35:
                    iZzi = zzly.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 36:
                    iZzi = zzly.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 37:
                    iZzi = zzly.zzn((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 38:
                    iZzi = zzly.zzy((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 39:
                    iZzi = zzly.zzl((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 40:
                    iZzi = zzly.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 41:
                    iZzi = zzly.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 42:
                    iZzi = zzly.zzb((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 43:
                    iZzi = zzly.zzw((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 44:
                    iZzi = zzly.zze((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 45:
                    iZzi = zzly.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 46:
                    iZzi = zzly.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 47:
                    iZzi = zzly.zzr((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 48:
                    iZzi = zzly.zzt((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjl.zzz(i8);
                        iZzA8 = zzjl.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 49:
                    iZzu = zzly.zzj(i8, (List) unsafe.getObject(obj, j), zzE(i5));
                    iZzA15 += iZzu;
                    break;
                case 50:
                    zzlg.zza(i8, unsafe.getObject(obj, j), zzF(i5));
                    break;
                case 51:
                    if (zzR(obj, i8, i5)) {
                        iZzA10 = zzjl.zzA(i8 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 52:
                    if (zzR(obj, i8, i5)) {
                        iZzA11 = zzjl.zzA(i8 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 53:
                    if (zzR(obj, i8, i5)) {
                        long jZzC = zzC(obj, j);
                        iZzA12 = zzjl.zzA(i8 << 3);
                        iZzB2 = zzjl.zzB(jZzC);
                        iZzA15 += iZzA12 + iZzB2;
                    }
                    break;
                case 54:
                    if (zzR(obj, i8, i5)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA12 = zzjl.zzA(i8 << 3);
                        iZzB2 = zzjl.zzB(jZzC2);
                        iZzA15 += iZzA12 + iZzB2;
                    }
                    break;
                case 55:
                    if (zzR(obj, i8, i5)) {
                        int iZzr = zzr(obj, j);
                        iZzA9 = zzjl.zzA(i8 << 3);
                        iZzi = zzjl.zzv(iZzr);
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 56:
                    if (zzR(obj, i8, i5)) {
                        iZzA10 = zzjl.zzA(i8 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 57:
                    if (zzR(obj, i8, i5)) {
                        iZzA11 = zzjl.zzA(i8 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 58:
                    if (zzR(obj, i8, i5)) {
                        iZzu = zzjl.zzA(i8 << 3) + 1;
                        iZzA15 += iZzu;
                    }
                    break;
                case 59:
                    if (zzR(obj, i8, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjd) {
                            iZzA13 = zzjl.zzA(i8 << 3);
                            iZzd2 = ((zzjd) object2).zzd();
                            iZzA14 = zzjl.zzA(iZzd2);
                            i3 = iZzA13 + iZzA14 + iZzd2;
                            iZzA15 += i3;
                        } else {
                            iZzA9 = zzjl.zzA(i8 << 3);
                            iZzi = zzjl.zzy((String) object2);
                            i3 = iZzA9 + iZzi;
                            iZzA15 += i3;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i8, i5)) {
                        iZzu = zzly.zzo(i8, unsafe.getObject(obj, j), zzE(i5));
                        iZzA15 += iZzu;
                    }
                    break;
                case 61:
                    if (zzR(obj, i8, i5)) {
                        zzjd zzjdVar2 = (zzjd) unsafe.getObject(obj, j);
                        iZzA13 = zzjl.zzA(i8 << 3);
                        iZzd2 = zzjdVar2.zzd();
                        iZzA14 = zzjl.zzA(iZzd2);
                        i3 = iZzA13 + iZzA14 + iZzd2;
                        iZzA15 += i3;
                    }
                    break;
                case 62:
                    if (zzR(obj, i8, i5)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA9 = zzjl.zzA(i8 << 3);
                        iZzi = zzjl.zzA(iZzr2);
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 63:
                    if (zzR(obj, i8, i5)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA9 = zzjl.zzA(i8 << 3);
                        iZzi = zzjl.zzv(iZzr3);
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 64:
                    if (zzR(obj, i8, i5)) {
                        iZzA11 = zzjl.zzA(i8 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 65:
                    if (zzR(obj, i8, i5)) {
                        iZzA10 = zzjl.zzA(i8 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 66:
                    if (zzR(obj, i8, i5)) {
                        int iZzr4 = zzr(obj, j);
                        iZzA9 = zzjl.zzA(i8 << 3);
                        iZzi = zzjl.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 67:
                    if (zzR(obj, i8, i5)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA15 += zzjl.zzA(i8 << 3) + zzjl.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                    }
                    break;
                case 68:
                    if (zzR(obj, i8, i5)) {
                        iZzu = zzjl.zzu(i8, (zzll) unsafe.getObject(obj, j), zzE(i5));
                        iZzA15 += iZzu;
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i4 = 1048575;
        }
        zzmn zzmnVar = this.zzn;
        int iZza = iZzA15 + zzmnVar.zza(zzmnVar.zzc(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iZzo;
        int iZzz;
        int iZzA8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int iZzB2 = zzB(i3);
            int iZzA9 = zzA(iZzB2);
            int i4 = this.zzc[i3];
            long j = iZzB2 & 1048575;
            if (iZzA9 >= zzjw.DOUBLE_LIST_PACKED.zza() && iZzA9 <= zzjw.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (iZzA9) {
                case 0:
                    if (zzO(obj, i3)) {
                        iZzA = zzjl.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case 1:
                    if (zzO(obj, i3)) {
                        iZzA2 = zzjl.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case 2:
                    if (zzO(obj, i3)) {
                        long jZzd = zzmx.zzd(obj, j);
                        iZzA3 = zzjl.zzA(i4 << 3);
                        iZzB = zzjl.zzB(jZzd);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case 3:
                    if (zzO(obj, i3)) {
                        long jZzd2 = zzmx.zzd(obj, j);
                        iZzA3 = zzjl.zzA(i4 << 3);
                        iZzB = zzjl.zzB(jZzd2);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case 4:
                    if (zzO(obj, i3)) {
                        int iZzc = zzmx.zzc(obj, j);
                        iZzA4 = zzjl.zzA(i4 << 3);
                        iZzv = zzjl.zzv(iZzc);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 5:
                    if (zzO(obj, i3)) {
                        iZzA = zzjl.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case 6:
                    if (zzO(obj, i3)) {
                        iZzA2 = zzjl.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case 7:
                    if (zzO(obj, i3)) {
                        iZzA5 = zzjl.zzA(i4 << 3);
                        iZzo = iZzA5 + 1;
                        i2 += iZzo;
                    }
                    break;
                case 8:
                    if (zzO(obj, i3)) {
                        Object objZzf = zzmx.zzf(obj, j);
                        if (objZzf instanceof zzjd) {
                            iZzA6 = zzjl.zzA(i4 << 3);
                            iZzd = ((zzjd) objZzf).zzd();
                            iZzA7 = zzjl.zzA(iZzd);
                            i = iZzA6 + iZzA7 + iZzd;
                            i2 += i;
                        } else {
                            iZzA4 = zzjl.zzA(i4 << 3);
                            iZzv = zzjl.zzy((String) objZzf);
                            i = iZzA4 + iZzv;
                            i2 += i;
                        }
                    }
                    break;
                case 9:
                    if (zzO(obj, i3)) {
                        iZzo = zzly.zzo(i4, zzmx.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                    }
                    break;
                case 10:
                    if (zzO(obj, i3)) {
                        zzjd zzjdVar = (zzjd) zzmx.zzf(obj, j);
                        iZzA6 = zzjl.zzA(i4 << 3);
                        iZzd = zzjdVar.zzd();
                        iZzA7 = zzjl.zzA(iZzd);
                        i = iZzA6 + iZzA7 + iZzd;
                        i2 += i;
                    }
                    break;
                case 11:
                    if (zzO(obj, i3)) {
                        int iZzc2 = zzmx.zzc(obj, j);
                        iZzA4 = zzjl.zzA(i4 << 3);
                        iZzv = zzjl.zzA(iZzc2);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 12:
                    if (zzO(obj, i3)) {
                        int iZzc3 = zzmx.zzc(obj, j);
                        iZzA4 = zzjl.zzA(i4 << 3);
                        iZzv = zzjl.zzv(iZzc3);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 13:
                    if (zzO(obj, i3)) {
                        iZzA2 = zzjl.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case 14:
                    if (zzO(obj, i3)) {
                        iZzA = zzjl.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case 15:
                    if (zzO(obj, i3)) {
                        int iZzc4 = zzmx.zzc(obj, j);
                        iZzA4 = zzjl.zzA(i4 << 3);
                        iZzv = zzjl.zzA((iZzc4 >> 31) ^ (iZzc4 + iZzc4));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 16:
                    if (zzO(obj, i3)) {
                        long jZzd3 = zzmx.zzd(obj, j);
                        iZzA4 = zzjl.zzA(i4 << 3);
                        iZzv = zzjl.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 17:
                    if (zzO(obj, i3)) {
                        iZzo = zzjl.zzu(i4, (zzll) zzmx.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                    }
                    break;
                case 18:
                    iZzo = zzly.zzh(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 19:
                    iZzo = zzly.zzf(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 20:
                    iZzo = zzly.zzm(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 21:
                    iZzo = zzly.zzx(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 22:
                    iZzo = zzly.zzk(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 23:
                    iZzo = zzly.zzh(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 24:
                    iZzo = zzly.zzf(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 25:
                    iZzo = zzly.zza(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 26:
                    iZzo = zzly.zzu(i4, (List) zzmx.zzf(obj, j));
                    i2 += iZzo;
                    break;
                case 27:
                    iZzo = zzly.zzp(i4, (List) zzmx.zzf(obj, j), zzE(i3));
                    i2 += iZzo;
                    break;
                case 28:
                    iZzo = zzly.zzc(i4, (List) zzmx.zzf(obj, j));
                    i2 += iZzo;
                    break;
                case 29:
                    iZzo = zzly.zzv(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 30:
                    iZzo = zzly.zzd(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 31:
                    iZzo = zzly.zzf(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 32:
                    iZzo = zzly.zzh(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 33:
                    iZzo = zzly.zzq(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 34:
                    iZzo = zzly.zzs(i4, (List) zzmx.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 35:
                    iZzv = zzly.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 36:
                    iZzv = zzly.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 37:
                    iZzv = zzly.zzn((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 38:
                    iZzv = zzly.zzy((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 39:
                    iZzv = zzly.zzl((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 40:
                    iZzv = zzly.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 41:
                    iZzv = zzly.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 42:
                    iZzv = zzly.zzb((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 43:
                    iZzv = zzly.zzw((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 44:
                    iZzv = zzly.zze((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 45:
                    iZzv = zzly.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 46:
                    iZzv = zzly.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 47:
                    iZzv = zzly.zzr((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 48:
                    iZzv = zzly.zzt((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjl.zzz(i4);
                        iZzA8 = zzjl.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 49:
                    iZzo = zzly.zzj(i4, (List) zzmx.zzf(obj, j), zzE(i3));
                    i2 += iZzo;
                    break;
                case 50:
                    zzlg.zza(i4, zzmx.zzf(obj, j), zzF(i3));
                    break;
                case 51:
                    if (zzR(obj, i4, i3)) {
                        iZzA = zzjl.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case 52:
                    if (zzR(obj, i4, i3)) {
                        iZzA2 = zzjl.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case 53:
                    if (zzR(obj, i4, i3)) {
                        long jZzC = zzC(obj, j);
                        iZzA3 = zzjl.zzA(i4 << 3);
                        iZzB = zzjl.zzB(jZzC);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case 54:
                    if (zzR(obj, i4, i3)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA3 = zzjl.zzA(i4 << 3);
                        iZzB = zzjl.zzB(jZzC2);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case 55:
                    if (zzR(obj, i4, i3)) {
                        int iZzr = zzr(obj, j);
                        iZzA4 = zzjl.zzA(i4 << 3);
                        iZzv = zzjl.zzv(iZzr);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 56:
                    if (zzR(obj, i4, i3)) {
                        iZzA = zzjl.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case 57:
                    if (zzR(obj, i4, i3)) {
                        iZzA2 = zzjl.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case 58:
                    if (zzR(obj, i4, i3)) {
                        iZzA5 = zzjl.zzA(i4 << 3);
                        iZzo = iZzA5 + 1;
                        i2 += iZzo;
                    }
                    break;
                case 59:
                    if (zzR(obj, i4, i3)) {
                        Object objZzf2 = zzmx.zzf(obj, j);
                        if (objZzf2 instanceof zzjd) {
                            iZzA6 = zzjl.zzA(i4 << 3);
                            iZzd = ((zzjd) objZzf2).zzd();
                            iZzA7 = zzjl.zzA(iZzd);
                            i = iZzA6 + iZzA7 + iZzd;
                            i2 += i;
                        } else {
                            iZzA4 = zzjl.zzA(i4 << 3);
                            iZzv = zzjl.zzy((String) objZzf2);
                            i = iZzA4 + iZzv;
                            i2 += i;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i4, i3)) {
                        iZzo = zzly.zzo(i4, zzmx.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                    }
                    break;
                case 61:
                    if (zzR(obj, i4, i3)) {
                        zzjd zzjdVar2 = (zzjd) zzmx.zzf(obj, j);
                        iZzA6 = zzjl.zzA(i4 << 3);
                        iZzd = zzjdVar2.zzd();
                        iZzA7 = zzjl.zzA(iZzd);
                        i = iZzA6 + iZzA7 + iZzd;
                        i2 += i;
                    }
                    break;
                case 62:
                    if (zzR(obj, i4, i3)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA4 = zzjl.zzA(i4 << 3);
                        iZzv = zzjl.zzA(iZzr2);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 63:
                    if (zzR(obj, i4, i3)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA4 = zzjl.zzA(i4 << 3);
                        iZzv = zzjl.zzv(iZzr3);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 64:
                    if (zzR(obj, i4, i3)) {
                        iZzA2 = zzjl.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case 65:
                    if (zzR(obj, i4, i3)) {
                        iZzA = zzjl.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case 66:
                    if (zzR(obj, i4, i3)) {
                        int iZzr4 = zzr(obj, j);
                        iZzA4 = zzjl.zzA(i4 << 3);
                        iZzv = zzjl.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 67:
                    if (zzR(obj, i4, i3)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA4 = zzjl.zzA(i4 << 3);
                        iZzv = zzjl.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 68:
                    if (zzR(obj, i4, i3)) {
                        iZzo = zzjl.zzu(i4, (zzll) zzmx.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                    }
                    break;
            }
        }
        zzmn zzmnVar = this.zzn;
        return i2 + zzmnVar.zza(zzmnVar.zzc(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmx.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zziq zziqVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlf) object).zze()) {
            zzlf zzlfVarZzb = zzlf.zza().zzb();
            zzlg.zzb(zzlfVarZzb, object);
            unsafe.putObject(obj, j, zzlfVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zziq zziqVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzir.zzn(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzir.zzb(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iZzm = zzir.zzm(bArr, i, zziqVar);
                unsafe.putObject(obj, j, Long.valueOf(zziqVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return iZzm;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iZzj = zzir.zzj(bArr, i, zziqVar);
                unsafe.putObject(obj, j, Integer.valueOf(zziqVar.zza));
                unsafe.putInt(obj, j2, i4);
                return iZzj;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzir.zzn(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzir.zzb(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iZzm2 = zzir.zzm(bArr, i, zziqVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zziqVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return iZzm2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZzj2 = zzir.zzj(bArr, i, zziqVar);
                int i9 = zziqVar.zza;
                if (i9 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & DriveFile.MODE_WRITE_ONLY) != 0 && !zznc.zzf(bArr, iZzj2, iZzj2 + i9)) {
                        throw zzko.zzc();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i9, zzkm.zzb));
                    iZzj2 += i9;
                }
                unsafe.putInt(obj, j2, i4);
                return iZzj2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iZzd = zzir.zzd(zzE(i8), bArr, i, i2, zziqVar);
                Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, zziqVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzkm.zzg(object, zziqVar.zzc));
                }
                unsafe.putInt(obj, j2, i4);
                return iZzd;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iZza = zzir.zza(bArr, i, zziqVar);
                unsafe.putObject(obj, j, zziqVar.zzc);
                unsafe.putInt(obj, j2, i4);
                return iZza;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iZzj3 = zzir.zzj(bArr, i, zziqVar);
                int i10 = zziqVar.zza;
                zzki zzkiVarZzD = zzD(i8);
                if (zzkiVarZzD == null || zzkiVarZzD.zza(i10)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    unsafe.putInt(obj, j2, i4);
                } else {
                    zzd(obj).zzh(i3, Long.valueOf(i10));
                }
                return iZzj3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iZzj4 = zzir.zzj(bArr, i, zziqVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzjh.zzb(zziqVar.zza)));
                unsafe.putInt(obj, j2, i4);
                return iZzj4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iZzm3 = zzir.zzm(bArr, i, zziqVar);
                unsafe.putObject(obj, j, Long.valueOf(zzjh.zzc(zziqVar.zzb)));
                unsafe.putInt(obj, j2, i4);
                return iZzm3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                int iZzc = zzir.zzc(zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zziqVar);
                Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j, zziqVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzkm.zzg(object2, zziqVar.zzc));
                }
                unsafe.putInt(obj, j2, i4);
                return iZzc;
            default:
                return i;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0081. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i, int i2, zziq zziqVar) throws IOException {
        int i3;
        int iZzk;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int iZzm;
        int iZzd;
        int i9;
        int i10;
        int i11;
        zzlo<T> zzloVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i12 = i2;
        zziqVar = zziqVar;
        Unsafe unsafe2 = zzb;
        int i13 = 1048575;
        int i14 = -1;
        int iZzi = i;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (iZzi < i12) {
            int i19 = iZzi + 1;
            byte b = bArr2[iZzi];
            if (b < 0) {
                iZzk = zzir.zzk(b, bArr2, i19, zziqVar);
                i3 = zziqVar.zza;
            } else {
                i3 = b;
                iZzk = i19;
            }
            int i20 = i3 >>> 3;
            int i21 = i3 & 7;
            int iZzx = i20 > i15 ? zzloVar.zzx(i20, i16 / 3) : zzloVar.zzw(i20);
            if (iZzx == i14) {
                i4 = iZzk;
                i5 = i20;
                unsafe = unsafe2;
                i6 = 0;
            } else {
                int[] iArr = zzloVar.zzc;
                int i22 = iArr[iZzx + 1];
                int iZzA = zzA(i22);
                long j = i22 & i13;
                if (iZzA <= 17) {
                    int i23 = iArr[iZzx + 2];
                    int i24 = 1 << (i23 >>> 20);
                    int i25 = i23 & 1048575;
                    if (i25 != i18) {
                        if (i18 != 1048575) {
                            unsafe2.putInt(obj2, i18, i17);
                        }
                        if (i25 != 1048575) {
                            i17 = unsafe2.getInt(obj2, i25);
                        }
                        i18 = i25;
                    }
                    switch (iZzA) {
                        case 0:
                            i7 = iZzx;
                            i8 = iZzk;
                            i5 = i20;
                            if (i21 == 1) {
                                zzmx.zzo(obj2, j, Double.longBitsToDouble(zzir.zzn(bArr2, i8)));
                                iZzi = i8 + 8;
                                i17 |= i24;
                                i16 = i7;
                                i15 = i5;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 1:
                            zziqVar = zziqVar;
                            i7 = iZzx;
                            i8 = iZzk;
                            i5 = i20;
                            if (i21 == 5) {
                                zzmx.zzp(obj2, j, Float.intBitsToFloat(zzir.zzb(bArr2, i8)));
                                iZzi = i8 + 4;
                                i17 |= i24;
                                i16 = i7;
                                i15 = i5;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 2:
                        case 3:
                            zziqVar = zziqVar;
                            i7 = iZzx;
                            i8 = iZzk;
                            i5 = i20;
                            if (i21 == 0) {
                                iZzm = zzir.zzm(bArr2, i8, zziqVar);
                                unsafe2.putLong(obj, j, zziqVar.zzb);
                                i17 |= i24;
                                iZzi = iZzm;
                                i16 = i7;
                                i15 = i5;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 4:
                        case 11:
                            zziqVar = zziqVar;
                            i7 = iZzx;
                            i8 = iZzk;
                            i5 = i20;
                            if (i21 == 0) {
                                iZzi = zzir.zzj(bArr2, i8, zziqVar);
                                unsafe2.putInt(obj2, j, zziqVar.zza);
                                i17 |= i24;
                                i16 = i7;
                                i15 = i5;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 5:
                        case 14:
                            i7 = iZzx;
                            i5 = i20;
                            if (i21 == 1) {
                                i8 = iZzk;
                                unsafe2.putLong(obj, j, zzir.zzn(bArr2, iZzk));
                                iZzi = i8 + 8;
                                i17 |= i24;
                                i16 = i7;
                                i15 = i5;
                            }
                            i8 = iZzk;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 6:
                        case 13:
                            zziqVar = zziqVar;
                            i7 = iZzx;
                            i5 = i20;
                            if (i21 == 5) {
                                unsafe2.putInt(obj2, j, zzir.zzb(bArr2, iZzk));
                                iZzi = iZzk + 4;
                                i17 |= i24;
                                i16 = i7;
                                i15 = i5;
                            }
                            i8 = iZzk;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 7:
                            zziqVar = zziqVar;
                            i7 = iZzx;
                            i5 = i20;
                            if (i21 == 0) {
                                iZzi = zzir.zzm(bArr2, iZzk, zziqVar);
                                zzmx.zzm(obj2, j, zziqVar.zzb != 0);
                                i17 |= i24;
                                i16 = i7;
                                i15 = i5;
                            }
                            i8 = iZzk;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 8:
                            zziqVar = zziqVar;
                            i7 = iZzx;
                            i5 = i20;
                            if (i21 == 2) {
                                iZzi = (536870912 & i22) == 0 ? zzir.zzg(bArr2, iZzk, zziqVar) : zzir.zzh(bArr2, iZzk, zziqVar);
                                unsafe2.putObject(obj2, j, zziqVar.zzc);
                                i17 |= i24;
                                i16 = i7;
                                i15 = i5;
                            }
                            i8 = iZzk;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 9:
                            zziqVar = zziqVar;
                            i7 = iZzx;
                            i5 = i20;
                            if (i21 == 2) {
                                iZzd = zzir.zzd(zzloVar.zzE(i7), bArr2, iZzk, i12, zziqVar);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zziqVar.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzkm.zzg(object, zziqVar.zzc));
                                }
                                i17 |= i24;
                                iZzi = iZzd;
                                i16 = i7;
                                i15 = i5;
                            }
                            i8 = iZzk;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 10:
                            zziqVar = zziqVar;
                            i7 = iZzx;
                            i5 = i20;
                            if (i21 == 2) {
                                iZzd = zzir.zza(bArr2, iZzk, zziqVar);
                                unsafe2.putObject(obj2, j, zziqVar.zzc);
                                i17 |= i24;
                                iZzi = iZzd;
                                i16 = i7;
                                i15 = i5;
                            }
                            i8 = iZzk;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 12:
                            zziqVar = zziqVar;
                            i7 = iZzx;
                            i5 = i20;
                            if (i21 == 0) {
                                iZzd = zzir.zzj(bArr2, iZzk, zziqVar);
                                unsafe2.putInt(obj2, j, zziqVar.zza);
                                i17 |= i24;
                                iZzi = iZzd;
                                i16 = i7;
                                i15 = i5;
                            }
                            i8 = iZzk;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 15:
                            zziqVar = zziqVar;
                            i7 = iZzx;
                            i5 = i20;
                            if (i21 == 0) {
                                iZzd = zzir.zzj(bArr2, iZzk, zziqVar);
                                unsafe2.putInt(obj2, j, zzjh.zzb(zziqVar.zza));
                                i17 |= i24;
                                iZzi = iZzd;
                                i16 = i7;
                                i15 = i5;
                            }
                            i8 = iZzk;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 16:
                            if (i21 != 0) {
                                i5 = i20;
                                i7 = iZzx;
                                i8 = iZzk;
                                i4 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                zziqVar = zziqVar;
                                iZzm = zzir.zzm(bArr2, iZzk, zziqVar);
                                i7 = iZzx;
                                i5 = i20;
                                unsafe2.putLong(obj, j, zzjh.zzc(zziqVar.zzb));
                                i17 |= i24;
                                iZzi = iZzm;
                                i16 = i7;
                                i15 = i5;
                            }
                            break;
                        default:
                            i5 = i20;
                            i7 = iZzx;
                            i8 = iZzk;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                    }
                    i14 = -1;
                    i13 = 1048575;
                } else {
                    zziqVar = zziqVar;
                    i7 = iZzx;
                    int i26 = iZzk;
                    i5 = i20;
                    if (iZzA == 27) {
                        if (i21 == 2) {
                            zzkl zzklVarZzd = (zzkl) unsafe2.getObject(obj2, j);
                            if (!zzklVarZzd.zzc()) {
                                int size = zzklVarZzd.size();
                                zzklVarZzd = zzklVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzklVarZzd);
                            }
                            iZzi = zzir.zze(zzloVar.zzE(i7), i3, bArr, i26, i2, zzklVarZzd, zziqVar);
                            i17 = i17;
                            i16 = i7;
                            i15 = i5;
                            i14 = -1;
                            i13 = 1048575;
                        } else {
                            i9 = i26;
                            i10 = i17;
                            i11 = i18;
                            unsafe = unsafe2;
                            i6 = i7;
                        }
                    } else if (iZzA <= 49) {
                        i10 = i17;
                        i11 = i18;
                        unsafe = unsafe2;
                        i6 = i7;
                        iZzi = zzv(obj, bArr, i26, i2, i3, i5, i21, i7, i22, iZzA, j, zziqVar);
                        if (iZzi != i26) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i12 = i2;
                            zziqVar = zziqVar;
                            i18 = i11;
                            i15 = i5;
                            i17 = i10;
                            i16 = i6;
                            unsafe2 = unsafe;
                            i14 = -1;
                            i13 = 1048575;
                            zzloVar = this;
                        } else {
                            i4 = iZzi;
                            i18 = i11;
                            i17 = i10;
                        }
                    } else {
                        i9 = i26;
                        i10 = i17;
                        i11 = i18;
                        unsafe = unsafe2;
                        i6 = i7;
                        if (iZzA != 50) {
                            iZzi = zzt(obj, bArr, i9, i2, i3, i5, i21, i22, iZzA, j, i6, zziqVar);
                            if (iZzi != i9) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i12 = i2;
                                zziqVar = zziqVar;
                                i18 = i11;
                                i15 = i5;
                                i17 = i10;
                                i16 = i6;
                                unsafe2 = unsafe;
                                i14 = -1;
                                i13 = 1048575;
                                zzloVar = this;
                            } else {
                                i4 = iZzi;
                                i18 = i11;
                                i17 = i10;
                            }
                        } else if (i21 == 2) {
                            iZzi = zzs(obj, bArr, i9, i2, i6, j, zziqVar);
                            if (iZzi != i9) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i12 = i2;
                                zziqVar = zziqVar;
                                i18 = i11;
                                i15 = i5;
                                i17 = i10;
                                i16 = i6;
                                unsafe2 = unsafe;
                                i14 = -1;
                                i13 = 1048575;
                                zzloVar = this;
                            } else {
                                i4 = iZzi;
                                i18 = i11;
                                i17 = i10;
                            }
                        }
                    }
                    i4 = i9;
                    i18 = i11;
                    i17 = i10;
                }
            }
            iZzi = zzir.zzi(i3, bArr, i4, i2, zzd(obj), zziqVar);
            zzloVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i12 = i2;
            zziqVar = zziqVar;
            i15 = i5;
            i16 = i6;
            unsafe2 = unsafe;
            i14 = -1;
            i13 = 1048575;
        }
        int i27 = i17;
        int i28 = i18;
        Unsafe unsafe3 = unsafe2;
        if (i28 != 1048575) {
            unsafe3.putInt(obj, i28, i27);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        throw zzko.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zziq zziqVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzj;
        int iZzj2 = i;
        Unsafe unsafe = zzb;
        zzkl zzklVarZzd = (zzkl) unsafe.getObject(obj, j2);
        if (!zzklVarZzd.zzc()) {
            int size = zzklVarZzd.size();
            zzklVarZzd = zzklVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzklVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzjn zzjnVar = (zzjn) zzklVarZzd;
                    int iZzj3 = zzir.zzj(bArr, iZzj2, zziqVar);
                    int i12 = zziqVar.zza + iZzj3;
                    while (iZzj3 < i12) {
                        zzjnVar.zze(Double.longBitsToDouble(zzir.zzn(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i12) {
                        return iZzj3;
                    }
                    throw zzko.zzf();
                }
                if (i5 == 1) {
                    zzjn zzjnVar2 = (zzjn) zzklVarZzd;
                    zzjnVar2.zze(Double.longBitsToDouble(zzir.zzn(bArr, i)));
                    while (true) {
                        i8 = iZzj2 + 8;
                        if (i8 < i2) {
                            iZzj2 = zzir.zzj(bArr, i8, zziqVar);
                            if (i3 == zziqVar.zza) {
                                zzjnVar2.zze(Double.longBitsToDouble(zzir.zzn(bArr, iZzj2)));
                            }
                        }
                    }
                    return i8;
                }
                return iZzj2;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzjx zzjxVar = (zzjx) zzklVarZzd;
                    int iZzj4 = zzir.zzj(bArr, iZzj2, zziqVar);
                    int i13 = zziqVar.zza + iZzj4;
                    while (iZzj4 < i13) {
                        zzjxVar.zze(Float.intBitsToFloat(zzir.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i13) {
                        return iZzj4;
                    }
                    throw zzko.zzf();
                }
                if (i5 == 5) {
                    zzjx zzjxVar2 = (zzjx) zzklVarZzd;
                    zzjxVar2.zze(Float.intBitsToFloat(zzir.zzb(bArr, i)));
                    while (true) {
                        i9 = iZzj2 + 4;
                        if (i9 < i2) {
                            iZzj2 = zzir.zzj(bArr, i9, zziqVar);
                            if (i3 == zziqVar.zza) {
                                zzjxVar2.zze(Float.intBitsToFloat(zzir.zzb(bArr, iZzj2)));
                            }
                        }
                    }
                    return i9;
                }
                return iZzj2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzla zzlaVar = (zzla) zzklVarZzd;
                    int iZzj5 = zzir.zzj(bArr, iZzj2, zziqVar);
                    int i14 = zziqVar.zza + iZzj5;
                    while (iZzj5 < i14) {
                        iZzj5 = zzir.zzm(bArr, iZzj5, zziqVar);
                        zzlaVar.zzg(zziqVar.zzb);
                    }
                    if (iZzj5 == i14) {
                        return iZzj5;
                    }
                    throw zzko.zzf();
                }
                if (i5 == 0) {
                    zzla zzlaVar2 = (zzla) zzklVarZzd;
                    int iZzm = zzir.zzm(bArr, iZzj2, zziqVar);
                    zzlaVar2.zzg(zziqVar.zzb);
                    while (iZzm < i2) {
                        int iZzj6 = zzir.zzj(bArr, iZzm, zziqVar);
                        if (i3 != zziqVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzir.zzm(bArr, iZzj6, zziqVar);
                        zzlaVar2.zzg(zziqVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzir.zzf(bArr, iZzj2, zzklVarZzd, zziqVar);
                }
                if (i5 == 0) {
                    return zzir.zzl(i3, bArr, i, i2, zzklVarZzd, zziqVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzla zzlaVar3 = (zzla) zzklVarZzd;
                    int iZzj7 = zzir.zzj(bArr, iZzj2, zziqVar);
                    int i15 = zziqVar.zza + iZzj7;
                    while (iZzj7 < i15) {
                        zzlaVar3.zzg(zzir.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i15) {
                        return iZzj7;
                    }
                    throw zzko.zzf();
                }
                if (i5 == 1) {
                    zzla zzlaVar4 = (zzla) zzklVarZzd;
                    zzlaVar4.zzg(zzir.zzn(bArr, i));
                    while (true) {
                        i10 = iZzj2 + 8;
                        if (i10 < i2) {
                            iZzj2 = zzir.zzj(bArr, i10, zziqVar);
                            if (i3 == zziqVar.zza) {
                                zzlaVar4.zzg(zzir.zzn(bArr, iZzj2));
                            }
                        }
                    }
                    return i10;
                }
                return iZzj2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzkf zzkfVar = (zzkf) zzklVarZzd;
                    int iZzj8 = zzir.zzj(bArr, iZzj2, zziqVar);
                    int i16 = zziqVar.zza + iZzj8;
                    while (iZzj8 < i16) {
                        zzkfVar.zzh(zzir.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i16) {
                        return iZzj8;
                    }
                    throw zzko.zzf();
                }
                if (i5 == 5) {
                    zzkf zzkfVar2 = (zzkf) zzklVarZzd;
                    zzkfVar2.zzh(zzir.zzb(bArr, i));
                    while (true) {
                        i11 = iZzj2 + 4;
                        if (i11 < i2) {
                            iZzj2 = zzir.zzj(bArr, i11, zziqVar);
                            if (i3 == zziqVar.zza) {
                                zzkfVar2.zzh(zzir.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i11;
                }
                return iZzj2;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzis zzisVar = (zzis) zzklVarZzd;
                    iZzj = zzir.zzj(bArr, iZzj2, zziqVar);
                    int i17 = zziqVar.zza + iZzj;
                    while (iZzj < i17) {
                        iZzj = zzir.zzm(bArr, iZzj, zziqVar);
                        zzisVar.zze(zziqVar.zzb != 0);
                    }
                    if (iZzj != i17) {
                        throw zzko.zzf();
                    }
                    return iZzj;
                }
                if (i5 == 0) {
                    zzis zzisVar2 = (zzis) zzklVarZzd;
                    int iZzm2 = zzir.zzm(bArr, iZzj2, zziqVar);
                    zzisVar2.zze(zziqVar.zzb != 0);
                    while (iZzm2 < i2) {
                        int iZzj9 = zzir.zzj(bArr, iZzm2, zziqVar);
                        if (i3 != zziqVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzir.zzm(bArr, iZzj9, zziqVar);
                        zzisVar2.zze(zziqVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iZzj2 = zzir.zzj(bArr, iZzj2, zziqVar);
                        int i18 = zziqVar.zza;
                        if (i18 < 0) {
                            throw zzko.zzd();
                        }
                        if (i18 == 0) {
                            zzklVarZzd.add("");
                        } else {
                            zzklVarZzd.add(new String(bArr, iZzj2, i18, zzkm.zzb));
                            iZzj2 += i18;
                        }
                        while (iZzj2 < i2) {
                            int iZzj10 = zzir.zzj(bArr, iZzj2, zziqVar);
                            if (i3 == zziqVar.zza) {
                                iZzj2 = zzir.zzj(bArr, iZzj10, zziqVar);
                                int i19 = zziqVar.zza;
                                if (i19 < 0) {
                                    throw zzko.zzd();
                                }
                                if (i19 == 0) {
                                    zzklVarZzd.add("");
                                } else {
                                    zzklVarZzd.add(new String(bArr, iZzj2, i19, zzkm.zzb));
                                    iZzj2 += i19;
                                }
                            }
                        }
                    } else {
                        iZzj2 = zzir.zzj(bArr, iZzj2, zziqVar);
                        int i20 = zziqVar.zza;
                        if (i20 < 0) {
                            throw zzko.zzd();
                        }
                        if (i20 == 0) {
                            zzklVarZzd.add("");
                        } else {
                            int i21 = iZzj2 + i20;
                            if (!zznc.zzf(bArr, iZzj2, i21)) {
                                throw zzko.zzc();
                            }
                            zzklVarZzd.add(new String(bArr, iZzj2, i20, zzkm.zzb));
                            iZzj2 = i21;
                        }
                        while (iZzj2 < i2) {
                            int iZzj11 = zzir.zzj(bArr, iZzj2, zziqVar);
                            if (i3 == zziqVar.zza) {
                                iZzj2 = zzir.zzj(bArr, iZzj11, zziqVar);
                                int i22 = zziqVar.zza;
                                if (i22 < 0) {
                                    throw zzko.zzd();
                                }
                                if (i22 == 0) {
                                    zzklVarZzd.add("");
                                } else {
                                    int i23 = iZzj2 + i22;
                                    if (!zznc.zzf(bArr, iZzj2, i23)) {
                                        throw zzko.zzc();
                                    }
                                    zzklVarZzd.add(new String(bArr, iZzj2, i22, zzkm.zzb));
                                    iZzj2 = i23;
                                }
                            }
                        }
                    }
                }
                return iZzj2;
            case 27:
                if (i5 == 2) {
                    return zzir.zze(zzE(i6), i3, bArr, i, i2, zzklVarZzd, zziqVar);
                }
                return iZzj2;
            case 28:
                if (i5 == 2) {
                    int iZzj12 = zzir.zzj(bArr, iZzj2, zziqVar);
                    int i24 = zziqVar.zza;
                    if (i24 < 0) {
                        throw zzko.zzd();
                    }
                    if (i24 > bArr.length - iZzj12) {
                        throw zzko.zzf();
                    }
                    if (i24 == 0) {
                        zzklVarZzd.add(zzjd.zzb);
                    } else {
                        zzklVarZzd.add(zzjd.zzl(bArr, iZzj12, i24));
                        iZzj12 += i24;
                    }
                    while (iZzj12 < i2) {
                        int iZzj13 = zzir.zzj(bArr, iZzj12, zziqVar);
                        if (i3 != zziqVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzir.zzj(bArr, iZzj13, zziqVar);
                        int i25 = zziqVar.zza;
                        if (i25 < 0) {
                            throw zzko.zzd();
                        }
                        if (i25 > bArr.length - iZzj12) {
                            throw zzko.zzf();
                        }
                        if (i25 == 0) {
                            zzklVarZzd.add(zzjd.zzb);
                        } else {
                            zzklVarZzd.add(zzjd.zzl(bArr, iZzj12, i25));
                            iZzj12 += i25;
                        }
                    }
                    return iZzj12;
                }
                return iZzj2;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZzj = zzir.zzl(i3, bArr, i, i2, zzklVarZzd, zziqVar);
                    }
                    return iZzj2;
                }
                iZzj = zzir.zzf(bArr, iZzj2, zzklVarZzd, zziqVar);
                zzke zzkeVar = (zzke) obj;
                zzmo zzmoVar = zzkeVar.zzc;
                if (zzmoVar == zzmo.zzc()) {
                    zzmoVar = null;
                }
                Object objZzC = zzly.zzC(i4, zzklVarZzd, zzD(i6), zzmoVar, this.zzn);
                if (objZzC != null) {
                    zzkeVar.zzc = (zzmo) objZzC;
                    return iZzj;
                }
                return iZzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkf zzkfVar3 = (zzkf) zzklVarZzd;
                    int iZzj14 = zzir.zzj(bArr, iZzj2, zziqVar);
                    int i26 = zziqVar.zza + iZzj14;
                    while (iZzj14 < i26) {
                        iZzj14 = zzir.zzj(bArr, iZzj14, zziqVar);
                        zzkfVar3.zzh(zzjh.zzb(zziqVar.zza));
                    }
                    if (iZzj14 == i26) {
                        return iZzj14;
                    }
                    throw zzko.zzf();
                }
                if (i5 == 0) {
                    zzkf zzkfVar4 = (zzkf) zzklVarZzd;
                    int iZzj15 = zzir.zzj(bArr, iZzj2, zziqVar);
                    zzkfVar4.zzh(zzjh.zzb(zziqVar.zza));
                    while (iZzj15 < i2) {
                        int iZzj16 = zzir.zzj(bArr, iZzj15, zziqVar);
                        if (i3 != zziqVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzir.zzj(bArr, iZzj16, zziqVar);
                        zzkfVar4.zzh(zzjh.zzb(zziqVar.zza));
                    }
                    return iZzj15;
                }
                return iZzj2;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzla zzlaVar5 = (zzla) zzklVarZzd;
                    int iZzj17 = zzir.zzj(bArr, iZzj2, zziqVar);
                    int i27 = zziqVar.zza + iZzj17;
                    while (iZzj17 < i27) {
                        iZzj17 = zzir.zzm(bArr, iZzj17, zziqVar);
                        zzlaVar5.zzg(zzjh.zzc(zziqVar.zzb));
                    }
                    if (iZzj17 == i27) {
                        return iZzj17;
                    }
                    throw zzko.zzf();
                }
                if (i5 == 0) {
                    zzla zzlaVar6 = (zzla) zzklVarZzd;
                    int iZzm3 = zzir.zzm(bArr, iZzj2, zziqVar);
                    zzlaVar6.zzg(zzjh.zzc(zziqVar.zzb));
                    while (iZzm3 < i2) {
                        int iZzj18 = zzir.zzj(bArr, iZzm3, zziqVar);
                        if (i3 != zziqVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzir.zzm(bArr, iZzj18, zziqVar);
                        zzlaVar6.zzg(zzjh.zzc(zziqVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i5 == 3) {
                    zzlw zzlwVarZzE = zzE(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iZzc = zzir.zzc(zzlwVarZzE, bArr, i, i2, i28, zziqVar);
                    zzklVarZzd.add(zziqVar.zzc);
                    while (iZzc < i2) {
                        int iZzj19 = zzir.zzj(bArr, iZzc, zziqVar);
                        if (i3 != zziqVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzir.zzc(zzlwVarZzE, bArr, iZzj19, i2, i28, zziqVar);
                        zzklVarZzd.add(zziqVar.zzc);
                    }
                    return iZzc;
                }
                return iZzj2;
        }
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final int zzb(Object obj) {
        int i;
        int iZzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzB = zzB(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(Double.doubleToLongBits(zzmx.zza(obj, j)));
                    i2 = i + iZzc;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzc = Float.floatToIntBits(zzmx.zzb(obj, j));
                    i2 = i + iZzc;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(zzmx.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(zzmx.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzc = zzmx.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(zzmx.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzc = zzmx.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzc = zzkm.zza(zzmx.zzw(obj, j));
                    i2 = i + iZzc;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzc = ((String) zzmx.zzf(obj, j)).hashCode();
                    i2 = i + iZzc;
                    break;
                case 9:
                    Object objZzf = zzmx.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzc = zzmx.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzc = zzmx.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzc = zzmx.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzc = zzmx.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(zzmx.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzc = zzmx.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzc = zzkm.zzc(zzmx.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzmx.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iZzc = zzmx.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzc = zzmx.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 51:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i2 = i + iZzc;
                    }
                    break;
                case 52:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 53:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 55:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zza(zzS(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 59:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = ((String) zzmx.zzf(obj, j)).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case 60:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmx.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case 61:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmx.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case 62:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 64:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 65:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 66:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkm.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmx.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzn.zzc(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x036a A[PHI: r0 r19 r24 r28
  0x036a: PHI (r0v37 int) = (r0v31 int), (r0v34 int), (r0v39 int) binds: [B:130:0x03d9, B:125:0x03b4, B:116:0x0368] A[DONT_GENERATE, DONT_INLINE]
  0x036a: PHI (r19v5 int) = (r19v3 int), (r19v3 int), (r19v6 int) binds: [B:130:0x03d9, B:125:0x03b4, B:116:0x0368] A[DONT_GENERATE, DONT_INLINE]
  0x036a: PHI (r24v4 int) = (r24v2 int), (r24v2 int), (r24v5 int) binds: [B:130:0x03d9, B:125:0x03b4, B:116:0x0368] A[DONT_GENERATE, DONT_INLINE]
  0x036a: PHI (r28v7 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:130:0x03d9, B:125:0x03b4, B:116:0x0368] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0384 A[PHI: r0 r19 r24 r28
  0x0384: PHI (r0v35 int) = (r0v31 int), (r0v34 int), (r0v39 int) binds: [B:130:0x03d9, B:125:0x03b4, B:116:0x0368] A[DONT_GENERATE, DONT_INLINE]
  0x0384: PHI (r19v4 int) = (r19v3 int), (r19v3 int), (r19v6 int) binds: [B:130:0x03d9, B:125:0x03b4, B:116:0x0368] A[DONT_GENERATE, DONT_INLINE]
  0x0384: PHI (r24v3 int) = (r24v2 int), (r24v2 int), (r24v5 int) binds: [B:130:0x03d9, B:125:0x03b4, B:116:0x0368] A[DONT_GENERATE, DONT_INLINE]
  0x0384: PHI (r28v6 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:130:0x03d9, B:125:0x03b4, B:116:0x0368] A[DONT_GENERATE, DONT_INLINE]] */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zziq zziqVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzlo<T> zzloVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        zziq zziqVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iZzg;
        zzlo<T> zzloVar2 = this;
        Object obj3 = obj;
        bArr = bArr;
        i2 = i2;
        i3 = i3;
        zziq zziqVar3 = zziqVar;
        Unsafe unsafe2 = zzb;
        int iZzi = i;
        int i19 = 0;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 1048575;
        while (true) {
            if (iZzi < i2) {
                int i24 = iZzi + 1;
                byte b = bArr[iZzi];
                if (b < 0) {
                    int iZzk = zzir.zzk(b, bArr, i24, zziqVar3);
                    i5 = zziqVar3.zza;
                    i24 = iZzk;
                } else {
                    i5 = b;
                }
                int i25 = i5 >>> 3;
                int i26 = i5 & 7;
                int iZzx = i25 > i20 ? zzloVar2.zzx(i25, i21 / 3) : zzloVar2.zzw(i25);
                if (iZzx == -1) {
                    i6 = i25;
                    i7 = i24;
                    i8 = i5;
                    i9 = i22;
                    unsafe = unsafe2;
                    i3 = i3;
                    i10 = 0;
                } else {
                    int[] iArr = zzloVar2.zzc;
                    int i27 = iArr[iZzx + 1];
                    int iZzA = zzA(i27);
                    int i28 = i24;
                    long j = i27 & 1048575;
                    if (iZzA <= 17) {
                        int i29 = iArr[iZzx + 2];
                        int i30 = 1 << (i29 >>> 20);
                        int i31 = i29 & 1048575;
                        if (i31 != i23) {
                            if (i23 != 1048575) {
                                unsafe2.putInt(obj3, i23, i22);
                            }
                            i22 = unsafe2.getInt(obj3, i31);
                            i23 = i31;
                        } else {
                            i23 = i23;
                        }
                        int i32 = i22;
                        switch (iZzA) {
                            case 0:
                                i13 = iZzx;
                                i14 = i25;
                                i15 = i28;
                                if (i26 == 1) {
                                    zzmx.zzo(obj3, j, Double.longBitsToDouble(zzir.zzn(bArr, i15)));
                                    iZzi = i15 + 8;
                                    i22 = i32 | i30;
                                    i20 = i14;
                                    i21 = i13;
                                    i19 = i5;
                                    i23 = i23;
                                    i2 = i2;
                                } else {
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 1:
                                i13 = iZzx;
                                i14 = i25;
                                i15 = i28;
                                if (i26 == 5) {
                                    zzmx.zzp(obj3, j, Float.intBitsToFloat(zzir.zzb(bArr, i15)));
                                    iZzi = i15 + 4;
                                    i22 = i32 | i30;
                                    i20 = i14;
                                    i21 = i13;
                                    i19 = i5;
                                    i23 = i23;
                                    i2 = i2;
                                } else {
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 2:
                            case 3:
                                i13 = iZzx;
                                i14 = i25;
                                i15 = i28;
                                if (i26 == 0) {
                                    int iZzm = zzir.zzm(bArr, i15, zziqVar3);
                                    unsafe2.putLong(obj, j, zziqVar3.zzb);
                                    i22 = i32 | i30;
                                    i20 = i14;
                                    iZzi = iZzm;
                                    i21 = i13;
                                    i19 = i5;
                                    i23 = i23;
                                    i2 = i2;
                                } else {
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 4:
                            case 11:
                                i13 = iZzx;
                                i14 = i25;
                                i15 = i28;
                                if (i26 == 0) {
                                    iZzi = zzir.zzj(bArr, i15, zziqVar3);
                                    unsafe2.putInt(obj3, j, zziqVar3.zza);
                                    i22 = i32 | i30;
                                    i20 = i14;
                                    i21 = i13;
                                    i19 = i5;
                                    i23 = i23;
                                    i2 = i2;
                                } else {
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 5:
                            case 14:
                                i16 = iZzx;
                                i17 = i5;
                                i14 = i25;
                                i18 = i28;
                                if (i26 == 1) {
                                    i13 = i16;
                                    i5 = i17;
                                    i15 = i18;
                                    unsafe2.putLong(obj, j, zzir.zzn(bArr, i18));
                                    iZzi = i15 + 8;
                                    i22 = i32 | i30;
                                    i20 = i14;
                                    i21 = i13;
                                    i19 = i5;
                                    i23 = i23;
                                    i2 = i2;
                                } else {
                                    i13 = i16;
                                    i5 = i17;
                                    i15 = i18;
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 6:
                            case 13:
                                i16 = iZzx;
                                i17 = i5;
                                i14 = i25;
                                i18 = i28;
                                if (i26 == 5) {
                                    unsafe2.putInt(obj3, j, zzir.zzb(bArr, i18));
                                    iZzi = i18 + 4;
                                    i22 = i32 | i30;
                                    i20 = i14;
                                    i21 = i16;
                                    i19 = i17;
                                    i3 = i3;
                                } else {
                                    i13 = i16;
                                    i5 = i17;
                                    i15 = i18;
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 7:
                                i16 = iZzx;
                                i17 = i5;
                                i14 = i25;
                                i18 = i28;
                                if (i26 == 0) {
                                    iZzi = zzir.zzm(bArr, i18, zziqVar3);
                                    zzmx.zzm(obj3, j, zziqVar3.zzb != 0);
                                    i22 = i32 | i30;
                                    i20 = i14;
                                    i21 = i16;
                                    i19 = i17;
                                    i3 = i3;
                                } else {
                                    i13 = i16;
                                    i5 = i17;
                                    i15 = i18;
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 8:
                                i16 = iZzx;
                                i17 = i5;
                                i14 = i25;
                                i18 = i28;
                                if (i26 == 2) {
                                    iZzg = (536870912 & i27) == 0 ? zzir.zzg(bArr, i18, zziqVar3) : zzir.zzh(bArr, i18, zziqVar3);
                                    unsafe2.putObject(obj3, j, zziqVar3.zzc);
                                    i22 = i32 | i30;
                                    iZzi = iZzg;
                                    i21 = i16;
                                    i19 = i17;
                                    i20 = i14;
                                    i3 = i3;
                                } else {
                                    i13 = i16;
                                    i5 = i17;
                                    i15 = i18;
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 9:
                                i16 = iZzx;
                                i17 = i5;
                                i14 = i25;
                                i18 = i28;
                                if (i26 == 2) {
                                    iZzg = zzir.zzd(zzloVar2.zzE(i16), bArr, i18, i2, zziqVar3);
                                    if ((i32 & i30) == 0) {
                                        unsafe2.putObject(obj3, j, zziqVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzkm.zzg(unsafe2.getObject(obj3, j), zziqVar3.zzc));
                                    }
                                    i22 = i32 | i30;
                                    iZzi = iZzg;
                                    i21 = i16;
                                    i19 = i17;
                                    i20 = i14;
                                    i3 = i3;
                                } else {
                                    i13 = i16;
                                    i5 = i17;
                                    i15 = i18;
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 10:
                                i16 = iZzx;
                                i17 = i5;
                                i14 = i25;
                                i18 = i28;
                                if (i26 == 2) {
                                    iZzg = zzir.zza(bArr, i18, zziqVar3);
                                    unsafe2.putObject(obj3, j, zziqVar3.zzc);
                                    i22 = i32 | i30;
                                    iZzi = iZzg;
                                    i21 = i16;
                                    i19 = i17;
                                    i20 = i14;
                                    i3 = i3;
                                } else {
                                    i13 = i16;
                                    i5 = i17;
                                    i15 = i18;
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 12:
                                i16 = iZzx;
                                i17 = i5;
                                i14 = i25;
                                i18 = i28;
                                if (i26 == 0) {
                                    iZzg = zzir.zzj(bArr, i18, zziqVar3);
                                    int i33 = zziqVar3.zza;
                                    zzki zzkiVarZzD = zzloVar2.zzD(i16);
                                    if (zzkiVarZzD == null || zzkiVarZzD.zza(i33)) {
                                        unsafe2.putInt(obj3, j, i33);
                                        i22 = i32 | i30;
                                        iZzi = iZzg;
                                        i21 = i16;
                                    } else {
                                        zzd(obj).zzh(i17, Long.valueOf(i33));
                                        iZzi = iZzg;
                                        i21 = i16;
                                        i22 = i32;
                                    }
                                    i19 = i17;
                                    i20 = i14;
                                    i3 = i3;
                                } else {
                                    i13 = i16;
                                    i5 = i17;
                                    i15 = i18;
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 15:
                                i16 = iZzx;
                                i17 = i5;
                                i14 = i25;
                                i18 = i28;
                                if (i26 == 0) {
                                    iZzi = zzir.zzj(bArr, i18, zziqVar3);
                                    unsafe2.putInt(obj3, j, zzjh.zzb(zziqVar3.zza));
                                    i22 = i32 | i30;
                                    i20 = i14;
                                    i21 = i16;
                                    i19 = i17;
                                    i3 = i3;
                                } else {
                                    i13 = i16;
                                    i5 = i17;
                                    i15 = i18;
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            case 16:
                                if (i26 == 0) {
                                    int iZzm2 = zzir.zzm(bArr, i28, zziqVar3);
                                    int i34 = iZzx;
                                    i17 = i5;
                                    unsafe2.putLong(obj, j, zzjh.zzc(zziqVar3.zzb));
                                    i22 = i32 | i30;
                                    i20 = i25;
                                    iZzi = iZzm2;
                                    i21 = i34;
                                    i19 = i17;
                                    i3 = i3;
                                } else {
                                    i14 = i25;
                                    i13 = iZzx;
                                    i15 = i28;
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                            default:
                                i13 = iZzx;
                                i14 = i25;
                                i15 = i28;
                                if (i26 == 3) {
                                    iZzi = zzir.zzc(zzloVar2.zzE(i13), bArr, i15, i2, (i14 << 3) | 4, zziqVar);
                                    if ((i32 & i30) == 0) {
                                        unsafe2.putObject(obj3, j, zziqVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzkm.zzg(unsafe2.getObject(obj3, j), zziqVar3.zzc));
                                    }
                                    i22 = i32 | i30;
                                    i20 = i14;
                                    i21 = i13;
                                    i19 = i5;
                                    i23 = i23;
                                    i2 = i2;
                                } else {
                                    i6 = i14;
                                    i9 = i32;
                                    unsafe = unsafe2;
                                    i7 = i15;
                                    i10 = i13;
                                    i8 = i5;
                                    i23 = i23;
                                }
                                break;
                        }
                    } else {
                        int i35 = iZzx;
                        i5 = i5;
                        if (iZzA != 27) {
                            i9 = i22;
                            i23 = i23;
                            if (iZzA <= 49) {
                                i6 = i25;
                                unsafe = unsafe2;
                                i10 = i35;
                                iZzi = zzv(obj, bArr, i28, i2, i5, i6, i26, i35, i27, iZzA, j, zziqVar);
                                if (iZzi != i28) {
                                    zzloVar2 = this;
                                    obj3 = obj;
                                    i3 = i3;
                                    zziqVar3 = zziqVar;
                                    i19 = i5;
                                    i21 = i10;
                                    i22 = i9;
                                    i20 = i6;
                                    i23 = i23;
                                } else {
                                    i7 = iZzi;
                                    i8 = i5;
                                    i23 = i23;
                                    i3 = i3;
                                }
                                unsafe2 = unsafe;
                            } else {
                                i6 = i25;
                                unsafe = unsafe2;
                                i12 = i28;
                                i10 = i35;
                                if (iZzA != 50) {
                                    iZzi = zzt(obj, bArr, i12, i2, i5, i6, i26, i27, iZzA, j, i10, zziqVar);
                                    if (iZzi != i12) {
                                        zzloVar2 = this;
                                        obj3 = obj;
                                        i3 = i3;
                                        zziqVar3 = zziqVar;
                                        i19 = i5;
                                        i21 = i10;
                                        i22 = i9;
                                        i20 = i6;
                                        i23 = i23;
                                    } else {
                                        i7 = iZzi;
                                        i8 = i5;
                                        i23 = i23;
                                        i3 = i3;
                                    }
                                    unsafe2 = unsafe;
                                } else if (i26 == 2) {
                                    iZzi = zzs(obj, bArr, i12, i2, i10, j, zziqVar);
                                    if (iZzi != i12) {
                                        zzloVar2 = this;
                                        obj3 = obj;
                                        i3 = i3;
                                        zziqVar3 = zziqVar;
                                        i19 = i5;
                                        i21 = i10;
                                        i22 = i9;
                                        i20 = i6;
                                        i23 = i23;
                                    } else {
                                        i7 = iZzi;
                                        i8 = i5;
                                        i23 = i23;
                                        i3 = i3;
                                    }
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i26 == 2) {
                            zzkl zzklVarZzd = (zzkl) unsafe2.getObject(obj3, j);
                            if (!zzklVarZzd.zzc()) {
                                int size = zzklVarZzd.size();
                                zzklVarZzd = zzklVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j, zzklVarZzd);
                            }
                            i19 = i5;
                            i23 = i23;
                            iZzi = zzir.zze(zzloVar2.zzE(i35), i19, bArr, i28, i2, zzklVarZzd, zziqVar);
                            i3 = i3;
                            i20 = i25;
                            i21 = i35;
                            i22 = i22;
                            i23 = i23;
                            i2 = i2;
                        } else {
                            i9 = i22;
                            i23 = i23;
                            i6 = i25;
                            unsafe = unsafe2;
                            i12 = i28;
                            i10 = i35;
                        }
                        i7 = i12;
                        i8 = i5;
                        i23 = i23;
                    }
                }
                if (i8 != i3 || i3 == 0) {
                    int i36 = i3;
                    if (this.zzh) {
                        zziqVar2 = zziqVar;
                        zzjq zzjqVar = zziqVar2.zzd;
                        if (zzjqVar != zzjq.zza) {
                            i11 = i6;
                            if (zzjqVar.zzb(this.zzg, i11) != null) {
                                throw null;
                            }
                            iZzi = zzir.zzi(i8, bArr, i7, i2, zzd(obj), zziqVar);
                            obj = obj;
                        }
                        i19 = i8;
                        zzloVar2 = this;
                        i20 = i11;
                        obj3 = obj;
                        i21 = i10;
                        i22 = i9;
                        i3 = i36;
                        zziqVar3 = zziqVar2;
                        unsafe2 = unsafe;
                    } else {
                        zziqVar2 = zziqVar;
                    }
                    i11 = i6;
                    iZzi = zzir.zzi(i8, bArr, i7, i2, zzd(obj), zziqVar);
                    i19 = i8;
                    zzloVar2 = this;
                    i20 = i11;
                    obj3 = obj;
                    i21 = i10;
                    i22 = i9;
                    i3 = i36;
                    zziqVar3 = zziqVar2;
                    unsafe2 = unsafe;
                } else {
                    zzloVar = this;
                    obj2 = obj;
                    i4 = i3;
                    iZzi = i7;
                    i19 = i8;
                    i22 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i3;
                obj2 = obj3;
                zzloVar = zzloVar2;
            }
        }
        if (i23 != 1048575) {
            unsafe.putInt(obj2, i23, i22);
        }
        for (int i37 = zzloVar.zzk; i37 < zzloVar.zzl; i37++) {
            int i38 = zzloVar.zzj[i37];
            int i39 = zzloVar.zzc[i38];
            Object objZzf = zzmx.zzf(obj2, zzloVar.zzB(i38) & 1048575);
            if (objZzf != null && zzloVar.zzD(i38) != null) {
                throw null;
            }
        }
        if (i4 == 0) {
            if (iZzi != i2) {
                throw zzko.zze();
            }
        } else if (iZzi > i2 || i19 != i4) {
            throw zzko.zze();
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final Object zze() {
        return ((zzke) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i2 >= i) {
                break;
            }
            long jZzB = zzB(this.zzj[i2]) & 1048575;
            Object objZzf = zzmx.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzlf) objZzf).zzc();
                zzmx.zzs(obj, jZzB, objZzf);
            }
            i2++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(obj, this.zzj[i]);
            i++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zziq zziqVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zziqVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zziqVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzi(Object obj, zznf zznfVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zznfVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj, i)) {
                        zznfVar.zzf(i2, zzmx.zza(obj, iZzB & 1048575));
                    }
                    break;
                case 1:
                    if (zzO(obj, i)) {
                        zznfVar.zzo(i2, zzmx.zzb(obj, iZzB & 1048575));
                    }
                    break;
                case 2:
                    if (zzO(obj, i)) {
                        zznfVar.zzt(i2, zzmx.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 3:
                    if (zzO(obj, i)) {
                        zznfVar.zzJ(i2, zzmx.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 4:
                    if (zzO(obj, i)) {
                        zznfVar.zzr(i2, zzmx.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 5:
                    if (zzO(obj, i)) {
                        zznfVar.zzm(i2, zzmx.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 6:
                    if (zzO(obj, i)) {
                        zznfVar.zzk(i2, zzmx.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 7:
                    if (zzO(obj, i)) {
                        zznfVar.zzb(i2, zzmx.zzw(obj, iZzB & 1048575));
                    }
                    break;
                case 8:
                    if (zzO(obj, i)) {
                        zzT(i2, zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                    }
                    break;
                case 9:
                    if (zzO(obj, i)) {
                        zznfVar.zzv(i2, zzmx.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case 10:
                    if (zzO(obj, i)) {
                        zznfVar.zzd(i2, (zzjd) zzmx.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 11:
                    if (zzO(obj, i)) {
                        zznfVar.zzH(i2, zzmx.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 12:
                    if (zzO(obj, i)) {
                        zznfVar.zzi(i2, zzmx.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 13:
                    if (zzO(obj, i)) {
                        zznfVar.zzw(i2, zzmx.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 14:
                    if (zzO(obj, i)) {
                        zznfVar.zzy(i2, zzmx.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 15:
                    if (zzO(obj, i)) {
                        zznfVar.zzA(i2, zzmx.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 16:
                    if (zzO(obj, i)) {
                        zznfVar.zzC(i2, zzmx.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 17:
                    if (zzO(obj, i)) {
                        zznfVar.zzq(i2, zzmx.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case 18:
                    zzly.zzJ(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 19:
                    zzly.zzN(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 20:
                    zzly.zzQ(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 21:
                    zzly.zzY(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 22:
                    zzly.zzP(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 23:
                    zzly.zzM(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 24:
                    zzly.zzL(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 25:
                    zzly.zzH(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 26:
                    zzly.zzW(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                    break;
                case 27:
                    zzly.zzR(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, zzE(i));
                    break;
                case 28:
                    zzly.zzI(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                    break;
                case 29:
                    zzly.zzX(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 30:
                    zzly.zzK(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 31:
                    zzly.zzS(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 32:
                    zzly.zzT(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 33:
                    zzly.zzU(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 34:
                    zzly.zzV(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 35:
                    zzly.zzJ(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 36:
                    zzly.zzN(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 37:
                    zzly.zzQ(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 38:
                    zzly.zzY(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 39:
                    zzly.zzP(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 40:
                    zzly.zzM(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 41:
                    zzly.zzL(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 42:
                    zzly.zzH(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 43:
                    zzly.zzX(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 44:
                    zzly.zzK(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 45:
                    zzly.zzS(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 46:
                    zzly.zzT(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 47:
                    zzly.zzU(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 48:
                    zzly.zzV(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 49:
                    zzly.zzO(i2, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, zzE(i));
                    break;
                case 50:
                    zzM(zznfVar, i2, zzmx.zzf(obj, iZzB & 1048575), i);
                    break;
                case 51:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzf(i2, zzn(obj, iZzB & 1048575));
                    }
                    break;
                case 52:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzo(i2, zzo(obj, iZzB & 1048575));
                    }
                    break;
                case 53:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzt(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 54:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzJ(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 55:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzr(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 56:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzm(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 57:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzk(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 58:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzb(i2, zzS(obj, iZzB & 1048575));
                    }
                    break;
                case 59:
                    if (zzR(obj, i2, i)) {
                        zzT(i2, zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzv(i2, zzmx.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case 61:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzd(i2, (zzjd) zzmx.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 62:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzH(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 63:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzi(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 64:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzw(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 65:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzy(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 66:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzA(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 67:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzC(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 68:
                    if (zzR(obj, i2, i)) {
                        zznfVar.zzq(i2, zzmx.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
            }
        }
        zzmn zzmnVar = this.zzn;
        zzmnVar.zzi(zzmnVar.zzc(obj), zznfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            long j = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzN(obj, obj2, i) || Double.doubleToLongBits(zzmx.zza(obj, j)) != Double.doubleToLongBits(zzmx.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzN(obj, obj2, i) || Float.floatToIntBits(zzmx.zzb(obj, j)) != Float.floatToIntBits(zzmx.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzN(obj, obj2, i) || zzmx.zzd(obj, j) != zzmx.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzN(obj, obj2, i) || zzmx.zzd(obj, j) != zzmx.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j) != zzmx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzN(obj, obj2, i) || zzmx.zzd(obj, j) != zzmx.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j) != zzmx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzN(obj, obj2, i) || zzmx.zzw(obj, j) != zzmx.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzN(obj, obj2, i) || !zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzN(obj, obj2, i) || !zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzN(obj, obj2, i) || !zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j) != zzmx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j) != zzmx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j) != zzmx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzN(obj, obj2, i) || zzmx.zzd(obj, j) != zzmx.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j) != zzmx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzN(obj, obj2, i) || zzmx.zzd(obj, j) != zzmx.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzN(obj, obj2, i) || !zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzZ = zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j));
                    break;
                case 50:
                    zZzZ = zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzy = zzy(i) & 1048575;
                    if (zzmx.zzc(obj, jZzy) != zzmx.zzc(obj2, jZzy) || !zzly.zzZ(zzmx.zzf(obj, j), zzmx.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[LOOP:1: B:45:0x00b4->B:50:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlw
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zzlw zzlwVarZzE;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int iZzB = zzB(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i4;
                i2 = i5;
            }
            if ((268435456 & iZzB) != 0 && !zzP(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzA = zzA(iZzB);
            if (iZzA == 9 || iZzA == 17) {
                if (zzP(obj, i7, i, i2, i11) && !zzQ(obj, iZzB, zzE(i7))) {
                    return false;
                }
            } else if (iZzA == 27) {
                list = (List) zzmx.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlwVarZzE = zzE(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzlwVarZzE.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzA == 60 || iZzA == 68) {
                if (zzR(obj, i8, i7) && !zzQ(obj, iZzB, zzE(i7))) {
                    return false;
                }
            } else if (iZzA == 49) {
                list = (List) zzmx.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    zzlwVarZzE = zzE(i7);
                    while (i3 < list.size()) {
                        if (!zzlwVarZzE.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzA == 50 && !((zzlf) zzmx.zzf(obj, iZzB & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzB = zzB(i);
            long j = 1048575 & iZzB;
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj2, i)) {
                        zzmx.zzo(obj, j, zzmx.zza(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 1:
                    if (zzO(obj2, i)) {
                        zzmx.zzp(obj, j, zzmx.zzb(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 2:
                    if (zzO(obj2, i)) {
                        zzmx.zzr(obj, j, zzmx.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 3:
                    if (zzO(obj2, i)) {
                        zzmx.zzr(obj, j, zzmx.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 4:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 5:
                    if (zzO(obj2, i)) {
                        zzmx.zzr(obj, j, zzmx.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 6:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 7:
                    if (zzO(obj2, i)) {
                        zzmx.zzm(obj, j, zzmx.zzw(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 8:
                    if (zzO(obj2, i)) {
                        zzmx.zzs(obj, j, zzmx.zzf(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzO(obj2, i)) {
                        zzmx.zzs(obj, j, zzmx.zzf(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 11:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 12:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 13:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 14:
                    if (zzO(obj2, i)) {
                        zzmx.zzr(obj, j, zzmx.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 15:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j, zzmx.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 16:
                    if (zzO(obj2, i)) {
                        zzmx.zzr(obj, j, zzmx.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 17:
                    zzH(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzly.zzaa(this.zzq, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i2, i)) {
                        zzmx.zzs(obj, j, zzmx.zzf(obj2, j));
                        zzK(obj, i2, i);
                    }
                    break;
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i2, i)) {
                        zzmx.zzs(obj, j, zzmx.zzf(obj2, j));
                        zzK(obj, i2, i);
                    }
                    break;
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzly.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzly.zzE(this.zzo, obj, obj2);
        }
    }
}
