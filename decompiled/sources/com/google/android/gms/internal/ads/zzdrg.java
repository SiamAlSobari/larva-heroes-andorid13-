package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdrg {
    final /* synthetic */ zzdrh zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdrg(zzdrh zzdrhVar) {
        this.zza = zzdrhVar;
    }

    static /* bridge */ /* synthetic */ zzdrg zza(zzdrg zzdrgVar) {
        zzdrgVar.zzb.putAll(zzdrgVar.zza.zzc);
        return zzdrgVar;
    }

    public final zzdrg zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdrg zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdrg zzd(zzfbe zzfbeVar) {
        this.zzb.put("aai", zzfbeVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgS)).booleanValue()) {
            zzc("rid", zzfbeVar.zzao);
        }
        return this;
    }

    public final zzdrg zze(zzfbi zzfbiVar) {
        this.zzb.put("gqi", zzfbiVar.zzb);
        return this;
    }

    public final String zzf() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzg() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi();
            }
        });
    }

    public final void zzh() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdre
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj();
            }
        });
    }

    final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }

    final /* synthetic */ void zzj() {
        this.zza.zza.zzd(this.zzb);
    }
}
