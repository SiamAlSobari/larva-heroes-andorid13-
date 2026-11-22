package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzars implements zzfnb {
    private final zzfle zza;
    private final zzflv zzb;
    private final zzasf zzc;
    private final zzarr zzd;
    private final zzarb zze;
    private final zzash zzf;
    private final zzarz zzg;
    private final zzarq zzh;

    zzars(zzfle zzfleVar, zzflv zzflvVar, zzasf zzasfVar, zzarr zzarrVar, zzarb zzarbVar, zzash zzashVar, zzarz zzarzVar, zzarq zzarqVar) {
        this.zza = zzfleVar;
        this.zzb = zzflvVar;
        this.zzc = zzasfVar;
        this.zzd = zzarrVar;
        this.zze = zzarbVar;
        this.zzf = zzashVar;
        this.zzg = zzarzVar;
        this.zzh = zzarqVar;
    }

    private final Map zze() {
        HashMap map = new HashMap();
        zzaos zzaosVarZzb = this.zzb.zzb();
        map.put("v", this.zza.zzb());
        map.put("gms", Boolean.valueOf(this.zza.zzc()));
        map.put("int", zzaosVarZzb.zzh());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzarz zzarzVar = this.zzg;
        if (zzarzVar != null) {
            map.put("tcq", Long.valueOf(zzarzVar.zzc()));
            map.put("tpq", Long.valueOf(this.zzg.zzg()));
            map.put("tcv", Long.valueOf(this.zzg.zzd()));
            map.put("tpv", Long.valueOf(this.zzg.zzh()));
            map.put("tchv", Long.valueOf(this.zzg.zzb()));
            map.put("tphv", Long.valueOf(this.zzg.zzf()));
            map.put("tcc", Long.valueOf(this.zzg.zza()));
            map.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfnb
    public final Map zza() {
        Map mapZze = zze();
        mapZze.put("lts", Long.valueOf(this.zzc.zza()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnb
    public final Map zzb() {
        Map mapZze = zze();
        zzaos zzaosVarZza = this.zzb.zza();
        mapZze.put("gai", Boolean.valueOf(this.zza.zzd()));
        mapZze.put("did", zzaosVarZza.zzg());
        mapZze.put("dst", Integer.valueOf(zzaosVarZza.zzal() - 1));
        mapZze.put("doo", Boolean.valueOf(zzaosVarZza.zzai()));
        zzarb zzarbVar = this.zze;
        if (zzarbVar != null) {
            mapZze.put("nt", Long.valueOf(zzarbVar.zza()));
        }
        zzash zzashVar = this.zzf;
        if (zzashVar != null) {
            mapZze.put("vs", Long.valueOf(zzashVar.zzc()));
            mapZze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnb
    public final Map zzc() {
        Map mapZze = zze();
        zzarq zzarqVar = this.zzh;
        if (zzarqVar != null) {
            mapZze.put("vst", zzarqVar.zza());
        }
        return mapZze;
    }

    final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
