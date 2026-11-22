package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgxk extends zzgrq implements zzgtb {
    private static final zzgxk zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzgxk zzgxkVar = new zzgxk();
        zzb = zzgxkVar;
        zzgrq.zzaU(zzgxk.class, zzgxkVar);
    }

    private zzgxk() {
    }

    public static zzgxj zza() {
        return (zzgxj) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgxk zzgxkVar, String str) {
        zzgxkVar.zzd |= 1;
        zzgxkVar.zze = str;
    }

    static /* synthetic */ void zze(zzgxk zzgxkVar, long j) {
        zzgxkVar.zzd |= 2;
        zzgxkVar.zzf = j;
    }

    static /* synthetic */ void zzf(zzgxk zzgxkVar, boolean z) {
        zzgxkVar.zzd |= 4;
        zzgxkVar.zzg = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzgxl.zza, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzgxk();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgxj(zzgvkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
