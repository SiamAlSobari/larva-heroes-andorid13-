package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlz extends zzgo implements zzhz {
    private static final zzlz zzb;
    private String zzd = "";
    private String zze = "";
    private int zzf;
    private int zzg;

    static {
        zzlz zzlzVar = new zzlz();
        zzb = zzlzVar;
        zzgo.zzC(zzlz.class, zzlzVar);
    }

    private zzlz() {
    }

    public static zzlz zzg(byte[] bArr) throws zzgy {
        return (zzlz) zzgo.zzu(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzz(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzlz();
        }
        zzlv zzlvVar = null;
        if (i2 == 4) {
            return new zzly(zzlvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzmf zzi() {
        zzmf zzmfVarZzb = zzmf.zzb(this.zzf);
        return zzmfVarZzb == null ? zzmf.UNRECOGNIZED : zzmfVarZzb;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zze;
    }
}
