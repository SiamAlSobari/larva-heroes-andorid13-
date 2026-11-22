package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgsh extends zzgps implements RandomAccess, zzgsi {

    @Deprecated
    public static final zzgsi zza;
    private static final zzgsh zzb;
    private final List zzc;

    static {
        zzgsh zzgshVar = new zzgsh(false);
        zzb = zzgshVar;
        zza = zzgshVar;
    }

    public zzgsh() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof zzgqi ? ((zzgqi) obj).zzx(zzgsa.zzb) : zzgsa.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbM();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzbM();
        if (collection instanceof zzgsi) {
            collection = ((zzgsi) collection).zzh();
        }
        boolean zAddAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbM();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbM();
        Object objRemove = this.zzc.remove(i);
        this.modCount++;
        return zzj(objRemove);
    }

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbM();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final /* bridge */ /* synthetic */ zzgrz zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzgsh(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzgsi
    public final zzgsi zze() {
        return zzc() ? new zzgup(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsi
    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgqi) {
            zzgqi zzgqiVar = (zzgqi) obj;
            String strZzx = zzgqiVar.zzx(zzgsa.zzb);
            if (zzgqiVar.zzp()) {
                this.zzc.set(i, strZzx);
            }
            return strZzx;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzgsa.zzd(bArr);
        if (zzguz.zzi(bArr)) {
            this.zzc.set(i, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgsi
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgsi
    public final void zzi(zzgqi zzgqiVar) {
        zzbM();
        this.zzc.add(zzgqiVar);
        this.modCount++;
    }

    public zzgsh(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.zzc = arrayList;
    }

    private zzgsh(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzgsh(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzgps, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
