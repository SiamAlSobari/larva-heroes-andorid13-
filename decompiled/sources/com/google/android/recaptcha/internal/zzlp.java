package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlp extends zzgo implements zzhz {
    private static final zzlp zzb;
    private zzgv zzd = zzgo.zzw();

    static {
        zzlp zzlpVar = new zzlp();
        zzb = zzlpVar;
        zzgo.zzC(zzlp.class, zzlpVar);
    }

    private zzlp() {
    }

    public static zzlp zzg() {
        return zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzlp();
        }
        zzln zzlnVar = null;
        if (i2 == 4) {
            return new zzlo(zzlnVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzi() {
        return this.zzd;
    }
}
