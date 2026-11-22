package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxm extends zzakk implements zzalq {
    private static final zzxm zzb;
    private int zzd;
    private String zze = "";
    private zzwn zzf;

    static {
        zzxm zzxmVar = new zzxm();
        zzb = zzxmVar;
        zzakk.zzH(zzxm.class, zzxmVar);
    }

    private zzxm() {
    }

    public static zzxl zzb() {
        return (zzxl) zzb.zzt();
    }

    public static zzxm zzd() {
        return zzb;
    }

    public static zzxm zze(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzxm) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    static /* synthetic */ void zzg(zzxm zzxmVar, String str) {
        str.getClass();
        zzxmVar.zze = str;
    }

    static /* synthetic */ void zzh(zzxm zzxmVar, zzwn zzwnVar) {
        zzwnVar.getClass();
        zzxmVar.zzf = zzwnVar;
        zzxmVar.zzd |= 1;
    }

    public final zzwn zza() {
        zzwn zzwnVar = this.zzf;
        return zzwnVar == null ? zzwn.zzc() : zzwnVar;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzxm();
        }
        zzxk zzxkVar = null;
        if (i2 == 4) {
            return new zzxl(zzxkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
