package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvl extends zzakk implements zzalq {
    private static final zzvl zzb;
    private int zzd;
    private int zze;

    static {
        zzvl zzvlVar = new zzvl();
        zzb = zzvlVar;
        zzakk.zzH(zzvl.class, zzvlVar);
    }

    private zzvl() {
    }

    public static zzvk zzc() {
        return (zzvk) zzb.zzt();
    }

    public static zzvl zze() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzvc zzb() {
        zzvc zzvcVarZzb = zzvc.zzb(this.zzd);
        return zzvcVarZzb == null ? zzvc.UNRECOGNIZED : zzvcVarZzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzvl();
        }
        zzvj zzvjVar = null;
        if (i2 == 4) {
            return new zzvk(zzvjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
