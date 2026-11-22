package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbae extends zzgrq implements zzgtb {
    private static final zzbae zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbae zzbaeVar = new zzbae();
        zzb = zzbaeVar;
        zzgrq.zzaU(zzbae.class, zzbaeVar);
    }

    private zzbae() {
    }

    public static zzbad zza() {
        return (zzbad) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzbae zzbaeVar, int i) {
        zzbaeVar.zzd |= 1;
        zzbaeVar.zze = i;
    }

    static /* synthetic */ void zze(zzbae zzbaeVar, int i) {
        zzbaeVar.zzd |= 2;
        zzbaeVar.zzf = i;
    }

    static /* synthetic */ void zzf(zzbae zzbaeVar, int i) {
        zzbaeVar.zzd |= 4;
        zzbaeVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbae();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzbad(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
