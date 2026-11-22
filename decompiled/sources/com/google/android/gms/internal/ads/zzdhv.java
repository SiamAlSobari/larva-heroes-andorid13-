package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdhv implements zzfya {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdhx zzb;

    zzdhv(zzdhx zzdhxVar, String str, boolean z) {
        this.zzb = zzdhxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "omid native display exp");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze.zzT((zzcfi) obj);
        zzdhx zzdhxVar = this.zzb;
        zzcas zzcasVarZzp = zzdhxVar.zze.zzp();
        zzfip zzfipVarZzf = zzdhxVar.zzf(this.zza, true);
        if (zzfipVarZzf != null && zzcasVarZzp != null) {
            zzcasVarZzp.zzc(zzfipVarZzf);
        } else if (zzcasVarZzp != null) {
            zzcasVarZzp.cancel(false);
        }
    }
}
