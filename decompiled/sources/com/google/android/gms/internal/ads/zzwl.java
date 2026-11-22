package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwl extends zzwz implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzwr zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /* JADX WARN: Code duplicated, block: B:70:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    public zzwl(int i, zzcy zzcyVar, int i2, zzwr zzwrVar, int i3, boolean z, zzfrj zzfrjVar) {
        int i4;
        int iZza;
        int iZza2;
        boolean z2;
        super(i, zzcyVar, i2);
        this.zzh = zzwrVar;
        this.zzg = zzxd.zzg(this.zzd.zzd);
        int i5 = 0;
        this.zzi = zzxd.zzn(i3, false);
        int i6 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i6 >= zzwrVar.zzq.size()) {
                i6 = Integer.MAX_VALUE;
                iZza = 0;
                break;
            } else {
                iZza = zzxd.zza(this.zzd, (String) zzwrVar.zzq.get(i6), false);
                if (iZza > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.zzk = i6;
        this.zzj = iZza;
        int i7 = this.zzd.zzf;
        int i8 = zzwrVar.zzr;
        this.zzl = Integer.bitCount(0);
        zzam zzamVar = this.zzd;
        int i9 = zzamVar.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzamVar.zze & 1);
        this.zzq = zzamVar.zzz;
        this.zzr = zzamVar.zzA;
        this.zzs = zzamVar.zzi;
        if (zzamVar.zzi != -1) {
            int i10 = zzwrVar.zzt;
        }
        if (zzamVar.zzz != -1) {
            int i11 = zzwrVar.zzs;
        }
        this.zzf = zzfrjVar.zza(zzamVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = zzfk.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{zzfk.zzy(configuration.locale)};
        for (int i12 = 0; i12 < strArrSplit.length; i12++) {
            strArrSplit[i12] = zzfk.zzA(strArrSplit[i12]);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= strArrSplit.length) {
                i13 = Integer.MAX_VALUE;
                iZza2 = 0;
                break;
            } else {
                iZza2 = zzxd.zza(this.zzd, strArrSplit[i13], false);
                if (iZza2 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.zzn = i13;
        this.zzo = iZza2;
        for (int i14 = 0; i14 < zzwrVar.zzu.size(); i14++) {
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzwrVar.zzu.get(i14))) {
                i4 = i14;
                break;
            }
        }
        this.zzt = i4;
        this.zzu = (i3 & 384) == 128;
        this.zzv = (i3 & 64) == 64;
        zzwr zzwrVar2 = this.zzh;
        if (zzxd.zzn(i3, zzwrVar2.zzR) && ((z2 = this.zzf) || zzwrVar2.zzL)) {
            int i15 = zzwrVar.zzv;
            if (zzxd.zzn(i3, false) && z2 && this.zzd.zzi != -1) {
                boolean z3 = zzwrVar2.zzB;
                boolean z4 = zzwrVar2.zzA;
                if (zzwrVar2.zzT || !z) {
                    i5 = 2;
                } else {
                    i5 = 1;
                }
            } else {
                i5 = 1;
            }
        }
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final /* bridge */ /* synthetic */ boolean zzc(zzwz zzwzVar) {
        zzwl zzwlVar = (zzwl) zzwzVar;
        zzwr zzwrVar = this.zzh;
        boolean z = zzwrVar.zzO;
        zzam zzamVar = this.zzd;
        int i = zzamVar.zzz;
        if (i == -1) {
            return false;
        }
        zzam zzamVar2 = zzwlVar.zzd;
        if (i != zzamVar2.zzz) {
            return false;
        }
        boolean z2 = zzwrVar.zzM;
        String str = zzamVar.zzm;
        if (str == null || !TextUtils.equals(str, zzamVar2.zzm)) {
            return false;
        }
        zzwr zzwrVar2 = this.zzh;
        boolean z3 = zzwrVar2.zzN;
        int i2 = this.zzd.zzA;
        if (i2 == -1 || i2 != zzwlVar.zzd.zzA) {
            return false;
        }
        boolean z4 = zzwrVar2.zzP;
        return this.zzu == zzwlVar.zzu && this.zzv == zzwlVar.zzv;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzwl zzwlVar) {
        zzfvm zzfvmVarZza = (this.zzf && this.zzi) ? zzxd.zzc : zzxd.zzc.zza();
        zzfts zzftsVarZzd = zzfts.zzj().zzd(this.zzi, zzwlVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzwlVar.zzk), zzfvm.zzc().zza()).zzb(this.zzj, zzwlVar.zzj).zzb(this.zzl, zzwlVar.zzl).zzd(this.zzp, zzwlVar.zzp);
        boolean z = zzwlVar.zzm;
        zzfts zzftsVarZzc = zzftsVarZzd.zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzwlVar.zzn), zzfvm.zzc().zza()).zzb(this.zzo, zzwlVar.zzo).zzd(this.zzf, zzwlVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzwlVar.zzt), zzfvm.zzc().zza());
        Integer numValueOf = Integer.valueOf(this.zzs);
        Integer numValueOf2 = Integer.valueOf(zzwlVar.zzs);
        boolean z2 = this.zzh.zzA;
        zzfts zzftsVarZzc2 = zzftsVarZzc.zzc(numValueOf, numValueOf2, zzxd.zzd).zzd(this.zzu, zzwlVar.zzu).zzd(this.zzv, zzwlVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzwlVar.zzq), zzfvmVarZza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzwlVar.zzr), zzfvmVarZza);
        Integer numValueOf3 = Integer.valueOf(this.zzs);
        Integer numValueOf4 = Integer.valueOf(zzwlVar.zzs);
        if (!zzfk.zzD(this.zzg, zzwlVar.zzg)) {
            zzfvmVarZza = zzxd.zzd;
        }
        return zzftsVarZzc2.zzc(numValueOf3, numValueOf4, zzfvmVarZza).zza();
    }
}
