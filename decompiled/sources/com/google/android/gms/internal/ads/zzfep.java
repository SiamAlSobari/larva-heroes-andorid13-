package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfep {
    private final zzfei zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfep(final zzfdn zzfdnVar, final zzfeh zzfehVar, final zzfei zzfeiVar) {
        this.zza = zzfeiVar;
        this.zzb = zzfye.zzf(zzfye.zzn(zzfehVar.zza(zzfeiVar), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzfen
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzfehVar, zzfdnVar, zzfeiVar, (zzfdw) obj);
            }
        }, zzfeiVar.zzb()), Exception.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzfeo
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfehVar, (Exception) obj);
            }
        }, zzfeiVar.zzb());
    }

    public final synchronized ListenableFuture zza(zzfei zzfeiVar) {
        if (!this.zzd && !this.zzc) {
            if (this.zza.zza() != null && zzfeiVar.zza() != null && this.zza.zza().equals(zzfeiVar.zza())) {
                this.zzc = true;
                return this.zzb;
            }
            return null;
        }
        return null;
    }

    final /* synthetic */ ListenableFuture zzb(zzfeh zzfehVar, zzfdn zzfdnVar, zzfei zzfeiVar, zzfdw zzfdwVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfehVar.zzb(zzfdwVar);
            if (this.zzc) {
                return zzfye.zzh(new zzfeg(zzfdwVar, zzfeiVar));
            }
            zzfdnVar.zzd(zzfeiVar.zza(), zzfdwVar);
            return zzfye.zzh(null);
        }
    }

    final /* synthetic */ ListenableFuture zzc(zzfeh zzfehVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfya zzfyaVar) {
        zzfye.zzr(zzfye.zzn(this.zzb, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzfem
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzfye.zzi();
            }
        }, this.zza.zzb()), zzfyaVar, this.zza.zzb());
    }
}
