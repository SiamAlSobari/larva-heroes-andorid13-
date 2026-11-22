package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrf implements zzrs {
    private final zzfry zzb;
    private final zzfry zzc;

    public zzrf(int i, boolean z) {
        zzrd zzrdVar = new zzrd(i);
        zzre zzreVar = new zzre(i);
        this.zzb = zzrdVar;
        this.zzc = zzreVar;
    }

    static /* synthetic */ HandlerThread zza(int i) {
        return new HandlerThread(zzrh.zzs(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ HandlerThread zzb(int i) {
        return new HandlerThread(zzrh.zzs(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    public final zzrh zzc(zzrr zzrrVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = zzrrVar.zza.zza;
        zzrh zzrhVar = null;
        try {
            int i = zzfk.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zzrh zzrhVar2 = new zzrh(mediaCodecCreateByCodecName, zza(((zzrd) this.zzb).zza), zzb(((zzre) this.zzc).zza), false, null);
                try {
                    Trace.endSection();
                    zzrh.zzh(zzrhVar2, zzrrVar.zzb, zzrrVar.zzd, null, 0);
                    return zzrhVar2;
                } catch (Exception e) {
                    e = e;
                    zzrhVar = zzrhVar2;
                    if (zzrhVar != null) {
                        zzrhVar.zzl();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }
}
