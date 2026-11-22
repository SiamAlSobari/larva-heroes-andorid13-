package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazn extends zzgrq implements zzgtb {
    private static final zzgrw zzb = new zzazl();
    private static final zzazn zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgrv zzj = zzaJ();
    private zzazi zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzazn zzaznVar = new zzazn();
        zzd = zzaznVar;
        zzgrq.zzaU(zzazn.class, zzaznVar);
    }

    private zzazn() {
    }

    static /* synthetic */ void zzA(zzazn zzaznVar, int i) {
        zzaznVar.zzm = i - 1;
        zzaznVar.zze |= 64;
    }

    static /* synthetic */ void zzB(zzazn zzaznVar, int i) {
        zzaznVar.zzn = i - 1;
        zzaznVar.zze |= 128;
    }

    static /* synthetic */ void zzC(zzazn zzaznVar, int i) {
        zzaznVar.zzp = i - 1;
        zzaznVar.zze |= 512;
    }

    public static zzazm zzg() {
        return (zzazm) zzd.zzaA();
    }

    public static zzazn zzi(byte[] bArr) throws zzgsc {
        return (zzazn) zzgrq.zzaF(zzd, bArr);
    }

    static /* synthetic */ void zzl(zzazn zzaznVar, long j) {
        zzaznVar.zze |= 1;
        zzaznVar.zzf = j;
    }

    static /* synthetic */ void zzm(zzazn zzaznVar, long j) {
        zzaznVar.zze |= 4;
        zzaznVar.zzh = j;
    }

    static /* synthetic */ void zzn(zzazn zzaznVar, long j) {
        zzaznVar.zze |= 8;
        zzaznVar.zzi = j;
    }

    static /* synthetic */ void zzo(zzazn zzaznVar, Iterable iterable) {
        zzgrv zzgrvVar = zzaznVar.zzj;
        if (!zzgrvVar.zzc()) {
            zzaznVar.zzj = zzgrq.zzaK(zzgrvVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzaznVar.zzj.zzh(((zzayc) it.next()).zza());
        }
    }

    static /* synthetic */ void zzp(zzazn zzaznVar, zzazi zzaziVar) {
        zzaziVar.getClass();
        zzaznVar.zzk = zzaziVar;
        zzaznVar.zze |= 16;
    }

    static /* synthetic */ void zzq(zzazn zzaznVar, int i) {
        zzaznVar.zze |= 256;
        zzaznVar.zzo = i;
    }

    static /* synthetic */ void zzr(zzazn zzaznVar, zzazr zzazrVar) {
        zzaznVar.zzq = zzazrVar.zza();
        zzaznVar.zze |= 1024;
    }

    static /* synthetic */ void zzs(zzazn zzaznVar, long j) {
        zzaznVar.zze |= 2048;
        zzaznVar.zzr = j;
    }

    static /* synthetic */ void zzy(zzazn zzaznVar, int i) {
        zzaznVar.zzg = i - 1;
        zzaznVar.zze |= 2;
    }

    static /* synthetic */ void zzz(zzazn zzaznVar, int i) {
        zzaznVar.zzl = i - 1;
        zzaznVar.zze |= 32;
    }

    public final int zza() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgru zzgruVar = zzayr.zza;
            return zzaR(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zzayr.zza, "zzh", "zzi", "zzj", zzayb.zza, "zzk", "zzl", zzgruVar, "zzm", zzgruVar, "zzn", zzgruVar, "zzo", "zzp", zzgruVar, "zzq", zzazq.zza, "zzr"});
        }
        if (i2 == 3) {
            return new zzazn();
        }
        zzaxl zzaxlVar = null;
        if (i2 == 4) {
            return new zzazm(zzaxlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzazi zzf() {
        zzazi zzaziVar = this.zzk;
        return zzaziVar == null ? zzazi.zzd() : zzaziVar;
    }

    public final zzazr zzj() {
        zzazr zzazrVarZzb = zzazr.zzb(this.zzq);
        return zzazrVarZzb == null ? zzazr.UNSPECIFIED : zzazrVarZzb;
    }

    public final List zzk() {
        return new zzgrx(this.zzj, zzb);
    }

    public final int zzt() {
        int iZza = zzays.zza(this.zzm);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzu() {
        int iZza = zzays.zza(this.zzn);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzv() {
        int iZza = zzays.zza(this.zzp);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzw() {
        int iZza = zzays.zza(this.zzg);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzx() {
        int iZza = zzays.zza(this.zzl);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
