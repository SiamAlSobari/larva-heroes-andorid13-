package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcvc implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzcvc(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final zzcag zzcagVarZza = ((zzchv) this.zzb).zza();
        final zzfca zzfcaVarZza = ((zzcvz) this.zzc).zza();
        return new zzfqw() { // from class: com.google.android.gms.internal.ads.zzcvb
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                Context context2 = context;
                zzcag zzcagVar = zzcagVarZza;
                zzfca zzfcaVar = zzfcaVarZza;
                zzfbe zzfbeVar = (zzfbe) obj;
                com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context2);
                zzasVar.zzp(zzfbeVar.zzC);
                zzasVar.zzq(zzfbeVar.zzD.toString());
                zzasVar.zzo(zzcagVar.zza);
                zzasVar.zzn(zzfcaVar.zzf);
                return zzasVar;
            }
        };
    }
}
