package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdin {
    public static final zzdin zza = new zzdin(new zzdil());
    private final zzbfx zzb;
    private final zzbfu zzc;
    private final zzbgk zzd;
    private final zzbgh zze;
    private final zzblj zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdin(zzdil zzdilVar) {
        this.zzb = zzdilVar.zza;
        this.zzc = zzdilVar.zzb;
        this.zzd = zzdilVar.zzc;
        this.zzg = new SimpleArrayMap(zzdilVar.zzf);
        this.zzh = new SimpleArrayMap(zzdilVar.zzg);
        this.zze = zzdilVar.zzd;
        this.zzf = zzdilVar.zze;
    }

    public final zzbfu zza() {
        return this.zzc;
    }

    public final zzbfx zzb() {
        return this.zzb;
    }

    public final zzbga zzc(String str) {
        return (zzbga) this.zzh.get(str);
    }

    public final zzbgd zzd(String str) {
        return (zzbgd) this.zzg.get(str);
    }

    public final zzbgh zze() {
        return this.zze;
    }

    public final zzbgk zzf() {
        return this.zzd;
    }

    public final zzblj zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add((String) this.zzg.keyAt(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
