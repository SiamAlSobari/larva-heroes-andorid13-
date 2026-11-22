package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxz extends zzgrq implements zzgtb {
    private static final zzaxz zzb;
    private zzgrz zzd = zzaN();

    static {
        zzaxz zzaxzVar = new zzaxz();
        zzb = zzaxzVar;
        zzgrq.zzaU(zzaxz.class, zzaxzVar);
    }

    private zzaxz() {
    }

    public static zzaxt zza() {
        return (zzaxt) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaxz zzaxzVar, zzaxs zzaxsVar) {
        zzaxsVar.getClass();
        zzgrz zzgrzVar = zzaxzVar.zzd;
        if (!zzgrzVar.zzc()) {
            zzaxzVar.zzd = zzgrq.zzaO(zzgrzVar);
        }
        zzaxzVar.zzd.add(zzaxsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzaxs.class});
        }
        if (i2 == 3) {
            return new zzaxz();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzaxt(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
