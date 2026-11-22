package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfmd extends zzgrq implements zzgtb {
    private static final zzfmd zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzflz zzh;

    static {
        zzfmd zzfmdVar = new zzfmd();
        zzb = zzfmdVar;
        zzgrq.zzaU(zzfmd.class, zzfmdVar);
    }

    private zzfmd() {
    }

    public static zzfmb zza() {
        return (zzfmb) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzfmd zzfmdVar, String str) {
        str.getClass();
        zzfmdVar.zzd |= 2;
        zzfmdVar.zzf = str;
    }

    static /* synthetic */ void zze(zzfmd zzfmdVar, zzflz zzflzVar) {
        zzflzVar.getClass();
        zzfmdVar.zzh = zzflzVar;
        zzfmdVar.zzd |= 8;
    }

    static /* synthetic */ void zzf(zzfmd zzfmdVar, int i) {
        zzfmdVar.zze = 1;
        zzfmdVar.zzd = 1 | zzfmdVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfmc.zza, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfmd();
        }
        zzfma zzfmaVar = null;
        if (i2 == 4) {
            return new zzfmb(zzfmaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
