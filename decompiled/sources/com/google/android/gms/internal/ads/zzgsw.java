package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsw {
    private static final zzgsv zza;
    private static final zzgsv zzb;

    static {
        zzgsv zzgsvVar;
        try {
            zzgsvVar = (zzgsv) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgsvVar = null;
        }
        zza = zzgsvVar;
        zzb = new zzgsv();
    }

    static zzgsv zza() {
        return zza;
    }

    static zzgsv zzb() {
        return zzb;
    }
}
