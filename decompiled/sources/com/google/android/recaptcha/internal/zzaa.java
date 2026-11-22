package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaa implements RecaptchaClient, RecaptchaTasksClient {
    private static zzaa zzb;
    private static String zzd;
    private final zzda zzf;
    public static final zzw zza = new zzw(null);
    private static final String zzc = UUID.randomUUID().toString();
    private static final Mutex zze = MutexKt.Mutex$default(false, 1, null);

    public zzaa(zzda zzdaVar) {
        this.zzf = zzdaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    public final Object mo264executegIAlus(RecaptchaAction recaptchaAction, Continuation<? super Result<String>> continuation) throws Throwable {
        zzx zzxVar;
        if (continuation instanceof zzx) {
            zzxVar = (zzx) continuation;
            int i = zzxVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzxVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzxVar = new zzx(this, continuation);
            }
        } else {
            zzxVar = new zzx(this, continuation);
        }
        Object objWithContext = zzxVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzxVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            zzp zzpVar = zzp.zza;
            CoroutineContext coroutineContext = zzp.zzb().getCoroutineContext();
            zzy zzyVar = new zzy(this, recaptchaAction, null);
            zzxVar.zzc = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, zzyVar, zzxVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        zzp zzpVar = zzp.zza;
        return zzb.zza(BuildersKt__Builders_commonKt.async$default(zzp.zzb(), null, null, new zzz(this, recaptchaAction, null), 3, null));
    }

    public final zzda zzb() {
        return this.zzf;
    }
}
