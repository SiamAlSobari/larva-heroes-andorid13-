package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgmv extends zzgrq implements zzgtb {
    private static final zzgmv zzb;
    private String zzd = "";
    private zzgqi zze = zzgqi.zzb;
    private int zzf;

    static {
        zzgmv zzgmvVar = new zzgmv();
        zzb = zzgmvVar;
        zzgrq.zzaU(zzgmv.class, zzgmvVar);
    }

    private zzgmv() {
    }

    public static zzgmu zza() {
        return (zzgmu) zzb.zzaA();
    }

    public static zzgmv zzd() {
        return zzb;
    }

    public static zzgmv zze(byte[] bArr, zzgrc zzgrcVar) throws zzgsc {
        return (zzgmv) zzgrq.zzaI(zzb, bArr, zzgrcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgmv();
        }
        zzgmt zzgmtVar = null;
        if (i2 == 4) {
            return new zzgmu(zzgmtVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgnw zzf() {
        zzgnw zzgnwVarZzb = zzgnw.zzb(this.zzf);
        return zzgnwVarZzb == null ? zzgnw.UNRECOGNIZED : zzgnwVarZzb;
    }

    public final zzgqi zzg() {
        return this.zze;
    }

    public final String zzh() {
        return this.zzd;
    }
}
