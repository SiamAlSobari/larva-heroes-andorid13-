package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgyc extends zzgya implements zzanb {
    private int zza;

    protected zzgyc(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    protected final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzana.zzc(byteBuffer.get());
        zzana.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
