package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbbo implements zzbdz {
    final /* synthetic */ zzbbp zza;

    zzbbo(zzbbp zzbbpVar) {
        this.zza = zzbbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdz
    public final Boolean zza(String str, boolean z) {
        try {
            return Boolean.valueOf(this.zza.zze.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.zze.getString(str, String.valueOf(z)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdz
    public final Double zzb(String str, double d) {
        try {
            return Double.valueOf(this.zza.zze.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.zze.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdz
    public final Long zzc(String str, long j) {
        try {
            return Long.valueOf(this.zza.zze.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.zze.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdz
    public final String zzd(String str, String str2) {
        return this.zza.zze.getString(str, str2);
    }
}
