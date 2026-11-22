package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpo {
    public static void zza(AudioTrack audioTrack, zzpq zzpqVar) {
        audioTrack.setPreferredDevice(zzpqVar == null ? null : zzpqVar.zza);
    }
}
