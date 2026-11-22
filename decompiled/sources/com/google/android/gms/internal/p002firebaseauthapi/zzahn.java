package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahn implements zzaej {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private final zzahz zzg = new zzahz(null);
    private final zzahz zzh = new zzahz(null);
    private String zzi;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza() throws JSONException {
        byte b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        if (!this.zzh.zza().isEmpty()) {
            List listZza = this.zzh.zza();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < listZza.size(); i++) {
                jSONArray.put(listZza.get(i));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List listZza2 = this.zzg.zza();
        int size = listZza2.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < listZza2.size(); i2++) {
            int i3 = 2;
            switch ((String) listZza2.get(i2)) {
                case "DISPLAY_NAME":
                    b = 1;
                    break;
                case "EMAIL":
                    b = 0;
                    break;
                case "PHOTO_URL":
                    b = 3;
                    break;
                case "PASSWORD":
                    b = 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i3 = 1;
            } else if (b != 1) {
                i3 = b != 2 ? b != 3 ? 0 : 4 : 5;
            }
            iArr[i2] = i3;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i4 = 0; i4 < size; i4++) {
                jSONArray2.put(iArr[i4]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str = this.zza;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("password", str3);
        }
        String str4 = this.zzb;
        if (str4 != null) {
            jSONObject.put("displayName", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("photoUrl", str5);
        }
        String str6 = this.zze;
        if (str6 != null) {
            jSONObject.put("oobCode", str6);
        }
        String str7 = this.zzi;
        if (str7 != null) {
            jSONObject.put("tenantId", str7);
        }
        return jSONObject.toString();
    }

    public final zzahn zzb(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzh.zza().add(str);
        return this;
    }

    public final zzahn zzc(String str) {
        if (str == null) {
            this.zzg.zza().add("DISPLAY_NAME");
        } else {
            this.zzb = str;
        }
        return this;
    }

    public final zzahn zzd(String str) {
        if (str == null) {
            this.zzg.zza().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    public final zzahn zze(String str) {
        this.zza = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzahn zzf(String str) {
        this.zze = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzahn zzg(String str) {
        if (str == null) {
            this.zzg.zza().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    public final zzahn zzh(String str) {
        if (str == null) {
            this.zzg.zza().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    public final zzahn zzi(String str) {
        this.zzi = str;
        return this;
    }

    public final String zzj() {
        return this.zzb;
    }

    public final String zzk() {
        return this.zzc;
    }

    public final String zzl() {
        return this.zzd;
    }

    public final String zzm() {
        return this.zzf;
    }

    public final boolean zzn(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zzg.zza().contains(str);
    }
}
