package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzesm {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhr zzd;
    private final zzdrh zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzesm(Context context, Executor executor, Set set, zzfhr zzfhrVar, zzdrh zzdrhVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhrVar;
        this.zze = zzdrhVar;
    }

    public final ListenableFuture zza(final Object obj) {
        zzfhg zzfhgVarZza = zzfhf.zza(this.zza, 8);
        zzfhgVarZza.zzh();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkz)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkz)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        for (final zzesj zzesjVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzesjVar.zza()))) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                ListenableFuture listenableFutureZzb = zzesjVar.zzb();
                listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb(jElapsedRealtime, zzesjVar);
                    }
                }, zzcan.zzf);
                arrayList.add(listenableFutureZzb);
            }
        }
        ListenableFuture listenableFutureZza = zzfye.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzesl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = arrayList;
                Object obj2 = obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzesi zzesiVar = (zzesi) ((ListenableFuture) it.next()).get();
                    if (zzesiVar != null) {
                        zzesiVar.zzj(obj2);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfhu.zza()) {
            zzfhq.zza(listenableFutureZza, this.zzd, zzfhgVarZza);
        }
        return listenableFutureZza;
    }

    public final void zzb(long j, zzesj zzesjVar) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j;
        if (((Boolean) zzbdn.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfrx.zzc(zzesjVar.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbX)).booleanValue()) {
            zzdrg zzdrgVarZza = this.zze.zza();
            zzdrgVarZza.zzb("action", "lat_ms");
            zzdrgVarZza.zzb("lat_grp", "sig_lat_grp");
            zzdrgVarZza.zzb("lat_id", String.valueOf(zzesjVar.zza()));
            zzdrgVarZza.zzb("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbY)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zzdrgVarZza.zzb("seq_num", com.google.android.gms.ads.internal.zzt.zzo().zzg().zzd());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String strValueOf = String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzf);
                        if (zzesjVar.zza() <= 39 || zzesjVar.zza() >= 52) {
                            zzdrgVarZza.zzb("lat_clsg", strValueOf);
                        } else {
                            zzdrgVarZza.zzb("lat_gmssg", strValueOf);
                        }
                    }
                }
            }
            zzdrgVarZza.zzh();
        }
    }
}
