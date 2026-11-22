package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.internal.gtm.zzro;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzek implements Runnable {
    final /* synthetic */ zzro zza;
    final /* synthetic */ zzel zzb;

    zzek(zzel zzelVar, zzro zzroVar) {
        this.zzb = zzelVar;
        this.zza = zzroVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileOutputStream fileOutputStream;
        zzel zzelVar = this.zzb;
        zzro zzroVar = this.zza;
        File fileZze = zzelVar.zze();
        try {
            try {
                fileOutputStream = new FileOutputStream(fileZze);
                zzroVar.zzS(fileOutputStream);
            } catch (FileNotFoundException unused) {
                Log.e("GoogleTagManager", "Error opening resource file for writing");
            }
        } catch (IOException unused2) {
            Log.w("GoogleTagManager", "Error writing resource to disk. Removing resource from disk.");
            fileZze.delete();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException unused3) {
                Log.w("GoogleTagManager", "error closing stream for writing resource to disk");
            }
        }
    }
}
