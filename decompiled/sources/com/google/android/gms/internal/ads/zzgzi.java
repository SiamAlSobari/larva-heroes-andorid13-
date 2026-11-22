package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgzi extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzgzi(zzbcs zzbcsVar) {
        this.zza = new WeakReference(zzbcsVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbcs zzbcsVar = (zzbcs) this.zza.get();
        if (zzbcsVar != null) {
            zzbcsVar.zzc(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbcs zzbcsVar = (zzbcs) this.zza.get();
        if (zzbcsVar != null) {
            zzbcsVar.zzd();
        }
    }
}
