package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzczb extends zzdbs implements zzczd {
    public zzczb(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(final zzbun zzbunVar) {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcyz
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzczd) obj).zzbr(zzbunVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(final zzfbr zzfbrVar) {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcza
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzczd) obj).zzbs(zzfbrVar);
            }
        });
    }
}
