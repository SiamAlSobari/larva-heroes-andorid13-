package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzehb implements zzfya {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfbe zzc;
    final /* synthetic */ zzfbi zzd;
    final /* synthetic */ zzfig zze;
    final /* synthetic */ zzfbr zzf;
    final /* synthetic */ zzehc zzg;

    zzehb(zzehc zzehcVar, long j, String str, zzfbe zzfbeVar, zzfbi zzfbiVar, zzfig zzfigVar, zzfbr zzfbrVar) {
        this.zzg = zzehcVar;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzfbeVar;
        this.zzd = zzfbiVar;
        this.zze = zzfigVar;
        this.zzf = zzfbrVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        Integer numValueOf;
        int i;
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        zzehc zzehcVar;
        com.google.android.gms.ads.internal.client.zze zzeVarZza;
        int i2;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzedr zzedrVar;
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzegp) {
                numValueOf = null;
                i = 3;
            } else if (th instanceof CancellationException) {
                i = 4;
            } else if (th instanceof zzfcf) {
                i = 5;
            } else {
                if (th instanceof zzdve) {
                    int i3 = zzfdb.zza(th).zza == 3 ? 1 : 6;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbz)).booleanValue() && (th instanceof zzedr) && (zzeVarZzb = ((zzedr) th).zzb()) != null) {
                        numValueOf = Integer.valueOf(zzeVarZzb.zza);
                        i = i3;
                    } else {
                        i = i3;
                    }
                } else {
                    numValueOf = null;
                    i = 6;
                }
            }
            zzehc.zzg(this.zzg, this.zzb, i, jElapsedRealtime, this.zzc.zzag, numValueOf);
            zzehcVar = this.zzg;
            if (zzehcVar.zze) {
                zzehd zzehdVar = zzehcVar.zzb;
                zzfbi zzfbiVar = this.zzd;
                zzfbe zzfbeVar = this.zzc;
                if (th instanceof zzedr) {
                    zzedrVar = (zzedr) th;
                } else {
                    zzedrVar = null;
                }
                zzehdVar.zza(zzfbiVar, zzfbeVar, i, zzedrVar, jElapsedRealtime);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhY)).booleanValue()) {
                zzfik zzfikVar = this.zzg.zzc;
                zzfig zzfigVar = this.zze;
                zzfbr zzfbrVar = this.zzf;
                zzfbe zzfbeVar2 = this.zzc;
                zzfikVar.zzd(zzfigVar.zzc(zzfbrVar, zzfbeVar2, zzfbeVar2.zzo));
            }
            zzeVarZza = zzfdb.zza(th);
            i2 = zzeVarZza.zza;
            if ((i2 != 3 || i2 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            }
            this.zzg.zzf.zze(this.zzc, jElapsedRealtime, zzeVarZza);
        }
        i = 2;
        numValueOf = null;
        zzehc.zzg(this.zzg, this.zzb, i, jElapsedRealtime, this.zzc.zzag, numValueOf);
        zzehcVar = this.zzg;
        if (zzehcVar.zze) {
            zzehd zzehdVar2 = zzehcVar.zzb;
            zzfbi zzfbiVar2 = this.zzd;
            zzfbe zzfbeVar3 = this.zzc;
            if (th instanceof zzedr) {
                zzedrVar = (zzedr) th;
            } else {
                zzedrVar = null;
            }
            zzehdVar2.zza(zzfbiVar2, zzfbeVar3, i, zzedrVar, jElapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhY)).booleanValue()) {
            zzfik zzfikVar2 = this.zzg.zzc;
            zzfig zzfigVar2 = this.zze;
            zzfbr zzfbrVar2 = this.zzf;
            zzfbe zzfbeVar4 = this.zzc;
            zzfikVar2.zzd(zzfigVar2.zzc(zzfbrVar2, zzfbeVar4, zzfbeVar4.zzo));
        }
        zzeVarZza = zzfdb.zza(th);
        i2 = zzeVarZza.zza;
        zzeVarZza = i2 != 3 ? zzfdb.zza(new zzedr(13, zzeVarZza.zzd)) : zzfdb.zza(new zzedr(13, zzeVarZza.zzd));
        this.zzg.zzf.zze(this.zzc, jElapsedRealtime, zzeVarZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object obj) {
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        zzehc.zzg(this.zzg, this.zzb, 0, jElapsedRealtime, this.zzc.zzag, null);
        zzehc zzehcVar = this.zzg;
        if (zzehcVar.zze) {
            zzehcVar.zzb.zza(this.zzd, this.zzc, 0, null, jElapsedRealtime);
        }
        this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, null);
    }
}
