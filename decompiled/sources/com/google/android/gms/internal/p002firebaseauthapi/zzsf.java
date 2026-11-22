package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsf extends zzakk implements zzalq {
    private static final zzsf zzb;
    private int zzd;

    static {
        zzsf zzsfVar = new zzsf();
        zzb = zzsfVar;
        zzakk.zzH(zzsf.class, zzsfVar);
    }

    private zzsf() {
    }

    public static zzse zzb() {
        return (zzse) zzb.zzt();
    }

    public static zzsf zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzsf();
        }
        zzsd zzsdVar = null;
        if (i2 == 4) {
            return new zzse(zzsdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
