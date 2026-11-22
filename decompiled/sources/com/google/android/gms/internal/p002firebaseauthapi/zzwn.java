package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwn extends zzakk implements zzalq {
    private static final zzwn zzb;
    private String zzd = "";
    private zzajf zze = zzajf.zzb;
    private int zzf;

    static {
        zzwn zzwnVar = new zzwn();
        zzb = zzwnVar;
        zzakk.zzH(zzwn.class, zzwnVar);
    }

    private zzwn() {
    }

    public static zzwm zza() {
        return (zzwm) zzb.zzt();
    }

    public static zzwn zzc() {
        return zzb;
    }

    public static zzwn zzd(byte[] bArr, zzajx zzajxVar) throws zzaks {
        return (zzwn) zzakk.zzz(zzb, bArr, zzajxVar);
    }

    static /* synthetic */ void zzh(zzwn zzwnVar, String str) {
        str.getClass();
        zzwnVar.zzd = str;
    }

    static /* synthetic */ void zzi(zzwn zzwnVar, zzajf zzajfVar) {
        zzajfVar.getClass();
        zzwnVar.zze = zzajfVar;
    }

    public final zzxo zze() {
        zzxo zzxoVarZzb = zzxo.zzb(this.zzf);
        return zzxoVarZzb == null ? zzxo.UNRECOGNIZED : zzxoVarZzb;
    }

    public final zzajf zzf() {
        return this.zze;
    }

    public final String zzg() {
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
            return new zzwn();
        }
        zzwl zzwlVar = null;
        if (i2 == 4) {
            return new zzwm(zzwlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
