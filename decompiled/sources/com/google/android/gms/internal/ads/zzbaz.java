package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbaz extends zzgrq implements zzgtb {
    private static final zzbaz zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbaz zzbazVar = new zzbaz();
        zzb = zzbazVar;
        zzgrq.zzaU(zzbaz.class, zzbazVar);
    }

    private zzbaz() {
    }

    public static zzbay zza() {
        return (zzbay) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzbaz zzbazVar, boolean z) {
        zzbazVar.zzd |= 1;
        zzbazVar.zze = z;
    }

    static /* synthetic */ void zze(zzbaz zzbazVar, int i) {
        zzbazVar.zzd |= 2;
        zzbazVar.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbaz();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzbay(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
