package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgml extends zzgrq implements zzgtb {
    private static final zzgml zzb;
    private int zzd;
    private int zze;

    static {
        zzgml zzgmlVar = new zzgml();
        zzb = zzgmlVar;
        zzgrq.zzaU(zzgml.class, zzgmlVar);
    }

    private zzgml() {
    }

    public static zzgmk zzc() {
        return (zzgmk) zzb.zzaA();
    }

    public static zzgml zze() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzgml();
        }
        zzgmj zzgmjVar = null;
        if (i2 == 4) {
            return new zzgmk(zzgmjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzg() {
        int i = this.zzd;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = 5;
                if (i != 3) {
                    if (i != 4) {
                        i2 = i != 5 ? 0 : 7;
                    } else {
                        i2 = 6;
                    }
                }
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
