package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.common.net.HttpHeaders;
import com.mrgames.larvaheroesfree.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public class zzcfp extends WebViewClient implements zzcgv {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final zzecs zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzbxb zza;
    private final zzcfi zzc;
    private final zzaxe zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzcgt zzi;
    private zzcgu zzj;
    private zzbhh zzk;
    private zzbhj zzl;
    private zzddw zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.ads.internal.overlay.zzz zzv;
    private zzbre zzw;
    private com.google.android.gms.ads.internal.zzb zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbqz zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfw)).split(",")));

    public zzcfp(zzcfi zzcfiVar, zzaxe zzaxeVar, boolean z, zzbre zzbreVar, zzbqz zzbqzVar, zzecs zzecsVar) {
        this.zzd = zzaxeVar;
        this.zzc = zzcfiVar;
        this.zzs = z;
        this.zzw = zzbreVar;
        this.zzE = zzecsVar;
    }

    private static WebResourceResponse zzN() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaH)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzO(String str, Map map) throws IOException {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                com.google.android.gms.ads.internal.zzt.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().zza, false, httpURLConnection, false, 60000);
                zzbzz zzbzzVar = new zzbzz(null);
                zzbzzVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzbzzVar.zze(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String contentType = httpURLConnection.getContentType();
                    String strTrim = "";
                    String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String contentType2 = httpURLConnection.getContentType();
                    if (!TextUtils.isEmpty(contentType2)) {
                        String[] strArrSplit = contentType2.split(";");
                        if (strArrSplit.length != 1) {
                            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                                if (strArrSplit[i2].trim().startsWith("charset")) {
                                    String[] strArrSplit2 = strArrSplit[i2].trim().split("=");
                                    if (strArrSplit2.length > 1) {
                                        strTrim = strArrSplit2[1].trim();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    String str2 = strTrim;
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    HashMap map2 = new HashMap(headerFields.size());
                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                            map2.put(entry2.getKey(), entry2.getValue().get(0));
                        }
                    }
                    WebResourceResponse webResourceResponseZzc = com.google.android.gms.ads.internal.zzt.zzq().zzc(strTrim2, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map2, httpURLConnection.getInputStream());
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseZzc;
                }
                String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    TrafficStats.clearThreadStatsTag();
                    return null;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    zzcaa.zzj("Protocol is null");
                    WebResourceResponse webResourceResponseZzN = zzN();
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseZzN;
                }
                if (!protocol.equals("http") && !protocol.equals("https")) {
                    zzcaa.zzj("Unsupported scheme: " + protocol);
                    WebResourceResponse webResourceResponseZzN2 = zzN();
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseZzN2;
                }
                zzcaa.zze("Redirecting to " + headerField);
                httpURLConnection.disconnect();
                url = url2;
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbir) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzQ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzR(final View view, final zzbxb zzbxbVar, final int i) {
        if (!zzbxbVar.zzi() || i <= 0) {
            return;
        }
        zzbxbVar.zzg(view);
        if (zzbxbVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(view, zzbxbVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzS(zzcfi zzcfiVar) {
        if (zzcfiVar.zzD() != null) {
            return zzcfiVar.zzD().zzaj;
        }
        return false;
    }

    private static final boolean zzT(boolean z, zzcfi zzcfiVar) {
        return (!z || zzcfiVar.zzO().zzi() || zzcfiVar.zzS().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzj(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaz()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzU();
                return;
            }
            this.zzz = true;
            zzcgu zzcguVar = this.zzj;
            if (zzcguVar != null) {
                zzcguVar.zza();
                this.zzj = null;
            }
            zzg();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzay(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                    case WorkQueueKt.MASK /* 127 */:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZza = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzj(uriZza);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = uriZza.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbxb zzbxbVar = this.zza;
                        if (zzbxbVar != null) {
                            zzbxbVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzddw zzddwVar = this.zzm;
                    if (zzddwVar != null) {
                        zzddwVar.zzbK();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                zzcaa.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzaqx zzaqxVarZzI = this.zzc.zzI();
                    if (zzaqxVarZzI != null && zzaqxVarZzI.zzf(uriZza)) {
                        Context context = this.zzc.getContext();
                        zzcfi zzcfiVar = this.zzc;
                        uriZza = zzaqxVarZzI.zza(uriZza, context, (View) zzcfiVar, zzcfiVar.zzi());
                    }
                } catch (zzaqy unused) {
                    zzcaa.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzx;
                if (zzbVar == null || zzbVar.zzc()) {
                    zzt(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null), true);
                } else {
                    this.zzx.zzb(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzA(zzcgt zzcgtVar) {
        this.zzi = zzcgtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzB(int i, int i2) {
        zzbqz zzbqzVar = this.zzy;
        if (zzbqzVar != null) {
            zzbqzVar.zzd(i, i2);
        }
    }

    public final void zzC(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzD(boolean z) {
        synchronized (this.zzf) {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzE() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzF(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzG(zzcgu zzcguVar) {
        this.zzj = zzcguVar;
    }

    public final void zzH(String str, zzbir zzbirVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbirVar);
        }
    }

    public final void zzI(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbir> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbir zzbirVar : list) {
                if (predicate.apply(zzbirVar)) {
                    arrayList.add(zzbirVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzJ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzK() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzL() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzM(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhh zzbhhVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbhj zzbhjVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, boolean z, zzbit zzbitVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbrg zzbrgVar, zzbxb zzbxbVar, final zzech zzechVar, final zzfik zzfikVar, zzdrh zzdrhVar, zzfgo zzfgoVar, zzbjk zzbjkVar, final zzddw zzddwVar, zzbjj zzbjjVar, zzbjd zzbjdVar, final zzcob zzcobVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbxbVar, null) : zzbVar;
        this.zzy = new zzbqz(this.zzc, zzbrgVar);
        this.zza = zzbxbVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaP)).booleanValue()) {
            zzz("/adMetadata", new zzbhg(zzbhhVar));
        }
        if (zzbhjVar != null) {
            zzz("/appEvent", new zzbhi(zzbhjVar));
        }
        zzz("/backButton", zzbiq.zzj);
        zzz("/refresh", zzbiq.zzk);
        zzz("/canOpenApp", zzbiq.zzb);
        zzz("/canOpenURLs", zzbiq.zza);
        zzz("/canOpenIntents", zzbiq.zzc);
        zzz("/close", zzbiq.zzd);
        zzz("/customClose", zzbiq.zze);
        zzz("/instrument", zzbiq.zzn);
        zzz("/delayPageLoaded", zzbiq.zzp);
        zzz("/delayPageClosed", zzbiq.zzq);
        zzz("/getLocationInfo", zzbiq.zzr);
        zzz("/log", zzbiq.zzg);
        zzz("/mraid", new zzbix(zzbVar2, this.zzy, zzbrgVar));
        zzbre zzbreVar = this.zzw;
        if (zzbreVar != null) {
            zzz("/mraidLoaded", zzbreVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzz("/open", new zzbjc(zzbVar2, this.zzy, zzechVar, zzdrhVar, zzfgoVar, zzcobVar));
        zzz("/precache", new zzcdv());
        zzz("/touch", zzbiq.zzi);
        zzz("/video", zzbiq.zzl);
        zzz("/videoMeta", zzbiq.zzm);
        if (zzechVar == null || zzfikVar == null) {
            zzz("/click", new zzbhr(zzddwVar, zzcobVar));
            zzz("/httpTrack", zzbiq.zzf);
        } else {
            zzz("/click", new zzbir() { // from class: com.google.android.gms.internal.ads.zzfcg
                @Override // com.google.android.gms.internal.ads.zzbir
                public final void zza(Object obj, Map map) {
                    zzddw zzddwVar2 = zzddwVar;
                    zzcob zzcobVar2 = zzcobVar;
                    zzfik zzfikVar2 = zzfikVar;
                    zzech zzechVar2 = zzechVar;
                    zzcfi zzcfiVar = (zzcfi) obj;
                    zzbiq.zzc(map, zzddwVar2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcaa.zzj("URL missing from click GMSG.");
                    } else {
                        zzfye.zzr(zzbiq.zza(zzcfiVar, str), new zzfci(zzcfiVar, zzcobVar2, zzfikVar2, zzechVar2), zzcan.zza);
                    }
                }
            });
            zzz("/httpTrack", new zzbir() { // from class: com.google.android.gms.internal.ads.zzfch
                @Override // com.google.android.gms.internal.ads.zzbir
                public final void zza(Object obj, Map map) {
                    zzfik zzfikVar2 = zzfikVar;
                    zzech zzechVar2 = zzechVar;
                    zzcez zzcezVar = (zzcez) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcaa.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzcezVar.zzD().zzaj) {
                        zzechVar2.zzd(new zzecj(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), ((zzcgf) zzcezVar).zzP().zzb, str, 2));
                    } else {
                        zzfikVar2.zzc(str, null);
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zzc.getContext())) {
            zzz("/logScionEvent", new zzbiw(this.zzc.getContext()));
        }
        if (zzbitVar != null) {
            zzz("/setInterstitialProperties", new zzbis(zzbitVar));
        }
        if (zzbjkVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue()) {
                zzz("/inspectorNetworkExtras", zzbjkVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziS)).booleanValue() && zzbjjVar != null) {
            zzz("/shareSheet", zzbjjVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziX)).booleanValue() && zzbjdVar != null) {
            zzz("/inspectorOutOfContextTest", zzbjdVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkl)).booleanValue()) {
            zzz("/bindPlayStoreOverlay", zzbiq.zzu);
            zzz("/presentPlayStoreOverlay", zzbiq.zzv);
            zzz("/expandPlayStoreOverlay", zzbiq.zzw);
            zzz("/collapsePlayStoreOverlay", zzbiq.zzx);
            zzz("/closePlayStoreOverlay", zzbiq.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcW)).booleanValue()) {
            zzz("/setPAIDPersonalizationEnabled", zzbiq.zzA);
            zzz("/resetPAID", zzbiq.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkC)).booleanValue()) {
            zzcfi zzcfiVar = this.zzc;
            if (zzcfiVar.zzD() != null && zzcfiVar.zzD().zzar) {
                zzz("/writeToLocalStorage", zzbiq.zzB);
                zzz("/clearLocalStorageKeys", zzbiq.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzoVar;
        this.zzk = zzbhhVar;
        this.zzl = zzbhjVar;
        this.zzv = zzzVar;
        this.zzx = zzbVar3;
        this.zzm = zzddwVar;
        this.zzn = z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzddw zzddwVar = this.zzm;
        if (zzddwVar != null) {
            zzddwVar.zzbK();
        }
    }

    protected final WebResourceResponse zzc(String str, Map map) {
        zzawn zzawnVarZzb;
        try {
            String strZzc = zzbyh.zzc(str, this.zzc.getContext(), this.zzC);
            if (!strZzc.equals(str)) {
                return zzO(strZzc, map);
            }
            zzawq zzawqVarZza = zzawq.zza(Uri.parse(str));
            if (zzawqVarZza != null && (zzawnVarZzb = com.google.android.gms.ads.internal.zzt.zzc().zzb(zzawqVarZza)) != null && zzawnVarZzb.zze()) {
                return new WebResourceResponse("", "", zzawnVarZzb.zzc());
            }
            if (zzbzz.zzk() && ((Boolean) zzbdg.zzb.zze()).booleanValue()) {
                return zzO(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdWebViewClient.interceptRequest");
            return zzN();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzx;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && this.zzc.zzm() != null) {
                zzbcb.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcgt zzcgtVar = this.zzi;
            boolean z = false;
            if (!this.zzA && !this.zzo) {
                z = true;
            }
            zzcgtVar.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzac();
    }

    public final void zzh() {
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            zzbxbVar.zze();
            this.zza = null;
        }
        zzQ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzv = null;
            this.zzx = null;
            this.zzw = null;
            zzbqz zzbqzVar = this.zzy;
            if (zzbqzVar != null) {
                zzbqzVar.zza(true);
                this.zzy = null;
            }
        }
    }

    public final void zzi(boolean z) {
        this.zzC = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzj(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.zze.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgE)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzo().zzf() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfj
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    String str = strSubstring;
                    int i = zzcfp.zzb;
                    com.google.android.gms.ads.internal.zzt.zzo().zzf().zze(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfv)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfx)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzfye.zzr(com.google.android.gms.ads.internal.zzt.zzp().zzb(uri), new zzcfn(this, list, path, uri), zzcan.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        zzP(com.google.android.gms.ads.internal.util.zzs.zzM(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzk() {
        zzaxe zzaxeVar = this.zzd;
        if (zzaxeVar != null) {
            zzaxeVar.zzc(GamesActivityResultCodes.RESULT_LEFT_ROOM);
        }
        this.zzA = true;
        this.zzp = GamesActivityResultCodes.RESULT_APP_MISCONFIGURED;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    final /* synthetic */ void zzn() {
        this.zzc.zzaa();
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = this.zzc.zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzz();
        }
    }

    final /* synthetic */ void zzo(View view, zzbxb zzbxbVar, int i) {
        zzR(view, zzbxbVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzp(int i, int i2, boolean z) {
        zzbre zzbreVar = this.zzw;
        if (zzbreVar != null) {
            zzbreVar.zzb(i, i2);
        }
        zzbqz zzbqzVar = this.zzy;
        if (zzbqzVar != null) {
            zzbqzVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzq() {
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            WebView webViewZzG = this.zzc.zzG();
            if (ViewCompat.isAttachedToWindow(webViewZzG)) {
                zzR(webViewZzG, zzbxbVar, 10);
                return;
            }
            zzQ();
            zzcfm zzcfmVar = new zzcfm(this, zzbxbVar);
            this.zzF = zzcfmVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcfmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        zzddw zzddwVar = this.zzm;
        if (zzddwVar != null) {
            zzddwVar.zzs();
        }
    }

    public final void zzt(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        boolean zZzaA = this.zzc.zzaA();
        boolean zZzT = zzT(zZzaA, this.zzc);
        boolean z2 = true;
        if (!zZzT && z) {
            z2 = false;
        }
        zzw(new AdOverlayInfoParcel(zzcVar, zZzT ? null : this.zzg, zZzaA ? null : this.zzh, this.zzv, this.zzc.zzn(), this.zzc, z2 ? null : this.zzm));
    }

    public final void zzu(String str, String str2, int i) {
        zzcfi zzcfiVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzcfiVar, zzcfiVar.zzn(), str, str2, 14, this.zzE));
    }

    public final void zzv(boolean z, int i, boolean z2) {
        boolean zZzT = zzT(this.zzc.zzaA(), this.zzc);
        boolean z3 = true;
        if (!zZzT && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzT ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcfi zzcfiVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, zzcfiVar, z, i, zzcfiVar.zzn(), z3 ? null : this.zzm, zzS(this.zzc) ? this.zzE : null));
    }

    public final void zzw(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbqz zzbqzVar = this.zzy;
        boolean zZze = zzbqzVar != null ? zzbqzVar.zze() : false;
        com.google.android.gms.ads.internal.zzt.zzi();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zZze);
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbxbVar.zzh(str);
        }
    }

    public final void zzx(boolean z, int i, String str, boolean z2) {
        boolean zZzaA = this.zzc.zzaA();
        boolean zZzT = zzT(zZzaA, this.zzc);
        boolean z3 = true;
        if (!zZzT && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzT ? null : this.zzg;
        zzcfo zzcfoVar = zZzaA ? null : new zzcfo(this.zzc, this.zzh);
        zzbhh zzbhhVar = this.zzk;
        zzbhj zzbhjVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcfi zzcfiVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzcfoVar, zzbhhVar, zzbhjVar, zzzVar, zzcfiVar, z, i, str, zzcfiVar.zzn(), z3 ? null : this.zzm, zzS(this.zzc) ? this.zzE : null));
    }

    public final void zzy(boolean z, int i, String str, String str2, boolean z2) {
        boolean zZzaA = this.zzc.zzaA();
        boolean zZzT = zzT(zZzaA, this.zzc);
        boolean z3 = true;
        if (!zZzT && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzT ? null : this.zzg;
        zzcfo zzcfoVar = zZzaA ? null : new zzcfo(this.zzc, this.zzh);
        zzbhh zzbhhVar = this.zzk;
        zzbhj zzbhjVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcfi zzcfiVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzcfoVar, zzbhhVar, zzbhjVar, zzzVar, zzcfiVar, z, i, str, str2, zzcfiVar.zzn(), z3 ? null : this.zzm, zzS(this.zzc) ? this.zzE : null));
    }

    public final void zzz(String str, zzbir zzbirVar) {
        synchronized (this.zzf) {
            List copyOnWriteArrayList = (List) this.zze.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.zze.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(zzbirVar);
        }
    }
}
