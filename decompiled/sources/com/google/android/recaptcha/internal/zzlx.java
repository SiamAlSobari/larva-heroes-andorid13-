package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlx extends zzgo implements zzhz {
    private static final zzlx zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzlx zzlxVar = new zzlx();
        zzb = zzlxVar;
        zzgo.zzC(zzlx.class, zzlxVar);
    }

    private zzlx() {
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzz(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzlx();
        }
        zzlv zzlvVar = null;
        if (i2 == 4) {
            return new zzlw(zzlvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
