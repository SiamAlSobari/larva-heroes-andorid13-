package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrf {
    private static final zzgrd zza = new zzgre();
    private static final zzgrd zzb;

    static {
        zzgrd zzgrdVar;
        try {
            zzgrdVar = (zzgrd) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgrdVar = null;
        }
        zzb = zzgrdVar;
    }

    static zzgrd zza() {
        zzgrd zzgrdVar = zzb;
        if (zzgrdVar != null) {
            return zzgrdVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzgrd zzb() {
        return zza;
    }
}
