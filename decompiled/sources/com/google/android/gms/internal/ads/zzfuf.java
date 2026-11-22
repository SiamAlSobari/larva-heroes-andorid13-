package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfuf {
    Object[] zza;
    int zzb;
    zzfue zzc;

    public zzfuf() {
        this(4);
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzftx.zze(length, i2));
        }
    }

    public final zzfuf zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfta.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfuf zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfug zzc() {
        zzfue zzfueVar = this.zzc;
        if (zzfueVar != null) {
            throw zzfueVar.zza();
        }
        zzfvs zzfvsVarZzj = zzfvs.zzj(this.zzb, this.zza, this);
        zzfue zzfueVar2 = this.zzc;
        if (zzfueVar2 == null) {
            return zzfvsVarZzj;
        }
        throw zzfueVar2.zza();
    }

    zzfuf(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
