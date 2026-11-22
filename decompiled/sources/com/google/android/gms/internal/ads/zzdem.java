package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdem extends zzdbs {
    private boolean zzb;

    protected zzdem(Set set) {
        super(set);
    }

    public final void zza() {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdei
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdek
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzt(zzdej.zza);
            this.zzb = true;
        }
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdel
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzt(zzdej.zza);
        this.zzb = true;
    }
}
