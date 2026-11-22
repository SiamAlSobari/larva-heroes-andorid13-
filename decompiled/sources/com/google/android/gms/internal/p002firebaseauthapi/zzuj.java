package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzuj extends zzakk implements zzalq {
    private static final zzuj zzb;
    private int zzd;
    private zzum zze;

    static {
        zzuj zzujVar = new zzuj();
        zzb = zzujVar;
        zzakk.zzH(zzuj.class, zzujVar);
    }

    private zzuj() {
    }

    public static zzui zza() {
        return (zzui) zzb.zzt();
    }

    public static zzuj zzc(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzuj) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    static /* synthetic */ void zze(zzuj zzujVar, zzum zzumVar) {
        zzumVar.getClass();
        zzujVar.zze = zzumVar;
        zzujVar.zzd |= 1;
    }

    public final zzum zzd() {
        zzum zzumVar = this.zze;
        return zzumVar == null ? zzum.zze() : zzumVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzuj();
        }
        zzuh zzuhVar = null;
        if (i2 == 4) {
            return new zzui(zzuhVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
