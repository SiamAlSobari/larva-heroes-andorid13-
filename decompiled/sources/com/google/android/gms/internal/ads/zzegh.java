package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegh implements zzegb {
    private final zzdgm zza;
    private final zzfyo zzb;
    private final zzdks zzc;
    private final zzfcx zzd;
    private final zzdnh zze;

    public zzegh(zzdgm zzdgmVar, zzfyo zzfyoVar, zzdks zzdksVar, zzfcx zzfcxVar, zzdnh zzdnhVar) {
        this.zza = zzdgmVar;
        this.zzb = zzfyoVar;
        this.zzc = zzdksVar;
        this.zzd = zzfcxVar;
        this.zze = zzdnhVar;
    }

    private final ListenableFuture zzg(final zzfbr zzfbrVar, final zzfbe zzfbeVar, final JSONObject jSONObject) {
        final ListenableFuture listenableFutureZza = this.zzd.zza();
        final ListenableFuture listenableFutureZza2 = this.zzc.zza(zzfbrVar, zzfbeVar, jSONObject);
        return zzfye.zzc(listenableFutureZza, listenableFutureZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(listenableFutureZza2, listenableFutureZza, zzfbrVar, zzfbeVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final ListenableFuture zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        return zzfye.zzn(zzfye.zzn(this.zzd.zza(), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzege
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zze(zzfbeVar, (zzdnb) obj);
            }
        }, this.zzb), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzegf
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzf(zzfbrVar, zzfbeVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzfbk zzfbkVar = zzfbeVar.zzt;
        return (zzfbkVar == null || zzfbkVar.zzc == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdhx zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfbr zzfbrVar, zzfbe zzfbeVar, JSONObject jSONObject) throws Exception {
        zzdic zzdicVar = (zzdic) listenableFuture.get();
        zzdnb zzdnbVar = (zzdnb) listenableFuture2.get();
        zzdid zzdidVarZzd = this.zza.zzd(new zzcst(zzfbrVar, zzfbeVar, null), new zzdio(zzdicVar), new zzdhb(jSONObject, zzdnbVar));
        zzdidVarZzd.zzh().zzb();
        zzdidVarZzd.zzk().zza(zzdnbVar);
        zzdidVarZzd.zzg().zza(zzdicVar.zzs());
        zzdidVarZzd.zzl().zza(this.zze);
        return zzdidVarZzd.zza();
    }

    final /* synthetic */ ListenableFuture zzd(zzdnb zzdnbVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzfye.zzh(zzdnbVar));
        if (jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS)) {
            return zzfye.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbmx("process json failed");
    }

    final /* synthetic */ ListenableFuture zze(zzfbe zzfbeVar, final zzdnb zzdnbVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzii)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfbeVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfye.zzn(zzdnbVar.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzegd
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzdnbVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzf(zzfbr zzfbrVar, zzfbe zzfbeVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfye.zzg(new zzdve(3));
        }
        if (zzfbrVar.zza.zza.zzk <= 1) {
            return zzfye.zzm(zzg(zzfbrVar, zzfbeVar, jSONArray.getJSONObject(0)), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzegg
                @Override // com.google.android.gms.internal.ads.zzfqw
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzfye.zzh((zzdhx) obj));
                }
            }, this.zzb);
        }
        int length = jSONArray.length();
        this.zzd.zzc(Math.min(length, zzfbrVar.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfbrVar.zza.zza.zzk);
        for (int i = 0; i < zzfbrVar.zza.zza.zzk; i++) {
            if (i < length) {
                arrayList.add(zzg(zzfbrVar, zzfbeVar, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzfye.zzg(new zzdve(3)));
            }
        }
        return zzfye.zzh(arrayList);
    }
}
