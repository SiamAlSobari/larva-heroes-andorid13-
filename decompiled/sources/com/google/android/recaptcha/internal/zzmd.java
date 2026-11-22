package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzmd extends zzgo implements zzhz {
    private static final zzmd zzb;
    private int zzd;

    static {
        zzmd zzmdVar = new zzmd();
        zzb = zzmdVar;
        zzgo.zzC(zzmd.class, zzmdVar);
    }

    private zzmd() {
    }

    public static zzmd zzg(byte[] bArr) throws zzgy {
        return (zzmd) zzgo.zzu(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzmd();
        }
        zzlv zzlvVar = null;
        if (i2 == 4) {
            return new zzmc(zzlvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzmf zzi() {
        zzmf zzmfVarZzb = zzmf.zzb(this.zzd);
        return zzmfVarZzb == null ? zzmf.UNRECOGNIZED : zzmfVarZzb;
    }
}
