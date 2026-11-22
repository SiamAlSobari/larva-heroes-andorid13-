package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxc implements zzys {
    private static final zzxc zza = new zzxc();

    private zzxc() {
    }

    public static zzxc zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzys
    public final zzyr zzb(Class cls) {
        if (!zzxj.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (zzyr) zzxj.zzac(cls.asSubclass(zzxj.class)).zzb(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzys
    public final boolean zzc(Class cls) {
        return zzxj.class.isAssignableFrom(cls);
    }
}
