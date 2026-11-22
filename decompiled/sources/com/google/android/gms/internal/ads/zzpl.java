package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpl {
    public static zzom zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzom.zza;
        }
        zzok zzokVar = new zzok();
        boolean z2 = false;
        if (zzfk.zza > 32 && playbackOffloadSupport == 2) {
            z2 = true;
        }
        zzokVar.zza(true);
        zzokVar.zzb(z2);
        zzokVar.zzc(z);
        return zzokVar.zzd();
    }
}
