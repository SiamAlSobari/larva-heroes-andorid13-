package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvi extends zzakk implements zzalq {
    private static final zzvi zzb;
    private int zzd;
    private zzvl zze;
    private int zzf;
    private int zzg;

    static {
        zzvi zzviVar = new zzvi();
        zzb = zzviVar;
        zzakk.zzH(zzvi.class, zzviVar);
    }

    private zzvi() {
    }

    public static zzvh zzc() {
        return (zzvh) zzb.zzt();
    }

    public static zzvi zze() {
        return zzb;
    }

    public static zzvi zzf(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzvi) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    static /* synthetic */ void zzh(zzvi zzviVar, zzvl zzvlVar) {
        zzvlVar.getClass();
        zzviVar.zze = zzvlVar;
        zzviVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final zzvl zzg() {
        zzvl zzvlVar = this.zze;
        return zzvlVar == null ? zzvl.zze() : zzvlVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzvi();
        }
        zzvg zzvgVar = null;
        if (i2 == 4) {
            return new zzvh(zzvgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
