package com.google.firebase.auth.internal;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzca;
import com.google.android.gms.internal.p002firebaseauthapi.zzla;
import com.google.android.gms.internal.p002firebaseauthapi.zzlf;
import com.google.android.gms.internal.p002firebaseauthapi.zzmh;
import com.google.android.gms.internal.p002firebaseauthapi.zzmj;
import com.google.android.gms.internal.p002firebaseauthapi.zzos;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzk {
    private static zzk zza;
    private final String zzb;
    private final zzmj zzc;

    private zzk(Context context, String str, boolean z) {
        zzmj zzmjVarZzg;
        this.zzb = str;
        try {
            zzla.zza();
            zzmh zzmhVar = new zzmh();
            zzmhVar.zzf(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str));
            zzmhVar.zzd(zzlf.zza);
            zzmhVar.zze(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmjVarZzg = zzmhVar.zzg();
        } catch (IOException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e.getMessage())));
            zzmjVarZzg = null;
        }
        this.zzc = zzmjVarZzg;
    }

    public static zzk zza(Context context, String str) {
        zzk zzkVar = zza;
        if (zzkVar == null || !com.google.android.gms.internal.p002firebaseauthapi.zzq.zza(zzkVar.zzb, str)) {
            zza = new zzk(context, str, true);
        }
        return zza;
    }

    public final String zzb(String str) {
        String str2;
        zzmj zzmjVar = this.zzc;
        if (zzmjVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmjVar) {
                str2 = new String(((com.google.android.gms.internal.p002firebaseauthapi.zzbk) this.zzc.zza().zze(zzos.zza(), com.google.android.gms.internal.p002firebaseauthapi.zzbk.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e.getMessage())));
            return null;
        }
    }

    public final String zzc() {
        if (this.zzc == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzca zzcaVarZza = com.google.android.gms.internal.p002firebaseauthapi.zzbf.zza(byteArrayOutputStream);
        try {
            synchronized (this.zzc) {
                this.zzc.zza().zzb().zzg(zzcaVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e.getMessage())));
            return null;
        }
    }
}
