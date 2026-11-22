package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkk extends zzgrq implements zzgtb {
    private static final zzgkk zzb;
    private int zzd;

    static {
        zzgkk zzgkkVar = new zzgkk();
        zzb = zzgkkVar;
        zzgrq.zzaU(zzgkk.class, zzgkkVar);
    }

    private zzgkk() {
    }

    public static zzgkj zzc() {
        return (zzgkj) zzb.zzaA();
    }

    public static zzgkk zze() {
        return zzb;
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
            return zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzgkk();
        }
        zzgki zzgkiVar = null;
        if (i2 == 4) {
            return new zzgkj(zzgkiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
