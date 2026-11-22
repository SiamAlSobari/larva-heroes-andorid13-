package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaal implements zzafe {
    final /* synthetic */ zzahn zza;
    final /* synthetic */ zzags zzb;
    final /* synthetic */ zzadx zzc;
    final /* synthetic */ zzahb zzd;
    final /* synthetic */ zzafd zze;
    final /* synthetic */ zzabz zzf;

    zzaal(zzabz zzabzVar, zzahn zzahnVar, zzags zzagsVar, zzadx zzadxVar, zzahb zzahbVar, zzafd zzafdVar) {
        this.zzf = zzabzVar;
        this.zza = zzahnVar;
        this.zzb = zzagsVar;
        this.zzc = zzadxVar;
        this.zzd = zzahbVar;
        this.zze = zzafdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zze.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaho zzahoVar = (zzaho) obj;
        if (this.zza.zzn("EMAIL")) {
            this.zzb.zzg(null);
        } else {
            zzahn zzahnVar = this.zza;
            if (zzahnVar.zzk() != null) {
                this.zzb.zzg(zzahnVar.zzk());
            }
        }
        if (this.zza.zzn("DISPLAY_NAME")) {
            this.zzb.zzf(null);
        } else {
            zzahn zzahnVar2 = this.zza;
            if (zzahnVar2.zzj() != null) {
                this.zzb.zzf(zzahnVar2.zzj());
            }
        }
        if (this.zza.zzn("PHOTO_URL")) {
            this.zzb.zzj(null);
        } else {
            zzahn zzahnVar3 = this.zza;
            if (zzahnVar3.zzm() != null) {
                this.zzb.zzj(zzahnVar3.zzm());
            }
        }
        if (!TextUtils.isEmpty(this.zza.zzl())) {
            this.zzb.zzi(Base64Utils.encode("redacted".getBytes()));
        }
        List listZzf = zzahoVar.zzf();
        if (listZzf == null) {
            listZzf = new ArrayList();
        }
        this.zzb.zzk(listZzf);
        zzadx zzadxVar = this.zzc;
        zzahb zzahbVar = this.zzd;
        Preconditions.checkNotNull(zzahbVar);
        Preconditions.checkNotNull(zzahoVar);
        String strZzd = zzahoVar.zzd();
        String strZze = zzahoVar.zze();
        if (!TextUtils.isEmpty(strZzd) && !TextUtils.isEmpty(strZze)) {
            zzahbVar = new zzahb(strZze, strZzd, Long.valueOf(zzahoVar.zzb()), zzahbVar.zzg());
        }
        zzadxVar.zzk(zzahbVar, this.zzb);
    }
}
