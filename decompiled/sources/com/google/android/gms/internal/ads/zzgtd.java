package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtd<T> implements zzgtt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzguu.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgta zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzgso zzm;
    private final zzguk zzn;
    private final zzgrd zzo;
    private final zzgtf zzp;
    private final zzgsv zzq;

    private zzgtd(int[] iArr, Object[] objArr, int i, int i2, zzgta zzgtaVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzgtf zzgtfVar, zzgso zzgsoVar, zzguk zzgukVar, zzgrd zzgrdVar, zzgsv zzgsvVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgtaVar instanceof zzgrq;
        boolean z2 = false;
        if (zzgrdVar != null && zzgrdVar.zzh(zzgtaVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzgtfVar;
        this.zzm = zzgsoVar;
        this.zzn = zzgukVar;
        this.zzo = zzgrdVar;
        this.zzg = zzgtaVar;
        this.zzq = zzgsvVar;
    }

    private final Object zzA(Object obj, int i) {
        zzgtt zzgttVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzgttVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzgttVarZzx.zze();
        if (object != null) {
            zzgttVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzgtt zzgttVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzgttVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzgttVarZzx.zze();
        if (object != null) {
            zzgttVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgtt zzgttVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzgttVarZzx.zze();
                    zzgttVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzgttVarZzx.zze();
                zzgttVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgttVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgtt zzgttVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzgttVarZzx.zze();
                    zzgttVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzgttVarZzx.zze();
                zzgttVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgttVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzgtl zzgtlVar) throws IOException {
        if (zzM(i)) {
            zzguu.zzv(obj, i & 1048575, zzgtlVar.zzs());
        } else if (this.zzi) {
            zzguu.zzv(obj, i & 1048575, zzgtlVar.zzr());
        } else {
            zzguu.zzv(obj, i & 1048575, zzgtlVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzguu.zzt(obj, j, (1 << (iZzr >>> 20)) | zzguu.zzd(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzguu.zzt(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & DriveFile.MODE_WRITE_ONLY) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (zzguu.zzd(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzguu.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzguu.zzc(obj, j2)) != 0;
            case 2:
                return zzguu.zzf(obj, j2) != 0;
            case 3:
                return zzguu.zzf(obj, j2) != 0;
            case 4:
                return zzguu.zzd(obj, j2) != 0;
            case 5:
                return zzguu.zzf(obj, j2) != 0;
            case 6:
                return zzguu.zzd(obj, j2) != 0;
            case 7:
                return zzguu.zzz(obj, j2);
            case 8:
                Object objZzh = zzguu.zzh(obj, j2);
                if (objZzh instanceof String) {
                    return !((String) objZzh).isEmpty();
                }
                if (objZzh instanceof zzgqi) {
                    return !zzgqi.zzb.equals(objZzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzguu.zzh(obj, j2) != null;
            case 10:
                return !zzgqi.zzb.equals(zzguu.zzh(obj, j2));
            case 11:
                return zzguu.zzd(obj, j2) != 0;
            case 12:
                return zzguu.zzd(obj, j2) != 0;
            case 13:
                return zzguu.zzd(obj, j2) != 0;
            case 14:
                return zzguu.zzf(obj, j2) != 0;
            case 15:
                return zzguu.zzd(obj, j2) != 0;
            case 16:
                return zzguu.zzf(obj, j2) != 0;
            case 17:
                return zzguu.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzgtt zzgttVar) {
        return zzgttVar.zzk(zzguu.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgrq) {
            return ((zzgrq) obj).zzaY();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzguu.zzd(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzguu.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzgqy zzgqyVar) throws IOException {
        if (obj instanceof String) {
            zzgqyVar.zzF(i, (String) obj);
        } else {
            zzgqyVar.zzd(i, (zzgqi) obj);
        }
    }

    static zzgul zzd(Object obj) {
        zzgrq zzgrqVar = (zzgrq) obj;
        zzgul zzgulVar = zzgrqVar.zzc;
        if (zzgulVar != zzgul.zzc()) {
            return zzgulVar;
        }
        zzgul zzgulVarZzf = zzgul.zzf();
        zzgrqVar.zzc = zzgulVarZzf;
        return zzgulVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x024e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0251  */
    /* JADX WARN: Code duplicated, block: B:127:0x0269  */
    /* JADX WARN: Code duplicated, block: B:128:0x026c  */
    static zzgtd zzl(Class cls, zzgsx zzgsxVar, zzgtf zzgtfVar, zzgso zzgsoVar, zzguk zzgukVar, zzgrd zzgrdVar, zzgsv zzgsvVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int iObjectFieldOffset;
        int i18;
        int i19;
        int iObjectFieldOffset2;
        Field fieldZzC;
        char cCharAt9;
        int i20;
        int i21;
        int i22;
        Object obj;
        Field fieldZzC2;
        int i23;
        Object obj2;
        Field fieldZzC3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        if (!(zzgsxVar instanceof zzgtk)) {
            throw null;
        }
        zzgtk zzgtkVar = (zzgtk) zzgsxVar;
        String strZzd = zzgtkVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i28 = 1;
            while (true) {
                i = i28 + 1;
                if (strZzd.charAt(i28) < 55296) {
                    break;
                }
                i28 = i;
            }
        } else {
            i = 1;
        }
        int i29 = i + 1;
        int iCharAt3 = strZzd.charAt(i);
        if (iCharAt3 >= 55296) {
            int i30 = iCharAt3 & 8191;
            int i31 = 13;
            while (true) {
                i27 = i29 + 1;
                cCharAt13 = strZzd.charAt(i29);
                if (cCharAt13 < 55296) {
                    break;
                }
                i30 |= (cCharAt13 & 8191) << i31;
                i31 += 13;
                i29 = i27;
            }
            iCharAt3 = i30 | (cCharAt13 << i31);
            i29 = i27;
        }
        if (iCharAt3 == 0) {
            iArr = zza;
            i5 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
        } else {
            int i32 = i29 + 1;
            int iCharAt4 = strZzd.charAt(i29);
            if (iCharAt4 >= 55296) {
                int i33 = iCharAt4 & 8191;
                int i34 = 13;
                while (true) {
                    i14 = i32 + 1;
                    cCharAt8 = strZzd.charAt(i32);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt8 & 8191) << i34;
                    i34 += 13;
                    i32 = i14;
                }
                iCharAt4 = i33 | (cCharAt8 << i34);
                i32 = i14;
            }
            int i35 = i32 + 1;
            int iCharAt5 = strZzd.charAt(i32);
            if (iCharAt5 >= 55296) {
                int i36 = iCharAt5 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    cCharAt7 = strZzd.charAt(i35);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt7 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                iCharAt5 = i36 | (cCharAt7 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int iCharAt6 = strZzd.charAt(i35);
            if (iCharAt6 >= 55296) {
                int i39 = iCharAt6 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    cCharAt6 = strZzd.charAt(i38);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt6 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                iCharAt6 = i39 | (cCharAt6 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            int iCharAt7 = strZzd.charAt(i38);
            if (iCharAt7 >= 55296) {
                int i42 = iCharAt7 & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    cCharAt5 = strZzd.charAt(i41);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt5 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                iCharAt7 = i42 | (cCharAt5 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            iCharAt = strZzd.charAt(i41);
            if (iCharAt >= 55296) {
                int i45 = iCharAt & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    cCharAt4 = strZzd.charAt(i44);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt4 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                iCharAt = i45 | (cCharAt4 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            iCharAt2 = strZzd.charAt(i44);
            if (iCharAt2 >= 55296) {
                int i48 = iCharAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    cCharAt3 = strZzd.charAt(i47);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt3 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                iCharAt2 = i48 | (cCharAt3 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int iCharAt8 = strZzd.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    cCharAt2 = strZzd.charAt(i50);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt2 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                iCharAt8 = i51 | (cCharAt2 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            int iCharAt9 = strZzd.charAt(i50);
            if (iCharAt9 >= 55296) {
                int i54 = iCharAt9 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    cCharAt = strZzd.charAt(i53);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i54 |= (cCharAt & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                iCharAt9 = i54 | (cCharAt << i55);
                i53 = i7;
            }
            i2 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i3 = iCharAt6;
            i4 = iCharAt9;
            i5 = iCharAt4;
            i6 = iCharAt7;
            i29 = i53;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzgtkVar.zze();
        Class<?> cls2 = zzgtkVar.zza().getClass();
        int i56 = i4 + iCharAt2;
        int i57 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[i57];
        int i58 = i4;
        int i59 = i56;
        int i60 = 0;
        int i61 = 0;
        while (i29 < length) {
            int i62 = i29 + 1;
            int iCharAt10 = strZzd.charAt(i29);
            if (iCharAt10 >= c) {
                int i63 = iCharAt10 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i26 = i64 + 1;
                    cCharAt12 = strZzd.charAt(i64);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i63 |= (cCharAt12 & 8191) << i65;
                    i65 += 13;
                    i64 = i26;
                }
                iCharAt10 = i63 | (cCharAt12 << i65);
                i15 = i26;
            } else {
                i15 = i62;
            }
            int i66 = i15 + 1;
            int iCharAt11 = strZzd.charAt(i15);
            if (iCharAt11 >= c) {
                int i67 = iCharAt11 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i25 = i68 + 1;
                    cCharAt11 = strZzd.charAt(i68);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i67 |= (cCharAt11 & 8191) << i69;
                    i69 += 13;
                    i68 = i25;
                }
                iCharAt11 = i67 | (cCharAt11 << i69);
                i16 = i25;
            } else {
                i16 = i66;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i60] = i61;
                i60++;
            }
            int i70 = iCharAt11 & 255;
            if (i70 >= 51) {
                int i71 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i72 = iCharAt12 & 8191;
                    int i73 = 13;
                    while (true) {
                        i24 = i71 + 1;
                        cCharAt10 = strZzd.charAt(i71);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i72 |= (cCharAt10 & 8191) << i73;
                        i73 += 13;
                        i71 = i24;
                        c2 = 55296;
                    }
                    iCharAt12 = i72 | (cCharAt10 << i73);
                    i71 = i24;
                }
                int i74 = i70 - 51;
                int i75 = i71;
                if (i74 == 9 || i74 == 17) {
                    int i76 = i61 / 3;
                    i21 = i2 + 1;
                    objArr[i76 + i76 + 1] = objArrZze[i2];
                } else {
                    if (i74 == 12 && (zzgtkVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i77 = i61 / 3;
                        i21 = i2 + 1;
                        objArr[i77 + i77 + 1] = objArrZze[i2];
                    }
                    i22 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i22];
                    if (obj instanceof Field) {
                        fieldZzC2 = (Field) obj;
                    } else {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i22] = fieldZzC2;
                    }
                    int i78 = i3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                    i23 = i22 + 1;
                    obj2 = objArrZze[i23];
                    if (obj2 instanceof Field) {
                        fieldZzC3 = (Field) obj2;
                    } else {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i23] = fieldZzC3;
                    }
                    i17 = i78;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                    i18 = i75;
                    i19 = 0;
                    strZzd = strZzd;
                }
                i2 = i21;
                i22 = iCharAt12 + iCharAt12;
                obj = objArrZze[i22];
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i22] = fieldZzC2;
                }
                int i79 = i3;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                i23 = i22 + 1;
                obj2 = objArrZze[i23];
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i23] = fieldZzC3;
                }
                i17 = i79;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                i18 = i75;
                i19 = 0;
                strZzd = strZzd;
            } else {
                i17 = i3;
                int i80 = i2 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i2]);
                if (i70 == 9 || i70 == 17) {
                    i17 = i17;
                    int i81 = i61 / 3;
                    objArr[i81 + i81 + 1] = fieldZzC4.getType();
                } else {
                    if (i70 == 27 || i70 == 49) {
                        i17 = i17;
                        int i82 = i61 / 3;
                        i20 = i80 + 1;
                        objArr[i82 + i82 + 1] = objArrZze[i80];
                    } else if (i70 == 12 || i70 == 30 || i70 == 44) {
                        i17 = i17;
                        if (zzgtkVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
                            int i83 = i61 / 3;
                            i20 = i80 + 1;
                            objArr[i83 + i83 + 1] = objArrZze[i80];
                        }
                    } else if (i70 == 50) {
                        int i84 = i58 + 1;
                        iArr[i58] = i61;
                        int i85 = i61 / 3;
                        int i86 = i80 + 1;
                        int i87 = i85 + i85;
                        objArr[i87] = objArrZze[i80];
                        if ((iCharAt11 & 2048) != 0) {
                            i80 = i86 + 1;
                            objArr[i87 + 1] = objArrZze[i86];
                            i58 = i84;
                        } else {
                            i58 = i84;
                            i80 = i86;
                        }
                    }
                    i80 = i20;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i70 > 17) {
                    i18 = i16;
                    i19 = 0;
                } else {
                    int i88 = i16 + 1;
                    int iCharAt13 = strZzd.charAt(i16);
                    if (iCharAt13 >= 55296) {
                        int i89 = iCharAt13 & 8191;
                        int i90 = 13;
                        while (true) {
                            i18 = i88 + 1;
                            cCharAt9 = strZzd.charAt(i88);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i89 |= (cCharAt9 & 8191) << i90;
                            i90 += 13;
                            i88 = i18;
                        }
                        iCharAt13 = i89 | (cCharAt9 << i90);
                    } else {
                        i18 = i88;
                    }
                    int i91 = i5 + i5 + (iCharAt13 / 32);
                    Object obj3 = objArrZze[i91];
                    if (obj3 instanceof Field) {
                        fieldZzC = (Field) obj3;
                    } else {
                        fieldZzC = zzC(cls2, (String) obj3);
                        objArrZze[i91] = fieldZzC;
                    }
                    i19 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC);
                }
                if (i70 >= 18 && i70 <= 49) {
                    iArr[i59] = iObjectFieldOffset3;
                    i59++;
                }
                i2 = i80;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i92 = i61 + 1;
            iArr2[i61] = iCharAt10;
            int i93 = i92 + 1;
            iArr2[i92] = iObjectFieldOffset2 | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & 512) != 0 ? DriveFile.MODE_WRITE_ONLY : 0) | ((iCharAt11 & 256) != 0 ? DriveFile.MODE_READ_ONLY : 0) | (i70 << 20);
            i61 = i93 + 1;
            iArr2[i93] = (i19 << 20) | iObjectFieldOffset;
            i29 = i18;
            length = length;
            i3 = i17;
            strZzd = strZzd;
            i6 = i6;
            c = 55296;
        }
        return new zzgtd(iArr2, objArr, i3, i6, zzgtkVar.zza(), zzgtkVar.zzc(), false, iArr, i4, i56, zzgtfVar, zzgsoVar, zzgukVar, zzgrdVar, zzgsvVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzguu.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzguu.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzguu.zzh(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzguu.zzh(obj, j)).longValue();
    }

    private final zzgru zzw(int i) {
        int i2 = i / 3;
        return (zzgru) this.zzd[i2 + i2 + 1];
    }

    private final zzgtt zzx(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgtt zzgttVar = (zzgtt) this.zzd[i3];
        if (zzgttVar != null) {
            return zzgttVar;
        }
        zzgtt zzgttVarZzb = zzgti.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzgttVarZzb;
        return zzgttVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzguk zzgukVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzh = zzguu.zzh(obj, zzu(i) & 1048575);
        if (objZzh == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0391  */
    /* JADX WARN: Code duplicated, block: B:155:0x0417  */
    @Override // com.google.android.gms.internal.ads.zzgtt
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int iZzA;
        int iZzA2;
        int iZzB;
        int iZzA3;
        int iZzA4;
        int iZzA5;
        int iZzA6;
        int iZzh;
        int iZzA7;
        int iZzB2;
        int size;
        int iZzl;
        int iZzA8;
        int iZzA9;
        int iZzA10;
        int iZzA11;
        int iZzA12;
        int iZzA13;
        int iZzw;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.zzc.length) {
            int iZzu = zzu(i7);
            int iZzt = zzt(iZzu);
            int[] iArr = this.zzc;
            int i9 = iArr[i7];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & i4;
            if (iZzt <= 17) {
                if (i11 != i5) {
                    i6 = i11 == i4 ? 0 : unsafe.getInt(obj, i11);
                    i5 = i11;
                }
                i3 = 1 << (i10 >>> 20);
                i = i5;
                i2 = i6;
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            int i12 = iZzu & i4;
            if (iZzt >= zzgri.DOUBLE_LIST_PACKED.zza()) {
                zzgri.SINT64_LIST_PACKED.zza();
            }
            long j = i12;
            switch (iZzt) {
                case 0:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzA = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA + 8;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 1:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzA2 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA2 + 4;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 2:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzB = zzgqx.zzB(unsafe.getLong(obj, j));
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 3:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzB = zzgqx.zzB(unsafe.getLong(obj, j));
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 4:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzB = zzgqx.zzx(unsafe.getInt(obj, j));
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 5:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzA = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA + 8;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 6:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzA2 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA2 + 4;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 7:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzA4 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA4 + 1;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 8:
                    if (zzO(obj, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgqi) {
                            int i13 = zzgqx.zzf;
                            int iZzd = ((zzgqi) object).zzd();
                            iZzA5 = zzgqx.zzA(iZzd) + iZzd;
                            iZzA6 = zzgqx.zzA(i9 << 3);
                            iZzh = iZzA6 + iZzA5;
                            i8 += iZzh;
                        } else {
                            iZzB = zzgqx.zzz((String) object);
                            iZzA3 = zzgqx.zzA(i9 << 3);
                            iZzA11 = iZzA3 + iZzB;
                            i8 += iZzA11;
                        }
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 9:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzh = zzgtv.zzh(i9, unsafe.getObject(obj, j), zzx(i7));
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 10:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqi zzgqiVar = (zzgqi) unsafe.getObject(obj, j);
                        int i14 = zzgqx.zzf;
                        int iZzd2 = zzgqiVar.zzd();
                        iZzA5 = zzgqx.zzA(iZzd2) + iZzd2;
                        iZzA6 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA6 + iZzA5;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 11:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzB = zzgqx.zzA(unsafe.getInt(obj, j));
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 12:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzB = zzgqx.zzx(unsafe.getInt(obj, j));
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 13:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzA2 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA2 + 4;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 14:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzA = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA + 8;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 15:
                    if (zzO(obj, i7, i, i2, i3)) {
                        int i15 = unsafe.getInt(obj, j);
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzB = zzgqx.zzA((i15 >> 31) ^ (i15 + i15));
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 16:
                    if (zzO(obj, i7, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzA7 = zzgqx.zzA(i9 << 3);
                        iZzB2 = zzgqx.zzB((j2 >> 63) ^ (j2 + j2));
                        iZzA9 = iZzA7 + iZzB2;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 17:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzh = zzgqx.zzw(i9, (zzgta) unsafe.getObject(obj, j), zzx(i7));
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 18:
                    iZzh = zzgtv.zzd(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 19:
                    iZzh = zzgtv.zzb(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i16 = zzgtv.zza;
                    if (list.size() == 0) {
                        iZzA11 = 0;
                    } else {
                        iZzA3 = zzgtv.zzg(list);
                        iZzB = list.size() * zzgqx.zzA(i9 << 3);
                        iZzA11 = iZzA3 + iZzB;
                    }
                    i8 += iZzA11;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i17 = zzgtv.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgtv.zzl(list2);
                        iZzA8 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzl + (size * iZzA8);
                    }
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i18 = zzgtv.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgtv.zzf(list3);
                        iZzA8 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzl + (size * iZzA8);
                    }
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 23:
                    iZzh = zzgtv.zzd(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 24:
                    iZzh = zzgtv.zzb(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i19 = zzgtv.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = size2 * (zzgqx.zzA(i9 << 3) + 1);
                    }
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i20 = zzgtv.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzA9 = 0;
                    } else {
                        boolean z2 = list5 instanceof zzgsi;
                        iZzA9 = zzgqx.zzA(i9 << 3) * size3;
                        if (z2) {
                            zzgsi zzgsiVar = (zzgsi) list5;
                            for (int i21 = 0; i21 < size3; i21++) {
                                Object objZzf = zzgsiVar.zzf(i21);
                                if (objZzf instanceof zzgqi) {
                                    int iZzd3 = ((zzgqi) objZzf).zzd();
                                    iZzA9 += zzgqx.zzA(iZzd3) + iZzd3;
                                } else {
                                    iZzA9 += zzgqx.zzz((String) objZzf);
                                }
                            }
                        } else {
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object obj2 = list5.get(i22);
                                if (obj2 instanceof zzgqi) {
                                    int iZzd4 = ((zzgqi) obj2).zzd();
                                    iZzA9 += zzgqx.zzA(iZzd4) + iZzd4;
                                } else {
                                    iZzA9 += zzgqx.zzz((String) obj2);
                                }
                            }
                        }
                    }
                    i8 += iZzA9;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzgtt zzgttVarZzx = zzx(i7);
                    int i23 = zzgtv.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzA10 = 0;
                    } else {
                        iZzA10 = zzgqx.zzA(i9 << 3) * size4;
                        for (int i24 = 0; i24 < size4; i24++) {
                            Object obj3 = list6.get(i24);
                            if (obj3 instanceof zzgsg) {
                                int iZza = ((zzgsg) obj3).zza();
                                iZzA10 += zzgqx.zzA(iZza) + iZza;
                            } else {
                                iZzA10 += zzgqx.zzy((zzgta) obj3, zzgttVarZzx);
                            }
                        }
                    }
                    i8 += iZzA10;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i25 = zzgtv.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzA11 = 0;
                    } else {
                        iZzA11 = size5 * zzgqx.zzA(i9 << 3);
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int iZzd5 = ((zzgqi) list7.get(i26)).zzd();
                            iZzA11 += zzgqx.zzA(iZzd5) + iZzd5;
                        }
                    }
                    i8 += iZzA11;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i27 = zzgtv.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgtv.zzk(list8);
                        iZzA8 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzl + (size * iZzA8);
                    }
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i28 = zzgtv.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgtv.zza(list9);
                        iZzA8 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzl + (size * iZzA8);
                    }
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 31:
                    iZzh = zzgtv.zzb(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 32:
                    iZzh = zzgtv.zzd(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i29 = zzgtv.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgtv.zzi(list10);
                        iZzA8 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzl + (size * iZzA8);
                    }
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i30 = zzgtv.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzgtv.zzj(list11);
                        iZzA8 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzl + (size * iZzA8);
                    }
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 35:
                    iZzB = zzgtv.zze((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 36:
                    iZzB = zzgtv.zzc((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 37:
                    iZzB = zzgtv.zzg((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 38:
                    iZzB = zzgtv.zzl((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 39:
                    iZzB = zzgtv.zzf((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 40:
                    iZzB = zzgtv.zze((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 41:
                    iZzB = zzgtv.zzc((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i31 = zzgtv.zza;
                    iZzB = list12.size();
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 43:
                    iZzB = zzgtv.zzk((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 44:
                    iZzB = zzgtv.zza((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 45:
                    iZzB = zzgtv.zzc((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 46:
                    iZzB = zzgtv.zze((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 47:
                    iZzB = zzgtv.zzi((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 48:
                    iZzB = zzgtv.zzj((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzA12 = zzgqx.zzA(iZzB);
                        iZzA13 = zzgqx.zzA(i9 << 3);
                        iZzA3 = iZzA13 + iZzA12;
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzgtt zzgttVarZzx2 = zzx(i7);
                    int i32 = zzgtv.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzw = 0;
                    } else {
                        iZzw = 0;
                        for (int i33 = 0; i33 < size6; i33++) {
                            iZzw += zzgqx.zzw(i9, (zzgta) list13.get(i33), zzgttVarZzx2);
                        }
                    }
                    i8 += iZzw;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 50:
                    zzgsu zzgsuVar = (zzgsu) unsafe.getObject(obj, j);
                    if (zzgsuVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzgsuVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                case 51:
                    if (zzR(obj, i9, i7)) {
                        iZzA = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA + 8;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 52:
                    if (zzR(obj, i9, i7)) {
                        iZzA2 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA2 + 4;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 53:
                    if (zzR(obj, i9, i7)) {
                        iZzB = zzgqx.zzB(zzv(obj, j));
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 54:
                    if (zzR(obj, i9, i7)) {
                        iZzB = zzgqx.zzB(zzv(obj, j));
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 55:
                    if (zzR(obj, i9, i7)) {
                        iZzB = zzgqx.zzx(zzp(obj, j));
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 56:
                    if (zzR(obj, i9, i7)) {
                        iZzA = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA + 8;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 57:
                    if (zzR(obj, i9, i7)) {
                        iZzA2 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA2 + 4;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 58:
                    if (zzR(obj, i9, i7)) {
                        iZzA4 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA4 + 1;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 59:
                    if (zzR(obj, i9, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgqi) {
                            int i34 = zzgqx.zzf;
                            int iZzd6 = ((zzgqi) object2).zzd();
                            iZzA5 = zzgqx.zzA(iZzd6) + iZzd6;
                            iZzA6 = zzgqx.zzA(i9 << 3);
                            iZzh = iZzA6 + iZzA5;
                            i8 += iZzh;
                        } else {
                            iZzB = zzgqx.zzz((String) object2);
                            iZzA3 = zzgqx.zzA(i9 << 3);
                            iZzA11 = iZzA3 + iZzB;
                            i8 += iZzA11;
                        }
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 60:
                    if (zzR(obj, i9, i7)) {
                        iZzh = zzgtv.zzh(i9, unsafe.getObject(obj, j), zzx(i7));
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 61:
                    if (zzR(obj, i9, i7)) {
                        zzgqi zzgqiVar2 = (zzgqi) unsafe.getObject(obj, j);
                        int i35 = zzgqx.zzf;
                        int iZzd7 = zzgqiVar2.zzd();
                        iZzA5 = zzgqx.zzA(iZzd7) + iZzd7;
                        iZzA6 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA6 + iZzA5;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 62:
                    if (zzR(obj, i9, i7)) {
                        iZzB = zzgqx.zzA(zzp(obj, j));
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 63:
                    if (zzR(obj, i9, i7)) {
                        iZzB = zzgqx.zzx(zzp(obj, j));
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 64:
                    if (zzR(obj, i9, i7)) {
                        iZzA2 = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA2 + 4;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 65:
                    if (zzR(obj, i9, i7)) {
                        iZzA = zzgqx.zzA(i9 << 3);
                        iZzh = iZzA + 8;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 66:
                    if (zzR(obj, i9, i7)) {
                        int iZzp = zzp(obj, j);
                        iZzA3 = zzgqx.zzA(i9 << 3);
                        iZzB = zzgqx.zzA((iZzp >> 31) ^ (iZzp + iZzp));
                        iZzA11 = iZzA3 + iZzB;
                        i8 += iZzA11;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 67:
                    if (zzR(obj, i9, i7)) {
                        long jZzv = zzv(obj, j);
                        iZzA7 = zzgqx.zzA(i9 << 3);
                        iZzB2 = zzgqx.zzB((jZzv >> 63) ^ (jZzv + jZzv));
                        iZzA9 = iZzA7 + iZzB2;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 68:
                    if (zzR(obj, i9, i7)) {
                        iZzh = zzgqx.zzw(i9, (zzgta) unsafe.getObject(obj, j), zzx(i7));
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
            }
        }
        zzguk zzgukVar = this.zzn;
        int iZza2 = i8 + zzgukVar.zza(zzgukVar.zzd(obj));
        if (!this.zzh) {
            return iZza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzu = zzu(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & iZzu;
            int iHashCode = 37;
            switch (zzt(iZzu)) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzguu.zzb(obj, j));
                    byte[] bArr = zzgsa.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzguu.zzc(obj, j));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzguu.zzf(obj, j);
                    byte[] bArr2 = zzgsa.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzguu.zzf(obj, j);
                    byte[] bArr3 = zzgsa.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzguu.zzd(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzguu.zzf(obj, j);
                    byte[] bArr4 = zzgsa.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzguu.zzd(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzgsa.zza(zzguu.zzz(obj, j));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iFloatToIntBits = ((String) zzguu.zzh(obj, j)).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 9:
                    Object objZzh = zzguu.zzh(obj, j);
                    if (objZzh != null) {
                        iHashCode = objZzh.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzguu.zzh(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzguu.zzd(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzguu.zzd(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzguu.zzd(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzguu.zzf(obj, j);
                    byte[] bArr5 = zzgsa.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzguu.zzd(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzguu.zzf(obj, j);
                    byte[] bArr6 = zzgsa.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object objZzh2 = zzguu.zzh(obj, j);
                    if (objZzh2 != null) {
                        iHashCode = objZzh2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
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
                    i2 = i3 * 53;
                    iFloatToIntBits = zzguu.zzh(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzguu.zzh(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzgsa.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzgsa.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzgsa.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzgsa.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzgsa.zza(zzS(obj, j));
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = ((String) zzguu.zzh(obj, j)).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzguu.zzh(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzguu.zzh(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzgsa.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzgsa.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzguu.zzh(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + this.zzn.zzd(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:387:0x08c9 A[PHI: r7 r8 r9 r10 r11 r12 r14
  0x08c9: PHI (r7v33 int) = (r7v11 int), (r7v13 int), (r7v14 int), (r7v19 int), (r7v23 int), (r5v39 int), (r7v37 int) binds: [B:376:0x0880, B:360:0x0828, B:344:0x07d7, B:269:0x067c, B:220:0x05ad, B:188:0x0515, B:145:0x03fb] A[DONT_GENERATE, DONT_INLINE]
  0x08c9: PHI (r8v100 com.google.android.gms.internal.ads.zzgpu) = 
  (r8v55 com.google.android.gms.internal.ads.zzgpu)
  (r8v57 com.google.android.gms.internal.ads.zzgpu)
  (r8v58 com.google.android.gms.internal.ads.zzgpu)
  (r8v84 com.google.android.gms.internal.ads.zzgpu)
  (r8v96 com.google.android.gms.internal.ads.zzgpu)
  (r8v98 com.google.android.gms.internal.ads.zzgpu)
  (r8v103 com.google.android.gms.internal.ads.zzgpu)
 binds: [B:376:0x0880, B:360:0x0828, B:344:0x07d7, B:269:0x067c, B:220:0x05ad, B:188:0x0515, B:145:0x03fb] A[DONT_GENERATE, DONT_INLINE]
  0x08c9: PHI (r9v73 int) = (r9v36 int), (r9v38 int), (r9v39 int), (r9v51 int), (r9v64 int), (r9v71 int), (r9v76 int) binds: [B:376:0x0880, B:360:0x0828, B:344:0x07d7, B:269:0x067c, B:220:0x05ad, B:188:0x0515, B:145:0x03fb] A[DONT_GENERATE, DONT_INLINE]
  0x08c9: PHI (r10v97 'this' com.google.android.gms.internal.ads.zzgtd<T>) = 
  (r10v69 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r10v71 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r10v72 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r10v76 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r10v87 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r33v0 'this' com.google.android.gms.internal.ads.zzgtd<T> A[IMMUTABLE_TYPE, THIS])
  (r10v100 'this' com.google.android.gms.internal.ads.zzgtd<T>)
 binds: [B:376:0x0880, B:360:0x0828, B:344:0x07d7, B:269:0x067c, B:220:0x05ad, B:188:0x0515, B:145:0x03fb] A[DONT_GENERATE, DONT_INLINE]
  0x08c9: PHI (r11v46 sun.misc.Unsafe) = 
  (r11v28 sun.misc.Unsafe)
  (r11v30 sun.misc.Unsafe)
  (r11v31 sun.misc.Unsafe)
  (r11v34 sun.misc.Unsafe)
  (r11v42 sun.misc.Unsafe)
  (r11v44 sun.misc.Unsafe)
  (r11v48 sun.misc.Unsafe)
 binds: [B:376:0x0880, B:360:0x0828, B:344:0x07d7, B:269:0x067c, B:220:0x05ad, B:188:0x0515, B:145:0x03fb] A[DONT_GENERATE, DONT_INLINE]
  0x08c9: PHI (r12v48 int) = (r12v31 int), (r12v33 int), (r12v34 int), (r12v39 int), (r12v44 int), (r12v46 int), (r12v51 int) binds: [B:376:0x0880, B:360:0x0828, B:344:0x07d7, B:269:0x067c, B:220:0x05ad, B:188:0x0515, B:145:0x03fb] A[DONT_GENERATE, DONT_INLINE]
  0x08c9: PHI (r14v54 int) = (r14v28 int), (r14v30 int), (r14v31 int), (r14v33 int), (r14v41 int), (r14v48 int), (r14v57 int) binds: [B:376:0x0880, B:360:0x0828, B:344:0x07d7, B:269:0x067c, B:220:0x05ad, B:188:0x0515, B:145:0x03fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:475:0x0b95 A[PHI: r2 r4 r5 r6 r10 r21
  0x0b95: PHI (r2v49 int) = (r2v37 int), (r2v37 int), (r2v37 int), (r2v37 int), (r2v37 int), (r2v37 int), (r2v41 int), (r2v37 int), (r2v37 int) binds: [B:473:0x0b7e, B:470:0x0b58, B:466:0x0b32, B:463:0x0b10, B:460:0x0aee, B:457:0x0acb, B:455:0x0ab9, B:432:0x0a3c, B:404:0x093f] A[DONT_GENERATE, DONT_INLINE]
  0x0b95: PHI (r4v81 sun.misc.Unsafe) = 
  (r4v56 sun.misc.Unsafe)
  (r4v57 sun.misc.Unsafe)
  (r4v58 sun.misc.Unsafe)
  (r4v59 sun.misc.Unsafe)
  (r4v60 sun.misc.Unsafe)
  (r4v61 sun.misc.Unsafe)
  (r4v64 sun.misc.Unsafe)
  (r4v73 sun.misc.Unsafe)
  (r4v82 sun.misc.Unsafe)
 binds: [B:473:0x0b7e, B:470:0x0b58, B:466:0x0b32, B:463:0x0b10, B:460:0x0aee, B:457:0x0acb, B:455:0x0ab9, B:432:0x0a3c, B:404:0x093f] A[DONT_GENERATE, DONT_INLINE]
  0x0b95: PHI (r5v66 com.google.android.gms.internal.ads.zzgpu) = 
  (r5v41 com.google.android.gms.internal.ads.zzgpu)
  (r5v42 com.google.android.gms.internal.ads.zzgpu)
  (r5v43 com.google.android.gms.internal.ads.zzgpu)
  (r5v44 com.google.android.gms.internal.ads.zzgpu)
  (r5v45 com.google.android.gms.internal.ads.zzgpu)
  (r5v46 com.google.android.gms.internal.ads.zzgpu)
  (r5v49 com.google.android.gms.internal.ads.zzgpu)
  (r5v58 com.google.android.gms.internal.ads.zzgpu)
  (r5v67 com.google.android.gms.internal.ads.zzgpu)
 binds: [B:473:0x0b7e, B:470:0x0b58, B:466:0x0b32, B:463:0x0b10, B:460:0x0aee, B:457:0x0acb, B:455:0x0ab9, B:432:0x0a3c, B:404:0x093f] A[DONT_GENERATE, DONT_INLINE]
  0x0b95: PHI (r6v36 'this' com.google.android.gms.internal.ads.zzgtd<T>) = 
  (r6v22 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r6v23 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r6v24 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r6v25 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r6v26 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r6v27 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r6v30 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r6v33 'this' com.google.android.gms.internal.ads.zzgtd<T>)
  (r6v37 'this' com.google.android.gms.internal.ads.zzgtd<T>)
 binds: [B:473:0x0b7e, B:470:0x0b58, B:466:0x0b32, B:463:0x0b10, B:460:0x0aee, B:457:0x0acb, B:455:0x0ab9, B:432:0x0a3c, B:404:0x093f] A[DONT_GENERATE, DONT_INLINE]
  0x0b95: PHI (r10v67 int) = 
  (r10v46 int)
  (r10v47 int)
  (r10v48 int)
  (r10v49 int)
  (r10v50 int)
  (r10v51 int)
  (r10v54 int)
  (r10v60 int)
  (r10v68 int)
 binds: [B:473:0x0b7e, B:470:0x0b58, B:466:0x0b32, B:463:0x0b10, B:460:0x0aee, B:457:0x0acb, B:455:0x0ab9, B:432:0x0a3c, B:404:0x093f] A[DONT_GENERATE, DONT_INLINE]
  0x0b95: PHI (r21v23 int) = 
  (r21v7 int)
  (r21v8 int)
  (r21v9 int)
  (r21v10 int)
  (r21v11 int)
  (r21v12 int)
  (r21v15 int)
  (r21v18 int)
  (r21v24 int)
 binds: [B:473:0x0b7e, B:470:0x0b58, B:466:0x0b32, B:463:0x0b10, B:460:0x0aee, B:457:0x0acb, B:455:0x0ab9, B:432:0x0a3c, B:404:0x093f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:550:0x08cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0b98 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x0ba5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x08dd A[SYNTHETIC] */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzgpu zzgpuVar) throws IOException {
        Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        zzgpu zzgpuVar2;
        int i13;
        int i14;
        zzgrc zzgrcVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zzgtd<T> zzgtdVar;
        zzgtd<T> zzgtdVar2;
        zzgtd<T> zzgtdVar3;
        int i20;
        int i21;
        int i22;
        zzgtd<T> zzgtdVar4;
        int i23;
        int i24;
        int i25;
        int i26;
        Unsafe unsafe2;
        zzgtd<T> zzgtdVar5;
        zzgpu zzgpuVar3;
        int i27;
        int i28;
        int iZzk;
        int i29;
        zzgtd<T> zzgtdVar6;
        zzgpu zzgpuVar4;
        zzgrz zzgrzVar;
        int i30;
        zzgpu zzgpuVar5;
        int i31;
        int i32;
        zzgtd<T> zzgtdVar7;
        int i33;
        int i34;
        zzgpu zzgpuVar6;
        Unsafe unsafe3;
        int iZzf;
        Object obj2;
        int i35;
        int iZzj;
        this = this;
        Object obj3 = obj;
        i2 = i2;
        i3 = i3;
        zzgpu zzgpuVar7 = zzgpuVar;
        zzD(obj);
        Unsafe unsafe4 = zzb;
        int i36 = -1;
        int iZzg = i;
        int i37 = -1;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 1048575;
        while (true) {
            if (iZzg < i2) {
                int i42 = iZzg + 1;
                int i43 = bArr[iZzg];
                if (i43 < 0) {
                    int iZzi = zzgpv.zzi(i43, bArr, i42, zzgpuVar7);
                    i8 = zzgpuVar7.zza;
                    i42 = iZzi;
                } else {
                    i8 = i43;
                }
                int i44 = i8 >>> 3;
                int iZzs = i44 > i37 ? (i44 < this.zze || i44 > this.zzf) ? -1 : this.zzs(i44, i38 / 3) : this.zzq(i44);
                if (iZzs != i36) {
                    int i45 = i8 & 7;
                    int[] iArr = this.zzc;
                    int i46 = iArr[iZzs + 1];
                    int i47 = i44;
                    int iZzt = zzt(i46);
                    long j = i46 & 1048575;
                    int i48 = i8;
                    if (iZzt <= 17) {
                        int i49 = iArr[iZzs + 2];
                        int i50 = 1 << (i49 >>> 20);
                        int i51 = i49 & 1048575;
                        if (i51 != i41) {
                            if (i41 != 1048575) {
                                unsafe4.putInt(obj3, i41, i40);
                            }
                            i15 = i51 == 1048575 ? 0 : unsafe4.getInt(obj3, i51);
                            i11 = i51;
                        } else {
                            i15 = i40;
                            i11 = i41;
                        }
                        switch (iZzt) {
                            case 0:
                                i16 = iZzs;
                                i17 = i42;
                                i18 = i47;
                                i19 = i48;
                                zzgtdVar = this;
                                if (i45 == 1) {
                                    zzguu.zzr(obj3, j, Double.longBitsToDouble(zzgpv.zzn(bArr, i17)));
                                    iZzg = i17 + 8;
                                    i40 = i15 | i50;
                                    i2 = i2;
                                    i3 = i3;
                                    this = zzgtdVar;
                                    i37 = i18;
                                    i38 = i16;
                                    i41 = i11;
                                    i39 = i19;
                                    i36 = -1;
                                } else {
                                    i42 = i17;
                                    i20 = i16;
                                    i21 = i19;
                                    i47 = i18;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i52 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i52;
                                }
                                break;
                            case 1:
                                i16 = iZzs;
                                i17 = i42;
                                i18 = i47;
                                i19 = i48;
                                zzgtdVar = this;
                                if (i45 == 5) {
                                    zzguu.zzs(obj3, j, Float.intBitsToFloat(zzgpv.zzb(bArr, i17)));
                                    iZzg = i17 + 4;
                                    i40 = i15 | i50;
                                    i2 = i2;
                                    i3 = i3;
                                    this = zzgtdVar;
                                    i37 = i18;
                                    i38 = i16;
                                    i41 = i11;
                                    i39 = i19;
                                    i36 = -1;
                                } else {
                                    i42 = i17;
                                    i20 = i16;
                                    i21 = i19;
                                    i47 = i18;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i53 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i53;
                                }
                                break;
                            case 2:
                            case 3:
                                zzgtdVar2 = this;
                                i16 = iZzs;
                                i17 = i42;
                                i18 = i47;
                                i19 = i48;
                                if (i45 == 0) {
                                    int iZzk2 = zzgpv.zzk(bArr, i17, zzgpuVar7);
                                    zzgtdVar3 = zzgtdVar2;
                                    unsafe4.putLong(obj, j, zzgpuVar7.zzb);
                                    i40 = i15 | i50;
                                    i37 = i18;
                                    iZzg = iZzk2;
                                    i38 = i16;
                                    this = zzgtdVar3;
                                    i41 = i11;
                                    i39 = i19;
                                    i36 = -1;
                                    i3 = i3;
                                } else {
                                    zzgtdVar = zzgtdVar2;
                                    i42 = i17;
                                    i20 = i16;
                                    i21 = i19;
                                    i47 = i18;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i54 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i54;
                                }
                                break;
                            case 4:
                            case 11:
                                zzgtdVar2 = this;
                                i16 = iZzs;
                                i17 = i42;
                                i18 = i47;
                                i19 = i48;
                                if (i45 == 0) {
                                    iZzg = zzgpv.zzh(bArr, i17, zzgpuVar7);
                                    unsafe4.putInt(obj3, j, zzgpuVar7.zza);
                                    int i55 = i15 | i50;
                                    i2 = i2;
                                    i3 = i3;
                                    this = zzgtdVar2;
                                    i38 = i16;
                                    i41 = i11;
                                    i39 = i19;
                                    i36 = -1;
                                    i40 = i55;
                                    i37 = i18;
                                } else {
                                    zzgtdVar = zzgtdVar2;
                                    i42 = i17;
                                    i20 = i16;
                                    i21 = i19;
                                    i47 = i18;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i56 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i56;
                                }
                                break;
                            case 5:
                            case 14:
                                zzgtdVar2 = this;
                                i16 = iZzs;
                                i18 = i47;
                                i19 = i48;
                                if (i45 == 1) {
                                    zzgtdVar3 = zzgtdVar2;
                                    unsafe4.putLong(obj, j, zzgpv.zzn(bArr, i42));
                                    iZzg = i42 + 8;
                                    i40 = i15 | i50;
                                    i37 = i18;
                                    i38 = i16;
                                    this = zzgtdVar3;
                                    i41 = i11;
                                    i39 = i19;
                                    i36 = -1;
                                    i3 = i3;
                                } else {
                                    i42 = i42;
                                    zzgtdVar = zzgtdVar2;
                                    i20 = i16;
                                    i21 = i19;
                                    i47 = i18;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i57 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i57;
                                }
                                break;
                            case 6:
                            case 13:
                                zzgtdVar2 = this;
                                i16 = iZzs;
                                i18 = i47;
                                i19 = i48;
                                if (i45 == 5) {
                                    unsafe4.putInt(obj3, j, zzgpv.zzb(bArr, i42));
                                    iZzg = i42 + 4;
                                    int i58 = i15 | i50;
                                    i2 = i2;
                                    i3 = i3;
                                    this = zzgtdVar2;
                                    i38 = i16;
                                    i41 = i11;
                                    i39 = i19;
                                    i36 = -1;
                                    i40 = i58;
                                    i37 = i18;
                                } else {
                                    i42 = i42;
                                    zzgtdVar = zzgtdVar2;
                                    i20 = i16;
                                    i21 = i19;
                                    i47 = i18;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i59 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i59;
                                }
                                break;
                            case 7:
                                zzgtdVar2 = this;
                                i16 = iZzs;
                                i18 = i47;
                                i19 = i48;
                                if (i45 == 0) {
                                    iZzg = zzgpv.zzk(bArr, i42, zzgpuVar7);
                                    zzguu.zzp(obj3, j, zzgpuVar7.zzb != 0);
                                    int i510 = i15 | i50;
                                    i2 = i2;
                                    i3 = i3;
                                    this = zzgtdVar2;
                                    i38 = i16;
                                    i41 = i11;
                                    i39 = i19;
                                    i36 = -1;
                                    i40 = i510;
                                    i37 = i18;
                                } else {
                                    i42 = i42;
                                    zzgtdVar = zzgtdVar2;
                                    i20 = i16;
                                    i21 = i19;
                                    i47 = i18;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i511 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i511;
                                }
                                break;
                            case 8:
                                zzgtdVar2 = this;
                                i16 = iZzs;
                                i18 = i47;
                                i19 = i48;
                                if (i45 == 2) {
                                    if (zzM(i46)) {
                                        iZzg = zzgpv.zzh(bArr, i42, zzgpuVar7);
                                        i22 = zzgpuVar7.zza;
                                        if (i22 < 0) {
                                            throw zzgsc.zzf();
                                        }
                                        if (i22 == 0) {
                                            zzgpuVar7.zzc = "";
                                        } else {
                                            zzgpuVar7.zzc = zzguz.zzh(bArr, iZzg, i22);
                                            iZzg += i22;
                                        }
                                    } else {
                                        iZzg = zzgpv.zzh(bArr, i42, zzgpuVar7);
                                        i22 = zzgpuVar7.zza;
                                        if (i22 < 0) {
                                            throw zzgsc.zzf();
                                        }
                                        if (i22 == 0) {
                                            zzgpuVar7.zzc = "";
                                        } else {
                                            zzgpuVar7.zzc = new String(bArr, iZzg, i22, zzgsa.zzb);
                                            iZzg += i22;
                                        }
                                    }
                                    unsafe4.putObject(obj3, j, zzgpuVar7.zzc);
                                    int i512 = i15 | i50;
                                    i2 = i2;
                                    i3 = i3;
                                    this = zzgtdVar2;
                                    i38 = i16;
                                    i41 = i11;
                                    i39 = i19;
                                    i36 = -1;
                                    i40 = i512;
                                    i37 = i18;
                                } else {
                                    i42 = i42;
                                    zzgtdVar = zzgtdVar2;
                                    i20 = i16;
                                    i21 = i19;
                                    i47 = i18;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i513 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i513;
                                }
                                break;
                            case 9:
                                zzgtdVar4 = this;
                                i23 = iZzs;
                                i24 = i47;
                                i25 = i48;
                                if (i45 == 2) {
                                    Object objZzA = zzgtdVar4.zzA(obj3, i23);
                                    iZzg = zzgpv.zzm(objZzA, zzgtdVar4.zzx(i23), bArr, i42, i2, zzgpuVar);
                                    zzgtdVar4.zzJ(obj3, i23, objZzA);
                                    i40 = i15 | i50;
                                    i3 = i3;
                                    i37 = i24;
                                    i39 = i25;
                                    i38 = i23;
                                    this = zzgtdVar4;
                                    i41 = i11;
                                    i36 = -1;
                                    i2 = i2;
                                } else {
                                    i42 = i42;
                                    zzgtdVar = zzgtdVar4;
                                    i47 = i24;
                                    i21 = i25;
                                    i20 = i23;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i514 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i514;
                                }
                                break;
                            case 10:
                                zzgtdVar4 = this;
                                i23 = iZzs;
                                i24 = i47;
                                i25 = i48;
                                if (i45 == 2) {
                                    iZzg = zzgpv.zza(bArr, i42, zzgpuVar7);
                                    unsafe4.putObject(obj3, j, zzgpuVar7.zzc);
                                    i40 = i15 | i50;
                                    i2 = i2;
                                    i3 = i3;
                                    this = zzgtdVar4;
                                    i37 = i24;
                                    i39 = i25;
                                    i38 = i23;
                                    i41 = i11;
                                    i36 = -1;
                                } else {
                                    i42 = i42;
                                    zzgtdVar = zzgtdVar4;
                                    i47 = i24;
                                    i21 = i25;
                                    i20 = i23;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i515 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i515;
                                }
                                break;
                            case 12:
                                i23 = iZzs;
                                i24 = i47;
                                if (i45 == 0) {
                                    iZzg = zzgpv.zzh(bArr, i42, zzgpuVar7);
                                    int i60 = zzgpuVar7.zza;
                                    zzgtdVar4 = this;
                                    zzgru zzgruVarZzw = zzgtdVar4.zzw(i23);
                                    if ((Integer.MIN_VALUE & i46) == 0 || zzgruVarZzw == null || zzgruVarZzw.zza(i60)) {
                                        i25 = i48;
                                        unsafe4.putInt(obj3, j, i60);
                                        i40 = i15 | i50;
                                        i2 = i2;
                                        i3 = i3;
                                        this = zzgtdVar4;
                                        i37 = i24;
                                        i39 = i25;
                                        i38 = i23;
                                        i41 = i11;
                                        i36 = -1;
                                    } else {
                                        zzd(obj).zzj(i48, Long.valueOf(i60));
                                        i2 = i2;
                                        i3 = i3;
                                        i40 = i15;
                                        i37 = i24;
                                        i39 = i48;
                                        i38 = i23;
                                        i36 = -1;
                                        this = zzgtdVar4;
                                        i41 = i11;
                                    }
                                } else {
                                    i47 = i24;
                                    i20 = i23;
                                    i21 = i48;
                                    zzgtdVar = this;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i516 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i516;
                                }
                                break;
                            case 15:
                                i23 = iZzs;
                                i26 = i47;
                                if (i45 == 0) {
                                    iZzg = zzgpv.zzh(bArr, i42, zzgpuVar7);
                                    unsafe4.putInt(obj3, j, zzgqq.zzF(zzgpuVar7.zza));
                                    i40 = i15 | i50;
                                    i37 = i26;
                                    i38 = i23;
                                    i41 = i11;
                                    i39 = i48;
                                    i36 = -1;
                                } else {
                                    i47 = i26;
                                    i20 = i23;
                                    i21 = i48;
                                    zzgtdVar = this;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i517 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i517;
                                }
                                break;
                            case 16:
                                if (i45 == 0) {
                                    int iZzk3 = zzgpv.zzk(bArr, i42, zzgpuVar7);
                                    i26 = i47;
                                    i23 = iZzs;
                                    unsafe4.putLong(obj, j, zzgqq.zzG(zzgpuVar7.zzb));
                                    i40 = i15 | i50;
                                    iZzg = iZzk3;
                                    i37 = i26;
                                    i38 = i23;
                                    i41 = i11;
                                    i39 = i48;
                                    i36 = -1;
                                } else {
                                    i20 = iZzs;
                                    i42 = i42;
                                    i21 = i48;
                                    zzgtdVar = this;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i518 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i518;
                                }
                                break;
                            default:
                                i16 = iZzs;
                                i17 = i42;
                                i18 = i47;
                                i19 = i48;
                                zzgtdVar = this;
                                if (i45 == 3) {
                                    Object objZzA2 = zzgtdVar.zzA(obj3, i16);
                                    int iZzl = zzgpv.zzl(objZzA2, zzgtdVar.zzx(i16), bArr, i17, i2, (i18 << 3) | 4, zzgpuVar);
                                    zzgtdVar.zzJ(obj3, i16, objZzA2);
                                    int i61 = i15 | i50;
                                    i3 = i3;
                                    zzgpuVar7 = zzgpuVar;
                                    this = zzgtdVar;
                                    unsafe4 = unsafe4;
                                    i2 = i2;
                                    i41 = i11;
                                    i36 = -1;
                                    i40 = i61;
                                    i39 = i19;
                                    iZzg = iZzl;
                                    i38 = i16;
                                    i37 = i18;
                                } else {
                                    i42 = i17;
                                    i20 = i16;
                                    i21 = i19;
                                    i47 = i18;
                                    i4 = i3;
                                    i13 = i20;
                                    i12 = i21;
                                    zzgpuVar2 = zzgpuVar7;
                                    i9 = i42;
                                    int i519 = i15;
                                    this = zzgtdVar;
                                    i14 = i47;
                                    i10 = i519;
                                }
                                break;
                        }
                    } else {
                        i11 = i41;
                        Object obj4 = "";
                        int i62 = i2;
                        i10 = i40;
                        Unsafe unsafe5 = unsafe4;
                        int i63 = i42;
                        zzgtd<T> zzgtdVar8 = this;
                        i48 = i48;
                        if (iZzt != 27) {
                            if (iZzt <= 49) {
                                long j2 = i46;
                                Unsafe unsafe6 = zzb;
                                Unsafe unsafe7 = unsafe5;
                                zzgrz zzgrzVar2 = (zzgrz) unsafe6.getObject(obj3, j);
                                if (zzgrzVar2.zzc()) {
                                    obj4 = obj4;
                                    zzgrzVar = zzgrzVar2;
                                } else {
                                    int size = zzgrzVar2.size();
                                    zzgrz zzgrzVarZzd = zzgrzVar2.zzd(size == 0 ? 10 : size + size);
                                    unsafe6.putObject(obj3, j, zzgrzVarZzd);
                                    zzgrzVar = zzgrzVarZzd;
                                }
                                switch (iZzt) {
                                    case 18:
                                    case 35:
                                        this = this;
                                        i62 = i62;
                                        i13 = iZzs;
                                        i30 = i47;
                                        zzgpuVar5 = zzgpuVar7;
                                        i31 = i63;
                                        unsafe4 = unsafe7;
                                        if (i45 == 2) {
                                            zzgqz zzgqzVar = (zzgqz) zzgrzVar;
                                            iZzg = zzgpv.zzh(bArr, i31, zzgpuVar5);
                                            int i64 = zzgpuVar5.zza + iZzg;
                                            while (iZzg < i64) {
                                                zzgqzVar.zze(Double.longBitsToDouble(zzgpv.zzn(bArr, iZzg)));
                                                iZzg += 8;
                                            }
                                            if (iZzg != i64) {
                                                throw zzgsc.zzj();
                                            }
                                        } else if (i45 == 1) {
                                            zzgqz zzgqzVar2 = (zzgqz) zzgrzVar;
                                            zzgqzVar2.zze(Double.longBitsToDouble(zzgpv.zzn(bArr, i31)));
                                            i32 = i31 + 8;
                                            while (i32 < i62) {
                                                int iZzh = zzgpv.zzh(bArr, i32, zzgpuVar5);
                                                if (i48 == zzgpuVar5.zza) {
                                                    zzgqzVar2.zze(Double.longBitsToDouble(zzgpv.zzn(bArr, iZzh)));
                                                    i32 = iZzh + 8;
                                                } else {
                                                    iZzg = i32;
                                                }
                                            }
                                            iZzg = i32;
                                        } else {
                                            iZzg = i31;
                                        }
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        this = this;
                                        i62 = i62;
                                        i13 = iZzs;
                                        i30 = i47;
                                        zzgpuVar5 = zzgpuVar7;
                                        i31 = i63;
                                        unsafe4 = unsafe7;
                                        if (i45 == 2) {
                                            zzgrj zzgrjVar = (zzgrj) zzgrzVar;
                                            iZzg = zzgpv.zzh(bArr, i31, zzgpuVar5);
                                            int i65 = zzgpuVar5.zza + iZzg;
                                            while (iZzg < i65) {
                                                zzgrjVar.zze(Float.intBitsToFloat(zzgpv.zzb(bArr, iZzg)));
                                                iZzg += 4;
                                            }
                                            if (iZzg != i65) {
                                                throw zzgsc.zzj();
                                            }
                                        } else if (i45 == 5) {
                                            zzgrj zzgrjVar2 = (zzgrj) zzgrzVar;
                                            zzgrjVar2.zze(Float.intBitsToFloat(zzgpv.zzb(bArr, i31)));
                                            i32 = i31 + 4;
                                            while (i32 < i62) {
                                                int iZzh2 = zzgpv.zzh(bArr, i32, zzgpuVar5);
                                                if (i48 == zzgpuVar5.zza) {
                                                    zzgrjVar2.zze(Float.intBitsToFloat(zzgpv.zzb(bArr, iZzh2)));
                                                    i32 = iZzh2 + 4;
                                                } else {
                                                    iZzg = i32;
                                                }
                                            }
                                            iZzg = i32;
                                        } else {
                                            iZzg = i31;
                                        }
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        this = this;
                                        i62 = i62;
                                        i13 = iZzs;
                                        i30 = i47;
                                        zzgpuVar5 = zzgpuVar7;
                                        i31 = i63;
                                        unsafe4 = unsafe7;
                                        if (i45 == 2) {
                                            zzgsp zzgspVar = (zzgsp) zzgrzVar;
                                            iZzg = zzgpv.zzh(bArr, i31, zzgpuVar5);
                                            int i66 = zzgpuVar5.zza + iZzg;
                                            while (iZzg < i66) {
                                                iZzg = zzgpv.zzk(bArr, iZzg, zzgpuVar5);
                                                zzgspVar.zzg(zzgpuVar5.zzb);
                                            }
                                            if (iZzg != i66) {
                                                throw zzgsc.zzj();
                                            }
                                        } else if (i45 == 0) {
                                            zzgsp zzgspVar2 = (zzgsp) zzgrzVar;
                                            iZzg = zzgpv.zzk(bArr, i31, zzgpuVar5);
                                            zzgspVar2.zzg(zzgpuVar5.zzb);
                                            while (iZzg < i62) {
                                                int iZzh3 = zzgpv.zzh(bArr, iZzg, zzgpuVar5);
                                                if (i48 == zzgpuVar5.zza) {
                                                    iZzg = zzgpv.zzk(bArr, iZzh3, zzgpuVar5);
                                                    zzgspVar2.zzg(zzgpuVar5.zzb);
                                                }
                                            }
                                        } else {
                                            iZzg = i31;
                                        }
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        zzgtdVar7 = this;
                                        i62 = i62;
                                        i33 = iZzs;
                                        i34 = i47;
                                        zzgpuVar6 = zzgpuVar7;
                                        i31 = i63;
                                        unsafe3 = unsafe7;
                                        if (i45 == 2) {
                                            iZzf = zzgpv.zzf(bArr, i31, zzgrzVar, zzgpuVar6);
                                            zzgpuVar5 = zzgpuVar6;
                                            iZzg = iZzf;
                                            i30 = i34;
                                            this = zzgtdVar7;
                                            unsafe4 = unsafe3;
                                            i13 = i33;
                                        } else if (i45 == 0) {
                                            zzgpuVar5 = zzgpuVar6;
                                            i30 = i34;
                                            this = zzgtdVar7;
                                            unsafe4 = unsafe3;
                                            i13 = i33;
                                            iZzg = zzgpv.zzj(i48, bArr, i31, i2, zzgrzVar, zzgpuVar);
                                        } else {
                                            zzgpuVar5 = zzgpuVar6;
                                            i30 = i34;
                                            this = zzgtdVar7;
                                            unsafe4 = unsafe3;
                                            i13 = i33;
                                            iZzg = i31;
                                        }
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        zzgtdVar7 = this;
                                        i62 = i62;
                                        i33 = iZzs;
                                        i34 = i47;
                                        zzgpuVar6 = zzgpuVar7;
                                        i31 = i63;
                                        unsafe3 = unsafe7;
                                        if (i45 != 2) {
                                            if (i45 == 1) {
                                                zzgsp zzgspVar3 = (zzgsp) zzgrzVar;
                                                zzgspVar3.zzg(zzgpv.zzn(bArr, i31));
                                                iZzf = i31 + 8;
                                                while (iZzf < i62) {
                                                    int iZzh4 = zzgpv.zzh(bArr, iZzf, zzgpuVar6);
                                                    if (i48 == zzgpuVar6.zza) {
                                                        zzgspVar3.zzg(zzgpv.zzn(bArr, iZzh4));
                                                        iZzf = iZzh4 + 8;
                                                    }
                                                }
                                            }
                                            zzgpuVar5 = zzgpuVar6;
                                            i30 = i34;
                                            this = zzgtdVar7;
                                            unsafe4 = unsafe3;
                                            i13 = i33;
                                            iZzg = i31;
                                            if (iZzg != i31) {
                                                i3 = i3;
                                                i39 = i48;
                                                zzgpuVar7 = zzgpuVar5;
                                                i37 = i30;
                                                this = this;
                                                i38 = i13;
                                                i41 = i11;
                                                i40 = i10;
                                                i36 = -1;
                                                i2 = i62;
                                                obj3 = obj;
                                            } else {
                                                obj3 = obj;
                                                i9 = iZzg;
                                                zzgpuVar2 = zzgpuVar5;
                                                i14 = i30;
                                                unsafe4 = unsafe4;
                                                i4 = i3;
                                                i12 = i48;
                                                this = this;
                                            }
                                        } else {
                                            zzgsp zzgspVar4 = (zzgsp) zzgrzVar;
                                            iZzf = zzgpv.zzh(bArr, i31, zzgpuVar6);
                                            int i67 = zzgpuVar6.zza + iZzf;
                                            while (iZzf < i67) {
                                                zzgspVar4.zzg(zzgpv.zzn(bArr, iZzf));
                                                iZzf += 8;
                                            }
                                            if (iZzf != i67) {
                                                throw zzgsc.zzj();
                                            }
                                        }
                                        zzgpuVar5 = zzgpuVar6;
                                        iZzg = iZzf;
                                        i30 = i34;
                                        this = zzgtdVar7;
                                        unsafe4 = unsafe3;
                                        i13 = i33;
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        zzgtdVar7 = this;
                                        i62 = i62;
                                        i33 = iZzs;
                                        i34 = i47;
                                        zzgpuVar6 = zzgpuVar7;
                                        i31 = i63;
                                        unsafe3 = unsafe7;
                                        if (i45 != 2) {
                                            if (i45 == 5) {
                                                zzgrr zzgrrVar = (zzgrr) zzgrzVar;
                                                zzgrrVar.zzh(zzgpv.zzb(bArr, i31));
                                                iZzf = i31 + 4;
                                                while (iZzf < i62) {
                                                    int iZzh5 = zzgpv.zzh(bArr, iZzf, zzgpuVar6);
                                                    if (i48 == zzgpuVar6.zza) {
                                                        zzgrrVar.zzh(zzgpv.zzb(bArr, iZzh5));
                                                        iZzf = iZzh5 + 4;
                                                    }
                                                }
                                            }
                                            zzgpuVar5 = zzgpuVar6;
                                            i30 = i34;
                                            this = zzgtdVar7;
                                            unsafe4 = unsafe3;
                                            i13 = i33;
                                            iZzg = i31;
                                            if (iZzg != i31) {
                                                i3 = i3;
                                                i39 = i48;
                                                zzgpuVar7 = zzgpuVar5;
                                                i37 = i30;
                                                this = this;
                                                i38 = i13;
                                                i41 = i11;
                                                i40 = i10;
                                                i36 = -1;
                                                i2 = i62;
                                                obj3 = obj;
                                            } else {
                                                obj3 = obj;
                                                i9 = iZzg;
                                                zzgpuVar2 = zzgpuVar5;
                                                i14 = i30;
                                                unsafe4 = unsafe4;
                                                i4 = i3;
                                                i12 = i48;
                                                this = this;
                                            }
                                        } else {
                                            zzgrr zzgrrVar2 = (zzgrr) zzgrzVar;
                                            iZzf = zzgpv.zzh(bArr, i31, zzgpuVar6);
                                            int i68 = zzgpuVar6.zza + iZzf;
                                            while (iZzf < i68) {
                                                zzgrrVar2.zzh(zzgpv.zzb(bArr, iZzf));
                                                iZzf += 4;
                                            }
                                            if (iZzf != i68) {
                                                throw zzgsc.zzj();
                                            }
                                        }
                                        zzgpuVar5 = zzgpuVar6;
                                        iZzg = iZzf;
                                        i30 = i34;
                                        this = zzgtdVar7;
                                        unsafe4 = unsafe3;
                                        i13 = i33;
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        zzgtdVar7 = this;
                                        i62 = i62;
                                        i33 = iZzs;
                                        i34 = i47;
                                        zzgpuVar6 = zzgpuVar7;
                                        i31 = i63;
                                        unsafe3 = unsafe7;
                                        if (i45 != 2) {
                                            if (i45 == 0) {
                                                zzgpw zzgpwVar = (zzgpw) zzgrzVar;
                                                iZzf = zzgpv.zzk(bArr, i31, zzgpuVar6);
                                                zzgpwVar.zze(zzgpuVar6.zzb != 0);
                                                while (iZzf < i62) {
                                                    int iZzh6 = zzgpv.zzh(bArr, iZzf, zzgpuVar6);
                                                    if (i48 == zzgpuVar6.zza) {
                                                        iZzf = zzgpv.zzk(bArr, iZzh6, zzgpuVar6);
                                                        zzgpwVar.zze(zzgpuVar6.zzb != 0);
                                                    }
                                                }
                                            }
                                            zzgpuVar5 = zzgpuVar6;
                                            i30 = i34;
                                            this = zzgtdVar7;
                                            unsafe4 = unsafe3;
                                            i13 = i33;
                                            iZzg = i31;
                                            if (iZzg != i31) {
                                                i3 = i3;
                                                i39 = i48;
                                                zzgpuVar7 = zzgpuVar5;
                                                i37 = i30;
                                                this = this;
                                                i38 = i13;
                                                i41 = i11;
                                                i40 = i10;
                                                i36 = -1;
                                                i2 = i62;
                                                obj3 = obj;
                                            } else {
                                                obj3 = obj;
                                                i9 = iZzg;
                                                zzgpuVar2 = zzgpuVar5;
                                                i14 = i30;
                                                unsafe4 = unsafe4;
                                                i4 = i3;
                                                i12 = i48;
                                                this = this;
                                            }
                                        } else {
                                            zzgpw zzgpwVar2 = (zzgpw) zzgrzVar;
                                            iZzf = zzgpv.zzh(bArr, i31, zzgpuVar6);
                                            int i69 = zzgpuVar6.zza + iZzf;
                                            while (iZzf < i69) {
                                                iZzf = zzgpv.zzk(bArr, iZzf, zzgpuVar6);
                                                zzgpwVar2.zze(zzgpuVar6.zzb != 0);
                                            }
                                            if (iZzf != i69) {
                                                throw zzgsc.zzj();
                                            }
                                        }
                                        zzgpuVar5 = zzgpuVar6;
                                        iZzg = iZzf;
                                        i30 = i34;
                                        this = zzgtdVar7;
                                        unsafe4 = unsafe3;
                                        i13 = i33;
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 26:
                                        zzgtdVar7 = this;
                                        i62 = i62;
                                        i33 = iZzs;
                                        i34 = i47;
                                        zzgpuVar6 = zzgpuVar7;
                                        i31 = i63;
                                        unsafe3 = unsafe7;
                                        if (i45 == 2) {
                                            if ((j2 & 536870912) == 0) {
                                                iZzf = zzgpv.zzh(bArr, i31, zzgpuVar6);
                                                int i70 = zzgpuVar6.zza;
                                                if (i70 < 0) {
                                                    throw zzgsc.zzf();
                                                }
                                                if (i70 == 0) {
                                                    obj2 = obj4;
                                                    zzgrzVar.add(obj2);
                                                } else {
                                                    obj2 = obj4;
                                                    zzgrzVar.add(new String(bArr, iZzf, i70, zzgsa.zzb));
                                                    iZzf += i70;
                                                }
                                                while (iZzf < i62) {
                                                    int iZzh7 = zzgpv.zzh(bArr, iZzf, zzgpuVar6);
                                                    if (i48 == zzgpuVar6.zza) {
                                                        iZzf = zzgpv.zzh(bArr, iZzh7, zzgpuVar6);
                                                        int i71 = zzgpuVar6.zza;
                                                        if (i71 < 0) {
                                                            throw zzgsc.zzf();
                                                        }
                                                        if (i71 == 0) {
                                                            zzgrzVar.add(obj2);
                                                        } else {
                                                            zzgrzVar.add(new String(bArr, iZzf, i71, zzgsa.zzb));
                                                            iZzf += i71;
                                                        }
                                                    }
                                                }
                                            } else {
                                                Object obj5 = obj4;
                                                iZzf = zzgpv.zzh(bArr, i31, zzgpuVar6);
                                                int i72 = zzgpuVar6.zza;
                                                if (i72 < 0) {
                                                    throw zzgsc.zzf();
                                                }
                                                if (i72 == 0) {
                                                    zzgrzVar.add(obj5);
                                                } else {
                                                    int i73 = iZzf + i72;
                                                    if (!zzguz.zzj(bArr, iZzf, i73)) {
                                                        throw zzgsc.zzd();
                                                    }
                                                    zzgrzVar.add(new String(bArr, iZzf, i72, zzgsa.zzb));
                                                    iZzf = i73;
                                                }
                                                while (iZzf < i62) {
                                                    int iZzh8 = zzgpv.zzh(bArr, iZzf, zzgpuVar6);
                                                    if (i48 == zzgpuVar6.zza) {
                                                        iZzf = zzgpv.zzh(bArr, iZzh8, zzgpuVar6);
                                                        int i74 = zzgpuVar6.zza;
                                                        if (i74 < 0) {
                                                            throw zzgsc.zzf();
                                                        }
                                                        if (i74 == 0) {
                                                            zzgrzVar.add(obj5);
                                                        } else {
                                                            int i75 = iZzf + i74;
                                                            if (!zzguz.zzj(bArr, iZzf, i75)) {
                                                                throw zzgsc.zzd();
                                                            }
                                                            zzgrzVar.add(new String(bArr, iZzf, i74, zzgsa.zzb));
                                                            iZzf = i75;
                                                        }
                                                    }
                                                }
                                            }
                                            zzgpuVar5 = zzgpuVar6;
                                            iZzg = iZzf;
                                            i30 = i34;
                                            this = zzgtdVar7;
                                            unsafe4 = unsafe3;
                                            i13 = i33;
                                            if (iZzg != i31) {
                                                i3 = i3;
                                                i39 = i48;
                                                zzgpuVar7 = zzgpuVar5;
                                                i37 = i30;
                                                this = this;
                                                i38 = i13;
                                                i41 = i11;
                                                i40 = i10;
                                                i36 = -1;
                                                i2 = i62;
                                                obj3 = obj;
                                            } else {
                                                obj3 = obj;
                                                i9 = iZzg;
                                                zzgpuVar2 = zzgpuVar5;
                                                i14 = i30;
                                                unsafe4 = unsafe4;
                                                i4 = i3;
                                                i12 = i48;
                                                this = this;
                                            }
                                        }
                                        zzgpuVar5 = zzgpuVar6;
                                        i30 = i34;
                                        this = zzgtdVar7;
                                        unsafe4 = unsafe3;
                                        i13 = i33;
                                        iZzg = i31;
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 27:
                                        this = this;
                                        i62 = i62;
                                        i35 = i63;
                                        unsafe7 = unsafe7;
                                        if (i45 == 2) {
                                            zzgpu zzgpuVar8 = zzgpuVar7;
                                            int iZze = zzgpv.zze(this.zzx(iZzs), i48, bArr, i35, i2, zzgrzVar, zzgpuVar);
                                            i31 = i35;
                                            i30 = i47;
                                            this = this;
                                            unsafe4 = unsafe7;
                                            i13 = iZzs;
                                            zzgpuVar5 = zzgpuVar8;
                                            iZzg = iZze;
                                        } else {
                                            int i76 = i35;
                                            i13 = iZzs;
                                            zzgpuVar5 = zzgpuVar7;
                                            i31 = i76;
                                            unsafe4 = unsafe7;
                                            i30 = i47;
                                            iZzg = i31;
                                        }
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 28:
                                        this = this;
                                        i62 = i62;
                                        i35 = i63;
                                        unsafe7 = unsafe7;
                                        if (i45 == 2) {
                                            iZzg = zzgpv.zzh(bArr, i35, zzgpuVar7);
                                            int i77 = zzgpuVar7.zza;
                                            if (i77 < 0) {
                                                throw zzgsc.zzf();
                                            }
                                            if (i77 > bArr.length - iZzg) {
                                                throw zzgsc.zzj();
                                            }
                                            if (i77 == 0) {
                                                zzgrzVar.add(zzgqi.zzb);
                                            } else {
                                                zzgrzVar.add(zzgqi.zzv(bArr, iZzg, i77));
                                                iZzg += i77;
                                            }
                                            while (iZzg < i62) {
                                                int iZzh9 = zzgpv.zzh(bArr, iZzg, zzgpuVar7);
                                                if (i48 != zzgpuVar7.zza) {
                                                    int i78 = i35;
                                                    i13 = iZzs;
                                                    zzgpuVar5 = zzgpuVar7;
                                                    i31 = i78;
                                                    unsafe4 = unsafe7;
                                                    i30 = i47;
                                                    if (iZzg != i31) {
                                                        i3 = i3;
                                                        i39 = i48;
                                                        zzgpuVar7 = zzgpuVar5;
                                                        i37 = i30;
                                                        this = this;
                                                        i38 = i13;
                                                        i41 = i11;
                                                        i40 = i10;
                                                        i36 = -1;
                                                        i2 = i62;
                                                        obj3 = obj;
                                                    } else {
                                                        obj3 = obj;
                                                        i9 = iZzg;
                                                        zzgpuVar2 = zzgpuVar5;
                                                        i14 = i30;
                                                        unsafe4 = unsafe4;
                                                        i4 = i3;
                                                        i12 = i48;
                                                        this = this;
                                                    }
                                                    break;
                                                } else {
                                                    iZzg = zzgpv.zzh(bArr, iZzh9, zzgpuVar7);
                                                    int i79 = zzgpuVar7.zza;
                                                    if (i79 < 0) {
                                                        throw zzgsc.zzf();
                                                    }
                                                    if (i79 > bArr.length - iZzg) {
                                                        throw zzgsc.zzj();
                                                    }
                                                    if (i79 == 0) {
                                                        zzgrzVar.add(zzgqi.zzb);
                                                    } else {
                                                        zzgrzVar.add(zzgqi.zzv(bArr, iZzg, i79));
                                                        iZzg += i79;
                                                    }
                                                }
                                            }
                                            int i710 = i35;
                                            i13 = iZzs;
                                            zzgpuVar5 = zzgpuVar7;
                                            i31 = i710;
                                            unsafe4 = unsafe7;
                                            i30 = i47;
                                            if (iZzg != i31) {
                                                i3 = i3;
                                                i39 = i48;
                                                zzgpuVar7 = zzgpuVar5;
                                                i37 = i30;
                                                this = this;
                                                i38 = i13;
                                                i41 = i11;
                                                i40 = i10;
                                                i36 = -1;
                                                i2 = i62;
                                                obj3 = obj;
                                            } else {
                                                obj3 = obj;
                                                i9 = iZzg;
                                                zzgpuVar2 = zzgpuVar5;
                                                i14 = i30;
                                                unsafe4 = unsafe4;
                                                i4 = i3;
                                                i12 = i48;
                                                this = this;
                                            }
                                        }
                                        int i711 = i35;
                                        i13 = iZzs;
                                        zzgpuVar5 = zzgpuVar7;
                                        i31 = i711;
                                        unsafe4 = unsafe7;
                                        i30 = i47;
                                        iZzg = i31;
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i35 = i63;
                                        if (i45 == 2) {
                                            iZzj = zzgpv.zzf(bArr, i35, zzgrzVar, zzgpuVar7);
                                        } else if (i45 != 0) {
                                            i30 = i47;
                                            unsafe4 = unsafe7;
                                            int i80 = i35;
                                            i13 = iZzs;
                                            zzgpuVar5 = zzgpuVar7;
                                            i31 = i80;
                                            iZzg = i31;
                                            if (iZzg != i31) {
                                                i3 = i3;
                                                i39 = i48;
                                                zzgpuVar7 = zzgpuVar5;
                                                i37 = i30;
                                                this = this;
                                                i38 = i13;
                                                i41 = i11;
                                                i40 = i10;
                                                i36 = -1;
                                                i2 = i62;
                                                obj3 = obj;
                                            } else {
                                                obj3 = obj;
                                                i9 = iZzg;
                                                zzgpuVar2 = zzgpuVar5;
                                                i14 = i30;
                                                unsafe4 = unsafe4;
                                                i4 = i3;
                                                i12 = i48;
                                                this = this;
                                            }
                                        } else {
                                            iZzj = zzgpv.zzj(i48, bArr, i35, i2, zzgrzVar, zzgpuVar);
                                        }
                                        zzgtv.zzo(obj, i47, zzgrzVar, zzw(iZzs), null, this.zzn);
                                        iZzg = iZzj;
                                        int i712 = i35;
                                        i13 = iZzs;
                                        zzgpuVar5 = zzgpuVar7;
                                        i31 = i712;
                                        unsafe4 = unsafe7;
                                        i30 = i47;
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i35 = i63;
                                        if (i45 != 2) {
                                            if (i45 == 0) {
                                                zzgrr zzgrrVar3 = (zzgrr) zzgrzVar;
                                                iZzg = zzgpv.zzh(bArr, i35, zzgpuVar7);
                                                zzgrrVar3.zzh(zzgqq.zzF(zzgpuVar7.zza));
                                                while (iZzg < i62) {
                                                    int iZzh10 = zzgpv.zzh(bArr, iZzg, zzgpuVar7);
                                                    if (i48 == zzgpuVar7.zza) {
                                                        iZzg = zzgpv.zzh(bArr, iZzh10, zzgpuVar7);
                                                        zzgrrVar3.zzh(zzgqq.zzF(zzgpuVar7.zza));
                                                    }
                                                }
                                            }
                                            i30 = i47;
                                            unsafe4 = unsafe7;
                                            int i81 = i35;
                                            i13 = iZzs;
                                            zzgpuVar5 = zzgpuVar7;
                                            i31 = i81;
                                            iZzg = i31;
                                            if (iZzg != i31) {
                                                i3 = i3;
                                                i39 = i48;
                                                zzgpuVar7 = zzgpuVar5;
                                                i37 = i30;
                                                this = this;
                                                i38 = i13;
                                                i41 = i11;
                                                i40 = i10;
                                                i36 = -1;
                                                i2 = i62;
                                                obj3 = obj;
                                            } else {
                                                obj3 = obj;
                                                i9 = iZzg;
                                                zzgpuVar2 = zzgpuVar5;
                                                i14 = i30;
                                                unsafe4 = unsafe4;
                                                i4 = i3;
                                                i12 = i48;
                                                this = this;
                                            }
                                        } else {
                                            zzgrr zzgrrVar4 = (zzgrr) zzgrzVar;
                                            iZzg = zzgpv.zzh(bArr, i35, zzgpuVar7);
                                            int i82 = zzgpuVar7.zza + iZzg;
                                            while (iZzg < i82) {
                                                iZzg = zzgpv.zzh(bArr, iZzg, zzgpuVar7);
                                                zzgrrVar4.zzh(zzgqq.zzF(zzgpuVar7.zza));
                                            }
                                            if (iZzg != i82) {
                                                throw zzgsc.zzj();
                                            }
                                        }
                                        this = this;
                                        i62 = i62;
                                        i30 = i47;
                                        unsafe4 = unsafe7;
                                        int i83 = i35;
                                        i13 = iZzs;
                                        zzgpuVar5 = zzgpuVar7;
                                        i31 = i83;
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i45 != 2) {
                                            i35 = i63;
                                            if (i45 == 0) {
                                                zzgsp zzgspVar5 = (zzgsp) zzgrzVar;
                                                iZzg = zzgpv.zzk(bArr, i35, zzgpuVar7);
                                                zzgspVar5.zzg(zzgqq.zzG(zzgpuVar7.zzb));
                                                while (iZzg < i62) {
                                                    int iZzh11 = zzgpv.zzh(bArr, iZzg, zzgpuVar7);
                                                    if (i48 == zzgpuVar7.zza) {
                                                        iZzg = zzgpv.zzk(bArr, iZzh11, zzgpuVar7);
                                                        zzgspVar5.zzg(zzgqq.zzG(zzgpuVar7.zzb));
                                                    }
                                                }
                                            }
                                            i30 = i47;
                                            unsafe4 = unsafe7;
                                            int i84 = i35;
                                            i13 = iZzs;
                                            zzgpuVar5 = zzgpuVar7;
                                            i31 = i84;
                                            iZzg = i31;
                                            if (iZzg != i31) {
                                                i3 = i3;
                                                i39 = i48;
                                                zzgpuVar7 = zzgpuVar5;
                                                i37 = i30;
                                                this = this;
                                                i38 = i13;
                                                i41 = i11;
                                                i40 = i10;
                                                i36 = -1;
                                                i2 = i62;
                                                obj3 = obj;
                                            } else {
                                                obj3 = obj;
                                                i9 = iZzg;
                                                zzgpuVar2 = zzgpuVar5;
                                                i14 = i30;
                                                unsafe4 = unsafe4;
                                                i4 = i3;
                                                i12 = i48;
                                                this = this;
                                            }
                                        } else {
                                            zzgsp zzgspVar6 = (zzgsp) zzgrzVar;
                                            i35 = i63;
                                            iZzg = zzgpv.zzh(bArr, i35, zzgpuVar7);
                                            int i85 = zzgpuVar7.zza + iZzg;
                                            while (iZzg < i85) {
                                                iZzg = zzgpv.zzk(bArr, iZzg, zzgpuVar7);
                                                zzgspVar6.zzg(zzgqq.zzG(zzgpuVar7.zzb));
                                            }
                                            if (iZzg != i85) {
                                                throw zzgsc.zzj();
                                            }
                                        }
                                        this = this;
                                        i62 = i62;
                                        i30 = i47;
                                        unsafe4 = unsafe7;
                                        int i86 = i35;
                                        i13 = iZzs;
                                        zzgpuVar5 = zzgpuVar7;
                                        i31 = i86;
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                    default:
                                        this = this;
                                        i62 = i62;
                                        i13 = iZzs;
                                        i30 = i47;
                                        zzgpuVar5 = zzgpuVar7;
                                        i31 = i63;
                                        unsafe4 = unsafe7;
                                        if (i45 == 3) {
                                            zzgtt zzgttVarZzx = this.zzx(i13);
                                            int i87 = (i48 & (-8)) | 4;
                                            iZzg = zzgpv.zzc(zzgttVarZzx, bArr, i31, i2, i87, zzgpuVar);
                                            zzgrzVar.add(zzgpuVar5.zzc);
                                            while (iZzg < i62) {
                                                int iZzh12 = zzgpv.zzh(bArr, iZzg, zzgpuVar5);
                                                if (i48 == zzgpuVar5.zza) {
                                                    iZzg = zzgpv.zzc(zzgttVarZzx, bArr, iZzh12, i2, i87, zzgpuVar);
                                                    zzgrzVar.add(zzgpuVar5.zzc);
                                                }
                                            }
                                        } else {
                                            iZzg = i31;
                                        }
                                        if (iZzg != i31) {
                                            i3 = i3;
                                            i39 = i48;
                                            zzgpuVar7 = zzgpuVar5;
                                            i37 = i30;
                                            this = this;
                                            i38 = i13;
                                            i41 = i11;
                                            i40 = i10;
                                            i36 = -1;
                                            i2 = i62;
                                            obj3 = obj;
                                        } else {
                                            obj3 = obj;
                                            i9 = iZzg;
                                            zzgpuVar2 = zzgpuVar5;
                                            i14 = i30;
                                            unsafe4 = unsafe4;
                                            i4 = i3;
                                            i12 = i48;
                                            this = this;
                                        }
                                        break;
                                }
                            } else {
                                unsafe2 = unsafe5;
                                i14 = i47;
                                zzgtdVar5 = this;
                                i38 = iZzs;
                                zzgpuVar3 = zzgpuVar7;
                                i27 = i63;
                                if (iZzt != 50) {
                                    obj3 = obj;
                                    Unsafe unsafe8 = zzb;
                                    long j3 = iArr[i38 + 2] & 1048575;
                                    switch (iZzt) {
                                        case 51:
                                            i28 = i27;
                                            i48 = i48;
                                            this = this;
                                            zzgpuVar2 = zzgpuVar3;
                                            unsafe4 = unsafe2;
                                            if (i45 == 1) {
                                                unsafe8.putObject(obj3, j, Double.valueOf(Double.longBitsToDouble(zzgpv.zzn(bArr, i28))));
                                                iZzg = i28 + 8;
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 52:
                                            i28 = i27;
                                            i48 = i48;
                                            this = this;
                                            zzgpuVar2 = zzgpuVar3;
                                            unsafe4 = unsafe2;
                                            if (i45 == 5) {
                                                unsafe8.putObject(obj3, j, Float.valueOf(Float.intBitsToFloat(zzgpv.zzb(bArr, i28))));
                                                iZzg = i28 + 4;
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i28 = i27;
                                            i48 = i48;
                                            this = this;
                                            zzgpuVar2 = zzgpuVar3;
                                            unsafe4 = unsafe2;
                                            if (i45 == 0) {
                                                iZzk = zzgpv.zzk(bArr, i28, zzgpuVar2);
                                                unsafe8.putObject(obj3, j, Long.valueOf(zzgpuVar2.zzb));
                                                unsafe8.putInt(obj3, j3, i14);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i28 = i27;
                                            i48 = i48;
                                            this = this;
                                            zzgpuVar2 = zzgpuVar3;
                                            unsafe4 = unsafe2;
                                            if (i45 == 0) {
                                                iZzg = zzgpv.zzh(bArr, i28, zzgpuVar2);
                                                unsafe8.putObject(obj3, j, Integer.valueOf(zzgpuVar2.zza));
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i28 = i27;
                                            i48 = i48;
                                            this = this;
                                            zzgpuVar2 = zzgpuVar3;
                                            unsafe4 = unsafe2;
                                            if (i45 == 1) {
                                                unsafe8.putObject(obj3, j, Long.valueOf(zzgpv.zzn(bArr, i28)));
                                                iZzg = i28 + 8;
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i28 = i27;
                                            i48 = i48;
                                            this = this;
                                            zzgpuVar2 = zzgpuVar3;
                                            unsafe4 = unsafe2;
                                            if (i45 == 5) {
                                                unsafe8.putObject(obj3, j, Integer.valueOf(zzgpv.zzb(bArr, i28)));
                                                iZzg = i28 + 4;
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 58:
                                            i29 = i38;
                                            i28 = i27;
                                            i48 = i48;
                                            this = this;
                                            zzgpuVar2 = zzgpuVar3;
                                            unsafe4 = unsafe2;
                                            if (i45 == 0) {
                                                i38 = i29;
                                                iZzk = zzgpv.zzk(bArr, i28, zzgpuVar2);
                                                unsafe8.putObject(obj3, j, Boolean.valueOf(zzgpuVar2.zzb != 0));
                                                unsafe8.putInt(obj3, j3, i14);
                                                iZzg = iZzk;
                                                if (iZzg != i28) {
                                                    i2 = i2;
                                                    i3 = i3;
                                                    i37 = i14;
                                                    unsafe4 = unsafe4;
                                                    zzgpuVar7 = zzgpuVar2;
                                                    i41 = i11;
                                                    i40 = i10;
                                                    i39 = i48;
                                                    i36 = -1;
                                                } else {
                                                    i4 = i3;
                                                    i13 = i38;
                                                    i12 = i48;
                                                    i9 = iZzg;
                                                }
                                            }
                                            i38 = i29;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 59:
                                            i29 = i38;
                                            zzgpuVar2 = zzgpuVar3;
                                            i28 = i27;
                                            unsafe4 = unsafe2;
                                            i48 = i48;
                                            this = this;
                                            if (i45 == 2) {
                                                int iZzh13 = zzgpv.zzh(bArr, i28, zzgpuVar2);
                                                int i88 = zzgpuVar2.zza;
                                                if (i88 == 0) {
                                                    unsafe8.putObject(obj3, j, obj4);
                                                } else {
                                                    if ((i46 & DriveFile.MODE_WRITE_ONLY) != 0 && !zzguz.zzj(bArr, iZzh13, iZzh13 + i88)) {
                                                        throw zzgsc.zzd();
                                                    }
                                                    unsafe8.putObject(obj3, j, new String(bArr, iZzh13, i88, zzgsa.zzb));
                                                    iZzh13 += i88;
                                                }
                                                unsafe8.putInt(obj3, j3, i14);
                                                i38 = i29;
                                                iZzg = iZzh13;
                                            } else {
                                                i38 = i29;
                                                iZzg = i28;
                                            }
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 60:
                                            zzgtdVar6 = this;
                                            zzgpuVar4 = zzgpuVar3;
                                            i28 = i27;
                                            if (i45 == 2) {
                                                Object objZzB = zzgtdVar6.zzB(obj3, i14, i38);
                                                i48 = i48;
                                                this = zzgtdVar6;
                                                iZzg = zzgpv.zzm(objZzB, zzgtdVar6.zzx(i38), bArr, i28, i2, zzgpuVar);
                                                this.zzK(obj3, i14, i38, objZzB);
                                                i38 = i38;
                                                i14 = i14;
                                                zzgpuVar2 = zzgpuVar4;
                                                unsafe4 = unsafe2;
                                            } else {
                                                i48 = i48;
                                                this = zzgtdVar6;
                                                zzgpuVar2 = zzgpuVar4;
                                                unsafe4 = unsafe2;
                                                iZzg = i28;
                                            }
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 61:
                                            i28 = i27;
                                            zzgtdVar6 = this;
                                            zzgpuVar4 = zzgpuVar3;
                                            if (i45 == 2) {
                                                iZzg = zzgpv.zza(bArr, i28, zzgpuVar4);
                                                unsafe8.putObject(obj3, j, zzgpuVar4.zzc);
                                                unsafe8.putInt(obj3, j3, i14);
                                                this = zzgtdVar6;
                                                zzgpuVar2 = zzgpuVar4;
                                                unsafe4 = unsafe2;
                                                if (iZzg != i28) {
                                                    i2 = i2;
                                                    i3 = i3;
                                                    i37 = i14;
                                                    unsafe4 = unsafe4;
                                                    zzgpuVar7 = zzgpuVar2;
                                                    i41 = i11;
                                                    i40 = i10;
                                                    i39 = i48;
                                                    i36 = -1;
                                                } else {
                                                    i4 = i3;
                                                    i13 = i38;
                                                    i12 = i48;
                                                    i9 = iZzg;
                                                }
                                            }
                                            i48 = i48;
                                            this = zzgtdVar6;
                                            zzgpuVar2 = zzgpuVar4;
                                            unsafe4 = unsafe2;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 63:
                                            i28 = i27;
                                            zzgtdVar6 = this;
                                            zzgpuVar4 = zzgpuVar3;
                                            if (i45 == 0) {
                                                iZzg = zzgpv.zzh(bArr, i28, zzgpuVar4);
                                                int i89 = zzgpuVar4.zza;
                                                zzgru zzgruVarZzw2 = zzgtdVar6.zzw(i38);
                                                if (zzgruVarZzw2 == null || zzgruVarZzw2.zza(i89)) {
                                                    unsafe8.putObject(obj3, j, Integer.valueOf(i89));
                                                    unsafe8.putInt(obj3, j3, i14);
                                                } else {
                                                    zzd(obj).zzj(i48, Long.valueOf(i89));
                                                }
                                                this = zzgtdVar6;
                                                zzgpuVar2 = zzgpuVar4;
                                                unsafe4 = unsafe2;
                                                if (iZzg != i28) {
                                                    i2 = i2;
                                                    i3 = i3;
                                                    i37 = i14;
                                                    unsafe4 = unsafe4;
                                                    zzgpuVar7 = zzgpuVar2;
                                                    i41 = i11;
                                                    i40 = i10;
                                                    i39 = i48;
                                                    i36 = -1;
                                                } else {
                                                    i4 = i3;
                                                    i13 = i38;
                                                    i12 = i48;
                                                    i9 = iZzg;
                                                }
                                            }
                                            i48 = i48;
                                            this = zzgtdVar6;
                                            zzgpuVar2 = zzgpuVar4;
                                            unsafe4 = unsafe2;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 66:
                                            i28 = i27;
                                            zzgtdVar6 = this;
                                            zzgpuVar4 = zzgpuVar3;
                                            if (i45 == 0) {
                                                iZzg = zzgpv.zzh(bArr, i28, zzgpuVar4);
                                                unsafe8.putObject(obj3, j, Integer.valueOf(zzgqq.zzF(zzgpuVar4.zza)));
                                                unsafe8.putInt(obj3, j3, i14);
                                                this = zzgtdVar6;
                                                zzgpuVar2 = zzgpuVar4;
                                                unsafe4 = unsafe2;
                                                if (iZzg != i28) {
                                                    i2 = i2;
                                                    i3 = i3;
                                                    i37 = i14;
                                                    unsafe4 = unsafe4;
                                                    zzgpuVar7 = zzgpuVar2;
                                                    i41 = i11;
                                                    i40 = i10;
                                                    i39 = i48;
                                                    i36 = -1;
                                                } else {
                                                    i4 = i3;
                                                    i13 = i38;
                                                    i12 = i48;
                                                    i9 = iZzg;
                                                }
                                            }
                                            i48 = i48;
                                            this = zzgtdVar6;
                                            zzgpuVar2 = zzgpuVar4;
                                            unsafe4 = unsafe2;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 67:
                                            i28 = i27;
                                            zzgtdVar6 = this;
                                            zzgpuVar4 = zzgpuVar3;
                                            if (i45 == 0) {
                                                iZzg = zzgpv.zzk(bArr, i28, zzgpuVar4);
                                                unsafe8.putObject(obj3, j, Long.valueOf(zzgqq.zzG(zzgpuVar4.zzb)));
                                                unsafe8.putInt(obj3, j3, i14);
                                                this = zzgtdVar6;
                                                zzgpuVar2 = zzgpuVar4;
                                                unsafe4 = unsafe2;
                                                if (iZzg != i28) {
                                                    i2 = i2;
                                                    i3 = i3;
                                                    i37 = i14;
                                                    unsafe4 = unsafe4;
                                                    zzgpuVar7 = zzgpuVar2;
                                                    i41 = i11;
                                                    i40 = i10;
                                                    i39 = i48;
                                                    i36 = -1;
                                                } else {
                                                    i4 = i3;
                                                    i13 = i38;
                                                    i12 = i48;
                                                    i9 = iZzg;
                                                }
                                            }
                                            i48 = i48;
                                            this = zzgtdVar6;
                                            zzgpuVar2 = zzgpuVar4;
                                            unsafe4 = unsafe2;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                        case 68:
                                            if (i45 == 3) {
                                                zzgtdVar6 = this;
                                                Object objZzB2 = zzgtdVar6.zzB(obj3, i14, i38);
                                                zzgpuVar4 = zzgpuVar3;
                                                int iZzl2 = zzgpv.zzl(objZzB2, zzgtdVar6.zzx(i38), bArr, i27, i2, (i48 & (-8)) | 4, zzgpuVar);
                                                zzgtdVar6.zzK(obj3, i14, i38, objZzB2);
                                                i28 = i27;
                                                iZzg = iZzl2;
                                                this = zzgtdVar6;
                                                zzgpuVar2 = zzgpuVar4;
                                                unsafe4 = unsafe2;
                                                if (iZzg != i28) {
                                                    i2 = i2;
                                                    i3 = i3;
                                                    i37 = i14;
                                                    unsafe4 = unsafe4;
                                                    zzgpuVar7 = zzgpuVar2;
                                                    i41 = i11;
                                                    i40 = i10;
                                                    i39 = i48;
                                                    i36 = -1;
                                                } else {
                                                    i4 = i3;
                                                    i13 = i38;
                                                    i12 = i48;
                                                    i9 = iZzg;
                                                }
                                                break;
                                            }
                                        default:
                                            i48 = i48;
                                            zzgpuVar2 = zzgpuVar3;
                                            i28 = i27;
                                            unsafe4 = unsafe2;
                                            this = this;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                                i2 = i2;
                                                i3 = i3;
                                                i37 = i14;
                                                unsafe4 = unsafe4;
                                                zzgpuVar7 = zzgpuVar2;
                                                i41 = i11;
                                                i40 = i10;
                                                i39 = i48;
                                                i36 = -1;
                                            } else {
                                                i4 = i3;
                                                i13 = i38;
                                                i12 = i48;
                                                i9 = iZzg;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i45 == 2) {
                                        Unsafe unsafe9 = zzb;
                                        Object objZzz = zzgtdVar5.zzz(i38);
                                        Object object = unsafe9.getObject(obj, j);
                                        if (zzgsv.zza(object)) {
                                            zzgsu zzgsuVarZzb = zzgsu.zza().zzb();
                                            zzgsv.zzb(zzgsuVarZzb, object);
                                            unsafe9.putObject(obj, j, zzgsuVarZzb);
                                        }
                                        throw null;
                                    }
                                    obj3 = obj;
                                    i13 = i38;
                                    i12 = i48;
                                    i9 = i27;
                                    unsafe4 = unsafe2;
                                    this = zzgtdVar5;
                                    zzgpuVar2 = zzgpuVar3;
                                    i4 = i3;
                                }
                            }
                        } else if (i45 == 2) {
                            zzgrz zzgrzVarZzd2 = (zzgrz) unsafe5.getObject(obj3, j);
                            if (!zzgrzVarZzd2.zzc()) {
                                int size2 = zzgrzVarZzd2.size();
                                zzgrzVarZzd2 = zzgrzVarZzd2.zzd(size2 == 0 ? 10 : size2 + size2);
                                unsafe5.putObject(obj3, j, zzgrzVarZzd2);
                            }
                            int iZze2 = zzgpv.zze(zzgtdVar8.zzx(iZzs), i48, bArr, i63, i2, zzgrzVarZzd2, zzgpuVar);
                            i3 = i3;
                            zzgpuVar7 = zzgpuVar7;
                            unsafe4 = unsafe5;
                            i2 = i62;
                            i41 = i11;
                            i40 = i10;
                            i36 = -1;
                            i38 = iZzs;
                            i37 = i47;
                            iZzg = iZze2;
                            this = zzgtdVar8;
                            i39 = i48;
                        } else {
                            unsafe2 = unsafe5;
                            i38 = iZzs;
                            zzgpuVar3 = zzgpuVar7;
                            i27 = i63;
                            zzgtdVar5 = zzgtdVar8;
                            i14 = i47;
                            i13 = i38;
                            i12 = i48;
                            i9 = i27;
                            unsafe4 = unsafe2;
                            this = zzgtdVar5;
                            zzgpuVar2 = zzgpuVar3;
                            i4 = i3;
                        }
                    }
                } else {
                    i9 = i42;
                    i10 = i40;
                    i11 = i41;
                    i12 = i8;
                    unsafe4 = unsafe4;
                    zzgpuVar2 = zzgpuVar7;
                    i4 = i3;
                    i13 = 0;
                    i14 = i44;
                }
                if (i12 != i4 || i4 == 0) {
                    if (!this.zzh || (zzgrcVar = zzgpuVar2.zzd) == zzgrc.zza) {
                        iZzg = zzgpv.zzg(i12, bArr, i9, i2, zzd(obj), zzgpuVar);
                    } else {
                        if (zzgrcVar.zzc(this.zzg, i14) != null) {
                            throw null;
                        }
                        iZzg = zzgpv.zzg(i12, bArr, i9, i2, zzd(obj), zzgpuVar);
                    }
                    i3 = i4;
                    i39 = i12;
                    i37 = i14;
                    unsafe4 = unsafe4;
                    i38 = i13;
                    i41 = i11;
                    i40 = i10;
                    i36 = -1;
                    i2 = i2;
                    zzgpuVar7 = zzgpuVar;
                } else {
                    unsafe = unsafe4;
                    i6 = i12;
                    i41 = i11;
                    i40 = i10;
                    i7 = 1048575;
                    i5 = i9;
                }
            } else {
                unsafe = unsafe4;
                i4 = i3;
                i5 = iZzg;
                i6 = i39;
                i7 = 1048575;
            }
        }
        if (i41 != i7) {
            unsafe.putInt(obj3, i41, i40);
        }
        for (int i90 = this.zzk; i90 < this.zzl; i90++) {
            zzy(obj, this.zzj[i90], null, this.zzn, obj);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw zzgsc.zzg();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw zzgsc.zzg();
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final Object zze() {
        return ((zzgrq) this.zzg).zzaD();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgrq) {
                zzgrq zzgrqVar = (zzgrq) obj;
                zzgrqVar.zzaV(Integer.MAX_VALUE);
                zzgrqVar.zza = 0;
                zzgrqVar.zzaT();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int iZzu = zzu(i);
                int i2 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j = i2;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 17:
                                if (zzN(obj, i)) {
                                    zzx(i).zzf(zzb.getObject(obj, j));
                                }
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
                                this.zzm.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzgsu) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zze(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i2 = this.zzc[i];
            long j = 1048575 & iZzu;
            switch (zzt(iZzu)) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzguu.zzr(obj, j, zzguu.zzb(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzguu.zzs(obj, j, zzguu.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        zzguu.zzu(obj, j, zzguu.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        zzguu.zzu(obj, j, zzguu.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        zzguu.zzt(obj, j, zzguu.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        zzguu.zzu(obj, j, zzguu.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        zzguu.zzt(obj, j, zzguu.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        zzguu.zzp(obj, j, zzguu.zzz(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        zzguu.zzv(obj, j, zzguu.zzh(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzguu.zzv(obj, j, zzguu.zzh(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzguu.zzt(obj, j, zzguu.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        zzguu.zzt(obj, j, zzguu.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzguu.zzt(obj, j, zzguu.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzguu.zzu(obj, j, zzguu.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzguu.zzt(obj, j, zzguu.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzguu.zzu(obj, j, zzguu.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i);
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
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzgtv.zza;
                    zzguu.zzv(obj, j, zzgsv.zzb(zzguu.zzh(obj, j), zzguu.zzh(obj2, j)));
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
                        zzguu.zzv(obj, j, zzguu.zzh(obj2, j));
                        zzI(obj, i2, i);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i2, i)) {
                        zzguu.zzv(obj, j, zzguu.zzh(obj2, j));
                        zzI(obj, i2, i);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzgtv.zzq(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x061d A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:153:0x05eb, B:167:0x0618, B:169:0x061d, B:170:0x0622), top: B:195:0x05eb }] */
    /* JADX WARN: Code duplicated, block: B:175:0x062e A[LOOP:3: B:173:0x062a->B:175:0x062e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x0642  */
    /* JADX WARN: Code duplicated, block: B:187:0x0655 A[LOOP:2: B:185:0x0651->B:187:0x0655, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x0669  */
    /* JADX WARN: Code duplicated, block: B:217:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzh(Object obj, zzgtl zzgtlVar, zzgrc zzgrcVar) throws Throwable {
        Object obj2;
        zzguk zzgukVar;
        int i;
        zzguk zzgukVar2;
        Object obj3;
        zzgrd zzgrdVar;
        zzgrc zzgrcVar2;
        int i2;
        Object obj4;
        Object obj5 = obj;
        zzgrc zzgrcVar3 = zzgrcVar;
        zzgrcVar.getClass();
        zzD(obj);
        zzguk zzgukVar3 = this.zzn;
        zzgrd zzgrdVar2 = this.zzo;
        Object objZzy = null;
        zzgrh zzgrhVarZzb = null;
        while (true) {
            try {
                int iZzc = zzgtlVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    zzgukVar = zzgukVar3;
                    obj5 = obj5;
                    try {
                        int iZzu = zzu(iZzq);
                        try {
                            switch (zzt(iZzu)) {
                                case 0:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzr(obj5, iZzu & 1048575, zzgtlVar.zza());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 1:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzs(obj5, iZzu & 1048575, zzgtlVar.zzb());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 2:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzu(obj5, iZzu & 1048575, zzgtlVar.zzl());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 3:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzu(obj5, iZzu & 1048575, zzgtlVar.zzo());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 4:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzt(obj5, iZzu & 1048575, zzgtlVar.zzg());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 5:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzu(obj5, iZzu & 1048575, zzgtlVar.zzk());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 6:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzt(obj5, iZzu & 1048575, zzgtlVar.zzf());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 7:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzp(obj5, iZzu & 1048575, zzgtlVar.zzN());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 8:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzG(obj5, iZzu, zzgtlVar);
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 9:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgta zzgtaVar = (zzgta) zzA(obj5, iZzq);
                                    zzgtlVar.zzu(zzgtaVar, zzx(iZzq), zzgrcVar2);
                                    zzJ(obj5, iZzq, zzgtaVar);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 10:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzv(obj5, iZzu & 1048575, zzgtlVar.zzp());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 11:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzt(obj5, iZzu & 1048575, zzgtlVar.zzj());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 12:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    int iZze = zzgtlVar.zze();
                                    zzgru zzgruVarZzw = zzw(iZzq);
                                    if (zzgruVarZzw != null && !zzgruVarZzw.zza(iZze)) {
                                        objZzy = zzgtv.zzp(obj5, iZzc, iZze, obj4, zzgukVar);
                                        zzgrdVar2 = zzgrdVar;
                                        zzgrcVar3 = zzgrcVar2;
                                        zzgukVar3 = zzgukVar;
                                    }
                                    zzguu.zzt(obj5, iZzu & 1048575, iZze);
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 13:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzt(obj5, iZzu & 1048575, zzgtlVar.zzh());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 14:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzu(obj5, iZzu & 1048575, zzgtlVar.zzm());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 15:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzt(obj5, iZzu & 1048575, zzgtlVar.zzi());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 16:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzguu.zzu(obj5, iZzu & 1048575, zzgtlVar.zzn());
                                    zzH(obj5, iZzq);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 17:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgta zzgtaVar2 = (zzgta) zzA(obj5, iZzq);
                                    zzgtlVar.zzt(zzgtaVar2, zzx(iZzq), zzgrcVar2);
                                    zzJ(obj5, iZzq, zzgtaVar2);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 18:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzx(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 19:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzB(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 20:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzE(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 21:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzM(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 22:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzD(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 23:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzA(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 24:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzz(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 25:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzv(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 26:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    if (zzM(iZzu)) {
                                        ((zzgqr) zzgtlVar).zzK(this.zzm.zza(obj5, iZzu & 1048575), true);
                                    } else {
                                        ((zzgqr) zzgtlVar).zzK(this.zzm.zza(obj5, iZzu & 1048575), false);
                                    }
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 27:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzF(this.zzm.zza(obj5, iZzu & 1048575), zzx(iZzq), zzgrcVar2);
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 28:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzw(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 29:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzL(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 30:
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    List listZza = this.zzm.zza(obj5, iZzu & 1048575);
                                    zzgtlVar.zzy(listZza);
                                    objZzy = zzgtv.zzo(obj, iZzc, listZza, zzw(iZzq), objZzy, zzgukVar);
                                    zzgrdVar2 = zzgrdVar;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 31:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzG(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 32:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzH(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 33:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzI(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 34:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzJ(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 35:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzx(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 36:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzB(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 37:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzE(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 38:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzM(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 39:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzD(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 40:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzA(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 41:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzz(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 42:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzv(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 43:
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgtlVar.zzL(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 44:
                                    List listZza2 = this.zzm.zza(obj5, iZzu & 1048575);
                                    zzgtlVar.zzy(listZza2);
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    objZzy = zzgtv.zzo(obj, iZzc, listZza2, zzw(iZzq), objZzy, zzgukVar);
                                    zzgrdVar2 = zzgrdVar;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 45:
                                    zzgtlVar.zzG(this.zzm.zza(obj5, iZzu & 1048575));
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 46:
                                    zzgtlVar.zzH(this.zzm.zza(obj5, iZzu & 1048575));
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 47:
                                    zzgtlVar.zzI(this.zzm.zza(obj5, iZzu & 1048575));
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 48:
                                    zzgtlVar.zzJ(this.zzm.zza(obj5, iZzu & 1048575));
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 49:
                                    zzgtlVar.zzC(this.zzm.zza(obj5, iZzu & 1048575), zzx(iZzq), zzgrcVar3);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 50:
                                    Object objZzz = zzz(iZzq);
                                    long jZzu = zzu(iZzq) & 1048575;
                                    Object objZzh = zzguu.zzh(obj5, jZzu);
                                    if (objZzh == null) {
                                        objZzh = zzgsu.zza().zzb();
                                        zzguu.zzv(obj5, jZzu, objZzh);
                                    } else if (zzgsv.zza(objZzh)) {
                                        Object objZzb = zzgsu.zza().zzb();
                                        zzgsv.zzb(objZzb, objZzh);
                                        zzguu.zzv(obj5, jZzu, objZzb);
                                        objZzh = objZzb;
                                    }
                                    throw null;
                                case 51:
                                    zzguu.zzv(obj5, iZzu & 1048575, Double.valueOf(zzgtlVar.zza()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 52:
                                    zzguu.zzv(obj5, iZzu & 1048575, Float.valueOf(zzgtlVar.zzb()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 53:
                                    zzguu.zzv(obj5, iZzu & 1048575, Long.valueOf(zzgtlVar.zzl()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 54:
                                    zzguu.zzv(obj5, iZzu & 1048575, Long.valueOf(zzgtlVar.zzo()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 55:
                                    zzguu.zzv(obj5, iZzu & 1048575, Integer.valueOf(zzgtlVar.zzg()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 56:
                                    zzguu.zzv(obj5, iZzu & 1048575, Long.valueOf(zzgtlVar.zzk()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 57:
                                    zzguu.zzv(obj5, iZzu & 1048575, Integer.valueOf(zzgtlVar.zzf()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 58:
                                    zzguu.zzv(obj5, iZzu & 1048575, Boolean.valueOf(zzgtlVar.zzN()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 59:
                                    zzG(obj5, iZzu, zzgtlVar);
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 60:
                                    zzgta zzgtaVar3 = (zzgta) zzB(obj5, iZzc, iZzq);
                                    zzgtlVar.zzu(zzgtaVar3, zzx(iZzq), zzgrcVar3);
                                    zzK(obj5, iZzc, iZzq, zzgtaVar3);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 61:
                                    zzguu.zzv(obj5, iZzu & 1048575, zzgtlVar.zzp());
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 62:
                                    zzguu.zzv(obj5, iZzu & 1048575, Integer.valueOf(zzgtlVar.zzj()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 63:
                                    int iZze2 = zzgtlVar.zze();
                                    zzgru zzgruVarZzw2 = zzw(iZzq);
                                    if (zzgruVarZzw2 == null || zzgruVarZzw2.zza(iZze2)) {
                                        zzguu.zzv(obj5, iZzu & 1048575, Integer.valueOf(iZze2));
                                        zzI(obj5, iZzc, iZzq);
                                        obj4 = objZzy;
                                        zzgrdVar = zzgrdVar2;
                                        zzgrcVar2 = zzgrcVar3;
                                        zzgrdVar2 = zzgrdVar;
                                        objZzy = obj4;
                                        zzgrcVar3 = zzgrcVar2;
                                    } else {
                                        objZzy = zzgtv.zzp(obj5, iZzc, iZze2, objZzy, zzgukVar);
                                        obj5 = obj5;
                                    }
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 64:
                                    zzguu.zzv(obj5, iZzu & 1048575, Integer.valueOf(zzgtlVar.zzh()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 65:
                                    zzguu.zzv(obj5, iZzu & 1048575, Long.valueOf(zzgtlVar.zzm()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 66:
                                    zzguu.zzv(obj5, iZzu & 1048575, Integer.valueOf(zzgtlVar.zzi()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 67:
                                    zzguu.zzv(obj5, iZzu & 1048575, Long.valueOf(zzgtlVar.zzn()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                case 68:
                                    zzgta zzgtaVar4 = (zzgta) zzB(obj5, iZzc, iZzq);
                                    zzgtlVar.zzt(zzgtaVar4, zzx(iZzq), zzgrcVar3);
                                    zzK(obj5, iZzc, iZzq, zzgtaVar4);
                                    obj4 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    zzgrdVar2 = zzgrdVar;
                                    objZzy = obj4;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                                default:
                                    obj2 = objZzy;
                                    zzgrdVar = zzgrdVar2;
                                    zzgrcVar2 = zzgrcVar3;
                                    if (obj2 == null) {
                                        try {
                                            objZzy = zzgukVar.zzc(obj5);
                                        } catch (zzgsb unused) {
                                            objZzy = obj2;
                                            zzgukVar.zzq(zzgtlVar);
                                            if (objZzy == null) {
                                                objZzy = zzgukVar.zzc(obj5);
                                            }
                                            if (!zzgukVar.zzp(objZzy, zzgtlVar)) {
                                                for (i2 = this.zzk; i2 < this.zzl; i2++) {
                                                    objZzy = zzy(obj, this.zzj[i2], objZzy, zzgukVar, obj);
                                                }
                                                if (objZzy != null) {
                                                    zzgukVar.zzn(obj5, objZzy);
                                                    return;
                                                }
                                                return;
                                            }
                                            zzgrdVar2 = zzgrdVar;
                                            zzgrcVar3 = zzgrcVar2;
                                            zzgukVar3 = zzgukVar;
                                        } catch (Throwable th) {
                                            th = th;
                                            objZzy = obj2;
                                        }
                                    } else {
                                        objZzy = obj2;
                                    }
                                    try {
                                        try {
                                            if (!zzgukVar.zzp(objZzy, zzgtlVar)) {
                                                for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                                    objZzy = zzy(obj, this.zzj[i3], objZzy, zzgukVar, obj);
                                                }
                                                if (objZzy != null) {
                                                    zzgukVar.zzn(obj5, objZzy);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (zzgsb unused2) {
                                        zzgukVar.zzq(zzgtlVar);
                                        if (objZzy == null) {
                                            objZzy = zzgukVar.zzc(obj5);
                                        }
                                        if (!zzgukVar.zzp(objZzy, zzgtlVar)) {
                                            while (i2 < this.zzl) {
                                                objZzy = zzy(obj, this.zzj[i2], objZzy, zzgukVar, obj);
                                            }
                                            if (objZzy != null) {
                                                zzgukVar.zzn(obj5, objZzy);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    zzgrdVar2 = zzgrdVar;
                                    zzgrcVar3 = zzgrcVar2;
                                    zzgukVar3 = zzgukVar;
                                    break;
                            }
                        } catch (zzgsb unused3) {
                            obj2 = objZzy;
                            zzgrdVar = zzgrdVar2;
                            zzgrcVar2 = zzgrcVar3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = objZzy;
                    }
                } else {
                    if (iZzc == Integer.MAX_VALUE) {
                        for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                            objZzy = zzy(obj, this.zzj[i4], objZzy, zzgukVar3, obj);
                        }
                        if (objZzy != null) {
                            zzgukVar3.zzn(obj5, objZzy);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objZzc = !this.zzh ? null : zzgrdVar2.zzc(zzgrcVar3, this.zzg, iZzc);
                        if (objZzc != null) {
                            if (zzgrhVarZzb == null) {
                                zzgrhVarZzb = zzgrdVar2.zzb(obj5);
                            }
                            zzgrh zzgrhVar = zzgrhVarZzb;
                            zzgukVar2 = zzgukVar3;
                            obj3 = obj5;
                            try {
                                objZzy = zzgrdVar2.zzd(obj, zzgtlVar, objZzc, zzgrcVar, zzgrhVar, objZzy, zzgukVar2);
                                zzgrhVarZzb = zzgrhVar;
                            } catch (Throwable th4) {
                                th = th4;
                                obj5 = obj3;
                                zzgukVar = zzgukVar2;
                                obj2 = objZzy;
                                objZzy = obj2;
                                for (i = this.zzk; i < this.zzl; i++) {
                                    objZzy = zzy(obj, this.zzj[i], objZzy, zzgukVar, obj);
                                }
                                if (objZzy != null) {
                                    zzgukVar.zzn(obj5, objZzy);
                                }
                                throw th;
                            }
                        } else {
                            zzgukVar2 = zzgukVar3;
                            obj3 = obj5;
                            zzgukVar2.zzq(zzgtlVar);
                            if (objZzy == null) {
                                objZzy = zzgukVar2.zzc(obj3);
                            }
                            try {
                                if (!zzgukVar2.zzp(objZzy, zzgtlVar)) {
                                    int i5 = this.zzk;
                                    while (i5 < this.zzl) {
                                        zzguk zzgukVar4 = zzgukVar2;
                                        objZzy = zzy(obj, this.zzj[i5], objZzy, zzgukVar4, obj);
                                        i5++;
                                        obj3 = obj3;
                                        zzgukVar2 = zzgukVar4;
                                    }
                                    Object obj6 = obj3;
                                    zzguk zzgukVar5 = zzgukVar2;
                                    if (objZzy != null) {
                                        zzgukVar5.zzn(obj6, objZzy);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj5 = obj3;
                                zzgukVar = zzgukVar2;
                            }
                        }
                        obj5 = obj3;
                        zzgukVar3 = zzgukVar2;
                    } catch (Throwable th6) {
                        th = th6;
                        zzgukVar = zzgukVar3;
                        obj5 = obj5;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                obj2 = objZzy;
                zzgukVar = zzgukVar3;
                obj5 = obj5;
            }
            objZzy = obj2;
            while (i < this.zzl) {
                objZzy = zzy(obj, this.zzj[i], objZzy, zzgukVar, obj);
            }
            if (objZzy != null) {
                zzgukVar.zzn(obj5, objZzy);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgpu zzgpuVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzgpuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzs;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzguu.zzb(obj, j)) != Double.doubleToLongBits(zzguu.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzguu.zzc(obj, j)) != Float.floatToIntBits(zzguu.zzc(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzguu.zzf(obj, j) != zzguu.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzguu.zzf(obj, j) != zzguu.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzguu.zzd(obj, j) != zzguu.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzguu.zzf(obj, j) != zzguu.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzguu.zzd(obj, j) != zzguu.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzguu.zzz(obj, j) != zzguu.zzz(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzgtv.zzs(zzguu.zzh(obj, j), zzguu.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzgtv.zzs(zzguu.zzh(obj, j), zzguu.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzgtv.zzs(zzguu.zzh(obj, j), zzguu.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzguu.zzd(obj, j) != zzguu.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzguu.zzd(obj, j) != zzguu.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzguu.zzd(obj, j) != zzguu.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzguu.zzf(obj, j) != zzguu.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzguu.zzd(obj, j) != zzguu.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzguu.zzf(obj, j) != zzguu.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzgtv.zzs(zzguu.zzh(obj, j), zzguu.zzh(obj2, j))) {
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
                    zZzs = zzgtv.zzs(zzguu.zzh(obj, j), zzguu.zzh(obj2, j));
                    break;
                case 50:
                    zZzs = zzgtv.zzs(zzguu.zzh(obj, j), zzguu.zzh(obj2, j));
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
                    long jZzr = zzr(i) & 1048575;
                    if (zzguu.zzd(obj, jZzr) != zzguu.zzd(obj2, jZzr) || !zzgtv.zzs(zzguu.zzh(obj, j), zzguu.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzs) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
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
    @Override // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zzgtt zzgttVarZzx;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int iZzu = zzu(i7);
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
            if ((268435456 & iZzu) != 0 && !zzO(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj, i7, i, i2, i11) && !zzP(obj, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzguu.zzh(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgttVarZzx = zzx(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzgttVarZzx.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj, i8, i7) && !zzP(obj, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzguu.zzh(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzgttVarZzx = zzx(i7);
                    while (i3 < list.size()) {
                        if (!zzgttVarZzx.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzgsu) zzguu.zzh(obj, iZzu & 1048575)).isEmpty()) {
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

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzm(Object obj, zzgqy zzgqyVar) throws IOException {
        int i;
        int i2;
        int i3;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < length) {
            int iZzu = zzu(i7);
            int[] iArr = this.zzc;
            int i8 = iArr[i7];
            int iZzt = zzt(iZzu);
            if (iZzt <= 17) {
                int i9 = iArr[i7 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = iZzu & i4;
            switch (iZzt) {
                case 0:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzf(i8, zzguu.zzb(obj, j));
                    }
                    break;
                case 1:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzo(i8, zzguu.zzc(obj, j));
                    }
                    break;
                case 2:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzt(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzJ(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzr(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzm(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzk(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzb(i8, zzguu.zzz(obj, j));
                    }
                    break;
                case 8:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzT(i8, unsafe.getObject(obj, j), zzgqyVar);
                    }
                    break;
                case 9:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzv(i8, unsafe.getObject(obj, j), zzx(i7));
                    }
                    break;
                case 10:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzd(i8, (zzgqi) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzH(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzi(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzw(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzy(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzA(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 16:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzC(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 17:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgqyVar.zzq(i8, unsafe.getObject(obj, j), zzx(i7));
                    }
                    break;
                case 18:
                    zzgtv.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 19:
                    zzgtv.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 20:
                    zzgtv.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 21:
                    zzgtv.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 22:
                    zzgtv.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 23:
                    zzgtv.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 24:
                    zzgtv.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 25:
                    zzgtv.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 26:
                    int i11 = this.zzc[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzgtv.zza;
                    if (list != null && !list.isEmpty()) {
                        zzgqyVar.zzG(i11, list);
                    }
                    break;
                case 27:
                    int i13 = this.zzc[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzgtt zzgttVarZzx = zzx(i7);
                    int i14 = zzgtv.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            zzgqyVar.zzv(i13, list2.get(i15), zzgttVarZzx);
                        }
                    }
                    break;
                case 28:
                    int i16 = this.zzc[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzgtv.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzgqyVar.zze(i16, list3);
                    }
                    break;
                case 29:
                    zzgtv.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 30:
                    zzgtv.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 31:
                    zzgtv.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 32:
                    zzgtv.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 33:
                    zzgtv.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 34:
                    zzgtv.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, false);
                    break;
                case 35:
                    zzgtv.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 36:
                    zzgtv.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 37:
                    zzgtv.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 38:
                    zzgtv.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 39:
                    zzgtv.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 40:
                    zzgtv.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 41:
                    zzgtv.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 42:
                    zzgtv.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 43:
                    zzgtv.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 44:
                    zzgtv.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 45:
                    zzgtv.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 46:
                    zzgtv.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 47:
                    zzgtv.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 48:
                    zzgtv.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgqyVar, true);
                    break;
                case 49:
                    int i18 = this.zzc[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzgtt zzgttVarZzx2 = zzx(i7);
                    int i19 = zzgtv.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            zzgqyVar.zzq(i18, list4.get(i20), zzgttVarZzx2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzf(i8, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzo(i8, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzt(i8, zzv(obj, j));
                    }
                    break;
                case 54:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzJ(i8, zzv(obj, j));
                    }
                    break;
                case 55:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzr(i8, zzp(obj, j));
                    }
                    break;
                case 56:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzm(i8, zzv(obj, j));
                    }
                    break;
                case 57:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzk(i8, zzp(obj, j));
                    }
                    break;
                case 58:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzb(i8, zzS(obj, j));
                    }
                    break;
                case 59:
                    if (zzR(obj, i8, i7)) {
                        zzT(i8, unsafe.getObject(obj, j), zzgqyVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzv(i8, unsafe.getObject(obj, j), zzx(i7));
                    }
                    break;
                case 61:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzd(i8, (zzgqi) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzH(i8, zzp(obj, j));
                    }
                    break;
                case 63:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzi(i8, zzp(obj, j));
                    }
                    break;
                case 64:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzw(i8, zzp(obj, j));
                    }
                    break;
                case 65:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzy(i8, zzv(obj, j));
                    }
                    break;
                case 66:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzA(i8, zzp(obj, j));
                    }
                    break;
                case 67:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzC(i8, zzv(obj, j));
                    }
                    break;
                case 68:
                    if (zzR(obj, i8, i7)) {
                        zzgqyVar.zzq(i8, unsafe.getObject(obj, j), zzx(i7));
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        zzguk zzgukVar = this.zzn;
        zzgukVar.zzr(zzgukVar.zzd(obj), zzgqyVar);
    }
}
