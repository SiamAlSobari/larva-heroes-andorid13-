package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvq extends zztg {
    private final zzbp zzd;

    public zzvq(zzcw zzcwVar, zzbp zzbpVar) {
        super(zzcwVar);
        this.zzd = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzcw
    public final zzcv zze(int i, zzcv zzcvVar, long j) {
        this.zzc.zze(i, zzcvVar, j);
        zzbp zzbpVar = this.zzd;
        zzcvVar.zze = zzbpVar;
        zzbi zzbiVar = zzbpVar.zzd;
        zzcvVar.zzd = null;
        return zzcvVar;
    }
}
