package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzy extends zzbuc {
    private final Context zza;
    private final zzetx zzb;
    private final zzetv zzc;
    private final zzeag zzd;
    private final zzfyo zze;
    private final zzead zzf;
    private final zzbuz zzg;

    zzdzy(Context context, zzetx zzetxVar, zzetv zzetvVar, zzead zzeadVar, zzeag zzeagVar, zzfyo zzfyoVar, zzbuz zzbuzVar) {
        this.zza = context;
        this.zzb = zzetxVar;
        this.zzc = zzetvVar;
        this.zzf = zzeadVar;
        this.zzd = zzeagVar;
        this.zze = zzfyoVar;
        this.zzg = zzbuzVar;
    }

    private final void zzc(ListenableFuture listenableFuture, zzbug zzbugVar) {
        zzfye.zzr(zzfye.zzn(zzfxv.zzu(listenableFuture), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzfye.zzh(zzfda.zza((InputStream) obj));
            }
        }, zzcan.zza), new zzdzx(this, zzbugVar), zzcan.zzf);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    public final ListenableFuture zzb(zzbtv zzbtvVar, int i) {
        ListenableFuture listenableFutureZzh;
        String str = zzbtvVar.zza;
        int i2 = zzbtvVar.zzb;
        Bundle bundle = zzbtvVar.zzc;
        HashMap map = new HashMap();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (string != null) {
                    map.put(str2, string);
                }
            }
        }
        final zzeaa zzeaaVar = new zzeaa(str, i2, map, zzbtvVar.zzd, "", zzbtvVar.zze);
        zzetv zzetvVar = this.zzc;
        zzetvVar.zza(new zzevc(zzbtvVar));
        zzetw zzetwVarZzb = zzetvVar.zzb();
        if (zzeaaVar.zzf) {
            String str3 = zzbtvVar.zza;
            String str4 = (String) zzbdq.zzb.zze();
            if (TextUtils.isEmpty(str4)) {
                listenableFutureZzh = zzfye.zzh(zzeaaVar);
            } else {
                String host = Uri.parse(str3).getHost();
                if (TextUtils.isEmpty(host)) {
                    listenableFutureZzh = zzfye.zzh(zzeaaVar);
                } else {
                    Iterator it = zzfrv.zzc(zzfqt.zzc(';')).zzd(str4).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            listenableFutureZzh = zzfye.zzm(zzetwVarZzb.zza().zza(new JSONObject()), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdzw
                                @Override // com.google.android.gms.internal.ads.zzfqw
                                public final Object apply(Object obj) {
                                    zzeaa zzeaaVar2 = zzeaaVar;
                                    zzeag.zza(zzeaaVar2.zzc, (JSONObject) obj);
                                    return zzeaaVar2;
                                }
                            }, this.zze);
                        }
                    }
                    listenableFutureZzh = zzfye.zzh(zzeaaVar);
                }
            }
        } else {
            listenableFutureZzh = zzfye.zzh(zzeaaVar);
        }
        zzfge zzfgeVarZzb = zzetwVarZzb.zzb();
        return zzfye.zzn(zzfgeVarZzb.zzb(zzffy.HTTP, listenableFutureZzh).zze(new zzeac(this.zza, "", this.zzg, i)).zza(), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzs
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) throws JSONException {
                zzeab zzeabVar = (zzeab) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzeabVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str5 : zzeabVar.zzb.keySet()) {
                        if (str5 != null) {
                            List<String> list = (List) zzeabVar.zzb.get(str5);
                            JSONArray jSONArray = new JSONArray();
                            for (String str6 : list) {
                                if (str6 != null) {
                                    jSONArray.put(str6);
                                }
                            }
                            jSONObject2.put(str5, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzeabVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzeabVar.zzd);
                    return zzfye.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    zzcaa.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zze(zzbtv zzbtvVar, zzbug zzbugVar) {
        zzc(zzb(zzbtvVar, Binder.getCallingUid()), zzbugVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzf(zzbtr zzbtrVar, zzbug zzbugVar) {
        int callingUid = Binder.getCallingUid();
        zzetx zzetxVar = this.zzb;
        zzetxVar.zza(new zzetm(zzbtrVar, callingUid));
        final zzety zzetyVarZzb = zzetxVar.zzb();
        zzfge zzfgeVarZzb = zzetyVarZzb.zzb();
        zzffj zzffjVarZza = zzfgeVarZzb.zzb(zzffy.GMS_SIGNALS, zzfye.zzi()).zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzv
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzetyVarZzb.zza().zza(new JSONObject());
            }
        }).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzdzu
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzt
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzfye.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zzffjVarZza, zzbugVar);
        if (((Boolean) zzbdk.zzd.zze()).booleanValue()) {
            final zzeag zzeagVar = this.zzd;
            zzeagVar.getClass();
            zzffjVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzr
                @Override // java.lang.Runnable
                public final void run() {
                    zzeagVar.zzb();
                }
            }, this.zze);
        }
    }
}
