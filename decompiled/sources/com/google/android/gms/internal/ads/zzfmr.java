package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfmr {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfmr(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfms.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfms.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        return "FBAMTD" + (this.zzd - 1);
    }

    private final String zzf() {
        return "LATMTD" + (this.zzd - 1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    public final boolean zza(zzatr zzatrVar, zzfmx zzfmxVar) {
        boolean z;
        String strZzk = zzatrVar.zzd().zzk();
        byte[] bArrZzA = zzatrVar.zzf().zzA();
        byte[] bArrZzA2 = zzatrVar.zze().zzA();
        if (!TextUtils.isEmpty(strZzk) && bArrZzA2 != null && bArrZzA2.length != 0) {
            zzfms.zzd(this.zza);
            this.zza.mkdirs();
            zzfms.zzc(strZzk, this.zza).mkdirs();
            File fileZzb = zzfms.zzb(strZzk, "pcam.jar", this.zza);
            if ((bArrZzA == null || bArrZzA.length <= 0 || zzfms.zze(fileZzb, bArrZzA)) && zzfms.zze(zzfms.zzb(strZzk, "pcbc", this.zza), bArrZzA2)) {
                File fileZzb2 = zzfms.zzb(zzatrVar.zzd().zzk(), "pcam.jar", this.zza);
                if (fileZzb2.exists() && zzfmxVar != null && !zzfmxVar.zza(fileZzb2)) {
                    return false;
                }
                String strZzk2 = zzatrVar.zzd().zzk();
                if (TextUtils.isEmpty(strZzk2)) {
                    z = false;
                } else {
                    File fileZzb3 = zzfms.zzb(strZzk2, "pcam.jar", this.zza);
                    File fileZzb4 = zzfms.zzb(strZzk2, "pcbc", this.zza);
                    File fileZzb5 = zzfms.zzb(strZzk2, "pcam.jar", zzd());
                    File fileZzb6 = zzfms.zzb(strZzk2, "pcbc", zzd());
                    if ((!fileZzb3.exists() || fileZzb3.renameTo(fileZzb5)) && fileZzb4.exists() && fileZzb4.renameTo(fileZzb6)) {
                        zzatt zzattVarZze = zzatu.zze();
                        zzattVarZze.zze(zzatrVar.zzd().zzk());
                        zzattVarZze.zza(zzatrVar.zzd().zzj());
                        zzattVarZze.zzb(zzatrVar.zzd().zza());
                        zzattVarZze.zzd(zzatrVar.zzd().zzd());
                        zzattVarZze.zzc(zzatrVar.zzd().zzc());
                        zzatu zzatuVar = (zzatu) zzattVarZze.zzal();
                        zzatu zzatuVarZzb = zzb(1);
                        SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzatuVarZzb != null && !zzatuVar.zzk().equals(zzatuVarZzb.zzk())) {
                            editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzatuVarZzb.zzax()));
                        }
                        editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzatuVar.zzax()));
                        if (editorEdit.commit()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                HashSet hashSet = new HashSet();
                zzatu zzatuVarZzb2 = zzb(1);
                if (zzatuVarZzb2 != null) {
                    hashSet.add(zzatuVarZzb2.zzk());
                }
                zzatu zzatuVarZzb3 = zzb(2);
                if (zzatuVarZzb3 != null) {
                    hashSet.add(zzatuVarZzb3.zzk());
                }
                for (File file : zzd().listFiles()) {
                    String name = file.getName();
                    if (!hashSet.contains(name)) {
                        zzfms.zzd(zzfms.zzc(name, zzd()));
                    }
                }
                return z;
            }
        }
        return false;
    }

    final zzatu zzb(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgqi zzgqiVar = zzgqi.zzb;
            zzatu zzatuVarZzh = zzatu.zzh(zzgqi.zzv(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZzk = zzatuVarZzh.zzk();
            File fileZzb = zzfms.zzb(strZzk, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = zzfms.zzb(strZzk, "pcam", zzd());
            }
            File fileZzb2 = zzfms.zzb(strZzk, "pcbc", zzd());
            if (fileZzb.exists() && fileZzb2.exists()) {
                return zzatuVarZzh;
            }
            return null;
        } catch (zzgsc unused) {
        }
    }

    public final zzfmq zzc(int i) {
        zzatu zzatuVarZzb = zzb(1);
        if (zzatuVarZzb == null) {
            return null;
        }
        String strZzk = zzatuVarZzb.zzk();
        File fileZzb = zzfms.zzb(strZzk, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = zzfms.zzb(strZzk, "pcam", zzd());
        }
        return new zzfmq(zzatuVarZzb, fileZzb, zzfms.zzb(strZzk, "pcbc", zzd()), zzfms.zzb(strZzk, "pcopt", zzd()));
    }
}
