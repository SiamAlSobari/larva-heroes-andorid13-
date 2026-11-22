package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaju implements zzajn {
    final /* synthetic */ zzajw zza;
    private final zzfa zzb = new zzfa(new byte[4], 4);

    public zzaju(zzajw zzajwVar) {
        this.zza = zzajwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final void zza(zzfb zzfbVar) {
        if (zzfbVar.zzl() == 0 && (zzfbVar.zzl() & 128) != 0) {
            zzfbVar.zzH(6);
            int iZza = zzfbVar.zza() / 4;
            for (int i = 0; i < iZza; i++) {
                zzfbVar.zzB(this.zzb, 4);
                int iZzd = this.zzb.zzd(16);
                this.zzb.zzl(3);
                if (iZzd == 0) {
                    this.zzb.zzl(13);
                } else {
                    int iZzd2 = this.zzb.zzd(13);
                    if (this.zza.zzf.get(iZzd2) == null) {
                        zzajw zzajwVar = this.zza;
                        zzajwVar.zzf.put(iZzd2, new zzajo(new zzajv(zzajwVar, iZzd2)));
                        this.zza.zzl++;
                    }
                }
            }
            this.zza.zzf.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final void zzb(zzfi zzfiVar, zzabe zzabeVar, zzaka zzakaVar) {
    }
}
