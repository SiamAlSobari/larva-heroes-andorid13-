package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzwq extends zzakk implements zzalq {
    private static final zzwq zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        zzwq zzwqVar = new zzwq();
        zzb = zzwqVar;
        zzakk.zzH(zzwq.class, zzwqVar);
    }

    private zzwq() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzwq();
        }
        zzwo zzwoVar = null;
        if (i2 == 4) {
            return new zzwp(zzwoVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
