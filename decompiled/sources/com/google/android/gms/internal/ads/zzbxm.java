package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbxm extends zzbyg {
    private final Clock zzb;
    private final zzbxm zzc = this;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;
    private final zzgzg zzk;

    /* synthetic */ zzbxm(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyf zzbyfVar, zzbxl zzbxlVar) {
        this.zzb = clock;
        zzgyt zzgytVarZza = zzgyu.zza(context);
        this.zzd = zzgytVarZza;
        zzgyt zzgytVarZza2 = zzgyu.zza(zzgVar);
        this.zze = zzgytVarZza2;
        zzgyt zzgytVarZza3 = zzgyu.zza(zzbyfVar);
        this.zzf = zzgytVarZza3;
        this.zzg = zzgys.zzc(new zzbxe(zzgytVarZza, zzgytVarZza2, zzgytVarZza3));
        zzgyt zzgytVarZza4 = zzgyu.zza(clock);
        this.zzh = zzgytVarZza4;
        zzgzg zzgzgVarZzc = zzgys.zzc(new zzbxg(zzgytVarZza4, zzgytVarZza2, zzgytVarZza3));
        this.zzi = zzgzgVarZzc;
        zzbxi zzbxiVar = new zzbxi(zzgytVarZza4, zzgzgVarZzc);
        this.zzj = zzbxiVar;
        this.zzk = zzgys.zzc(new zzbyl(zzgytVarZza, zzbxiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    final zzbxd zza() {
        return (zzbxd) this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    final zzbxh zzb() {
        return new zzbxh(this.zzb, (zzbxf) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    final zzbyk zzc() {
        return (zzbyk) this.zzk.zzb();
    }
}
