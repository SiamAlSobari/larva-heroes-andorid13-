package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzak extends zzxj implements zzyv {
    private static final zzak zza;
    private int zzd;
    private zzac zzf;
    private byte zzh = 2;
    private zzxr zze = zzah();
    private String zzg = "";

    static {
        zzak zzakVar = new zzak();
        zza = zzakVar;
        zzxj.zzan(zzak.class, zzakVar);
    }

    private zzak() {
    }

    public static zzaj zzd() {
        return (zzaj) zza.zzY();
    }

    public static zzak zzf() {
        return zza;
    }

    public static zzak zzg(byte[] bArr, zzwt zzwtVar) throws zzxu {
        return (zzak) zzxj.zzaf(zza, bArr, zzwtVar);
    }

    static /* synthetic */ void zzk(zzak zzakVar, zzac zzacVar) {
        zzacVar.getClass();
        zzakVar.zzf = zzacVar;
        zzakVar.zzd |= 1;
    }

    static /* synthetic */ void zzl(zzak zzakVar, String str) {
        str.getClass();
        zzakVar.zzd |= 2;
        zzakVar.zzg = str;
    }

    public final int zza() {
        return this.zze.size();
    }

    public final zzac zzc() {
        zzac zzacVar = this.zzf;
        return zzacVar == null ? zzac.zzk() : zzacVar;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zze;
    }

    public final boolean zzm() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzxj
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return zzak(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", zzai.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzak();
        }
        zzn zznVar = null;
        if (i2 == 4) {
            return new zzaj(zznVar);
        }
        if (i2 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
