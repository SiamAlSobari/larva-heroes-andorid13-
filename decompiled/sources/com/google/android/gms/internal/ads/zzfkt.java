package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfkt extends zzfkp {
    public zzfkt(zzfki zzfkiVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfkiVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfjh zzfjhVarZza = zzfjh.zza();
        if (zzfjhVarZza != null) {
            for (zzfit zzfitVar : zzfjhVarZza.zzc()) {
                if (this.zza.contains(zzfitVar.zzh())) {
                    zzfitVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkq, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfkq
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
