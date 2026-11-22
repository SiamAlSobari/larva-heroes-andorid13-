package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdhi implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzdhi(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcag zzcagVarZza = ((zzchv) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzaub(UUID.randomUUID().toString(), zzcagVarZza, "native", new JSONObject(), false, true);
    }
}
