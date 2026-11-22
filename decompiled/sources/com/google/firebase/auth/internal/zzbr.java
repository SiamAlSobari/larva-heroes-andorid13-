package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzaha;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbr {
    final Map zza;
    final FirebaseApp zzb;
    final FirebaseAuth zzc;
    final zzbm zzd;
    private zzaha zze;

    public zzbr(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth) {
        zzbn zzbnVar = new zzbn();
        this.zza = new HashMap();
        this.zzb = firebaseApp;
        this.zzc = firebaseAuth;
        this.zzd = zzbnVar;
    }

    public static void zzd() throws zzbs {
    }

    private final Task zzf(String str) {
        return (Task) this.zza.get(str);
    }

    private static String zzg(String str) {
        return com.google.android.gms.internal.p002firebaseauthapi.zzac.zzd(str) ? "*" : str;
    }

    public final Task zza(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        try {
            zzd();
            String strZzg = zzg(str);
            Task taskZzf = zzf(strZzg);
            if (bool.booleanValue() || taskZzf == null) {
                taskZzf = zzb(strZzg, bool);
            }
            return taskZzf.continueWithTask(new zzbq(this, recaptchaAction));
        } catch (zzbs e) {
            return Tasks.forException(e);
        }
    }

    public final Task zzb(String str, Boolean bool) {
        Task taskZzf;
        try {
            zzd();
            String strZzg = zzg(str);
            return (bool.booleanValue() || (taskZzf = zzf(strZzg)) == null) ? this.zzc.zze("RECAPTCHA_ENTERPRISE").continueWithTask(new zzbp(this, strZzg)) : taskZzf;
        } catch (zzbs e) {
            return Tasks.forException(e);
        }
    }

    public final boolean zze() {
        zzaha zzahaVar = this.zze;
        return zzahaVar != null && zzahaVar.zzc();
    }
}
