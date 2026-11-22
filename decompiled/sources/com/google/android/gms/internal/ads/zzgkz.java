package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkz extends zzgrq implements zzgtb {
    private static final zzgkz zzb;
    private int zzd;

    static {
        zzgkz zzgkzVar = new zzgkz();
        zzb = zzgkzVar;
        zzgrq.zzaU(zzgkz.class, zzgkzVar);
    }

    private zzgkz() {
    }

    public static zzgky zzc() {
        return (zzgky) zzb.zzaA();
    }

    public static zzgkz zze() {
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
            return new zzgkz();
        }
        zzgkx zzgkxVar = null;
        if (i2 == 4) {
            return new zzgky(zzgkxVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
