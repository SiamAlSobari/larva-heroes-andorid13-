package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyf implements Runnable {
    private final zzye zza;

    public zzyf(zzye zzyeVar) {
        this.zza = zzyeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK();
    }
}
