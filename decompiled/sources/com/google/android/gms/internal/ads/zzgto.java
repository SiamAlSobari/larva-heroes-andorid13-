package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgto {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgto() {
    }

    static /* bridge */ /* synthetic */ zzgqi zza(zzgto zzgtoVar, zzgqi zzgqiVar, zzgqi zzgqiVar2) {
        zzgtoVar.zzb(zzgqiVar);
        zzgtoVar.zzb(zzgqiVar2);
        zzgqi zzgtsVar = (zzgqi) zzgtoVar.zza.pop();
        while (!zzgtoVar.zza.isEmpty()) {
            zzgtsVar = new zzgts((zzgqi) zzgtoVar.zza.pop(), zzgtsVar);
        }
        return zzgtsVar;
    }

    private final void zzb(zzgqi zzgqiVar) {
        zzgtr zzgtrVar;
        if (!zzgqiVar.zzh()) {
            if (!(zzgqiVar instanceof zzgts)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgqiVar.getClass()))));
            }
            zzgts zzgtsVar = (zzgts) zzgqiVar;
            zzb(zzgtsVar.zzd);
            zzb(zzgtsVar.zze);
            return;
        }
        int iZzc = zzc(zzgqiVar.zzd());
        int iZzc2 = zzgts.zzc(iZzc + 1);
        if (this.zza.isEmpty() || ((zzgqi) this.zza.peek()).zzd() >= iZzc2) {
            this.zza.push(zzgqiVar);
            return;
        }
        int iZzc3 = zzgts.zzc(iZzc);
        zzgqi zzgtsVar2 = (zzgqi) this.zza.pop();
        while (true) {
            zzgtrVar = null;
            if (this.zza.isEmpty() || ((zzgqi) this.zza.peek()).zzd() >= iZzc3) {
                break;
            } else {
                zzgtsVar2 = new zzgts((zzgqi) this.zza.pop(), zzgtsVar2);
            }
        }
        zzgts zzgtsVar3 = new zzgts(zzgtsVar2, zzgqiVar);
        while (!this.zza.isEmpty()) {
            if (((zzgqi) this.zza.peek()).zzd() >= zzgts.zzc(zzc(zzgtsVar3.zzd()) + 1)) {
                break;
            } else {
                zzgtsVar3 = new zzgts((zzgqi) this.zza.pop(), zzgtsVar3);
            }
        }
        this.zza.push(zzgtsVar3);
    }

    private static final int zzc(int i) {
        int iBinarySearch = Arrays.binarySearch(zzgts.zza, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* synthetic */ zzgto(zzgtn zzgtnVar) {
    }
}
