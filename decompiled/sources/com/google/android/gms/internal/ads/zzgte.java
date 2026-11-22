package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgte implements zzgtt {
    private final zzgta zza;
    private final zzguk zzb;
    private final boolean zzc;
    private final zzgrd zzd;

    private zzgte(zzguk zzgukVar, zzgrd zzgrdVar, zzgta zzgtaVar) {
        this.zzb = zzgukVar;
        this.zzc = zzgrdVar.zzh(zzgtaVar);
        this.zzd = zzgrdVar;
        this.zza = zzgtaVar;
    }

    static zzgte zzc(zzguk zzgukVar, zzgrd zzgrdVar, zzgta zzgtaVar) {
        return new zzgte(zzgukVar, zzgrdVar, zzgtaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final int zza(Object obj) {
        zzguk zzgukVar = this.zzb;
        int iZzb = zzgukVar.zzb(zzgukVar.zzd(obj));
        if (!this.zzc) {
            return iZzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return iHashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final Object zze() {
        zzgta zzgtaVar = this.zza;
        return zzgtaVar instanceof zzgrq ? ((zzgrq) zzgtaVar).zzaD() : zzgtaVar.zzaP().zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzg(Object obj, Object obj2) {
        zzgtv.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            this.zzd.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzh(Object obj, zzgtl zzgtlVar, zzgrc zzgrcVar) throws IOException {
        boolean zZzO;
        zzguk zzgukVar = this.zzb;
        zzgrd zzgrdVar = this.zzd;
        Object objZzc = zzgukVar.zzc(obj);
        zzgrh zzgrhVarZzb = zzgrdVar.zzb(obj);
        while (zzgtlVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzgtlVar.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZzc2 = zzgrdVar.zzc(zzgrcVar, this.zza, iZzd >>> 3);
                        if (objZzc2 != null) {
                            zzgrdVar.zzf(zzgtlVar, objZzc2, zzgrcVar, zzgrhVarZzb);
                        } else {
                            zZzO = zzgukVar.zzp(objZzc, zzgtlVar);
                        }
                    } else {
                        zZzO = zzgtlVar.zzO();
                    }
                    if (!zZzO) {
                        zzgukVar.zzn(obj, objZzc);
                        return;
                    }
                } else {
                    Object objZzc3 = null;
                    zzgqi zzgqiVarZzp = null;
                    int iZzj = 0;
                    while (zzgtlVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzgtlVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzgtlVar.zzj();
                            objZzc3 = zzgrdVar.zzc(zzgrcVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZzc3 != null) {
                                zzgrdVar.zzf(zzgtlVar, objZzc3, zzgrcVar, zzgrhVarZzb);
                            } else {
                                zzgqiVarZzp = zzgtlVar.zzp();
                            }
                        } else if (!zzgtlVar.zzO()) {
                            break;
                        }
                    }
                    if (zzgtlVar.zzd() != 12) {
                        throw zzgsc.zzb();
                    }
                    if (zzgqiVarZzp != null) {
                        if (objZzc3 != null) {
                            zzgrdVar.zzg(zzgqiVarZzp, objZzc3, zzgrcVar, zzgrhVarZzb);
                        } else {
                            zzgukVar.zzk(objZzc, iZzj, zzgqiVarZzp);
                        }
                    }
                }
            } catch (Throwable th) {
                zzgukVar.zzn(obj, objZzc);
                throw th;
            }
        }
        zzgukVar.zzn(obj, objZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgpu zzgpuVar) throws IOException {
        zzgrq zzgrqVar = (zzgrq) obj;
        if (zzgrqVar.zzc == zzgul.zzc()) {
            zzgrqVar.zzc = zzgul.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final void zzm(Object obj, zzgqy zzgqyVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
