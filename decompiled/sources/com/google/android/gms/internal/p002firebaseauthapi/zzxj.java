package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxj extends zzakk implements zzalq {
    private static final zzxj zzb;
    private int zzd;
    private int zze;
    private zzxm zzf;

    static {
        zzxj zzxjVar = new zzxj();
        zzb = zzxjVar;
        zzakk.zzH(zzxj.class, zzxjVar);
    }

    private zzxj() {
    }

    public static zzxi zzb() {
        return (zzxi) zzb.zzt();
    }

    public static zzxj zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzxj) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    static /* synthetic */ void zzg(zzxj zzxjVar, zzxm zzxmVar) {
        zzxmVar.getClass();
        zzxjVar.zzf = zzxmVar;
        zzxjVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzxm zze() {
        zzxm zzxmVar = this.zzf;
        return zzxmVar == null ? zzxm.zzd() : zzxmVar;
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
            return new zzxj();
        }
        zzxh zzxhVar = null;
        if (i2 == 4) {
            return new zzxi(zzxhVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
