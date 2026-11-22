package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahc implements zzabb, zzaca {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzagz
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzahc.zza;
            return new zzabb[]{new zzahc(0)};
        }
    };
    private final zzfb zzb;
    private final zzfb zzc;
    private final zzfb zzd;
    private final zzfb zze;
    private final ArrayDeque zzf;
    private final zzahe zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzfb zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzabe zzr;
    private zzahb[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzaff zzx;

    public zzahc() {
        this(0);
    }

    private static int zzf(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzahj zzahjVar, long j) {
        int iZza = zzahjVar.zza(j);
        return iZza == -1 ? zzahjVar.zzb(j) : iZza;
    }

    private static long zzj(zzahj zzahjVar, long j, long j2) {
        int iZzi = zzi(zzahjVar, j);
        return iZzi == -1 ? j2 : Math.min(zzahjVar.zzc[iZzi], j2);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x018d  */
    private final void zzl(long j) throws zzcd {
        zzbz zzbzVar;
        long j2;
        int i;
        while (!this.zzf.isEmpty() && ((zzagh) this.zzf.peek()).zza == j) {
            zzagh zzaghVar = (zzagh) this.zzf.pop();
            if (zzaghVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i2 = this.zzw;
                zzabq zzabqVar = new zzabq();
                zzagi zzagiVarZzb = zzaghVar.zzb(1969517665);
                if (zzagiVarZzb != null) {
                    zzbz zzbzVarZzb = zzagr.zzb(zzagiVarZzb);
                    zzabqVar.zzb(zzbzVarZzb);
                    zzbzVar = zzbzVarZzb;
                } else {
                    zzbzVar = null;
                }
                zzagh zzaghVarZza = zzaghVar.zza(1835365473);
                zzbz zzbzVarZza = zzaghVarZza != null ? zzagr.zza(zzaghVarZza) : null;
                zzby[] zzbyVarArr = new zzby[1];
                zzagi zzagiVarZzb2 = zzaghVar.zzb(1836476516);
                zzagiVarZzb2.getClass();
                boolean z = i2 == 1;
                zzbyVarArr[0] = zzagr.zzc(zzagiVarZzb2.zza);
                zzbz zzbzVar2 = new zzbz(-9223372036854775807L, zzbyVarArr);
                zzbz zzbzVar3 = zzbzVar;
                long j3 = -9223372036854775807L;
                List listZzd = zzagr.zzd(zzaghVar, zzabqVar, -9223372036854775807L, null, false, z, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzaha
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj) {
                        zzahg zzahgVar = (zzahg) obj;
                        zzabi zzabiVar = zzahc.zza;
                        return zzahgVar;
                    }
                });
                int size = listZzd.size();
                long j4 = -9223372036854775807L;
                int size2 = -1;
                int i3 = 0;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    zzahj zzahjVar = (zzahj) listZzd.get(i3);
                    if (zzahjVar.zzb != 0) {
                        zzahg zzahgVar = zzahjVar.zza;
                        long j5 = zzahgVar.zze;
                        if (j5 == j3) {
                            j5 = zzahjVar.zzh;
                        }
                        long jMax = Math.max(j4, j5);
                        zzahb zzahbVar = new zzahb(zzahgVar, zzahjVar, this.zzr.zzv(i3, zzahgVar.zzb));
                        int i4 = "audio/true-hd".equals(zzahgVar.zzf.zzm) ? zzahjVar.zze * 16 : zzahjVar.zze + 30;
                        zzak zzakVarZzb = zzahgVar.zzf.zzb();
                        zzakVarZzb.zzL(i4);
                        if (zzahgVar.zzb != 2 || j5 <= 0) {
                            i = 1;
                        } else {
                            int i5 = zzahjVar.zzb;
                            i = 1;
                            if (i5 > 1) {
                                zzakVarZzb.zzE(i5 / (j5 / 1000000.0f));
                            }
                        }
                        int i6 = zzahgVar.zzb;
                        int i7 = zzagy.zzb;
                        if (i6 == i && zzabqVar.zza()) {
                            zzakVarZzb.zzC(zzabqVar.zza);
                            zzakVarZzb.zzD(zzabqVar.zzb);
                        }
                        int i8 = zzahgVar.zzb;
                        zzbz[] zzbzVarArr = new zzbz[3];
                        zzbzVarArr[0] = this.zzh.isEmpty() ? null : new zzbz(this.zzh);
                        zzbzVarArr[i] = zzbzVar3;
                        zzbzVarArr[2] = zzbzVar2;
                        zzbz zzbzVar4 = new zzbz(-9223372036854775807L, new zzby[0]);
                        if (zzbzVarZza != null) {
                            for (int i9 = 0; i9 < zzbzVarZza.zza(); i9++) {
                                zzby zzbyVarZzb = zzbzVarZza.zzb(i9);
                                if (zzbyVarZzb instanceof zzfo) {
                                    zzfo zzfoVar = (zzfo) zzbyVarZzb;
                                    if (!zzfoVar.zza.equals("com.android.capture.fps")) {
                                        zzbzVar4 = zzbzVar4.zzc(zzfoVar);
                                    } else if (i8 == 2) {
                                        zzbzVar4 = zzbzVar4.zzc(zzfoVar);
                                    }
                                }
                            }
                        }
                        for (int i10 = 0; i10 < 3; i10++) {
                            zzbzVar4 = zzbzVar4.zzd(zzbzVarArr[i10]);
                        }
                        if (zzbzVar4.zza() > 0) {
                            zzakVarZzb.zzM(zzbzVar4);
                        }
                        zzahbVar.zzc.zzk(zzakVarZzb.zzY());
                        if (zzahgVar.zzb == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(zzahbVar);
                        j4 = jMax;
                    }
                    i3++;
                    listZzd = listZzd;
                    size = size;
                    j3 = -9223372036854775807L;
                }
                this.zzu = size2;
                this.zzv = j4;
                zzahb[] zzahbVarArr = (zzahb[]) arrayList.toArray(new zzahb[0]);
                this.zzs = zzahbVarArr;
                int length = zzahbVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < zzahbVarArr.length; i11++) {
                    jArr[i11] = new long[zzahbVarArr[i11].zzb.zzb];
                    jArr2[i11] = zzahbVarArr[i11].zzb.zzf[0];
                }
                int i12 = 0;
                while (i12 < zzahbVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < zzahbVarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j7 = jArr2[i14];
                            if (j7 <= j6) {
                                i13 = i14;
                                j6 = j7;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j2;
                    zzahj zzahjVar2 = zzahbVarArr[i13].zzb;
                    j2 += (long) zzahjVar2.zzd[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = zzahjVar2.zzf[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                this.zzt = jArr;
                this.zzr.zzC();
                this.zzr.zzN(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzagh) this.zzf.peek()).zzc(zzaghVar);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzr = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzk();
            return;
        }
        for (zzahb zzahbVar : this.zzs) {
            zzahj zzahjVar = zzahbVar.zzb;
            int iZza = zzahjVar.zza(j2);
            if (iZza == -1) {
                iZza = zzahjVar.zzb(j2);
            }
            zzahbVar.zze = iZza;
            zzacf zzacfVar = zzahbVar.zzd;
            if (zzacfVar != null) {
                zzacfVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        return zzahf.zzb(zzabcVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        long j2;
        long j3;
        int iZzb;
        zzahb[] zzahbVarArr = this.zzs;
        if (zzahbVarArr.length == 0) {
            zzacb zzacbVar = zzacb.zza;
            return new zzaby(zzacbVar, zzacbVar);
        }
        int i = this.zzu;
        long jZzj = -1;
        if (i != -1) {
            zzahj zzahjVar = zzahbVarArr[i].zzb;
            int iZzi = zzi(zzahjVar, j);
            if (iZzi == -1) {
                zzacb zzacbVar2 = zzacb.zza;
                return new zzaby(zzacbVar2, zzacbVar2);
            }
            long j4 = zzahjVar.zzf[iZzi];
            j2 = zzahjVar.zzc[iZzi];
            if (j4 >= j || iZzi >= zzahjVar.zzb - 1 || (iZzb = zzahjVar.zzb(j)) == -1 || iZzb == iZzi) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzahjVar.zzf[iZzb];
                jZzj = zzahjVar.zzc[iZzb];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzahb[] zzahbVarArr2 = this.zzs;
            if (i2 >= zzahbVarArr2.length) {
                break;
            }
            if (i2 != this.zzu) {
                zzahj zzahjVar2 = zzahbVarArr2[i2].zzb;
                long jZzj2 = zzj(zzahjVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jZzj = zzj(zzahjVar2, j3, jZzj);
                }
                j2 = jZzj2;
            }
            i2++;
        }
        zzacb zzacbVar3 = new zzacb(j, j2);
        return j3 == -9223372036854775807L ? new zzaby(zzacbVar3, zzacbVar3) : new zzaby(zzacbVar3, new zzacb(j3, jZzj));
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }

    public zzahc(int i) {
        this.zzi = 0;
        this.zzg = new zzahe();
        this.zzh = new ArrayList();
        this.zze = new zzfb(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzfb(zzfy.zza);
        this.zzc = new zzfb(4);
        this.zzd = new zzfb();
        this.zzn = -1;
        this.zzr = zzabe.zza;
        this.zzs = new zzahb[0];
    }

    /* JADX WARN: Code duplicated, block: B:260:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzi;
            if (i == 0) {
                if (this.zzl == 0) {
                    if (!zzabcVar.zzn(this.zze.zzI(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzl = 8;
                    this.zze.zzG(0);
                    this.zzk = this.zze.zzt();
                    this.zzj = this.zze.zzf();
                }
                long j = this.zzk;
                if (j == 1) {
                    zzabcVar.zzi(this.zze.zzI(), 8, 8);
                    this.zzl += 8;
                    this.zzk = this.zze.zzu();
                } else if (j == 0) {
                    long jZzd = zzabcVar.zzd();
                    if (jZzd == -1) {
                        zzagh zzaghVar = (zzagh) this.zzf.peek();
                        jZzd = zzaghVar != null ? zzaghVar.zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzk = (jZzd - zzabcVar.zzf()) + ((long) this.zzl);
                    }
                }
                long j2 = this.zzk;
                int i2 = this.zzl;
                if (j2 < i2) {
                    throw zzcd.zzc("Atom size less than header length (unsupported).");
                }
                int i3 = this.zzj;
                if (i3 == 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473) {
                    long jZzf = zzabcVar.zzf();
                    long j3 = this.zzk;
                    long j4 = jZzf + j3;
                    long j5 = this.zzl;
                    if (j3 != j5 && this.zzj == 1835365473) {
                        this.zzd.zzD(8);
                        zzabcVar.zzh(this.zzd.zzI(), 0, 8);
                        zzagr.zze(this.zzd);
                        zzabcVar.zzk(this.zzd.zzc());
                        zzabcVar.zzj();
                    }
                    long j6 = j4 - j5;
                    this.zzf.push(new zzagh(this.zzj, j6));
                    if (this.zzk == this.zzl) {
                        zzl(j6);
                    } else {
                        zzk();
                    }
                } else if (i3 == 1835296868 || i3 == 1836476516 || i3 == 1751411826 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1937011571 || i3 == 1668576371 || i3 == 1701606260 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1953196132 || i3 == 1718909296 || i3 == 1969517665 || i3 == 1801812339 || i3 == 1768715124) {
                    zzdy.zzf(i2 == 8);
                    zzdy.zzf(this.zzk <= 2147483647L);
                    zzfb zzfbVar = new zzfb((int) this.zzk);
                    System.arraycopy(this.zze.zzI(), 0, zzfbVar.zzI(), 0, 8);
                    this.zzm = zzfbVar;
                    this.zzi = 1;
                } else {
                    long jZzf2 = zzabcVar.zzf();
                    long j7 = this.zzl;
                    long j8 = jZzf2 - j7;
                    if (this.zzj == 1836086884) {
                        this.zzx = new zzaff(0L, j8, -9223372036854775807L, j8 + j7, this.zzk - j7);
                    }
                    this.zzm = null;
                    this.zzi = 1;
                }
            } else {
                if (i != 1) {
                    long jZzf3 = zzabcVar.zzf();
                    int i4 = this.zzn;
                    if (i4 == -1) {
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        int i5 = 0;
                        boolean z3 = true;
                        int i6 = -1;
                        int i7 = -1;
                        boolean z4 = true;
                        while (true) {
                            zzahb[] zzahbVarArr = this.zzs;
                            if (i5 >= zzahbVarArr.length) {
                                break;
                            }
                            zzahb zzahbVar = zzahbVarArr[i5];
                            int i8 = zzahbVar.zze;
                            zzahj zzahjVar = zzahbVar.zzb;
                            if (i8 != zzahjVar.zzb) {
                                long j12 = zzahjVar.zzc[i8];
                                long[][] jArr = this.zzt;
                                int i9 = zzfk.zza;
                                long j13 = jArr[i5][i8];
                                long j14 = j12 - jZzf3;
                                boolean z5 = j14 < 0 || j14 >= 262144;
                                if (z5) {
                                    z = z4;
                                } else {
                                    if (z4) {
                                        z4 = z5;
                                        i7 = i5;
                                        j11 = j14;
                                        j10 = j13;
                                    } else {
                                        z = false;
                                    }
                                    if (j13 < j9) {
                                        z3 = z5;
                                        i6 = i5;
                                        j9 = j13;
                                    }
                                }
                                if (z5 != z || j14 >= j11) {
                                    z4 = z;
                                } else {
                                    z4 = z5;
                                    i7 = i5;
                                    j11 = j14;
                                    j10 = j13;
                                }
                                if (j13 < j9) {
                                    z3 = z5;
                                    i6 = i5;
                                    j9 = j13;
                                }
                            }
                            i5++;
                        }
                        i4 = (j9 == Long.MAX_VALUE || !z3 || j10 < j9 + 10485760) ? i7 : i6;
                        this.zzn = i4;
                        if (i4 == -1) {
                            return -1;
                        }
                    }
                    zzahb zzahbVar2 = this.zzs[i4];
                    zzace zzaceVar = zzahbVar2.zzc;
                    int i10 = zzahbVar2.zze;
                    zzahj zzahjVar2 = zzahbVar2.zzb;
                    long j15 = zzahjVar2.zzc[i10];
                    int i11 = zzahjVar2.zzd[i10];
                    zzacf zzacfVar = zzahbVar2.zzd;
                    long j16 = (j15 - jZzf3) + ((long) this.zzo);
                    if (j16 < 0 || j16 >= 262144) {
                        zzabxVar.zza = j15;
                        return 1;
                    }
                    if (zzahbVar2.zza.zzg == 1) {
                        j16 += 8;
                        i11 -= 8;
                    }
                    zzabcVar.zzk((int) j16);
                    zzahg zzahgVar = zzahbVar2.zza;
                    int i12 = zzahgVar.zzj;
                    if (i12 == 0) {
                        if ("audio/ac4".equals(zzahgVar.zzf.zzm)) {
                            if (this.zzp == 0) {
                                zzaaf.zzb(i11, this.zzd);
                                zzaceVar.zzq(this.zzd, 7);
                                this.zzp += 7;
                            }
                            i11 += 7;
                        } else if (zzacfVar != null) {
                            zzacfVar.zzd(zzabcVar);
                        }
                        while (true) {
                            int i13 = this.zzp;
                            if (i13 >= i11) {
                                break;
                            }
                            int iZze = zzaceVar.zze(zzabcVar, i11 - i13, false);
                            this.zzo += iZze;
                            this.zzp += iZze;
                            this.zzq -= iZze;
                        }
                    } else {
                        byte[] bArrZzI = this.zzc.zzI();
                        bArrZzI[0] = 0;
                        bArrZzI[1] = 0;
                        bArrZzI[2] = 0;
                        int i14 = 4 - i12;
                        while (this.zzp < i11) {
                            int i15 = this.zzq;
                            if (i15 == 0) {
                                zzabcVar.zzi(bArrZzI, i14, i12);
                                this.zzo += i12;
                                this.zzc.zzG(0);
                                int iZzf = this.zzc.zzf();
                                if (iZzf < 0) {
                                    throw zzcd.zza("Invalid NAL length", null);
                                }
                                this.zzq = iZzf;
                                this.zzb.zzG(0);
                                zzaceVar.zzq(this.zzb, 4);
                                this.zzp += 4;
                                i11 += i14;
                            } else {
                                int iZze2 = zzaceVar.zze(zzabcVar, i15, false);
                                this.zzo += iZze2;
                                this.zzp += iZze2;
                                this.zzq -= iZze2;
                            }
                        }
                    }
                    zzahj zzahjVar3 = zzahbVar2.zzb;
                    long j17 = zzahjVar3.zzf[i10];
                    int i16 = zzahjVar3.zzg[i10];
                    if (zzacfVar != null) {
                        zzacfVar.zzc(zzaceVar, j17, i16, i11, 0, null);
                        if (i10 + 1 == zzahbVar2.zzb.zzb) {
                            zzacfVar.zza(zzaceVar, null);
                        }
                    } else {
                        zzaceVar.zzs(j17, i16, i11, 0, null);
                    }
                    zzahbVar2.zze++;
                    this.zzn = -1;
                    this.zzo = 0;
                    this.zzp = 0;
                    this.zzq = 0;
                    return 0;
                }
                long j18 = this.zzk - ((long) this.zzl);
                long jZzf4 = zzabcVar.zzf() + j18;
                zzfb zzfbVar2 = this.zzm;
                if (zzfbVar2 != null) {
                    zzabcVar.zzi(zzfbVar2.zzI(), this.zzl, (int) j18);
                    if (this.zzj == 1718909296) {
                        zzfbVar2.zzG(8);
                        int iZzf2 = zzf(zzfbVar2.zzf());
                        if (iZzf2 == 0) {
                            zzfbVar2.zzH(4);
                            do {
                                if (zzfbVar2.zza() <= 0) {
                                    iZzf2 = 0;
                                    break;
                                }
                                iZzf2 = zzf(zzfbVar2.zzf());
                            } while (iZzf2 == 0);
                        }
                        this.zzw = iZzf2;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzagh) this.zzf.peek()).zzd(new zzagi(this.zzj, zzfbVar2));
                    }
                } else {
                    if (j18 < 262144) {
                        zzabcVar.zzk((int) j18);
                    } else {
                        zzabxVar.zza = zzabcVar.zzf() + j18;
                        z2 = true;
                    }
                    zzl(jZzf4);
                    if (z2 && this.zzi != 2) {
                        return 1;
                    }
                }
                z2 = false;
                zzl(jZzf4);
                if (z2) {
                    continue;
                }
            }
        }
    }
}
