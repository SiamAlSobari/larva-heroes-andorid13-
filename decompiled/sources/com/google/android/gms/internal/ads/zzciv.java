package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzciv extends zzety {
    private final zzetm zza;
    private final zzciz zzb;
    private final zzciv zzc = this;
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

    /* synthetic */ zzciv(zzciz zzcizVar, zzetm zzetmVar, zzciu zzciuVar) {
        this.zzb = zzcizVar;
        this.zza = zzetmVar;
        this.zzd = zzgys.zzc(new zzfhs(zzcizVar.zzG));
        zzetu zzetuVar = new zzetu(zzetmVar);
        this.zze = zzetuVar;
        zzgzg zzgzgVarZzc = zzgys.zzc(zzdqg.zza());
        this.zzf = zzgzgVarZzc;
        zzgzg zzgzgVarZzc2 = zzgys.zzc(zzdqe.zza());
        this.zzg = zzgzgVarZzc2;
        zzgzg zzgzgVarZzc3 = zzgys.zzc(zzdqi.zza());
        this.zzh = zzgzgVarZzc3;
        zzgzg zzgzgVarZzc4 = zzgys.zzc(zzdqk.zza());
        this.zzi = zzgzgVarZzc4;
        zzgyw zzgywVarZzc = zzgyx.zzc(4);
        zzgywVarZzc.zzb(zzffy.GMS_SIGNALS, zzgzgVarZzc);
        zzgywVarZzc.zzb(zzffy.BUILD_URL, zzgzgVarZzc2);
        zzgywVarZzc.zzb(zzffy.HTTP, zzgzgVarZzc3);
        zzgywVarZzc.zzb(zzffy.PRE_PROCESS, zzgzgVarZzc4);
        zzgyx zzgyxVarZzc = zzgywVarZzc.zzc();
        this.zzj = zzgyxVarZzc;
        zzgzg zzgzgVarZzc5 = zzgys.zzc(new zzdql(zzetuVar, zzcizVar.zzg, zzfez.zza(), zzgyxVarZzc));
        this.zzk = zzgzgVarZzc5;
        zzgzd zzgzdVarZza = zzgze.zza(0, 1);
        zzgzdVarZza.zza(zzgzgVarZzc5);
        zzgze zzgzeVarZzc = zzgzdVarZza.zzc();
        this.zzl = zzgzeVarZzc;
        zzfgh zzfghVar = new zzfgh(zzgzeVarZzc);
        this.zzm = zzfghVar;
        this.zzn = zzgys.zzc(new zzfgg(zzfez.zza(), zzcizVar.zzm, zzfghVar));
    }

    @Override // com.google.android.gms.internal.ads.zzety
    public final zzesm zza() {
        Context contextZza = this.zzb.zza.zza();
        zzgzb.zzb(contextZza);
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        zzbyx zzbyxVar = new zzbyx();
        zzfyo zzfyoVar2 = zzcan.zza;
        zzgzb.zzb(zzfyoVar2);
        zzesj zzesjVarZza = zzevs.zza(new zzeuw(zzbyxVar, zzfyoVar2, zzetn.zza(this.zza)), zzeql.zza(), (ScheduledExecutorService) this.zzb.zzm.zzb(), 0);
        zzbsg zzbsgVar = new zzbsg();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzm.zzb();
        Context contextZza2 = this.zzb.zza.zza();
        zzgzb.zzb(contextZza2);
        zzesj zzesjVarZzb = zzevs.zzb(new zzevg(zzbsgVar, scheduledExecutorService, contextZza2), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzbza zzbzaVar = new zzbza();
        Context contextZza3 = this.zzb.zza.zza();
        zzgzb.zzb(contextZza3);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.zzb.zzm.zzb();
        zzfyo zzfyoVar3 = zzcan.zza;
        zzgzb.zzb(zzfyoVar3);
        zzesj zzesjVarZza2 = zzevt.zza(zzetg.zza(zzbzaVar, contextZza3, scheduledExecutorService2, zzfyoVar3, zzeto.zza(this.zza), zzetq.zza(this.zza), zzetr.zza(this.zza)), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzfyo zzfyoVar4 = zzcan.zza;
        zzgzb.zzb(zzfyoVar4);
        zzesj zzesjVarZzc = zzevs.zzc(new zzewb(zzfyoVar4), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzevq zzevqVar = zzevq.zza;
        Context contextZza4 = this.zzb.zza.zza();
        zzgzb.zzb(contextZza4);
        String strZza = zzetn.zza(this.zza);
        zzfyo zzfyoVar5 = zzcan.zza;
        zzgzb.zzb(zzfyoVar5);
        zzeua zzeuaVar = new zzeua(null, contextZza4, strZza, zzfyoVar5);
        zzawt zzawtVar = new zzawt();
        zzfyo zzfyoVar6 = zzcan.zza;
        zzgzb.zzb(zzfyoVar6);
        Context contextZza5 = this.zzb.zza.zza();
        zzgzb.zzb(contextZza5);
        zzbbc zzbbcVar = new zzbbc();
        zzfyo zzfyoVar7 = zzcan.zza;
        zzgzb.zzb(zzfyoVar7);
        zzbza zzbzaVar2 = new zzbza();
        zzfyo zzfyoVar8 = zzcan.zza;
        zzgzb.zzb(zzfyoVar8);
        zzbza zzbzaVar3 = new zzbza();
        int iZza = zzeto.zza(this.zza);
        Context contextZza6 = this.zzb.zza.zza();
        zzgzb.zzb(contextZza6);
        zzbzj zzbzjVar = (zzbzj) this.zzb.zzah.zzb();
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.zzb.zzm.zzb();
        zzfyo zzfyoVar9 = zzcan.zza;
        zzgzb.zzb(zzfyoVar9);
        String strZza2 = zzetn.zza(this.zza);
        zzawh zzawhVar = new zzawh();
        zzbzj zzbzjVar2 = (zzbzj) this.zzb.zzah.zzb();
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.zzb.zzm.zzb();
        zzfyo zzfyoVar10 = zzcan.zza;
        zzgzb.zzb(zzfyoVar10);
        return new zzesm(contextZza, zzfyoVar, zzfui.zzp(zzesjVarZza, zzesjVarZzb, zzesjVarZza2, zzesjVarZzc, zzevqVar, zzeuaVar, new zzeup(zzawtVar, zzfyoVar6, contextZza5), new zzeva(zzbbcVar, zzfyoVar7, zzetp.zza(this.zza)), new zzetk(zzbzaVar2, zzfyoVar8, zzets.zza(this.zza), zzett.zza(this.zza), zzeto.zza(this.zza)), new zzeul(zzbzaVar3, iZza, contextZza6, zzbzjVar, scheduledExecutorService3, zzfyoVar9, zzetn.zza(this.zza)), (zzesj) this.zzb.zzaJ.zzb(), zzeuh.zza(strZza2, zzawhVar, zzbzjVar2, scheduledExecutorService4, zzfyoVar10)), (zzfhr) this.zzd.zzb(), (zzdrh) this.zzb.zzZ.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzety
    public final zzfge zzb() {
        return (zzfge) this.zzn.zzb();
    }
}
