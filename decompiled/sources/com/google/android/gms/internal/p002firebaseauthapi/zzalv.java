package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalv {
    private static final zzalu zza;
    private static final zzalu zzb;

    static {
        zzalu zzaluVar;
        try {
            zzaluVar = (zzalu) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzaluVar = null;
        }
        zza = zzaluVar;
        zzb = new zzalu();
    }

    static zzalu zza() {
        return zza;
    }

    static zzalu zzb() {
        return zzb;
    }
}
