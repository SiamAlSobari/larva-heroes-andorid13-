package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzacs implements zzacn {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzacs(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzacs zzb(zzfb zzfbVar) {
        int iZzh = zzfbVar.zzh();
        zzfbVar.zzH(8);
        int iZzh2 = zzfbVar.zzh();
        int iZzh3 = zzfbVar.zzh();
        zzfbVar.zzH(4);
        int iZzh4 = zzfbVar.zzh();
        zzfbVar.zzH(12);
        return new zzacs(iZzh, iZzh2, iZzh3, iZzh4);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zza() {
        return 1751742049;
    }
}
