package com.google.android.recaptcha.internal;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcy extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzda zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcy(zzda zzdaVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zze = zzdaVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzcy(this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcy) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        ?? r0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzd;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                zzda zzdaVar = this.zze;
                Mutex mutex = zzdaVar.zzo;
                obj2 = this.zzf;
                this.zza = mutex;
                this.zzb = zzdaVar;
                this.zzc = obj2;
                this.zzd = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj3 = zzdaVar;
                obj4 = mutex;
            } else {
                if (i != 1) {
                    r0 = this.zza;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r0 = r0;
                        Unit unit = Unit.INSTANCE;
                        r0.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        r0.unlock(null);
                        throw th;
                    }
                }
                Object obj5 = this.zzc;
                obj3 = this.zzb;
                Object obj6 = this.zza;
                ResultKt.throwOnFailure(obj);
                obj2 = obj5;
                obj4 = obj6;
            }
            String strZzb = ((zzda) obj3).zzf.zzb();
            String str = ((zzda) obj3).zzd;
            String str2 = ((zzda) obj3).zzh;
            String str3 = ((zzda) obj3).zzg;
            Context context = ((zzda) obj3).zze;
            zzr zzrVar = ((zzda) obj3).zzf;
            this.zza = obj4;
            this.zzb = null;
            this.zzc = null;
            this.zzd = 2;
            if (zzbj.zzb(strZzb, str, (String) obj2, str2, str3, context, zzrVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            r0 = obj4;
            Unit unit2 = Unit.INSTANCE;
            r0.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            r0 = obj4;
            r0.unlock(null);
            throw th;
        }
    }
}
