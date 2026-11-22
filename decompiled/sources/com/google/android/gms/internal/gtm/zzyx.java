package com.google.android.gms.internal.gtm;

import com.google.android.gms.drive.DriveFile;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyx<T> implements zzzh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzaai.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzyu zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzyi zzm;
    private final zzzy zzn;
    private final zzwu zzo;
    private final int zzp;
    private final zzza zzq;
    private final zzyp zzr;

    private zzyx(int[] iArr, Object[] objArr, int i, int i2, zzyu zzyuVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzza zzzaVar, zzyi zzyiVar, zzzy zzzyVar, zzwu zzwuVar, zzyp zzypVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzyuVar instanceof zzxj;
        this.zzp = i3;
        boolean z2 = false;
        if (zzwuVar != null && zzwuVar.zzi(zzyuVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzq = zzzaVar;
        this.zzm = zzyiVar;
        this.zzn = zzzyVar;
        this.zzo = zzwuVar;
        this.zzg = zzyuVar;
        this.zzr = zzypVar;
    }

    private static long zzA(Object obj, long j) {
        return ((Long) zzaai.zzf(obj, j)).longValue();
    }

    private final zzxn zzB(int i) {
        int i2 = i / 3;
        return (zzxn) this.zzd[i2 + i2 + 1];
    }

    private final zzzh zzC(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzzh zzzhVar = (zzzh) this.zzd[i3];
        if (zzzhVar != null) {
            return zzzhVar;
        }
        zzzh zzzhVarZzb = zzzd.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzzhVarZzb;
        return zzzhVarZzb;
    }

    private final Object zzD(Object obj, int i, Object obj2, zzzy zzzyVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzf = zzaai.zzf(obj, zzz(i) & 1048575);
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
        zzzh zzzhVarZzC = zzC(i);
        int iZzz = zzz(i) & 1048575;
        if (!zzS(obj, i)) {
            return zzzhVarZzC.zze();
        }
        Object object = zzb.getObject(obj, iZzz);
        if (zzV(object)) {
            return object;
        }
        Object objZze = zzzhVarZzC.zze();
        if (object != null) {
            zzzhVarZzC.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzG(Object obj, int i, int i2) {
        zzzh zzzhVarZzC = zzC(i2);
        if (!zzW(obj, i, i2)) {
            return zzzhVarZzC.zze();
        }
        Object object = zzb.getObject(obj, zzz(i2) & 1048575);
        if (zzV(object)) {
            return object;
        }
        Object objZze = zzzhVarZzC.zze();
        if (object != null) {
            zzzhVarZzC.zzg(objZze, object);
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
        if (!zzV(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        if (zzS(obj2, i)) {
            int iZzz = zzz(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzz;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzzh zzzhVarZzC = zzC(i);
            if (!zzS(obj, i)) {
                if (zzV(object)) {
                    Object objZze = zzzhVarZzC.zze();
                    zzzhVarZzC.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzV(object2)) {
                Object objZze2 = zzzhVarZzC.zze();
                zzzhVarZzC.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzzhVarZzC.zzg(object2, object);
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzW(obj2, i2, i)) {
            int iZzz = zzz(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzz;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzzh zzzhVarZzC = zzC(i);
            if (!zzW(obj, i2, i)) {
                if (zzV(object)) {
                    Object objZze = zzzhVarZzC.zze();
                    zzzhVarZzC.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzV(object2)) {
                Object objZze2 = zzzhVarZzC.zze();
                zzzhVarZzC.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzzhVarZzC.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, int i, zzzg zzzgVar) throws IOException {
        if (zzR(i)) {
            zzaai.zzs(obj, i & 1048575, zzzgVar.zzu());
        } else if (this.zzi) {
            zzaai.zzs(obj, i & 1048575, zzzgVar.zzt());
        } else {
            zzaai.zzs(obj, i & 1048575, zzzgVar.zzp());
        }
    }

    private final void zzM(Object obj, int i) {
        int iZzw = zzw(i);
        long j = 1048575 & iZzw;
        if (j == 1048575) {
            return;
        }
        zzaai.zzq(obj, j, (1 << (iZzw >>> 20)) | zzaai.zzc(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzaai.zzq(obj, zzw(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzz(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzz(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    private final boolean zzQ(Object obj, Object obj2, int i) {
        return zzS(obj, i) == zzS(obj2, i);
    }

    private static boolean zzR(int i) {
        return (i & DriveFile.MODE_WRITE_ONLY) != 0;
    }

    private final boolean zzS(Object obj, int i) {
        int iZzw = zzw(i);
        long j = iZzw & 1048575;
        if (j != 1048575) {
            return (zzaai.zzc(obj, j) & (1 << (iZzw >>> 20))) != 0;
        }
        int iZzz = zzz(i);
        long j2 = iZzz & 1048575;
        switch (zzy(iZzz)) {
            case 0:
                return Double.doubleToRawLongBits(zzaai.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzaai.zzb(obj, j2)) != 0;
            case 2:
                return zzaai.zzd(obj, j2) != 0;
            case 3:
                return zzaai.zzd(obj, j2) != 0;
            case 4:
                return zzaai.zzc(obj, j2) != 0;
            case 5:
                return zzaai.zzd(obj, j2) != 0;
            case 6:
                return zzaai.zzc(obj, j2) != 0;
            case 7:
                return zzaai.zzw(obj, j2);
            case 8:
                Object objZzf = zzaai.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzud) {
                    return !zzud.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzaai.zzf(obj, j2) != null;
            case 10:
                return !zzud.zzb.equals(zzaai.zzf(obj, j2));
            case 11:
                return zzaai.zzc(obj, j2) != 0;
            case 12:
                return zzaai.zzc(obj, j2) != 0;
            case 13:
                return zzaai.zzc(obj, j2) != 0;
            case 14:
                return zzaai.zzd(obj, j2) != 0;
            case 15:
                return zzaai.zzc(obj, j2) != 0;
            case 16:
                return zzaai.zzd(obj, j2) != 0;
            case 17:
                return zzaai.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzT(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzS(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzU(Object obj, int i, zzzh zzzhVar) {
        return zzzhVar.zzk(zzaai.zzf(obj, i & 1048575));
    }

    private static boolean zzV(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzxj) {
            return ((zzxj) obj).zzaq();
        }
        return true;
    }

    private final boolean zzW(Object obj, int i, int i2) {
        return zzaai.zzc(obj, (long) (zzw(i2) & 1048575)) == i;
    }

    private static boolean zzX(Object obj, long j) {
        return ((Boolean) zzaai.zzf(obj, j)).booleanValue();
    }

    private final void zzY(zzur zzurVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzZ(int i, Object obj, zzur zzurVar) throws IOException {
        if (obj instanceof String) {
            zzurVar.zzG(i, (String) obj);
        } else {
            zzurVar.zzd(i, (zzud) obj);
        }
    }

    static zzzz zzd(Object obj) {
        zzxj zzxjVar = (zzxj) obj;
        zzzz zzzzVar = zzxjVar.zzc;
        if (zzzzVar != zzzz.zzc()) {
            return zzzzVar;
        }
        zzzz zzzzVarZzf = zzzz.zzf();
        zzxjVar.zzc = zzzzVarZzf;
        return zzzzVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x024e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0251  */
    /* JADX WARN: Code duplicated, block: B:127:0x0269  */
    /* JADX WARN: Code duplicated, block: B:128:0x026c  */
    static zzyx zzl(Class cls, zzyr zzyrVar, zzza zzzaVar, zzyi zzyiVar, zzzy zzzyVar, zzwu zzwuVar, zzyp zzypVar) {
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
        Field fieldZzH;
        char cCharAt9;
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
        if (!(zzyrVar instanceof zzzf)) {
            throw null;
        }
        zzzf zzzfVar = (zzzf) zzyrVar;
        String strZzd = zzzfVar.zzd();
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
        Object[] objArrZze = zzzfVar.zze();
        Class<?> cls2 = zzzfVar.zza().getClass();
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
                    if (i74 == 12 && (zzzfVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i77 = i61 / 3;
                        i21 = i2 + 1;
                        objArr[i77 + i77 + 1] = objArrZze[i2];
                    }
                    i22 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i22];
                    if (obj instanceof Field) {
                        fieldZzH2 = (Field) obj;
                    } else {
                        fieldZzH2 = zzH(cls2, (String) obj);
                        objArrZze[i22] = fieldZzH2;
                    }
                    int i78 = i3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzH2);
                    i23 = i22 + 1;
                    obj2 = objArrZze[i23];
                    if (obj2 instanceof Field) {
                        fieldZzH3 = (Field) obj2;
                    } else {
                        fieldZzH3 = zzH(cls2, (String) obj2);
                        objArrZze[i23] = fieldZzH3;
                    }
                    i17 = i78;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzH3);
                    i18 = i75;
                    i19 = 0;
                    strZzd = strZzd;
                }
                i2 = i21;
                i22 = iCharAt12 + iCharAt12;
                obj = objArrZze[i22];
                if (obj instanceof Field) {
                    fieldZzH2 = (Field) obj;
                } else {
                    fieldZzH2 = zzH(cls2, (String) obj);
                    objArrZze[i22] = fieldZzH2;
                }
                int i79 = i3;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzH2);
                i23 = i22 + 1;
                obj2 = objArrZze[i23];
                if (obj2 instanceof Field) {
                    fieldZzH3 = (Field) obj2;
                } else {
                    fieldZzH3 = zzH(cls2, (String) obj2);
                    objArrZze[i23] = fieldZzH3;
                }
                i17 = i79;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzH3);
                i18 = i75;
                i19 = 0;
                strZzd = strZzd;
            } else {
                i17 = i3;
                int i80 = i2 + 1;
                Field fieldZzH4 = zzH(cls2, (String) objArrZze[i2]);
                if (i70 == 9 || i70 == 17) {
                    i17 = i17;
                    int i81 = i61 / 3;
                    objArr[i81 + i81 + 1] = fieldZzH4.getType();
                } else {
                    if (i70 == 27 || i70 == 49) {
                        i17 = i17;
                        int i82 = i61 / 3;
                        i20 = i80 + 1;
                        objArr[i82 + i82 + 1] = objArrZze[i80];
                    } else if (i70 == 12 || i70 == 30 || i70 == 44) {
                        i17 = i17;
                        if (zzzfVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
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
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzH4);
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
                        fieldZzH = (Field) obj3;
                    } else {
                        fieldZzH = zzH(cls2, (String) obj3);
                        objArrZze[i91] = fieldZzH;
                    }
                    i19 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzH);
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
            iArr2[i92] = iObjectFieldOffset2 | ((iCharAt11 & 256) != 0 ? DriveFile.MODE_READ_ONLY : 0) | ((iCharAt11 & 512) != 0 ? DriveFile.MODE_WRITE_ONLY : 0) | (i70 << 20);
            i61 = i93 + 1;
            iArr2[i93] = (i19 << 20) | iObjectFieldOffset;
            i29 = i18;
            length = length;
            i3 = i17;
            strZzd = strZzd;
            i6 = i6;
            c = 55296;
        }
        return new zzyx(iArr2, objArr, i3, i6, zzzfVar.zza(), zzzfVar.zzc(), false, iArr, i4, i56, zzzaVar, zzyiVar, zzzyVar, zzwuVar, zzypVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzaai.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzaai.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int iZzD;
        int iZzD2;
        int iZzE;
        int iZzD3;
        int iZzD4;
        int iZzD5;
        int iZzD6;
        int iZzt;
        int iZzh;
        int iZzD7;
        int iZzD8;
        int iZzD9;
        int iZzD10;
        int iZzD11;
        int iZzD12;
        int iZzD13;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int iZzD14 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < this.zzc.length) {
            int iZzz = zzz(i3);
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int iZzy = zzy(iZzz);
            if (iZzy <= 17) {
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
            long j = iZzz & i2;
            switch (iZzy) {
                case 0:
                    if ((i5 & i) != 0) {
                        iZzD = zzuq.zzD(i6 << 3);
                        iZzD4 = iZzD + 8;
                        iZzD14 += iZzD4;
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        iZzD2 = zzuq.zzD(i6 << 3);
                        iZzD4 = iZzD2 + 4;
                        iZzD14 += iZzD4;
                    }
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        iZzE = zzuq.zzE(unsafe.getLong(obj, j));
                        iZzD3 = zzuq.zzD(i6 << 3);
                        iZzD14 += iZzD3 + iZzE;
                    }
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        iZzE = zzuq.zzE(unsafe.getLong(obj, j));
                        iZzD3 = zzuq.zzD(i6 << 3);
                        iZzD14 += iZzD3 + iZzE;
                    }
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        iZzE = zzuq.zzz(unsafe.getInt(obj, j));
                        iZzD3 = zzuq.zzD(i6 << 3);
                        iZzD14 += iZzD3 + iZzE;
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        iZzD = zzuq.zzD(i6 << 3);
                        iZzD4 = iZzD + 8;
                        iZzD14 += iZzD4;
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        iZzD2 = zzuq.zzD(i6 << 3);
                        iZzD4 = iZzD2 + 4;
                        iZzD14 += iZzD4;
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        iZzD4 = zzuq.zzD(i6 << 3) + 1;
                        iZzD14 += iZzD4;
                    }
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzud) {
                            int i10 = zzuq.zzf;
                            int iZzd = ((zzud) object).zzd();
                            iZzD5 = zzuq.zzD(iZzd) + iZzd;
                            iZzD6 = zzuq.zzD(i6 << 3);
                            iZzD4 = iZzD6 + iZzD5;
                            iZzD14 += iZzD4;
                        } else {
                            iZzE = zzuq.zzC((String) object);
                            iZzD3 = zzuq.zzD(i6 << 3);
                            iZzD14 += iZzD3 + iZzE;
                        }
                    }
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        iZzD4 = zzzj.zzn(i6, unsafe.getObject(obj, j), zzC(i3));
                        iZzD14 += iZzD4;
                    }
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        zzud zzudVar = (zzud) unsafe.getObject(obj, j);
                        int i11 = zzuq.zzf;
                        int iZzd2 = zzudVar.zzd();
                        iZzD5 = zzuq.zzD(iZzd2) + iZzd2;
                        iZzD6 = zzuq.zzD(i6 << 3);
                        iZzD4 = iZzD6 + iZzD5;
                        iZzD14 += iZzD4;
                    }
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        iZzE = zzuq.zzD(unsafe.getInt(obj, j));
                        iZzD3 = zzuq.zzD(i6 << 3);
                        iZzD14 += iZzD3 + iZzE;
                    }
                    break;
                case 12:
                    if ((i5 & i) != 0) {
                        iZzE = zzuq.zzz(unsafe.getInt(obj, j));
                        iZzD3 = zzuq.zzD(i6 << 3);
                        iZzD14 += iZzD3 + iZzE;
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        iZzD2 = zzuq.zzD(i6 << 3);
                        iZzD4 = iZzD2 + 4;
                        iZzD14 += iZzD4;
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        iZzD = zzuq.zzD(i6 << 3);
                        iZzD4 = iZzD + 8;
                        iZzD14 += iZzD4;
                    }
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzD3 = zzuq.zzD(i6 << 3);
                        iZzE = zzuq.zzD((i12 >> 31) ^ (i12 + i12));
                        iZzD14 += iZzD3 + iZzE;
                    }
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzD14 += zzuq.zzD(i6 << 3) + zzuq.zzE((j2 >> 63) ^ (j2 + j2));
                    }
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        iZzD4 = zzuq.zzy(i6, (zzyu) unsafe.getObject(obj, j), zzC(i3));
                        iZzD14 += iZzD4;
                    }
                    break;
                case 18:
                    iZzD4 = zzzj.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzD4;
                    break;
                case 19:
                    iZzD4 = zzzj.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzD4;
                    break;
                case 20:
                    iZzD4 = zzzj.zzl(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzD4;
                    break;
                case 21:
                    iZzD4 = zzzj.zzw(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzD4;
                    break;
                case 22:
                    iZzD4 = zzzj.zzj(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzD4;
                    break;
                case 23:
                    iZzD4 = zzzj.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzD4;
                    break;
                case 24:
                    iZzD4 = zzzj.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzD4;
                    break;
                case 25:
                    iZzD4 = zzzj.zza(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzD4;
                    break;
                case 26:
                    iZzt = zzzj.zzt(i6, (List) unsafe.getObject(obj, j));
                    iZzD14 += iZzt;
                    break;
                case 27:
                    iZzt = zzzj.zzo(i6, (List) unsafe.getObject(obj, j), zzC(i3));
                    iZzD14 += iZzt;
                    break;
                case 28:
                    iZzt = zzzj.zzb(i6, (List) unsafe.getObject(obj, j));
                    iZzD14 += iZzt;
                    break;
                case 29:
                    iZzt = zzzj.zzu(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzt;
                    break;
                case 30:
                    iZzt = zzzj.zzc(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzt;
                    break;
                case 31:
                    iZzt = zzzj.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzt;
                    break;
                case 32:
                    iZzt = zzzj.zzg(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzt;
                    break;
                case 33:
                    iZzt = zzzj.zzp(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzt;
                    break;
                case 34:
                    iZzt = zzzj.zzr(i6, (List) unsafe.getObject(obj, j), false);
                    iZzD14 += iZzt;
                    break;
                case 35:
                    iZzh = zzzj.zzh((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 36:
                    iZzh = zzzj.zzf((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 37:
                    iZzh = zzzj.zzm((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 38:
                    iZzh = zzzj.zzx((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 39:
                    iZzh = zzzj.zzk((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 40:
                    iZzh = zzzj.zzh((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 41:
                    iZzh = zzzj.zzf((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i13 = zzzj.zza;
                    iZzh = list.size();
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 43:
                    iZzh = zzzj.zzv((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 44:
                    iZzh = zzzj.zzd((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 45:
                    iZzh = zzzj.zzf((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 46:
                    iZzh = zzzj.zzh((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 47:
                    iZzh = zzzj.zzq((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 48:
                    iZzh = zzzj.zzs((List) unsafe.getObject(obj, j));
                    if (iZzh > 0) {
                        iZzD7 = zzuq.zzD(iZzh);
                        iZzD8 = zzuq.zzD(i6 << 3);
                        iZzD9 = iZzD8 + iZzD7;
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 49:
                    iZzt = zzzj.zzi(i6, (List) unsafe.getObject(obj, j), zzC(i3));
                    iZzD14 += iZzt;
                    break;
                case 50:
                    zzyp.zza(i6, unsafe.getObject(obj, j), zzE(i3));
                    break;
                case 51:
                    if (zzW(obj, i6, i3)) {
                        iZzD10 = zzuq.zzD(i6 << 3);
                        iZzt = iZzD10 + 8;
                        iZzD14 += iZzt;
                    }
                    break;
                case 52:
                    if (zzW(obj, i6, i3)) {
                        iZzD11 = zzuq.zzD(i6 << 3);
                        iZzt = iZzD11 + 4;
                        iZzD14 += iZzt;
                    }
                    break;
                case 53:
                    if (zzW(obj, i6, i3)) {
                        iZzh = zzuq.zzE(zzA(obj, j));
                        iZzD9 = zzuq.zzD(i6 << 3);
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 54:
                    if (zzW(obj, i6, i3)) {
                        iZzh = zzuq.zzE(zzA(obj, j));
                        iZzD9 = zzuq.zzD(i6 << 3);
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 55:
                    if (zzW(obj, i6, i3)) {
                        iZzh = zzuq.zzz(zzq(obj, j));
                        iZzD9 = zzuq.zzD(i6 << 3);
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 56:
                    if (zzW(obj, i6, i3)) {
                        iZzD10 = zzuq.zzD(i6 << 3);
                        iZzt = iZzD10 + 8;
                        iZzD14 += iZzt;
                    }
                    break;
                case 57:
                    if (zzW(obj, i6, i3)) {
                        iZzD11 = zzuq.zzD(i6 << 3);
                        iZzt = iZzD11 + 4;
                        iZzD14 += iZzt;
                    }
                    break;
                case 58:
                    if (zzW(obj, i6, i3)) {
                        iZzt = zzuq.zzD(i6 << 3) + 1;
                        iZzD14 += iZzt;
                    }
                    break;
                case 59:
                    if (zzW(obj, i6, i3)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzud) {
                            int i14 = zzuq.zzf;
                            int iZzd3 = ((zzud) object2).zzd();
                            iZzD12 = zzuq.zzD(iZzd3) + iZzd3;
                            iZzD13 = zzuq.zzD(i6 << 3);
                            iZzt = iZzD13 + iZzD12;
                            iZzD14 += iZzt;
                        } else {
                            iZzh = zzuq.zzC((String) object2);
                            iZzD9 = zzuq.zzD(i6 << 3);
                            iZzD14 += iZzD9 + iZzh;
                        }
                    }
                    break;
                case 60:
                    if (zzW(obj, i6, i3)) {
                        iZzt = zzzj.zzn(i6, unsafe.getObject(obj, j), zzC(i3));
                        iZzD14 += iZzt;
                    }
                    break;
                case 61:
                    if (zzW(obj, i6, i3)) {
                        zzud zzudVar2 = (zzud) unsafe.getObject(obj, j);
                        int i15 = zzuq.zzf;
                        int iZzd4 = zzudVar2.zzd();
                        iZzD12 = zzuq.zzD(iZzd4) + iZzd4;
                        iZzD13 = zzuq.zzD(i6 << 3);
                        iZzt = iZzD13 + iZzD12;
                        iZzD14 += iZzt;
                    }
                    break;
                case 62:
                    if (zzW(obj, i6, i3)) {
                        iZzh = zzuq.zzD(zzq(obj, j));
                        iZzD9 = zzuq.zzD(i6 << 3);
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 63:
                    if (zzW(obj, i6, i3)) {
                        iZzh = zzuq.zzz(zzq(obj, j));
                        iZzD9 = zzuq.zzD(i6 << 3);
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 64:
                    if (zzW(obj, i6, i3)) {
                        iZzD11 = zzuq.zzD(i6 << 3);
                        iZzt = iZzD11 + 4;
                        iZzD14 += iZzt;
                    }
                    break;
                case 65:
                    if (zzW(obj, i6, i3)) {
                        iZzD10 = zzuq.zzD(i6 << 3);
                        iZzt = iZzD10 + 8;
                        iZzD14 += iZzt;
                    }
                    break;
                case 66:
                    if (zzW(obj, i6, i3)) {
                        int iZzq = zzq(obj, j);
                        iZzD9 = zzuq.zzD(i6 << 3);
                        iZzh = zzuq.zzD((iZzq >> 31) ^ (iZzq + iZzq));
                        iZzD14 += iZzD9 + iZzh;
                    }
                    break;
                case 67:
                    if (zzW(obj, i6, i3)) {
                        long jZzA = zzA(obj, j);
                        iZzD14 += zzuq.zzD(i6 << 3) + zzuq.zzE((jZzA >> 63) ^ (jZzA + jZzA));
                    }
                    break;
                case 68:
                    if (zzW(obj, i6, i3)) {
                        iZzt = zzuq.zzy(i6, (zzyu) unsafe.getObject(obj, j), zzC(i3));
                        iZzD14 += iZzt;
                    }
                    break;
                default:
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        int iZzb = 0;
        zzzy zzzyVar = this.zzn;
        int iZza = iZzD14 + zzzyVar.zza(zzzyVar.zzd(obj));
        if (!this.zzh) {
            return iZza;
        }
        zzwy zzwyVarZzb = this.zzo.zzb(obj);
        for (int i16 = 0; i16 < zzwyVarZzb.zza.zzb(); i16++) {
            Map.Entry entryZzg = zzwyVarZzb.zza.zzg(i16);
            iZzb += zzwy.zzb((zzwx) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : zzwyVarZzb.zza.zzc()) {
            iZzb += zzwy.zzb((zzwx) entry.getKey(), entry.getValue());
        }
        return iZza + iZzb;
    }

    private static int zzq(Object obj, long j) {
        return ((Integer) zzaai.zzf(obj, j)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i2, int i3, long j, zztp zztpVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzE = zzE(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzyp.zzb(object)) {
            zzyo zzyoVarZzb = zzyo.zza().zzb();
            zzyp.zzc(zzyoVarZzb, object);
            unsafe.putObject(obj, j, zzyoVarZzb);
        }
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zztp zztpVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zztq.zzq(bArr, i))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zztq.zzb(bArr, i))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iZzm = zztq.zzm(bArr, i, zztpVar);
                unsafe.putObject(obj, j, Long.valueOf(zztpVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return iZzm;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iZzj = zztq.zzj(bArr, i, zztpVar);
                unsafe.putObject(obj, j, Integer.valueOf(zztpVar.zza));
                unsafe.putInt(obj, j2, i4);
                return iZzj;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zztq.zzq(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zztq.zzb(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iZzm2 = zztq.zzm(bArr, i, zztpVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zztpVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return iZzm2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZzj2 = zztq.zzj(bArr, i, zztpVar);
                int i13 = zztpVar.zza;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & DriveFile.MODE_WRITE_ONLY) != 0 && !zzaan.zzf(bArr, iZzj2, iZzj2 + i13)) {
                        throw zzxu.zzd();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i13, zzxs.zzb));
                    iZzj2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iZzj2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objZzG = zzG(obj, i4, i8);
                int iZzo = zztq.zzo(objZzG, zzC(i8), bArr, i, i2, zztpVar);
                zzP(obj, i4, i8, objZzG);
                return iZzo;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iZza = zztq.zza(bArr, i, zztpVar);
                unsafe.putObject(obj, j, zztpVar.zzc);
                unsafe.putInt(obj, j2, i4);
                return iZza;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iZzj3 = zztq.zzj(bArr, i, zztpVar);
                int i14 = zztpVar.zza;
                zzxn zzxnVarZzB = zzB(i8);
                if (zzxnVarZzB == null || zzxnVarZzB.zza(i14)) {
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
                int iZzj4 = zztq.zzj(bArr, i, zztpVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzuj.zzF(zztpVar.zza)));
                unsafe.putInt(obj, j2, i4);
                return iZzj4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iZzm3 = zztq.zzm(bArr, i, zztpVar);
                unsafe.putObject(obj, j, Long.valueOf(zzuj.zzG(zztpVar.zzb)));
                unsafe.putInt(obj, j2, i4);
                return iZzm3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                Object objZzG2 = zzG(obj, i4, i8);
                int iZzn = zztq.zzn(objZzG2, zzC(i8), bArr, i, i2, (i3 & (-8)) | 4, zztpVar);
                zzP(obj, i4, i8, objZzG2);
                return iZzn;
            default:
                return i;
        }
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zztp zztpVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzj;
        int iZzj2 = i;
        Unsafe unsafe = zzb;
        zzxr zzxrVarZzd = (zzxr) unsafe.getObject(obj, j2);
        if (!zzxrVarZzd.zzc()) {
            int size = zzxrVarZzd.size();
            zzxrVarZzd = zzxrVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzxrVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzwq zzwqVar = (zzwq) zzxrVarZzd;
                    int iZzj3 = zztq.zzj(bArr, iZzj2, zztpVar);
                    int i12 = zztpVar.zza + iZzj3;
                    while (iZzj3 < i12) {
                        zzwqVar.zze(Double.longBitsToDouble(zztq.zzq(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i12) {
                        return iZzj3;
                    }
                    throw zzxu.zzj();
                }
                if (i5 == 1) {
                    zzwq zzwqVar2 = (zzwq) zzxrVarZzd;
                    zzwqVar2.zze(Double.longBitsToDouble(zztq.zzq(bArr, i)));
                    while (true) {
                        i8 = iZzj2 + 8;
                        if (i8 < i2) {
                            iZzj2 = zztq.zzj(bArr, i8, zztpVar);
                            if (i3 == zztpVar.zza) {
                                zzwqVar2.zze(Double.longBitsToDouble(zztq.zzq(bArr, iZzj2)));
                            }
                        }
                    }
                    return i8;
                }
                return iZzj2;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzxa zzxaVar = (zzxa) zzxrVarZzd;
                    int iZzj4 = zztq.zzj(bArr, iZzj2, zztpVar);
                    int i13 = zztpVar.zza + iZzj4;
                    while (iZzj4 < i13) {
                        zzxaVar.zze(Float.intBitsToFloat(zztq.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i13) {
                        return iZzj4;
                    }
                    throw zzxu.zzj();
                }
                if (i5 == 5) {
                    zzxa zzxaVar2 = (zzxa) zzxrVarZzd;
                    zzxaVar2.zze(Float.intBitsToFloat(zztq.zzb(bArr, i)));
                    while (true) {
                        i9 = iZzj2 + 4;
                        if (i9 < i2) {
                            iZzj2 = zztq.zzj(bArr, i9, zztpVar);
                            if (i3 == zztpVar.zza) {
                                zzxaVar2.zze(Float.intBitsToFloat(zztq.zzb(bArr, iZzj2)));
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
                    zzyj zzyjVar = (zzyj) zzxrVarZzd;
                    int iZzj5 = zztq.zzj(bArr, iZzj2, zztpVar);
                    int i14 = zztpVar.zza + iZzj5;
                    while (iZzj5 < i14) {
                        iZzj5 = zztq.zzm(bArr, iZzj5, zztpVar);
                        zzyjVar.zzf(zztpVar.zzb);
                    }
                    if (iZzj5 == i14) {
                        return iZzj5;
                    }
                    throw zzxu.zzj();
                }
                if (i5 == 0) {
                    zzyj zzyjVar2 = (zzyj) zzxrVarZzd;
                    int iZzm = zztq.zzm(bArr, iZzj2, zztpVar);
                    zzyjVar2.zzf(zztpVar.zzb);
                    while (iZzm < i2) {
                        int iZzj6 = zztq.zzj(bArr, iZzm, zztpVar);
                        if (i3 != zztpVar.zza) {
                            return iZzm;
                        }
                        iZzm = zztq.zzm(bArr, iZzj6, zztpVar);
                        zzyjVar2.zzf(zztpVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zztq.zzf(bArr, iZzj2, zzxrVarZzd, zztpVar);
                }
                if (i5 == 0) {
                    return zztq.zzl(i3, bArr, i, i2, zzxrVarZzd, zztpVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzyj zzyjVar3 = (zzyj) zzxrVarZzd;
                    int iZzj7 = zztq.zzj(bArr, iZzj2, zztpVar);
                    int i15 = zztpVar.zza + iZzj7;
                    while (iZzj7 < i15) {
                        zzyjVar3.zzf(zztq.zzq(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i15) {
                        return iZzj7;
                    }
                    throw zzxu.zzj();
                }
                if (i5 == 1) {
                    zzyj zzyjVar4 = (zzyj) zzxrVarZzd;
                    zzyjVar4.zzf(zztq.zzq(bArr, i));
                    while (true) {
                        i10 = iZzj2 + 8;
                        if (i10 < i2) {
                            iZzj2 = zztq.zzj(bArr, i10, zztpVar);
                            if (i3 == zztpVar.zza) {
                                zzyjVar4.zzf(zztq.zzq(bArr, iZzj2));
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
                    zzxk zzxkVar = (zzxk) zzxrVarZzd;
                    int iZzj8 = zztq.zzj(bArr, iZzj2, zztpVar);
                    int i16 = zztpVar.zza + iZzj8;
                    while (iZzj8 < i16) {
                        zzxkVar.zzh(zztq.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i16) {
                        return iZzj8;
                    }
                    throw zzxu.zzj();
                }
                if (i5 == 5) {
                    zzxk zzxkVar2 = (zzxk) zzxrVarZzd;
                    zzxkVar2.zzh(zztq.zzb(bArr, i));
                    while (true) {
                        i11 = iZzj2 + 4;
                        if (i11 < i2) {
                            iZzj2 = zztq.zzj(bArr, i11, zztpVar);
                            if (i3 == zztpVar.zza) {
                                zzxkVar2.zzh(zztq.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i11;
                }
                return iZzj2;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzts zztsVar = (zzts) zzxrVarZzd;
                    iZzj = zztq.zzj(bArr, iZzj2, zztpVar);
                    int i17 = zztpVar.zza + iZzj;
                    while (iZzj < i17) {
                        iZzj = zztq.zzm(bArr, iZzj, zztpVar);
                        zztsVar.zze(zztpVar.zzb != 0);
                    }
                    if (iZzj != i17) {
                        throw zzxu.zzj();
                    }
                    return iZzj;
                }
                if (i5 == 0) {
                    zzts zztsVar2 = (zzts) zzxrVarZzd;
                    int iZzm2 = zztq.zzm(bArr, iZzj2, zztpVar);
                    zztsVar2.zze(zztpVar.zzb != 0);
                    while (iZzm2 < i2) {
                        int iZzj9 = zztq.zzj(bArr, iZzm2, zztpVar);
                        if (i3 != zztpVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zztq.zzm(bArr, iZzj9, zztpVar);
                        zztsVar2.zze(zztpVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iZzj2 = zztq.zzj(bArr, iZzj2, zztpVar);
                        int i18 = zztpVar.zza;
                        if (i18 < 0) {
                            throw zzxu.zzf();
                        }
                        if (i18 == 0) {
                            zzxrVarZzd.add("");
                        } else {
                            zzxrVarZzd.add(new String(bArr, iZzj2, i18, zzxs.zzb));
                            iZzj2 += i18;
                        }
                        while (iZzj2 < i2) {
                            int iZzj10 = zztq.zzj(bArr, iZzj2, zztpVar);
                            if (i3 == zztpVar.zza) {
                                iZzj2 = zztq.zzj(bArr, iZzj10, zztpVar);
                                int i19 = zztpVar.zza;
                                if (i19 < 0) {
                                    throw zzxu.zzf();
                                }
                                if (i19 == 0) {
                                    zzxrVarZzd.add("");
                                } else {
                                    zzxrVarZzd.add(new String(bArr, iZzj2, i19, zzxs.zzb));
                                    iZzj2 += i19;
                                }
                            }
                        }
                    } else {
                        iZzj2 = zztq.zzj(bArr, iZzj2, zztpVar);
                        int i20 = zztpVar.zza;
                        if (i20 < 0) {
                            throw zzxu.zzf();
                        }
                        if (i20 == 0) {
                            zzxrVarZzd.add("");
                        } else {
                            int i21 = iZzj2 + i20;
                            if (!zzaan.zzf(bArr, iZzj2, i21)) {
                                throw zzxu.zzd();
                            }
                            zzxrVarZzd.add(new String(bArr, iZzj2, i20, zzxs.zzb));
                            iZzj2 = i21;
                        }
                        while (iZzj2 < i2) {
                            int iZzj11 = zztq.zzj(bArr, iZzj2, zztpVar);
                            if (i3 == zztpVar.zza) {
                                iZzj2 = zztq.zzj(bArr, iZzj11, zztpVar);
                                int i22 = zztpVar.zza;
                                if (i22 < 0) {
                                    throw zzxu.zzf();
                                }
                                if (i22 == 0) {
                                    zzxrVarZzd.add("");
                                } else {
                                    int i23 = iZzj2 + i22;
                                    if (!zzaan.zzf(bArr, iZzj2, i23)) {
                                        throw zzxu.zzd();
                                    }
                                    zzxrVarZzd.add(new String(bArr, iZzj2, i22, zzxs.zzb));
                                    iZzj2 = i23;
                                }
                            }
                        }
                    }
                }
                return iZzj2;
            case 27:
                if (i5 == 2) {
                    return zztq.zze(zzC(i6), i3, bArr, i, i2, zzxrVarZzd, zztpVar);
                }
                return iZzj2;
            case 28:
                if (i5 == 2) {
                    int iZzj12 = zztq.zzj(bArr, iZzj2, zztpVar);
                    int i24 = zztpVar.zza;
                    if (i24 < 0) {
                        throw zzxu.zzf();
                    }
                    if (i24 > bArr.length - iZzj12) {
                        throw zzxu.zzj();
                    }
                    if (i24 == 0) {
                        zzxrVarZzd.add(zzud.zzb);
                    } else {
                        zzxrVarZzd.add(zzud.zzl(bArr, iZzj12, i24));
                        iZzj12 += i24;
                    }
                    while (iZzj12 < i2) {
                        int iZzj13 = zztq.zzj(bArr, iZzj12, zztpVar);
                        if (i3 != zztpVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zztq.zzj(bArr, iZzj13, zztpVar);
                        int i25 = zztpVar.zza;
                        if (i25 < 0) {
                            throw zzxu.zzf();
                        }
                        if (i25 > bArr.length - iZzj12) {
                            throw zzxu.zzj();
                        }
                        if (i25 == 0) {
                            zzxrVarZzd.add(zzud.zzb);
                        } else {
                            zzxrVarZzd.add(zzud.zzl(bArr, iZzj12, i25));
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
                        iZzj = zztq.zzl(i3, bArr, i, i2, zzxrVarZzd, zztpVar);
                    }
                    return iZzj2;
                }
                iZzj = zztq.zzf(bArr, iZzj2, zzxrVarZzd, zztpVar);
                zzzj.zzA(obj, i4, zzxrVarZzd, zzB(i6), null, this.zzn);
                return iZzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzxk zzxkVar3 = (zzxk) zzxrVarZzd;
                    int iZzj14 = zztq.zzj(bArr, iZzj2, zztpVar);
                    int i26 = zztpVar.zza + iZzj14;
                    while (iZzj14 < i26) {
                        iZzj14 = zztq.zzj(bArr, iZzj14, zztpVar);
                        zzxkVar3.zzh(zzuj.zzF(zztpVar.zza));
                    }
                    if (iZzj14 == i26) {
                        return iZzj14;
                    }
                    throw zzxu.zzj();
                }
                if (i5 == 0) {
                    zzxk zzxkVar4 = (zzxk) zzxrVarZzd;
                    int iZzj15 = zztq.zzj(bArr, iZzj2, zztpVar);
                    zzxkVar4.zzh(zzuj.zzF(zztpVar.zza));
                    while (iZzj15 < i2) {
                        int iZzj16 = zztq.zzj(bArr, iZzj15, zztpVar);
                        if (i3 != zztpVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zztq.zzj(bArr, iZzj16, zztpVar);
                        zzxkVar4.zzh(zzuj.zzF(zztpVar.zza));
                    }
                    return iZzj15;
                }
                return iZzj2;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzyj zzyjVar5 = (zzyj) zzxrVarZzd;
                    int iZzj17 = zztq.zzj(bArr, iZzj2, zztpVar);
                    int i27 = zztpVar.zza + iZzj17;
                    while (iZzj17 < i27) {
                        iZzj17 = zztq.zzm(bArr, iZzj17, zztpVar);
                        zzyjVar5.zzf(zzuj.zzG(zztpVar.zzb));
                    }
                    if (iZzj17 == i27) {
                        return iZzj17;
                    }
                    throw zzxu.zzj();
                }
                if (i5 == 0) {
                    zzyj zzyjVar6 = (zzyj) zzxrVarZzd;
                    int iZzm3 = zztq.zzm(bArr, iZzj2, zztpVar);
                    zzyjVar6.zzf(zzuj.zzG(zztpVar.zzb));
                    while (iZzm3 < i2) {
                        int iZzj18 = zztq.zzj(bArr, iZzm3, zztpVar);
                        if (i3 != zztpVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zztq.zzm(bArr, iZzj18, zztpVar);
                        zzyjVar6.zzf(zzuj.zzG(zztpVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i5 == 3) {
                    zzzh zzzhVarZzC = zzC(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iZzc = zztq.zzc(zzzhVarZzC, bArr, i, i2, i28, zztpVar);
                    zzxrVarZzd.add(zztpVar.zzc);
                    while (iZzc < i2) {
                        int iZzj19 = zztq.zzj(bArr, iZzc, zztpVar);
                        if (i3 != zztpVar.zza) {
                            return iZzc;
                        }
                        iZzc = zztq.zzc(zzzhVarZzC, bArr, iZzj19, i2, i28, zztpVar);
                        zzxrVarZzd.add(zztpVar.zzc);
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

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final int zza(Object obj) {
        int iZzD;
        int iZzD2;
        int iZzE;
        int iZzD3;
        int iZzD4;
        int iZzD5;
        int iZzD6;
        int iZzn;
        int iZzD7;
        int iZzE2;
        int iZzD8;
        int iZzD9;
        zzaao zzaaoVar = zzaao.DOUBLE;
        if (this.zzp - 1 == 0) {
            return zzp(obj);
        }
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzz = zzz(i2);
            int iZzy = zzy(iZzz);
            int i3 = this.zzc[i2];
            int i4 = iZzz & 1048575;
            if (iZzy >= zzwz.DOUBLE_LIST_PACKED.zza() && iZzy <= zzwz.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i2 + 2];
            }
            long j = i4;
            switch (iZzy) {
                case 0:
                    if (zzS(obj, i2)) {
                        iZzD = zzuq.zzD(i3 << 3);
                        iZzn = iZzD + 8;
                        i += iZzn;
                    }
                    break;
                case 1:
                    if (zzS(obj, i2)) {
                        iZzD2 = zzuq.zzD(i3 << 3);
                        iZzn = iZzD2 + 4;
                        i += iZzn;
                    }
                    break;
                case 2:
                    if (zzS(obj, i2)) {
                        iZzE = zzuq.zzE(zzaai.zzd(obj, j));
                        iZzD3 = zzuq.zzD(i3 << 3);
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 3:
                    if (zzS(obj, i2)) {
                        iZzE = zzuq.zzE(zzaai.zzd(obj, j));
                        iZzD3 = zzuq.zzD(i3 << 3);
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 4:
                    if (zzS(obj, i2)) {
                        iZzE = zzuq.zzz(zzaai.zzc(obj, j));
                        iZzD3 = zzuq.zzD(i3 << 3);
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 5:
                    if (zzS(obj, i2)) {
                        iZzD = zzuq.zzD(i3 << 3);
                        iZzn = iZzD + 8;
                        i += iZzn;
                    }
                    break;
                case 6:
                    if (zzS(obj, i2)) {
                        iZzD2 = zzuq.zzD(i3 << 3);
                        iZzn = iZzD2 + 4;
                        i += iZzn;
                    }
                    break;
                case 7:
                    if (zzS(obj, i2)) {
                        iZzD4 = zzuq.zzD(i3 << 3);
                        iZzn = iZzD4 + 1;
                        i += iZzn;
                    }
                    break;
                case 8:
                    if (zzS(obj, i2)) {
                        Object objZzf = zzaai.zzf(obj, j);
                        if (objZzf instanceof zzud) {
                            int i6 = i3 << 3;
                            int i7 = zzuq.zzf;
                            int iZzd = ((zzud) objZzf).zzd();
                            iZzD5 = zzuq.zzD(iZzd) + iZzd;
                            iZzD6 = zzuq.zzD(i6);
                            iZzn = iZzD6 + iZzD5;
                            i += iZzn;
                        } else {
                            iZzE = zzuq.zzC((String) objZzf);
                            iZzD3 = zzuq.zzD(i3 << 3);
                            i += iZzD3 + iZzE;
                        }
                    }
                    break;
                case 9:
                    if (zzS(obj, i2)) {
                        iZzn = zzzj.zzn(i3, zzaai.zzf(obj, j), zzC(i2));
                        i += iZzn;
                    }
                    break;
                case 10:
                    if (zzS(obj, i2)) {
                        zzud zzudVar = (zzud) zzaai.zzf(obj, j);
                        int i8 = i3 << 3;
                        int i9 = zzuq.zzf;
                        int iZzd2 = zzudVar.zzd();
                        iZzD5 = zzuq.zzD(iZzd2) + iZzd2;
                        iZzD6 = zzuq.zzD(i8);
                        iZzn = iZzD6 + iZzD5;
                        i += iZzn;
                    }
                    break;
                case 11:
                    if (zzS(obj, i2)) {
                        iZzE = zzuq.zzD(zzaai.zzc(obj, j));
                        iZzD3 = zzuq.zzD(i3 << 3);
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 12:
                    if (zzS(obj, i2)) {
                        iZzE = zzuq.zzz(zzaai.zzc(obj, j));
                        iZzD3 = zzuq.zzD(i3 << 3);
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 13:
                    if (zzS(obj, i2)) {
                        iZzD2 = zzuq.zzD(i3 << 3);
                        iZzn = iZzD2 + 4;
                        i += iZzn;
                    }
                    break;
                case 14:
                    if (zzS(obj, i2)) {
                        iZzD = zzuq.zzD(i3 << 3);
                        iZzn = iZzD + 8;
                        i += iZzn;
                    }
                    break;
                case 15:
                    if (zzS(obj, i2)) {
                        int iZzc = zzaai.zzc(obj, j);
                        iZzD3 = zzuq.zzD(i3 << 3);
                        iZzE = zzuq.zzD((iZzc >> 31) ^ (iZzc + iZzc));
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 16:
                    if (zzS(obj, i2)) {
                        long jZzd = zzaai.zzd(obj, j);
                        iZzD7 = zzuq.zzD(i3 << 3);
                        iZzE2 = zzuq.zzE((jZzd >> 63) ^ (jZzd + jZzd));
                        iZzn = iZzD7 + iZzE2;
                        i += iZzn;
                    }
                    break;
                case 17:
                    if (zzS(obj, i2)) {
                        iZzn = zzuq.zzy(i3, (zzyu) zzaai.zzf(obj, j), zzC(i2));
                        i += iZzn;
                    }
                    break;
                case 18:
                    iZzn = zzzj.zzg(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 19:
                    iZzn = zzzj.zze(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 20:
                    iZzn = zzzj.zzl(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 21:
                    iZzn = zzzj.zzw(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 22:
                    iZzn = zzzj.zzj(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 23:
                    iZzn = zzzj.zzg(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 24:
                    iZzn = zzzj.zze(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 25:
                    iZzn = zzzj.zza(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 26:
                    iZzn = zzzj.zzt(i3, (List) zzaai.zzf(obj, j));
                    i += iZzn;
                    break;
                case 27:
                    iZzn = zzzj.zzo(i3, (List) zzaai.zzf(obj, j), zzC(i2));
                    i += iZzn;
                    break;
                case 28:
                    iZzn = zzzj.zzb(i3, (List) zzaai.zzf(obj, j));
                    i += iZzn;
                    break;
                case 29:
                    iZzn = zzzj.zzu(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 30:
                    iZzn = zzzj.zzc(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 31:
                    iZzn = zzzj.zze(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 32:
                    iZzn = zzzj.zzg(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 33:
                    iZzn = zzzj.zzp(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 34:
                    iZzn = zzzj.zzr(i3, (List) zzaai.zzf(obj, j), false);
                    i += iZzn;
                    break;
                case 35:
                    iZzE = zzzj.zzh((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i10 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i10);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 36:
                    iZzE = zzzj.zzf((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i11 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i11);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 37:
                    iZzE = zzzj.zzm((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i12 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i12);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 38:
                    iZzE = zzzj.zzx((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i13 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i13);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 39:
                    iZzE = zzzj.zzk((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i14 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i14);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 40:
                    iZzE = zzzj.zzh((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i15 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i15);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 41:
                    iZzE = zzzj.zzf((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i16 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i16);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzzj.zza;
                    iZzE = list.size();
                    if (iZzE > 0) {
                        int i18 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i18);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 43:
                    iZzE = zzzj.zzv((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i19 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i19);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 44:
                    iZzE = zzzj.zzd((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i20 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i20);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 45:
                    iZzE = zzzj.zzf((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i21 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i21);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 46:
                    iZzE = zzzj.zzh((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i22 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i22);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 47:
                    iZzE = zzzj.zzq((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i23 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i23);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 48:
                    iZzE = zzzj.zzs((List) unsafe.getObject(obj, j));
                    if (iZzE > 0) {
                        int i24 = i3 << 3;
                        iZzD8 = zzuq.zzD(iZzE);
                        iZzD9 = zzuq.zzD(i24);
                        iZzD3 = iZzD9 + iZzD8;
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 49:
                    iZzn = zzzj.zzi(i3, (List) zzaai.zzf(obj, j), zzC(i2));
                    i += iZzn;
                    break;
                case 50:
                    zzyp.zza(i3, zzaai.zzf(obj, j), zzE(i2));
                    break;
                case 51:
                    if (zzW(obj, i3, i2)) {
                        iZzD = zzuq.zzD(i3 << 3);
                        iZzn = iZzD + 8;
                        i += iZzn;
                    }
                    break;
                case 52:
                    if (zzW(obj, i3, i2)) {
                        iZzD2 = zzuq.zzD(i3 << 3);
                        iZzn = iZzD2 + 4;
                        i += iZzn;
                    }
                    break;
                case 53:
                    if (zzW(obj, i3, i2)) {
                        iZzE = zzuq.zzE(zzA(obj, j));
                        iZzD3 = zzuq.zzD(i3 << 3);
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 54:
                    if (zzW(obj, i3, i2)) {
                        iZzE = zzuq.zzE(zzA(obj, j));
                        iZzD3 = zzuq.zzD(i3 << 3);
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 55:
                    if (zzW(obj, i3, i2)) {
                        iZzE = zzuq.zzz(zzq(obj, j));
                        iZzD3 = zzuq.zzD(i3 << 3);
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 56:
                    if (zzW(obj, i3, i2)) {
                        iZzD = zzuq.zzD(i3 << 3);
                        iZzn = iZzD + 8;
                        i += iZzn;
                    }
                    break;
                case 57:
                    if (zzW(obj, i3, i2)) {
                        iZzD2 = zzuq.zzD(i3 << 3);
                        iZzn = iZzD2 + 4;
                        i += iZzn;
                    }
                    break;
                case 58:
                    if (zzW(obj, i3, i2)) {
                        iZzD4 = zzuq.zzD(i3 << 3);
                        iZzn = iZzD4 + 1;
                        i += iZzn;
                    }
                    break;
                case 59:
                    if (zzW(obj, i3, i2)) {
                        Object objZzf2 = zzaai.zzf(obj, j);
                        if (objZzf2 instanceof zzud) {
                            int i25 = i3 << 3;
                            int i26 = zzuq.zzf;
                            int iZzd3 = ((zzud) objZzf2).zzd();
                            iZzD5 = zzuq.zzD(iZzd3) + iZzd3;
                            iZzD6 = zzuq.zzD(i25);
                            iZzn = iZzD6 + iZzD5;
                            i += iZzn;
                        } else {
                            iZzE = zzuq.zzC((String) objZzf2);
                            iZzD3 = zzuq.zzD(i3 << 3);
                            i += iZzD3 + iZzE;
                        }
                    }
                    break;
                case 60:
                    if (zzW(obj, i3, i2)) {
                        iZzn = zzzj.zzn(i3, zzaai.zzf(obj, j), zzC(i2));
                        i += iZzn;
                    }
                    break;
                case 61:
                    if (zzW(obj, i3, i2)) {
                        zzud zzudVar2 = (zzud) zzaai.zzf(obj, j);
                        int i27 = i3 << 3;
                        int i28 = zzuq.zzf;
                        int iZzd4 = zzudVar2.zzd();
                        iZzD5 = zzuq.zzD(iZzd4) + iZzd4;
                        iZzD6 = zzuq.zzD(i27);
                        iZzn = iZzD6 + iZzD5;
                        i += iZzn;
                    }
                    break;
                case 62:
                    if (zzW(obj, i3, i2)) {
                        iZzE = zzuq.zzD(zzq(obj, j));
                        iZzD3 = zzuq.zzD(i3 << 3);
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 63:
                    if (zzW(obj, i3, i2)) {
                        iZzE = zzuq.zzz(zzq(obj, j));
                        iZzD3 = zzuq.zzD(i3 << 3);
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 64:
                    if (zzW(obj, i3, i2)) {
                        iZzD2 = zzuq.zzD(i3 << 3);
                        iZzn = iZzD2 + 4;
                        i += iZzn;
                    }
                    break;
                case 65:
                    if (zzW(obj, i3, i2)) {
                        iZzD = zzuq.zzD(i3 << 3);
                        iZzn = iZzD + 8;
                        i += iZzn;
                    }
                    break;
                case 66:
                    if (zzW(obj, i3, i2)) {
                        int iZzq = zzq(obj, j);
                        iZzD3 = zzuq.zzD(i3 << 3);
                        iZzE = zzuq.zzD((iZzq >> 31) ^ (iZzq + iZzq));
                        i += iZzD3 + iZzE;
                    }
                    break;
                case 67:
                    if (zzW(obj, i3, i2)) {
                        long jZzA = zzA(obj, j);
                        iZzD7 = zzuq.zzD(i3 << 3);
                        iZzE2 = zzuq.zzE((jZzA >> 63) ^ (jZzA + jZzA));
                        iZzn = iZzD7 + iZzE2;
                        i += iZzn;
                    }
                    break;
                case 68:
                    if (zzW(obj, i3, i2)) {
                        iZzn = zzuq.zzy(i3, (zzyu) zzaai.zzf(obj, j), zzC(i2));
                        i += iZzn;
                    }
                    break;
            }
        }
        zzzy zzzyVar = this.zzn;
        return i + zzzyVar.zza(zzzyVar.zzd(obj));
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
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
                    jDoubleToLongBits = Double.doubleToLongBits(zzaai.zza(obj, j));
                    byte[] bArr = zzxs.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzaai.zzb(obj, j));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzaai.zzd(obj, j);
                    byte[] bArr2 = zzxs.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzaai.zzd(obj, j);
                    byte[] bArr3 = zzxs.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzaai.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzaai.zzd(obj, j);
                    byte[] bArr4 = zzxs.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzaai.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzxs.zza(zzaai.zzw(obj, j));
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iFloatToIntBits = ((String) zzaai.zzf(obj, j)).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 9:
                    Object objZzf = zzaai.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzaai.zzf(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzaai.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzaai.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzaai.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzaai.zzd(obj, j);
                    byte[] bArr5 = zzxs.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzaai.zzc(obj, j);
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzaai.zzd(obj, j);
                    byte[] bArr6 = zzxs.zzd;
                    i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object objZzf2 = zzaai.zzf(obj, j);
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
                    iFloatToIntBits = zzaai.zzf(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iFloatToIntBits = zzaai.zzf(obj, j).hashCode();
                    i3 = i2 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzW(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzxs.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzW(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzA(obj, j);
                        byte[] bArr8 = zzxs.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (zzW(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzA(obj, j);
                        byte[] bArr9 = zzxs.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzW(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzA(obj, j);
                        byte[] bArr10 = zzxs.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzxs.zza(zzX(obj, j));
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = ((String) zzaai.zzf(obj, j)).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzaai.zzf(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzaai.zzf(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzW(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzA(obj, j);
                        byte[] bArr11 = zzxs.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzq(obj, j);
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzW(obj, i5, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzA(obj, j);
                        byte[] bArr12 = zzxs.zzd;
                        i3 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (zzW(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iFloatToIntBits = zzaai.zzf(obj, j).hashCode();
                        i3 = i2 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + this.zzn.zzd(obj).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:179:0x0547  */
    /* JADX WARN: Code duplicated, block: B:180:0x054c  */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zztp zztpVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzyx<T> zzyxVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zztp zztpVar2;
        int i12;
        zzxg zzxgVar;
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
        zzyx<T> zzyxVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        i2 = i2;
        int i21 = i3;
        zztp zztpVar3 = zztpVar;
        zzI(obj);
        Unsafe unsafe2 = zzb;
        int i22 = -1;
        int iZzi = i;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1048575;
        while (true) {
            if (iZzi < i2) {
                int iZzm = iZzi + 1;
                byte b = bArr2[iZzi];
                if (b < 0) {
                    int iZzk = zztq.zzk(b, bArr2, iZzm, zztpVar3);
                    i8 = zztpVar3.zza;
                    iZzm = iZzk;
                } else {
                    i8 = b;
                }
                int i28 = i8 >>> 3;
                int iZzv = i28 > i23 ? zzyxVar2.zzv(i28, i24 / 3) : zzyxVar2.zzu(i28);
                if (iZzv == i22) {
                    i9 = i28;
                    i7 = i8;
                    i10 = i26;
                    i27 = i27;
                    unsafe = unsafe2;
                    i4 = i21;
                    i11 = 0;
                } else {
                    int i29 = i8 & 7;
                    int[] iArr = zzyxVar2.zzc;
                    int i30 = iArr[iZzv + 1];
                    int iZzy = zzy(i30);
                    long j = i30 & 1048575;
                    int i31 = i8;
                    if (iZzy <= 17) {
                        int i32 = iArr[iZzv + 2];
                        int i33 = 1 << (i32 >>> 20);
                        int i34 = i32 & 1048575;
                        if (i34 != i27) {
                            if (i27 != 1048575) {
                                long j2 = i27;
                                obj3 = obj;
                                unsafe2.putInt(obj3, j2, i26);
                            } else {
                                obj3 = obj;
                            }
                            i27 = i34;
                            i13 = unsafe2.getInt(obj3, i34);
                            obj4 = obj3;
                        } else {
                            obj4 = obj;
                            i13 = i26;
                            i27 = i27;
                        }
                        switch (iZzy) {
                            case 0:
                                i14 = iZzv;
                                i15 = i28;
                                if (i29 == 1) {
                                    zzaai.zzo(obj4, j, Double.longBitsToDouble(zztq.zzq(bArr2, iZzm)));
                                    iZzi = iZzm + 8;
                                    i26 = i13 | i33;
                                    i24 = i14;
                                    i23 = i15;
                                    i25 = i31;
                                    i22 = -1;
                                    i21 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i31;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 1:
                                i14 = iZzv;
                                i15 = i28;
                                if (i29 == 5) {
                                    zzaai.zzp(obj4, j, Float.intBitsToFloat(zztq.zzb(bArr2, iZzm)));
                                    iZzi = iZzm + 4;
                                    i26 = i13 | i33;
                                    i24 = i14;
                                    i23 = i15;
                                    i25 = i31;
                                    i22 = -1;
                                    i21 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i31;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 2:
                            case 3:
                                i14 = iZzv;
                                i15 = i28;
                                if (i29 == 0) {
                                    int iZzm2 = zztq.zzm(bArr2, iZzm, zztpVar3);
                                    unsafe2.putLong(obj, j, zztpVar3.zzb);
                                    i26 = i13 | i33;
                                    i24 = i14;
                                    iZzi = iZzm2;
                                    i23 = i15;
                                    i25 = i31;
                                    i22 = -1;
                                    i21 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i31;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 4:
                            case 11:
                                i14 = iZzv;
                                i15 = i28;
                                if (i29 == 0) {
                                    iZzi = zztq.zzj(bArr2, iZzm, zztpVar3);
                                    unsafe2.putInt(obj4, j, zztpVar3.zza);
                                    i26 = i13 | i33;
                                    i24 = i14;
                                    i23 = i15;
                                    i25 = i31;
                                    i22 = -1;
                                    i21 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i31;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 5:
                            case 14:
                                i14 = iZzv;
                                i15 = i28;
                                if (i29 == 1) {
                                    unsafe2.putLong(obj, j, zztq.zzq(bArr2, iZzm));
                                    iZzi = iZzm + 8;
                                    i26 = i13 | i33;
                                    i24 = i14;
                                    i23 = i15;
                                    i25 = i31;
                                    i22 = -1;
                                    i21 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i31;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 6:
                            case 13:
                                i14 = iZzv;
                                i15 = i28;
                                if (i29 == 5) {
                                    unsafe2.putInt(obj4, j, zztq.zzb(bArr2, iZzm));
                                    iZzi = iZzm + 4;
                                    i26 = i13 | i33;
                                    i24 = i14;
                                    i23 = i15;
                                    i25 = i31;
                                    i22 = -1;
                                    i21 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i31;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 7:
                                i14 = iZzv;
                                i15 = i28;
                                if (i29 == 0) {
                                    iZzi = zztq.zzm(bArr2, iZzm, zztpVar3);
                                    zzaai.zzm(obj4, j, zztpVar3.zzb != 0);
                                    i26 = i13 | i33;
                                    i24 = i14;
                                    i23 = i15;
                                    i25 = i31;
                                    i22 = -1;
                                    i21 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i31;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 8:
                                i14 = iZzv;
                                i15 = i28;
                                if (i29 == 2) {
                                    iZzi = (536870912 & i30) == 0 ? zztq.zzg(bArr2, iZzm, zztpVar3) : zztq.zzh(bArr2, iZzm, zztpVar3);
                                    unsafe2.putObject(obj4, j, zztpVar3.zzc);
                                    i26 = i13 | i33;
                                    i24 = i14;
                                    i23 = i15;
                                    i25 = i31;
                                    i22 = -1;
                                    i21 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i31;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 9:
                                i15 = i28;
                                if (i29 == 2) {
                                    Object objZzF = zzyxVar2.zzF(obj4, iZzv);
                                    i31 = i31;
                                    i14 = iZzv;
                                    iZzi = zztq.zzo(objZzF, zzyxVar2.zzC(iZzv), bArr, iZzm, i2, zztpVar);
                                    zzyxVar2.zzO(obj4, i14, objZzF);
                                    i26 = i13 | i33;
                                    i24 = i14;
                                    i23 = i15;
                                    i25 = i31;
                                    i22 = -1;
                                    i21 = i3;
                                } else {
                                    i31 = i31;
                                    i16 = iZzv;
                                    i19 = i31;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 10:
                                i17 = iZzv;
                                i15 = i28;
                                i18 = i31;
                                if (i29 == 2) {
                                    iZza = zztq.zza(bArr2, iZzm, zztpVar3);
                                    unsafe2.putObject(obj4, j, zztpVar3.zzc);
                                    int i35 = i13 | i33;
                                    i2 = i2;
                                    i25 = i18;
                                    i23 = i15;
                                    i27 = i27;
                                    i22 = -1;
                                    i21 = i3;
                                    int i36 = i17;
                                    i26 = i35;
                                    iZzi = iZza;
                                    i24 = i36;
                                } else {
                                    i16 = i17;
                                    i19 = i18;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 12:
                                i17 = iZzv;
                                i15 = i28;
                                i18 = i31;
                                if (i29 == 0) {
                                    iZza = zztq.zzj(bArr2, iZzm, zztpVar3);
                                    int i37 = zztpVar3.zza;
                                    zzxn zzxnVarZzB = zzyxVar2.zzB(i17);
                                    if (zzxnVarZzB == null || zzxnVarZzB.zza(i37)) {
                                        unsafe2.putInt(obj4, j, i37);
                                        int i38 = i13 | i33;
                                        i2 = i2;
                                        i25 = i18;
                                        i23 = i15;
                                        i27 = i27;
                                        i22 = -1;
                                        i21 = i3;
                                        int i39 = i17;
                                        i26 = i38;
                                        iZzi = iZza;
                                        i24 = i39;
                                    } else {
                                        zzd(obj).zzj(i18, Long.valueOf(i37));
                                        iZzi = iZza;
                                        i24 = i17;
                                        i25 = i18;
                                        i23 = i15;
                                        i26 = i13;
                                        i22 = -1;
                                        i2 = i2;
                                        i21 = i3;
                                    }
                                } else {
                                    i16 = i17;
                                    i19 = i18;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 15:
                                i17 = iZzv;
                                i15 = i28;
                                i18 = i31;
                                if (i29 == 0) {
                                    iZzi = zztq.zzj(bArr2, iZzm, zztpVar3);
                                    unsafe2.putInt(obj4, j, zzuj.zzF(zztpVar3.zza));
                                    int i40 = i13 | i33;
                                    i2 = i2;
                                    i24 = i17;
                                    i25 = i18;
                                    i22 = -1;
                                    i26 = i40;
                                    i23 = i15;
                                    i21 = i3;
                                } else {
                                    i16 = i17;
                                    i19 = i18;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            case 16:
                                if (i29 == 0) {
                                    int iZzm3 = zztq.zzm(bArr2, iZzm, zztpVar3);
                                    unsafe2.putLong(obj, j, zzuj.zzG(zztpVar3.zzb));
                                    i26 = i13 | i33;
                                    iZzi = iZzm3;
                                    i2 = i2;
                                    i25 = i31;
                                    i24 = iZzv;
                                    i23 = i28;
                                    i22 = -1;
                                    i21 = i3;
                                } else {
                                    i15 = i28;
                                    i16 = iZzv;
                                    i19 = i31;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                            default:
                                i14 = iZzv;
                                i15 = i28;
                                if (i29 == 3) {
                                    Object objZzF2 = zzyxVar2.zzF(obj4, i14);
                                    iZzi = zztq.zzn(objZzF2, zzyxVar2.zzC(i14), bArr, iZzm, i2, (i15 << 3) | 4, zztpVar);
                                    zzyxVar2.zzO(obj4, i14, objZzF2);
                                    i26 = i13 | i33;
                                    i25 = i31;
                                    i2 = i2;
                                    i23 = i15;
                                    i24 = i14;
                                    i22 = -1;
                                    bArr2 = bArr;
                                    i21 = i3;
                                } else {
                                    i16 = i14;
                                    i19 = i31;
                                    i7 = i19;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i11 = i16;
                                    i10 = i13;
                                }
                                break;
                        }
                    } else {
                        obj4 = obj;
                        if (iZzy != 27) {
                            i10 = i26;
                            i27 = i27;
                            if (iZzy <= 49) {
                                int i41 = iZzm;
                                unsafe = unsafe2;
                                i11 = iZzv;
                                i9 = i28;
                                iZzi = zzt(obj, bArr, iZzm, i2, i31, i28, i29, iZzv, i30, iZzy, j, zztpVar);
                                if (iZzi != i41) {
                                    zzyxVar2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i25 = i31;
                                    i2 = i2;
                                    i21 = i3;
                                    zztpVar3 = zztpVar;
                                    i26 = i10;
                                    i23 = i9;
                                    i24 = i11;
                                    i27 = i27;
                                    unsafe2 = unsafe;
                                    i22 = -1;
                                } else {
                                    i7 = i31;
                                    i4 = i3;
                                    iZzm = iZzi;
                                }
                            } else {
                                i20 = iZzm;
                                unsafe = unsafe2;
                                i11 = iZzv;
                                i9 = i28;
                                if (iZzy != 50) {
                                    iZzi = zzs(obj, bArr, i20, i2, i31, i9, i29, i30, iZzy, j, i11, zztpVar);
                                    if (iZzi != i20) {
                                        zzyxVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i25 = i31;
                                        i2 = i2;
                                        i21 = i3;
                                        zztpVar3 = zztpVar;
                                        i26 = i10;
                                        i23 = i9;
                                        i24 = i11;
                                        i27 = i27;
                                        unsafe2 = unsafe;
                                        i22 = -1;
                                    } else {
                                        i7 = i31;
                                        i4 = i3;
                                        iZzm = iZzi;
                                    }
                                } else if (i29 == 2) {
                                    iZzi = zzr(obj, bArr, i20, i2, i11, j, zztpVar);
                                    if (iZzi != i20) {
                                        zzyxVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i25 = i31;
                                        i2 = i2;
                                        i21 = i3;
                                        zztpVar3 = zztpVar;
                                        i26 = i10;
                                        i23 = i9;
                                        i24 = i11;
                                        i27 = i27;
                                        unsafe2 = unsafe;
                                        i22 = -1;
                                    } else {
                                        i7 = i31;
                                        i4 = i3;
                                        iZzm = iZzi;
                                    }
                                } else {
                                    i7 = i31;
                                    i4 = i3;
                                    iZzm = i20;
                                }
                            }
                        } else if (i29 == 2) {
                            zzxr zzxrVarZzd = (zzxr) unsafe2.getObject(obj4, j);
                            if (!zzxrVarZzd.zzc()) {
                                int size = zzxrVarZzd.size();
                                zzxrVarZzd = zzxrVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j, zzxrVarZzd);
                            }
                            iZzi = zztq.zze(zzyxVar2.zzC(iZzv), i31, bArr, iZzm, i2, zzxrVarZzd, zztpVar);
                            i25 = i31;
                            i21 = i3;
                            i24 = iZzv;
                            i23 = i28;
                            i26 = i26;
                            i27 = i27;
                            i22 = -1;
                            bArr2 = bArr;
                            i2 = i2;
                        } else {
                            i10 = i26;
                            i27 = i27;
                            i20 = iZzm;
                            unsafe = unsafe2;
                            i11 = iZzv;
                            i9 = i28;
                            i7 = i31;
                            i4 = i3;
                            iZzm = i20;
                        }
                    }
                }
                if (i7 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zztpVar2 = zztpVar;
                        zzwt zzwtVar = zztpVar2.zzd;
                        if (zzwtVar != zzwt.zza) {
                            zzyu zzyuVar = this.zzg;
                            zzzy zzzyVar = this.zzn;
                            i12 = i9;
                            zzxh zzxhVarZzb = zzwtVar.zzb(zzyuVar, i12);
                            if (zzxhVarZzb == null) {
                                iZzi = zztq.zzi(i7, bArr, iZzm, i2, zzd(obj), zztpVar);
                                obj = obj;
                                bArr = bArr;
                                i2 = i2;
                            } else {
                                obj = obj;
                                zzxf zzxfVar = (zzxf) obj;
                                zzxfVar.zzT();
                                zzwy zzwyVar = zzxfVar.zza;
                                Object objValueOf = null;
                                if (zzxhVarZzb.zzd.zzc != zzaao.ENUM) {
                                    bArr = bArr;
                                    switch (zzxhVarZzb.zzd.zzc) {
                                        case DOUBLE:
                                            objValueOf = Double.valueOf(Double.longBitsToDouble(zztq.zzq(bArr, iZzm)));
                                            iZzm += 8;
                                            zzxgVar = zzxhVarZzb.zzd;
                                            if (zzxgVar.zzd) {
                                                zzwyVar.zzh(zzxgVar, objValueOf);
                                            } else {
                                                zzwyVar.zzk(zzxgVar, objValueOf);
                                            }
                                            iZzi = iZzm;
                                            break;
                                        case FLOAT:
                                            objValueOf = Float.valueOf(Float.intBitsToFloat(zztq.zzb(bArr, iZzm)));
                                            iZzm += 4;
                                            zzxgVar = zzxhVarZzb.zzd;
                                            if (zzxgVar.zzd) {
                                                zzwyVar.zzh(zzxgVar, objValueOf);
                                            } else {
                                                zzwyVar.zzk(zzxgVar, objValueOf);
                                            }
                                            iZzi = iZzm;
                                            break;
                                        case INT64:
                                        case UINT64:
                                            i2 = i2;
                                            iZzm = zztq.zzm(bArr, iZzm, zztpVar2);
                                            objValueOf = Long.valueOf(zztpVar2.zzb);
                                            zzxgVar = zzxhVarZzb.zzd;
                                            if (zzxgVar.zzd) {
                                                zzwyVar.zzh(zzxgVar, objValueOf);
                                            } else {
                                                zzwyVar.zzk(zzxgVar, objValueOf);
                                            }
                                            iZzi = iZzm;
                                            break;
                                        case INT32:
                                        case UINT32:
                                            i2 = i2;
                                            iZzm = zztq.zzj(bArr, iZzm, zztpVar2);
                                            objValueOf = Integer.valueOf(zztpVar2.zza);
                                            zzxgVar = zzxhVarZzb.zzd;
                                            if (zzxgVar.zzd) {
                                                zzwyVar.zzh(zzxgVar, objValueOf);
                                            } else {
                                                zzwyVar.zzk(zzxgVar, objValueOf);
                                            }
                                            iZzi = iZzm;
                                            break;
                                        case FIXED64:
                                        case SFIXED64:
                                            objValueOf = Long.valueOf(zztq.zzq(bArr, iZzm));
                                            iZzm += 8;
                                            zzxgVar = zzxhVarZzb.zzd;
                                            if (zzxgVar.zzd) {
                                                zzwyVar.zzh(zzxgVar, objValueOf);
                                            } else {
                                                zzwyVar.zzk(zzxgVar, objValueOf);
                                            }
                                            iZzi = iZzm;
                                            break;
                                        case FIXED32:
                                        case SFIXED32:
                                            objValueOf = Integer.valueOf(zztq.zzb(bArr, iZzm));
                                            iZzm += 4;
                                            zzxgVar = zzxhVarZzb.zzd;
                                            if (zzxgVar.zzd) {
                                                zzwyVar.zzh(zzxgVar, objValueOf);
                                            } else {
                                                zzwyVar.zzk(zzxgVar, objValueOf);
                                            }
                                            iZzi = iZzm;
                                            break;
                                        case BOOL:
                                            i2 = i2;
                                            iZzm = zztq.zzm(bArr, iZzm, zztpVar2);
                                            objValueOf = Boolean.valueOf(zztpVar2.zzb != 0);
                                            zzxgVar = zzxhVarZzb.zzd;
                                            if (zzxgVar.zzd) {
                                                zzwyVar.zzh(zzxgVar, objValueOf);
                                            } else {
                                                zzwyVar.zzk(zzxgVar, objValueOf);
                                            }
                                            iZzi = iZzm;
                                            break;
                                        case STRING:
                                            i2 = i2;
                                            iZzm = zztq.zzg(bArr, iZzm, zztpVar2);
                                            objValueOf = zztpVar2.zzc;
                                            zzxgVar = zzxhVarZzb.zzd;
                                            if (zzxgVar.zzd) {
                                                zzwyVar.zzh(zzxgVar, objValueOf);
                                            } else {
                                                zzwyVar.zzk(zzxgVar, objValueOf);
                                            }
                                            iZzi = iZzm;
                                            break;
                                        case GROUP:
                                            i2 = i2;
                                            int i42 = (i12 << 3) | 4;
                                            zzzh zzzhVarZzb = zzzd.zza().zzb(zzxhVarZzb.zzc.getClass());
                                            zzxg zzxgVar2 = zzxhVarZzb.zzd;
                                            if (zzxgVar2.zzd) {
                                                iZzi = zztq.zzc(zzzhVarZzb, bArr, iZzm, i2, i42, zztpVar);
                                                zzwyVar.zzh(zzxhVarZzb.zzd, zztpVar2.zzc);
                                            } else {
                                                Object objZzf = zzwyVar.zzf(zzxgVar2);
                                                if (objZzf == null) {
                                                    objZzf = zzzhVarZzb.zze();
                                                    zzwyVar.zzk(zzxhVarZzb.zzd, objZzf);
                                                }
                                                iZzi = zztq.zzn(objZzf, zzzhVarZzb, bArr, iZzm, i2, i42, zztpVar);
                                            }
                                            break;
                                        case MESSAGE:
                                            zzzh zzzhVarZzb2 = zzzd.zza().zzb(zzxhVarZzb.zzc.getClass());
                                            zzxg zzxgVar3 = zzxhVarZzb.zzd;
                                            if (zzxgVar3.zzd) {
                                                i2 = i2;
                                                iZzi = zztq.zzd(zzzhVarZzb2, bArr, iZzm, i2, zztpVar2);
                                                zzwyVar.zzh(zzxhVarZzb.zzd, zztpVar2.zzc);
                                            } else {
                                                i2 = i2;
                                                Object objZzf2 = zzwyVar.zzf(zzxgVar3);
                                                if (objZzf2 == null) {
                                                    objZzf2 = zzzhVarZzb2.zze();
                                                    zzwyVar.zzk(zzxhVarZzb.zzd, objZzf2);
                                                }
                                                iZzi = zztq.zzo(objZzf2, zzzhVarZzb2, bArr, iZzm, i2, zztpVar);
                                            }
                                            break;
                                        case BYTES:
                                            iZzm = zztq.zza(bArr, iZzm, zztpVar2);
                                            objValueOf = zztpVar2.zzc;
                                            break;
                                        case ENUM:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case SINT32:
                                            iZzm = zztq.zzj(bArr, iZzm, zztpVar2);
                                            objValueOf = Integer.valueOf(zzuj.zzF(zztpVar2.zza));
                                            break;
                                        case SINT64:
                                            iZzm = zztq.zzm(bArr, iZzm, zztpVar2);
                                            objValueOf = Long.valueOf(zzuj.zzG(zztpVar2.zzb));
                                            break;
                                    }
                                } else {
                                    bArr = bArr;
                                    iZzm = zztq.zzj(bArr, iZzm, zztpVar2);
                                    if (zzxhVarZzb.zzd.zza.zza(zztpVar2.zza) == null) {
                                        zzzj.zzB(zzxfVar, i12, zztpVar2.zza, null, zzzyVar);
                                        i2 = i2;
                                    } else {
                                        objValueOf = Integer.valueOf(zztpVar2.zza);
                                    }
                                    iZzi = iZzm;
                                }
                                i2 = i2;
                                zzxgVar = zzxhVarZzb.zzd;
                                if (zzxgVar.zzd) {
                                    zzwyVar.zzh(zzxgVar, objValueOf);
                                } else {
                                    zzwyVar.zzk(zzxgVar, objValueOf);
                                }
                                iZzi = iZzm;
                            }
                        }
                        i25 = i7;
                        i23 = i12;
                        i2 = i2;
                        i26 = i10;
                        i24 = i11;
                        i27 = i27;
                        i22 = -1;
                        i21 = i4;
                        zzyxVar2 = this;
                        zztpVar3 = zztpVar2;
                        unsafe2 = unsafe;
                        byte[] bArr3 = bArr;
                        obj4 = obj;
                        bArr2 = bArr3;
                    } else {
                        zztpVar2 = zztpVar;
                    }
                    i12 = i9;
                    iZzi = zztq.zzi(i7, bArr, iZzm, i2, zzd(obj), zztpVar);
                    i25 = i7;
                    i23 = i12;
                    i2 = i2;
                    i26 = i10;
                    i24 = i11;
                    i27 = i27;
                    i22 = -1;
                    i21 = i4;
                    zzyxVar2 = this;
                    zztpVar3 = zztpVar2;
                    unsafe2 = unsafe;
                    byte[] bArr4 = bArr;
                    obj4 = obj;
                    bArr2 = bArr4;
                } else {
                    zzyxVar = this;
                    obj2 = obj;
                    i5 = i2;
                    i6 = iZzm;
                    i26 = i10;
                }
            } else {
                i27 = i27;
                unsafe = unsafe2;
                i4 = i21;
                obj2 = obj4;
                zzyxVar = zzyxVar2;
                i5 = i2;
                i6 = iZzi;
                i7 = i25;
            }
        }
        int i43 = i27;
        if (i43 != 1048575) {
            unsafe.putInt(obj2, i43, i26);
        }
        for (int i44 = zzyxVar.zzk; i44 < zzyxVar.zzl; i44++) {
            zzD(obj, zzyxVar.zzj[i44], null, zzyxVar.zzn, obj);
        }
        if (i4 == 0) {
            if (i6 != i5) {
                throw zzxu.zzg();
            }
        } else if (i6 > i5 || i7 != i4) {
            throw zzxu.zzg();
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final Object zze() {
        return ((zzxj) this.zzg).zzad();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzzh
    public final void zzf(Object obj) {
        if (zzV(obj)) {
            if (obj instanceof zzxj) {
                zzxj zzxjVar = (zzxj) obj;
                zzxjVar.zzao(Integer.MAX_VALUE);
                zzxjVar.zzb = 0;
                zzxjVar.zzam();
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
                                if (zzS(obj, i)) {
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
                                this.zzm.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzyo) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzW(obj, this.zzc[i], i)) {
                        zzC(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzS(obj, i)) {
                    zzC(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zzf(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzz = zzz(i);
            int i2 = this.zzc[i];
            long j = 1048575 & iZzz;
            switch (zzy(iZzz)) {
                case 0:
                    if (zzS(obj2, i)) {
                        zzaai.zzo(obj, j, zzaai.zza(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 1:
                    if (zzS(obj2, i)) {
                        zzaai.zzp(obj, j, zzaai.zzb(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 2:
                    if (zzS(obj2, i)) {
                        zzaai.zzr(obj, j, zzaai.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 3:
                    if (zzS(obj2, i)) {
                        zzaai.zzr(obj, j, zzaai.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 4:
                    if (zzS(obj2, i)) {
                        zzaai.zzq(obj, j, zzaai.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 5:
                    if (zzS(obj2, i)) {
                        zzaai.zzr(obj, j, zzaai.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 6:
                    if (zzS(obj2, i)) {
                        zzaai.zzq(obj, j, zzaai.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 7:
                    if (zzS(obj2, i)) {
                        zzaai.zzm(obj, j, zzaai.zzw(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 8:
                    if (zzS(obj2, i)) {
                        zzaai.zzs(obj, j, zzaai.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 9:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (zzS(obj2, i)) {
                        zzaai.zzs(obj, j, zzaai.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 11:
                    if (zzS(obj2, i)) {
                        zzaai.zzq(obj, j, zzaai.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 12:
                    if (zzS(obj2, i)) {
                        zzaai.zzq(obj, j, zzaai.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 13:
                    if (zzS(obj2, i)) {
                        zzaai.zzq(obj, j, zzaai.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 14:
                    if (zzS(obj2, i)) {
                        zzaai.zzr(obj, j, zzaai.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 15:
                    if (zzS(obj2, i)) {
                        zzaai.zzq(obj, j, zzaai.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 16:
                    if (zzS(obj2, i)) {
                        zzaai.zzr(obj, j, zzaai.zzd(obj2, j));
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
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzzj.zza;
                    zzaai.zzs(obj, j, zzyp.zzc(zzaai.zzf(obj, j), zzaai.zzf(obj2, j)));
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
                    if (zzW(obj2, i2, i)) {
                        zzaai.zzs(obj, j, zzaai.zzf(obj2, j));
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
                    if (zzW(obj2, i2, i)) {
                        zzaai.zzs(obj, j, zzaai.zzf(obj2, j));
                        zzN(obj, i2, i);
                    }
                    break;
                case 68:
                    zzK(obj, obj2, i);
                    break;
            }
        }
        zzzj.zzD(this.zzn, obj, obj2);
        if (this.zzh) {
            zzzj.zzC(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x064e A[LOOP:3: B:180:0x064a->B:182:0x064e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0662  */
    @Override // com.google.android.gms.internal.gtm.zzzh
    public final void zzh(Object obj, zzzg zzzgVar, zzwt zzwtVar) throws Throwable {
        zzzy zzzyVar;
        int i;
        zzzy zzzyVar2;
        Object obj2;
        Object obj3;
        zzwu zzwuVar;
        zzwt zzwtVar2;
        Object obj4 = obj;
        zzwt zzwtVar3 = zzwtVar;
        zzwtVar.getClass();
        zzI(obj);
        zzzy zzzyVar3 = this.zzn;
        zzwu zzwuVar2 = this.zzo;
        zzwy zzwyVarZzc = null;
        Object objZzc = null;
        while (true) {
            try {
                int iZzc = zzzgVar.zzc();
                int iZzu = zzu(iZzc);
                if (iZzu < 0) {
                    if (iZzc == Integer.MAX_VALUE) {
                        for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                            zzD(obj, this.zzj[i2], objZzc, zzzyVar3, obj);
                        }
                        if (objZzc != null) {
                            zzzyVar3.zzn(obj4, objZzc);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objZzd = !this.zzh ? null : zzwuVar2.zzd(zzwtVar3, this.zzg, iZzc);
                        if (objZzd != null) {
                            if (zzwyVarZzc == null) {
                                zzwyVarZzc = zzwuVar2.zzc(obj4);
                            }
                            zzwy zzwyVar = zzwyVarZzc;
                            obj3 = objZzc;
                            zzzyVar2 = zzzyVar3;
                            obj2 = obj4;
                            try {
                                objZzc = zzwuVar2.zze(obj, zzzgVar, objZzd, zzwtVar, zzwyVar, obj3, zzzyVar2);
                                zzwyVarZzc = zzwyVar;
                            } catch (Throwable th) {
                                th = th;
                                obj4 = obj2;
                                zzzyVar = zzzyVar2;
                                objZzc = obj3;
                                for (i = this.zzk; i < this.zzl; i++) {
                                    zzD(obj, this.zzj[i], objZzc, zzzyVar, obj);
                                }
                                if (objZzc != null) {
                                    zzzyVar.zzn(obj4, objZzc);
                                }
                                throw th;
                            }
                        } else {
                            Object obj5 = objZzc;
                            zzzyVar2 = zzzyVar3;
                            obj2 = obj4;
                            zzzyVar2.zzq(zzzgVar);
                            objZzc = obj5 == null ? zzzyVar2.zzc(obj2) : obj5;
                            try {
                                if (!zzzyVar2.zzp(objZzc, zzzgVar)) {
                                    int i3 = this.zzk;
                                    while (i3 < this.zzl) {
                                        zzzy zzzyVar4 = zzzyVar2;
                                        zzD(obj, this.zzj[i3], objZzc, zzzyVar4, obj);
                                        i3++;
                                        obj2 = obj2;
                                        zzzyVar2 = zzzyVar4;
                                    }
                                    Object obj6 = obj2;
                                    zzzy zzzyVar5 = zzzyVar2;
                                    if (objZzc != null) {
                                        zzzyVar5.zzn(obj6, objZzc);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj4 = obj2;
                                zzzyVar = zzzyVar2;
                            }
                        }
                        obj4 = obj2;
                        zzzyVar3 = zzzyVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        zzzyVar = zzzyVar3;
                        obj4 = obj4;
                    }
                    zzzyVar = zzzyVar3;
                    obj4 = obj4;
                } else {
                    obj3 = objZzc;
                    zzzyVar = zzzyVar3;
                    obj4 = obj4;
                    try {
                        int iZzz = zzz(iZzu);
                        try {
                            switch (zzy(iZzz)) {
                                case 0:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzo(obj4, iZzz & 1048575, zzzgVar.zza());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 1:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzp(obj4, iZzz & 1048575, zzzgVar.zzb());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 2:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzr(obj4, iZzz & 1048575, zzzgVar.zzl());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 3:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzr(obj4, iZzz & 1048575, zzzgVar.zzo());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 4:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzq(obj4, iZzz & 1048575, zzzgVar.zzg());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 5:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzr(obj4, iZzz & 1048575, zzzgVar.zzk());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 6:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzq(obj4, iZzz & 1048575, zzzgVar.zzf());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 7:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzm(obj4, iZzz & 1048575, zzzgVar.zzP());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 8:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzL(obj4, iZzz, zzzgVar);
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 9:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzyu zzyuVar = (zzyu) zzF(obj4, iZzu);
                                    zzzgVar.zzw(zzyuVar, zzC(iZzu), zzwtVar2);
                                    zzO(obj4, iZzu, zzyuVar);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 10:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzs(obj4, iZzz & 1048575, zzzgVar.zzp());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 11:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzq(obj4, iZzz & 1048575, zzzgVar.zzj());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 12:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    int iZze = zzzgVar.zze();
                                    zzxn zzxnVarZzB = zzB(iZzu);
                                    if (zzxnVarZzB == null || zzxnVarZzB.zza(iZze)) {
                                        zzaai.zzq(obj4, iZzz & 1048575, iZze);
                                        zzM(obj4, iZzu);
                                    } else {
                                        objZzc = zzzj.zzB(obj4, iZzc, iZze, objZzc, zzzyVar);
                                    }
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 13:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzq(obj4, iZzz & 1048575, zzzgVar.zzh());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 14:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzr(obj4, iZzz & 1048575, zzzgVar.zzm());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 15:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzq(obj4, iZzz & 1048575, zzzgVar.zzi());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 16:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzaai.zzr(obj4, iZzz & 1048575, zzzgVar.zzn());
                                    zzM(obj4, iZzu);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 17:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzyu zzyuVar2 = (zzyu) zzF(obj4, iZzu);
                                    zzzgVar.zzv(zzyuVar2, zzC(iZzu), zzwtVar2);
                                    zzO(obj4, iZzu, zzyuVar2);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 18:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzz(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 19:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzD(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 20:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzG(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 21:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzO(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 22:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzF(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 23:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzC(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 24:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzB(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 25:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzx(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 26:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    if (zzR(iZzz)) {
                                        ((zzuk) zzzgVar).zzM(this.zzm.zza(obj4, iZzz & 1048575), true);
                                    } else {
                                        ((zzuk) zzzgVar).zzM(this.zzm.zza(obj4, iZzz & 1048575), false);
                                    }
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 27:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzH(this.zzm.zza(obj4, iZzz & 1048575), zzC(iZzu), zzwtVar2);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 28:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzy(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 29:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzN(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 30:
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    List listZza = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzzgVar.zzA(listZza);
                                    objZzc = zzzj.zzA(obj, iZzc, listZza, zzB(iZzu), obj3, zzzyVar);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 31:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzI(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 32:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzJ(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 33:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzK(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 34:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzL(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 35:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzz(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 36:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzD(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 37:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzG(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 38:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzO(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 39:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzF(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 40:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzC(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 41:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzB(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 42:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzx(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 43:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzzgVar.zzN(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 44:
                                    List listZza2 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzzgVar.zzA(listZza2);
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    objZzc = zzzj.zzA(obj, iZzc, listZza2, zzB(iZzu), obj3, zzzyVar);
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 45:
                                    zzzgVar.zzI(this.zzm.zza(obj4, iZzz & 1048575));
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 46:
                                    zzzgVar.zzJ(this.zzm.zza(obj4, iZzz & 1048575));
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 47:
                                    zzzgVar.zzK(this.zzm.zza(obj4, iZzz & 1048575));
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 48:
                                    zzzgVar.zzL(this.zzm.zza(obj4, iZzz & 1048575));
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 49:
                                    zzzgVar.zzE(this.zzm.zza(obj4, iZzz & 1048575), zzC(iZzu), zzwtVar3);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 50:
                                    Object objZzE = zzE(iZzu);
                                    long jZzz = zzz(iZzu) & 1048575;
                                    Object objZzf = zzaai.zzf(obj4, jZzz);
                                    if (objZzf == null) {
                                        objZzf = zzyo.zza().zzb();
                                        zzaai.zzs(obj4, jZzz, objZzf);
                                    } else if (zzyp.zzb(objZzf)) {
                                        Object objZzb = zzyo.zza().zzb();
                                        zzyp.zzc(objZzb, objZzf);
                                        zzaai.zzs(obj4, jZzz, objZzb);
                                        objZzf = objZzb;
                                    }
                                    throw null;
                                case 51:
                                    zzaai.zzs(obj4, iZzz & 1048575, Double.valueOf(zzzgVar.zza()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 52:
                                    zzaai.zzs(obj4, iZzz & 1048575, Float.valueOf(zzzgVar.zzb()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 53:
                                    zzaai.zzs(obj4, iZzz & 1048575, Long.valueOf(zzzgVar.zzl()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 54:
                                    zzaai.zzs(obj4, iZzz & 1048575, Long.valueOf(zzzgVar.zzo()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 55:
                                    zzaai.zzs(obj4, iZzz & 1048575, Integer.valueOf(zzzgVar.zzg()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 56:
                                    zzaai.zzs(obj4, iZzz & 1048575, Long.valueOf(zzzgVar.zzk()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 57:
                                    zzaai.zzs(obj4, iZzz & 1048575, Integer.valueOf(zzzgVar.zzf()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 58:
                                    zzaai.zzs(obj4, iZzz & 1048575, Boolean.valueOf(zzzgVar.zzP()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 59:
                                    zzL(obj4, iZzz, zzzgVar);
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 60:
                                    zzyu zzyuVar3 = (zzyu) zzG(obj4, iZzc, iZzu);
                                    zzzgVar.zzw(zzyuVar3, zzC(iZzu), zzwtVar3);
                                    zzP(obj4, iZzc, iZzu, zzyuVar3);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 61:
                                    zzaai.zzs(obj4, iZzz & 1048575, zzzgVar.zzp());
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 62:
                                    zzaai.zzs(obj4, iZzz & 1048575, Integer.valueOf(zzzgVar.zzj()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 63:
                                    int iZze2 = zzzgVar.zze();
                                    zzxn zzxnVarZzB2 = zzB(iZzu);
                                    if (zzxnVarZzB2 == null || zzxnVarZzB2.zza(iZze2)) {
                                        zzaai.zzs(obj4, iZzz & 1048575, Integer.valueOf(iZze2));
                                        zzN(obj4, iZzc, iZzu);
                                        objZzc = obj3;
                                        zzwuVar = zzwuVar2;
                                        zzwtVar2 = zzwtVar3;
                                        zzwuVar2 = zzwuVar;
                                        zzwtVar3 = zzwtVar2;
                                    } else {
                                        objZzc = zzzj.zzB(obj4, iZzc, iZze2, obj3, zzzyVar);
                                    }
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 64:
                                    zzaai.zzs(obj4, iZzz & 1048575, Integer.valueOf(zzzgVar.zzh()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 65:
                                    zzaai.zzs(obj4, iZzz & 1048575, Long.valueOf(zzzgVar.zzm()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 66:
                                    zzaai.zzs(obj4, iZzz & 1048575, Integer.valueOf(zzzgVar.zzi()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 67:
                                    zzaai.zzs(obj4, iZzz & 1048575, Long.valueOf(zzzgVar.zzn()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                case 68:
                                    zzyu zzyuVar4 = (zzyu) zzG(obj4, iZzc, iZzu);
                                    zzzgVar.zzv(zzyuVar4, zzC(iZzu), zzwtVar3);
                                    zzP(obj4, iZzc, iZzu, zzyuVar4);
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                                default:
                                    objZzc = obj3;
                                    zzwuVar = zzwuVar2;
                                    zzwtVar2 = zzwtVar3;
                                    if (objZzc == null) {
                                        try {
                                            try {
                                                objZzc = zzzyVar.zzc(obj4);
                                            } catch (zzxt unused) {
                                                zzzyVar.zzq(zzzgVar);
                                                if (objZzc == null) {
                                                    objZzc = zzzyVar.zzc(obj4);
                                                }
                                                if (!zzzyVar.zzp(objZzc, zzzgVar)) {
                                                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                                                        zzD(obj, this.zzj[i4], objZzc, zzzyVar, obj);
                                                    }
                                                    if (objZzc != null) {
                                                        zzzyVar.zzn(obj4, objZzc);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                    if (!zzzyVar.zzp(objZzc, zzzgVar)) {
                                        for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                                            zzD(obj, this.zzj[i5], objZzc, zzzyVar, obj);
                                        }
                                        if (objZzc != null) {
                                            zzzyVar.zzn(obj4, objZzc);
                                            return;
                                        }
                                        return;
                                    }
                                    zzwuVar2 = zzwuVar;
                                    zzwtVar3 = zzwtVar2;
                                    zzzyVar3 = zzzyVar;
                                    break;
                            }
                        } catch (zzxt unused2) {
                            objZzc = obj3;
                            zzwuVar = zzwuVar2;
                            zzwtVar2 = zzwtVar3;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        objZzc = obj3;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
            while (i < this.zzl) {
                zzD(obj, this.zzj[i], objZzc, zzzyVar, obj);
            }
            if (objZzc != null) {
                zzzyVar.zzn(obj4, objZzc);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:97:0x02a5 A[PHI: r0 r25 r26 r27
  0x02a5: PHI (r0v25 int) = (r0v20 int), (r0v23 int), (r0v27 int) binds: [B:109:0x030a, B:104:0x02e6, B:96:0x02a3] A[DONT_GENERATE, DONT_INLINE]
  0x02a5: PHI (r25v3 int) = (r25v1 int), (r25v1 int), (r25v4 int) binds: [B:109:0x030a, B:104:0x02e6, B:96:0x02a3] A[DONT_GENERATE, DONT_INLINE]
  0x02a5: PHI (r26v2 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:109:0x030a, B:104:0x02e6, B:96:0x02a3] A[DONT_GENERATE, DONT_INLINE]
  0x02a5: PHI (r27v6 sun.misc.Unsafe) = (r27v4 sun.misc.Unsafe), (r27v4 sun.misc.Unsafe), (r27v7 sun.misc.Unsafe) binds: [B:109:0x030a, B:104:0x02e6, B:96:0x02a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x02b9 A[PHI: r0 r25 r26 r27
  0x02b9: PHI (r0v24 int) = (r0v20 int), (r0v23 int), (r0v27 int) binds: [B:109:0x030a, B:104:0x02e6, B:96:0x02a3] A[DONT_GENERATE, DONT_INLINE]
  0x02b9: PHI (r25v2 int) = (r25v1 int), (r25v1 int), (r25v4 int) binds: [B:109:0x030a, B:104:0x02e6, B:96:0x02a3] A[DONT_GENERATE, DONT_INLINE]
  0x02b9: PHI (r26v1 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:109:0x030a, B:104:0x02e6, B:96:0x02a3] A[DONT_GENERATE, DONT_INLINE]
  0x02b9: PHI (r27v5 sun.misc.Unsafe) = (r27v4 sun.misc.Unsafe), (r27v4 sun.misc.Unsafe), (r27v7 sun.misc.Unsafe) binds: [B:109:0x030a, B:104:0x02e6, B:96:0x02a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x008e. Please report as an issue. */
    @Override // com.google.android.gms.internal.gtm.zzzh
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zztp zztpVar) throws IOException {
        int i3;
        int iZzk;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        this = this;
        obj = obj;
        bArr = bArr;
        i2 = i2;
        zztpVar = zztpVar;
        zzaao zzaaoVar = zzaao.DOUBLE;
        int i12 = -1;
        if (this.zzp - 1 == 0) {
            zzc(obj, bArr, i, i2, 0, zztpVar);
            return;
        }
        zzI(obj);
        Unsafe unsafe2 = zzb;
        int i13 = 1048575;
        int iZzi = i;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (iZzi < i2) {
            int i18 = iZzi + 1;
            byte b = bArr[iZzi];
            if (b < 0) {
                iZzk = zztq.zzk(b, bArr, i18, zztpVar);
                i3 = zztpVar.zza;
            } else {
                i3 = b;
                iZzk = i18;
            }
            int i19 = i3 >>> 3;
            int iZzv = i19 > i14 ? this.zzv(i19, i15 / 3) : this.zzu(i19);
            if (iZzv == i12) {
                i4 = iZzk;
                i5 = i19;
                unsafe = unsafe2;
                i6 = 0;
            } else {
                int i20 = i3 & 7;
                int[] iArr = this.zzc;
                int i21 = iArr[iZzv + 1];
                int iZzy = zzy(i21);
                long j = i21 & i13;
                if (iZzy <= 17) {
                    int i22 = iArr[iZzv + 2];
                    int i23 = 1 << (i22 >>> 20);
                    int i24 = i22 & 1048575;
                    if (i24 != i17) {
                        if (i17 != 1048575) {
                            unsafe2.putInt(obj, i17, i16);
                        }
                        if (i24 != 1048575) {
                            i16 = unsafe2.getInt(obj, i24);
                        }
                        i17 = i24;
                    }
                    switch (iZzy) {
                        case 0:
                            i10 = iZzk;
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 1) {
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                zzaai.zzo(obj, j, Double.longBitsToDouble(zztq.zzq(bArr, i10)));
                                iZzi = i10 + 8;
                                i16 |= i23;
                                i15 = i11;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 1:
                            i10 = iZzk;
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 5) {
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                zzaai.zzp(obj, j, Float.intBitsToFloat(zztq.zzb(bArr, i10)));
                                iZzi = i10 + 4;
                                i16 |= i23;
                                i15 = i11;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 2:
                        case 3:
                            i10 = iZzk;
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 0) {
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                int iZzm = zztq.zzm(bArr, i10, zztpVar);
                                unsafe2.putLong(obj, j, zztpVar.zzb);
                                i16 |= i23;
                                i15 = i11;
                                iZzi = iZzm;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 4:
                        case 11:
                            i10 = iZzk;
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 0) {
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                iZzi = zztq.zzj(bArr, i10, zztpVar);
                                unsafe2.putInt(obj, j, zztpVar.zza);
                                i16 |= i23;
                                i15 = i11;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 5:
                        case 14:
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 1) {
                                i10 = iZzk;
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                unsafe2.putLong(obj, j, zztq.zzq(bArr, iZzk));
                                iZzi = iZzk + 8;
                                i16 |= i23;
                                i15 = i11;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 6:
                        case 13:
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 5) {
                                i10 = iZzk;
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                unsafe2.putInt(obj, j, zztq.zzb(bArr, iZzk));
                                iZzi = iZzk + 4;
                                i16 |= i23;
                                i15 = i11;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 7:
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 0) {
                                i10 = iZzk;
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                iZzi = zztq.zzm(bArr, iZzk, zztpVar);
                                zzaai.zzm(obj, j, zztpVar.zzb != 0);
                                i16 |= i23;
                                i15 = i11;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 8:
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 2) {
                                i10 = iZzk;
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                iZzi = (i21 & DriveFile.MODE_WRITE_ONLY) == 0 ? zztq.zzg(bArr, iZzk, zztpVar) : zztq.zzh(bArr, iZzk, zztpVar);
                                unsafe2.putObject(obj, j, zztpVar.zzc);
                                i16 |= i23;
                                i15 = i11;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 9:
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 2) {
                                i10 = iZzk;
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                Object objZzF = this.zzF(obj, i11);
                                iZzi = zztq.zzo(objZzF, this.zzC(i11), bArr, iZzk, i2, zztpVar);
                                this.zzO(obj, i11, objZzF);
                                i16 |= i23;
                                i15 = i11;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 10:
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 2) {
                                i10 = iZzk;
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                iZzi = zztq.zza(bArr, iZzk, zztpVar);
                                unsafe2.putObject(obj, j, zztpVar.zzc);
                                i16 |= i23;
                                i15 = i11;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 12:
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 0) {
                                i10 = iZzk;
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                iZzi = zztq.zzj(bArr, iZzk, zztpVar);
                                unsafe2.putInt(obj, j, zztpVar.zza);
                                i16 |= i23;
                                i15 = i11;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 15:
                            i11 = iZzv;
                            i5 = i19;
                            if (i20 != 0) {
                                i10 = iZzk;
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                iZzi = zztq.zzj(bArr, iZzk, zztpVar);
                                unsafe2.putInt(obj, j, zzuj.zzF(zztpVar.zza));
                                i16 |= i23;
                                i15 = i11;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 16:
                            if (i20 != 0) {
                                i5 = i19;
                                i10 = iZzk;
                                i11 = iZzv;
                                i4 = i10;
                                unsafe = unsafe2;
                                i6 = i11;
                            } else {
                                int iZzm2 = zztq.zzm(bArr, iZzk, zztpVar);
                                i5 = i19;
                                unsafe2.putLong(obj, j, zzuj.zzG(zztpVar.zzb));
                                i16 |= i23;
                                i15 = iZzv;
                                iZzi = iZzm2;
                                i14 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        default:
                            i10 = iZzk;
                            i11 = iZzv;
                            i5 = i19;
                            i4 = i10;
                            unsafe = unsafe2;
                            i6 = i11;
                            break;
                    }
                } else {
                    i5 = i19;
                    int i25 = iZzk;
                    if (iZzy == 27) {
                        if (i20 == 2) {
                            zzxr zzxrVarZzd = (zzxr) unsafe2.getObject(obj, j);
                            if (!zzxrVarZzd.zzc()) {
                                int size = zzxrVarZzd.size();
                                zzxrVarZzd = zzxrVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj, j, zzxrVarZzd);
                            }
                            iZzi = zztq.zze(this.zzC(iZzv), i3, bArr, i25, i2, zzxrVarZzd, zztpVar);
                            i2 = i2;
                            i16 = i16;
                            i14 = i5;
                            i15 = iZzv;
                        } else {
                            i6 = iZzv;
                            i7 = i25;
                            i8 = i16;
                            i9 = i17;
                            unsafe = unsafe2;
                        }
                        i13 = 1048575;
                        i12 = -1;
                    } else {
                        i6 = iZzv;
                        if (iZzy <= 49) {
                            i8 = i16;
                            i9 = i17;
                            unsafe = unsafe2;
                            iZzi = zzt(obj, bArr, i25, i2, i3, i5, i20, i6, i21, iZzy, j, zztpVar);
                            if (iZzi != i25) {
                                i14 = i5;
                                i15 = i6;
                                i16 = i8;
                                i17 = i9;
                            } else {
                                i4 = iZzi;
                                i16 = i8;
                                i17 = i9;
                            }
                            unsafe2 = unsafe;
                        } else {
                            i7 = i25;
                            i8 = i16;
                            i9 = i17;
                            unsafe = unsafe2;
                            if (iZzy == 50) {
                                if (i20 == 2) {
                                    iZzi = zzr(obj, bArr, i7, i2, i6, j, zztpVar);
                                    if (iZzi != i7) {
                                        i14 = i5;
                                        i15 = i6;
                                        i16 = i8;
                                        i17 = i9;
                                    } else {
                                        i4 = iZzi;
                                    }
                                    unsafe2 = unsafe;
                                }
                                i16 = i8;
                                i17 = i9;
                            } else {
                                iZzi = zzs(obj, bArr, i7, i2, i3, i5, i20, i21, iZzy, j, i6, zztpVar);
                                if (iZzi != i7) {
                                    i14 = i5;
                                    i15 = i6;
                                    i16 = i8;
                                    i17 = i9;
                                } else {
                                    i4 = iZzi;
                                    i16 = i8;
                                    i17 = i9;
                                }
                                unsafe2 = unsafe;
                            }
                        }
                        i13 = 1048575;
                        i12 = -1;
                    }
                    i4 = i7;
                    i16 = i8;
                    i17 = i9;
                }
            }
            iZzi = zztq.zzi(i3, bArr, i4, i2, zzd(obj), zztpVar);
            i14 = i5;
            i15 = i6;
            unsafe2 = unsafe;
            i13 = 1048575;
            i12 = -1;
        }
        int i26 = i16;
        Unsafe unsafe3 = unsafe2;
        if (i17 != 1048575) {
            unsafe3.putInt(obj, i17, i26);
        }
        if (iZzi != i2) {
            throw zzxu.zzg();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzF;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzz = zzz(i);
            long j = iZzz & 1048575;
            switch (zzy(iZzz)) {
                case 0:
                    if (!zzQ(obj, obj2, i) || Double.doubleToLongBits(zzaai.zza(obj, j)) != Double.doubleToLongBits(zzaai.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzQ(obj, obj2, i) || Float.floatToIntBits(zzaai.zzb(obj, j)) != Float.floatToIntBits(zzaai.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzQ(obj, obj2, i) || zzaai.zzd(obj, j) != zzaai.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzQ(obj, obj2, i) || zzaai.zzd(obj, j) != zzaai.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzQ(obj, obj2, i) || zzaai.zzc(obj, j) != zzaai.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzQ(obj, obj2, i) || zzaai.zzd(obj, j) != zzaai.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzQ(obj, obj2, i) || zzaai.zzc(obj, j) != zzaai.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzQ(obj, obj2, i) || zzaai.zzw(obj, j) != zzaai.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzQ(obj, obj2, i) || !zzzj.zzF(zzaai.zzf(obj, j), zzaai.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzQ(obj, obj2, i) || !zzzj.zzF(zzaai.zzf(obj, j), zzaai.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzQ(obj, obj2, i) || !zzzj.zzF(zzaai.zzf(obj, j), zzaai.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzQ(obj, obj2, i) || zzaai.zzc(obj, j) != zzaai.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzQ(obj, obj2, i) || zzaai.zzc(obj, j) != zzaai.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzQ(obj, obj2, i) || zzaai.zzc(obj, j) != zzaai.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzQ(obj, obj2, i) || zzaai.zzd(obj, j) != zzaai.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzQ(obj, obj2, i) || zzaai.zzc(obj, j) != zzaai.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzQ(obj, obj2, i) || zzaai.zzd(obj, j) != zzaai.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzQ(obj, obj2, i) || !zzzj.zzF(zzaai.zzf(obj, j), zzaai.zzf(obj2, j))) {
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
                    zZzF = zzzj.zzF(zzaai.zzf(obj, j), zzaai.zzf(obj2, j));
                    break;
                case 50:
                    zZzF = zzzj.zzF(zzaai.zzf(obj, j), zzaai.zzf(obj2, j));
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
                    if (zzaai.zzc(obj, jZzw) != zzaai.zzc(obj2, jZzw) || !zzzj.zzF(zzaai.zzf(obj, j), zzaai.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2 A[LOOP:1: B:45:0x00b1->B:50:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00df A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzzh
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zzzh zzzhVarZzC;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
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
            if ((268435456 & iZzz) != 0 && !zzT(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzy = zzy(iZzz);
            if (iZzy == 9 || iZzy == 17) {
                if (zzT(obj, i7, i, i2, i11) && !zzU(obj, iZzz, zzC(i7))) {
                    return false;
                }
            } else if (iZzy == 27) {
                list = (List) zzaai.zzf(obj, iZzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzzhVarZzC = zzC(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzzhVarZzC.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzy == 60 || iZzy == 68) {
                if (zzW(obj, i8, i7) && !zzU(obj, iZzz, zzC(i7))) {
                    return false;
                }
            } else if (iZzy == 49) {
                list = (List) zzaai.zzf(obj, iZzz & 1048575);
                if (list.isEmpty()) {
                    zzzhVarZzC = zzC(i7);
                    while (i3 < list.size()) {
                        if (!zzzhVarZzC.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzy == 50 && !((zzyo) zzaai.zzf(obj, iZzz & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        return !this.zzh || this.zzo.zzb(obj).zzm();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:177:0x054c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    @Override // com.google.android.gms.internal.gtm.zzzh
    public final void zzm(Object obj, zzur zzurVar) throws IOException {
        Iterator itZzg;
        Map.Entry entry;
        int i;
        Iterator itZzg2;
        Map.Entry entry2;
        zzaao zzaaoVar = zzaao.DOUBLE;
        if (this.zzp - 1 == 0) {
            if (this.zzh) {
                zzwy zzwyVarZzb = this.zzo.zzb(obj);
                if (zzwyVarZzb.zza.isEmpty()) {
                    itZzg = null;
                    entry = null;
                } else {
                    itZzg = zzwyVarZzb.zzg();
                    entry = (Map.Entry) itZzg.next();
                }
            } else {
                itZzg = null;
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
                while (entry != null && this.zzo.zza(entry) <= i5) {
                    this.zzo.zzj(zzurVar, entry);
                    entry = itZzg.hasNext() ? (Map.Entry) itZzg.next() : null;
                }
                long j = iZzz & 1048575;
                switch (iZzy) {
                    case 0:
                        if ((i & i3) != 0) {
                            zzurVar.zzf(i5, zzaai.zza(obj, j));
                        }
                        break;
                    case 1:
                        if ((i & i3) != 0) {
                            zzurVar.zzo(i5, zzaai.zzb(obj, j));
                        }
                        break;
                    case 2:
                        if ((i & i3) != 0) {
                            zzurVar.zzt(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 3:
                        if ((i & i3) != 0) {
                            zzurVar.zzK(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 4:
                        if ((i & i3) != 0) {
                            zzurVar.zzr(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 5:
                        if ((i & i3) != 0) {
                            zzurVar.zzm(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 6:
                        if ((i & i3) != 0) {
                            zzurVar.zzk(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 7:
                        if ((i & i3) != 0) {
                            zzurVar.zzb(i5, zzaai.zzw(obj, j));
                        }
                        break;
                    case 8:
                        if ((i & i3) != 0) {
                            zzZ(i5, unsafe.getObject(obj, j), zzurVar);
                        }
                        break;
                    case 9:
                        if ((i & i3) != 0) {
                            zzurVar.zzv(i5, unsafe.getObject(obj, j), zzC(i4));
                        }
                        break;
                    case 10:
                        if ((i & i3) != 0) {
                            zzurVar.zzd(i5, (zzud) unsafe.getObject(obj, j));
                        }
                        break;
                    case 11:
                        if ((i & i3) != 0) {
                            zzurVar.zzI(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 12:
                        if ((i & i3) != 0) {
                            zzurVar.zzi(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 13:
                        if ((i & i3) != 0) {
                            zzurVar.zzx(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 14:
                        if ((i & i3) != 0) {
                            zzurVar.zzz(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 15:
                        if ((i & i3) != 0) {
                            zzurVar.zzB(i5, unsafe.getInt(obj, j));
                        }
                        break;
                    case 16:
                        if ((i & i3) != 0) {
                            zzurVar.zzD(i5, unsafe.getLong(obj, j));
                        }
                        break;
                    case 17:
                        if ((i & i3) != 0) {
                            zzurVar.zzq(i5, unsafe.getObject(obj, j), zzC(i4));
                        }
                        break;
                    case 18:
                        zzzj.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 19:
                        zzzj.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 20:
                        zzzj.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 21:
                        zzzj.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 22:
                        zzzj.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 23:
                        zzzj.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 24:
                        zzzj.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 25:
                        zzzj.zzG(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 26:
                        zzzj.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar);
                        break;
                    case 27:
                        zzzj.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, zzC(i4));
                        break;
                    case 28:
                        zzzj.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar);
                        break;
                    case 29:
                        zzzj.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 30:
                        zzzj.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 31:
                        zzzj.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 32:
                        zzzj.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 33:
                        zzzj.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 34:
                        zzzj.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, false);
                        break;
                    case 35:
                        zzzj.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 36:
                        zzzj.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 37:
                        zzzj.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 38:
                        zzzj.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 39:
                        zzzj.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 40:
                        zzzj.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 41:
                        zzzj.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 42:
                        zzzj.zzG(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 43:
                        zzzj.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 44:
                        zzzj.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 45:
                        zzzj.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 46:
                        zzzj.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 47:
                        zzzj.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 48:
                        zzzj.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, true);
                        break;
                    case 49:
                        zzzj.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzurVar, zzC(i4));
                        break;
                    case 50:
                        zzY(zzurVar, i5, unsafe.getObject(obj, j), i4);
                        break;
                    case 51:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzf(i5, zzn(obj, j));
                        }
                        break;
                    case 52:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzo(i5, zzo(obj, j));
                        }
                        break;
                    case 53:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzt(i5, zzA(obj, j));
                        }
                        break;
                    case 54:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzK(i5, zzA(obj, j));
                        }
                        break;
                    case 55:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzr(i5, zzq(obj, j));
                        }
                        break;
                    case 56:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzm(i5, zzA(obj, j));
                        }
                        break;
                    case 57:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzk(i5, zzq(obj, j));
                        }
                        break;
                    case 58:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzb(i5, zzX(obj, j));
                        }
                        break;
                    case 59:
                        if (zzW(obj, i5, i4)) {
                            zzZ(i5, unsafe.getObject(obj, j), zzurVar);
                        }
                        break;
                    case 60:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzv(i5, unsafe.getObject(obj, j), zzC(i4));
                        }
                        break;
                    case 61:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzd(i5, (zzud) unsafe.getObject(obj, j));
                        }
                        break;
                    case 62:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzI(i5, zzq(obj, j));
                        }
                        break;
                    case 63:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzi(i5, zzq(obj, j));
                        }
                        break;
                    case 64:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzx(i5, zzq(obj, j));
                        }
                        break;
                    case 65:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzz(i5, zzA(obj, j));
                        }
                        break;
                    case 66:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzB(i5, zzq(obj, j));
                        }
                        break;
                    case 67:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzD(i5, zzA(obj, j));
                        }
                        break;
                    case 68:
                        if (zzW(obj, i5, i4)) {
                            zzurVar.zzq(i5, unsafe.getObject(obj, j), zzC(i4));
                        }
                        break;
                    default:
                        break;
                }
            }
            while (entry != null) {
                this.zzo.zzj(zzurVar, entry);
                entry = itZzg.hasNext() ? (Map.Entry) itZzg.next() : null;
            }
            zzzy zzzyVar = this.zzn;
            zzzyVar.zzs(zzzyVar.zzd(obj), zzurVar);
            return;
        }
        if (this.zzh) {
            zzwy zzwyVarZzb2 = this.zzo.zzb(obj);
            if (zzwyVarZzb2.zza.isEmpty()) {
                itZzg2 = null;
                entry2 = null;
            } else {
                itZzg2 = zzwyVarZzb2.zzg();
                entry2 = (Map.Entry) itZzg2.next();
            }
        } else {
            itZzg2 = null;
            entry2 = null;
        }
        int length2 = this.zzc.length;
        for (int i8 = 0; i8 < length2; i8 += 3) {
            int iZzz2 = zzz(i8);
            int i9 = this.zzc[i8];
            while (entry2 != null && this.zzo.zza(entry2) <= i9) {
                this.zzo.zzj(zzurVar, entry2);
                entry2 = itZzg2.hasNext() ? (Map.Entry) itZzg2.next() : null;
            }
            switch (zzy(iZzz2)) {
                case 0:
                    if (zzS(obj, i8)) {
                        zzurVar.zzf(i9, zzaai.zza(obj, iZzz2 & 1048575));
                    }
                    break;
                case 1:
                    if (zzS(obj, i8)) {
                        zzurVar.zzo(i9, zzaai.zzb(obj, iZzz2 & 1048575));
                    }
                    break;
                case 2:
                    if (zzS(obj, i8)) {
                        zzurVar.zzt(i9, zzaai.zzd(obj, iZzz2 & 1048575));
                    }
                    break;
                case 3:
                    if (zzS(obj, i8)) {
                        zzurVar.zzK(i9, zzaai.zzd(obj, iZzz2 & 1048575));
                    }
                    break;
                case 4:
                    if (zzS(obj, i8)) {
                        zzurVar.zzr(i9, zzaai.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 5:
                    if (zzS(obj, i8)) {
                        zzurVar.zzm(i9, zzaai.zzd(obj, iZzz2 & 1048575));
                    }
                    break;
                case 6:
                    if (zzS(obj, i8)) {
                        zzurVar.zzk(i9, zzaai.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 7:
                    if (zzS(obj, i8)) {
                        zzurVar.zzb(i9, zzaai.zzw(obj, iZzz2 & 1048575));
                    }
                    break;
                case 8:
                    if (zzS(obj, i8)) {
                        zzZ(i9, zzaai.zzf(obj, iZzz2 & 1048575), zzurVar);
                    }
                    break;
                case 9:
                    if (zzS(obj, i8)) {
                        zzurVar.zzv(i9, zzaai.zzf(obj, iZzz2 & 1048575), zzC(i8));
                    }
                    break;
                case 10:
                    if (zzS(obj, i8)) {
                        zzurVar.zzd(i9, (zzud) zzaai.zzf(obj, iZzz2 & 1048575));
                    }
                    break;
                case 11:
                    if (zzS(obj, i8)) {
                        zzurVar.zzI(i9, zzaai.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 12:
                    if (zzS(obj, i8)) {
                        zzurVar.zzi(i9, zzaai.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 13:
                    if (zzS(obj, i8)) {
                        zzurVar.zzx(i9, zzaai.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 14:
                    if (zzS(obj, i8)) {
                        zzurVar.zzz(i9, zzaai.zzd(obj, iZzz2 & 1048575));
                    }
                    break;
                case 15:
                    if (zzS(obj, i8)) {
                        zzurVar.zzB(i9, zzaai.zzc(obj, iZzz2 & 1048575));
                    }
                    break;
                case 16:
                    if (zzS(obj, i8)) {
                        zzurVar.zzD(i9, zzaai.zzd(obj, iZzz2 & 1048575));
                    }
                    break;
                case 17:
                    if (zzS(obj, i8)) {
                        zzurVar.zzq(i9, zzaai.zzf(obj, iZzz2 & 1048575), zzC(i8));
                    }
                    break;
                case 18:
                    zzzj.zzI(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 19:
                    zzzj.zzM(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 20:
                    zzzj.zzP(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 21:
                    zzzj.zzX(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 22:
                    zzzj.zzO(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 23:
                    zzzj.zzL(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 24:
                    zzzj.zzK(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 25:
                    zzzj.zzG(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 26:
                    zzzj.zzV(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar);
                    break;
                case 27:
                    zzzj.zzQ(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, zzC(i8));
                    break;
                case 28:
                    zzzj.zzH(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar);
                    break;
                case 29:
                    zzzj.zzW(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 30:
                    zzzj.zzJ(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 31:
                    zzzj.zzR(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 32:
                    zzzj.zzS(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 33:
                    zzzj.zzT(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 34:
                    zzzj.zzU(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, false);
                    break;
                case 35:
                    zzzj.zzI(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 36:
                    zzzj.zzM(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 37:
                    zzzj.zzP(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 38:
                    zzzj.zzX(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 39:
                    zzzj.zzO(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 40:
                    zzzj.zzL(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 41:
                    zzzj.zzK(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 42:
                    zzzj.zzG(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 43:
                    zzzj.zzW(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 44:
                    zzzj.zzJ(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 45:
                    zzzj.zzR(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 46:
                    zzzj.zzS(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 47:
                    zzzj.zzT(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 48:
                    zzzj.zzU(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, true);
                    break;
                case 49:
                    zzzj.zzN(this.zzc[i8], (List) zzaai.zzf(obj, iZzz2 & 1048575), zzurVar, zzC(i8));
                    break;
                case 50:
                    zzY(zzurVar, i9, zzaai.zzf(obj, iZzz2 & 1048575), i8);
                    break;
                case 51:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzf(i9, zzn(obj, iZzz2 & 1048575));
                    }
                    break;
                case 52:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzo(i9, zzo(obj, iZzz2 & 1048575));
                    }
                    break;
                case 53:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzt(i9, zzA(obj, iZzz2 & 1048575));
                    }
                    break;
                case 54:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzK(i9, zzA(obj, iZzz2 & 1048575));
                    }
                    break;
                case 55:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzr(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 56:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzm(i9, zzA(obj, iZzz2 & 1048575));
                    }
                    break;
                case 57:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzk(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 58:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzb(i9, zzX(obj, iZzz2 & 1048575));
                    }
                    break;
                case 59:
                    if (zzW(obj, i9, i8)) {
                        zzZ(i9, zzaai.zzf(obj, iZzz2 & 1048575), zzurVar);
                    }
                    break;
                case 60:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzv(i9, zzaai.zzf(obj, iZzz2 & 1048575), zzC(i8));
                    }
                    break;
                case 61:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzd(i9, (zzud) zzaai.zzf(obj, iZzz2 & 1048575));
                    }
                    break;
                case 62:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzI(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 63:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzi(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 64:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzx(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 65:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzz(i9, zzA(obj, iZzz2 & 1048575));
                    }
                    break;
                case 66:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzB(i9, zzq(obj, iZzz2 & 1048575));
                    }
                    break;
                case 67:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzD(i9, zzA(obj, iZzz2 & 1048575));
                    }
                    break;
                case 68:
                    if (zzW(obj, i9, i8)) {
                        zzurVar.zzq(i9, zzaai.zzf(obj, iZzz2 & 1048575), zzC(i8));
                    }
                    break;
            }
        }
        while (entry2 != null) {
            this.zzo.zzj(zzurVar, entry2);
            entry2 = itZzg2.hasNext() ? (Map.Entry) itZzg2.next() : null;
        }
        zzzy zzzyVar2 = this.zzn;
        zzzyVar2.zzs(zzzyVar2.zzd(obj), zzurVar);
    }
}
