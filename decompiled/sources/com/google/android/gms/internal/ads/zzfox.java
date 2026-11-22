package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfox extends zzfpq {
    private String zza;
    private String zzb;

    zzfox() {
    }

    @Override // com.google.android.gms.internal.ads.zzfpq
    public final zzfpq zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpq
    public final zzfpq zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpq
    public final zzfpr zzc() {
        return new zzfoz(this.zza, this.zzb, null);
    }
}
