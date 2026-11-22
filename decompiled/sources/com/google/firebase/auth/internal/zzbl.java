package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbl {
    static /* synthetic */ Task zzc(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
        int i = zzadz.zzb;
        if ((exc instanceof FirebaseAuthException) && ((FirebaseAuthException) exc).getErrorCode().endsWith("MISSING_RECAPTCHA_TOKEN")) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(String.valueOf(recaptchaAction))));
            }
            if (firebaseAuth.zzB() == null) {
                firebaseAuth.zzP(new zzbr(firebaseAuth.getApp(), firebaseAuth));
            }
            return zzd(firebaseAuth.zzB(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    private static Task zzd(zzbr zzbrVar, RecaptchaAction recaptchaAction, String str, Continuation continuation) {
        Task taskZza = zzbrVar.zza(str, false, recaptchaAction);
        return taskZza.continueWithTask(continuation).continueWithTask(new zzbk(str, zzbrVar, recaptchaAction, continuation));
    }

    public abstract Task zza(String str);

    public final Task zzb(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction) {
        final Continuation continuation = new Continuation() { // from class: com.google.firebase.auth.internal.zzbj
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                zzbl zzblVar = this.zza;
                if (task.isSuccessful()) {
                    return zzblVar.zza((String) task.getResult());
                }
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) Preconditions.checkNotNull(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                return zzblVar.zza("NO_RECAPTCHA");
            }
        };
        zzbr zzbrVarZzB = firebaseAuth.zzB();
        return (zzbrVarZzB == null || !zzbrVarZzB.zze()) ? zza(null).continueWithTask(new Continuation() { // from class: com.google.firebase.auth.internal.zzbi
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzbl.zzc(recaptchaAction, firebaseAuth, str, continuation, task);
            }
        }) : zzd(zzbrVarZzB, recaptchaAction, str, continuation);
    }
}
