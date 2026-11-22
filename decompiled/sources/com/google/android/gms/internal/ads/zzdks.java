package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdks {
    private final zzfyo zza;
    private final zzdlf zzb;
    private final zzdlk zzc;

    public zzdks(zzfyo zzfyoVar, zzdlf zzdlfVar, zzdlk zzdlkVar) {
        this.zza = zzfyoVar;
        this.zzb = zzdlfVar;
        this.zzc = zzdlkVar;
    }

    public final ListenableFuture zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        ListenableFuture listenableFutureZzh;
        final ListenableFuture listenableFutureZzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdkq
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzehf {
                zzfbr zzfbrVar2 = zzfbrVar;
                zzfbe zzfbeVar2 = zzfbeVar;
                JSONObject jSONObject2 = jSONObject;
                zzdic zzdicVar = new zzdic();
                zzdicVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdicVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                zzdicVar.zzV(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null);
                zzfca zzfcaVar = zzfbrVar2.zza.zza;
                if (!zzfcaVar.zzg.contains(Integer.toString(zzdicVar.zzc()))) {
                    throw new zzehf(1, "Invalid template ID: " + zzdicVar.zzc());
                }
                if (zzdicVar.zzc() == 3) {
                    if (zzdicVar.zzA() == null) {
                        throw new zzehf(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfcaVar.zzh.contains(zzdicVar.zzA())) {
                        throw new zzehf(1, "Unexpected custom template id in the response.");
                    }
                }
                zzdicVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                String strOptString = jSONObject2.optString("headline", null);
                if (zzfbeVar2.zzN) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    strOptString = com.google.android.gms.ads.internal.util.zzs.zzv() + " : " + strOptString;
                }
                zzdicVar.zzZ("headline", strOptString);
                zzdicVar.zzZ("body", jSONObject2.optString("body", null));
                zzdicVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdicVar.zzZ("store", jSONObject2.optString("store", null));
                zzdicVar.zzZ("price", jSONObject2.optString("price", null));
                zzdicVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                return zzdicVar;
            }
        });
        final ListenableFuture listenableFutureZzf = this.zzb.zzf(jSONObject, "images");
        final ListenableFuture listenableFutureZzg = this.zzb.zzg(jSONObject, "images", zzfbeVar, zzfbrVar.zzb.zzb);
        final ListenableFuture listenableFutureZze = this.zzb.zze(jSONObject, "secondary_image");
        final ListenableFuture listenableFutureZze2 = this.zzb.zze(jSONObject, "app_icon");
        final ListenableFuture listenableFutureZzd = this.zzb.zzd(jSONObject, "attribution");
        final ListenableFuture listenableFutureZzh2 = this.zzb.zzh(jSONObject, zzfbeVar, zzfbrVar.zzb.zzb);
        final ListenableFuture listenableFutureZza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdlf zzdlfVar = this.zzb;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            listenableFutureZzh = TextUtils.isEmpty(strOptString) ? zzfye.zzh(null) : zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdku
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    return zzdlfVar.zzc(strOptString, obj);
                }
            }, zzcan.zze);
        } else {
            listenableFutureZzh = zzfye.zzh(null);
        }
        final ListenableFuture listenableFuture = listenableFutureZzh;
        ArrayList arrayList = new ArrayList();
        arrayList.add(listenableFutureZzb);
        arrayList.add(listenableFutureZzf);
        arrayList.add(listenableFutureZzg);
        arrayList.add(listenableFutureZze);
        arrayList.add(listenableFutureZze2);
        arrayList.add(listenableFutureZzd);
        arrayList.add(listenableFutureZzh2);
        arrayList.add(listenableFutureZza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
            arrayList.add(listenableFuture);
        }
        return zzfye.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdkr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ListenableFuture listenableFuture2 = listenableFutureZzb;
                ListenableFuture listenableFuture3 = listenableFutureZzf;
                ListenableFuture listenableFuture4 = listenableFutureZze2;
                ListenableFuture listenableFuture5 = listenableFutureZze;
                ListenableFuture listenableFuture6 = listenableFutureZzd;
                JSONObject jSONObject2 = jSONObject;
                ListenableFuture listenableFuture7 = listenableFutureZzh2;
                ListenableFuture listenableFuture8 = listenableFutureZzg;
                ListenableFuture listenableFuture9 = listenableFuture;
                ListenableFuture listenableFuture10 = listenableFutureZza;
                zzdic zzdicVar = (zzdic) listenableFuture2.get();
                zzdicVar.zzP((List) listenableFuture3.get());
                zzdicVar.zzM((zzbew) listenableFuture4.get());
                zzdicVar.zzQ((zzbew) listenableFuture5.get());
                zzdicVar.zzJ((zzbeo) listenableFuture6.get());
                zzdicVar.zzS(zzdlf.zzj(jSONObject2));
                zzdicVar.zzL(zzdlf.zzi(jSONObject2));
                zzcfi zzcfiVar = (zzcfi) listenableFuture7.get();
                if (zzcfiVar != null) {
                    zzdicVar.zzad(zzcfiVar);
                    zzdicVar.zzac(zzcfiVar.zzF());
                    zzdicVar.zzab(zzcfiVar.zzq());
                }
                zzcfi zzcfiVar2 = (zzcfi) listenableFuture8.get();
                if (zzcfiVar2 != null) {
                    zzdicVar.zzO(zzcfiVar2);
                    zzdicVar.zzae(zzcfiVar2.zzF());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
                    zzdicVar.zzU(listenableFuture9);
                    zzdicVar.zzX(new zzcas());
                } else {
                    zzcfi zzcfiVar3 = (zzcfi) listenableFuture9.get();
                    if (zzcfiVar3 != null) {
                        zzdicVar.zzT(zzcfiVar3);
                    }
                }
                for (zzdlj zzdljVar : (List) listenableFuture10.get()) {
                    if (zzdljVar.zza != 1) {
                        zzdicVar.zzN(zzdljVar.zzb, zzdljVar.zzd);
                    } else {
                        zzdicVar.zzZ(zzdljVar.zzb, zzdljVar.zzc);
                    }
                }
                return zzdicVar;
            }
        }, this.zza);
    }
}
