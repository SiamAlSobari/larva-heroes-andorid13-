package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgnh extends zzgrq implements zzgtb {
    private static final zzgnh zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgnh zzgnhVar = new zzgnh();
        zzb = zzgnhVar;
        zzgrq.zzaU(zzgnh.class, zzgnhVar);
    }

    private zzgnh() {
    }

    public static zzgng zza() {
        return (zzgng) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgnh zzgnhVar, String str) {
        str.getClass();
        zzgnhVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgnh();
        }
        zzgne zzgneVar = null;
        if (i2 == 4) {
            return new zzgng(zzgneVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
