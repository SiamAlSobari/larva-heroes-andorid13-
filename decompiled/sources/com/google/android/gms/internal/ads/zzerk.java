package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzerk implements zzesj {
    final String zza;
    private final zzfyo zzb;
    private final ScheduledExecutorService zzc;
    private final zzejt zzd;
    private final Context zze;
    private final zzfca zzf;
    private final zzejp zzg;
    private final zzdpc zzh;
    private final zzdtl zzi;

    zzerk(zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, String str, zzejt zzejtVar, Context context, zzfca zzfcaVar, zzejp zzejpVar, zzdpc zzdpcVar, zzdtl zzdtlVar) {
        this.zzb = zzfyoVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzejtVar;
        this.zze = context;
        this.zzf = zzfcaVar;
        this.zzg = zzejpVar;
        this.zzh = zzdpcVar;
        this.zzi = zzdtlVar;
    }

    public static /* synthetic */ ListenableFuture zzc(zzerk zzerkVar) {
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjO)).booleanValue() ? zzerkVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzerkVar.zzf.zzf;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbA)).booleanValue() ? zzerkVar.zzi.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbJ)).booleanValue()) {
            zzerkVar.zzi(arrayList, zzerkVar.zzd.zza(zzerkVar.zza, lowerCase));
        } else {
            for (Map.Entry entry : ((zzfug) zzerkVar.zzd.zzb(zzerkVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(zzerkVar.zzg(str, (List) entry.getValue(), zzerkVar.zzf(str), true, true));
            }
            zzerkVar.zzi(arrayList, zzerkVar.zzd.zzc());
        }
        return zzfye.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzerj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<ListenableFuture> list = arrayList;
                Bundle bundle = bundleZzg;
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : list) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzerl(jSONArray.toString(), bundle);
            }
        }, zzerkVar.zzb);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzfxv zzg(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzfxv zzfxvVarZzu = zzfxv.zzu(zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // com.google.android.gms.internal.ads.zzfxk
            public final ListenableFuture zza() {
                return this.zza.zzd(str, list, bundle, z, z2);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbw)).booleanValue()) {
            zzfxvVarZzu = (zzfxv) zzfye.zzo(zzfxvVarZzu, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbp)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfxv) zzfye.zze(zzfxvVarZzu, Throwable.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeri
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                zzcaa.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbqc zzbqcVar, Bundle bundle, List list, zzejw zzejwVar) throws RemoteException {
        zzbqcVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzejwVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzejx zzejxVar = (zzejx) ((Map.Entry) it.next()).getValue();
            String str = zzejxVar.zza;
            list.add(zzg(str, Collections.singletonList(zzejxVar.zze), zzf(str), zzejxVar.zzb, zzejxVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        zzfca zzfcaVar = this.zzf;
        if (zzfcaVar.zzq) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbC)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfcaVar.zzd)))) {
                return zzfye.zzh(new zzerl(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzere
            @Override // com.google.android.gms.internal.ads.zzfxk
            public final ListenableFuture zza() {
                return zzerk.zzc(this.zza);
            }
        }, this.zzb);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ ListenableFuture zzd(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbqc zzbqcVarZzb;
        final zzcas zzcasVar = new zzcas();
        if (z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbB)).booleanValue()) {
                try {
                    zzbqcVarZzb = this.zzh.zzb(str);
                } catch (RemoteException e) {
                    zzcaa.zzh("Couldn't create RTB adapter : ", e);
                    zzbqcVarZzb = null;
                }
            } else {
                this.zzg.zzb(str);
                zzbqcVarZzb = this.zzg.zza(str);
            }
        } else {
            zzbqcVarZzb = this.zzh.zzb(str);
        }
        if (zzbqcVarZzb == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbr)).booleanValue()) {
                throw null;
            }
            zzejw.zzb(str, zzcasVar);
        } else {
            final zzejw zzejwVar = new zzejw(str, zzbqcVarZzb, zzcasVar, com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbw)).booleanValue()) {
                this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzerf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzejwVar.zzc();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbp)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbD)).booleanValue()) {
                    final zzbqc zzbqcVar = zzbqcVarZzb;
                    this.zzb.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzerg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze(zzbqcVar, bundle, list, zzejwVar, zzcasVar);
                        }
                    });
                } else {
                    zzh(zzbqcVarZzb, bundle, list, zzejwVar);
                }
            } else {
                zzejwVar.zzd();
            }
        }
        return zzcasVar;
    }

    final /* synthetic */ void zze(zzbqc zzbqcVar, Bundle bundle, List list, zzejw zzejwVar, zzcas zzcasVar) {
        try {
            zzh(zzbqcVar, bundle, list, zzejwVar);
        } catch (RemoteException e) {
            zzcasVar.zzd(e);
        }
    }
}
