package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxd extends zzxi implements zzlo {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfvm zzc = zzfvm.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzxd.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    private static final zzfvm zzd = zzfvm.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwk
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = zzxd.zzb;
            return 0;
        }
    });
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    private zzwr zzg;
    private zzww zzh;
    private zzk zzi;
    private final zzvy zzj;

    public zzxd(Context context) {
        zzvy zzvyVar = new zzvy();
        zzwr zzwrVarZzd = zzwr.zzd(context);
        this.zze = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzvyVar;
        this.zzg = zzwrVarZzd;
        this.zzi = zzk.zza;
        boolean z = false;
        if (context != null && zzfk.zzF(context)) {
            z = true;
        }
        this.zzf = z;
        if (!z && context != null && zzfk.zza >= 32) {
            this.zzh = zzww.zza(context);
        }
        if (this.zzg.zzQ && context == null) {
            zzes.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static int zza(zzam zzamVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzamVar.zzd)) {
            return 4;
        }
        String strZzg = zzg(str);
        String strZzg2 = zzg(zzamVar.zzd);
        if (strZzg2 == null || strZzg == null) {
            return (z && strZzg2 == null) ? 1 : 0;
        }
        if (strZzg2.startsWith(strZzg) || strZzg.startsWith(strZzg2)) {
            return 3;
        }
        int i = zzfk.zza;
        return strZzg2.split("-", 2)[0].equals(strZzg.split("-", 2)[0]) ? 2 : 0;
    }

    protected static String zzg(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    public static /* synthetic */ boolean zzl(zzxd zzxdVar, zzam zzamVar) {
        boolean z;
        byte b;
        zzww zzwwVar;
        zzww zzwwVar2;
        synchronized (zzxdVar.zze) {
            z = true;
            if (zzxdVar.zzg.zzQ && !zzxdVar.zzf && zzamVar.zzz > 2) {
                String str = zzamVar.zzm;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                            b = 2;
                            break;
                        case "audio/ac3":
                            b = 0;
                            break;
                        case "audio/ac4":
                            b = 3;
                            break;
                        case "audio/eac3":
                            b = 1;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if ((b != 0 && b != 1 && b != 2 && b != 3) || (zzfk.zza >= 32 && (zzwwVar = zzxdVar.zzh) != null && zzwwVar.zzg())) {
                    }
                }
                if (zzfk.zza < 32 || (zzwwVar2 = zzxdVar.zzh) == null || !zzwwVar2.zzg() || !zzwwVar2.zze() || !zzxdVar.zzh.zzf() || !zzxdVar.zzh.zzd(zzxdVar.zzi, zzamVar)) {
                    z = false;
                }
            }
        }
        return z;
    }

    protected static boolean zzn(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    private static void zzt(zzvs zzvsVar, zzdd zzddVar, Map map) {
        for (int i = 0; i < zzvsVar.zzc; i++) {
            if (((zzda) zzddVar.zzC.get(zzvsVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z;
        zzww zzwwVar;
        synchronized (this.zze) {
            z = false;
            if (this.zzg.zzQ && !this.zzf && zzfk.zza >= 32 && (zzwwVar = this.zzh) != null && zzwwVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzs();
        }
    }

    private static final Pair zzv(int i, zzxh zzxhVar, int[][][] iArr, zzwy zzwyVar, Comparator comparator) {
        RandomAccess randomAccessZzm;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == zzxhVar.zzc(i2)) {
                zzvs zzvsVarZzd = zzxhVar.zzd(i2);
                for (int i3 = 0; i3 < zzvsVarZzd.zzc; i3++) {
                    zzcy zzcyVarZzb = zzvsVarZzd.zzb(i3);
                    List listZza = zzwyVar.zza(i2, zzcyVarZzb, iArr[i2][i3]);
                    int i4 = zzcyVarZzb.zzb;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (true) {
                        int i7 = zzcyVarZzb.zzb;
                        if (i6 <= 0) {
                            zzwz zzwzVar = (zzwz) listZza.get(i6);
                            int iZzb = zzwzVar.zzb();
                            if (!zArr[i6] && iZzb != 0) {
                                if (iZzb == i5) {
                                    randomAccessZzm = zzfud.zzm(zzwzVar);
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(zzwzVar);
                                    int i8 = i6 + 1;
                                    while (true) {
                                        int i9 = zzcyVarZzb.zzb;
                                        if (i8 > 0) {
                                            break;
                                        }
                                        zzwz zzwzVar2 = (zzwz) listZza.get(i8);
                                        if (zzwzVar2.zzb() == 2 && zzwzVar.zzc(zzwzVar2)) {
                                            arrayList2.add(zzwzVar2);
                                            zArr[i8] = true;
                                        }
                                        i8++;
                                    }
                                    randomAccessZzm = arrayList2;
                                }
                                arrayList.add(randomAccessZzm);
                            }
                            i6++;
                            i5 = 1;
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((zzwz) list.get(i10)).zzc;
        }
        zzwz zzwzVar3 = (zzwz) list.get(0);
        return Pair.create(new zzxe(zzwzVar3.zzb, iArr2, 0), Integer.valueOf(zzwzVar3.zza));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxi
    protected final Pair zzb(zzxh zzxhVar, int[][][] iArr, final int[] iArr2, zzts zztsVar, zzcw zzcwVar) throws zzil {
        final zzwr zzwrVar;
        int i;
        final boolean z;
        int[] iArr3;
        int length;
        zzww zzwwVar;
        int[][][] iArr4 = iArr;
        synchronized (this.zze) {
            zzwrVar = this.zzg;
            if (zzwrVar.zzQ && zzfk.zza >= 32 && (zzwwVar = this.zzh) != null) {
                Looper looperMyLooper = Looper.myLooper();
                zzdy.zzb(looperMyLooper);
                zzwwVar.zzb(this, looperMyLooper);
            }
        }
        int i2 = 2;
        zzxe[] zzxeVarArr = new zzxe[2];
        int i3 = zzwrVar.zzv;
        Pair pairZzv = zzv(2, zzxhVar, iArr4, new zzwy() { // from class: com.google.android.gms.internal.ads.zzwf
            /* JADX WARN: Code duplicated, block: B:22:0x0040  */
            @Override // com.google.android.gms.internal.ads.zzwy
            public final List zza(int i4, zzcy zzcyVar, int[] iArr5) {
                int i5;
                int i6;
                int i7;
                Point point;
                zzwr zzwrVar2 = zzwrVar;
                int[] iArr6 = iArr2;
                int i8 = zzxd.zzb;
                int i9 = iArr6[i4];
                int i10 = zzwrVar2.zzl;
                int i11 = zzwrVar2.zzm;
                boolean z2 = zzwrVar2.zzn;
                int i12 = Integer.MAX_VALUE;
                if (i10 == Integer.MAX_VALUE) {
                    i12 = Integer.MAX_VALUE;
                } else if (i11 != Integer.MAX_VALUE) {
                    int i13 = 0;
                    int i14 = Integer.MAX_VALUE;
                    while (true) {
                        int i15 = zzcyVar.zzb;
                        if (i13 > 0) {
                            break;
                        }
                        zzam zzamVarZzb = zzcyVar.zzb(i13);
                        int i16 = zzamVarZzb.zzr;
                        if (i16 > 0 && (i5 = zzamVarZzb.zzs) > 0) {
                            if (z2) {
                                if ((i16 > i5) != (i10 > i11)) {
                                    i7 = i10;
                                    i6 = i11;
                                } else {
                                    i6 = i10;
                                    i7 = i11;
                                }
                            } else {
                                i6 = i10;
                                i7 = i11;
                            }
                            int i17 = i16 * i7;
                            int i18 = i5 * i6;
                            if (i17 >= i18) {
                                int i19 = zzfk.zza;
                                point = new Point(i6, ((i18 + i16) - 1) / i16);
                            } else {
                                int i20 = zzfk.zza;
                                point = new Point(((i17 + i5) - 1) / i5, i7);
                            }
                            int i21 = zzamVarZzb.zzr;
                            int i22 = zzamVarZzb.zzs * i21;
                            if (i21 >= ((int) (point.x * 0.98f)) && zzamVarZzb.zzs >= ((int) (point.y * 0.98f)) && i22 < i14) {
                                i14 = i22;
                            }
                        }
                        i13++;
                    }
                    i12 = i14;
                }
                zzfua zzfuaVar = new zzfua();
                int i23 = 0;
                while (true) {
                    int i24 = zzcyVar.zzb;
                    if (i23 > 0) {
                        return zzfuaVar.zzi();
                    }
                    int iZza = zzcyVar.zzb(i23).zza();
                    zzfuaVar.zzf(new zzxc(i4, zzcyVar, i23, zzwrVar2, iArr5[i23], i9, i12 == Integer.MAX_VALUE || (iZza != -1 && iZza <= i12)));
                    i23++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzfts.zzj().zzc((zzxc) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxa
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxc.zzd((zzxc) obj3, (zzxc) obj4);
                    }
                }), (zzxc) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxa
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxc.zzd((zzxc) obj3, (zzxc) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxa
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxc.zzd((zzxc) obj3, (zzxc) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzxc) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxb
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxc.zza((zzxc) obj3, (zzxc) obj4);
                    }
                }), (zzxc) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxb
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxc.zza((zzxc) obj3, (zzxc) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxb
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxc.zza((zzxc) obj3, (zzxc) obj4);
                    }
                }).zza();
            }
        });
        if (pairZzv != null) {
            zzxeVarArr[((Integer) pairZzv.second).intValue()] = (zzxe) pairZzv.first;
        }
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            }
            if (zzxhVar.zzc(i4) == 2 && zzxhVar.zzd(i4).zzc > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair pairZzv2 = zzv(1, zzxhVar, iArr4, new zzwy() { // from class: com.google.android.gms.internal.ads.zzwd
            @Override // com.google.android.gms.internal.ads.zzwy
            public final List zza(int i5, zzcy zzcyVar, int[] iArr5) {
                final zzxd zzxdVar = this.zza;
                zzwr zzwrVar2 = zzwrVar;
                boolean z2 = z;
                zzfrj zzfrjVar = new zzfrj() { // from class: com.google.android.gms.internal.ads.zzwc
                    @Override // com.google.android.gms.internal.ads.zzfrj
                    public final boolean zza(Object obj) {
                        return zzxd.zzl(zzxdVar, (zzam) obj);
                    }
                };
                zzfua zzfuaVar = new zzfua();
                int i6 = 0;
                while (true) {
                    int i7 = zzcyVar.zzb;
                    if (i6 > 0) {
                        return zzfuaVar.zzi();
                    }
                    zzfuaVar.zzf(new zzwl(i5, zzcyVar, i6, zzwrVar2, iArr5[i6], z2, zzfrjVar));
                    i6++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwe
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzwl) Collections.max((List) obj)).zza((zzwl) Collections.max((List) obj2));
            }
        });
        if (pairZzv2 != null) {
            zzxeVarArr[((Integer) pairZzv2.second).intValue()] = (zzxe) pairZzv2.first;
        }
        final String str = pairZzv2 == null ? null : ((zzxe) pairZzv2.first).zza.zzb(((zzxe) pairZzv2.first).zzb[0]).zzd;
        int i5 = zzwrVar.zzv;
        int i6 = 3;
        Pair pairZzv3 = zzv(3, zzxhVar, iArr4, new zzwy() { // from class: com.google.android.gms.internal.ads.zzwh
            @Override // com.google.android.gms.internal.ads.zzwy
            public final List zza(int i7, zzcy zzcyVar, int[] iArr5) {
                zzwr zzwrVar2 = zzwrVar;
                String str2 = str;
                int i8 = zzxd.zzb;
                zzfua zzfuaVar = new zzfua();
                int i9 = 0;
                while (true) {
                    int i10 = zzcyVar.zzb;
                    if (i9 > 0) {
                        return zzfuaVar.zzi();
                    }
                    zzfuaVar.zzf(new zzwx(i7, zzcyVar, i9, zzwrVar2, iArr5[i9], str2));
                    i9++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzwx) ((List) obj).get(0)).zza((zzwx) ((List) obj2).get(0));
            }
        });
        if (pairZzv3 != null) {
            zzxeVarArr[((Integer) pairZzv3.second).intValue()] = (zzxe) pairZzv3.first;
        }
        int i7 = 0;
        while (i7 < i2) {
            int iZzc = zzxhVar.zzc(i7);
            if (iZzc != i2 && iZzc != i && iZzc != i6) {
                zzvs zzvsVarZzd = zzxhVar.zzd(i7);
                int[][] iArr5 = iArr4[i7];
                int i8 = zzwrVar.zzv;
                int i9 = 0;
                zzcy zzcyVar = null;
                int i10 = 0;
                zzwm zzwmVar = null;
                while (i9 < zzvsVarZzd.zzc) {
                    zzcy zzcyVarZzb = zzvsVarZzd.zzb(i9);
                    int[] iArr6 = iArr5[i9];
                    zzwm zzwmVar2 = zzwmVar;
                    int i11 = 0;
                    while (true) {
                        int i12 = zzcyVarZzb.zzb;
                        if (i11 <= 0) {
                            if (zzn(iArr6[i11], zzwrVar.zzR)) {
                                zzwm zzwmVar3 = new zzwm(zzcyVarZzb.zzb(i11), iArr6[i11]);
                                if (zzwmVar2 == null || zzwmVar3.compareTo(zzwmVar2) > 0) {
                                    zzwmVar2 = zzwmVar3;
                                    i10 = i11;
                                    zzcyVar = zzcyVarZzb;
                                }
                            }
                            i11++;
                        }
                    }
                    i9++;
                    zzwmVar = zzwmVar2;
                }
                zzxeVarArr[i7] = zzcyVar == null ? null : new zzxe(zzcyVar, new int[]{i10}, 0);
            }
            i7++;
            iArr4 = iArr;
            i2 = 2;
            i = 1;
            i6 = 3;
        }
        HashMap map = new HashMap();
        for (int i13 = 0; i13 < 2; i13++) {
            zzt(zzxhVar.zzd(i13), zzwrVar, map);
        }
        zzt(zzxhVar.zze(), zzwrVar, map);
        for (int i14 = 0; i14 < 2; i14++) {
            if (((zzda) map.get(Integer.valueOf(zzxhVar.zzc(i14)))) != null) {
                throw null;
            }
        }
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            zzvs zzvsVarZzd2 = zzxhVar.zzd(i15);
            if (zzwrVar.zzg(i15, zzvsVarZzd2)) {
                if (zzwrVar.zze(i15, zzvsVarZzd2) != null) {
                    throw null;
                }
                zzxeVarArr[i15] = null;
            }
            i15++;
        }
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            int iZzc2 = zzxhVar.zzc(i17);
            if (zzwrVar.zzf(i17) || zzwrVar.zzD.contains(Integer.valueOf(iZzc2))) {
                zzxeVarArr[i17] = null;
            }
            i17++;
        }
        zzvy zzvyVar = this.zzj;
        zzxt zzxtVarZzq = zzq();
        zzfud zzfudVarZzf = zzvz.zzf(zzxeVarArr);
        int i19 = 2;
        zzxf[] zzxfVarArr = new zzxf[2];
        int i20 = 0;
        while (i20 < i19) {
            zzxe zzxeVar = zzxeVarArr[i20];
            if (zzxeVar != null && (length = (iArr3 = zzxeVar.zzb).length) != 0) {
                zzxfVarArr[i20] = length == 1 ? new zzxg(zzxeVar.zza, iArr3[0], 0, 0, null) : zzvyVar.zza(zzxeVar.zza, iArr3, 0, zzxtVarZzq, (zzfud) zzfudVarZzf.get(i20));
            }
            i20++;
            i19 = 2;
        }
        zzlq[] zzlqVarArr = new zzlq[i19];
        for (int i21 = 0; i21 < i19; i21++) {
            zzlqVarArr[i21] = (zzwrVar.zzf(i21) || zzwrVar.zzD.contains(Integer.valueOf(zzxhVar.zzc(i21))) || (zzxhVar.zzc(i21) != -2 && zzxfVarArr[i21] == null)) ? null : zzlq.zza;
        }
        boolean z2 = zzwrVar.zzS;
        int i22 = zzwrVar.zzv;
        return Pair.create(zzlqVarArr, zzxfVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final zzlo zzc() {
        return this;
    }

    public final zzwr zzd() {
        zzwr zzwrVar;
        synchronized (this.zze) {
            zzwrVar = this.zzg;
        }
        return zzwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zzi() {
        zzww zzwwVar;
        synchronized (this.zze) {
            if (zzfk.zza >= 32 && (zzwwVar = this.zzh) != null) {
                zzwwVar.zzc();
            }
        }
        super.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zzj(zzk zzkVar) {
        boolean z;
        synchronized (this.zze) {
            z = !this.zzi.equals(zzkVar);
            this.zzi = zzkVar;
        }
        if (z) {
            zzu();
        }
    }

    public final void zzk(zzwp zzwpVar) {
        boolean z;
        zzwr zzwrVar = new zzwr(zzwpVar);
        synchronized (this.zze) {
            z = !this.zzg.equals(zzwrVar);
            this.zzg = zzwrVar;
        }
        if (z) {
            if (zzwrVar.zzQ && this.zza == null) {
                zzes.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final boolean zzm() {
        return true;
    }
}
