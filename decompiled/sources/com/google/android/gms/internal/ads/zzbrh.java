package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbrh extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbrh(zzbeo zzbeoVar) {
        try {
            this.zzb = zzbeoVar.zzg();
        } catch (RemoteException e) {
            zzcaa.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbeoVar.zzh()) {
                zzbew zzbewVarZzg = obj instanceof IBinder ? zzbev.zzg((IBinder) obj) : null;
                if (zzbewVarZzg != null) {
                    this.zza.add(new zzbrj(zzbewVarZzg));
                }
            }
        } catch (RemoteException e2) {
            zzcaa.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
