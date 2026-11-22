package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.common.primitives.Ints;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvi implements zzace {
    private boolean zzB;
    private zzra zzC;
    private final zzvc zza;
    private final zzqz zzd;
    private final zzqt zze;
    private zzvh zzf;
    private zzam zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzam zzy;
    private zzam zzz;
    private final zzve zzb = new zzve();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzacd[] zzn = new zzacd[1000];
    private final zzvp zzc = new zzvp(new zzec() { // from class: com.google.android.gms.internal.ads.zzvd
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzA = true;

    protected zzvi(zzxu zzxuVar, zzqz zzqzVar, zzqt zzqtVar) {
        this.zzd = zzqzVar;
        this.zze = zzqtVar;
        this.zza = new zzvc(zzxuVar);
    }

    private final int zzA(int i) {
        int i2 = this.zzq + i;
        int i3 = this.zzh;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int zzB(zzkn zzknVar, zzht zzhtVar, boolean z, boolean z2, zzve zzveVar) {
        zzhtVar.zzc = false;
        if (!zzJ()) {
            if (!z2 && !this.zzv) {
                zzam zzamVar = this.zzz;
                if (zzamVar == null || (!z && zzamVar == this.zzg)) {
                    return -3;
                }
                zzG(zzamVar, zzknVar);
                return -5;
            }
            zzhtVar.zzc(4);
            zzhtVar.zzd = Long.MIN_VALUE;
            return -4;
        }
        zzam zzamVar2 = ((zzvg) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z && zzamVar2 == this.zzg) {
            int iZzA = zzA(this.zzr);
            if (!zzK(iZzA)) {
                zzhtVar.zzc = true;
                return -3;
            }
            zzhtVar.zzc(this.zzl[iZzA]);
            if (this.zzr == this.zzo - 1 && (z2 || this.zzv)) {
                zzhtVar.zza(DriveFile.MODE_WRITE_ONLY);
            }
            long j = this.zzm[iZzA];
            zzhtVar.zzd = j;
            if (j < this.zzs) {
                zzhtVar.zza(Integer.MIN_VALUE);
            }
            zzveVar.zza = this.zzk[iZzA];
            zzveVar.zzb = this.zzj[iZzA];
            zzveVar.zzc = this.zzn[iZzA];
            return -4;
        }
        zzG(zzamVar2, zzknVar);
        return -5;
    }

    private final synchronized long zzC(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzo;
        if (i2 != 0) {
            long[] jArr = this.zzm;
            int i3 = this.zzq;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzr) != i2) {
                    i2 = i + 1;
                }
                int iZzz = zzz(i3, i2, j, false);
                if (iZzz == -1) {
                    return -1L;
                }
                return zzE(iZzz);
            }
        }
        return -1L;
    }

    private final synchronized long zzD() {
        int i = this.zzo;
        if (i == 0) {
            return -1L;
        }
        return zzE(i);
    }

    private final synchronized void zzF(long j, int i, long j2, int i2, zzacd zzacdVar) {
        int i3 = this.zzo;
        if (i3 > 0) {
            int iZzA = zzA(i3 - 1);
            zzdy.zzd(this.zzj[iZzA] + ((long) this.zzk[iZzA]) <= j2);
        }
        this.zzv = (536870912 & i) != 0;
        this.zzu = Math.max(this.zzu, j);
        int iZzA2 = zzA(this.zzo);
        this.zzm[iZzA2] = j;
        this.zzj[iZzA2] = j2;
        this.zzk[iZzA2] = i2;
        this.zzl[iZzA2] = i;
        this.zzn[iZzA2] = zzacdVar;
        this.zzi[iZzA2] = 0;
        if (this.zzc.zzf() || !((zzvg) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzqy zzqyVar = zzqy.zzb;
            zzvp zzvpVar = this.zzc;
            int i4 = this.zzp + this.zzo;
            zzam zzamVar = this.zzz;
            zzamVar.getClass();
            zzvpVar.zzc(i4, new zzvg(zzamVar, zzqyVar, null));
        }
        int i5 = this.zzo + 1;
        this.zzo = i5;
        int i6 = this.zzh;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            long[] jArr3 = new long[i7];
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            zzacd[] zzacdVarArr = new zzacd[i7];
            int i8 = this.zzq;
            int i9 = i6 - i8;
            System.arraycopy(this.zzj, i8, jArr2, 0, i9);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i9);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i9);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i9);
            System.arraycopy(this.zzn, this.zzq, zzacdVarArr, 0, i9);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i9);
            int i10 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i9, i10);
            System.arraycopy(this.zzm, 0, jArr3, i9, i10);
            System.arraycopy(this.zzl, 0, iArr, i9, i10);
            System.arraycopy(this.zzk, 0, iArr2, i9, i10);
            System.arraycopy(this.zzn, 0, zzacdVarArr, i9, i10);
            System.arraycopy(this.zzi, 0, jArr, i9, i10);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzacdVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i7;
        }
    }

    private final void zzH() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzI() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzJ() {
        return this.zzr != this.zzo;
    }

    private final boolean zzK(int i) {
        if (this.zzC != null) {
            return (this.zzl[i] & Ints.MAX_POWER_OF_TWO) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzL(zzam zzamVar) {
        this.zzx = false;
        if (zzfk.zzD(zzamVar, this.zzz)) {
            return false;
        }
        if (this.zzc.zzf() || !((zzvg) this.zzc.zzb()).zza.equals(zzamVar)) {
            this.zzz = zzamVar;
        } else {
            this.zzz = ((zzvg) this.zzc.zzb()).zza;
        }
        boolean z = this.zzA;
        zzam zzamVar2 = this.zzz;
        this.zzA = z & zzcc.zze(zzamVar2.zzm, zzamVar2.zzj);
        this.zzB = false;
        return true;
    }

    static /* synthetic */ void zzl(zzvg zzvgVar) {
        zzqy zzqyVar = zzvgVar.zzb;
        int i = zzqx.zza;
    }

    private final int zzz(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzm[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.zzl[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i3;
    }

    public final int zza() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzb(long j, boolean z) {
        int i = this.zzr;
        int iZzA = zzA(i);
        if (zzJ() && j >= this.zzm[iZzA]) {
            if (j > this.zzu && z) {
                return this.zzo - i;
            }
            int iZzz = zzz(iZzA, this.zzo - i, j, true);
            if (iZzz == -1) {
                return 0;
            }
            return iZzz;
        }
        return 0;
    }

    public final int zzc() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzkn zzknVar, zzht zzhtVar, int i, boolean z) {
        int iZzB = zzB(zzknVar, zzhtVar, (i & 2) != 0, z, this.zzb);
        if (iZzB != -4) {
            return iZzB;
        }
        if (!zzhtVar.zzg()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 == 0) {
                    this.zza.zze(zzhtVar, this.zzb);
                    this.zzr++;
                    return -4;
                }
                this.zza.zzd(zzhtVar, this.zzb);
            }
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final /* synthetic */ int zze(zzt zztVar, int i, boolean z) {
        return zzacc.zza(this, zztVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzf(zzt zztVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zza(zztVar, i, z);
    }

    public final synchronized long zzg() {
        return this.zzu;
    }

    public final synchronized zzam zzh() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzi(long j, boolean z, boolean z2) {
        this.zza.zzc(zzC(j, false, z2));
    }

    public final void zzj() {
        this.zza.zzc(zzD());
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzk(zzam zzamVar) {
        this.zzy = zzamVar;
        boolean zZzL = zzL(zzamVar);
        zzvh zzvhVar = this.zzf;
        if (zzvhVar == null || !zZzL) {
            return;
        }
        zzvhVar.zzL(zzamVar);
    }

    public final void zzm() throws IOException {
        zzra zzraVar = this.zzC;
        if (zzraVar != null) {
            throw zzraVar.zza();
        }
    }

    public final void zzn() {
        zzj();
        zzH();
    }

    public final void zzo() {
        zzp(true);
        zzH();
    }

    public final void zzp(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
            this.zzA = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final /* synthetic */ void zzq(zzfb zzfbVar, int i) {
        zzacc.zzb(this, zzfbVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzr(zzfb zzfbVar, int i, int i2) {
        this.zza.zzh(zzfbVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzs(long j, int i, int i2, int i3, zzacd zzacdVar) {
        if (this.zzw) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzA) {
            if (j < this.zzs) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzB) {
                    zzes.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.zzz))));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzF(j, i, (this.zza.zzb() - ((long) i2)) - ((long) i3), i2, zzacdVar);
    }

    public final void zzt(long j) {
        this.zzs = j;
    }

    public final void zzu(zzvh zzvhVar) {
        this.zzf = zzvhVar;
    }

    public final synchronized void zzv(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdy.zzd(z);
        this.zzr += i;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    public final synchronized boolean zzx(boolean z) {
        boolean z2 = true;
        if (zzJ()) {
            if (((zzvg) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzK(zzA(this.zzr));
        }
        if (!z && !this.zzv) {
            zzam zzamVar = this.zzz;
            if (zzamVar == null) {
                z2 = false;
            } else if (zzamVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean zzy(long j, boolean z) {
        int iZzz;
        zzI();
        int i = this.zzr;
        int iZzA = zzA(i);
        if (zzJ() && j >= this.zzm[iZzA]) {
            if (j > this.zzu) {
                if (z) {
                    z = true;
                }
            }
            if (this.zzA) {
                iZzz = this.zzo - i;
                int i2 = iZzA;
                while (true) {
                    if (i2 >= iZzz) {
                        if (!z) {
                            iZzz = -1;
                            break;
                        }
                        break;
                    }
                    if (this.zzm[i2] >= j) {
                        iZzz = i2 - iZzA;
                        break;
                    }
                    i2++;
                }
            } else {
                iZzz = zzz(iZzA, this.zzo - i, j, true);
            }
            if (iZzz == -1) {
                return false;
            }
            this.zzs = j;
            this.zzr += iZzz;
            return true;
        }
        return false;
    }

    private final void zzG(zzam zzamVar, zzkn zzknVar) {
        zzam zzamVar2 = this.zzg;
        boolean z = zzamVar2 == null;
        zzad zzadVar = z ? null : zzamVar2.zzp;
        this.zzg = zzamVar;
        zzad zzadVar2 = zzamVar.zzp;
        zzknVar.zza = zzamVar.zzc(this.zzd.zza(zzamVar));
        zzknVar.zzb = this.zzC;
        if (z || !zzfk.zzD(zzadVar, zzadVar2)) {
            zzra zzraVar = zzamVar.zzp != null ? new zzra(new zzqr(new zzrc(1), GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER)) : null;
            this.zzC = zzraVar;
            zzknVar.zzb = zzraVar;
        }
    }

    private final long zzE(int i) {
        long j = this.zzt;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iZzA = zzA(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                jMax = Math.max(jMax, this.zzm[iZzA]);
                if ((this.zzl[iZzA] & 1) != 0) {
                    break;
                }
                iZzA--;
                if (iZzA == -1) {
                    iZzA = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j, jMax);
        this.zzo -= i;
        int i3 = this.zzp + i;
        this.zzp = i3;
        int i4 = this.zzq + i;
        this.zzq = i4;
        int i5 = this.zzh;
        if (i4 >= i5) {
            this.zzq = i4 - i5;
        }
        int i6 = this.zzr - i;
        this.zzr = i6;
        if (i6 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i3);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i7 = this.zzq;
        if (i7 == 0) {
            i7 = this.zzh;
        }
        int i8 = i7 - 1;
        return this.zzj[i8] + ((long) this.zzk[i8]);
    }
}
