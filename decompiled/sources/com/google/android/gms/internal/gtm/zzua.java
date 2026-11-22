package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
class zzua extends zztz {
    protected final byte[] zza;

    zzua(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzud) || zzd() != ((zzud) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzua)) {
            return obj.equals(this);
        }
        zzua zzuaVar = (zzua) obj;
        int iZzk = zzk();
        int iZzk2 = zzuaVar.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzuaVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzuaVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzuaVar.zzd());
        }
        if (!(zzuaVar instanceof zzua)) {
            return zzuaVar.zzf(0, iZzd).equals(zzf(0, iZzd));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzuaVar.zza;
        zzuaVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < iZzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    protected final int zze(int i, int i2, int i3) {
        return zzxs.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public final zzud zzf(int i, int i2) {
        int iZzj = zzj(0, i2, zzd());
        return iZzj == 0 ? zzud.zzb : new zztx(this.zza, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    final void zzh(zztt zzttVar) throws IOException {
        zzttVar.zza(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.gtm.zzud
    public final boolean zzi() {
        return zzaan.zzf(this.zza, 0, zzd());
    }
}
