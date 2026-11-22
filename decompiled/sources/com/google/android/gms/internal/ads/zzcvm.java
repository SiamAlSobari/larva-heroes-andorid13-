package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcvm {
    private final zzfge zza;
    private final zzcag zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgyn zzg;
    private final String zzh;
    private final zzesm zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfca zzk;

    public zzcvm(zzfge zzfgeVar, zzcag zzcagVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzgyn zzgynVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzesm zzesmVar, zzfca zzfcaVar) {
        this.zza = zzfgeVar;
        this.zzb = zzcagVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgynVar;
        this.zzh = str2;
        this.zzi = zzesmVar;
        this.zzj = zzgVar;
        this.zzk = zzfcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzbun zza(ListenableFuture listenableFuture) throws Exception {
        return new zzbun((Bundle) listenableFuture.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (String) ((ListenableFuture) this.zzg.zzb()).get(), this.zzh, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzha)).booleanValue() && this.zzj.zzQ(), this.zzk.zzb());
    }

    public final ListenableFuture zzb() {
        zzfge zzfgeVar = this.zza;
        return zzffo.zzc(this.zzi.zza(new Bundle()), zzffy.SIGNALS, zzfgeVar).zza();
    }

    public final ListenableFuture zzc() {
        final ListenableFuture listenableFutureZzb = zzb();
        return this.zza.zza(zzffy.REQUEST_PARCEL, listenableFutureZzb, (ListenableFuture) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcvl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(listenableFutureZzb);
            }
        }).zza();
    }
}
