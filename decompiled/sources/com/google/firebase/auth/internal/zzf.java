package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.internal.p002firebaseauthapi.zzael;
import com.google.android.gms.internal.p002firebaseauthapi.zzafx;
import com.google.android.gms.internal.p002firebaseauthapi.zzagx;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzf {
    private static final String zza = "zzf";
    private static final zzf zzb = new zzf();
    private String zzc;

    private zzf() {
    }

    public static zzf zzb() {
        return zzb;
    }

    private final void zzf(FirebaseAuth firebaseAuth, zzbz zzbzVar, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task task;
        if (activity == null) {
            taskCompletionSource.setException(new FirebaseAuthMissingActivityForRecaptchaException());
            return;
        }
        zzbzVar.zzg(firebaseAuth.getApp().getApplicationContext(), firebaseAuth);
        Preconditions.checkNotNull(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (zzax.zza().zzg(activity, taskCompletionSource2)) {
            Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent.setClass(activity, RecaptchaActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtra("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.getApp().getOptions().getApiKey());
            if (!TextUtils.isEmpty(firebaseAuth.getTenantId())) {
                intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.getTenantId());
            }
            intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzael.zza().zzb());
            intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", firebaseAuth.getApp().getName());
            activity.startActivity(intent);
            task = taskCompletionSource2.getTask();
        } else {
            task = Tasks.forException(zzadz.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        task.addOnSuccessListener(new zzd(this, taskCompletionSource)).addOnFailureListener(new zzc(this, taskCompletionSource));
    }

    public final Task zza(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z, boolean z2) {
        zzw zzwVar = (zzw) firebaseAuth.getFirebaseAuthSettings();
        final zzbz zzbzVarZzc = zzbz.zzc();
        if (zzafx.zzg(firebaseAuth.getApp()) || zzwVar.zze()) {
            return Tasks.forResult(new zze(null, null));
        }
        String str2 = zza;
        Log.i(str2, "ForceRecaptchaFlow from phoneAuthOptions = " + z2 + ", ForceRecaptchaFlow from firebaseSettings = " + zzwVar.zzc());
        boolean zZzc = z2 | zzwVar.zzc();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task taskZzb = zzbzVarZzc.zzb();
        if (taskZzb != null) {
            if (taskZzb.isSuccessful()) {
                return Tasks.forResult(new zze((String) taskZzb.getResult(), null));
            }
            Log.e(str2, "Error in previous reCAPTCHA flow: ".concat(String.valueOf(taskZzb.getException().getMessage())));
            Log.e(str2, "Continuing with application verification as normal");
        }
        if (!z || zZzc) {
            zzf(firebaseAuth, zzbzVarZzc, activity, taskCompletionSource);
        } else {
            (!TextUtils.isEmpty(this.zzc) ? Tasks.forResult(new zzagx(this.zzc)) : firebaseAuth.zzd()).continueWithTask(firebaseAuth.zzM(), new zzb(this, str, IntegrityManagerFactory.create(firebaseAuth.getApp().getApplicationContext()))).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.zza
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.zza.zze(taskCompletionSource, firebaseAuth, zzbzVarZzc, activity, task);
                }
            });
        }
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ void zze(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, zzbz zzbzVar, Activity activity, Task task) {
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new zze(null, ((IntegrityTokenResponse) task.getResult()).token()));
        } else {
            Log.e(zza, "Play Integrity Token fetch failed, falling back to Recaptcha".concat(String.valueOf(task.getException() == null ? "" : task.getException().getMessage())));
            zzf(firebaseAuth, zzbzVar, activity, taskCompletionSource);
        }
    }
}
