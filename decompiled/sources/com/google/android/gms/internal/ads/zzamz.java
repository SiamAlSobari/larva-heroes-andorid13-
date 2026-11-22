package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzamz extends zzgye implements Closeable {
    private static final zzgyl zza = zzgyl.zzb(zzamz.class);

    public zzamz(zzgyf zzgyfVar, zzamy zzamyVar) throws IOException {
        zzf(zzgyfVar, zzgyfVar.zzc(), zzamyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgye, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzgye
    public final String toString() {
        String string = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
