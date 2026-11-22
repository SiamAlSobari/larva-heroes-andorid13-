package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzayi extends zzgrq implements zzgtb {
    private static final zzayi zzb;
    private int zzd;
    private String zze = "";
    private zzgrz zzf = zzaN();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzayi zzayiVar = new zzayi();
        zzb = zzayiVar;
        zzgrq.zzaU(zzayi.class, zzayiVar);
    }

    private zzayi() {
    }

    public static zzayi zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzayi zzayiVar, String str) {
        str.getClass();
        zzayiVar.zzd |= 1;
        zzayiVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgru zzgruVar = zzayr.zza;
            return zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", zzaye.class, "zzg", zzgruVar, "zzh", zzgruVar, "zzi", zzgruVar});
        }
        if (i2 == 3) {
            return new zzayi();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzayh(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
