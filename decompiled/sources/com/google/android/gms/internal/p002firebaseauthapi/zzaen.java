package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.common.net.HttpHeaders;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaen {
    private final Context zza;
    private zzafi zzb;
    private final String zzc;
    private final FirebaseApp zzd;
    private boolean zze = false;
    private String zzf;

    public zzaen(Context context, FirebaseApp firebaseApp, String str) {
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzd = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        String token;
        String strConcat = this.zze ? String.valueOf(this.zzc).concat("/FirebaseUI-Android") : String.valueOf(this.zzc).concat("/FirebaseCore-Android");
        if (this.zzb == null) {
            Context context = this.zza;
            this.zzb = new zzafi(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, zzaeo.zza());
        uRLConnection.setRequestProperty("X-Client-Version", strConcat);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.getOptions().getApplicationId());
        HeartBeatController heartBeatController = (HeartBeatController) FirebaseAuth.getInstance(this.zzd).zzF().get();
        if (heartBeatController != null) {
            try {
                str = (String) Tasks.await(heartBeatController.getHeartBeatsHeader());
            } catch (InterruptedException | ExecutionException e) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: ".concat(String.valueOf(e.getMessage())));
                str = null;
            }
        } else {
            str = null;
        }
        uRLConnection.setRequestProperty("X-Firebase-Client", str);
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) FirebaseAuth.getInstance(this.zzd).zzE().get();
        if (interopAppCheckTokenProvider == null) {
            token = null;
        } else {
            try {
                AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) Tasks.await(interopAppCheckTokenProvider.getToken(false));
                if (appCheckTokenResult.getError() != null) {
                    Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(appCheckTokenResult.getError()));
                }
                token = appCheckTokenResult.getToken();
            } catch (InterruptedException | ExecutionException e2) {
                Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: ".concat(String.valueOf(e2.getMessage())));
                token = null;
            }
        }
        if (!TextUtils.isEmpty(token)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", token);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zzc(String str) {
        this.zzf = str;
    }
}
