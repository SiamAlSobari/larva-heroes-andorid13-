package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdu implements zzdr {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdp zze = zzdp.zza;
    private zzdp zzf;
    private zzdp zzg;
    private zzdp zzh;
    private boolean zzi;
    private zzdt zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzdu() {
        zzdp zzdpVar = zzdp.zza;
        this.zzf = zzdpVar;
        this.zzg = zzdpVar;
        this.zzh = zzdpVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final zzdp zza(zzdp zzdpVar) throws zzdq {
        if (zzdpVar.zzd != 2) {
            throw new zzdq("Unhandled input format:", zzdpVar);
        }
        int i = this.zzb;
        if (i == -1) {
            i = zzdpVar.zzb;
        }
        this.zze = zzdpVar;
        zzdp zzdpVar2 = new zzdp(i, zzdpVar.zzc, 2);
        this.zzf = zzdpVar2;
        this.zzi = true;
        return zzdpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final ByteBuffer zzb() {
        int iZza;
        zzdt zzdtVar = this.zzj;
        if (zzdtVar != null && (iZza = zzdtVar.zza()) > 0) {
            if (this.zzk.capacity() < iZza) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iZza).order(ByteOrder.nativeOrder());
                this.zzk = byteBufferOrder;
                this.zzl = byteBufferOrder.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzdtVar.zzd(this.zzl);
            this.zzo += (long) iZza;
            this.zzk.limit(iZza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzc() {
        if (zzg()) {
            zzdp zzdpVar = this.zze;
            this.zzg = zzdpVar;
            this.zzh = this.zzf;
            if (this.zzi) {
                this.zzj = new zzdt(zzdpVar.zzb, zzdpVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzdt zzdtVar = this.zzj;
                if (zzdtVar != null) {
                    zzdtVar.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzd() {
        zzdt zzdtVar = this.zzj;
        if (zzdtVar != null) {
            zzdtVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzdt zzdtVar = this.zzj;
            zzdtVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.zzn += (long) iRemaining;
            zzdtVar.zzf(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzdp.zza;
        zzdp zzdpVar = zzdp.zza;
        this.zzf = zzdpVar;
        this.zzg = zzdpVar;
        this.zzh = zzdpVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzdt zzdtVar = this.zzj;
        return zzdtVar == null || zzdtVar.zza() == 0;
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            double d = this.zzc;
            double d2 = j;
            Double.isNaN(d);
            Double.isNaN(d2);
            return (long) (d * d2);
        }
        long j3 = this.zzn;
        zzdt zzdtVar = this.zzj;
        zzdtVar.getClass();
        long jZzb = j3 - ((long) zzdtVar.zzb());
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? zzfk.zzq(j, jZzb, j2) : zzfk.zzq(j, jZzb * ((long) i), j2 * ((long) i2));
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
