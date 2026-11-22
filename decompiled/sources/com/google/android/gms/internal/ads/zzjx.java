package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjx implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzzw, zzoy, zzvv, zzss, zzia, zzhw, zzim {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzkb zza;

    /* synthetic */ zzjx(zzkb zzkbVar, zzjw zzjwVar) {
        this.zza = zzkbVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzkb.zzP(this.zza, surfaceTexture);
        this.zza.zzag(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzaj(null);
        this.zza.zzag(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzag(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzag(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzag(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zza(boolean z) {
        this.zza.zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzb(Exception exc) {
        this.zza.zzr.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzc(String str, long j, long j2) {
        this.zza.zzr.zzw(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzd(String str) {
        this.zza.zzr.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zze(zzid zzidVar) {
        this.zza.zzr.zzy(zzidVar);
        this.zza.zzL = null;
        this.zza.zzS = null;
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzf(zzid zzidVar) {
        this.zza.zzS = zzidVar;
        this.zza.zzr.zzz(zzidVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzg(zzam zzamVar, zzie zzieVar) {
        this.zza.zzL = zzamVar;
        this.zza.zzr.zzA(zzamVar, zzieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzh(long j) {
        this.zza.zzr.zzB(j);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzi(Exception exc) {
        this.zza.zzr.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzj(int i, long j, long j2) {
        this.zza.zzr.zzD(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzk(int i, long j) {
        this.zza.zzr.zzE(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzl(Object obj, long j) {
        this.zza.zzr.zzF(obj, j);
        zzkb zzkbVar = this.zza;
        if (zzkbVar.zzN == obj) {
            zzep zzepVar = zzkbVar.zzl;
            zzepVar.zzd(26, new zzem() { // from class: com.google.android.gms.internal.ads.zzjt
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(Object obj2) {
                }
            });
            zzepVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzm(final boolean z) {
        zzkb zzkbVar = this.zza;
        if (zzkbVar.zzW == z) {
            return;
        }
        zzkbVar.zzW = z;
        zzep zzepVar = this.zza.zzl;
        zzepVar.zzd(23, new zzem() { // from class: com.google.android.gms.internal.ads.zzju
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                boolean z2 = z;
                int i = zzjx.zzb;
                ((zzcm) obj).zzn(z2);
            }
        });
        zzepVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzn(Exception exc) {
        this.zza.zzr.zzG(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzo(String str, long j, long j2) {
        this.zza.zzr.zzH(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzp(String str) {
        this.zza.zzr.zzI(str);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzq(zzid zzidVar) {
        this.zza.zzr.zzJ(zzidVar);
        this.zza.zzK = null;
        this.zza.zzR = null;
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzr(zzid zzidVar) {
        this.zza.zzR = zzidVar;
        this.zza.zzr.zzK(zzidVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzs(long j, int i) {
        this.zza.zzr.zzL(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzt(zzam zzamVar, zzie zzieVar) {
        this.zza.zzK = zzamVar;
        this.zza.zzr.zzM(zzamVar, zzieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzu(final zzdn zzdnVar) {
        this.zza.zzab = zzdnVar;
        zzep zzepVar = this.zza.zzl;
        zzepVar.zzd(25, new zzem() { // from class: com.google.android.gms.internal.ads.zzjv
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(Object obj) {
                zzdn zzdnVar2 = zzdnVar;
                int i = zzjx.zzb;
                ((zzcm) obj).zzr(zzdnVar2);
            }
        });
        zzepVar.zzc();
    }
}
