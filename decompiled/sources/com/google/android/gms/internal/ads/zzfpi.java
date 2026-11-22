package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfpi extends zzfpy {
    final /* synthetic */ zzfpr zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfpp zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfpk zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfpi(zzfpk zzfpkVar, TaskCompletionSource taskCompletionSource, zzfpr zzfprVar, int i, zzfpp zzfppVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzfpkVar;
        this.zza = zzfprVar;
        this.zzb = i;
        this.zzc = zzfppVar;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfpu] */
    @Override // com.google.android.gms.internal.ads.zzfpy
    protected final void zza() {
        try {
            ?? Zze = this.zze.zza.zze();
            zzfpr zzfprVar = this.zza;
            String str = this.zze.zzd;
            int i = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfprVar.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzfprVar.zza());
            Zze.zzg(bundle, new zzfpj(this.zze, this.zzc));
        } catch (RemoteException e) {
            zzfpk.zzb.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.zzb), this.zze.zzd);
            this.zzd.trySetException(new RuntimeException(e));
        }
    }
}
