package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedf implements zzedg {
    static /* synthetic */ zzfip zzc(String str, String str2, String str3, zzedh zzedhVar, String str4, WebView webView, String str5, String str6, zzedi zzediVar) {
        zzfiz zzfizVarZza = zzfiz.zza("Google", str2);
        zzfiy zzfiyVarZzm = zzm("javascript");
        zzfiu zzfiuVarZzk = zzk(zzedhVar.toString());
        if (zzfiyVarZzm == zzfiy.NONE) {
            zzcaa.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfiuVarZzk == null) {
            zzcaa.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzedhVar))));
            return null;
        }
        zzfiy zzfiyVarZzm2 = zzm(str4);
        if (zzfiuVarZzk == zzfiu.VIDEO && zzfiyVarZzm2 == zzfiy.NONE) {
            zzcaa.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return zzfip.zza(zzfiq.zza(zzfiuVarZzk, zzl(zzediVar.toString()), zzfiyVarZzm, zzfiyVarZzm2, true), zzfir.zzb(zzfizVarZza, webView, str5, ""));
    }

    static /* synthetic */ zzfip zzd(String str, String str2, String str3, String str4, zzedh zzedhVar, WebView webView, String str5, String str6, zzedi zzediVar) {
        zzfiz zzfizVarZza = zzfiz.zza(str, str2);
        zzfiy zzfiyVarZzm = zzm("javascript");
        zzfiy zzfiyVarZzm2 = zzm(str4);
        zzfiu zzfiuVarZzk = zzk(zzedhVar.toString());
        if (zzfiyVarZzm == zzfiy.NONE) {
            zzcaa.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfiuVarZzk == null) {
            zzcaa.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzedhVar))));
            return null;
        }
        if (zzfiuVarZzk == zzfiu.VIDEO && zzfiyVarZzm2 == zzfiy.NONE) {
            zzcaa.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return zzfip.zza(zzfiq.zza(zzfiuVarZzk, zzl(zzediVar.toString()), zzfiyVarZzm, zzfiyVarZzm2, true), zzfir.zzc(zzfizVarZza, webView, str5, ""));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfiu zzk(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("video")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzfiu.HTML_DISPLAY;
        }
        if (b == 1) {
            return zzfiu.NATIVE_DISPLAY;
        }
        if (b != 2) {
            return null;
        }
        return zzfiu.VIDEO;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfix zzl(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("beginToRender")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzfix.BEGIN_TO_RENDER;
        }
        if (b != 1) {
            return b != 2 ? zzfix.UNSPECIFIED : zzfix.ONE_PIXEL;
        }
        return zzfix.DEFINED_BY_JAVASCRIPT;
    }

    private static zzfiy zzm(String str) {
        if ("native".equals(str)) {
            return zzfiy.NATIVE;
        }
        return "javascript".equals(str) ? zzfiy.JAVASCRIPT : zzfiy.NONE;
    }

    private static final Object zzn(zzede zzedeVar) {
        try {
            return zzedeVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "omid exception");
            return null;
        }
    }

    private static final void zzo(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final zzfip zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzedi zzediVar, final zzedh zzedhVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() || !zzfin.zzb()) {
            return null;
        }
        final String str6 = "";
        final String str7 = "javascript";
        final String str8 = "Google";
        return (zzfip) zzn(new zzede(str8, str, str7, zzedhVar, str4, webView, str5, str6, zzediVar) { // from class: com.google.android.gms.internal.ads.zzedb
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzedh zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzedi zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzedhVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzediVar;
            }

            @Override // com.google.android.gms.internal.ads.zzede
            public final Object zza() {
                return zzedf.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final zzfip zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzedi zzediVar, final zzedh zzedhVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() || !zzfin.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzfip) zzn(new zzede(str5, str, str8, str4, zzedhVar, webView, str6, str7, zzediVar) { // from class: com.google.android.gms.internal.ads.zzedc
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzedh zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzedi zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzedhVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzediVar;
            }

            @Override // com.google.android.gms.internal.ads.zzede
            public final Object zza() {
                return zzedf.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final String zze(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue()) {
            return (String) zzn(new zzede() { // from class: com.google.android.gms.internal.ads.zzecy
                @Override // com.google.android.gms.internal.ads.zzede
                public final Object zza() {
                    return "a.1.4.6-google_20230720";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final void zzf(final zzfip zzfipVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecx
            @Override // java.lang.Runnable
            public final void run() {
                zzfip zzfipVar2 = zzfipVar;
                View view2 = view;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && zzfin.zzb()) {
                    zzfipVar2.zzb(view2, zzfiw.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final void zzg(final zzfip zzfipVar) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // java.lang.Runnable
            public final void run() {
                zzfip zzfipVar2 = zzfipVar;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && zzfin.zzb()) {
                    zzfipVar2.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final void zzh(final zzfip zzfipVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecw
            @Override // java.lang.Runnable
            public final void run() {
                zzfip zzfipVar2 = zzfipVar;
                View view2 = view;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && zzfin.zzb()) {
                    zzfipVar2.zzd(view2);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final void zzi(final zzfip zzfipVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && zzfin.zzb()) {
            zzfipVar.getClass();
            zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecz
                @Override // java.lang.Runnable
                public final void run() {
                    zzfipVar.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final boolean zzj(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue()) {
            Boolean bool = (Boolean) zzn(new zzede() { // from class: com.google.android.gms.internal.ads.zzedd
                @Override // com.google.android.gms.internal.ads.zzede
                public final Object zza() {
                    Context context2 = context;
                    if (zzfin.zzb()) {
                        return true;
                    }
                    zzfin.zza(context2);
                    return Boolean.valueOf(zzfin.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        zzcaa.zzj("Omid flag is disabled");
        return false;
    }
}
