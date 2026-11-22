package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxd extends zzakk implements zzalq {
    private static final zzxd zzb;
    private int zzd;
    private int zze;
    private zzxg zzf;

    static {
        zzxd zzxdVar = new zzxd();
        zzb = zzxdVar;
        zzakk.zzH(zzxd.class, zzxdVar);
    }

    private zzxd() {
    }

    public static zzxc zzb() {
        return (zzxc) zzb.zzt();
    }

    public static zzxd zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzxd) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    static /* synthetic */ void zzg(zzxd zzxdVar, zzxg zzxgVar) {
        zzxgVar.getClass();
        zzxdVar.zzf = zzxgVar;
        zzxdVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzxg zze() {
        zzxg zzxgVar = this.zzf;
        return zzxgVar == null ? zzxg.zzc() : zzxgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzxd();
        }
        zzxb zzxbVar = null;
        if (i2 == 4) {
            return new zzxc(zzxbVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
