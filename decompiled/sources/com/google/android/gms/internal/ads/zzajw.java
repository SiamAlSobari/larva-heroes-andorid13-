package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajw implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzajt
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i = zzabh.zza;
            zzabi zzabiVar = zzajw.zza;
            return new zzabb[]{new zzajw(0)};
        }
    };
    private final List zzb;
    private final zzfb zzc;
    private final SparseIntArray zzd;
    private final zzajz zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzajs zzi;
    private zzajr zzj;
    private zzabe zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzajw() {
        this(0);
    }

    /* JADX WARN: Code duplicated, block: B:95:0x01b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        ?? r3;
        long j;
        boolean z;
        long jZzd = zzabcVar.zzd();
        if (this.zzm) {
            if (jZzd != -1) {
                zzajs zzajsVar = this.zzi;
                if (!zzajsVar.zzd()) {
                    return zzajsVar.zza(zzabcVar, zzabxVar, this.zzq);
                }
            }
            if (this.zzn) {
                j = 0;
            } else {
                this.zzn = true;
                zzajs zzajsVar2 = this.zzi;
                if (zzajsVar2.zzb() != -9223372036854775807L) {
                    j = 0;
                    zzajr zzajrVar = new zzajr(zzajsVar2.zzc(), zzajsVar2.zzb(), jZzd, this.zzq, 112800);
                    this.zzj = zzajrVar;
                    this.zzk.zzN(zzajrVar.zzb());
                } else {
                    j = 0;
                    this.zzk.zzN(new zzabz(zzajsVar2.zzb(), 0L));
                }
            }
            if (this.zzo) {
                z = false;
                this.zzo = false;
                zzc(j, j);
                if (zzabcVar.zzf() != j) {
                    zzabxVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            zzajr zzajrVar2 = this.zzj;
            r3 = z;
            if (zzajrVar2 != null) {
                r3 = z;
                if (zzajrVar2.zze()) {
                    return zzajrVar2.zza(zzabcVar, zzabxVar);
                }
            }
        } else {
            r3 = 0;
        }
        zzfb zzfbVar = this.zzc;
        byte[] bArrZzI = zzfbVar.zzI();
        if (9400 - zzfbVar.zzc() < 188) {
            int iZza = zzfbVar.zza();
            if (iZza > 0) {
                System.arraycopy(bArrZzI, zzfbVar.zzc(), bArrZzI, r3, iZza);
            }
            this.zzc.zzE(bArrZzI, iZza);
        }
        while (true) {
            zzfb zzfbVar2 = this.zzc;
            if (zzfbVar2.zza() >= 188) {
                int iZzc = zzfbVar2.zzc();
                int iZzd = zzfbVar2.zzd();
                int iZza2 = zzakc.zza(zzfbVar2.zzI(), iZzc, iZzd);
                this.zzc.zzG(iZza2);
                int i = iZza2 + 188;
                if (i > iZzd) {
                    this.zzp += iZza2 - iZzc;
                } else {
                    this.zzp = r3;
                }
                zzfb zzfbVar3 = this.zzc;
                int iZzd2 = zzfbVar3.zzd();
                if (i > iZzd2) {
                    return r3;
                }
                int iZzf = zzfbVar3.zzf();
                if ((8388608 & iZzf) != 0) {
                    this.zzc.zzG(i);
                    return r3;
                }
                int i2 = (4194304 & iZzf) != 0 ? 1 : 0;
                int i3 = iZzf & 32;
                int i4 = (iZzf >> 8) & 8191;
                zzakb zzakbVar = (iZzf & 16) != 0 ? (zzakb) this.zzf.get(i4) : null;
                if (zzakbVar == null) {
                    this.zzc.zzG(i);
                    return r3;
                }
                int i5 = iZzf & 15;
                int i6 = this.zzd.get(i4, i5 - 1);
                this.zzd.put(i4, i5);
                if (i6 == i5) {
                    this.zzc.zzG(i);
                    return r3;
                }
                if (i5 != ((i6 + 1) & 15)) {
                    zzakbVar.zzc();
                }
                if (i3 != 0) {
                    int iZzl = this.zzc.zzl();
                    i2 |= (this.zzc.zzl() & 64) != 0 ? 2 : 0;
                    this.zzc.zzH(iZzl - 1);
                }
                boolean z2 = this.zzm;
                if (z2 || !this.zzh.get(i4, r3)) {
                    this.zzc.zzF(i);
                    zzakbVar.zza(this.zzc, i2);
                    this.zzc.zzF(iZzd2);
                    if (!z2) {
                        if (this.zzm && jZzd != -1) {
                            this.zzo = true;
                        }
                    }
                } else if (this.zzm) {
                    this.zzo = true;
                }
                this.zzc.zzG(i);
                return r3;
            }
            int iZzd3 = zzfbVar2.zzd();
            int iZza3 = zzabcVar.zza(bArrZzI, iZzd3, 9400 - iZzd3);
            if (iZza3 == -1) {
                for (int i7 = 0; i7 < this.zzf.size(); i7++) {
                    zzakb zzakbVar2 = (zzakb) this.zzf.valueAt(i7);
                    if (zzakbVar2 instanceof zzajf) {
                        zzakbVar2.zza(new zzfb(), 1);
                    }
                }
                return -1;
            }
            this.zzc.zzF(iZzd3 + iZza3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzk = zzabeVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j, long j2) {
        zzajr zzajrVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzfi zzfiVar = (zzfi) this.zzb.get(i);
            if (zzfiVar.zze() != -9223372036854775807L) {
                long jZzc = zzfiVar.zzc();
                if (jZzc != -9223372036854775807L && jZzc != 0 && jZzc != j2) {
                    zzfiVar.zzf(j2);
                }
            } else {
                zzfiVar.zzf(j2);
            }
        }
        if (j2 != 0 && (zzajrVar = this.zzj) != null) {
            zzajrVar.zzd(j2);
        }
        this.zzc.zzD(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            ((zzakb) this.zzf.valueAt(i2)).zzc();
        }
        this.zzp = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        byte[] bArrZzI = this.zzc.zzI();
        zzaar zzaarVar = (zzaar) zzabcVar;
        zzaarVar.zzm(bArrZzI, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    zzaarVar.zzo(i, false);
                    return true;
                }
                if (bArrZzI[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public zzajw(int i) {
        this(1, new zzfi(0L), new zzail(0), 112800);
    }

    public zzajw(int i, zzfi zzfiVar, zzajz zzajzVar, int i2) {
        this.zze = zzajzVar;
        this.zzb = Collections.singletonList(zzfiVar);
        this.zzc = new zzfb(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzajs(112800);
        this.zzk = zzabe.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.zzf.put(sparseArray2.keyAt(i3), (zzakb) sparseArray2.valueAt(i3));
        }
        this.zzf.put(0, new zzajo(new zzaju(this)));
    }
}
