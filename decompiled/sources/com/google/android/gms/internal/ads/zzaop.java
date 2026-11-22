package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaop extends zzgrq implements zzgtb {
    private static final zzaop zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzaop zzaopVar = new zzaop();
        zzb = zzaopVar;
        zzgrq.zzaU(zzaop.class, zzaopVar);
    }

    private zzaop() {
    }

    public static zzaoo zza() {
        return (zzaoo) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 1;
        zzaopVar.zze = j;
    }

    static /* synthetic */ void zze(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 2;
        zzaopVar.zzf = j;
    }

    static /* synthetic */ void zzf(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 4;
        zzaopVar.zzg = j;
    }

    static /* synthetic */ void zzg(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 8;
        zzaopVar.zzh = j;
    }

    static /* synthetic */ void zzh(zzaop zzaopVar) {
        zzaopVar.zzd &= -9;
        zzaopVar.zzh = -1L;
    }

    static /* synthetic */ void zzi(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 16;
        zzaopVar.zzi = j;
    }

    static /* synthetic */ void zzj(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 32;
        zzaopVar.zzj = j;
    }

    static /* synthetic */ void zzk(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 128;
        zzaopVar.zzl = j;
    }

    static /* synthetic */ void zzl(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 256;
        zzaopVar.zzm = j;
    }

    static /* synthetic */ void zzm(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 512;
        zzaopVar.zzn = j;
    }

    static /* synthetic */ void zzn(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 2048;
        zzaopVar.zzp = j;
    }

    static /* synthetic */ void zzo(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 4096;
        zzaopVar.zzq = j;
    }

    static /* synthetic */ void zzp(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 8192;
        zzaopVar.zzr = j;
    }

    static /* synthetic */ void zzq(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 16384;
        zzaopVar.zzs = j;
    }

    static /* synthetic */ void zzr(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 32768;
        zzaopVar.zzt = j;
    }

    static /* synthetic */ void zzs(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 65536;
        zzaopVar.zzu = j;
    }

    static /* synthetic */ void zzt(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 131072;
        zzaopVar.zzv = j;
    }

    static /* synthetic */ void zzu(zzaop zzaopVar, long j) {
        zzaopVar.zzd |= 262144;
        zzaopVar.zzw = j;
    }

    static /* synthetic */ void zzv(zzaop zzaopVar, int i) {
        zzaopVar.zzk = i - 1;
        zzaopVar.zzd |= 64;
    }

    static /* synthetic */ void zzw(zzaop zzaopVar, int i) {
        zzaopVar.zzo = i - 1;
        zzaopVar.zzd |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgru zzgruVar = zzaoy.zza;
            return zzaR(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgruVar, "zzl", "zzm", "zzn", "zzo", zzgruVar, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new zzaop();
        }
        zzanu zzanuVar = null;
        if (i2 == 4) {
            return new zzaoo(zzanuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
