package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsc extends zzakk implements zzalq {
    private static final zzsc zzb;
    private int zzd;
    private int zze;
    private zzsf zzf;

    static {
        zzsc zzscVar = new zzsc();
        zzb = zzscVar;
        zzakk.zzH(zzsc.class, zzscVar);
    }

    private zzsc() {
    }

    public static zzsb zzb() {
        return (zzsb) zzb.zzt();
    }

    public static zzsc zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzsc) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    static /* synthetic */ void zzg(zzsc zzscVar, zzsf zzsfVar) {
        zzsfVar.getClass();
        zzscVar.zzf = zzsfVar;
        zzscVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzsf zze() {
        zzsf zzsfVar = this.zzf;
        return zzsfVar == null ? zzsf.zzd() : zzsfVar;
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
            return new zzsc();
        }
        zzsa zzsaVar = null;
        if (i2 == 4) {
            return new zzsb(zzsaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
