package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyu implements zzdj {
    private static final zzfry zza = zzfsb.zza(new zzfry() { // from class: com.google.android.gms.internal.ads.zzys
        @Override // com.google.android.gms.internal.ads.zzfry
        public final Object zza() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object objInvoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                objInvoke.getClass();
                return (zzdj) objInvoke;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    });

    private zzyu() {
    }

    /* synthetic */ zzyu(zzyt zzytVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final zzdl zza(Context context, zzv zzvVar, zzs zzsVar, zzs zzsVar2, boolean z, Executor executor, zzdk zzdkVar) throws zzdi {
        return ((zzdj) zza.zza()).zza(context, zzvVar, zzsVar, zzsVar2, false, executor, zzdkVar);
    }
}
