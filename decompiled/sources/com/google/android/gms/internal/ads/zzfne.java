package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfne {
    final zzfnh zza;
    final boolean zzb;

    private zzfne(zzfnh zzfnhVar) {
        this.zza = zzfnhVar;
        this.zzb = zzfnhVar != null;
    }

    public static zzfne zzb(Context context, String str, String str2) {
        zzfnh zzfnfVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        zzfnfVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfnfVar = iInterfaceQueryLocalInterface instanceof zzfnh ? (zzfnh) iInterfaceQueryLocalInterface : new zzfnf(iBinderInstantiate);
                    }
                    zzfnfVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfne(zzfnfVar);
                } catch (RemoteException | zzfmg | NullPointerException | SecurityException unused) {
                    Log.d("GASS", "Cannot dynamite load clearcut");
                    return new zzfne(new zzfni());
                }
            } catch (Exception e) {
                throw new zzfmg(e);
            }
        } catch (Exception e2) {
            throw new zzfmg(e2);
        }
    }

    public static zzfne zzc() {
        zzfni zzfniVar = new zzfni();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfne(zzfniVar);
    }

    public final zzfnd zza(byte[] bArr) {
        return new zzfnd(this, bArr, null);
    }
}
