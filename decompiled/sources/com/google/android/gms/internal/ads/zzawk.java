package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzawk implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzawm zza;

    zzawk(zzawm zzawmVar) {
        this.zza = zzawmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzc) {
            try {
                zzawm zzawmVar = this.zza;
                if (zzawmVar.zzd != null) {
                    zzawmVar.zzf = zzawmVar.zzd.zzq();
                }
            } catch (DeadObjectException e) {
                zzcaa.zzh("Unable to obtain a cache service instance.", e);
                zzawm.zzh(this.zza);
            }
            this.zza.zzc.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}
