package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.firebase.auth.ActionCodeInfo;
import com.google.firebase.auth.ActionCodeResult;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzo implements ActionCodeResult {
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final ActionCodeInfo zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    public zzo(zzahk zzahkVar) {
        byte b;
        this.zzb = zzahkVar.zzh() ? zzahkVar.zzd() : zzahkVar.zzc();
        this.zzc = zzahkVar.zzc();
        ActionCodeInfo zzmVar = null;
        if (!zzahkVar.zzi()) {
            this.zza = 3;
            this.zzd = null;
            return;
        }
        switch (zzahkVar.zze()) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                b = 5;
                break;
            case "PASSWORD_RESET":
                b = 0;
                break;
            case "VERIFY_EMAIL":
                b = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                b = 3;
                break;
            case "EMAIL_SIGNIN":
                b = 2;
                break;
            case "RECOVER_EMAIL":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        int i = b != 0 ? b != 1 ? b != 2 ? b != 3 ? b != 4 ? b != 5 ? 3 : 6 : 2 : 5 : 4 : 1 : 0;
        this.zza = i;
        if (i == 4 || i == 3) {
            this.zzd = null;
            return;
        }
        if (zzahkVar.zzg()) {
            zzmVar = new zzn(zzahkVar.zzc(), zzbc.zza(zzahkVar.zzb()));
        } else if (zzahkVar.zzh()) {
            zzmVar = new zzl(zzahkVar.zzd(), zzahkVar.zzc());
        } else if (zzahkVar.zzf()) {
            zzmVar = new zzm(zzahkVar.zzc());
        }
        this.zzd = zzmVar;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final String getData(int i) {
        if (this.zza == 4) {
            return null;
        }
        if (i == 0) {
            return this.zzb;
        }
        if (i != 1) {
            return null;
        }
        return this.zzc;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final ActionCodeInfo getInfo() {
        return this.zzd;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final int getOperation() {
        return this.zza;
    }
}
