package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgvj extends zzgrq implements zzgtb {
    private static final zzgvj zzb;
    private zzgrz zzd = zzaN();

    static {
        zzgvj zzgvjVar = new zzgvj();
        zzb = zzgvjVar;
        zzgrq.zzaU(zzgvj.class, zzgvjVar);
    }

    private zzgvj() {
    }

    public static zzgvi zza() {
        return (zzgvi) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgvj zzgvjVar, zzgvh zzgvhVar) {
        zzgvhVar.getClass();
        zzgrz zzgrzVar = zzgvjVar.zzd;
        if (!zzgrzVar.zzc()) {
            zzgvjVar.zzd = zzgrq.zzaO(zzgrzVar);
        }
        zzgvjVar.zzd.add(zzgvhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzgvh.class});
        }
        if (i2 == 3) {
            return new zzgvj();
        }
        zzgvf zzgvfVar = null;
        if (i2 == 4) {
            return new zzgvi(zzgvfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
