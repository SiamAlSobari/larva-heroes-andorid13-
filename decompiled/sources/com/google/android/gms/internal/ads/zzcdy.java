package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcdy extends zzcdu {
    public zzcdy(zzccj zzccjVar) {
        super(zzccjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final boolean zzt(String str) {
        String strZze = zzbzt.zze(str);
        zzccj zzccjVar = (zzccj) this.zzc.get();
        if (zzccjVar != null && strZze != null) {
            zzccjVar.zzt(strZze, this);
        }
        zzcaa.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, strZze, "noop", "Noop cache is a noop.");
        return false;
    }
}
