package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzanl extends zzgrq implements zzgtb {
    private static final zzanl zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private zzgrz zzp = zzaN();

    static {
        zzanl zzanlVar = new zzanl();
        zzb = zzanlVar;
        zzgrq.zzaU(zzanl.class, zzanlVar);
    }

    private zzanl() {
    }

    public static zzanh zza() {
        return (zzanh) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzanl zzanlVar, long j) {
        zzanlVar.zzd |= 2;
        zzanlVar.zzf = j;
    }

    static /* synthetic */ void zze(zzanl zzanlVar, String str) {
        str.getClass();
        zzanlVar.zzd |= 4;
        zzanlVar.zzg = str;
    }

    static /* synthetic */ void zzf(zzanl zzanlVar, String str) {
        str.getClass();
        zzanlVar.zzd |= 8;
        zzanlVar.zzh = str;
    }

    static /* synthetic */ void zzg(zzanl zzanlVar, String str) {
        zzanlVar.zzd |= 16;
        zzanlVar.zzi = str;
    }

    static /* synthetic */ void zzh(zzanl zzanlVar, String str) {
        zzanlVar.zzd |= 1024;
        zzanlVar.zzo = str;
    }

    static /* synthetic */ void zzi(zzanl zzanlVar, String str) {
        str.getClass();
        zzanlVar.zzd |= 1;
        zzanlVar.zze = str;
    }

    static /* synthetic */ void zzj(zzanl zzanlVar, int i) {
        zzanlVar.zzq = i - 1;
        zzanlVar.zzd |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzanj.class, "zzq", zzank.zza});
        }
        if (i2 == 3) {
            return new zzanl();
        }
        zzang zzangVar = null;
        if (i2 == 4) {
            return new zzanh(zzangVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
