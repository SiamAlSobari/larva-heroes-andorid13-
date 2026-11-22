package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgmq extends zzgrq implements zzgtb {
    private static final zzgmq zzb;
    private String zzd = "";
    private zzgqi zze = zzgqi.zzb;
    private int zzf;

    static {
        zzgmq zzgmqVar = new zzgmq();
        zzb = zzgmqVar;
        zzgrq.zzaU(zzgmq.class, zzgmqVar);
    }

    private zzgmq() {
    }

    public static zzgmn zza() {
        return (zzgmn) zzb.zzaA();
    }

    public static zzgmq zze() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgmq();
        }
        zzgmm zzgmmVar = null;
        if (i2 == 4) {
            return new zzgmn(zzgmmVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgmp zzc() {
        zzgmp zzgmpVar;
        int i = this.zzf;
        zzgmp zzgmpVar2 = zzgmp.UNKNOWN_KEYMATERIAL;
        if (i == 0) {
            zzgmpVar = zzgmp.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            zzgmpVar = zzgmp.SYMMETRIC;
        } else if (i == 2) {
            zzgmpVar = zzgmp.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            zzgmpVar = i != 4 ? null : zzgmp.REMOTE;
        } else {
            zzgmpVar = zzgmp.ASYMMETRIC_PUBLIC;
        }
        return zzgmpVar == null ? zzgmp.UNRECOGNIZED : zzgmpVar;
    }

    public final zzgqi zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
