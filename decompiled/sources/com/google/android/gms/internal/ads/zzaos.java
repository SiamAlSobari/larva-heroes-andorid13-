package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;
import com.google.common.primitives.Ints;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaos extends zzgrq implements zzgtb {
    private static final zzaos zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private zzaou zzM;
    private zzaon zzaC;
    private long zzaI;
    private zzaoe zzaL;
    private zzaog zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private zzapb zzaW;
    private zzaop zzae;
    private zzaor zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private zzapd zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private zzgrz zzaf = zzaN();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private zzgrz zzaz = zzaN();
    private int zzaA = 1000;
    private zzgrz zzaB = zzaN();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        zzaos zzaosVar = new zzaos();
        zzb = zzaosVar;
        zzgrq.zzaU(zzaos.class, zzaosVar);
    }

    private zzaos() {
    }

    static /* synthetic */ void zzA(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 134217728;
        zzaosVar.zzH = j;
    }

    static /* synthetic */ void zzB(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzd |= DriveFile.MODE_READ_ONLY;
        zzaosVar.zzI = str;
    }

    static /* synthetic */ void zzC(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= DriveFile.MODE_WRITE_ONLY;
        zzaosVar.zzJ = j;
    }

    static /* synthetic */ void zzD(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= Ints.MAX_POWER_OF_TWO;
        zzaosVar.zzK = j;
    }

    static /* synthetic */ void zzE(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= Integer.MIN_VALUE;
        zzaosVar.zzL = j;
    }

    static /* synthetic */ void zzF(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 2;
        zzaosVar.zzN = j;
    }

    static /* synthetic */ void zzG(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 4;
        zzaosVar.zzO = j;
    }

    static /* synthetic */ void zzH(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 8;
        zzaosVar.zzP = j;
    }

    static /* synthetic */ void zzI(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 16;
        zzaosVar.zzQ = j;
    }

    static /* synthetic */ void zzJ(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 32;
        zzaosVar.zzR = j;
    }

    static /* synthetic */ void zzK(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 64;
        zzaosVar.zzS = j;
    }

    static /* synthetic */ void zzL(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zze |= 128;
        zzaosVar.zzT = str;
    }

    static /* synthetic */ void zzM(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zze |= 256;
        zzaosVar.zzU = str;
    }

    static /* synthetic */ void zzN(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 4096;
        zzaosVar.zzY = j;
    }

    static /* synthetic */ void zzO(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 8192;
        zzaosVar.zzZ = j;
    }

    static /* synthetic */ void zzP(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 16384;
        zzaosVar.zzaa = j;
    }

    static /* synthetic */ void zzQ(zzaos zzaosVar, zzaop zzaopVar) {
        zzaopVar.getClass();
        zzaosVar.zzae = zzaopVar;
        zzaosVar.zze |= 262144;
    }

    static /* synthetic */ void zzR(zzaos zzaosVar, zzaop zzaopVar) {
        zzaopVar.getClass();
        zzgrz zzgrzVar = zzaosVar.zzaf;
        if (!zzgrzVar.zzc()) {
            zzaosVar.zzaf = zzgrq.zzaO(zzgrzVar);
        }
        zzaosVar.zzaf.add(zzaopVar);
    }

    static /* synthetic */ void zzT(zzaos zzaosVar, zzaor zzaorVar) {
        zzaorVar.getClass();
        zzaosVar.zzag = zzaorVar;
        zzaosVar.zze |= 524288;
    }

    static /* synthetic */ void zzU(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 2097152;
        zzaosVar.zzai = j;
    }

    static /* synthetic */ void zzV(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 4194304;
        zzaosVar.zzaj = j;
    }

    static /* synthetic */ void zzW(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 8388608;
        zzaosVar.zzak = j;
    }

    static /* synthetic */ void zzX(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 67108864;
        zzaosVar.zzan = j;
    }

    static /* synthetic */ void zzY(zzaos zzaosVar, long j) {
        zzaosVar.zze |= 134217728;
        zzaosVar.zzao = j;
    }

    static /* synthetic */ void zzZ(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zze |= DriveFile.MODE_READ_ONLY;
        zzaosVar.zzap = str;
    }

    public static zzanv zza() {
        return (zzanv) zzb.zzaA();
    }

    static /* synthetic */ void zzaa(zzaos zzaosVar, long j) {
        zzaosVar.zzf |= 512;
        zzaosVar.zzaE = j;
    }

    static /* synthetic */ void zzab(zzaos zzaosVar, long j) {
        zzaosVar.zzf |= 1024;
        zzaosVar.zzaF = j;
    }

    static /* synthetic */ void zzac(zzaos zzaosVar, long j) {
        zzaosVar.zzf |= 2048;
        zzaosVar.zzaG = j;
    }

    static /* synthetic */ void zzad(zzaos zzaosVar, long j) {
        zzaosVar.zzf |= 4096;
        zzaosVar.zzaH = j;
    }

    static /* synthetic */ void zzae(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzf |= 32768;
        zzaosVar.zzaK = str;
    }

    static /* synthetic */ void zzaf(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzf |= 4194304;
        zzaosVar.zzaR = str;
    }

    static /* synthetic */ void zzag(zzaos zzaosVar, boolean z) {
        zzaosVar.zzf |= 16777216;
        zzaosVar.zzaT = z;
    }

    static /* synthetic */ void zzah(zzaos zzaosVar, long j) {
        zzaosVar.zzf |= 67108864;
        zzaosVar.zzaV = j;
    }

    static /* synthetic */ void zzam(zzaos zzaosVar, int i) {
        zzaosVar.zzW = i - 1;
        zzaosVar.zze |= 1024;
    }

    static /* synthetic */ void zzan(zzaos zzaosVar, int i) {
        zzaosVar.zzX = i - 1;
        zzaosVar.zze |= 2048;
    }

    static /* synthetic */ void zzao(zzaos zzaosVar, int i) {
        zzaosVar.zzad = i - 1;
        zzaosVar.zze |= 131072;
    }

    static /* synthetic */ void zzap(zzaos zzaosVar, int i) {
        zzaosVar.zzaw = i - 1;
        zzaosVar.zzf |= 8;
    }

    static /* synthetic */ void zzaq(zzaos zzaosVar, int i) {
        zzaosVar.zzax = i - 1;
        zzaosVar.zzf |= 16;
    }

    static /* synthetic */ void zzar(zzaos zzaosVar, int i) {
        zzaosVar.zzaP = i - 1;
        zzaosVar.zzf |= 1048576;
    }

    static /* synthetic */ void zzas(zzaos zzaosVar, int i) {
        zzaosVar.zzaS = 5;
        zzaosVar.zzf |= 8388608;
    }

    public static zzaos zzd() {
        return zzb;
    }

    public static zzaos zze(byte[] bArr, zzgrc zzgrcVar) throws zzgsc {
        return (zzaos) zzgrq.zzaI(zzb, bArr, zzgrcVar);
    }

    static /* synthetic */ void zzi(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzd |= 1;
        zzaosVar.zzg = str;
    }

    static /* synthetic */ void zzj(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzd |= 2;
        zzaosVar.zzh = str;
    }

    static /* synthetic */ void zzk(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 4;
        zzaosVar.zzi = j;
    }

    static /* synthetic */ void zzl(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 16;
        zzaosVar.zzk = j;
    }

    static /* synthetic */ void zzm(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 32;
        zzaosVar.zzl = j;
    }

    static /* synthetic */ void zzn(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 1024;
        zzaosVar.zzq = j;
    }

    static /* synthetic */ void zzo(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 2048;
        zzaosVar.zzr = j;
    }

    static /* synthetic */ void zzp(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 8192;
        zzaosVar.zzt = j;
    }

    static /* synthetic */ void zzq(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 16384;
        zzaosVar.zzu = j;
    }

    static /* synthetic */ void zzr(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 32768;
        zzaosVar.zzv = j;
    }

    static /* synthetic */ void zzs(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 65536;
        zzaosVar.zzw = j;
    }

    static /* synthetic */ void zzt(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 524288;
        zzaosVar.zzz = j;
    }

    static /* synthetic */ void zzu(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 1048576;
        zzaosVar.zzA = j;
    }

    static /* synthetic */ void zzv(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 2097152;
        zzaosVar.zzB = j;
    }

    static /* synthetic */ void zzw(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzd |= 4194304;
        zzaosVar.zzC = str;
    }

    static /* synthetic */ void zzx(zzaos zzaosVar, String str) {
        str.getClass();
        zzaosVar.zzd |= 16777216;
        zzaosVar.zzE = str;
    }

    static /* synthetic */ void zzy(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 33554432;
        zzaosVar.zzF = j;
    }

    static /* synthetic */ void zzz(zzaos zzaosVar, long j) {
        zzaosVar.zzd |= 67108864;
        zzaosVar.zzG = j;
    }

    public final boolean zzai() {
        return this.zzaT;
    }

    public final boolean zzaj() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean zzak() {
        return (this.zzf & 134217728) != 0;
    }

    public final int zzal() {
        int iZza = zzaob.zza(this.zzaS);
        if (iZza == 0) {
            return 3;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgru zzgruVar = zzaoy.zza;
            return zzaR(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", zzaoa.zza, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", zzaop.class, "zzR", "zzS", "zzT", "zzU", "zzW", zzgruVar, "zzX", zzgruVar, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zzgruVar, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", zzaox.zza, "zzas", zzaoz.zza, "zzap", "zzat", zzanw.zza, "zzau", "zzav", "zzal", "zzam", "zzaw", zzgruVar, "zzV", "zzD", "zzax", zzgruVar, "zzay", "zzaz", zzaol.class, "zzaA", zzgruVar, "zzaB", zzany.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", zzaoi.zza, "zzaW", "zzaX", "zzaY"});
        }
        if (i2 == 3) {
            return new zzaos();
        }
        zzanu zzanuVar = null;
        if (i2 == 4) {
            return new zzanv(zzanuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzapb zzf() {
        zzapb zzapbVar = this.zzaW;
        return zzapbVar == null ? zzapb.zzd() : zzapbVar;
    }

    public final String zzg() {
        return this.zzaR;
    }

    public final String zzh() {
        return this.zzC;
    }
}
