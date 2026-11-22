package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqk extends zzsa implements zzkp {
    private final Context zzb;
    private final zzox zzc;
    private final zzpe zzd;
    private int zze;
    private boolean zzf;
    private zzam zzg;
    private zzam zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private zzlm zzm;

    public zzqk(Context context, zzrs zzrsVar, zzsc zzscVar, boolean z, Handler handler, zzoy zzoyVar, zzpe zzpeVar) {
        super(1, zzrsVar, zzscVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzpeVar;
        this.zzc = new zzox(handler, zzoyVar);
        zzpeVar.zzp(new zzqj(this, null));
    }

    private final int zzaF(zzrw zzrwVar, zzam zzamVar) {
        if (!"OMX.google.raw.decoder".equals(zzrwVar.zza) || zzfk.zza >= 24 || (zzfk.zza == 23 && zzfk.zzF(this.zzb))) {
            return zzamVar.zzn;
        }
        return -1;
    }

    private static List zzaG(zzsc zzscVar, zzam zzamVar, boolean z, zzpe zzpeVar) throws zzsj {
        zzrw zzrwVarZzd;
        if (zzamVar.zzm == null) {
            return zzfud.zzl();
        }
        return (!zzpeVar.zzy(zzamVar) || (zzrwVarZzd = zzsp.zzd()) == null) ? zzsp.zzh(zzscVar, zzamVar, false, false) : zzfud.zzm(zzrwVarZzd);
    }

    private final void zzaH() {
        long jZzb = this.zzd.zzb(zzS());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.zzk) {
                jZzb = Math.max(this.zzi, jZzb);
            }
            this.zzi = jZzb;
            this.zzk = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final void zzA() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final void zzB() {
        zzaH();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlp
    public final String zzQ() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzln
    public final boolean zzS() {
        return super.zzS() && this.zzd.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzln
    public final boolean zzT() {
        return this.zzd.zzw() || super.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final float zzV(float f, zzam zzamVar, zzam[] zzamVarArr) {
        int iMax = -1;
        for (zzam zzamVar2 : zzamVarArr) {
            int i = zzamVar2.zzA;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final int zzW(zzsc zzscVar, zzam zzamVar) throws zzsj {
        int i;
        boolean z;
        int i2;
        if (!zzcc.zzf(zzamVar.zzm)) {
            return 128;
        }
        int i3 = zzfk.zza >= 21 ? 32 : 0;
        int i4 = zzamVar.zzF;
        boolean zZzaE = zzaE(zzamVar);
        if (zZzaE && (i4 == 0 || zzsp.zzd() != null)) {
            zzom zzomVarZzd = this.zzd.zzd(zzamVar);
            if (zzomVarZzd.zzb) {
                i = true != zzomVarZzd.zzc ? 512 : 1536;
                if (zzomVarZzd.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (this.zzd.zzy(zzamVar)) {
                i2 = i3 | 140;
            }
            return i2 | i;
        }
        i = 0;
        if (("audio/raw".equals(zzamVar.zzm) && !this.zzd.zzy(zzamVar)) || !this.zzd.zzy(zzfk.zzw(2, zzamVar.zzz, zzamVar.zzA))) {
            return 129;
        }
        List listZzaG = zzaG(zzscVar, zzamVar, false, this.zzd);
        if (listZzaG.isEmpty()) {
            return 129;
        }
        if (!zZzaE) {
            return 130;
        }
        zzrw zzrwVar = (zzrw) listZzaG.get(0);
        boolean zZze = zzrwVar.zze(zzamVar);
        if (!zZze) {
            int i5 = 1;
            while (true) {
                if (i5 >= listZzaG.size()) {
                    z = true;
                    break;
                }
                zzrw zzrwVar2 = (zzrw) listZzaG.get(i5);
                if (zzrwVar2.zze(zzamVar)) {
                    zzrwVar = zzrwVar2;
                    z = false;
                    zZze = true;
                    break;
                }
                i5++;
            }
        } else {
            z = true;
            break;
        }
        int i6 = true != zZze ? 3 : 4;
        int i7 = 8;
        if (zZze && zzrwVar.zzf(zzamVar)) {
            i7 = 16;
        }
        i2 = i6 | i7 | i3 | (true != zzrwVar.zzg ? 0 : 64) | (true != z ? 0 : 128);
        return i2 | i;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final zzie zzX(zzrw zzrwVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzie zzieVarZzb = zzrwVar.zzb(zzamVar, zzamVar2);
        int i3 = zzieVarZzb.zze;
        if (zzaC(zzamVar2)) {
            i3 |= 32768;
        }
        if (zzaF(zzrwVar, zzamVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zzrwVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzieVarZzb.zzd;
            i2 = 0;
        }
        return new zzie(str, zzamVar, zzamVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        if (zzbc() == 2) {
            zzaH();
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final zzrr zzab(zzrw zzrwVar, zzam zzamVar, MediaCrypto mediaCrypto, float f) {
        zzam[] zzamVarArrZzP = zzP();
        int length = zzamVarArrZzP.length;
        int iZzaF = zzaF(zzrwVar, zzamVar);
        if (length != 1) {
            for (zzam zzamVar2 : zzamVarArrZzP) {
                if (zzrwVar.zzb(zzamVar, zzamVar2).zzd != 0) {
                    iZzaF = Math.max(iZzaF, zzaF(zzrwVar, zzamVar2));
                }
            }
        }
        this.zze = iZzaF;
        this.zzf = zzfk.zza < 24 && "OMX.SEC.aac.dec".equals(zzrwVar.zza) && "samsung".equals(zzfk.zzc) && (zzfk.zzb.startsWith("zeroflte") || zzfk.zzb.startsWith("herolte") || zzfk.zzb.startsWith("heroqlte"));
        String str = zzrwVar.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", zzamVar.zzz);
        mediaFormat.setInteger("sample-rate", zzamVar.zzA);
        zzeu.zzb(mediaFormat, zzamVar.zzo);
        zzeu.zza(mediaFormat, "max-input-size", i);
        if (zzfk.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzfk.zza != 23 || (!"ZTE B2017G".equals(zzfk.zzd) && !"AXON 7 mini".equals(zzfk.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzfk.zza <= 28 && "audio/ac4".equals(zzamVar.zzm)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzfk.zza >= 24 && this.zzd.zza(zzfk.zzw(4, zzamVar.zzz, zzamVar.zzA)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (zzfk.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.zzh = (!"audio/raw".equals(zzrwVar.zzb) || "audio/raw".equals(zzamVar.zzm)) ? null : zzamVar;
        return zzrr.zza(zzrwVar, mediaFormat, zzamVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final List zzac(zzsc zzscVar, zzam zzamVar, boolean z) throws zzsj {
        return zzsp.zzi(zzaG(zzscVar, zzamVar, false, this.zzd), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzad(Exception exc) {
        zzes.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzae(String str, zzrr zzrrVar, long j, long j2) {
        this.zzc.zzc(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzaf(String str) {
        this.zzc.zzd(str);
    }

    protected final void zzah() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzai(long j) {
        super.zzai(j);
        this.zzj = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzaj() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzak(zzht zzhtVar) {
        if (!this.zzj || zzhtVar.zzf()) {
            return;
        }
        if (Math.abs(zzhtVar.zzd - this.zzi) > 500000) {
            this.zzi = zzhtVar.zzd;
        }
        this.zzj = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final boolean zzan(zzam zzamVar) {
        zzm();
        return this.zzd.zzy(zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzch zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzch zzchVar) {
        this.zzd.zzq(zzchVar);
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzln
    public final zzkp zzk() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzli
    public final void zzt(int i, Object obj) throws zzil {
        if (i == 2) {
            this.zzd.zzu(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.zzd.zzl((zzk) obj);
            return;
        }
        if (i == 6) {
            this.zzd.zzn((zzl) obj);
            return;
        }
        switch (i) {
            case 9:
                this.zzd.zzt(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.zzd.zzm(((Integer) obj).intValue());
                break;
            case 11:
                this.zzm = (zzlm) obj;
                break;
            case 12:
                if (zzfk.zza >= 23) {
                    zzqh.zza(this.zzd, obj);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    protected final void zzw() {
        this.zzl = true;
        this.zzg = null;
        try {
            this.zzd.zzf();
            try {
                super.zzw();
            } finally {
                this.zzc.zze(this.zza);
            }
        } catch (Throwable th) {
            try {
                super.zzw();
                throw th;
            } finally {
                this.zzc.zze(this.zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    protected final void zzx(boolean z, boolean z2) throws zzil {
        super.zzx(z, z2);
        this.zzc.zzf(this.zza);
        zzm();
        this.zzd.zzr(zzn());
        this.zzd.zzo(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    protected final void zzy(long j, boolean z) throws zzil {
        super.zzy(j, z);
        this.zzd.zzf();
        this.zzi = j;
        this.zzj = true;
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzic
    protected final void zzz() {
        try {
            super.zzz();
            if (this.zzl) {
            }
        } finally {
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzk();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzal() throws zzil {
        try {
            this.zzd.zzj();
        } catch (zzpd e) {
            throw zzi(e, e.zzc, e.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final zzie zzY(zzkn zzknVar) throws zzil {
        zzam zzamVar = zzknVar.zza;
        zzamVar.getClass();
        this.zzg = zzamVar;
        zzie zzieVarZzY = super.zzY(zzknVar);
        this.zzc.zzg(this.zzg, zzieVarZzY);
        return zzieVarZzY;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final boolean zzam(long j, long j2, zzrt zzrtVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zzil {
        byteBuffer.getClass();
        if (this.zzh != null && (i2 & 2) != 0) {
            zzrtVar.getClass();
            zzrtVar.zzn(i, false);
            return true;
        }
        if (z) {
            if (zzrtVar != null) {
                zzrtVar.zzn(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzv(byteBuffer, j3, i3)) {
                return false;
            }
            if (zzrtVar != null) {
                zzrtVar.zzn(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (zzpa e) {
            throw zzi(e, this.zzg, e.zzb, 5001);
        } catch (zzpd e2) {
            throw zzi(e2, zzamVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    protected final void zzag(zzam zzamVar, MediaFormat mediaFormat) throws zzil {
        int iZzk;
        int i;
        zzam zzamVar2 = this.zzh;
        int[] iArr = null;
        if (zzamVar2 != null) {
            zzamVar = zzamVar2;
        } else if (zzaq() != null) {
            if ("audio/raw".equals(zzamVar.zzm)) {
                iZzk = zzamVar.zzB;
            } else if (zzfk.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iZzk = mediaFormat.containsKey("v-bits-per-sample") ? zzfk.zzk(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iZzk = mediaFormat.getInteger("pcm-encoding");
            }
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/raw");
            zzakVar.zzN(iZzk);
            zzakVar.zzC(zzamVar.zzC);
            zzakVar.zzD(zzamVar.zzD);
            zzakVar.zzw(mediaFormat.getInteger("channel-count"));
            zzakVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzam zzamVarZzY = zzakVar.zzY();
            if (this.zzf && zzamVarZzY.zzz == 6 && (i = zzamVar.zzz) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < zzamVar.zzz; i2++) {
                    iArr[i2] = i2;
                }
            }
            zzamVar = zzamVarZzY;
        }
        try {
            if (zzfk.zza >= 29) {
                if (zzaB()) {
                    zzm();
                }
                zzdy.zzf(zzfk.zza >= 29);
            }
            this.zzd.zze(zzamVar, 0, iArr);
        } catch (zzoz e) {
            throw zzi(e, e.zza, false, 5001);
        }
    }
}
