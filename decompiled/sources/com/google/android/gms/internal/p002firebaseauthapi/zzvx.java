package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvx extends zzakk implements zzalq {
    private static final zzvx zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzvx zzvxVar = new zzvx();
        zzb = zzvxVar;
        zzakk.zzH(zzvx.class, zzvxVar);
    }

    private zzvx() {
    }

    public static zzvw zzd() {
        return (zzvw) zzb.zzt();
    }

    public static zzvx zzf() {
        return zzb;
    }

    public final zzvn zza() {
        zzvn zzvnVar;
        int i = this.zzf;
        zzvn zzvnVar2 = zzvn.AEAD_UNKNOWN;
        if (i == 0) {
            zzvnVar = zzvn.AEAD_UNKNOWN;
        } else if (i == 1) {
            zzvnVar = zzvn.AES_128_GCM;
        } else if (i != 2) {
            zzvnVar = i != 3 ? null : zzvn.CHACHA20_POLY1305;
        } else {
            zzvnVar = zzvn.AES_256_GCM;
        }
        return zzvnVar == null ? zzvn.UNRECOGNIZED : zzvnVar;
    }

    public final zzvp zzb() {
        zzvp zzvpVar;
        int i = this.zze;
        zzvp zzvpVar2 = zzvp.KDF_UNKNOWN;
        if (i == 0) {
            zzvpVar = zzvp.KDF_UNKNOWN;
        } else if (i == 1) {
            zzvpVar = zzvp.HKDF_SHA256;
        } else if (i != 2) {
            zzvpVar = i != 3 ? null : zzvp.HKDF_SHA512;
        } else {
            zzvpVar = zzvp.HKDF_SHA384;
        }
        return zzvpVar == null ? zzvp.UNRECOGNIZED : zzvpVar;
    }

    public final zzvr zzc() {
        zzvr zzvrVar;
        int i = this.zzd;
        zzvr zzvrVar2 = zzvr.KEM_UNKNOWN;
        if (i == 0) {
            zzvrVar = zzvr.KEM_UNKNOWN;
        } else if (i == 1) {
            zzvrVar = zzvr.DHKEM_X25519_HKDF_SHA256;
        } else if (i == 2) {
            zzvrVar = zzvr.DHKEM_P256_HKDF_SHA256;
        } else if (i != 3) {
            zzvrVar = i != 4 ? null : zzvr.DHKEM_P521_HKDF_SHA512;
        } else {
            zzvrVar = zzvr.DHKEM_P384_HKDF_SHA384;
        }
        return zzvrVar == null ? zzvr.UNRECOGNIZED : zzvrVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzvx();
        }
        zzvv zzvvVar = null;
        if (i2 == 4) {
            return new zzvw(zzvvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
