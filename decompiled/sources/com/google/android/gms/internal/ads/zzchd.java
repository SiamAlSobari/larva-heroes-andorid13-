package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzchd implements zzcmp {

    @Nullable
    private static zzchd zza;

    private static synchronized zzchd zzD(Context context, @Nullable zzbof zzbofVar, int i, boolean z, int i2, zzcih zzcihVar) {
        zzchd zzchdVar = zza;
        if (zzchdVar != null) {
            return zzchdVar;
        }
        zzbbr.zza(context);
        zzfcu zzfcuVarZzd = zzfcu.zzd(context);
        zzcag zzcagVarZzc = zzfcuVarZzd.zzc(233012000, false, i2);
        zzfcuVarZzd.zzf(zzbofVar);
        zzcjv zzcjvVar = new zzcjv(null);
        zzche zzcheVar = new zzche();
        zzcheVar.zzd(zzcagVarZzc);
        zzcheVar.zzc(context);
        zzcjvVar.zzb(new zzchg(zzcheVar, null));
        zzcjvVar.zzc(new zzcli(zzcihVar));
        zzchd zzchdVarZza = zzcjvVar.zza();
        com.google.android.gms.ads.internal.zzt.zzo().zzs(context, zzcagVarZzc);
        com.google.android.gms.ads.internal.zzt.zzc().zzi(context);
        com.google.android.gms.ads.internal.zzt.zzp().zzj(context);
        com.google.android.gms.ads.internal.zzt.zzp().zzi(context);
        com.google.android.gms.ads.internal.util.zzd.zza(context);
        com.google.android.gms.ads.internal.zzt.zzb().zzd(context);
        com.google.android.gms.ads.internal.zzt.zzv().zzb(context);
        zzchdVarZza.zza().zzc();
        zzbyg.zzd(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzav)).booleanValue()) {
                zzaxe zzaxeVar = new zzaxe(new zzaxk(context));
                zzeba zzebaVar = new zzeba(new zzeaw(context), zzchdVarZza.zzA());
                com.google.android.gms.ads.internal.zzt.zzp();
                new zzebw(context, zzcagVarZzc, zzaxeVar, zzebaVar, UUID.randomUUID().toString(), zzchdVarZza.zzy()).zzb(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzQ());
            }
        }
        zza = zzchdVarZza;
        return zzchdVarZza;
    }

    public static zzchd zzb(Context context, @Nullable zzbof zzbofVar, int i) {
        return zzD(context, zzbofVar, 233012000, false, i, new zzcih());
    }

    public abstract zzfyo zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    public abstract com.google.android.gms.ads.internal.util.zzcd zza();

    public abstract zzcls zzc();

    public abstract zzcpp zzd();

    public abstract zzcqy zze();

    public abstract zzcyx zzf();

    public abstract zzdfp zzg();

    public abstract zzdgl zzh();

    public abstract zzdnu zzi();

    public abstract zzdsp zzj();

    public abstract zzdue zzk();

    public abstract zzduy zzl();

    public abstract zzecs zzm();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzc zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzg zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzaa zzp();

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final zzeth zzq(zzbun zzbunVar, int i) {
        return zzr(new zzevj(zzbunVar, i));
    }

    protected abstract zzeth zzr(zzevj zzevjVar);

    public abstract zzewe zzs();

    public abstract zzexs zzt();

    public abstract zzezj zzu();

    public abstract zzfax zzv();

    public abstract zzfcn zzw();

    public abstract zzfcx zzx();

    public abstract zzfgo zzy();

    public abstract zzfhu zzz();
}
