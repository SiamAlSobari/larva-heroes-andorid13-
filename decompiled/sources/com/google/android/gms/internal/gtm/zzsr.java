package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsr extends zzsn {
    private final zzst zza;

    zzsr(zzst zzstVar, int i) {
        super(zzstVar.size(), i);
        this.zza = zzstVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzsn
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
