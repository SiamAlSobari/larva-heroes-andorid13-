package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzva extends zzakk implements zzalq {
    private static final zzva zzb;
    private int zzd;
    private zzajf zze = zzajf.zzb;
    private zzxa zzf;

    static {
        zzva zzvaVar = new zzva();
        zzb = zzvaVar;
        zzakk.zzH(zzva.class, zzvaVar);
    }

    private zzva() {
    }

    public static zzuz zza() {
        return (zzuz) zzb.zzt();
    }

    public static zzva zzc(InputStream inputStream, zzajx zzajxVar) throws IOException {
        return (zzva) zzakk.zzy(zzb, inputStream, zzajxVar);
    }

    static /* synthetic */ void zzf(zzva zzvaVar, zzxa zzxaVar) {
        zzxaVar.getClass();
        zzvaVar.zzf = zzxaVar;
        zzvaVar.zzd |= 1;
    }

    public final zzajf zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzE(zzb, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzva();
        }
        zzuy zzuyVar = null;
        if (i2 == 4) {
            return new zzuz(zzuyVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
