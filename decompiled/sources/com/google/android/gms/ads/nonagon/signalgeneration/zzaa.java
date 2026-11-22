package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcvq;
import com.google.android.gms.internal.ads.zzdbt;
import com.google.android.gms.internal.ads.zzdnb;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfby;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfik;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrx;
import com.google.android.gms.internal.ads.zzfxk;
import com.google.android.gms.internal.ads.zzfxl;
import com.google.android.gms.internal.ads.zzfxv;
import com.google.android.gms.internal.ads.zzfye;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaa extends zzbyq {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzcag zzA;
    private String zzB;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzchd zzf;
    private Context zzg;
    private final zzaqx zzh;
    private final zzfcx zzi;
    private final zzfyo zzk;
    private final ScheduledExecutorService zzl;
    private zzbta zzm;
    private final zzc zzq;
    private final zzdrm zzr;
    private final zzfik zzs;
    private zzdrc zzj = null;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzz = new AtomicInteger(0);
    private final boolean zzt = ((Boolean) zzba.zzc().zzb(zzbbr.zzhe)).booleanValue();
    private final boolean zzu = ((Boolean) zzba.zzc().zzb(zzbbr.zzhd)).booleanValue();
    private final boolean zzv = ((Boolean) zzba.zzc().zzb(zzbbr.zzhf)).booleanValue();
    private final boolean zzw = ((Boolean) zzba.zzc().zzb(zzbbr.zzhh)).booleanValue();
    private final String zzx = (String) zzba.zzc().zzb(zzbbr.zzhg);
    private final String zzy = (String) zzba.zzc().zzb(zzbbr.zzhi);
    private final String zzC = (String) zzba.zzc().zzb(zzbbr.zzhj);

    public zzaa(zzchd zzchdVar, Context context, zzaqx zzaqxVar, zzfcx zzfcxVar, zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, zzdrm zzdrmVar, zzfik zzfikVar, zzcag zzcagVar) {
        List listZzX;
        this.zzf = zzchdVar;
        this.zzg = context;
        this.zzh = zzaqxVar;
        this.zzi = zzfcxVar;
        this.zzk = zzfyoVar;
        this.zzl = scheduledExecutorService;
        this.zzq = zzchdVar.zzn();
        this.zzr = zzdrmVar;
        this.zzs = zzfikVar;
        this.zzA = zzcagVar;
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzhk)).booleanValue()) {
            this.zzD = zzX((String) zzba.zzc().zzb(zzbbr.zzhl));
            this.zzE = zzX((String) zzba.zzc().zzb(zzbbr.zzhm));
            this.zzF = zzX((String) zzba.zzc().zzb(zzbbr.zzhn));
            listZzX = zzX((String) zzba.zzc().zzb(zzbbr.zzho));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            listZzX = zzd;
        }
        this.zzG = listZzX;
    }

    static /* bridge */ /* synthetic */ void zzF(zzaa zzaaVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzaaVar.zzN((Uri) it.next())) {
                zzaaVar.zzz.getAndIncrement();
                return;
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzG(final zzaa zzaaVar, final String str, final String str2, final zzdrc zzdrcVar) {
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzgP)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbr.zzgV)).booleanValue()) {
                zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzI(str, str2, zzdrcVar);
                    }
                });
            } else {
                zzaaVar.zzq.zzd(str, str2, zzdrcVar);
            }
        }
    }

    static final /* synthetic */ Uri zzP(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzW(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    private final zzh zzQ(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        byte b;
        zzfby zzfbyVar = new zzfby();
        if ("REWARDED".equals(str2)) {
            zzfbyVar.zzo().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfbyVar.zzo().zza(3);
        }
        zzg zzgVarZzo = this.zzf.zzo();
        zzcvq zzcvqVar = new zzcvq();
        zzcvqVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfbyVar.zzs(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzfbyVar.zzE(zzlVar);
        if (zzqVar == null) {
            switch (str2) {
                case "NATIVE":
                    b = 3;
                    break;
                case "APP_OPEN_AD":
                    b = 4;
                    break;
                case "REWARDED":
                    b = 1;
                    break;
                case "REWARDED_INTERSTITIAL":
                    b = 2;
                    break;
                case "BANNER":
                    b = 0;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                zzqVar = new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
            } else if (b == 1 || b == 2) {
                zzqVar = com.google.android.gms.ads.internal.client.zzq.zzd();
            } else if (b != 3) {
                zzqVar = b != 4 ? new com.google.android.gms.ads.internal.client.zzq() : com.google.android.gms.ads.internal.client.zzq.zzb();
            } else {
                zzqVar = com.google.android.gms.ads.internal.client.zzq.zzc();
            }
        }
        zzfbyVar.zzr(zzqVar);
        zzfbyVar.zzx(true);
        zzcvqVar.zzi(zzfbyVar.zzG());
        zzgVarZzo.zza(zzcvqVar.zzj());
        zzac zzacVar = new zzac();
        zzacVar.zza(str2);
        zzgVarZzo.zzb(new zzae(zzacVar, null));
        new zzdbt();
        zzh zzhVarZzc = zzgVarZzo.zzc();
        this.zzj = zzhVarZzc.zza();
        return zzhVarZzc;
    }

    private final ListenableFuture zzR(final String str) {
        final zzdnb[] zzdnbVarArr = new zzdnb[1];
        ListenableFuture listenableFutureZzn = zzfye.zzn(this.zzi.zza(), new zzfxl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzv(zzdnbVarArr, str, (zzdnb) obj);
            }
        }, this.zzk);
        listenableFutureZzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzH(zzdnbVarArr);
            }
        }, this.zzk);
        return zzfye.zze(zzfye.zzm((zzfxv) zzfye.zzo(zzfxv.zzu(listenableFutureZzn), ((Integer) zzba.zzc().zzb(zzbbr.zzhu)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfqw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                int i = zzaa.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfqw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                int i = zzaa.zze;
                zzcaa.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbsr zzbsrVar, boolean z) {
        ListenableFuture listenableFutureZzb;
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            zzcaa.zzj("The updating URL feature is not enabled.");
            try {
                zzbsrVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzcaa.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzN((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            zzcaa.zzj("Multiple google urls found: ".concat(String.valueOf(String.valueOf(list))));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzN(uri)) {
                listenableFutureZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzm(uri, iObjectWrapper);
                    }
                });
                if (zzV()) {
                    listenableFutureZzb = zzfye.zzn(listenableFutureZzb, new zzfxl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                        @Override // com.google.android.gms.internal.ads.zzfxl
                        public final ListenableFuture zza(Object obj) {
                            zzaa zzaaVar = this.zza;
                            return zzfye.zzm(zzaaVar.zzR("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfqw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
                                @Override // com.google.android.gms.internal.ads.zzfqw
                                public final Object apply(Object obj2) {
                                    return zzaa.zzP(uri, (String) obj2);
                                }
                            }, zzaaVar.zzk);
                        }
                    }, this.zzk);
                } else {
                    zzcaa.zzi("Asset view map is empty.");
                }
            } else {
                zzcaa.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                listenableFutureZzb = zzfye.zzh(uri);
            }
            arrayList.add(listenableFutureZzb);
        }
        zzfye.zzr(zzfye.zzd(arrayList), new zzy(this, zzbsrVar, z), this.zzf.zzB());
    }

    private final void zzT(final List list, final IObjectWrapper iObjectWrapper, zzbsr zzbsrVar, boolean z) {
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            try {
                zzbsrVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzcaa.zzh("", e);
                return;
            }
        }
        ListenableFuture listenableFutureZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzC(list, iObjectWrapper);
            }
        });
        if (zzV()) {
            listenableFutureZzb = zzfye.zzn(listenableFutureZzb, new zzfxl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            zzcaa.zzi("Asset view map is empty.");
        }
        zzfye.zzr(listenableFutureZzb, new zzx(this, zzbsrVar, z), this.zzf.zzB());
    }

    private static boolean zzU(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzV() {
        Map map;
        zzbta zzbtaVar = this.zzm;
        return (zzbtaVar == null || (map = zzbtaVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzW(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(string.substring(0, i) + str + "=" + str2 + "&" + string.substring(i));
    }

    private static final List zzX(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzfrx.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ zzfhr zzr(ListenableFuture listenableFuture, zzbyv zzbyvVar) {
        if (!zzfhu.zza() || !((Boolean) zzbdd.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfhr zzfhrVarZzb = ((zzh) zzfye.zzp(listenableFuture)).zzb();
            zzfhrVarZzb.zzd(new ArrayList(Collections.singletonList(zzbyvVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzbyvVar.zzd;
            zzfhrVarZzb.zzb(zzlVar == null ? "" : zzlVar.zzp);
            return zzfhrVarZzb;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzO(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzW(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        this.zzh.zzc();
        String strZzh = this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        if (TextUtils.isEmpty(strZzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzO(uri)) {
                arrayList.add(zzW(uri, "ms", strZzh));
            } else {
                zzcaa.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ void zzH(zzdnb[] zzdnbVarArr) {
        zzdnb zzdnbVar = zzdnbVarArr[0];
        if (zzdnbVar != null) {
            this.zzi.zzb(zzfye.zzh(zzdnbVar));
        }
    }

    final /* synthetic */ void zzI(String str, String str2, zzdrc zzdrcVar) {
        this.zzq.zzd(str, str2, zzdrcVar);
    }

    final boolean zzN(Uri uri) {
        return zzU(uri, this.zzD, this.zzE);
    }

    final boolean zzO(Uri uri) {
        return zzU(uri, this.zzF, this.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zze(IObjectWrapper iObjectWrapper, final zzbyv zzbyvVar, zzbyo zzbyoVar) {
        ListenableFuture listenableFutureZzc;
        ListenableFuture listenableFuture;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfhg zzfhgVarZza = zzfhf.zza(context, 22);
        zzfhgVarZza.zzh();
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzjX)).booleanValue()) {
            ListenableFuture listenableFutureZzb = zzcan.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzq(zzbyvVar);
                }
            });
            listenableFuture = listenableFutureZzb;
            listenableFutureZzc = zzfye.zzn(listenableFutureZzb, new zzfxl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, zzcan.zza);
        } else {
            zzh zzhVarZzQ = zzQ(this.zzg, zzbyvVar.zza, zzbyvVar.zzb, zzbyvVar.zzc, zzbyvVar.zzd);
            ListenableFuture listenableFutureZzh = zzfye.zzh(zzhVarZzQ);
            listenableFutureZzc = zzhVarZzQ.zzc();
            listenableFuture = listenableFutureZzh;
        }
        zzfye.zzr(listenableFutureZzc, new zzw(this, listenableFuture, zzbyvVar, zzbyoVar, zzfhgVarZza, com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), this.zzf.zzB());
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzf(zzbta zzbtaVar) {
        this.zzm = zzbtaVar;
        this.zzi.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) {
        zzS(list, iObjectWrapper, zzbsrVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) {
        zzT(list, iObjectWrapper, zzbsrVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzi(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzja)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                zzcaa.zzj("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) zzba.zzc().zzb(zzbbr.zzjb)).booleanValue()) {
                if (!((Boolean) zzba.zzc().zzb(zzbbr.zzje)).booleanValue()) {
                    zzfye.zzr(((Boolean) zzba.zzc().zzb(zzbbr.zzjX)).booleanValue() ? zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                        @Override // com.google.android.gms.internal.ads.zzfxk
                        public final ListenableFuture zza() {
                            return this.zza.zzu();
                        }
                    }, zzcan.zza) : zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc(), new zzz(this), this.zzf.zzB());
                }
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                zzcaa.zzg("The webView cannot be null.");
            } else if (this.zzp.contains(webView)) {
                zzcaa.zzi("This webview has already been registered.");
            } else {
                this.zzp.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr, this.zzs), "gmaSdk");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbta zzbtaVar = this.zzm;
            this.zzn = zzbx.zza(motionEvent, zzbtaVar == null ? null : zzbtaVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) {
        zzS(list, iObjectWrapper, zzbsrVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) {
        zzT(list, iObjectWrapper, zzbsrVar, false);
    }

    final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzaqy e) {
            zzcaa.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ zzh zzq(zzbyv zzbyvVar) throws Exception {
        return zzQ(this.zzg, zzbyvVar.zza, zzbyvVar.zzb, zzbyvVar.zzc, zzbyvVar.zzd);
    }

    final /* synthetic */ ListenableFuture zzu() throws Exception {
        return zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
    }

    final /* synthetic */ ListenableFuture zzv(zzdnb[] zzdnbVarArr, String str, zzdnb zzdnbVar) throws Exception {
        zzdnbVarArr[0] = zzdnbVar;
        Context context = this.zzg;
        zzbta zzbtaVar = this.zzm;
        Map map = zzbtaVar.zzb;
        JSONObject jSONObjectZzd = zzbx.zzd(context, map, map, zzbtaVar.zza, null);
        JSONObject jSONObjectZzg = zzbx.zzg(this.zzg, this.zzm.zza);
        JSONObject jSONObjectZzf = zzbx.zzf(this.zzm.zza);
        JSONObject jSONObjectZze = zzbx.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZzd);
        jSONObject.put("ad_view_signal", jSONObjectZzg);
        jSONObject.put("scroll_view_signal", jSONObjectZzf);
        jSONObject.put("lock_screen_signal", jSONObjectZze);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbx.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdnbVar.zzd(str, jSONObject);
    }

    final /* synthetic */ ListenableFuture zzw(final ArrayList arrayList) throws Exception {
        return zzfye.zzm(zzR("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfqw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return this.zza.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
