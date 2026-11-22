package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zztx extends zzua {
    private final int zzc;

    zztx(byte[] bArr, int i, int i2) {
        super(bArr);
        zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.gtm.zzua
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzua, com.google.android.gms.internal.gtm.zzud
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }
}
