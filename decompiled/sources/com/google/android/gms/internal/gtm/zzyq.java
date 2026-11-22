package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyq {
    private static final zzyp zza;
    private static final zzyp zzb;

    static {
        zzyp zzypVar;
        try {
            zzypVar = (zzyp) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzypVar = null;
        }
        zza = zzypVar;
        zzb = new zzyp();
    }

    static zzyp zza() {
        return zza;
    }

    static zzyp zzb() {
        return zzb;
    }
}
