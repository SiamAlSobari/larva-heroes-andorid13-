package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzawy implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzawq zza;
    final /* synthetic */ zzcas zzb;
    final /* synthetic */ zzaxa zzc;

    zzawy(zzaxa zzaxaVar, zzawq zzawqVar, zzcas zzcasVar) {
        this.zzc = zzaxaVar;
        this.zza = zzawqVar;
        this.zzb = zzcasVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            zzaxa zzaxaVar = this.zzc;
            if (zzaxaVar.zzb) {
                return;
            }
            zzaxaVar.zzb = true;
            final zzawp zzawpVar = this.zzc.zza;
            if (zzawpVar == null) {
                return;
            }
            zzfyo zzfyoVar = zzcan.zza;
            final zzawq zzawqVar = this.zza;
            final zzcas zzcasVar = this.zzb;
            final ListenableFuture listenableFutureZza = zzfyoVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzawv
                @Override // java.lang.Runnable
                public final void run() {
                    zzawy zzawyVar = this.zza;
                    zzawp zzawpVar2 = zzawpVar;
                    zzawq zzawqVar2 = zzawqVar;
                    zzcas zzcasVar2 = zzcasVar;
                    try {
                        zzaws zzawsVarZzq = zzawpVar2.zzq();
                        zzawn zzawnVarZzg = zzawpVar2.zzp() ? zzawsVarZzq.zzg(zzawqVar2) : zzawsVarZzq.zzf(zzawqVar2);
                        if (!zzawnVarZzg.zze()) {
                            zzcasVar2.zzd(new RuntimeException("No entry contents."));
                            zzaxa.zze(zzawyVar.zzc);
                            return;
                        }
                        zzawx zzawxVar = new zzawx(zzawyVar, zzawnVarZzg.zzc(), 1);
                        int i = zzawxVar.read();
                        if (i == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzawxVar.unread(i);
                        zzcasVar2.zzc(zzaxc.zzb(zzawxVar, zzawnVarZzg.zzd(), zzawnVarZzg.zzg(), zzawnVarZzg.zza(), zzawnVarZzg.zzf()));
                    } catch (RemoteException | IOException e) {
                        zzcaa.zzh("Unable to obtain a cache service instance.", e);
                        zzcasVar2.zzd(e);
                        zzaxa.zze(zzawyVar.zzc);
                    }
                }
            });
            final zzcas zzcasVar2 = this.zzb;
            zzcasVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaww
                @Override // java.lang.Runnable
                public final void run() {
                    zzcas zzcasVar3 = zzcasVar2;
                    Future future = listenableFutureZza;
                    int i = zzawy.zzd;
                    if (zzcasVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzcan.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
