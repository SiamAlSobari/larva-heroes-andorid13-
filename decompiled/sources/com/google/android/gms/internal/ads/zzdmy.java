package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmy implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzcfu zzb;
    private final Context zzc;
    private final zzdrh zzd;
    private final zzfgo zze;
    private final zzech zzf;
    private final Executor zzg;
    private final zzaqx zzh;
    private final zzcag zzi;
    private final zzfik zzj;
    private final zzecs zzk;

    public zzdmy(Context context, Executor executor, zzaqx zzaqxVar, zzcag zzcagVar, com.google.android.gms.ads.internal.zza zzaVar, zzcfu zzcfuVar, zzech zzechVar, zzfik zzfikVar, zzdrh zzdrhVar, zzfgo zzfgoVar, zzecs zzecsVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzaqxVar;
        this.zzi = zzcagVar;
        this.zza = zzaVar;
        this.zzb = zzcfuVar;
        this.zzf = zzechVar;
        this.zzj = zzfikVar;
        this.zzd = zzdrhVar;
        this.zze = zzfgoVar;
        this.zzk = zzecsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdnb zzdnbVar = new zzdnb(this);
        zzdnbVar.zzh();
        return zzdnbVar;
    }
}
