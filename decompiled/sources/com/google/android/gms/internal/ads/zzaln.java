package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaln implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzalp zzc;

    zzaln(zzalp zzalpVar, String str, long j) {
        this.zzc = zzalpVar;
        this.zza = str;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzalp zzalpVar = this.zzc;
        zzalpVar.zza.zzb(zzalpVar.toString());
    }
}
