package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzamd {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzamv zzc;
    private static final zzamv zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzamv zzamvVar = null;
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
                zzamvVar = (zzamv) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzamvVar;
        zzd = new zzamx();
    }

    public static void zzA(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzu(i, list, z);
    }

    public static void zzB(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzx(i, list, z);
    }

    public static void zzC(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzz(i, list, z);
    }

    public static void zzD(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzB(i, list, z);
    }

    public static void zzE(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzD(i, list, z);
    }

    public static void zzF(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzI(i, list, z);
    }

    public static void zzG(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzK(i, list, z);
    }

    static int zza(List list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakl) {
            zzakl zzaklVar = (zzakl) list;
            iZzx = 0;
            while (i < size) {
                iZzx += zzajs.zzx(zzaklVar.zze(i));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                iZzx += zzajs.zzx(((Integer) list.get(i)).intValue());
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
        return size * (zzajs.zzA(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzajs.zzA(i << 3) + 8);
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
        if (list instanceof zzakl) {
            zzakl zzaklVar = (zzakl) list;
            iZzx = 0;
            while (i < size) {
                iZzx += zzajs.zzx(zzaklVar.zze(i));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                iZzx += zzajs.zzx(((Integer) list.get(i)).intValue());
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
        if (list instanceof zzale) {
            zzale zzaleVar = (zzale) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zzajs.zzB(zzaleVar.zze(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zzajs.zzB(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzB;
    }

    static int zzh(int i, Object obj, zzamb zzambVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzakv)) {
            return zzajs.zzA(i2) + zzajs.zzy((zzalp) obj, zzambVar);
        }
        int i3 = zzajs.zzf;
        int iZza = ((zzakv) obj).zza();
        return zzajs.zzA(i2) + zzajs.zzA(iZza) + iZza;
    }

    static int zzi(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakl) {
            zzakl zzaklVar = (zzakl) list;
            iZzA = 0;
            while (i < size) {
                int iZze = zzaklVar.zze(i);
                iZzA += zzajs.zzA((iZze >> 31) ^ (iZze + iZze));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzA += zzajs.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
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
        if (list instanceof zzale) {
            zzale zzaleVar = (zzale) list;
            iZzB = 0;
            while (i < size) {
                long jZze = zzaleVar.zze(i);
                iZzB += zzajs.zzB((jZze >> 63) ^ (jZze + jZze));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzB += zzajs.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
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
        if (list instanceof zzakl) {
            zzakl zzaklVar = (zzakl) list;
            iZzA = 0;
            while (i < size) {
                iZzA += zzajs.zzA(zzaklVar.zze(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += zzajs.zzA(((Integer) list.get(i)).intValue());
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
        if (list instanceof zzale) {
            zzale zzaleVar = (zzale) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zzajs.zzB(zzaleVar.zze(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zzajs.zzB(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzB;
    }

    public static zzamv zzm() {
        return zzc;
    }

    public static zzamv zzn() {
        return zzd;
    }

    static Object zzo(Object obj, int i, List list, zzako zzakoVar, Object obj2, zzamv zzamvVar) {
        if (zzakoVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (zzakoVar.zza()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj2 = zzp(obj, i, iIntValue, obj2, zzamvVar);
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
                if (!zzakoVar.zza()) {
                    obj2 = zzp(obj, i, iIntValue2, obj2, zzamvVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzp(Object obj, int i, int i2, Object obj2, zzamv zzamvVar) {
        if (obj2 == null) {
            obj2 = zzamvVar.zzc(obj);
        }
        zzamvVar.zzl(obj2, i, i2);
        return obj2;
    }

    static void zzq(zzamv zzamvVar, Object obj, Object obj2) {
        zzamvVar.zzo(obj, zzamvVar.zze(zzamvVar.zzd(obj), zzamvVar.zzd(obj2)));
    }

    public static void zzr(Class cls) {
        Class cls2;
        if (!zzakk.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzs(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzt(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzc(i, list, z);
    }

    public static void zzu(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzg(i, list, z);
    }

    public static void zzv(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzj(i, list, z);
    }

    public static void zzw(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzl(i, list, z);
    }

    public static void zzx(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzn(i, list, z);
    }

    public static void zzy(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzp(i, list, z);
    }

    public static void zzz(int i, List list, zzajt zzajtVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzajtVar.zzs(i, list, z);
    }
}
