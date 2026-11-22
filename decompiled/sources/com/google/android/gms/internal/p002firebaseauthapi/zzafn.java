package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzafn {
    private static final Map zza = new ArrayMap();

    public static PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, zzaez zzaezVar) {
        zze(str, zzaezVar);
        return new zzafl(onVerificationStateChangedCallbacks, str);
    }

    public static void zzc() {
        zza.clear();
    }

    public static boolean zzd(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        Map map = zza;
        if (!map.containsKey(str)) {
            zze(str, null);
            return false;
        }
        zzafm zzafmVar = (zzafm) map.get(str);
        if (DefaultClock.getInstance().currentTimeMillis() - zzafmVar.zzb >= 120000) {
            zze(str, null);
            return false;
        }
        zzaez zzaezVar = zzafmVar.zza;
        if (zzaezVar == null) {
            return true;
        }
        zzaezVar.zzh(onVerificationStateChangedCallbacks, activity, executor, str);
        return true;
    }

    private static void zze(String str, zzaez zzaezVar) {
        zza.put(str, new zzafm(zzaezVar, DefaultClock.getInstance().currentTimeMillis()));
    }
}
