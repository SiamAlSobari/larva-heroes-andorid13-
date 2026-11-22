package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxu extends zzakk implements zzalq {
    private static final zzxu zzb;
    private int zzd;
    private zzajf zze = zzajf.zzb;

    static {
        zzxu zzxuVar = new zzxu();
        zzb = zzxuVar;
        zzakk.zzH(zzxu.class, zzxuVar);
    }

    private zzxu() {
    }

    public static zzxt zzb() {
        return (zzxt) zzb.zzt();
    }

    public static zzxu zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzxu) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzajf zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzxu();
        }
        zzxs zzxsVar = null;
        if (i2 == 4) {
            return new zzxt(zzxsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
