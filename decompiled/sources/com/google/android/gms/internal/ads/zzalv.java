package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzalv {
    public final Object zza;
    public final zzaky zzb;
    public final zzaly zzc;
    public boolean zzd;

    private zzalv(zzaly zzalyVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzalyVar;
    }

    private zzalv(Object obj, zzaky zzakyVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzakyVar;
        this.zzc = null;
    }

    public static zzalv zza(zzaly zzalyVar) {
        return new zzalv(zzalyVar);
    }

    public static zzalv zzb(Object obj, zzaky zzakyVar) {
        return new zzalv(obj, zzakyVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
