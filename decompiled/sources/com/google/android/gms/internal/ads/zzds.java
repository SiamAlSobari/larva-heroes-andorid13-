package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzds implements zzdr {
    protected zzdp zzb;
    protected zzdp zzc;
    private zzdp zzd;
    private zzdp zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzds() {
        ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        this.zzd = zzdp.zza;
        zzdp zzdpVar = zzdp.zza;
        this.zze = zzdpVar;
        this.zzb = zzdpVar;
        this.zzc = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final zzdp zza(zzdp zzdpVar) throws zzdq {
        this.zzd = zzdpVar;
        this.zze = zzi(zzdpVar);
        return zzg() ? this.zze : zzdp.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzc() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzf() {
        zzc();
        this.zzf = zza;
        this.zzd = zzdp.zza;
        zzdp zzdpVar = zzdp.zza;
        this.zze = zzdpVar;
        this.zzb = zzdpVar;
        this.zzc = zzdpVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public boolean zzg() {
        return this.zze != zzdp.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public boolean zzh() {
        return this.zzh && this.zzg == zza;
    }

    protected zzdp zzi(zzdp zzdpVar) throws zzdq {
        throw null;
    }

    protected final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    protected final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
