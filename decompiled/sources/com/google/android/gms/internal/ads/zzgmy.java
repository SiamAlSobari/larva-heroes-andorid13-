package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzgmy extends zzgrq implements zzgtb {
    private static final zzgmy zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        zzgmy zzgmyVar = new zzgmy();
        zzb = zzgmyVar;
        zzgrq.zzaU(zzgmy.class, zzgmyVar);
    }

    private zzgmy() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgmy();
        }
        zzgmw zzgmwVar = null;
        if (i2 == 4) {
            return new zzgmx(zzgmwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
