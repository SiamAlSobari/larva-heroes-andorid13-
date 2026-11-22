package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.games.GamesStatusCodes;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfna {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfnb zzc;
    private final zzflc zzd;
    private final zzfkx zze;
    private zzfmp zzf;
    private final Object zzg = new Object();

    public zzfna(Context context, zzfnb zzfnbVar, zzflc zzflcVar, zzfkx zzfkxVar) {
        this.zzb = context;
        this.zzc = zzfnbVar;
        this.zzd = zzflcVar;
        this.zze = zzfkxVar;
    }

    private final synchronized Class zzd(zzfmq zzfmqVar) throws zzfmz {
        String strZzk = zzfmqVar.zza().zzk();
        HashMap map = zza;
        Class cls = (Class) map.get(strZzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfmqVar.zzc())) {
                throw new zzfmz(2026, "VM did not pass signature verification");
            }
            try {
                File fileZzb = zzfmqVar.zzb();
                if (!fileZzb.exists()) {
                    fileZzb.mkdirs();
                }
                Class clsLoadClass = new DexClassLoader(zzfmqVar.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strZzk, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfmz(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfmz(2026, e2);
        }
    }

    public final zzflf zza() {
        zzfmp zzfmpVar;
        synchronized (this.zzg) {
            zzfmpVar = this.zzf;
        }
        return zzfmpVar;
    }

    public final zzfmq zzb() {
        synchronized (this.zzg) {
            zzfmp zzfmpVar = this.zzf;
            if (zzfmpVar == null) {
                return null;
            }
            return zzfmpVar.zzf();
        }
    }

    public final boolean zzc(zzfmq zzfmqVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfmp zzfmpVar = new zzfmp(zzd(zzfmqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfmqVar.zze(), null, new Bundle(), 2), zzfmqVar, this.zzc, this.zzd);
                if (!zzfmpVar.zzh()) {
                    throw new zzfmz(GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND, "init failed");
                }
                int iZze = zzfmpVar.zze();
                if (iZze != 0) {
                    throw new zzfmz(GamesStatusCodes.STATUS_SNAPSHOT_CREATION_FAILED, "ci: " + iZze);
                }
                synchronized (this.zzg) {
                    try {
                        zzfmp zzfmpVar2 = this.zzf;
                        if (zzfmpVar2 != null) {
                            try {
                                zzfmpVar2.zzg();
                            } catch (zzfmz e) {
                                this.zzd.zzc(e.zza(), -1L, e);
                            }
                        }
                        this.zzf = zzfmpVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.zzd.zzd(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfmz(2004, e2);
            }
        } catch (zzfmz e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }
}
