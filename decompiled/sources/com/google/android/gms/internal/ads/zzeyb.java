package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyb implements zzeyv {
    private final zzeyv zza;
    private final zzeyv zzb;
    private final zzfej zzc;
    private final String zzd;
    private zzcvp zze;
    private final Executor zzf;

    public zzeyb(zzeyv zzeyvVar, zzeyv zzeyvVar2, zzfej zzfejVar, String str, Executor executor) {
        this.zza = zzeyvVar;
        this.zzb = zzeyvVar2;
        this.zzc = zzfejVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfdw zzfdwVar, zzeyw zzeywVar) {
        zzcvp zzcvpVar = zzfdwVar.zza;
        this.zze = zzcvpVar;
        if (zzfdwVar.zzc != null) {
            if (zzcvpVar.zzf() != null) {
                zzfdwVar.zzc.zzo().zzl(zzfdwVar.zza.zzf());
            }
            return zzfye.zzh(zzfdwVar.zzc);
        }
        zzcvpVar.zzb().zzl(zzfdwVar.zzb);
        return ((zzeyl) this.zza).zzb(zzeywVar, null, zzfdwVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvp zzd() {
        return this.zze;
    }

    final /* synthetic */ ListenableFuture zzb(zzeyw zzeywVar, zzeya zzeyaVar, zzeyu zzeyuVar, zzcvp zzcvpVar, zzeyg zzeygVar) throws Exception {
        if (zzeygVar != null) {
            zzeya zzeyaVar2 = new zzeya(zzeyaVar.zza, zzeyaVar.zzb, zzeyaVar.zzc, zzeyaVar.zzd, zzeyaVar.zze, zzeyaVar.zzf, zzeygVar.zza);
            if (zzeygVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeyaVar2);
                return zzg(zzeygVar.zzc, zzeywVar);
            }
            ListenableFuture listenableFutureZza = this.zzc.zza(zzeyaVar2);
            if (listenableFutureZza != null) {
                this.zze = null;
                return zzfye.zzn(listenableFutureZza, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzexx
                    @Override // com.google.android.gms.internal.ads.zzfxl
                    public final ListenableFuture zza(Object obj) {
                        return this.zza.zze((zzfeg) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzeyaVar2);
            zzeywVar = new zzeyw(zzeywVar.zzb, zzeygVar.zzb);
        }
        ListenableFuture listenableFutureZzb = ((zzeyl) this.zza).zzb(zzeywVar, zzeyuVar, zzcvpVar);
        this.zze = zzcvpVar;
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzf(zzeywVar, zzeyuVar, null);
    }

    final /* synthetic */ ListenableFuture zze(zzfeg zzfegVar) throws Exception {
        zzfei zzfeiVar;
        if (zzfegVar == null || zzfegVar.zza == null || (zzfeiVar = zzfegVar.zzb) == null) {
            throw new zzdve(1, "Empty prefetch");
        }
        zzaxt zzaxtVarZza = zzaxz.zza();
        zzaxr zzaxrVarZza = zzaxs.zza();
        zzaxrVarZza.zzd(2);
        zzaxrVarZza.zzb(zzaxw.zzd());
        zzaxtVarZza.zza(zzaxrVarZza);
        zzfegVar.zza.zza.zzb().zzc().zzm((zzaxz) zzaxtVarZza.zzal());
        return zzg(zzfegVar.zza, ((zzeya) zzfeiVar).zzb);
    }

    public final synchronized ListenableFuture zzf(final zzeyw zzeywVar, final zzeyu zzeyuVar, zzcvp zzcvpVar) {
        zzcvo zzcvoVarZza = zzeyuVar.zza(zzeywVar.zzb);
        zzcvoVarZza.zza(new zzeyc(this.zzd));
        final zzcvp zzcvpVar2 = (zzcvp) zzcvoVarZza.zzh();
        zzcvpVar2.zzg();
        zzcvpVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzcvpVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfca zzfcaVarZzg = zzcvpVar2.zzg();
            final zzeya zzeyaVar = new zzeya(zzeyuVar, zzeywVar, zzfcaVarZzg.zzd, zzfcaVarZzg.zzf, this.zzf, zzfcaVarZzg.zzj, null);
            return zzfye.zzn(zzfxv.zzu(((zzeyh) this.zzb).zzb(zzeywVar, zzeyuVar, zzcvpVar2)), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzexy
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zzb(zzeywVar, zzeyaVar, zzeyuVar, zzcvpVar2, (zzeyg) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcvpVar2;
        return ((zzeyl) this.zza).zzb(zzeywVar, zzeyuVar, zzcvpVar2);
    }
}
