package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnw implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdnw(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* synthetic */ Object zzb() {
        zzgzg zzgzgVar = this.zza;
        zzgzg zzgzgVar2 = this.zzb;
        int i = ((zzcvz) this.zzc).zza().zzo.zza;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? ((zzeit) zzgzgVar2).zzb() : ((zzeit) zzgzgVar).zzb();
        }
        throw null;
    }
}
