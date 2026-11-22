package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzajl {
    private final zzaio zza;
    private final zzfi zzb;
    private final zzfa zzc = new zzfa(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzajl(zzaio zzaioVar, zzfi zzfiVar) {
        this.zza = zzaioVar;
        this.zzb = zzfiVar;
    }

    public final void zza(zzfb zzfbVar) throws zzcd {
        long jZzb;
        zzfbVar.zzC(this.zzc.zza, 0, 3);
        this.zzc.zzj(0);
        this.zzc.zzl(8);
        this.zzd = this.zzc.zzn();
        this.zze = this.zzc.zzn();
        this.zzc.zzl(6);
        zzfbVar.zzC(this.zzc.zza, 0, this.zzc.zzd(8));
        this.zzc.zzj(0);
        if (this.zzd) {
            this.zzc.zzl(4);
            long jZzd = this.zzc.zzd(3);
            this.zzc.zzl(1);
            int iZzd = this.zzc.zzd(15) << 15;
            this.zzc.zzl(1);
            long jZzd2 = this.zzc.zzd(15);
            this.zzc.zzl(1);
            if (!this.zzf && this.zze) {
                this.zzc.zzl(4);
                long jZzd3 = ((long) this.zzc.zzd(3)) << 30;
                this.zzc.zzl(1);
                int iZzd2 = this.zzc.zzd(15) << 15;
                this.zzc.zzl(1);
                long jZzd4 = this.zzc.zzd(15);
                this.zzc.zzl(1);
                this.zzb.zzb(((long) iZzd2) | jZzd3 | jZzd4);
                this.zzf = true;
            }
            jZzb = this.zzb.zzb((jZzd << 30) | ((long) iZzd) | jZzd2);
        } else {
            jZzb = 0;
        }
        this.zza.zzd(jZzb, 4);
        this.zza.zza(zzfbVar);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
