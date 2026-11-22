package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzamt extends zzakk implements zzalq {
    private static final zzamt zzb;
    private long zzd;
    private int zze;

    static {
        zzamt zzamtVar = new zzamt();
        zzb = zzamtVar;
        zzakk.zzH(zzamt.class, zzamtVar);
    }

    private zzamt() {
    }

    public static zzams zzc() {
        return (zzams) zzb.zzt();
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzalz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzamt();
        }
        zzamr zzamrVar = null;
        if (i2 == 4) {
            return new zzams(zzamrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
