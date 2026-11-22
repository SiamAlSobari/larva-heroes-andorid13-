package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagu implements zzaej {
    private final String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private ActionCodeSettings zze;
    private String zzf;
    private String zzg;

    public zzagu(int i) {
        this.zza = i != 1 ? i != 4 ? i != 6 ? i != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    private zzagu(int i, ActionCodeSettings actionCodeSettings, String str, String str2, String str3, String str4, String str5) {
        this.zza = "VERIFY_AND_CHANGE_EMAIL";
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public static zzagu zzc(ActionCodeSettings actionCodeSettings, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(actionCodeSettings);
        return new zzagu(7, actionCodeSettings, null, str2, str, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza() throws JSONException {
        byte b;
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        switch (this.zza) {
            case "PASSWORD_RESET":
                b = 0;
                break;
            case "VERIFY_EMAIL":
                b = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                b = 3;
                break;
            case "EMAIL_SIGNIN":
                b = 2;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            i = 1;
        } else if (b == 1) {
            i = 4;
        } else if (b == 2) {
            i = 6;
        } else if (b == 3) {
            i = 7;
        }
        jSONObject.put("requestType", i);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("newEmail", str2);
        }
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        ActionCodeSettings actionCodeSettings = this.zze;
        if (actionCodeSettings != null) {
            jSONObject.put("androidInstallApp", actionCodeSettings.getAndroidInstallApp());
            jSONObject.put("canHandleCodeInApp", this.zze.canHandleCodeInApp());
            if (this.zze.getUrl() != null) {
                jSONObject.put("continueUrl", this.zze.getUrl());
            }
            if (this.zze.getIOSBundle() != null) {
                jSONObject.put("iosBundleId", this.zze.getIOSBundle());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.getAndroidPackageName() != null) {
                jSONObject.put("androidPackageName", this.zze.getAndroidPackageName());
            }
            if (this.zze.getAndroidMinimumVersion() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.getAndroidMinimumVersion());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
        }
        String str4 = this.zzf;
        if (str4 != null) {
            jSONObject.put("tenantId", str4);
        }
        String str5 = this.zzg;
        if (str5 != null) {
            zzain.zzd(jSONObject, "captchaResp", str5);
        } else {
            zzain.zzc(jSONObject);
        }
        return jSONObject.toString();
    }

    public final ActionCodeSettings zzb() {
        return this.zze;
    }

    public final zzagu zzd(ActionCodeSettings actionCodeSettings) {
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        return this;
    }

    public final zzagu zze(String str) {
        this.zzg = str;
        return this;
    }

    public final zzagu zzf(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzagu zzg(String str) {
        this.zzf = str;
        return this;
    }

    public final zzagu zzh(String str) {
        this.zzd = Preconditions.checkNotEmpty(str);
        return this;
    }
}
