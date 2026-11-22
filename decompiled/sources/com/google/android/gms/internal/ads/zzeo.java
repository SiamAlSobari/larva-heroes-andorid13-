package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeo {
    public final Object zza;
    private zzaf zzb = new zzaf();
    private boolean zzc;
    private boolean zzd;

    public zzeo(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzeo) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, zzem zzemVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzemVar.zza(this.zza);
    }

    public final void zzb(zzen zzenVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzah zzahVarZzb = this.zzb.zzb();
        this.zzb = new zzaf();
        this.zzc = false;
        zzenVar.zza(this.zza, zzahVarZzb);
    }

    public final void zzc(zzen zzenVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzenVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
