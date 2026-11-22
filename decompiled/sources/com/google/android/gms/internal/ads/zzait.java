package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzait implements zzaio {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzakd zzb;
    private final zzfb zzc;
    private final boolean[] zzd;
    private final zzair zze;
    private final zzajd zzf;
    private zzais zzg;
    private long zzh;
    private String zzi;
    private zzace zzj;
    private boolean zzk;
    private long zzl;

    public zzait() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) {
        int i;
        float f;
        float f2;
        zzdy.zzb(this.zzg);
        zzdy.zzb(this.zzj);
        int iZzc = zzfbVar.zzc();
        int iZzd = zzfbVar.zzd();
        byte[] bArrZzI = zzfbVar.zzI();
        this.zzh += (long) zzfbVar.zza();
        this.zzj.zzq(zzfbVar, zzfbVar.zza());
        while (true) {
            int iZza = zzfy.zza(bArrZzI, iZzc, iZzd, this.zzd);
            if (iZza == iZzd) {
                break;
            }
            int i2 = iZza + 3;
            int i3 = zzfbVar.zzI()[i2] & 255;
            int i4 = iZza - iZzc;
            if (!this.zzk) {
                if (i4 > 0) {
                    this.zze.zza(bArrZzI, iZzc, iZza);
                }
                if (this.zze.zzc(i3, i4 < 0 ? -i4 : 0)) {
                    zzace zzaceVar = this.zzj;
                    zzair zzairVar = this.zze;
                    int i5 = zzairVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzairVar.zzc, zzairVar.zza);
                    zzfa zzfaVar = new zzfa(bArrCopyOf, bArrCopyOf.length);
                    zzfaVar.zzm(i5);
                    zzfaVar.zzm(4);
                    zzfaVar.zzk();
                    zzfaVar.zzl(8);
                    if (zzfaVar.zzn()) {
                        zzfaVar.zzl(4);
                        zzfaVar.zzl(3);
                    }
                    int iZzd2 = zzfaVar.zzd(4);
                    if (iZzd2 == 15) {
                        int iZzd3 = zzfaVar.zzd(8);
                        int iZzd4 = zzfaVar.zzd(8);
                        if (iZzd4 == 0) {
                            zzes.zzf("H263Reader", "Invalid aspect ratio");
                            f2 = 1.0f;
                        } else {
                            f = iZzd3 / iZzd4;
                            f2 = f;
                        }
                    } else if (iZzd2 < 7) {
                        f = zza[iZzd2];
                        f2 = f;
                    } else {
                        zzes.zzf("H263Reader", "Invalid aspect ratio");
                        f2 = 1.0f;
                    }
                    if (zzfaVar.zzn()) {
                        zzfaVar.zzl(2);
                        zzfaVar.zzl(1);
                        if (zzfaVar.zzn()) {
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                            zzfaVar.zzl(3);
                            zzfaVar.zzl(11);
                            zzfaVar.zzk();
                            zzfaVar.zzl(15);
                            zzfaVar.zzk();
                        }
                    }
                    if (zzfaVar.zzd(2) != 0) {
                        zzes.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzfaVar.zzk();
                    int iZzd5 = zzfaVar.zzd(16);
                    zzfaVar.zzk();
                    if (zzfaVar.zzn()) {
                        if (iZzd5 == 0) {
                            zzes.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i6 = iZzd5 - 1;
                            int i7 = 0;
                            while (i6 > 0) {
                                i6 >>= 1;
                                i7++;
                            }
                            zzfaVar.zzl(i7);
                        }
                    }
                    zzfaVar.zzk();
                    int iZzd6 = zzfaVar.zzd(13);
                    zzfaVar.zzk();
                    int iZzd7 = zzfaVar.zzd(13);
                    zzfaVar.zzk();
                    zzfaVar.zzk();
                    zzak zzakVar = new zzak();
                    zzakVar.zzH(str);
                    zzakVar.zzS("video/mp4v-es");
                    zzakVar.zzX(iZzd6);
                    zzakVar.zzF(iZzd7);
                    zzakVar.zzP(f2);
                    zzakVar.zzI(Collections.singletonList(bArrCopyOf));
                    zzaceVar.zzk(zzakVar.zzY());
                    this.zzk = true;
                }
            }
            this.zzg.zza(bArrZzI, iZzc, iZza);
            zzajd zzajdVar = this.zzf;
            if (i4 > 0) {
                zzajdVar.zza(bArrZzI, iZzc, iZza);
                i = 0;
            } else {
                i = -i4;
            }
            if (this.zzf.zzd(i)) {
                zzajd zzajdVar2 = this.zzf;
                int iZzb = zzfy.zzb(zzajdVar2.zza, zzajdVar2.zzb);
                zzfb zzfbVar2 = this.zzc;
                int i8 = zzfk.zza;
                zzfbVar2.zzE(this.zzf.zza, iZzb);
                this.zzb.zza(this.zzl, this.zzc);
            }
            if (i3 == 178) {
                if (zzfbVar.zzI()[iZza + 2] == 1) {
                    this.zzf.zzc(178);
                }
                i3 = 178;
            }
            int i9 = iZzd - iZza;
            this.zzg.zzb(this.zzh - ((long) i9), i9, this.zzk);
            this.zzg.zzc(i3, this.zzl);
            iZzc = i2;
        }
        if (!this.zzk) {
            this.zze.zza(bArrZzI, iZzc, iZzd);
        }
        this.zzg.zza(bArrZzI, iZzc, iZzd);
        this.zzf.zza(bArrZzI, iZzc, iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzi = zzakaVar.zzb();
        zzace zzaceVarZzv = zzabeVar.zzv(zzakaVar.zza(), 2);
        this.zzj = zzaceVarZzv;
        this.zzg = new zzais(zzaceVarZzv);
        this.zzb.zzb(zzabeVar, zzakaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
        zzdy.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        zzfy.zzf(this.zzd);
        this.zze.zzb();
        zzais zzaisVar = this.zzg;
        if (zzaisVar != null) {
            zzaisVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    zzait(zzakd zzakdVar) {
        this.zzb = zzakdVar;
        this.zzd = new boolean[4];
        this.zze = new zzair(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzajd(178, 128);
        this.zzc = new zzfb();
    }
}
