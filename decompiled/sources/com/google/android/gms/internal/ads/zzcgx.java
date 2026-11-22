package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcgx {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgx(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcgx zza() {
        return new zzcgx(0, 0, 0);
    }

    public static zzcgx zzb(int i, int i2) {
        return new zzcgx(1, i, i2);
    }

    public static zzcgx zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        if (zzqVar.zzd) {
            return new zzcgx(3, 0, 0);
        }
        if (zzqVar.zzi) {
            return new zzcgx(2, 0, 0);
        }
        return zzqVar.zzh ? zza() : zzb(zzqVar.zzf, zzqVar.zzc);
    }

    public static zzcgx zzd() {
        return new zzcgx(5, 0, 0);
    }

    public static zzcgx zze() {
        return new zzcgx(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
