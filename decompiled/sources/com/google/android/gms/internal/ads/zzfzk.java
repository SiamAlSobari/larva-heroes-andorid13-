package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzk {
    private final OutputStream zza;

    private zzfzk(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzfzk zzb(OutputStream outputStream) {
        return new zzfzk(outputStream);
    }

    public final void zza(zzgnd zzgndVar) throws IOException {
        try {
            zzgndVar.zzaw(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
