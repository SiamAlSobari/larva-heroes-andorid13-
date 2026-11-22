package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzxi extends zzxl {
    private zzxh zza;

    protected abstract Pair zzb(zzxh zzxhVar, int[][][] iArr, int[] iArr2, zzts zztsVar, zzcw zzcwVar) throws zzil;

    @Override // com.google.android.gms.internal.ads.zzxl
    public final zzxm zzo(zzlp[] zzlpVarArr, zzvs zzvsVar, zzts zztsVar, zzcw zzcwVar) throws zzil {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcy[][] zzcyVarArr = new zzcy[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzvsVar.zzc;
            zzcyVarArr[i] = new zzcy[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzlpVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzvsVar.zzc) {
            zzcy zzcyVarZzb = zzvsVar.zzb(i5);
            int i6 = zzcyVarZzb.zzd;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                zzlp zzlpVar = zzlpVarArr[i7];
                int i10 = 0;
                int iMax = 0;
                while (true) {
                    int i11 = zzcyVarZzb.zzb;
                    if (i10 > 0) {
                        break;
                    }
                    iMax = Math.max(iMax, zzlpVar.zzU(zzcyVarZzb.zzb(i10)) & 7);
                    i10++;
                }
                boolean z3 = iArr2[i7] == 0;
                if (iMax > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = iMax;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                int i12 = zzcyVarZzb.zzb;
                iArr = new int[1];
            } else {
                zzlp zzlpVar2 = zzlpVarArr[i8];
                int i13 = zzcyVarZzb.zzb;
                int[] iArr5 = new int[1];
                int i14 = 0;
                while (true) {
                    int i15 = zzcyVarZzb.zzb;
                    if (i14 > 0) {
                        break;
                    }
                    iArr5[i14] = zzlpVar2.zzU(zzcyVarZzb.zzb(i14));
                    i14++;
                }
                iArr = iArr5;
            }
            int i16 = iArr2[i8];
            zzcyVarArr[i8][i16] = zzcyVarZzb;
            iArr3[i8][i16] = iArr;
            iArr2[i8] = i16 + 1;
            i5++;
            i3 = 2;
        }
        zzvs[] zzvsVarArr = new zzvs[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i17 = 0;
        while (i17 < i3) {
            int i18 = iArr2[i17];
            zzvsVarArr[i17] = new zzvs((zzcy[]) zzfk.zzH(zzcyVarArr[i17], i18));
            iArr3[i17] = (int[][]) zzfk.zzH(iArr3[i17], i18);
            strArr[i17] = zzlpVarArr[i17].zzQ();
            iArr6[i17] = zzlpVarArr[i17].zzb();
            i17++;
            i3 = 2;
        }
        zzxh zzxhVar = new zzxh(strArr, iArr6, zzvsVarArr, iArr4, iArr3, new zzvs((zzcy[]) zzfk.zzH(zzcyVarArr[2], iArr2[2])));
        Pair pairZzb = zzb(zzxhVar, iArr3, iArr4, zztsVar, zzcwVar);
        zzxj[] zzxjVarArr = (zzxj[]) pairZzb.second;
        List[] listArr = new List[zzxjVarArr.length];
        for (int i19 = 0; i19 < zzxjVarArr.length; i19++) {
            zzxj zzxjVar = zzxjVarArr[i19];
            listArr[i19] = zzxjVar != null ? zzfud.zzm(zzxjVar) : zzfud.zzl();
        }
        zzfua zzfuaVar = new zzfua();
        for (int i20 = 0; i20 < 2; i20++) {
            zzvs zzvsVarZzd = zzxhVar.zzd(i20);
            List list = listArr[i20];
            for (int i21 = 0; i21 < zzvsVarZzd.zzc; i21++) {
                zzcy zzcyVarZzb2 = zzvsVarZzd.zzb(i21);
                boolean z4 = zzxhVar.zza(i20, i21, false) != 0;
                int i22 = zzcyVarZzb2.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                int i23 = 0;
                while (true) {
                    int i24 = zzcyVarZzb2.zzb;
                    if (i23 <= 0) {
                        iArr7[i23] = zzxhVar.zzb(i20, i21, i23) & 7;
                        int i25 = 0;
                        while (true) {
                            if (i25 >= list.size()) {
                                z = false;
                                break;
                            }
                            zzxj zzxjVar2 = (zzxj) list.get(i25);
                            if (zzxjVar2.zze().equals(zzcyVarZzb2) && zzxjVar2.zzb(i23) != -1) {
                                z = true;
                                break;
                            }
                            i25++;
                        }
                        zArr[i23] = z;
                        i23++;
                    }
                }
                zzfuaVar.zzf(new zzdg(zzcyVarZzb2, z4, iArr7, zArr));
            }
        }
        zzvs zzvsVarZze = zzxhVar.zze();
        for (int i26 = 0; i26 < zzvsVarZze.zzc; i26++) {
            zzcy zzcyVarZzb3 = zzvsVarZze.zzb(i26);
            int i27 = zzcyVarZzb3.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            int i28 = zzcyVarZzb3.zzb;
            zzfuaVar.zzf(new zzdg(zzcyVarZzb3, false, iArr8, new boolean[1]));
        }
        return new zzxm((zzlq[]) pairZzb.first, (zzxf[]) pairZzb.second, new zzdh(zzfuaVar.zzi()), zzxhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zzp(Object obj) {
        this.zza = (zzxh) obj;
    }
}
