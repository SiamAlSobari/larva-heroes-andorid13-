package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzflz extends zzgrq implements zzgtb {
    private static final zzgrw zzb = new zzflw();
    private static final zzflz zzd;
    private int zze;
    private zzgrv zzf = zzaJ();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzflz zzflzVar = new zzflz();
        zzd = zzflzVar;
        zzgrq.zzaU(zzflz.class, zzflzVar);
    }

    private zzflz() {
    }

    public static zzfly zza() {
        return (zzfly) zzd.zzaA();
    }

    static /* synthetic */ void zzd(zzflz zzflzVar, String str) {
        str.getClass();
        zzflzVar.zze |= 1;
        zzflzVar.zzg = str;
    }

    static /* synthetic */ void zze(zzflz zzflzVar, int i) {
        zzgrv zzgrvVar = zzflzVar.zzf;
        if (!zzgrvVar.zzc()) {
            zzflzVar.zzf = zzgrq.zzaK(zzgrvVar);
        }
        zzflzVar.zzf.zzh(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzflx.zza, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzflz();
        }
        zzflw zzflwVar = null;
        if (i2 == 4) {
            return new zzfly(zzflwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
