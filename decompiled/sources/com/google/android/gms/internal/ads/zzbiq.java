package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbiq {
    public static final zzbir zza = new zzbir() { // from class: com.google.android.gms.internal.ads.zzbhs
        @Override // com.google.android.gms.internal.ads.zzbir
        public final void zza(Object obj, Map map) {
            zzcgj zzcgjVar = (zzcgj) obj;
            zzbir zzbirVar = zzbiq.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zzcaa.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzcgjVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                map2.put(str2, boolValueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((zzbll) zzcgjVar).zzd("openableURLs", map2);
        }
    };
    public static final zzbir zzb = new zzbir() { // from class: com.google.android.gms.internal.ads.zzbhu
        @Override // com.google.android.gms.internal.ads.zzbir
        public final void zza(Object obj, Map map) {
            zzcgj zzcgjVar = (zzcgj) obj;
            zzbir zzbirVar = zzbiq.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhS)).booleanValue()) {
                zzcaa.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                zzcaa.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzcgjVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
            ((zzbll) zzcgjVar).zzd("openableApp", map2);
        }
    };
    public static final zzbir zzc = new zzbir() { // from class: com.google.android.gms.internal.ads.zzbhl
        @Override // com.google.android.gms.internal.ads.zzbir
        public final void zza(Object obj, Map map) {
            zzbiq.zzb((zzcgj) obj, map);
        }
    };
    public static final zzbir zzd = new zzbii();
    public static final zzbir zze = new zzbij();
    public static final zzbir zzf = new zzbir() { // from class: com.google.android.gms.internal.ads.zzbhq
        @Override // com.google.android.gms.internal.ads.zzbir
        public final void zza(Object obj, Map map) {
            zzcgj zzcgjVar = (zzcgj) obj;
            zzbir zzbirVar = zzbiq.zza;
            String str = (String) map.get("u");
            if (str == null) {
                zzcaa.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzby(zzcgjVar.getContext(), ((zzcgr) zzcgjVar).zzn().zza, str).zzb();
            }
        }
    };
    public static final zzbir zzg = new zzbik();
    public static final zzbir zzh = new zzbil();
    public static final zzbir zzi = new zzbir() { // from class: com.google.android.gms.internal.ads.zzbhp
        @Override // com.google.android.gms.internal.ads.zzbir
        public final void zza(Object obj, Map map) {
            zzcgq zzcgqVar = (zzcgq) obj;
            zzbir zzbirVar = zzbiq.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i = Integer.parseInt(str);
                int i2 = Integer.parseInt(str2);
                int i3 = Integer.parseInt(str3);
                zzaqx zzaqxVarZzI = zzcgqVar.zzI();
                if (zzaqxVarZzI != null) {
                    zzaqxVarZzI.zzc().zzl(i, i2, i3);
                }
            } catch (NumberFormatException unused) {
                zzcaa.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbir zzj = new zzbim();
    public static final zzbir zzk = new zzbin();
    public static final zzbir zzl = new zzcdi();
    public static final zzbir zzm = new zzcdj();
    public static final zzbir zzn = new zzbhk();
    public static final zzbjg zzo = new zzbjg();
    public static final zzbir zzp = new zzbio();
    public static final zzbir zzq = new zzbip();
    public static final zzbir zzr = new zzbhv();
    public static final zzbir zzs = new zzbhw();
    public static final zzbir zzt = new zzbhx();
    public static final zzbir zzu = new zzbhy();
    public static final zzbir zzv = new zzbhz();
    public static final zzbir zzw = new zzbia();
    public static final zzbir zzx = new zzbib();
    public static final zzbir zzy = new zzbic();
    public static final zzbir zzz = new zzbid();
    public static final zzbir zzA = new zzbie();
    public static final zzbir zzB = new zzbig();
    public static final zzbir zzC = new zzbih();

    public static ListenableFuture zza(zzcfi zzcfiVar, String str) {
        Uri uriZza = Uri.parse(str);
        try {
            zzaqx zzaqxVarZzI = zzcfiVar.zzI();
            if (zzaqxVarZzI != null && zzaqxVarZzI.zzf(uriZza)) {
                uriZza = zzaqxVarZzI.zza(uriZza, zzcfiVar.getContext(), zzcfiVar.zzF(), zzcfiVar.zzi());
            }
        } catch (zzaqy unused) {
            zzcaa.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String strZzb = zzbyh.zzb(uriZza, zzcfiVar.getContext());
        long jLongValue = ((Long) zzbdj.zze.zze()).longValue();
        return (jLongValue <= 0 || jLongValue > 233012802) ? zzfye.zzh(strZzb) : zzfye.zze(zzfye.zzm(zzfye.zze(zzfxv.zzu(zzcfiVar.zzR()), Throwable.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzbhm
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbir zzbirVar = zzbiq.zza;
                if (!((Boolean) zzbdj.zzk.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        }, zzcan.zzf), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzbhn
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                String str2;
                String str3;
                Uri uri;
                String strReplace = strZzb;
                String str4 = (String) obj;
                zzbir zzbirVar = zzbiq.zza;
                if (str4 != null) {
                    if (((Boolean) zzbdj.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (host.endsWith(strArr[i])) {
                                str2 = (String) zzbdj.zza.zze();
                                str3 = (String) zzbdj.zzb.zze();
                                if (!TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (String) zzbdj.zza.zze();
                        str3 = (String) zzbdj.zzb.zze();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzcan.zzf), Throwable.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzbho
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                String str2 = strZzb;
                Throwable th = (Throwable) obj;
                zzbir zzbirVar = zzbiq.zza;
                if (((Boolean) zzbdj.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, zzcan.zzf);
    }

    static /* synthetic */ void zzb(zzcgj zzcgjVar, Map map) {
        Intent uri;
        PackageManager packageManager = zzcgjVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e) {
                                zzcaa.zzh("Error parsing the url: ".concat(String.valueOf(strOptString7)), e);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (NullPointerException e2) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzu(e2, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (JSONException e3) {
                            zzcaa.zzh("Error constructing openable urls response.", e3);
                        }
                    } catch (JSONException e4) {
                        zzcaa.zzh("Error parsing the intent data.", e4);
                    }
                }
                ((zzbll) zzcgjVar).zze("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbll) zzcgjVar).zze("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbll) zzcgjVar).zze("openableIntents", new JSONObject());
        }
    }

    public static void zzc(Map map, zzddw zzddwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjK)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzddwVar != null) {
            zzddwVar.zzbK();
        }
    }
}
