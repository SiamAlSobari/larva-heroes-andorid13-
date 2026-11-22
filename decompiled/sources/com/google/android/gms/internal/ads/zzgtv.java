package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzguk zzc;
    private static final zzguk zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzguk zzgukVar = null;
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
                zzgukVar = (zzguk) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzgukVar;
        zzd = new zzgum();
    }

    public static void zzA(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzu(i, list, z);
    }

    public static void zzB(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzx(i, list, z);
    }

    public static void zzC(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzz(i, list, z);
    }

    public static void zzD(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzB(i, list, z);
    }

    public static void zzE(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzD(i, list, z);
    }

    public static void zzF(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzI(i, list, z);
    }

    public static void zzG(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzK(i, list, z);
    }

    static int zza(List list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            iZzx = 0;
            while (i < size) {
                iZzx += zzgqx.zzx(zzgrrVar.zze(i));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                iZzx += zzgqx.zzx(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzx;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgqx.zzA(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgqx.zzA(i << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            iZzx = 0;
            while (i < size) {
                iZzx += zzgqx.zzx(zzgrrVar.zze(i));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                iZzx += zzgqx.zzx(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzx;
    }

    static int zzg(List list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsp) {
            zzgsp zzgspVar = (zzgsp) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zzgqx.zzB(zzgspVar.zze(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zzgqx.zzB(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzB;
    }

    static int zzh(int i, Object obj, zzgtt zzgttVar) {
        if (!(obj instanceof zzgsg)) {
            return zzgqx.zzA(i << 3) + zzgqx.zzy((zzgta) obj, zzgttVar);
        }
        int i2 = zzgqx.zzf;
        int iZza = ((zzgsg) obj).zza();
        return zzgqx.zzA(i << 3) + zzgqx.zzA(iZza) + iZza;
    }

    static int zzi(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            iZzA = 0;
            while (i < size) {
                int iZze = zzgrrVar.zze(i);
                iZzA += zzgqx.zzA((iZze >> 31) ^ (iZze + iZze));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzA += zzgqx.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzA;
    }

    static int zzj(List list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsp) {
            zzgsp zzgspVar = (zzgsp) list;
            iZzB = 0;
            while (i < size) {
                long jZze = zzgspVar.zze(i);
                iZzB += zzgqx.zzB((jZze >> 63) ^ (jZze + jZze));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzB += zzgqx.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzB;
    }

    static int zzk(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrr) {
            zzgrr zzgrrVar = (zzgrr) list;
            iZzA = 0;
            while (i < size) {
                iZzA += zzgqx.zzA(zzgrrVar.zze(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += zzgqx.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzA;
    }

    static int zzl(List list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsp) {
            zzgsp zzgspVar = (zzgsp) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zzgqx.zzB(zzgspVar.zze(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zzgqx.zzB(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzB;
    }

    public static zzguk zzm() {
        return zzc;
    }

    public static zzguk zzn() {
        return zzd;
    }

    static Object zzo(Object obj, int i, List list, zzgru zzgruVar, Object obj2, zzguk zzgukVar) {
        if (zzgruVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (zzgruVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj2 = zzp(obj, i, iIntValue, obj2, zzgukVar);
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
                if (!zzgruVar.zza(iIntValue2)) {
                    obj2 = zzp(obj, i, iIntValue2, obj2, zzgukVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzp(Object obj, int i, int i2, Object obj2, zzguk zzgukVar) {
        if (obj2 == null) {
            obj2 = zzgukVar.zzc(obj);
        }
        zzgukVar.zzl(obj2, i, i2);
        return obj2;
    }

    static void zzq(zzguk zzgukVar, Object obj, Object obj2) {
        zzgukVar.zzo(obj, zzgukVar.zze(zzgukVar.zzd(obj), zzgukVar.zzd(obj2)));
    }

    public static void zzr(Class cls) {
        Class cls2;
        if (!zzgrq.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzs(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzt(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzc(i, list, z);
    }

    public static void zzu(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzg(i, list, z);
    }

    public static void zzv(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzj(i, list, z);
    }

    public static void zzw(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzl(i, list, z);
    }

    public static void zzx(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzn(i, list, z);
    }

    public static void zzy(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzp(i, list, z);
    }

    public static void zzz(int i, List list, zzgqy zzgqyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqyVar.zzs(i, list, z);
    }
}
