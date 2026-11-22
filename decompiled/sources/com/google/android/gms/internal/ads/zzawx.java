package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzawx extends PushbackInputStream {
    final /* synthetic */ zzawy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzawx(zzawy zzawyVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzawyVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzaxa.zze(this.zza.zzc);
        super.close();
    }
}
