package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import kotlin.time.DurationKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqe implements zzpe {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private float zzI;
    private ByteBuffer zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private byte[] zzM;
    private int zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzl zzT;
    private zzpq zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private final zzpu zzY;
    private final zzpm zzZ;
    private final zzpj zzd;
    private final zzqo zze;
    private final zzfud zzf;
    private final zzfud zzg;
    private final zzeb zzh;
    private final zzpi zzi;
    private final ArrayDeque zzj;
    private zzqc zzk;
    private final zzpx zzl;
    private final zzpx zzm;
    private final zzpr zzn;
    private zzoh zzo;
    private zzpb zzp;
    private zzpt zzq;
    private zzpt zzr;
    private zzdo zzs;
    private AudioTrack zzt;
    private zzoj zzu;
    private zzk zzv;
    private zzpw zzw;
    private zzpw zzx;
    private zzch zzy;
    private boolean zzz;

    /* synthetic */ zzqe(zzps zzpsVar, zzqd zzqdVar) {
        this.zzu = zzpsVar.zza;
        this.zzY = zzpsVar.zzd;
        int i = zzfk.zza;
        this.zzn = zzpsVar.zzc;
        zzpm zzpmVar = zzpsVar.zze;
        zzpmVar.getClass();
        this.zzZ = zzpmVar;
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zzh = zzebVar;
        zzebVar.zze();
        this.zzi = new zzpi(new zzpz(this, null));
        zzpj zzpjVar = new zzpj();
        this.zzd = zzpjVar;
        zzqo zzqoVar = new zzqo();
        this.zze = zzqoVar;
        this.zzf = zzfud.zzo(new zzdv(), zzpjVar, zzqoVar);
        this.zzg = zzfud.zzm(new zzqn());
        this.zzI = 1.0f;
        this.zzv = zzk.zza;
        this.zzS = 0;
        this.zzT = new zzl(0, 0.0f);
        this.zzx = new zzpw(zzch.zza, 0L, 0L, null);
        this.zzy = zzch.zza;
        this.zzz = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzpx(100L);
        this.zzm = new zzpx(100L);
    }

    static /* synthetic */ void zzE(AudioTrack audioTrack, zzeb zzebVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzebVar.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            zzebVar.zze();
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzG() {
        zzpt zzptVar = this.zzr;
        return zzptVar.zzc == 0 ? this.zzA / ((long) zzptVar.zzb) : this.zzB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzH() {
        zzpt zzptVar = this.zzr;
        return zzptVar.zzc == 0 ? this.zzC / ((long) zzptVar.zzd) : this.zzD;
    }

    private final AudioTrack zzI(zzpt zzptVar) throws zzpa {
        try {
            return zzptVar.zzb(false, this.zzv, this.zzS);
        } catch (zzpa e) {
            zzpb zzpbVar = this.zzp;
            if (zzpbVar != null) {
                zzpbVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzJ(long j) {
        zzch zzchVar;
        boolean z;
        if (zzT()) {
            zzpu zzpuVar = this.zzY;
            zzchVar = this.zzy;
            zzpuVar.zzc(zzchVar);
        } else {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        this.zzy = zzchVar2;
        if (zzT()) {
            zzpu zzpuVar2 = this.zzY;
            z = this.zzz;
            zzpuVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzz = z;
        this.zzj.add(new zzpw(zzchVar2, Math.max(0L, j), this.zzr.zza(zzH()), null));
        zzO();
        zzpb zzpbVar = this.zzp;
        if (zzpbVar != null) {
            ((zzqj) zzpbVar).zza.zzc.zzs(this.zzz);
        }
    }

    private final void zzK() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        this.zzi.zzc(zzH());
        this.zzt.stop();
    }

    private final void zzL(long j) throws Exception {
        ByteBuffer byteBufferZzb;
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzJ;
            if (byteBuffer == null) {
                byteBuffer = zzdr.zza;
            }
            zzP(byteBuffer, j);
            return;
        }
        while (!this.zzs.zzg()) {
            do {
                byteBufferZzb = this.zzs.zzb();
                if (byteBufferZzb.hasRemaining()) {
                    zzP(byteBufferZzb, j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzJ;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzs.zze(this.zzJ);
                    }
                }
            } while (!byteBufferZzb.hasRemaining());
            return;
        }
    }

    private final void zzM(zzch zzchVar) {
        zzpw zzpwVar = new zzpw(zzchVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzR()) {
            this.zzw = zzpwVar;
        } else {
            this.zzx = zzpwVar;
        }
    }

    private final void zzN() {
        if (zzR()) {
            if (zzfk.zza >= 21) {
                this.zzt.setVolume(this.zzI);
                return;
            }
            AudioTrack audioTrack = this.zzt;
            float f = this.zzI;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzO() {
        zzdo zzdoVar = this.zzr.zzi;
        this.zzs = zzdoVar;
        zzdoVar.zzc();
    }

    private final void zzP(ByteBuffer byteBuffer, long j) throws Exception {
        int iWrite;
        zzpb zzpbVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzL;
            if (byteBuffer2 != null) {
                zzdy.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzL = byteBuffer;
                if (zzfk.zza < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.zzM;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.zzM = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.zzM, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.zzN = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (zzfk.zza < 21) {
                int iZza = this.zzi.zza(this.zzC);
                if (iZza > 0) {
                    iWrite = this.zzt.write(this.zzM, this.zzN, Math.min(iRemaining2, iZza));
                    if (iWrite > 0) {
                        this.zzN += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else {
                iWrite = this.zzt.write(byteBuffer, iRemaining2, 1);
            }
            this.zzV = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                zzpd zzpdVar = new zzpd(iWrite, this.zzr.zza, ((zzfk.zza >= 24 && iWrite == -6) || iWrite == -32) && this.zzD > 0);
                zzpb zzpbVar2 = this.zzp;
                if (zzpbVar2 != null) {
                    zzpbVar2.zza(zzpdVar);
                }
                if (zzpdVar.zzb) {
                    this.zzu = zzoj.zza;
                    throw zzpdVar;
                }
                this.zzm.zzb(zzpdVar);
                return;
            }
            this.zzm.zza();
            if (zzS(this.zzt)) {
                if (this.zzD > 0) {
                    this.zzX = false;
                }
                if (this.zzQ && (zzpbVar = this.zzp) != null && iWrite < iRemaining2) {
                    zzqk zzqkVar = ((zzqj) zzpbVar).zza;
                    if (zzqkVar.zzm != null) {
                        zzqkVar.zzm.zza();
                    }
                }
            }
            int i = this.zzr.zzc;
            if (i == 0) {
                this.zzC += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i != 0) {
                    zzdy.zzf(byteBuffer == this.zzJ);
                    this.zzD += ((long) this.zzE) * ((long) this.zzK);
                }
                this.zzL = null;
            }
        }
    }

    private final boolean zzQ() throws Exception {
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzL;
            if (byteBuffer == null) {
                return true;
            }
            zzP(byteBuffer, Long.MIN_VALUE);
            return this.zzL == null;
        }
        this.zzs.zzd();
        zzL(Long.MIN_VALUE);
        if (!this.zzs.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzL;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean zzR() {
        return this.zzt != null;
    }

    private static boolean zzS(AudioTrack audioTrack) {
        return zzfk.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzT() {
        zzpt zzptVar = this.zzr;
        if (zzptVar.zzc != 0) {
            return false;
        }
        int i = zzptVar.zza.zzB;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final int zza(zzam zzamVar) {
        if (!"audio/raw".equals(zzamVar.zzm)) {
            return this.zzu.zza(zzamVar) != null ? 2 : 0;
        }
        if (zzfk.zzE(zzamVar.zzB)) {
            return zzamVar.zzB != 2 ? 1 : 2;
        }
        zzes.zzf("DefaultAudioSink", "Invalid PCM encoding: " + zzamVar.zzB);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final long zzb(boolean z) {
        long jZzn;
        if (!zzR() || this.zzG) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzi.zzb(z), this.zzr.zza(zzH()));
        while (!this.zzj.isEmpty() && jMin >= ((zzpw) this.zzj.getFirst()).zzc) {
            this.zzx = (zzpw) this.zzj.remove();
        }
        zzpw zzpwVar = this.zzx;
        long j = jMin - zzpwVar.zzc;
        if (zzpwVar.zza.equals(zzch.zza)) {
            jZzn = this.zzx.zzb + j;
        } else if (this.zzj.isEmpty()) {
            jZzn = this.zzY.zza(j) + this.zzx.zzb;
        } else {
            zzpw zzpwVar2 = (zzpw) this.zzj.getFirst();
            jZzn = zzpwVar2.zzb - zzfk.zzn(zzpwVar2.zzc - jMin, this.zzx.zza.zzc);
        }
        return jZzn + this.zzr.zza(this.zzY.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final zzch zzc() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final zzom zzd(zzam zzamVar) {
        return this.zzW ? zzom.zza : this.zzZ.zza(zzamVar, this.zzv);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0164  */
    /* JADX WARN: Code duplicated, block: B:55:0x0167  */
    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zze(zzam zzamVar, int i, int[] iArr) throws zzoz {
        int iIntValue;
        int i2;
        zzdo zzdoVar;
        int iIntValue2;
        int iZzl;
        int i3;
        int iZzl2;
        int iMax;
        int i4;
        zzpt zzptVar;
        int[] iArr2;
        if ("audio/raw".equals(zzamVar.zzm)) {
            zzdy.zzd(zzfk.zzE(zzamVar.zzB));
            iZzl = zzfk.zzl(zzamVar.zzB, zzamVar.zzz);
            zzfua zzfuaVar = new zzfua();
            int i5 = zzamVar.zzB;
            zzfuaVar.zzh(this.zzf);
            zzfuaVar.zzg(this.zzY.zze());
            zzdo zzdoVar2 = new zzdo(zzfuaVar.zzi());
            if (zzdoVar2.equals(this.zzs)) {
                zzdoVar2 = this.zzs;
            }
            this.zze.zzq(zzamVar.zzC, zzamVar.zzD);
            if (zzfk.zza < 21 && zzamVar.zzz == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i6 = 0; i6 < 6; i6++) {
                    iArr2[i6] = i6;
                }
            } else {
                iArr2 = iArr;
            }
            this.zzd.zzo(iArr2);
            try {
                zzdp zzdpVarZza = zzdoVar2.zza(new zzdp(zzamVar.zzA, zzamVar.zzz, zzamVar.zzB));
                iIntValue = zzdpVarZza.zzd;
                int i7 = zzdpVarZza.zzb;
                int i8 = zzdpVarZza.zzc;
                iIntValue2 = zzfk.zzg(i8);
                iZzl2 = zzfk.zzl(iIntValue, i8);
                zzdoVar = zzdoVar2;
                i3 = i7;
                i2 = 0;
            } catch (zzdq e) {
                throw new zzoz(e, zzamVar);
            }
        } else {
            zzdo zzdoVar3 = new zzdo(zzfud.zzl());
            int i9 = zzamVar.zzA;
            zzom zzomVar = zzom.zza;
            Pair pairZza = this.zzu.zza(zzamVar);
            if (pairZza == null) {
                throw new zzoz("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzamVar))), zzamVar);
            }
            iIntValue = ((Integer) pairZza.first).intValue();
            i2 = 2;
            zzdoVar = zzdoVar3;
            iIntValue2 = ((Integer) pairZza.second).intValue();
            iZzl = -1;
            i3 = i9;
            iZzl2 = -1;
        }
        if (iIntValue == 0) {
            throw new zzoz("Invalid output encoding (mode=" + i2 + ") for: " + String.valueOf(zzamVar), zzamVar);
        }
        if (iIntValue2 == 0) {
            throw new zzoz("Invalid output channel config (mode=" + i2 + ") for: " + String.valueOf(zzamVar), zzamVar);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue2, iIntValue);
        zzdy.zzf(minBufferSize != -2);
        int i10 = iZzl2 != -1 ? iZzl2 : 1;
        int i11 = zzamVar.zzi;
        int i12 = 250000;
        if (i2 != 0) {
            if (i2 != 1) {
                int i13 = 5;
                if (iIntValue == 5) {
                    i12 = 500000;
                    iIntValue = 5;
                } else {
                    i13 = iIntValue;
                }
                iZzl2 = iZzl2;
                iMax = zzfwl.zza((((long) i12) * ((long) (i11 != -1 ? zzfwj.zza(i11, 8, RoundingMode.CEILING) : zzqg.zzb(iIntValue)))) / 1000000);
                i4 = i13;
            } else {
                iMax = zzfwl.zza((((long) zzqg.zzb(iIntValue)) * 50000000) / 1000000);
            }
            int iMax2 = (((Math.max(minBufferSize, iMax) + i10) - 1) / i10) * i10;
            this.zzW = false;
            zzptVar = new zzpt(zzamVar, iZzl, i2, iZzl2, i3, iIntValue2, i4, iMax2, zzdoVar, false, false);
            if (zzR()) {
                this.zzq = zzptVar;
            } else {
                this.zzr = zzptVar;
            }
        }
        iMax = Math.max(zzqg.zza(250000, i3, i10), Math.min(minBufferSize * 4, zzqg.zza(750000, i3, i10)));
        i4 = iIntValue;
        int iMax3 = (((Math.max(minBufferSize, iMax) + i10) - 1) / i10) * i10;
        this.zzW = false;
        zzptVar = new zzpt(zzamVar, iZzl, i2, iZzl2, i3, iIntValue2, i4, iMax3, zzdoVar, false, false);
        if (zzR()) {
            this.zzq = zzptVar;
        } else {
            this.zzr = zzptVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzf() {
        if (zzR()) {
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzX = false;
            this.zzE = 0;
            this.zzx = new zzpw(this.zzy, 0L, 0L, null);
            this.zzH = 0L;
            this.zzw = null;
            this.zzj.clear();
            this.zzJ = null;
            this.zzK = 0;
            this.zzL = null;
            this.zzP = false;
            this.zzO = false;
            this.zze.zzp();
            zzO();
            if (this.zzi.zzi()) {
                this.zzt.pause();
            }
            if (zzS(this.zzt)) {
                zzqc zzqcVar = this.zzk;
                zzqcVar.getClass();
                zzqcVar.zzb(this.zzt);
            }
            if (zzfk.zza < 21 && !this.zzR) {
                this.zzS = 0;
            }
            zzpt zzptVar = this.zzq;
            if (zzptVar != null) {
                this.zzr = zzptVar;
                this.zzq = null;
            }
            this.zzi.zzd();
            final AudioTrack audioTrack = this.zzt;
            final zzeb zzebVar = this.zzh;
            zzebVar.zzc();
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzfk.zzB("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqe.zzE(audioTrack, zzebVar);
                    }
                });
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzg() {
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzh() {
        this.zzQ = false;
        if (zzR() && this.zzi.zzl()) {
            this.zzt.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzi() {
        this.zzQ = true;
        if (zzR()) {
            this.zzi.zzg();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzj() throws zzpd {
        if (!this.zzO && zzR() && zzQ()) {
            zzK();
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzk() {
        zzf();
        zzfud zzfudVar = this.zzf;
        int size = zzfudVar.size();
        for (int i = 0; i < size; i++) {
            ((zzdr) zzfudVar.get(i)).zzf();
        }
        zzfud zzfudVar2 = this.zzg;
        int size2 = zzfudVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzdr) zzfudVar2.get(i2)).zzf();
        }
        zzdo zzdoVar = this.zzs;
        if (zzdoVar != null) {
            zzdoVar.zzf();
        }
        this.zzQ = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzl(zzk zzkVar) {
        if (this.zzv.equals(zzkVar)) {
            return;
        }
        this.zzv = zzkVar;
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzm(int i) {
        if (this.zzS != i) {
            this.zzS = i;
            this.zzR = i != 0;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzn(zzl zzlVar) {
        if (this.zzT.equals(zzlVar)) {
            return;
        }
        int i = zzlVar.zza;
        float f = zzlVar.zzb;
        if (this.zzt != null) {
            int i2 = this.zzT.zza;
        }
        this.zzT = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzo(zzdz zzdzVar) {
        this.zzi.zzf(zzdzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzp(zzpb zzpbVar) {
        this.zzp = zzpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzq(zzch zzchVar) {
        this.zzy = new zzch(Math.max(0.1f, Math.min(zzchVar.zzc, 8.0f)), Math.max(0.1f, Math.min(zzchVar.zzd, 8.0f)));
        zzM(zzchVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzr(zzoh zzohVar) {
        this.zzo = zzohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzt(boolean z) {
        this.zzz = z;
        zzM(this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzu(float f) {
        if (this.zzI != f) {
            this.zzI = f;
            zzN();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:115:0x021b  */
    /* JADX WARN: Code duplicated, block: B:146:0x02cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:190:0x03ad A[Catch: zzpa -> 0x03b1, TryCatch #0 {zzpa -> 0x03b1, blocks: (B:36:0x0077, B:49:0x00ce, B:51:0x00d6, B:53:0x00dc, B:54:0x00e3, B:55:0x00ec, B:57:0x00f2, B:59:0x00f6, B:60:0x00fb, B:64:0x0111, B:66:0x0125, B:68:0x012b, B:69:0x0130, B:45:0x008c, B:47:0x0095, B:188:0x03a5, B:190:0x03ad, B:191:0x03b0, B:39:0x0080, B:41:0x0085), top: B:201:0x0077, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:210:? A[Catch: zzpa -> 0x03b1, SYNTHETIC, TRY_LEAVE, TryCatch #0 {zzpa -> 0x03b1, blocks: (B:36:0x0077, B:49:0x00ce, B:51:0x00d6, B:53:0x00dc, B:54:0x00e3, B:55:0x00ec, B:57:0x00f2, B:59:0x00f6, B:60:0x00fb, B:64:0x0111, B:66:0x0125, B:68:0x012b, B:69:0x0130, B:45:0x008c, B:47:0x0095, B:188:0x03a5, B:190:0x03ad, B:191:0x03b0, B:39:0x0080, B:41:0x0085), top: B:201:0x0077, inners: #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzpe
    public final boolean zzv(ByteBuffer byteBuffer, long j, int i) throws Exception {
        AudioTrack audioTrackZzI;
        zzoh zzohVar;
        boolean z;
        int iZza;
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int i6;
        ByteBuffer byteBuffer2 = this.zzJ;
        zzdy.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzq != null) {
            if (!zzQ()) {
                return false;
            }
            zzpt zzptVar = this.zzq;
            zzpt zzptVar2 = this.zzr;
            if (zzptVar2.zzc == zzptVar.zzc && zzptVar2.zzg == zzptVar.zzg && zzptVar2.zze == zzptVar.zze && zzptVar2.zzf == zzptVar.zzf && zzptVar2.zzd == zzptVar.zzd) {
                boolean z2 = zzptVar2.zzj;
                boolean z3 = zzptVar.zzj;
                boolean z4 = zzptVar2.zzk;
                boolean z5 = zzptVar.zzk;
                this.zzr = zzptVar;
                this.zzq = null;
                AudioTrack audioTrack = this.zzt;
                if (audioTrack != null && zzS(audioTrack)) {
                    boolean z6 = this.zzr.zzk;
                }
            } else {
                zzK();
                if (zzw()) {
                    return false;
                }
                zzf();
            }
            zzJ(j);
        }
        if (!zzR()) {
            try {
                if (!this.zzh.zzd()) {
                    return false;
                }
                try {
                    zzpt zzptVar3 = this.zzr;
                    zzptVar3.getClass();
                    audioTrackZzI = zzI(zzptVar3);
                } catch (zzpa e) {
                    zzpt zzptVar4 = this.zzr;
                    if (zzptVar4.zzh > 1000000) {
                        zzam zzamVar = zzptVar4.zza;
                        int i7 = zzptVar4.zzb;
                        int i8 = zzptVar4.zzc;
                        int i9 = zzptVar4.zzd;
                        int i10 = zzptVar4.zze;
                        int i11 = zzptVar4.zzf;
                        int i12 = zzptVar4.zzg;
                        zzdo zzdoVar = zzptVar4.zzi;
                        boolean z7 = zzptVar4.zzj;
                        boolean z8 = zzptVar4.zzk;
                        zzpt zzptVar5 = new zzpt(zzamVar, i7, i8, i9, i10, i11, i12, DurationKt.NANOS_IN_MILLIS, zzdoVar, false, false);
                        try {
                            audioTrackZzI = zzI(zzptVar5);
                            this.zzr = zzptVar5;
                        } catch (zzpa e2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                            } catch (Exception unused) {
                            }
                            if (this.zzr.zzc()) {
                                throw e;
                            }
                            this.zzW = true;
                            throw e;
                        }
                    }
                    if (this.zzr.zzc()) {
                        throw e;
                    }
                    this.zzW = true;
                    throw e;
                }
                this.zzt = audioTrackZzI;
                if (zzS(audioTrackZzI)) {
                    AudioTrack audioTrack2 = this.zzt;
                    if (this.zzk == null) {
                        this.zzk = new zzqc(this);
                    }
                    this.zzk.zza(audioTrack2);
                    boolean z9 = this.zzr.zzk;
                }
                if (zzfk.zza >= 31 && (zzohVar = this.zzo) != null) {
                    zzpp.zza(this.zzt, zzohVar);
                }
                this.zzS = this.zzt.getAudioSessionId();
                zzpi zzpiVar = this.zzi;
                AudioTrack audioTrack3 = this.zzt;
                zzpt zzptVar6 = this.zzr;
                zzpiVar.zze(audioTrack3, zzptVar6.zzc == 2, zzptVar6.zzg, zzptVar6.zzd, zzptVar6.zzh);
                zzN();
                int i13 = this.zzT.zza;
                zzpq zzpqVar = this.zzU;
                if (zzpqVar != null && zzfk.zza >= 23) {
                    zzpo.zza(this.zzt, zzpqVar);
                }
                this.zzG = true;
            } catch (zzpa e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.zzl.zzb(e3);
                return false;
            }
        }
        this.zzl.zza();
        if (this.zzG) {
            this.zzH = Math.max(0L, j);
            this.zzF = false;
            this.zzG = false;
            zzJ(j);
            if (this.zzQ) {
                zzi();
            }
        }
        if (!this.zzi.zzk(zzH())) {
            return false;
        }
        if (this.zzJ == null) {
            zzdy.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzpt zzptVar7 = this.zzr;
            if (zzptVar7.zzc != 0 && this.zzE == 0) {
                int i14 = zzptVar7.zzg;
                switch (i14) {
                    case 5:
                    case 6:
                    case 18:
                        z = true;
                        iZza = zzaac.zza(byteBuffer);
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z;
                        }
                        break;
                    case 7:
                    case 8:
                        int i15 = zzaay.zza;
                        if (byteBuffer.getInt(0) != -233094848) {
                            if (byteBuffer.getInt(0) == -398277519) {
                                iZza = 1024;
                            } else if (byteBuffer.getInt(0) == 622876772) {
                                iZza = 4096;
                            } else {
                                int iPosition = byteBuffer.position();
                                byte b2 = byteBuffer.get(iPosition);
                                if (b2 != -2) {
                                    if (b2 != -1) {
                                        if (b2 != 31) {
                                            i4 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                            i5 = byteBuffer.get(iPosition + 5) & 252;
                                            i3 = 2;
                                        } else {
                                            i3 = 2;
                                            i4 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                            b = byteBuffer.get(iPosition + 6);
                                        }
                                        i2 = (i5 >> i3) | i4;
                                        z = true;
                                    } else {
                                        i3 = 2;
                                        i4 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                        b = byteBuffer.get(iPosition + 7);
                                    }
                                    i5 = b & 60;
                                    i2 = (i5 >> i3) | i4;
                                    z = true;
                                } else {
                                    z = true;
                                    i2 = ((byteBuffer.get(iPosition + 4) & 252) >> 2) | ((byteBuffer.get(iPosition + 5) & 1) << 6);
                                }
                                iZza = (i2 + (z ? 1 : 0)) * 32;
                            }
                            z = true;
                        } else {
                            z = true;
                            iZza = 1024;
                        }
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z;
                        }
                        break;
                    case 9:
                        iZza = zzabv.zzc(zzfk.zzh(byteBuffer, byteBuffer.position()));
                        if (iZza == -1) {
                            throw new IllegalArgumentException();
                        }
                        z = true;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z;
                        }
                        break;
                    case 10:
                    case 16:
                        iZza = 1024;
                        z = true;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z;
                        }
                        break;
                    case 11:
                    case 12:
                        iZza = 2048;
                        z = true;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z;
                        }
                        break;
                    case 13:
                    case 19:
                    default:
                        throw new IllegalStateException("Unexpected audio encoding: " + i14);
                    case 14:
                        int i16 = zzaac.zza;
                        int iPosition2 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i17 = iPosition2;
                        while (true) {
                            if (i17 > iLimit) {
                                i6 = -1;
                            } else if ((zzfk.zzh(byteBuffer, i17 + 4) & (-2)) == -126718022) {
                                i6 = i17 - iPosition2;
                            } else {
                                i17++;
                            }
                        }
                        if (i6 == -1) {
                            iZza = 0;
                        } else {
                            iZza = (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        }
                        z = true;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z;
                        }
                        break;
                    case 15:
                        iZza = 512;
                        z = true;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z;
                        }
                        break;
                    case 17:
                        int i18 = zzaaf.zza;
                        byte[] bArr = new byte[16];
                        int iPosition3 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition3);
                        iZza = zzaaf.zza(new zzfa(bArr, 16)).zzc;
                        z = true;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z;
                        }
                        break;
                    case 20:
                        iZza = zzabw.zza(byteBuffer);
                        z = true;
                        this.zzE = iZza;
                        if (iZza == 0) {
                            return z;
                        }
                        break;
                }
            }
            if (this.zzw != null) {
                if (!zzQ()) {
                    return false;
                }
                zzJ(j);
                this.zzw = null;
            }
            long jZzG = this.zzH + (((zzG() - this.zze.zzo()) * 1000000) / ((long) this.zzr.zza.zzA));
            if (!this.zzF && Math.abs(jZzG - j) > 200000) {
                zzpb zzpbVar = this.zzp;
                if (zzpbVar != null) {
                    zzpbVar.zza(new zzpc(j, jZzG));
                }
                this.zzF = true;
            }
            if (this.zzF) {
                if (!zzQ()) {
                    return false;
                }
                long j2 = j - jZzG;
                this.zzH += j2;
                this.zzF = false;
                zzJ(j);
                zzpb zzpbVar2 = this.zzp;
                if (zzpbVar2 != null && j2 != 0) {
                    ((zzqj) zzpbVar2).zza.zzah();
                }
            }
            if (this.zzr.zzc == 0) {
                this.zzA += (long) byteBuffer.remaining();
            } else {
                this.zzB += ((long) this.zzE) * ((long) i);
            }
            this.zzJ = byteBuffer;
            this.zzK = i;
        }
        zzL(j);
        if (!this.zzJ.hasRemaining()) {
            this.zzJ = null;
            this.zzK = 0;
            return true;
        }
        if (!this.zzi.zzj(zzH())) {
            return false;
        }
        zzes.zzf("DefaultAudioSink", "Resetting stalled audio track");
        zzf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final boolean zzw() {
        return zzR() && this.zzi.zzh(zzH());
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final boolean zzx() {
        if (zzR()) {
            return this.zzO && !zzw();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final boolean zzy(zzam zzamVar) {
        return zza(zzamVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzs(AudioDeviceInfo audioDeviceInfo) {
        zzpq zzpqVar = audioDeviceInfo == null ? null : new zzpq(audioDeviceInfo);
        this.zzU = zzpqVar;
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzpo.zza(audioTrack, zzpqVar);
        }
    }
}
