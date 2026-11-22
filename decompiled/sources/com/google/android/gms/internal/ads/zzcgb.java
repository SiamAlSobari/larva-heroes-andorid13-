package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
final class zzcgb extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcfi {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbej zzC;
    private zzbeh zzD;
    private zzavs zzE;
    private int zzF;
    private int zzG;
    private zzbcg zzH;
    private final zzbcg zzI;
    private zzbcg zzJ;
    private final zzbch zzK;
    private int zzL;
    private com.google.android.gms.ads.internal.overlay.zzl zzM;
    private boolean zzN;
    private final com.google.android.gms.ads.internal.util.zzcm zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private Map zzT;
    private final WindowManager zzU;
    private final zzaxe zzV;
    private final zzcgw zzb;
    private final zzaqx zzc;
    private final zzbct zzd;
    private final zzcag zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzfbe zzj;
    private zzfbi zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcfp zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private zzfip zzp;
    private zzcgx zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcge zzz;

    protected zzcgb(zzcgw zzcgwVar, zzcgx zzcgxVar, String str, boolean z, boolean z2, zzaqx zzaqxVar, zzbct zzbctVar, zzcag zzcagVar, zzbcj zzbcjVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzaxe zzaxeVar, zzfbe zzfbeVar, zzfbi zzfbiVar) {
        zzfbi zzfbiVar2;
        super(zzcgwVar);
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzP = -1;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzS = -1;
        this.zzb = zzcgwVar;
        this.zzq = zzcgxVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzaqxVar;
        this.zzd = zzbctVar;
        this.zze = zzcagVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzU = windowManager;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics displayMetricsZzq = com.google.android.gms.ads.internal.util.zzs.zzq(windowManager);
        this.zzh = displayMetricsZzq;
        this.zzi = displayMetricsZzq.density;
        this.zzV = zzaxeVar;
        this.zzj = zzfbeVar;
        this.zzk = zzfbiVar;
        this.zzO = new com.google.android.gms.ads.internal.util.zzcm(zzcgwVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzcaa.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkr)).booleanValue()) {
                settings.setMixedContentMode(1);
            } else {
                settings.setMixedContentMode(2);
            }
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcgwVar, zzcagVar.zza));
        com.google.android.gms.ads.internal.zzt.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcf.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                zzfoe zzfoeVar = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaI)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return true;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaS();
        addJavascriptInterface(new zzcgi(this, new zzcgh(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzba();
        zzbch zzbchVar = new zzbch(new zzbcj(true, "make_wv", this.zzr));
        this.zzK = zzbchVar;
        zzbchVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && (zzfbiVar2 = this.zzk) != null && zzfbiVar2.zzb != null) {
            zzbchVar.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbchVar.zza();
        zzbcg zzbcgVarZzf = zzbcj.zzf();
        this.zzI = zzbcgVarZzf;
        zzbchVar.zzb("native:view_create", zzbcgVarZzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.util.zzci.zza().zzb(zzcgwVar);
        com.google.android.gms.ads.internal.zzt.zzo().zzr();
    }

    private final synchronized void zzaS() {
        zzfbe zzfbeVar = this.zzj;
        if (zzfbeVar != null && zzfbeVar.zzan) {
            zzcaa.zze("Disabling hardware acceleration on an overlay.");
            zzaU();
            return;
        }
        if (!this.zzu && !this.zzq.zzi()) {
            zzcaa.zze("Enabling hardware acceleration on an AdView.");
            zzaW();
            return;
        }
        zzcaa.zze("Enabling hardware acceleration on an overlay.");
        zzaW();
    }

    private final synchronized void zzaT() {
        if (this.zzN) {
            return;
        }
        this.zzN = true;
        com.google.android.gms.ads.internal.zzt.zzo().zzq();
    }

    private final synchronized void zzaU() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final void zzaV(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", map);
    }

    private final synchronized void zzaW() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaX(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrlUnsafe");
            zzcaa.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzaY() {
        zzbcb.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzaZ() {
        Map map = this.zzT;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzcdu) it.next()).release();
            }
        }
        this.zzT = null;
    }

    private final void zzba() {
        zzbch zzbchVar = this.zzK;
        if (zzbchVar == null) {
            return;
        }
        zzbcj zzbcjVarZza = zzbchVar.zza();
        zzbbz zzbbzVarZzf = com.google.android.gms.ads.internal.zzt.zzo().zzf();
        if (zzbbzVarZzf != null) {
            zzbbzVarZzf.zzf(zzbcjVarZza);
        }
    }

    private final synchronized void zzbb() {
        Boolean boolZzk = com.google.android.gms.ads.internal.zzt.zzo().zzk();
        this.zzw = boolZzk;
        if (boolZzk == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(true);
            } catch (IllegalStateException unused) {
                zzaQ(false);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final synchronized void destroy() {
        zzba();
        this.zzO.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzm();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzh();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
        zzaZ();
        this.zzt = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjM)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzU();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaX("about:blank");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!zzaz()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzcaa.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzh();
                    com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
                    zzaZ();
                    zzaT();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaz()) {
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaz()) {
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final synchronized void loadUrl(String str) {
        if (zzaz()) {
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrl");
            zzcaa.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaz()) {
            this.zzO.zzc();
        }
        boolean z = this.zzA;
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null && zzcfpVar.zzL()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaR();
            z = true;
        }
        zzaV(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcfp zzcfpVar;
        synchronized (this) {
            if (!zzaz()) {
                this.zzO.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzcfpVar = this.zzn) != null && zzcfpVar.zzL() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaV(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zzcaa.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzaz()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaR = zzaR();
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzL();
        if (zzlVarZzL == null || !zZzaR) {
            return;
        }
        zzlVarZzL.zzn();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0084 A[Catch: all -> 0x01e4, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x000f, B:11:0x0015, B:13:0x0019, B:16:0x0023, B:18:0x002b, B:21:0x0030, B:23:0x0038, B:25:0x004a, B:28:0x004f, B:30:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0077, B:48:0x008e, B:42:0x007f, B:45:0x0084, B:51:0x009b, B:53:0x00a3, B:55:0x00b5, B:58:0x00ba, B:60:0x00d6, B:62:0x00df, B:61:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f9, B:79:0x011f, B:81:0x0126, B:86:0x012e, B:88:0x0140, B:90:0x014e, B:94:0x015b, B:97:0x0160, B:99:0x01a6, B:100:0x01aa, B:102:0x01b1, B:107:0x01be, B:109:0x01c4, B:110:0x01c7, B:112:0x01cb, B:113:0x01d4, B:116:0x01df), top: B:122:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (zzaz()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzu && !this.zzq.zzf()) {
            if (this.zzq.zzh()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzq.zzj()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdF)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzcge zzcgeVarZzq = zzq();
                float fZze = zzcgeVarZzq != null ? zzcgeVarZzq.zze() : 0.0f;
                if (fZze == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = size2 * fZze;
                int i7 = (int) (size / fZze);
                if (size2 != 0) {
                    i3 = (int) f;
                    if (size == 0) {
                        i6 = size;
                    } else if (i3 != 0) {
                        i7 = (int) (i3 / fZze);
                        i4 = size2;
                        i5 = i3;
                        i6 = i5;
                    }
                    i4 = size2;
                    i5 = i3;
                } else if (i7 != 0) {
                    i5 = (int) (i7 * fZze);
                    i6 = size;
                    i4 = i7;
                } else {
                    size2 = 0;
                    i3 = (int) f;
                    if (size == 0) {
                        i6 = size;
                    } else if (i3 != 0) {
                        i7 = (int) (i3 / fZze);
                        i4 = size2;
                        i5 = i3;
                        i6 = i5;
                    }
                    i4 = size2;
                    i5 = i3;
                }
                setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                return;
            }
            if (this.zzq.zzg()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdL)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzad("/contentHeight", new zzcfz(this));
                zzaO("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.zzh.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i8 = this.zzG;
                setMeasuredDimension(size3, i8 != -1 ? (int) (i8 * f2) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.zzq.zzi()) {
                setMeasuredDimension(this.zzh.widthPixels, this.zzh.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size5 = View.MeasureSpec.getSize(i2);
            int i9 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i10 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            zzcgx zzcgxVar = this.zzq;
            boolean z = zzcgxVar.zzb > i9 || zzcgxVar.zza > i10;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfl)).booleanValue()) {
                zzcgx zzcgxVar2 = this.zzq;
                float f3 = zzcgxVar2.zzb;
                float f4 = this.zzi;
                z &= f3 / f4 <= ((float) i9) / f4 && ((float) zzcgxVar2.zza) / f4 <= ((float) i10) / f4;
            }
            if (!z) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.zzm) {
                    this.zzV.zzc(GamesActivityResultCodes.RESULT_SIGN_IN_FAILED);
                    this.zzm = true;
                }
                zzcgx zzcgxVar3 = this.zzq;
                setMeasuredDimension(zzcgxVar3.zzb, zzcgxVar3.zza);
                return;
            }
            zzcgx zzcgxVar4 = this.zzq;
            float f5 = zzcgxVar4.zzb;
            float f6 = this.zzi;
            zzcaa.zzj("Not enough space to show ad. Needs " + ((int) (f5 / f6)) + "x" + ((int) (zzcgxVar4.zza / f6)) + " dp, but only has " + ((int) (size4 / f6)) + "x" + ((int) (size5 / f6)) + " dp.");
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.zzl) {
                return;
            }
            this.zzV.zzc(GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED);
            this.zzl = true;
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void onPause() {
        if (zzaz()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            zzcaa.zzh("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void onResume() {
        if (zzaz()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            zzcaa.zzh("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzL() || this.zzn.zzJ()) {
            zzaqx zzaqxVar = this.zzc;
            if (zzaqxVar != null) {
                zzaqxVar.zzd(motionEvent);
            }
            zzbct zzbctVar = this.zzd;
            if (zzbctVar != null) {
                zzbctVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbej zzbejVar = this.zzC;
                if (zzbejVar != null) {
                    zzbejVar.zzd(motionEvent);
                }
            }
        }
        if (zzaz()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcfp) {
            this.zzn = (zzcfp) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaz()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzcaa.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzA(int i) {
        this.zzL = i;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzC(zzcge zzcgeVar) {
        if (this.zzz != null) {
            zzcaa.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcgeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcez
    public final zzfbe zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgs
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final WebViewClient zzH() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgq
    public final zzaqx zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized zzavs zzJ() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized zzbej zzK() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final /* synthetic */ zzcgv zzN() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgp
    public final synchronized zzcgx zzO() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgf
    public final zzfbi zzP() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized zzfip zzQ() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final ListenableFuture zzR() {
        zzbct zzbctVar = this.zzd;
        return zzbctVar == null ? zzfye.zzh(null) : zzbctVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized String zzS() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzT(zzfbe zzfbeVar, zzfbi zzfbiVar) {
        this.zzj = zzfbeVar;
        this.zzk = zzfbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzU() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaT();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcga(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzV() {
        zzaY();
        HashMap map = new HashMap(1);
        map.put(MediationMetaData.KEY_VERSION, this.zze.zza);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzW(int i) {
        if (i == 0) {
            zzbcb.zza(this.zzK.zza(), this.zzI, "aebb2");
        }
        zzaY();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put(MediationMetaData.KEY_VERSION, this.zze.zza);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzX() {
        if (this.zzH == null) {
            zzbcb.zza(this.zzK.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbcg zzbcgVarZzf = zzbcj.zzf();
            this.zzH = zzbcgVarZzf;
            this.zzK.zzb("native:view_show", zzbcgVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put(MediationMetaData.KEY_VERSION, this.zze.zza);
        zzd("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzZ(boolean z) {
        this.zzn.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized boolean zzaA() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized boolean zzaC() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zzn.zzt(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaE(String str, String str2, int i) {
        this.zzn.zzu(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaF(boolean z, int i, boolean z2) {
        this.zzn.zzv(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaG(boolean z, int i, String str, boolean z2) {
        this.zzn.zzx(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaH(boolean z, int i, String str, String str2, boolean z2) {
        this.zzn.zzy(z, i, str, str2, z2);
    }

    public final zzcfp zzaJ() {
        return this.zzn;
    }

    final synchronized Boolean zzaK() {
        return this.zzw;
    }

    protected final synchronized void zzaN(String str, ValueCallback valueCallback) {
        if (zzaz()) {
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    protected final void zzaO(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaP("javascript:".concat(str));
            return;
        }
        if (zzaK() == null) {
            zzbb();
        }
        if (zzaK().booleanValue()) {
            zzaN(str, null);
        } else {
            zzaP("javascript:".concat(str));
        }
    }

    protected final synchronized void zzaP(String str) {
        if (zzaz()) {
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzv(bool);
    }

    public final boolean zzaR() {
        int i;
        int iZzv;
        if (!this.zzn.zzK() && !this.zzn.zzL()) {
            return false;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zzh;
        int iZzv2 = zzbzt.zzv(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zzh;
        int iZzv3 = zzbzt.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZza = this.zzb.zza();
        if (activityZza == null || activityZza.getWindow() == null) {
            i = iZzv2;
            iZzv = iZzv3;
        } else {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] iArrZzN = com.google.android.gms.ads.internal.util.zzs.zzN(activityZza);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int iZzv4 = zzbzt.zzv(this.zzh, iArrZzN[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            iZzv = zzbzt.zzv(this.zzh, iArrZzN[1]);
            i = iZzv4;
        }
        int i2 = this.zzQ;
        if (i2 == iZzv2 && this.zzP == iZzv3 && this.zzR == i && this.zzS == iZzv) {
            return false;
        }
        boolean z = (i2 == iZzv2 && this.zzP == iZzv3) ? false : true;
        this.zzQ = iZzv2;
        this.zzP = iZzv3;
        this.zzR = i;
        this.zzS = iZzv;
        new zzbrf(this, "").zzi(iZzv2, iZzv3, i, iZzv, this.zzh.density, this.zzU.getDefaultDisplay().getRotation());
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzaa() {
        this.zzO.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzab(String str, String str2, String str3) {
        String str4;
        if (zzaz()) {
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzQ);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MediationMetaData.KEY_VERSION, str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            zzcaa.zzk("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, zzcgo.zza(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzac() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbcg zzbcgVarZzf = zzbcj.zzf();
            this.zzJ = zzbcgVarZzf;
            this.zzK.zzb("native:view_load", zzbcgVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzad(String str, zzbir zzbirVar) {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.zzz(str, zzbirVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzae() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzag(zzcgx zzcgxVar) {
        this.zzq = zzcgxVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzah(zzavs zzavsVar) {
        this.zzE = zzavsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzai(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzaj() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzak(Context context) {
        this.zzb.setBaseContext(context);
        this.zzO.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzal(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzy(this.zzn.zzK(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzam(zzbeh zzbehVar) {
        this.zzD = zzbehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzan(boolean z) {
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaS();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzR)).booleanValue() || !this.zzq.zzi()) {
                new zzbrf(this, "").zzk(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzao(zzbej zzbejVar) {
        this.zzC = zzbejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzap(zzfip zzfipVar) {
        this.zzp = zzfipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzaq(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzM = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzas(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzF + (true != z ? -1 : 1);
        this.zzF = i;
        if (i > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzE();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:8:0x000b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x0007, B:8:0x000b), top: B:16:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0010, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzat(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        if (!z) {
            zzlVar = this.zzo;
            if (zzlVar != null) {
                zzlVar.zzB(z);
                return;
            }
            return;
        }
        setBackgroundColor(0);
        zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzB(z);
            return;
        }
        return;
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzau(String str, zzbir zzbirVar) {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.zzH(str, zzbirVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzav(String str, Predicate predicate) {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.zzI(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized boolean zzaw() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized boolean zzax() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzay(final boolean z, final int i) {
        destroy();
        this.zzV.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzcfy
            @Override // com.google.android.gms.internal.ads.zzaxd
            public final void zza(zzayt zzaytVar) {
                boolean z2 = z;
                int i2 = i;
                int i3 = zzcgb.zza;
                zzbay zzbayVarZza = zzbaz.zza();
                if (zzbayVarZza.zzc() != z2) {
                    zzbayVarZza.zza(z2);
                }
                zzbayVarZza.zzb(i2);
                zzaytVar.zzj((zzbaz) zzbayVarZza.zzal());
            }
        });
        this.zzV.zzc(GamesActivityResultCodes.RESULT_LICENSE_FAILED);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized boolean zzaz() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzb(String str, String str2) {
        zzaO(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.zzbK();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbj() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbj();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbk() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized String zzbl() {
        zzfbi zzfbiVar = this.zzk;
        if (zzfbiVar == null) {
            return null;
        }
        return zzfbiVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized String zzbm() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaueVar) {
        synchronized (this) {
            this.zzA = zzaueVar.zzj;
        }
        zzaV(zzaueVar.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcaa.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        zzcaa.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzaO(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized int zzf() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgj, com.google.android.gms.internal.ads.zzccj
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzbcg zzk() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final zzbch zzm() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccj
    public final zzcag zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzcby zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized zzcdu zzp(String str) {
        Map map = this.zzT;
        if (map == null) {
            return null;
        }
        return (zzcdu) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final synchronized zzcge zzq() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzt(String str, zzcdu zzcduVar) {
        if (this.zzT == null) {
            this.zzT = new HashMap();
        }
        this.zzT.put(str, zzcduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzv(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put(FirebaseAnalytics.Param.SUCCESS, true != z ? "0" : "1");
        map.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzw() {
        zzbeh zzbehVar = this.zzD;
        if (zzbehVar != null) {
            final zzdmc zzdmcVar = (zzdmc) zzbehVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdma
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdmcVar.zzd();
                    } catch (RemoteException e) {
                        zzcaa.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzz(boolean z) {
        this.zzn.zzC(false);
    }
}
