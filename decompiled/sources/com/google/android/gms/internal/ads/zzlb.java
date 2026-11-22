package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlb implements zzuc, zzqu {
    final /* synthetic */ zzlf zza;
    private final zzld zzb;

    public zzlb(zzlf zzlfVar, zzld zzldVar) {
        this.zza = zzlfVar;
        this.zzb = zzldVar;
    }

    private final Pair zzf(int i, zzts zztsVar) {
        zzts zztsVarZzc;
        zzts zztsVar2 = null;
        if (zztsVar != null) {
            zzld zzldVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzldVar.zzc.size()) {
                    zztsVarZzc = null;
                    break;
                }
                if (((zzts) zzldVar.zzc.get(i2)).zzd == zztsVar.zzd) {
                    zztsVarZzc = zztsVar.zzc(Pair.create(zzldVar.zzb, zztsVar.zza));
                    break;
                }
                i2++;
            }
            if (zztsVarZzc == null) {
                return null;
            }
            zztsVar2 = zztsVarZzc;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zztsVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzac(int i, zzts zztsVar, final zzto zztoVar) {
        final Pair pairZzf = zzf(0, zztsVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkz
                @Override // java.lang.Runnable
                public final void run() {
                    zzlb zzlbVar = this.zza;
                    Pair pair = pairZzf;
                    zzlbVar.zza.zzh.zzac(((Integer) pair.first).intValue(), (zzts) pair.second, zztoVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzad(int i, zzts zztsVar, final zztj zztjVar, final zzto zztoVar) {
        final Pair pairZzf = zzf(0, zztsVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzky
                @Override // java.lang.Runnable
                public final void run() {
                    zzlb zzlbVar = this.zza;
                    Pair pair = pairZzf;
                    zzlbVar.zza.zzh.zzad(((Integer) pair.first).intValue(), (zzts) pair.second, zztjVar, zztoVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzae(int i, zzts zztsVar, final zztj zztjVar, final zzto zztoVar) {
        final Pair pairZzf = zzf(0, zztsVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkx
                @Override // java.lang.Runnable
                public final void run() {
                    zzlb zzlbVar = this.zza;
                    Pair pair = pairZzf;
                    zzlbVar.zza.zzh.zzae(((Integer) pair.first).intValue(), (zzts) pair.second, zztjVar, zztoVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzaf(int i, zzts zztsVar, final zztj zztjVar, final zzto zztoVar, final IOException iOException, final boolean z) {
        final Pair pairZzf = zzf(0, zztsVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final void run() {
                    zzlb zzlbVar = this.zza;
                    Pair pair = pairZzf;
                    zzlbVar.zza.zzh.zzaf(((Integer) pair.first).intValue(), (zzts) pair.second, zztjVar, zztoVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzag(int i, zzts zztsVar, final zztj zztjVar, final zzto zztoVar) {
        final Pair pairZzf = zzf(0, zztsVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzla
                @Override // java.lang.Runnable
                public final void run() {
                    zzlb zzlbVar = this.zza;
                    Pair pair = pairZzf;
                    zzlbVar.zza.zzh.zzag(((Integer) pair.first).intValue(), (zzts) pair.second, zztjVar, zztoVar);
                }
            });
        }
    }
}
