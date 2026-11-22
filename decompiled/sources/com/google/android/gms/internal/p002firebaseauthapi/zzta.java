package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzta extends zzakk implements zzalq {
    private static final zzta zzb;
    private int zzd;
    private zztd zze;
    private int zzf;

    static {
        zzta zztaVar = new zzta();
        zzb = zztaVar;
        zzakk.zzH(zzta.class, zztaVar);
    }

    private zzta() {
    }

    public static zzsz zzb() {
        return (zzsz) zzb.zzt();
    }

    public static zzta zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzta) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    static /* synthetic */ void zzf(zzta zztaVar, zztd zztdVar) {
        zztdVar.getClass();
        zztaVar.zze = zztdVar;
        zztaVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztd zze() {
        zztd zztdVar = this.zze;
        return zztdVar == null ? zztd.zzd() : zztdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzta();
        }
        zzsy zzsyVar = null;
        if (i2 == 4) {
            return new zzsz(zzsyVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
