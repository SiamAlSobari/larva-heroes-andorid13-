package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzadb extends zzaan {
    public zzadb(final zzabo zzaboVar, int i, long j, long j2) {
        long j3;
        zzaak zzaakVar = new zzaak() { // from class: com.google.android.gms.internal.ads.zzacy
            @Override // com.google.android.gms.internal.ads.zzaak
            public final long zza(long j4) {
                return zzaboVar.zzb(j4);
            }
        };
        zzada zzadaVar = new zzada(zzaboVar, i, null);
        long jZza = zzaboVar.zza();
        long j4 = zzaboVar.zzj;
        int i2 = zzaboVar.zzd;
        if (i2 > 0) {
            j3 = ((((long) i2) + ((long) zzaboVar.zzc)) / 2) + 1;
        } else {
            int i3 = zzaboVar.zza;
            long j5 = 4096;
            if (i3 == zzaboVar.zzb && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * ((long) zzaboVar.zzg)) * ((long) zzaboVar.zzh)) / 8) + 64;
        }
        super(zzaakVar, zzadaVar, jZza, 0L, j4, j, j2, j3, Math.max(6, zzaboVar.zzc));
    }
}
