package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkn extends zzgrq implements zzgtb {
    private static final zzgkn zzb;
    private int zzd;
    private int zze;
    private zzgkt zzf;
    private zzgmf zzg;

    static {
        zzgkn zzgknVar = new zzgkn();
        zzb = zzgknVar;
        zzgrq.zzaU(zzgkn.class, zzgknVar);
    }

    private zzgkn() {
    }

    public static zzgkm zzc() {
        return (zzgkm) zzb.zzaA();
    }

    public static zzgkn zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgkn) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzi(zzgkn zzgknVar, zzgkt zzgktVar) {
        zzgktVar.getClass();
        zzgknVar.zzf = zzgktVar;
        zzgknVar.zzd |= 1;
    }

    static /* synthetic */ void zzj(zzgkn zzgknVar, zzgmf zzgmfVar) {
        zzgmfVar.getClass();
        zzgknVar.zzg = zzgmfVar;
        zzgknVar.zzd |= 2;
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
            return zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgkn();
        }
        zzgkl zzgklVar = null;
        if (i2 == 4) {
            return new zzgkm(zzgklVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkt zzf() {
        zzgkt zzgktVar = this.zzf;
        return zzgktVar == null ? zzgkt.zze() : zzgktVar;
    }

    public final zzgmf zzg() {
        zzgmf zzgmfVar = this.zzg;
        return zzgmfVar == null ? zzgmf.zze() : zzgmfVar;
    }
}
