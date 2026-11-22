package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzo extends zzbty {
    private final Context zza;
    private final zzfyo zzb;
    private final zzeag zzc;
    private final zzcmp zzd;
    private final ArrayDeque zze;
    private final zzfhu zzf;
    private final zzbuz zzg;
    private final zzead zzh;

    public zzdzo(Context context, zzfyo zzfyoVar, zzbuz zzbuzVar, zzcmp zzcmpVar, zzeag zzeagVar, ArrayDeque arrayDeque, zzead zzeadVar, zzfhu zzfhuVar) {
        zzbbr.zza(context);
        this.zza = context;
        this.zzb = zzfyoVar;
        this.zzg = zzbuzVar;
        this.zzc = zzeagVar;
        this.zzd = zzcmpVar;
        this.zze = arrayDeque;
        this.zzh = zzeadVar;
        this.zzf = zzfhuVar;
    }

    private final synchronized zzdzl zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdzl zzdzlVar = (zzdzl) it.next();
            if (zzdzlVar.zzc.equals(str)) {
                it.remove();
                return zzdzlVar;
            }
        }
        return null;
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, zzfge zzfgeVar, zzbni zzbniVar, zzfhr zzfhrVar, zzfhg zzfhgVar) {
        zzbmy zzbmyVarZza = zzbniVar.zza("AFMA_getAdDictionary", zzbnf.zza, new zzbna() { // from class: com.google.android.gms.internal.ads.zzdzf
            @Override // com.google.android.gms.internal.ads.zzbna
            public final Object zza(JSONObject jSONObject) {
                return new zzbuq(jSONObject);
            }
        });
        zzfhq.zzd(listenableFuture, zzfhgVar);
        zzffj zzffjVarZza = zzfgeVar.zzb(zzffy.BUILD_URL, listenableFuture).zzf(zzbmyVarZza).zza();
        zzfhq.zzc(zzffjVarZza, zzfhrVar, zzfhgVar);
        return zzffjVarZza;
    }

    private static ListenableFuture zzm(zzbun zzbunVar, zzfge zzfgeVar, final zzeth zzethVar) {
        zzfxl zzfxlVar = new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdyz
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzethVar.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
            }
        };
        return zzfgeVar.zzb(zzffy.GMS_SIGNALS, zzfye.zzh(zzbunVar.zza)).zzf(zzfxlVar).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzdza
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzdzl zzdzlVar) {
        zzo();
        this.zze.addLast(zzdzlVar);
    }

    private final synchronized void zzo() {
        int iIntValue = ((Long) zzbdq.zzc.zze()).intValue();
        while (this.zze.size() >= iIntValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(ListenableFuture listenableFuture, zzbuj zzbujVar) {
        zzfye.zzr(zzfye.zzn(listenableFuture, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzi
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzfye.zzh(zzfda.zza((InputStream) obj));
            }
        }, zzcan.zza), new zzdzk(this, zzbujVar), zzcan.zzf);
    }

    public final ListenableFuture zzb(final zzbun zzbunVar, int i) {
        if (!((Boolean) zzbdq.zza.zze()).booleanValue()) {
            return zzfye.zzg(new Exception("Split request is disabled."));
        }
        zzfdu zzfduVar = zzbunVar.zzi;
        if (zzfduVar == null) {
            return zzfye.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfduVar.zzc == 0 || zzfduVar.zzd == 0) {
            return zzfye.zzg(new Exception("Caching is disabled."));
        }
        zzbni zzbniVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcag.zza(), this.zzf);
        zzeth zzethVarZzq = this.zzd.zzq(zzbunVar, i);
        zzfge zzfgeVarZzc = zzethVarZzq.zzc();
        final ListenableFuture listenableFutureZzm = zzm(zzbunVar, zzfgeVarZzc, zzethVarZzq);
        zzfhr zzfhrVarZzd = zzethVarZzq.zzd();
        final zzfhg zzfhgVarZza = zzfhf.zza(this.zza, 9);
        final ListenableFuture listenableFutureZzl = zzl(listenableFutureZzm, zzfgeVarZzc, zzbniVarZzb, zzfhrVarZzd, zzfhgVarZza);
        return zzfgeVarZzc.zza(zzffy.GET_URL_AND_CACHE_KEY, listenableFutureZzm, listenableFutureZzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzj(listenableFutureZzl, listenableFutureZzm, zzbunVar, zzfhgVarZza);
            }
        }).zza();
    }

    public final ListenableFuture zzc(zzbun zzbunVar, int i) {
        zzdzl zzdzlVarZzk;
        zzffj zzffjVarZza;
        zzbni zzbniVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcag.zza(), this.zzf);
        zzeth zzethVarZzq = this.zzd.zzq(zzbunVar, i);
        zzbmy zzbmyVarZza = zzbniVarZzb.zza("google.afma.response.normalize", zzdzn.zza, zzbnf.zzb);
        if (((Boolean) zzbdq.zza.zze()).booleanValue()) {
            zzdzlVarZzk = zzk(zzbunVar.zzh);
            if (zzdzlVarZzk == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbunVar.zzj;
            zzdzlVarZzk = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzfhg zzfhgVarZza = zzdzlVarZzk == null ? zzfhf.zza(this.zza, 9) : zzdzlVarZzk.zze;
        zzfhr zzfhrVarZzd = zzethVarZzq.zzd();
        zzfhrVarZzd.zzd(zzbunVar.zza.getStringArrayList("ad_types"));
        zzeaf zzeafVar = new zzeaf(zzbunVar.zzg, zzfhrVarZzd, zzfhgVarZza);
        zzeac zzeacVar = new zzeac(this.zza, zzbunVar.zzb.zza, this.zzg, i);
        zzfge zzfgeVarZzc = zzethVarZzq.zzc();
        zzfhg zzfhgVarZza2 = zzfhf.zza(this.zza, 11);
        if (zzdzlVarZzk == null) {
            final ListenableFuture listenableFutureZzm = zzm(zzbunVar, zzfgeVarZzc, zzethVarZzq);
            final ListenableFuture listenableFutureZzl = zzl(listenableFutureZzm, zzfgeVarZzc, zzbniVarZzb, zzfhrVarZzd, zzfhgVarZza);
            zzfhg zzfhgVarZza3 = zzfhf.zza(this.zza, 10);
            final zzffj zzffjVarZza2 = zzfgeVarZzc.zza(zzffy.HTTP, listenableFutureZzl, listenableFutureZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzc
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzeae((JSONObject) listenableFutureZzm.get(), (zzbuq) listenableFutureZzl.get());
                }
            }).zze(zzeafVar).zze(new zzfhm(zzfhgVarZza3)).zze(zzeacVar).zza();
            zzfhq.zza(zzffjVarZza2, zzfhrVarZzd, zzfhgVarZza3);
            zzfhq.zzd(zzffjVarZza2, zzfhgVarZza2);
            zzffjVarZza = zzfgeVarZzc.zza(zzffy.PRE_PROCESS, listenableFutureZzm, listenableFutureZzl, zzffjVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzd
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdzn((zzeab) zzffjVarZza2.get(), (JSONObject) listenableFutureZzm.get(), (zzbuq) listenableFutureZzl.get());
                }
            }).zzf(zzbmyVarZza).zza();
        } else {
            zzeae zzeaeVar = new zzeae(zzdzlVarZzk.zzb, zzdzlVarZzk.zza);
            zzfhg zzfhgVarZza4 = zzfhf.zza(this.zza, 10);
            final zzffj zzffjVarZza3 = zzfgeVarZzc.zzb(zzffy.HTTP, zzfye.zzh(zzeaeVar)).zze(zzeafVar).zze(new zzfhm(zzfhgVarZza4)).zze(zzeacVar).zza();
            zzfhq.zza(zzffjVarZza3, zzfhrVarZzd, zzfhgVarZza4);
            final ListenableFuture listenableFutureZzh = zzfye.zzh(zzdzlVarZzk);
            zzfhq.zzd(zzffjVarZza3, zzfhgVarZza2);
            zzffjVarZza = zzfgeVarZzc.zza(zzffy.PRE_PROCESS, zzffjVarZza3, listenableFutureZzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzh
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ListenableFuture listenableFuture = zzffjVarZza3;
                    ListenableFuture listenableFuture2 = listenableFutureZzh;
                    return new zzdzn((zzeab) listenableFuture.get(), ((zzdzl) listenableFuture2.get()).zzb, ((zzdzl) listenableFuture2.get()).zza);
                }
            }).zzf(zzbmyVarZza).zza();
        }
        zzfhq.zza(zzffjVarZza, zzfhrVarZzd, zzfhgVarZza2);
        return zzffjVarZza;
    }

    public final ListenableFuture zzd(zzbun zzbunVar, int i) {
        zzbni zzbniVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcag.zza(), this.zzf);
        if (!((Boolean) zzbdv.zza.zze()).booleanValue()) {
            return zzfye.zzg(new Exception("Signal collection disabled."));
        }
        zzeth zzethVarZzq = this.zzd.zzq(zzbunVar, i);
        final zzesm zzesmVarZza = zzethVarZzq.zza();
        zzbmy zzbmyVarZza = zzbniVarZzb.zza("google.afma.request.getSignals", zzbnf.zza, zzbnf.zzb);
        zzfhg zzfhgVarZza = zzfhf.zza(this.zza, 22);
        zzffj zzffjVarZza = zzethVarZzq.zzc().zzb(zzffy.GET_SIGNALS, zzfye.zzh(zzbunVar.zza)).zze(new zzfhm(zzfhgVarZza)).zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzg
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzesmVarZza.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
            }
        }).zzb(zzffy.JS_SIGNALS).zzf(zzbmyVarZza).zza();
        zzfhr zzfhrVarZzd = zzethVarZzq.zzd();
        zzfhrVarZzd.zzd(zzbunVar.zza.getStringArrayList("ad_types"));
        zzfhq.zzb(zzffjVarZza, zzfhrVarZzd, zzfhgVarZza);
        if (((Boolean) zzbdk.zze.zze()).booleanValue()) {
            zzeag zzeagVar = this.zzc;
            zzeagVar.getClass();
            zzffjVarZza.addListener(new zzdzb(zzeagVar), this.zzb);
        }
        return zzffjVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zze(zzbun zzbunVar, zzbuj zzbujVar) {
        zzp(zzb(zzbunVar, Binder.getCallingUid()), zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzf(zzbun zzbunVar, zzbuj zzbujVar) {
        zzp(zzd(zzbunVar, Binder.getCallingUid()), zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzg(zzbun zzbunVar, zzbuj zzbujVar) {
        ListenableFuture listenableFutureZzc = zzc(zzbunVar, Binder.getCallingUid());
        zzp(listenableFutureZzc, zzbujVar);
        if (((Boolean) zzbdk.zzc.zze()).booleanValue()) {
            zzeag zzeagVar = this.zzc;
            zzeagVar.getClass();
            listenableFutureZzc.addListener(new zzdzb(zzeagVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzh(String str, zzbuj zzbujVar) {
        zzp(zzi(str), zzbujVar);
    }

    public final ListenableFuture zzi(String str) {
        if (((Boolean) zzbdq.zza.zze()).booleanValue()) {
            return zzk(str) == null ? zzfye.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzfye.zzh(new zzdzj(this));
        }
        return zzfye.zzg(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzj(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbun zzbunVar, zzfhg zzfhgVar) throws Exception {
        String strZzc = ((zzbuq) listenableFuture.get()).zzc();
        zzn(new zzdzl((zzbuq) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzbunVar.zzh, strZzc, zzfhgVar));
        return new ByteArrayInputStream(strZzc.getBytes(zzfqu.zzc));
    }
}
