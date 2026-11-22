package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfpg extends zzfpy {
    final /* synthetic */ zzfpm zza;
    final /* synthetic */ zzfpp zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfpk zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfpg(zzfpk zzfpkVar, TaskCompletionSource taskCompletionSource, zzfpm zzfpmVar, zzfpp zzfppVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfpkVar;
        this.zza = zzfpmVar;
        this.zzb = zzfppVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfpu] */
    @Override // com.google.android.gms.internal.ads.zzfpy
    protected final void zza() {
        try {
            ?? Zze = this.zzd.zza.zze();
            zzfpk zzfpkVar = this.zzd;
            String str = zzfpkVar.zzd;
            zzfpm zzfpmVar = this.zza;
            String str2 = zzfpkVar.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfpmVar.zze());
            bundle.putString("adFieldEnifd", zzfpmVar.zzf());
            bundle.putInt("layoutGravity", zzfpmVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfpmVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzfpmVar.zzd());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str2);
            if (zzfpmVar.zzg() != null) {
                bundle.putString("appId", zzfpmVar.zzg());
            }
            Zze.zzf(str, bundle, new zzfpj(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfpk.zzb.zzb(e, "show overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
