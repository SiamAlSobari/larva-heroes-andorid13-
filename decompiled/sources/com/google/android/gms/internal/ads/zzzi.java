package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.google.firebase.messaging.Constants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzzi implements DisplayManager.DisplayListener, zzzg {
    private final DisplayManager zza;
    private zzze zzb;

    private zzzi(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzzg zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        if (displayManager != null) {
            return new zzzi(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        zzze zzzeVar = this.zzb;
        if (zzzeVar == null || i != 0) {
            return;
        }
        zzzk.zzb(zzzeVar.zza, zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzb(zzze zzzeVar) {
        this.zzb = zzzeVar;
        this.zza.registerDisplayListener(this, zzfk.zzu(null));
        zzzk.zzb(zzzeVar.zza, zzd());
    }
}
