package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnb {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzcfu zzc;
    private final Context zzd;
    private final zzdrh zze;
    private final zzfgo zzf;
    private final Executor zzg;
    private final zzaqx zzh;
    private final zzcag zzi;
    private final zzech zzk;
    private final zzfik zzl;
    private final zzecs zzm;
    private ListenableFuture zzn;
    private final zzdmo zza = new zzdmo();
    private final zzbjg zzj = new zzbjg();

    zzdnb(zzdmy zzdmyVar) {
        this.zzd = zzdmyVar.zzc;
        this.zzg = zzdmyVar.zzg;
        this.zzh = zzdmyVar.zzh;
        this.zzi = zzdmyVar.zzi;
        this.zzb = zzdmyVar.zza;
        this.zzc = zzdmyVar.zzb;
        this.zzk = zzdmyVar.zzf;
        this.zzl = zzdmyVar.zzj;
        this.zze = zzdmyVar.zzd;
        this.zzf = zzdmyVar.zze;
        this.zzm = zzdmyVar.zzk;
    }

    final /* synthetic */ zzcfi zza(zzcfi zzcfiVar) {
        zzcfiVar.zzad("/result", this.zzj);
        zzcgv zzcgvVarZzN = zzcfiVar.zzN();
        zzdmo zzdmoVar = this.zza;
        zzcgvVarZzN.zzM(null, zzdmoVar, zzdmoVar, zzdmoVar, zzdmoVar, false, null, new com.google.android.gms.ads.internal.zzb(this.zzd, null, null), null, null, this.zzk, this.zzl, this.zze, this.zzf, null, null, null, null, null);
        return zzcfiVar;
    }

    final /* synthetic */ ListenableFuture zzc(String str, JSONObject jSONObject, zzcfi zzcfiVar) throws Exception {
        return this.zzj.zzb(zzcfiVar, str, jSONObject);
    }

    public final synchronized ListenableFuture zzd(final String str, final JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return zzfye.zzh(null);
        }
        return zzfye.zzn(listenableFuture, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdmp
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(str, jSONObject, (zzcfi) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(zzfbe zzfbeVar, zzfbi zzfbiVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzfye.zzr(listenableFuture, new zzdmv(this, zzfbeVar, zzfbiVar), this.zzg);
    }

    public final synchronized void zzf() {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzfye.zzr(listenableFuture, new zzdmr(this), this.zzg);
        this.zzn = null;
    }

    public final synchronized void zzg(String str, Map map) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzfye.zzr(listenableFuture, new zzdmu(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh() {
        final Context context = this.zzd;
        final zzcag zzcagVar = this.zzi;
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdz);
        final zzaqx zzaqxVar = this.zzh;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzecs zzecsVar = this.zzm;
        ListenableFuture listenableFutureZzm = zzfye.zzm(zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzcfr
            @Override // com.google.android.gms.internal.ads.zzfxk
            public final ListenableFuture zza() throws zzcft {
                Context context2 = context;
                zzaqx zzaqxVar2 = zzaqxVar;
                zzcag zzcagVar2 = zzcagVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzecs zzecsVar2 = zzecsVar;
                String str2 = str;
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcfi zzcfiVarZza = zzcfu.zza(context2, zzcgx.zza(), "", false, false, zzaqxVar2, null, zzcagVar2, null, null, zzaVar2, zzaxe.zza(), null, null, zzecsVar2);
                final zzcar zzcarVarZza = zzcar.zza(zzcfiVarZza);
                zzcfiVarZza.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzcfs
                    @Override // com.google.android.gms.internal.ads.zzcgt
                    public final void zza(boolean z, int i, String str3, String str4) {
                        zzcarVarZza.zzb();
                    }
                });
                zzcfiVarZza.loadUrl(str2);
                return zzcarVarZza;
            }
        }, zzcan.zze), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdmq
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                zzcfi zzcfiVar = (zzcfi) obj;
                this.zza.zza(zzcfiVar);
                return zzcfiVar;
            }
        }, this.zzg);
        this.zzn = listenableFutureZzm;
        zzcaq.zza(listenableFutureZzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbir zzbirVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzfye.zzr(listenableFuture, new zzdms(this, str, zzbirVar), this.zzg);
    }

    public final void zzj(WeakReference weakReference, String str, zzbir zzbirVar) {
        zzi(str, new zzdna(this, weakReference, str, zzbirVar, null));
    }

    public final synchronized void zzk(String str, zzbir zzbirVar) {
        ListenableFuture listenableFuture = this.zzn;
        if (listenableFuture == null) {
            return;
        }
        zzfye.zzr(listenableFuture, new zzdmt(this, str, zzbirVar), this.zzg);
    }
}
