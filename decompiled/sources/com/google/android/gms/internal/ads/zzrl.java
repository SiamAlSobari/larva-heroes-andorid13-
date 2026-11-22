package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzrl {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzeb zzg;
    private boolean zzh;

    public zzrl(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzebVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static /* bridge */ /* synthetic */ void zza(zzrl zzrlVar, Message message) {
        zzrk zzrkVar;
        ArrayDeque arrayDeque;
        int i = message.what;
        zzrk zzrkVar2 = null;
        if (i != 0) {
            if (i == 1) {
                zzrkVar = (zzrk) message.obj;
                int i2 = zzrkVar.zza;
                int i3 = zzrkVar.zzb;
                MediaCodec.CryptoInfo cryptoInfo = zzrkVar.zzd;
                long j = zzrkVar.zze;
                int i4 = zzrkVar.zzf;
                try {
                    synchronized (zzb) {
                        zzrlVar.zzc.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i4);
                    }
                } catch (RuntimeException e) {
                    zzri.zza(zzrlVar.zzf, null, e);
                }
            } else if (i != 2) {
                zzri.zza(zzrlVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                zzrlVar.zzg.zze();
            }
            if (zzrkVar2 != null) {
                arrayDeque = zza;
                synchronized (arrayDeque) {
                    arrayDeque.add(zzrkVar2);
                }
            }
        }
        zzrkVar = (zzrk) message.obj;
        int i5 = zzrkVar.zza;
        int i6 = zzrkVar.zzb;
        try {
            zzrlVar.zzc.queueInputBuffer(i5, 0, zzrkVar.zzc, zzrkVar.zze, zzrkVar.zzf);
        } catch (RuntimeException e2) {
            zzri.zza(zzrlVar.zzf, null, e2);
        }
        zzrkVar2 = zzrkVar;
        if (zzrkVar2 != null) {
            arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzrkVar2);
            }
        }
    }

    private static zzrk zzh() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzrk();
            }
            return (zzrk) arrayDeque.removeFirst();
        }
    }

    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void zzd(int i, int i2, int i3, long j, int i4) {
        zzc();
        zzrk zzrkVarZzh = zzh();
        zzrkVarZzh.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzfk.zza;
        handler.obtainMessage(0, zzrkVarZzh).sendToTarget();
    }

    public final void zze(int i, int i2, zzhq zzhqVar, long j, int i3) {
        zzc();
        zzrk zzrkVarZzh = zzh();
        zzrkVarZzh.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzrkVarZzh.zzd;
        cryptoInfo.numSubSamples = zzhqVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzhqVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzhqVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzi = zzi(zzhqVar.zzb, cryptoInfo.key);
        bArrZzi.getClass();
        cryptoInfo.key = bArrZzi;
        byte[] bArrZzi2 = zzi(zzhqVar.zza, cryptoInfo.iv);
        bArrZzi2.getClass();
        cryptoInfo.iv = bArrZzi2;
        cryptoInfo.mode = zzhqVar.zzc;
        if (zzfk.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhqVar.zzg, zzhqVar.zzh));
        }
        this.zze.obtainMessage(1, zzrkVarZzh).sendToTarget();
    }

    public final void zzf() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzg() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzrj(this, this.zzd.getLooper());
        this.zzh = true;
    }

    private static byte[] zzi(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }
}
