package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzawu extends zzcas {
    final /* synthetic */ zzaxa zza;

    zzawu(zzaxa zzaxaVar) {
        this.zza = zzaxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcas, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzaxa.zze(this.zza);
        return super.cancel(z);
    }
}
