package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzdro {
    protected final Executor zzc;
    protected final zzcaf zzd;
    private final zzfgy zzf;
    protected final String zza = (String) zzbde.zzb.zze();
    protected final Map zzb = new HashMap();
    protected final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbU)).booleanValue();
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbX)).booleanValue();
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgT)).booleanValue();

    protected zzdro(Executor executor, zzcaf zzcafVar, zzfgy zzfgyVar) {
        this.zzc = executor;
        this.zzd = zzcafVar;
        this.zzf = zzfgyVar;
    }

    private final void zza(Map map, boolean z) {
        if (map.isEmpty()) {
            zzcaa.zze("Empty paramMap.");
            return;
        }
        final String strZza = this.zzf.zza(map);
        com.google.android.gms.ads.internal.util.zze.zza(strZza);
        boolean z2 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z || this.zzg) {
                if (!z2 || this.zzh) {
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrn
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdro zzdroVar = this.zza;
                            zzdroVar.zzd.zza(strZza);
                        }
                    });
                }
            }
        }
    }

    protected final String zzb(Map map) {
        return this.zzf.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final void zzd(Map map) {
        zza(map, true);
    }

    public final void zze(Map map) {
        zza(map, false);
    }
}
