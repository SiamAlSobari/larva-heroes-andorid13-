package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyx {
    private static Constructor zza;
    private static Method zzb;
    private static Method zzc;

    public static zzae zza(float f) throws Exception {
        if (zza == null || zzb == null || zzc == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            zza = cls.getConstructor(new Class[0]);
            zzb = cls.getMethod("setRotationDegrees", Float.TYPE);
            zzc = cls.getMethod("build", new Class[0]);
        }
        Object objNewInstance = zza.newInstance(new Object[0]);
        zzb.invoke(objNewInstance, Float.valueOf(f));
        Object objInvoke = zzc.invoke(objNewInstance, new Object[0]);
        objInvoke.getClass();
        return (zzae) objInvoke;
    }
}
