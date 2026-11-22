package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgys implements zzgzg, zzgyn {
    private static final Object zza = new Object();
    private volatile zzgzg zzb;
    private volatile Object zzc = zza;

    private zzgys(zzgzg zzgzgVar) {
        this.zzb = zzgzgVar;
    }

    public static zzgyn zza(zzgzg zzgzgVar) {
        if (zzgzgVar instanceof zzgyn) {
            return (zzgyn) zzgzgVar;
        }
        zzgzgVar.getClass();
        return new zzgys(zzgzgVar);
    }

    public static zzgzg zzc(zzgzg zzgzgVar) {
        return zzgzgVar instanceof zzgys ? zzgzgVar : new zzgys(zzgzgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Object objZzb = this.zzc;
        Object obj = zza;
        if (objZzb == obj) {
            synchronized (this) {
                objZzb = this.zzc;
                if (objZzb == obj) {
                    objZzb = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && obj2 != objZzb) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZzb + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = objZzb;
                    this.zzb = null;
                }
            }
        }
        return objZzb;
    }
}
