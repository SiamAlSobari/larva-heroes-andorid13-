package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzry extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzrw zzc;
    public final String zzd;
    public final zzry zze;

    public zzry(zzam zzamVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + String.valueOf(zzamVar), th, zzamVar.zzm, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    static /* bridge */ /* synthetic */ zzry zza(zzry zzryVar, zzry zzryVar2) {
        return new zzry(zzryVar.getMessage(), zzryVar.getCause(), zzryVar.zza, false, zzryVar.zzc, zzryVar.zzd, zzryVar2);
    }

    public zzry(zzam zzamVar, Throwable th, boolean z, zzrw zzrwVar) {
        this("Decoder init failed: " + zzrwVar.zza + ", " + String.valueOf(zzamVar), th, zzamVar.zzm, false, zzrwVar, (zzfk.zza < 21 || !zzg$$ExternalSyntheticApiModelOutline0.m$3(th)) ? null : zzg$$ExternalSyntheticApiModelOutline0.m254m((Object) th).getDiagnosticInfo(), null);
    }

    private zzry(String str, Throwable th, String str2, boolean z, zzrw zzrwVar, String str3, zzry zzryVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzrwVar;
        this.zzd = str3;
        this.zze = zzryVar;
    }
}
