package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehh implements zzfxl {
    private final zzfge zza;
    private final zzcwk zzb;
    private final zzfig zzc;
    private final zzfik zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcsh zzg;
    private final zzehc zzh;
    private final zzeds zzi;
    private final Context zzj;
    private final zzfhr zzk;

    zzehh(Context context, zzfge zzfgeVar, zzehc zzehcVar, zzcwk zzcwkVar, zzfig zzfigVar, zzfik zzfikVar, zzcsh zzcshVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeds zzedsVar, zzfhr zzfhrVar) {
        this.zzj = context;
        this.zza = zzfgeVar;
        this.zzh = zzehcVar;
        this.zzb = zzcwkVar;
        this.zzc = zzfigVar;
        this.zzd = zzfikVar;
        this.zzg = zzcshVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzedsVar;
        this.zzk = zzfhrVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    @Override // com.google.android.gms.internal.ads.zzfxl
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        final zzfbr zzfbrVar = (zzfbr) obj;
        String strZza = "No fill.";
        String str = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfp)).booleanValue() ? "No ad config." : "No fill.";
        int i2 = zzfbrVar.zzb.zzb.zze;
        if (i2 == 0) {
            strZza = str;
        } else if (i2 < 200 || i2 >= 300) {
            strZza = (i2 < 300 || i2 >= 400) ? "Received error HTTP response code: " + i2 : "No location header to follow redirect or too many redirects.";
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfo)).booleanValue()) {
            strZza = str;
        }
        zzfbi zzfbiVar = zzfbrVar.zzb.zzb;
        zzfbg zzfbgVar = zzfbiVar.zzi;
        if (zzfbgVar != null) {
            strZza = zzfbgVar.zza();
        }
        this.zzi.zzh(zzfbiVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhW)).booleanValue() && (i = zzfbrVar.zzb.zzb.zze) != 0 && (i < 200 || i >= 300)) {
            return zzfye.zzg(new zzehf(3, strZza));
        }
        zzffj zzffjVarZza = zzffo.zzc(zzfye.zzg(new zzehf(3, strZza)), zzffy.RENDER_CONFIG_INIT, this.zza).zza();
        String str2 = zzfbrVar.zzb.zzb.zzo;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue() || TextUtils.isEmpty(str2)) {
            for (zzfbe zzfbeVar : zzfbrVar.zzb.zza) {
                this.zzi.zzd(zzfbeVar);
                Iterator it = zzfbeVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.zzi.zze(zzfbeVar, 0L, zzfdb.zzd(1, null, null));
                        break;
                    }
                    zzedn zzednVarZza = this.zzg.zza(zzfbeVar.zzb, (String) it.next());
                    if (zzednVarZza != null && zzednVarZza.zzb(zzfbrVar, zzfbeVar)) {
                        break;
                    }
                }
            }
        } else {
            this.zzi.zzg(str2, zzfbrVar.zzb.zza);
        }
        this.zzb.zzo(new zzcof(zzfbrVar, this.zzd, this.zzc), this.zze);
        int i3 = 0;
        for (final zzfbe zzfbeVar2 : zzfbrVar.zzb.zza) {
            for (String str3 : zzfbeVar2.zza) {
                final zzedn zzednVarZza2 = this.zzg.zza(zzfbeVar2.zzb, str3);
                if (zzednVarZza2 != null && zzednVarZza2.zzb(zzfbrVar, zzfbeVar2)) {
                    zzffjVarZza = this.zza.zzb(zzffy.RENDER_CONFIG_WATERFALL, zzffjVarZza).zzh("render-config-" + i3 + "-" + str3).zzc(Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzehg
                        @Override // com.google.android.gms.internal.ads.zzfxl
                        public final ListenableFuture zza(Object obj2) {
                            return this.zza.zzb(zzfbeVar2, zzfbrVar, zzednVarZza2, (Throwable) obj2);
                        }
                    }).zza();
                    break;
                }
            }
            i3++;
        }
        return zzffjVarZza;
    }

    final /* synthetic */ ListenableFuture zzb(zzfbe zzfbeVar, zzfbr zzfbrVar, zzedn zzednVar, Throwable th) throws Exception {
        zzfhg zzfhgVarZza = zzfhf.zza(this.zzj, 12);
        zzfhgVarZza.zzd(zzfbeVar.zzF);
        zzfhgVarZza.zzh();
        zzehc zzehcVar = this.zzh;
        ListenableFuture listenableFutureZzo = zzfye.zzo(zzednVar.zza(zzfbrVar, zzfbeVar), zzfbeVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzehcVar.zze(zzfbrVar, zzfbeVar, listenableFutureZzo, this.zzc);
        zzfhq.zza(listenableFutureZzo, this.zzk, zzfhgVarZza);
        return listenableFutureZzo;
    }
}
