package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzoi {
    private static final AudioAttributes zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int zza(int i, int i2) {
        for (int i3 = 10; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(zzfk.zzg(i3)).build(), zza)) {
                return i3;
            }
        }
        return 0;
    }

    public static zzfud<Integer> zzb() {
        zzfua zzfuaVar = new zzfua();
        zzfwd it = zzoj.zzc.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (zzfk.zza >= zzfk.zzf(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zza)) {
                zzfuaVar.zzf(Integer.valueOf(iIntValue));
            }
        }
        zzfuaVar.zzf((Object) 2);
        return zzfuaVar.zzi();
    }
}
