package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkw extends zzgrq implements zzgtb {
    private static final zzgkw zzb;
    private int zzd;
    private zzgkz zze;
    private int zzf;

    static {
        zzgkw zzgkwVar = new zzgkw();
        zzb = zzgkwVar;
        zzgrq.zzaU(zzgkw.class, zzgkwVar);
    }

    private zzgkw() {
    }

    public static zzgkv zzc() {
        return (zzgkv) zzb.zzaA();
    }

    public static zzgkw zze() {
        return zzb;
    }

    public static zzgkw zzf(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgkw) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzh(zzgkw zzgkwVar, zzgkz zzgkzVar) {
        zzgkzVar.getClass();
        zzgkwVar.zze = zzgkzVar;
        zzgkwVar.zzd |= 1;
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
            return new zzgkw();
        }
        zzgku zzgkuVar = null;
        if (i2 == 4) {
            return new zzgkv(zzgkuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkz zzg() {
        zzgkz zzgkzVar = this.zze;
        return zzgkzVar == null ? zzgkz.zze() : zzgkzVar;
    }
}
