package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbjc implements zzbir {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdrh zzb;
    private final zzfgo zzc;
    private final zzbqz zze;
    private final zzech zzf;
    private final zzcob zzg;
    private com.google.android.gms.ads.internal.overlay.zzx zzh = null;
    private final zzfyo zzi = zzcan.zzf;
    private final zzcaf zzd = new zzcaf(null);

    public zzbjc(com.google.android.gms.ads.internal.zzb zzbVar, zzbqz zzbqzVar, zzech zzechVar, zzdrh zzdrhVar, zzfgo zzfgoVar, zzcob zzcobVar) {
        this.zza = zzbVar;
        this.zze = zzbqzVar;
        this.zzf = zzechVar;
        this.zzb = zzdrhVar;
        this.zzc = zzfgoVar;
        this.zzg = zzcobVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzc(Context context, zzaqx zzaqxVar, Uri uri, View view, Activity activity) {
        if (zzaqxVar == null) {
            return uri;
        }
        try {
            return zzaqxVar.zze(uri) ? zzaqxVar.zza(uri, context, view, activity) : uri;
        } catch (zzaqy unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzcaa.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:119:0x02d5  */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z;
        HashMap map2;
        String string;
        zzcfi zzcfiVar = (zzcfi) zzaVar;
        zzfbe zzfbeVarZzD = zzcfiVar.zzD();
        zzfbi zzfbiVarZzP = zzcfiVar.zzP();
        boolean z2 = false;
        if (zzfbeVarZzD == null || zzfbiVarZzP == null) {
            str3 = "";
            z = false;
        } else {
            z = zzfbeVarZzD.zzaj;
            str3 = zzfbiVarZzP.zzb;
        }
        boolean z3 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjJ)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcfiVar.zzaA()) {
                zzcaa.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzcgn) zzaVar).zzaF(zzf(map), zzb(map), z3);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            if (str != null) {
                ((zzcgn) zzaVar).zzaG(zzf(map), zzb(map), str, z3);
                return;
            } else {
                ((zzcgn) zzaVar).zzaH(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z3);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcfiVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzer)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzex)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzev)).booleanValue()) {
                        z2 = true;
                        break;
                    }
                    String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzew);
                    if (!str4.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        Iterator it = zzfrv.zzc(zzfqt.zzc(';')).zzd(str4).iterator();
                        while (it.hasNext()) {
                            if (((String) it.next()).equals(packageName)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean zZzg = zzbcs.zzg(zzcfiVar.getContext());
            if (z2) {
                if (zZzg) {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        zzcaa.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri uriZzd = zzd(zzc(zzcfiVar.getContext(), zzcfiVar.zzI(), Uri.parse(str), zzcfiVar.zzF(), zzcfiVar.zzi()));
                    if (z && this.zzf != null && zzl(zzaVar, zzcfiVar.getContext(), uriZzd.toString(), str3)) {
                        return;
                    }
                    this.zzh = new zzbiz(this);
                    ((zzcgn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(null, uriZzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzh).asBinder(), true), z3);
                    return;
                }
                zzm(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(zzaVar, map, z, str3, z3);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(zzaVar, map, z, str3, z3);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhS)).booleanValue()) {
                zzk(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    zzcaa.zzj("Package name missing from open app action.");
                    return;
                }
                if (z && this.zzf != null && zzl(zzaVar, zzcfiVar.getContext(), str5, str3)) {
                    return;
                }
                PackageManager packageManager = zzcfiVar.getContext().getPackageManager();
                if (packageManager == null) {
                    zzcaa.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((zzcgn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z3);
                    return;
                }
                return;
            }
            return;
        }
        zzk(true);
        String str6 = (String) map.get("intent_url");
        Intent uri = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                uri = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                zzcaa.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e);
            }
        }
        Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZzd2 = zzd(zzc(zzcfiVar.getContext(), zzcfiVar.zzI(), data, zzcfiVar.zzF(), zzcfiVar.zzi()));
                if (TextUtils.isEmpty(intent.getType())) {
                    intent.setData(uriZzd2);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhT)).booleanValue()) {
                        intent.setDataAndType(uriZzd2, intent.getType());
                    } else {
                        intent.setData(uriZzd2);
                    }
                }
            }
        }
        boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzih)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap map3 = new HashMap();
        if (z4) {
            map2 = map3;
            this.zzh = new zzbja(this, z3, zzaVar, map3, map);
            z3 = false;
        } else {
            map2 = map3;
        }
        if (intent != null) {
            if (!z || this.zzf == null || !zzl(zzaVar, zzcfiVar.getContext(), intent.getData().toString(), str3)) {
                ((zzcgn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzh), z3);
                return;
            } else {
                if (z4) {
                    HashMap map4 = map2;
                    map4.put((String) map.get("event_id"), true);
                    ((zzbll) zzaVar).zzd("openIntentAsync", map4);
                    return;
                }
                return;
            }
        }
        HashMap map5 = map2;
        if (TextUtils.isEmpty(str)) {
            string = str;
        } else {
            string = zzd(zzc(zzcfiVar.getContext(), zzcfiVar.zzI(), Uri.parse(str), zzcfiVar.zzF(), zzcfiVar.zzi())).toString();
        }
        if (!z || this.zzf == null || !zzl(zzaVar, zzcfiVar.getContext(), string, str3)) {
            ((zzcgn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), string, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzh), z3);
        } else if (z4) {
            map5.put((String) map.get("event_id"), true);
            ((zzbll) zzaVar).zzd("openIntentAsync", map5);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zzf.zzc(str);
        zzdrh zzdrhVar = this.zzb;
        if (zzdrhVar != null) {
            zzecs.zzc(context, zzdrhVar, this.zzc, this.zzf, str, "dialog_not_shown", zzfug.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0127  */
    /* JADX WARN: Code duplicated, block: B:46:0x0133  */
    private final void zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzc;
        boolean z3 = true;
        zzk(true);
        zzcfi zzcfiVar = (zzcfi) zzaVar;
        Context context = zzcfiVar.getContext();
        zzaqx zzaqxVarZzI = zzcfiVar.zzI();
        View viewZzF = zzcfiVar.zzF();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intentZzb = null;
        Uri uriBuild = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri uriZzd = zzd(zzc(context, zzaqxVarZzI, Uri.parse(str2), viewZzF, null));
            boolean z4 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z5 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzep)).booleanValue()) {
                    z3 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriZzd.getScheme())) {
                uriBuild = uriZzd.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(uriZzd.getScheme())) {
                uriBuild = uriZzd.buildUpon().scheme("http").build();
            }
            ArrayList arrayList = new ArrayList();
            Intent intentZza = zzbjb.zza(uriZzd, context, zzaqxVarZzI, viewZzF);
            Intent intentZza2 = zzbjb.zza(uriBuild, context, zzaqxVarZzI, viewZzF);
            if (z3) {
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, intentZza);
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, intentZza2);
            }
            ResolveInfo resolveInfoZzd = zzbjb.zzd(intentZza, arrayList, context, zzaqxVarZzI, viewZzF);
            if (resolveInfoZzd != null) {
                intentZzb = zzbjb.zzb(intentZza, resolveInfoZzd, context, zzaqxVarZzI, viewZzF);
            } else if (intentZza2 != null && (resolveInfoZzc = zzbjb.zzc(intentZza2, context, zzaqxVarZzI, viewZzF)) != null) {
                intentZzb = zzbjb.zzb(intentZza, resolveInfoZzc, context, zzaqxVarZzI, viewZzF);
                if (zzbjb.zzc(intentZzb, context, zzaqxVarZzI, viewZzF) == null) {
                    if (!arrayList.isEmpty()) {
                        intentZzb = intentZza;
                    } else if (!z5) {
                        if (z4) {
                            intentZzb = zzbjb.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqxVarZzI, viewZzF);
                        } else {
                            intentZzb = intentZza;
                        }
                    } else if (z4) {
                        intentZzb = zzbjb.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqxVarZzI, viewZzF);
                    } else {
                        intentZzb = intentZza;
                    }
                }
            } else if (!arrayList.isEmpty()) {
                intentZzb = intentZza;
            } else if (!z5 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            int i2 = i + 1;
                            if (!it.hasNext()) {
                                i = i2;
                            } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                intentZzb = zzbjb.zzb(intentZza, resolveInfo, context, zzaqxVarZzI, viewZzF);
                            }
                        }
                    } else if (z4) {
                        intentZzb = zzbjb.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqxVarZzI, viewZzF);
                    } else {
                        intentZzb = intentZza;
                    }
                }
            } else if (z4) {
                intentZzb = zzbjb.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqxVarZzI, viewZzF);
            } else {
                intentZzb = intentZza;
            }
        }
        if (!z || this.zzf == null || intentZzb == null || !zzl(zzaVar, zzcfiVar.getContext(), intentZzb.getData().toString(), str)) {
            try {
                ((zzcgn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(intentZzb, this.zzh), z2);
            } catch (ActivityNotFoundException e) {
                zzcaa.zzj(e.getMessage());
            }
        }
    }

    private final void zzk(boolean z) {
        zzbqz zzbqzVar = this.zze;
        if (zzbqzVar != null) {
            zzbqzVar.zza(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r2 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        boolean zBooleanValue;
        zzdrh zzdrhVar = this.zzb;
        if (zzdrhVar != null) {
            zzecs.zzc(context, zzdrhVar, this.zzc, this.zzf, str2, "offline_open", new HashMap());
        }
        if (com.google.android.gms.ads.internal.zzt.zzo().zzx(context)) {
            this.zzf.zzh(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzbrVarZzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zAreNotificationsEnabled = NotificationManagerCompat.from(context).areNotificationsEnabled();
        boolean zZzi = com.google.android.gms.ads.internal.zzt.zzq().zzi(context, "offline_notification_channel");
        zzcfi zzcfiVar = (zzcfi) zzaVar;
        boolean z = zzcfiVar.zzL() != null && zzcfiVar.zzi() == null;
        if (!zAreNotificationsEnabled) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                if (Build.VERSION.SDK_INT < 33) {
                    zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzid)).booleanValue();
                } else {
                    zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzic)).booleanValue();
                }
            }
            zzi(context, str2, "notifications_disabled");
            return false;
        }
        if (zZzi) {
            zzi(context, str2, "notification_channel_disabled");
            return false;
        }
        if (zzbrVarZzw == null) {
            zzi(context, str2, "work_manager_unavailable");
            return false;
        }
        if (z) {
            zzi(context, str2, "ad_no_activity");
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzia)).booleanValue()) {
            zzi(context, str2, "notification_flow_disabled");
            return false;
        }
        if (zzcfiVar.zzL() != null) {
            zzect zzectVarZze = zzecu.zze();
            zzectVarZze.zza(zzcfiVar.zzi());
            zzectVarZze.zzb(null);
            zzectVarZze.zzc(str2);
            zzectVarZze.zzd(str);
            try {
                zzcfiVar.zzL().zzf(zzectVarZze.zze());
            } catch (Exception e) {
                zzi(context, str2, e.getMessage());
                return false;
            }
        } else {
            ((zzcgn) zzaVar).zzaE(str2, str, 14);
        }
        zzaVar.onAdClicked();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i) {
        if (this.zzb == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzdrg zzdrgVarZza = this.zzb.zza();
            zzdrgVarZza.zzb("action", "cct_action");
            zzdrgVarZza.zzb("cct_open_status", zzbcr.zza(i));
            zzdrgVarZza.zzg();
            return;
        }
        zzfgo zzfgoVar = this.zzc;
        String strZza = zzbcr.zza(i);
        zzfgn zzfgnVarZzb = zzfgn.zzb("cct_action");
        zzfgnVarZzb.zza("cct_open_status", strZza);
        zzfgoVar.zzb(zzfgnVarZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcob zzcobVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String strZzc = zzbyh.zzc((String) map.get("u"), ((zzcfi) zzaVar).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzcaa.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzc()) {
            zzfye.zzr((!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjo)).booleanValue() || (zzcobVar = this.zzg) == null) ? zzfye.zzh(strZzc) : zzcobVar.zzc(strZzc, com.google.android.gms.ads.internal.client.zzay.zze()), new zzbiy(this, zzaVar, map, str), this.zzi);
        } else {
            this.zza.zzb(strZzc);
        }
    }
}
