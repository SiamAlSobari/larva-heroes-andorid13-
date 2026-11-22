package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbyg {
    static zzbyg zza;

    public static synchronized zzbyg zzd(Context context) {
        zzbyg zzbygVar = zza;
        if (zzbygVar != null) {
            return zzbygVar;
        }
        Context applicationContext = context.getApplicationContext();
        zzbbr.zza(applicationContext);
        com.google.android.gms.ads.internal.util.zzg zzgVarZzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
        zzgVarZzh.zzr(applicationContext);
        zzbxk zzbxkVar = new zzbxk(null);
        zzbxkVar.zzb(applicationContext);
        zzbxkVar.zzc(com.google.android.gms.ads.internal.zzt.zzB());
        zzbxkVar.zza(zzgVarZzh);
        zzbxkVar.zzd(com.google.android.gms.ads.internal.zzt.zzn());
        zzbyg zzbygVarZze = zzbxkVar.zze();
        zza = zzbygVarZze;
        zzbygVarZze.zza().zza();
        zza.zzb().zzc();
        zzbyk zzbykVarZzc = zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzar)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            Map mapZzs = com.google.android.gms.ads.internal.util.zzs.zzs((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzat));
            Iterator it = mapZzs.keySet().iterator();
            while (it.hasNext()) {
                zzbykVarZzc.zzc((String) it.next());
            }
            zzbykVarZzc.zzd(new zzbyi(zzbykVarZzc, mapZzs));
        }
        return zza;
    }

    abstract zzbxd zza();

    abstract zzbxh zzb();

    abstract zzbyk zzc();
}
