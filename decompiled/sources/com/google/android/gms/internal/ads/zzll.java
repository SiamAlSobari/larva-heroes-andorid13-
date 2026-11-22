package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzll extends zzhu {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzcw[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzll(Collection collection, zzvm zzvmVar) {
        zzcw[] zzcwVarArr = new zzcw[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzcwVarArr[i2] = ((zzku) it.next()).zza();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zzku) it2.next()).zzb();
            i++;
        }
        this(zzcwVarArr, objArr, zzvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final int zzq(int i) {
        return zzfk.zzb(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final int zzr(int i) {
        return zzfk.zzb(this.zzg, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final int zzs(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final int zzt(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final zzcw zzu(int i) {
        return this.zzh[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final Object zzv(int i) {
        return this.zzi[i];
    }

    final List zzw() {
        return Arrays.asList(this.zzh);
    }

    public final zzll zzx(zzvm zzvmVar) {
        zzcw[] zzcwVarArr = new zzcw[this.zzh.length];
        int i = 0;
        while (true) {
            zzcw[] zzcwVarArr2 = this.zzh;
            if (i >= zzcwVarArr2.length) {
                return new zzll(zzcwVarArr, this.zzi, zzvmVar);
            }
            zzcwVarArr[i] = new zzlk(this, zzcwVarArr2[i]);
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzll(zzcw[] zzcwVarArr, Object[] objArr, zzvm zzvmVar) {
        super(false, zzvmVar);
        int i = 0;
        this.zzh = zzcwVarArr;
        int length = zzcwVarArr.length;
        this.zzf = new int[length];
        this.zzg = new int[length];
        this.zzi = objArr;
        this.zzj = new HashMap();
        int iZzc = 0;
        int iZzb = 0;
        int i2 = 0;
        while (i < zzcwVarArr.length) {
            zzcw zzcwVar = zzcwVarArr[i];
            this.zzh[i2] = zzcwVar;
            this.zzg[i2] = iZzc;
            this.zzf[i2] = iZzb;
            iZzc += zzcwVar.zzc();
            iZzb += this.zzh[i2].zzb();
            this.zzj.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.zzd = iZzc;
        this.zze = iZzb;
    }
}
