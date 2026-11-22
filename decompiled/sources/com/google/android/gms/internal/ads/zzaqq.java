package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.games.GamesStatusCodes;
import com.mrgames.larvaheroesfree.network.GpTouchConstants;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaqq implements zzaqt {
    private static zzaqq zzb;
    private final Context zzc;
    private final zzfmr zzd;
    private final zzfmy zze;
    private final zzfna zzf;
    private final zzars zzg;
    private final zzflc zzh;
    private final Executor zzi;
    private final zzfmx zzj;
    private final zzash zzl;
    private final zzarz zzm;
    private final zzarq zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    zzaqq(Context context, zzflc zzflcVar, zzfmr zzfmrVar, zzfmy zzfmyVar, zzfna zzfnaVar, zzars zzarsVar, Executor executor, zzfkx zzfkxVar, int i, zzash zzashVar, zzarz zzarzVar, zzarq zzarqVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzflcVar;
        this.zzd = zzfmrVar;
        this.zze = zzfmyVar;
        this.zzf = zzfnaVar;
        this.zzg = zzarsVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzashVar;
        this.zzm = zzarzVar;
        this.zzn = zzarqVar;
        this.zzq = false;
        this.zzj = new zzaqo(this, zzfkxVar);
    }

    public static synchronized zzaqq zza(String str, Context context, boolean z, boolean z2) {
        return zzb(str, context, Executors.newCachedThreadPool(), z, z2);
    }

    @Deprecated
    public static synchronized zzaqq zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        if (zzb == null) {
            zzfld zzfldVarZza = zzfle.zza();
            zzfldVarZza.zza(str);
            zzfldVarZza.zzc(z);
            zzfle zzfleVarZzd = zzfldVarZza.zzd();
            zzflc zzflcVarZza = zzflc.zza(context, executor, z2);
            zzarb zzarbVarZzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzde)).booleanValue() ? zzarb.zzc(context) : null;
            zzash zzashVarZzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdf)).booleanValue() ? zzash.zzd(context, executor) : null;
            zzarz zzarzVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue() ? new zzarz() : null;
            zzarq zzarqVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcv)).booleanValue() ? new zzarq() : null;
            zzflv zzflvVarZze = zzflv.zze(context, executor, zzflcVarZza, zzfleVarZzd);
            zzarr zzarrVar = new zzarr(context);
            zzars zzarsVar = new zzars(zzfleVarZzd, zzflvVarZze, new zzasf(context, zzarrVar), zzarrVar, zzarbVarZzc, zzashVarZzd, zzarzVar, zzarqVar);
            int iZzb = zzfme.zzb(context, zzflcVarZza);
            zzfkx zzfkxVar = new zzfkx();
            zzaqq zzaqqVar = new zzaqq(context, zzflcVarZza, new zzfmr(context, iZzb), new zzfmy(context, iZzb, new zzaqn(zzflcVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcc)).booleanValue()), new zzfna(context, zzarsVar, zzflcVarZza, zzfkxVar), zzarsVar, executor, zzfkxVar, iZzb, zzashVarZzd, zzarzVar, zzarqVar);
            zzb = zzaqqVar;
            zzaqqVar.zzm();
            zzb.zzp();
        }
        return zzb;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ce A[Catch: all -> 0x0129, zzgsc -> 0x012b, TRY_LEAVE, TryCatch #1 {zzgsc -> 0x012b, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:27:0x009c, B:31:0x00b5, B:37:0x00ce, B:41:0x00e0, B:43:0x00e6, B:45:0x00ee, B:46:0x00f0, B:34:0x00bf, B:35:0x00c6, B:23:0x0074, B:25:0x008a, B:48:0x00fc, B:50:0x010b, B:52:0x011a), top: B:64:0x0021, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc A[Catch: all -> 0x0129, zzgsc -> 0x012b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {zzgsc -> 0x012b, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:27:0x009c, B:31:0x00b5, B:37:0x00ce, B:41:0x00e0, B:43:0x00e6, B:45:0x00ee, B:46:0x00f0, B:34:0x00bf, B:35:0x00c6, B:23:0x0074, B:25:0x008a, B:48:0x00fc, B:50:0x010b, B:52:0x011a), top: B:64:0x0021, outer: #2 }] */
    static /* bridge */ /* synthetic */ void zzj(zzaqq zzaqqVar) {
        String str;
        String strZzj;
        CountDownLatch countDownLatch;
        int length;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfmq zzfmqVarZzt = zzaqqVar.zzt(1);
        if (zzfmqVarZzt != null) {
            String strZzk = zzfmqVarZzt.zza().zzk();
            strZzj = zzfmqVarZzt.zza().zzj();
            str = strZzk;
        } else {
            str = null;
            strZzj = null;
        }
        try {
            try {
                zzfmv zzfmvVarZza = zzflm.zza(zzaqqVar.zzc, 1, zzaqqVar.zzr, str, strZzj, "1", zzaqqVar.zzh);
                byte[] bArr = zzfmvVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzaqqVar.zzh.zzd(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                    countDownLatch = zzaqqVar.zzk;
                } else {
                    try {
                        zzatr zzatrVarZzc = zzatr.zzc(zzgqi.zzv(bArr, 0, length), zzgrc.zza());
                        if (zzatrVarZzc.zzd().zzk().isEmpty() || zzatrVarZzc.zzd().zzj().isEmpty() || zzatrVarZzc.zze().zzA().length == 0) {
                            zzaqqVar.zzh.zzd(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                            countDownLatch = zzaqqVar.zzk;
                        } else {
                            zzfmq zzfmqVarZzt2 = zzaqqVar.zzt(1);
                            if (zzfmqVarZzt2 != null) {
                                zzatu zzatuVarZza = zzfmqVarZzt2.zza();
                                if (zzatrVarZzc.zzd().zzk().equals(zzatuVarZza.zzk()) && zzatrVarZzc.zzd().zzj().equals(zzatuVarZza.zzj())) {
                                    zzaqqVar.zzh.zzd(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                                    countDownLatch = zzaqqVar.zzk;
                                }
                            }
                            zzfmx zzfmxVar = zzaqqVar.zzj;
                            int i = zzfmvVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzca)).booleanValue()) {
                                zZza = zzaqqVar.zzd.zza(zzatrVarZzc, zzfmxVar);
                            } else if (i == 3) {
                                zZza = zzaqqVar.zze.zza(zzatrVarZzc);
                            } else if (i == 4) {
                                zZza = zzaqqVar.zze.zzb(zzatrVarZzc, zzfmxVar);
                            } else {
                                zzaqqVar.zzh.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                                countDownLatch = zzaqqVar.zzk;
                            }
                            if (zZza) {
                                zzfmq zzfmqVarZzt3 = zzaqqVar.zzt(1);
                                if (zzfmqVarZzt3 != null) {
                                    if (zzaqqVar.zzf.zzc(zzfmqVarZzt3)) {
                                        zzaqqVar.zzq = true;
                                    }
                                    zzaqqVar.zza = System.currentTimeMillis() / 1000;
                                }
                                countDownLatch = zzaqqVar.zzk;
                            } else {
                                zzaqqVar.zzh.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                                countDownLatch = zzaqqVar.zzk;
                            }
                        }
                    } catch (NullPointerException unused) {
                        zzaqqVar.zzh.zzd(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                        countDownLatch = zzaqqVar.zzk;
                    }
                }
            } catch (zzgsc e) {
                zzaqqVar.zzh.zzc(GamesStatusCodes.STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE, System.currentTimeMillis() - jCurrentTimeMillis, e);
                countDownLatch = zzaqqVar.zzk;
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            zzaqqVar.zzk.countDown();
            throw th;
        }
    }

    private final void zzs() {
        zzash zzashVar = this.zzl;
        if (zzashVar != null) {
            zzashVar.zzh();
        }
    }

    private final zzfmq zzt(int i) {
        if (zzfme.zza(this.zzr)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzca)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzflf zzflfVarZza = this.zzf.zza();
        if (zzflfVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzflfVarZza.zza(context, null, str, view, activity);
        this.zzh.zzf(GpTouchConstants.SYNC_INTERVAL, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzflf zzflfVarZza = this.zzf.zza();
        if (zzflfVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzflfVarZza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzflf zzflfVarZza = this.zzf.zza();
        if (zzflfVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzflfVarZza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzk(MotionEvent motionEvent) {
        zzflf zzflfVarZza = this.zzf.zza();
        if (zzflfVarZza != null) {
            try {
                zzflfVarZza.zzd(null, motionEvent);
            } catch (zzfmz e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzl(int i, int i2, int i3) {
    }

    final synchronized void zzm() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfmq zzfmqVarZzt = zzt(1);
        if (zzfmqVarZzt == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zzc(zzfmqVarZzt)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzarq zzarqVar = this.zzn;
        if (zzarqVar != null) {
            zzarqVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            if (!this.zzp) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfmq zzfmqVarZzb = this.zzf.zzb();
                if ((zzfmqVarZzb == null || zzfmqVarZzb.zzd(3600L)) && zzfme.zza(this.zzr)) {
                    this.zzi.execute(new zzaqp(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
