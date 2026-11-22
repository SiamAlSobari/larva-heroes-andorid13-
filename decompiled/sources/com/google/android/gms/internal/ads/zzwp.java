package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwp extends zzdc {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;

    @Deprecated
    public zzwp() {
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    private final void zzv() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final /* synthetic */ zzdc zze(int i, int i2, boolean z) {
        super.zze(i, i2, true);
        return this;
    }

    public final zzwp zzo(int i, boolean z) {
        if (this.zzh.get(i) == z) {
            return this;
        }
        if (z) {
            this.zzh.put(i, true);
        } else {
            this.zzh.delete(i);
        }
        return this;
    }

    public zzwp(Context context) {
        super.zzd(context);
        Point pointZzs = zzfk.zzs(context);
        zze(pointZzs.x, pointZzs.y, true);
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    /* synthetic */ zzwp(zzwr zzwrVar, zzwo zzwoVar) {
        super(zzwrVar);
        this.zza = zzwrVar.zzH;
        this.zzb = zzwrVar.zzJ;
        this.zzc = zzwrVar.zzL;
        this.zzd = zzwrVar.zzQ;
        this.zze = zzwrVar.zzR;
        this.zzf = zzwrVar.zzT;
        SparseArray sparseArray = zzwrVar.zzam;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.zzg = sparseArray2;
        this.zzh = zzwrVar.zzan.clone();
    }
}
