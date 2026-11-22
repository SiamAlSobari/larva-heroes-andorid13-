package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasr implements Callable {
    private final zzary zza;
    private final zzanv zzb;

    public zzasr(zzary zzaryVar, zzanv zzanvVar) {
        this.zza = zzaryVar;
        this.zzb = zzanvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzaos zzaosVarZzc = this.zza.zzc();
        if (zzaosVarZzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                try {
                    zzanv zzanvVar = this.zzb;
                    byte[] bArrZzax = zzaosVarZzc.zzax();
                    zzanvVar.zzak(bArrZzax, 0, bArrZzax.length, zzgrc.zza());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzgsc | NullPointerException unused) {
            return null;
        }
    }
}
