package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzae extends zzxj implements zzyv {
    private static final zzae zza;
    private zzxo zzd = zzag();
    private zzxo zze = zzag();
    private zzxo zzf = zzag();
    private zzxo zzg = zzag();
    private zzxo zzh = zzag();
    private zzxo zzi = zzag();
    private zzxo zzj = zzag();
    private zzxo zzk = zzag();
    private zzxo zzl = zzag();
    private zzxo zzm = zzag();

    static {
        zzae zzaeVar = new zzae();
        zza = zzaeVar;
        zzxj.zzan(zzae.class, zzaeVar);
    }

    private zzae() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzak(zza, "\u0001\n\u0000\u0000\u0001\n\n\u0000\n\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016\u0005\u0016\u0006\u0016\u0007\u0016\b\u0016\t\u0016\n\u0016", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzae();
        }
        zzn zznVar = null;
        if (i2 == 4) {
            return new zzad(zznVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final List zzc() {
        return this.zzj;
    }

    public final List zzd() {
        return this.zzl;
    }

    public final List zze() {
        return this.zzf;
    }

    public final List zzf() {
        return this.zzh;
    }

    public final List zzg() {
        return this.zze;
    }

    public final List zzh() {
        return this.zzd;
    }

    public final List zzi() {
        return this.zzk;
    }

    public final List zzj() {
        return this.zzm;
    }

    public final List zzk() {
        return this.zzg;
    }

    public final List zzl() {
        return this.zzi;
    }
}
