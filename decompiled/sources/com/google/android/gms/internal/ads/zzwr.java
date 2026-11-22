package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwr extends zzdd {
    public static final zzwr zzE;

    @Deprecated
    public static final zzwr zzF;
    public static final zzn zzG;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    private final SparseArray zzam;
    private final SparseBooleanArray zzan;

    static {
        zzwr zzwrVar = new zzwr(new zzwp());
        zzE = zzwrVar;
        zzF = zzwrVar;
        zzU = Integer.toString(1000, 36);
        zzV = Integer.toString(1001, 36);
        zzW = Integer.toString(1002, 36);
        zzX = Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        zzY = Integer.toString(PointerIconCompat.TYPE_WAIT, 36);
        zzZ = Integer.toString(1005, 36);
        zzaa = Integer.toString(PointerIconCompat.TYPE_CELL, 36);
        zzab = Integer.toString(PointerIconCompat.TYPE_CROSSHAIR, 36);
        zzac = Integer.toString(PointerIconCompat.TYPE_TEXT, 36);
        zzad = Integer.toString(PointerIconCompat.TYPE_VERTICAL_TEXT, 36);
        zzae = Integer.toString(PointerIconCompat.TYPE_ALIAS, 36);
        zzaf = Integer.toString(PointerIconCompat.TYPE_COPY, 36);
        zzag = Integer.toString(PointerIconCompat.TYPE_NO_DROP, 36);
        zzah = Integer.toString(PointerIconCompat.TYPE_ALL_SCROLL, 36);
        zzai = Integer.toString(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        zzaj = Integer.toString(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        zzak = Integer.toString(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
        zzal = Integer.toString(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        zzG = new zzn() { // from class: com.google.android.gms.internal.ads.zzwn
        };
    }

    private zzwr(zzwp zzwpVar) {
        super(zzwpVar);
        this.zzH = zzwpVar.zza;
        this.zzI = false;
        this.zzJ = zzwpVar.zzb;
        this.zzK = false;
        this.zzL = zzwpVar.zzc;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = zzwpVar.zzd;
        this.zzR = zzwpVar.zze;
        this.zzS = false;
        this.zzT = zzwpVar.zzf;
        this.zzam = zzwpVar.zzg;
        this.zzan = zzwpVar.zzh;
    }

    public static zzwr zzd(Context context) {
        return new zzwr(new zzwp(context));
    }

    @Override // com.google.android.gms.internal.ads.zzdd
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzwr zzwrVar = (zzwr) obj;
            if (super.equals(zzwrVar) && this.zzH == zzwrVar.zzH && this.zzJ == zzwrVar.zzJ && this.zzL == zzwrVar.zzL && this.zzQ == zzwrVar.zzQ && this.zzR == zzwrVar.zzR && this.zzT == zzwrVar.zzT) {
                SparseBooleanArray sparseBooleanArray = this.zzan;
                SparseBooleanArray sparseBooleanArray2 = zzwrVar.zzan;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.zzam;
                    SparseArray sparseArray2 = zzwrVar.zzam;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i2);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        zzvs zzvsVar = (zzvs) entry.getKey();
                                        if (!map2.containsKey(zzvsVar) || !zzfk.zzD(entry.getValue(), map2.get(zzvsVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdd
    public final int hashCode() {
        return (((((((((((((super.hashCode() + 31) * 31) + (this.zzH ? 1 : 0)) * 961) + (this.zzJ ? 1 : 0)) * 961) + (this.zzL ? 1 : 0)) * 28629151) + (this.zzQ ? 1 : 0)) * 31) + (this.zzR ? 1 : 0)) * 961) + (this.zzT ? 1 : 0)) * 31;
    }

    public final zzwp zzc() {
        return new zzwp(this, null);
    }

    @Deprecated
    public final zzwt zze(int i, zzvs zzvsVar) {
        Map map = (Map) this.zzam.get(i);
        if (map != null) {
            return (zzwt) map.get(zzvsVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzan.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzvs zzvsVar) {
        Map map = (Map) this.zzam.get(i);
        return map != null && map.containsKey(zzvsVar);
    }
}
