package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgxi extends zzgrq implements zzgtb {
    private static final zzgxi zzb;
    private int zzd;
    private int zze;
    private zzgwk zzg;
    private zzgwo zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private zzgrv zzj = zzaJ();
    private String zzk = "";
    private zzgrz zzm = zzgrq.zzaN();

    static {
        zzgxi zzgxiVar = new zzgxi();
        zzb = zzgxiVar;
        zzgrq.zzaU(zzgxi.class, zzgxiVar);
    }

    private zzgxi() {
    }

    public static zzgxh zzc() {
        return (zzgxh) zzb.zzaA();
    }

    static /* synthetic */ void zzf(zzgxi zzgxiVar, int i) {
        zzgxiVar.zzd |= 1;
        zzgxiVar.zze = i;
    }

    static /* synthetic */ void zzg(zzgxi zzgxiVar, String str) {
        str.getClass();
        zzgxiVar.zzd |= 2;
        zzgxiVar.zzf = str;
    }

    static /* synthetic */ void zzh(zzgxi zzgxiVar, zzgwk zzgwkVar) {
        zzgwkVar.getClass();
        zzgxiVar.zzg = zzgwkVar;
        zzgxiVar.zzd |= 4;
    }

    static /* synthetic */ void zzi(zzgxi zzgxiVar, String str) {
        str.getClass();
        zzgrz zzgrzVar = zzgxiVar.zzm;
        if (!zzgrzVar.zzc()) {
            zzgxiVar.zzm = zzgrq.zzaO(zzgrzVar);
        }
        zzgxiVar.zzm.add(str);
    }

    static /* synthetic */ void zzj(zzgxi zzgxiVar, int i) {
        zzgxiVar.zzl = i - 1;
        zzgxiVar.zzd |= 64;
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final String zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgxf.zza, "zzm"});
        }
        if (i2 == 3) {
            return new zzgxi();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgxh(zzgvkVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
