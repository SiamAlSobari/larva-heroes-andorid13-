package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzadv;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.internal.p002firebaseauthapi.zzaee;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeo;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.internal.p002firebaseauthapi.zzafx;
import com.google.android.gms.internal.p002firebaseauthapi.zzahb;
import com.google.android.gms.internal.p002firebaseauthapi.zzahl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzba;
import com.google.firebase.auth.internal.zzbr;
import com.google.firebase.auth.internal.zzbt;
import com.google.firebase.auth.internal.zzbv;
import com.google.firebase.auth.internal.zzbx;
import com.google.firebase.auth.internal.zzbz;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class FirebaseAuth implements InternalAuthProvider {
    public static final /* synthetic */ int zza = 0;
    private final FirebaseApp zzb;
    private final List zzc;
    private final List zzd;
    private final List zze;
    private final zzadv zzf;
    private FirebaseUser zzg;
    private final com.google.firebase.auth.internal.zzw zzh;
    private final Object zzi;
    private String zzj;
    private final Object zzk;
    private String zzl;
    private zzbr zzm;
    private final RecaptchaAction zzn;
    private final RecaptchaAction zzo;
    private final RecaptchaAction zzp;
    private final zzbt zzq;
    private final zzbz zzr;
    private final com.google.firebase.auth.internal.zzf zzs;
    private final Provider zzt;
    private final Provider zzu;
    private zzbv zzv;
    private final Executor zzw;
    private final Executor zzx;
    private final Executor zzy;

    /* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
    public interface AuthStateListener {
        void onAuthStateChanged(FirebaseAuth firebaseAuth);
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
    public interface IdTokenListener {
        void onIdTokenChanged(FirebaseAuth firebaseAuth);
    }

    public FirebaseAuth(FirebaseApp firebaseApp, Provider provider, Provider provider2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        zzahb zzahbVarZzb;
        zzadv zzadvVar = new zzadv(firebaseApp, executor2, scheduledExecutorService);
        zzbt zzbtVar = new zzbt(firebaseApp.getApplicationContext(), firebaseApp.getPersistenceKey());
        zzbz zzbzVarZzc = zzbz.zzc();
        com.google.firebase.auth.internal.zzf zzfVarZzb = com.google.firebase.auth.internal.zzf.zzb();
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new CopyOnWriteArrayList();
        this.zze = new CopyOnWriteArrayList();
        this.zzi = new Object();
        this.zzk = new Object();
        this.zzn = RecaptchaAction.custom("getOobCode");
        this.zzo = RecaptchaAction.custom("signInWithPassword");
        this.zzp = RecaptchaAction.custom("signUpPassword");
        this.zzb = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        this.zzf = (zzadv) Preconditions.checkNotNull(zzadvVar);
        zzbt zzbtVar2 = (zzbt) Preconditions.checkNotNull(zzbtVar);
        this.zzq = zzbtVar2;
        this.zzh = new com.google.firebase.auth.internal.zzw();
        zzbz zzbzVar = (zzbz) Preconditions.checkNotNull(zzbzVarZzc);
        this.zzr = zzbzVar;
        this.zzs = (com.google.firebase.auth.internal.zzf) Preconditions.checkNotNull(zzfVarZzb);
        this.zzt = provider;
        this.zzu = provider2;
        this.zzw = executor2;
        this.zzx = executor3;
        this.zzy = executor4;
        FirebaseUser firebaseUserZza = zzbtVar2.zza();
        this.zzg = firebaseUserZza;
        if (firebaseUserZza != null && (zzahbVarZzb = zzbtVar2.zzb(firebaseUserZza)) != null) {
            zzT(this, this.zzg, zzahbVarZzb, false, false);
        }
        zzbzVar.zze(this);
    }

    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) FirebaseApp.getInstance().get(FirebaseAuth.class);
    }

    public static zzbv zzD(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.zzv == null) {
            firebaseAuth.zzv = new zzbv((FirebaseApp) Preconditions.checkNotNull(firebaseAuth.zzb));
        }
        return firebaseAuth.zzv;
    }

    public static void zzR(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + firebaseUser.getUid() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.zzy.execute(new zzw(firebaseAuth));
    }

    public static void zzS(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + firebaseUser.getUid() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.zzy.execute(new zzv(firebaseAuth, new InternalTokenResult(firebaseUser != null ? firebaseUser.zze() : null)));
    }

    static void zzT(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzahb zzahbVar, boolean z, boolean z2) {
        boolean z3;
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzahbVar);
        boolean z4 = true;
        boolean z5 = firebaseAuth.zzg != null && firebaseUser.getUid().equals(firebaseAuth.zzg.getUid());
        if (z5 || !z2) {
            FirebaseUser firebaseUser2 = firebaseAuth.zzg;
            if (firebaseUser2 == null) {
                z3 = true;
            } else {
                boolean z6 = !z5 || (firebaseUser2.zzd().zze().equals(zzahbVar.zze()) ^ true);
                z3 = true ^ z5;
                z4 = z6;
            }
            Preconditions.checkNotNull(firebaseUser);
            if (firebaseAuth.zzg == null || !firebaseUser.getUid().equals(firebaseAuth.getUid())) {
                firebaseAuth.zzg = firebaseUser;
            } else {
                firebaseAuth.zzg.zzc(firebaseUser.getProviderData());
                if (!firebaseUser.isAnonymous()) {
                    firebaseAuth.zzg.zzb();
                }
                firebaseAuth.zzg.zzi(firebaseUser.getMultiFactor().getEnrolledFactors());
            }
            if (z) {
                firebaseAuth.zzq.zzd(firebaseAuth.zzg);
            }
            if (z4) {
                FirebaseUser firebaseUser3 = firebaseAuth.zzg;
                if (firebaseUser3 != null) {
                    firebaseUser3.zzh(zzahbVar);
                }
                zzS(firebaseAuth, firebaseAuth.zzg);
            }
            if (z3) {
                zzR(firebaseAuth, firebaseAuth.zzg);
            }
            if (z) {
                firebaseAuth.zzq.zze(firebaseUser, zzahbVar);
            }
            FirebaseUser firebaseUser4 = firebaseAuth.zzg;
            if (firebaseUser4 != null) {
                zzD(firebaseAuth).zze(firebaseUser4.zzd());
            }
        }
    }

    public static final void zzX(final FirebaseAuthMissingActivityForRecaptchaException firebaseAuthMissingActivityForRecaptchaException, PhoneAuthOptions phoneAuthOptions, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback with MissingActivity exception for phone number/uid - ".concat(String.valueOf(str)));
        final PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacksZza = zzafn.zza(str, phoneAuthOptions.zze(), null);
        phoneAuthOptions.zzi().execute(new Runnable() { // from class: com.google.firebase.auth.zzi
            @Override // java.lang.Runnable
            public final void run() {
                int i = FirebaseAuth.zza;
                onVerificationStateChangedCallbacksZza.onVerificationFailed(firebaseAuthMissingActivityForRecaptchaException);
            }
        });
    }

    private final Task zzY(FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, boolean z) {
        return new zzab(this, z, firebaseUser, emailAuthCredential).zzb(this, this.zzl, z ? this.zzn : this.zzo);
    }

    private final Task zzZ(String str, String str2, String str3, FirebaseUser firebaseUser, boolean z) {
        return new zzz(this, str, z, firebaseUser, str2, str3).zzb(this, str3, this.zzo);
    }

    private final Task zzaa(EmailAuthCredential emailAuthCredential, FirebaseUser firebaseUser, boolean z) {
        return new zzaa(this, z, firebaseUser, emailAuthCredential).zzb(this, this.zzl, this.zzn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks zzab(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        com.google.firebase.auth.internal.zzw zzwVar = this.zzh;
        return (zzwVar.zzd() && str != null && str.equals(zzwVar.zza())) ? new zzl(this, onVerificationStateChangedCallbacks) : onVerificationStateChangedCallbacks;
    }

    private final boolean zzac(String str) {
        ActionCodeUrl link = ActionCodeUrl.parseLink(str);
        return (link == null || TextUtils.equals(this.zzl, link.zza())) ? false : true;
    }

    public void addAuthStateListener(AuthStateListener authStateListener) {
        this.zze.add(authStateListener);
        this.zzy.execute(new zzu(this, authStateListener));
    }

    public void addIdTokenListener(IdTokenListener idTokenListener) {
        this.zzc.add(idTokenListener);
        this.zzy.execute(new zzs(this, idTokenListener));
    }

    public Task<Void> applyActionCode(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zzf.zza(this.zzb, str, this.zzl);
    }

    public Task<ActionCodeResult> checkActionCode(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zzf.zzb(this.zzb, str, this.zzl);
    }

    public Task<Void> confirmPasswordReset(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return this.zzf.zzc(this.zzb, str, str2, this.zzl);
    }

    public Task<AuthResult> createUserWithEmailAndPassword(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return new zzn(this, str, str2).zzb(this, this.zzl, this.zzp);
    }

    public Task<SignInMethodQueryResult> fetchSignInMethodsForEmail(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zzf.zzf(this.zzb, str, this.zzl);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider, com.google.firebase.internal.InternalTokenProvider
    public final Task getAccessToken(boolean z) {
        return zzc(this.zzg, z);
    }

    public FirebaseApp getApp() {
        return this.zzb;
    }

    public FirebaseUser getCurrentUser() {
        return this.zzg;
    }

    public FirebaseAuthSettings getFirebaseAuthSettings() {
        return this.zzh;
    }

    public String getLanguageCode() {
        String str;
        synchronized (this.zzi) {
            str = this.zzj;
        }
        return str;
    }

    public Task<AuthResult> getPendingAuthResult() {
        return this.zzr.zza();
    }

    public String getTenantId() {
        String str;
        synchronized (this.zzk) {
            str = this.zzl;
        }
        return str;
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider, com.google.firebase.internal.InternalTokenProvider
    public final String getUid() {
        FirebaseUser firebaseUser = this.zzg;
        if (firebaseUser == null) {
            return null;
        }
        return firebaseUser.getUid();
    }

    public Task<Void> initializeRecaptchaConfig() {
        if (this.zzm == null) {
            this.zzm = new zzbr(this.zzb, this);
        }
        return this.zzm.zzb(this.zzl, false).continueWithTask(new zzy(this));
    }

    public boolean isSignInWithEmailLink(String str) {
        return EmailAuthCredential.zzi(str);
    }

    public void removeAuthStateListener(AuthStateListener authStateListener) {
        this.zze.remove(authStateListener);
    }

    public void removeIdTokenListener(IdTokenListener idTokenListener) {
        this.zzc.remove(idTokenListener);
    }

    public Task<Void> sendPasswordResetEmail(String str) {
        Preconditions.checkNotEmpty(str);
        return sendPasswordResetEmail(str, null);
    }

    public Task<Void> sendSignInLinkToEmail(String str, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(actionCodeSettings);
        if (!actionCodeSettings.canHandleCodeInApp()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.zzj;
        if (str2 != null) {
            actionCodeSettings.zzf(str2);
        }
        return new zzp(this, str, actionCodeSettings).zzb(this, this.zzl, this.zzn);
    }

    public Task<Void> setFirebaseUIVersion(String str) {
        return this.zzf.zzA(str);
    }

    public void setLanguageCode(String str) {
        Preconditions.checkNotEmpty(str);
        synchronized (this.zzi) {
            this.zzj = str;
        }
    }

    public void setTenantId(String str) {
        Preconditions.checkNotEmpty(str);
        synchronized (this.zzk) {
            this.zzl = str;
        }
    }

    public Task<AuthResult> signInAnonymously() {
        FirebaseUser firebaseUser = this.zzg;
        if (firebaseUser == null || !firebaseUser.isAnonymous()) {
            return this.zzf.zzB(this.zzb, new zzac(this), this.zzl);
        }
        com.google.firebase.auth.internal.zzx zzxVar = (com.google.firebase.auth.internal.zzx) this.zzg;
        zzxVar.zzq(false);
        return Tasks.forResult(new com.google.firebase.auth.internal.zzr(zzxVar));
    }

    public Task<AuthResult> signInWithCredential(AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        AuthCredential authCredentialZza = authCredential.zza();
        if (!(authCredentialZza instanceof EmailAuthCredential)) {
            if (authCredentialZza instanceof PhoneAuthCredential) {
                return this.zzf.zzG(this.zzb, (PhoneAuthCredential) authCredentialZza, this.zzl, new zzac(this));
            }
            return this.zzf.zzC(this.zzb, authCredentialZza, this.zzl, new zzac(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialZza;
        if (emailAuthCredential.zzg()) {
            return zzac(Preconditions.checkNotEmpty(emailAuthCredential.zzf())) ? Tasks.forException(zzadz.zza(new Status(17072))) : zzaa(emailAuthCredential, null, false);
        }
        return zzZ(emailAuthCredential.zzd(), (String) Preconditions.checkNotNull(emailAuthCredential.zze()), this.zzl, null, false);
    }

    public Task<AuthResult> signInWithCustomToken(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zzf.zzD(this.zzb, str, this.zzl, new zzac(this));
    }

    public Task<AuthResult> signInWithEmailAndPassword(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return zzZ(str, str2, this.zzl, null, false);
    }

    public Task<AuthResult> signInWithEmailLink(String str, String str2) {
        return signInWithCredential(EmailAuthProvider.getCredentialWithLink(str, str2));
    }

    public void signOut() {
        zzO();
        zzbv zzbvVar = this.zzv;
        if (zzbvVar != null) {
            zzbvVar.zzc();
        }
    }

    public Task<AuthResult> startActivityForSignInWithProvider(Activity activity, FederatedAuthProvider federatedAuthProvider) {
        Preconditions.checkNotNull(federatedAuthProvider);
        Preconditions.checkNotNull(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.zzr.zzi(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzadz.zza(new Status(17057)));
        }
        this.zzr.zzg(activity.getApplicationContext(), this);
        federatedAuthProvider.zzc(activity);
        return taskCompletionSource.getTask();
    }

    public void useAppLanguage() {
        synchronized (this.zzi) {
            this.zzj = zzaeo.zza();
        }
    }

    public void useEmulator(String str, int i) {
        Preconditions.checkNotEmpty(str);
        boolean z = false;
        if (i >= 0 && i <= 65535) {
            z = true;
        }
        Preconditions.checkArgument(z, "Port number must be in the range 0-65535");
        zzafx.zzf(this.zzb, str, i);
    }

    public Task<String> verifyPasswordResetCode(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zzf.zzR(this.zzb, str, this.zzl);
    }

    public final synchronized zzbr zzB() {
        return this.zzm;
    }

    public final synchronized zzbv zzC() {
        return zzD(this);
    }

    public final Provider zzE() {
        return this.zzt;
    }

    public final Provider zzF() {
        return this.zzu;
    }

    public final Executor zzL() {
        return this.zzw;
    }

    public final Executor zzM() {
        return this.zzx;
    }

    public final Executor zzN() {
        return this.zzy;
    }

    public final void zzO() {
        Preconditions.checkNotNull(this.zzq);
        FirebaseUser firebaseUser = this.zzg;
        if (firebaseUser != null) {
            zzbt zzbtVar = this.zzq;
            Preconditions.checkNotNull(firebaseUser);
            zzbtVar.zzc(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()));
            this.zzg = null;
        }
        this.zzq.zzc("com.google.firebase.auth.FIREBASE_USER");
        zzS(this, null);
        zzR(this, null);
    }

    public final synchronized void zzP(zzbr zzbrVar) {
        this.zzm = zzbrVar;
    }

    public final void zzQ(FirebaseUser firebaseUser, zzahb zzahbVar, boolean z) {
        zzT(this, firebaseUser, zzahbVar, true, false);
    }

    public final void zzU(PhoneAuthOptions phoneAuthOptions) {
        String phoneNumber;
        String str;
        if (!phoneAuthOptions.zzm()) {
            FirebaseAuth firebaseAuthZzb = phoneAuthOptions.zzb();
            String strCheckNotEmpty = Preconditions.checkNotEmpty(phoneAuthOptions.zzh());
            if (phoneAuthOptions.zzd() == null && zzafn.zzd(strCheckNotEmpty, phoneAuthOptions.zze(), phoneAuthOptions.zza(), phoneAuthOptions.zzi())) {
                return;
            }
            firebaseAuthZzb.zzs.zza(firebaseAuthZzb, strCheckNotEmpty, phoneAuthOptions.zza(), firebaseAuthZzb.zzW(), phoneAuthOptions.zzk()).addOnCompleteListener(new zzj(firebaseAuthZzb, phoneAuthOptions, strCheckNotEmpty));
            return;
        }
        FirebaseAuth firebaseAuthZzb2 = phoneAuthOptions.zzb();
        if (((com.google.firebase.auth.internal.zzag) Preconditions.checkNotNull(phoneAuthOptions.zzc())).zzf()) {
            phoneNumber = Preconditions.checkNotEmpty(phoneAuthOptions.zzh());
            str = phoneNumber;
        } else {
            PhoneMultiFactorInfo phoneMultiFactorInfo = (PhoneMultiFactorInfo) Preconditions.checkNotNull(phoneAuthOptions.zzf());
            String strCheckNotEmpty2 = Preconditions.checkNotEmpty(phoneMultiFactorInfo.getUid());
            phoneNumber = phoneMultiFactorInfo.getPhoneNumber();
            str = strCheckNotEmpty2;
        }
        if (phoneAuthOptions.zzd() == null || !zzafn.zzd(str, phoneAuthOptions.zze(), phoneAuthOptions.zza(), phoneAuthOptions.zzi())) {
            firebaseAuthZzb2.zzs.zza(firebaseAuthZzb2, phoneNumber, phoneAuthOptions.zza(), firebaseAuthZzb2.zzW(), phoneAuthOptions.zzk()).addOnCompleteListener(new zzk(firebaseAuthZzb2, phoneAuthOptions, str));
        }
    }

    public final void zzV(PhoneAuthOptions phoneAuthOptions, String str, String str2) {
        long jLongValue = phoneAuthOptions.zzg().longValue();
        if (jLongValue < 0 || jLongValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String strCheckNotEmpty = Preconditions.checkNotEmpty(phoneAuthOptions.zzh());
        zzahl zzahlVar = new zzahl(strCheckNotEmpty, jLongValue, phoneAuthOptions.zzd() != null, this.zzj, this.zzl, str, str2, zzW());
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacksZzab = zzab(strCheckNotEmpty, phoneAuthOptions.zze());
        this.zzf.zzT(this.zzb, zzahlVar, TextUtils.isEmpty(str) ? zzy(phoneAuthOptions, onVerificationStateChangedCallbacksZzab) : onVerificationStateChangedCallbacksZzab, phoneAuthOptions.zza(), phoneAuthOptions.zzi());
    }

    final boolean zzW() {
        return zzaee.zza(getApp().getApplicationContext());
    }

    public final Task zza(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        return this.zzf.zze(firebaseUser, new zzr(this, firebaseUser));
    }

    public final Task zzb(FirebaseUser firebaseUser, MultiFactorAssertion multiFactorAssertion, String str) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(multiFactorAssertion);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            return this.zzf.zzg(this.zzb, (PhoneMultiFactorAssertion) multiFactorAssertion, firebaseUser, str, new zzac(this));
        }
        return multiFactorAssertion instanceof TotpMultiFactorAssertion ? this.zzf.zzh(this.zzb, (TotpMultiFactorAssertion) multiFactorAssertion, firebaseUser, str, this.zzl, new zzac(this)) : Tasks.forException(zzadz.zza(new Status(FirebaseError.ERROR_INTERNAL_ERROR)));
    }

    public final Task zzc(FirebaseUser firebaseUser, boolean z) {
        if (firebaseUser == null) {
            return Tasks.forException(zzadz.zza(new Status(FirebaseError.ERROR_NO_SIGNED_IN_USER)));
        }
        zzahb zzahbVarZzd = firebaseUser.zzd();
        return (!zzahbVarZzd.zzj() || z) ? this.zzf.zzk(this.zzb, firebaseUser, zzahbVarZzd.zzf(), new zzx(this)) : Tasks.forResult(zzba.zza(zzahbVarZzd.zze()));
    }

    public final Task zzd() {
        return this.zzf.zzl();
    }

    public final Task zze(String str) {
        return this.zzf.zzm(this.zzl, "RECAPTCHA_ENTERPRISE");
    }

    public final Task zzf(FirebaseUser firebaseUser, AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        return this.zzf.zzn(this.zzb, firebaseUser, authCredential.zza(), new zzad(this));
    }

    public final Task zzg(FirebaseUser firebaseUser, AuthCredential authCredential) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(authCredential);
        AuthCredential authCredentialZza = authCredential.zza();
        if (!(authCredentialZza instanceof EmailAuthCredential)) {
            return authCredentialZza instanceof PhoneAuthCredential ? this.zzf.zzu(this.zzb, firebaseUser, (PhoneAuthCredential) authCredentialZza, this.zzl, new zzad(this)) : this.zzf.zzo(this.zzb, firebaseUser, authCredentialZza, firebaseUser.getTenantId(), new zzad(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialZza;
        if ("password".equals(emailAuthCredential.getSignInMethod())) {
            return zzY(firebaseUser, emailAuthCredential, false);
        }
        return zzac(Preconditions.checkNotEmpty(emailAuthCredential.zzf())) ? Tasks.forException(zzadz.zza(new Status(17072))) : zzY(firebaseUser, emailAuthCredential, true);
    }

    public final Task zzh(FirebaseUser firebaseUser, AuthCredential authCredential) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(authCredential);
        AuthCredential authCredentialZza = authCredential.zza();
        if (!(authCredentialZza instanceof EmailAuthCredential)) {
            return authCredentialZza instanceof PhoneAuthCredential ? this.zzf.zzv(this.zzb, firebaseUser, (PhoneAuthCredential) authCredentialZza, this.zzl, new zzad(this)) : this.zzf.zzp(this.zzb, firebaseUser, authCredentialZza, firebaseUser.getTenantId(), new zzad(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialZza;
        if ("password".equals(emailAuthCredential.getSignInMethod())) {
            return zzZ(emailAuthCredential.zzd(), Preconditions.checkNotEmpty(emailAuthCredential.zze()), firebaseUser.getTenantId(), firebaseUser, true);
        }
        return zzac(Preconditions.checkNotEmpty(emailAuthCredential.zzf())) ? Tasks.forException(zzadz.zza(new Status(17072))) : zzaa(emailAuthCredential, firebaseUser, true);
    }

    public final Task zzi(FirebaseUser firebaseUser, zzbx zzbxVar) {
        Preconditions.checkNotNull(firebaseUser);
        return this.zzf.zzw(this.zzb, firebaseUser, zzbxVar);
    }

    public final Task zzj(MultiFactorAssertion multiFactorAssertion, com.google.firebase.auth.internal.zzag zzagVar, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(multiFactorAssertion);
        Preconditions.checkNotNull(zzagVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            return this.zzf.zzi(this.zzb, firebaseUser, (PhoneMultiFactorAssertion) multiFactorAssertion, Preconditions.checkNotEmpty(zzagVar.zze()), new zzac(this));
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            return this.zzf.zzj(this.zzb, firebaseUser, (TotpMultiFactorAssertion) multiFactorAssertion, Preconditions.checkNotEmpty(zzagVar.zze()), this.zzl, new zzac(this));
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final Task zzk(ActionCodeSettings actionCodeSettings, String str) {
        Preconditions.checkNotEmpty(str);
        if (this.zzj != null) {
            if (actionCodeSettings == null) {
                actionCodeSettings = ActionCodeSettings.zzb();
            }
            actionCodeSettings.zzf(this.zzj);
        }
        return this.zzf.zzx(this.zzb, actionCodeSettings, str);
    }

    public final Task zzl(Activity activity, FederatedAuthProvider federatedAuthProvider, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(federatedAuthProvider);
        Preconditions.checkNotNull(firebaseUser);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.zzr.zzj(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzadz.zza(new Status(17057)));
        }
        this.zzr.zzh(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zza(activity);
        return taskCompletionSource.getTask();
    }

    public final Task zzm(Activity activity, FederatedAuthProvider federatedAuthProvider, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(federatedAuthProvider);
        Preconditions.checkNotNull(firebaseUser);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.zzr.zzj(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzadz.zza(new Status(17057)));
        }
        this.zzr.zzh(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zzb(activity);
        return taskCompletionSource.getTask();
    }

    public final Task zzn(com.google.firebase.auth.internal.zzag zzagVar) {
        Preconditions.checkNotNull(zzagVar);
        return this.zzf.zzI(zzagVar, this.zzl).continueWithTask(new zzt(this));
    }

    public final Task zzo(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotEmpty(str);
        return this.zzf.zzK(this.zzb, firebaseUser, str, this.zzl, new zzad(this)).continueWithTask(new zzq(this));
    }

    public final Task zzp(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseUser);
        return this.zzf.zzL(this.zzb, firebaseUser, str, new zzad(this));
    }

    public final Task zzq(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotEmpty(str);
        return this.zzf.zzM(this.zzb, firebaseUser, str, new zzad(this));
    }

    public final Task zzr(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotEmpty(str);
        return this.zzf.zzN(this.zzb, firebaseUser, str, new zzad(this));
    }

    public final Task zzs(FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(phoneAuthCredential);
        return this.zzf.zzO(this.zzb, firebaseUser, phoneAuthCredential.clone(), new zzad(this));
    }

    public final Task zzt(FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(userProfileChangeRequest);
        return this.zzf.zzP(this.zzb, firebaseUser, userProfileChangeRequest, new zzad(this));
    }

    public final Task zzu(String str, String str2, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str3 = this.zzj;
        if (str3 != null) {
            actionCodeSettings.zzf(str3);
        }
        return this.zzf.zzQ(str, str2, actionCodeSettings);
    }

    final PhoneAuthProvider.OnVerificationStateChangedCallbacks zzy(PhoneAuthOptions phoneAuthOptions, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        return phoneAuthOptions.zzk() ? onVerificationStateChangedCallbacks : new zzm(this, phoneAuthOptions, onVerificationStateChangedCallbacks);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public void removeIdTokenListener(com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        Preconditions.checkNotNull(idTokenListener);
        this.zzd.remove(idTokenListener);
        zzC().zzd(this.zzd.size());
    }

    public Task<Void> updateCurrentUser(FirebaseUser firebaseUser) {
        String str;
        if (firebaseUser == null) {
            throw new IllegalArgumentException("Cannot update current user with null user!");
        }
        String tenantId = firebaseUser.getTenantId();
        if ((tenantId != null && !tenantId.equals(this.zzl)) || ((str = this.zzl) != null && !str.equals(tenantId))) {
            return Tasks.forException(zzadz.zza(new Status(17072)));
        }
        String apiKey = firebaseUser.zza().getOptions().getApiKey();
        String apiKey2 = this.zzb.getOptions().getApiKey();
        if (!firebaseUser.zzd().zzj() || !apiKey2.equals(apiKey)) {
            return zzi(firebaseUser, new zzae(this));
        }
        zzQ(com.google.firebase.auth.internal.zzx.zzk(this.zzb, firebaseUser), firebaseUser.zzd(), true);
        return Tasks.forResult(null);
    }

    public static FirebaseAuth getInstance(FirebaseApp firebaseApp) {
        return (FirebaseAuth) firebaseApp.get(FirebaseAuth.class);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public void addIdTokenListener(com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        Preconditions.checkNotNull(idTokenListener);
        this.zzd.add(idTokenListener);
        zzC().zzd(this.zzd.size());
    }

    public Task<Void> sendPasswordResetEmail(String str, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str2 = this.zzj;
        if (str2 != null) {
            actionCodeSettings.zzf(str2);
        }
        actionCodeSettings.zzg(1);
        return new zzo(this, str, actionCodeSettings).zzb(this, this.zzl, this.zzn);
    }
}
