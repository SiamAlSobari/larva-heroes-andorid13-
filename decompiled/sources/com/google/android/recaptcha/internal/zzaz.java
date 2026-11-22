package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaz extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzba zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzn zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaz(zzba zzbaVar, String str, zzn zznVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzbaVar;
        this.zzd = str;
        this.zze = zznVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzaz(this.zzc, this.zzd, this.zze, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaz) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.zzb;
        try {
            if (r1 != 0) {
                if (r1 != 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    Object obj2 = this.zza;
                    ResultKt.throwOnFailure(obj);
                    r1 = obj2;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            zzn zznVar = new zzn();
            zzmp zzmpVarZzg = zzmp.zzg(zzeb.zzh().zzj(this.zzd));
            zzdk zzdkVarZzb = zzdk.zzb();
            zzba zzbaVar = this.zzc;
            zzmh zzmhVarZzy = zzba.zzy(zzmpVarZzg.zzi(), zzmpVarZzg.zzj());
            zzdkVarZzb.zzf();
            long jZza = zzdkVarZzb.zza(TimeUnit.MICROSECONDS);
            zzj zzjVar = zzj.zza;
            zzj.zza(zzl.zzm.zza(), jZza);
            zzba zzbaVar2 = this.zzc;
            List listZzi = zzmhVarZzy.zzi();
            zzn zznVar2 = this.zze;
            this.zza = zznVar;
            this.zzb = 1;
            Object objZzt = zzbaVar2.zzt(listZzi, zznVar2, zznVar, this);
            r1 = zznVar;
            if (objZzt == coroutine_suspended) {
                return coroutine_suspended;
            }
        } catch (Exception e) {
            zzba zzbaVar3 = this.zzc;
            zzn zznVar3 = this.zze;
            this.zza = null;
            this.zzb = 2;
            if (zzbaVar3.zzu(e, "recaptcha.m.Main.rge", zznVar3, (zzn) r1, 0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
