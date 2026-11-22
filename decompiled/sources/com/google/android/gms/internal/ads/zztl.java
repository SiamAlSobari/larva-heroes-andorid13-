package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zztl extends zztg {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zztl(zzcw zzcwVar, Object obj, Object obj2) {
        super(zzcwVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zztl zzq(zzbp zzbpVar) {
        return new zztl(new zztm(zzbpVar), zzcv.zza, zzd);
    }

    public static zztl zzr(zzcw zzcwVar, Object obj, Object obj2) {
        return new zztl(zzcwVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzcw
    public final int zza(Object obj) {
        Object obj2;
        zzcw zzcwVar = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzcwVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzcw
    public final zzct zzd(int i, zzct zzctVar, boolean z) {
        this.zzc.zzd(i, zzctVar, z);
        if (zzfk.zzD(zzctVar.zzc, this.zzf) && z) {
            zzctVar.zzc = zzd;
        }
        return zzctVar;
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzcw
    public final zzcv zze(int i, zzcv zzcvVar, long j) {
        this.zzc.zze(i, zzcvVar, j);
        if (zzfk.zzD(zzcvVar.zzc, this.zze)) {
            zzcvVar.zzc = zzcv.zza;
        }
        return zzcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzcw
    public final Object zzf(int i) {
        Object objZzf = this.zzc.zzf(i);
        return zzfk.zzD(objZzf, this.zzf) ? zzd : objZzf;
    }

    public final zztl zzp(zzcw zzcwVar) {
        return new zztl(zzcwVar, this.zze, this.zzf);
    }
}
