package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzkn extends zzkj {
    public static final zzkn zza = new zzkn("DHKEM_P256_HKDF_SHA256", 16);
    public static final zzkn zzb = new zzkn("DHKEM_P384_HKDF_SHA384", 17);
    public static final zzkn zzc = new zzkn("DHKEM_P521_HKDF_SHA512", 18);
    public static final zzkn zzf = new zzkn("DHKEM_X25519_HKDF_SHA256", 32);

    private zzkn(String str, int i) {
        super(str, i, null);
    }
}
