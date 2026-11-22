package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaje implements zzajn {
    private zzam zza;
    private zzfi zzb;
    private zzace zzc;

    public zzaje(String str) {
        zzak zzakVar = new zzak();
        zzakVar.zzS(str);
        this.zza = zzakVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final void zza(zzfb zzfbVar) {
        zzdy.zzb(this.zzb);
        int i = zzfk.zza;
        long jZzd = this.zzb.zzd();
        long jZze = this.zzb.zze();
        if (jZzd == -9223372036854775807L || jZze == -9223372036854775807L) {
            return;
        }
        zzam zzamVar = this.zza;
        if (jZze != zzamVar.zzq) {
            zzak zzakVarZzb = zzamVar.zzb();
            zzakVarZzb.zzW(jZze);
            zzam zzamVarZzY = zzakVarZzb.zzY();
            this.zza = zzamVarZzY;
            this.zzc.zzk(zzamVarZzY);
        }
        int iZza = zzfbVar.zza();
        this.zzc.zzq(zzfbVar, iZza);
        this.zzc.zzs(jZzd, 1, iZza, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final void zzb(zzfi zzfiVar, zzabe zzabeVar, zzaka zzakaVar) {
        this.zzb = zzfiVar;
        zzakaVar.zzc();
        zzace zzaceVarZzv = zzabeVar.zzv(zzakaVar.zza(), 5);
        this.zzc = zzaceVarZzv;
        zzaceVarZzv.zzk(this.zza);
    }
}
