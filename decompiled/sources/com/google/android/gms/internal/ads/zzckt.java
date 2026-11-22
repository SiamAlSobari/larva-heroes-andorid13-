package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckt implements zzfax {
    private final zzciz zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzckt(zzciz zzcizVar, zzcks zzcksVar) {
        this.zza = zzcizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final /* synthetic */ zzfax zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final /* synthetic */ zzfax zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final zzfay zzc() {
        zzgzb.zzc(this.zzb, Context.class);
        return new zzckv(this.zza, this.zzb, this.zzc, null);
    }
}
