package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzawz implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcas zza;
    final /* synthetic */ zzaxa zzb;

    zzawz(zzaxa zzaxaVar, zzcas zzcasVar) {
        this.zzb = zzaxaVar;
        this.zza = zzcasVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
