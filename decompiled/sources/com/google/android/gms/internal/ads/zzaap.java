package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaap implements zzaca {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaap(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.zza + ", sizes=" + Arrays.toString(this.zzb) + ", offsets=" + Arrays.toString(this.zzc) + ", timeUs=" + Arrays.toString(this.zze) + ", durationsUs=" + Arrays.toString(this.zzd) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        int iZzc = zzfk.zzc(this.zze, j, true, true);
        zzacb zzacbVar = new zzacb(this.zze[iZzc], this.zzc[iZzc]);
        if (zzacbVar.zzb >= j || iZzc == this.zza - 1) {
            return new zzaby(zzacbVar, zzacbVar);
        }
        int i = iZzc + 1;
        return new zzaby(zzacbVar, new zzacb(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
