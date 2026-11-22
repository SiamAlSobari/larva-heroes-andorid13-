package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkh extends zzgrq implements zzgtb {
    private static final zzgkh zzb;
    private int zzd;
    private int zze;
    private zzgkk zzf;

    static {
        zzgkh zzgkhVar = new zzgkh();
        zzb = zzgkhVar;
        zzgrq.zzaU(zzgkh.class, zzgkhVar);
    }

    private zzgkh() {
    }

    public static zzgkg zzc() {
        return (zzgkg) zzb.zzaA();
    }

    public static zzgkh zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgkh) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzh(zzgkh zzgkhVar, zzgkk zzgkkVar) {
        zzgkkVar.getClass();
        zzgkhVar.zzf = zzgkkVar;
        zzgkhVar.zzd |= 1;
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
            return new zzgkh();
        }
        zzgkf zzgkfVar = null;
        if (i2 == 4) {
            return new zzgkg(zzgkfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkk zzf() {
        zzgkk zzgkkVar = this.zzf;
        return zzgkkVar == null ? zzgkk.zze() : zzgkkVar;
    }
}
