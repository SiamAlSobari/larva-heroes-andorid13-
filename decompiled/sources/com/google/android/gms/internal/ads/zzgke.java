package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgke extends zzgrq implements zzgtb {
    private static final zzgke zzb;
    private int zzd;
    private int zze;
    private zzgqi zzf = zzgqi.zzb;
    private zzgkk zzg;

    static {
        zzgke zzgkeVar = new zzgke();
        zzb = zzgkeVar;
        zzgrq.zzaU(zzgke.class, zzgkeVar);
    }

    private zzgke() {
    }

    public static zzgkd zzc() {
        return (zzgkd) zzb.zzaA();
    }

    public static zzgke zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgke) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzj(zzgke zzgkeVar, zzgkk zzgkkVar) {
        zzgkkVar.getClass();
        zzgkeVar.zzg = zzgkkVar;
        zzgkeVar.zzd |= 1;
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
            return zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgke();
        }
        zzgkc zzgkcVar = null;
        if (i2 == 4) {
            return new zzgkd(zzgkcVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkk zzf() {
        zzgkk zzgkkVar = this.zzg;
        return zzgkkVar == null ? zzgkk.zze() : zzgkkVar;
    }

    public final zzgqi zzg() {
        return this.zzf;
    }
}
