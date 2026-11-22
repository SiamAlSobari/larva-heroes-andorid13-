package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvz extends zzwb {
    private final zzxt zzd;
    private final zzfud zze;
    private final zzdz zzf;

    protected zzvz(zzcy zzcyVar, int[] iArr, int i, zzxt zzxtVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdz zzdzVar) {
        super(zzcyVar, iArr, 0);
        this.zzd = zzxtVar;
        this.zze = zzfud.zzj(list);
        this.zzf = zzdzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ zzfud zzf(zzxe[] zzxeVarArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            zzxe zzxeVar = zzxeVarArr[i3];
            if (zzxeVar == null || zzxeVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfua zzfuaVar = new zzfua();
                zzfuaVar.zzf(new zzvx(0L, 0L));
                arrayList.add(zzfuaVar);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i4 = 0; i4 < 2; i4++) {
            zzxe zzxeVar2 = zzxeVarArr[i4];
            if (zzxeVar2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[zzxeVar2.zzb.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = zzxeVar2.zzb;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    long j = zzxeVar2.zza.zzb(iArr[i5]).zzi;
                    long[] jArr2 = jArr[i4];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i5] = j;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzg(arrayList, jArr3);
        zzfuo zzfuoVarZza = zzfvh.zzc(zzfvm.zzc()).zzb(2).zza();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr5 = jArr[i7];
                    double dLog = 0.0d;
                    if (i8 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i8];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i8] = dLog;
                    i8++;
                }
                int i9 = length - 1;
                double d = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    double d2 = dArr[i10];
                    i10++;
                    zzfuoVarZza.zzq(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i10]) * 0.5d) - dArr[c]) / d), Integer.valueOf(i7));
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        zzfud zzfudVarZzj = zzfud.zzj(zzfuoVarZza.zzr());
        for (int i11 = 0; i11 < zzfudVarZzj.size(); i11++) {
            int iIntValue = ((Integer) zzfudVarZzj.get(i11)).intValue();
            int i12 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i12;
            jArr3[iIntValue] = jArr[iIntValue][i12];
            zzg(arrayList, jArr3);
        }
        for (int i13 = 0; i13 < 2; i13++) {
            if (arrayList.get(i13) != null) {
                long j3 = jArr3[i13];
                jArr3[i13] = j3 + j3;
            }
        }
        zzg(arrayList, jArr3);
        zzfua zzfuaVar2 = new zzfua();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            zzfua zzfuaVar3 = (zzfua) arrayList.get(i14);
            zzfuaVar2.zzf(zzfuaVar3 == null ? zzfud.zzl() : zzfuaVar3.zzi());
        }
        return zzfuaVar2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfua zzfuaVar = (zzfua) list.get(i2);
            if (zzfuaVar != null) {
                zzfuaVar.zzf(new zzvx(j, jArr[i2]));
            }
        }
    }
}
