package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgkq extends zzgrq implements zzgtb {
    private static final zzgkq zzb;
    private int zzd;
    private zzgkw zze;
    private zzgmi zzf;

    static {
        zzgkq zzgkqVar = new zzgkq();
        zzb = zzgkqVar;
        zzgrq.zzaU(zzgkq.class, zzgkqVar);
    }

    private zzgkq() {
    }

    public static zzgkp zza() {
        return (zzgkp) zzb.zzaA();
    }

    public static zzgkq zzd(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgkq) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzg(zzgkq zzgkqVar, zzgkw zzgkwVar) {
        zzgkwVar.getClass();
        zzgkqVar.zze = zzgkwVar;
        zzgkqVar.zzd |= 1;
    }

    static /* synthetic */ void zzh(zzgkq zzgkqVar, zzgmi zzgmiVar) {
        zzgmiVar.getClass();
        zzgkqVar.zzf = zzgmiVar;
        zzgkqVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgkq();
        }
        zzgko zzgkoVar = null;
        if (i2 == 4) {
            return new zzgkp(zzgkoVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkw zze() {
        zzgkw zzgkwVar = this.zze;
        return zzgkwVar == null ? zzgkw.zze() : zzgkwVar;
    }

    public final zzgmi zzf() {
        zzgmi zzgmiVar = this.zzf;
        return zzgmiVar == null ? zzgmi.zzf() : zzgmiVar;
    }
}
