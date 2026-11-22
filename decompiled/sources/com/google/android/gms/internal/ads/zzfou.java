package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfou extends zzfpn {
    private int zza;
    private String zzb;
    private byte zzc;

    zzfou() {
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final zzfpn zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final zzfpn zzb(int i) {
        this.zza = i;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final zzfpo zzc() {
        if (this.zzc == 1) {
            return new zzfow(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
