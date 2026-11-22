package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfrn extends zzfre {
    private final Object zza;

    zzfrn(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfrn) {
            return this.zza.equals(((zzfrn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final zzfre zza(zzfqw zzfqwVar) {
        Object objApply = zzfqwVar.apply(this.zza);
        zzfri.zzc(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzfrn(objApply);
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
