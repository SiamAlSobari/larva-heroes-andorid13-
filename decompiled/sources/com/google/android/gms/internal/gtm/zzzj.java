package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzzj {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzzy zzc;
    private static final zzzy zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzzy zzzyVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzzyVar = (zzzy) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzzyVar;
        zzd = new zzaaa();
    }

    static Object zzA(Object obj, int i, List list, zzxn zzxnVar, Object obj2, zzzy zzzyVar) {
        if (zzxnVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (zzxnVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj2 = zzB(obj, i, iIntValue, obj2, zzzyVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzxnVar.zza(iIntValue2)) {
                    obj2 = zzB(obj, i, iIntValue2, obj2, zzzyVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzB(Object obj, int i, int i2, Object obj2, zzzy zzzyVar) {
        if (obj2 == null) {
            obj2 = zzzyVar.zzc(obj);
        }
        zzzyVar.zzl(obj2, i, i2);
        return obj2;
    }

    static void zzC(zzwu zzwuVar, Object obj, Object obj2) {
        zzwy zzwyVarZzb = zzwuVar.zzb(obj2);
        if (zzwyVarZzb.zza.isEmpty()) {
            return;
        }
        zzwuVar.zzc(obj).zzj(zzwyVarZzb);
    }

    static void zzD(zzzy zzzyVar, Object obj, Object obj2) {
        zzzyVar.zzo(obj, zzzyVar.zze(zzzyVar.zzd(obj), zzzyVar.zzd(obj2)));
    }

    public static void zzE(Class cls) {
        Class cls2;
        if (!zzxj.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzG(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzc(i, list, z);
    }

    public static void zzH(int i, List list, zzur zzurVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zze(i, list);
    }

    public static void zzI(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzg(i, list, z);
    }

    public static void zzJ(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzj(i, list, z);
    }

    public static void zzK(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzl(i, list, z);
    }

    public static void zzL(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzn(i, list, z);
    }

    public static void zzM(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzp(i, list, z);
    }

    public static void zzN(int i, List list, zzur zzurVar, zzzh zzzhVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzurVar.zzq(i, list.get(i2), zzzhVar);
        }
    }

    public static void zzO(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzs(i, list, z);
    }

    public static void zzP(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzu(i, list, z);
    }

    public static void zzQ(int i, List list, zzur zzurVar, zzzh zzzhVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzurVar.zzv(i, list.get(i2), zzzhVar);
        }
    }

    public static void zzR(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzy(i, list, z);
    }

    public static void zzS(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzA(i, list, z);
    }

    public static void zzT(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzC(i, list, z);
    }

    public static void zzU(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzE(i, list, z);
    }

    public static void zzV(int i, List list, zzur zzurVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzH(i, list);
    }

    public static void zzW(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzJ(i, list, z);
    }

    public static void zzX(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzurVar.zzL(i, list, z);
    }

    static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzuq.zzD(i << 3) + 1);
    }

    static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzD = size * zzuq.zzD(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iZzd = ((zzud) list.get(i2)).zzd();
            iZzD += zzuq.zzD(iZzd) + iZzd;
        }
        return iZzD;
    }

    static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzuq.zzD(i << 3));
    }

    static int zzd(List list) {
        int iZzz;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxk) {
            zzxk zzxkVar = (zzxk) list;
            iZzz = 0;
            while (i < size) {
                iZzz += zzuq.zzz(zzxkVar.zze(i));
                i++;
            }
        } else {
            iZzz = 0;
            while (i < size) {
                iZzz += zzuq.zzz(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzz;
    }

    static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzuq.zzD(i << 3) + 4);
    }

    static int zzf(List list) {
        return list.size() * 4;
    }

    static int zzg(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzuq.zzD(i << 3) + 8);
    }

    static int zzh(List list) {
        return list.size() * 8;
    }

    static int zzi(int i, List list, zzzh zzzhVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzy = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iZzy += zzuq.zzy(i, (zzyu) list.get(i2), zzzhVar);
        }
        return iZzy;
    }

    static int zzj(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzuq.zzD(i << 3));
    }

    static int zzk(List list) {
        int iZzz;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxk) {
            zzxk zzxkVar = (zzxk) list;
            iZzz = 0;
            while (i < size) {
                iZzz += zzuq.zzz(zzxkVar.zze(i));
                i++;
            }
        } else {
            iZzz = 0;
            while (i < size) {
                iZzz += zzuq.zzz(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzz;
    }

    static int zzl(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzm(list) + (list.size() * zzuq.zzD(i << 3));
    }

    static int zzm(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzyj) {
            zzyj zzyjVar = (zzyj) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzuq.zzE(zzyjVar.zze(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzuq.zzE(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzE;
    }

    static int zzn(int i, Object obj, zzzh zzzhVar) {
        if (!(obj instanceof zzya)) {
            return zzuq.zzD(i << 3) + zzuq.zzB((zzyu) obj, zzzhVar);
        }
        int i2 = zzuq.zzf;
        int iZza = ((zzya) obj).zza();
        return zzuq.zzD(i << 3) + zzuq.zzD(iZza) + iZza;
    }

    static int zzo(int i, List list, zzzh zzzhVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzD = zzuq.zzD(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzya) {
                int iZza = ((zzya) obj).zza();
                iZzD += zzuq.zzD(iZza) + iZza;
            } else {
                iZzD += zzuq.zzB((zzyu) obj, zzzhVar);
            }
        }
        return iZzD;
    }

    static int zzp(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzq(list) + (size * zzuq.zzD(i << 3));
    }

    static int zzq(List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxk) {
            zzxk zzxkVar = (zzxk) list;
            iZzD = 0;
            while (i < size) {
                int iZze = zzxkVar.zze(i);
                iZzD += zzuq.zzD((iZze >> 31) ^ (iZze + iZze));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzD += zzuq.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzD;
    }

    static int zzr(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzs(list) + (size * zzuq.zzD(i << 3));
    }

    static int zzs(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzyj) {
            zzyj zzyjVar = (zzyj) list;
            iZzE = 0;
            while (i < size) {
                long jZze = zzyjVar.zze(i);
                iZzE += zzuq.zzE((jZze >> 63) ^ (jZze + jZze));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzE += zzuq.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzE;
    }

    static int zzt(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z = list instanceof zzyc;
        int iZzD = zzuq.zzD(i << 3) * size;
        if (z) {
            zzyc zzycVar = (zzyc) list;
            while (i2 < size) {
                Object objZzf = zzycVar.zzf(i2);
                if (objZzf instanceof zzud) {
                    int iZzd = ((zzud) objZzf).zzd();
                    iZzD += zzuq.zzD(iZzd) + iZzd;
                } else {
                    iZzD += zzuq.zzC((String) objZzf);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzud) {
                    int iZzd2 = ((zzud) obj).zzd();
                    iZzD += zzuq.zzD(iZzd2) + iZzd2;
                } else {
                    iZzD += zzuq.zzC((String) obj);
                }
                i2++;
            }
        }
        return iZzD;
    }

    static int zzu(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzuq.zzD(i << 3));
    }

    static int zzv(List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxk) {
            zzxk zzxkVar = (zzxk) list;
            iZzD = 0;
            while (i < size) {
                iZzD += zzuq.zzD(zzxkVar.zze(i));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                iZzD += zzuq.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzD;
    }

    static int zzw(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzuq.zzD(i << 3));
    }

    static int zzx(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzyj) {
            zzyj zzyjVar = (zzyj) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzuq.zzE(zzyjVar.zze(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzuq.zzE(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzE;
    }

    public static zzzy zzy() {
        return zzc;
    }

    public static zzzy zzz() {
        return zzd;
    }
}
