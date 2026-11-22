package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhu implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final zzcag zzf;
    private int zzi;
    private final zzdoz zzj;
    private final List zzk;
    private final zzead zzm;
    private final zzbuz zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfhz zzg = zzfic.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzfhu(Context context, zzcag zzcagVar, zzdoz zzdozVar, zzead zzeadVar, zzbuz zzbuzVar) {
        this.zze = context;
        this.zzf = zzcagVar;
        this.zzj = zzdozVar;
        this.zzm = zzeadVar;
        this.zzn = zzbuzVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziv)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzd();
        } else {
            this.zzk = zzfud.zzl();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbdd.zzb.zze()).booleanValue()) {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbdd.zza.zze()).doubleValue());
                } else {
                    zzb = false;
                }
            }
            zBooleanValue = zzb.booleanValue();
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzax;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        bArrZzax = ((zzfic) this.zzg.zzal()).zzax();
                        this.zzg.zzc();
                    }
                    new zzeac(this.zze, this.zzf.zza, this.zzn, Binder.getCallingUid()).zza(new zzeaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzip), 60000, new HashMap(), bArrZzax, "application/x-protobuf", false));
                } catch (Exception e) {
                    if ((e instanceof zzdve) && ((zzdve) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzfhk zzfhkVar) {
        zzcan.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfht
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzfhkVar);
            }
        });
    }

    final /* synthetic */ void zzc(zzfhk zzfhkVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzh = com.google.android.gms.ads.internal.util.zzs.zzn(this.zze);
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziq)).intValue();
                    zzcan.zzd.scheduleAtFixedRate(this, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
                }
            }
        }
        if (zza() && zzfhkVar != null) {
            synchronized (zzc) {
                if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzir)).intValue()) {
                    return;
                }
                zzfhw zzfhwVarZza = zzfhx.zza();
                zzfhwVarZza.zzt(zzfhkVar.zzl());
                zzfhwVarZza.zzp(zzfhkVar.zzk());
                zzfhwVarZza.zzg(zzfhkVar.zzb());
                zzfhwVarZza.zzv(3);
                zzfhwVarZza.zzm(this.zzf.zza);
                zzfhwVarZza.zzb(this.zzh);
                zzfhwVarZza.zzk(Build.VERSION.RELEASE);
                zzfhwVarZza.zzq(Build.VERSION.SDK_INT);
                zzfhwVarZza.zzu(zzfhkVar.zzn());
                zzfhwVarZza.zzj(zzfhkVar.zza());
                zzfhwVarZza.zze(this.zzi);
                zzfhwVarZza.zzs(zzfhkVar.zzm());
                zzfhwVarZza.zzc(zzfhkVar.zzd());
                zzfhwVarZza.zzf(zzfhkVar.zzf());
                zzfhwVarZza.zzh(zzfhkVar.zzg());
                zzfhwVarZza.zzi(this.zzj.zzc(zzfhkVar.zzg()));
                zzfhwVarZza.zzl(zzfhkVar.zzh());
                zzfhwVarZza.zzd(zzfhkVar.zze());
                zzfhwVarZza.zzr(zzfhkVar.zzj());
                zzfhwVarZza.zzn(zzfhkVar.zzi());
                zzfhwVarZza.zzo(zzfhkVar.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziv)).booleanValue()) {
                    zzfhwVarZza.zza(this.zzk);
                }
                zzfhz zzfhzVar = this.zzg;
                zzfia zzfiaVarZza = zzfib.zza();
                zzfiaVarZza.zza(zzfhwVarZza);
                zzfhzVar.zzb(zzfiaVarZza);
            }
        }
    }
}
