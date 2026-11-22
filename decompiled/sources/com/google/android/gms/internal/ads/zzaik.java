package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import com.mrgames.larvaheroesfree.R;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaik implements zzaio {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzfa zzc = new zzfa(new byte[7], 7);
    private final zzfb zzd = new zzfb(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzace zzg;
    private zzace zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzace zzu;
    private long zzv;

    public zzaik(boolean z, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzace zzaceVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzaceVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final boolean zzk(zzfb zzfbVar, byte[] bArr, int i) {
        int iMin = Math.min(zzfbVar.zza(), i - this.zzj);
        zzfbVar.zzC(bArr, this.zzj, iMin);
        int i2 = this.zzj + iMin;
        this.zzj = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzfb zzfbVar, byte[] bArr, int i) {
        if (zzfbVar.zza() < i) {
            return false;
        }
        zzfbVar.zzC(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0276  */
    /* JADX WARN: Code duplicated, block: B:107:0x027a  */
    /* JADX WARN: Code duplicated, block: B:109:0x027e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0282  */
    /* JADX WARN: Code duplicated, block: B:113:0x0286  */
    /* JADX WARN: Code duplicated, block: B:114:0x028e  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:141:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0205  */
    /* JADX WARN: Code duplicated, block: B:73:0x0214  */
    /* JADX WARN: Code duplicated, block: B:75:0x021f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0223  */
    /* JADX WARN: Code duplicated, block: B:79:0x0227  */
    /* JADX WARN: Code duplicated, block: B:84:0x0235  */
    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) throws zzcd {
        int i;
        int i2;
        int i3;
        int iZzd;
        byte[] bArrZzI;
        int iZzd2;
        int i4;
        byte b;
        int i5;
        int i6;
        int i7;
        byte b2;
        this.zzg.getClass();
        int i8 = zzfk.zza;
        while (zzfbVar.zza() > 0) {
            int i9 = this.zzi;
            int i10 = 13;
            int i11 = 2;
            if (i9 == 0) {
                byte[] bArrZzI2 = zzfbVar.zzI();
                int iZzc = zzfbVar.zzc();
                int iZzd3 = zzfbVar.zzd();
                while (true) {
                    if (iZzc < iZzd3) {
                        int i12 = iZzc + 1;
                        int i13 = bArrZzI2[iZzc] & 255;
                        if (this.zzk == 512 && zzl((byte) -1, (byte) i13)) {
                            if (!this.zzm) {
                                int i14 = i12 - 2;
                                zzfbVar.zzG(i14 + 1);
                                if (zzm(zzfbVar, this.zzc.zza, 1)) {
                                    this.zzc.zzj(4);
                                    int iZzd4 = this.zzc.zzd(1);
                                    int i15 = this.zzn;
                                    if (i15 == -1 || iZzd4 == i15) {
                                        if (this.zzo == -1) {
                                            if (zzm(zzfbVar, this.zzc.zza, 4)) {
                                                this.zzc.zzj(14);
                                                iZzd = this.zzc.zzd(i10);
                                                if (iZzd >= 7) {
                                                    bArrZzI = zzfbVar.zzI();
                                                    iZzd2 = zzfbVar.zzd();
                                                    i4 = i14 + iZzd;
                                                    if (i4 >= iZzd2) {
                                                        b = bArrZzI[i4];
                                                        if (b == -1) {
                                                            i7 = i4 + 1;
                                                            if (i7 != iZzd2) {
                                                                b2 = bArrZzI[i7];
                                                                if (zzl((byte) -1, b2) || ((b2 & 8) >> 3) != iZzd4) {
                                                                }
                                                            }
                                                        } else if (b == 73 || ((i5 = i4 + 1) != iZzd2 && (bArrZzI[i5] != 68 || ((i6 = i4 + 2) != iZzd2 && bArrZzI[i6] != 51)))) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (zzm(zzfbVar, this.zzc.zza, 1)) {
                                            this.zzc.zzj(i11);
                                            if (this.zzc.zzd(4) == this.zzo) {
                                                zzfbVar.zzG(i14 + 2);
                                                if (zzm(zzfbVar, this.zzc.zza, 4)) {
                                                    this.zzc.zzj(14);
                                                    iZzd = this.zzc.zzd(i10);
                                                    if (iZzd >= 7) {
                                                        bArrZzI = zzfbVar.zzI();
                                                        iZzd2 = zzfbVar.zzd();
                                                        i4 = i14 + iZzd;
                                                        if (i4 >= iZzd2) {
                                                            b = bArrZzI[i4];
                                                            if (b == -1) {
                                                                i7 = i4 + 1;
                                                                if (i7 != iZzd2) {
                                                                    b2 = bArrZzI[i7];
                                                                    if (zzl((byte) -1, b2)) {
                                                                    }
                                                                }
                                                            } else if (b == 73) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i = this.zzk;
                                i2 = i | i13;
                                if (i2 != 329) {
                                    i3 = 768;
                                } else if (i2 != 511) {
                                    if (i2 != 836) {
                                        i3 = 1024;
                                    } else if (i2 != 1075) {
                                        this.zzi = 2;
                                        this.zzj = 3;
                                        this.zzs = 0;
                                        this.zzd.zzG(0);
                                        zzfbVar.zzG(i12);
                                    } else if (i != 256) {
                                        this.zzk = 256;
                                        iZzc = i12 - 1;
                                        i10 = 13;
                                    } else {
                                        iZzc = i12;
                                        i10 = 13;
                                    }
                                    i11 = 2;
                                } else {
                                    i3 = 512;
                                }
                                this.zzk = i3;
                                iZzc = i12;
                                i10 = 13;
                                i11 = 2;
                            }
                            this.zzp = (i13 & 8) >> 3;
                            this.zzl = 1 == ((i13 & 1) ^ 1);
                            if (this.zzm) {
                                zzi();
                            } else {
                                this.zzi = 1;
                                this.zzj = 0;
                            }
                            zzfbVar.zzG(i12);
                        } else {
                            i = this.zzk;
                            i2 = i | i13;
                            if (i2 != 329) {
                                i3 = 768;
                            } else if (i2 != 511) {
                                if (i2 != 836) {
                                    i3 = 1024;
                                } else if (i2 != 1075) {
                                    this.zzi = 2;
                                    this.zzj = 3;
                                    this.zzs = 0;
                                    this.zzd.zzG(0);
                                    zzfbVar.zzG(i12);
                                } else if (i != 256) {
                                    this.zzk = 256;
                                    iZzc = i12 - 1;
                                    i10 = 13;
                                } else {
                                    iZzc = i12;
                                    i10 = 13;
                                }
                                i11 = 2;
                            } else {
                                i3 = 512;
                            }
                            this.zzk = i3;
                            iZzc = i12;
                            i10 = 13;
                            i11 = 2;
                        }
                    } else {
                        zzfbVar.zzG(iZzc);
                    }
                }
            } else if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        int iMin = Math.min(zzfbVar.zza(), this.zzs - this.zzj);
                        this.zzu.zzq(zzfbVar, iMin);
                        int i16 = this.zzj + iMin;
                        this.zzj = i16;
                        int i17 = this.zzs;
                        if (i16 == i17) {
                            long j = this.zzt;
                            if (j != -9223372036854775807L) {
                                this.zzu.zzs(j, 1, i17, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzh();
                        }
                    } else {
                        if (zzk(zzfbVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzj(0);
                            if (this.zzq) {
                                this.zzc.zzl(10);
                            } else {
                                int iZzd5 = this.zzc.zzd(2) + 1;
                                if (iZzd5 != 2) {
                                    zzes.zzf("AdtsReader", "Detected audio object type: " + iZzd5 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzl(5);
                                int iZzd6 = this.zzc.zzd(3);
                                int i18 = this.zzo;
                                int i19 = zzzz.zza;
                                byte[] bArr = {(byte) (((i18 >> 1) & 7) | 16), (byte) (((iZzd6 << 3) & R.styleable.AppCompatTheme_windowFixedHeightMajor) | ((i18 << 7) & 128))};
                                zzzy zzzyVarZza = zzzz.zza(bArr);
                                zzak zzakVar = new zzak();
                                zzakVar.zzH(this.zzf);
                                zzakVar.zzS("audio/mp4a-latm");
                                zzakVar.zzx(zzzyVarZza.zzc);
                                zzakVar.zzw(zzzyVarZza.zzb);
                                zzakVar.zzT(zzzyVarZza.zza);
                                zzakVar.zzI(Collections.singletonList(bArr));
                                zzakVar.zzK(this.zze);
                                zzam zzamVarZzY = zzakVar.zzY();
                                this.zzr = 1024000000 / ((long) zzamVarZzY.zzA);
                                this.zzg.zzk(zzamVarZzY);
                                this.zzq = true;
                            }
                            this.zzc.zzl(4);
                            int iZzd7 = this.zzc.zzd(13) - 7;
                            if (this.zzl) {
                                iZzd7 -= 2;
                            }
                            zzj(this.zzg, this.zzr, 0, iZzd7);
                        }
                    }
                } else if (zzk(zzfbVar, this.zzd.zzI(), 10)) {
                    this.zzh.zzq(this.zzd, 10);
                    this.zzd.zzG(6);
                    zzj(this.zzh, 0L, 10, 10 + this.zzd.zzk());
                }
            } else if (zzfbVar.zza() != 0) {
                zzfa zzfaVar = this.zzc;
                zzfaVar.zza[0] = zzfbVar.zzI()[zzfbVar.zzc()];
                zzfaVar.zzj(2);
                int iZzd8 = this.zzc.zzd(4);
                int i20 = this.zzo;
                if (i20 == -1 || iZzd8 == i20) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = iZzd8;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzf = zzakaVar.zzb();
        zzace zzaceVarZzv = zzabeVar.zzv(zzakaVar.zza(), 1);
        this.zzg = zzaceVarZzv;
        this.zzu = zzaceVarZzv;
        if (!this.zzb) {
            this.zzh = new zzaba();
            return;
        }
        zzakaVar.zzc();
        zzace zzaceVarZzv2 = zzabeVar.zzv(zzakaVar.zza(), 5);
        this.zzh = zzaceVarZzv2;
        zzak zzakVar = new zzak();
        zzakVar.zzH(zzakaVar.zzb());
        zzakVar.zzS("application/id3");
        zzaceVarZzv2.zzk(zzakVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzt = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
