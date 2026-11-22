package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzia {
    public static final /* synthetic */ int zzc = 0;

    @Nullable
    private static volatile zzhy zze = null;
    private static volatile boolean zzf = false;
    final zzhx zza;
    final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;
    private static final Object zzd = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzic zzh = new zzic(zzhs.zza, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    /* synthetic */ zzia(zzhx zzhxVar, String str, Object obj, boolean z, zzhz zzhzVar) {
        if (zzhxVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzhxVar;
        this.zzb = str;
        this.zzj = obj;
        this.zzm = true;
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (zze == null) {
            Object obj = zzd;
            synchronized (obj) {
                if (zze == null) {
                    synchronized (obj) {
                        zzhy zzhyVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzhyVar == null || zzhyVar.zza() != context) {
                            zzhe.zze();
                            zzib.zzc();
                            zzhm.zze();
                            zze = new zzhb(context, zzil.zza(new zzih() { // from class: com.google.android.gms.internal.measurement.zzhr
                                @Override // com.google.android.gms.internal.measurement.zzih
                                public final Object zza() {
                                    Context context2 = context;
                                    int i = zzia.zzc;
                                    return zzhn.zza(context2);
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    abstract Object zza(Object obj);

    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    public final Object zzb() {
        zzhj zzhjVarZza;
        String str;
        Object objZzb;
        if (!this.zzm && this.zzb == null) {
            throw new NullPointerException("flagName must not be null");
        }
        int i = zzi.get();
        if (this.zzk < i) {
            synchronized (this) {
                if (this.zzk < i) {
                    zzhy zzhyVar = zze;
                    if (zzhyVar == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    zzhx zzhxVar = this.zza;
                    boolean z = zzhxVar.zzf;
                    if (zzhxVar.zzb == null) {
                        Context contextZza = zzhyVar.zza();
                        String str2 = this.zza.zza;
                        zzhjVarZza = zzib.zza(contextZza, null, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhq
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzia.zzd();
                            }
                        });
                    } else if (zzho.zza(zzhyVar.zza(), this.zza.zzb)) {
                        boolean z2 = this.zza.zzh;
                        zzhjVarZza = zzhe.zza(zzhyVar.zza().getContentResolver(), this.zza.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhq
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzia.zzd();
                            }
                        });
                    } else {
                        zzhjVarZza = null;
                    }
                    Object objZza = (zzhjVarZza == null || (objZzb = zzhjVarZza.zzb(zzc())) == null) ? null : zza(objZzb);
                    if (objZza == null) {
                        zzhx zzhxVar2 = this.zza;
                        if (zzhxVar2.zze) {
                            objZza = null;
                        } else {
                            zzie zzieVar = zzhxVar2.zzi;
                            zzhm zzhmVarZza = zzhm.zza(zzhyVar.zza());
                            zzhx zzhxVar3 = this.zza;
                            if (zzhxVar3.zze) {
                                str = null;
                            } else {
                                String str3 = zzhxVar3.zzc;
                                str = this.zzb;
                            }
                            String strZzc = zzhmVarZza.zzb(str);
                            if (strZzc != null) {
                                objZza = zza(strZzc);
                            } else {
                                objZza = null;
                            }
                        }
                        if (objZza == null) {
                            objZza = this.zzj;
                        }
                    }
                    zzif zzifVar = (zzif) zzhyVar.zzb().zza();
                    if (zzifVar.zzb()) {
                        zzhg zzhgVar = (zzhg) zzifVar.zza();
                        zzhx zzhxVar4 = this.zza;
                        Uri uri = zzhxVar4.zzb;
                        String str4 = zzhxVar4.zza;
                        String strZza = zzhgVar.zza(uri, null, zzhxVar4.zzd, this.zzb);
                        objZza = strZza == null ? this.zzj : zza(strZza);
                    }
                    this.zzl = objZza;
                    this.zzk = i;
                }
            }
        }
        return this.zzl;
    }

    public final String zzc() {
        String str = this.zza.zzd;
        return this.zzb;
    }
}
