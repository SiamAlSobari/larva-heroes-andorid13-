package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcu {
    final /* synthetic */ zzda zza;
    private Long zzb;
    private final zzdk zzc = zzdk.zzb();

    public zzcu(zzda zzdaVar) {
        this.zza = zzdaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzoed(String str) throws zzgy {
        zzb();
        zzlz zzlzVarZzg = zzlz.zzg(zzeb.zzh().zzj(str));
        zzlzVarZzg.zzi().name();
        zzlzVarZzg.zzk();
        CancellableContinuation cancellableContinuation = (CancellableContinuation) this.zza.zzk.remove(zzlzVarZzg.zzj());
        String strZzk = zzlzVarZzg.zzk();
        if (strZzk != null && strZzk.length() != 0) {
            if (cancellableContinuation != null) {
                cancellableContinuation.resumeWith(Result.m317constructorimpl(zzlzVarZzg.zzk()));
                return;
            }
            return;
        }
        zzlzVarZzg.zzi().name();
        zzg zzgVar = zzh.zza;
        zzh zzhVarZza = zzg.zza(zzlzVarZzg.zzi());
        zzlzVarZzg.zzj();
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m317constructorimpl(ResultKt.createFailure(zzhVarZza)));
        }
    }

    @JavascriptInterface
    public final void zzoid(String str) throws zzgy {
        zzb();
        zzmd zzmdVarZzg = zzmd.zzg(zzeb.zzh().zzj(str));
        zzmdVarZzg.zzi().name();
        if (zzmdVarZzg.zzi() == zzmf.JS_CODE_SUCCESS) {
            this.zza.zzm().hashCode();
            if (this.zza.zzm().complete(Unit.INSTANCE)) {
                return;
            }
            this.zza.zzm().hashCode();
            return;
        }
        zzmdVarZzg.zzi().name();
        zzg zzgVar = zzh.zza;
        zzh zzhVarZza = zzg.zza(zzmdVarZzg.zzi());
        this.zza.zzm().hashCode();
        this.zza.zzm().completeExceptionally(zzhVarZza);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        this.zza.zzd().zza(str);
    }
}
