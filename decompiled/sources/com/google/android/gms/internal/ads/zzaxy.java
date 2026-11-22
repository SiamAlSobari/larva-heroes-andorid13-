package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxy extends zzgrq implements zzgtb {
    private static final zzaxy zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzaxy zzaxyVar = new zzaxy();
        zzb = zzaxyVar;
        zzgrq.zzaU(zzaxy.class, zzaxyVar);
    }

    private zzaxy() {
    }

    public static zzaxx zza() {
        return (zzaxx) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaxy zzaxyVar, boolean z) {
        zzaxyVar.zzd |= 1;
        zzaxyVar.zze = z;
    }

    static /* synthetic */ void zze(zzaxy zzaxyVar, boolean z) {
        zzaxyVar.zzd |= 2;
        zzaxyVar.zzf = z;
    }

    static /* synthetic */ void zzf(zzaxy zzaxyVar, int i) {
        zzaxyVar.zzd |= 4;
        zzaxyVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaxy();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzaxx(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
