package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztc implements zzvl {
    protected final zzvl[] zza;

    public zztc(zzvl[] zzvlVarArr) {
        this.zza = zzvlVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        for (zzvl zzvlVar : this.zza) {
            long jZzb = zzvlVar.zzb();
            if (jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (zzvl zzvlVar : this.zza) {
            long jZzc = zzvlVar.zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j) {
        for (zzvl zzvlVar : this.zza) {
            zzvlVar.zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j) {
        boolean zZzo;
        boolean z = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            zZzo = false;
            for (zzvl zzvlVar : this.zza) {
                long jZzc2 = zzvlVar.zzc();
                boolean z2 = jZzc2 != Long.MIN_VALUE && jZzc2 <= j;
                if (jZzc2 == jZzc || z2) {
                    zZzo |= zzvlVar.zzo(j);
                }
            }
            z |= zZzo;
        } while (zZzo);
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        for (zzvl zzvlVar : this.zza) {
            if (zzvlVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
