package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbf {
    private static final com.google.android.gms.internal.p002firebaseauthapi.zzam zza = com.google.android.gms.internal.p002firebaseauthapi.zzam.zzj("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
    private static final zzbf zzb = new zzbf();
    private Task zzc;
    private Task zzd;
    private long zze = 0;

    private zzbf() {
    }

    public static zzbf zzc() {
        return zzb;
    }

    private static final void zzf(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        com.google.android.gms.internal.p002firebaseauthapi.zzam zzamVar = zza;
        int size = zzamVar.size();
        for (int i = 0; i < size; i++) {
            editorEdit.remove((String) zzamVar.get(i));
        }
        editorEdit.commit();
    }

    public final Task zza() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.zze < 3600000) {
            return this.zzc;
        }
        return null;
    }

    public final Task zzb() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.zze < 3600000) {
            return this.zzd;
        }
        return null;
    }

    public final void zzd(Context context) {
        Preconditions.checkNotNull(context);
        zzf(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.zzc = null;
        this.zze = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    public final void zze(FirebaseAuth firebaseAuth) {
        Preconditions.checkNotNull(firebaseAuth);
        byte b = 0;
        SharedPreferences sharedPreferences = firebaseAuth.getApp().getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.getApp().getName().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (!sharedPreferences.contains("verifyAssertionRequest")) {
                if (!sharedPreferences.contains("recaptchaToken")) {
                    if (sharedPreferences.contains("statusCode")) {
                        Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                        this.zze = sharedPreferences.getLong("timestamp", 0L);
                        zzf(sharedPreferences);
                        this.zzc = Tasks.forException(zzadz.zza(status));
                        return;
                    }
                    return;
                }
                String string = sharedPreferences.getString("recaptchaToken", "");
                String string2 = sharedPreferences.getString("operation", "");
                this.zze = sharedPreferences.getLong("timestamp", 0L);
                if (((string2.hashCode() == -214796028 && string2.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) ? (byte) 0 : (byte) -1) != 0) {
                    this.zzd = null;
                } else {
                    this.zzd = Tasks.forResult(string);
                }
                zzf(sharedPreferences);
                return;
            }
            zzaic zzaicVar = (zzaic) SafeParcelableSerializer.deserializeFromString(sharedPreferences.getString("verifyAssertionRequest", ""), zzaic.CREATOR);
            String string3 = sharedPreferences.getString("operation", "");
            String string4 = sharedPreferences.getString("tenantId", null);
            String string5 = sharedPreferences.getString("firebaseUserUid", "");
            this.zze = sharedPreferences.getLong("timestamp", 0L);
            if (string4 != null) {
                firebaseAuth.setTenantId(string4);
                zzaicVar.zzf(string4);
            }
            int iHashCode = string3.hashCode();
            if (iHashCode != -98509410) {
                if (iHashCode != 175006864) {
                    if (iHashCode != 1450464913 || !string3.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) {
                        b = -1;
                    }
                } else if (string3.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (string3.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                this.zzc = firebaseAuth.signInWithCredential(com.google.firebase.auth.zze.zzb(zzaicVar));
            } else if (b != 1) {
                if (b == 2 && firebaseAuth.getCurrentUser().getUid().equals(string5)) {
                    this.zzc = firebaseAuth.zzh(firebaseAuth.getCurrentUser(), com.google.firebase.auth.zze.zzb(zzaicVar));
                } else {
                    this.zzc = null;
                }
            } else if (firebaseAuth.getCurrentUser().getUid().equals(string5)) {
                this.zzc = firebaseAuth.zzf(firebaseAuth.getCurrentUser(), com.google.firebase.auth.zze.zzb(zzaicVar));
            } else {
                this.zzc = null;
            }
            zzf(sharedPreferences);
        }
    }
}
