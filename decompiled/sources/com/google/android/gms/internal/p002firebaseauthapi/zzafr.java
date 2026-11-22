package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafr extends BroadcastReceiver {
    final /* synthetic */ zzaft zza;
    private final String zzb;

    public zzafr(zzaft zzaftVar, String str) {
        this.zza = zzaftVar;
        this.zzb = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).getStatusCode() == 0) {
                String str = (String) extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
                zzafs zzafsVar = (zzafs) this.zza.zzd.get(this.zzb);
                if (zzafsVar == null) {
                    zzaft.zza.e("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
                    zzafsVar.zze = matcher.find() ? matcher.group() : null;
                    if (zzafsVar.zze == null) {
                        zzaft.zza.e("Unable to extract verification code.", new Object[0]);
                    } else if (!zzac.zzd(zzafsVar.zzd)) {
                        zzaft.zzd(this.zza, this.zzb);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
