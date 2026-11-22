package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzgnz extends zzgrq implements zzgtb {
    private static final zzgnz zzb;
    private String zzd = "";
    private zzgrz zze = zzaN();

    static {
        zzgnz zzgnzVar = new zzgnz();
        zzb = zzgnzVar;
        zzgrq.zzaU(zzgnz.class, zzgnzVar);
    }

    private zzgnz() {
    }

    public static zzgnz zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgmy.class});
        }
        if (i2 == 3) {
            return new zzgnz();
        }
        zzgnx zzgnxVar = null;
        if (i2 == 4) {
            return new zzgny(zzgnxVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
