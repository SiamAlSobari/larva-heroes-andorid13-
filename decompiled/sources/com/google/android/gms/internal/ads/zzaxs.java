package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxs extends zzgrq implements zzgtb {
    private static final zzaxs zzb;
    private int zzd;
    private int zze;
    private zzaxw zzf;
    private zzaxy zzg;

    static {
        zzaxs zzaxsVar = new zzaxs();
        zzb = zzaxsVar;
        zzgrq.zzaU(zzaxs.class, zzaxsVar);
    }

    private zzaxs() {
    }

    public static zzaxr zza() {
        return (zzaxr) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaxs zzaxsVar, zzaxw zzaxwVar) {
        zzaxwVar.getClass();
        zzaxsVar.zzf = zzaxwVar;
        zzaxsVar.zzd |= 2;
    }

    static /* synthetic */ void zze(zzaxs zzaxsVar, zzaxy zzaxyVar) {
        zzaxyVar.getClass();
        zzaxsVar.zzg = zzaxyVar;
        zzaxsVar.zzd |= 4;
    }

    static /* synthetic */ void zzf(zzaxs zzaxsVar, int i) {
        zzaxsVar.zze = 1;
        zzaxsVar.zzd = 1 | zzaxsVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzaxu.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaxs();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzaxr(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
