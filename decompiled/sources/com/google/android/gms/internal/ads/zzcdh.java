package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcdh extends zzamx {
    static final zzcdh zzb = new zzcdh();

    zzcdh() {
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final zzanb zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzand();
        }
        return "mvhd".equals(str) ? new zzane() : new zzanf(str);
    }
}
