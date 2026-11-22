package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.android.gms.internal.gtm.zzsd;
import com.google.android.gms.internal.gtm.zzsg;
import com.google.android.gms.internal.gtm.zzsh;
import com.google.android.gms.internal.gtm.zzsi;
import com.google.android.gms.internal.gtm.zzwt;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzef implements Runnable {
    private final Context zza;
    private final zzsh zzb;
    private final String zzc;
    private final String zzd;
    private zzdf zze;
    private volatile zzao zzf;
    private volatile String zzg;
    private volatile String zzh;

    public zzef(Context context, String str, zzao zzaoVar) {
        zzsh zzshVar = new zzsh();
        this.zza = context;
        this.zzb = zzshVar;
        this.zzc = str;
        this.zzf = zzaoVar;
        String strConcat = "/r?id=".concat(String.valueOf(str));
        this.zzd = strConcat;
        this.zzg = strConcat;
        this.zzh = null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01b0 A[Catch: all -> 0x01c3, TryCatch #0 {, blocks: (B:36:0x012c, B:38:0x0132, B:40:0x0141, B:41:0x015c, B:43:0x015e, B:44:0x017a, B:46:0x01b0, B:47:0x01b7), top: B:67:0x012c }] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.zze == null) {
            throw new IllegalStateException("callback must be set before execute");
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zza.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            zzdg.zzb.zzd("...no network connectivity");
            this.zze.zza(1);
            return;
        }
        zzdg.zzb.zzd("Start loading resource from network ...");
        String strConcat = this.zzf.zza() + this.zzg + "&v=a65833898";
        if (this.zzh != null && !this.zzh.trim().isEmpty()) {
            strConcat = strConcat + "&pv=" + this.zzh;
        }
        int iZze = zzdz.zza().zze();
        InputStream inputStreamZza = null;
        if (iZze == 0) {
            throw null;
        }
        if (iZze == 3) {
            strConcat = strConcat.concat("&gtm_debug=x");
        }
        zzsg zzsgVarZza = zzsh.zza();
        try {
            try {
                inputStreamZza = zzsgVarZza.zza(strConcat);
            } catch (zzsi unused) {
                Log.w("GoogleTagManager", "Error when loading resource for url: " + strConcat);
                this.zze.zza(4);
            } catch (FileNotFoundException unused2) {
                Log.w("GoogleTagManager", "No data is retrieved from the given url: " + strConcat + ". Make sure container_id: " + this.zzc + " is correct.");
                this.zze.zza(3);
                zzsgVarZza.zzb();
                return;
            } catch (IOException e) {
                Log.w("GoogleTagManager", "Error when loading resources from url: " + strConcat + " " + e.getMessage(), e);
                this.zze.zza(2);
                zzsgVarZza.zzb();
                return;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzsd.zzc(inputStreamZza, byteArrayOutputStream);
                com.google.android.gms.internal.gtm.zzak zzakVarZzg = com.google.android.gms.internal.gtm.zzak.zzg(byteArrayOutputStream.toByteArray(), zzwt.zza());
                zzdg.zzb.zzd("Successfully loaded supplemented resource: " + String.valueOf(zzakVarZzg));
                if (!zzakVarZzg.zzm() && zzakVarZzg.zza() == 0) {
                    zzdg.zzb.zzd("No change for container: " + this.zzc);
                }
                zzdf zzdfVar = this.zze;
                ((zzaf) zzdfVar).zza.zzi.zzd();
                synchronized (((zzaf) zzdfVar).zza) {
                    if (zzakVarZzg.zzm()) {
                        zzak zzakVar = ((zzaf) zzdfVar).zza;
                        zzakVar.zzu(zzakVarZzg, zzakVar.zza.currentTimeMillis(), false);
                        zzdg.zzb.zzd("setting refresh time to current time: " + ((zzaf) zzdfVar).zza.zzo);
                        if (!((zzaf) zzdfVar).zza.zzv()) {
                            ((zzaf) zzdfVar).zza.zzt(zzakVarZzg);
                        }
                    } else if (((zzaf) zzdfVar).zza.zzn.zzm()) {
                        com.google.android.gms.internal.gtm.zzaj zzajVar = (com.google.android.gms.internal.gtm.zzaj) zzakVarZzg.zzZ();
                        zzajVar.zzc(((zzaf) zzdfVar).zza.zzn.zzc());
                        zzakVarZzg = (com.google.android.gms.internal.gtm.zzak) zzajVar.zzD();
                        zzak zzakVar2 = ((zzaf) zzdfVar).zza;
                        zzakVar2.zzu(zzakVarZzg, zzakVar2.zza.currentTimeMillis(), false);
                        zzdg.zzb.zzd("setting refresh time to current time: " + ((zzaf) zzdfVar).zza.zzo);
                        if (!((zzaf) zzdfVar).zza.zzv()) {
                            ((zzaf) zzdfVar).zza.zzt(zzakVarZzg);
                        }
                    } else {
                        Log.e("GoogleTagManager", "Current resource is null; network resource is also null");
                        ((zzaf) zzdfVar).zza.zzr(((zzaf) zzdfVar).zza.zzi.zzb());
                    }
                }
                zzsgVarZza.zzb();
                zzdg.zzb.zzd("Load resource from network finished.");
            } catch (IOException e2) {
                Log.w("GoogleTagManager", "Error when parsing downloaded resources from url: " + strConcat + " " + e2.getMessage(), e2);
                this.zze.zza(3);
                zzsgVarZza.zzb();
            }
        } catch (Throwable th) {
            zzsgVarZza.zzb();
            throw th;
        }
    }

    final void zza(String str) {
        if (str == null) {
            str = this.zzd;
        } else {
            zzdg.zzb.zza("Setting CTFE URL path: ".concat(str));
        }
        this.zzg = str;
    }

    final void zzb(zzdf zzdfVar) {
        this.zze = zzdfVar;
    }

    final void zzc(String str) {
        zzdg.zzb.zza("Setting previous container version: ".concat(String.valueOf(str)));
        this.zzh = str;
    }
}
