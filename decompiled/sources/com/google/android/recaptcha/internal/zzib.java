package com.google.android.recaptcha.internal;

import com.google.android.gms.drive.DriveFile;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzib<T> implements zzil<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhy zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzhm zzn;
    private final zzjf zzo;
    private final zzga zzp;
    private final zzie zzq;
    private final zzht zzr;

    private zzib(int[] iArr, Object[] objArr, int i, int i2, zzhy zzhyVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzie zzieVar, zzhm zzhmVar, zzjf zzjfVar, zzga zzgaVar, zzht zzhtVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzhyVar instanceof zzgo;
        this.zzj = z;
        boolean z3 = false;
        if (zzgaVar != null && zzgaVar.zzj(zzhyVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzieVar;
        this.zzn = zzhmVar;
        this.zzo = zzjfVar;
        this.zzp = zzgaVar;
        this.zzg = zzhyVar;
        this.zzr = zzhtVar;
    }

    private static long zzA(Object obj, long j) {
        return ((Long) zzjp.zzf(obj, j)).longValue();
    }

    private final zzgs zzB(int i) {
        int i2 = i / 3;
        return (zzgs) this.zzd[i2 + i2 + 1];
    }

    private final zzil zzC(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzil zzilVar = (zzil) this.zzd[i3];
        if (zzilVar != null) {
            return zzilVar;
        }
        zzil zzilVarZzb = zzih.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzilVarZzb;
        return zzilVarZzb;
    }

    private final Object zzD(Object obj, int i, Object obj2, zzjf zzjfVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzf = zzjp.zzf(obj, zzz(i) & 1048575);
        if (objZzf == null || zzB(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzE(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzF(Object obj, int i) {
        zzil zzilVarZzC = zzC(i);
        int iZzz = zzz(i) & 1048575;
        if (!zzT(obj, i)) {
            return zzilVarZzC.zze();
        }
        Object object = zzb.getObject(obj, iZzz);
        if (zzW(object)) {
            return object;
        }
        Object objZze = zzilVarZzC.zze();
        if (object != null) {
            zzilVarZzC.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzG(Object obj, int i, int i2) {
        zzil zzilVarZzC = zzC(i2);
        if (!zzX(obj, i, i2)) {
            return zzilVarZzC.zze();
        }
        Object object = zzb.getObject(obj, zzz(i2) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object objZze = zzilVarZzC.zze();
        if (object != null) {
            zzilVarZzC.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzH(Class cls, String str) {
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

    private static void zzI(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        if (zzT(obj2, i)) {
            int iZzz = zzz(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzz;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzil zzilVarZzC = zzC(i);
            if (!zzT(obj, i)) {
                if (zzW(object)) {
                    Object objZze = zzilVarZzC.zze();
                    zzilVarZzC.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzW(object2)) {
                Object objZze2 = zzilVarZzC.zze();
                zzilVarZzC.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzilVarZzC.zzg(object2, object);
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzX(obj2, i2, i)) {
            int iZzz = zzz(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzz;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzil zzilVarZzC = zzC(i);
            if (!zzX(obj, i2, i)) {
                if (zzW(object)) {
                    Object objZze = zzilVarZzC.zze();
                    zzilVarZzC.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzW(object2)) {
                Object objZze2 = zzilVarZzC.zze();
                zzilVarZzC.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzilVarZzC.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, int i, zzik zzikVar) throws IOException {
        if (zzS(i)) {
            zzjp.zzs(obj, i & 1048575, zzikVar.zzs());
        } else if (this.zzi) {
            zzjp.zzs(obj, i & 1048575, zzikVar.zzr());
        } else {
            zzjp.zzs(obj, i & 1048575, zzikVar.zzp());
        }
    }

    private final void zzM(Object obj, int i) {
        int iZzw = zzw(i);
        long j = 1048575 & iZzw;
        if (j == 1048575) {
            return;
        }
        zzjp.zzq(obj, j, (1 << (iZzw >>> 20)) | zzjp.zzc(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzjp.zzq(obj, zzw(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzz(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzz(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    private final void zzQ(zzjx zzjxVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzR(Object obj, Object obj2, int i) {
        return zzT(obj, i) == zzT(obj2, i);
    }

    private static boolean zzS(int i) {
        return (i & DriveFile.MODE_WRITE_ONLY) != 0;
    }

    private final boolean zzT(Object obj, int i) {
        int iZzw = zzw(i);
        long j = iZzw & 1048575;
        if (j != 1048575) {
            return (zzjp.zzc(obj, j) & (1 << (iZzw >>> 20))) != 0;
        }
        int iZzz = zzz(i);
        long j2 = iZzz & 1048575;
        switch (zzy(iZzz)) {
            case 0:
                return Double.doubleToRawLongBits(zzjp.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzjp.zzb(obj, j2)) != 0;
            case 2:
                return zzjp.zzd(obj, j2) != 0;
            case 3:
                return zzjp.zzd(obj, j2) != 0;
            case 4:
                return zzjp.zzc(obj, j2) != 0;
            case 5:
                return zzjp.zzd(obj, j2) != 0;
            case 6:
                return zzjp.zzc(obj, j2) != 0;
            case 7:
                return zzjp.zzw(obj, j2);
            case 8:
                Object objZzf = zzjp.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzez) {
                    return !zzez.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzjp.zzf(obj, j2) != null;
            case 10:
                return !zzez.zzb.equals(zzjp.zzf(obj, j2));
            case 11:
                return zzjp.zzc(obj, j2) != 0;
            case 12:
                return zzjp.zzc(obj, j2) != 0;
            case 13:
                return zzjp.zzc(obj, j2) != 0;
            case 14:
                return zzjp.zzd(obj, j2) != 0;
            case 15:
                return zzjp.zzc(obj, j2) != 0;
            case 16:
                return zzjp.zzd(obj, j2) != 0;
            case 17:
                return zzjp.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzT(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzV(Object obj, int i, zzil zzilVar) {
        return zzilVar.zzl(zzjp.zzf(obj, i & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgo) {
            return ((zzgo) obj).zzF();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i, int i2) {
        return zzjp.zzc(obj, (long) (zzw(i2) & 1048575)) == i;
    }

    private static boolean zzY(Object obj, long j) {
        return ((Boolean) zzjp.zzf(obj, j)).booleanValue();
    }

    private static final void zzZ(int i, Object obj, zzjx zzjxVar) throws IOException {
        if (obj instanceof String) {
            zzjxVar.zzG(i, (String) obj);
        } else {
            zzjxVar.zzd(i, (zzez) obj);
        }
    }

    static zzjg zzd(Object obj) {
        zzgo zzgoVar = (zzgo) obj;
        zzjg zzjgVar = zzgoVar.zzc;
        if (zzjgVar != zzjg.zzc()) {
            return zzjgVar;
        }
        zzjg zzjgVarZzf = zzjg.zzf();
        zzgoVar.zzc = zzjgVarZzf;
        return zzjgVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x026c  */
    /* JADX WARN: Code duplicated, block: B:125:0x026f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0284  */
    /* JADX WARN: Code duplicated, block: B:129:0x0287  */
    /* JADX WARN: Code duplicated, block: B:178:0x036e  */
    static zzib zzm(Class cls, zzhv zzhvVar, zzie zzieVar, zzhm zzhmVar, zzjf zzjfVar, zzga zzgaVar, zzht zzhtVar) {
        int i;
        int iCharAt;
        int iCharAt2;
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
        int iObjectFieldOffset;
        int i17;
        int i18;
        int iObjectFieldOffset2;
        int iObjectFieldOffset3;
        Field fieldZzH;
        char cCharAt9;
        int i19;
        int i20;
        int i21;
        int i22;
        Object obj;
        Field fieldZzH2;
        int i23;
        Object obj2;
        Field fieldZzH3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        if (!(zzhvVar instanceof zzij)) {
            throw null;
        }
        zzij zzijVar = (zzij) zzhvVar;
        int iZzc = zzijVar.zzc();
        String strZzd = zzijVar.zzd();
        int length = strZzd.length();
        int i28 = 0;
        int i29 = 55296;
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
        int iCharAt3 = strZzd.charAt(i);
        if (iCharAt3 >= 55296) {
            int i32 = iCharAt3 & 8191;
            int i33 = 13;
            while (true) {
                i27 = i31 + 1;
                cCharAt13 = strZzd.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i27;
            }
            iCharAt3 = i32 | (cCharAt13 << i33);
            i31 = i27;
        }
        if (iCharAt3 == 0) {
            iArr = zza;
            i2 = 0;
            i3 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i5 = 0;
            i4 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt4 = strZzd.charAt(i31);
            if (iCharAt4 >= 55296) {
                int i35 = iCharAt4 & 8191;
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
                iCharAt4 = i35 | (cCharAt8 << i36);
                i34 = i13;
            }
            int i37 = i34 + 1;
            int iCharAt5 = strZzd.charAt(i34);
            if (iCharAt5 >= 55296) {
                int i38 = iCharAt5 & 8191;
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
                iCharAt5 = i38 | (cCharAt7 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            int iCharAt6 = strZzd.charAt(i37);
            if (iCharAt6 >= 55296) {
                int i41 = iCharAt6 & 8191;
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
                iCharAt6 = i41 | (cCharAt6 << i42);
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
            iCharAt = strZzd.charAt(i43);
            if (iCharAt >= 55296) {
                int i47 = iCharAt & 8191;
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
                iCharAt = i47 | (cCharAt4 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            iCharAt2 = strZzd.charAt(i46);
            if (iCharAt2 >= 55296) {
                int i50 = iCharAt2 & 8191;
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
                iCharAt2 = i50 | (cCharAt3 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int iCharAt8 = strZzd.charAt(i49);
            if (iCharAt8 >= 55296) {
                int i53 = iCharAt8 & 8191;
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
                iCharAt8 = i53 | (cCharAt2 << i54);
                i52 = i7;
            }
            int i55 = i52 + 1;
            int iCharAt9 = strZzd.charAt(i52);
            if (iCharAt9 >= 55296) {
                int i56 = iCharAt9 & 8191;
                int i57 = i55;
                int i58 = 13;
                while (true) {
                    i6 = i57 + 1;
                    cCharAt = strZzd.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i57 = i6;
                }
                iCharAt9 = i56 | (cCharAt << i58);
                i55 = i6;
            }
            int i59 = iCharAt9 + iCharAt2 + iCharAt8;
            int i60 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[i59];
            i28 = iCharAt4;
            iArr = iArr2;
            i2 = iCharAt6;
            i3 = i60;
            i4 = iCharAt9;
            i31 = i55;
            i5 = iCharAt7;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzijVar.zze();
        Class<?> cls2 = zzijVar.zza().getClass();
        int i61 = i4 + iCharAt2;
        int i62 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i62];
        int i63 = i4;
        int i64 = i61;
        int i65 = 0;
        int i66 = 0;
        while (true) {
            boolean z = iZzc == 2;
            if (i31 >= length) {
                return new zzib(iArr3, objArr, i2, i5, zzijVar.zza(), z, false, iArr, i4, i61, zzieVar, zzhmVar, zzjfVar, zzgaVar, zzhtVar);
            }
            int i67 = i31 + 1;
            int iCharAt10 = strZzd.charAt(i31);
            if (iCharAt10 >= i29) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i26 = i69 + 1;
                    cCharAt12 = strZzd.charAt(i69);
                    i14 = iZzc;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i26;
                    iZzc = i14;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i15 = i26;
            } else {
                i14 = iZzc;
                i15 = i67;
            }
            int i71 = i15 + 1;
            int iCharAt11 = strZzd.charAt(i15);
            int i72 = length;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i73 = iCharAt11 & 8191;
                int i74 = 13;
                while (true) {
                    i25 = i71 + 1;
                    cCharAt11 = strZzd.charAt(i71);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i71 = i25;
                    c = 55296;
                }
                iCharAt11 = i73 | (cCharAt11 << i74);
                i71 = i25;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int i75 = iCharAt11 & 255;
            int i76 = i5;
            if (i75 >= 51) {
                int i77 = i71 + 1;
                int iCharAt12 = strZzd.charAt(i71);
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i24 = i79 + 1;
                        cCharAt10 = strZzd.charAt(i79);
                        i16 = i2;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i80;
                        i80 += 13;
                        i79 = i24;
                        i2 = i16;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i80);
                    i20 = i24;
                } else {
                    i16 = i2;
                    i20 = i77;
                }
                int i81 = i75 - 51;
                int i82 = i20;
                if (i81 == 9 || i81 == 17) {
                    int i83 = i66 / 3;
                    i21 = i3 + 1;
                    objArr[i83 + i83 + 1] = objArrZze[i3];
                } else {
                    if (i81 == 12 && !z) {
                        int i84 = i66 / 3;
                        i21 = i3 + 1;
                        objArr[i84 + i84 + 1] = objArrZze[i3];
                    }
                    i22 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i22];
                    if (obj instanceof Field) {
                        fieldZzH2 = (Field) obj;
                    } else {
                        fieldZzH2 = zzH(cls2, (String) obj);
                        objArrZze[i22] = fieldZzH2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzH2);
                    i23 = i22 + 1;
                    obj2 = objArrZze[i23];
                    if (obj2 instanceof Field) {
                        fieldZzH3 = (Field) obj2;
                    } else {
                        fieldZzH3 = zzH(cls2, (String) obj2);
                        objArrZze[i23] = fieldZzH3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzH3);
                    objArrZze = objArrZze;
                    i17 = i82;
                    i18 = 0;
                }
                i3 = i21;
                i22 = iCharAt12 + iCharAt12;
                obj = objArrZze[i22];
                if (obj instanceof Field) {
                    fieldZzH2 = (Field) obj;
                } else {
                    fieldZzH2 = zzH(cls2, (String) obj);
                    objArrZze[i22] = fieldZzH2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzH2);
                i23 = i22 + 1;
                obj2 = objArrZze[i23];
                if (obj2 instanceof Field) {
                    fieldZzH3 = (Field) obj2;
                } else {
                    fieldZzH3 = zzH(cls2, (String) obj2);
                    objArrZze[i23] = fieldZzH3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzH3);
                objArrZze = objArrZze;
                i17 = i82;
                i18 = 0;
            } else {
                i16 = i2;
                int i85 = i3 + 1;
                Field fieldZzH4 = zzH(cls2, (String) objArrZze[i3]);
                if (i75 == 9 || i75 == 17) {
                    int i86 = i66 / 3;
                    objArr[i86 + i86 + 1] = fieldZzH4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        int i87 = i66 / 3;
                        i19 = i85 + 1;
                        objArr[i87 + i87 + 1] = objArrZze[i85];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        if (!z) {
                            int i88 = i66 / 3;
                            i19 = i85 + 1;
                            objArr[i88 + i88 + 1] = objArrZze[i85];
                        }
                    } else if (i75 == 50) {
                        int i89 = i63 + 1;
                        iArr[i63] = i66;
                        int i90 = i66 / 3;
                        int i91 = i85 + 1;
                        int i92 = i90 + i90;
                        objArr[i92] = objArrZze[i85];
                        if ((iCharAt11 & 2048) != 0) {
                            i85 = i91 + 1;
                            objArr[i92 + 1] = objArrZze[i91];
                            i63 = i89;
                        } else {
                            i85 = i91;
                            i63 = i89;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzH4);
                        int iObjectFieldOffset4 = 1048575;
                        if ((iCharAt11 & 4096) == 4096 || i75 > 17) {
                            i17 = i71;
                            i18 = 0;
                        } else {
                            int i93 = i71 + 1;
                            int iCharAt13 = strZzd.charAt(i71);
                            if (iCharAt13 >= 55296) {
                                int i94 = iCharAt13 & 8191;
                                int i95 = 13;
                                while (true) {
                                    i17 = i93 + 1;
                                    cCharAt9 = strZzd.charAt(i93);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i94 |= (cCharAt9 & 8191) << i95;
                                    i95 += 13;
                                    i93 = i17;
                                }
                                iCharAt13 = i94 | (cCharAt9 << i95);
                            } else {
                                i17 = i93;
                            }
                            int i96 = i28 + i28 + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i96];
                            if (obj3 instanceof Field) {
                                fieldZzH = (Field) obj3;
                            } else {
                                fieldZzH = zzH(cls2, (String) obj3);
                                objArrZze[i96] = fieldZzH;
                            }
                            i18 = iCharAt13 % 32;
                            iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzH);
                        }
                        if (i75 >= 18 && i75 <= 49) {
                            iArr[i64] = iObjectFieldOffset;
                            i64++;
                        }
                        i3 = i85;
                        iObjectFieldOffset2 = iObjectFieldOffset;
                        iObjectFieldOffset3 = iObjectFieldOffset4;
                    }
                    i85 = i19;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzH4);
                int iObjectFieldOffset5 = 1048575;
                if ((iCharAt11 & 4096) == 4096) {
                    i17 = i71;
                    i18 = 0;
                } else {
                    i17 = i71;
                    i18 = 0;
                }
                if (i75 >= 18) {
                    iArr[i64] = iObjectFieldOffset;
                    i64++;
                }
                i3 = i85;
                iObjectFieldOffset2 = iObjectFieldOffset;
                iObjectFieldOffset3 = iObjectFieldOffset5;
            }
            int i97 = i66 + 1;
            iArr3[i66] = iCharAt10;
            int i98 = i97 + 1;
            iArr3[i97] = ((iCharAt11 & 256) != 0 ? DriveFile.MODE_READ_ONLY : 0) | ((iCharAt11 & 512) != 0 ? DriveFile.MODE_WRITE_ONLY : 0) | (i75 << 20) | iObjectFieldOffset2;
            i66 = i98 + 1;
            iArr3[i98] = (i18 << 20) | iObjectFieldOffset3;
            objArrZze = objArrZze;
            length = i72;
            i31 = i17;
            i5 = i76;
            iZzc = i14;
            i2 = i16;
            i29 = 55296;
        }
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzjp.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzjp.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int iZzy;
        int iZzy2;
        int iZzz;
        int iZzy3;
        int iZzy4;
        int iZzy5;
        int iZzy6;
        int iZzt;
        int iZzh;
        int iZzy7;
        int iZzy8;
        int iZzy9;
        int iZzy10;
        int iZzy11;
        int iZzy12;
        int iZzy13;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int iZzy14 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < this.zzc.length) {
            int iZzz2 = zzz(i3);
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int iZzy15 = zzy(iZzz2);
            if (iZzy15 <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                int i9 = i7 >>> 20;
                if (i8 != i4) {
                    i5 = unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << i9;
            } else {
                i = 0;
            }
            long j = iZzz2 & i2;
            switch (iZzy15) {
                case 0:
                    if ((i5 & i) != 0) {
                        iZzy = zzfk.zzy(i6 << 3);
                        iZzy4 = iZzy + 8;
                        iZzy14 += iZzy4;
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        iZzy2 = zzfk.zzy(i6 << 3);
                        iZzy4 = iZzy2 + 4;
                        iZzy14 += iZzy4;
                    }
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        iZzz = zzfk.zzz(unsafe.getLong(obj, j));
                        iZzy3 = zzfk.zzy(i6 << 3);
                        iZzy14 += iZzy3 + iZzz;
                    }
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        iZzz = zzfk.zzz(unsafe.getLong(obj, j));
                        iZzy3 = zzfk.zzy(i6 << 3);
                        iZzy14 += iZzy3 + iZzz;
                    }
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        iZzz = zzfk.zzu(unsafe.getInt(obj, j));
                        iZzy3 = zzfk.zzy(i6 << 3);
                        iZzy14 += iZzy3 + iZzz;
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        iZzy = zzfk.zzy(i6 << 3);
                        iZzy4 = iZzy + 8;
                        iZzy14 += iZzy4;
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        iZzy2 = zzfk.zzy(i6 << 3);
                        iZzy4 = iZzy2 + 4;
                        iZzy14 += iZzy4;
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        iZzy4 = zzfk.zzy(i6 << 3) + 1;
                        iZzy14 += iZzy4;
                    }
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzez) {
                            int i10 = zzfk.zzb;
                            int iZzd = ((zzez) object).zzd();
                            iZzy5 = zzfk.zzy(iZzd) + iZzd;
                            iZzy6 = zzfk.zzy(i6 << 3);
                            iZzy4 = iZzy6 + iZzy5;
                            iZzy14 += iZzy4;
                        } else {
                            iZzz = zzfk.zzx((String) object);
                            iZzy3 = zzfk.zzy(i6 << 3);
                            iZzy14 += iZzy3 + iZzz;
                        }
                    }
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        iZzy4 = zzin.zzn(i6, unsafe.getObject(obj, j), zzC(i3));
                        iZzy14 += iZzy4;
                    }
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        zzez zzezVar = (zzez) unsafe.getObject(obj, j);
                        int i11 = zzfk.zzb;
                        int iZzd2 = zzezVar.zzd();
                        iZzy5 = zzfk.zzy(iZzd2) + iZzd2;
                        iZzy6 = zzfk.zzy(i6 << 3);
                        iZzy4 = iZzy6 + iZzy5;
                        iZzy14 += iZzy4;
                    }
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        iZzz = zzfk.zzy(unsafe.getInt(obj, j));
                        iZzy3 = zzfk.zzy(i6 << 3);
                        iZzy14 += iZzy3 + iZzz;
                    }
                    break;
                case 12:
                    if ((i5 & i) != 0) {
                        iZzz = zzfk.zzu(unsafe.getInt(obj, j));
                        iZzy3 = zzfk.zzy(i6 << 3);
                        iZzy14 += iZzy3 + iZzz;
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        iZzy2 = zzfk.zzy(i6 << 3);
                        iZzy4 = iZzy2 + 4;
                        iZzy14 += iZzy4;
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        iZzy = zzfk.zzy(i6 << 3);
                        iZzy4 = iZzy + 8;
                        iZzy14 += iZzy4;
                    }
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzy3 = zzfk.zzy(i6 << 3);
                        iZzz = zzfk.zzy((i12 >> 31) ^ (i12 + i12));
                        iZzy14 += iZzy3 + iZzz;
                    }
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzy14 += zzfk.zzy(i6 << 3) + zzfk.zzz((j2 >> 63) ^ (j2 + j2));
                    }
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        iZzy4 = zzfk.zzt(i6, (zzhy) unsafe.getObject(obj, j), zzC(i3));
                        iZzy14 += iZzy4;
                    }
                    break;
                case 18:
                    iZzy4 = zzin.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzy4;
                    break;
                case 19:
                    iZzy4 = zzin.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzy4;
                    break;
                case 20:
                    iZzy4 = zzin.zzl(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzy4;
                    break;
                case 21:
                    iZzy4 = zzin.zzw(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzy4;
                    break;
                case 22:
                    iZzy4 = zzin.zzj(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzy4;
                    break;
                case 23:
                    iZzy4 = zzin.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzy4;
                    break;
                case 24:
                    iZzy4 = zzin.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzy4;
                    break;
                case 25:
                    iZzy4 = zzin.zza(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzy4;
                    break;
                case 26:
                    iZzt = zzin.zzt(i6, (List) unsafe.getObject(obj, j));
                    iZzy14 += iZzt;
                    break;
                case 27:
                    iZzt = zzin.zzo(i6, (List) unsafe.getObject(obj, j), zzC(i3));
                    iZzy14 += iZzt;
                    break;
                case 28:
                    iZzt = zzin.zzb(i6, (List) unsafe.getObject(obj, j));
                    iZzy14 += iZzt;
                    break;
                case 29:
                    iZzt = zzin.zzu(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzt;
                    break;
                case 30:
                    iZzt = zzin.zzc(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzt;
                    break;
                case 31:
                    iZzt = zzin.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzt;
                    break;
                case 32:
                    iZzt = zzin.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzt;
                    break;
                case 33:
                    iZzt = zzin.zzp(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzt;
                    break;
                case 34:
                    iZzt = zzin.zzr(i6, (List) unsafe.getObject(obj, j), false);
                    iZzy14 += iZzt;
                    break;
                case 35:
                    iZzh = zzin.zzh((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 36:
                    iZzh = zzin.zzf((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 37:
                    iZzh = zzin.zzm((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 38:
                    iZzh = zzin.zzx((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 39:
                    iZzh = zzin.zzk((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 40:
                    iZzh = zzin.zzh((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 41:
                    iZzh = zzin.zzf((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i13 = zzin.zza;
                    iZzh = list.size();
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 43:
                    iZzh = zzin.zzv((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 44:
                    iZzh = zzin.zzd((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 45:
                    iZzh = zzin.zzf((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 46:
                    iZzh = zzin.zzh((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 47:
                    iZzh = zzin.zzq((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 48:
                    iZzh = zzin.zzs((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzy7 = zzfk.zzy(iZzh);
                        iZzy8 = zzfk.zzy(i6 << 3);
                        iZzy9 = iZzy8 + iZzy7;
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 49:
                    iZzt = zzin.zzi(i6, (List) unsafe.getObject(obj, j), zzC(i3));
                    iZzy14 += iZzt;
                    break;
                case 50:
                    zzht.zza(i6, unsafe.getObject(obj, j), zzE(i3));
                    break;
                case 51:
                    if (zzX(obj, i6, i3)) {
                        iZzy10 = zzfk.zzy(i6 << 3);
                        iZzt = iZzy10 + 8;
                        iZzy14 += iZzt;
                    }
                    break;
                case 52:
                    if (zzX(obj, i6, i3)) {
                        iZzy11 = zzfk.zzy(i6 << 3);
                        iZzt = iZzy11 + 4;
                        iZzy14 += iZzt;
                    }
                    break;
                case 53:
                    if (zzX(obj, i6, i3)) {
                        iZzh = zzfk.zzz(zzA(obj, j));
                        iZzy9 = zzfk.zzy(i6 << 3);
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 54:
                    if (zzX(obj, i6, i3)) {
                        iZzh = zzfk.zzz(zzA(obj, j));
                        iZzy9 = zzfk.zzy(i6 << 3);
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 55:
                    if (zzX(obj, i6, i3)) {
                        iZzh = zzfk.zzu(zzq(obj, j));
                        iZzy9 = zzfk.zzy(i6 << 3);
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 56:
                    if (zzX(obj, i6, i3)) {
                        iZzy10 = zzfk.zzy(i6 << 3);
                        iZzt = iZzy10 + 8;
                        iZzy14 += iZzt;
                    }
                    break;
                case 57:
                    if (zzX(obj, i6, i3)) {
                        iZzy11 = zzfk.zzy(i6 << 3);
                        iZzt = iZzy11 + 4;
                        iZzy14 += iZzt;
                    }
                    break;
                case 58:
                    if (zzX(obj, i6, i3)) {
                        iZzt = zzfk.zzy(i6 << 3) + 1;
                        iZzy14 += iZzt;
                    }
                    break;
                case 59:
                    if (zzX(obj, i6, i3)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzez) {
                            int i14 = zzfk.zzb;
                            int iZzd3 = ((zzez) object2).zzd();
                            iZzy12 = zzfk.zzy(iZzd3) + iZzd3;
                            iZzy13 = zzfk.zzy(i6 << 3);
                            iZzt = iZzy13 + iZzy12;
                            iZzy14 += iZzt;
                        } else {
                            iZzh = zzfk.zzx((String) object2);
                            iZzy9 = zzfk.zzy(i6 << 3);
                            iZzy14 += iZzy9 + iZzh;
                        }
                    }
                    break;
                case 60:
                    if (zzX(obj, i6, i3)) {
                        iZzt = zzin.zzn(i6, unsafe.getObject(obj, j), zzC(i3));
                        iZzy14 += iZzt;
                    }
                    break;
                case 61:
                    if (zzX(obj, i6, i3)) {
                        zzez zzezVar2 = (zzez) unsafe.getObject(obj, j);
                        int i15 = zzfk.zzb;
                        int iZzd4 = zzezVar2.zzd();
                        iZzy12 = zzfk.zzy(iZzd4) + iZzd4;
                        iZzy13 = zzfk.zzy(i6 << 3);
                        iZzt = iZzy13 + iZzy12;
                        iZzy14 += iZzt;
                    }
                    break;
                case 62:
                    if (zzX(obj, i6, i3)) {
                        iZzh = zzfk.zzy(zzq(obj, j));
                        iZzy9 = zzfk.zzy(i6 << 3);
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 63:
                    if (zzX(obj, i6, i3)) {
                        iZzh = zzfk.zzu(zzq(obj, j));
                        iZzy9 = zzfk.zzy(i6 << 3);
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 64:
                    if (zzX(obj, i6, i3)) {
                        iZzy11 = zzfk.zzy(i6 << 3);
                        iZzt = iZzy11 + 4;
                        iZzy14 += iZzt;
                    }
                    break;
                case 65:
                    if (zzX(obj, i6, i3)) {
                        iZzy10 = zzfk.zzy(i6 << 3);
                        iZzt = iZzy10 + 8;
                        iZzy14 += iZzt;
                    }
                    break;
                case 66:
                    if (zzX(obj, i6, i3)) {
                        int iZzq = zzq(obj, j);
                        iZzy9 = zzfk.zzy(i6 << 3);
                        iZzh = zzfk.zzy((iZzq >> 31) ^ (iZzq + iZzq));
                        iZzy14 += iZzy9 + iZzh;
                    }
                    break;
                case 67:
                    if (zzX(obj, i6, i3)) {
                        long jZzA = zzA(obj, j);
                        iZzy14 += zzfk.zzy(i6 << 3) + zzfk.zzz((jZzA >> 63) ^ (jZzA + jZzA));
                    }
                    break;
                case 68:
                    if (zzX(obj, i6, i3)) {
                        iZzt = zzfk.zzt(i6, (zzhy) unsafe.getObject(obj, j), zzC(i3));
                        iZzy14 += iZzt;
                    }
                    break;
                default:
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        int iZza = 0;
        zzjf zzjfVar = this.zzo;
        int iZza2 = iZzy14 + zzjfVar.zza(zzjfVar.zzd(obj));
        if (!this.zzh) {
            return iZza2;
        }
        zzge zzgeVarZzb = this.zzp.zzb(obj);
        for (int i16 = 0; i16 < zzgeVarZzb.zza.zzb(); i16++) {
            Map.Entry entryZzg = zzgeVarZzb.zza.zzg(i16);
            iZza += zzge.zza((zzgd) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : zzgeVarZzb.zza.zzc()) {
            iZza += zzge.zza((zzgd) entry.getKey(), entry.getValue());
        }
        return iZza2 + iZza;
    }

    private static int zzq(Object obj, long j) {
        return ((Integer) zzjp.zzf(obj, j)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzem zzemVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzE = zzE(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzht.zzb(object)) {
            zzhs zzhsVarZzb = zzhs.zza().zzb();
            zzht.zzc(zzhsVarZzb, object);
            unsafe.putObject(obj, j, zzhsVarZzb);
        }
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzem zzemVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzen.zzq(bArr, i))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzen.zzb(bArr, i))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iZzm = zzen.zzm(bArr, i, zzemVar);
                unsafe.putObject(obj, j, Long.valueOf(zzemVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return iZzm;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iZzj = zzen.zzj(bArr, i, zzemVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzemVar.zza));
                unsafe.putInt(obj, j2, i4);
                return iZzj;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzen.zzq(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzen.zzb(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iZzm2 = zzen.zzm(bArr, i, zzemVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzemVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return iZzm2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZzj2 = zzen.zzj(bArr, i, zzemVar);
                int i13 = zzemVar.zza;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & DriveFile.MODE_WRITE_ONLY) != 0 && !zzju.zzf(bArr, iZzj2, iZzj2 + i13)) {
                        throw zzgy.zzd();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i13, zzgw.zzb));
                    iZzj2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iZzj2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objZzG = zzG(obj, i4, i8);
                int iZzo = zzen.zzo(objZzG, zzC(i8), bArr, i, i2, zzemVar);
                zzP(obj, i4, i8, objZzG);
                return iZzo;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iZza = zzen.zza(bArr, i, zzemVar);
                unsafe.putObject(obj, j, zzemVar.zzc);
                unsafe.putInt(obj, j2, i4);
                return iZza;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iZzj3 = zzen.zzj(bArr, i, zzemVar);
                int i14 = zzemVar.zza;
                zzgs zzgsVarZzB = zzB(i8);
                if (zzgsVarZzB == null || zzgsVarZzB.zza()) {
                    unsafe.putObject(obj, j, Integer.valueOf(i14));
                    unsafe.putInt(obj, j2, i4);
                } else {
                    zzd(obj).zzj(i3, Long.valueOf(i14));
                }
                return iZzj3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iZzj4 = zzen.zzj(bArr, i, zzemVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzff.zzF(zzemVar.zza)));
                unsafe.putInt(obj, j2, i4);
                return iZzj4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iZzm3 = zzen.zzm(bArr, i, zzemVar);
                unsafe.putObject(obj, j, Long.valueOf(zzff.zzG(zzemVar.zzb)));
                unsafe.putInt(obj, j2, i4);
                return iZzm3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                Object objZzG2 = zzG(obj, i4, i8);
                int iZzn = zzen.zzn(objZzG2, zzC(i8), bArr, i, i2, (i3 & (-8)) | 4, zzemVar);
                zzP(obj, i4, i8, objZzG2);
                return iZzn;
            default:
                return i;
        }
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzem zzemVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzj;
        int iZzj2 = i;
        Unsafe unsafe = zzb;
        zzgv zzgvVarZzd = (zzgv) unsafe.getObject(obj, j2);
        if (!zzgvVarZzd.zzc()) {
            int size = zzgvVarZzd.size();
            zzgvVarZzd = zzgvVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzgvVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzft zzftVar = (zzft) zzgvVarZzd;
                    int iZzj3 = zzen.zzj(bArr, iZzj2, zzemVar);
                    int i12 = zzemVar.zza + iZzj3;
                    while (iZzj3 < i12) {
                        zzftVar.zze(Double.longBitsToDouble(zzen.zzq(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i12) {
                        return iZzj3;
                    }
                    throw zzgy.zzj();
                }
                if (i5 == 1) {
                    zzft zzftVar2 = (zzft) zzgvVarZzd;
                    zzftVar2.zze(Double.longBitsToDouble(zzen.zzq(bArr, i)));
                    while (true) {
                        i8 = iZzj2 + 8;
                        if (i8 < i2) {
                            iZzj2 = zzen.zzj(bArr, i8, zzemVar);
                            if (i3 == zzemVar.zza) {
                                zzftVar2.zze(Double.longBitsToDouble(zzen.zzq(bArr, iZzj2)));
                            }
                        }
                    }
                    return i8;
                }
                return iZzj2;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzgg zzggVar = (zzgg) zzgvVarZzd;
                    int iZzj4 = zzen.zzj(bArr, iZzj2, zzemVar);
                    int i13 = zzemVar.zza + iZzj4;
                    while (iZzj4 < i13) {
                        zzggVar.zze(Float.intBitsToFloat(zzen.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i13) {
                        return iZzj4;
                    }
                    throw zzgy.zzj();
                }
                if (i5 == 5) {
                    zzgg zzggVar2 = (zzgg) zzgvVarZzd;
                    zzggVar2.zze(Float.intBitsToFloat(zzen.zzb(bArr, i)));
                    while (true) {
                        i9 = iZzj2 + 4;
                        if (i9 < i2) {
                            iZzj2 = zzen.zzj(bArr, i9, zzemVar);
                            if (i3 == zzemVar.zza) {
                                zzggVar2.zze(Float.intBitsToFloat(zzen.zzb(bArr, iZzj2)));
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
                    zzhn zzhnVar = (zzhn) zzgvVarZzd;
                    int iZzj5 = zzen.zzj(bArr, iZzj2, zzemVar);
                    int i14 = zzemVar.zza + iZzj5;
                    while (iZzj5 < i14) {
                        iZzj5 = zzen.zzm(bArr, iZzj5, zzemVar);
                        zzhnVar.zzf(zzemVar.zzb);
                    }
                    if (iZzj5 == i14) {
                        return iZzj5;
                    }
                    throw zzgy.zzj();
                }
                if (i5 == 0) {
                    zzhn zzhnVar2 = (zzhn) zzgvVarZzd;
                    int iZzm = zzen.zzm(bArr, iZzj2, zzemVar);
                    zzhnVar2.zzf(zzemVar.zzb);
                    while (iZzm < i2) {
                        int iZzj6 = zzen.zzj(bArr, iZzm, zzemVar);
                        if (i3 != zzemVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzen.zzm(bArr, iZzj6, zzemVar);
                        zzhnVar2.zzf(zzemVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzen.zzf(bArr, iZzj2, zzgvVarZzd, zzemVar);
                }
                if (i5 == 0) {
                    return zzen.zzl(i3, bArr, i, i2, zzgvVarZzd, zzemVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzhn zzhnVar3 = (zzhn) zzgvVarZzd;
                    int iZzj7 = zzen.zzj(bArr, iZzj2, zzemVar);
                    int i15 = zzemVar.zza + iZzj7;
                    while (iZzj7 < i15) {
                        zzhnVar3.zzf(zzen.zzq(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i15) {
                        return iZzj7;
                    }
                    throw zzgy.zzj();
                }
                if (i5 == 1) {
                    zzhn zzhnVar4 = (zzhn) zzgvVarZzd;
                    zzhnVar4.zzf(zzen.zzq(bArr, i));
                    while (true) {
                        i10 = iZzj2 + 8;
                        if (i10 < i2) {
                            iZzj2 = zzen.zzj(bArr, i10, zzemVar);
                            if (i3 == zzemVar.zza) {
                                zzhnVar4.zzf(zzen.zzq(bArr, iZzj2));
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
                    zzgp zzgpVar = (zzgp) zzgvVarZzd;
                    int iZzj8 = zzen.zzj(bArr, iZzj2, zzemVar);
                    int i16 = zzemVar.zza + iZzj8;
                    while (iZzj8 < i16) {
                        zzgpVar.zzg(zzen.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i16) {
                        return iZzj8;
                    }
                    throw zzgy.zzj();
                }
                if (i5 == 5) {
                    zzgp zzgpVar2 = (zzgp) zzgvVarZzd;
                    zzgpVar2.zzg(zzen.zzb(bArr, i));
                    while (true) {
                        i11 = iZzj2 + 4;
                        if (i11 < i2) {
                            iZzj2 = zzen.zzj(bArr, i11, zzemVar);
                            if (i3 == zzemVar.zza) {
                                zzgpVar2.zzg(zzen.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i11;
                }
                return iZzj2;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzeo zzeoVar = (zzeo) zzgvVarZzd;
                    iZzj = zzen.zzj(bArr, iZzj2, zzemVar);
                    int i17 = zzemVar.zza + iZzj;
                    while (iZzj < i17) {
                        iZzj = zzen.zzm(bArr, iZzj, zzemVar);
                        zzeoVar.zze(zzemVar.zzb != 0);
                    }
                    if (iZzj != i17) {
                        throw zzgy.zzj();
                    }
                    return iZzj;
                }
                if (i5 == 0) {
                    zzeo zzeoVar2 = (zzeo) zzgvVarZzd;
                    int iZzm2 = zzen.zzm(bArr, iZzj2, zzemVar);
                    zzeoVar2.zze(zzemVar.zzb != 0);
                    while (iZzm2 < i2) {
                        int iZzj9 = zzen.zzj(bArr, iZzm2, zzemVar);
                        if (i3 != zzemVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzen.zzm(bArr, iZzj9, zzemVar);
                        zzeoVar2.zze(zzemVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iZzj2 = zzen.zzj(bArr, iZzj2, zzemVar);
                        int i18 = zzemVar.zza;
                        if (i18 < 0) {
                            throw zzgy.zzf();
                        }
                        if (i18 == 0) {
                            zzgvVarZzd.add("");
                        } else {
                            zzgvVarZzd.add(new String(bArr, iZzj2, i18, zzgw.zzb));
                            iZzj2 += i18;
                        }
                        while (iZzj2 < i2) {
                            int iZzj10 = zzen.zzj(bArr, iZzj2, zzemVar);
                            if (i3 == zzemVar.zza) {
                                iZzj2 = zzen.zzj(bArr, iZzj10, zzemVar);
                                int i19 = zzemVar.zza;
                                if (i19 < 0) {
                                    throw zzgy.zzf();
                                }
                                if (i19 == 0) {
                                    zzgvVarZzd.add("");
                                } else {
                                    zzgvVarZzd.add(new String(bArr, iZzj2, i19, zzgw.zzb));
                                    iZzj2 += i19;
                                }
                            }
                        }
                    } else {
                        iZzj2 = zzen.zzj(bArr, iZzj2, zzemVar);
                        int i20 = zzemVar.zza;
                        if (i20 < 0) {
                            throw zzgy.zzf();
                        }
                        if (i20 == 0) {
                            zzgvVarZzd.add("");
                        } else {
                            int i21 = iZzj2 + i20;
                            if (!zzju.zzf(bArr, iZzj2, i21)) {
                                throw zzgy.zzd();
                            }
                            zzgvVarZzd.add(new String(bArr, iZzj2, i20, zzgw.zzb));
                            iZzj2 = i21;
                        }
                        while (iZzj2 < i2) {
                            int iZzj11 = zzen.zzj(bArr, iZzj2, zzemVar);
                            if (i3 == zzemVar.zza) {
                                iZzj2 = zzen.zzj(bArr, iZzj11, zzemVar);
                                int i22 = zzemVar.zza;
                                if (i22 < 0) {
                                    throw zzgy.zzf();
                                }
                                if (i22 == 0) {
                                    zzgvVarZzd.add("");
                                } else {
                                    int i23 = iZzj2 + i22;
                                    if (!zzju.zzf(bArr, iZzj2, i23)) {
                                        throw zzgy.zzd();
                                    }
                                    zzgvVarZzd.add(new String(bArr, iZzj2, i22, zzgw.zzb));
                                    iZzj2 = i23;
                                }
                            }
                        }
                    }
                }
                return iZzj2;
            case 27:
                if (i5 == 2) {
                    return zzen.zze(zzC(i6), i3, bArr, i, i2, zzgvVarZzd, zzemVar);
                }
                return iZzj2;
            case 28:
                if (i5 == 2) {
                    int iZzj12 = zzen.zzj(bArr, iZzj2, zzemVar);
                    int i24 = zzemVar.zza;
                    if (i24 < 0) {
                        throw zzgy.zzf();
                    }
                    if (i24 > bArr.length - iZzj12) {
                        throw zzgy.zzj();
                    }
                    if (i24 == 0) {
                        zzgvVarZzd.add(zzez.zzb);
                    } else {
                        zzgvVarZzd.add(zzez.zzm(bArr, iZzj12, i24));
                        iZzj12 += i24;
                    }
                    while (iZzj12 < i2) {
                        int iZzj13 = zzen.zzj(bArr, iZzj12, zzemVar);
                        if (i3 != zzemVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzen.zzj(bArr, iZzj13, zzemVar);
                        int i25 = zzemVar.zza;
                        if (i25 < 0) {
                            throw zzgy.zzf();
                        }
                        if (i25 > bArr.length - iZzj12) {
                            throw zzgy.zzj();
                        }
                        if (i25 == 0) {
                            zzgvVarZzd.add(zzez.zzb);
                        } else {
                            zzgvVarZzd.add(zzez.zzm(bArr, iZzj12, i25));
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
                        iZzj = zzen.zzl(i3, bArr, i, i2, zzgvVarZzd, zzemVar);
                    }
                    return iZzj2;
                }
                iZzj = zzen.zzf(bArr, iZzj2, zzgvVarZzd, zzemVar);
                zzin.zzB(obj, i4, zzgvVarZzd, zzB(i6), null, this.zzo);
                return iZzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzgp zzgpVar3 = (zzgp) zzgvVarZzd;
                    int iZzj14 = zzen.zzj(bArr, iZzj2, zzemVar);
                    int i26 = zzemVar.zza + iZzj14;
                    while (iZzj14 < i26) {
                        iZzj14 = zzen.zzj(bArr, iZzj14, zzemVar);
                        zzgpVar3.zzg(zzff.zzF(zzemVar.zza));
                    }
                    if (iZzj14 == i26) {
                        return iZzj14;
                    }
                    throw zzgy.zzj();
                }
                if (i5 == 0) {
                    zzgp zzgpVar4 = (zzgp) zzgvVarZzd;
                    int iZzj15 = zzen.zzj(bArr, iZzj2, zzemVar);
                    zzgpVar4.zzg(zzff.zzF(zzemVar.zza));
                    while (iZzj15 < i2) {
                        int iZzj16 = zzen.zzj(bArr, iZzj15, zzemVar);
                        if (i3 != zzemVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzen.zzj(bArr, iZzj16, zzemVar);
                        zzgpVar4.zzg(zzff.zzF(zzemVar.zza));
                    }
                    return iZzj15;
                }
                return iZzj2;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzhn zzhnVar5 = (zzhn) zzgvVarZzd;
                    int iZzj17 = zzen.zzj(bArr, iZzj2, zzemVar);
                    int i27 = zzemVar.zza + iZzj17;
                    while (iZzj17 < i27) {
                        iZzj17 = zzen.zzm(bArr, iZzj17, zzemVar);
                        zzhnVar5.zzf(zzff.zzG(zzemVar.zzb));
                    }
                    if (iZzj17 == i27) {
                        return iZzj17;
                    }
                    throw zzgy.zzj();
                }
                if (i5 == 0) {
                    zzhn zzhnVar6 = (zzhn) zzgvVarZzd;
                    int iZzm3 = zzen.zzm(bArr, iZzj2, zzemVar);
                    zzhnVar6.zzf(zzff.zzG(zzemVar.zzb));
                    while (iZzm3 < i2) {
                        int iZzj18 = zzen.zzj(bArr, iZzm3, zzemVar);
                        if (i3 != zzemVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzen.zzm(bArr, iZzj18, zzemVar);
                        zzhnVar6.zzf(zzff.zzG(zzemVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i5 == 3) {
                    zzil zzilVarZzC = zzC(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iZzc = zzen.zzc(zzilVarZzC, bArr, i, i2, i28, zzemVar);
                    zzgvVarZzd.add(zzemVar.zzc);
                    while (iZzc < i2) {
                        int iZzj19 = zzen.zzj(bArr, iZzc, zzemVar);
                        if (i3 != zzemVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzen.zzc(zzilVarZzC, bArr, iZzj19, i2, i28, zzemVar);
                        zzgvVarZzd.add(zzemVar.zzc);
                    }
                    return iZzc;
                }
                return iZzj2;
        }
    }

    private final int zzu(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, 0);
    }

    private final int zzv(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzx(i, i2);
    }

    private final int zzw(int i) {
        return this.zzc[i + 2];
    }

    private final int zzx(int i, int i2) {
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

    private static int zzy(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzz(int i) {
        return this.zzc[i + 1];
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final int zza(Object obj) {
        int iZzy;
        int iZzy2;
        int iZzz;
        int iZzy3;
        int iZzy4;
        int iZzy5;
        int iZzy6;
        int iZzn;
        int iZzy7;
        int iZzz2;
        int iZzy8;
        int iZzy9;
        if (!this.zzj) {
            return zzp(obj);
        }
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzz3 = zzz(i2);
            int iZzy10 = zzy(iZzz3);
            int i3 = this.zzc[i2];
            int i4 = iZzz3 & 1048575;
            if (iZzy10 >= zzgf.DOUBLE_LIST_PACKED.zza() && iZzy10 <= zzgf.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i2 + 2];
            }
            long j = i4;
            switch (iZzy10) {
                case 0:
                    if (zzT(obj, i2)) {
                        iZzy = zzfk.zzy(i3 << 3);
                        iZzn = iZzy + 8;
                        i += iZzn;
                    }
                    break;
                case 1:
                    if (zzT(obj, i2)) {
                        iZzy2 = zzfk.zzy(i3 << 3);
                        iZzn = iZzy2 + 4;
                        i += iZzn;
                    }
                    break;
                case 2:
                    if (zzT(obj, i2)) {
                        iZzz = zzfk.zzz(zzjp.zzd(obj, j));
                        iZzy3 = zzfk.zzy(i3 << 3);
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 3:
                    if (zzT(obj, i2)) {
                        iZzz = zzfk.zzz(zzjp.zzd(obj, j));
                        iZzy3 = zzfk.zzy(i3 << 3);
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 4:
                    if (zzT(obj, i2)) {
                        iZzz = zzfk.zzu(zzjp.zzc(obj, j));
                        iZzy3 = zzfk.zzy(i3 << 3);
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 5:
                    if (zzT(obj, i2)) {
                        iZzy = zzfk.zzy(i3 << 3);
                        iZzn = iZzy + 8;
                        i += iZzn;
                    }
                    break;
                case 6:
                    if (zzT(obj, i2)) {
                        iZzy2 = zzfk.zzy(i3 << 3);
                        iZzn = iZzy2 + 4;
                        i += iZzn;
                    }
                    break;
                case 7:
                    if (zzT(obj, i2)) {
                        iZzy4 = zzfk.zzy(i3 << 3);
                        iZzn = iZzy4 + 1;
                        i += iZzn;
                    }
                    break;
                case 8:
                    if (zzT(obj, i2)) {
                        Object objZzf = zzjp.zzf(obj, j);
                        if (objZzf instanceof zzez) {
                            int i6 = i3 << 3;
                            int i7 = zzfk.zzb;
                            int iZzd = ((zzez) objZzf).zzd();
                            iZzy5 = zzfk.zzy(iZzd) + iZzd;
                            iZzy6 = zzfk.zzy(i6);
                            iZzn = iZzy6 + iZzy5;
                            i += iZzn;
                        } else {
                            iZzz = zzfk.zzx((String) objZzf);
                            iZzy3 = zzfk.zzy(i3 << 3);
                            i += iZzy3 + iZzz;
                        }
                    }
                    break;
                case 9:
                    if (zzT(obj, i2)) {
                        iZzn = zzin.zzn(i3, zzjp.zzf(obj, j), zzC(i2));
                        i += iZzn;
                    }
                    break;
                case 10:
                    if (zzT(obj, i2)) {
                        zzez zzezVar = (zzez) zzjp.zzf(obj, j);
                        int i8 = i3 << 3;
                        int i9 = zzfk.zzb;
                        int iZzd2 = zzezVar.zzd();
                        iZzy5 = zzfk.zzy(iZzd2) + iZzd2;
                        iZzy6 = zzfk.zzy(i8);
                        iZzn = iZzy6 + iZzy5;
                        i += iZzn;
                    }
                    break;
                case 11:
                    if (zzT(obj, i2)) {
                        iZzz = zzfk.zzy(zzjp.zzc(obj, j));
                        iZzy3 = zzfk.zzy(i3 << 3);
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 12:
                    if (zzT(obj, i2)) {
                        iZzz = zzfk.zzu(zzjp.zzc(obj, j));
                        iZzy3 = zzfk.zzy(i3 << 3);
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 13:
                    if (zzT(obj, i2)) {
                        iZzy2 = zzfk.zzy(i3 << 3);
                        iZzn = iZzy2 + 4;
                        i += iZzn;
                    }
                    break;
                case 14:
                    if (zzT(obj, i2)) {
                        iZzy = zzfk.zzy(i3 << 3);
                        iZzn = iZzy + 8;
                        i += iZzn;
                    }
                    break;
                case 15:
                    if (zzT(obj, i2)) {
                        int iZzc = zzjp.zzc(obj, j);
                        iZzy3 = zzfk.zzy(i3 << 3);
                        iZzz = zzfk.zzy((iZzc >> 31) ^ (iZzc + iZzc));
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 16:
                    if (zzT(obj, i2)) {
                        long jZzd = zzjp.zzd(obj, j);
                        iZzy7 = zzfk.zzy(i3 << 3);
                        iZzz2 = zzfk.zzz((jZzd >> 63) ^ (jZzd + jZzd));
                        iZzn = iZzy7 + iZzz2;
                        i += iZzn;
                    }
                    break;
                case 17:
                    if (zzT(obj, i2)) {
                        iZzn = zzfk.zzt(i3, (zzhy) zzjp.zzf(obj, j), zzC(i2));
                        i += iZzn;
                    }
                    break;
                case 18:
                    iZzn = zzin.zzg(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 19:
                    iZzn = zzin.zze(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 20:
                    iZzn = zzin.zzl(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 21:
                    iZzn = zzin.zzw(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 22:
                    iZzn = zzin.zzj(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 23:
                    iZzn = zzin.zzg(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 24:
                    iZzn = zzin.zze(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 25:
                    iZzn = zzin.zza(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 26:
                    iZzn = zzin.zzt(i3, (List) zzjp.zzf(obj, j));
                    i += iZzn;
                    break;
                case 27:
                    iZzn = zzin.zzo(i3, (List) zzjp.zzf(obj, j), zzC(i2));
                    i += iZzn;
                    break;
                case 28:
                    iZzn = zzin.zzb(i3, (List) zzjp.zzf(obj, j));
                    i += iZzn;
                    break;
                case 29:
                    iZzn = zzin.zzu(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 30:
                    iZzn = zzin.zzc(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 31:
                    iZzn = zzin.zze(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 32:
                    iZzn = zzin.zzg(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 33:
                    iZzn = zzin.zzp(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 34:
                    iZzn = zzin.zzr(i3, (List) zzjp.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 35:
                    iZzz = zzin.zzh((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i10 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i10);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 36:
                    iZzz = zzin.zzf((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i11 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i11);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 37:
                    iZzz = zzin.zzm((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i12 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i12);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 38:
                    iZzz = zzin.zzx((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i13 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i13);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 39:
                    iZzz = zzin.zzk((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i14 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i14);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 40:
                    iZzz = zzin.zzh((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i15 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i15);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 41:
                    iZzz = zzin.zzf((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i16 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i16);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzin.zza;
                    iZzz = list.size();
                    if (iZzz > 0) {
                        int i18 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i18);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 43:
                    iZzz = zzin.zzv((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i19 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i19);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 44:
                    iZzz = zzin.zzd((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i20 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i20);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 45:
                    iZzz = zzin.zzf((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i21 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i21);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 46:
                    iZzz = zzin.zzh((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i22 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i22);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 47:
                    iZzz = zzin.zzq((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i23 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i23);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 48:
                    iZzz = zzin.zzs((List) unsafe.getObject(obj, j));
                    if (iZzz > 0) {
                        int i24 = i3 << 3;
                        iZzy8 = zzfk.zzy(iZzz);
                        iZzy9 = zzfk.zzy(i24);
                        iZzy3 = iZzy9 + iZzy8;
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 49:
                    iZzn = zzin.zzi(i3, (List) zzjp.zzf(obj, j), zzC(i2));
                    i += iZzn;
                    break;
                case 50:
                    zzht.zza(i3, zzjp.zzf(obj, j), zzE(i2));
                    break;
                case 51:
                    if (zzX(obj, i3, i2)) {
                        iZzy = zzfk.zzy(i3 << 3);
                        iZzn = iZzy + 8;
                        i += iZzn;
                    }
                    break;
                case 52:
                    if (zzX(obj, i3, i2)) {
                        iZzy2 = zzfk.zzy(i3 << 3);
                        iZzn = iZzy2 + 4;
                        i += iZzn;
                    }
                    break;
                case 53:
                    if (zzX(obj, i3, i2)) {
                        iZzz = zzfk.zzz(zzA(obj, j));
                        iZzy3 = zzfk.zzy(i3 << 3);
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 54:
                    if (zzX(obj, i3, i2)) {
                        iZzz = zzfk.zzz(zzA(obj, j));
                        iZzy3 = zzfk.zzy(i3 << 3);
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 55:
                    if (zzX(obj, i3, i2)) {
                        iZzz = zzfk.zzu(zzq(obj, j));
                        iZzy3 = zzfk.zzy(i3 << 3);
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 56:
                    if (zzX(obj, i3, i2)) {
                        iZzy = zzfk.zzy(i3 << 3);
                        iZzn = iZzy + 8;
                        i += iZzn;
                    }
                    break;
                case 57:
                    if (zzX(obj, i3, i2)) {
                        iZzy2 = zzfk.zzy(i3 << 3);
                        iZzn = iZzy2 + 4;
                        i += iZzn;
                    }
                    break;
                case 58:
                    if (zzX(obj, i3, i2)) {
                        iZzy4 = zzfk.zzy(i3 << 3);
                        iZzn = iZzy4 + 1;
                        i += iZzn;
                    }
                    break;
                case 59:
                    if (zzX(obj, i3, i2)) {
                        Object objZzf2 = zzjp.zzf(obj, j);
                        if (objZzf2 instanceof zzez) {
                            int i25 = i3 << 3;
                            int i26 = zzfk.zzb;
                            int iZzd3 = ((zzez) objZzf2).zzd();
                            iZzy5 = zzfk.zzy(iZzd3) + iZzd3;
                            iZzy6 = zzfk.zzy(i25);
                            iZzn = iZzy6 + iZzy5;
                            i += iZzn;
                        } else {
                            iZzz = zzfk.zzx((String) objZzf2);
                            iZzy3 = zzfk.zzy(i3 << 3);
                            i += iZzy3 + iZzz;
                        }
                    }
                    break;
                case 60:
                    if (zzX(obj, i3, i2)) {
                        iZzn = zzin.zzn(i3, zzjp.zzf(obj, j), zzC(i2));
                        i += iZzn;
                    }
                    break;
                case 61:
                    if (zzX(obj, i3, i2)) {
                        zzez zzezVar2 = (zzez) zzjp.zzf(obj, j);
                        int i27 = i3 << 3;
                        int i28 = zzfk.zzb;
                        int iZzd4 = zzezVar2.zzd();
                        iZzy5 = zzfk.zzy(iZzd4) + iZzd4;
                        iZzy6 = zzfk.zzy(i27);
                        iZzn = iZzy6 + iZzy5;
                        i += iZzn;
                    }
                    break;
                case 62:
                    if (zzX(obj, i3, i2)) {
                        iZzz = zzfk.zzy(zzq(obj, j));
                        iZzy3 = zzfk.zzy(i3 << 3);
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 63:
                    if (zzX(obj, i3, i2)) {
                        iZzz = zzfk.zzu(zzq(obj, j));
                        iZzy3 = zzfk.zzy(i3 << 3);
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 64:
                    if (zzX(obj, i3, i2)) {
                        iZzy2 = zzfk.zzy(i3 << 3);
                        iZzn = iZzy2 + 4;
                        i += iZzn;
                    }
                    break;
                case 65:
                    if (zzX(obj, i3, i2)) {
                        iZzy = zzfk.zzy(i3 << 3);
                        iZzn = iZzy + 8;
                        i += iZzn;
                    }
                    break;
                case 66:
                    if (zzX(obj, i3, i2)) {
                        int iZzq = zzq(obj, j);
                        iZzy3 = zzfk.zzy(i3 << 3);
                        iZzz = zzfk.zzy((iZzq >> 31) ^ (iZzq + iZzq));
                        i += iZzy3 + iZzz;
                    }
                    break;
                case 67:
                    if (zzX(obj, i3, i2)) {
                        long jZzA = zzA(obj, j);
                        iZzy7 = zzfk.zzy(i3 << 3);
                        iZzz2 = zzfk.zzz((jZzA >> 63) ^ (jZzA + jZzA));
                        iZzn = iZzy7 + iZzz2;
                        i += iZzn;
                    }
                    break;
                case 68:
                    if (zzX(obj, i3, i2)) {
                        iZzn = zzfk.zzt(i3, (zzhy) zzjp.zzf(obj, j), zzC(i2));
                        i += iZzn;
                    }
                    break;
            }
        }
        zzjf zzjfVar = this.zzo;
        return i + zzjfVar.zza(zzjfVar.zzd(obj));
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzz = zzz(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & iZzz;
            int iHashCode = 37;
            switch (zzy(iZzz)) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzjp.zza(obj, j));
                    byte[] bArr = zzgw.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzjp.zzb(obj, j));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzjp.zzd(obj, j);
                    byte[] bArr2 = zzgw.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzjp.zzd(obj, j);
                    byte[] bArr3 = zzgw.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzjp.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzjp.zzd(obj, j);
                    byte[] bArr4 = zzgw.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzjp.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzgw.zza(zzjp.zzw(obj, j));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iFloatToIntBits = ((String) zzjp.zzf(obj, j)).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 9:
                    Object objZzf = zzjp.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzjp.zzf(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzjp.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzjp.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzjp.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzjp.zzd(obj, j);
                    byte[] bArr5 = zzgw.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzjp.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzjp.zzd(obj, j);
                    byte[] bArr6 = zzgw.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object objZzf2 = zzjp.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
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
                    iFloatToIntBits = zzjp.zzf(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzjp.zzf(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzgw.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzA(obj, j);
                        byte[] bArr8 = zzgw.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzA(obj, j);
                        byte[] bArr9 = zzgw.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzA(obj, j);
                        byte[] bArr10 = zzgw.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzgw.zza(zzY(obj, j));
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = ((String) zzjp.zzf(obj, j)).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzjp.zzf(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzjp.zzf(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzA(obj, j);
                        byte[] bArr11 = zzgw.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzA(obj, j);
                        byte[] bArr12 = zzgw.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzjp.zzf(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + this.zzo.zzd(obj).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzp.zzb(obj).zza.hashCode() : iHashCode2;
    }

    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzem zzemVar) throws IOException {
        Unsafe unsafe;
        Object obj2;
        zzib<T> zzibVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iZzm;
        int i10;
        boolean z;
        int i11;
        zzem zzemVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iZza;
        Object obj3;
        int i20;
        int i21;
        zzib<T> zzibVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        i2 = i2;
        int i22 = i3;
        zzem zzemVar3 = zzemVar;
        zzI(obj);
        Unsafe unsafe2 = zzb;
        int i23 = -1;
        int iZzi = i;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 1048575;
        while (true) {
            if (iZzi < i2) {
                int i29 = iZzi + 1;
                byte b = bArr2[iZzi];
                if (b < 0) {
                    int iZzk = zzen.zzk(b, bArr2, i29, zzemVar3);
                    i8 = zzemVar3.zza;
                    i29 = iZzk;
                } else {
                    i8 = b;
                }
                int i30 = i8 >>> 3;
                int iZzv = i30 > i24 ? zzibVar2.zzv(i30, i25 / 3) : zzibVar2.zzu(i30);
                if (iZzv == i23) {
                    i9 = i30;
                    iZzm = i29;
                    i5 = i8;
                    i10 = i27;
                    unsafe = unsafe2;
                    i3 = i22;
                    z = true;
                    i11 = 0;
                } else {
                    int i31 = i8 & 7;
                    int[] iArr = zzibVar2.zzc;
                    int i32 = iArr[iZzv + 1];
                    int iZzy = zzy(i32);
                    long j = i32 & 1048575;
                    int i33 = i8;
                    if (iZzy <= 17) {
                        int i34 = iArr[iZzv + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        if (i36 != i28) {
                            if (i28 != 1048575) {
                                long j2 = i28;
                                obj3 = obj;
                                unsafe2.putInt(obj3, j2, i27);
                            } else {
                                obj3 = obj;
                            }
                            i28 = i36;
                            i13 = unsafe2.getInt(obj3, i36);
                            obj4 = obj3;
                        } else {
                            obj4 = obj;
                            i13 = i27;
                            i28 = i28;
                        }
                        switch (iZzy) {
                            case 0:
                                i14 = iZzv;
                                i15 = i30;
                                if (i31 == 1) {
                                    zzjp.zzo(obj4, j, Double.longBitsToDouble(zzen.zzq(bArr2, i29)));
                                    iZzi = i29 + 8;
                                    i27 = i13 | i35;
                                    i25 = i14;
                                    i24 = i15;
                                    i26 = i33;
                                    i23 = -1;
                                    i22 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i33;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 1:
                                i14 = iZzv;
                                i15 = i30;
                                if (i31 == 5) {
                                    zzjp.zzp(obj4, j, Float.intBitsToFloat(zzen.zzb(bArr2, i29)));
                                    iZzi = i29 + 4;
                                    i27 = i13 | i35;
                                    i25 = i14;
                                    i24 = i15;
                                    i26 = i33;
                                    i23 = -1;
                                    i22 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i33;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 2:
                            case 3:
                                i14 = iZzv;
                                i15 = i30;
                                if (i31 == 0) {
                                    int iZzm2 = zzen.zzm(bArr2, i29, zzemVar3);
                                    unsafe2.putLong(obj, j, zzemVar3.zzb);
                                    i27 = i13 | i35;
                                    i25 = i14;
                                    iZzi = iZzm2;
                                    i24 = i15;
                                    i26 = i33;
                                    i23 = -1;
                                    i22 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i33;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 4:
                            case 11:
                                i14 = iZzv;
                                i15 = i30;
                                if (i31 == 0) {
                                    iZzi = zzen.zzj(bArr2, i29, zzemVar3);
                                    unsafe2.putInt(obj4, j, zzemVar3.zza);
                                    i27 = i13 | i35;
                                    i25 = i14;
                                    i24 = i15;
                                    i26 = i33;
                                    i23 = -1;
                                    i22 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i33;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 5:
                            case 14:
                                i14 = iZzv;
                                i15 = i30;
                                if (i31 == 1) {
                                    unsafe2.putLong(obj, j, zzen.zzq(bArr2, i29));
                                    iZzi = i29 + 8;
                                    i27 = i13 | i35;
                                    i25 = i14;
                                    i24 = i15;
                                    i26 = i33;
                                    i23 = -1;
                                    i22 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i33;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 6:
                            case 13:
                                i14 = iZzv;
                                i15 = i30;
                                if (i31 == 5) {
                                    unsafe2.putInt(obj4, j, zzen.zzb(bArr2, i29));
                                    iZzi = i29 + 4;
                                    i27 = i13 | i35;
                                    i25 = i14;
                                    i24 = i15;
                                    i26 = i33;
                                    i23 = -1;
                                    i22 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i33;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 7:
                                i14 = iZzv;
                                i15 = i30;
                                if (i31 == 0) {
                                    iZzi = zzen.zzm(bArr2, i29, zzemVar3);
                                    zzjp.zzm(obj4, j, zzemVar3.zzb != 0);
                                    i27 = i13 | i35;
                                    i25 = i14;
                                    i24 = i15;
                                    i26 = i33;
                                    i23 = -1;
                                    i22 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i33;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 8:
                                i14 = iZzv;
                                i15 = i30;
                                if (i31 == 2) {
                                    iZzi = (536870912 & i32) == 0 ? zzen.zzg(bArr2, i29, zzemVar3) : zzen.zzh(bArr2, i29, zzemVar3);
                                    unsafe2.putObject(obj4, j, zzemVar3.zzc);
                                    i27 = i13 | i35;
                                    i25 = i14;
                                    i24 = i15;
                                    i26 = i33;
                                    i23 = -1;
                                    i22 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i33;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 9:
                                i15 = i30;
                                if (i31 == 2) {
                                    Object objZzF = zzibVar2.zzF(obj4, iZzv);
                                    i33 = i33;
                                    i14 = iZzv;
                                    iZzi = zzen.zzo(objZzF, zzibVar2.zzC(iZzv), bArr, i29, i2, zzemVar);
                                    zzibVar2.zzO(obj4, i14, objZzF);
                                    i27 = i13 | i35;
                                    i25 = i14;
                                    i24 = i15;
                                    i26 = i33;
                                    i23 = -1;
                                    i22 = i3;
                                } else {
                                    i33 = i33;
                                    i16 = iZzv;
                                    i19 = i33;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 10:
                                i17 = iZzv;
                                i15 = i30;
                                i18 = i33;
                                if (i31 == 2) {
                                    iZza = zzen.zza(bArr2, i29, zzemVar3);
                                    unsafe2.putObject(obj4, j, zzemVar3.zzc);
                                    int i37 = i13 | i35;
                                    i2 = i2;
                                    i26 = i18;
                                    i24 = i15;
                                    i28 = i28;
                                    i23 = -1;
                                    i22 = i3;
                                    int i38 = i17;
                                    i27 = i37;
                                    iZzi = iZza;
                                    i25 = i38;
                                } else {
                                    i16 = i17;
                                    i19 = i18;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 12:
                                i17 = iZzv;
                                i15 = i30;
                                i18 = i33;
                                if (i31 == 0) {
                                    iZza = zzen.zzj(bArr2, i29, zzemVar3);
                                    int i39 = zzemVar3.zza;
                                    zzgs zzgsVarZzB = zzibVar2.zzB(i17);
                                    if (zzgsVarZzB == null || zzgsVarZzB.zza()) {
                                        unsafe2.putInt(obj4, j, i39);
                                        int i310 = i13 | i35;
                                        i2 = i2;
                                        i26 = i18;
                                        i24 = i15;
                                        i28 = i28;
                                        i23 = -1;
                                        i22 = i3;
                                        int i311 = i17;
                                        i27 = i310;
                                        iZzi = iZza;
                                        i25 = i311;
                                    } else {
                                        zzd(obj).zzj(i18, Long.valueOf(i39));
                                        iZzi = iZza;
                                        i25 = i17;
                                        i26 = i18;
                                        i24 = i15;
                                        i27 = i13;
                                        i23 = -1;
                                        i2 = i2;
                                        i22 = i3;
                                    }
                                } else {
                                    i16 = i17;
                                    i19 = i18;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 15:
                                i17 = iZzv;
                                i15 = i30;
                                i18 = i33;
                                if (i31 == 0) {
                                    iZzi = zzen.zzj(bArr2, i29, zzemVar3);
                                    unsafe2.putInt(obj4, j, zzff.zzF(zzemVar3.zza));
                                    int i40 = i13 | i35;
                                    i2 = i2;
                                    i25 = i17;
                                    i26 = i18;
                                    i23 = -1;
                                    i27 = i40;
                                    i24 = i15;
                                    i22 = i3;
                                } else {
                                    i16 = i17;
                                    i19 = i18;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            case 16:
                                if (i31 == 0) {
                                    int iZzm3 = zzen.zzm(bArr2, i29, zzemVar3);
                                    unsafe2.putLong(obj, j, zzff.zzG(zzemVar3.zzb));
                                    i27 = i13 | i35;
                                    iZzi = iZzm3;
                                    i2 = i2;
                                    i26 = i33;
                                    i25 = iZzv;
                                    i24 = i30;
                                    i23 = -1;
                                    i22 = i3;
                                } else {
                                    i15 = i30;
                                    i16 = iZzv;
                                    i19 = i33;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                            default:
                                i14 = iZzv;
                                i15 = i30;
                                if (i31 == 3) {
                                    Object objZzF2 = zzibVar2.zzF(obj4, i14);
                                    iZzi = zzen.zzn(objZzF2, zzibVar2.zzC(i14), bArr, i29, i2, (i15 << 3) | 4, zzemVar);
                                    zzibVar2.zzO(obj4, i14, objZzF2);
                                    i27 = i13 | i35;
                                    i26 = i33;
                                    i2 = i2;
                                    i24 = i15;
                                    i25 = i14;
                                    i23 = -1;
                                    bArr2 = bArr;
                                    i22 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i33;
                                    i5 = i19;
                                    i3 = i3;
                                    iZzm = i29;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                    i28 = i28;
                                    z = true;
                                }
                                break;
                        }
                    } else {
                        i5 = i33;
                        obj4 = obj;
                        if (iZzy != 27) {
                            i10 = i27;
                            i20 = i28;
                            if (iZzy <= 49) {
                                z = true;
                                int i41 = i29;
                                unsafe = unsafe2;
                                i11 = iZzv;
                                i9 = i30;
                                iZzi = zzt(obj, bArr, i29, i2, i5, i30, i31, iZzv, i32, iZzy, j, zzemVar);
                                if (iZzi != i41) {
                                    zzibVar2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i26 = i5;
                                    i2 = i2;
                                    i22 = i3;
                                    zzemVar3 = zzemVar;
                                    i27 = i10;
                                    i24 = i9;
                                    i25 = i11;
                                    i28 = i20;
                                    unsafe2 = unsafe;
                                    i23 = -1;
                                } else {
                                    iZzm = iZzi;
                                    i28 = i20;
                                }
                            } else {
                                i21 = i29;
                                unsafe = unsafe2;
                                i11 = iZzv;
                                i9 = i30;
                                z = true;
                                if (iZzy != 50) {
                                    iZzi = zzs(obj, bArr, i21, i2, i5, i9, i31, i32, iZzy, j, i11, zzemVar);
                                    if (iZzi != i21) {
                                        zzibVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i26 = i5;
                                        i2 = i2;
                                        i22 = i3;
                                        zzemVar3 = zzemVar;
                                        i27 = i10;
                                        i24 = i9;
                                        i25 = i11;
                                        i28 = i20;
                                        unsafe2 = unsafe;
                                        i23 = -1;
                                    } else {
                                        iZzm = iZzi;
                                        i28 = i20;
                                    }
                                } else if (i31 == 2) {
                                    iZzi = zzr(obj, bArr, i21, i2, i11, j, zzemVar);
                                    if (iZzi != i21) {
                                        zzibVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i26 = i5;
                                        i2 = i2;
                                        i22 = i3;
                                        zzemVar3 = zzemVar;
                                        i27 = i10;
                                        i24 = i9;
                                        i25 = i11;
                                        i28 = i20;
                                        unsafe2 = unsafe;
                                        i23 = -1;
                                    } else {
                                        iZzm = iZzi;
                                        i28 = i20;
                                    }
                                } else {
                                    iZzm = i21;
                                    i28 = i20;
                                }
                            }
                        } else if (i31 == 2) {
                            zzgv zzgvVarZzd = (zzgv) unsafe2.getObject(obj4, j);
                            if (!zzgvVarZzd.zzc()) {
                                int size = zzgvVarZzd.size();
                                zzgvVarZzd = zzgvVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j, zzgvVarZzd);
                            }
                            iZzi = zzen.zze(zzibVar2.zzC(iZzv), i5, bArr, i29, i2, zzgvVarZzd, zzemVar);
                            i26 = i5;
                            i22 = i3;
                            i25 = iZzv;
                            i24 = i30;
                            i27 = i27;
                            i28 = i28;
                            i23 = -1;
                            bArr2 = bArr;
                            i2 = i2;
                        } else {
                            i10 = i27;
                            i20 = i28;
                            i21 = i29;
                            unsafe = unsafe2;
                            i11 = iZzv;
                            i9 = i30;
                            z = true;
                            iZzm = i21;
                            i28 = i20;
                        }
                    }
                }
                if (i5 != i3 || i3 == 0) {
                    if (this.zzh) {
                        zzemVar2 = zzemVar;
                        zzfz zzfzVar = zzemVar2.zzd;
                        if (zzfzVar != zzfz.zza) {
                            i12 = i9;
                            zzgm zzgmVarZza = zzfzVar.zza(this.zzg, i12);
                            if (zzgmVarZza != null) {
                                obj = obj;
                                zzgk zzgkVar = (zzgk) obj;
                                zzgkVar.zzi();
                                zzge zzgeVar = zzgkVar.zzb;
                                Object objValueOf = null;
                                if (zzgmVarZza.zzb.zzb == zzjv.ENUM) {
                                    zzen.zzj(bArr, iZzm, zzemVar2);
                                    throw null;
                                }
                                switch (zzgmVarZza.zzb.zzb) {
                                    case DOUBLE:
                                        bArr = bArr;
                                        objValueOf = Double.valueOf(Double.longBitsToDouble(zzen.zzq(bArr, iZzm)));
                                        iZzm += 8;
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                    case FLOAT:
                                        bArr = bArr;
                                        objValueOf = Float.valueOf(Float.intBitsToFloat(zzen.zzb(bArr, iZzm)));
                                        iZzm += 4;
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                    case INT64:
                                    case UINT64:
                                        bArr = bArr;
                                        iZzm = zzen.zzm(bArr, iZzm, zzemVar2);
                                        objValueOf = Long.valueOf(zzemVar2.zzb);
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                    case INT32:
                                    case UINT32:
                                        bArr = bArr;
                                        iZzm = zzen.zzj(bArr, iZzm, zzemVar2);
                                        objValueOf = Integer.valueOf(zzemVar2.zza);
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                    case FIXED64:
                                    case SFIXED64:
                                        bArr = bArr;
                                        objValueOf = Long.valueOf(zzen.zzq(bArr, iZzm));
                                        iZzm += 8;
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                    case FIXED32:
                                    case SFIXED32:
                                        bArr = bArr;
                                        objValueOf = Integer.valueOf(zzen.zzb(bArr, iZzm));
                                        iZzm += 4;
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                    case BOOL:
                                        bArr = bArr;
                                        iZzm = zzen.zzm(bArr, iZzm, zzemVar2);
                                        if (zzemVar2.zzb == 0) {
                                            z = false;
                                        }
                                        objValueOf = Boolean.valueOf(z);
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                    case STRING:
                                        bArr = bArr;
                                        iZzm = zzen.zzg(bArr, iZzm, zzemVar2);
                                        objValueOf = zzemVar2.zzc;
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                    case GROUP:
                                        int i42 = zzih.zza;
                                        throw null;
                                    case MESSAGE:
                                        int i43 = zzih.zza;
                                        throw null;
                                    case BYTES:
                                        bArr = bArr;
                                        iZzm = zzen.zza(bArr, iZzm, zzemVar2);
                                        objValueOf = zzemVar2.zzc;
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                    case ENUM:
                                        throw new IllegalStateException("Shouldn't reach here.");
                                    case SINT32:
                                        bArr = bArr;
                                        iZzm = zzen.zzj(bArr, iZzm, zzemVar2);
                                        objValueOf = Integer.valueOf(zzff.zzF(zzemVar2.zza));
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                    case SINT64:
                                        bArr = bArr;
                                        iZzm = zzen.zzm(bArr, iZzm, zzemVar2);
                                        objValueOf = Long.valueOf(zzff.zzG(zzemVar2.zzb));
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                    default:
                                        bArr = bArr;
                                        zzgeVar.zzi(zzgmVarZza.zzb, objValueOf);
                                        iZzi = iZzm;
                                        break;
                                }
                            } else {
                                iZzi = zzen.zzi(i5, bArr, iZzm, i2, zzd(obj), zzemVar);
                                obj = obj;
                                bArr = bArr;
                            }
                        }
                        i26 = i5;
                        zzibVar2 = this;
                        zzemVar3 = zzemVar2;
                        i24 = i12;
                        obj4 = obj;
                        bArr2 = bArr;
                        i27 = i10;
                        i25 = i11;
                        unsafe2 = unsafe;
                        i23 = -1;
                        i2 = i2;
                        i22 = i3;
                    } else {
                        zzemVar2 = zzemVar;
                    }
                    i12 = i9;
                    iZzi = zzen.zzi(i5, bArr, iZzm, i2, zzd(obj), zzemVar);
                    i26 = i5;
                    zzibVar2 = this;
                    zzemVar3 = zzemVar2;
                    i24 = i12;
                    obj4 = obj;
                    bArr2 = bArr;
                    i27 = i10;
                    i25 = i11;
                    unsafe2 = unsafe;
                    i23 = -1;
                    i2 = i2;
                    i22 = i3;
                } else {
                    zzibVar = this;
                    obj2 = obj;
                    i6 = i28;
                    i27 = i10;
                    i7 = 1048575;
                    i4 = iZzm;
                }
            } else {
                int i44 = i28;
                unsafe = unsafe2;
                i3 = i22;
                obj2 = obj4;
                zzibVar = zzibVar2;
                i4 = iZzi;
                i5 = i26;
                i6 = i44;
                i7 = 1048575;
            }
        }
        if (i6 != i7) {
            unsafe.putInt(obj2, i6, i27);
        }
        for (int i45 = zzibVar.zzl; i45 < zzibVar.zzm; i45++) {
            zzD(obj, zzibVar.zzk[i45], null, zzibVar.zzo, obj);
        }
        if (i3 == 0) {
            if (i4 != i2) {
                throw zzgy.zzg();
            }
        } else if (i4 > i2 || i5 != i3) {
            throw zzgy.zzg();
        }
        return i4;
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final Object zze() {
        return ((zzgo) this.zzg).zzs();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzf(Object obj) {
        if (zzW(obj)) {
            if (obj instanceof zzgo) {
                zzgo zzgoVar = (zzgo) obj;
                zzgoVar.zzD(Integer.MAX_VALUE);
                zzgoVar.zza = 0;
                zzgoVar.zzB();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int iZzz = zzz(i);
                int i2 = 1048575 & iZzz;
                int iZzy = zzy(iZzz);
                long j = i2;
                if (iZzy != 9) {
                    if (iZzy != 60 && iZzy != 68) {
                        switch (iZzy) {
                            case 17:
                                if (zzT(obj, i)) {
                                    zzC(i).zzf(zzb.getObject(obj, j));
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
                                this.zzn.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzhs) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzX(obj, this.zzc[i], i)) {
                        zzC(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzT(obj, i)) {
                    zzC(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzo.zzm(obj);
            if (this.zzh) {
                this.zzp.zzf(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzz = zzz(i);
            int i2 = this.zzc[i];
            long j = 1048575 & iZzz;
            switch (zzy(iZzz)) {
                case 0:
                    if (zzT(obj2, i)) {
                        zzjp.zzo(obj, j, zzjp.zza(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 1:
                    if (zzT(obj2, i)) {
                        zzjp.zzp(obj, j, zzjp.zzb(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 2:
                    if (zzT(obj2, i)) {
                        zzjp.zzr(obj, j, zzjp.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 3:
                    if (zzT(obj2, i)) {
                        zzjp.zzr(obj, j, zzjp.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 4:
                    if (zzT(obj2, i)) {
                        zzjp.zzq(obj, j, zzjp.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 5:
                    if (zzT(obj2, i)) {
                        zzjp.zzr(obj, j, zzjp.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 6:
                    if (zzT(obj2, i)) {
                        zzjp.zzq(obj, j, zzjp.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 7:
                    if (zzT(obj2, i)) {
                        zzjp.zzm(obj, j, zzjp.zzw(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 8:
                    if (zzT(obj2, i)) {
                        zzjp.zzs(obj, j, zzjp.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 9:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (zzT(obj2, i)) {
                        zzjp.zzs(obj, j, zzjp.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 11:
                    if (zzT(obj2, i)) {
                        zzjp.zzq(obj, j, zzjp.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 12:
                    if (zzT(obj2, i)) {
                        zzjp.zzq(obj, j, zzjp.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 13:
                    if (zzT(obj2, i)) {
                        zzjp.zzq(obj, j, zzjp.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 14:
                    if (zzT(obj2, i)) {
                        zzjp.zzr(obj, j, zzjp.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 15:
                    if (zzT(obj2, i)) {
                        zzjp.zzq(obj, j, zzjp.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 16:
                    if (zzT(obj2, i)) {
                        zzjp.zzr(obj, j, zzjp.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 17:
                    zzJ(obj, obj2, i);
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
                    this.zzn.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzin.zza;
                    zzjp.zzs(obj, j, zzht.zzc(zzjp.zzf(obj, j), zzjp.zzf(obj2, j)));
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
                    if (zzX(obj2, i2, i)) {
                        zzjp.zzs(obj, j, zzjp.zzf(obj2, j));
                        zzN(obj, i2, i);
                    }
                    break;
                case 60:
                    zzK(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzX(obj2, i2, i)) {
                        zzjp.zzs(obj, j, zzjp.zzf(obj2, j));
                        zzN(obj, i2, i);
                    }
                    break;
                case 68:
                    zzK(obj, obj2, i);
                    break;
            }
        }
        zzin.zzE(this.zzo, obj, obj2);
        if (this.zzh) {
            zzin.zzD(this.zzp, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0652 A[LOOP:2: B:180:0x064e->B:182:0x0652, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0666  */
    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzh(Object obj, zzik zzikVar, zzfz zzfzVar) throws Throwable {
        zzjf zzjfVar;
        int i;
        Object obj2;
        zzga zzgaVar;
        zzfz zzfzVar2;
        Object obj3 = obj;
        zzfz zzfzVar3 = zzfzVar;
        zzfzVar.getClass();
        zzI(obj);
        zzjf zzjfVar2 = this.zzo;
        zzga zzgaVar2 = this.zzp;
        zzge zzgeVarZzc = null;
        Object objZzc = null;
        while (true) {
            try {
                int iZzc = zzikVar.zzc();
                int iZzu = zzu(iZzc);
                if (iZzu < 0) {
                    if (iZzc == Integer.MAX_VALUE) {
                        for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                            zzD(obj, this.zzk[i2], objZzc, zzjfVar2, obj);
                        }
                        if (objZzc != null) {
                            zzjfVar2.zzn(obj3, objZzc);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objZzd = !this.zzh ? null : zzgaVar2.zzd(zzfzVar3, this.zzg, iZzc);
                        if (objZzd != null) {
                            if (zzgeVarZzc == null) {
                                zzgeVarZzc = zzgaVar2.zzc(obj3);
                            }
                            zzge zzgeVar = zzgeVarZzc;
                            obj2 = objZzc;
                            zzjf zzjfVar3 = zzjfVar2;
                            Object obj4 = obj3;
                            try {
                                zzgaVar2.zze(obj, zzikVar, objZzd, zzfzVar, zzgeVar, obj2, zzjfVar3);
                                zzgeVarZzc = zzgeVar;
                                obj3 = obj4;
                                zzjfVar2 = zzjfVar3;
                                objZzc = obj2;
                            } catch (Throwable th) {
                                th = th;
                                obj3 = obj4;
                                zzjfVar = zzjfVar3;
                                objZzc = obj2;
                                for (i = this.zzl; i < this.zzm; i++) {
                                    zzD(obj, this.zzk[i], objZzc, zzjfVar, obj);
                                }
                                if (objZzc != null) {
                                    zzjfVar.zzn(obj3, objZzc);
                                }
                                throw th;
                            }
                        } else {
                            Object obj5 = objZzc;
                            zzjf zzjfVar4 = zzjfVar2;
                            Object obj6 = obj3;
                            zzjfVar4.zzs(zzikVar);
                            objZzc = obj5 == null ? zzjfVar4.zzc(obj6) : obj5;
                            try {
                                if (!zzjfVar4.zzr(objZzc, zzikVar)) {
                                    int i3 = this.zzl;
                                    while (i3 < this.zzm) {
                                        zzjf zzjfVar5 = zzjfVar4;
                                        zzD(obj, this.zzk[i3], objZzc, zzjfVar5, obj);
                                        i3++;
                                        obj6 = obj6;
                                        zzjfVar4 = zzjfVar5;
                                    }
                                    Object obj7 = obj6;
                                    zzjf zzjfVar6 = zzjfVar4;
                                    if (objZzc != null) {
                                        zzjfVar6.zzn(obj7, objZzc);
                                        return;
                                    }
                                    return;
                                }
                                obj3 = obj6;
                                zzjfVar2 = zzjfVar4;
                            } catch (Throwable th2) {
                                th = th2;
                                obj3 = obj6;
                                zzjfVar = zzjfVar4;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zzjfVar = zzjfVar2;
                        obj3 = obj3;
                    }
                    zzjfVar = zzjfVar2;
                    obj3 = obj3;
                } else {
                    obj2 = objZzc;
                    zzjfVar = zzjfVar2;
                    obj3 = obj3;
                    try {
                        int iZzz = zzz(iZzu);
                        try {
                            switch (zzy(iZzz)) {
                                case 0:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzo(obj3, iZzz & 1048575, zzikVar.zza());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 1:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzp(obj3, iZzz & 1048575, zzikVar.zzb());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 2:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzr(obj3, iZzz & 1048575, zzikVar.zzl());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 3:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzr(obj3, iZzz & 1048575, zzikVar.zzo());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 4:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzq(obj3, iZzz & 1048575, zzikVar.zzg());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 5:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzr(obj3, iZzz & 1048575, zzikVar.zzk());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 6:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzq(obj3, iZzz & 1048575, zzikVar.zzf());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 7:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzm(obj3, iZzz & 1048575, zzikVar.zzN());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 8:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzL(obj3, iZzz, zzikVar);
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 9:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzhy zzhyVar = (zzhy) zzF(obj3, iZzu);
                                    zzikVar.zzu(zzhyVar, zzC(iZzu), zzfzVar2);
                                    zzO(obj3, iZzu, zzhyVar);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 10:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzs(obj3, iZzz & 1048575, zzikVar.zzp());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 11:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzq(obj3, iZzz & 1048575, zzikVar.zzj());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 12:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    int iZze = zzikVar.zze();
                                    zzgs zzgsVarZzB = zzB(iZzu);
                                    if (zzgsVarZzB == null || zzgsVarZzB.zza()) {
                                        zzjp.zzq(obj3, iZzz & 1048575, iZze);
                                        zzM(obj3, iZzu);
                                    } else {
                                        objZzc = zzin.zzC(obj3, iZzc, iZze, objZzc, zzjfVar);
                                    }
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 13:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzq(obj3, iZzz & 1048575, zzikVar.zzh());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 14:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzr(obj3, iZzz & 1048575, zzikVar.zzm());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 15:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzq(obj3, iZzz & 1048575, zzikVar.zzi());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 16:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzjp.zzr(obj3, iZzz & 1048575, zzikVar.zzn());
                                    zzM(obj3, iZzu);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 17:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzhy zzhyVar2 = (zzhy) zzF(obj3, iZzu);
                                    zzikVar.zzt(zzhyVar2, zzC(iZzu), zzfzVar2);
                                    zzO(obj3, iZzu, zzhyVar2);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 18:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzx(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 19:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzB(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 20:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzE(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 21:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzM(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 22:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzD(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 23:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzA(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 24:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzz(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 25:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzv(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 26:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    if (zzS(iZzz)) {
                                        ((zzfg) zzikVar).zzK(this.zzn.zza(obj3, iZzz & 1048575), true);
                                    } else {
                                        ((zzfg) zzikVar).zzK(this.zzn.zza(obj3, iZzz & 1048575), false);
                                    }
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 27:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzF(this.zzn.zza(obj3, iZzz & 1048575), zzC(iZzu), zzfzVar2);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 28:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzw(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 29:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzL(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 30:
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    List listZza = this.zzn.zza(obj3, iZzz & 1048575);
                                    zzikVar.zzy(listZza);
                                    objZzc = zzin.zzB(obj, iZzc, listZza, zzB(iZzu), obj2, zzjfVar);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 31:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzG(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 32:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzH(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 33:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzI(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 34:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzJ(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 35:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzx(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 36:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzB(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 37:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzE(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 38:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzM(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 39:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzD(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 40:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzA(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 41:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzz(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 42:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzv(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 43:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzikVar.zzL(this.zzn.zza(obj3, iZzz & 1048575));
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 44:
                                    List listZza2 = this.zzn.zza(obj3, iZzz & 1048575);
                                    zzikVar.zzy(listZza2);
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    objZzc = zzin.zzB(obj, iZzc, listZza2, zzB(iZzu), obj2, zzjfVar);
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 45:
                                    zzikVar.zzG(this.zzn.zza(obj3, iZzz & 1048575));
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 46:
                                    zzikVar.zzH(this.zzn.zza(obj3, iZzz & 1048575));
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 47:
                                    zzikVar.zzI(this.zzn.zza(obj3, iZzz & 1048575));
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 48:
                                    zzikVar.zzJ(this.zzn.zza(obj3, iZzz & 1048575));
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 49:
                                    zzikVar.zzC(this.zzn.zza(obj3, iZzz & 1048575), zzC(iZzu), zzfzVar3);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 50:
                                    Object objZzE = zzE(iZzu);
                                    long jZzz = zzz(iZzu) & 1048575;
                                    Object objZzf = zzjp.zzf(obj3, jZzz);
                                    if (objZzf == null) {
                                        objZzf = zzhs.zza().zzb();
                                        zzjp.zzs(obj3, jZzz, objZzf);
                                    } else if (zzht.zzb(objZzf)) {
                                        Object objZzb = zzhs.zza().zzb();
                                        zzht.zzc(objZzb, objZzf);
                                        zzjp.zzs(obj3, jZzz, objZzb);
                                        objZzf = objZzb;
                                    }
                                    throw null;
                                case 51:
                                    zzjp.zzs(obj3, iZzz & 1048575, Double.valueOf(zzikVar.zza()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 52:
                                    zzjp.zzs(obj3, iZzz & 1048575, Float.valueOf(zzikVar.zzb()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 53:
                                    zzjp.zzs(obj3, iZzz & 1048575, Long.valueOf(zzikVar.zzl()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 54:
                                    zzjp.zzs(obj3, iZzz & 1048575, Long.valueOf(zzikVar.zzo()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 55:
                                    zzjp.zzs(obj3, iZzz & 1048575, Integer.valueOf(zzikVar.zzg()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 56:
                                    zzjp.zzs(obj3, iZzz & 1048575, Long.valueOf(zzikVar.zzk()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 57:
                                    zzjp.zzs(obj3, iZzz & 1048575, Integer.valueOf(zzikVar.zzf()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 58:
                                    zzjp.zzs(obj3, iZzz & 1048575, Boolean.valueOf(zzikVar.zzN()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 59:
                                    zzL(obj3, iZzz, zzikVar);
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 60:
                                    zzhy zzhyVar3 = (zzhy) zzG(obj3, iZzc, iZzu);
                                    zzikVar.zzu(zzhyVar3, zzC(iZzu), zzfzVar3);
                                    zzP(obj3, iZzc, iZzu, zzhyVar3);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 61:
                                    zzjp.zzs(obj3, iZzz & 1048575, zzikVar.zzp());
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 62:
                                    zzjp.zzs(obj3, iZzz & 1048575, Integer.valueOf(zzikVar.zzj()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 63:
                                    int iZze2 = zzikVar.zze();
                                    zzgs zzgsVarZzB2 = zzB(iZzu);
                                    if (zzgsVarZzB2 == null || zzgsVarZzB2.zza()) {
                                        zzjp.zzs(obj3, iZzz & 1048575, Integer.valueOf(iZze2));
                                        zzN(obj3, iZzc, iZzu);
                                        objZzc = obj2;
                                        zzgaVar = zzgaVar2;
                                        zzfzVar2 = zzfzVar3;
                                        zzgaVar2 = zzgaVar;
                                        zzfzVar3 = zzfzVar2;
                                    } else {
                                        objZzc = zzin.zzC(obj3, iZzc, iZze2, obj2, zzjfVar);
                                    }
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 64:
                                    zzjp.zzs(obj3, iZzz & 1048575, Integer.valueOf(zzikVar.zzh()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 65:
                                    zzjp.zzs(obj3, iZzz & 1048575, Long.valueOf(zzikVar.zzm()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 66:
                                    zzjp.zzs(obj3, iZzz & 1048575, Integer.valueOf(zzikVar.zzi()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 67:
                                    zzjp.zzs(obj3, iZzz & 1048575, Long.valueOf(zzikVar.zzn()));
                                    zzN(obj3, iZzc, iZzu);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                case 68:
                                    zzhy zzhyVar4 = (zzhy) zzG(obj3, iZzc, iZzu);
                                    zzikVar.zzt(zzhyVar4, zzC(iZzu), zzfzVar3);
                                    zzP(obj3, iZzc, iZzu, zzhyVar4);
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                                default:
                                    objZzc = obj2;
                                    zzgaVar = zzgaVar2;
                                    zzfzVar2 = zzfzVar3;
                                    if (objZzc == null) {
                                        try {
                                            try {
                                                objZzc = zzjfVar.zzc(obj3);
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        } catch (zzgx unused) {
                                            zzjfVar.zzs(zzikVar);
                                            if (objZzc == null) {
                                                objZzc = zzjfVar.zzc(obj3);
                                            }
                                            if (!zzjfVar.zzr(objZzc, zzikVar)) {
                                                for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                                                    zzD(obj, this.zzk[i4], objZzc, zzjfVar, obj);
                                                }
                                                if (objZzc != null) {
                                                    zzjfVar.zzn(obj3, objZzc);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                    if (!zzjfVar.zzr(objZzc, zzikVar)) {
                                        for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                                            zzD(obj, this.zzk[i5], objZzc, zzjfVar, obj);
                                        }
                                        if (objZzc != null) {
                                            zzjfVar.zzn(obj3, objZzc);
                                            return;
                                        }
                                        return;
                                    }
                                    zzgaVar2 = zzgaVar;
                                    zzfzVar3 = zzfzVar2;
                                    zzjfVar2 = zzjfVar;
                                    break;
                            }
                        } catch (zzgx unused2) {
                            objZzc = obj2;
                            zzgaVar = zzgaVar2;
                            zzfzVar2 = zzfzVar3;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        objZzc = obj2;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
            while (i < this.zzm) {
                zzD(obj, this.zzk[i], objZzc, zzjfVar, obj);
            }
            if (objZzc != null) {
                zzjfVar.zzn(obj3, objZzc);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02ef A[PHI: r0 r25 r26 r29
  0x02ef: PHI (r0v59 int) = (r0v54 int), (r0v57 int), (r0v61 int) binds: [B:115:0x034f, B:110:0x032c, B:102:0x02ed] A[DONT_GENERATE, DONT_INLINE]
  0x02ef: PHI (r25v3 int) = (r25v1 int), (r25v1 int), (r25v4 int) binds: [B:115:0x034f, B:110:0x032c, B:102:0x02ed] A[DONT_GENERATE, DONT_INLINE]
  0x02ef: PHI (r26v2 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:115:0x034f, B:110:0x032c, B:102:0x02ed] A[DONT_GENERATE, DONT_INLINE]
  0x02ef: PHI (r29v8 sun.misc.Unsafe) = (r29v6 sun.misc.Unsafe), (r29v6 sun.misc.Unsafe), (r29v9 sun.misc.Unsafe) binds: [B:115:0x034f, B:110:0x032c, B:102:0x02ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0300 A[PHI: r0 r25 r26 r29
  0x0300: PHI (r0v58 int) = (r0v54 int), (r0v57 int), (r0v61 int) binds: [B:115:0x034f, B:110:0x032c, B:102:0x02ed] A[DONT_GENERATE, DONT_INLINE]
  0x0300: PHI (r25v2 int) = (r25v1 int), (r25v1 int), (r25v4 int) binds: [B:115:0x034f, B:110:0x032c, B:102:0x02ed] A[DONT_GENERATE, DONT_INLINE]
  0x0300: PHI (r26v1 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:115:0x034f, B:110:0x032c, B:102:0x02ed] A[DONT_GENERATE, DONT_INLINE]
  0x0300: PHI (r29v7 sun.misc.Unsafe) = (r29v6 sun.misc.Unsafe), (r29v6 sun.misc.Unsafe), (r29v9 sun.misc.Unsafe) binds: [B:115:0x034f, B:110:0x032c, B:102:0x02ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0095. Please report as an issue. */
    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzem zzemVar) throws IOException {
        int i3;
        int iZzk;
        int i4;
        Unsafe unsafe;
        int i5;
        Unsafe unsafe2;
        int i6;
        Unsafe unsafe3;
        Unsafe unsafe4;
        int i7;
        int i8;
        int i9;
        zzib<T> zzibVar = this;
        obj = obj;
        bArr = bArr;
        i2 = i2;
        zzemVar = zzemVar;
        if (!zzibVar.zzj) {
            zzc(obj, bArr, i, i2, 0, zzemVar);
            return;
        }
        zzI(obj);
        Unsafe unsafe5 = zzb;
        int i10 = -1;
        int i11 = 1048575;
        int iZzi = i;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (iZzi < i2) {
            int i16 = iZzi + 1;
            byte b = bArr[iZzi];
            if (b < 0) {
                iZzk = zzen.zzk(b, bArr, i16, zzemVar);
                i3 = zzemVar.zza;
            } else {
                i3 = b;
                iZzk = i16;
            }
            int i17 = i3 >>> 3;
            int iZzv = i17 > i12 ? zzibVar.zzv(i17, i13 / 3) : zzibVar.zzu(i17);
            if (iZzv == i10) {
                i4 = i17;
                unsafe = unsafe5;
                i5 = 0;
            } else {
                int i18 = i3 & 7;
                int[] iArr = zzibVar.zzc;
                int i19 = iArr[iZzv + 1];
                int iZzy = zzy(i19);
                Unsafe unsafe6 = unsafe5;
                long j = i19 & i11;
                if (iZzy <= 17) {
                    int i20 = iArr[iZzv + 2];
                    int i21 = 1 << (i20 >>> 20);
                    int i22 = i20 & 1048575;
                    if (i22 != i15) {
                        if (i15 != 1048575) {
                            long j2 = i15;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj, j2, i14);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i22 != 1048575) {
                            i14 = unsafe4.getInt(obj, i22);
                        }
                        unsafe2 = unsafe4;
                        i15 = i22;
                    } else {
                        unsafe2 = unsafe6;
                    }
                    switch (iZzy) {
                        case 0:
                            this = this;
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 != 1) {
                                unsafe = unsafe3;
                                i15 = i6;
                            } else {
                                zzjp.zzo(obj, j, Double.longBitsToDouble(zzen.zzq(bArr, iZzk)));
                                iZzi = iZzk + 8;
                                i14 |= i21;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                                i2 = i2;
                            }
                            break;
                        case 1:
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 != 5) {
                                unsafe = unsafe3;
                                i15 = i6;
                            } else {
                                zzjp.zzp(obj, j, Float.intBitsToFloat(zzen.zzb(bArr, iZzk)));
                                iZzi = iZzk + 4;
                                i14 |= i21;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                                i2 = i2;
                            }
                            break;
                        case 2:
                        case 3:
                            this = this;
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 != 0) {
                                unsafe = unsafe3;
                                i15 = i6;
                            } else {
                                int iZzm = zzen.zzm(bArr, iZzk, zzemVar);
                                unsafe3.putLong(obj, j, zzemVar.zzb);
                                i14 |= i21;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                iZzi = iZzm;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                                i2 = i2;
                            }
                            break;
                        case 4:
                        case 11:
                            this = this;
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 != 0) {
                                unsafe = unsafe3;
                                i15 = i6;
                            } else {
                                iZzi = zzen.zzj(bArr, iZzk, zzemVar);
                                unsafe3.putInt(obj, j, zzemVar.zza);
                                i14 |= i21;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                                i2 = i2;
                            }
                            break;
                        case 5:
                        case 14:
                            this = this;
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 != 1) {
                                unsafe = unsafe3;
                                i15 = i6;
                            } else {
                                unsafe3.putLong(obj, j, zzen.zzq(bArr, iZzk));
                                iZzi = iZzk + 8;
                                i14 |= i21;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                                i2 = i2;
                            }
                            break;
                        case 6:
                        case 13:
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 != 5) {
                                unsafe = unsafe3;
                                i15 = i6;
                            } else {
                                unsafe3.putInt(obj, j, zzen.zzb(bArr, iZzk));
                                iZzi = iZzk + 4;
                                i14 |= i21;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                                i2 = i2;
                            }
                            break;
                        case 7:
                            this = this;
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 != 0) {
                                unsafe = unsafe3;
                                i15 = i6;
                            } else {
                                iZzi = zzen.zzm(bArr, iZzk, zzemVar);
                                zzjp.zzm(obj, j, zzemVar.zzb != 0);
                                i14 |= i21;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                                i2 = i2;
                            }
                            break;
                        case 8:
                            this = this;
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 != 2) {
                                unsafe = unsafe3;
                                i15 = i6;
                            } else {
                                iZzi = (i19 & DriveFile.MODE_WRITE_ONLY) == 0 ? zzen.zzg(bArr, iZzk, zzemVar) : zzen.zzh(bArr, iZzk, zzemVar);
                                unsafe3.putObject(obj, j, zzemVar.zzc);
                                i14 |= i21;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                                i2 = i2;
                            }
                            break;
                        case 9:
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 != 2) {
                                unsafe = unsafe3;
                                i15 = i6;
                            } else {
                                this = this;
                                Object objZzF = this.zzF(obj, i5);
                                iZzi = zzen.zzo(objZzF, this.zzC(i5), bArr, iZzk, i2, zzemVar);
                                this.zzO(obj, i5, objZzF);
                                i14 |= i21;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                                i2 = i2;
                            }
                            break;
                        case 10:
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 == 2) {
                                iZzi = zzen.zza(bArr, iZzk, zzemVar);
                                unsafe3.putObject(obj, j, zzemVar.zzc);
                                i14 |= i21;
                                i2 = i2;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                            }
                            unsafe = unsafe3;
                            i15 = i6;
                            break;
                        case 12:
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 == 0) {
                                iZzi = zzen.zzj(bArr, iZzk, zzemVar);
                                unsafe3.putInt(obj, j, zzemVar.zza);
                                i14 |= i21;
                                i2 = i2;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                            }
                            unsafe = unsafe3;
                            i15 = i6;
                            break;
                        case 15:
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            if (i18 == 0) {
                                iZzi = zzen.zzj(bArr, iZzk, zzemVar);
                                unsafe3.putInt(obj, j, zzff.zzF(zzemVar.zza));
                                i14 |= i21;
                                i2 = i2;
                                unsafe5 = unsafe3;
                                i13 = i5;
                                i15 = i6;
                                i12 = i4;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                            }
                            unsafe = unsafe3;
                            i15 = i6;
                            break;
                        case 16:
                            if (i18 != 0) {
                                i4 = i17;
                                i5 = iZzv;
                                i6 = i15;
                                unsafe3 = unsafe2;
                                unsafe = unsafe3;
                                i15 = i6;
                            } else {
                                int iZzm2 = zzen.zzm(bArr, iZzk, zzemVar);
                                unsafe2.putLong(obj, j, zzff.zzG(zzemVar.zzb));
                                i14 |= i21;
                                unsafe5 = unsafe2;
                                iZzi = iZzm2;
                                i13 = iZzv;
                                i15 = i15;
                                i12 = i17;
                                i11 = 1048575;
                                i10 = -1;
                                zzibVar = this;
                                i2 = i2;
                            }
                            break;
                        default:
                            i4 = i17;
                            i5 = iZzv;
                            i6 = i15;
                            unsafe3 = unsafe2;
                            unsafe = unsafe3;
                            i15 = i6;
                            break;
                    }
                } else {
                    i4 = i17;
                    int i23 = i15;
                    zzib<T> zzibVar2 = zzibVar;
                    i5 = iZzv;
                    if (iZzy != 27) {
                        if (iZzy <= 49) {
                            int i24 = iZzk;
                            i8 = i14;
                            i9 = i23;
                            unsafe = unsafe6;
                            iZzi = zzt(obj, bArr, iZzk, i2, i3, i4, i18, i5, i19, iZzy, j, zzemVar);
                            if (iZzi != i24) {
                                i13 = i5;
                                i12 = i4;
                                i14 = i8;
                                i15 = i9;
                            } else {
                                iZzk = iZzi;
                                i14 = i8;
                                i15 = i9;
                                iZzi = zzen.zzi(i3, bArr, iZzk, i2, zzd(obj), zzemVar);
                                i13 = i5;
                                i12 = i4;
                            }
                            unsafe5 = unsafe;
                        } else {
                            i7 = iZzk;
                            i8 = i14;
                            unsafe = unsafe6;
                            i9 = i23;
                            if (iZzy == 50) {
                                if (i18 == 2) {
                                    iZzi = zzr(obj, bArr, i7, i2, i5, j, zzemVar);
                                    if (iZzi != i7) {
                                        i13 = i5;
                                        i12 = i4;
                                        i14 = i8;
                                        i15 = i9;
                                    } else {
                                        iZzk = iZzi;
                                    }
                                    unsafe5 = unsafe;
                                }
                                i14 = i8;
                                i15 = i9;
                                iZzi = zzen.zzi(i3, bArr, iZzk, i2, zzd(obj), zzemVar);
                                i13 = i5;
                                i12 = i4;
                                unsafe5 = unsafe;
                            } else {
                                iZzi = zzs(obj, bArr, i7, i2, i3, i4, i18, i19, iZzy, j, i5, zzemVar);
                                if (iZzi != i7) {
                                    i13 = i5;
                                    i12 = i4;
                                    i14 = i8;
                                    i15 = i9;
                                } else {
                                    iZzk = iZzi;
                                    i14 = i8;
                                    i15 = i9;
                                    iZzi = zzen.zzi(i3, bArr, iZzk, i2, zzd(obj), zzemVar);
                                    i13 = i5;
                                    i12 = i4;
                                }
                                unsafe5 = unsafe;
                            }
                        }
                        i11 = 1048575;
                        i10 = -1;
                        zzibVar = this;
                    } else if (i18 == 2) {
                        zzgv zzgvVarZzd = (zzgv) unsafe6.getObject(obj, j);
                        if (!zzgvVarZzd.zzc()) {
                            int size = zzgvVarZzd.size();
                            zzgvVarZzd = zzgvVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj, j, zzgvVarZzd);
                        }
                        iZzi = zzen.zze(zzibVar2.zzC(i5), i3, bArr, iZzk, i2, zzgvVarZzd, zzemVar);
                        i2 = i2;
                        unsafe5 = unsafe6;
                        i14 = i14;
                        i13 = i5;
                        i15 = i23;
                        i12 = i4;
                        i11 = 1048575;
                        zzibVar = zzibVar2;
                        i10 = -1;
                    } else {
                        i7 = iZzk;
                        i8 = i14;
                        unsafe = unsafe6;
                        i9 = i23;
                    }
                    iZzk = i7;
                    i14 = i8;
                    i15 = i9;
                    iZzi = zzen.zzi(i3, bArr, iZzk, i2, zzd(obj), zzemVar);
                    i13 = i5;
                    i12 = i4;
                    unsafe5 = unsafe;
                    i11 = 1048575;
                    i10 = -1;
                    zzibVar = this;
                }
            }
            iZzi = zzen.zzi(i3, bArr, iZzk, i2, zzd(obj), zzemVar);
            i13 = i5;
            i12 = i4;
            unsafe5 = unsafe;
            i11 = 1048575;
            i10 = -1;
            zzibVar = this;
        }
        int i25 = i14;
        Unsafe unsafe7 = unsafe5;
        if (i15 != 1048575) {
            unsafe7.putInt(obj, i15, i25);
        }
        if (iZzi != i2) {
            throw zzgy.zzg();
        }
    }

    @Override // com.google.android.recaptcha.internal.zzil
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzY;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzz = zzz(i);
            long j = iZzz & 1048575;
            switch (zzy(iZzz)) {
                case 0:
                    if (!zzR(obj, obj2, i) || Double.doubleToLongBits(zzjp.zza(obj, j)) != Double.doubleToLongBits(zzjp.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzR(obj, obj2, i) || Float.floatToIntBits(zzjp.zzb(obj, j)) != Float.floatToIntBits(zzjp.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzR(obj, obj2, i) || zzjp.zzd(obj, j) != zzjp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzR(obj, obj2, i) || zzjp.zzd(obj, j) != zzjp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzR(obj, obj2, i) || zzjp.zzc(obj, j) != zzjp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzR(obj, obj2, i) || zzjp.zzd(obj, j) != zzjp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzR(obj, obj2, i) || zzjp.zzc(obj, j) != zzjp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzR(obj, obj2, i) || zzjp.zzw(obj, j) != zzjp.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzR(obj, obj2, i) || !zzin.zzY(zzjp.zzf(obj, j), zzjp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzR(obj, obj2, i) || !zzin.zzY(zzjp.zzf(obj, j), zzjp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzR(obj, obj2, i) || !zzin.zzY(zzjp.zzf(obj, j), zzjp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzR(obj, obj2, i) || zzjp.zzc(obj, j) != zzjp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzR(obj, obj2, i) || zzjp.zzc(obj, j) != zzjp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzR(obj, obj2, i) || zzjp.zzc(obj, j) != zzjp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzR(obj, obj2, i) || zzjp.zzd(obj, j) != zzjp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzR(obj, obj2, i) || zzjp.zzc(obj, j) != zzjp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzR(obj, obj2, i) || zzjp.zzd(obj, j) != zzjp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzR(obj, obj2, i) || !zzin.zzY(zzjp.zzf(obj, j), zzjp.zzf(obj2, j))) {
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
                    zZzY = zzin.zzY(zzjp.zzf(obj, j), zzjp.zzf(obj2, j));
                    break;
                case 50:
                    zZzY = zzin.zzY(zzjp.zzf(obj, j), zzjp.zzf(obj2, j));
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
                    long jZzw = zzw(i) & 1048575;
                    if (zzjp.zzc(obj, jZzw) != zzjp.zzc(obj2, jZzw) || !zzin.zzY(zzjp.zzf(obj, j), zzjp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzY) {
                return false;
            }
        }
        if (!this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzp.zzb(obj).equals(this.zzp.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2 A[LOOP:1: B:45:0x00b1->B:50:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00df A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzil
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        List list;
        zzil zzilVarZzC;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzl) {
            int i7 = this.zzk[i6];
            int i8 = this.zzc[i7];
            int iZzz = zzz(i7);
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
            if ((268435456 & iZzz) != 0 && !zzU(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzy = zzy(iZzz);
            if (iZzy == 9 || iZzy == 17) {
                if (zzU(obj, i7, i, i2, i11) && !zzV(obj, iZzz, zzC(i7))) {
                    return false;
                }
            } else if (iZzy == 27) {
                list = (List) zzjp.zzf(obj, iZzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzilVarZzC = zzC(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzilVarZzC.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzy == 60 || iZzy == 68) {
                if (zzX(obj, i8, i7) && !zzV(obj, iZzz, zzC(i7))) {
                    return false;
                }
            } else if (iZzy == 49) {
                list = (List) zzjp.zzf(obj, iZzz & 1048575);
                if (list.isEmpty()) {
                    zzilVarZzC = zzC(i7);
                    while (i3 < list.size()) {
                        if (!zzilVarZzC.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzy == 50 && !((zzhs) zzjp.zzf(obj, iZzz & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        return !this.zzh || this.zzp.zzb(obj).zzk();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:177:0x0548  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    @Override // com.google.android.recaptcha.internal.zzil
    public final void zzj(Object obj, zzjx zzjxVar) throws IOException {
        Iterator itZzf;
        Map.Entry entry;
        int i;
        Iterator itZzf2;
        Map.Entry entry2;
        if (!this.zzj) {
            if (this.zzh) {
                zzge zzgeVarZzb = this.zzp.zzb(obj);
                if (zzgeVarZzb.zza.isEmpty()) {
                    itZzf = null;
                    entry = null;
                } else {
                    itZzf = zzgeVarZzb.zzf();
                    entry = (Map.Entry) itZzf.next();
                }
            } else {
                itZzf = null;
                entry = null;
            }
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int iZzz = zzz(i4);
                int[] iArr = this.zzc;
                int i5 = iArr[i4];
                int iZzy = zzy(iZzz);
                if (iZzy <= 17) {
                    int i6 = iArr[i4 + 2];
                    int i7 = i6 & 1048575;
                    if (i7 != i2) {
                        i3 = unsafe.getInt(obj, i7);
                        i2 = i7;
                    }
                    i = 1 << (i6 >>> 20);
                } else {
                    i = 0;
                }
                while (entry != null && this.zzp.zza(entry) <= i5) {
                    this.zzp.zzi(zzjxVar, entry);
                    entry = itZzf.hasNext() ? (Map.Entry) itZzf.next() : null;
                }
                long j = iZzz & 1048575;
                switch (iZzy) {
                    case 0:
                        if ((i & i3) != 0) {
                            zzjxVar.zzf(i5, zzjp.zza(obj, j));
                        }
                        break;
                    case 1:
                        if ((i & i3) != 0) {
                            zzjxVar.zzo(i5, zzjp.zzb(obj, j));
                        }
                        break;
                    case 2:
                        if ((i & i3) != 0) {
                            zzjxVar.zzt(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 3:
                        if ((i & i3) != 0) {
                            zzjxVar.zzK(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 4:
                        if ((i & i3) != 0) {
                            zzjxVar.zzr(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 5:
                        if ((i & i3) != 0) {
                            zzjxVar.zzm(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 6:
                        if ((i & i3) != 0) {
                            zzjxVar.zzk(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 7:
                        if ((i & i3) != 0) {
                            zzjxVar.zzb(i5, zzjp.zzw(obj, j));
                        }
                        break;
                    case 8:
                        if ((i & i3) != 0) {
                            zzZ(i5, unsafe.getObject(obj, j), zzjxVar);
                        }
                        break;
                    case 9:
                        if ((i & i3) != 0) {
                            zzjxVar.zzv(i5, unsafe.getObject(obj, j), zzC(i4));
                        }
                        break;
                    case 10:
                        if ((i & i3) != 0) {
                            zzjxVar.zzd(i5, (zzez) unsafe.getObject(obj, j));
                        }
                        break;
                    case 11:
                        if ((i & i3) != 0) {
                            zzjxVar.zzI(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 12:
                        if ((i & i3) != 0) {
                            zzjxVar.zzi(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 13:
                        if ((i & i3) != 0) {
                            zzjxVar.zzx(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 14:
                        if ((i & i3) != 0) {
                            zzjxVar.zzz(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 15:
                        if ((i & i3) != 0) {
                            zzjxVar.zzB(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 16:
                        if ((i & i3) != 0) {
                            zzjxVar.zzD(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 17:
                        if ((i & i3) != 0) {
                            zzjxVar.zzq(i5, unsafe.getObject(obj, j), zzC(i4));
                        }
                        break;
                    case 18:
                        zzin.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 19:
                        zzin.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 20:
                        zzin.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 21:
                        zzin.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 22:
                        zzin.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 23:
                        zzin.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 24:
                        zzin.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 25:
                        zzin.zzG(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 26:
                        zzin.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar);
                        break;
                    case 27:
                        zzin.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, zzC(i4));
                        break;
                    case 28:
                        zzin.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar);
                        break;
                    case 29:
                        zzin.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 30:
                        zzin.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 31:
                        zzin.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 32:
                        zzin.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 33:
                        zzin.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 34:
                        zzin.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, false);
                        break;
                    case 35:
                        zzin.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 36:
                        zzin.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 37:
                        zzin.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 38:
                        zzin.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 39:
                        zzin.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 40:
                        zzin.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 41:
                        zzin.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 42:
                        zzin.zzG(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 43:
                        zzin.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 44:
                        zzin.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 45:
                        zzin.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 46:
                        zzin.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 47:
                        zzin.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 48:
                        zzin.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, true);
                        break;
                    case 49:
                        zzin.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzjxVar, zzC(i4));
                        break;
                    case 50:
                        zzQ(zzjxVar, i5, unsafe.getObject(obj, j), i4);
                        break;
                    case 51:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzf(i5, zzn(obj, j));
                        }
                        break;
                    case 52:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzo(i5, zzo(obj, j));
                        }
                        break;
                    case 53:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzt(i5, zzA(obj, j));
                        }
                        break;
                    case 54:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzK(i5, zzA(obj, j));
                        }
                        break;
                    case 55:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzr(i5, zzq(obj, j));
                        }
                        break;
                    case 56:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzm(i5, zzA(obj, j));
                        }
                        break;
                    case 57:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzk(i5, zzq(obj, j));
                        }
                        break;
                    case 58:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzb(i5, zzY(obj, j));
                        }
                        break;
                    case 59:
                        if (zzX(obj, i5, i4)) {
                            zzZ(i5, unsafe.getObject(obj, j), zzjxVar);
                        }
                        break;
                    case 60:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzv(i5, unsafe.getObject(obj, j), zzC(i4));
                        }
                        break;
                    case 61:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzd(i5, (zzez) unsafe.getObject(obj, j));
                        }
                        break;
                    case 62:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzI(i5, zzq(obj, j));
                        }
                        break;
                    case 63:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzi(i5, zzq(obj, j));
                        }
                        break;
                    case 64:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzx(i5, zzq(obj, j));
                        }
                        break;
                    case 65:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzz(i5, zzA(obj, j));
                        }
                        break;
                    case 66:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzB(i5, zzq(obj, j));
                        }
                        break;
                    case 67:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzD(i5, zzA(obj, j));
                        }
                        break;
                    case 68:
                        if (zzX(obj, i5, i4)) {
                            zzjxVar.zzq(i5, unsafe.getObject(obj, j), zzC(i4));
                        }
                        break;
                    default:
                        break;
                }
            }
            while (entry != null) {
                this.zzp.zzi(zzjxVar, entry);
                entry = itZzf.hasNext() ? (Map.Entry) itZzf.next() : null;
            }
            zzjf zzjfVar = this.zzo;
            zzjfVar.zzq(zzjfVar.zzd(obj), zzjxVar);
            return;
        }
        if (this.zzh) {
            zzge zzgeVarZzb2 = this.zzp.zzb(obj);
            if (zzgeVarZzb2.zza.isEmpty()) {
                itZzf2 = null;
                entry2 = null;
            } else {
                itZzf2 = zzgeVarZzb2.zzf();
                entry2 = (Map.Entry) itZzf2.next();
            }
        } else {
            itZzf2 = null;
            entry2 = null;
        }
        int length2 = this.zzc.length;
        for (int i8 = 0; i8 < length2; i8 += 3) {
            int iZzz2 = zzz(i8);
            int i9 = this.zzc[i8];
            while (entry2 != null && this.zzp.zza(entry2) <= i9) {
                this.zzp.zzi(zzjxVar, entry2);
                entry2 = itZzf2.hasNext() ? (Map.Entry) itZzf2.next() : null;
            }
            switch (zzy(iZzz2)) {
                case 0:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzf(i9, zzjp.zza(obj, iZzz2 & 1048575));
                    }
                    break;
                case 1:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzo(i9, zzjp.zzb(obj, iZzz2 & 1048575));
                    }
                    break;
                case 2:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzt(i9, zzjp.zzd(obj, iZzz2 & 1048575));
                    }
                    break;
                case 3:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzK(i9, zzjp.zzd(obj, iZzz2 & 1048575));
                    }
                    break;
                case 4:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzr(i9, zzjp.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 5:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzm(i9, zzjp.zzd(obj, iZzz2 & 1048575));
                    }
                    break;
                case 6:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzk(i9, zzjp.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 7:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzb(i9, zzjp.zzw(obj, iZzz2 & 1048575));
                    }
                    break;
                case 8:
                    if (zzT(obj, i8)) {
                        zzZ(i9, zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar);
                    }
                    break;
                case 9:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzv(i9, zzjp.zzf(obj, iZzz2 & 1048575), zzC(i8));
                    }
                    break;
                case 10:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzd(i9, (zzez) zzjp.zzf(obj, iZzz2 & 1048575));
                    }
                    break;
                case 11:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzI(i9, zzjp.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 12:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzi(i9, zzjp.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 13:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzx(i9, zzjp.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 14:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzz(i9, zzjp.zzd(obj, iZzz2 & 1048575));
                    }
                    break;
                case 15:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzB(i9, zzjp.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 16:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzD(i9, zzjp.zzd(obj, iZzz2 & 1048575));
                    }
                    break;
                case 17:
                    if (zzT(obj, i8)) {
                        zzjxVar.zzq(i9, zzjp.zzf(obj, iZzz2 & 1048575), zzC(i8));
                    }
                    break;
                case 18:
                    zzin.zzI(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 19:
                    zzin.zzM(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 20:
                    zzin.zzP(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 21:
                    zzin.zzX(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 22:
                    zzin.zzO(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 23:
                    zzin.zzL(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 24:
                    zzin.zzK(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 25:
                    zzin.zzG(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 26:
                    zzin.zzV(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar);
                    break;
                case 27:
                    zzin.zzQ(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, zzC(i8));
                    break;
                case 28:
                    zzin.zzH(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar);
                    break;
                case 29:
                    zzin.zzW(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 30:
                    zzin.zzJ(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 31:
                    zzin.zzR(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 32:
                    zzin.zzS(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 33:
                    zzin.zzT(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 34:
                    zzin.zzU(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, false);
                    break;
                case 35:
                    zzin.zzI(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 36:
                    zzin.zzM(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 37:
                    zzin.zzP(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 38:
                    zzin.zzX(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 39:
                    zzin.zzO(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 40:
                    zzin.zzL(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 41:
                    zzin.zzK(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 42:
                    zzin.zzG(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 43:
                    zzin.zzW(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 44:
                    zzin.zzJ(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 45:
                    zzin.zzR(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 46:
                    zzin.zzS(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 47:
                    zzin.zzT(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 48:
                    zzin.zzU(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, true);
                    break;
                case 49:
                    zzin.zzN(this.zzc[i8], (List) zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar, zzC(i8));
                    break;
                case 50:
                    zzQ(zzjxVar, i9, zzjp.zzf(obj, iZzz2 & 1048575), i8);
                    break;
                case 51:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzf(i9, zzn(obj, iZzz2 & 1048575));
                    }
                    break;
                case 52:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzo(i9, zzo(obj, iZzz2 & 1048575));
                    }
                    break;
                case 53:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzt(i9, zzA(obj, iZzz2 & 1048575));
                    }
                    break;
                case 54:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzK(i9, zzA(obj, iZzz2 & 1048575));
                    }
                    break;
                case 55:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzr(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 56:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzm(i9, zzA(obj, iZzz2 & 1048575));
                    }
                    break;
                case 57:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzk(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 58:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzb(i9, zzY(obj, iZzz2 & 1048575));
                    }
                    break;
                case 59:
                    if (zzX(obj, i9, i8)) {
                        zzZ(i9, zzjp.zzf(obj, iZzz2 & 1048575), zzjxVar);
                    }
                    break;
                case 60:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzv(i9, zzjp.zzf(obj, iZzz2 & 1048575), zzC(i8));
                    }
                    break;
                case 61:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzd(i9, (zzez) zzjp.zzf(obj, iZzz2 & 1048575));
                    }
                    break;
                case 62:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzI(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 63:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzi(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 64:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzx(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 65:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzz(i9, zzA(obj, iZzz2 & 1048575));
                    }
                    break;
                case 66:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzB(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 67:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzD(i9, zzA(obj, iZzz2 & 1048575));
                    }
                    break;
                case 68:
                    if (zzX(obj, i9, i8)) {
                        zzjxVar.zzq(i9, zzjp.zzf(obj, iZzz2 & 1048575), zzC(i8));
                    }
                    break;
            }
        }
        while (entry2 != null) {
            this.zzp.zzi(zzjxVar, entry2);
            entry2 = itZzf2.hasNext() ? (Map.Entry) itZzf2.next() : null;
        }
        zzjf zzjfVar2 = this.zzo;
        zzjfVar2.zzq(zzjfVar2.zzd(obj), zzjxVar);
    }
}
