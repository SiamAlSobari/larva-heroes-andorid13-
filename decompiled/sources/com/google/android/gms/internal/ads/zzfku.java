package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfku extends zzfkp {
    public zzfku(zzfki zzfkiVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfkiVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfjz.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkq, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfkq
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzfjh zzfjhVarZza;
        if (!TextUtils.isEmpty(str) && (zzfjhVarZza = zzfjh.zza()) != null) {
            for (zzfit zzfitVar : zzfjhVarZza.zzc()) {
                if (this.zza.contains(zzfitVar.zzh())) {
                    zzfitVar.zzg().zzf(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
