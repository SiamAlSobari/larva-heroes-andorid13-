package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgzf implements zzgzg {
    private static final Object zza = new Object();
    private volatile zzgzg zzb;
    private volatile Object zzc = zza;

    private zzgzf(zzgzg zzgzgVar) {
        this.zzb = zzgzgVar;
    }

    public static zzgzg zza(zzgzg zzgzgVar) {
        return ((zzgzgVar instanceof zzgzf) || (zzgzgVar instanceof zzgys)) ? zzgzgVar : new zzgzf(zzgzgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzgzg zzgzgVar = this.zzb;
        if (zzgzgVar == null) {
            return this.zzc;
        }
        Object objZzb = zzgzgVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
