package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzoa {
    final /* synthetic */ zzob zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzts zze;
    private boolean zzf;
    private boolean zzg;

    public zzoa(zzob zzobVar, String str, int i, zzts zztsVar) {
        this.zza = zzobVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zztsVar == null ? -1L : zztsVar.zzd;
        if (zztsVar == null || !zztsVar.zzb()) {
            return;
        }
        this.zze = zztsVar;
    }

    public final void zzg(int i, zzts zztsVar) {
        if (this.zzd != -1 || i != this.zzc || zztsVar == null || zztsVar.zzd < this.zza.zzl()) {
            return;
        }
        this.zzd = zztsVar.zzd;
    }

    public final boolean zzj(int i, zzts zztsVar) {
        if (zztsVar == null) {
            return i == this.zzc;
        }
        zzts zztsVar2 = this.zze;
        if (zztsVar2 == null) {
            return !zztsVar.zzb() && zztsVar.zzd == this.zzd;
        }
        return zztsVar.zzd == zztsVar2.zzd && zztsVar.zzb == zztsVar2.zzb && zztsVar.zzc == zztsVar2.zzc;
    }

    public final boolean zzk(zzly zzlyVar) {
        zzts zztsVar = zzlyVar.zzd;
        if (zztsVar == null) {
            return this.zzc != zzlyVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zztsVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int iZza = zzlyVar.zzb.zza(zztsVar.zza);
        int iZza2 = zzlyVar.zzb.zza(this.zze.zza);
        zzts zztsVar2 = zzlyVar.zzd;
        if (zztsVar2.zzd < this.zze.zzd || iZza < iZza2) {
            return false;
        }
        if (iZza > iZza2) {
            return true;
        }
        if (!zztsVar2.zzb()) {
            int i = zzlyVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        zzts zztsVar3 = zzlyVar.zzd;
        int i2 = zztsVar3.zzb;
        int i3 = zztsVar3.zzc;
        zzts zztsVar4 = this.zze;
        int i4 = zztsVar4.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zztsVar4.zzc;
        }
        return true;
    }

    public final boolean zzl(zzcw zzcwVar, zzcw zzcwVar2) {
        int i = this.zzc;
        if (i < zzcwVar.zzc()) {
            zzcwVar.zze(i, this.zza.zzc, 0L);
            int i2 = this.zza.zzc.zzp;
            while (true) {
                if (i2 > this.zza.zzc.zzq) {
                    i = -1;
                    break;
                }
                int iZza = zzcwVar2.zza(zzcwVar.zzf(i2));
                if (iZza != -1) {
                    i = zzcwVar2.zzd(iZza, this.zza.zzd, false).zzd;
                    break;
                }
                i2++;
            }
        } else if (i >= zzcwVar2.zzc()) {
            i = -1;
            break;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzts zztsVar = this.zze;
        return zztsVar == null || zzcwVar2.zza(zztsVar.zza) != -1;
    }
}
