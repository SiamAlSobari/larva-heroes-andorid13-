package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzzb {
    private static final zzza zza;
    private static final zzza zzb;

    static {
        zzza zzzaVar;
        try {
            zzzaVar = (zzza) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzzaVar = null;
        }
        zza = zzzaVar;
        zzb = new zzza();
    }

    static zzza zza() {
        return zza;
    }

    static zzza zzb() {
        return zzb;
    }
}
