package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgxp extends zzgrq implements zzgtb {
    private static final zzgxp zzb;
    private zzgwa zzB;
    private zzgvs zzD;
    private zzgwt zzF;
    private int zzG;
    private int zzd;
    private int zze;
    private int zzf;
    private zzgvw zzj;
    private zzgxc zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private zzgxk zzu;
    private boolean zzv;
    private zzgxo zzz;
    private byte zzJ = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzgrz zzk = zzaN();
    private zzgrz zzl = zzaN();
    private String zzm = "";
    private zzgrz zzp = zzgrq.zzaN();
    private String zzq = "";
    private zzgqi zzt = zzgqi.zzb;
    private String zzw = "";
    private zzgrz zzx = zzgrq.zzaN();
    private zzgrz zzy = zzgrq.zzaN();
    private zzgrz zzA = zzaN();
    private String zzC = "";
    private zzgrz zzE = zzaN();
    private zzgrz zzH = zzaN();
    private zzgrz zzI = zzaN();

    static {
        zzgxp zzgxpVar = new zzgxp();
        zzb = zzgxpVar;
        zzgrq.zzaU(zzgxp.class, zzgxpVar);
    }

    private zzgxp() {
    }

    public static zzgvu zza() {
        return (zzgvu) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzgxp zzgxpVar, String str) {
        str.getClass();
        zzgxpVar.zzd |= 4;
        zzgxpVar.zzg = str;
    }

    static /* synthetic */ void zzh(zzgxp zzgxpVar, String str) {
        str.getClass();
        zzgxpVar.zzd |= 8;
        zzgxpVar.zzh = str;
    }

    static /* synthetic */ void zzi(zzgxp zzgxpVar, zzgvw zzgvwVar) {
        zzgvwVar.getClass();
        zzgxpVar.zzj = zzgvwVar;
        zzgxpVar.zzd |= 32;
    }

    static /* synthetic */ void zzj(zzgxp zzgxpVar, zzgxi zzgxiVar) {
        zzgxiVar.getClass();
        zzgrz zzgrzVar = zzgxpVar.zzk;
        if (!zzgrzVar.zzc()) {
            zzgxpVar.zzk = zzgrq.zzaO(zzgrzVar);
        }
        zzgxpVar.zzk.add(zzgxiVar);
    }

    static /* synthetic */ void zzk(zzgxp zzgxpVar, String str) {
        zzgxpVar.zzd |= 64;
        zzgxpVar.zzm = str;
    }

    static /* synthetic */ void zzl(zzgxp zzgxpVar) {
        zzgxpVar.zzd &= -65;
        zzgxpVar.zzm = zzb.zzm;
    }

    static /* synthetic */ void zzm(zzgxp zzgxpVar, zzgxc zzgxcVar) {
        zzgxcVar.getClass();
        zzgxpVar.zzn = zzgxcVar;
        zzgxpVar.zzd |= 128;
    }

    static /* synthetic */ void zzn(zzgxp zzgxpVar, zzgxk zzgxkVar) {
        zzgxkVar.getClass();
        zzgxpVar.zzu = zzgxkVar;
        zzgxpVar.zzd |= 8192;
    }

    static /* synthetic */ void zzo(zzgxp zzgxpVar, Iterable iterable) {
        zzgrz zzgrzVar = zzgxpVar.zzx;
        if (!zzgrzVar.zzc()) {
            zzgxpVar.zzx = zzgrq.zzaO(zzgrzVar);
        }
        zzgpr.zzav(iterable, zzgxpVar.zzx);
    }

    static /* synthetic */ void zzp(zzgxp zzgxpVar, Iterable iterable) {
        zzgrz zzgrzVar = zzgxpVar.zzy;
        if (!zzgrzVar.zzc()) {
            zzgxpVar.zzy = zzgrq.zzaO(zzgrzVar);
        }
        zzgpr.zzav(iterable, zzgxpVar.zzy);
    }

    static /* synthetic */ void zzq(zzgxp zzgxpVar, int i) {
        zzgxpVar.zze = i - 1;
        zzgxpVar.zzd |= 1;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzJ);
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", zzgxi.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", zzgxd.zza, "zzf", zzgvt.zza, "zzj", "zzm", "zzn", "zzt", "zzl", zzgxt.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzgxz.class, "zzB", "zzC", "zzD", "zzE", zzgwe.class, "zzF", "zzG", zzgxm.zza, "zzH", zzgww.class, "zzI", zzgwz.class});
        }
        if (i2 == 3) {
            return new zzgxp();
        }
        zzgvk zzgvkVar = null;
        if (i2 == 4) {
            return new zzgvu(zzgvkVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzJ = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
