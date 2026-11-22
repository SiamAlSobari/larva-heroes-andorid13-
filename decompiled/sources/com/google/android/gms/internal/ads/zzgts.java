package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgts extends zzgqi {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgqi zzd;
    private final zzgqi zze;
    private final int zzf;
    private final int zzg;

    private zzgts(zzgqi zzgqiVar, zzgqi zzgqiVar2) {
        this.zzd = zzgqiVar;
        this.zze = zzgqiVar2;
        int iZzd = zzgqiVar.zzd();
        this.zzf = iZzd;
        this.zzc = iZzd + zzgqiVar2.zzd();
        this.zzg = Math.max(zzgqiVar.zzf(), zzgqiVar2.zzf()) + 1;
    }

    static zzgqi zzC(zzgqi zzgqiVar, zzgqi zzgqiVar2) {
        if (zzgqiVar2.zzd() == 0) {
            return zzgqiVar;
        }
        if (zzgqiVar.zzd() == 0) {
            return zzgqiVar2;
        }
        int iZzd = zzgqiVar.zzd() + zzgqiVar2.zzd();
        if (iZzd < 128) {
            return zzD(zzgqiVar, zzgqiVar2);
        }
        if (zzgqiVar instanceof zzgts) {
            zzgts zzgtsVar = (zzgts) zzgqiVar;
            if (zzgtsVar.zze.zzd() + zzgqiVar2.zzd() < 128) {
                return new zzgts(zzgtsVar.zzd, zzD(zzgtsVar.zze, zzgqiVar2));
            }
            if (zzgtsVar.zzd.zzf() > zzgtsVar.zze.zzf() && zzgtsVar.zzg > zzgqiVar2.zzf()) {
                return new zzgts(zzgtsVar.zzd, new zzgts(zzgtsVar.zze, zzgqiVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzgqiVar.zzf(), zzgqiVar2.zzf()) + 1) ? new zzgts(zzgqiVar, zzgqiVar2) : zzgto.zza(new zzgto(null), zzgqiVar, zzgqiVar2);
    }

    private static zzgqi zzD(zzgqi zzgqiVar, zzgqi zzgqiVar2) {
        int iZzd = zzgqiVar.zzd();
        int iZzd2 = zzgqiVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzgqiVar.zzz(bArr, 0, 0, iZzd);
        zzgqiVar2.zzz(bArr, 0, iZzd, iZzd2);
        return new zzgqe(bArr);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgqi)) {
            return false;
        }
        zzgqi zzgqiVar = (zzgqi) obj;
        if (this.zzc != zzgqiVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzr = zzr();
        int iZzr2 = zzgqiVar.zzr();
        if (iZzr != 0 && iZzr2 != 0 && iZzr != iZzr2) {
            return false;
        }
        zzgtp zzgtpVar = null;
        zzgtq zzgtqVar = new zzgtq(this, zzgtpVar);
        zzgqd zzgqdVarZza = zzgtqVar.next();
        zzgtq zzgtqVar2 = new zzgtq(zzgqiVar, zzgtpVar);
        zzgqd zzgqdVarZza2 = zzgtqVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iZzd = zzgqdVarZza.zzd() - i;
            int iZzd2 = zzgqdVarZza2.zzd() - i2;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i == 0 ? zzgqdVarZza.zzg(zzgqdVarZza2, i2, iMin) : zzgqdVarZza2.zzg(zzgqdVarZza, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzgqdVarZza = zzgtqVar.next();
                i = 0;
            } else {
                i += iMin;
                zzgqdVarZza = zzgqdVarZza;
            }
            if (iMin == iZzd2) {
                zzgqdVarZza2 = zzgtqVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqi, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgtm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final byte zza(int i) {
        zzy(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    protected final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    protected final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final zzgqi zzk(int i, int i2) {
        int iZzq = zzq(i, i2, this.zzc);
        if (iZzq == 0) {
            return zzgqi.zzb;
        }
        if (iZzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgqi zzgqiVar = this.zzd;
        return new zzgts(zzgqiVar.zzk(i, zzgqiVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgqi
    public final zzgqq zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        zzgtq zzgtqVar = new zzgtq(this, null);
        while (zzgtqVar.hasNext()) {
            arrayList.add(zzgtqVar.next().zzn());
        }
        int i = zzgqq.zzd;
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new zzgqm(arrayList, iRemaining, true, objArr == true ? 1 : 0) : zzgqq.zzH(new zzgsd(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    protected final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    final void zzo(zzgpx zzgpxVar) throws IOException {
        this.zzd.zzo(zzgpxVar);
        this.zze.zzo(zzgpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    public final boolean zzp() {
        int iZzj = this.zzd.zzj(0, 0, this.zzf);
        zzgqi zzgqiVar = this.zze;
        return zzgqiVar.zzj(iZzj, 0, zzgqiVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgqi
    /* JADX INFO: renamed from: zzs */
    public final zzgqc iterator() {
        return new zzgtm(this);
    }
}
