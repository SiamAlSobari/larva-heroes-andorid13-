package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzall {
    private static final zzalk zza;
    private static final zzalk zzb;

    static {
        zzalk zzalkVar;
        try {
            zzalkVar = (zzalk) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzalkVar = null;
        }
        zza = zzalkVar;
        zzb = new zzalk();
    }

    static zzalk zza() {
        return zza;
    }

    static zzalk zzb() {
        return zzb;
    }
}
