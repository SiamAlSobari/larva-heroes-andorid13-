package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdhu implements zzauf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdhx zzb;

    zzdhu(zzdhx zzdhxVar, String str) {
        this.zzb = zzdhxVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaueVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbG)).booleanValue()) {
            if (zzaueVar.zzj) {
                this.zzb.zzy.put(this.zza, true);
                zzdhx zzdhxVar = this.zzb;
                zzdhxVar.zzz(zzdhxVar.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzaueVar.zzj) {
                zzdhx zzdhxVar2 = this.zzb;
                if (zzdhxVar2.zzo == null) {
                    return;
                }
                zzdhxVar2.zzy.put(this.zza, true);
                zzdhx zzdhxVar3 = this.zzb;
                zzdhxVar3.zzz(zzdhxVar3.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
            }
        }
    }
}
