package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgxc extends zzgrq implements zzgtb {
    private static final zzgxc zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgqi zzg = zzgqi.zzb;
    private zzgqi zzh = zzgqi.zzb;

    static {
        zzgxc zzgxcVar = new zzgxc();
        zzb = zzgxcVar;
        zzgrq.zzaU(zzgxc.class, zzgxcVar);
    }

    private zzgxc() {
    }

    public static zzgxa zza() {
        return (zzgxa) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgxc zzgxcVar, String str) {
        zzgxcVar.zzd |= 2;
        zzgxcVar.zzf = "image/png";
    }

    static /* synthetic */ void zze(zzgxc zzgxcVar, zzgqi zzgqiVar) {
        zzgqiVar.getClass();
        zzgxcVar.zzd |= 4;
        zzgxcVar.zzg = zzgqiVar;
    }

    static /* synthetic */ void zzf(zzgxc zzgxcVar, int i) {
        zzgxcVar.zze = 1;
        zzgxcVar.zzd = 1 | zzgxcVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzgxb.zza, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgxc();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgxa(zzgvkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
