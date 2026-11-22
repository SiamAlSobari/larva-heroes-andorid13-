package com.google.android.gms.ads.internal.util;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzamm;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcas;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbn extends zzalp {
    private final zzcas zza;
    private final zzbzz zzb;

    public zzbn(String str, Map map, zzcas zzcasVar) {
        super(0, str, new zzbm(zzcasVar));
        this.zza = zzcasVar;
        zzbzz zzbzzVar = new zzbzz(null);
        this.zzb = zzbzzVar;
        zzbzzVar.zzd(str, ShareTarget.METHOD_GET, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    protected final zzalv zzh(zzall zzallVar) {
        return zzalv.zzb(zzallVar, zzamm.zzb(zzallVar));
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    protected final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzall zzallVar = (zzall) obj;
        this.zzb.zzf(zzallVar.zzc, zzallVar.zza);
        zzbzz zzbzzVar = this.zzb;
        byte[] bArr = zzallVar.zzb;
        if (zzbzz.zzk() && bArr != null) {
            zzbzzVar.zzh(bArr);
        }
        this.zza.zzc(zzallVar);
    }
}
