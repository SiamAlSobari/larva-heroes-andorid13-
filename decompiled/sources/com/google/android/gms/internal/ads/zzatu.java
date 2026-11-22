package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzatu extends zzgrq implements zzgtb {
    private static final zzatu zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzatu zzatuVar = new zzatu();
        zzb = zzatuVar;
        zzgrq.zzaU(zzatu.class, zzatuVar);
    }

    private zzatu() {
    }

    public static zzatt zze() {
        return (zzatt) zzb.zzaA();
    }

    public static zzatu zzg() {
        return zzb;
    }

    public static zzatu zzh(zzgqi zzgqiVar) throws zzgsc {
        return (zzatu) zzgrq.zzaE(zzb, zzgqiVar);
    }

    public static zzatu zzi(zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        return (zzatu) zzgrq.zzaG(zzb, zzgqiVar, zzgrcVar);
    }

    static /* synthetic */ void zzl(zzatu zzatuVar, String str) {
        str.getClass();
        zzatuVar.zzd |= 1;
        zzatuVar.zze = str;
    }

    static /* synthetic */ void zzm(zzatu zzatuVar, long j) {
        zzatuVar.zzd |= 16;
        zzatuVar.zzi = j;
    }

    static /* synthetic */ void zzn(zzatu zzatuVar, String str) {
        str.getClass();
        zzatuVar.zzd |= 2;
        zzatuVar.zzf = str;
    }

    static /* synthetic */ void zzo(zzatu zzatuVar, long j) {
        zzatuVar.zzd |= 4;
        zzatuVar.zzg = j;
    }

    static /* synthetic */ void zzp(zzatu zzatuVar, long j) {
        zzatuVar.zzd |= 8;
        zzatuVar.zzh = j;
    }

    public final long zza() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzatu();
        }
        zzats zzatsVar = null;
        if (i2 == 4) {
            return new zzatt(zzatsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}
