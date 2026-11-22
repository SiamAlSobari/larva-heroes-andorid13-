package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsl extends zzakk implements zzalq {
    private static final zzsl zzb;
    private int zzd;
    private zzsr zze;
    private zzvi zzf;

    static {
        zzsl zzslVar = new zzsl();
        zzb = zzslVar;
        zzakk.zzH(zzsl.class, zzslVar);
    }

    private zzsl() {
    }

    public static zzsk zza() {
        return (zzsk) zzb.zzt();
    }

    public static zzsl zzc(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzsl) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    static /* synthetic */ void zzf(zzsl zzslVar, zzsr zzsrVar) {
        zzsrVar.getClass();
        zzslVar.zze = zzsrVar;
        zzslVar.zzd |= 1;
    }

    static /* synthetic */ void zzg(zzsl zzslVar, zzvi zzviVar) {
        zzviVar.getClass();
        zzslVar.zzf = zzviVar;
        zzslVar.zzd |= 2;
    }

    public final zzsr zzd() {
        zzsr zzsrVar = this.zze;
        return zzsrVar == null ? zzsr.zzd() : zzsrVar;
    }

    public final zzvi zze() {
        zzvi zzviVar = this.zzf;
        return zzviVar == null ? zzvi.zze() : zzviVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzsl();
        }
        zzsj zzsjVar = null;
        if (i2 == 4) {
            return new zzsk(zzsjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
