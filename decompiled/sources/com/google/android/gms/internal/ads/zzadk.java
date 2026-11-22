package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzadk extends zzadj {
    private final zzfb zzb;
    private final zzfb zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzadk(zzace zzaceVar) {
        super(zzaceVar);
        this.zzb = new zzfb(zzfy.zza);
        this.zzc = new zzfb(4);
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    protected final boolean zza(zzfb zzfbVar) throws zzadi {
        int iZzl = zzfbVar.zzl();
        int i = iZzl >> 4;
        int i2 = iZzl & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzadi("Video format not supported: " + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    protected final boolean zzb(zzfb zzfbVar, long j) throws zzcd {
        int iZzl = zzfbVar.zzl();
        long jZzg = zzfbVar.zzg();
        if (iZzl == 0) {
            if (!this.zze) {
                zzfb zzfbVar2 = new zzfb(new byte[zzfbVar.zza()]);
                zzfbVar.zzC(zzfbVar2.zzI(), 0, zzfbVar.zza());
                zzaag zzaagVarZza = zzaag.zza(zzfbVar2);
                this.zzd = zzaagVarZza.zzb;
                zzak zzakVar = new zzak();
                zzakVar.zzS("video/avc");
                zzakVar.zzx(zzaagVarZza.zzi);
                zzakVar.zzX(zzaagVarZza.zzc);
                zzakVar.zzF(zzaagVarZza.zzd);
                zzakVar.zzP(zzaagVarZza.zzh);
                zzakVar.zzI(zzaagVarZza.zza);
                this.zza.zzk(zzakVar.zzY());
                this.zze = true;
                return false;
            }
        } else if (iZzl == 1 && this.zze) {
            int i = this.zzg == 1 ? 1 : 0;
            if (!this.zzf && i == 0) {
                return false;
            }
            byte[] bArrZzI = this.zzc.zzI();
            bArrZzI[0] = 0;
            bArrZzI[1] = 0;
            bArrZzI[2] = 0;
            int i2 = 4 - this.zzd;
            int i3 = 0;
            while (zzfbVar.zza() > 0) {
                zzfbVar.zzC(this.zzc.zzI(), i2, this.zzd);
                this.zzc.zzG(0);
                int iZzo = this.zzc.zzo();
                this.zzb.zzG(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzfbVar, iZzo);
                i3 = i3 + 4 + iZzo;
            }
            this.zza.zzs(j + (jZzg * 1000), i, i3, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
