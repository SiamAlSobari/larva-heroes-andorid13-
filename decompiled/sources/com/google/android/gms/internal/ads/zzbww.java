package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbww implements zzbxb {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzgvu zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbwy zzi;
    private final zzbwx zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbww(Context context, zzcag zzcagVar, zzbwy zzbwyVar, String str, zzbwx zzbwxVar) {
        Preconditions.checkNotNull(zzbwyVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzbwxVar;
        this.zzi = zzbwyVar;
        Iterator it = zzbwyVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgvu zzgvuVarZza = zzgxp.zza();
        zzgvuVarZza.zzn(9);
        zzgvuVarZza.zzj(str);
        zzgvuVarZza.zzh(str);
        zzgvv zzgvvVarZza = zzgvw.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzgvvVarZza.zza(str2);
        }
        zzgvuVarZza.zzg((zzgvw) zzgvvVarZza.zzal());
        zzgxj zzgxjVarZza = zzgxk.zza();
        zzgxjVarZza.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = zzcagVar.zza;
        if (str3 != null) {
            zzgxjVarZza.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzgxjVarZza.zzb(apkVersion);
        }
        zzgvuVarZza.zzf((zzgxk) zzgxjVarZza.zzal());
        this.zzd = zzgvuVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final zzbwy zza() {
        return this.zzi;
    }

    final /* synthetic */ ListenableFuture zzb(Map map) throws Exception {
        zzgxh zzgxhVar;
        ListenableFuture listenableFutureZzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = jSONArrayOptJSONArray.length();
                            synchronized (this.zzj) {
                                try {
                                    zzgxhVar = (zzgxh) this.zze.get(str);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (zzgxhVar == null) {
                                zzbxa.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzgxhVar.zza(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbdr.zzb.zze()).booleanValue()) {
                    zzcaa.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzfye.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzfye.zzh(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((zzgxi) ((zzgxh) it.next()).zzal());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzbxa.zzb()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                for (zzgxi zzgxiVar : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzgxiVar.zza());
                    sb.append("] ");
                    sb.append(zzgxiVar.zze());
                }
                zzbxa.zza(sb.toString());
            }
            ListenableFuture listenableFutureZzb = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzgxp) this.zzd.zzal()).zzax());
            if (zzbxa.zzb()) {
                listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbxa.zza("Pinged SB successfully.");
                    }
                }, zzcan.zza);
            }
            listenableFutureZzm = zzfye.zzm(listenableFutureZzb, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzbws
                @Override // com.google.android.gms.internal.ads.zzfqw
                public final Object apply(Object obj) {
                    int i2 = zzbww.zzb;
                    return null;
                }
            }, zzcan.zzf);
        }
        return listenableFutureZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzd(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((zzgxh) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzgxh zzgxhVarZzc = zzgxi.zzc();
            int iZza = zzgxg.zza(i);
            if (iZza != 0) {
                zzgxhVarZzc.zze(iZza);
            }
            zzgxhVarZzc.zzb(this.zze.size());
            zzgxhVarZzc.zzd(str);
            zzgwh zzgwhVarZza = zzgwk.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzgwf zzgwfVarZza = zzgwg.zza();
                        zzgwfVarZza.zza(zzgqi.zzw(str2));
                        zzgwfVarZza.zzb(zzgqi.zzw(str3));
                        zzgwhVarZza.zza((zzgwg) zzgwfVarZza.zzal());
                    }
                }
            }
            zzgxhVarZzc.zzc((zzgwk) zzgwhVarZza.zzal());
            this.zze.put(str, zzgxhVarZzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture listenableFutureZzn = zzfye.zzn(zzfye.zzh(Collections.emptyMap()), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzbwt
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zzb((Map) obj);
                }
            }, zzcan.zzf);
            ListenableFuture listenableFutureZzo = zzfye.zzo(listenableFutureZzn, 10L, TimeUnit.SECONDS, zzcan.zzd);
            zzfye.zzr(listenableFutureZzn, new zzbwv(this, listenableFutureZzo), zzcan.zzf);
            zzc.add(listenableFutureZzo);
        }
    }

    final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgqf zzgqfVarZzt = zzgqi.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzgqfVarZzt);
        synchronized (this.zzj) {
            zzgvu zzgvuVar = this.zzd;
            zzgxa zzgxaVarZza = zzgxc.zza();
            zzgxaVarZza.zza(zzgqfVarZzt.zzb());
            zzgxaVarZza.zzb("image/png");
            zzgxaVarZza.zzc(2);
            zzgvuVar.zzi((zzgxc) zzgxaVarZza.zzal());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzg(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzp();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        zzcaa.zzh("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            zzcaa.zzj("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        zzcaa.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzbxa.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwu
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf(bitmap);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                zzcan.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzh(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzd();
                } else {
                    this.zzd.zze(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
