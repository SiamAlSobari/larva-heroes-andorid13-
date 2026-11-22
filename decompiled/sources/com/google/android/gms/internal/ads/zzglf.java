package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzglf extends zzgrq implements zzgtb {
    private static final zzglf zzb;
    private int zzd;
    private zzgli zze;
    private int zzf;

    static {
        zzglf zzglfVar = new zzglf();
        zzb = zzglfVar;
        zzgrq.zzaU(zzglf.class, zzglfVar);
    }

    private zzglf() {
    }

    public static zzgle zzc() {
        return (zzgle) zzb.zzaA();
    }

    public static zzglf zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzglf) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzg(zzglf zzglfVar, zzgli zzgliVar) {
        zzgliVar.getClass();
        zzglfVar.zze = zzgliVar;
        zzglfVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzglf();
        }
        zzgld zzgldVar = null;
        if (i2 == 4) {
            return new zzgle(zzgldVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgli zzf() {
        zzgli zzgliVar = this.zze;
        return zzgliVar == null ? zzgli.zze() : zzgliVar;
    }
}
