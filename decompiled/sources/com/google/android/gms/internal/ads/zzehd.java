package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehd {
    private final zzfcq zza;
    private final zzdoz zzb;
    private final zzdrh zzc;
    private final zzfgo zzd;

    public zzehd(zzfcq zzfcqVar, zzdoz zzdozVar, zzdrh zzdrhVar, zzfgo zzfgoVar) {
        this.zza = zzfcqVar;
        this.zzb = zzdozVar;
        this.zzc = zzdrhVar;
        this.zzd = zzfgoVar;
    }

    public final void zza(zzfbi zzfbiVar, zzfbe zzfbeVar, int i, @Nullable zzedr zzedrVar, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzfgn zzfgnVarZzb = zzfgn.zzb("adapter_status");
            zzfgnVarZzb.zzg(zzfbiVar);
            zzfgnVarZzb.zzf(zzfbeVar);
            zzfgnVarZzb.zza("adapter_l", String.valueOf(j));
            zzfgnVarZzb.zza("sc", Integer.toString(i));
            if (zzedrVar != null) {
                zzfgnVarZzb.zza("arec", Integer.toString(zzedrVar.zzb().zza));
                String strZza = this.zza.zza(zzedrVar.getMessage());
                if (strZza != null) {
                    zzfgnVarZzb.zza("areec", strZza);
                }
            }
            zzdoy zzdoyVarZzb = this.zzb.zzb(zzfbeVar.zzu);
            if (zzdoyVarZzb != null) {
                zzfgnVarZzb.zza("ancn", zzdoyVarZzb.zza);
                zzbqq zzbqqVar = zzdoyVarZzb.zzb;
                if (zzbqqVar != null) {
                    zzfgnVarZzb.zza("adapter_v", zzbqqVar.toString());
                }
                zzbqq zzbqqVar2 = zzdoyVarZzb.zzc;
                if (zzbqqVar2 != null) {
                    zzfgnVarZzb.zza("adapter_sv", zzbqqVar2.toString());
                }
            }
            this.zzd.zzb(zzfgnVarZzb);
            return;
        }
        zzdrg zzdrgVarZza = this.zzc.zza();
        zzdrgVarZza.zze(zzfbiVar);
        zzdrgVarZza.zzd(zzfbeVar);
        zzdrgVarZza.zzb("action", "adapter_status");
        zzdrgVarZza.zzb("adapter_l", String.valueOf(j));
        zzdrgVarZza.zzb("sc", Integer.toString(i));
        if (zzedrVar != null) {
            zzdrgVarZza.zzb("arec", Integer.toString(zzedrVar.zzb().zza));
            String strZza2 = this.zza.zza(zzedrVar.getMessage());
            if (strZza2 != null) {
                zzdrgVarZza.zzb("areec", strZza2);
            }
        }
        zzdoy zzdoyVarZzb2 = this.zzb.zzb(zzfbeVar.zzu);
        if (zzdoyVarZzb2 != null) {
            zzdrgVarZza.zzb("ancn", zzdoyVarZzb2.zza);
            zzbqq zzbqqVar3 = zzdoyVarZzb2.zzb;
            if (zzbqqVar3 != null) {
                zzdrgVarZza.zzb("adapter_v", zzbqqVar3.toString());
            }
            zzbqq zzbqqVar4 = zzdoyVarZzb2.zzc;
            if (zzbqqVar4 != null) {
                zzdrgVarZza.zzb("adapter_sv", zzbqqVar4.toString());
            }
        }
        zzdrgVarZza.zzg();
    }
}
