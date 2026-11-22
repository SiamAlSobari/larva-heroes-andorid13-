package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaha implements zzaek {
    private static final String zza = "zzaha";
    private String zzb;
    private zzam zzc;
    private boolean zzd = false;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final /* bridge */ /* synthetic */ zzaek zza(String str) throws zzaca {
        zzam zzamVarZzh;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                boolean z = false;
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzamVarZzh = zzam.zzh(new ArrayList());
                } else {
                    zzaj zzajVar = new zzaj();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        zzajVar.zzb(jSONObject2 == null ? new zzafz(null, null) : new zzafz(Strings.emptyToNull(jSONObject2.optString("provider")), Strings.emptyToNull(jSONObject2.optString("enforcementState"))));
                    }
                    zzamVarZzh = zzajVar.zzc();
                }
                this.zzc = zzamVarZzh;
                if (zzamVarZzh != null && !zzamVarZzh.isEmpty()) {
                    String strZza = ((zzahi) zzamVarZzh.get(0)).zza();
                    String strZzb = ((zzahi) zzamVarZzh.get(0)).zzb();
                    if (strZza != null && strZzb != null && ((strZza.equals("ENFORCE") || strZza.equals("AUDIT")) && strZzb.equals("EMAIL_PASSWORD_PROVIDER"))) {
                        z = true;
                    }
                }
                this.zzd = z;
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzain.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
