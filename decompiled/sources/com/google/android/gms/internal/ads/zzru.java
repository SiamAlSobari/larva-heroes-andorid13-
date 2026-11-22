package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzru extends zzhr {
    public final zzrw zza;
    public final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzru(Throwable th, zzrw zzrwVar) {
        super("Decoder failed: ".concat(String.valueOf(zzrwVar == null ? null : zzrwVar.zza)), th);
        String diagnosticInfo = null;
        this.zza = zzrwVar;
        if (zzfk.zza >= 21 && zzg$$ExternalSyntheticApiModelOutline0.m$3(th)) {
            diagnosticInfo = zzg$$ExternalSyntheticApiModelOutline0.m254m((Object) th).getDiagnosticInfo();
        }
        this.zzb = diagnosticInfo;
    }
}
