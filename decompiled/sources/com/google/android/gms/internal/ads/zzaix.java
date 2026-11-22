package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaix implements zzaio {
    private final zzajp zza;
    private long zze;
    private String zzg;
    private zzace zzh;
    private zzaiw zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzajd zzb = new zzajd(7, 128);
    private final zzajd zzc = new zzajd(8, 128);
    private final zzajd zzd = new zzajd(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzfb zzm = new zzfb();

    public zzaix(zzajp zzajpVar, boolean z, boolean z2) {
        this.zza = zzajpVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) {
        zzdy.zzb(this.zzh);
        int i = zzfk.zza;
        int iZzc = zzfbVar.zzc();
        int iZzd = zzfbVar.zzd();
        byte[] bArrZzI = zzfbVar.zzI();
        this.zze += (long) zzfbVar.zza();
        this.zzh.zzq(zzfbVar, zzfbVar.zza());
        while (true) {
            int iZza = zzfy.zza(bArrZzI, iZzc, iZzd, this.zzf);
            if (iZza == iZzd) {
                zzf(bArrZzI, iZzc, iZzd);
                return;
            }
            int i2 = iZza + 3;
            int i3 = bArrZzI[i2] & Ascii.US;
            int i4 = iZza - iZzc;
            if (i4 > 0) {
                zzf(bArrZzI, iZzc, iZza);
            }
            int i5 = iZzd - iZza;
            long j = this.zze - ((long) i5);
            int i6 = i4 < 0 ? -i4 : 0;
            long j2 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzd(i6);
                this.zzc.zzd(i6);
                if (this.zzj) {
                    zzajd zzajdVar = this.zzb;
                    if (zzajdVar.zze()) {
                        this.zzi.zzc(zzfy.zze(zzajdVar.zza, 4, zzajdVar.zzb));
                        this.zzb.zzb();
                    } else {
                        zzajd zzajdVar2 = this.zzc;
                        if (zzajdVar2.zze()) {
                            this.zzi.zzb(zzfy.zzd(zzajdVar2.zza, 4, zzajdVar2.zzb));
                            this.zzc.zzb();
                        }
                    }
                } else if (this.zzb.zze() && this.zzc.zze()) {
                    ArrayList arrayList = new ArrayList();
                    zzajd zzajdVar3 = this.zzb;
                    arrayList.add(Arrays.copyOf(zzajdVar3.zza, zzajdVar3.zzb));
                    zzajd zzajdVar4 = this.zzc;
                    arrayList.add(Arrays.copyOf(zzajdVar4.zza, zzajdVar4.zzb));
                    zzajd zzajdVar5 = this.zzb;
                    zzfx zzfxVarZze = zzfy.zze(zzajdVar5.zza, 4, zzajdVar5.zzb);
                    zzajd zzajdVar6 = this.zzc;
                    zzfw zzfwVarZzd = zzfy.zzd(zzajdVar6.zza, 4, zzajdVar6.zzb);
                    String strZza = zzea.zza(zzfxVarZze.zza, zzfxVarZze.zzb, zzfxVarZze.zzc);
                    zzace zzaceVar = this.zzh;
                    zzak zzakVar = new zzak();
                    zzakVar.zzH(this.zzg);
                    zzakVar.zzS("video/avc");
                    zzakVar.zzx(strZza);
                    zzakVar.zzX(zzfxVarZze.zze);
                    zzakVar.zzF(zzfxVarZze.zzf);
                    zzakVar.zzP(zzfxVarZze.zzg);
                    zzakVar.zzI(arrayList);
                    zzaceVar.zzk(zzakVar.zzY());
                    this.zzj = true;
                    this.zzi.zzc(zzfxVarZze);
                    this.zzi.zzb(zzfwVarZzd);
                    this.zzb.zzb();
                    this.zzc.zzb();
                }
            }
            if (this.zzd.zzd(i6)) {
                zzajd zzajdVar7 = this.zzd;
                this.zzm.zzE(this.zzd.zza, zzfy.zzb(zzajdVar7.zza, zzajdVar7.zzb));
                this.zzm.zzG(4);
                this.zza.zza(j2, this.zzm);
            }
            if (this.zzi.zzf(j, i5, this.zzj, this.zzl)) {
                this.zzl = false;
            }
            long j3 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzc(i3);
                this.zzc.zzc(i3);
            }
            this.zzd.zzc(i3);
            this.zzi.zze(j, i3, j3);
            iZzc = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzg = zzakaVar.zzb();
        zzace zzaceVarZzv = zzabeVar.zzv(zzakaVar.zza(), 2);
        this.zzh = zzaceVarZzv;
        this.zzi = new zzaiw(zzaceVarZzv, false, false);
        this.zza.zzb(zzabeVar, zzakaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
        zzdy.zzb(this.zzh);
        int i = zzfk.zza;
        if (z) {
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
        this.zzl |= (i & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzfy.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzaiw zzaiwVar = this.zzi;
        if (zzaiwVar != null) {
            zzaiwVar.zzd();
        }
    }
}
