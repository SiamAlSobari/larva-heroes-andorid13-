package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapf extends zzgrq implements zzgtb {
    private static final zzapf zzb;
    private int zzd;
    private zzgrz zze = zzaN();
    private zzgqi zzf = zzgqi.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzapf zzapfVar = new zzapf();
        zzb = zzapfVar;
        zzgrq.zzaU(zzapf.class, zzapfVar);
    }

    private zzapf() {
    }

    public static zzape zza() {
        return (zzape) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzapf zzapfVar, zzgqi zzgqiVar) {
        zzgrz zzgrzVar = zzapfVar.zze;
        if (!zzgrzVar.zzc()) {
            zzapfVar.zze = zzgrq.zzaO(zzgrzVar);
        }
        zzapfVar.zze.add(zzgqiVar);
    }

    static /* synthetic */ void zze(zzapf zzapfVar, zzgqi zzgqiVar) {
        zzapfVar.zzd |= 1;
        zzapfVar.zzf = zzgqiVar;
    }

    static /* synthetic */ void zzf(zzapf zzapfVar, int i) {
        zzapfVar.zzh = 4;
        zzapfVar.zzd = 4 | zzapfVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzaoz.zza, "zzh", zzaox.zza});
        }
        if (i2 == 3) {
            return new zzapf();
        }
        zzanu zzanuVar = null;
        if (i2 == 4) {
            return new zzape(zzanuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
