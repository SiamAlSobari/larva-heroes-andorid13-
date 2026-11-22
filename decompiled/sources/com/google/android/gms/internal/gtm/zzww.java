package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzww {
    private static final zzwu zza = new zzwv();
    private static final zzwu zzb;

    static {
        zzwu zzwuVar;
        try {
            zzwuVar = (zzwu) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzwuVar = null;
        }
        zzb = zzwuVar;
    }

    static zzwu zza() {
        zzwu zzwuVar = zzb;
        if (zzwuVar != null) {
            return zzwuVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzwu zzb() {
        return zza;
    }
}
