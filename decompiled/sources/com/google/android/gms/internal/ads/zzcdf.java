package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcdf {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzane zzaneVar;
        zzand zzandVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzamz(new zzcde(byteBufferDuplicate), zzcdh.zzb).zze().iterator();
            while (true) {
                zzaneVar = null;
                if (!it.hasNext()) {
                    zzandVar = null;
                    break;
                }
                zzanb zzanbVar = (zzanb) it.next();
                if (zzanbVar instanceof zzand) {
                    zzandVar = (zzand) zzanbVar;
                    break;
                }
            }
            for (zzanb zzanbVar2 : zzandVar.zze()) {
                if (zzanbVar2 instanceof zzane) {
                    zzaneVar = (zzane) zzanbVar2;
                    break;
                }
            }
            long jZzd = (zzaneVar.zzd() * 1000) / zzaneVar.zze();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
