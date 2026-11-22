package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvs extends zzfug {
    static final zzfug zza = new zzfvs(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzfvs(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0194  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v7 */
    static zzfvs zzj(int i, Object[] objArr, zzfuf zzfufVar) {
        short[] sArr;
        char c;
        char c2;
        ?? r6;
        ?? r3;
        boolean z;
        ?? r4;
        Object[] objArr2;
        zzfue zzfueVar;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (zzfvs) zza;
        }
        zzfue zzfueVar2 = null;
        ?? r5 = 0;
        zzfue zzfueVar3 = null;
        zzfue zzfueVar4 = null;
        int i3 = 1;
        if (i2 == 1) {
            Object obj = objArrCopyOf[0];
            obj.getClass();
            Object obj2 = objArrCopyOf[1];
            obj2.getClass();
            zzfta.zzb(obj, obj2);
            return new zzfvs(null, objArrCopyOf, 1);
        }
        zzfri.zzb(i2, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iZzh = zzfui.zzh(i);
        if (i2 == 1) {
            Object obj3 = objArrCopyOf[0];
            obj3.getClass();
            Object obj4 = objArrCopyOf[1];
            obj4.getClass();
            zzfta.zzb(obj3, obj4);
        } else {
            int i4 = iZzh - 1;
            byte b = -1;
            if (iZzh > 128) {
                if (iZzh <= 32768) {
                    sArr = new short[iZzh];
                    Arrays.fill(sArr, (short) -1);
                    int i5 = 0;
                    for (int i6 = 0; i6 < i2; i6++) {
                        int i7 = i5 + i5;
                        int i8 = i6 + i6;
                        Object obj5 = objArrCopyOf[i8];
                        obj5.getClass();
                        Object obj6 = objArrCopyOf[i8 ^ 1];
                        obj6.getClass();
                        zzfta.zzb(obj5, obj6);
                        int iZza = zzftv.zza(obj5.hashCode());
                        while (true) {
                            int i9 = iZza & i4;
                            char c3 = (char) sArr[i9];
                            if (c3 == 65535) {
                                sArr[i9] = (short) i7;
                                if (i5 < i6) {
                                    objArrCopyOf[i7] = obj5;
                                    objArrCopyOf[i7 ^ 1] = obj6;
                                }
                                i5++;
                                break;
                            }
                            if (obj5.equals(objArrCopyOf[c3])) {
                                int i10 = c3 ^ 1;
                                Object obj7 = objArrCopyOf[i10 == true ? 1 : 0];
                                obj7.getClass();
                                zzfue zzfueVar5 = new zzfue(obj5, obj6, obj7);
                                objArrCopyOf[i10 == true ? 1 : 0] = obj6;
                                zzfueVar4 = zzfueVar5;
                                break;
                            }
                            iZza = i9 + 1;
                        }
                    }
                    if (i5 != i2) {
                        Integer numValueOf = Integer.valueOf(i5);
                        c = 1;
                        c2 = 2;
                        r6 = new Object[]{sArr, numValueOf, zzfueVar4};
                        r3 = r6;
                    }
                } else {
                    int i11 = 1;
                    sArr = new int[iZzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < i2) {
                        int i14 = i13 + i13;
                        int i15 = i12 + i12;
                        Object obj8 = objArrCopyOf[i15];
                        obj8.getClass();
                        Object obj9 = objArrCopyOf[i15 ^ i11];
                        obj9.getClass();
                        zzfta.zzb(obj8, obj9);
                        int iZza2 = zzftv.zza(obj8.hashCode());
                        while (true) {
                            int i16 = iZza2 & i4;
                            ?? r15 = sArr[i16];
                            if (r15 == b) {
                                sArr[i16] = i14;
                                if (i13 < i12) {
                                    objArrCopyOf[i14] = obj8;
                                    objArrCopyOf[i14 ^ 1] = obj9;
                                }
                                i13++;
                                break;
                            }
                            if (obj8.equals(objArrCopyOf[r15])) {
                                int i17 = r15 ^ 1;
                                Object obj10 = objArrCopyOf[i17 == true ? 1 : 0];
                                obj10.getClass();
                                zzfue zzfueVar6 = new zzfue(obj8, obj9, obj10);
                                objArrCopyOf[i17 == true ? 1 : 0] = obj9;
                                zzfueVar2 = zzfueVar6;
                                break;
                            }
                            iZza2 = i16 + 1;
                            b = -1;
                        }
                        i12++;
                        i11 = 1;
                        b = -1;
                    }
                    if (i13 != i2) {
                        c = 1;
                        c2 = 2;
                        r6 = new Object[]{sArr, Integer.valueOf(i13), zzfueVar2};
                        r3 = r6;
                    }
                }
                z = r3 instanceof Object[];
                r4 = r3;
                if (z) {
                    objArr2 = (Object[]) r3;
                    zzfueVar = (zzfue) objArr2[c2];
                    if (zzfufVar != null) {
                        throw zzfueVar.zza();
                    }
                    zzfufVar.zzc = zzfueVar;
                    Object obj11 = objArr2[0];
                    int iIntValue = ((Integer) objArr2[c]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                    r4 = obj11;
                    i2 = iIntValue;
                }
                return new zzfvs(r4, objArrCopyOf, i2);
            }
            byte[] bArr = new byte[iZzh];
            Arrays.fill(bArr, (byte) -1);
            int i18 = 0;
            int i19 = 0;
            while (i18 < i2) {
                int i20 = i19 + i19;
                int i21 = i18 + i18;
                Object obj12 = objArrCopyOf[i21];
                obj12.getClass();
                Object obj13 = objArrCopyOf[i21 ^ i3];
                obj13.getClass();
                zzfta.zzb(obj12, obj13);
                int iZza3 = zzftv.zza(obj12.hashCode());
                while (true) {
                    int i22 = iZza3 & i4;
                    int i23 = bArr[i22] & 255;
                    if (i23 == 255) {
                        bArr[i22] = (byte) i20;
                        if (i19 < i18) {
                            objArrCopyOf[i20] = obj12;
                            objArrCopyOf[i20 ^ 1] = obj13;
                        }
                        i19++;
                        break;
                    }
                    if (obj12.equals(objArrCopyOf[i23 == true ? 1 : 0])) {
                        int i24 = ~i23;
                        Object obj14 = objArrCopyOf[i24 == true ? 1 : 0];
                        obj14.getClass();
                        zzfue zzfueVar7 = new zzfue(obj12, obj13, obj14);
                        objArrCopyOf[i24 == true ? 1 : 0] = obj13;
                        zzfueVar3 = zzfueVar7;
                        break;
                    }
                    iZza3 = i22 + 1;
                }
                i18++;
                i3 = 1;
            }
            if (i19 == i2) {
                r5 = bArr;
            } else {
                sArr = new Object[]{bArr, Integer.valueOf(i19), zzfueVar3};
            }
            r5 = sArr;
        }
        c2 = 2;
        c = 1;
        r3 = r5;
        z = r3 instanceof Object[];
        r4 = r3;
        if (z) {
            objArr2 = (Object[]) r3;
            zzfueVar = (zzfue) objArr2[c2];
            if (zzfufVar != null) {
                throw zzfueVar.zza();
            }
            zzfufVar.zzc = zzfueVar;
            Object obj15 = objArr2[0];
            int iIntValue2 = ((Integer) objArr2[c]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r4 = obj15;
            i2 = iIntValue2;
        }
        return new zzfvs(r4, objArrCopyOf, i2);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0038->B:21:0x004e], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0063->B:31:0x007a], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0089->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.ads.zzfug, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Object obj3 = this.zzc;
        Object[] objArr = this.zzb;
        int i = this.zzd;
        if (obj == null) {
            obj2 = null;
        } else if (i == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            if (obj4.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        } else if (obj3 == null) {
            obj2 = null;
        } else if (obj3 instanceof byte[]) {
            byte[] bArr = (byte[]) obj3;
            int length = bArr.length - 1;
            int iZza = zzftv.zza(obj.hashCode());
            while (true) {
                int i2 = iZza & length;
                int i3 = bArr[i2] & 255;
                if (i3 == 255) {
                    break;
                }
                if (obj.equals(objArr[i3])) {
                    obj2 = objArr[i3 ^ 1];
                } else {
                    iZza = i2 + 1;
                }
            }
            obj2 = null;
        } else if (obj3 instanceof short[]) {
            short[] sArr = (short[]) obj3;
            int length2 = sArr.length - 1;
            int iZza2 = zzftv.zza(obj.hashCode());
            while (true) {
                int i4 = iZza2 & length2;
                char c = (char) sArr[i4];
                if (c == 65535) {
                    break;
                }
                if (obj.equals(objArr[c])) {
                    obj2 = objArr[c ^ 1];
                } else {
                    iZza2 = i4 + 1;
                }
            }
            obj2 = null;
        } else {
            int[] iArr = (int[]) obj3;
            int length3 = iArr.length - 1;
            int iZza3 = zzftv.zza(obj.hashCode());
            while (true) {
                int i5 = iZza3 & length3;
                int i6 = iArr[i5];
                if (i6 == -1) {
                    break;
                }
                if (obj.equals(objArr[i6])) {
                    obj2 = objArr[i6 ^ 1];
                } else {
                    iZza3 = i5 + 1;
                }
            }
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfug
    final zzfty zza() {
        return new zzfvr(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfug
    final zzfui zzf() {
        return new zzfvp(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfug
    final zzfui zzg() {
        return new zzfvq(this, new zzfvr(this.zzb, 0, this.zzd));
    }
}
