package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfcu {
    private static zzfcu zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfcu(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zzcaa.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfcu zzd(Context context) {
        synchronized (zzfcu.class) {
            zzfcu zzfcuVar = zza;
            if (zzfcuVar != null) {
                return zzfcuVar;
            }
            Context applicationContext = context.getApplicationContext();
            long jLongValue = ((Long) zzbdm.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcl zzclVarZza = null;
            if (jLongValue > 0 && jLongValue <= 233012802) {
                zzclVarZza = zza(applicationContext);
            }
            zzfcu zzfcuVar2 = new zzfcu(applicationContext, zzclVarZza);
            zza = zzfcuVar2;
            return zzfcuVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzen zzg() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar != null) {
            try {
                return zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbof zzb() {
        return (zzbof) this.zzd.get();
    }

    public final zzcag zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzen zzenVarZzg;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zZzB = com.google.android.gms.ads.internal.util.zzs.zzB(this.zzb);
        zzcag zzcagVar = new zzcag(233012000, i2, true, zZzB);
        return (((Boolean) zzbdm.zzc.zze()).booleanValue() && (zzenVarZzg = zzg()) != null) ? new zzcag(233012000, zzenVarZzg.zza(), true, zZzB) : zzcagVar;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzen zzenVarZzg = zzg();
        if (zzenVarZzg != null) {
            return zzenVarZzg.zzb();
        }
        return null;
    }

    public final void zzf(zzbof zzbofVar) {
        zzbof adapterCreator;
        if (!((Boolean) zzbdm.zza.zze()).booleanValue()) {
            zzfct.zza(this.zzd, null, zzbofVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzclVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbofVar = adapterCreator;
        }
        zzfct.zza(atomicReference, null, zzbofVar);
    }
}
