package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfib extends zzgrq implements zzgtb {
    private static final zzfib zzb;
    private int zzd;
    private zzfhx zze;

    static {
        zzfib zzfibVar = new zzfib();
        zzb = zzfibVar;
        zzgrq.zzaU(zzfib.class, zzfibVar);
    }

    private zzfib() {
    }

    public static zzfia zza() {
        return (zzfia) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzfib zzfibVar, zzfhx zzfhxVar) {
        zzfhxVar.getClass();
        zzfibVar.zze = zzfhxVar;
        zzfibVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzfib();
        }
        zzfhy zzfhyVar = null;
        if (i2 == 4) {
            return new zzfia(zzfhyVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
