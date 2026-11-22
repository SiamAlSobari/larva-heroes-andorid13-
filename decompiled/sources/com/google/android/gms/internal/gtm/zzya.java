package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public class zzya {
    private static final zzwt zzb = zzwt.zza;
    protected volatile zzyu zza;
    private volatile zzud zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzya)) {
            return false;
        }
        zzya zzyaVar = (zzya) obj;
        zzyu zzyuVar = this.zza;
        zzyu zzyuVar2 = zzyaVar.zza;
        if (zzyuVar == null && zzyuVar2 == null) {
            return zzb().equals(zzyaVar.zzb());
        }
        if (zzyuVar != null && zzyuVar2 != null) {
            return zzyuVar.equals(zzyuVar2);
        }
        if (zzyuVar != null) {
            zzyaVar.zzd(zzyuVar.zzax());
            return zzyuVar.equals(zzyaVar.zza);
        }
        zzd(zzyuVar2.zzax());
        return this.zza.equals(zzyuVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzua) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzX();
        }
        return 0;
    }

    public final zzud zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzud.zzb;
            } else {
                this.zzc = this.zza.zzR();
            }
            return this.zzc;
        }
    }

    public final zzyu zzc(zzyu zzyuVar) {
        zzyu zzyuVar2 = this.zza;
        this.zzc = null;
        this.zza = zzyuVar;
        return zzyuVar2;
    }

    protected final void zzd(zzyu zzyuVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzyuVar;
                    this.zzc = zzud.zzb;
                } catch (zzxu unused) {
                    this.zza = zzyuVar;
                    this.zzc = zzud.zzb;
                }
            }
        }
    }
}
