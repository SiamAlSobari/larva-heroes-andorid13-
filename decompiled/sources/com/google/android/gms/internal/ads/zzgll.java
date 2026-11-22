package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgll extends zzgrq implements zzgtb {
    private static final zzgll zzb;
    private int zzd;
    private zzgqi zze = zzgqi.zzb;

    static {
        zzgll zzgllVar = new zzgll();
        zzb = zzgllVar;
        zzgrq.zzaU(zzgll.class, zzgllVar);
    }

    private zzgll() {
    }

    public static zzglk zzc() {
        return (zzglk) zzb.zzaA();
    }

    public static zzgll zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgll) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgll();
        }
        zzglj zzgljVar = null;
        if (i2 == 4) {
            return new zzglk(zzgljVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgqi zzf() {
        return this.zze;
    }
}
