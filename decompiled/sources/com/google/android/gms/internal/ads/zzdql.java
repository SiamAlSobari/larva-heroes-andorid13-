package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdql implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzdql(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setEmptySet;
        final String str = (String) this.zza.zzb();
        Context contextZza = ((zzchj) this.zzb).zza();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        Map mapZzb = ((zzgyx) this.zzd).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeL)).booleanValue()) {
            zzaxe zzaxeVar = new zzaxe(new zzaxk(contextZza));
            zzaxeVar.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzdqm
                @Override // com.google.android.gms.internal.ads.zzaxd
                public final void zza(zzayt zzaytVar) {
                    zzaytVar.zzh(str);
                }
            });
            setEmptySet = Collections.singleton(new zzddo(new zzdqo(zzaxeVar, mapZzb), zzfyoVar));
        } else {
            setEmptySet = Collections.emptySet();
        }
        zzgzb.zzb(setEmptySet);
        return setEmptySet;
    }
}
