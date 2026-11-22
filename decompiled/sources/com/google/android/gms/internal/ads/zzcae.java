package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcae {
    public static Context zza(Context context) throws zzcad {
        return zzc(context).getModuleContext();
    }

    public static Object zzb(Context context, String str, zzcac zzcacVar) throws zzcad {
        try {
            return zzcacVar.zza(zzc(context).instantiate(str));
        } catch (Exception e) {
            throw new zzcad(e);
        }
    }

    private static DynamiteModule zzc(Context context) throws zzcad {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzcad(e);
        }
    }
}
