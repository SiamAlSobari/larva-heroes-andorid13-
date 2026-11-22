package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgni extends zzgrq implements zzgtb {
    private static final zzgni zzb;
    private int zzd;
    private zzgrz zze = zzaN();

    static {
        zzgni zzgniVar = new zzgni();
        zzb = zzgniVar;
        zzgrq.zzaU(zzgni.class, zzgniVar);
    }

    private zzgni() {
    }

    public static zzgnf zza() {
        return (zzgnf) zzb.zzaA();
    }

    static /* synthetic */ void zze(zzgni zzgniVar, zzgnh zzgnhVar) {
        zzgnhVar.getClass();
        zzgrz zzgrzVar = zzgniVar.zze;
        if (!zzgrzVar.zzc()) {
            zzgniVar.zze = zzgrq.zzaO(zzgrzVar);
        }
        zzgniVar.zze.add(zzgnhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgnh.class});
        }
        if (i2 == 3) {
            return new zzgni();
        }
        zzgne zzgneVar = null;
        if (i2 == 4) {
            return new zzgnf(zzgneVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
