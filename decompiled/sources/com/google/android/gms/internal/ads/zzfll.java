package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfll implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfmj zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzflc zzf;
    private final long zzg;
    private final int zzh;

    public zzfll(Context context, int i, int i2, String str, String str2, String str3, zzflc zzflcVar) {
        this.zzb = str;
        this.zzh = i2;
        this.zzc = str2;
        this.zzf = zzflcVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfmj zzfmjVar = new zzfmj(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfmjVar;
        this.zzd = new LinkedBlockingQueue();
        zzfmjVar.checkAvailabilityAndConnect();
    }

    static zzfmv zza() {
        return new zzfmv(null, 1);
    }

    private final void zze(int i, long j, Exception exc) {
        this.zzf.zzc(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfmo zzfmoVarZzd = zzd();
        if (zzfmoVarZzd != null) {
            try {
                zzfmv zzfmvVarZzf = zzfmoVarZzd.zzf(new zzfmt(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, null);
                this.zzd.put(zzfmvVarZzf);
            } catch (Throwable th) {
                try {
                    zze(2010, this.zzg, new Exception(th));
                } finally {
                    zzc();
                    this.zze.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfmv zzb(int i) {
        zzfmv zzfmvVar;
        try {
            zzfmvVar = (zzfmv) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zze(2009, this.zzg, e);
            zzfmvVar = null;
        }
        zze(AuthApiStatusCodes.AUTH_TOKEN_ERROR, this.zzg, null);
        if (zzfmvVar != null) {
            if (zzfmvVar.zzc == 7) {
                zzflc.zzg(3);
            } else {
                zzflc.zzg(2);
            }
        }
        return zzfmvVar == null ? zza() : zzfmvVar;
    }

    public final void zzc() {
        zzfmj zzfmjVar = this.zza;
        if (zzfmjVar != null) {
            if (zzfmjVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final zzfmo zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
