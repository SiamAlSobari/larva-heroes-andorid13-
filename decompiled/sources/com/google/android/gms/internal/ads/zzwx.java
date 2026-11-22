package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwx extends zzwz implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    /* JADX WARN: Multi-variable type inference failed */
    public zzwx(int i, zzcy zzcyVar, int i2, zzwr zzwrVar, int i3, String str) {
        int iZza;
        super(i, zzcyVar, i2);
        int i4 = 0;
        this.zzf = zzxd.zzn(i3, false);
        int i5 = this.zzd.zze;
        int i6 = zzwrVar.zzy;
        this.zzg = 1 == (i5 & 1);
        this.zzh = (i5 & 2) != 0;
        zzfud zzfudVarZzm = zzwrVar.zzw.isEmpty() ? zzfud.zzm("") : zzwrVar.zzw;
        int i7 = 0;
        while (true) {
            if (i7 >= zzfudVarZzm.size()) {
                i7 = Integer.MAX_VALUE;
                iZza = 0;
                break;
            }
            zzam zzamVar = this.zzd;
            String str2 = (String) zzfudVarZzm.get(i7);
            boolean z = zzwrVar.zzz;
            iZza = zzxd.zza(zzamVar, str2, false);
            if (iZza > 0) {
                break;
            } else {
                i7++;
            }
        }
        this.zzi = i7;
        this.zzj = iZza;
        int i8 = this.zzd.zzf;
        int i9 = zzwrVar.zzx;
        int iBitCount = Integer.bitCount(0);
        this.zzk = iBitCount;
        int i10 = this.zzd.zzf;
        this.zzm = false;
        int iZza2 = zzxd.zza(this.zzd, str, zzxd.zzg(str) == null);
        this.zzl = iZza2;
        boolean z2 = iZza > 0 || (zzwrVar.zzw.isEmpty() && iBitCount > 0) || this.zzg || (this.zzh && iZza2 > 0);
        if (zzxd.zzn(i3, zzwrVar.zzR) && z2) {
            i4 = 1;
        }
        this.zze = i4;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzwx zzwxVar) {
        zzfts zzftsVarZzb = zzfts.zzj().zzd(this.zzf, zzwxVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzwxVar.zzi), zzfvm.zzc().zza()).zzb(this.zzj, zzwxVar.zzj).zzb(this.zzk, zzwxVar.zzk).zzd(this.zzg, zzwxVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzwxVar.zzh), this.zzj == 0 ? zzfvm.zzc() : zzfvm.zzc().zza()).zzb(this.zzl, zzwxVar.zzl);
        if (this.zzk == 0) {
            boolean z = zzwxVar.zzm;
            zzftsVarZzb = zzftsVarZzb.zze(false, false);
        }
        return zzftsVarZzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final /* bridge */ /* synthetic */ boolean zzc(zzwz zzwzVar) {
        return false;
    }
}
