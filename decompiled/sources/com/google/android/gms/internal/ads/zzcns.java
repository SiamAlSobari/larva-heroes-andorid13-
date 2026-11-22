package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcns implements zzcxd {
    private final zzfcw zza;

    public zzcns(zzfcw zzfcwVar) {
        this.zza = zzfcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbn(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfcf e) {
            zzcaa.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbp(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfcf e) {
            zzcaa.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbq(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfcf e) {
            zzcaa.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
