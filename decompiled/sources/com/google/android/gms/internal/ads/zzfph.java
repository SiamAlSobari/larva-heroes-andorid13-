package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfph extends zzfpy {
    final /* synthetic */ zzfpb zza;
    final /* synthetic */ zzfpp zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfpk zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfph(zzfpk zzfpkVar, TaskCompletionSource taskCompletionSource, zzfpb zzfpbVar, zzfpp zzfppVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfpkVar;
        this.zza = zzfpbVar;
        this.zzb = zzfppVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfpu] */
    @Override // com.google.android.gms.internal.ads.zzfpy
    protected final void zza() {
        try {
            ?? Zze = this.zzd.zza.zze();
            zzfpb zzfpbVar = this.zza;
            String str = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfpbVar.zzb());
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzfpbVar.zza());
            Zze.zze(bundle, new zzfpj(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfpk.zzb.zzb(e, "dismiss overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
