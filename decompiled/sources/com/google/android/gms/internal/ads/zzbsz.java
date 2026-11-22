package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbsz {

    @Nonnull
    private final View zza;
    private final Map zzb;
    private final zzbyr zzc;

    public zzbsz(zzbsy zzbsyVar) {
        View view = zzbsyVar.zza;
        this.zza = view;
        Map map = zzbsyVar.zzb;
        this.zzb = map;
        zzbyr zzbyrVarZza = zzbst.zza(zzbsyVar.zza.getContext());
        this.zzc = zzbyrVarZza;
        if (zzbyrVarZza == null || map.isEmpty()) {
            return;
        }
        try {
            zzbyrVarZza.zzf(new zzbta(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
        } catch (RemoteException unused) {
            zzcaa.zzg("Failed to call remote method.");
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            zzcaa.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            zzcaa.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzbsx(this, list));
        } catch (RemoteException e) {
            zzcaa.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            zzcaa.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzbyr zzbyrVar = this.zzc;
        if (zzbyrVar == null) {
            zzcaa.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zzbyrVar.zzh(list, ObjectWrapper.wrap(this.zza), new zzbsw(this, list));
        } catch (RemoteException e) {
            zzcaa.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbyr zzbyrVar = this.zzc;
        if (zzbyrVar == null) {
            zzcaa.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzbyrVar.zzj(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException unused) {
            zzcaa.zzg("Failed to call remote method.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzk(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbsv(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(list, ObjectWrapper.wrap(this.zza), new zzbsu(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
