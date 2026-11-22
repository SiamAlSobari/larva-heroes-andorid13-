package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzuy implements zzue {
    private final zzgh zzc;
    private int zzd;
    private final zzux zze;
    private final zzxy zzf;
    private final zzqq zzg;

    public zzuy(zzgh zzghVar, zzux zzuxVar) {
        zzqq zzqqVar = new zzqq();
        zzxy zzxyVar = new zzxy();
        this.zzc = zzghVar;
        this.zze = zzuxVar;
        this.zzg = zzqqVar;
        this.zzf = zzxyVar;
        this.zzd = 1048576;
    }

    public final zzuy zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzva zzb(zzbp zzbpVar) {
        zzbpVar.zzd.getClass();
        return new zzva(zzbpVar, this.zzc, this.zze, zzqz.zza, this.zzf, this.zzd, null);
    }
}
