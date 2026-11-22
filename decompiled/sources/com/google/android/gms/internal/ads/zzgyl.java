package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgyl {
    public static zzgyl zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzgyg(cls.getSimpleName()) : new zzgyi(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
