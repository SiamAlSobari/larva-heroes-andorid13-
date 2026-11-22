package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefc implements zzedn {
    private final Context zza;
    private final zzdfq zzb;
    private final Executor zzc;
    private final zzfbd zzd;

    public zzefc(Context context, Executor executor, zzdfq zzdfqVar, zzfbd zzfbdVar) {
        this.zza = context;
        this.zzb = zzdfqVar;
        this.zzc = executor;
        this.zzd = zzfbdVar;
    }

    private static String zzd(zzfbe zzfbeVar) {
        try {
            return zzfbeVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final ListenableFuture zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        String strZzd = zzd(zzfbeVar);
        final Uri uri = strZzd != null ? Uri.parse(strZzd) : null;
        return zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzefa
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(uri, zzfbrVar, zzfbeVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbcs.zzg(context) && !TextUtils.isEmpty(zzd(zzfbeVar));
    }

    final /* synthetic */ ListenableFuture zzc(Uri uri, zzfbr zzfbrVar, zzfbe zzfbeVar, Object obj) throws Exception {
        try {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            customTabsIntentBuild.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.intent, null);
            final zzcas zzcasVar = new zzcas();
            zzdeq zzdeqVarZze = this.zzb.zze(new zzcst(zzfbrVar, zzfbeVar, null), new zzdet(new zzdfy() { // from class: com.google.android.gms.internal.ads.zzefb
                @Override // com.google.android.gms.internal.ads.zzdfy
                public final void zza(boolean z, Context context, zzcwv zzcwvVar) {
                    zzcas zzcasVar2 = zzcasVar;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzi();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzcasVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcasVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzdeqVarZze.zza(), null, new zzcag(0, 0, false, false, false), null, null));
            this.zzd.zza();
            return zzfye.zzh(zzdeqVarZze.zzg());
        } catch (Throwable th) {
            zzcaa.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
