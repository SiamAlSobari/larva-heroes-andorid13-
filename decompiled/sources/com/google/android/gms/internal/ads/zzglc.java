package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzglc extends zzgrq implements zzgtb {
    private static final zzglc zzb;
    private int zzd;
    private int zze;
    private zzgli zzf;
    private zzgqi zzg = zzgqi.zzb;

    static {
        zzglc zzglcVar = new zzglc();
        zzb = zzglcVar;
        zzgrq.zzaU(zzglc.class, zzglcVar);
    }

    private zzglc() {
    }

    public static zzglb zzc() {
        return (zzglb) zzb.zzaA();
    }

    public static zzglc zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzglc) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzi(zzglc zzglcVar, zzgli zzgliVar) {
        zzgliVar.getClass();
        zzglcVar.zzf = zzgliVar;
        zzglcVar.zzd |= 1;
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
            return zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzglc();
        }
        zzgla zzglaVar = null;
        if (i2 == 4) {
            return new zzglb(zzglaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgli zzf() {
        zzgli zzgliVar = this.zzf;
        return zzgliVar == null ? zzgli.zze() : zzgliVar;
    }

    public final zzgqi zzg() {
        return this.zzg;
    }
}
