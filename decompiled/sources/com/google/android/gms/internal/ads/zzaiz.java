package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaiz implements zzaio {
    private final zzajp zza;
    private String zzb;
    private zzace zzc;
    private zzaiy zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzajd zzg = new zzajd(32, 128);
    private final zzajd zzh = new zzajd(33, 128);
    private final zzajd zzi = new zzajd(34, 128);
    private final zzajd zzj = new zzajd(39, 128);
    private final zzajd zzk = new zzajd(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzfb zzn = new zzfb();

    public zzaiz(zzajp zzajpVar) {
        this.zza = zzajpVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0110  */
    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) {
        zzdy.zzb(this.zzc);
        int i = zzfk.zza;
        while (zzfbVar.zza() > 0) {
            int iZzc = zzfbVar.zzc();
            int iZzd = zzfbVar.zzd();
            byte[] bArrZzI = zzfbVar.zzI();
            this.zzl += (long) zzfbVar.zza();
            this.zzc.zzq(zzfbVar, zzfbVar.zza());
            while (iZzc < iZzd) {
                int iZza = zzfy.zza(bArrZzI, iZzc, iZzd, this.zzf);
                if (iZza == iZzd) {
                    zzf(bArrZzI, iZzc, iZzd);
                    return;
                }
                int i2 = iZza + 3;
                int i3 = bArrZzI[i2] & 126;
                int i4 = iZza - iZzc;
                if (i4 > 0) {
                    zzf(bArrZzI, iZzc, iZza);
                }
                int i5 = iZzd - iZza;
                long j = this.zzl - ((long) i5);
                int i6 = i4 < 0 ? -i4 : 0;
                long j2 = this.zzm;
                this.zzd.zzb(j, i5, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i6);
                    this.zzh.zzd(i6);
                    this.zzi.zzd(i6);
                    zzajd zzajdVar = this.zzg;
                    if (zzajdVar.zze()) {
                        zzajd zzajdVar2 = this.zzh;
                        if (zzajdVar2.zze()) {
                            zzajd zzajdVar3 = this.zzi;
                            if (zzajdVar3.zze()) {
                                zzace zzaceVar = this.zzc;
                                String str = this.zzb;
                                int i7 = zzajdVar.zzb;
                                byte[] bArr = new byte[zzajdVar2.zzb + i7 + zzajdVar3.zzb];
                                System.arraycopy(zzajdVar.zza, 0, bArr, 0, i7);
                                System.arraycopy(zzajdVar2.zza, 0, bArr, zzajdVar.zzb, zzajdVar2.zzb);
                                System.arraycopy(zzajdVar3.zza, 0, bArr, zzajdVar.zzb + zzajdVar2.zzb, zzajdVar3.zzb);
                                zzfv zzfvVarZzc = zzfy.zzc(zzajdVar2.zza, 5, zzajdVar2.zzb);
                                String strZzb = zzea.zzb(zzfvVarZzc.zza, zzfvVarZzc.zzb, zzfvVarZzc.zzc, zzfvVarZzc.zzd, zzfvVarZzc.zze, zzfvVarZzc.zzf);
                                zzak zzakVar = new zzak();
                                zzakVar.zzH(str);
                                zzakVar.zzS("video/hevc");
                                zzakVar.zzx(strZzb);
                                zzakVar.zzX(zzfvVarZzc.zzg);
                                zzakVar.zzF(zzfvVarZzc.zzh);
                                zzakVar.zzP(zzfvVarZzc.zzi);
                                zzakVar.zzI(Collections.singletonList(bArr));
                                zzaceVar.zzk(zzakVar.zzY());
                                this.zze = true;
                            }
                        }
                    }
                }
                if (this.zzj.zzd(i6)) {
                    zzajd zzajdVar4 = this.zzj;
                    this.zzn.zzE(this.zzj.zza, zzfy.zzb(zzajdVar4.zza, zzajdVar4.zzb));
                    this.zzn.zzH(5);
                    this.zza.zza(j2, this.zzn);
                }
                if (this.zzk.zzd(i6)) {
                    zzajd zzajdVar5 = this.zzk;
                    this.zzn.zzE(this.zzk.zza, zzfy.zzb(zzajdVar5.zza, zzajdVar5.zzb));
                    this.zzn.zzH(5);
                    this.zza.zza(j2, this.zzn);
                }
                int i8 = i3 >> 1;
                this.zzd.zze(j, i5, i8, this.zzm, this.zze);
                if (!this.zze) {
                    this.zzg.zzc(i8);
                    this.zzh.zzc(i8);
                    this.zzi.zzc(i8);
                }
                this.zzj.zzc(i8);
                this.zzk.zzc(i8);
                iZzc = i2;
                iZzd = iZzd;
                bArrZzI = bArrZzI;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzb = zzakaVar.zzb();
        zzace zzaceVarZzv = zzabeVar.zzv(zzakaVar.zza(), 2);
        this.zzc = zzaceVarZzv;
        this.zzd = new zzaiy(zzaceVarZzv);
        this.zza.zzb(zzabeVar, zzakaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
        zzdy.zzb(this.zzc);
        int i = zzfk.zza;
        if (z) {
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfy.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzaiy zzaiyVar = this.zzd;
        if (zzaiyVar != null) {
            zzaiyVar.zzd();
        }
    }
}
