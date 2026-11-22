package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzuv extends zzakk implements zzalq {
    private static final zzuv zzb;
    private int zzd;
    private int zze;
    private zzajf zzf = zzajf.zzb;

    static {
        zzuv zzuvVar = new zzuv();
        zzb = zzuvVar;
        zzakk.zzH(zzuv.class, zzuvVar);
    }

    private zzuv() {
    }

    public static zzuu zza() {
        return (zzuu) zzb.zzt();
    }

    public static zzuv zzc() {
        return zzb;
    }

    public final zzux zzd() {
        zzux zzuxVar;
        int i = this.zzd;
        zzux zzuxVar2 = zzux.UNKNOWN_CURVE;
        if (i == 0) {
            zzuxVar = zzux.UNKNOWN_CURVE;
        } else if (i == 2) {
            zzuxVar = zzux.NIST_P256;
        } else if (i == 3) {
            zzuxVar = zzux.NIST_P384;
        } else if (i != 4) {
            zzuxVar = i != 5 ? null : zzux.CURVE25519;
        } else {
            zzuxVar = zzux.NIST_P521;
        }
        return zzuxVar == null ? zzux.UNRECOGNIZED : zzuxVar;
    }

    public final zzvc zze() {
        zzvc zzvcVarZzb = zzvc.zzb(this.zze);
        return zzvcVarZzb == null ? zzvc.UNRECOGNIZED : zzvcVarZzb;
    }

    public final zzajf zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzuv();
        }
        zzut zzutVar = null;
        if (i2 == 4) {
            return new zzuu(zzutVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
