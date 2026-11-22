package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxg extends zzakk implements zzalq {
    private static final zzxg zzb;
    private String zzd = "";

    static {
        zzxg zzxgVar = new zzxg();
        zzb = zzxgVar;
        zzakk.zzH(zzxg.class, zzxgVar);
    }

    private zzxg() {
    }

    public static zzxf zza() {
        return (zzxf) zzb.zzt();
    }

    public static zzxg zzc() {
        return zzb;
    }

    public static zzxg zzd(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzxg) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    static /* synthetic */ void zzf(zzxg zzxgVar, String str) {
        str.getClass();
        zzxgVar.zzd = str;
    }

    public final String zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzxg();
        }
        zzxe zzxeVar = null;
        if (i2 == 4) {
            return new zzxf(zzxeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
