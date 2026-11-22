package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzaa;
import com.google.android.recaptcha.internal.zzb;
import com.google.android.recaptcha.internal.zzp;
import com.google.android.recaptcha.internal.zzr;
import com.google.android.recaptcha.internal.zzw;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", "", "()V", "getClient", "Lkotlin/Result;", "Lcom/google/android/recaptcha/RecaptchaClient;", "application", "Landroid/app/Application;", "siteKey", "", "getClient-0E7RQCE", "(Landroid/app/Application;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasksClient", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    /* JADX INFO: renamed from: com.google.android.recaptcha.Recaptcha$getTasksClient$1, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super zzaa>, Object> {
        int zza;
        final /* synthetic */ Application zzb;
        final /* synthetic */ String zzc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Application application, String str, Continuation continuation) {
            super(2, continuation);
            this.zzb = application;
            this.zzc = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.zzb, this.zzc, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super zzaa> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.zza;
            ResultKt.throwOnFailure(obj);
            if (i == 0) {
                zzw zzwVar = zzaa.zza;
                Application application = this.zzb;
                String str = this.zzc;
                this.zza = 1;
                obj = zzwVar.zza(application, str, new zzr(null, 0L, 0L, 7, null), null, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return obj;
        }
    }

    private Recaptcha() {
    }

    @JvmStatic
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey) {
        zzp zzpVar = zzp.zza;
        return zzb.zza(BuildersKt__Builders_commonKt.async$default(zzp.zzb(), null, null, new AnonymousClass1(application, siteKey, null), 3, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: getClient-0E7RQCE, reason: not valid java name */
    public final Object m263getClient0E7RQCE(Application application, String str, Continuation<? super Result<? extends RecaptchaClient>> continuation) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (continuation instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) continuation;
            int i = recaptcha$getClient$1.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                recaptcha$getClient$1.zzc = i - Integer.MIN_VALUE;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, continuation);
            }
        } else {
            recaptcha$getClient$1 = new Recaptcha$getClient$1(this, continuation);
        }
        Object objWithContext = recaptcha$getClient$1.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = recaptcha$getClient$1.zzc;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                Result.Companion companion = Result.INSTANCE;
                zzp zzpVar = zzp.zza;
                CoroutineContext coroutineContext = zzp.zzb().getCoroutineContext();
                Recaptcha$getClient$2$1 recaptcha$getClient$2$1 = new Recaptcha$getClient$2$1(application, str, null);
                recaptcha$getClient$1.zzc = 1;
                objWithContext = BuildersKt.withContext(coroutineContext, recaptcha$getClient$2$1, recaptcha$getClient$1);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
            return Result.m317constructorimpl((zzaa) objWithContext);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m317constructorimpl(ResultKt.createFailure(th));
        }
    }
}
