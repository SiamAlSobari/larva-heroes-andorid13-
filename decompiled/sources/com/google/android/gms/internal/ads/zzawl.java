package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzawl implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzawm zza;

    zzawl(zzawm zzawmVar) {
        this.zza = zzawmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            zzawm zzawmVar = this.zza;
            if (zzawmVar.zzd != null) {
                zzawmVar.zzd = null;
            }
            this.zza.zzc.notifyAll();
        }
    }
}
