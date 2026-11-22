package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfic extends zzgrq implements zzgtb {
    private static final zzfic zzb;
    private zzgrz zzd = zzaN();

    static {
        zzfic zzficVar = new zzfic();
        zzb = zzficVar;
        zzgrq.zzaU(zzfic.class, zzficVar);
    }

    private zzfic() {
    }

    public static zzfhz zzc() {
        return (zzfhz) zzb.zzaA();
    }

    static /* synthetic */ void zzf(zzfic zzficVar, zzfib zzfibVar) {
        zzfibVar.getClass();
        zzgrz zzgrzVar = zzficVar.zzd;
        if (!zzgrzVar.zzc()) {
            zzficVar.zzd = zzgrq.zzaO(zzgrzVar);
        }
        zzficVar.zzd.add(zzfibVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfib.class});
        }
        if (i2 == 3) {
            return new zzfic();
        }
        zzfhy zzfhyVar = null;
        if (i2 == 4) {
            return new zzfhz(zzfhyVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
