package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakk {
    public final int zza;
    public final long zzb;

    private zzakk(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzakk zza(zzabc zzabcVar, zzfb zzfbVar) throws IOException {
        ((zzaar) zzabcVar).zzm(zzfbVar.zzI(), 0, 8, false);
        zzfbVar.zzG(0);
        return new zzakk(zzfbVar.zzf(), zzfbVar.zzr());
    }
}
