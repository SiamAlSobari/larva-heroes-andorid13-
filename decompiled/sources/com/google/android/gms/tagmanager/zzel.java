package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.internal.gtm.zzgb;
import com.google.android.gms.internal.gtm.zzro;
import com.google.android.gms.internal.gtm.zzrr;
import com.google.android.gms.internal.gtm.zzrt;
import com.google.android.gms.internal.gtm.zzrv;
import com.google.android.gms.internal.gtm.zzrx;
import com.google.android.gms.internal.gtm.zzsc;
import com.google.android.gms.internal.gtm.zzsd;
import com.google.android.gms.internal.gtm.zzwt;
import com.google.android.gms.internal.gtm.zzxu;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzel implements zzaj {
    private final Context zza;
    private final String zzb;
    private final ExecutorService zzc = zzgb.zza().zza(2);
    private zzdf zzd;

    zzel(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final synchronized void release() {
        this.zzc.shutdown();
    }

    @Override // com.google.android.gms.tagmanager.zzaj
    public final zzrv zza(int i) {
        zzrv zzrvVarZza;
        try {
            InputStream inputStreamOpenRawResource = this.zza.getResources().openRawResource(i);
            zzdg.zzb.zzd("Attempting to load a container from the resource ID " + i + " (" + this.zza.getResources().getResourceName(i) + ")");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzsd.zzc(inputStreamOpenRawResource, byteArrayOutputStream);
                try {
                    com.google.android.gms.internal.gtm.zzam zzamVarZzb = zzfu.zzb(zzcy.zza(new JSONObject(byteArrayOutputStream.toString("UTF-8"))));
                    zzrx zzrxVarZza = zzrv.zza();
                    for (int i2 = 0; i2 < zzamVarZzb.zzc(); i2++) {
                        zzrt zzrtVarZzb = zzrr.zzb();
                        zzrtVarZzb.zzb(com.google.android.gms.internal.gtm.zzb.INSTANCE_NAME.toString(), zzamVarZzb.zzl(i2));
                        String string = com.google.android.gms.internal.gtm.zzb.FUNCTION.toString();
                        String strZzc = zzs.zzc();
                        com.google.android.gms.internal.gtm.zzan zzanVarZzg = com.google.android.gms.internal.gtm.zzam.zzg();
                        zzanVarZzg.zzt(com.google.android.gms.internal.gtm.zzat.STRING);
                        zzanVarZzg.zzt(com.google.android.gms.internal.gtm.zzat.FUNCTION_ID);
                        zzanVarZzg.zzp(strZzc);
                        zzanVarZzg.zzo(false);
                        zzrtVarZzb.zzb(string, (com.google.android.gms.internal.gtm.zzam) zzanVarZzg.zzD());
                        zzrtVarZzb.zzb(zzs.zzd(), zzamVarZzb.zzm(i2));
                        zzrxVarZza.zzb(zzrtVarZzb.zza());
                    }
                    zzrvVarZza = zzrxVarZza.zza();
                } catch (UnsupportedEncodingException unused) {
                    zzdg.zzb.zza("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
                    zzrvVarZza = null;
                } catch (JSONException unused2) {
                    Log.w("GoogleTagManager", "Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
                    zzrvVarZza = null;
                }
                if (zzrvVarZza != null) {
                    zzdg.zzb.zzd("The container was successfully loaded from the resource (using JSON file format)");
                    return zzrvVarZza;
                }
                try {
                    zzrv zzrvVarZzb = zzsd.zzb(com.google.android.gms.internal.gtm.zzac.zzl(byteArrayOutputStream.toByteArray(), zzwt.zza()));
                    zzdg.zzb.zzd("The container was successfully loaded from the resource (using binary file)");
                    return zzrvVarZzb;
                } catch (zzsc unused3) {
                    Log.w("GoogleTagManager", "The resource file is invalid. The container from the binary file is invalid");
                    return null;
                } catch (zzxu unused4) {
                    Log.e("GoogleTagManager", "The resource file is corrupted. The container cannot be extracted from the binary file");
                    return null;
                }
            } catch (IOException unused5) {
                Log.w("GoogleTagManager", "Error reading the default container with resource ID " + i + " (" + this.zza.getResources().getResourceName(i) + ")");
                return null;
            }
        } catch (Resources.NotFoundException unused6) {
            Log.w("GoogleTagManager", "Failed to load the container. No default container resource found with the resource ID " + i);
            return null;
        }
    }

    @Override // com.google.android.gms.tagmanager.zzaj
    public final void zzb() {
        this.zzc.execute(new zzej(this));
    }

    @Override // com.google.android.gms.tagmanager.zzaj
    public final void zzc(zzro zzroVar) {
        this.zzc.execute(new zzek(this, zzroVar));
    }

    @Override // com.google.android.gms.tagmanager.zzaj
    public final void zzd(zzdf zzdfVar) {
        this.zzd = zzdfVar;
    }

    final File zze() {
        return new File(this.zza.getDir("google_tagmanager", 0), "resource_".concat(String.valueOf(this.zzb)));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Multi-variable type inference failed */
    final void zzf() {
        boolean zEquals;
        FileInputStream fileInputStream;
        com.google.android.gms.internal.gtm.zzaj zzajVar;
        if (this.zzd == null) {
            throw new IllegalStateException("Callback must be set before execute");
        }
        zzdg.zzb.zzd("Attempting to load resource from disk");
        if (zzdz.zza().zze() != 2) {
            int iZze = zzdz.zza().zze();
            fileInputStream = iZze;
            if (iZze == 3) {
                zEquals = this.zzb.equals(zzdz.zza().zzc());
                fileInputStream = zEquals;
                if (zEquals) {
                    this.zzd.zza(1);
                    return;
                }
            }
        } else {
            zEquals = this.zzb.equals(zzdz.zza().zzc());
            fileInputStream = zEquals;
            if (zEquals) {
                this.zzd.zza(1);
                return;
            }
        }
        try {
            try {
                fileInputStream = new FileInputStream(zze());
                try {
                    zzro zzroVarZzg = zzro.zzg(fileInputStream, zzwt.zza());
                    if (!zzroVarZzg.zzk() && !zzroVarZzg.zzl()) {
                        throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
                    }
                    zzdf zzdfVar = this.zzd;
                    if (zzroVarZzg.zzl()) {
                        zzajVar = (com.google.android.gms.internal.gtm.zzaj) zzroVarZzg.zzd().zzZ();
                    } else {
                        com.google.android.gms.internal.gtm.zzac zzacVarZzc = zzroVarZzg.zzc();
                        com.google.android.gms.internal.gtm.zzaj zzajVarZzd = com.google.android.gms.internal.gtm.zzak.zzd();
                        zzajVarZzd.zzc(zzacVarZzc);
                        zzajVarZzd.zza();
                        zzajVarZzd.zzb(zzacVarZzc.zzn());
                        zzajVar = zzajVarZzd;
                    }
                    ((zzad) zzdfVar).zza.zzu((com.google.android.gms.internal.gtm.zzak) zzajVar.zzD(), zzroVarZzg.zza(), true);
                } catch (IOException unused) {
                    this.zzd.zza(2);
                    Log.w("GoogleTagManager", "Failed to read the resource from disk");
                } catch (IllegalArgumentException unused2) {
                    this.zzd.zza(2);
                    Log.w("GoogleTagManager", "Failed to read the resource from disk. The resource is inconsistent");
                }
                try {
                    fileInputStream.close();
                } catch (IOException unused3) {
                    Log.w("GoogleTagManager", "Error closing stream for reading resource from disk");
                }
                zzdg.zzb.zzd("The Disk resource was successfully read.");
            } catch (FileNotFoundException unused4) {
                zzdg.zzb.zza("Failed to find the resource in the disk");
                this.zzd.zza(1);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (IOException unused5) {
                Log.w("GoogleTagManager", "Error closing stream for reading resource from disk");
            }
            throw th;
        }
    }
}
