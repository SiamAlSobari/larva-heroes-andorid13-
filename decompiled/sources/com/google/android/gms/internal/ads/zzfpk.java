package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfpk {
    private static final zzfpx zzb = new zzfpx("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfqi zza;
    private final String zzd;

    zzfpk(Context context) {
        if (zzfql.zza(context)) {
            this.zza = new zzfqi(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfpf.zza, null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    final void zzc() {
        if (this.zza == null) {
            return;
        }
        zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzu();
    }

    final void zzd(zzfpb zzfpbVar, zzfpp zzfppVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfph(this, taskCompletionSource, zzfpbVar, zzfppVar, taskCompletionSource), taskCompletionSource);
        }
    }

    final void zze(zzfpm zzfpmVar, zzfpp zzfppVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        if (zzfpmVar.zzg() != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfpg(this, taskCompletionSource, zzfpmVar, zzfppVar, taskCompletionSource), taskCompletionSource);
        } else {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfpn zzfpnVarZzc = zzfpo.zzc();
            zzfpnVarZzc.zzb(8160);
            zzfppVar.zza(zzfpnVarZzc.zzc());
        }
    }

    final void zzf(zzfpr zzfprVar, zzfpp zzfppVar, int i) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfpi(this, taskCompletionSource, zzfprVar, i, zzfppVar, taskCompletionSource), taskCompletionSource);
        }
    }
}
