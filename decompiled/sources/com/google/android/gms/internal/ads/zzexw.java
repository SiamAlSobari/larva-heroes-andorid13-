package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzexw implements zzeyv {
    private zzcvp zza;
    private final Executor zzb = zzfyu.zzb();

    public final zzcvp zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzeyw zzeywVar, zzeyu zzeyuVar, zzcvp zzcvpVar) {
        zzcvo zzcvoVarZza = zzeyuVar.zza(zzeywVar.zzb);
        zzcvoVarZza.zzb(new zzeyz(true));
        zzcvp zzcvpVar2 = (zzcvp) zzcvoVarZza.zzh();
        this.zza = zzcvpVar2;
        final zzctl zzctlVarZzb = zzcvpVar2.zzb();
        final zzfdw zzfdwVar = new zzfdw();
        return zzfye.zzm(zzfye.zzn(zzfxv.zzu(zzctlVarZzb.zzj()), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzexu
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                zzfdw zzfdwVar2 = zzfdwVar;
                zzctl zzctlVar = zzctlVarZzb;
                zzfbr zzfbrVar = (zzfbr) obj;
                zzfdwVar2.zzb = zzfbrVar;
                Iterator it = zzfbrVar.zzb.zza.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzfbe) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzfye.zzh(null);
                        }
                        z = true;
                    }
                }
                if (z) {
                    return zzctlVar.zzi(zzfye.zzh(zzfbrVar));
                }
                return zzfye.zzh(null);
            }
        }, this.zzb), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzexv
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                zzfdw zzfdwVar2 = zzfdwVar;
                zzfdwVar2.zzc = (zzcse) obj;
                return zzfdwVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
