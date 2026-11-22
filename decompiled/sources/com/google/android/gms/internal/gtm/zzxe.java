package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public class zzxe extends zzxd implements zzyv {
    protected zzxe(zzxf zzxfVar) {
        super(zzxfVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzxd
    protected final void zzH() {
        super.zzH();
        if (((zzxf) this.zza).zza != zzwy.zze()) {
            zzxf zzxfVar = (zzxf) this.zza;
            zzxfVar.zza = zzxfVar.zza.clone();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzxd, com.google.android.gms.internal.gtm.zzyt
    /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
    public final zzxf zzE() {
        if (!((zzxf) this.zza).zzaq()) {
            return (zzxf) this.zza;
        }
        ((zzxf) this.zza).zza.zzi();
        return (zzxf) super.zzE();
    }
}
