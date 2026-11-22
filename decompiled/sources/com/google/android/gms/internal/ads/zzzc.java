package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzc extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzza zzd;
    private boolean zze;

    /* synthetic */ zzzc(zzza zzzaVar, SurfaceTexture surfaceTexture, boolean z, zzzb zzzbVar) {
        super(surfaceTexture);
        this.zzd = zzzaVar;
        this.zza = z;
    }

    public static zzzc zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzdy.zzf(z2);
        return new zzza().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        if (!zzc) {
            if (zzeh.zzc(context)) {
                i = zzeh.zzd() ? 1 : 2;
            } else {
                i = 0;
            }
            zzb = i;
            zzc = true;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
