package com.google.android.gms.internal.ads;

import com.google.common.primitives.Ints;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagw {
    public final zzace zza;
    public zzahj zzd;
    public zzags zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzahi zzb = new zzahi();
    public final zzfb zzc = new zzfb();
    private final zzfb zzj = new zzfb(1);
    private final zzfb zzk = new zzfb();

    public zzagw(zzace zzaceVar, zzahj zzahjVar, zzags zzagsVar) {
        this.zza = zzaceVar;
        this.zzd = zzahjVar;
        this.zze = zzagsVar;
        zzh(zzahjVar, zzagsVar);
    }

    public final int zza() {
        int i;
        if (this.zzl) {
            i = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i = this.zzd.zzg[this.zzf];
        }
        return zzf() != null ? i | Ints.MAX_POWER_OF_TWO : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzfb zzfbVar;
        zzahh zzahhVarZzf = zzf();
        if (zzahhVarZzf == null) {
            return 0;
        }
        int i3 = zzahhVarZzf.zzd;
        if (i3 != 0) {
            zzfbVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzahhVarZzf.zze;
            int i4 = zzfk.zza;
            zzfb zzfbVar2 = this.zzk;
            int length = bArr.length;
            zzfbVar2.zzE(bArr, length);
            zzfbVar = this.zzk;
            i3 = length;
        }
        boolean zZzb = this.zzb.zzb(this.zzf);
        boolean z = zZzb || i2 != 0;
        zzfb zzfbVar3 = this.zzj;
        zzfbVar3.zzI()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzfbVar3.zzG(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzfbVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zZzb) {
            this.zzc.zzD(8);
            zzfb zzfbVar4 = this.zzc;
            byte[] bArrZzI = zzfbVar4.zzI();
            bArrZzI[0] = 0;
            bArrZzI[1] = 1;
            bArrZzI[2] = 0;
            bArrZzI[3] = (byte) i2;
            bArrZzI[4] = (byte) ((i >> 24) & 255);
            bArrZzI[5] = (byte) ((i >> 16) & 255);
            bArrZzI[6] = (byte) ((i >> 8) & 255);
            bArrZzI[7] = (byte) (i & 255);
            this.zza.zzr(zzfbVar4, 8, 1);
            return i3 + 9;
        }
        zzfb zzfbVar5 = this.zzb.zzn;
        int iZzp = zzfbVar5.zzp();
        zzfbVar5.zzH(-2);
        int i5 = (iZzp * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzD(i5);
            byte[] bArrZzI2 = this.zzc.zzI();
            zzfbVar5.zzC(bArrZzI2, 0, i5);
            int i6 = (((bArrZzI2[2] & 255) << 8) | (bArrZzI2[3] & 255)) + i2;
            bArrZzI2[2] = (byte) ((i6 >> 8) & 255);
            bArrZzI2[3] = (byte) (i6 & 255);
            zzfbVar5 = this.zzc;
        }
        this.zza.zzr(zzfbVar5, i5, 1);
        return i3 + 1 + i5;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzahi zzahiVar = this.zzb;
        return zzahiVar.zzi[this.zzf];
    }

    public final zzahh zzf() {
        if (!this.zzl) {
            return null;
        }
        zzags zzagsVar = this.zzb.zza;
        int i = zzfk.zza;
        int i2 = zzagsVar.zza;
        zzahh zzahhVarZza = this.zzb.zzm;
        if (zzahhVarZza == null) {
            zzahhVarZza = this.zzd.zza.zza(i2);
        }
        if (zzahhVarZza == null || !zzahhVarZza.zza) {
            return null;
        }
        return zzahhVarZza;
    }

    public final void zzh(zzahj zzahjVar, zzags zzagsVar) {
        this.zzd = zzahjVar;
        this.zze = zzagsVar;
        this.zza.zzk(zzahjVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzahi zzahiVar = this.zzb;
        zzahiVar.zzd = 0;
        zzahiVar.zzp = 0L;
        zzahiVar.zzq = false;
        zzahiVar.zzk = false;
        zzahiVar.zzo = false;
        zzahiVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }
}
