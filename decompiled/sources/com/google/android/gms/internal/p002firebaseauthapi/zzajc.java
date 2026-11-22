package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
class zzajc extends zzajb {
    protected final byte[] zza;

    zzajc(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzajf) || zzd() != ((zzajf) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzajc)) {
            return obj.equals(this);
        }
        zzajc zzajcVar = (zzajc) obj;
        int iZzm = zzm();
        int iZzm2 = zzajcVar.zzm();
        if (iZzm != 0 && iZzm2 != 0 && iZzm != iZzm2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzajcVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzajcVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzajcVar.zzd());
        }
        if (!(zzajcVar instanceof zzajc)) {
            return zzajcVar.zzg(0, iZzd).equals(zzg(0, iZzd));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzajcVar.zza;
        zzajcVar.zzc();
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    protected final int zzf(int i, int i2, int i3) {
        return zzakq.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final zzajf zzg(int i, int i2) {
        int iZzl = zzl(0, i2, zzd());
        return iZzl == 0 ? zzajf.zzb : new zzaiz(this.zza, 0, iZzl);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final zzajl zzh() {
        return zzajl.zzH(this.zza, 0, zzd(), true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    protected final String zzi(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    final void zzj(zzaiv zzaivVar) throws IOException {
        zzaivVar.zza(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    public final boolean zzk() {
        return zzank.zzf(this.zza, 0, zzd());
    }
}
