package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcxy extends zzdbs implements zzcya {
    zzcxy(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zza(final zzcse zzcseVar) {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcxx
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzcya) obj).zza(zzcseVar);
            }
        });
    }
}
