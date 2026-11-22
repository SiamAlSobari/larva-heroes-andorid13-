package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfsa implements zzfry {
    private static final zzfry zza = new zzfry() { // from class: com.google.android.gms.internal.ads.zzfrz
        @Override // com.google.android.gms.internal.ads.zzfry
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzfry zzb;

    @CheckForNull
    private Object zzc;

    zzfsa(zzfry zzfryVar) {
        this.zzb = zzfryVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfry
    public final Object zza() {
        zzfry zzfryVar = this.zzb;
        zzfry zzfryVar2 = zza;
        if (zzfryVar != zzfryVar2) {
            synchronized (this) {
                if (this.zzb != zzfryVar2) {
                    Object objZza = this.zzb.zza();
                    this.zzc = objZza;
                    this.zzb = zzfryVar2;
                    return objZza;
                }
            }
        }
        return this.zzc;
    }
}
