package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcir extends zzetw {
    private final zzevc zza;
    private final zzciz zzb;
    private final zzcir zzc = this;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;
    private final zzgzg zzk;
    private final zzgzg zzl;
    private final zzgzg zzm;
    private final zzgzg zzn;

    /* synthetic */ zzcir(zzciz zzcizVar, zzevc zzevcVar, zzciq zzciqVar) {
        this.zzb = zzcizVar;
        this.zza = zzevcVar;
        zzeve zzeveVar = new zzeve(zzevcVar);
        this.zzd = zzeveVar;
        zzgzg zzgzgVarZzc = zzgys.zzc(zzdqg.zza());
        this.zze = zzgzgVarZzc;
        zzgzg zzgzgVarZzc2 = zzgys.zzc(zzdqe.zza());
        this.zzf = zzgzgVarZzc2;
        zzgzg zzgzgVarZzc3 = zzgys.zzc(zzdqi.zza());
        this.zzg = zzgzgVarZzc3;
        zzgzg zzgzgVarZzc4 = zzgys.zzc(zzdqk.zza());
        this.zzh = zzgzgVarZzc4;
        zzgyw zzgywVarZzc = zzgyx.zzc(4);
        zzgywVarZzc.zzb(zzffy.GMS_SIGNALS, zzgzgVarZzc);
        zzgywVarZzc.zzb(zzffy.BUILD_URL, zzgzgVarZzc2);
        zzgywVarZzc.zzb(zzffy.HTTP, zzgzgVarZzc3);
        zzgywVarZzc.zzb(zzffy.PRE_PROCESS, zzgzgVarZzc4);
        zzgyx zzgyxVarZzc = zzgywVarZzc.zzc();
        this.zzi = zzgyxVarZzc;
        zzgzg zzgzgVarZzc5 = zzgys.zzc(new zzdql(zzeveVar, zzcizVar.zzg, zzfez.zza(), zzgyxVarZzc));
        this.zzj = zzgzgVarZzc5;
        zzgzd zzgzdVarZza = zzgze.zza(0, 1);
        zzgzdVarZza.zza(zzgzgVarZzc5);
        zzgze zzgzeVarZzc = zzgzdVarZza.zzc();
        this.zzk = zzgzeVarZzc;
        zzfgh zzfghVar = new zzfgh(zzgzeVarZzc);
        this.zzl = zzfghVar;
        this.zzm = zzgys.zzc(new zzfgg(zzfez.zza(), zzcizVar.zzm, zzfghVar));
        this.zzn = zzgys.zzc(new zzfhs(zzcizVar.zzG));
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final zzesm zza() {
        Context contextZza = this.zzb.zza.zza();
        zzgzb.zzb(contextZza);
        zzbyx zzbyxVar = new zzbyx();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        zzeuw zzeuwVar = new zzeuw(zzbyxVar, zzfyoVar, zzevd.zza(this.zza));
        zzfyo zzfyoVar2 = zzcan.zza;
        zzgzb.zzb(zzfyoVar2);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzm.zzb();
        zzfhr zzfhrVar = (zzfhr) this.zzn.zzb();
        zzdrh zzdrhVar = (zzdrh) this.zzb.zzZ.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzeqr(zzeuwVar, 0L, scheduledExecutorService));
        return new zzesm(contextZza, zzfyoVar2, hashSet, zzfhrVar, zzdrhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final zzfge zzb() {
        return (zzfge) this.zzm.zzb();
    }
}
