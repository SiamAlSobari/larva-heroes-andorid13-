package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zze;
import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaam implements zzafe {
    final /* synthetic */ zzafd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Boolean zzd;
    final /* synthetic */ zze zze;
    final /* synthetic */ zzadx zzf;
    final /* synthetic */ zzahb zzg;

    zzaam(zzabz zzabzVar, zzafd zzafdVar, String str, String str2, Boolean bool, zze zzeVar, zzadx zzadxVar, zzahb zzahbVar) {
        this.zza = zzafdVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = zzeVar;
        this.zzf = zzadxVar;
        this.zzg = zzahbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listZzb = ((zzagr) obj).zzb();
        if (listZzb == null || listZzb.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzags zzagsVar = (zzags) listZzb.get(0);
        zzahh zzahhVarZzl = zzagsVar.zzl();
        List listZzc = zzahhVarZzl != null ? zzahhVarZzl.zzc() : null;
        if (listZzc != null && !listZzc.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                ((zzahg) listZzc.get(0)).zzh(this.zzc);
            } else {
                for (int i = 0; i < listZzc.size(); i++) {
                    if (((zzahg) listZzc.get(i)).zzf().equals(this.zzb)) {
                        ((zzahg) listZzc.get(i)).zzh(this.zzc);
                        break;
                    }
                }
            }
        }
        zzagsVar.zzh(this.zzd.booleanValue());
        zzagsVar.zze(this.zze);
        this.zzf.zzk(this.zzg, zzagsVar);
    }
}
