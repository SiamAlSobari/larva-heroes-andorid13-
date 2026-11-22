package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazs extends zzgrq implements zzgtb {
    private static final zzazs zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private zzgrz zze = zzaN();
    private String zzi = "";
    private String zzj = "";

    static {
        zzazs zzazsVar = new zzazs();
        zzb = zzazsVar;
        zzgrq.zzaU(zzazs.class, zzazsVar);
    }

    private zzazs() {
    }

    public static zzazo zza() {
        return (zzazo) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzazs zzazsVar, Iterable iterable) {
        zzgrz zzgrzVar = zzazsVar.zze;
        if (!zzgrzVar.zzc()) {
            zzazsVar.zze = zzgrq.zzaO(zzgrzVar);
        }
        zzgpr.zzav(iterable, zzazsVar.zze);
    }

    static /* synthetic */ void zze(zzazs zzazsVar, int i) {
        zzazsVar.zzd |= 1;
        zzazsVar.zzf = i;
    }

    static /* synthetic */ void zzf(zzazs zzazsVar, int i) {
        zzazsVar.zzd |= 2;
        zzazsVar.zzg = i;
    }

    static /* synthetic */ void zzg(zzazs zzazsVar, long j) {
        zzazsVar.zzd |= 4;
        zzazsVar.zzh = j;
    }

    static /* synthetic */ void zzh(zzazs zzazsVar, String str) {
        str.getClass();
        zzazsVar.zzd |= 8;
        zzazsVar.zzi = str;
    }

    static /* synthetic */ void zzi(zzazs zzazsVar, String str) {
        str.getClass();
        zzazsVar.zzd |= 16;
        zzazsVar.zzj = str;
    }

    static /* synthetic */ void zzj(zzazs zzazsVar, long j) {
        zzazsVar.zzd |= 32;
        zzazsVar.zzk = j;
    }

    static /* synthetic */ void zzk(zzazs zzazsVar, int i) {
        zzazsVar.zzd |= 64;
        zzazsVar.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", zzazn.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzazs();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzazo(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
