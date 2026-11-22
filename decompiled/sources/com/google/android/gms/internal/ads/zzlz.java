package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlz {
    private final zzah zza;
    private final SparseArray zzb;

    public zzlz(zzah zzahVar, SparseArray sparseArray) {
        this.zza = zzahVar;
        SparseArray sparseArray2 = new SparseArray(zzahVar.zzb());
        for (int i = 0; i < zzahVar.zzb(); i++) {
            int iZza = zzahVar.zza(i);
            zzly zzlyVar = (zzly) sparseArray.get(iZza);
            zzlyVar.getClass();
            sparseArray2.append(iZza, zzlyVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzly zzc(int i) {
        zzly zzlyVar = (zzly) this.zzb.get(i);
        zzlyVar.getClass();
        return zzlyVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
