package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgnl extends zzgrq implements zzgtb {
    private static final zzgnl zzb;
    private int zzd;
    private int zze;
    private zzgno zzf;

    static {
        zzgnl zzgnlVar = new zzgnl();
        zzb = zzgnlVar;
        zzgrq.zzaU(zzgnl.class, zzgnlVar);
    }

    private zzgnl() {
    }

    public static zzgnk zzc() {
        return (zzgnk) zzb.zzaA();
    }

    public static zzgnl zze(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzgnl) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzh(zzgnl zzgnlVar, zzgno zzgnoVar) {
        zzgnoVar.getClass();
        zzgnlVar.zzf = zzgnoVar;
        zzgnlVar.zzd |= 1;
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
            return new zzgnl();
        }
        zzgnj zzgnjVar = null;
        if (i2 == 4) {
            return new zzgnk(zzgnjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgno zzf() {
        zzgno zzgnoVar = this.zzf;
        return zzgnoVar == null ? zzgno.zzc() : zzgnoVar;
    }
}
