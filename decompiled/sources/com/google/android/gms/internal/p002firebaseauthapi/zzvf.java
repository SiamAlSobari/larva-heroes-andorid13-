package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvf extends zzakk implements zzalq {
    private static final zzvf zzb;
    private int zzd;
    private int zze;
    private zzvl zzf;
    private zzajf zzg = zzajf.zzb;

    static {
        zzvf zzvfVar = new zzvf();
        zzb = zzvfVar;
        zzakk.zzH(zzvf.class, zzvfVar);
    }

    private zzvf() {
    }

    public static zzve zzb() {
        return (zzve) zzb.zzt();
    }

    public static zzvf zzd() {
        return zzb;
    }

    public static zzvf zze(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzvf) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    static /* synthetic */ void zzi(zzvf zzvfVar, zzvl zzvlVar) {
        zzvlVar.getClass();
        zzvfVar.zzf = zzvlVar;
        zzvfVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzvl zzf() {
        zzvl zzvlVar = this.zzf;
        return zzvlVar == null ? zzvl.zze() : zzvlVar;
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
            return new zzvf();
        }
        zzvd zzvdVar = null;
        if (i2 == 4) {
            return new zzve(zzvdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
