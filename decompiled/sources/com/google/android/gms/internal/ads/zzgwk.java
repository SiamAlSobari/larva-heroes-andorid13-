package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgwk extends zzgrq implements zzgtb {
    private static final zzgwk zzb;
    private int zzd;
    private zzgwj zze;
    private int zzi;
    private byte zzj = 2;
    private zzgrz zzf = zzaN();
    private zzgqi zzg = zzgqi.zzb;
    private zzgqi zzh = zzgqi.zzb;

    static {
        zzgwk zzgwkVar = new zzgwk();
        zzb = zzgwkVar;
        zzgrq.zzaU(zzgwk.class, zzgwkVar);
    }

    private zzgwk() {
    }

    public static zzgwh zza() {
        return (zzgwh) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgwk zzgwkVar, zzgwg zzgwgVar) {
        zzgwgVar.getClass();
        zzgrz zzgrzVar = zzgwkVar.zzf;
        if (!zzgrzVar.zzc()) {
            zzgwkVar.zzf = zzgrq.zzaO(zzgrzVar);
        }
        zzgwkVar.zzf.add(zzgwgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzgwg.class, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzgwk();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgwh(zzgvkVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
