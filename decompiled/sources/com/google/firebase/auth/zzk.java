package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzadv;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzk implements OnCompleteListener {
    final /* synthetic */ PhoneAuthOptions zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ FirebaseAuth zzc;

    zzk(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions, String str) {
        this.zzc = firebaseAuth;
        this.zza = phoneAuthOptions;
        this.zzb = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String strZzb;
        String strZza;
        if (task.isSuccessful()) {
            strZzb = ((com.google.firebase.auth.internal.zze) task.getResult()).zzb();
            strZza = ((com.google.firebase.auth.internal.zze) task.getResult()).zza();
        } else {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", exception != null ? "Error while validating application identity: ".concat(String.valueOf(exception.getMessage())) : "Error while validating application identity: ");
            if (exception instanceof FirebaseAuthMissingActivityForRecaptchaException) {
                FirebaseAuth.zzX((FirebaseAuthMissingActivityForRecaptchaException) exception, this.zza, this.zzb);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                strZzb = null;
                strZza = null;
            }
        }
        long jLongValue = this.zza.zzg().longValue();
        FirebaseAuth firebaseAuth = this.zzc;
        PhoneAuthOptions phoneAuthOptions = this.zza;
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacksZzab = firebaseAuth.zzab(phoneAuthOptions.zzh(), phoneAuthOptions.zze());
        if (TextUtils.isEmpty(strZzb)) {
            onVerificationStateChangedCallbacksZzab = this.zzc.zzy(this.zza, onVerificationStateChangedCallbacksZzab);
        }
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks = onVerificationStateChangedCallbacksZzab;
        com.google.firebase.auth.internal.zzag zzagVar = (com.google.firebase.auth.internal.zzag) Preconditions.checkNotNull(this.zza.zzc());
        if (zzagVar.zzf()) {
            FirebaseAuth firebaseAuth2 = this.zzc;
            PhoneAuthOptions phoneAuthOptions2 = this.zza;
            zzadv zzadvVar = firebaseAuth2.zzf;
            String str = (String) Preconditions.checkNotNull(phoneAuthOptions2.zzh());
            FirebaseAuth firebaseAuth3 = this.zzc;
            PhoneAuthOptions phoneAuthOptions3 = this.zza;
            String str2 = firebaseAuth3.zzj;
            boolean z = phoneAuthOptions3.zzd() != null;
            PhoneAuthOptions phoneAuthOptions4 = this.zza;
            zzadvVar.zzH(zzagVar, str, str2, jLongValue, z, phoneAuthOptions4.zzl(), strZzb, strZza, this.zzc.zzW(), onVerificationStateChangedCallbacks, phoneAuthOptions4.zzi(), phoneAuthOptions4.zza());
            return;
        }
        FirebaseAuth firebaseAuth4 = this.zzc;
        PhoneAuthOptions phoneAuthOptions5 = this.zza;
        zzadv zzadvVar2 = firebaseAuth4.zzf;
        PhoneMultiFactorInfo phoneMultiFactorInfo = (PhoneMultiFactorInfo) Preconditions.checkNotNull(phoneAuthOptions5.zzf());
        FirebaseAuth firebaseAuth5 = this.zzc;
        PhoneAuthOptions phoneAuthOptions6 = this.zza;
        String str3 = firebaseAuth5.zzj;
        boolean z2 = phoneAuthOptions6.zzd() != null;
        PhoneAuthOptions phoneAuthOptions7 = this.zza;
        zzadvVar2.zzJ(zzagVar, phoneMultiFactorInfo, str3, jLongValue, z2, phoneAuthOptions7.zzl(), strZzb, strZza, this.zzc.zzW(), onVerificationStateChangedCallbacks, phoneAuthOptions7.zzi(), phoneAuthOptions7.zza());
    }
}
