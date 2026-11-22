package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzctl {
    private final zzdwn zza;
    private final zzfca zzb;
    private final zzfge zzc;
    private final zzcmq zzd;
    private final zzehh zze;
    private final zzdbn zzf;
    private zzfbr zzg;
    private final zzdxs zzh;
    private final zzcvm zzi;
    private final Executor zzj;
    private final zzdxe zzk;
    private final zzeds zzl;
    private final zzdyi zzm;
    private final zzdyp zzn;

    zzctl(zzdwn zzdwnVar, zzfca zzfcaVar, zzfge zzfgeVar, zzcmq zzcmqVar, zzehh zzehhVar, zzdbn zzdbnVar, zzfbr zzfbrVar, zzdxs zzdxsVar, zzcvm zzcvmVar, Executor executor, zzdxe zzdxeVar, zzeds zzedsVar, zzdyi zzdyiVar, zzdyp zzdypVar) {
        this.zza = zzdwnVar;
        this.zzb = zzfcaVar;
        this.zzc = zzfgeVar;
        this.zzd = zzcmqVar;
        this.zze = zzehhVar;
        this.zzf = zzdbnVar;
        this.zzg = zzfbrVar;
        this.zzh = zzdxsVar;
        this.zzi = zzcvmVar;
        this.zzj = executor;
        this.zzk = zzdxeVar;
        this.zzl = zzedsVar;
        this.zzm = zzdyiVar;
        this.zzn = zzdypVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfdb.zzb(th, this.zzl);
    }

    public final zzdbn zzc() {
        return this.zzf;
    }

    final /* synthetic */ zzfbr zzd(zzfbr zzfbrVar) throws Exception {
        this.zzd.zza(zzfbrVar);
        return zzfbrVar;
    }

    public final ListenableFuture zze(final zzfdu zzfduVar) {
        zzffj zzffjVarZza = this.zzc.zzb(zzffy.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcti
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzf(zzfduVar, (zzbun) obj);
            }
        }).zza();
        zzfye.zzr(zzffjVarZza, new zzctj(this), this.zzj);
        return zzffjVarZza;
    }

    final /* synthetic */ ListenableFuture zzf(zzfdu zzfduVar, zzbun zzbunVar) throws Exception {
        zzbunVar.zzi = zzfduVar;
        return this.zzh.zza(zzbunVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzg(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3) throws Exception {
        return this.zzn.zzc((zzbun) listenableFuture.get(), (JSONObject) listenableFuture2.get(), (zzbuq) listenableFuture3.get());
    }

    public final ListenableFuture zzh(zzbun zzbunVar) {
        zzffj zzffjVarZza = this.zzc.zzb(zzffy.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbunVar)).zza();
        zzfye.zzr(zzffjVarZza, new zzctk(this), this.zzj);
        return zzffjVarZza;
    }

    public final ListenableFuture zzi(ListenableFuture listenableFuture) {
        zzffv zzffvVarZzf = this.zzc.zzb(zzffy.RENDERER, listenableFuture).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzcth
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) throws Exception {
                zzfbr zzfbrVar = (zzfbr) obj;
                this.zza.zzd(zzfbrVar);
                return zzfbrVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfq)).booleanValue()) {
            zzffvVarZzf = zzffvVarZzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfr)).intValue(), TimeUnit.SECONDS);
        }
        return zzffvVarZzf.zza();
    }

    public final ListenableFuture zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzfge zzfgeVar = this.zzc;
        return zzffo.zzc(this.zza.zza(), zzffy.PRELOADED_LOADER, zzfgeVar).zza();
    }

    public final ListenableFuture zzk(final ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            return zzffo.zzc(zzfye.zzh(this.zzg), zzffy.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc().zzj();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkn)).booleanValue() || ((Boolean) zzbdp.zzc.zze()).booleanValue()) {
            zzffv zzffvVarZzb = this.zzc.zzb(zzffy.SERVER_TRANSACTION, listenableFuture);
            final zzdxe zzdxeVar = this.zzk;
            return zzffvVarZzb.zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzctg
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    return zzdxeVar.zzb((zzbun) obj);
                }
            }).zza();
        }
        final zzdyi zzdyiVar = this.zzm;
        final ListenableFuture listenableFutureZzn = zzfye.zzn(listenableFuture, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzctc
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzdyiVar.zza((zzbun) obj);
            }
        }, this.zzj);
        zzffv zzffvVarZzb2 = this.zzc.zzb(zzffy.BUILD_URL, listenableFutureZzn);
        final zzdxs zzdxsVar = this.zzh;
        final zzffj zzffjVarZza = zzffvVarZzb2.zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzctd
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzdxsVar.zzb((JSONObject) obj);
            }
        }).zza();
        return this.zzc.zza(zzffy.SERVER_TRANSACTION, listenableFuture, listenableFutureZzn, zzffjVarZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcte
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzg(listenableFuture, listenableFutureZzn, zzffjVarZza);
            }
        }).zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzctf
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return (ListenableFuture) obj;
            }
        }).zza();
    }

    public final void zzl(zzfbr zzfbrVar) {
        this.zzg = zzfbrVar;
    }
}
