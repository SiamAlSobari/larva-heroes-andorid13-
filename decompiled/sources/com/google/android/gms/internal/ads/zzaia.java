package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaia extends zzahy {
    private zzahz zza;
    private int zzb;
    private boolean zzc;
    private zzacj zzd;
    private zzach zze;

    zzaia() {
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final long zza(zzfb zzfbVar) {
        if ((zzfbVar.zzI()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzfbVar.zzI()[0];
        zzahz zzahzVar = this.zza;
        zzdy.zzb(zzahzVar);
        int i = !zzahzVar.zzd[(b >> 1) & (255 >>> (8 - zzahzVar.zze))].zza ? zzahzVar.zza.zze : zzahzVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzfbVar.zzb() < zzfbVar.zzd() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzfbVar.zzI(), zzfbVar.zzd() + 4);
            zzfbVar.zzE(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzfbVar.zzF(zzfbVar.zzd() + 4);
        }
        long j = i2;
        byte[] bArrZzI = zzfbVar.zzI();
        bArrZzI[zzfbVar.zzd() - 4] = (byte) (j & 255);
        bArrZzI[zzfbVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzI[zzfbVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzI[zzfbVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzacj zzacjVar = this.zzd;
        this.zzb = zzacjVar != null ? zzacjVar.zze : 0;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x03c2  */
    @Override // com.google.android.gms.internal.ads.zzahy
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfb zzfbVar, long j, zzahv zzahvVar) throws IOException {
        zzahz zzahzVar;
        int i;
        int iZzb;
        int i2;
        int i3;
        long jFloor;
        if (this.zza != null) {
            zzahvVar.zza.getClass();
            return false;
        }
        zzacj zzacjVar = this.zzd;
        int i4 = 4;
        if (zzacjVar != null) {
            zzach zzachVar = this.zze;
            if (zzachVar == null) {
                this.zze = zzack.zzc(zzfbVar, true, true);
            } else {
                byte[] bArr = new byte[zzfbVar.zzd()];
                System.arraycopy(zzfbVar.zzI(), 0, bArr, 0, zzfbVar.zzd());
                int i5 = zzacjVar.zza;
                int i6 = 5;
                zzack.zzd(5, zzfbVar, false);
                int iZzl = zzfbVar.zzl() + 1;
                zzacg zzacgVar = new zzacg(zzfbVar.zzI());
                zzacgVar.zzc(zzfbVar.zzc() * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    if (i7 >= iZzl) {
                        zzacj zzacjVar2 = zzacjVar;
                        int i10 = 6;
                        int iZzb2 = zzacgVar.zzb(6) + 1;
                        for (int i11 = 0; i11 < iZzb2; i11++) {
                            if (zzacgVar.zzb(16) != 0) {
                                throw zzcd.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i12 = 1;
                        int iZzb3 = zzacgVar.zzb(6) + 1;
                        int i13 = 0;
                        while (true) {
                            int i14 = 3;
                            if (i13 >= iZzb3) {
                                int i15 = 1;
                                int iZzb4 = zzacgVar.zzb(i10) + 1;
                                int i16 = 0;
                                while (i16 < iZzb4) {
                                    if (zzacgVar.zzb(16) > 2) {
                                        throw zzcd.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzacgVar.zzc(24);
                                    zzacgVar.zzc(24);
                                    zzacgVar.zzc(24);
                                    int iZzb5 = zzacgVar.zzb(i10) + i15;
                                    int i17 = 8;
                                    zzacgVar.zzc(8);
                                    int[] iArr = new int[iZzb5];
                                    for (int i18 = 0; i18 < iZzb5; i18++) {
                                        iArr[i18] = ((zzacgVar.zzd() ? zzacgVar.zzb(5) : 0) * 8) + zzacgVar.zzb(3);
                                    }
                                    int i19 = 0;
                                    while (i19 < iZzb5) {
                                        int i20 = 0;
                                        while (i20 < i17) {
                                            if ((iArr[i19] & (1 << i20)) != 0) {
                                                zzacgVar.zzc(i17);
                                            }
                                            i20++;
                                            i17 = 8;
                                        }
                                        i19++;
                                        i17 = 8;
                                    }
                                    i16++;
                                    i10 = 6;
                                    i15 = 1;
                                }
                                int iZzb6 = zzacgVar.zzb(i10) + 1;
                                for (int i21 = 0; i21 < iZzb6; i21++) {
                                    int iZzb7 = zzacgVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        zzes.zzc("VorbisUtil", "mapping type other than 0 not supported: " + iZzb7);
                                    } else {
                                        if (zzacgVar.zzd()) {
                                            i = 1;
                                            iZzb = zzacgVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzacgVar.zzd()) {
                                            int iZzb8 = zzacgVar.zzb(8) + i;
                                            for (int i22 = 0; i22 < iZzb8; i22++) {
                                                int i23 = i5 - 1;
                                                zzacgVar.zzc(zzack.zza(i23));
                                                zzacgVar.zzc(zzack.zza(i23));
                                            }
                                        }
                                        if (zzacgVar.zzb(2) != 0) {
                                            throw zzcd.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i24 = 0; i24 < i5; i24++) {
                                                zzacgVar.zzc(4);
                                            }
                                        }
                                        for (int i25 = 0; i25 < iZzb; i25++) {
                                            zzacgVar.zzc(8);
                                            zzacgVar.zzc(8);
                                            zzacgVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzacgVar.zzb(6) + 1;
                                zzaci[] zzaciVarArr = new zzaci[iZzb9];
                                for (int i26 = 0; i26 < iZzb9; i26++) {
                                    zzaciVarArr[i26] = new zzaci(zzacgVar.zzd(), zzacgVar.zzb(16), zzacgVar.zzb(16), zzacgVar.zzb(8));
                                }
                                if (!zzacgVar.zzd()) {
                                    throw zzcd.zza("framing bit after modes not set as expected", null);
                                }
                                zzahzVar = new zzahz(zzacjVar2, zzachVar, bArr, zzaciVarArr, zzack.zza(iZzb9 - 1));
                                break;
                            }
                            int iZzb10 = zzacgVar.zzb(i9);
                            if (iZzb10 == 0) {
                                i2 = iZzb3;
                                int i27 = 8;
                                zzacgVar.zzc(8);
                                zzacgVar.zzc(16);
                                zzacgVar.zzc(16);
                                zzacgVar.zzc(6);
                                zzacgVar.zzc(8);
                                int iZzb11 = zzacgVar.zzb(4) + 1;
                                int i28 = 0;
                                while (i28 < iZzb11) {
                                    zzacgVar.zzc(i27);
                                    i28++;
                                    i27 = 8;
                                }
                            } else {
                                if (iZzb10 != i12) {
                                    throw zzcd.zza("floor type greater than 1 not decodable: " + iZzb10, null);
                                }
                                int iZzb12 = zzacgVar.zzb(i6);
                                int[] iArr2 = new int[iZzb12];
                                int i29 = -1;
                                for (int i30 = 0; i30 < iZzb12; i30++) {
                                    int iZzb13 = zzacgVar.zzb(4);
                                    iArr2[i30] = iZzb13;
                                    if (iZzb13 > i29) {
                                        i29 = iZzb13;
                                    }
                                }
                                int i31 = i29 + 1;
                                int[] iArr3 = new int[i31];
                                int i32 = 0;
                                while (i32 < i31) {
                                    iArr3[i32] = zzacgVar.zzb(i14) + 1;
                                    int iZzb14 = zzacgVar.zzb(i8);
                                    if (iZzb14 > 0) {
                                        i3 = 8;
                                        zzacgVar.zzc(8);
                                    } else {
                                        i3 = 8;
                                    }
                                    int i33 = iZzb3;
                                    int i34 = 0;
                                    for (int i35 = 1; i34 < (i35 << iZzb14); i35 = 1) {
                                        zzacgVar.zzc(i3);
                                        i34++;
                                        i3 = 8;
                                    }
                                    i32++;
                                    iZzb3 = i33;
                                    i8 = 2;
                                    i14 = 3;
                                }
                                i2 = iZzb3;
                                zzacgVar.zzc(2);
                                int iZzb15 = zzacgVar.zzb(4);
                                int i36 = 0;
                                int i37 = 0;
                                for (int i38 = 0; i38 < iZzb12; i38++) {
                                    i36 += iArr3[iArr2[i38]];
                                    while (i37 < i36) {
                                        zzacgVar.zzc(iZzb15);
                                        i37++;
                                    }
                                }
                            }
                            i13++;
                            iZzb3 = i2;
                            i10 = 6;
                            i9 = 16;
                            i8 = 2;
                            i12 = 1;
                            i6 = 5;
                        }
                    } else {
                        if (zzacgVar.zzb(24) != 5653314) {
                            throw zzcd.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzacgVar.zza(), null);
                        }
                        int iZzb16 = zzacgVar.zzb(16);
                        int iZzb17 = zzacgVar.zzb(24);
                        if (zzacgVar.zzd()) {
                            zzacgVar.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzacgVar.zzb(zzack.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZzd = zzacgVar.zzd();
                            for (int i39 = 0; i39 < iZzb17; i39++) {
                                if (!zZzd) {
                                    zzacgVar.zzc(5);
                                } else if (zzacgVar.zzd()) {
                                    zzacgVar.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = zzacgVar.zzb(i4);
                        if (iZzb19 > 2) {
                            throw zzcd.zza("lookup type greater than 2 not decodable: " + iZzb19, null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 != 2) {
                                zzacjVar = zzacjVar;
                            }
                            i7++;
                            zzacjVar = zzacjVar;
                            i4 = 4;
                        } else {
                            i8 = iZzb19;
                        }
                        zzacgVar.zzc(32);
                        zzacgVar.zzc(32);
                        int iZzb20 = zzacgVar.zzb(i4) + 1;
                        zzacgVar.zzc(1);
                        if (i8 != 1) {
                            jFloor = ((long) iZzb17) * ((long) iZzb16);
                        } else if (iZzb16 != 0) {
                            double d = iZzb16;
                            Double.isNaN(d);
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / d));
                        } else {
                            jFloor = 0;
                        }
                        zzacgVar.zzc((int) (jFloor * ((long) iZzb20)));
                        i7++;
                        zzacjVar = zzacjVar;
                        i4 = 4;
                    }
                }
            }
            this.zza = zzahzVar;
            if (zzahzVar == null) {
                return true;
            }
            zzacj zzacjVar3 = zzahzVar.zza;
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzacjVar3.zzg);
            arrayList.add(zzahzVar.zzc);
            zzbz zzbzVarZzb = zzack.zzb(zzfud.zzk(zzahzVar.zzb.zzb));
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/vorbis");
            zzakVar.zzv(zzacjVar3.zzd);
            zzakVar.zzO(zzacjVar3.zzc);
            zzakVar.zzw(zzacjVar3.zza);
            zzakVar.zzT(zzacjVar3.zzb);
            zzakVar.zzI(arrayList);
            zzakVar.zzM(zzbzVarZzb);
            zzahvVar.zza = zzakVar.zzY();
            return true;
        }
        zzack.zzd(1, zzfbVar, false);
        int iZzi = zzfbVar.zzi();
        int iZzl2 = zzfbVar.zzl();
        int iZzi2 = zzfbVar.zzi();
        int iZzh = zzfbVar.zzh();
        int i40 = iZzh <= 0 ? -1 : iZzh;
        int iZzh2 = zzfbVar.zzh();
        int i41 = iZzh2 <= 0 ? -1 : iZzh2;
        int iZzh3 = zzfbVar.zzh();
        int i42 = iZzh3 <= 0 ? -1 : iZzh3;
        int iZzl3 = zzfbVar.zzl();
        this.zzd = new zzacj(iZzi, iZzl2, iZzi2, i40, i41, i42, (int) Math.pow(2.0d, iZzl3 & 15), (int) Math.pow(2.0d, (iZzl3 & 240) >> 4), 1 == (zzfbVar.zzl() & 1), Arrays.copyOf(zzfbVar.zzI(), zzfbVar.zzd()));
        zzahzVar = null;
        this.zza = zzahzVar;
        if (zzahzVar == null) {
            return true;
        }
        zzacj zzacjVar4 = zzahzVar.zza;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(zzacjVar4.zzg);
        arrayList2.add(zzahzVar.zzc);
        zzbz zzbzVarZzb2 = zzack.zzb(zzfud.zzk(zzahzVar.zzb.zzb));
        zzak zzakVar2 = new zzak();
        zzakVar2.zzS("audio/vorbis");
        zzakVar2.zzv(zzacjVar4.zzd);
        zzakVar2.zzO(zzacjVar4.zzc);
        zzakVar2.zzw(zzacjVar4.zza);
        zzakVar2.zzT(zzacjVar4.zzb);
        zzakVar2.zzI(arrayList2);
        zzakVar2.zzM(zzbzVarZzb2);
        zzahvVar.zza = zzakVar2.zzY();
        return true;
    }
}
