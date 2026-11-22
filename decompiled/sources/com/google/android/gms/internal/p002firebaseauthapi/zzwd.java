package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwd extends zzakk implements zzalq {
    private static final zzwd zzb;
    private int zzd;
    private int zze;
    private zzvx zzf;
    private zzajf zzg = zzajf.zzb;

    static {
        zzwd zzwdVar = new zzwd();
        zzb = zzwdVar;
        zzakk.zzH(zzwd.class, zzwdVar);
    }

    private zzwd() {
    }

    public static zzwc zzc() {
        return (zzwc) zzb.zzt();
    }

    public static zzwd zze() {
        return zzb;
    }

    public static zzwd zzf(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzwd) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    static /* synthetic */ void zzi(zzwd zzwdVar, zzvx zzvxVar) {
        zzvxVar.getClass();
        zzwdVar.zzf = zzvxVar;
        zzwdVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzvx zzb() {
        zzvx zzvxVar = this.zzf;
        return zzvxVar == null ? zzvx.zzf() : zzvxVar;
    }

    public final zzajf zzg() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzwd();
        }
        zzwb zzwbVar = null;
        if (i2 == 4) {
            return new zzwc(zzwbVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzl() {
        return (this.zzd & 1) != 0;
    }
}
