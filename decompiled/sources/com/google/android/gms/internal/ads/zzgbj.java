package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbj {
    public static final zzgbj zza = new zzgbj("SHA1");
    public static final zzgbj zzb = new zzgbj("SHA224");
    public static final zzgbj zzc = new zzgbj("SHA256");
    public static final zzgbj zzd = new zzgbj("SHA384");
    public static final zzgbj zze = new zzgbj("SHA512");
    private final String zzf;

    private zzgbj(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
