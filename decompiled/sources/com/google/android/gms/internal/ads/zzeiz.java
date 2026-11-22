package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeiz implements zzedn {
    private final Context zza;
    private final zzcqz zzb;
    private final zzbcp zzc;
    private final zzfyo zzd;
    private final zzfge zze;

    public zzeiz(Context context, zzcqz zzcqzVar, zzfge zzfgeVar, zzfyo zzfyoVar, zzbcp zzbcpVar) {
        this.zza = context;
        this.zzb = zzcqzVar;
        this.zze = zzfgeVar;
        this.zzd = zzfyoVar;
        this.zzc = zzbcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final ListenableFuture zza(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzcqd zzcqdVarZza = this.zzb.zza(new zzcst(zzfbrVar, zzfbeVar, null), new zzeix(this, new View(this.zza), null, new zzcsc() { // from class: com.google.android.gms.internal.ads.zzeiv
            @Override // com.google.android.gms.internal.ads.zzcsc
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return null;
            }
        }, (zzfbf) zzfbeVar.zzv.get(0)));
        zzeiy zzeiyVarZzk = zzcqdVarZza.zzk();
        zzfbk zzfbkVar = zzfbeVar.zzt;
        final zzbck zzbckVar = new zzbck(zzeiyVarZzk, zzfbkVar.zzb, zzfbkVar.zza);
        zzfge zzfgeVar = this.zze;
        return zzffo.zzd(new zzffi() { // from class: com.google.android.gms.internal.ads.zzeiw
            @Override // com.google.android.gms.internal.ads.zzffi
            public final void zza() throws Exception {
                this.zza.zzc(zzbckVar);
            }
        }, this.zzd, zzffy.CUSTOM_RENDER_SYN, zzfgeVar).zzb(zzffy.CUSTOM_RENDER_ACK).zzd(zzfye.zzh(zzcqdVarZza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzfbk zzfbkVar;
        return (this.zzc == null || (zzfbkVar = zzfbeVar.zzt) == null || zzfbkVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(zzbck zzbckVar) throws Exception {
        this.zzc.zze(zzbckVar);
    }
}
