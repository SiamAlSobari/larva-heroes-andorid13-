package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhu {
    private static final zzht zza;
    private static final zzht zzb;

    static {
        zzht zzhtVar;
        try {
            zzhtVar = (zzht) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzhtVar = null;
        }
        zza = zzhtVar;
        zzb = new zzht();
    }

    static zzht zza() {
        return zza;
    }

    static zzht zzb() {
        return zzb;
    }
}
