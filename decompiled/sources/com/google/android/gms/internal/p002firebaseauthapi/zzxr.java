package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzxr extends zzakk implements zzalq {
    private static final zzxr zzb;
    private String zzd = "";
    private zzakp zze = zzA();

    static {
        zzxr zzxrVar = new zzxr();
        zzb = zzxrVar;
        zzakk.zzH(zzxr.class, zzxrVar);
    }

    private zzxr() {
    }

    public static zzxr zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzwq.class});
        }
        if (i2 == 3) {
            return new zzxr();
        }
        zzxp zzxpVar = null;
        if (i2 == 4) {
            return new zzxq(zzxpVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
