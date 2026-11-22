package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeam implements zzddb {
    private final String zzc;
    private final zzfgo zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final com.google.android.gms.ads.internal.util.zzg zze = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzeam(String str, zzfgo zzfgoVar) {
        this.zzc = str;
        this.zzd = zzfgoVar;
    }

    private final zzfgn zzg(String str) {
        String str2 = this.zze.zzQ() ? "" : this.zzc;
        zzfgn zzfgnVarZzb = zzfgn.zzb(str);
        zzfgnVarZzb.zza("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), 10));
        zzfgnVarZzb.zza("tid", str2);
        return zzfgnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(String str) {
        zzfgo zzfgoVar = this.zzd;
        zzfgn zzfgnVarZzg = zzg("aaia");
        zzfgnVarZzg.zza("aair", "MalformedJson");
        zzfgoVar.zzb(zzfgnVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzb(String str, String str2) {
        zzfgo zzfgoVar = this.zzd;
        zzfgn zzfgnVarZzg = zzg("adapter_init_finished");
        zzfgnVarZzg.zza("ancn", str);
        zzfgnVarZzg.zza("rqe", str2);
        zzfgoVar.zzb(zzfgnVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzc(String str) {
        zzfgo zzfgoVar = this.zzd;
        zzfgn zzfgnVarZzg = zzg("adapter_init_started");
        zzfgnVarZzg.zza("ancn", str);
        zzfgoVar.zzb(zzfgnVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzd(String str) {
        zzfgo zzfgoVar = this.zzd;
        zzfgn zzfgnVarZzg = zzg("adapter_init_finished");
        zzfgnVarZzg.zza("ancn", str);
        zzfgoVar.zzb(zzfgnVarZzg);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final synchronized void zze() {
        if (this.zzb) {
            return;
        }
        this.zzd.zzb(zzg("init_finished"));
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final synchronized void zzf() {
        if (this.zza) {
            return;
        }
        this.zzd.zzb(zzg("init_started"));
        this.zza = true;
    }
}
