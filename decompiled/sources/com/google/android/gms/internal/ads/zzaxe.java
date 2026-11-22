package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxe {
    private final zzaxk zza;
    private final zzayt zzb;
    private final boolean zzc;

    private zzaxe() {
        this.zzb = zzayu.zzd();
        this.zzc = false;
        this.zza = new zzaxk();
    }

    public static zzaxe zza() {
        return new zzaxe();
    }

    private final synchronized String zzd(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzk(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((zzayu) this.zzb.zzal()).zzax(), 3));
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                fileOutputStream.write(zzd(i).getBytes());
            } catch (IOException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i) {
        zzayt zzaytVar = this.zzb;
        zzaytVar.zzd();
        zzaytVar.zzc(com.google.android.gms.ads.internal.util.zzs.zzd());
        zzaxj zzaxjVar = new zzaxj(this.zza, ((zzayu) this.zzb.zzal()).zzax(), null);
        int i2 = i - 1;
        zzaxjVar.zza(i2);
        zzaxjVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(zzaxd zzaxdVar) {
        if (this.zzc) {
            try {
                zzaxdVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeM)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzaxe(zzaxk zzaxkVar) {
        this.zzb = zzayu.zzd();
        this.zza = zzaxkVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeL)).booleanValue();
    }
}
