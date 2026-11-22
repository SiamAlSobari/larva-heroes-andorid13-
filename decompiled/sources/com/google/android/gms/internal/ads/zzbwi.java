package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbwi {
    public static final zzbvw zza(Context context, String str, zzbof zzbofVar) {
        try {
            IBinder iBinderZze = ((zzbwa) zzcae.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzcac() { // from class: com.google.android.gms.internal.ads.zzbwh
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcac
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbwa ? (zzbwa) iInterfaceQueryLocalInterface : new zzbwa(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbofVar, 233012000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzbvw ? (zzbvw) iInterfaceQueryLocalInterface : new zzbvu(iBinderZze);
        } catch (RemoteException | zzcad e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
