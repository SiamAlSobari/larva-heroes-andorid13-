package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzmp extends zzgo implements zzhz {
    private static final zzmp zzb;
    private String zzd = "";
    private zzgt zze = zzv();

    static {
        zzmp zzmpVar = new zzmp();
        zzb = zzmpVar;
        zzgo.zzC(zzmp.class, zzmpVar);
    }

    private zzmp() {
    }

    public static zzmp zzg(byte[] bArr) throws zzgy {
        return (zzmp) zzgo.zzu(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002'", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzmp();
        }
        zzlv zzlvVar = null;
        if (i2 == 4) {
            return new zzmo(zzlvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final List zzj() {
        return this.zze;
    }
}
