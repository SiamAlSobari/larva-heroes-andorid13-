package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwu extends zzakk implements zzalq {
    private static final zzwu zzb;
    private int zzd;
    private zzwi zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzwu zzwuVar = new zzwu();
        zzb = zzwuVar;
        zzakk.zzH(zzwu.class, zzwuVar);
    }

    private zzwu() {
    }

    public static zzwt zzc() {
        return (zzwt) zzb.zzt();
    }

    static /* synthetic */ void zzf(zzwu zzwuVar, zzwi zzwiVar) {
        zzwiVar.getClass();
        zzwuVar.zze = zzwiVar;
        zzwuVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzwi zzb() {
        zzwi zzwiVar = this.zze;
        return zzwiVar == null ? zzwi.zzd() : zzwiVar;
    }

    public final zzxo zze() {
        zzxo zzxoVarZzb = zzxo.zzb(this.zzh);
        return zzxoVarZzb == null ? zzxo.UNRECOGNIZED : zzxoVarZzb;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzwu();
        }
        zzwr zzwrVar = null;
        if (i2 == 4) {
            return new zzwt(zzwrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzk() {
        int i = this.zzf;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
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
