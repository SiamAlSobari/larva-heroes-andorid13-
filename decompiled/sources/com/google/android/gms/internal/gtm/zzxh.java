package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxh extends zzwr {
    final zzyu zza;
    final Object zzb;
    final zzyu zzc;
    final zzxg zzd;

    zzxh(zzyu zzyuVar, Object obj, zzyu zzyuVar2, zzxg zzxgVar, Class cls) {
        if (zzyuVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (zzxgVar.zzc == zzaao.MESSAGE && zzyuVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.zza = zzyuVar;
        this.zzb = obj;
        this.zzc = zzyuVar2;
        this.zzd = zzxgVar;
    }

    final Object zza(Object obj) {
        return this.zzd.zzc.zza() == zzaap.ENUM ? this.zzd.zza.zza(((Integer) obj).intValue()) : obj;
    }
}
