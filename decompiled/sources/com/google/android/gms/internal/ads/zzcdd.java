package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcdd implements zzgi {
    private final Context zza;
    private final zzgi zzb;
    private final String zzc;
    private final int zzd;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzawq zzi;
    private zzgn zzm;
    private boolean zzj = false;
    private boolean zzk = false;
    private final AtomicLong zzl = new AtomicLong(-1);
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue();

    public zzcdd(Context context, zzgi zzgiVar, String str, int i, zzhk zzhkVar, zzcdc zzcdcVar) {
        this.zza = context;
        this.zzb = zzgiVar;
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeh)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzei)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws IOException {
        Long l;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        this.zzh = zzgnVar.zza;
        this.zzm = zzgnVar;
        this.zzi = zzawq.zza(zzgnVar.zza);
        zzawn zzawnVarZzb = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzee)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgnVar.zzf;
                this.zzi.zzi = zzfrx.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzawnVarZzb = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzi);
            }
            if (zzawnVarZzb != null && zzawnVarZzb.zze()) {
                this.zzj = zzawnVarZzb.zzg();
                this.zzk = zzawnVarZzb.zzf();
                if (!zzg()) {
                    this.zzf = zzawnVarZzb.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgnVar.zzf;
            this.zzi.zzi = zzfrx.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeg);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzef);
            }
            long jLongValue = l.longValue();
            com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future futureZza = zzaxb.zza(this.zza, this.zzi);
            try {
                try {
                    zzaxc zzaxcVar = (zzaxc) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    zzaxcVar.zzd();
                    this.zzj = zzaxcVar.zzf();
                    this.zzk = zzaxcVar.zze();
                    zzaxcVar.zza();
                    if (zzg()) {
                        com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                        throw null;
                    }
                    this.zzf = zzaxcVar.zzc();
                    com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    throw null;
                } catch (InterruptedException unused) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                    com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    throw null;
                } catch (ExecutionException | TimeoutException unused2) {
                    futureZza.cancel(false);
                    com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    throw null;
                }
            } catch (Throwable unused3) {
                com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                throw null;
            }
        }
        if (this.zzi != null) {
            Uri uri = Uri.parse(this.zzi.zza);
            byte[] bArr = zzgnVar.zzc;
            long j = zzgnVar.zze;
            long j2 = zzgnVar.zzf;
            long j3 = zzgnVar.zzg;
            String str = zzgnVar.zzh;
            this.zzm = new zzgn(uri, null, j, j2, j3, null, zzgnVar.zzi);
        }
        return this.zzb.zzb(this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhkVar) {
    }
}
