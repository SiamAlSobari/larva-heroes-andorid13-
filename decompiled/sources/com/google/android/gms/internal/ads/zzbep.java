package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbep extends NativeAd.AdChoicesInfo {
    private final zzbeo zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbep(zzbeo zzbeoVar) {
        IBinder iBinder;
        this.zza = zzbeoVar;
        try {
            this.zzc = zzbeoVar.zzg();
        } catch (RemoteException e) {
            zzcaa.zzh("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbeoVar.zzh()) {
                zzbew zzbeuVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbeuVar = iInterfaceQueryLocalInterface instanceof zzbew ? (zzbew) iInterfaceQueryLocalInterface : new zzbeu(iBinder);
                }
                if (zzbeuVar != null) {
                    this.zzb.add(new zzbex(zzbeuVar));
                }
            }
        } catch (RemoteException e2) {
            zzcaa.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
