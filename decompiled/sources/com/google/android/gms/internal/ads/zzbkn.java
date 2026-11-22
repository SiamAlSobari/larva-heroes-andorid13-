package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbkn implements zzali {
    private volatile zzbka zza;
    private final Context zzb;

    public zzbkn(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzbkn zzbknVar) {
        if (zzbknVar.zza == null) {
            return;
        }
        zzbknVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzali
    public final zzall zza(zzalp zzalpVar) throws zzaly {
        Parcelable.Creator<zzbkb> creator = zzbkb.CREATOR;
        Map mapZzl = zzalpVar.zzl();
        int size = mapZzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : mapZzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbkb zzbkbVar = new zzbkb(zzalpVar.zzk(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        try {
            zzcas zzcasVar = new zzcas();
            this.zza = new zzbka(this.zzb, com.google.android.gms.ads.internal.zzt.zzt().zzb(), new zzbkl(this, zzcasVar), new zzbkm(this, zzcasVar));
            this.zza.checkAvailabilityAndConnect();
            ListenableFuture listenableFutureZzo = zzfye.zzo(zzfye.zzn(zzcasVar, new zzbkj(this, zzbkbVar), zzcan.zza), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeo)).intValue(), TimeUnit.MILLISECONDS, zzcan.zzd);
            listenableFutureZzo.addListener(new zzbkk(this), zzcan.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) listenableFutureZzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            zzbkd zzbkdVar = (zzbkd) new zzbul(parcelFileDescriptor).zza(zzbkd.CREATOR);
            if (zzbkdVar == null) {
                return null;
            }
            if (zzbkdVar.zza) {
                throw new zzaly(zzbkdVar.zzb);
            }
            if (zzbkdVar.zze.length != zzbkdVar.zzf.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = zzbkdVar.zze;
                if (i >= strArr3.length) {
                    return new zzall(zzbkdVar.zzc, zzbkdVar.zzd, map, zzbkdVar.zzg, zzbkdVar.zzh);
                }
                map.put(strArr3[i], zzbkdVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th;
        }
    }
}
