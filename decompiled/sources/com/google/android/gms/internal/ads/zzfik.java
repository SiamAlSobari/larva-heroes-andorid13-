package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfik {
    private final Context zza;
    private final Executor zzb;
    private final zzcaf zzc;
    private final zzfhu zzd;

    zzfik(Context context, Executor executor, zzcaf zzcafVar, zzfhu zzfhuVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcafVar;
        this.zzd = zzfhuVar;
    }

    final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    final /* synthetic */ void zzb(String str, zzfhr zzfhrVar) {
        zzfhg zzfhgVarZza = zzfhf.zza(this.zza, 14);
        zzfhgVarZza.zzh();
        zzfhgVarZza.zzf(this.zzc.zza(str));
        if (zzfhrVar == null) {
            this.zzd.zzb(zzfhgVarZza.zzl());
        } else {
            zzfhrVar.zza(zzfhgVarZza);
            zzfhrVar.zzg();
        }
    }

    public final void zzc(final String str, final zzfhr zzfhrVar) {
        if (zzfhu.zza() && ((Boolean) zzbdd.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfij
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb(str, zzfhrVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfii
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
