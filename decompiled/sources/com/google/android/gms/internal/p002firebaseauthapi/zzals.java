package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.drive.DriveFile;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzals<T> implements zzamb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanf.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzalp zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzald zzm;
    private final zzamv zzn;
    private final zzajy zzo;
    private final zzalu zzp;
    private final zzalk zzq;

    private zzals(int[] iArr, Object[] objArr, int i, int i2, zzalp zzalpVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzalu zzaluVar, zzald zzaldVar, zzamv zzamvVar, zzajy zzajyVar, zzalk zzalkVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzalpVar instanceof zzakk;
        boolean z2 = false;
        if (zzajyVar != null && zzajyVar.zzh(zzalpVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzaluVar;
        this.zzm = zzaldVar;
        this.zzn = zzamvVar;
        this.zzo = zzajyVar;
        this.zzg = zzalpVar;
        this.zzq = zzalkVar;
    }

    private final Object zzA(Object obj, int i) {
        zzamb zzambVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzambVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzambVarZzx.zze();
        if (object != null) {
            zzambVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzamb zzambVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzambVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzambVarZzx.zze();
        if (object != null) {
            zzambVarZzx.zzg(objZze, object);
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
            zzamb zzambVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzambVarZzx.zze();
                    zzambVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzambVarZzx.zze();
                zzambVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzambVarZzx.zzg(object2, object);
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
            zzamb zzambVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzambVarZzx.zze();
                    zzambVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzambVarZzx.zze();
                zzambVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzambVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzama zzamaVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzanf.zzs(obj, j, zzamaVar.zzs());
        } else if (this.zzi) {
            zzanf.zzs(obj, j, zzamaVar.zzr());
        } else {
            zzanf.zzs(obj, j, zzamaVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzanf.zzq(obj, j, (1 << (iZzr >>> 20)) | zzanf.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzanf.zzq(obj, zzr(i2) & 1048575, i);
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
            return (zzanf.zzc(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzanf.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanf.zzb(obj, j2)) != 0;
            case 2:
                return zzanf.zzd(obj, j2) != 0;
            case 3:
                return zzanf.zzd(obj, j2) != 0;
            case 4:
                return zzanf.zzc(obj, j2) != 0;
            case 5:
                return zzanf.zzd(obj, j2) != 0;
            case 6:
                return zzanf.zzc(obj, j2) != 0;
            case 7:
                return zzanf.zzw(obj, j2);
            case 8:
                Object objZzf = zzanf.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzajf) {
                    return !zzajf.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzanf.zzf(obj, j2) != null;
            case 10:
                return !zzajf.zzb.equals(zzanf.zzf(obj, j2));
            case 11:
                return zzanf.zzc(obj, j2) != 0;
            case 12:
                return zzanf.zzc(obj, j2) != 0;
            case 13:
                return zzanf.zzc(obj, j2) != 0;
            case 14:
                return zzanf.zzd(obj, j2) != 0;
            case 15:
                return zzanf.zzc(obj, j2) != 0;
            case 16:
                return zzanf.zzd(obj, j2) != 0;
            case 17:
                return zzanf.zzf(obj, j2) != null;
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

    private static boolean zzP(Object obj, int i, zzamb zzambVar) {
        return zzambVar.zzk(zzanf.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzakk) {
            return ((zzakk) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzanf.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzanf.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzajt zzajtVar) throws IOException {
        if (obj instanceof String) {
            zzajtVar.zzF(i, (String) obj);
        } else {
            zzajtVar.zzd(i, (zzajf) obj);
        }
    }

    static zzamw zzd(Object obj) {
        zzakk zzakkVar = (zzakk) obj;
        zzamw zzamwVar = zzakkVar.zzc;
        if (zzamwVar != zzamw.zzc()) {
            return zzamwVar;
        }
        zzamw zzamwVarZzf = zzamw.zzf();
        zzakkVar.zzc = zzamwVarZzf;
        return zzamwVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0264  */
    /* JADX WARN: Code duplicated, block: B:126:0x0267  */
    /* JADX WARN: Code duplicated, block: B:129:0x027e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0281  */
    static zzals zzl(Class cls, zzalm zzalmVar, zzalu zzaluVar, zzald zzaldVar, zzamv zzamvVar, zzajy zzajyVar, zzalk zzalkVar) {
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
        int iObjectFieldOffset;
        int i17;
        int i18;
        int iObjectFieldOffset2;
        Field fieldZzC;
        char cCharAt9;
        int i19;
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
        if (!(zzalmVar instanceof zzalz)) {
            throw null;
        }
        zzalz zzalzVar = (zzalz) zzalmVar;
        String strZzd = zzalzVar.zzd();
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
        Object[] objArrZze = zzalzVar.zze();
        Class<?> cls2 = zzalzVar.zza().getClass();
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
            int i71 = iCharAt11 & 2048;
            int i72 = length;
            if (i70 >= 51) {
                int i73 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i74 = 13;
                    int i75 = iCharAt12 & 8191;
                    int i76 = i73;
                    while (true) {
                        i24 = i76 + 1;
                        cCharAt10 = strZzd.charAt(i76);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i75 |= (cCharAt10 & 8191) << i74;
                        i74 += 13;
                        i76 = i24;
                        c2 = 55296;
                    }
                    iCharAt12 = i75 | (cCharAt10 << i74);
                    i20 = i24;
                } else {
                    i20 = i73;
                }
                int i77 = i20;
                int i78 = i70 - 51;
                if (i78 == 9 || i78 == 17) {
                    i21 = i2 + 1;
                    int i79 = i61 / 3;
                    objArr[i79 + i79 + 1] = objArrZze[i2];
                } else {
                    if (i78 == 12) {
                        if (zzalzVar.zzc() == 1 || i71 != 0) {
                            i21 = i2 + 1;
                            int i80 = i61 / 3;
                            objArr[i80 + i80 + 1] = objArrZze[i2];
                        } else {
                            i71 = 0;
                        }
                    }
                    i22 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i22];
                    if (obj instanceof Field) {
                        fieldZzC2 = (Field) obj;
                    } else {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i22] = fieldZzC2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                    i23 = i22 + 1;
                    obj2 = objArrZze[i23];
                    if (obj2 instanceof Field) {
                        fieldZzC3 = (Field) obj2;
                    } else {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i23] = fieldZzC3;
                    }
                    strZzd = strZzd;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                    i17 = i77;
                    i18 = 0;
                    zzalzVar = zzalzVar;
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
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                i23 = i22 + 1;
                obj2 = objArrZze[i23];
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i23] = fieldZzC3;
                }
                strZzd = strZzd;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                i17 = i77;
                i18 = 0;
                zzalzVar = zzalzVar;
            } else {
                int i81 = i2 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i2]);
                if (i70 == 9 || i70 == 17) {
                    zzalzVar = zzalzVar;
                    int i82 = i61 / 3;
                    objArr[i82 + i82 + 1] = fieldZzC4.getType();
                } else if (i70 == 27 || i70 == 49) {
                    i19 = i81 + 1;
                    int i83 = i61 / 3;
                    objArr[i83 + i83 + 1] = objArrZze[i81];
                    i81 = i19;
                } else if (i70 == 12 || i70 == 30 || i70 == 44) {
                    zzalzVar = zzalzVar;
                    if (zzalzVar.zzc() == 1 || i71 != 0) {
                        i19 = i81 + 1;
                        int i84 = i61 / 3;
                        objArr[i84 + i84 + 1] = objArrZze[i81];
                        i81 = i19;
                    } else {
                        i71 = 0;
                    }
                } else {
                    if (i70 == 50) {
                        int i85 = i81 + 1;
                        int i86 = i58 + 1;
                        iArr[i58] = i61;
                        int i87 = i61 / 3;
                        int i88 = i87 + i87;
                        objArr[i88] = objArrZze[i81];
                        if (i71 != 0) {
                            i81 = i85 + 1;
                            objArr[i88 + 1] = objArrZze[i85];
                            i58 = i86;
                        } else {
                            i81 = i85;
                            i58 = i86;
                            i71 = 0;
                        }
                    }
                    zzalzVar = zzalzVar;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i70 > 17) {
                    i17 = i16;
                    i18 = 0;
                } else {
                    int i89 = i16 + 1;
                    int iCharAt13 = strZzd.charAt(i16);
                    if (iCharAt13 >= 55296) {
                        int i90 = iCharAt13 & 8191;
                        int i91 = 13;
                        while (true) {
                            i17 = i89 + 1;
                            cCharAt9 = strZzd.charAt(i89);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i90 |= (cCharAt9 & 8191) << i91;
                            i91 += 13;
                            i89 = i17;
                        }
                        iCharAt13 = i90 | (cCharAt9 << i91);
                    } else {
                        i17 = i89;
                    }
                    int i92 = i5 + i5 + (iCharAt13 / 32);
                    Object obj3 = objArrZze[i92];
                    if (obj3 instanceof Field) {
                        fieldZzC = (Field) obj3;
                    } else {
                        fieldZzC = zzC(cls2, (String) obj3);
                        objArrZze[i92] = fieldZzC;
                    }
                    i18 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC);
                }
                if (i70 >= 18 && i70 <= 49) {
                    iArr[i59] = iObjectFieldOffset3;
                    i59++;
                }
                i2 = i81;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i93 = i61 + 1;
            iArr2[i61] = iCharAt10;
            int i94 = i93 + 1;
            iArr2[i93] = iObjectFieldOffset2 | ((iCharAt11 & 256) != 0 ? DriveFile.MODE_READ_ONLY : 0) | ((iCharAt11 & 512) != 0 ? DriveFile.MODE_WRITE_ONLY : 0) | (i71 != 0 ? Integer.MIN_VALUE : 0) | (i70 << 20);
            i61 = i94 + 1;
            iArr2[i94] = (i18 << 20) | iObjectFieldOffset;
            i29 = i17;
            length = i72;
            zzalzVar = zzalzVar;
            strZzd = strZzd;
            i6 = i6;
            i3 = i3;
            c = 55296;
        }
        zzalz zzalzVar2 = zzalzVar;
        return new zzals(iArr2, objArr, i3, i6, zzalzVar2.zza(), zzalzVar2.zzc(), false, iArr, i4, i56, zzaluVar, zzaldVar, zzamvVar, zzajyVar, zzalkVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzanf.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzanf.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzanf.zzf(obj, j)).intValue();
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
        return ((Long) zzanf.zzf(obj, j)).longValue();
    }

    private final zzako zzw(int i) {
        int i2 = i / 3;
        return (zzako) this.zzd[i2 + i2 + 1];
    }

    private final zzamb zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzamb zzambVar = (zzamb) objArr[i3];
        if (zzambVar != null) {
            return zzambVar;
        }
        zzamb zzambVarZzb = zzalx.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzambVarZzb;
        return zzambVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzamv zzamvVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzf = zzanf.zzf(obj, zzu(i) & 1048575);
        if (objZzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0391  */
    /* JADX WARN: Code duplicated, block: B:207:0x0558  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
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
        int iZzg;
        int size;
        int iZzA7;
        int iZzA8;
        int iZzA9;
        int iZze;
        int iZzA10;
        int iZzA11;
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
            if (iZzt >= zzakd.DOUBLE_LIST_PACKED.zza()) {
                zzakd.SINT64_LIST_PACKED.zza();
            }
            long j = i12;
            switch (iZzt) {
                case 0:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzA = zzajs.zzA(i9 << 3);
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
                        iZzA2 = zzajs.zzA(i9 << 3);
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
                        iZzB = zzajs.zzB(unsafe.getLong(obj, j));
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 3:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzB = zzajs.zzB(unsafe.getLong(obj, j));
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 4:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzB = zzajs.zzx(unsafe.getInt(obj, j));
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 5:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzA = zzajs.zzA(i9 << 3);
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
                        iZzA2 = zzajs.zzA(i9 << 3);
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
                        iZzA4 = zzajs.zzA(i9 << 3);
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
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzajf) {
                            int i14 = zzajs.zzf;
                            int iZzd = ((zzajf) object).zzd();
                            iZzA5 = zzajs.zzA(iZzd) + iZzd;
                            iZzA6 = zzajs.zzA(i13);
                            iZzh = iZzA6 + iZzA5;
                            i8 += iZzh;
                        } else {
                            iZzB = zzajs.zzz((String) object);
                            iZzA3 = zzajs.zzA(i13);
                            iZzh = iZzA3 + iZzB;
                            i8 += iZzh;
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
                        iZzh = zzamd.zzh(i9, unsafe.getObject(obj, j), zzx(i7));
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
                        zzajf zzajfVar = (zzajf) unsafe.getObject(obj, j);
                        int i15 = zzajs.zzf;
                        int iZzd2 = zzajfVar.zzd();
                        iZzA5 = zzajs.zzA(iZzd2) + iZzd2;
                        iZzA6 = zzajs.zzA(i9 << 3);
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
                        iZzB = zzajs.zzA(unsafe.getInt(obj, j));
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 12:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzB = zzajs.zzx(unsafe.getInt(obj, j));
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 13:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzA2 = zzajs.zzA(i9 << 3);
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
                        iZzA = zzajs.zzA(i9 << 3);
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
                        int i16 = unsafe.getInt(obj, j);
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzB = zzajs.zzA((i16 >> 31) ^ (i16 + i16));
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
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
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzB = zzajs.zzB((j2 >> 63) ^ (j2 + j2));
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 17:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzh = zzajs.zzw(i9, (zzalp) unsafe.getObject(obj, j), zzx(i7));
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 18:
                    iZzh = zzamd.zzd(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 19:
                    iZzh = zzamd.zzb(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzamd.zza;
                    if (list.size() == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzamd.zzg(list) + (list.size() * zzajs.zzA(i9 << 3));
                    }
                    i8 += iZzg;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i18 = zzamd.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzA3 = zzamd.zzl(list2);
                        iZzA7 = zzajs.zzA(i9 << 3);
                        iZzB = size * iZzA7;
                        iZzh = iZzA3 + iZzB;
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
                    int i19 = zzamd.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzA3 = zzamd.zzf(list3);
                        iZzA7 = zzajs.zzA(i9 << 3);
                        iZzB = size * iZzA7;
                        iZzh = iZzA3 + iZzB;
                    }
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 23:
                    iZzh = zzamd.zzd(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 24:
                    iZzh = zzamd.zzb(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i20 = zzamd.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = size2 * (zzajs.zzA(i9 << 3) + 1);
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
                    int i21 = zzamd.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzg = 0;
                    } else {
                        boolean z2 = list5 instanceof zzakx;
                        iZzg = zzajs.zzA(i9 << 3) * size3;
                        if (z2) {
                            zzakx zzakxVar = (zzakx) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object objZzf = zzakxVar.zzf(i22);
                                if (objZzf instanceof zzajf) {
                                    int iZzd3 = ((zzajf) objZzf).zzd();
                                    iZzg += zzajs.zzA(iZzd3) + iZzd3;
                                } else {
                                    iZzg += zzajs.zzz((String) objZzf);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj2 = list5.get(i23);
                                if (obj2 instanceof zzajf) {
                                    int iZzd4 = ((zzajf) obj2).zzd();
                                    iZzg += zzajs.zzA(iZzd4) + iZzd4;
                                } else {
                                    iZzg += zzajs.zzz((String) obj2);
                                }
                            }
                        }
                    }
                    i8 += iZzg;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzamb zzambVarZzx = zzx(i7);
                    int i24 = zzamd.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzA8 = 0;
                    } else {
                        iZzA8 = zzajs.zzA(i9 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj3 = list6.get(i25);
                            if (obj3 instanceof zzakv) {
                                int iZza = ((zzakv) obj3).zza();
                                iZzA8 += zzajs.zzA(iZza) + iZza;
                            } else {
                                iZzA8 += zzajs.zzy((zzalp) obj3, zzambVarZzx);
                            }
                        }
                    }
                    i8 += iZzA8;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i26 = zzamd.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzA9 = 0;
                    } else {
                        iZzA9 = size5 * zzajs.zzA(i9 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int iZzd5 = ((zzajf) list7.get(i27)).zzd();
                            iZzA9 += zzajs.zzA(iZzd5) + iZzd5;
                        }
                    }
                    i8 += iZzA9;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i28 = zzamd.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzA3 = zzamd.zzk(list8);
                        iZzA7 = zzajs.zzA(i9 << 3);
                        iZzB = size * iZzA7;
                        iZzh = iZzA3 + iZzB;
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
                    int i29 = zzamd.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzA3 = zzamd.zza(list9);
                        iZzA7 = zzajs.zzA(i9 << 3);
                        iZzB = size * iZzA7;
                        iZzh = iZzA3 + iZzB;
                    }
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 31:
                    iZzh = zzamd.zzb(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 32:
                    iZzh = zzamd.zzd(i9, (List) unsafe.getObject(obj, j), z);
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i30 = zzamd.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzA3 = zzamd.zzi(list10);
                        iZzA7 = zzajs.zzA(i9 << 3);
                        iZzB = size * iZzA7;
                        iZzh = iZzA3 + iZzB;
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
                    int i31 = zzamd.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzA3 = zzamd.zzj(list11);
                        iZzA7 = zzajs.zzA(i9 << 3);
                        iZzB = size * iZzA7;
                        iZzh = iZzA3 + iZzB;
                    }
                    i8 += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 35:
                    iZze = zzamd.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 36:
                    iZze = zzamd.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 37:
                    iZze = zzamd.zzg((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 38:
                    iZze = zzamd.zzl((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 39:
                    iZze = zzamd.zzf((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 40:
                    iZze = zzamd.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 41:
                    iZze = zzamd.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i32 = zzamd.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 43:
                    iZze = zzamd.zzk((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 44:
                    iZze = zzamd.zza((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 45:
                    iZze = zzamd.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 46:
                    iZze = zzamd.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 47:
                    iZze = zzamd.zzi((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 48:
                    iZze = zzamd.zzj((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzajs.zzA(iZze);
                        iZzA11 = zzajs.zzA(i9 << 3);
                        iZzA9 = iZzA11 + iZzA10 + iZze;
                        i8 += iZzA9;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzamb zzambVarZzx2 = zzx(i7);
                    int i33 = zzamd.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzw = 0;
                    } else {
                        iZzw = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            iZzw += zzajs.zzw(i9, (zzalp) list13.get(i34), zzambVarZzx2);
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
                    zzalj zzaljVar = (zzalj) unsafe.getObject(obj, j);
                    if (zzaljVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzaljVar.entrySet().iterator();
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
                        iZzA = zzajs.zzA(i9 << 3);
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
                        iZzA2 = zzajs.zzA(i9 << 3);
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
                        iZzB = zzajs.zzB(zzv(obj, j));
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 54:
                    if (zzR(obj, i9, i7)) {
                        iZzB = zzajs.zzB(zzv(obj, j));
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 55:
                    if (zzR(obj, i9, i7)) {
                        iZzB = zzajs.zzx(zzp(obj, j));
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 56:
                    if (zzR(obj, i9, i7)) {
                        iZzA = zzajs.zzA(i9 << 3);
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
                        iZzA2 = zzajs.zzA(i9 << 3);
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
                        iZzA4 = zzajs.zzA(i9 << 3);
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
                        int i35 = i9 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzajf) {
                            int i36 = zzajs.zzf;
                            int iZzd6 = ((zzajf) object2).zzd();
                            iZzA5 = zzajs.zzA(iZzd6) + iZzd6;
                            iZzA6 = zzajs.zzA(i35);
                            iZzh = iZzA6 + iZzA5;
                            i8 += iZzh;
                        } else {
                            iZzB = zzajs.zzz((String) object2);
                            iZzA3 = zzajs.zzA(i35);
                            iZzh = iZzA3 + iZzB;
                            i8 += iZzh;
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
                        iZzh = zzamd.zzh(i9, unsafe.getObject(obj, j), zzx(i7));
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
                        zzajf zzajfVar2 = (zzajf) unsafe.getObject(obj, j);
                        int i37 = zzajs.zzf;
                        int iZzd7 = zzajfVar2.zzd();
                        iZzA5 = zzajs.zzA(iZzd7) + iZzd7;
                        iZzA6 = zzajs.zzA(i9 << 3);
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
                        iZzB = zzajs.zzA(zzp(obj, j));
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 63:
                    if (zzR(obj, i9, i7)) {
                        iZzB = zzajs.zzx(zzp(obj, j));
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 64:
                    if (zzR(obj, i9, i7)) {
                        iZzA2 = zzajs.zzA(i9 << 3);
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
                        iZzA = zzajs.zzA(i9 << 3);
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
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzB = zzajs.zzA((iZzp >> 31) ^ (iZzp + iZzp));
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
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
                        iZzA3 = zzajs.zzA(i9 << 3);
                        iZzB = zzajs.zzB((jZzv >> 63) ^ (jZzv + jZzv));
                        iZzh = iZzA3 + iZzB;
                        i8 += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 68:
                    if (zzR(obj, i9, i7)) {
                        iZzh = zzajs.zzw(i9, (zzalp) unsafe.getObject(obj, j), zzx(i7));
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
        zzamv zzamvVar = this.zzn;
        int iZza2 = i8 + zzamvVar.zza(zzamvVar.zzd(obj));
        if (!this.zzh) {
            return iZza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i7 = iArr[i5];
            long j = i6;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzanf.zza(obj, j));
                    byte[] bArr = zzakq.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzanf.zzb(obj, j));
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = zzanf.zzd(obj, j);
                    byte[] bArr2 = zzakq.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = zzanf.zzd(obj, j);
                    byte[] bArr3 = zzakq.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzanf.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = zzanf.zzd(obj, j);
                    byte[] bArr4 = zzakq.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzanf.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzakq.zza(zzanf.zzw(obj, j));
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iFloatToIntBits = ((String) zzanf.zzf(obj, j)).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object objZzf = zzanf.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i4 = i3 + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzanf.zzf(obj, j).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzanf.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzanf.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzanf.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = zzanf.zzd(obj, j);
                    byte[] bArr5 = zzakq.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzanf.zzc(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = zzanf.zzd(obj, j);
                    byte[] bArr6 = zzakq.zzd;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object objZzf2 = zzanf.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i4 = i3 + iHashCode;
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
                    i2 = i4 * 53;
                    iFloatToIntBits = zzanf.zzf(obj, j).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzanf.zzf(obj, j).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzakq.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzakq.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzakq.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzakq.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzakq.zza(zzS(obj, j));
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = ((String) zzanf.zzf(obj, j)).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzanf.zzf(obj, j).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzanf.zzf(obj, j).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzakq.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzakq.zzd;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzanf.zzf(obj, j).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i4 * 53) + this.zzn.zzd(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:380:0x0830 A[PHI: r7 r8 r9 r10 r11 r14
  0x0830: PHI (r7v30 int) = (r7v12 int), (r7v14 int), (r7v15 int), (r7v20 int), (r7v24 int), (r7v28 int), (r7v34 int) binds: [B:369:0x07e7, B:353:0x0791, B:337:0x0742, B:262:0x05f1, B:213:0x0526, B:180:0x0494, B:139:0x038f] A[DONT_GENERATE, DONT_INLINE]
  0x0830: PHI (r8v118 int) = (r8v63 int), (r8v65 int), (r8v66 int), (r8v93 int), (r8v109 int), (r8v116 int), (r8v121 int) binds: [B:369:0x07e7, B:353:0x0791, B:337:0x0742, B:262:0x05f1, B:213:0x0526, B:180:0x0494, B:139:0x038f] A[DONT_GENERATE, DONT_INLINE]
  0x0830: PHI (r9v72 int) = (r9v45 int), (r9v47 int), (r9v48 int), (r9v60 int), (r9v68 int), (r9v70 int), (r9v75 int) binds: [B:369:0x07e7, B:353:0x0791, B:337:0x0742, B:262:0x05f1, B:213:0x0526, B:180:0x0494, B:139:0x038f] A[DONT_GENERATE, DONT_INLINE]
  0x0830: PHI (r10v97 int) = (r10v63 int), (r10v65 int), (r10v66 int), (r10v70 int), (r10v82 int), (r10v89 int), (r10v101 int) binds: [B:369:0x07e7, B:353:0x0791, B:337:0x0742, B:262:0x05f1, B:213:0x0526, B:180:0x0494, B:139:0x038f] A[DONT_GENERATE, DONT_INLINE]
  0x0830: PHI (r11v64 int) = (r11v41 int), (r11v43 int), (r11v44 int), (r11v47 int), (r11v56 int), (r11v62 int), (r11v68 int) binds: [B:369:0x07e7, B:353:0x0791, B:337:0x0742, B:262:0x05f1, B:213:0x0526, B:180:0x0494, B:139:0x038f] A[DONT_GENERATE, DONT_INLINE]
  0x0830: PHI (r14v48 sun.misc.Unsafe) = 
  (r14v27 sun.misc.Unsafe)
  (r14v29 sun.misc.Unsafe)
  (r14v30 sun.misc.Unsafe)
  (r14v32 sun.misc.Unsafe)
  (r14v40 sun.misc.Unsafe)
  (r14v46 sun.misc.Unsafe)
  (r14v51 sun.misc.Unsafe)
 binds: [B:369:0x07e7, B:353:0x0791, B:337:0x0742, B:262:0x05f1, B:213:0x0526, B:180:0x0494, B:139:0x038f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:466:0x0adc A[PHI: r8 r10 r11 r12 r36
  0x0adc: PHI (r8v58 com.google.android.gms.internal.firebase-auth-api.zzais) = 
  (r8v39 com.google.android.gms.internal.firebase-auth-api.zzais)
  (r8v40 com.google.android.gms.internal.firebase-auth-api.zzais)
  (r8v41 com.google.android.gms.internal.firebase-auth-api.zzais)
  (r8v42 com.google.android.gms.internal.firebase-auth-api.zzais)
  (r8v43 com.google.android.gms.internal.firebase-auth-api.zzais)
  (r8v44 com.google.android.gms.internal.firebase-auth-api.zzais)
  (r8v45 com.google.android.gms.internal.firebase-auth-api.zzais)
  (r8v46 com.google.android.gms.internal.firebase-auth-api.zzais)
  (r8v47 com.google.android.gms.internal.firebase-auth-api.zzais)
  (r8v51 com.google.android.gms.internal.firebase-auth-api.zzais)
  (r8v59 com.google.android.gms.internal.firebase-auth-api.zzais)
 binds: [B:464:0x0ac5, B:461:0x0aa3, B:458:0x0a85, B:455:0x0a67, B:452:0x0a49, B:449:0x0a2a, B:442:0x0a02, B:440:0x09f4, B:425:0x09a9, B:421:0x0976, B:397:0x08a1] A[DONT_GENERATE, DONT_INLINE]
  0x0adc: PHI (r10v60 int) = 
  (r10v40 int)
  (r10v41 int)
  (r10v42 int)
  (r10v43 int)
  (r10v44 int)
  (r10v45 int)
  (r10v46 int)
  (r10v47 int)
  (r10v48 int)
  (r10v54 int)
  (r10v61 int)
 binds: [B:464:0x0ac5, B:461:0x0aa3, B:458:0x0a85, B:455:0x0a67, B:452:0x0a49, B:449:0x0a2a, B:442:0x0a02, B:440:0x09f4, B:425:0x09a9, B:421:0x0976, B:397:0x08a1] A[DONT_GENERATE, DONT_INLINE]
  0x0adc: PHI (r11v39 int) = 
  (r11v23 int)
  (r11v24 int)
  (r11v25 int)
  (r11v26 int)
  (r11v27 int)
  (r11v28 int)
  (r11v29 int)
  (r11v30 int)
  (r11v31 int)
  (r11v34 int)
  (r11v40 int)
 binds: [B:464:0x0ac5, B:461:0x0aa3, B:458:0x0a85, B:455:0x0a67, B:452:0x0a49, B:449:0x0a2a, B:442:0x0a02, B:440:0x09f4, B:425:0x09a9, B:421:0x0976, B:397:0x08a1] A[DONT_GENERATE, DONT_INLINE]
  0x0adc: PHI (r12v33 int) = 
  (r12v14 int)
  (r12v15 int)
  (r12v16 int)
  (r12v17 int)
  (r12v18 int)
  (r12v19 int)
  (r12v20 int)
  (r12v21 int)
  (r12v22 int)
  (r12v26 int)
  (r12v34 int)
 binds: [B:464:0x0ac5, B:461:0x0aa3, B:458:0x0a85, B:455:0x0a67, B:452:0x0a49, B:449:0x0a2a, B:442:0x0a02, B:440:0x09f4, B:425:0x09a9, B:421:0x0976, B:397:0x08a1] A[DONT_GENERATE, DONT_INLINE]
  0x0adc: PHI (r36v21 int) = 
  (r36v3 int)
  (r36v4 int)
  (r36v5 int)
  (r36v6 int)
  (r36v7 int)
  (r36v8 int)
  (r36v9 int)
  (r36v10 int)
  (r36v14 int)
  (r36v16 int)
  (r36v22 int)
 binds: [B:464:0x0ac5, B:461:0x0aa3, B:458:0x0a85, B:455:0x0a67, B:452:0x0a49, B:449:0x0a2a, B:442:0x0a02, B:440:0x09f4, B:425:0x09a9, B:421:0x0976, B:397:0x08a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:468:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:469:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:529:0x0833 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0843 A[SYNTHETIC] */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzais zzaisVar) throws IOException {
        zzals<T> zzalsVar;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Unsafe unsafe2;
        zzais zzaisVar2;
        int i13;
        int i14;
        int i15;
        zzajx zzajxVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int iZzk;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Unsafe unsafe3;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Unsafe unsafe4;
        int i38;
        int iZzf;
        Object obj2;
        int i39;
        int iZzj;
        zzals<T> zzalsVar2 = this;
        Object obj3 = obj;
        i2 = i2;
        i3 = i3;
        zzais zzaisVar3 = zzaisVar;
        zzD(obj);
        Unsafe unsafe5 = zzb;
        int i40 = -1;
        int iZzg = i;
        int i41 = -1;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 1048575;
        while (true) {
            if (iZzg < i2) {
                int i46 = iZzg + 1;
                int i47 = bArr[iZzg];
                if (i47 < 0) {
                    int iZzi = zzait.zzi(i47, bArr, i46, zzaisVar3);
                    i9 = zzaisVar3.zza;
                    i46 = iZzi;
                } else {
                    i9 = i47;
                }
                int i48 = i9 >>> 3;
                int iZzs = i48 > i41 ? (i48 < zzalsVar2.zze || i48 > zzalsVar2.zzf) ? -1 : zzalsVar2.zzs(i48, i42 / 3) : zzalsVar2.zzq(i48);
                if (iZzs != i40) {
                    int i49 = i9 & 7;
                    int[] iArr = zzalsVar2.zzc;
                    int i50 = iArr[iZzs + 1];
                    int i51 = i48;
                    int iZzt = zzt(i50);
                    long j = i50 & 1048575;
                    int i52 = i9;
                    if (iZzt <= 17) {
                        int i53 = iArr[iZzs + 2];
                        int i54 = 1 << (i53 >>> 20);
                        int i55 = 1048575;
                        int i56 = i53 & 1048575;
                        if (i56 != i45) {
                            if (i45 != 1048575) {
                                unsafe5.putInt(obj3, i45, i44);
                                i55 = 1048575;
                            }
                            i44 = i56 == i55 ? 0 : unsafe5.getInt(obj3, i56);
                            i12 = i56;
                        } else {
                            i12 = i45;
                        }
                        switch (iZzt) {
                            case 0:
                                i16 = iZzs;
                                i17 = i51;
                                i18 = i52;
                                if (i49 == 1) {
                                    iZzg = i46 + 8;
                                    i44 |= i54;
                                    zzanf.zzo(obj3, j, Double.longBitsToDouble(zzait.zzn(bArr, i46)));
                                    i2 = i2;
                                    i3 = i3;
                                    i43 = i18;
                                    i41 = i17;
                                    i42 = i16;
                                    i45 = i12;
                                    i40 = -1;
                                }
                                i44 = i44;
                                i22 = i18;
                                i51 = i17;
                                i23 = i16;
                                i4 = i3;
                                i11 = i44;
                                i13 = i23;
                                i5 = i2;
                                zzaisVar2 = zzaisVar3;
                                i14 = i51;
                                unsafe2 = unsafe5;
                                int i57 = i46;
                                i43 = i22;
                                i10 = i57;
                                break;
                            case 1:
                                i16 = iZzs;
                                i17 = i51;
                                i18 = i52;
                                if (i49 == 5) {
                                    iZzg = i46 + 4;
                                    i44 |= i54;
                                    zzanf.zzp(obj3, j, Float.intBitsToFloat(zzait.zzb(bArr, i46)));
                                    i2 = i2;
                                    i3 = i3;
                                    i43 = i18;
                                    i41 = i17;
                                    i42 = i16;
                                    i45 = i12;
                                    i40 = -1;
                                }
                                i44 = i44;
                                i22 = i18;
                                i51 = i17;
                                i23 = i16;
                                i4 = i3;
                                i11 = i44;
                                i13 = i23;
                                i5 = i2;
                                zzaisVar2 = zzaisVar3;
                                i14 = i51;
                                unsafe2 = unsafe5;
                                int i58 = i46;
                                i43 = i22;
                                i10 = i58;
                                break;
                            case 2:
                            case 3:
                                i16 = iZzs;
                                i17 = i51;
                                i18 = i52;
                                if (i49 == 0) {
                                    i19 = i44 | i54;
                                    iZzk = zzait.zzk(bArr, i46, zzaisVar3);
                                    unsafe5.putLong(obj, j, zzaisVar3.zzb);
                                    i2 = i2;
                                    i3 = i3;
                                    i43 = i18;
                                    i41 = i17;
                                    i42 = i16;
                                    i44 = i19;
                                    iZzg = iZzk;
                                    i45 = i12;
                                    i40 = -1;
                                }
                                i44 = i44;
                                i22 = i18;
                                i51 = i17;
                                i23 = i16;
                                i4 = i3;
                                i11 = i44;
                                i13 = i23;
                                i5 = i2;
                                zzaisVar2 = zzaisVar3;
                                i14 = i51;
                                unsafe2 = unsafe5;
                                int i59 = i46;
                                i43 = i22;
                                i10 = i59;
                                break;
                            case 4:
                            case 11:
                                i16 = iZzs;
                                i17 = i51;
                                i18 = i52;
                                if (i49 == 0) {
                                    i44 |= i54;
                                    iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                    unsafe5.putInt(obj3, j, zzaisVar3.zza);
                                    i2 = i2;
                                    i3 = i3;
                                    i43 = i18;
                                    i41 = i17;
                                    i42 = i16;
                                    i45 = i12;
                                    i40 = -1;
                                }
                                i44 = i44;
                                i22 = i18;
                                i51 = i17;
                                i23 = i16;
                                i4 = i3;
                                i11 = i44;
                                i13 = i23;
                                i5 = i2;
                                zzaisVar2 = zzaisVar3;
                                i14 = i51;
                                unsafe2 = unsafe5;
                                int i510 = i46;
                                i43 = i22;
                                i10 = i510;
                                break;
                            case 5:
                            case 14:
                                i16 = iZzs;
                                i17 = i51;
                                i18 = i52;
                                if (i49 == 1) {
                                    iZzk = i46 + 8;
                                    i19 = i44 | i54;
                                    unsafe5.putLong(obj, j, zzait.zzn(bArr, i46));
                                    i2 = i2;
                                    i3 = i3;
                                    i43 = i18;
                                    i41 = i17;
                                    i42 = i16;
                                    i44 = i19;
                                    iZzg = iZzk;
                                    i45 = i12;
                                    i40 = -1;
                                }
                                i44 = i44;
                                i22 = i18;
                                i51 = i17;
                                i23 = i16;
                                i4 = i3;
                                i11 = i44;
                                i13 = i23;
                                i5 = i2;
                                zzaisVar2 = zzaisVar3;
                                i14 = i51;
                                unsafe2 = unsafe5;
                                int i511 = i46;
                                i43 = i22;
                                i10 = i511;
                                break;
                            case 6:
                            case 13:
                                i16 = iZzs;
                                i17 = i51;
                                i18 = i52;
                                if (i49 == 5) {
                                    iZzg = i46 + 4;
                                    i44 |= i54;
                                    unsafe5.putInt(obj3, j, zzait.zzb(bArr, i46));
                                    i2 = i2;
                                    i3 = i3;
                                    i43 = i18;
                                    i41 = i17;
                                    i42 = i16;
                                    i45 = i12;
                                    i40 = -1;
                                }
                                i44 = i44;
                                i22 = i18;
                                i51 = i17;
                                i23 = i16;
                                i4 = i3;
                                i11 = i44;
                                i13 = i23;
                                i5 = i2;
                                zzaisVar2 = zzaisVar3;
                                i14 = i51;
                                unsafe2 = unsafe5;
                                int i512 = i46;
                                i43 = i22;
                                i10 = i512;
                                break;
                            case 7:
                                i16 = iZzs;
                                i17 = i51;
                                i18 = i52;
                                if (i49 == 0) {
                                    i44 |= i54;
                                    iZzg = zzait.zzk(bArr, i46, zzaisVar3);
                                    zzanf.zzm(obj3, j, zzaisVar3.zzb != 0);
                                    i2 = i2;
                                    i3 = i3;
                                    i43 = i18;
                                    i41 = i17;
                                    i42 = i16;
                                    i45 = i12;
                                    i40 = -1;
                                }
                                i44 = i44;
                                i22 = i18;
                                i51 = i17;
                                i23 = i16;
                                i4 = i3;
                                i11 = i44;
                                i13 = i23;
                                i5 = i2;
                                zzaisVar2 = zzaisVar3;
                                i14 = i51;
                                unsafe2 = unsafe5;
                                int i513 = i46;
                                i43 = i22;
                                i10 = i513;
                                break;
                            case 8:
                                i16 = iZzs;
                                i17 = i51;
                                i18 = i52;
                                if (i49 == 2) {
                                    if (zzM(i50)) {
                                        iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                        i20 = zzaisVar3.zza;
                                        if (i20 < 0) {
                                            throw zzaks.zzf();
                                        }
                                        i21 = i44 | i54;
                                        if (i20 == 0) {
                                            zzaisVar3.zzc = "";
                                        } else {
                                            zzaisVar3.zzc = zzank.zzd(bArr, iZzg, i20);
                                            iZzg += i20;
                                        }
                                    } else {
                                        iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                        i20 = zzaisVar3.zza;
                                        if (i20 < 0) {
                                            throw zzaks.zzf();
                                        }
                                        i21 = i44 | i54;
                                        if (i20 == 0) {
                                            zzaisVar3.zzc = "";
                                        } else {
                                            zzaisVar3.zzc = new String(bArr, iZzg, i20, zzakq.zzb);
                                            iZzg += i20;
                                        }
                                    }
                                    i44 = i21;
                                    unsafe5.putObject(obj3, j, zzaisVar3.zzc);
                                    i2 = i2;
                                    i3 = i3;
                                    i43 = i18;
                                    i41 = i17;
                                    i42 = i16;
                                    i45 = i12;
                                    i40 = -1;
                                }
                                i44 = i44;
                                i22 = i18;
                                i51 = i17;
                                i23 = i16;
                                i4 = i3;
                                i11 = i44;
                                i13 = i23;
                                i5 = i2;
                                zzaisVar2 = zzaisVar3;
                                i14 = i51;
                                unsafe2 = unsafe5;
                                int i514 = i46;
                                i43 = i22;
                                i10 = i514;
                                break;
                            case 9:
                                i16 = iZzs;
                                i17 = i51;
                                i18 = i52;
                                if (i49 == 2) {
                                    Object objZzA = zzalsVar2.zzA(obj3, i16);
                                    iZzg = zzait.zzm(objZzA, zzalsVar2.zzx(i16), bArr, i46, i2, zzaisVar);
                                    zzalsVar2.zzJ(obj3, i16, objZzA);
                                    i2 = i2;
                                    i43 = i18;
                                    i41 = i17;
                                    i42 = i16;
                                    i44 |= i54;
                                    i45 = i12;
                                    i40 = -1;
                                    i3 = i3;
                                } else {
                                    i44 = i44;
                                    i22 = i18;
                                    i51 = i17;
                                    i23 = i16;
                                    i4 = i3;
                                    i11 = i44;
                                    i13 = i23;
                                    i5 = i2;
                                    zzaisVar2 = zzaisVar3;
                                    i14 = i51;
                                    unsafe2 = unsafe5;
                                    int i515 = i46;
                                    i43 = i22;
                                    i10 = i515;
                                }
                                break;
                            case 10:
                                i16 = iZzs;
                                i17 = i51;
                                i18 = i52;
                                if (i49 == 2) {
                                    i44 |= i54;
                                    iZzg = zzait.zza(bArr, i46, zzaisVar3);
                                    unsafe5.putObject(obj3, j, zzaisVar3.zzc);
                                    i2 = i2;
                                    i3 = i3;
                                    i43 = i18;
                                    i41 = i17;
                                    i42 = i16;
                                    i45 = i12;
                                    i40 = -1;
                                }
                                i44 = i44;
                                i22 = i18;
                                i51 = i17;
                                i23 = i16;
                                i4 = i3;
                                i11 = i44;
                                i13 = i23;
                                i5 = i2;
                                zzaisVar2 = zzaisVar3;
                                i14 = i51;
                                unsafe2 = unsafe5;
                                int i516 = i46;
                                i43 = i22;
                                i10 = i516;
                                break;
                            case 12:
                                i16 = iZzs;
                                i17 = i51;
                                if (i49 == 0) {
                                    iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                    int i60 = zzaisVar3.zza;
                                    zzako zzakoVarZzw = zzalsVar2.zzw(i16);
                                    if ((i50 & Integer.MIN_VALUE) == 0 || zzakoVarZzw == null || zzakoVarZzw.zza()) {
                                        i18 = i52;
                                        i44 |= i54;
                                        unsafe5.putInt(obj3, j, i60);
                                    } else {
                                        i18 = i52;
                                        zzd(obj).zzj(i18, Long.valueOf(i60));
                                    }
                                    i2 = i2;
                                    i3 = i3;
                                    i43 = i18;
                                    i41 = i17;
                                    i42 = i16;
                                    i45 = i12;
                                    i40 = -1;
                                }
                                i51 = i17;
                                i23 = i16;
                                i22 = i52;
                                i4 = i3;
                                i11 = i44;
                                i13 = i23;
                                i5 = i2;
                                zzaisVar2 = zzaisVar3;
                                i14 = i51;
                                unsafe2 = unsafe5;
                                int i517 = i46;
                                i43 = i22;
                                i10 = i517;
                                break;
                            case 15:
                                i16 = iZzs;
                                i17 = i51;
                                if (i49 == 0) {
                                    i44 |= i54;
                                    iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                    unsafe5.putInt(obj3, j, zzajl.zzF(zzaisVar3.zza));
                                    i41 = i17;
                                    i42 = i16;
                                    i43 = i52;
                                    i45 = i12;
                                    i40 = -1;
                                }
                                i51 = i17;
                                i23 = i16;
                                i22 = i52;
                                i4 = i3;
                                i11 = i44;
                                i13 = i23;
                                i5 = i2;
                                zzaisVar2 = zzaisVar3;
                                i14 = i51;
                                unsafe2 = unsafe5;
                                int i518 = i46;
                                i43 = i22;
                                i10 = i518;
                                break;
                            case 16:
                                if (i49 == 0) {
                                    int i61 = i44 | i54;
                                    int iZzk2 = zzait.zzk(bArr, i46, zzaisVar3);
                                    i17 = i51;
                                    i16 = iZzs;
                                    unsafe5.putLong(obj, j, zzajl.zzG(zzaisVar3.zzb));
                                    iZzg = iZzk2;
                                    i44 = i61;
                                    i41 = i17;
                                    i42 = i16;
                                    i43 = i52;
                                    i45 = i12;
                                    i40 = -1;
                                } else {
                                    i23 = iZzs;
                                    i22 = i52;
                                    i4 = i3;
                                    i11 = i44;
                                    i13 = i23;
                                    i5 = i2;
                                    zzaisVar2 = zzaisVar3;
                                    i14 = i51;
                                    unsafe2 = unsafe5;
                                    int i519 = i46;
                                    i43 = i22;
                                    i10 = i519;
                                }
                                break;
                            default:
                                i16 = iZzs;
                                i17 = i51;
                                i18 = i52;
                                if (i49 == 3) {
                                    int i62 = i44 | i54;
                                    Object objZzA2 = zzalsVar2.zzA(obj3, i16);
                                    int iZzl = zzait.zzl(objZzA2, zzalsVar2.zzx(i16), bArr, i46, i2, (i17 << 3) | 4, zzaisVar);
                                    zzalsVar2.zzJ(obj3, i16, objZzA2);
                                    i3 = i3;
                                    zzaisVar3 = zzaisVar3;
                                    i2 = i2;
                                    unsafe5 = unsafe5;
                                    iZzg = iZzl;
                                    i45 = i12;
                                    i40 = -1;
                                    i44 = i62;
                                    i43 = i18;
                                    i42 = i16;
                                    i41 = i17;
                                } else {
                                    i44 = i44;
                                    i22 = i18;
                                    i51 = i17;
                                    i23 = i16;
                                    i4 = i3;
                                    i11 = i44;
                                    i13 = i23;
                                    i5 = i2;
                                    zzaisVar2 = zzaisVar3;
                                    i14 = i51;
                                    unsafe2 = unsafe5;
                                    int i5110 = i46;
                                    i43 = i22;
                                    i10 = i5110;
                                }
                                break;
                        }
                    } else {
                        i11 = i44;
                        i12 = i45;
                        Unsafe unsafe6 = unsafe5;
                        int i63 = i2;
                        if (iZzt != 27) {
                            unsafe2 = unsafe6;
                            if (iZzt <= 49) {
                                long j2 = i50;
                                Unsafe unsafe7 = zzb;
                                zzakp zzakpVarZzd = (zzakp) unsafe7.getObject(obj3, j);
                                if (zzakpVarZzd.zzc()) {
                                    j2 = j2;
                                } else {
                                    int size = zzakpVarZzd.size();
                                    zzakpVarZzd = zzakpVarZzd.zzd(size == 0 ? 10 : size + size);
                                    unsafe7.putObject(obj3, j, zzakpVarZzd);
                                }
                                zzakp zzakpVar = zzakpVarZzd;
                                switch (iZzt) {
                                    case 18:
                                    case 35:
                                        i30 = i52;
                                        i46 = i46;
                                        i31 = iZzs;
                                        unsafe3 = unsafe2;
                                        i32 = i51;
                                        i33 = i63;
                                        if (i49 == 2) {
                                            zzaju zzajuVar = (zzaju) zzakpVar;
                                            iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                            int i64 = zzaisVar3.zza + iZzg;
                                            while (iZzg < i64) {
                                                zzajuVar.zze(Double.longBitsToDouble(zzait.zzn(bArr, iZzg)));
                                                iZzg += 8;
                                            }
                                            if (iZzg != i64) {
                                                throw zzaks.zzj();
                                            }
                                        } else if (i49 == 1) {
                                            i34 = i46 + 8;
                                            zzaju zzajuVar2 = (zzaju) zzakpVar;
                                            zzajuVar2.zze(Double.longBitsToDouble(zzait.zzn(bArr, i46)));
                                            while (i34 < i33) {
                                                int iZzh = zzait.zzh(bArr, i34, zzaisVar3);
                                                if (i30 == zzaisVar3.zza) {
                                                    zzajuVar2.zze(Double.longBitsToDouble(zzait.zzn(bArr, iZzh)));
                                                    i34 = iZzh + 8;
                                                } else {
                                                    iZzg = i34;
                                                }
                                            }
                                            iZzg = i34;
                                        } else {
                                            iZzg = i46;
                                        }
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        i30 = i52;
                                        i46 = i46;
                                        i31 = iZzs;
                                        unsafe3 = unsafe2;
                                        i32 = i51;
                                        i33 = i63;
                                        if (i49 == 2) {
                                            zzake zzakeVar = (zzake) zzakpVar;
                                            iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                            int i65 = zzaisVar3.zza + iZzg;
                                            while (iZzg < i65) {
                                                zzakeVar.zze(Float.intBitsToFloat(zzait.zzb(bArr, iZzg)));
                                                iZzg += 4;
                                            }
                                            if (iZzg != i65) {
                                                throw zzaks.zzj();
                                            }
                                        } else if (i49 == 5) {
                                            i34 = i46 + 4;
                                            zzake zzakeVar2 = (zzake) zzakpVar;
                                            zzakeVar2.zze(Float.intBitsToFloat(zzait.zzb(bArr, i46)));
                                            while (i34 < i33) {
                                                int iZzh2 = zzait.zzh(bArr, i34, zzaisVar3);
                                                if (i30 == zzaisVar3.zza) {
                                                    zzakeVar2.zze(Float.intBitsToFloat(zzait.zzb(bArr, iZzh2)));
                                                    i34 = iZzh2 + 4;
                                                } else {
                                                    iZzg = i34;
                                                }
                                            }
                                            iZzg = i34;
                                        } else {
                                            iZzg = i46;
                                        }
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i30 = i52;
                                        i46 = i46;
                                        i31 = iZzs;
                                        unsafe3 = unsafe2;
                                        i32 = i51;
                                        i33 = i63;
                                        if (i49 == 2) {
                                            zzale zzaleVar = (zzale) zzakpVar;
                                            iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                            int i66 = zzaisVar3.zza + iZzg;
                                            while (iZzg < i66) {
                                                iZzg = zzait.zzk(bArr, iZzg, zzaisVar3);
                                                zzaleVar.zzf(zzaisVar3.zzb);
                                            }
                                            if (iZzg != i66) {
                                                throw zzaks.zzj();
                                            }
                                        } else if (i49 == 0) {
                                            zzale zzaleVar2 = (zzale) zzakpVar;
                                            iZzg = zzait.zzk(bArr, i46, zzaisVar3);
                                            zzaleVar2.zzf(zzaisVar3.zzb);
                                            while (iZzg < i33) {
                                                int iZzh3 = zzait.zzh(bArr, iZzg, zzaisVar3);
                                                if (i30 == zzaisVar3.zza) {
                                                    iZzg = zzait.zzk(bArr, iZzh3, zzaisVar3);
                                                    zzaleVar2.zzf(zzaisVar3.zzb);
                                                }
                                            }
                                        } else {
                                            iZzg = i46;
                                        }
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i30 = i52;
                                        i35 = i46;
                                        i36 = i63;
                                        i37 = iZzs;
                                        unsafe4 = unsafe2;
                                        i38 = i51;
                                        if (i49 == 2) {
                                            iZzf = zzait.zzf(bArr, i35, zzakpVar, zzaisVar3);
                                            i46 = i35;
                                            iZzg = iZzf;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe3 = unsafe4;
                                        } else if (i49 == 0) {
                                            i46 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe3 = unsafe4;
                                            iZzg = zzait.zzj(i30, bArr, i46, i2, zzakpVar, zzaisVar);
                                        } else {
                                            i46 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe3 = unsafe4;
                                            iZzg = i46;
                                        }
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i30 = i52;
                                        i35 = i46;
                                        i36 = i63;
                                        i37 = iZzs;
                                        unsafe4 = unsafe2;
                                        i38 = i51;
                                        if (i49 != 2) {
                                            if (i49 == 1) {
                                                iZzf = i35 + 8;
                                                zzale zzaleVar3 = (zzale) zzakpVar;
                                                zzaleVar3.zzf(zzait.zzn(bArr, i35));
                                                while (iZzf < i36) {
                                                    int iZzh4 = zzait.zzh(bArr, iZzf, zzaisVar3);
                                                    if (i30 == zzaisVar3.zza) {
                                                        zzaleVar3.zzf(zzait.zzn(bArr, iZzh4));
                                                        iZzf = iZzh4 + 8;
                                                    }
                                                }
                                            }
                                            i46 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe3 = unsafe4;
                                            iZzg = i46;
                                            if (iZzg != i46) {
                                                i3 = i3;
                                                i43 = i30;
                                                i41 = i32;
                                                i42 = i31;
                                                unsafe5 = unsafe3;
                                                i44 = i11;
                                                i45 = i12;
                                                i40 = -1;
                                                obj3 = obj;
                                                i2 = i33;
                                            } else {
                                                i10 = iZzg;
                                                i43 = i30;
                                                i14 = i32;
                                                i13 = i31;
                                                zzaisVar2 = zzaisVar3;
                                                unsafe2 = unsafe3;
                                                obj3 = obj;
                                                i5 = i33;
                                                i4 = i3;
                                            }
                                        } else {
                                            zzale zzaleVar4 = (zzale) zzakpVar;
                                            iZzf = zzait.zzh(bArr, i35, zzaisVar3);
                                            int i67 = zzaisVar3.zza + iZzf;
                                            while (iZzf < i67) {
                                                zzaleVar4.zzf(zzait.zzn(bArr, iZzf));
                                                iZzf += 8;
                                            }
                                            if (iZzf != i67) {
                                                throw zzaks.zzj();
                                            }
                                        }
                                        i46 = i35;
                                        iZzg = iZzf;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe3 = unsafe4;
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i30 = i52;
                                        i35 = i46;
                                        i36 = i63;
                                        i37 = iZzs;
                                        unsafe4 = unsafe2;
                                        i38 = i51;
                                        if (i49 != 2) {
                                            if (i49 == 5) {
                                                iZzf = i35 + 4;
                                                zzakl zzaklVar = (zzakl) zzakpVar;
                                                zzaklVar.zzf(zzait.zzb(bArr, i35));
                                                while (iZzf < i36) {
                                                    int iZzh5 = zzait.zzh(bArr, iZzf, zzaisVar3);
                                                    if (i30 == zzaisVar3.zza) {
                                                        zzaklVar.zzf(zzait.zzb(bArr, iZzh5));
                                                        iZzf = iZzh5 + 4;
                                                    }
                                                }
                                            }
                                            i46 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe3 = unsafe4;
                                            iZzg = i46;
                                            if (iZzg != i46) {
                                                i3 = i3;
                                                i43 = i30;
                                                i41 = i32;
                                                i42 = i31;
                                                unsafe5 = unsafe3;
                                                i44 = i11;
                                                i45 = i12;
                                                i40 = -1;
                                                obj3 = obj;
                                                i2 = i33;
                                            } else {
                                                i10 = iZzg;
                                                i43 = i30;
                                                i14 = i32;
                                                i13 = i31;
                                                zzaisVar2 = zzaisVar3;
                                                unsafe2 = unsafe3;
                                                obj3 = obj;
                                                i5 = i33;
                                                i4 = i3;
                                            }
                                        } else {
                                            zzakl zzaklVar2 = (zzakl) zzakpVar;
                                            iZzf = zzait.zzh(bArr, i35, zzaisVar3);
                                            int i68 = zzaisVar3.zza + iZzf;
                                            while (iZzf < i68) {
                                                zzaklVar2.zzf(zzait.zzb(bArr, iZzf));
                                                iZzf += 4;
                                            }
                                            if (iZzf != i68) {
                                                throw zzaks.zzj();
                                            }
                                        }
                                        i46 = i35;
                                        iZzg = iZzf;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe3 = unsafe4;
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i30 = i52;
                                        i35 = i46;
                                        i36 = i63;
                                        i37 = iZzs;
                                        unsafe4 = unsafe2;
                                        i38 = i51;
                                        if (i49 != 2) {
                                            if (i49 == 0) {
                                                zzaiu zzaiuVar = (zzaiu) zzakpVar;
                                                iZzf = zzait.zzk(bArr, i35, zzaisVar3);
                                                zzaiuVar.zze(zzaisVar3.zzb != 0);
                                                while (iZzf < i36) {
                                                    int iZzh6 = zzait.zzh(bArr, iZzf, zzaisVar3);
                                                    if (i30 == zzaisVar3.zza) {
                                                        iZzf = zzait.zzk(bArr, iZzh6, zzaisVar3);
                                                        zzaiuVar.zze(zzaisVar3.zzb != 0);
                                                    }
                                                }
                                            }
                                            i46 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe3 = unsafe4;
                                            iZzg = i46;
                                            if (iZzg != i46) {
                                                i3 = i3;
                                                i43 = i30;
                                                i41 = i32;
                                                i42 = i31;
                                                unsafe5 = unsafe3;
                                                i44 = i11;
                                                i45 = i12;
                                                i40 = -1;
                                                obj3 = obj;
                                                i2 = i33;
                                            } else {
                                                i10 = iZzg;
                                                i43 = i30;
                                                i14 = i32;
                                                i13 = i31;
                                                zzaisVar2 = zzaisVar3;
                                                unsafe2 = unsafe3;
                                                obj3 = obj;
                                                i5 = i33;
                                                i4 = i3;
                                            }
                                        } else {
                                            zzaiu zzaiuVar2 = (zzaiu) zzakpVar;
                                            iZzf = zzait.zzh(bArr, i35, zzaisVar3);
                                            int i69 = zzaisVar3.zza + iZzf;
                                            while (iZzf < i69) {
                                                iZzf = zzait.zzk(bArr, iZzf, zzaisVar3);
                                                zzaiuVar2.zze(zzaisVar3.zzb != 0);
                                            }
                                            if (iZzf != i69) {
                                                throw zzaks.zzj();
                                            }
                                        }
                                        i46 = i35;
                                        iZzg = iZzf;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe3 = unsafe4;
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 26:
                                        i30 = i52;
                                        i35 = i46;
                                        i36 = i63;
                                        i37 = iZzs;
                                        unsafe4 = unsafe2;
                                        i38 = i51;
                                        if (i49 == 2) {
                                            if ((j2 & 536870912) == 0) {
                                                iZzf = zzait.zzh(bArr, i35, zzaisVar3);
                                                int i70 = zzaisVar3.zza;
                                                if (i70 < 0) {
                                                    throw zzaks.zzf();
                                                }
                                                if (i70 == 0) {
                                                    obj2 = "";
                                                    zzakpVar.add(obj2);
                                                } else {
                                                    obj2 = "";
                                                    zzakpVar.add(new String(bArr, iZzf, i70, zzakq.zzb));
                                                    iZzf += i70;
                                                }
                                                while (iZzf < i36) {
                                                    int iZzh7 = zzait.zzh(bArr, iZzf, zzaisVar3);
                                                    if (i30 == zzaisVar3.zza) {
                                                        iZzf = zzait.zzh(bArr, iZzh7, zzaisVar3);
                                                        int i71 = zzaisVar3.zza;
                                                        if (i71 < 0) {
                                                            throw zzaks.zzf();
                                                        }
                                                        if (i71 == 0) {
                                                            zzakpVar.add(obj2);
                                                        } else {
                                                            zzakpVar.add(new String(bArr, iZzf, i71, zzakq.zzb));
                                                            iZzf += i71;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZzf = zzait.zzh(bArr, i35, zzaisVar3);
                                                int i72 = zzaisVar3.zza;
                                                if (i72 < 0) {
                                                    throw zzaks.zzf();
                                                }
                                                if (i72 == 0) {
                                                    zzakpVar.add("");
                                                } else {
                                                    int i73 = iZzf + i72;
                                                    if (!zzank.zzf(bArr, iZzf, i73)) {
                                                        throw zzaks.zzd();
                                                    }
                                                    zzakpVar.add(new String(bArr, iZzf, i72, zzakq.zzb));
                                                    iZzf = i73;
                                                }
                                                while (iZzf < i36) {
                                                    int iZzh8 = zzait.zzh(bArr, iZzf, zzaisVar3);
                                                    if (i30 == zzaisVar3.zza) {
                                                        iZzf = zzait.zzh(bArr, iZzh8, zzaisVar3);
                                                        int i74 = zzaisVar3.zza;
                                                        if (i74 < 0) {
                                                            throw zzaks.zzf();
                                                        }
                                                        if (i74 == 0) {
                                                            zzakpVar.add("");
                                                        } else {
                                                            int i75 = iZzf + i74;
                                                            if (!zzank.zzf(bArr, iZzf, i75)) {
                                                                throw zzaks.zzd();
                                                            }
                                                            zzakpVar.add(new String(bArr, iZzf, i74, zzakq.zzb));
                                                            iZzf = i75;
                                                        }
                                                    }
                                                }
                                            }
                                            i46 = i35;
                                            iZzg = iZzf;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe3 = unsafe4;
                                            if (iZzg != i46) {
                                                i3 = i3;
                                                i43 = i30;
                                                i41 = i32;
                                                i42 = i31;
                                                unsafe5 = unsafe3;
                                                i44 = i11;
                                                i45 = i12;
                                                i40 = -1;
                                                obj3 = obj;
                                                i2 = i33;
                                            } else {
                                                i10 = iZzg;
                                                i43 = i30;
                                                i14 = i32;
                                                i13 = i31;
                                                zzaisVar2 = zzaisVar3;
                                                unsafe2 = unsafe3;
                                                obj3 = obj;
                                                i5 = i33;
                                                i4 = i3;
                                            }
                                        }
                                        i46 = i35;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe3 = unsafe4;
                                        iZzg = i46;
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 27:
                                        i39 = i52;
                                        i46 = i46;
                                        i63 = i63;
                                        unsafe2 = unsafe2;
                                        if (i49 == 2) {
                                            i30 = i39;
                                            int iZze = zzait.zze(zzalsVar2.zzx(iZzs), i39, bArr, i46, i2, zzakpVar, zzaisVar);
                                            zzaisVar3 = zzaisVar3;
                                            i33 = i63;
                                            i31 = iZzs;
                                            unsafe3 = unsafe2;
                                            iZzg = iZze;
                                            i32 = i51;
                                        } else {
                                            i30 = i39;
                                            unsafe3 = unsafe2;
                                            i32 = i51;
                                            int i76 = i63;
                                            i31 = iZzs;
                                            i33 = i76;
                                            iZzg = i46;
                                        }
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 28:
                                        i39 = i52;
                                        i46 = i46;
                                        i63 = i63;
                                        unsafe2 = unsafe2;
                                        if (i49 == 2) {
                                            iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                            int i77 = zzaisVar3.zza;
                                            if (i77 < 0) {
                                                throw zzaks.zzf();
                                            }
                                            if (i77 > bArr.length - iZzg) {
                                                throw zzaks.zzj();
                                            }
                                            if (i77 == 0) {
                                                zzakpVar.add(zzajf.zzb);
                                            } else {
                                                zzakpVar.add(zzajf.zzn(bArr, iZzg, i77));
                                                iZzg += i77;
                                            }
                                            while (iZzg < i63) {
                                                int iZzh9 = zzait.zzh(bArr, iZzg, zzaisVar3);
                                                if (i39 != zzaisVar3.zza) {
                                                    i30 = i39;
                                                    unsafe3 = unsafe2;
                                                    i32 = i51;
                                                    int i78 = i63;
                                                    i31 = iZzs;
                                                    i33 = i78;
                                                    if (iZzg != i46) {
                                                        i3 = i3;
                                                        i43 = i30;
                                                        i41 = i32;
                                                        i42 = i31;
                                                        unsafe5 = unsafe3;
                                                        i44 = i11;
                                                        i45 = i12;
                                                        i40 = -1;
                                                        obj3 = obj;
                                                        i2 = i33;
                                                    } else {
                                                        i10 = iZzg;
                                                        i43 = i30;
                                                        i14 = i32;
                                                        i13 = i31;
                                                        zzaisVar2 = zzaisVar3;
                                                        unsafe2 = unsafe3;
                                                        obj3 = obj;
                                                        i5 = i33;
                                                        i4 = i3;
                                                    }
                                                    break;
                                                } else {
                                                    iZzg = zzait.zzh(bArr, iZzh9, zzaisVar3);
                                                    int i79 = zzaisVar3.zza;
                                                    if (i79 < 0) {
                                                        throw zzaks.zzf();
                                                    }
                                                    if (i79 > bArr.length - iZzg) {
                                                        throw zzaks.zzj();
                                                    }
                                                    if (i79 == 0) {
                                                        zzakpVar.add(zzajf.zzb);
                                                    } else {
                                                        zzakpVar.add(zzajf.zzn(bArr, iZzg, i79));
                                                        iZzg += i79;
                                                    }
                                                }
                                            }
                                            i30 = i39;
                                            unsafe3 = unsafe2;
                                            i32 = i51;
                                            int i710 = i63;
                                            i31 = iZzs;
                                            i33 = i710;
                                            if (iZzg != i46) {
                                                i3 = i3;
                                                i43 = i30;
                                                i41 = i32;
                                                i42 = i31;
                                                unsafe5 = unsafe3;
                                                i44 = i11;
                                                i45 = i12;
                                                i40 = -1;
                                                obj3 = obj;
                                                i2 = i33;
                                            } else {
                                                i10 = iZzg;
                                                i43 = i30;
                                                i14 = i32;
                                                i13 = i31;
                                                zzaisVar2 = zzaisVar3;
                                                unsafe2 = unsafe3;
                                                obj3 = obj;
                                                i5 = i33;
                                                i4 = i3;
                                            }
                                        }
                                        i30 = i39;
                                        unsafe3 = unsafe2;
                                        i32 = i51;
                                        int i711 = i63;
                                        i31 = iZzs;
                                        i33 = i711;
                                        iZzg = i46;
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        if (i49 != 2) {
                                            if (i49 == 0) {
                                                iZzj = zzait.zzj(i52, bArr, i46, i2, zzakpVar, zzaisVar);
                                            }
                                            i30 = i52;
                                            i46 = i46;
                                            i31 = iZzs;
                                            unsafe3 = unsafe2;
                                            i32 = i51;
                                            i33 = i63;
                                            iZzg = i46;
                                            if (iZzg != i46) {
                                                i3 = i3;
                                                i43 = i30;
                                                i41 = i32;
                                                i42 = i31;
                                                unsafe5 = unsafe3;
                                                i44 = i11;
                                                i45 = i12;
                                                i40 = -1;
                                                obj3 = obj;
                                                i2 = i33;
                                            } else {
                                                i10 = iZzg;
                                                i43 = i30;
                                                i14 = i32;
                                                i13 = i31;
                                                zzaisVar2 = zzaisVar3;
                                                unsafe2 = unsafe3;
                                                obj3 = obj;
                                                i5 = i33;
                                                i4 = i3;
                                            }
                                        } else {
                                            iZzj = zzait.zzf(bArr, i46, zzakpVar, zzaisVar3);
                                        }
                                        int i80 = iZzj;
                                        zzamd.zzo(obj, i51, zzakpVar, zzalsVar2.zzw(iZzs), null, zzalsVar2.zzn);
                                        i30 = i52;
                                        iZzg = i80;
                                        unsafe3 = unsafe2;
                                        i32 = i51;
                                        int i712 = i63;
                                        i31 = iZzs;
                                        i33 = i712;
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        if (i49 != 2) {
                                            if (i49 == 0) {
                                                zzakl zzaklVar3 = (zzakl) zzakpVar;
                                                iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                                zzaklVar3.zzf(zzajl.zzF(zzaisVar3.zza));
                                                while (iZzg < i63) {
                                                    int iZzh10 = zzait.zzh(bArr, iZzg, zzaisVar3);
                                                    if (i52 == zzaisVar3.zza) {
                                                        iZzg = zzait.zzh(bArr, iZzh10, zzaisVar3);
                                                        zzaklVar3.zzf(zzajl.zzF(zzaisVar3.zza));
                                                    }
                                                }
                                            }
                                            i30 = i52;
                                            i46 = i46;
                                            i31 = iZzs;
                                            unsafe3 = unsafe2;
                                            i32 = i51;
                                            i33 = i63;
                                            iZzg = i46;
                                            if (iZzg != i46) {
                                                i3 = i3;
                                                i43 = i30;
                                                i41 = i32;
                                                i42 = i31;
                                                unsafe5 = unsafe3;
                                                i44 = i11;
                                                i45 = i12;
                                                i40 = -1;
                                                obj3 = obj;
                                                i2 = i33;
                                            } else {
                                                i10 = iZzg;
                                                i43 = i30;
                                                i14 = i32;
                                                i13 = i31;
                                                zzaisVar2 = zzaisVar3;
                                                unsafe2 = unsafe3;
                                                obj3 = obj;
                                                i5 = i33;
                                                i4 = i3;
                                            }
                                        } else {
                                            zzakl zzaklVar4 = (zzakl) zzakpVar;
                                            iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                            int i81 = zzaisVar3.zza + iZzg;
                                            while (iZzg < i81) {
                                                iZzg = zzait.zzh(bArr, iZzg, zzaisVar3);
                                                zzaklVar4.zzf(zzajl.zzF(zzaisVar3.zza));
                                            }
                                            if (iZzg != i81) {
                                                throw zzaks.zzj();
                                            }
                                        }
                                        i30 = i52;
                                        i46 = i46;
                                        i31 = iZzs;
                                        unsafe3 = unsafe2;
                                        i32 = i51;
                                        i33 = i63;
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i49 != 2) {
                                            if (i49 == 0) {
                                                zzale zzaleVar5 = (zzale) zzakpVar;
                                                iZzg = zzait.zzk(bArr, i46, zzaisVar3);
                                                zzaleVar5.zzf(zzajl.zzG(zzaisVar3.zzb));
                                                while (iZzg < i63) {
                                                    int iZzh11 = zzait.zzh(bArr, iZzg, zzaisVar3);
                                                    if (i52 == zzaisVar3.zza) {
                                                        iZzg = zzait.zzk(bArr, iZzh11, zzaisVar3);
                                                        zzaleVar5.zzf(zzajl.zzG(zzaisVar3.zzb));
                                                    }
                                                }
                                            }
                                            i30 = i52;
                                            i46 = i46;
                                            i31 = iZzs;
                                            unsafe3 = unsafe2;
                                            i32 = i51;
                                            i33 = i63;
                                            iZzg = i46;
                                            if (iZzg != i46) {
                                                i3 = i3;
                                                i43 = i30;
                                                i41 = i32;
                                                i42 = i31;
                                                unsafe5 = unsafe3;
                                                i44 = i11;
                                                i45 = i12;
                                                i40 = -1;
                                                obj3 = obj;
                                                i2 = i33;
                                            } else {
                                                i10 = iZzg;
                                                i43 = i30;
                                                i14 = i32;
                                                i13 = i31;
                                                zzaisVar2 = zzaisVar3;
                                                unsafe2 = unsafe3;
                                                obj3 = obj;
                                                i5 = i33;
                                                i4 = i3;
                                            }
                                        } else {
                                            zzale zzaleVar6 = (zzale) zzakpVar;
                                            iZzg = zzait.zzh(bArr, i46, zzaisVar3);
                                            int i82 = zzaisVar3.zza + iZzg;
                                            while (iZzg < i82) {
                                                iZzg = zzait.zzk(bArr, iZzg, zzaisVar3);
                                                zzaleVar6.zzf(zzajl.zzG(zzaisVar3.zzb));
                                            }
                                            if (iZzg != i82) {
                                                throw zzaks.zzj();
                                            }
                                        }
                                        i30 = i52;
                                        i46 = i46;
                                        i31 = iZzs;
                                        unsafe3 = unsafe2;
                                        i32 = i51;
                                        i33 = i63;
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                    default:
                                        i30 = i52;
                                        i46 = i46;
                                        i31 = iZzs;
                                        unsafe3 = unsafe2;
                                        i32 = i51;
                                        i33 = i63;
                                        if (i49 == 3) {
                                            int i83 = (i30 & (-8)) | 4;
                                            zzamb zzambVarZzx = zzalsVar2.zzx(i31);
                                            iZzg = zzait.zzc(zzambVarZzx, bArr, i46, i2, i83, zzaisVar);
                                            zzakpVar.add(zzaisVar3.zzc);
                                            while (iZzg < i33) {
                                                int iZzh12 = zzait.zzh(bArr, iZzg, zzaisVar3);
                                                if (i30 == zzaisVar3.zza) {
                                                    iZzg = zzait.zzc(zzambVarZzx, bArr, iZzh12, i2, i83, zzaisVar);
                                                    zzakpVar.add(zzaisVar3.zzc);
                                                }
                                            }
                                        } else {
                                            iZzg = i46;
                                        }
                                        if (iZzg != i46) {
                                            i3 = i3;
                                            i43 = i30;
                                            i41 = i32;
                                            i42 = i31;
                                            unsafe5 = unsafe3;
                                            i44 = i11;
                                            i45 = i12;
                                            i40 = -1;
                                            obj3 = obj;
                                            i2 = i33;
                                        } else {
                                            i10 = iZzg;
                                            i43 = i30;
                                            i14 = i32;
                                            i13 = i31;
                                            zzaisVar2 = zzaisVar3;
                                            unsafe2 = unsafe3;
                                            obj3 = obj;
                                            i5 = i33;
                                            i4 = i3;
                                        }
                                        break;
                                }
                            } else {
                                i26 = iZzs;
                                i25 = i51;
                                i24 = i46;
                                if (iZzt != 50) {
                                    i43 = i52;
                                    obj3 = obj;
                                    Unsafe unsafe8 = zzb;
                                    long j3 = iArr[i26 + 2] & 1048575;
                                    switch (iZzt) {
                                        case 51:
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 1) {
                                                iZzg = i28 + 8;
                                                unsafe8.putObject(obj3, j, Double.valueOf(Double.longBitsToDouble(zzait.zzn(bArr, i28))));
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 52:
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 5) {
                                                iZzg = i28 + 4;
                                                unsafe8.putObject(obj3, j, Float.valueOf(Float.intBitsToFloat(zzait.zzb(bArr, i28))));
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 0) {
                                                iZzg = zzait.zzk(bArr, i28, zzaisVar2);
                                                unsafe8.putObject(obj3, j, Long.valueOf(zzaisVar2.zzb));
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 0) {
                                                iZzg = zzait.zzh(bArr, i28, zzaisVar2);
                                                unsafe8.putObject(obj3, j, Integer.valueOf(zzaisVar2.zza));
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 1) {
                                                iZzg = i28 + 8;
                                                unsafe8.putObject(obj3, j, Long.valueOf(zzait.zzn(bArr, i28)));
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 5) {
                                                iZzg = i28 + 4;
                                                unsafe8.putObject(obj3, j, Integer.valueOf(zzait.zzb(bArr, i28)));
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 58:
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 0) {
                                                iZzg = zzait.zzk(bArr, i28, zzaisVar2);
                                                unsafe8.putObject(obj3, j, Boolean.valueOf(zzaisVar2.zzb != 0));
                                                unsafe8.putInt(obj3, j3, i14);
                                            } else {
                                                iZzg = i28;
                                            }
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 59:
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 2) {
                                                int iZzh13 = zzait.zzh(bArr, i28, zzaisVar2);
                                                int i84 = zzaisVar2.zza;
                                                if (i84 == 0) {
                                                    unsafe8.putObject(obj3, j, "");
                                                } else {
                                                    int i85 = iZzh13 + i84;
                                                    if ((i50 & DriveFile.MODE_WRITE_ONLY) != 0 && !zzank.zzf(bArr, iZzh13, i85)) {
                                                        throw zzaks.zzd();
                                                    }
                                                    unsafe8.putObject(obj3, j, new String(bArr, iZzh13, i84, zzakq.zzb));
                                                    iZzh13 = i85;
                                                }
                                                unsafe8.putInt(obj3, j3, i14);
                                                iZzg = iZzh13;
                                            } else {
                                                i27 = i27;
                                                iZzg = i28;
                                            }
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 60:
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 2) {
                                                Object objZzB = zzB(obj3, i25, i26);
                                                i14 = i25;
                                                iZzg = zzait.zzm(objZzB, zzx(i26), bArr, i28, i2, zzaisVar);
                                                zzK(obj3, i14, i26, objZzB);
                                                i27 = i26;
                                                i43 = i43;
                                                i5 = i2;
                                            } else {
                                                i14 = i25;
                                                i5 = i2;
                                                i27 = i26;
                                                iZzg = i28;
                                            }
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 61:
                                            i29 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 2) {
                                                iZzg = zzait.zza(bArr, i28, zzaisVar2);
                                                unsafe8.putObject(obj3, j, zzaisVar2.zzc);
                                                unsafe8.putInt(obj3, j3, i29);
                                                i5 = i2;
                                                i27 = i26;
                                                i14 = i29;
                                                if (iZzg == i28) {
                                                    zzalsVar2 = this;
                                                    i42 = i27;
                                                    i3 = i3;
                                                    zzaisVar3 = zzaisVar2;
                                                    i2 = i5;
                                                    i41 = i14;
                                                    i44 = i11;
                                                    unsafe5 = unsafe2;
                                                    i45 = i12;
                                                    i40 = -1;
                                                } else {
                                                    i13 = i27;
                                                    i4 = i3;
                                                    i10 = iZzg;
                                                }
                                            }
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i29;
                                            iZzg = i28;
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 63:
                                            i29 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 0) {
                                                iZzg = zzait.zzh(bArr, i28, zzaisVar2);
                                                int i86 = zzaisVar2.zza;
                                                zzako zzakoVarZzw2 = zzw(i26);
                                                if (zzakoVarZzw2 == null || zzakoVarZzw2.zza()) {
                                                    unsafe8.putObject(obj3, j, Integer.valueOf(i86));
                                                    unsafe8.putInt(obj3, j3, i29);
                                                } else {
                                                    zzd(obj).zzj(i43, Long.valueOf(i86));
                                                }
                                                i5 = i2;
                                                i27 = i26;
                                                i14 = i29;
                                                if (iZzg == i28) {
                                                    zzalsVar2 = this;
                                                    i42 = i27;
                                                    i3 = i3;
                                                    zzaisVar3 = zzaisVar2;
                                                    i2 = i5;
                                                    i41 = i14;
                                                    i44 = i11;
                                                    unsafe5 = unsafe2;
                                                    i45 = i12;
                                                    i40 = -1;
                                                } else {
                                                    i13 = i27;
                                                    i4 = i3;
                                                    i10 = iZzg;
                                                }
                                            }
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i29;
                                            iZzg = i28;
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 66:
                                            i29 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 0) {
                                                iZzg = zzait.zzh(bArr, i28, zzaisVar2);
                                                unsafe8.putObject(obj3, j, Integer.valueOf(zzajl.zzF(zzaisVar2.zza)));
                                                unsafe8.putInt(obj3, j3, i29);
                                                i5 = i2;
                                                i27 = i26;
                                                i14 = i29;
                                                if (iZzg == i28) {
                                                    zzalsVar2 = this;
                                                    i42 = i27;
                                                    i3 = i3;
                                                    zzaisVar3 = zzaisVar2;
                                                    i2 = i5;
                                                    i41 = i14;
                                                    i44 = i11;
                                                    unsafe5 = unsafe2;
                                                    i45 = i12;
                                                    i40 = -1;
                                                } else {
                                                    i13 = i27;
                                                    i4 = i3;
                                                    i10 = iZzg;
                                                }
                                            }
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i29;
                                            iZzg = i28;
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 67:
                                            i29 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            if (i49 == 0) {
                                                int iZzk3 = zzait.zzk(bArr, i28, zzaisVar2);
                                                unsafe8.putObject(obj3, j, Long.valueOf(zzajl.zzG(zzaisVar2.zzb)));
                                                unsafe8.putInt(obj3, j3, i29);
                                                iZzg = iZzk3;
                                                i5 = i2;
                                                i27 = i26;
                                                i14 = i29;
                                                if (iZzg == i28) {
                                                    zzalsVar2 = this;
                                                    i42 = i27;
                                                    i3 = i3;
                                                    zzaisVar3 = zzaisVar2;
                                                    i2 = i5;
                                                    i41 = i14;
                                                    i44 = i11;
                                                    unsafe5 = unsafe2;
                                                    i45 = i12;
                                                    i40 = -1;
                                                } else {
                                                    i13 = i27;
                                                    i4 = i3;
                                                    i10 = iZzg;
                                                }
                                            }
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i29;
                                            iZzg = i28;
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                        case 68:
                                            if (i49 != 3) {
                                                break;
                                            } else {
                                                Object objZzB2 = zzB(obj3, i25, i26);
                                                zzais zzaisVar4 = zzaisVar3;
                                                int iZzl2 = zzait.zzl(objZzB2, zzx(i26), bArr, i24, i2, (i43 & (-8)) | 4, zzaisVar);
                                                zzK(obj3, i25, i26, objZzB2);
                                                i5 = i2;
                                                i28 = i24;
                                                i27 = i26;
                                                i14 = i25;
                                                iZzg = iZzl2;
                                                zzaisVar2 = zzaisVar4;
                                            }
                                            if (iZzg == i28) {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                                break;
                                            } else {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                                break;
                                            }
                                        default:
                                            i5 = i2;
                                            i27 = i26;
                                            i14 = i25;
                                            zzaisVar2 = zzaisVar3;
                                            i28 = i24;
                                            iZzg = i28;
                                            if (iZzg == i28) {
                                                zzalsVar2 = this;
                                                i42 = i27;
                                                i3 = i3;
                                                zzaisVar3 = zzaisVar2;
                                                i2 = i5;
                                                i41 = i14;
                                                i44 = i11;
                                                unsafe5 = unsafe2;
                                                i45 = i12;
                                                i40 = -1;
                                            } else {
                                                i13 = i27;
                                                i4 = i3;
                                                i10 = iZzg;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i49 == 2) {
                                        Unsafe unsafe9 = zzb;
                                        Object objZzz = zzalsVar2.zzz(i26);
                                        Object object = unsafe9.getObject(obj, j);
                                        if (zzalk.zza(object)) {
                                            zzalj zzaljVarZzb = zzalj.zza().zzb();
                                            zzalk.zzb(zzaljVarZzb, object);
                                            unsafe9.putObject(obj, j, zzaljVarZzb);
                                        }
                                        throw null;
                                    }
                                    i43 = i52;
                                    obj3 = obj;
                                    i4 = i3;
                                    i13 = i26;
                                    i5 = i63;
                                    i10 = i24;
                                    i14 = i25;
                                    zzaisVar2 = zzaisVar3;
                                }
                            }
                        } else if (i49 == 2) {
                            zzakp zzakpVarZzd2 = (zzakp) unsafe6.getObject(obj3, j);
                            if (!zzakpVarZzd2.zzc()) {
                                int size2 = zzakpVarZzd2.size();
                                zzakpVarZzd2 = zzakpVarZzd2.zzd(size2 == 0 ? 10 : size2 + size2);
                                unsafe6.putObject(obj3, j, zzakpVarZzd2);
                            }
                            i41 = i51;
                            int iZze2 = zzait.zze(zzalsVar2.zzx(iZzs), i52, bArr, i46, i2, zzakpVarZzd2, zzaisVar);
                            i3 = i3;
                            zzaisVar3 = zzaisVar3;
                            i2 = i63;
                            unsafe5 = unsafe6;
                            i44 = i11;
                            i45 = i12;
                            i40 = -1;
                            i43 = i52;
                            i42 = iZzs;
                            iZzg = iZze2;
                        } else {
                            i24 = i46;
                            i25 = i51;
                            i43 = i52;
                            unsafe2 = unsafe6;
                            i26 = iZzs;
                            i4 = i3;
                            i13 = i26;
                            i5 = i63;
                            i10 = i24;
                            i14 = i25;
                            zzaisVar2 = zzaisVar3;
                        }
                    }
                } else {
                    i10 = i46;
                    i11 = i44;
                    i12 = i45;
                    i43 = i9;
                    unsafe2 = unsafe5;
                    zzaisVar2 = zzaisVar3;
                    i4 = i3;
                    i5 = i2;
                    i13 = 0;
                    i14 = i48;
                }
                if (i43 != i4 || i4 == 0) {
                    if (!this.zzh || (zzajxVar = zzaisVar2.zzd) == zzajx.zza) {
                        i15 = i43;
                        iZzg = zzait.zzg(i15, bArr, i10, i2, zzd(obj), zzaisVar);
                    } else {
                        if (zzajxVar.zzb(this.zzg, i14) != null) {
                            throw null;
                        }
                        i15 = i43;
                        iZzg = zzait.zzg(i43, bArr, i10, i2, zzd(obj), zzaisVar);
                    }
                    i42 = i13;
                    i41 = i14;
                    zzalsVar2 = this;
                    i43 = i15;
                    unsafe5 = unsafe2;
                    i44 = i11;
                    i45 = i12;
                    zzaisVar3 = zzaisVar2;
                    i3 = i4;
                    i2 = i5;
                    i40 = -1;
                } else {
                    i8 = 1048575;
                    zzalsVar = this;
                    i6 = i10;
                    i7 = i43;
                    i44 = i11;
                    unsafe = unsafe2;
                    i45 = i12;
                }
            } else {
                zzalsVar = zzalsVar2;
                i4 = i3;
                i5 = i2;
                unsafe = unsafe5;
                i6 = iZzg;
                i7 = i43;
                i8 = 1048575;
            }
        }
        if (i45 != i8) {
            unsafe.putInt(obj3, i45, i44);
        }
        for (int i87 = zzalsVar.zzk; i87 < zzalsVar.zzl; i87++) {
            zzy(obj, zzalsVar.zzj[i87], null, zzalsVar.zzn, obj);
        }
        if (i4 == 0) {
            if (i6 != i5) {
                throw zzaks.zzg();
            }
        } else if (i6 > i5 || i7 != i4) {
            throw zzaks.zzg();
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final Object zze() {
        return ((zzakk) this.zzg).zzw();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzakk) {
                zzakk zzakkVar = (zzakk) obj;
                zzakkVar.zzI(Integer.MAX_VALUE);
                zzakkVar.zza = 0;
                zzakkVar.zzG();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
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
                                    ((zzalj) object).zzc();
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i2 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzanf.zzo(obj, j, zzanf.zza(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzanf.zzp(obj, j, zzanf.zzb(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        zzanf.zzr(obj, j, zzanf.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        zzanf.zzr(obj, j, zzanf.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j, zzanf.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        zzanf.zzr(obj, j, zzanf.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j, zzanf.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        zzanf.zzm(obj, j, zzanf.zzw(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        zzanf.zzs(obj, j, zzanf.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzanf.zzs(obj, j, zzanf.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j, zzanf.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j, zzanf.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j, zzanf.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzanf.zzr(obj, j, zzanf.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j, zzanf.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzanf.zzr(obj, j, zzanf.zzd(obj2, j));
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
                    int i4 = zzamd.zza;
                    zzanf.zzs(obj, j, zzalk.zzb(zzanf.zzf(obj, j), zzanf.zzf(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        zzanf.zzs(obj, j, zzanf.zzf(obj2, j));
                        zzI(obj, i3, i);
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
                    if (zzR(obj2, i3, i)) {
                        zzanf.zzs(obj, j, zzanf.zzf(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzamd.zzq(this.zzn, obj, obj2);
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
    /* JADX WARN: Code duplicated, block: B:216:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzh(Object obj, zzama zzamaVar, zzajx zzajxVar) throws Throwable {
        Object obj2;
        zzamv zzamvVar;
        int i;
        zzamv zzamvVar2;
        Object obj3;
        zzajy zzajyVar;
        zzajx zzajxVar2;
        int i2;
        Object obj4;
        Object obj5 = obj;
        zzajx zzajxVar3 = zzajxVar;
        zzajxVar.getClass();
        zzD(obj);
        zzamv zzamvVar3 = this.zzn;
        zzajy zzajyVar2 = this.zzo;
        Object objZzy = null;
        zzakc zzakcVarZzb = null;
        while (true) {
            try {
                int iZzc = zzamaVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    zzamvVar = zzamvVar3;
                    obj5 = obj5;
                    try {
                        int iZzu = zzu(iZzq);
                        try {
                            switch (zzt(iZzu)) {
                                case 0:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzo(obj5, iZzu & 1048575, zzamaVar.zza());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 1:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzp(obj5, iZzu & 1048575, zzamaVar.zzb());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 2:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzr(obj5, iZzu & 1048575, zzamaVar.zzl());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 3:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzr(obj5, iZzu & 1048575, zzamaVar.zzo());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 4:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzq(obj5, iZzu & 1048575, zzamaVar.zzg());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 5:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzr(obj5, iZzu & 1048575, zzamaVar.zzk());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 6:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzq(obj5, iZzu & 1048575, zzamaVar.zzf());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 7:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzm(obj5, iZzu & 1048575, zzamaVar.zzN());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 8:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzG(obj5, iZzu, zzamaVar);
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 9:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzalp zzalpVar = (zzalp) zzA(obj5, iZzq);
                                    zzamaVar.zzu(zzalpVar, zzx(iZzq), zzajxVar2);
                                    zzJ(obj5, iZzq, zzalpVar);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 10:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzs(obj5, iZzu & 1048575, zzamaVar.zzp());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 11:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzq(obj5, iZzu & 1048575, zzamaVar.zzj());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 12:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    int iZze = zzamaVar.zze();
                                    zzako zzakoVarZzw = zzw(iZzq);
                                    if (zzakoVarZzw != null && !zzakoVarZzw.zza()) {
                                        objZzy = zzamd.zzp(obj5, iZzc, iZze, obj4, zzamvVar);
                                        zzajyVar2 = zzajyVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzamvVar3 = zzamvVar;
                                    }
                                    zzanf.zzq(obj5, iZzu & 1048575, iZze);
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 13:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzq(obj5, iZzu & 1048575, zzamaVar.zzh());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 14:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzr(obj5, iZzu & 1048575, zzamaVar.zzm());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 15:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzq(obj5, iZzu & 1048575, zzamaVar.zzi());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 16:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzanf.zzr(obj5, iZzu & 1048575, zzamaVar.zzn());
                                    zzH(obj5, iZzq);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 17:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzalp zzalpVar2 = (zzalp) zzA(obj5, iZzq);
                                    zzamaVar.zzt(zzalpVar2, zzx(iZzq), zzajxVar2);
                                    zzJ(obj5, iZzq, zzalpVar2);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 18:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzx(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 19:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzB(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 20:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzE(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 21:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzM(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 22:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzD(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 23:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzA(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 24:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzz(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 25:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzv(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 26:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    if (zzM(iZzu)) {
                                        ((zzajm) zzamaVar).zzK(this.zzm.zza(obj5, iZzu & 1048575), true);
                                    } else {
                                        ((zzajm) zzamaVar).zzK(this.zzm.zza(obj5, iZzu & 1048575), false);
                                    }
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 27:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzF(this.zzm.zza(obj5, iZzu & 1048575), zzx(iZzq), zzajxVar2);
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 28:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzw(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 29:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzL(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 30:
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    List listZza = this.zzm.zza(obj5, iZzu & 1048575);
                                    zzamaVar.zzy(listZza);
                                    objZzy = zzamd.zzo(obj, iZzc, listZza, zzw(iZzq), objZzy, zzamvVar);
                                    zzajyVar2 = zzajyVar;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 31:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzG(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 32:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzH(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 33:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzI(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 34:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzJ(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 35:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzx(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 36:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzB(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 37:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzE(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 38:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzM(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 39:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzD(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 40:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzA(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 41:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzz(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 42:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzv(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 43:
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzamaVar.zzL(this.zzm.zza(obj5, iZzu & 1048575));
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 44:
                                    List listZza2 = this.zzm.zza(obj5, iZzu & 1048575);
                                    zzamaVar.zzy(listZza2);
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    objZzy = zzamd.zzo(obj, iZzc, listZza2, zzw(iZzq), objZzy, zzamvVar);
                                    zzajyVar2 = zzajyVar;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 45:
                                    zzamaVar.zzG(this.zzm.zza(obj5, iZzu & 1048575));
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 46:
                                    zzamaVar.zzH(this.zzm.zza(obj5, iZzu & 1048575));
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 47:
                                    zzamaVar.zzI(this.zzm.zza(obj5, iZzu & 1048575));
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 48:
                                    zzamaVar.zzJ(this.zzm.zza(obj5, iZzu & 1048575));
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 49:
                                    zzamaVar.zzC(this.zzm.zza(obj5, iZzu & 1048575), zzx(iZzq), zzajxVar3);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 50:
                                    Object objZzz = zzz(iZzq);
                                    long jZzu = zzu(iZzq) & 1048575;
                                    Object objZzf = zzanf.zzf(obj5, jZzu);
                                    if (objZzf == null) {
                                        objZzf = zzalj.zza().zzb();
                                        zzanf.zzs(obj5, jZzu, objZzf);
                                    } else if (zzalk.zza(objZzf)) {
                                        Object objZzb = zzalj.zza().zzb();
                                        zzalk.zzb(objZzb, objZzf);
                                        zzanf.zzs(obj5, jZzu, objZzb);
                                        objZzf = objZzb;
                                    }
                                    throw null;
                                case 51:
                                    zzanf.zzs(obj5, iZzu & 1048575, Double.valueOf(zzamaVar.zza()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 52:
                                    zzanf.zzs(obj5, iZzu & 1048575, Float.valueOf(zzamaVar.zzb()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 53:
                                    zzanf.zzs(obj5, iZzu & 1048575, Long.valueOf(zzamaVar.zzl()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 54:
                                    zzanf.zzs(obj5, iZzu & 1048575, Long.valueOf(zzamaVar.zzo()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 55:
                                    zzanf.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzamaVar.zzg()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 56:
                                    zzanf.zzs(obj5, iZzu & 1048575, Long.valueOf(zzamaVar.zzk()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 57:
                                    zzanf.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzamaVar.zzf()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 58:
                                    zzanf.zzs(obj5, iZzu & 1048575, Boolean.valueOf(zzamaVar.zzN()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 59:
                                    zzG(obj5, iZzu, zzamaVar);
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 60:
                                    zzalp zzalpVar3 = (zzalp) zzB(obj5, iZzc, iZzq);
                                    zzamaVar.zzu(zzalpVar3, zzx(iZzq), zzajxVar3);
                                    zzK(obj5, iZzc, iZzq, zzalpVar3);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 61:
                                    zzanf.zzs(obj5, iZzu & 1048575, zzamaVar.zzp());
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 62:
                                    zzanf.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzamaVar.zzj()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 63:
                                    int iZze2 = zzamaVar.zze();
                                    zzako zzakoVarZzw2 = zzw(iZzq);
                                    if (zzakoVarZzw2 == null || zzakoVarZzw2.zza()) {
                                        zzanf.zzs(obj5, iZzu & 1048575, Integer.valueOf(iZze2));
                                        zzI(obj5, iZzc, iZzq);
                                        obj4 = objZzy;
                                        zzajyVar = zzajyVar2;
                                        zzajxVar2 = zzajxVar3;
                                        zzajyVar2 = zzajyVar;
                                        objZzy = obj4;
                                        zzajxVar3 = zzajxVar2;
                                    } else {
                                        objZzy = zzamd.zzp(obj5, iZzc, iZze2, objZzy, zzamvVar);
                                        obj5 = obj5;
                                    }
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 64:
                                    zzanf.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzamaVar.zzh()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 65:
                                    zzanf.zzs(obj5, iZzu & 1048575, Long.valueOf(zzamaVar.zzm()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 66:
                                    zzanf.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzamaVar.zzi()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 67:
                                    zzanf.zzs(obj5, iZzu & 1048575, Long.valueOf(zzamaVar.zzn()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                case 68:
                                    zzalp zzalpVar4 = (zzalp) zzB(obj5, iZzc, iZzq);
                                    zzamaVar.zzt(zzalpVar4, zzx(iZzq), zzajxVar3);
                                    zzK(obj5, iZzc, iZzq, zzalpVar4);
                                    obj4 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    zzajyVar2 = zzajyVar;
                                    objZzy = obj4;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                                default:
                                    obj2 = objZzy;
                                    zzajyVar = zzajyVar2;
                                    zzajxVar2 = zzajxVar3;
                                    if (obj2 == null) {
                                        try {
                                            objZzy = zzamvVar.zzc(obj5);
                                        } catch (zzakr unused) {
                                            objZzy = obj2;
                                            zzamvVar.zzq(zzamaVar);
                                            if (objZzy == null) {
                                                objZzy = zzamvVar.zzc(obj5);
                                            }
                                            if (!zzamvVar.zzp(objZzy, zzamaVar)) {
                                                for (i2 = this.zzk; i2 < this.zzl; i2++) {
                                                    objZzy = zzy(obj, this.zzj[i2], objZzy, zzamvVar, obj);
                                                }
                                                if (objZzy != null) {
                                                    zzamvVar.zzn(obj5, objZzy);
                                                    return;
                                                }
                                                return;
                                            }
                                            zzajyVar2 = zzajyVar;
                                            zzajxVar3 = zzajxVar2;
                                            zzamvVar3 = zzamvVar;
                                        } catch (Throwable th) {
                                            th = th;
                                            objZzy = obj2;
                                        }
                                    } else {
                                        objZzy = obj2;
                                    }
                                    try {
                                        try {
                                            if (!zzamvVar.zzp(objZzy, zzamaVar)) {
                                                for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                                    objZzy = zzy(obj, this.zzj[i3], objZzy, zzamvVar, obj);
                                                }
                                                if (objZzy != null) {
                                                    zzamvVar.zzn(obj5, objZzy);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (zzakr unused2) {
                                        zzamvVar.zzq(zzamaVar);
                                        if (objZzy == null) {
                                            objZzy = zzamvVar.zzc(obj5);
                                        }
                                        if (!zzamvVar.zzp(objZzy, zzamaVar)) {
                                            while (i2 < this.zzl) {
                                                objZzy = zzy(obj, this.zzj[i2], objZzy, zzamvVar, obj);
                                            }
                                            if (objZzy != null) {
                                                zzamvVar.zzn(obj5, objZzy);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    zzajyVar2 = zzajyVar;
                                    zzajxVar3 = zzajxVar2;
                                    zzamvVar3 = zzamvVar;
                                    break;
                            }
                        } catch (zzakr unused3) {
                            obj2 = objZzy;
                            zzajyVar = zzajyVar2;
                            zzajxVar2 = zzajxVar3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = objZzy;
                    }
                } else {
                    if (iZzc == Integer.MAX_VALUE) {
                        for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                            objZzy = zzy(obj, this.zzj[i4], objZzy, zzamvVar3, obj);
                        }
                        if (objZzy != null) {
                            zzamvVar3.zzn(obj5, objZzy);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objZzc = !this.zzh ? null : zzajyVar2.zzc(zzajxVar3, this.zzg, iZzc);
                        if (objZzc != null) {
                            if (zzakcVarZzb == null) {
                                zzakcVarZzb = zzajyVar2.zzb(obj5);
                            }
                            zzakc zzakcVar = zzakcVarZzb;
                            zzamvVar2 = zzamvVar3;
                            obj3 = obj5;
                            try {
                                objZzy = zzajyVar2.zzd(obj, zzamaVar, objZzc, zzajxVar, zzakcVar, objZzy, zzamvVar2);
                                zzakcVarZzb = zzakcVar;
                            } catch (Throwable th4) {
                                th = th4;
                                obj5 = obj3;
                                zzamvVar = zzamvVar2;
                                obj2 = objZzy;
                                objZzy = obj2;
                                for (i = this.zzk; i < this.zzl; i++) {
                                    objZzy = zzy(obj, this.zzj[i], objZzy, zzamvVar, obj);
                                }
                                if (objZzy != null) {
                                    zzamvVar.zzn(obj5, objZzy);
                                }
                                throw th;
                            }
                        } else {
                            zzamvVar2 = zzamvVar3;
                            obj3 = obj5;
                            zzamvVar2.zzq(zzamaVar);
                            if (objZzy == null) {
                                objZzy = zzamvVar2.zzc(obj3);
                            }
                            try {
                                if (!zzamvVar2.zzp(objZzy, zzamaVar)) {
                                    int i5 = this.zzk;
                                    while (i5 < this.zzl) {
                                        zzamv zzamvVar4 = zzamvVar2;
                                        objZzy = zzy(obj, this.zzj[i5], objZzy, zzamvVar4, obj);
                                        i5++;
                                        obj3 = obj3;
                                        zzamvVar2 = zzamvVar4;
                                    }
                                    Object obj6 = obj3;
                                    zzamv zzamvVar5 = zzamvVar2;
                                    if (objZzy != null) {
                                        zzamvVar5.zzn(obj6, objZzy);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj5 = obj3;
                                zzamvVar = zzamvVar2;
                            }
                        }
                        obj5 = obj3;
                        zzamvVar3 = zzamvVar2;
                    } catch (Throwable th6) {
                        th = th6;
                        zzamvVar = zzamvVar3;
                        obj5 = obj5;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                obj2 = objZzy;
                zzamvVar = zzamvVar3;
                obj5 = obj5;
            }
            objZzy = obj2;
            while (i < this.zzl) {
                objZzy = zzy(obj, this.zzj[i], objZzy, zzamvVar, obj);
            }
            if (objZzy != null) {
                zzamvVar.zzn(obj5, objZzy);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzais zzaisVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzaisVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzs;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzanf.zza(obj, j)) != Double.doubleToLongBits(zzanf.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzanf.zzb(obj, j)) != Float.floatToIntBits(zzanf.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzanf.zzd(obj, j) != zzanf.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzanf.zzd(obj, j) != zzanf.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j) != zzanf.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzanf.zzd(obj, j) != zzanf.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j) != zzanf.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzanf.zzw(obj, j) != zzanf.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzamd.zzs(zzanf.zzf(obj, j), zzanf.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzamd.zzs(zzanf.zzf(obj, j), zzanf.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzamd.zzs(zzanf.zzf(obj, j), zzanf.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j) != zzanf.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j) != zzanf.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j) != zzanf.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzanf.zzd(obj, j) != zzanf.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j) != zzanf.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzanf.zzd(obj, j) != zzanf.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzamd.zzs(zzanf.zzf(obj, j), zzanf.zzf(obj2, j))) {
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
                    zZzs = zzamd.zzs(zzanf.zzf(obj, j), zzanf.zzf(obj2, j));
                    break;
                case 50:
                    zZzs = zzamd.zzs(zzanf.zzf(obj, j), zzanf.zzf(obj2, j));
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
                    if (zzanf.zzc(obj, jZzr) != zzanf.zzc(obj2, jZzr) || !zzamd.zzs(zzanf.zzf(obj, j), zzanf.zzf(obj2, j))) {
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
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zzamb zzambVarZzx;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i6];
            int i8 = iArr2[i7];
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
                list = (List) zzanf.zzf(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzambVarZzx = zzx(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzambVarZzx.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj, i8, i7) && !zzP(obj, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzanf.zzf(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzambVarZzx = zzx(i7);
                    while (i3 < list.size()) {
                        if (!zzambVarZzx.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzalj) zzanf.zzf(obj, iZzu & 1048575)).isEmpty()) {
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzm(Object obj, zzajt zzajtVar) throws IOException {
        int i;
        int i2;
        int i3;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < iArr.length) {
            int iZzu = zzu(i7);
            int[] iArr2 = this.zzc;
            int iZzt = zzt(iZzu);
            int i8 = iArr2[i7];
            if (iZzt <= 17) {
                int i9 = iArr2[i7 + 2];
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
                        zzajtVar.zzf(i8, zzanf.zza(obj, j));
                    }
                    break;
                case 1:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzo(i8, zzanf.zzb(obj, j));
                    }
                    break;
                case 2:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzt(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzJ(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzr(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzm(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzk(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzb(i8, zzanf.zzw(obj, j));
                    }
                    break;
                case 8:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzT(i8, unsafe.getObject(obj, j), zzajtVar);
                    }
                    break;
                case 9:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzv(i8, unsafe.getObject(obj, j), zzx(i7));
                    }
                    break;
                case 10:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzd(i8, (zzajf) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzH(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzi(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzw(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzy(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzA(i8, unsafe.getInt(obj, j));
                    }
                    break;
                case 16:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzC(i8, unsafe.getLong(obj, j));
                    }
                    break;
                case 17:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzajtVar.zzq(i8, unsafe.getObject(obj, j), zzx(i7));
                    }
                    break;
                case 18:
                    zzamd.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 19:
                    zzamd.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 20:
                    zzamd.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 21:
                    zzamd.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 22:
                    zzamd.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 23:
                    zzamd.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 24:
                    zzamd.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 25:
                    zzamd.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 26:
                    int i11 = this.zzc[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzamd.zza;
                    if (list != null && !list.isEmpty()) {
                        zzajtVar.zzG(i11, list);
                    }
                    break;
                case 27:
                    int i13 = this.zzc[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzamb zzambVarZzx = zzx(i7);
                    int i14 = zzamd.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            zzajtVar.zzv(i13, list2.get(i15), zzambVarZzx);
                        }
                    }
                    break;
                case 28:
                    int i16 = this.zzc[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzamd.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzajtVar.zze(i16, list3);
                    }
                    break;
                case 29:
                    zzamd.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 30:
                    zzamd.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 31:
                    zzamd.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 32:
                    zzamd.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 33:
                    zzamd.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 34:
                    zzamd.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, false);
                    break;
                case 35:
                    zzamd.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 36:
                    zzamd.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 37:
                    zzamd.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 38:
                    zzamd.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 39:
                    zzamd.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 40:
                    zzamd.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 41:
                    zzamd.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 42:
                    zzamd.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 43:
                    zzamd.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 44:
                    zzamd.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 45:
                    zzamd.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 46:
                    zzamd.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 47:
                    zzamd.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 48:
                    zzamd.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzajtVar, true);
                    break;
                case 49:
                    int i18 = this.zzc[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzamb zzambVarZzx2 = zzx(i7);
                    int i19 = zzamd.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            zzajtVar.zzq(i18, list4.get(i20), zzambVarZzx2);
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
                        zzajtVar.zzf(i8, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzo(i8, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzt(i8, zzv(obj, j));
                    }
                    break;
                case 54:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzJ(i8, zzv(obj, j));
                    }
                    break;
                case 55:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzr(i8, zzp(obj, j));
                    }
                    break;
                case 56:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzm(i8, zzv(obj, j));
                    }
                    break;
                case 57:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzk(i8, zzp(obj, j));
                    }
                    break;
                case 58:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzb(i8, zzS(obj, j));
                    }
                    break;
                case 59:
                    if (zzR(obj, i8, i7)) {
                        zzT(i8, unsafe.getObject(obj, j), zzajtVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzv(i8, unsafe.getObject(obj, j), zzx(i7));
                    }
                    break;
                case 61:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzd(i8, (zzajf) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzH(i8, zzp(obj, j));
                    }
                    break;
                case 63:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzi(i8, zzp(obj, j));
                    }
                    break;
                case 64:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzw(i8, zzp(obj, j));
                    }
                    break;
                case 65:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzy(i8, zzv(obj, j));
                    }
                    break;
                case 66:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzA(i8, zzp(obj, j));
                    }
                    break;
                case 67:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzC(i8, zzv(obj, j));
                    }
                    break;
                case 68:
                    if (zzR(obj, i8, i7)) {
                        zzajtVar.zzq(i8, unsafe.getObject(obj, j), zzx(i7));
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        zzamv zzamvVar = this.zzn;
        zzamvVar.zzr(zzamvVar.zzd(obj), zzajtVar);
    }
}
