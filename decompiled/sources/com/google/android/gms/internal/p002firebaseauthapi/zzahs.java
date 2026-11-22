package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public class zzahs implements zzaek {
    private static final String zza = "zzahs";

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzahs zza(String str) throws zzaca {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                zzahw zzahwVar = new zzahw();
                zzahwVar.zzd(str);
                return zzahwVar;
            }
            if (jSONObject.optJSONObject("totpSessionInfo") == null) {
                throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
            }
            zzahy zzahyVar = new zzahy();
            zzahyVar.zzg(str);
            return zzahyVar;
        } catch (NullPointerException | JSONException e) {
            throw zzain.zza(e, zza, str);
        }
    }

    public String zzc() {
        return null;
    }
}
