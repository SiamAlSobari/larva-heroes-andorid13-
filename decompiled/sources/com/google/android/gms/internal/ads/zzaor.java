package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaor extends zzgrq implements zzgtb {
    private static final zzaor zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        zzaor zzaorVar = new zzaor();
        zzb = zzaorVar;
        zzgrq.zzaU(zzaor.class, zzaorVar);
    }

    private zzaor() {
    }

    public static zzaoq zza() {
        return (zzaoq) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaor zzaorVar, long j) {
        zzaorVar.zzd |= 1;
        zzaorVar.zze = j;
    }

    static /* synthetic */ void zze(zzaor zzaorVar, long j) {
        zzaorVar.zzd |= 4;
        zzaorVar.zzg = j;
    }

    static /* synthetic */ void zzf(zzaor zzaorVar, long j) {
        zzaorVar.zzd |= 8;
        zzaorVar.zzh = j;
    }

    static /* synthetic */ void zzg(zzaor zzaorVar, long j) {
        zzaorVar.zzd |= 16;
        zzaorVar.zzi = j;
    }

    static /* synthetic */ void zzh(zzaor zzaorVar, long j) {
        zzaorVar.zzd |= 32;
        zzaorVar.zzj = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzaor();
        }
        zzanu zzanuVar = null;
        if (i2 == 4) {
            return new zzaoq(zzanuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
