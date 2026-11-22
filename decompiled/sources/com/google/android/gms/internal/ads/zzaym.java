package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaym extends zzgrq implements zzgtb {
    private static final zzaym zzb;
    private int zzd;
    private zzbac zzf;
    private int zzg;
    private zzbae zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        zzaym zzaymVar = new zzaym();
        zzb = zzaymVar;
        zzgrq.zzaU(zzaym.class, zzaymVar);
    }

    private zzaym() {
    }

    public static zzaym zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzaym zzaymVar, String str) {
        zzaymVar.zzd |= 1;
        zzaymVar.zze = str;
    }

    static /* synthetic */ void zze(zzaym zzaymVar, zzbae zzbaeVar) {
        zzbaeVar.getClass();
        zzaymVar.zzh = zzbaeVar;
        zzaymVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgru zzgruVar = zzayr.zza;
            return zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgruVar, "zzk", zzgruVar, "zzl", zzgruVar});
        }
        if (i2 == 3) {
            return new zzaym();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzayl(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
