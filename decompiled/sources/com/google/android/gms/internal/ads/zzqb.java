package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqb extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzqe zza;
    final /* synthetic */ zzqc zzb;

    zzqb(zzqc zzqcVar, zzqe zzqeVar) {
        this.zzb = zzqcVar;
        this.zza = zzqeVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.zzb.zza.zzt)) {
            zzqe zzqeVar = this.zzb.zza;
            if (zzqeVar.zzp == null || !zzqeVar.zzQ) {
                return;
            }
            zzqeVar.zzp.zzb();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.zzb.zza.zzt)) {
            zzqe zzqeVar = this.zzb.zza;
            if (zzqeVar.zzp == null || !zzqeVar.zzQ) {
                return;
            }
            zzqeVar.zzp.zzb();
        }
    }
}
