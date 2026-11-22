package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxw extends zzgrq implements zzgtb {
    private static final zzaxw zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzaxw zzaxwVar = new zzaxw();
        zzb = zzaxwVar;
        zzgrq.zzaU(zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
    }

    public static zzaxv zza() {
        return (zzaxv) zzb.zzaA();
    }

    public static zzaxw zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzaxw zzaxwVar, boolean z) {
        zzaxwVar.zzd |= 1;
        zzaxwVar.zze = z;
    }

    static /* synthetic */ void zzf(zzaxw zzaxwVar, int i) {
        zzaxwVar.zzd |= 2;
        zzaxwVar.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzaxw();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzaxv(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
