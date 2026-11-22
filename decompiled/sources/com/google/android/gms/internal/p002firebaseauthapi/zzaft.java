package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.auth.PhoneAuthCredential;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaft {
    private static final Logger zza = new Logger("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap zzd = new HashMap();

    zzaft(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    static /* bridge */ /* synthetic */ void zzd(zzaft zzaftVar, String str) {
        zzafs zzafsVar = (zzafs) zzaftVar.zzd.get(str);
        if (zzafsVar == null || zzac.zzd(zzafsVar.zzd) || zzac.zzd(zzafsVar.zze) || zzafsVar.zzb.isEmpty()) {
            return;
        }
        Iterator it = zzafsVar.zzb.iterator();
        while (it.hasNext()) {
            ((zzadx) it.next()).zzr(PhoneAuthCredential.zzc(zzafsVar.zzd, zzafsVar.zze));
        }
        zzafsVar.zzh = true;
    }

    private static String zzl(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(zzk.zzc));
            String strSubstring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.d("Package: " + str + " -- Hash: " + strSubstring, new Object[0]);
            return strSubstring;
        } catch (NoSuchAlgorithmException e) {
            zza.e("NoSuchAlgorithm: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(String str) {
        zzafs zzafsVar = (zzafs) this.zzd.get(str);
        if (zzafsVar == null || zzafsVar.zzh || zzac.zzd(zzafsVar.zzd)) {
            return;
        }
        zza.w("Timed out waiting for SMS.", new Object[0]);
        Iterator it = zzafsVar.zzb.iterator();
        while (it.hasNext()) {
            ((zzadx) it.next()).zza(zzafsVar.zzd);
        }
        zzafsVar.zzi = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzg(String str) {
        zzafs zzafsVar = (zzafs) this.zzd.get(str);
        if (zzafsVar == null) {
            return;
        }
        if (!zzafsVar.zzi) {
            zzm(str);
        }
        zzi(str);
    }

    final String zzb() {
        try {
            String packageName = this.zzb.getPackageName();
            String strZzl = zzl(packageName, (Build.VERSION.SDK_INT < 28 ? Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 64).signatures : Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 134217728).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (strZzl != null) {
                return strZzl;
            }
            zza.e("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.e("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    final void zzh(zzadx zzadxVar, String str) {
        zzafs zzafsVar = (zzafs) this.zzd.get(str);
        if (zzafsVar == null) {
            return;
        }
        zzafsVar.zzb.add(zzadxVar);
        if (zzafsVar.zzg) {
            zzadxVar.zzb(zzafsVar.zzd);
        }
        if (zzafsVar.zzh) {
            zzadxVar.zzr(PhoneAuthCredential.zzc(zzafsVar.zzd, zzafsVar.zze));
        }
        if (zzafsVar.zzi) {
            zzadxVar.zza(zzafsVar.zzd);
        }
    }

    final void zzi(String str) {
        zzafs zzafsVar = (zzafs) this.zzd.get(str);
        if (zzafsVar == null) {
            return;
        }
        ScheduledFuture scheduledFuture = zzafsVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzafsVar.zzf.cancel(false);
        }
        zzafsVar.zzb.clear();
        this.zzd.remove(str);
    }

    final void zzj(final String str, zzadx zzadxVar, long j, boolean z) {
        this.zzd.put(str, new zzafs(j, z));
        zzh(zzadxVar, str);
        zzafs zzafsVar = (zzafs) this.zzd.get(str);
        long j2 = zzafsVar.zza;
        if (j2 <= 0) {
            zza.w("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafsVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzafo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg(str);
            }
        }, j2, TimeUnit.SECONDS);
        if (!zzafsVar.zzc) {
            zza.w("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafr zzafrVar = new zzafr(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
        zzb.zza(this.zzb.getApplicationContext(), zzafrVar, intentFilter);
        SmsRetriever.getClient(this.zzb).startSmsRetriever().addOnFailureListener(new zzafp(this));
    }

    final boolean zzk(String str) {
        return this.zzd.get(str) != null;
    }
}
