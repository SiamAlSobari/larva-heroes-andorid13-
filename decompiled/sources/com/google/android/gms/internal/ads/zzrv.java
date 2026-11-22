package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzrv {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || zzfk.zzb.equals("sabrina") || zzfk.zzb.equals("boreal") || zzfk.zzd.startsWith("Lenovo TB-X605") || zzfk.zzd.startsWith("Lenovo TB-X606") || zzfk.zzd.startsWith("Lenovo TB-X616")) {
            return 0;
        }
        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
        for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
            if (zzg$$ExternalSyntheticApiModelOutline0.m255m(supportedPerformancePoints.get(i3)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
