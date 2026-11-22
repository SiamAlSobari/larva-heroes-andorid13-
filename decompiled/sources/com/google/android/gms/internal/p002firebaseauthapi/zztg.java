package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztg extends zzakk implements zzalq {
    private static final zztg zzb;
    private int zzd;
    private zzajf zze = zzajf.zzb;

    static {
        zztg zztgVar = new zztg();
        zzb = zztgVar;
        zzakk.zzH(zztg.class, zztgVar);
    }

    private zztg() {
    }

    public static zztf zzb() {
        return (zztf) zzb.zzt();
    }

    public static zztg zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zztg) zzakk.zzx(zzb, zzajfVar, zzajxVar);
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
            return new zztg();
        }
        zzte zzteVar = null;
        if (i2 == 4) {
            return new zztf(zzteVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
