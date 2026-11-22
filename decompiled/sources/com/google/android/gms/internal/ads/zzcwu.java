package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwu extends zzdbs implements zzcwm {
    public zzcwu(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcwr
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzcwy) obj).zzp(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcws
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzcwy) obj).zzp(zzfdb.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc(final zzdfx zzdfxVar) {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcwt
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzcwy) obj).zzp(zzfdb.zzd(12, zzdfxVar.getMessage(), null));
            }
        });
    }
}
