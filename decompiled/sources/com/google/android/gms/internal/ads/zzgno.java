package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgno extends zzgrq implements zzgtb {
    private static final zzgno zzb;
    private String zzd = "";

    static {
        zzgno zzgnoVar = new zzgno();
        zzb = zzgnoVar;
        zzgrq.zzaU(zzgno.class, zzgnoVar);
    }

    private zzgno() {
    }

    public static zzgno zzc() {
        return zzb;
    }

    public static zzgno zzd(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgno) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzgno();
        }
        zzgnm zzgnmVar = null;
        if (i2 == 4) {
            return new zzgnn(zzgnmVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zze() {
        return this.zzd;
    }
}
