package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgnr extends zzgrq implements zzgtb {
    private static final zzgnr zzb;
    private int zzd;
    private int zze;
    private zzgnu zzf;

    static {
        zzgnr zzgnrVar = new zzgnr();
        zzb = zzgnrVar;
        zzgrq.zzaU(zzgnr.class, zzgnrVar);
    }

    private zzgnr() {
    }

    public static zzgnq zzc() {
        return (zzgnq) zzb.zzaA();
    }

    public static zzgnr zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgnr) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzh(zzgnr zzgnrVar, zzgnu zzgnuVar) {
        zzgnuVar.getClass();
        zzgnrVar.zzf = zzgnuVar;
        zzgnrVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgnr();
        }
        zzgnp zzgnpVar = null;
        if (i2 == 4) {
            return new zzgnq(zzgnpVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgnu zzf() {
        zzgnu zzgnuVar = this.zzf;
        return zzgnuVar == null ? zzgnu.zzd() : zzgnuVar;
    }
}
