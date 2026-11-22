package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgnd extends zzgrq implements zzgtb {
    private static final zzgnd zzb;
    private int zzd;
    private zzgrz zze = zzaN();

    static {
        zzgnd zzgndVar = new zzgnd();
        zzb = zzgndVar;
        zzgrq.zzaU(zzgnd.class, zzgndVar);
    }

    private zzgnd() {
    }

    public static zzgna zzd() {
        return (zzgna) zzb.zzaA();
    }

    public static zzgnd zzg(InputStream inputStream, zzgrc zzgrcVar) throws IOException {
        return (zzgnd) zzgrq.zzaH(zzb, inputStream, zzgrcVar);
    }

    static /* synthetic */ void zzj(zzgnd zzgndVar, zzgnc zzgncVar) {
        zzgncVar.getClass();
        zzgrz zzgrzVar = zzgndVar.zze;
        if (!zzgrzVar.zzc()) {
            zzgndVar.zze = zzgrq.zzaO(zzgrzVar);
        }
        zzgndVar.zze.add(zzgncVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgnc.class});
        }
        if (i2 == 3) {
            return new zzgnd();
        }
        zzgmz zzgmzVar = null;
        if (i2 == 4) {
            return new zzgna(zzgmzVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzgnc zze(int i) {
        return (zzgnc) this.zze.get(i);
    }

    public final List zzh() {
        return this.zze;
    }
}
