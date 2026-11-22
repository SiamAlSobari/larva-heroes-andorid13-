package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgnc extends zzgrq implements zzgtb {
    private static final zzgnc zzb;
    private int zzd;
    private zzgmq zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgnc zzgncVar = new zzgnc();
        zzb = zzgncVar;
        zzgrq.zzaU(zzgnc.class, zzgncVar);
    }

    private zzgnc() {
    }

    public static zzgnb zzd() {
        return (zzgnb) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzgnc zzgncVar, zzgmq zzgmqVar) {
        zzgmqVar.getClass();
        zzgncVar.zze = zzgmqVar;
        zzgncVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgnc();
        }
        zzgmz zzgmzVar = null;
        if (i2 == 4) {
            return new zzgnb(zzgmzVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgmq zzc() {
        zzgmq zzgmqVar = this.zze;
        return zzgmqVar == null ? zzgmq.zze() : zzgmqVar;
    }

    public final zzgnw zzf() {
        zzgnw zzgnwVarZzb = zzgnw.zzb(this.zzh);
        return zzgnwVarZzb == null ? zzgnw.UNRECOGNIZED : zzgnwVarZzb;
    }

    public final boolean zzj() {
        return (this.zzd & 1) != 0;
    }

    public final int zzk() {
        int i = this.zzf;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
