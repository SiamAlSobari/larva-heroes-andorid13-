package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzact implements zzacn {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzact(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
    }

    public static zzact zzb(zzfb zzfbVar) {
        int iZzh = zzfbVar.zzh();
        zzfbVar.zzH(12);
        int iZzh2 = zzfbVar.zzh();
        int iZzh3 = zzfbVar.zzh();
        int iZzh4 = zzfbVar.zzh();
        zzfbVar.zzH(4);
        int iZzh5 = zzfbVar.zzh();
        int iZzh6 = zzfbVar.zzh();
        zzfbVar.zzH(8);
        return new zzact(iZzh, iZzh2, iZzh3, iZzh4, iZzh5, iZzh6);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zza() {
        return 1752331379;
    }
}
