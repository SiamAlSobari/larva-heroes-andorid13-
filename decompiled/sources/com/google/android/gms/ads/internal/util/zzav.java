package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzav implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzav(zzaw zzawVar, Context context, String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzH = zzs.zzH(this.zza);
        builderZzH.setMessage(this.zzb);
        if (this.zzc) {
            builderZzH.setTitle("Error");
        } else {
            builderZzH.setTitle("Info");
        }
        if (this.zzd) {
            builderZzH.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzH.setPositiveButton("Learn More", new zzau(this));
            builderZzH.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzH.create().show();
    }
}
