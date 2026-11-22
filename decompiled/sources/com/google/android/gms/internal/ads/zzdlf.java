package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlf {
    private final Context zza;
    private final zzdko zzb;
    private final zzaqx zzc;
    private final zzcag zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzaxe zzf;
    private final Executor zzg;
    private final zzbek zzh;
    private final zzdlx zzi;
    private final zzdom zzj;
    private final ScheduledExecutorService zzk;
    private final zzdnh zzl;
    private final zzdrh zzm;
    private final zzfgo zzn;
    private final zzfik zzo;
    private final zzech zzp;
    private final zzecs zzq;

    public zzdlf(Context context, zzdko zzdkoVar, zzaqx zzaqxVar, zzcag zzcagVar, com.google.android.gms.ads.internal.zza zzaVar, zzaxe zzaxeVar, Executor executor, zzfca zzfcaVar, zzdlx zzdlxVar, zzdom zzdomVar, ScheduledExecutorService scheduledExecutorService, zzdrh zzdrhVar, zzfgo zzfgoVar, zzfik zzfikVar, zzech zzechVar, zzdnh zzdnhVar, zzecs zzecsVar) {
        this.zza = context;
        this.zzb = zzdkoVar;
        this.zzc = zzaqxVar;
        this.zzd = zzcagVar;
        this.zze = zzaVar;
        this.zzf = zzaxeVar;
        this.zzg = executor;
        this.zzh = zzfcaVar.zzi;
        this.zzi = zzdlxVar;
        this.zzj = zzdomVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdrhVar;
        this.zzn = zzfgoVar;
        this.zzo = zzfikVar;
        this.zzp = zzechVar;
        this.zzl = zzdnhVar;
        this.zzq = zzecsVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(jSONObjectOptJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzfud.zzl();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfud.zzl();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzel zzelVarZzr = zzr(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzelVarZzr != null) {
                arrayList.add(zzelVarZzr);
            }
        }
        return zzfud.zzj(arrayList);
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, Object obj) {
        final Object obj2 = null;
        return zzfye.zzf(listenableFuture, Exception.class, new zzfxl(obj2) { // from class: com.google.android.gms.internal.ads.zzdlc
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzfye.zzh(null);
            }
        }, zzcan.zzf);
    }

    private static ListenableFuture zzm(boolean z, final ListenableFuture listenableFuture, Object obj) {
        return z ? zzfye.zzn(listenableFuture, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdla
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj2) {
                return obj2 != null ? listenableFuture : zzfye.zzg(new zzehf(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcan.zzf) : zzl(listenableFuture, null);
    }

    private final ListenableFuture zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfye.zzh(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return zzfye.zzh(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzfye.zzh(new zzbei(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfye.zzm(this.zzb.zzb(strOptString, dOptDouble, zOptBoolean), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdld
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                String str = strOptString;
                return new zzbei(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.zzg), null);
    }

    private final ListenableFuture zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfye.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzfye.zzm(zzfye.zzd(arrayList), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdlb
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbei zzbeiVar : (List) obj) {
                    if (zzbeiVar != null) {
                        arrayList2.add(zzbeiVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfbe zzfbeVar, zzfbi zzfbiVar) {
        final ListenableFuture listenableFutureZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfbeVar, zzfbiVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfye.zzn(listenableFutureZzb, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdle
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) throws zzehf {
                ListenableFuture listenableFuture = listenableFutureZzb;
                zzcfi zzcfiVar = (zzcfi) obj;
                if (zzcfiVar == null || zzcfiVar.zzq() == null) {
                    throw new zzehf(1, "Retrieve video view in html5 ad response failed.");
                }
                return listenableFuture;
            }
        }, zzcan.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(strOptString, strOptString2);
    }

    final /* synthetic */ zzbef zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzq = zzq(jSONObject, "bg_color");
        Integer numZzq2 = zzq(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbef(strOptString, list, numZzq, numZzq2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    final /* synthetic */ ListenableFuture zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfbe zzfbeVar, zzfbi zzfbiVar, String str, String str2, Object obj) throws Exception {
        zzcfi zzcfiVarZza = this.zzj.zza(zzqVar, zzfbeVar, zzfbiVar);
        final zzcar zzcarVarZza = zzcar.zza(zzcfiVarZza);
        zzdne zzdneVarZzb = this.zzl.zzb();
        zzcfiVarZza.zzN().zzM(zzdneVarZzb, zzdneVarZzb, zzdneVarZzb, zzdneVarZzb, zzdneVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzdneVarZzb, null, null, null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdB)).booleanValue()) {
            zzcfiVarZza.zzad("/getNativeAdViewSignals", zzbiq.zzs);
        }
        zzcfiVarZza.zzad("/getNativeClickMeta", zzbiq.zzt);
        zzcfiVarZza.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdkz
            @Override // com.google.android.gms.internal.ads.zzcgt
            public final void zza(boolean z, int i, String str3, String str4) {
                zzcar zzcarVar = zzcarVarZza;
                if (z) {
                    zzcarVar.zzb();
                    return;
                }
                zzcarVar.zzd(new zzehf(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcfiVarZza.zzab(str, str2, null);
        return zzcarVarZza;
    }

    final /* synthetic */ ListenableFuture zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcfi zzcfiVarZza = zzcfu.zza(this.zza, zzcgx.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzq);
        final zzcar zzcarVarZza = zzcar.zza(zzcfiVarZza);
        zzcfiVarZza.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdkv
            @Override // com.google.android.gms.internal.ads.zzcgt
            public final void zza(boolean z, int i, String str2, String str3) {
                zzcarVarZza.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeU)).booleanValue()) {
            zzcfiVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zzcfiVarZza.loadData(str, "text/html", "UTF-8");
        }
        return zzcarVarZza;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzfye.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzm(jSONObjectOptJSONObject.optBoolean("require"), zzfye.zzm(zzo(jSONArrayOptJSONArray, false, true), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdkw
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return this.zza.zza(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final ListenableFuture zzf(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        zzbek zzbekVar = this.zzh;
        return zzo(jSONArrayOptJSONArray, zzbekVar.zzb, zzbekVar.zzd);
    }

    public final ListenableFuture zzg(JSONObject jSONObject, String str, final zzfbe zzfbeVar, final zzfbi zzfbiVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjn)).booleanValue()) {
            return zzfye.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfye.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzfye.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzq zzqVarZzk = zzk(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzfye.zzh(null);
        }
        final ListenableFuture listenableFutureZzn = zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdkx
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzqVarZzk, zzfbeVar, zzfbiVar, strOptString, strOptString2, obj);
            }
        }, zzcan.zze);
        return zzfye.zzn(listenableFutureZzn, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdky
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) throws zzehf {
                ListenableFuture listenableFuture = listenableFutureZzn;
                if (((zzcfi) obj) != null) {
                    return listenableFuture;
                }
                throw new zzehf(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcan.zzf);
    }

    public final ListenableFuture zzh(JSONObject jSONObject, zzfbe zzfbeVar, zzfbi zzfbiVar) {
        ListenableFuture listenableFutureZza;
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "html_containers", "instream");
        if (jSONObjectZzg != null) {
            return zzp(jSONObjectZzg, zzfbeVar, zzfbiVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzfye.zzh(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjm)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z) {
                listenableFutureZza = this.zzi.zza(jSONObjectOptJSONObject);
            }
            return zzl(zzfye.zzo(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdC)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        if (!z) {
            zzcaa.zzj("Required field 'vast_xml' or 'html' is missing");
            return zzfye.zzh(null);
        }
        listenableFutureZza = zzp(jSONObjectOptJSONObject, zzfbeVar, zzfbiVar);
        return zzl(zzfye.zzo(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdC)).intValue(), TimeUnit.SECONDS, this.zzk), null);
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i, i2));
    }
}
