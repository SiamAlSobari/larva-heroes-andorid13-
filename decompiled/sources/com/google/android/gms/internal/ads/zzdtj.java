package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtj {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdpc zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdrq zzl;
    private final zzcag zzm;
    private final zzdcz zzo;
    private final zzfhu zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcas zze = new zzcas();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();

    public zzdtj(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdpc zzdpcVar, ScheduledExecutorService scheduledExecutorService, zzdrq zzdrqVar, zzcag zzcagVar, zzdcz zzdczVar, zzfhu zzfhuVar) {
        this.zzh = zzdpcVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdrqVar;
        this.zzm = zzcagVar;
        this.zzo = zzdczVar;
        this.zzp = zzfhuVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(final zzdtj zzdtjVar, String str) {
        int i = 5;
        final zzfhg zzfhgVarZza = zzfhf.zza(zzdtjVar.zzf, 5);
        zzfhgVarZza.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfhg zzfhgVarZza2 = zzfhf.zza(zzdtjVar.zzf, i);
                zzfhgVarZza2.zzh();
                zzfhgVarZza2.zzd(next);
                final Object obj = new Object();
                final zzcas zzcasVar = new zzcas();
                ListenableFuture listenableFutureZzo = zzfye.zzo(zzcasVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbL)).longValue(), TimeUnit.SECONDS, zzdtjVar.zzk);
                zzdtjVar.zzl.zzc(next);
                zzdtjVar.zzo.zzc(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                listenableFutureZzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdta
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzq(obj, zzcasVar, next, jElapsedRealtime, zzfhgVarZza2);
                    }
                }, zzdtjVar.zzi);
                arrayList.add(listenableFutureZzo);
                final zzdti zzdtiVar = new zzdti(zzdtjVar, obj, next, jElapsedRealtime, zzfhgVarZza2, zzcasVar);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbky(strOptString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdtjVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfcw zzfcwVarZzc = zzdtjVar.zzh.zzc(next, new JSONObject());
                        zzdtjVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdte
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzn(zzfcwVarZzc, zzdtiVar, arrayList2, next);
                            }
                        });
                    } catch (RemoteException e) {
                        zzcaa.zzh("", e);
                    }
                } catch (zzfcf unused2) {
                    zzdtiVar.zze("Failed to create Adapter.");
                }
                i = 5;
            }
            zzfye.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdtb
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzf(zzfhgVarZza);
                    return null;
                }
            }, zzdtjVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
            zzdtjVar.zzo.zza("MalformedJson");
            zzdtjVar.zzl.zza("MalformedJson");
            zzdtjVar.zze.zzd(e2);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e2, "AdapterInitializer.updateAdapterStatus");
            zzfhu zzfhuVar = zzdtjVar.zzp;
            zzfhgVarZza.zzg(e2);
            zzfhgVarZza.zzf(false);
            zzfhuVar.zzb(zzfhgVarZza.zzl());
        }
    }

    private final synchronized ListenableFuture zzu() {
        String strZzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(strZzc)) {
            return zzfye.zzh(strZzc);
        }
        final zzcas zzcasVar = new zzcas();
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(zzcasVar);
            }
        });
        return zzcasVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbko(str, z, i, str2));
    }

    final /* synthetic */ Object zzf(zzfhg zzfhgVar) throws Exception {
        this.zze.zzc(true);
        zzfhu zzfhuVar = this.zzp;
        zzfhgVar.zzf(true);
        zzfhuVar.zzb(zzfhgVar.zzl());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbko zzbkoVar = (zzbko) this.zzn.get(str);
            arrayList.add(new zzbko(str, zzbkoVar.zzb, zzbkoVar.zzc, zzbkoVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    final /* synthetic */ void zzn(zzfcw zzfcwVar, zzbks zzbksVar, List list, String str) {
        try {
            try {
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfcwVar.zzi(context, zzbksVar, list);
            } catch (zzfcf unused) {
                zzbksVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e) {
            zzcaa.zzh("", e);
        }
    }

    final /* synthetic */ void zzo(final zzcas zzcasVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsy
            @Override // java.lang.Runnable
            public final void run() {
                zzcas zzcasVar2 = zzcasVar;
                String strZzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
                if (TextUtils.isEmpty(strZzc)) {
                    zzcasVar2.zzd(new Exception());
                } else {
                    zzcasVar2.zzc(strZzc);
                }
            }
        });
    }

    final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    final /* synthetic */ void zzq(Object obj, zzcas zzcasVar, String str, long j, zzfhg zzfhgVar) {
        synchronized (obj) {
            if (!zzcasVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfhu zzfhuVar = this.zzp;
                zzfhgVar.zzc("Timeout");
                zzfhgVar.zzf(false);
                zzfhuVar.zzb(zzfhgVar.zzl());
                zzcasVar.zzc(false);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbdp.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbK)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsz
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    ListenableFuture listenableFutureZzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbM)).longValue(), TimeUnit.SECONDS);
                    zzfye.zzr(listenableFutureZzu, new zzdth(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(false);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbkv zzbkvVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtd
            @Override // java.lang.Runnable
            public final void run() {
                zzdtj zzdtjVar = this.zza;
                try {
                    zzbkvVar.zzb(zzdtjVar.zzg());
                } catch (RemoteException e) {
                    zzcaa.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
