package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbu implements BackgroundDetector.BackgroundStateChangeListener {
    final /* synthetic */ zzbv zza;

    zzbu(zzbv zzbvVar) {
        this.zza = zzbvVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        if (z) {
            this.zza.zzc = true;
            this.zza.zzc();
        } else {
            this.zza.zzc = false;
            if (this.zza.zzg()) {
                this.zza.zzb.zzc();
            }
        }
    }
}
