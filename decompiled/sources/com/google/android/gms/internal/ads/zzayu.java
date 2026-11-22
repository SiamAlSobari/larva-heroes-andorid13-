package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzayu extends zzgrq implements zzgtb {
    private static final zzayu zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private zzbae zzi;
    private zzaym zzk;
    private zzayp zzl;
    private zzazi zzm;
    private zzaxq zzn;
    private zzazs zzo;
    private zzbaz zzp;
    private zzaxz zzq;
    private String zzf = "";
    private int zzh = 1000;
    private zzgry zzj = zzaL();

    static {
        zzayu zzayuVar = new zzayu();
        zzb = zzayuVar;
        zzgrq.zzaU(zzayu.class, zzayuVar);
    }

    private zzayu() {
    }

    public static zzayt zzd() {
        return (zzayt) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzayu zzayuVar, String str) {
        str.getClass();
        zzayuVar.zzd |= 2;
        zzayuVar.zzf = str;
    }

    static /* synthetic */ void zzh(zzayu zzayuVar, Iterable iterable) {
        zzgry zzgryVar = zzayuVar.zzj;
        if (!zzgryVar.zzc()) {
            zzayuVar.zzj = zzgrq.zzaM(zzgryVar);
        }
        zzgpr.zzav(iterable, zzayuVar.zzj);
    }

    static /* synthetic */ void zzj(zzayu zzayuVar, zzaym zzaymVar) {
        zzaymVar.getClass();
        zzayuVar.zzk = zzaymVar;
        zzayuVar.zzd |= 32;
    }

    static /* synthetic */ void zzk(zzayu zzayuVar, zzaxq zzaxqVar) {
        zzaxqVar.getClass();
        zzayuVar.zzn = zzaxqVar;
        zzayuVar.zzd |= 256;
    }

    static /* synthetic */ void zzl(zzayu zzayuVar, zzazs zzazsVar) {
        zzazsVar.getClass();
        zzayuVar.zzo = zzazsVar;
        zzayuVar.zzd |= 512;
    }

    static /* synthetic */ void zzm(zzayu zzayuVar, zzbaz zzbazVar) {
        zzbazVar.getClass();
        zzayuVar.zzp = zzbazVar;
        zzayuVar.zzd |= 1024;
    }

    static /* synthetic */ void zzn(zzayu zzayuVar, zzaxz zzaxzVar) {
        zzaxzVar.getClass();
        zzayuVar.zzq = zzaxzVar;
        zzayuVar.zzd |= 2048;
    }

    public final zzaxq zza() {
        zzaxq zzaxqVar = this.zzn;
        return zzaxqVar == null ? zzaxq.zzc() : zzaxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzayr.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new zzayu();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzayt(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaym zzc() {
        zzaym zzaymVar = this.zzk;
        return zzaymVar == null ? zzaym.zzc() : zzaymVar;
    }

    public final String zzf() {
        return this.zzf;
    }
}
