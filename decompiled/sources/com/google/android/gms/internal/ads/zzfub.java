package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfub extends zzfsd {
    private final zzfud zza;

    zzfub(zzfud zzfudVar, int i) {
        super(zzfudVar.size(), i);
        this.zza = zzfudVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
