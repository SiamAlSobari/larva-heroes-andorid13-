package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzub extends zzakk implements zzalq {
    private static final zzub zzb;

    static {
        zzub zzubVar = new zzub();
        zzb = zzubVar;
        zzakk.zzH(zzub.class, zzubVar);
    }

    private zzub() {
    }

    public static zzub zzb() {
        return zzb;
    }

    public static zzub zzc(zzajf zzajfVar, zzajx zzajxVar) throws zzaks {
        return (zzub) zzakk.zzx(zzb, zzajfVar, zzajxVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        zztz zztzVar = null;
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new zzub();
        }
        if (i2 == 4) {
            return new zzua(zztzVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
