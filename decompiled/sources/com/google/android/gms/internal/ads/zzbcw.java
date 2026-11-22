package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzbcw {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbcw(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbcw zza(String str, double d) {
        return new zzbcw(str, Double.valueOf(d), 3);
    }

    public static zzbcw zzb(String str, long j) {
        return new zzbcw(str, Long.valueOf(j), 2);
    }

    public static zzbcw zzc(String str, String str2) {
        return new zzbcw(str, str2, 4);
    }

    public static zzbcw zzd(String str, boolean z) {
        return new zzbcw(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbdz zzbdzVarZza = zzbeb.zza();
        if (zzbdzVarZza == null) {
            if (zzbeb.zzb() != null) {
                zzbeb.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i == 0) {
            return zzbdzVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i != 1) {
            return i != 2 ? zzbdzVarZza.zzd(this.zza, (String) this.zzb) : zzbdzVarZza.zzb(this.zza, ((Double) this.zzb).doubleValue());
        }
        return zzbdzVarZza.zzc(this.zza, ((Long) this.zzb).longValue());
    }
}
