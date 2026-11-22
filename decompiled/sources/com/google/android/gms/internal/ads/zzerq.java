package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzerq implements zzesj {
    private final String zza;
    private final zzfyo zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfca zze;
    private final zzchd zzf;

    zzerq(zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfca zzfcaVar, zzchd zzchdVar) {
        this.zzb = zzfyoVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfcaVar;
        this.zzf = zzchdVar;
    }

    public static /* synthetic */ ListenableFuture zzc(zzerq zzerqVar) {
        String strName = zzerqVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgY)).booleanValue()) {
            strName = AdFormat.UNKNOWN.name();
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzg zzgVarZzo = zzerqVar.zzf.zzo();
        zzcvq zzcvqVar = new zzcvq();
        zzcvqVar.zze(zzerqVar.zzd);
        zzfby zzfbyVar = new zzfby();
        zzfbyVar.zzs("adUnitId");
        zzfbyVar.zzE(zzerqVar.zze.zzd);
        zzfbyVar.zzr(new com.google.android.gms.ads.internal.client.zzq());
        zzfbyVar.zzx(true);
        zzcvqVar.zzi(zzfbyVar.zzG());
        zzgVarZzo.zza(zzcvqVar.zzj());
        com.google.android.gms.ads.nonagon.signalgeneration.zzac zzacVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzac();
        zzacVar.zza(strName);
        zzgVarZzo.zzb(zzacVar.zzb());
        new zzdbt();
        return zzfye.zze(zzfye.zzm((zzfxv) zzfye.zzo(zzfxv.zzu(zzgVarZzo.zzc().zzc()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgZ)).longValue(), TimeUnit.MILLISECONDS, zzerqVar.zzc), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzero
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzam zzamVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzam) obj;
                return zzamVar != null ? new zzerr(zzamVar.zza) : new zzerr(null);
            }
        }, zzerqVar.zzb), Exception.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzerp
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                zzcaa.zzh("", (Exception) obj);
                return new zzerr(null);
            }
        }, zzerqVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgX)).booleanValue() || this.zze.zzq) ? zzfye.zzh(new zzerr(null)) : zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzern
            @Override // com.google.android.gms.internal.ads.zzfxk
            public final ListenableFuture zza() {
                return zzerq.zzc(this.zza);
            }
        }, this.zzb);
    }
}
