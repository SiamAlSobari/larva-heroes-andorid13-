package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzkg extends zzgo implements zzhz {
    private static final zzkg zzb;
    private int zzd;
    private zzfw zze;
    private int zzf;

    static {
        zzkg zzkgVar = new zzkg();
        zzb = zzkgVar;
        zzgo.zzC(zzkg.class, zzkgVar);
    }

    private zzkg() {
    }

    public static zzkf zzf() {
        return (zzkf) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzkg zzkgVar, zzfw zzfwVar) {
        zzfwVar.getClass();
        zzkgVar.zze = zzfwVar;
        zzkgVar.zzd |= 1;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzz(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzkg();
        }
        zzke zzkeVar = null;
        if (i2 == 4) {
            return new zzkf(zzkeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
