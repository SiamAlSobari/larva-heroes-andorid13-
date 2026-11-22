package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwi extends zzakk implements zzalq {
    private static final zzwi zzb;
    private String zzd = "";
    private zzajf zze = zzajf.zzb;
    private int zzf;

    static {
        zzwi zzwiVar = new zzwi();
        zzb = zzwiVar;
        zzakk.zzH(zzwi.class, zzwiVar);
    }

    private zzwi() {
    }

    public static zzwf zza() {
        return (zzwf) zzb.zzt();
    }

    public static zzwi zzd() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzwi zzwiVar, String str) {
        str.getClass();
        zzwiVar.zzd = str;
    }

    static /* synthetic */ void zzh(zzwi zzwiVar, zzajf zzajfVar) {
        zzajfVar.getClass();
        zzwiVar.zze = zzajfVar;
    }

    public final zzwh zzb() {
        zzwh zzwhVar;
        int i = this.zzf;
        zzwh zzwhVar2 = zzwh.UNKNOWN_KEYMATERIAL;
        if (i == 0) {
            zzwhVar = zzwh.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            zzwhVar = zzwh.SYMMETRIC;
        } else if (i == 2) {
            zzwhVar = zzwh.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            zzwhVar = i != 4 ? null : zzwh.REMOTE;
        } else {
            zzwhVar = zzwh.ASYMMETRIC_PUBLIC;
        }
        return zzwhVar == null ? zzwh.UNRECOGNIZED : zzwhVar;
    }

    public final zzajf zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzwi();
        }
        zzwe zzweVar = null;
        if (i2 == 4) {
            return new zzwf(zzweVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
