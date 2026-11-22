package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.zzbl;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzab extends zzbl {
    final /* synthetic */ boolean zza;
    final /* synthetic */ FirebaseUser zzb;
    final /* synthetic */ EmailAuthCredential zzc;
    final /* synthetic */ FirebaseAuth zzd;

    zzab(FirebaseAuth firebaseAuth, boolean z, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zzd = firebaseAuth;
        this.zza = z;
        this.zzb = firebaseUser;
        this.zzc = emailAuthCredential;
    }

    @Override // com.google.firebase.auth.internal.zzbl
    public final Task zza(String str) {
        if (this.zza) {
            if (TextUtils.isEmpty(str)) {
                Log.i("FirebaseAuth", " Email link reauth with empty reCAPTCHA token");
            } else {
                Log.i("FirebaseAuth", "Got reCAPTCHA token for reauth with email link");
            }
            FirebaseAuth firebaseAuth = this.zzd;
            return firebaseAuth.zzf.zzq(firebaseAuth.zzb, this.zzb, this.zzc, str, new zzad(firebaseAuth));
        }
        EmailAuthCredential emailAuthCredential = this.zzc;
        String strZzd = emailAuthCredential.zzd();
        String strZze = emailAuthCredential.zze();
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Reauthenticating " + strZzd + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for reauth with ".concat(String.valueOf(strZzd)));
        }
        FirebaseAuth firebaseAuth2 = this.zzd;
        return firebaseAuth2.zzf.zzs(firebaseAuth2.zzb, this.zzb, strZzd, Preconditions.checkNotEmpty(strZze), this.zzb.getTenantId(), str, new zzad(this.zzd));
    }
}
