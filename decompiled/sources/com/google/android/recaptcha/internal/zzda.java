package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import androidx.work.WorkRequest;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzda {
    public static final zzct zza = new zzct(null);
    public CompletableDeferred zzb;
    private final WebView zzc;
    private final String zzd;
    private final Context zze;
    private final zzr zzf;
    private final String zzg;
    private final String zzh;
    private final zzaj zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;
    private final zzas zzm;
    private final zzdk zzn;
    private final Mutex zzo;
    private final zzcu zzp;

    public zzda(WebView webView, String str, Context context, zzr zzrVar, String str2, String str3, zzaj zzajVar, CoroutineScope coroutineScope) {
        this.zzc = webView;
        this.zzd = str;
        this.zze = context;
        this.zzf = zzrVar;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzajVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzk = linkedHashMap;
        this.zzl = linkedHashMap;
        zzbc zzbcVar = new zzbc(webView, coroutineScope);
        zzp zzpVar = zzp.zza;
        this.zzm = new zzba(zzbcVar, zzp.zzc(), context);
        this.zzn = zzdk.zzc();
        this.zzo = MutexKt.Mutex$default(false, 1, null);
        zzcu zzcuVar = new zzcu(this);
        this.zzp = zzcuVar;
        this.zzj = zzq();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzcuVar, "RN");
        webView.setWebViewClient(new zzcs(this));
    }

    private final zzh zzo(Exception exc) {
        if (exc instanceof TimeoutCancellationException) {
            return new zzh(zzf.zzc, zzd.zzj);
        }
        return exc instanceof zzh ? (zzh) exc : new zzh(zzf.zzc, zzd.zzu);
    }

    private final void zzp(List list, zzh zzhVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzkw zzkwVar = (zzkw) it.next();
            zzai zzaiVar = zzai.zza;
            String str = this.zzg;
            String str2 = this.zzh;
            zzai.zzd(new zzaf(zzkwVar, str, str2, str2, null), String.valueOf(zzhVar.zzb().zza()), zzhVar.zza().zza(), this.zze, this.zzf, null);
        }
    }

    private static final Map zzq() {
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(-4, zzd.zzA), TuplesKt.to(-12, zzd.zzB), TuplesKt.to(-6, zzd.zzw), TuplesKt.to(-11, zzd.zzy), TuplesKt.to(-13, zzd.zzC), TuplesKt.to(-14, zzd.zzD), TuplesKt.to(-2, zzd.zzx), TuplesKt.to(-7, zzd.zzE), TuplesKt.to(-5, zzd.zzF), TuplesKt.to(-9, zzd.zzG), TuplesKt.to(-8, zzd.zzQ), TuplesKt.to(-15, zzd.zzz), TuplesKt.to(-1, zzd.zzH), TuplesKt.to(-3, zzd.zzJ), TuplesKt.to(-10, zzd.zzK));
        if (Build.VERSION.SDK_INT >= 26) {
            mapMutableMapOf.put(-16, zzd.zzI);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            mapMutableMapOf.put(1, zzd.zzM);
            mapMutableMapOf.put(2, zzd.zzN);
            mapMutableMapOf.put(0, zzd.zzO);
            mapMutableMapOf.put(3, zzd.zzP);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            mapMutableMapOf.put(4, zzd.zzL);
        }
        return mapMutableMapOf;
    }

    public final WebView zzb() {
        return this.zzc;
    }

    public final zzas zzd() {
        return this.zzm;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzf(RecaptchaAction recaptchaAction, Continuation continuation) throws Throwable {
        zzcv zzcvVar;
        zzda zzdaVar;
        Exception e;
        String str;
        RecaptchaException recaptchaExceptionZzc;
        CancellableContinuation cancellableContinuation;
        if (continuation instanceof zzcv) {
            zzcvVar = (zzcv) continuation;
            int i = zzcvVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcvVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcvVar = new zzcv(this, continuation);
            }
        } else {
            zzcvVar = new zzcv(this, continuation);
        }
        Object obj = zzcvVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzcvVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String string = UUID.randomUUID().toString();
            zzai zzaiVar = zzai.zza;
            zzai.zzb(new zzaf(zzkw.EXECUTE_TOTAL, this.zzg, this.zzh, string, null), this.zzd, new zzs());
            zzai.zzb(new zzaf(zzkw.EXECUTE_NATIVE, this.zzg, this.zzh, string, null), this.zzd, new zzs());
            try {
                zzcw zzcwVar = new zzcw(recaptchaAction, this, string, null);
                zzcvVar.zzd = this;
                zzcvVar.zze = string;
                zzcvVar.zzc = 1;
                Object objWithTimeout = TimeoutKt.withTimeout(5000L, zzcwVar, zzcvVar);
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzdaVar = this;
                obj = objWithTimeout;
                str = string;
            } catch (Exception e2) {
                zzdaVar = this;
                e = e2;
                str = string;
                List listListOf = CollectionsKt.listOf(zzkw.EXECUTE_TOTAL);
                zzh zzhVarZzo = zzdaVar.zzo(e);
                zzdaVar.zzp(listListOf, zzhVarZzo);
                recaptchaExceptionZzc = zzhVarZzo.zzc();
                cancellableContinuation = (CancellableContinuation) zzdaVar.zzk.remove(str);
                if (cancellableContinuation != null) {
                    Boxing.boxBoolean(cancellableContinuation.cancel(recaptchaExceptionZzc));
                }
                Result.Companion companion = Result.INSTANCE;
                return Result.m317constructorimpl(ResultKt.createFailure(recaptchaExceptionZzc));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zzcvVar.zze;
            zzdaVar = zzcvVar.zzd;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e3) {
                e = e3;
                List listListOf2 = CollectionsKt.listOf(zzkw.EXECUTE_TOTAL);
                zzh zzhVarZzo2 = zzdaVar.zzo(e);
                zzdaVar.zzp(listListOf2, zzhVarZzo2);
                recaptchaExceptionZzc = zzhVarZzo2.zzc();
                cancellableContinuation = (CancellableContinuation) zzdaVar.zzk.remove(str);
                if (cancellableContinuation != null) {
                    Boxing.boxBoolean(cancellableContinuation.cancel(recaptchaExceptionZzc));
                }
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m317constructorimpl(ResultKt.createFailure(recaptchaExceptionZzc));
            }
        }
        zzai zzaiVar2 = zzai.zza;
        zzai.zzc(new zzaf(zzkw.EXECUTE_TOTAL, zzdaVar.zzg, zzdaVar.zzh, str, null), zzdaVar.zze, zzdaVar.zzf);
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m317constructorimpl((String) obj);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzg(Continuation continuation) throws Throwable {
        zzcx zzcxVar;
        zzda zzdaVar;
        boolean z;
        List listListOf;
        Long lZza;
        zzh zzhVarZzo;
        long jLongValue;
        if (continuation instanceof zzcx) {
            zzcxVar = (zzcx) continuation;
            int i = zzcxVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcxVar = new zzcx(this, continuation);
            }
        } else {
            zzcxVar = new zzcx(this, continuation);
        }
        Object objWithTimeout = zzcxVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzcxVar.zzc;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithTimeout);
            zzai zzaiVar = zzai.zza;
            zzkw zzkwVar = zzkw.INIT_NATIVE;
            String str = this.zzg;
            String str2 = this.zzh;
            zzai.zzb(new zzaf(zzkwVar, str, str2, str2, null), this.zzd, new zzs());
            this.zzb = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            Boxing.boxInt(zzm().hashCode());
            try {
                zzcz zzczVar = new zzcz(this, null);
                zzcxVar.zzd = this;
                zzcxVar.zzc = 1;
                objWithTimeout = TimeoutKt.withTimeout(WorkRequest.MIN_BACKOFF_MILLIS, zzczVar, zzcxVar);
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zzdaVar = this;
            } catch (Exception e) {
                e = e;
                zzdaVar = this;
                e.getMessage();
                z = e instanceof TimeoutCancellationException;
                if (z) {
                    listListOf = CollectionsKt.listOf((Object[]) new zzkw[]{zzkw.INIT_TOTAL, zzkw.INIT_NETWORK});
                } else {
                    listListOf = CollectionsKt.listOf(zzkw.INIT_TOTAL);
                }
                lZza = zzdaVar.zzp.zza();
                if (z) {
                    if (lZza != null) {
                        jLongValue = lZza.longValue();
                        zzr zzrVar = zzdaVar.zzf;
                        if (jLongValue > 8000) {
                            zzhVarZzo = zzdaVar.zzo(e);
                        }
                    }
                    zzhVarZzo = new zzh(zzf.zze, zzd.zzT);
                } else {
                    zzhVarZzo = zzdaVar.zzo(e);
                }
                zzdaVar.zzp(listListOf, zzhVarZzo);
                Result.Companion companion = Result.INSTANCE;
                return Result.m317constructorimpl(ResultKt.createFailure(zzhVarZzo.zzc()));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzdaVar = zzcxVar.zzd;
            try {
                ResultKt.throwOnFailure(objWithTimeout);
            } catch (Exception e2) {
                e = e2;
                e.getMessage();
                z = e instanceof TimeoutCancellationException;
                if (z) {
                    listListOf = CollectionsKt.listOf((Object[]) new zzkw[]{zzkw.INIT_TOTAL, zzkw.INIT_NETWORK});
                } else {
                    listListOf = CollectionsKt.listOf(zzkw.INIT_TOTAL);
                }
                lZza = zzdaVar.zzp.zza();
                if (z) {
                    if (lZza != null) {
                        jLongValue = lZza.longValue();
                        zzr zzrVar2 = zzdaVar.zzf;
                        if (jLongValue > 8000) {
                            zzhVarZzo = zzdaVar.zzo(e);
                        }
                    }
                    zzhVarZzo = new zzh(zzf.zze, zzd.zzT);
                } else {
                    zzhVarZzo = zzdaVar.zzo(e);
                }
                zzdaVar.zzp(listListOf, zzhVarZzo);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m317constructorimpl(ResultKt.createFailure(zzhVarZzo.zzc()));
            }
        }
        return ((Result) objWithTimeout).getValue();
    }

    public final CompletableDeferred zzm() {
        CompletableDeferred completableDeferred = this.zzb;
        if (completableDeferred != null) {
            return completableDeferred;
        }
        return null;
    }
}
