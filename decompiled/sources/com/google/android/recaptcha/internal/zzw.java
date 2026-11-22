package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import androidx.core.content.ContextCompat;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzw {
    private zzw() {
    }

    public /* synthetic */ zzw(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0165 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:21:0x005a, B:52:0x015f, B:54:0x0165, B:58:0x017f, B:62:0x018a, B:66:0x019b), top: B:79:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x017a  */
    /* JADX WARN: Code duplicated, block: B:57:0x017d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0185  */
    /* JADX WARN: Code duplicated, block: B:61:0x0188  */
    /* JADX WARN: Code duplicated, block: B:66:0x019b A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:21:0x005a, B:52:0x015f, B:54:0x0165, B:58:0x017f, B:62:0x018a, B:66:0x019b), top: B:79:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object zza(Application application, String str, zzr zzrVar, WebView webView, Continuation continuation) throws Throwable {
        zzv zzvVar;
        Application application2;
        zzr zzrVar2;
        String str2;
        Mutex mutex;
        WebView webView2;
        Mutex mutex2;
        zzaa zzaaVar;
        Mutex mutex3;
        zzr zzrVar3;
        Application application3;
        zzda zzdaVar;
        Object value;
        Throwable thM320exceptionOrNullimpl;
        List list;
        String str3;
        String str4;
        String str5;
        String str6;
        if (continuation instanceof zzv) {
            zzvVar = (zzv) continuation;
            int i = zzvVar.zzg;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzvVar.zzg = i - Integer.MIN_VALUE;
            } else {
                zzvVar = new zzv(this, continuation);
            }
        } else {
            zzvVar = new zzv(this, continuation);
        }
        Object obj = zzvVar.zze;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzvVar.zzg;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Mutex mutex4 = zzaa.zze;
                application2 = application;
                zzvVar.zza = application2;
                zzvVar.zzb = str;
                zzrVar2 = zzrVar;
                zzvVar.zzc = zzrVar2;
                zzvVar.zzh = null;
                zzvVar.zzd = mutex4;
                zzvVar.zzg = 1;
                if (mutex4.lock(null, zzvVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                mutex = mutex4;
                webView2 = null;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        zzdaVar = (zzda) zzvVar.zzd;
                        mutex3 = (Mutex) zzvVar.zzc;
                        zzrVar3 = (zzr) zzvVar.zzb;
                        application3 = (Application) zzvVar.zza;
                        try {
                            ResultKt.throwOnFailure(obj);
                            value = ((Result) obj).getValue();
                            thM320exceptionOrNullimpl = Result.m320exceptionOrNullimpl(value);
                            if (thM320exceptionOrNullimpl == null) {
                                zzp zzpVar = zzp.zza;
                                JobKt__JobKt.cancelChildren$default(zzp.zzc().getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                                list = SequencesKt.toList(JobKt.getJob(zzp.zzc().getCoroutineContext()).getChildren());
                                zzvVar.zza = mutex3;
                                zzvVar.zzb = thM320exceptionOrNullimpl;
                                zzvVar.zzc = null;
                                zzvVar.zzh = null;
                                zzvVar.zzd = null;
                                zzvVar.zzg = 3;
                                if (AwaitKt.joinAll(list, zzvVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex2 = mutex3;
                                throw thM320exceptionOrNullimpl;
                            }
                            zzaaVar = new zzaa(zzdaVar);
                            zzai zzaiVar = zzai.zza;
                            zzkw zzkwVar = zzkw.INIT_TOTAL;
                            String str7 = zzaa.zzc;
                            str3 = zzaa.zzd;
                            if (str3 == null) {
                                str4 = null;
                            } else {
                                str4 = str3;
                            }
                            str5 = zzaa.zzd;
                            if (str5 == null) {
                                str6 = null;
                            } else {
                                str6 = str5;
                            }
                            zzai.zzc(new zzaf(zzkwVar, str7, str4, str6, null), application3, zzrVar3);
                            zzaa.zzb = zzaaVar;
                            mutex = mutex3;
                            mutex.unlock(null);
                            return zzaaVar;
                        } catch (Throwable th) {
                            th = th;
                            mutex2 = mutex3;
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) zzvVar.zzb;
                        mutex2 = (Mutex) zzvVar.zza;
                        try {
                            ResultKt.throwOnFailure(obj);
                            throw th2;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    th = th3;
                    mutex2.unlock(null);
                    throw th;
                }
                Mutex mutex5 = (Mutex) zzvVar.zzd;
                WebView webView3 = (WebView) zzvVar.zzh;
                zzrVar2 = (zzr) zzvVar.zzc;
                str2 = (String) zzvVar.zzb;
                Application application4 = (Application) zzvVar.zza;
                ResultKt.throwOnFailure(obj);
                webView2 = webView3;
                mutex = mutex5;
                application2 = application4;
            }
            if (ContextCompat.checkSelfPermission(application2, "android.permission.INTERNET") != 0) {
                throw new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null);
            }
            zzaaVar = zzaa.zzb;
            if (zzaaVar == null) {
                zzw zzwVar = zzaa.zza;
                zzaa.zzd = UUID.randomUUID().toString();
                zzai zzaiVar2 = zzai.zza;
                zzkw zzkwVar2 = zzkw.INIT_TOTAL;
                String str8 = zzaa.zzc;
                String str9 = zzaa.zzd;
                String str10 = str9 == null ? null : str9;
                String str11 = zzaa.zzd;
                zzai.zzb(new zzaf(zzkwVar2, str8, str10, str11 == null ? null : str11, null), str2, new zzs());
                if (webView2 == null) {
                    webView2 = new WebView(application2);
                }
                String str12 = zzaa.zzc;
                String str13 = zzaa.zzd;
                String str14 = str13 == null ? null : str13;
                zzao zzaoVar = new zzao(application2, new zzaq(zzrVar2.zzc()), null, 4, null);
                zzp zzpVar2 = zzp.zza;
                zzda zzdaVar2 = new zzda(webView2, str2, application2, zzrVar2, str12, str14, zzaoVar, zzp.zzb());
                zzvVar.zza = application2;
                zzvVar.zzb = zzrVar2;
                zzvVar.zzc = mutex;
                zzvVar.zzh = zzwVar;
                zzvVar.zzd = zzdaVar2;
                zzvVar.zzg = 2;
                Object objZzg = zzdaVar2.zzg(zzvVar);
                if (objZzg == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex3 = mutex;
                zzrVar3 = zzrVar2;
                application3 = application2;
                zzdaVar = zzdaVar2;
                value = objZzg;
                thM320exceptionOrNullimpl = Result.m320exceptionOrNullimpl(value);
                if (thM320exceptionOrNullimpl == null) {
                    zzp zzpVar3 = zzp.zza;
                    JobKt__JobKt.cancelChildren$default(zzp.zzc().getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                    list = SequencesKt.toList(JobKt.getJob(zzp.zzc().getCoroutineContext()).getChildren());
                    zzvVar.zza = mutex3;
                    zzvVar.zzb = thM320exceptionOrNullimpl;
                    zzvVar.zzc = null;
                    zzvVar.zzh = null;
                    zzvVar.zzd = null;
                    zzvVar.zzg = 3;
                    if (AwaitKt.joinAll(list, zzvVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex3;
                    throw thM320exceptionOrNullimpl;
                }
                zzaaVar = new zzaa(zzdaVar);
                zzai zzaiVar3 = zzai.zza;
                zzkw zzkwVar3 = zzkw.INIT_TOTAL;
                String str15 = zzaa.zzc;
                str3 = zzaa.zzd;
                if (str3 == null) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                str5 = zzaa.zzd;
                if (str5 == null) {
                    str6 = null;
                } else {
                    str6 = str5;
                }
                zzai.zzc(new zzaf(zzkwVar3, str15, str4, str6, null), application3, zzrVar3);
                zzaa.zzb = zzaaVar;
                mutex = mutex3;
            }
            mutex.unlock(null);
            return zzaaVar;
        } catch (Throwable th4) {
            th = th4;
            mutex2 = mutex;
        }
    }
}
