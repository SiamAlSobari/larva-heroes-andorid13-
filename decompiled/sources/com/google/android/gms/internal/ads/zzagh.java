package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagh extends zzagj {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzagh(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String toString() {
        return zzf(this.zzd) + " leaves: " + Arrays.toString(this.zzb.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzagh zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzagh zzaghVar = (zzagh) this.zzc.get(i2);
            if (zzaghVar.zzd == i) {
                return zzaghVar;
            }
        }
        return null;
    }

    public final zzagi zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzagi zzagiVar = (zzagi) this.zzb.get(i2);
            if (zzagiVar.zzd == i) {
                return zzagiVar;
            }
        }
        return null;
    }

    public final void zzc(zzagh zzaghVar) {
        this.zzc.add(zzaghVar);
    }

    public final void zzd(zzagi zzagiVar) {
        this.zzb.add(zzagiVar);
    }
}
