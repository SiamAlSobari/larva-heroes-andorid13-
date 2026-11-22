package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import kotlin.time.DurationKt;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzkz implements zzgt {
    private static volatile zzkz zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zzik zzD;
    private String zzE;
    long zza;
    private final zzfp zzc;
    private final zzeu zzd;
    private zzam zze;
    private zzew zzf;
    private zzkl zzg;
    private zzaa zzh;
    private final zzlb zzi;
    private zzii zzj;
    private zzju zzk;
    private final zzko zzl;
    private zzfg zzm;
    private final zzfy zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzlg zzF = new zzku(this);

    zzkz(zzla zzlaVar, zzfy zzfyVar) {
        Preconditions.checkNotNull(zzlaVar);
        this.zzn = zzfy.zzp(zzlaVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzko(this);
        zzlb zzlbVar = new zzlb(this);
        zzlbVar.zzX();
        this.zzi = zzlbVar;
        zzeu zzeuVar = new zzeu(this);
        zzeuVar.zzX();
        this.zzd = zzeuVar;
        zzfp zzfpVar = new zzfp(this);
        zzfpVar.zzX();
        this.zzc = zzfpVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaz().zzp(new zzkp(this, zzlaVar));
    }

    static final void zzaa(com.google.android.gms.internal.measurement.zzfr zzfrVar, int i, String str) {
        List listZzp = zzfrVar.zzp();
        for (int i2 = 0; i2 < listZzp.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfw) listZzp.get(i2)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfv zzfvVarZze = com.google.android.gms.internal.measurement.zzfw.zze();
        zzfvVarZze.zzj("_err");
        zzfvVarZze.zzi(Long.valueOf(i).longValue());
        com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) zzfvVarZze.zzaE();
        com.google.android.gms.internal.measurement.zzfv zzfvVarZze2 = com.google.android.gms.internal.measurement.zzfw.zze();
        zzfvVarZze2.zzj("_ev");
        zzfvVarZze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfw zzfwVar2 = (com.google.android.gms.internal.measurement.zzfw) zzfvVarZze2.zzaE();
        zzfrVar.zzf(zzfwVar);
        zzfrVar.zzf(zzfwVar2);
    }

    static final void zzab(com.google.android.gms.internal.measurement.zzfr zzfrVar, String str) {
        List listZzp = zzfrVar.zzp();
        for (int i = 0; i < listZzp.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfw) listZzp.get(i)).zzg())) {
                zzfrVar.zzh(i);
                return;
            }
        }
    }

    private final zzq zzac(String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(str);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzad = zzad(zzhVarZzj);
        if (boolZzad != null && !boolZzad.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping. appId", zzeo.zzn(str));
            return null;
        }
        String strZzy = zzhVarZzj.zzy();
        String strZzw = zzhVarZzj.zzw();
        long jZzb = zzhVarZzj.zzb();
        String strZzv = zzhVarZzj.zzv();
        long jZzm = zzhVarZzj.zzm();
        long jZzj = zzhVarZzj.zzj();
        boolean zZzai = zzhVarZzj.zzai();
        String strZzx = zzhVarZzj.zzx();
        zzhVarZzj.zza();
        return new zzq(str, strZzy, strZzw, jZzb, strZzv, jZzm, jZzj, (String) null, zZzai, false, strZzx, 0L, 0L, 0, zzhVarZzj.zzah(), false, zzhVarZzj.zzr(), zzhVarZzj.zzq(), zzhVarZzj.zzk(), zzhVarZzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null);
    }

    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionName;
                String strZzw = zzhVar.zzw();
                if (strZzw != null && strZzw.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzae() {
        zzaz().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzay().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzay().zzj().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final void zzaf(com.google.android.gms.internal.measurement.zzgb zzgbVar, long j, boolean z) {
        zzle zzleVar;
        String str = true != z ? "_lte" : "_se";
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzle zzleVarZzp = zzamVar.zzp(zzgbVar.zzap(), str);
        if (zzleVarZzp == null || zzleVarZzp.zze == null) {
            zzleVar = new zzle(zzgbVar.zzap(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, zzav().currentTimeMillis(), Long.valueOf(j));
        } else {
            zzleVar = new zzle(zzgbVar.zzap(), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str, zzav().currentTimeMillis(), Long.valueOf(((Long) zzleVarZzp.zze).longValue() + j));
        }
        com.google.android.gms.internal.measurement.zzgk zzgkVarZzd = com.google.android.gms.internal.measurement.zzgl.zzd();
        zzgkVarZzd.zzf(str);
        zzgkVarZzd.zzg(zzav().currentTimeMillis());
        zzgkVarZzd.zze(((Long) zzleVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) zzgkVarZzd.zzaE();
        int iZza = zzlb.zza(zzgbVar, str);
        if (iZza >= 0) {
            zzgbVar.zzam(iZza, zzglVar);
        } else {
            zzgbVar.zzm(zzglVar);
        }
        if (j > 0) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzL(zzleVar);
            zzay().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzleVar.zze);
        }
    }

    private final void zzag() {
        long jMax;
        long jMax2;
        zzaz().zzg();
        zzB();
        if (this.zza > 0) {
            long jAbs = 3600000 - Math.abs(zzav().elapsedRealtime() - this.zza);
            if (jAbs > 0) {
                zzay().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzm().zzc();
                zzkl zzklVar = this.zzg;
                zzal(zzklVar);
                zzklVar.zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzai()) {
            zzay().zzj().zza("Nothing to upload or uploading impossible");
            zzm().zzc();
            zzkl zzklVar2 = this.zzg;
            zzal(zzklVar2);
            zzklVar2.zza();
            return;
        }
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzg();
        long jMax3 = Math.max(0L, ((Long) zzeb.zzz.zza(null)).longValue());
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        boolean z = true;
        if (!zzamVar.zzH()) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            if (!zzamVar2.zzG()) {
                z = false;
            }
        }
        if (z) {
            String strZzl = zzg().zzl();
            if (TextUtils.isEmpty(strZzl) || ".none.".equals(strZzl)) {
                zzg();
                jMax = Math.max(0L, ((Long) zzeb.zzt.zza(null)).longValue());
            } else {
                zzg();
                jMax = Math.max(0L, ((Long) zzeb.zzu.zza(null)).longValue());
            }
        } else {
            zzg();
            jMax = Math.max(0L, ((Long) zzeb.zzs.zza(null)).longValue());
        }
        long jZza = this.zzk.zzc.zza();
        long jZza2 = this.zzk.zzd.zza();
        zzam zzamVar3 = this.zze;
        zzal(zzamVar3);
        boolean z2 = z;
        long jZzd = zzamVar3.zzd();
        zzam zzamVar4 = this.zze;
        zzal(zzamVar4);
        long jMax4 = Math.max(jZzd, zzamVar4.zze());
        if (jMax4 != 0) {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            long jMax5 = Math.max(jCurrentTimeMillis - jAbs3, jAbs4);
            jMax2 = jAbs2 + jMax3;
            if (z2 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            zzlb zzlbVar = this.zzi;
            zzal(zzlbVar);
            if (!zzlbVar.zzw(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i = 0;
                while (true) {
                    zzg();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzeb.zzB.zza(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    zzg();
                    jMax2 += Math.max(0L, ((Long) zzeb.zzA.zza(null)).longValue()) * (1 << i);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            jMax2 = 0;
            break;
        }
        if (jMax2 == 0) {
            zzay().zzj().zza("Next upload time is 0");
            zzm().zzc();
            zzkl zzklVar3 = this.zzg;
            zzal(zzklVar3);
            zzklVar3.zza();
            return;
        }
        zzeu zzeuVar = this.zzd;
        zzal(zzeuVar);
        if (!zzeuVar.zza()) {
            zzay().zzj().zza("No network");
            zzm().zzb();
            zzkl zzklVar4 = this.zzg;
            zzal(zzklVar4);
            zzklVar4.zza();
            return;
        }
        long jZza3 = this.zzk.zzb.zza();
        zzg();
        long jMax6 = Math.max(0L, ((Long) zzeb.zzq.zza(null)).longValue());
        zzlb zzlbVar2 = this.zzi;
        zzal(zzlbVar2);
        if (!zzlbVar2.zzw(jZza3, jMax6)) {
            jMax2 = Math.max(jMax2, jZza3 + jMax6);
        }
        zzm().zzc();
        long jCurrentTimeMillis2 = jMax2 - zzav().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzg();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzeb.zzv.zza(null)).longValue());
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzay().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzkl zzklVar5 = this.zzg;
        zzal(zzklVar5);
        zzklVar5.zzd(jCurrentTimeMillis2);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x036f A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0387 A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x03a0 A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x03b6 A[Catch: all -> 0x0d05, TRY_ENTER, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:117:0x03c8 A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:123:0x03df  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e1 A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0415  */
    /* JADX WARN: Code duplicated, block: B:132:0x0416 A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0427  */
    /* JADX WARN: Code duplicated, block: B:137:0x042e A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0438 A[Catch: all -> 0x0d05, LOOP:3: B:135:0x0428->B:139:0x0438, LOOP_END, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0457  */
    /* JADX WARN: Code duplicated, block: B:144:0x0464 A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0475  */
    /* JADX WARN: Code duplicated, block: B:155:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:156:0x04b4 A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x04c2 A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:168:0x0506  */
    /* JADX WARN: Code duplicated, block: B:180:0x055e A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0569 A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x056f A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0578  */
    /* JADX WARN: Code duplicated, block: B:287:0x08d9 A[PHI: r8
  0x08d9: PHI (r8v14 com.google.android.gms.measurement.internal.zzas) = (r8v13 com.google.android.gms.measurement.internal.zzas), (r8v28 com.google.android.gms.measurement.internal.zzas) binds: [B:283:0x0883, B:285:0x0898] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:374:0x0b73 A[Catch: all -> 0x0d05, TryCatch #2 {all -> 0x0d05, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:326:0x0a00, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0856, B:282:0x0879, B:284:0x0885, B:286:0x089a, B:288:0x08db, B:292:0x08f3, B:294:0x08fa, B:296:0x0909, B:298:0x090d, B:300:0x0911, B:302:0x0915, B:303:0x0921, B:304:0x0926, B:306:0x092c, B:308:0x0948, B:309:0x094d, B:325:0x09fd, B:310:0x0968, B:312:0x0970, B:316:0x0997, B:318:0x09c3, B:320:0x09d3, B:321:0x09e3, B:323:0x09ed, B:313:0x097d, B:279:0x0841, B:265:0x07d4, B:327:0x0a0b, B:329:0x0a18, B:330:0x0a1e, B:331:0x0a26, B:333:0x0a2c, B:336:0x0a46, B:338:0x0a57, B:358:0x0acb, B:360:0x0ad1, B:362:0x0ae9, B:365:0x0af0, B:370:0x0b1f, B:372:0x0b61, B:375:0x0b96, B:376:0x0b9a, B:377:0x0ba5, B:379:0x0be8, B:380:0x0bf5, B:382:0x0c04, B:386:0x0c1e, B:388:0x0c37, B:374:0x0b73, B:366:0x0af8, B:368:0x0b04, B:369:0x0b08, B:389:0x0c4f, B:390:0x0c67, B:393:0x0c6f, B:394:0x0c74, B:395:0x0c84, B:397:0x0c9e, B:398:0x0cb9, B:399:0x0cc2, B:404:0x0ce1, B:403:0x0cce, B:339:0x0a6f, B:341:0x0a75, B:343:0x0a7f, B:345:0x0a86, B:351:0x0a96, B:353:0x0a9d, B:355:0x0abc, B:357:0x0ac3, B:356:0x0ac0, B:352:0x0a9a, B:344:0x0a83, B:201:0x05ca, B:203:0x05d0, B:407:0x0cf3), top: B:418:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:434:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x043e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0588 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c9  */
    private final boolean zzah(String str, long j) {
        int i;
        int i2;
        com.google.android.gms.internal.measurement.zzgb zzgbVar;
        zzkw zzkwVar;
        long j2;
        int iZzc;
        com.google.android.gms.internal.measurement.zzfw zzfwVarZzB;
        Long lValueOf;
        String str2;
        String str3;
        int i3;
        int i4;
        com.google.android.gms.internal.measurement.zzgb zzgbVar2;
        com.google.android.gms.internal.measurement.zzfr zzfrVar;
        com.google.android.gms.internal.measurement.zzfr zzfrVar2;
        com.google.android.gms.internal.measurement.zzgb zzgbVar3;
        int i5;
        com.google.android.gms.internal.measurement.zzfr zzfrVar3;
        int i6;
        com.google.android.gms.internal.measurement.zzfr zzfrVar4;
        ArrayList arrayList;
        int i7;
        int i8;
        int i9;
        String strZzh;
        int iCharCount;
        int iCodePointAt;
        byte b;
        String str4 = "_npa";
        String str5 = "_ai";
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzkw zzkwVar2 = new zzkw(this, null);
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzU(null, j, this.zzA, zzkwVar2);
            List list = zzkwVar2.zzc;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.zzgb zzgbVar4 = (com.google.android.gms.internal.measurement.zzgb) zzkwVar2.zza.zzby();
                zzgbVar4.zzr();
                com.google.android.gms.internal.measurement.zzfr zzfrVar5 = null;
                com.google.android.gms.internal.measurement.zzfr zzfrVar6 = null;
                int i10 = 0;
                int i11 = 0;
                int i12 = -1;
                int i13 = -1;
                int i14 = 0;
                while (true) {
                    i = i14;
                    i2 = i11;
                    com.google.android.gms.internal.measurement.zzfr zzfrVar7 = zzfrVar5;
                    if (i10 >= zzkwVar2.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfr zzfrVar8 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfs) zzkwVar2.zzc.get(i10)).zzby();
                    zzfp zzfpVar = this.zzc;
                    zzal(zzfpVar);
                    String str6 = str4;
                    if (zzfpVar.zzr(zzkwVar2.zza.zzx(), zzfrVar8.zzo())) {
                        zzay().zzk().zzc("Dropping blocked raw event. appId", zzeo.zzn(zzkwVar2.zza.zzx()), this.zzn.zzj().zzd(zzfrVar8.zzo()));
                        zzfp zzfpVar2 = this.zzc;
                        zzal(zzfpVar2);
                        if (!zzfpVar2.zzp(zzkwVar2.zza.zzx())) {
                            zzfp zzfpVar3 = this.zzc;
                            zzal(zzfpVar3);
                            if (!zzfpVar3.zzs(zzkwVar2.zza.zzx()) && !"_err".equals(zzfrVar8.zzo())) {
                                zzv().zzN(this.zzF, zzkwVar2.zza.zzx(), 11, "_ev", zzfrVar8.zzo(), 0);
                            }
                        }
                        str2 = str5;
                        zzgbVar3 = zzgbVar4;
                        i6 = i10;
                        i14 = i;
                        i11 = i2;
                        zzfrVar5 = zzfrVar7;
                    } else {
                        if (zzfrVar8.zzo().equals(zzgv.zza(str5))) {
                            zzfrVar8.zzi(str5);
                            zzay().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzay().zzq(), 5)) {
                                int i15 = 0;
                                while (i15 < zzfrVar8.zza()) {
                                    String str7 = str5;
                                    if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzfrVar8.zzn(i15).zzg()) && !zzfrVar8.zzn(i15).zzh().isEmpty() && "admob".equalsIgnoreCase(zzfrVar8.zzn(i15).zzh())) {
                                        zzay().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i15++;
                                    str5 = str7;
                                }
                            }
                        }
                        str2 = str5;
                        zzfp zzfpVar4 = this.zzc;
                        zzal(zzfpVar4);
                        boolean zZzq = zzfpVar4.zzq(zzkwVar2.zza.zzx(), zzfrVar8.zzo());
                        if (zZzq) {
                            str3 = "_et";
                            i3 = i10;
                            i4 = i12;
                        } else {
                            zzal(this.zzi);
                            String strZzo = zzfrVar8.zzo();
                            Preconditions.checkNotEmpty(strZzo);
                            i3 = i10;
                            int iHashCode = strZzo.hashCode();
                            i4 = i12;
                            str3 = "_et";
                            if (iHashCode != 94660) {
                                if (iHashCode != 95025) {
                                    if (iHashCode == 95027 && strZzo.equals("_ui")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strZzo.equals("_ug")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (strZzo.equals("_in")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            if (b != 0 && b != 1 && b != 2) {
                                zzgbVar2 = zzgbVar4;
                                zzfrVar = zzfrVar6;
                                zZzq = false;
                            }
                            if (zZzq) {
                                arrayList = new ArrayList(zzfrVar8.zzp());
                                i8 = -1;
                                i9 = -1;
                                for (i7 = 0; i7 < arrayList.size(); i7++) {
                                    if ("value".equals(((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i7)).zzg())) {
                                        i8 = i7;
                                    } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i7)).zzg())) {
                                        i9 = i7;
                                    }
                                }
                                if (i8 != -1) {
                                    if (!((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i8)).zzw() || ((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i8)).zzu()) {
                                        if (i9 == -1) {
                                            strZzh = ((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i9)).zzh();
                                            if (strZzh.length() == 3) {
                                                iCharCount = 0;
                                                while (iCharCount < strZzh.length()) {
                                                    iCodePointAt = strZzh.codePointAt(iCharCount);
                                                    if (Character.isLetter(iCodePointAt)) {
                                                        iCharCount += Character.charCount(iCodePointAt);
                                                    }
                                                }
                                            }
                                        }
                                        zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        zzfrVar8.zzh(i8);
                                        zzab(zzfrVar8, "_c");
                                        zzaa(zzfrVar8, 19, "currency");
                                        break;
                                    }
                                    zzay().zzl().zza("Value must be specified with a numeric type.");
                                    zzfrVar8.zzh(i8);
                                    zzab(zzfrVar8, "_c");
                                    zzaa(zzfrVar8, 18, "value");
                                }
                            }
                            if ("_e".equals(zzfrVar8.zzo())) {
                                zzal(this.zzi);
                                if (zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE(), "_fr") != null) {
                                    zzgbVar3 = zzgbVar2;
                                    i12 = i4;
                                    zzfrVar6 = zzfrVar;
                                } else if (zzfrVar != null || Math.abs(zzfrVar.zzc() - zzfrVar8.zzc()) > 1000) {
                                    zzgbVar3 = zzgbVar2;
                                    zzfrVar7 = zzfrVar8;
                                    i12 = i2;
                                    zzfrVar6 = zzfrVar;
                                } else {
                                    com.google.android.gms.internal.measurement.zzfr zzfrVar9 = (com.google.android.gms.internal.measurement.zzfr) zzfrVar.clone();
                                    if (zzaj(zzfrVar8, zzfrVar9)) {
                                        zzgbVar3 = zzgbVar2;
                                        zzgbVar3.zzS(i13, zzfrVar9);
                                        i12 = i4;
                                        zzfrVar4 = null;
                                        zzfrVar6 = null;
                                    } else {
                                        zzgbVar3 = zzgbVar2;
                                        zzfrVar4 = zzfrVar8;
                                        i12 = i2;
                                        zzfrVar6 = zzfrVar;
                                    }
                                    zzfrVar7 = zzfrVar4;
                                }
                            } else {
                                zzgbVar3 = zzgbVar2;
                                if ("_vs".equals(zzfrVar8.zzo())) {
                                    zzal(this.zzi);
                                    if (zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE(), str3) == null) {
                                        if (zzfrVar7 != null || Math.abs(zzfrVar7.zzc() - zzfrVar8.zzc()) > 1000) {
                                            i12 = i4;
                                            zzfrVar6 = zzfrVar8;
                                            i13 = i2;
                                        } else {
                                            com.google.android.gms.internal.measurement.zzfr zzfrVar10 = (com.google.android.gms.internal.measurement.zzfr) zzfrVar7.clone();
                                            if (zzaj(zzfrVar10, zzfrVar8)) {
                                                i5 = i4;
                                                zzgbVar3.zzS(i5, zzfrVar10);
                                                zzfrVar3 = null;
                                                zzfrVar7 = null;
                                            } else {
                                                i5 = i4;
                                                zzfrVar3 = zzfrVar8;
                                                i13 = i2;
                                            }
                                            zzfrVar6 = zzfrVar3;
                                            i12 = i5;
                                        }
                                    }
                                }
                                i12 = i4;
                                zzfrVar6 = zzfrVar;
                            }
                            i6 = i3;
                            zzkwVar2.zzc.set(i6, (com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE());
                            i11 = i2 + 1;
                            zzgbVar3.zzk(zzfrVar8);
                            i14 = i;
                            zzfrVar5 = zzfrVar7;
                        }
                        int i16 = 0;
                        boolean z = false;
                        boolean z2 = false;
                        while (true) {
                            zzgbVar2 = zzgbVar4;
                            if (i16 >= zzfrVar8.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfrVar8.zzn(i16).zzg())) {
                                com.google.android.gms.internal.measurement.zzfv zzfvVar = (com.google.android.gms.internal.measurement.zzfv) zzfrVar8.zzn(i16).zzby();
                                zzfrVar2 = zzfrVar6;
                                zzfvVar.zzi(1L);
                                zzfrVar8.zzk(i16, (com.google.android.gms.internal.measurement.zzfw) zzfvVar.zzaE());
                                z = true;
                            } else {
                                zzfrVar2 = zzfrVar6;
                                if ("_r".equals(zzfrVar8.zzn(i16).zzg())) {
                                    com.google.android.gms.internal.measurement.zzfv zzfvVar2 = (com.google.android.gms.internal.measurement.zzfv) zzfrVar8.zzn(i16).zzby();
                                    zzfvVar2.zzi(1L);
                                    zzfrVar8.zzk(i16, (com.google.android.gms.internal.measurement.zzfw) zzfvVar2.zzaE());
                                    z2 = true;
                                }
                            }
                            i16++;
                            zzgbVar4 = zzgbVar2;
                            zzfrVar6 = zzfrVar2;
                        }
                        zzfrVar = zzfrVar6;
                        if (!z && zZzq) {
                            zzay().zzj().zzb("Marking event as conversion", this.zzn.zzj().zzd(zzfrVar8.zzo()));
                            com.google.android.gms.internal.measurement.zzfv zzfvVarZze = com.google.android.gms.internal.measurement.zzfw.zze();
                            zzfvVarZze.zzj("_c");
                            zzfvVarZze.zzi(1L);
                            zzfrVar8.zze(zzfvVarZze);
                        }
                        if (!z2) {
                            zzay().zzj().zzb("Marking event as real-time", this.zzn.zzj().zzd(zzfrVar8.zzo()));
                            com.google.android.gms.internal.measurement.zzfv zzfvVarZze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                            zzfvVarZze2.zzj("_r");
                            zzfvVarZze2.zzi(1L);
                            zzfrVar8.zze(zzfvVarZze2);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        if (zzamVar3.zzl(zza(), zzkwVar2.zza.zzx(), false, false, false, false, true).zze > zzg().zze(zzkwVar2.zza.zzx(), zzeb.zzn)) {
                            zzab(zzfrVar8, "_r");
                        } else {
                            i = 1;
                        }
                        if (zzlh.zzai(zzfrVar8.zzo()) && zZzq) {
                            zzam zzamVar4 = this.zze;
                            zzal(zzamVar4);
                            if (zzamVar4.zzl(zza(), zzkwVar2.zza.zzx(), false, false, true, false, false).zzc > zzg().zze(zzkwVar2.zza.zzx(), zzeb.zzm)) {
                                zzay().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzeo.zzn(zzkwVar2.zza.zzx()));
                                com.google.android.gms.internal.measurement.zzfv zzfvVar3 = null;
                                boolean z3 = false;
                                int i17 = -1;
                                for (int i18 = 0; i18 < zzfrVar8.zza(); i18++) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVarZzn = zzfrVar8.zzn(i18);
                                    if ("_c".equals(zzfwVarZzn.zzg())) {
                                        zzfvVar3 = (com.google.android.gms.internal.measurement.zzfv) zzfwVarZzn.zzby();
                                        i17 = i18;
                                    } else if ("_err".equals(zzfwVarZzn.zzg())) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    if (zzfvVar3 != null) {
                                        zzfrVar8.zzh(i17);
                                    } else {
                                        zzfvVar3 = null;
                                        if (zzfvVar3 != null) {
                                            com.google.android.gms.internal.measurement.zzfv zzfvVar4 = (com.google.android.gms.internal.measurement.zzfv) zzfvVar3.clone();
                                            zzfvVar4.zzj("_err");
                                            zzfvVar4.zzi(10L);
                                            zzfrVar8.zzk(i17, (com.google.android.gms.internal.measurement.zzfw) zzfvVar4.zzaE());
                                        } else {
                                            zzay().zzd().zzb("Did not find conversion parameter. appId", zzeo.zzn(zzkwVar2.zza.zzx()));
                                        }
                                    }
                                } else if (zzfvVar3 != null) {
                                    com.google.android.gms.internal.measurement.zzfv zzfvVar5 = (com.google.android.gms.internal.measurement.zzfv) zzfvVar3.clone();
                                    zzfvVar5.zzj("_err");
                                    zzfvVar5.zzi(10L);
                                    zzfrVar8.zzk(i17, (com.google.android.gms.internal.measurement.zzfw) zzfvVar5.zzaE());
                                } else {
                                    zzay().zzd().zzb("Did not find conversion parameter. appId", zzeo.zzn(zzkwVar2.zza.zzx()));
                                }
                            }
                        }
                        if (zZzq) {
                            arrayList = new ArrayList(zzfrVar8.zzp());
                            i8 = -1;
                            i9 = -1;
                            while (i7 < arrayList.size()) {
                                if ("value".equals(((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i7)).zzg())) {
                                    i8 = i7;
                                } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i7)).zzg())) {
                                    i9 = i7;
                                }
                            }
                            if (i8 != -1) {
                                if (((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i8)).zzw()) {
                                }
                                if (i9 == -1) {
                                    strZzh = ((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i9)).zzh();
                                    if (strZzh.length() == 3) {
                                        iCharCount = 0;
                                        while (iCharCount < strZzh.length()) {
                                            iCodePointAt = strZzh.codePointAt(iCharCount);
                                            if (Character.isLetter(iCodePointAt)) {
                                                iCharCount += Character.charCount(iCodePointAt);
                                            }
                                        }
                                    }
                                }
                                zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                zzfrVar8.zzh(i8);
                                zzab(zzfrVar8, "_c");
                                zzaa(zzfrVar8, 19, "currency");
                                break;
                            }
                        }
                        if ("_e".equals(zzfrVar8.zzo())) {
                            zzal(this.zzi);
                            if (zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE(), "_fr") != null) {
                                if (zzfrVar != null) {
                                }
                                zzgbVar3 = zzgbVar2;
                                zzfrVar7 = zzfrVar8;
                                i12 = i2;
                                zzfrVar6 = zzfrVar;
                            } else {
                                zzgbVar3 = zzgbVar2;
                                i12 = i4;
                                zzfrVar6 = zzfrVar;
                            }
                        } else {
                            zzgbVar3 = zzgbVar2;
                            if ("_vs".equals(zzfrVar8.zzo())) {
                                zzal(this.zzi);
                                if (zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE(), str3) == null) {
                                    if (zzfrVar7 != null) {
                                        i12 = i4;
                                        zzfrVar6 = zzfrVar8;
                                        i13 = i2;
                                    } else {
                                        i12 = i4;
                                        zzfrVar6 = zzfrVar8;
                                        i13 = i2;
                                    }
                                }
                            }
                            i12 = i4;
                            zzfrVar6 = zzfrVar;
                        }
                        i6 = i3;
                        zzkwVar2.zzc.set(i6, (com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE());
                        i11 = i2 + 1;
                        zzgbVar3.zzk(zzfrVar8);
                        i14 = i;
                        zzfrVar5 = zzfrVar7;
                    }
                    i10 = i6 + 1;
                    zzgbVar4 = zzgbVar3;
                    str4 = str6;
                    str5 = str2;
                }
                String str8 = str4;
                com.google.android.gms.internal.measurement.zzgb zzgbVar5 = zzgbVar4;
                long jLongValue = 0;
                int i19 = i2;
                int i20 = 0;
                while (i20 < i19) {
                    com.google.android.gms.internal.measurement.zzfs zzfsVarZze = zzgbVar5.zze(i20);
                    if ("_e".equals(zzfsVarZze.zzh())) {
                        zzal(this.zzi);
                        if (zzlb.zzB(zzfsVarZze, "_fr") != null) {
                            zzgbVar5.zzA(i20);
                            i19--;
                            i20--;
                        } else {
                            zzal(this.zzi);
                            zzfwVarZzB = zzlb.zzB(zzfsVarZze, "_et");
                            if (zzfwVarZzB == null) {
                                if (zzfwVarZzB.zzw()) {
                                    lValueOf = Long.valueOf(zzfwVarZzB.zzd());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf == null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    } else {
                        zzal(this.zzi);
                        zzfwVarZzB = zzlb.zzB(zzfsVarZze, "_et");
                        if (zzfwVarZzB == null) {
                            if (zzfwVarZzB.zzw()) {
                                lValueOf = Long.valueOf(zzfwVarZzB.zzd());
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf == null) {
                            }
                        }
                    }
                    i20++;
                }
                zzaf(zzgbVar5, jLongValue, false);
                Iterator it = zzgbVar5.zzas().iterator();
                while (it.hasNext()) {
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzfs) it.next()).zzh())) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(zzgbVar5.zzap(), "_se");
                        break;
                    }
                }
                if (zzlb.zza(zzgbVar5, "_sid") >= 0) {
                    zzaf(zzgbVar5, jLongValue, true);
                } else {
                    int iZza = zzlb.zza(zzgbVar5, "_se");
                    if (iZza >= 0) {
                        zzgbVar5.zzB(iZza);
                        zzay().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzeo.zzn(zzkwVar2.zza.zzx()));
                    }
                }
                zzlb zzlbVar = this.zzi;
                zzal(zzlbVar);
                zzlbVar.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                zzfp zzfpVar5 = zzlbVar.zzf.zzc;
                zzal(zzfpVar5);
                if (zzfpVar5.zzn(zzgbVar5.zzap())) {
                    zzam zzamVar6 = zzlbVar.zzf.zze;
                    zzal(zzamVar6);
                    zzh zzhVarZzj = zzamVar6.zzj(zzgbVar5.zzap());
                    if (zzhVarZzj != null && zzhVarZzj.zzah() && zzlbVar.zzs.zzg().zze()) {
                        zzlbVar.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.zzgk zzgkVarZzd = com.google.android.gms.internal.measurement.zzgl.zzd();
                        zzgkVarZzd.zzf(str8);
                        zzgkVarZzd.zzg(zzlbVar.zzs.zzg().zza());
                        zzgkVarZzd.zze(1L);
                        com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) zzgkVarZzd.zzaE();
                        int i21 = 0;
                        while (true) {
                            if (i21 >= zzgbVar5.zzb()) {
                                zzgbVar5.zzm(zzglVar);
                                break;
                            }
                            if (str8.equals(zzgbVar5.zzao(i21).zzf())) {
                                zzgbVar5.zzam(i21, zzglVar);
                                break;
                            }
                            i21++;
                        }
                    }
                }
                zzgbVar5.zzai(Long.MAX_VALUE);
                zzgbVar5.zzQ(Long.MIN_VALUE);
                for (int i22 = 0; i22 < zzgbVar5.zza(); i22++) {
                    com.google.android.gms.internal.measurement.zzfs zzfsVarZze2 = zzgbVar5.zze(i22);
                    if (zzfsVarZze2.zzd() < zzgbVar5.zzd()) {
                        zzgbVar5.zzai(zzfsVarZze2.zzd());
                    }
                    if (zzfsVarZze2.zzd() > zzgbVar5.zzc()) {
                        zzgbVar5.zzQ(zzfsVarZze2.zzd());
                    }
                }
                zzgbVar5.zzz();
                zzgbVar5.zzo();
                zzaa zzaaVar = this.zzh;
                zzal(zzaaVar);
                zzgbVar5.zzf(zzaaVar.zza(zzgbVar5.zzap(), zzgbVar5.zzas(), zzgbVar5.zzat(), Long.valueOf(zzgbVar5.zzd()), Long.valueOf(zzgbVar5.zzc())));
                if (zzg().zzw(zzkwVar2.zza.zzx())) {
                    HashMap map = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom secureRandomZzG = zzv().zzG();
                    int i23 = 0;
                    while (i23 < zzgbVar5.zza()) {
                        com.google.android.gms.internal.measurement.zzfr zzfrVar11 = (com.google.android.gms.internal.measurement.zzfr) zzgbVar5.zze(i23).zzby();
                        if (zzfrVar11.zzo().equals("_ep")) {
                            zzal(this.zzi);
                            String str9 = (String) zzlb.zzC((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE(), "_en");
                            zzas zzasVarZzn = (zzas) map.get(str9);
                            if (zzasVarZzn == null) {
                                zzam zzamVar7 = this.zze;
                                zzal(zzamVar7);
                                zzasVarZzn = zzamVar7.zzn(zzkwVar2.zza.zzx(), (String) Preconditions.checkNotNull(str9));
                                if (zzasVarZzn != null) {
                                    map.put(str9, zzasVarZzn);
                                }
                            }
                            if (zzasVarZzn != null && zzasVarZzn.zzi == null) {
                                Long l = zzasVarZzn.zzj;
                                if (l != null && l.longValue() > 1) {
                                    zzal(this.zzi);
                                    zzlb.zzz(zzfrVar11, "_sr", zzasVarZzn.zzj);
                                }
                                Boolean bool = zzasVarZzn.zzk;
                                if (bool != null && bool.booleanValue()) {
                                    zzal(this.zzi);
                                    zzlb.zzz(zzfrVar11, "_efs", 1L);
                                }
                                arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE());
                            }
                            zzgbVar5.zzS(i23, zzfrVar11);
                        } else {
                            zzfp zzfpVar6 = this.zzc;
                            zzal(zzfpVar6);
                            String strZzx = zzkwVar2.zza.zzx();
                            String strZza = zzfpVar6.zza(strZzx, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strZza)) {
                                j2 = 0;
                            } else {
                                try {
                                    j2 = Long.parseLong(strZza);
                                } catch (NumberFormatException e) {
                                    zzfpVar6.zzs.zzay().zzk().zzc("Unable to parse timezone offset. appId", zzeo.zzn(strZzx), e);
                                    j2 = 0;
                                }
                            }
                            long jZzr = zzv().zzr(zzfrVar11.zzc(), j2);
                            com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE();
                            Long l2 = 1L;
                            long j3 = j2;
                            if (!TextUtils.isEmpty("_dbg")) {
                                Iterator it2 = zzfsVar.zzi().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) it2.next();
                                        Iterator it3 = it2;
                                        if ("_dbg".equals(zzfwVar.zzg())) {
                                            if (l2.equals(Long.valueOf(zzfwVar.zzd()))) {
                                                iZzc = 1;
                                                break;
                                            }
                                        } else {
                                            it2 = it3;
                                        }
                                    }
                                    zzfp zzfpVar7 = this.zzc;
                                    zzal(zzfpVar7);
                                    iZzc = zzfpVar7.zzc(zzkwVar2.zza.zzx(), zzfrVar11.zzo());
                                    break;
                                }
                            }
                            zzfp zzfpVar8 = this.zzc;
                            zzal(zzfpVar8);
                            iZzc = zzfpVar8.zzc(zzkwVar2.zza.zzx(), zzfrVar11.zzo());
                            break;
                            if (iZzc <= 0) {
                                zzay().zzk().zzc("Sample rate must be positive. event, rate", zzfrVar11.zzo(), Integer.valueOf(iZzc));
                                arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE());
                                zzgbVar5.zzS(i23, zzfrVar11);
                            } else {
                                zzas zzasVarZza = (zzas) map.get(zzfrVar11.zzo());
                                if (zzasVarZza == null) {
                                    zzam zzamVar8 = this.zze;
                                    zzal(zzamVar8);
                                    zzasVarZza = zzamVar8.zzn(zzkwVar2.zza.zzx(), zzfrVar11.zzo());
                                    if (zzasVarZza == null) {
                                        zzay().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzkwVar2.zza.zzx(), zzfrVar11.zzo());
                                        zzasVarZza = new zzas(zzkwVar2.zza.zzx(), zzfrVar11.zzo(), 1L, 1L, 1L, zzfrVar11.zzc(), 0L, null, null, null, null);
                                    }
                                }
                                zzal(this.zzi);
                                Long l3 = (Long) zzlb.zzC((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE(), "_eid");
                                Boolean boolValueOf = Boolean.valueOf(l3 != null);
                                if (iZzc == 1) {
                                    arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE());
                                    if (boolValueOf.booleanValue() && (zzasVarZza.zzi != null || zzasVarZza.zzj != null || zzasVarZza.zzk != null)) {
                                        map.put(zzfrVar11.zzo(), zzasVarZza.zza(null, null, null));
                                    }
                                    zzgbVar5.zzS(i23, zzfrVar11);
                                } else {
                                    if (secureRandomZzG.nextInt(iZzc) == 0) {
                                        zzal(this.zzi);
                                        Long lValueOf2 = Long.valueOf(iZzc);
                                        zzlb.zzz(zzfrVar11, "_sr", lValueOf2);
                                        arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE());
                                        if (boolValueOf.booleanValue()) {
                                            zzasVarZza = zzasVarZza.zza(null, lValueOf2, null);
                                        }
                                        map.put(zzfrVar11.zzo(), zzasVarZza.zzb(zzfrVar11.zzc(), jZzr));
                                        zzkwVar2 = zzkwVar2;
                                    } else {
                                        Long l4 = zzasVarZza.zzh;
                                        if ((l4 != null ? l4.longValue() : zzv().zzr(zzfrVar11.zzb(), j3)) != jZzr) {
                                            zzal(this.zzi);
                                            zzlb.zzz(zzfrVar11, "_efs", 1L);
                                            zzal(this.zzi);
                                            Long lValueOf3 = Long.valueOf(iZzc);
                                            zzlb.zzz(zzfrVar11, "_sr", lValueOf3);
                                            arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE());
                                            map.put(zzfrVar11.zzo(), (boolValueOf.booleanValue() ? zzasVarZza.zza(null, lValueOf3, true) : zzasVarZza).zzb(zzfrVar11.zzc(), jZzr));
                                        } else {
                                            zzas zzasVar = zzasVarZza;
                                            if (boolValueOf.booleanValue()) {
                                                map.put(zzfrVar11.zzo(), zzasVar.zza(l3, null, null));
                                            }
                                        }
                                    }
                                    zzgbVar5.zzS(i23, zzfrVar11);
                                }
                                i23++;
                                zzgbVar5 = zzgbVar5;
                                secureRandomZzG = secureRandomZzG;
                                zzkwVar2 = zzkwVar2;
                            }
                        }
                        zzkwVar2 = zzkwVar2;
                        secureRandomZzG = secureRandomZzG;
                        i23 = i23;
                        zzgbVar5 = zzgbVar5;
                        i23++;
                        zzgbVar5 = zzgbVar5;
                        secureRandomZzG = secureRandomZzG;
                        zzkwVar2 = zzkwVar2;
                    }
                    zzgbVar = zzgbVar5;
                    zzkw zzkwVar3 = zzkwVar2;
                    if (arrayList2.size() < zzgbVar.zza()) {
                        zzgbVar.zzr();
                        zzgbVar.zzg(arrayList2);
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzE((zzas) entry.getValue());
                    }
                    zzkwVar = zzkwVar3;
                } else {
                    zzgbVar = zzgbVar5;
                    zzkwVar = zzkwVar2;
                }
                String strZzx2 = zzkwVar.zza.zzx();
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzh zzhVarZzj2 = zzamVar10.zzj(strZzx2);
                if (zzhVarZzj2 == null) {
                    zzay().zzd().zzb("Bundling raw events w/o app info. appId", zzeo.zzn(zzkwVar.zza.zzx()));
                } else if (zzgbVar.zza() > 0) {
                    long jZzn = zzhVarZzj2.zzn();
                    if (jZzn != 0) {
                        zzgbVar.zzab(jZzn);
                    } else {
                        zzgbVar.zzv();
                    }
                    long jZzp = zzhVarZzj2.zzp();
                    if (jZzp != 0) {
                        jZzn = jZzp;
                    }
                    if (jZzn != 0) {
                        zzgbVar.zzac(jZzn);
                    } else {
                        zzgbVar.zzw();
                    }
                    zzhVarZzj2.zzE();
                    zzgbVar.zzI((int) zzhVarZzj2.zzo());
                    zzhVarZzj2.zzab(zzgbVar.zzd());
                    zzhVarZzj2.zzZ(zzgbVar.zzc());
                    String strZzs = zzhVarZzj2.zzs();
                    if (strZzs != null) {
                        zzgbVar.zzW(strZzs);
                    } else {
                        zzgbVar.zzs();
                    }
                    zzam zzamVar11 = this.zze;
                    zzal(zzamVar11);
                    zzamVar11.zzD(zzhVarZzj2);
                }
                if (zzgbVar.zza() > 0) {
                    this.zzn.zzaw();
                    zzfp zzfpVar9 = this.zzc;
                    zzal(zzfpVar9);
                    com.google.android.gms.internal.measurement.zzfe zzfeVarZze = zzfpVar9.zze(zzkwVar.zza.zzx());
                    if (zzfeVarZze != null && zzfeVarZze.zzs()) {
                        zzgbVar.zzK(zzfeVarZze.zzc());
                    } else if (zzkwVar.zza.zzF().isEmpty()) {
                        zzgbVar.zzK(-1L);
                    } else {
                        zzay().zzk().zzb("Did not find measurement config or missing version info. appId", zzeo.zzn(zzkwVar.zza.zzx()));
                    }
                    zzam zzamVar12 = this.zze;
                    zzal(zzamVar12);
                    com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE();
                    zzamVar12.zzg();
                    zzamVar12.zzW();
                    Preconditions.checkNotNull(zzgcVar);
                    Preconditions.checkNotEmpty(zzgcVar.zzx());
                    Preconditions.checkState(zzgcVar.zzbe());
                    zzamVar12.zzz();
                    long jCurrentTimeMillis = zzamVar12.zzs.zzav().currentTimeMillis();
                    long jZzk = zzgcVar.zzk();
                    zzamVar12.zzs.zzf();
                    if (jZzk >= jCurrentTimeMillis - zzag.zzA()) {
                        long jZzk2 = zzgcVar.zzk();
                        zzamVar12.zzs.zzf();
                        if (jZzk2 > zzag.zzA() + jCurrentTimeMillis) {
                            zzamVar12.zzs.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeo.zzn(zzgcVar.zzx()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzgcVar.zzk()));
                        }
                    } else {
                        zzamVar12.zzs.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeo.zzn(zzgcVar.zzx()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzgcVar.zzk()));
                    }
                    byte[] bArrZzbv = zzgcVar.zzbv();
                    try {
                        zzlb zzlbVar2 = zzamVar12.zzf.zzi;
                        zzal(zzlbVar2);
                        byte[] bArrZzy = zzlbVar2.zzy(bArrZzbv);
                        zzamVar12.zzs.zzay().zzj().zzb("Saving bundle, size", Integer.valueOf(bArrZzy.length));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", zzgcVar.zzx());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzgcVar.zzk()));
                        contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzy);
                        contentValues.put("has_realtime", Integer.valueOf(i));
                        if (zzgcVar.zzbk()) {
                            contentValues.put("retry_count", Integer.valueOf(zzgcVar.zze()));
                        }
                        try {
                            if (zzamVar12.zzh().insert("queue", null, contentValues) == -1) {
                                zzamVar12.zzs.zzay().zzd().zzb("Failed to insert bundle (got -1). appId", zzeo.zzn(zzgcVar.zzx()));
                            }
                        } catch (SQLiteException e2) {
                            zzamVar12.zzs.zzay().zzd().zzc("Error storing bundle. appId", zzeo.zzn(zzgcVar.zzx()), e2);
                        }
                    } catch (IOException e3) {
                        zzamVar12.zzs.zzay().zzd().zzc("Data loss. Failed to serialize bundle. appId", zzeo.zzn(zzgcVar.zzx()), e3);
                    }
                }
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                List list2 = zzkwVar.zzb;
                Preconditions.checkNotNull(list2);
                zzamVar13.zzg();
                zzamVar13.zzW();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (int i24 = 0; i24 < list2.size(); i24++) {
                    if (i24 != 0) {
                        sb.append(",");
                    }
                    sb.append(((Long) list2.get(i24)).longValue());
                }
                sb.append(")");
                int iDelete = zzamVar13.zzh().delete("raw_events", sb.toString(), null);
                if (iDelete != list2.size()) {
                    zzamVar13.zzs.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list2.size()));
                }
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                try {
                    zzamVar14.zzh().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strZzx2, strZzx2});
                } catch (SQLiteException e4) {
                    zzamVar14.zzs.zzay().zzd().zzc("Failed to remove unused event metadata. appId", zzeo.zzn(strZzx2), e4);
                }
                zzam zzamVar15 = this.zze;
                zzal(zzamVar15);
                zzamVar15.zzC();
                zzam zzamVar16 = this.zze;
                zzal(zzamVar16);
                zzamVar16.zzx();
                return true;
            }
            zzam zzamVar17 = this.zze;
            zzal(zzamVar17);
            zzamVar17.zzC();
            zzam zzamVar18 = this.zze;
            zzal(zzamVar18);
            zzamVar18.zzx();
            return false;
        } catch (Throwable th) {
            zzam zzamVar19 = this.zze;
            zzal(zzamVar19);
            zzamVar19.zzx();
            throw th;
        }
    }

    private final boolean zzai() {
        zzaz().zzg();
        zzB();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        if (zzamVar.zzF()) {
            return true;
        }
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        return !TextUtils.isEmpty(zzamVar2.zzr());
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfr zzfrVar, com.google.android.gms.internal.measurement.zzfr zzfrVar2) {
        Preconditions.checkArgument("_e".equals(zzfrVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzfwVarZzB = zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE(), "_sc");
        String strZzh = zzfwVarZzB == null ? null : zzfwVarZzB.zzh();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzfwVarZzB2 = zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar2.zzaE(), "_pc");
        String strZzh2 = zzfwVarZzB2 != null ? zzfwVarZzB2.zzh() : null;
        if (strZzh2 == null || !strZzh2.equals(strZzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfrVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzfwVarZzB3 = zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE(), "_et");
        if (zzfwVarZzB3 == null || !zzfwVarZzB3.zzw() || zzfwVarZzB3.zzd() <= 0) {
            return true;
        }
        long jZzd = zzfwVarZzB3.zzd();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzfwVarZzB4 = zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar2.zzaE(), "_et");
        if (zzfwVarZzB4 != null && zzfwVarZzB4.zzd() > 0) {
            jZzd += zzfwVarZzB4.zzd();
        }
        zzal(this.zzi);
        zzlb.zzz(zzfrVar2, "_et", Long.valueOf(jZzd));
        zzal(this.zzi);
        zzlb.zzz(zzfrVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzak(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzkn zzal(zzkn zzknVar) {
        if (zzknVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzknVar.zzY()) {
            return zzknVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(zzknVar.getClass()))));
    }

    public static zzkz zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzkz.class) {
                if (zzb == null) {
                    zzb = new zzkz((zzla) Preconditions.checkNotNull(new zzla(context)), null);
                }
            }
        }
        return zzb;
    }

    static /* bridge */ /* synthetic */ void zzy(zzkz zzkzVar, zzla zzlaVar) {
        zzkzVar.zzaz().zzg();
        zzkzVar.zzm = new zzfg(zzkzVar);
        zzam zzamVar = new zzam(zzkzVar);
        zzamVar.zzX();
        zzkzVar.zze = zzamVar;
        zzkzVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzkzVar.zzc));
        zzju zzjuVar = new zzju(zzkzVar);
        zzjuVar.zzX();
        zzkzVar.zzk = zzjuVar;
        zzaa zzaaVar = new zzaa(zzkzVar);
        zzaaVar.zzX();
        zzkzVar.zzh = zzaaVar;
        zzii zziiVar = new zzii(zzkzVar);
        zziiVar.zzX();
        zzkzVar.zzj = zziiVar;
        zzkl zzklVar = new zzkl(zzkzVar);
        zzklVar.zzX();
        zzkzVar.zzg = zzklVar;
        zzkzVar.zzf = new zzew(zzkzVar);
        if (zzkzVar.zzr != zzkzVar.zzs) {
            zzkzVar.zzay().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzkzVar.zzr), Integer.valueOf(zzkzVar.zzs));
        }
        zzkzVar.zzo = true;
    }

    final void zzA() {
        zzaz().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzZ()) {
            FileChannel fileChannel = this.zzx;
            zzaz().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzay().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i2 = fileChannel.read(byteBufferAllocate);
                    if (i2 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i2 != -1) {
                        zzay().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(i2));
                    }
                } catch (IOException e) {
                    zzay().zzd().zzb("Failed to read from channel", e);
                }
            }
            int iZzi = this.zzn.zzh().zzi();
            zzaz().zzg();
            if (i > iZzi) {
                zzay().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
                return;
            }
            if (i < iZzi) {
                FileChannel fileChannel2 = this.zzx;
                zzaz().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzay().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iZzi);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzay().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzay().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
                        return;
                    } catch (IOException e2) {
                        zzay().zzd().zzb("Failed to write to channel", e2);
                    }
                }
                zzay().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
            }
        }
    }

    final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzC(String str, com.google.android.gms.internal.measurement.zzgb zzgbVar) {
        int iZza;
        int iIndexOf;
        zzow.zzc();
        if (zzg().zzs(str, zzeb.zzam)) {
            zzfp zzfpVar = this.zzc;
            zzal(zzfpVar);
            Set setZzk = zzfpVar.zzk(str);
            if (setZzk != null) {
                zzgbVar.zzi(setZzk);
            }
        }
        if (zzg().zzs(str, zzeb.zzao)) {
            zzfp zzfpVar2 = this.zzc;
            zzal(zzfpVar2);
            if (zzfpVar2.zzv(str)) {
                zzgbVar.zzp();
            }
            zzfp zzfpVar3 = this.zzc;
            zzal(zzfpVar3);
            if (zzfpVar3.zzy(str)) {
                if (zzg().zzs(str, zzeb.zzay)) {
                    String strZzar = zzgbVar.zzar();
                    if (!TextUtils.isEmpty(strZzar) && (iIndexOf = strZzar.indexOf(".")) != -1) {
                        zzgbVar.zzY(strZzar.substring(0, iIndexOf));
                    }
                } else {
                    zzgbVar.zzu();
                }
            }
        }
        if (zzg().zzs(str, zzeb.zzap)) {
            zzfp zzfpVar4 = this.zzc;
            zzal(zzfpVar4);
            if (zzfpVar4.zzz(str) && (iZza = zzlb.zza(zzgbVar, "_id")) != -1) {
                zzgbVar.zzB(iZza);
            }
        }
        if (zzg().zzs(str, zzeb.zzaq)) {
            zzfp zzfpVar5 = this.zzc;
            zzal(zzfpVar5);
            if (zzfpVar5.zzx(str)) {
                zzgbVar.zzq();
            }
        }
        if (zzg().zzs(str, zzeb.zzat)) {
            zzfp zzfpVar6 = this.zzc;
            zzal(zzfpVar6);
            if (zzfpVar6.zzu(str)) {
                zzgbVar.zzn();
                if (zzg().zzs(str, zzeb.zzau)) {
                    zzky zzkyVar = (zzky) this.zzC.get(str);
                    if (zzkyVar == null || zzkyVar.zzb + zzg().zzi(str, zzeb.zzR) < zzav().elapsedRealtime()) {
                        zzkyVar = new zzky(this);
                        this.zzC.put(str, zzkyVar);
                    }
                    zzgbVar.zzR(zzkyVar.zza);
                }
            }
        }
        if (zzg().zzs(str, zzeb.zzav)) {
            zzfp zzfpVar7 = this.zzc;
            zzal(zzfpVar7);
            if (zzfpVar7.zzw(str)) {
                zzgbVar.zzy();
            }
        }
    }

    final void zzD(zzh zzhVar) {
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        zzaz().zzg();
        if (TextUtils.isEmpty(zzhVar.zzy()) && TextUtils.isEmpty(zzhVar.zzr())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzt()), 204, null, null, null);
            return;
        }
        zzko zzkoVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String strZzy = zzhVar.zzy();
        if (TextUtils.isEmpty(strZzy)) {
            strZzy = zzhVar.zzr();
        }
        ArrayMap arrayMap3 = null;
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) zzeb.zzd.zza(null)).encodedAuthority((String) zzeb.zze.zza(null)).path("config/app/".concat(String.valueOf(strZzy))).appendQueryParameter("platform", "android");
        zzkoVar.zzs.zzf().zzh();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(73000L)).appendQueryParameter("runtime_version", "0");
        zzow.zzc();
        if (!zzkoVar.zzs.zzf().zzs(zzhVar.zzt(), zzeb.zzak)) {
            builder.appendQueryParameter("app_instance_id", zzhVar.zzu());
        }
        String string = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzt());
            URL url = new URL(string);
            zzay().zzj().zzb("Fetching remote configuration", str);
            zzfp zzfpVar = this.zzc;
            zzal(zzfpVar);
            com.google.android.gms.internal.measurement.zzfe zzfeVarZze = zzfpVar.zze(str);
            zzfp zzfpVar2 = this.zzc;
            zzal(zzfpVar2);
            String strZzh = zzfpVar2.zzh(str);
            if (zzfeVarZze == null) {
                arrayMap = arrayMap3;
            } else {
                if (TextUtils.isEmpty(strZzh)) {
                    arrayMap2 = null;
                } else {
                    arrayMap2 = new ArrayMap();
                    arrayMap2.put(HttpHeaders.IF_MODIFIED_SINCE, strZzh);
                }
                zzow.zzc();
                if (zzg().zzs(null, zzeb.zzaw)) {
                    zzfp zzfpVar3 = this.zzc;
                    zzal(zzfpVar3);
                    String strZzf = zzfpVar3.zzf(str);
                    if (!TextUtils.isEmpty(strZzf)) {
                        if (arrayMap2 == null) {
                            arrayMap2 = new ArrayMap();
                        }
                        arrayMap3 = arrayMap2;
                        arrayMap3.put(HttpHeaders.IF_NONE_MATCH, strZzf);
                        arrayMap = arrayMap3;
                    }
                }
                arrayMap = arrayMap2;
            }
            this.zzt = true;
            zzeu zzeuVar = this.zzd;
            zzal(zzeuVar);
            zzkr zzkrVar = new zzkr(this);
            zzeuVar.zzg();
            zzeuVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkrVar);
            zzeuVar.zzs.zzaz().zzo(new zzet(zzeuVar, str, url, null, arrayMap, zzkrVar));
        } catch (MalformedURLException unused) {
            zzay().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzeo.zzn(zzhVar.zzt()), string);
        }
    }

    final void zzE(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> listZzt;
        List<zzac> listZzt2;
        List<zzac> listZzt3;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaz().zzg();
        zzB();
        String str2 = zzqVar.zza;
        long j = zzawVar.zzd;
        zzep zzepVarZzb = zzep.zzb(zzawVar);
        zzaz().zzg();
        zzik zzikVar = null;
        if (this.zzD != null && (str = this.zzE) != null && str.equals(str2)) {
            zzikVar = this.zzD;
        }
        zzlh.zzK(zzikVar, zzepVarZzb.zzd, false);
        zzaw zzawVarZza = zzepVarZzb.zza();
        zzal(this.zzi);
        if (zzlb.zzA(zzawVarZza, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list == null) {
                zzawVar2 = zzawVarZza;
            } else if (!list.contains(zzawVarZza.zza)) {
                zzay().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzawVarZza.zza, zzawVarZza.zzc);
                return;
            } else {
                Bundle bundleZzc = zzawVarZza.zzb.zzc();
                bundleZzc.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(zzawVarZza.zza, new zzau(bundleZzc), zzawVarZza.zzc, zzawVarZza.zzd);
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                Preconditions.checkNotEmpty(str2);
                zzamVar2.zzg();
                zzamVar2.zzW();
                if (j < 0) {
                    zzamVar2.zzs.zzay().zzk().zzc("Invalid time querying timed out conditional properties", zzeo.zzn(str2), Long.valueOf(j));
                    listZzt = Collections.emptyList();
                } else {
                    listZzt = zzamVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzacVar : listZzt) {
                    if (zzacVar != null) {
                        zzay().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzaw zzawVar3 = zzacVar.zzg;
                        if (zzawVar3 != null) {
                            zzY(new zzaw(zzawVar3, j), zzqVar);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zza(str2, zzacVar.zzc.zzb);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                Preconditions.checkNotEmpty(str2);
                zzamVar4.zzg();
                zzamVar4.zzW();
                if (j < 0) {
                    zzamVar4.zzs.zzay().zzk().zzc("Invalid time querying expired conditional properties", zzeo.zzn(str2), Long.valueOf(j));
                    listZzt2 = Collections.emptyList();
                } else {
                    listZzt2 = zzamVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzac zzacVar2 : listZzt2) {
                    if (zzacVar2 != null) {
                        zzay().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(str2, zzacVar2.zzc.zzb);
                        zzaw zzawVar4 = zzacVar2.zzk;
                        if (zzawVar4 != null) {
                            arrayList.add(zzawVar4);
                        }
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zza(str2, zzacVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzY(new zzaw((zzaw) it.next(), j), zzqVar);
                }
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                String str3 = zzawVar2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzamVar7.zzg();
                zzamVar7.zzW();
                if (j < 0) {
                    zzamVar7.zzs.zzay().zzk().zzd("Invalid time querying triggered conditional properties", zzeo.zzn(str2), zzamVar7.zzs.zzj().zzd(str3), Long.valueOf(j));
                    listZzt3 = Collections.emptyList();
                } else {
                    listZzt3 = zzamVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzac zzacVar3 : listZzt3) {
                    if (zzacVar3 != null) {
                        zzlc zzlcVar = zzacVar3.zzc;
                        zzle zzleVar = new zzle((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzlcVar.zzb, j, Preconditions.checkNotNull(zzlcVar.zza()));
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        if (zzamVar8.zzL(zzleVar)) {
                            zzay().zzj().zzd("User property triggered", zzacVar3.zza, this.zzn.zzj().zzf(zzleVar.zzc), zzleVar.zze);
                        } else {
                            zzay().zzd().zzd("Too many active user properties, ignoring", zzeo.zzn(zzacVar3.zza), this.zzn.zzj().zzf(zzleVar.zzc), zzleVar.zze);
                        }
                        zzaw zzawVar5 = zzacVar3.zzi;
                        if (zzawVar5 != null) {
                            arrayList2.add(zzawVar5);
                        }
                        zzacVar3.zzc = new zzlc(zzleVar);
                        zzacVar3.zze = true;
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzK(zzacVar3);
                    }
                }
                zzY(zzawVar2, zzqVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzY(new zzaw((zzaw) it2.next(), j), zzqVar);
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzC();
            } finally {
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            }
        }
    }

    final void zzF(zzaw zzawVar, String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(str);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzad = zzad(zzhVarZzj);
        if (boolZzad == null) {
            if (!"_ui".equals(zzawVar.zza)) {
                zzay().zzk().zzb("Could not find package. appId", zzeo.zzn(str));
            }
        } else if (!boolZzad.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping event. appId", zzeo.zzn(str));
            return;
        }
        String strZzy = zzhVarZzj.zzy();
        String strZzw = zzhVarZzj.zzw();
        long jZzb = zzhVarZzj.zzb();
        String strZzv = zzhVarZzj.zzv();
        long jZzm = zzhVarZzj.zzm();
        long jZzj = zzhVarZzj.zzj();
        boolean zZzai = zzhVarZzj.zzai();
        String strZzx = zzhVarZzj.zzx();
        zzhVarZzj.zza();
        zzG(zzawVar, new zzq(str, strZzy, strZzw, jZzb, strZzv, jZzm, jZzj, (String) null, zZzai, false, strZzx, 0L, 0L, 0, zzhVarZzj.zzah(), false, zzhVarZzj.zzr(), zzhVarZzj.zzq(), zzhVarZzj.zzk(), zzhVarZzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null));
    }

    final void zzG(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzep zzepVarZzb = zzep.zzb(zzawVar);
        zzlh zzlhVarZzv = zzv();
        Bundle bundle = zzepVarZzb.zzd;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzlhVarZzv.zzL(bundle, zzamVar.zzi(zzqVar.zza));
        zzv().zzM(zzepVarZzb, zzg().zzd(zzqVar.zza));
        zzaw zzawVarZza = zzepVarZzb.zza();
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzawVarZza.zza) && "referrer API v2".equals(zzawVarZza.zzb.zzg("_cis"))) {
            String strZzg = zzawVarZza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(strZzg)) {
                zzW(new zzlc("_lgclid", zzawVarZza.zzd, strZzg, DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
            }
        }
        zzE(zzawVarZza, zzqVar);
    }

    final void zzH() {
        this.zzs++;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r10
  0x0047: PHI (r10v11 int) = (r10v2 int), (r10v0 int) binds: [B:12:0x0043, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:63:0x0152 A[Catch: all -> 0x0197, TryCatch #1 {all -> 0x0197, blocks: (B:6:0x002c, B:16:0x004a, B:71:0x0189, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:36:0x00d8, B:39:0x00e9, B:42:0x00f5, B:44:0x00fb, B:49:0x0108, B:61:0x013d, B:63:0x0152, B:65:0x0171, B:67:0x017c, B:69:0x0182, B:70:0x0186, B:64:0x0160, B:55:0x0121, B:57:0x012c), top: B:81:0x002c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0160 A[Catch: all -> 0x0197, TryCatch #1 {all -> 0x0197, blocks: (B:6:0x002c, B:16:0x004a, B:71:0x0189, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:36:0x00d8, B:39:0x00e9, B:42:0x00f5, B:44:0x00fb, B:49:0x0108, B:61:0x013d, B:63:0x0152, B:65:0x0171, B:67:0x017c, B:69:0x0182, B:70:0x0186, B:64:0x0160, B:55:0x0121, B:57:0x012c), top: B:81:0x002c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0186 A[Catch: all -> 0x0197, TryCatch #1 {all -> 0x0197, blocks: (B:6:0x002c, B:16:0x004a, B:71:0x0189, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:36:0x00d8, B:39:0x00e9, B:42:0x00f5, B:44:0x00fb, B:49:0x0108, B:61:0x013d, B:63:0x0152, B:65:0x0171, B:67:0x017c, B:69:0x0182, B:70:0x0186, B:64:0x0160, B:55:0x0121, B:57:0x012c), top: B:81:0x002c, outer: #0 }] */
    final void zzI(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        String str2;
        zzam zzamVar;
        zzeu zzeuVar;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzt = false;
                zzae();
                throw th2;
            }
        }
        zzem zzemVarZzj = zzay().zzj();
        Integer numValueOf = Integer.valueOf(bArr.length);
        zzemVarZzj.zzb("onConfigFetched. Response size", numValueOf);
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        zzamVar2.zzw();
        try {
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzh zzhVarZzj = zzamVar3.zzj(str);
            if (i == 200 || i == 204) {
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i == 304) {
                i = 304;
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (zzhVarZzj == null) {
                zzay().zzk().zzb("App does not exist in onConfigFetched. appId", zzeo.zzn(str));
            } else {
                if (z || i == 404) {
                    List list = map != null ? (List) map.get(HttpHeaders.LAST_MODIFIED) : null;
                    String str3 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                    zzow.zzc();
                    if (zzg().zzs(null, zzeb.zzaw)) {
                        List list2 = map != null ? (List) map.get(HttpHeaders.ETAG) : null;
                        if (list2 == null || list2.isEmpty()) {
                            str2 = null;
                        } else {
                            str2 = (String) list2.get(0);
                        }
                    } else {
                        str2 = null;
                    }
                    if (i == 404 || i == 304) {
                        zzfp zzfpVar = this.zzc;
                        zzal(zzfpVar);
                        if (zzfpVar.zze(str) == null) {
                            zzfp zzfpVar2 = this.zzc;
                            zzal(zzfpVar2);
                            if (!zzfpVar2.zzt(str, null, null, null)) {
                                zzamVar = this.zze;
                                zzal(zzamVar);
                            }
                        }
                        zzhVarZzj.zzL(zzav().currentTimeMillis());
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzD(zzhVarZzj);
                        if (i == 404) {
                            zzay().zzl().zzb("Config not found. Using empty config. appId", str);
                        } else {
                            zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), numValueOf);
                        }
                        zzeuVar = this.zzd;
                        zzal(zzeuVar);
                        if (zzeuVar.zza() || !zzai()) {
                            zzag();
                        } else {
                            zzX();
                        }
                    } else {
                        zzfp zzfpVar3 = this.zzc;
                        zzal(zzfpVar3);
                        if (zzfpVar3.zzt(str, bArr, str3, str2)) {
                            zzhVarZzj.zzL(zzav().currentTimeMillis());
                            zzam zzamVar5 = this.zze;
                            zzal(zzamVar5);
                            zzamVar5.zzD(zzhVarZzj);
                            if (i == 404) {
                                zzay().zzl().zzb("Config not found. Using empty config. appId", str);
                            } else {
                                zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), numValueOf);
                            }
                            zzeuVar = this.zzd;
                            zzal(zzeuVar);
                            if (zzeuVar.zza()) {
                                zzag();
                            } else {
                                zzag();
                            }
                        } else {
                            zzamVar = this.zze;
                            zzal(zzamVar);
                        }
                    }
                    zzamVar.zzx();
                    this.zzt = false;
                    zzae();
                }
                zzhVarZzj.zzU(zzav().currentTimeMillis());
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzD(zzhVarZzj);
                zzay().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i), th);
                zzfp zzfpVar4 = this.zzc;
                zzal(zzfpVar4);
                zzfpVar4.zzl(str);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i == 503 || i == 429) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzag();
            }
            zzam zzamVar7 = this.zze;
            zzal(zzamVar7);
            zzamVar7.zzC();
            zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzx();
            this.zzt = false;
            zzae();
        } catch (Throwable th3) {
            zzam zzamVar8 = this.zze;
            zzal(zzamVar8);
            zzamVar8.zzx();
            throw th3;
        }
    }

    final void zzJ(boolean z) {
        zzag();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0069 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #3 {all -> 0x00ed, blocks: (B:13:0x005f, B:14:0x0063, B:16:0x0069, B:17:0x006f, B:18:0x008b, B:21:0x0096, B:22:0x009d, B:24:0x009f, B:25:0x00ae, B:27:0x00b0, B:29:0x00b4, B:32:0x00bb, B:33:0x00bc), top: B:62:0x005f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3 A[Catch: SQLiteException -> 0x00f7, all -> 0x016b, TryCatch #0 {SQLiteException -> 0x00f7, blocks: (B:12:0x0026, B:34:0x00c4, B:36:0x00d9, B:38:0x00df, B:40:0x00ea, B:39:0x00e3, B:42:0x00ee, B:43:0x00f6), top: B:58:0x0026, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0123 A[Catch: all -> 0x016b, PHI: r9
  0x0123: PHI (r9v18 int) = (r9v2 int), (r9v0 int) binds: [B:11:0x0024, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x016b, blocks: (B:4:0x000d, B:5:0x000f, B:46:0x0123, B:51:0x015a, B:50:0x014b, B:12:0x0026, B:34:0x00c4, B:36:0x00d9, B:38:0x00df, B:40:0x00ea, B:39:0x00e3, B:42:0x00ee, B:43:0x00f6, B:45:0x00f8), top: B:61:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0147  */
    /* JADX WARN: Code duplicated, block: B:50:0x014b A[Catch: all -> 0x016b, TryCatch #2 {all -> 0x016b, blocks: (B:4:0x000d, B:5:0x000f, B:46:0x0123, B:51:0x015a, B:50:0x014b, B:12:0x0026, B:34:0x00c4, B:36:0x00d9, B:38:0x00df, B:40:0x00ea, B:39:0x00e3, B:42:0x00ee, B:43:0x00f6, B:45:0x00f8), top: B:61:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0095 A[SYNTHETIC] */
    final void zzK(int i, Throwable th, byte[] bArr, String str) {
        zzeu zzeuVar;
        zzam zzamVar;
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzu = false;
                zzae();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i == 200) {
            if (th == null) {
                try {
                    this.zzk.zzc.zzb(zzav().currentTimeMillis());
                    this.zzk.zzd.zzb(0L);
                    zzag();
                    zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzw();
                    try {
                        for (Long l : list) {
                            try {
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                jLongValue = l.longValue();
                                zzamVar.zzg();
                                zzamVar.zzW();
                                try {
                                    if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e) {
                                    zzamVar.zzs.zzay().zzd().zzb("Failed to delete a bundle in a queue table", e);
                                    throw e;
                                }
                            } catch (SQLiteException e2) {
                                List list2 = this.zzz;
                                if (list2 == null || !list2.contains(l)) {
                                    throw e2;
                                }
                            }
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zzC();
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzx();
                        this.zzz = null;
                        zzeuVar = this.zzd;
                        zzal(zzeuVar);
                        if (zzeuVar.zza() || !zzai()) {
                            this.zzA = -1L;
                            zzag();
                        } else {
                            zzX();
                        }
                        this.zza = 0L;
                    } catch (Throwable th3) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzx();
                        throw th3;
                    }
                } catch (SQLiteException e3) {
                    zzay().zzd().zzb("Database error while trying to delete uploaded bundles", e3);
                    this.zza = zzav().elapsedRealtime();
                    zzay().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
                }
            } else {
                zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i != 503 || i == 429) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzy(list);
                zzag();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                this.zzk.zzc.zzb(zzav().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                zzamVar7.zzw();
                while (r9.hasNext()) {
                    zzamVar = this.zze;
                    zzal(zzamVar);
                    jLongValue = l.longValue();
                    zzamVar.zzg();
                    zzamVar.zzW();
                    if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzC();
                zzam zzamVar9 = this.zze;
                zzal(zzamVar9);
                zzamVar9.zzx();
                this.zzz = null;
                zzeuVar = this.zzd;
                zzal(zzeuVar);
                if (zzeuVar.zza()) {
                    this.zzA = -1L;
                    zzag();
                } else {
                    this.zzA = -1L;
                    zzag();
                }
                this.zza = 0L;
            } else {
                zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i != 503) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                } else {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzy(list);
                zzag();
            }
        } else {
            zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzd.zzb(zzav().currentTimeMillis());
            if (i != 503) {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            } else {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            }
            zzam zzamVar11 = this.zze;
            zzal(zzamVar11);
            zzamVar11.zzy(list);
            zzag();
        }
        this.zzu = false;
        zzae();
    }

    final void zzL(zzq zzqVar) {
        String str;
        String str2;
        String str3;
        zzas zzasVarZzn;
        boolean z;
        int i;
        PackageInfo packageInfo;
        int i2;
        int i3;
        String str4;
        ApplicationInfo applicationInfo;
        boolean z2;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (zzak(zzqVar)) {
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzh zzhVarZzj = zzamVar.zzj(zzqVar.zza);
            if (zzhVarZzj != null && TextUtils.isEmpty(zzhVarZzj.zzy()) && !TextUtils.isEmpty(zzqVar.zzb)) {
                zzhVarZzj.zzL(0L);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzamVar2.zzD(zzhVarZzj);
                zzfp zzfpVar = this.zzc;
                zzal(zzfpVar);
                zzfpVar.zzm(zzqVar.zza);
            }
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            long jCurrentTimeMillis = zzqVar.zzm;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = zzav().currentTimeMillis();
            }
            this.zzn.zzg().zzd();
            int i4 = zzqVar.zzn;
            if (i4 != 0 && i4 != 1) {
                zzay().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzeo.zzn(zzqVar.zza), Integer.valueOf(i4));
                i4 = 0;
            }
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzle zzleVarZzp = zzamVar4.zzp(zzqVar.zza, "_npa");
                if (zzleVarZzp != null && !DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(zzleVarZzp.zzb)) {
                    str = "_sysu";
                    str2 = "_sys";
                } else if (zzqVar.zzr != null) {
                    str = "_sysu";
                    str2 = "_sys";
                    zzlc zzlcVar = new zzlc("_npa", jCurrentTimeMillis, Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                    if (zzleVarZzp == null || !zzleVarZzp.zze.equals(zzlcVar.zzd)) {
                        zzW(zzlcVar, zzqVar);
                    }
                } else {
                    str = "_sysu";
                    str2 = "_sys";
                    if (zzleVarZzp != null) {
                        zzP(new zzlc("_npa", jCurrentTimeMillis, null, DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
                    }
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzh zzhVarZzj2 = zzamVar5.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                if (zzhVarZzj2 == null || !zzv().zzam(zzqVar.zzb, zzhVarZzj2.zzy(), zzqVar.zzq, zzhVarZzj2.zzr())) {
                    str3 = "_pfo";
                } else {
                    zzay().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzeo.zzn(zzhVarZzj2.zzt()));
                    zzam zzamVar6 = this.zze;
                    zzal(zzamVar6);
                    String strZzt = zzhVarZzj2.zzt();
                    zzamVar6.zzW();
                    zzamVar6.zzg();
                    Preconditions.checkNotEmpty(strZzt);
                    try {
                        SQLiteDatabase sQLiteDatabaseZzh = zzamVar6.zzh();
                        String[] strArr = {strZzt};
                        int iDelete = sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("consent_settings", "app_id=?", strArr);
                        zzoh.zzc();
                        str3 = "_pfo";
                        try {
                            if (zzamVar6.zzs.zzf().zzs(null, zzeb.zzaB)) {
                                iDelete += sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr);
                            }
                            if (iDelete > 0) {
                                zzamVar6.zzs.zzay().zzj().zzc("Deleted application data. app, records", strZzt, Integer.valueOf(iDelete));
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            zzamVar6.zzs.zzay().zzd().zzc("Error deleting application data. appId, error", zzeo.zzn(strZzt), e);
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        str3 = "_pfo";
                    }
                    zzhVarZzj2 = null;
                }
                if (zzhVarZzj2 != null) {
                    boolean z3 = (zzhVarZzj2.zzb() == -2147483648L || zzhVarZzj2.zzb() == zzqVar.zzj) ? false : true;
                    String strZzw = zzhVarZzj2.zzw();
                    if (z3 | ((zzhVarZzj2.zzb() != -2147483648L || strZzw == null || strZzw.equals(zzqVar.zzc)) ? false : true)) {
                        Bundle bundle = new Bundle();
                        bundle.putString("_pv", strZzw);
                        zzE(new zzaw("_au", new zzau(bundle), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, jCurrentTimeMillis), zzqVar);
                    }
                }
                zzd(zzqVar);
                if (i4 == 0) {
                    zzam zzamVar7 = this.zze;
                    zzal(zzamVar7);
                    zzasVarZzn = zzamVar7.zzn(zzqVar.zza, "_f");
                    z = false;
                } else {
                    zzam zzamVar8 = this.zze;
                    zzal(zzamVar8);
                    zzasVarZzn = zzamVar8.zzn(zzqVar.zza, "_v");
                    z = true;
                }
                if (zzasVarZzn == null) {
                    long j = ((jCurrentTimeMillis / 3600000) + 1) * 3600000;
                    if (z) {
                        zzW(new zzlc("_fvt", jCurrentTimeMillis, Long.valueOf(j), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
                        zzaz().zzg();
                        zzB();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("_c", 1L);
                        bundle2.putLong("_r", 1L);
                        bundle2.putLong("_et", 1L);
                        if (zzqVar.zzp) {
                            bundle2.putLong("_dac", 1L);
                        }
                        zzG(new zzaw("_v", new zzau(bundle2), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, jCurrentTimeMillis), zzqVar);
                    } else {
                        zzW(new zzlc("_fot", jCurrentTimeMillis, Long.valueOf(j), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
                        zzaz().zzg();
                        zzfg zzfgVar = (zzfg) Preconditions.checkNotNull(this.zzm);
                        String str5 = zzqVar.zza;
                        if (str5 == null || str5.isEmpty()) {
                            i = 0;
                            zzfgVar.zza.zzay().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            zzfgVar.zza.zzaz().zzg();
                            if (zzfgVar.zza()) {
                                zzff zzffVar = new zzff(zzfgVar, str5);
                                zzfgVar.zza.zzaz().zzg();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = zzfgVar.zza.zzau().getPackageManager();
                                if (packageManager == null) {
                                    zzfgVar.zza.zzay().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    i = 0;
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        zzfgVar.zza.zzay().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        ResolveInfo resolveInfo = listQueryIntentServices.get(0);
                                        if (resolveInfo.serviceInfo != null) {
                                            String str6 = resolveInfo.serviceInfo.packageName;
                                            if (resolveInfo.serviceInfo.name != null && "com.android.vending".equals(str6) && zzfgVar.zza()) {
                                                try {
                                                    try {
                                                        zzfgVar.zza.zzay().zzj().zzb("Install Referrer Service is", true != ConnectionTracker.getInstance().bindService(zzfgVar.zza.zzau(), new Intent(intent), zzffVar, 1) ? "not available" : "available");
                                                    } catch (RuntimeException e3) {
                                                        e = e3;
                                                        zzfgVar.zza.zzay().zzd().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                    }
                                                } catch (RuntimeException e4) {
                                                    e = e4;
                                                }
                                            } else {
                                                zzfgVar.zza.zzay().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                }
                            } else {
                                zzfgVar.zza.zzay().zzi().zza("Install Referrer Reporter is not available");
                            }
                            i = 0;
                        }
                        zzaz().zzg();
                        zzB();
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("_c", 1L);
                        bundle3.putLong("_r", 1L);
                        bundle3.putLong("_uwa", 0L);
                        String str7 = str3;
                        bundle3.putLong(str7, 0L);
                        String str8 = str2;
                        bundle3.putLong(str8, 0L);
                        String str9 = str;
                        bundle3.putLong(str9, 0L);
                        bundle3.putLong("_et", 1L);
                        if (zzqVar.zzp) {
                            bundle3.putLong("_dac", 1L);
                        }
                        String str10 = (String) Preconditions.checkNotNull(zzqVar.zza);
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        Preconditions.checkNotEmpty(str10);
                        zzamVar9.zzg();
                        zzamVar9.zzW();
                        long jZzc = zzamVar9.zzc(str10, "first_open_count");
                        if (this.zzn.zzau().getPackageManager() == null) {
                            zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeo.zzn(str10));
                        } else {
                            try {
                                packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str10, i);
                            } catch (PackageManager.NameNotFoundException e5) {
                                zzay().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzeo.zzn(str10), e5);
                                packageInfo = null;
                            }
                            if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                                i2 = 1;
                                i3 = 0;
                            } else {
                                if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                    if (!zzg().zzs(null, zzeb.zzab)) {
                                        bundle3.putLong("_uwa", 1L);
                                    } else if (jZzc == 0) {
                                        bundle3.putLong("_uwa", 1L);
                                        jZzc = 0;
                                    }
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                i2 = 1;
                                i3 = 0;
                                zzW(new zzlc("_fi", jCurrentTimeMillis, Long.valueOf(true != z2 ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
                            }
                            try {
                                str4 = str10;
                                try {
                                    applicationInfo = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str4, i3);
                                } catch (PackageManager.NameNotFoundException e6) {
                                    e = e6;
                                    zzay().zzd().zzc("Application info is null, first open report might be inaccurate. appId", zzeo.zzn(str4), e);
                                    applicationInfo = null;
                                }
                            } catch (PackageManager.NameNotFoundException e7) {
                                e = e7;
                                str4 = str10;
                            }
                            if (applicationInfo != null) {
                                if ((i2 & applicationInfo.flags) != 0) {
                                    bundle3.putLong(str8, 1L);
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    bundle3.putLong(str9, 1L);
                                }
                            }
                        }
                        if (jZzc >= 0) {
                            bundle3.putLong(str7, jZzc);
                        }
                        zzG(new zzaw("_f", new zzau(bundle3), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, jCurrentTimeMillis), zzqVar);
                    }
                } else if (zzqVar.zzi) {
                    zzG(new zzaw("_cd", new zzau(new Bundle()), DebugKt.DEBUG_PROPERTY_VALUE_AUTO, jCurrentTimeMillis), zzqVar);
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzC();
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            } catch (Throwable th) {
                zzam zzamVar12 = this.zze;
                zzal(zzamVar12);
                zzamVar12.zzx();
                throw th;
            }
        }
    }

    final void zzM() {
        this.zzr++;
    }

    final void zzN(zzac zzacVar) {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzO(zzacVar, zzqVarZzac);
        }
    }

    final void zzO(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzacVarZzk = zzamVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzacVarZzk != null) {
                    zzay().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzamVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzacVarZzk.zze) {
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzaw zzawVar = zzacVar.zzk;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.zzb;
                        zzY((zzaw) Preconditions.checkNotNull(zzv().zzz(str, ((zzaw) Preconditions.checkNotNull(zzacVar.zzk)).zza, zzauVar != null ? zzauVar.zzc() : null, zzacVarZzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzay().zzk().zzc("Conditional user property doesn't exist", zzeo.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    final void zzP(zzlc zzlcVar, zzq zzqVar) {
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            if ("_npa".equals(zzlcVar.zzb) && zzqVar.zzr != null) {
                zzay().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzW(new zzlc("_npa", zzav().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), DebugKt.DEBUG_PROPERTY_VALUE_AUTO), zzqVar);
                return;
            }
            zzay().zzc().zzb("Removing user property", this.zzn.zzj().zzf(zzlcVar.zzb));
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                if ("_id".equals(zzlcVar.zzb)) {
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), zzlcVar.zzb);
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzay().zzc().zzb("User property removed", this.zzn.zzj().zzf(zzlcVar.zzb));
            } finally {
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
            }
        }
    }

    final void zzQ(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzamVar.zzg();
        zzamVar.zzW();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzamVar.zzh();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                zzamVar.zzs.zzay().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            zzamVar.zzs.zzay().zzd().zzc("Error resetting analytics data. appId, error", zzeo.zzn(str), e);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    public final void zzR(String str, zzik zzikVar) {
        zzaz().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zzikVar != null) {
            this.zzE = str;
            this.zzD = zzikVar;
        }
    }

    protected final void zzS() {
        zzaz().zzg();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzag();
    }

    final void zzT(zzac zzacVar) {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzU(zzacVar, zzqVarZzac);
        }
    }

    final void zzU(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.zze = false;
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzacVarZzk = zzamVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzacVarZzk != null && !zzacVarZzk.zzb.equals(zzacVar2.zzb)) {
                    zzay().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzacVarZzk.zzb);
                }
                if (zzacVarZzk != null && zzacVarZzk.zze) {
                    zzacVar2.zzb = zzacVarZzk.zzb;
                    zzacVar2.zzd = zzacVarZzk.zzd;
                    zzacVar2.zzh = zzacVarZzk.zzh;
                    zzacVar2.zzf = zzacVarZzk.zzf;
                    zzacVar2.zzi = zzacVarZzk.zzi;
                    zzacVar2.zze = true;
                    zzlc zzlcVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlc(zzlcVar.zzb, zzacVarZzk.zzc.zzc, zzlcVar.zza(), zzacVarZzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzlc zzlcVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlc(zzlcVar2.zzb, zzacVar2.zzd, zzlcVar2.zza(), zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z = true;
                }
                if (zzacVar2.zze) {
                    zzlc zzlcVar3 = zzacVar2.zzc;
                    zzle zzleVar = new zzle((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzlcVar3.zzb, zzlcVar3.zzc, Preconditions.checkNotNull(zzlcVar3.zza()));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzL(zzleVar)) {
                        zzay().zzc().zzd("User property updated immediately", zzacVar2.zza, this.zzn.zzj().zzf(zzleVar.zzc), zzleVar.zze);
                    } else {
                        zzay().zzd().zzd("(2)Too many active user properties, ignoring", zzeo.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzleVar.zzc), zzleVar.zze);
                    }
                    if (z && zzacVar2.zzi != null) {
                        zzY(new zzaw(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                if (zzamVar4.zzK(zzacVar2)) {
                    zzay().zzc().zzd("Conditional property added", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                } else {
                    zzay().zzd().zzd("Too many conditional properties, ignoring", zzeo.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    final void zzV(String str, zzai zzaiVar) {
        zzaz().zzg();
        zzB();
        this.zzB.put(str, zzaiVar);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaiVar);
        zzamVar.zzg();
        zzamVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzaiVar.zzh());
        try {
            if (zzamVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzamVar.zzs.zzay().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzeo.zzn(str));
            }
        } catch (SQLiteException e) {
            zzamVar.zzs.zzay().zzd().zzc("Error storing consent setting. appId, error", zzeo.zzn(str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    final void zzW(zzlc zzlcVar, zzq zzqVar) {
        zzas zzasVarZzn;
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            int iZzl = zzv().zzl(zzlcVar.zzb);
            if (iZzl != 0) {
                zzlh zzlhVarZzv = zzv();
                String str = zzlcVar.zzb;
                zzg();
                String strZzD = zzlhVarZzv.zzD(str, 24, true);
                String str2 = zzlcVar.zzb;
                zzv().zzN(this.zzF, zzqVar.zza, iZzl, "_ev", strZzD, str2 != null ? str2.length() : 0);
                return;
            }
            int iZzd = zzv().zzd(zzlcVar.zzb, zzlcVar.zza());
            if (iZzd != 0) {
                zzlh zzlhVarZzv2 = zzv();
                String str3 = zzlcVar.zzb;
                zzg();
                String strZzD2 = zzlhVarZzv2.zzD(str3, 24, true);
                Object objZza = zzlcVar.zza();
                zzv().zzN(this.zzF, zzqVar.zza, iZzd, "_ev", strZzD2, (objZza == null || !((objZza instanceof String) || (objZza instanceof CharSequence))) ? 0 : objZza.toString().length());
                return;
            }
            Object objZzB = zzv().zzB(zzlcVar.zzb, zzlcVar.zza());
            if (objZzB == null) {
                return;
            }
            if ("_sid".equals(zzlcVar.zzb)) {
                long j = zzlcVar.zzc;
                String str4 = zzlcVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
                zzam zzamVar = this.zze;
                zzal(zzamVar);
                zzle zzleVarZzp = zzamVar.zzp(str5, "_sno");
                if (zzleVarZzp != null) {
                    Object obj = zzleVarZzp.zze;
                    if (obj instanceof Long) {
                        jLongValue = ((Long) obj).longValue();
                    } else {
                        if (zzleVarZzp != null) {
                            zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzleVarZzp.zze);
                        }
                        zzam zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        zzasVarZzn = zzamVar2.zzn(str5, "_s");
                        if (zzasVarZzn != null) {
                            jLongValue = zzasVarZzn.zzc;
                            zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                        } else {
                            jLongValue = 0;
                        }
                    }
                } else {
                    if (zzleVarZzp != null) {
                        zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzleVarZzp.zze);
                    }
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzasVarZzn = zzamVar3.zzn(str5, "_s");
                    if (zzasVarZzn != null) {
                        jLongValue = zzasVarZzn.zzc;
                        zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                    } else {
                        jLongValue = 0;
                    }
                }
                zzW(new zzlc("_sno", j, Long.valueOf(jLongValue + 1), str4), zzqVar);
            }
            zzle zzleVar = new zzle((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzlcVar.zzf), zzlcVar.zzb, zzlcVar.zzc, objZzB);
            zzay().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzleVar.zzc), objZzB);
            zzam zzamVar4 = this.zze;
            zzal(zzamVar4);
            zzamVar4.zzw();
            try {
                if ("_id".equals(zzleVar.zzc)) {
                    zzam zzamVar5 = this.zze;
                    zzal(zzamVar5);
                    zzle zzleVarZzp2 = zzamVar5.zzp(zzqVar.zza, "_id");
                    if (zzleVarZzp2 != null && !zzleVar.zze.equals(zzleVarZzp2.zze)) {
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zzA(zzqVar.zza, "_lair");
                    }
                }
                zzd(zzqVar);
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                boolean zZzL = zzamVar7.zzL(zzleVar);
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzC();
                if (!zZzL) {
                    zzay().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzleVar.zzc), zzleVar.zze);
                    zzv().zzN(this.zzF, zzqVar.zza, 9, null, null, 0);
                }
            } finally {
                zzam zzamVar9 = this.zze;
                zzal(zzamVar9);
                zzamVar9.zzx();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0232  */
    /* JADX WARN: Code duplicated, block: B:118:0x026a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0277 A[Catch: all -> 0x059d, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02ac A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x02b8 A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02c2 A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x02de  */
    /* JADX WARN: Code duplicated, block: B:150:0x02e5 A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x02fa A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0328 A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0336  */
    /* JADX WARN: Code duplicated, block: B:165:0x035c A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0396 A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x039b A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x03a3 A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x03ab A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x03ba A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x03e9 A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:185:0x041d A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x042e A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0463 A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x046d A[Catch: all -> 0x059d, TRY_LEAVE, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0488 A[Catch: MalformedURLException -> 0x04f5, all -> 0x059d, TryCatch #15 {MalformedURLException -> 0x04f5, blocks: (B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496), top: B:258:0x0476, outer: #19 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x0496 A[Catch: MalformedURLException -> 0x04f5, all -> 0x059d, TryCatch #15 {MalformedURLException -> 0x04f5, blocks: (B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496), top: B:258:0x0476, outer: #19 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x04a8 A[Catch: MalformedURLException -> 0x04f5, all -> 0x059d, TryCatch #15 {MalformedURLException -> 0x04f5, blocks: (B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496), top: B:258:0x0476, outer: #19 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x050c A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0582 A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x058d A[Catch: all -> 0x059d, TRY_LEAVE, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:270:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:? A[LOOP:1: B:140:0x02bc->B:272:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0275 A[ADDED_TO_REGION, EDGE_INSN: B:282:0x0275->B:121:0x0275 BREAK  A[LOOP:4: B:80:0x01b1->B:120:0x026d], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x01db A[EDGE_INSN: B:284:0x01db->B:86:0x01db BREAK  A[LOOP:5: B:245:0x01d5->B:103:0x0233], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x010a A[Catch: all -> 0x059d, PHI: r7 r11
  0x010a: PHI (r7v20 long) = (r7v0 long), (r7v22 long), (r7v0 long) binds: [B:54:0x012a, B:45:0x0112, B:41:0x0108] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r11v25 android.database.Cursor) = (r11v23 android.database.Cursor), (r11v27 android.database.Cursor), (r11v27 android.database.Cursor) binds: [B:54:0x012a, B:45:0x0112, B:41:0x0108] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0134 A[Catch: all -> 0x059d, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x015d  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x0167  */
    /* JADX WARN: Code duplicated, block: B:75:0x019e A[Catch: SQLiteException -> 0x027e, all -> 0x0508, TRY_LEAVE, TryCatch #6 {all -> 0x0508, blocks: (B:73:0x0198, B:75:0x019e, B:79:0x01ab, B:80:0x01b1, B:81:0x01b5, B:82:0x01c0, B:84:0x01d5, B:86:0x01db, B:87:0x01e5, B:89:0x01eb, B:93:0x01f1, B:95:0x01fc, B:97:0x0202, B:98:0x0209, B:116:0x0264, B:100:0x021e, B:103:0x0233, B:109:0x023c, B:110:0x024b, B:115:0x0251, B:132:0x028a), top: B:249:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01a4 A[Catch: all -> 0x059d, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x059d, blocks: (B:3:0x0010, B:5:0x0021, B:9:0x0034, B:11:0x003a, B:13:0x004a, B:15:0x0052, B:17:0x0058, B:19:0x0063, B:21:0x0073, B:23:0x007e, B:25:0x0091, B:27:0x00b0, B:29:0x00b6, B:30:0x00b9, B:32:0x00c5, B:33:0x00dc, B:35:0x00ed, B:37:0x00f3, B:42:0x010a, B:56:0x012d, B:60:0x0134, B:61:0x0137, B:62:0x0138, B:66:0x0160, B:70:0x0168, B:77:0x01a4, B:135:0x02a6, B:137:0x02ac, B:139:0x02b8, B:140:0x02bc, B:142:0x02c2, B:144:0x02d6, B:148:0x02df, B:150:0x02e5, B:156:0x030a, B:153:0x02fa, B:155:0x0304, B:157:0x030d, B:159:0x0328, B:163:0x0337, B:165:0x035c, B:167:0x0396, B:169:0x039b, B:171:0x03a3, B:172:0x03a6, B:174:0x03ab, B:175:0x03ae, B:177:0x03ba, B:178:0x03d0, B:179:0x03d8, B:181:0x03e9, B:183:0x03fb, B:185:0x041d, B:187:0x042e, B:190:0x0476, B:192:0x0488, B:194:0x049d, B:196:0x04a8, B:197:0x04b1, B:193:0x0496, B:199:0x04f5, B:188:0x0463, B:189:0x046d, B:122:0x0277, B:134:0x02a3, B:203:0x050c, B:204:0x050f, B:205:0x0510, B:211:0x0553, B:228:0x057c, B:230:0x0582, B:232:0x058d, B:216:0x055e, B:237:0x0599, B:238:0x059c), top: B:262:0x0010, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ab A[Catch: SQLiteException -> 0x027e, all -> 0x0508, TRY_ENTER, TryCatch #6 {all -> 0x0508, blocks: (B:73:0x0198, B:75:0x019e, B:79:0x01ab, B:80:0x01b1, B:81:0x01b5, B:82:0x01c0, B:84:0x01d5, B:86:0x01db, B:87:0x01e5, B:89:0x01eb, B:93:0x01f1, B:95:0x01fc, B:97:0x0202, B:98:0x0209, B:116:0x0264, B:100:0x021e, B:103:0x0233, B:109:0x023c, B:110:0x024b, B:115:0x0251, B:132:0x028a), top: B:249:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0202 A[Catch: SQLiteException -> 0x027c, all -> 0x0508, TryCatch #6 {all -> 0x0508, blocks: (B:73:0x0198, B:75:0x019e, B:79:0x01ab, B:80:0x01b1, B:81:0x01b5, B:82:0x01c0, B:84:0x01d5, B:86:0x01db, B:87:0x01e5, B:89:0x01eb, B:93:0x01f1, B:95:0x01fc, B:97:0x0202, B:98:0x0209, B:116:0x0264, B:100:0x021e, B:103:0x0233, B:109:0x023c, B:110:0x024b, B:115:0x0251, B:132:0x028a), top: B:249:0x016f }] */
    /* JADX WARN: Instruction removed from duplicated block: B:187:0x042e, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0596: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:235:0x0596 */
    final void zzX() {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursorRawQuery;
        String string;
        zzh zzhVarZzj;
        int iZze;
        int iMax;
        zzam zzamVar;
        boolean z;
        boolean z2;
        Cursor cursor3;
        long j;
        Cursor cursorQuery;
        List listEmptyList;
        com.google.android.gms.internal.measurement.zzfz zzfzVarZza;
        int size;
        ArrayList arrayList;
        boolean z3;
        boolean zZzi;
        boolean zZzi2;
        boolean zZzs;
        int i;
        String strZzm;
        zzko zzkoVar;
        String string2;
        String strZzi;
        com.google.android.gms.internal.measurement.zzgb zzgbVar;
        Iterator it;
        String strZzJ;
        int i2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        ArrayList arrayList2;
        int length;
        long j2;
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i3;
        byte[] byteArray;
        com.google.android.gms.internal.measurement.zzgb zzgbVar2;
        Cursor cursorRawQuery2;
        zzaz().zzg();
        zzB();
        int i4 = 1;
        this.zzv = true;
        int i5 = 0;
        try {
            this.zzn.zzaw();
            Boolean boolZzj = this.zzn.zzt().zzj();
            if (boolZzj == null) {
                zzay().zzk().zza("Upload data called on the client side before use of service was decided");
                this.zzv = false;
            } else if (boolZzj.booleanValue()) {
                zzay().zzd().zza("Upload called in the client side when service should be used");
                this.zzv = false;
            } else if (this.zza > 0) {
                zzag();
                this.zzv = false;
            } else {
                zzaz().zzg();
                if (this.zzy != null) {
                    zzay().zzj().zza("Uploading requested multiple times");
                    this.zzv = false;
                } else {
                    zzeu zzeuVar = this.zzd;
                    zzal(zzeuVar);
                    if (zzeuVar.zza()) {
                        long jCurrentTimeMillis = zzav().currentTimeMillis();
                        Cursor cursor4 = null;
                        int iZze2 = zzg().zze(null, zzeb.zzP);
                        zzg();
                        long jZzz = jCurrentTimeMillis - zzag.zzz();
                        for (int i6 = 0; i6 < iZze2 && zzah(null, jZzz); i6++) {
                        }
                        long jZza = this.zzk.zzc.zza();
                        if (jZza != 0) {
                            zzay().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jCurrentTimeMillis - jZza)));
                        }
                        zzam zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        String strZzr = zzamVar2.zzr();
                        long j3 = -1;
                        if (TextUtils.isEmpty(strZzr)) {
                            try {
                                this.zzA = -1L;
                                zzam zzamVar3 = this.zze;
                                zzal(zzamVar3);
                                zzg();
                                long jZzz2 = jCurrentTimeMillis - zzag.zzz();
                                zzamVar3.zzg();
                                zzamVar3.zzW();
                                try {
                                    cursorRawQuery = zzamVar3.zzh().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jZzz2)});
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            string = cursorRawQuery.getString(0);
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                        } else {
                                            zzamVar3.zzs.zzay().zzj().zza("No expired configs for apps with pending events");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            string = null;
                                        }
                                    } catch (SQLiteException e) {
                                        e = e;
                                        zzamVar3.zzs.zzay().zzd().zzb("Error selecting expired configs", e);
                                        if (cursorRawQuery != null) {
                                        }
                                        string = null;
                                        if (!TextUtils.isEmpty(string)) {
                                            zzam zzamVar4 = this.zze;
                                            zzal(zzamVar4);
                                            zzhVarZzj = zzamVar4.zzj(string);
                                            if (zzhVarZzj != null) {
                                                zzD(zzhVarZzj);
                                            }
                                        }
                                        this.zzv = false;
                                        zzae();
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursorRawQuery = null;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = null;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    zzam zzamVar5 = this.zze;
                                    zzal(zzamVar5);
                                    zzhVarZzj = zzamVar5.zzj(string);
                                    if (zzhVarZzj != null) {
                                        zzD(zzhVarZzj);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursor;
                            }
                        } else {
                            if (this.zzA == -1) {
                                zzam zzamVar6 = this.zze;
                                zzal(zzamVar6);
                                try {
                                    cursorRawQuery2 = zzamVar6.zzh().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    try {
                                        try {
                                            if (cursorRawQuery2.moveToFirst()) {
                                                j3 = cursorRawQuery2.getLong(0);
                                                if (cursorRawQuery2 != null) {
                                                    cursorRawQuery2.close();
                                                }
                                            } else if (cursorRawQuery2 != null) {
                                                cursorRawQuery2.close();
                                            }
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            zzamVar6.zzs.zzay().zzd().zzb("Error querying raw events", e);
                                            if (cursorRawQuery2 != null) {
                                            }
                                            this.zzA = j3;
                                            iZze = zzg().zze(strZzr, zzeb.zzf);
                                            iMax = Math.max(0, zzg().zze(strZzr, zzeb.zzg));
                                            zzamVar = this.zze;
                                            zzal(zzamVar);
                                            zzamVar.zzg();
                                            zzamVar.zzW();
                                            if (iZze > 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            Preconditions.checkArgument(z);
                                            if (iMax > 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            Preconditions.checkArgument(z2);
                                            Preconditions.checkNotEmpty(strZzr);
                                            try {
                                                cursorQuery = zzamVar.zzh().query("queue", new String[]{"rowid", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze));
                                                try {
                                                    if (cursorQuery.moveToFirst()) {
                                                        arrayList2 = new ArrayList();
                                                        length = 0;
                                                        while (true) {
                                                            j2 = cursorQuery.getLong(i5);
                                                            try {
                                                                byte[] blob = cursorQuery.getBlob(i4);
                                                                zzlb zzlbVar = zzamVar.zzf.zzi;
                                                                zzal(zzlbVar);
                                                                try {
                                                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                                                    bArr = new byte[1024];
                                                                    j = jCurrentTimeMillis;
                                                                    while (true) {
                                                                        try {
                                                                            try {
                                                                                i3 = gZIPInputStream.read(bArr);
                                                                                if (i3 <= 0) {
                                                                                    break;
                                                                                } else {
                                                                                    byteArrayOutputStream.write(bArr, 0, i3);
                                                                                }
                                                                            } catch (IOException e4) {
                                                                                e = e4;
                                                                                try {
                                                                                    zzlbVar.zzs.zzay().zzd().zzb("Failed to ungzip content", e);
                                                                                    throw e;
                                                                                } catch (IOException e5) {
                                                                                    e = e5;
                                                                                    zzamVar.zzs.zzay().zzd().zzc("Failed to unzip queued bundle. appId", zzeo.zzn(strZzr), e);
                                                                                    if (cursorQuery.moveToNext()) {
                                                                                        break;
                                                                                    } else {
                                                                                        break;
                                                                                    }
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    listEmptyList = arrayList2;
                                                                                    if (!listEmptyList.isEmpty()) {
                                                                                        if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                                                            it = listEmptyList.iterator();
                                                                                            while (true) {
                                                                                                if (!it.hasNext()) {
                                                                                                    strZzJ = null;
                                                                                                    break;
                                                                                                }
                                                                                                zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((Pair) it.next()).first;
                                                                                                if (!zzgcVar2.zzJ().isEmpty()) {
                                                                                                    strZzJ = zzgcVar2.zzJ();
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (strZzJ != null) {
                                                                                                for (i2 = 0; i2 < listEmptyList.size(); i2++) {
                                                                                                    zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i2)).first;
                                                                                                    if (zzgcVar.zzJ().isEmpty()) {
                                                                                                        listEmptyList = listEmptyList.subList(0, i2);
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                                                                        size = listEmptyList.size();
                                                                                        arrayList = new ArrayList(listEmptyList.size());
                                                                                        if (zzg().zzt(strZzr)) {
                                                                                            z3 = false;
                                                                                        } else {
                                                                                            z3 = false;
                                                                                        }
                                                                                        zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                                                        zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                                                        zzoz.zzc();
                                                                                        zZzs = zzg().zzs(null, zzeb.zzar);
                                                                                        i = 0;
                                                                                        while (i < size) {
                                                                                            zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i)).first).zzby();
                                                                                            arrayList.add((Long) ((Pair) listEmptyList.get(i)).second);
                                                                                            zzg().zzh();
                                                                                            zzgbVar.zzal(73000L);
                                                                                            long j4 = j;
                                                                                            zzgbVar.zzak(j4);
                                                                                            this.zzn.zzaw();
                                                                                            zzgbVar.zzag(false);
                                                                                            if (!z3) {
                                                                                                zzgbVar.zzq();
                                                                                            }
                                                                                            if (!zZzi) {
                                                                                                zzgbVar.zzx();
                                                                                                zzgbVar.zzt();
                                                                                            }
                                                                                            if (!zZzi2) {
                                                                                                zzgbVar.zzn();
                                                                                            }
                                                                                            zzC(strZzr, zzgbVar);
                                                                                            if (!zZzs) {
                                                                                                zzgbVar.zzy();
                                                                                            }
                                                                                            if (zzg().zzs(strZzr, zzeb.zzT)) {
                                                                                                byte[] bArrZzbv = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                                                                                zzlb zzlbVar2 = this.zzi;
                                                                                                zzal(zzlbVar2);
                                                                                                zzgbVar.zzJ(zzlbVar2.zzd(bArrZzbv));
                                                                                            }
                                                                                            zzfzVarZza.zza(zzgbVar);
                                                                                            i++;
                                                                                            j = j4;
                                                                                        }
                                                                                        long j5 = j;
                                                                                        if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                                            zzlb zzlbVar3 = this.zzi;
                                                                                            zzal(zzlbVar3);
                                                                                            strZzm = zzlbVar3.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                                                                        } else {
                                                                                            strZzm = null;
                                                                                        }
                                                                                        zzal(this.zzi);
                                                                                        byte[] bArrZzbv2 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                                                                        zzkoVar = this.zzl;
                                                                                        zzow.zzc();
                                                                                        if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                                                                            zzfp zzfpVar = zzkoVar.zzf.zzc;
                                                                                            zzal(zzfpVar);
                                                                                            strZzi = zzfpVar.zzi(strZzr);
                                                                                            if (TextUtils.isEmpty(strZzi)) {
                                                                                                string2 = (String) zzeb.zzp.zza(null);
                                                                                            } else {
                                                                                                Uri uri = Uri.parse((String) zzeb.zzp.zza(null));
                                                                                                Uri.Builder builderBuildUpon = uri.buildUpon();
                                                                                                builderBuildUpon.authority(strZzi + "." + uri.getAuthority());
                                                                                                string2 = builderBuildUpon.build().toString();
                                                                                            }
                                                                                        } else {
                                                                                            string2 = (String) zzeb.zzp.zza(null);
                                                                                        }
                                                                                        try {
                                                                                            URL url = new URL(string2);
                                                                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                            if (this.zzy != null) {
                                                                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                            } else {
                                                                                                this.zzy = new ArrayList(arrayList);
                                                                                            }
                                                                                            this.zzk.zzd.zzb(j5);
                                                                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfzVarZza.zzb(0).zzx() : "?", Integer.valueOf(bArrZzbv2.length), strZzm);
                                                                                            this.zzu = true;
                                                                                            zzeu zzeuVar2 = this.zzd;
                                                                                            zzal(zzeuVar2);
                                                                                            zzkq zzkqVar = new zzkq(this, strZzr);
                                                                                            zzeuVar2.zzg();
                                                                                            zzeuVar2.zzW();
                                                                                            Preconditions.checkNotNull(url);
                                                                                            Preconditions.checkNotNull(bArrZzbv2);
                                                                                            Preconditions.checkNotNull(zzkqVar);
                                                                                            zzeuVar2.zzs.zzaz().zzo(new zzet(zzeuVar2, strZzr, url, bArrZzbv2, null, zzkqVar));
                                                                                        } catch (MalformedURLException unused) {
                                                                                            zzay().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzeo.zzn(strZzr), string2);
                                                                                        }
                                                                                    }
                                                                                    this.zzv = false;
                                                                                    zzae();
                                                                                }
                                                                            }
                                                                        } catch (SQLiteException e6) {
                                                                            e = e6;
                                                                            zzamVar.zzs.zzay().zzd().zzc("Error querying bundles. appId", zzeo.zzn(strZzr), e);
                                                                            listEmptyList = Collections.emptyList();
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                        }
                                                                    }
                                                                    gZIPInputStream.close();
                                                                    byteArrayInputStream.close();
                                                                    byteArray = byteArrayOutputStream.toByteArray();
                                                                    if (arrayList2.isEmpty()) {
                                                                    }
                                                                    try {
                                                                        zzgbVar2 = (com.google.android.gms.internal.measurement.zzgb) zzlb.zzl(com.google.android.gms.internal.measurement.zzgc.zzt(), byteArray);
                                                                        if (!cursorQuery.isNull(2)) {
                                                                            zzgbVar2.zzaf(cursorQuery.getInt(2));
                                                                        }
                                                                        length += byteArray.length;
                                                                        arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzgc) zzgbVar2.zzaE(), Long.valueOf(j2)));
                                                                    } catch (IOException e7) {
                                                                        zzamVar.zzs.zzay().zzd().zzc("Failed to merge queued bundle. appId", zzeo.zzn(strZzr), e7);
                                                                    }
                                                                } catch (IOException e8) {
                                                                    e = e8;
                                                                    j = jCurrentTimeMillis;
                                                                }
                                                            } catch (IOException e9) {
                                                                e = e9;
                                                                j = jCurrentTimeMillis;
                                                            }
                                                            if (cursorQuery.moveToNext()) {
                                                                break;
                                                                break;
                                                            } else {
                                                                break;
                                                                break;
                                                            }
                                                            jCurrentTimeMillis = j;
                                                            i4 = 1;
                                                            i5 = 0;
                                                        }
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        listEmptyList = arrayList2;
                                                    } else {
                                                        listEmptyList = Collections.emptyList();
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        j = jCurrentTimeMillis;
                                                    }
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    j = jCurrentTimeMillis;
                                                }
                                                if (!listEmptyList.isEmpty()) {
                                                    if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                        it = listEmptyList.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                strZzJ = null;
                                                                break;
                                                            }
                                                            zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((Pair) it.next()).first;
                                                            if (!zzgcVar2.zzJ().isEmpty()) {
                                                                strZzJ = zzgcVar2.zzJ();
                                                                break;
                                                            }
                                                        }
                                                        if (strZzJ != null) {
                                                            while (i2 < listEmptyList.size()) {
                                                                zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i2)).first;
                                                                if (zzgcVar.zzJ().isEmpty()) {
                                                                    listEmptyList = listEmptyList.subList(0, i2);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                                    size = listEmptyList.size();
                                                    arrayList = new ArrayList(listEmptyList.size());
                                                    if (zzg().zzt(strZzr)) {
                                                        z3 = false;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                    zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                    zzoz.zzc();
                                                    zZzs = zzg().zzs(null, zzeb.zzar);
                                                    i = 0;
                                                    while (i < size) {
                                                        zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i)).first).zzby();
                                                        arrayList.add((Long) ((Pair) listEmptyList.get(i)).second);
                                                        zzg().zzh();
                                                        zzgbVar.zzal(73000L);
                                                        long j6 = j;
                                                        zzgbVar.zzak(j6);
                                                        this.zzn.zzaw();
                                                        zzgbVar.zzag(false);
                                                        if (!z3) {
                                                            zzgbVar.zzq();
                                                        }
                                                        if (!zZzi) {
                                                            zzgbVar.zzx();
                                                            zzgbVar.zzt();
                                                        }
                                                        if (!zZzi2) {
                                                            zzgbVar.zzn();
                                                        }
                                                        zzC(strZzr, zzgbVar);
                                                        if (!zZzs) {
                                                            zzgbVar.zzy();
                                                        }
                                                        if (zzg().zzs(strZzr, zzeb.zzT)) {
                                                            byte[] bArrZzbv3 = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                                            zzlb zzlbVar4 = this.zzi;
                                                            zzal(zzlbVar4);
                                                            zzgbVar.zzJ(zzlbVar4.zzd(bArrZzbv3));
                                                        }
                                                        zzfzVarZza.zza(zzgbVar);
                                                        i++;
                                                        j = j6;
                                                    }
                                                    long j7 = j;
                                                    if (Log.isLoggable(zzay().zzq(), 2)) {
                                                        zzlb zzlbVar5 = this.zzi;
                                                        zzal(zzlbVar5);
                                                        strZzm = zzlbVar5.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                                    } else {
                                                        strZzm = null;
                                                    }
                                                    zzal(this.zzi);
                                                    byte[] bArrZzbv4 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                                    zzkoVar = this.zzl;
                                                    zzow.zzc();
                                                    if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                                        zzfp zzfpVar2 = zzkoVar.zzf.zzc;
                                                        zzal(zzfpVar2);
                                                        strZzi = zzfpVar2.zzi(strZzr);
                                                        if (TextUtils.isEmpty(strZzi)) {
                                                            Uri uri2 = Uri.parse((String) zzeb.zzp.zza(null));
                                                            Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                                                            builderBuildUpon2.authority(strZzi + "." + uri2.getAuthority());
                                                            string2 = builderBuildUpon2.build().toString();
                                                        } else {
                                                            string2 = (String) zzeb.zzp.zza(null);
                                                        }
                                                    } else {
                                                        string2 = (String) zzeb.zzp.zza(null);
                                                    }
                                                    URL url2 = new URL(string2);
                                                    Preconditions.checkArgument(!arrayList.isEmpty());
                                                    if (this.zzy != null) {
                                                        zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                    } else {
                                                        this.zzy = new ArrayList(arrayList);
                                                    }
                                                    this.zzk.zzd.zzb(j7);
                                                    zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfzVarZza.zzb(0).zzx() : "?", Integer.valueOf(bArrZzbv4.length), strZzm);
                                                    this.zzu = true;
                                                    zzeu zzeuVar3 = this.zzd;
                                                    zzal(zzeuVar3);
                                                    zzkq zzkqVar2 = new zzkq(this, strZzr);
                                                    zzeuVar3.zzg();
                                                    zzeuVar3.zzW();
                                                    Preconditions.checkNotNull(url2);
                                                    Preconditions.checkNotNull(bArrZzbv4);
                                                    Preconditions.checkNotNull(zzkqVar2);
                                                    zzeuVar3.zzs.zzaz().zzo(new zzet(zzeuVar3, strZzr, url2, bArrZzbv4, null, zzkqVar2));
                                                }
                                                this.zzv = false;
                                                zzae();
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cursor3 = cursorRawQuery2;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cursor4 = cursorRawQuery2;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    cursorRawQuery2 = null;
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    throw th;
                                }
                                this.zzA = j3;
                            }
                            iZze = zzg().zze(strZzr, zzeb.zzf);
                            iMax = Math.max(0, zzg().zze(strZzr, zzeb.zzg));
                            zzamVar = this.zze;
                            zzal(zzamVar);
                            zzamVar.zzg();
                            zzamVar.zzW();
                            if (iZze > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Preconditions.checkArgument(z);
                            if (iMax > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            Preconditions.checkArgument(z2);
                            Preconditions.checkNotEmpty(strZzr);
                            try {
                                cursorQuery = zzamVar.zzh().query("queue", new String[]{"rowid", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze));
                                if (cursorQuery.moveToFirst()) {
                                    listEmptyList = Collections.emptyList();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    j = jCurrentTimeMillis;
                                } else {
                                    arrayList2 = new ArrayList();
                                    length = 0;
                                    while (true) {
                                        j2 = cursorQuery.getLong(i5);
                                        byte[] blob2 = cursorQuery.getBlob(i4);
                                        zzlb zzlbVar6 = zzamVar.zzf.zzi;
                                        zzal(zzlbVar6);
                                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(blob2);
                                        gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        bArr = new byte[1024];
                                        j = jCurrentTimeMillis;
                                        while (true) {
                                            i3 = gZIPInputStream.read(bArr);
                                            if (i3 <= 0) {
                                                break;
                                                break;
                                            }
                                            byteArrayOutputStream.write(bArr, 0, i3);
                                        }
                                        gZIPInputStream.close();
                                        byteArrayInputStream2.close();
                                        byteArray = byteArrayOutputStream.toByteArray();
                                        if (arrayList2.isEmpty() && byteArray.length + length > iMax) {
                                            break;
                                        }
                                        zzgbVar2 = (com.google.android.gms.internal.measurement.zzgb) zzlb.zzl(com.google.android.gms.internal.measurement.zzgc.zzt(), byteArray);
                                        if (!cursorQuery.isNull(2)) {
                                            zzgbVar2.zzaf(cursorQuery.getInt(2));
                                        }
                                        length += byteArray.length;
                                        arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzgc) zzgbVar2.zzaE(), Long.valueOf(j2)));
                                        if (cursorQuery.moveToNext() || length > iMax) {
                                            break;
                                            break;
                                        } else {
                                            jCurrentTimeMillis = j;
                                            i4 = 1;
                                            i5 = 0;
                                        }
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    listEmptyList = arrayList2;
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                j = jCurrentTimeMillis;
                                cursorQuery = null;
                            } catch (Throwable th6) {
                                th = th6;
                                cursor3 = null;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                            if (!listEmptyList.isEmpty()) {
                                if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                    it = listEmptyList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            strZzJ = null;
                                            break;
                                        }
                                        zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((Pair) it.next()).first;
                                        if (!zzgcVar2.zzJ().isEmpty()) {
                                            strZzJ = zzgcVar2.zzJ();
                                            break;
                                        }
                                    }
                                    if (strZzJ != null) {
                                        while (i2 < listEmptyList.size()) {
                                            zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i2)).first;
                                            if (zzgcVar.zzJ().isEmpty() && !zzgcVar.zzJ().equals(strZzJ)) {
                                                listEmptyList = listEmptyList.subList(0, i2);
                                                break;
                                            }
                                        }
                                    }
                                }
                                zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                size = listEmptyList.size();
                                arrayList = new ArrayList(listEmptyList.size());
                                if (zzg().zzt(strZzr) || !zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                zzoz.zzc();
                                zZzs = zzg().zzs(null, zzeb.zzar);
                                i = 0;
                                while (i < size) {
                                    zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i)).first).zzby();
                                    arrayList.add((Long) ((Pair) listEmptyList.get(i)).second);
                                    zzg().zzh();
                                    zzgbVar.zzal(73000L);
                                    long j8 = j;
                                    zzgbVar.zzak(j8);
                                    this.zzn.zzaw();
                                    zzgbVar.zzag(false);
                                    if (!z3) {
                                        zzgbVar.zzq();
                                    }
                                    if (!zZzi) {
                                        zzgbVar.zzx();
                                        zzgbVar.zzt();
                                    }
                                    if (!zZzi2) {
                                        zzgbVar.zzn();
                                    }
                                    zzC(strZzr, zzgbVar);
                                    if (!zZzs) {
                                        zzgbVar.zzy();
                                    }
                                    if (zzg().zzs(strZzr, zzeb.zzT)) {
                                        byte[] bArrZzbv5 = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                        zzlb zzlbVar7 = this.zzi;
                                        zzal(zzlbVar7);
                                        zzgbVar.zzJ(zzlbVar7.zzd(bArrZzbv5));
                                    }
                                    zzfzVarZza.zza(zzgbVar);
                                    i++;
                                    j = j8;
                                }
                                long j9 = j;
                                if (Log.isLoggable(zzay().zzq(), 2)) {
                                    zzlb zzlbVar8 = this.zzi;
                                    zzal(zzlbVar8);
                                    strZzm = zzlbVar8.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                } else {
                                    strZzm = null;
                                }
                                zzal(this.zzi);
                                byte[] bArrZzbv6 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                zzkoVar = this.zzl;
                                zzow.zzc();
                                if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                    zzfp zzfpVar3 = zzkoVar.zzf.zzc;
                                    zzal(zzfpVar3);
                                    strZzi = zzfpVar3.zzi(strZzr);
                                    if (TextUtils.isEmpty(strZzi)) {
                                        Uri uri3 = Uri.parse((String) zzeb.zzp.zza(null));
                                        Uri.Builder builderBuildUpon3 = uri3.buildUpon();
                                        builderBuildUpon3.authority(strZzi + "." + uri3.getAuthority());
                                        string2 = builderBuildUpon3.build().toString();
                                    } else {
                                        string2 = (String) zzeb.zzp.zza(null);
                                    }
                                } else {
                                    string2 = (String) zzeb.zzp.zza(null);
                                }
                                URL url3 = new URL(string2);
                                Preconditions.checkArgument(!arrayList.isEmpty());
                                if (this.zzy != null) {
                                    zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                } else {
                                    this.zzy = new ArrayList(arrayList);
                                }
                                this.zzk.zzd.zzb(j9);
                                zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzfzVarZza.zzb(0).zzx() : "?", Integer.valueOf(bArrZzbv6.length), strZzm);
                                this.zzu = true;
                                zzeu zzeuVar4 = this.zzd;
                                zzal(zzeuVar4);
                                zzkq zzkqVar3 = new zzkq(this, strZzr);
                                zzeuVar4.zzg();
                                zzeuVar4.zzW();
                                Preconditions.checkNotNull(url3);
                                Preconditions.checkNotNull(bArrZzbv6);
                                Preconditions.checkNotNull(zzkqVar3);
                                zzeuVar4.zzs.zzaz().zzo(new zzet(zzeuVar4, strZzr, url3, bArrZzbv6, null, zzkqVar3));
                            }
                        }
                        this.zzv = false;
                    } else {
                        zzay().zzj().zza("Network not connected, ignoring upload request");
                        zzag();
                        this.zzv = false;
                    }
                }
            }
            zzae();
        } catch (Throwable th7) {
            this.zzv = false;
            zzae();
            throw th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:212:0x0724  */
    /* JADX WARN: Code duplicated, block: B:42:0x0159  */
    /* JADX WARN: Code duplicated, block: B:46:0x016b A[Catch: all -> 0x0a54, TRY_ENTER, TryCatch #3 {all -> 0x0a54, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:87:0x02e0, B:96:0x0316, B:98:0x0359, B:100:0x035e, B:101:0x0375, B:105:0x0388, B:107:0x039f, B:109:0x03a6, B:110:0x03bd, B:115:0x03e7, B:119:0x040a, B:120:0x0421, B:124:0x0434, B:127:0x0453, B:128:0x0467, B:130:0x0471, B:132:0x047e, B:134:0x0484, B:135:0x048d, B:136:0x049b, B:138:0x04b0, B:140:0x04c0, B:152:0x04e9, B:153:0x04fe, B:155:0x0529, B:158:0x0541, B:161:0x0584, B:163:0x05b0, B:165:0x05ed, B:166:0x05f2, B:168:0x05fa, B:169:0x05ff, B:171:0x0607, B:172:0x060c, B:174:0x061c, B:176:0x0624, B:177:0x0629, B:179:0x0632, B:180:0x0636, B:182:0x0643, B:183:0x0648, B:185:0x066f, B:187:0x0677, B:188:0x067c, B:190:0x0684, B:191:0x0687, B:193:0x069f, B:196:0x06a7, B:197:0x06c1, B:199:0x06c7, B:201:0x06db, B:203:0x06e7, B:205:0x06f4, B:209:0x070e, B:210:0x071e, B:214:0x0727, B:215:0x072a, B:217:0x0748, B:219:0x074c, B:221:0x075e, B:223:0x0762, B:225:0x076d, B:226:0x0778, B:228:0x07b7, B:230:0x07c1, B:231:0x07c4, B:233:0x07d1, B:235:0x07f3, B:236:0x0800, B:237:0x0836, B:239:0x083e, B:241:0x0848, B:242:0x0855, B:244:0x085f, B:245:0x086c, B:246:0x0878, B:248:0x087e, B:250:0x08ae, B:251:0x08f4, B:252:0x08ff, B:253:0x090b, B:255:0x0911, B:264:0x095e, B:265:0x09ac, B:267:0x09bd, B:281:0x0a21, B:270:0x09d5, B:272:0x09d9, B:258:0x091e, B:260:0x0948, B:276:0x09f2, B:277:0x0a09, B:280:0x0a0c, B:162:0x05a2, B:149:0x04d1, B:90:0x02f6, B:91:0x02fd, B:93:0x0303, B:95:0x030f, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:54:0x019e, B:61:0x01dc, B:63:0x01e2, B:65:0x01f0, B:67:0x0205, B:70:0x020c, B:84:0x02a5, B:86:0x02b0, B:72:0x0234, B:73:0x0253, B:75:0x025c, B:83:0x0289, B:82:0x0276, B:57:0x01ac, B:60:0x01d2), top: B:294:0x0124, inners: #0, #2, #9 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0182 A[Catch: all -> 0x0a54, TRY_LEAVE, TryCatch #3 {all -> 0x0a54, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:87:0x02e0, B:96:0x0316, B:98:0x0359, B:100:0x035e, B:101:0x0375, B:105:0x0388, B:107:0x039f, B:109:0x03a6, B:110:0x03bd, B:115:0x03e7, B:119:0x040a, B:120:0x0421, B:124:0x0434, B:127:0x0453, B:128:0x0467, B:130:0x0471, B:132:0x047e, B:134:0x0484, B:135:0x048d, B:136:0x049b, B:138:0x04b0, B:140:0x04c0, B:152:0x04e9, B:153:0x04fe, B:155:0x0529, B:158:0x0541, B:161:0x0584, B:163:0x05b0, B:165:0x05ed, B:166:0x05f2, B:168:0x05fa, B:169:0x05ff, B:171:0x0607, B:172:0x060c, B:174:0x061c, B:176:0x0624, B:177:0x0629, B:179:0x0632, B:180:0x0636, B:182:0x0643, B:183:0x0648, B:185:0x066f, B:187:0x0677, B:188:0x067c, B:190:0x0684, B:191:0x0687, B:193:0x069f, B:196:0x06a7, B:197:0x06c1, B:199:0x06c7, B:201:0x06db, B:203:0x06e7, B:205:0x06f4, B:209:0x070e, B:210:0x071e, B:214:0x0727, B:215:0x072a, B:217:0x0748, B:219:0x074c, B:221:0x075e, B:223:0x0762, B:225:0x076d, B:226:0x0778, B:228:0x07b7, B:230:0x07c1, B:231:0x07c4, B:233:0x07d1, B:235:0x07f3, B:236:0x0800, B:237:0x0836, B:239:0x083e, B:241:0x0848, B:242:0x0855, B:244:0x085f, B:245:0x086c, B:246:0x0878, B:248:0x087e, B:250:0x08ae, B:251:0x08f4, B:252:0x08ff, B:253:0x090b, B:255:0x0911, B:264:0x095e, B:265:0x09ac, B:267:0x09bd, B:281:0x0a21, B:270:0x09d5, B:272:0x09d9, B:258:0x091e, B:260:0x0948, B:276:0x09f2, B:277:0x0a09, B:280:0x0a0c, B:162:0x05a2, B:149:0x04d1, B:90:0x02f6, B:91:0x02fd, B:93:0x0303, B:95:0x030f, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:54:0x019e, B:61:0x01dc, B:63:0x01e2, B:65:0x01f0, B:67:0x0205, B:70:0x020c, B:84:0x02a5, B:86:0x02b0, B:72:0x0234, B:73:0x0253, B:75:0x025c, B:83:0x0289, B:82:0x0276, B:57:0x01ac, B:60:0x01d2), top: B:294:0x0124, inners: #0, #2, #9 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d2 A[Catch: all -> 0x0a54, TRY_ENTER, TryCatch #3 {all -> 0x0a54, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:87:0x02e0, B:96:0x0316, B:98:0x0359, B:100:0x035e, B:101:0x0375, B:105:0x0388, B:107:0x039f, B:109:0x03a6, B:110:0x03bd, B:115:0x03e7, B:119:0x040a, B:120:0x0421, B:124:0x0434, B:127:0x0453, B:128:0x0467, B:130:0x0471, B:132:0x047e, B:134:0x0484, B:135:0x048d, B:136:0x049b, B:138:0x04b0, B:140:0x04c0, B:152:0x04e9, B:153:0x04fe, B:155:0x0529, B:158:0x0541, B:161:0x0584, B:163:0x05b0, B:165:0x05ed, B:166:0x05f2, B:168:0x05fa, B:169:0x05ff, B:171:0x0607, B:172:0x060c, B:174:0x061c, B:176:0x0624, B:177:0x0629, B:179:0x0632, B:180:0x0636, B:182:0x0643, B:183:0x0648, B:185:0x066f, B:187:0x0677, B:188:0x067c, B:190:0x0684, B:191:0x0687, B:193:0x069f, B:196:0x06a7, B:197:0x06c1, B:199:0x06c7, B:201:0x06db, B:203:0x06e7, B:205:0x06f4, B:209:0x070e, B:210:0x071e, B:214:0x0727, B:215:0x072a, B:217:0x0748, B:219:0x074c, B:221:0x075e, B:223:0x0762, B:225:0x076d, B:226:0x0778, B:228:0x07b7, B:230:0x07c1, B:231:0x07c4, B:233:0x07d1, B:235:0x07f3, B:236:0x0800, B:237:0x0836, B:239:0x083e, B:241:0x0848, B:242:0x0855, B:244:0x085f, B:245:0x086c, B:246:0x0878, B:248:0x087e, B:250:0x08ae, B:251:0x08f4, B:252:0x08ff, B:253:0x090b, B:255:0x0911, B:264:0x095e, B:265:0x09ac, B:267:0x09bd, B:281:0x0a21, B:270:0x09d5, B:272:0x09d9, B:258:0x091e, B:260:0x0948, B:276:0x09f2, B:277:0x0a09, B:280:0x0a0c, B:162:0x05a2, B:149:0x04d1, B:90:0x02f6, B:91:0x02fd, B:93:0x0303, B:95:0x030f, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:54:0x019e, B:61:0x01dc, B:63:0x01e2, B:65:0x01f0, B:67:0x0205, B:70:0x020c, B:84:0x02a5, B:86:0x02b0, B:72:0x0234, B:73:0x0253, B:75:0x025c, B:83:0x0289, B:82:0x0276, B:57:0x01ac, B:60:0x01d2), top: B:294:0x0124, inners: #0, #2, #9 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01e2 A[Catch: all -> 0x0a54, TryCatch #3 {all -> 0x0a54, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:87:0x02e0, B:96:0x0316, B:98:0x0359, B:100:0x035e, B:101:0x0375, B:105:0x0388, B:107:0x039f, B:109:0x03a6, B:110:0x03bd, B:115:0x03e7, B:119:0x040a, B:120:0x0421, B:124:0x0434, B:127:0x0453, B:128:0x0467, B:130:0x0471, B:132:0x047e, B:134:0x0484, B:135:0x048d, B:136:0x049b, B:138:0x04b0, B:140:0x04c0, B:152:0x04e9, B:153:0x04fe, B:155:0x0529, B:158:0x0541, B:161:0x0584, B:163:0x05b0, B:165:0x05ed, B:166:0x05f2, B:168:0x05fa, B:169:0x05ff, B:171:0x0607, B:172:0x060c, B:174:0x061c, B:176:0x0624, B:177:0x0629, B:179:0x0632, B:180:0x0636, B:182:0x0643, B:183:0x0648, B:185:0x066f, B:187:0x0677, B:188:0x067c, B:190:0x0684, B:191:0x0687, B:193:0x069f, B:196:0x06a7, B:197:0x06c1, B:199:0x06c7, B:201:0x06db, B:203:0x06e7, B:205:0x06f4, B:209:0x070e, B:210:0x071e, B:214:0x0727, B:215:0x072a, B:217:0x0748, B:219:0x074c, B:221:0x075e, B:223:0x0762, B:225:0x076d, B:226:0x0778, B:228:0x07b7, B:230:0x07c1, B:231:0x07c4, B:233:0x07d1, B:235:0x07f3, B:236:0x0800, B:237:0x0836, B:239:0x083e, B:241:0x0848, B:242:0x0855, B:244:0x085f, B:245:0x086c, B:246:0x0878, B:248:0x087e, B:250:0x08ae, B:251:0x08f4, B:252:0x08ff, B:253:0x090b, B:255:0x0911, B:264:0x095e, B:265:0x09ac, B:267:0x09bd, B:281:0x0a21, B:270:0x09d5, B:272:0x09d9, B:258:0x091e, B:260:0x0948, B:276:0x09f2, B:277:0x0a09, B:280:0x0a0c, B:162:0x05a2, B:149:0x04d1, B:90:0x02f6, B:91:0x02fd, B:93:0x0303, B:95:0x030f, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:54:0x019e, B:61:0x01dc, B:63:0x01e2, B:65:0x01f0, B:67:0x0205, B:70:0x020c, B:84:0x02a5, B:86:0x02b0, B:72:0x0234, B:73:0x0253, B:75:0x025c, B:83:0x0289, B:82:0x0276, B:57:0x01ac, B:60:0x01d2), top: B:294:0x0124, inners: #0, #2, #9 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01f0 A[Catch: all -> 0x0a54, TryCatch #3 {all -> 0x0a54, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:87:0x02e0, B:96:0x0316, B:98:0x0359, B:100:0x035e, B:101:0x0375, B:105:0x0388, B:107:0x039f, B:109:0x03a6, B:110:0x03bd, B:115:0x03e7, B:119:0x040a, B:120:0x0421, B:124:0x0434, B:127:0x0453, B:128:0x0467, B:130:0x0471, B:132:0x047e, B:134:0x0484, B:135:0x048d, B:136:0x049b, B:138:0x04b0, B:140:0x04c0, B:152:0x04e9, B:153:0x04fe, B:155:0x0529, B:158:0x0541, B:161:0x0584, B:163:0x05b0, B:165:0x05ed, B:166:0x05f2, B:168:0x05fa, B:169:0x05ff, B:171:0x0607, B:172:0x060c, B:174:0x061c, B:176:0x0624, B:177:0x0629, B:179:0x0632, B:180:0x0636, B:182:0x0643, B:183:0x0648, B:185:0x066f, B:187:0x0677, B:188:0x067c, B:190:0x0684, B:191:0x0687, B:193:0x069f, B:196:0x06a7, B:197:0x06c1, B:199:0x06c7, B:201:0x06db, B:203:0x06e7, B:205:0x06f4, B:209:0x070e, B:210:0x071e, B:214:0x0727, B:215:0x072a, B:217:0x0748, B:219:0x074c, B:221:0x075e, B:223:0x0762, B:225:0x076d, B:226:0x0778, B:228:0x07b7, B:230:0x07c1, B:231:0x07c4, B:233:0x07d1, B:235:0x07f3, B:236:0x0800, B:237:0x0836, B:239:0x083e, B:241:0x0848, B:242:0x0855, B:244:0x085f, B:245:0x086c, B:246:0x0878, B:248:0x087e, B:250:0x08ae, B:251:0x08f4, B:252:0x08ff, B:253:0x090b, B:255:0x0911, B:264:0x095e, B:265:0x09ac, B:267:0x09bd, B:281:0x0a21, B:270:0x09d5, B:272:0x09d9, B:258:0x091e, B:260:0x0948, B:276:0x09f2, B:277:0x0a09, B:280:0x0a0c, B:162:0x05a2, B:149:0x04d1, B:90:0x02f6, B:91:0x02fd, B:93:0x0303, B:95:0x030f, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:54:0x019e, B:61:0x01dc, B:63:0x01e2, B:65:0x01f0, B:67:0x0205, B:70:0x020c, B:84:0x02a5, B:86:0x02b0, B:72:0x0234, B:73:0x0253, B:75:0x025c, B:83:0x0289, B:82:0x0276, B:57:0x01ac, B:60:0x01d2), top: B:294:0x0124, inners: #0, #2, #9 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0205 A[Catch: all -> 0x0a54, TryCatch #3 {all -> 0x0a54, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:87:0x02e0, B:96:0x0316, B:98:0x0359, B:100:0x035e, B:101:0x0375, B:105:0x0388, B:107:0x039f, B:109:0x03a6, B:110:0x03bd, B:115:0x03e7, B:119:0x040a, B:120:0x0421, B:124:0x0434, B:127:0x0453, B:128:0x0467, B:130:0x0471, B:132:0x047e, B:134:0x0484, B:135:0x048d, B:136:0x049b, B:138:0x04b0, B:140:0x04c0, B:152:0x04e9, B:153:0x04fe, B:155:0x0529, B:158:0x0541, B:161:0x0584, B:163:0x05b0, B:165:0x05ed, B:166:0x05f2, B:168:0x05fa, B:169:0x05ff, B:171:0x0607, B:172:0x060c, B:174:0x061c, B:176:0x0624, B:177:0x0629, B:179:0x0632, B:180:0x0636, B:182:0x0643, B:183:0x0648, B:185:0x066f, B:187:0x0677, B:188:0x067c, B:190:0x0684, B:191:0x0687, B:193:0x069f, B:196:0x06a7, B:197:0x06c1, B:199:0x06c7, B:201:0x06db, B:203:0x06e7, B:205:0x06f4, B:209:0x070e, B:210:0x071e, B:214:0x0727, B:215:0x072a, B:217:0x0748, B:219:0x074c, B:221:0x075e, B:223:0x0762, B:225:0x076d, B:226:0x0778, B:228:0x07b7, B:230:0x07c1, B:231:0x07c4, B:233:0x07d1, B:235:0x07f3, B:236:0x0800, B:237:0x0836, B:239:0x083e, B:241:0x0848, B:242:0x0855, B:244:0x085f, B:245:0x086c, B:246:0x0878, B:248:0x087e, B:250:0x08ae, B:251:0x08f4, B:252:0x08ff, B:253:0x090b, B:255:0x0911, B:264:0x095e, B:265:0x09ac, B:267:0x09bd, B:281:0x0a21, B:270:0x09d5, B:272:0x09d9, B:258:0x091e, B:260:0x0948, B:276:0x09f2, B:277:0x0a09, B:280:0x0a0c, B:162:0x05a2, B:149:0x04d1, B:90:0x02f6, B:91:0x02fd, B:93:0x0303, B:95:0x030f, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:54:0x019e, B:61:0x01dc, B:63:0x01e2, B:65:0x01f0, B:67:0x0205, B:70:0x020c, B:84:0x02a5, B:86:0x02b0, B:72:0x0234, B:73:0x0253, B:75:0x025c, B:83:0x0289, B:82:0x0276, B:57:0x01ac, B:60:0x01d2), top: B:294:0x0124, inners: #0, #2, #9 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x020b  */
    /* JADX WARN: Code duplicated, block: B:70:0x020c A[Catch: all -> 0x0a54, TryCatch #3 {all -> 0x0a54, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:87:0x02e0, B:96:0x0316, B:98:0x0359, B:100:0x035e, B:101:0x0375, B:105:0x0388, B:107:0x039f, B:109:0x03a6, B:110:0x03bd, B:115:0x03e7, B:119:0x040a, B:120:0x0421, B:124:0x0434, B:127:0x0453, B:128:0x0467, B:130:0x0471, B:132:0x047e, B:134:0x0484, B:135:0x048d, B:136:0x049b, B:138:0x04b0, B:140:0x04c0, B:152:0x04e9, B:153:0x04fe, B:155:0x0529, B:158:0x0541, B:161:0x0584, B:163:0x05b0, B:165:0x05ed, B:166:0x05f2, B:168:0x05fa, B:169:0x05ff, B:171:0x0607, B:172:0x060c, B:174:0x061c, B:176:0x0624, B:177:0x0629, B:179:0x0632, B:180:0x0636, B:182:0x0643, B:183:0x0648, B:185:0x066f, B:187:0x0677, B:188:0x067c, B:190:0x0684, B:191:0x0687, B:193:0x069f, B:196:0x06a7, B:197:0x06c1, B:199:0x06c7, B:201:0x06db, B:203:0x06e7, B:205:0x06f4, B:209:0x070e, B:210:0x071e, B:214:0x0727, B:215:0x072a, B:217:0x0748, B:219:0x074c, B:221:0x075e, B:223:0x0762, B:225:0x076d, B:226:0x0778, B:228:0x07b7, B:230:0x07c1, B:231:0x07c4, B:233:0x07d1, B:235:0x07f3, B:236:0x0800, B:237:0x0836, B:239:0x083e, B:241:0x0848, B:242:0x0855, B:244:0x085f, B:245:0x086c, B:246:0x0878, B:248:0x087e, B:250:0x08ae, B:251:0x08f4, B:252:0x08ff, B:253:0x090b, B:255:0x0911, B:264:0x095e, B:265:0x09ac, B:267:0x09bd, B:281:0x0a21, B:270:0x09d5, B:272:0x09d9, B:258:0x091e, B:260:0x0948, B:276:0x09f2, B:277:0x0a09, B:280:0x0a0c, B:162:0x05a2, B:149:0x04d1, B:90:0x02f6, B:91:0x02fd, B:93:0x0303, B:95:0x030f, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:54:0x019e, B:61:0x01dc, B:63:0x01e2, B:65:0x01f0, B:67:0x0205, B:70:0x020c, B:84:0x02a5, B:86:0x02b0, B:72:0x0234, B:73:0x0253, B:75:0x025c, B:83:0x0289, B:82:0x0276, B:57:0x01ac, B:60:0x01d2), top: B:294:0x0124, inners: #0, #2, #9 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0234 A[Catch: all -> 0x0a54, TRY_LEAVE, TryCatch #3 {all -> 0x0a54, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:87:0x02e0, B:96:0x0316, B:98:0x0359, B:100:0x035e, B:101:0x0375, B:105:0x0388, B:107:0x039f, B:109:0x03a6, B:110:0x03bd, B:115:0x03e7, B:119:0x040a, B:120:0x0421, B:124:0x0434, B:127:0x0453, B:128:0x0467, B:130:0x0471, B:132:0x047e, B:134:0x0484, B:135:0x048d, B:136:0x049b, B:138:0x04b0, B:140:0x04c0, B:152:0x04e9, B:153:0x04fe, B:155:0x0529, B:158:0x0541, B:161:0x0584, B:163:0x05b0, B:165:0x05ed, B:166:0x05f2, B:168:0x05fa, B:169:0x05ff, B:171:0x0607, B:172:0x060c, B:174:0x061c, B:176:0x0624, B:177:0x0629, B:179:0x0632, B:180:0x0636, B:182:0x0643, B:183:0x0648, B:185:0x066f, B:187:0x0677, B:188:0x067c, B:190:0x0684, B:191:0x0687, B:193:0x069f, B:196:0x06a7, B:197:0x06c1, B:199:0x06c7, B:201:0x06db, B:203:0x06e7, B:205:0x06f4, B:209:0x070e, B:210:0x071e, B:214:0x0727, B:215:0x072a, B:217:0x0748, B:219:0x074c, B:221:0x075e, B:223:0x0762, B:225:0x076d, B:226:0x0778, B:228:0x07b7, B:230:0x07c1, B:231:0x07c4, B:233:0x07d1, B:235:0x07f3, B:236:0x0800, B:237:0x0836, B:239:0x083e, B:241:0x0848, B:242:0x0855, B:244:0x085f, B:245:0x086c, B:246:0x0878, B:248:0x087e, B:250:0x08ae, B:251:0x08f4, B:252:0x08ff, B:253:0x090b, B:255:0x0911, B:264:0x095e, B:265:0x09ac, B:267:0x09bd, B:281:0x0a21, B:270:0x09d5, B:272:0x09d9, B:258:0x091e, B:260:0x0948, B:276:0x09f2, B:277:0x0a09, B:280:0x0a0c, B:162:0x05a2, B:149:0x04d1, B:90:0x02f6, B:91:0x02fd, B:93:0x0303, B:95:0x030f, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:54:0x019e, B:61:0x01dc, B:63:0x01e2, B:65:0x01f0, B:67:0x0205, B:70:0x020c, B:84:0x02a5, B:86:0x02b0, B:72:0x0234, B:73:0x0253, B:75:0x025c, B:83:0x0289, B:82:0x0276, B:57:0x01ac, B:60:0x01d2), top: B:294:0x0124, inners: #0, #2, #9 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x02b0 A[Catch: all -> 0x0a54, TryCatch #3 {all -> 0x0a54, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:87:0x02e0, B:96:0x0316, B:98:0x0359, B:100:0x035e, B:101:0x0375, B:105:0x0388, B:107:0x039f, B:109:0x03a6, B:110:0x03bd, B:115:0x03e7, B:119:0x040a, B:120:0x0421, B:124:0x0434, B:127:0x0453, B:128:0x0467, B:130:0x0471, B:132:0x047e, B:134:0x0484, B:135:0x048d, B:136:0x049b, B:138:0x04b0, B:140:0x04c0, B:152:0x04e9, B:153:0x04fe, B:155:0x0529, B:158:0x0541, B:161:0x0584, B:163:0x05b0, B:165:0x05ed, B:166:0x05f2, B:168:0x05fa, B:169:0x05ff, B:171:0x0607, B:172:0x060c, B:174:0x061c, B:176:0x0624, B:177:0x0629, B:179:0x0632, B:180:0x0636, B:182:0x0643, B:183:0x0648, B:185:0x066f, B:187:0x0677, B:188:0x067c, B:190:0x0684, B:191:0x0687, B:193:0x069f, B:196:0x06a7, B:197:0x06c1, B:199:0x06c7, B:201:0x06db, B:203:0x06e7, B:205:0x06f4, B:209:0x070e, B:210:0x071e, B:214:0x0727, B:215:0x072a, B:217:0x0748, B:219:0x074c, B:221:0x075e, B:223:0x0762, B:225:0x076d, B:226:0x0778, B:228:0x07b7, B:230:0x07c1, B:231:0x07c4, B:233:0x07d1, B:235:0x07f3, B:236:0x0800, B:237:0x0836, B:239:0x083e, B:241:0x0848, B:242:0x0855, B:244:0x085f, B:245:0x086c, B:246:0x0878, B:248:0x087e, B:250:0x08ae, B:251:0x08f4, B:252:0x08ff, B:253:0x090b, B:255:0x0911, B:264:0x095e, B:265:0x09ac, B:267:0x09bd, B:281:0x0a21, B:270:0x09d5, B:272:0x09d9, B:258:0x091e, B:260:0x0948, B:276:0x09f2, B:277:0x0a09, B:280:0x0a0c, B:162:0x05a2, B:149:0x04d1, B:90:0x02f6, B:91:0x02fd, B:93:0x0303, B:95:0x030f, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:54:0x019e, B:61:0x01dc, B:63:0x01e2, B:65:0x01f0, B:67:0x0205, B:70:0x020c, B:84:0x02a5, B:86:0x02b0, B:72:0x0234, B:73:0x0253, B:75:0x025c, B:83:0x0289, B:82:0x0276, B:57:0x01ac, B:60:0x01d2), top: B:294:0x0124, inners: #0, #2, #9 }] */
    final void zzY(zzaw zzawVar, zzq zzqVar) {
        String strZzg;
        long jLongValue;
        String upperCase;
        String strConcat;
        zzle zzleVarZzp;
        zzam zzamVar;
        zzle zzleVar;
        Object obj;
        zzle zzleVar2;
        zzam zzamVar2;
        Object obj2;
        double dDoubleValue;
        long length;
        String str;
        String str2;
        long jDelete;
        zzar zzarVar;
        String str3;
        zzas zzasVarZzc;
        com.google.android.gms.internal.measurement.zzgb zzgbVarZzt;
        ArrayList arrayList;
        zzam zzamVar3;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        long jZzd;
        ContentValues contentValues;
        String str4;
        zzat zzatVar;
        int i;
        String str5 = "metadata_fingerprint";
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        long jNanoTime = System.nanoTime();
        zzaz().zzg();
        zzB();
        String str6 = zzqVar.zza;
        zzal(this.zzi);
        if (!zzlb.zzA(zzawVar, zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        zzfp zzfpVar = this.zzc;
        zzal(zzfpVar);
        String str7 = "_err";
        if (zzfpVar.zzr(str6, zzawVar.zza)) {
            zzay().zzk().zzc("Dropping blocked event. appId", zzeo.zzn(str6), this.zzn.zzj().zzd(zzawVar.zza));
            zzfp zzfpVar2 = this.zzc;
            zzal(zzfpVar2);
            if (!zzfpVar2.zzp(str6)) {
                zzfp zzfpVar3 = this.zzc;
                zzal(zzfpVar3);
                if (!zzfpVar3.zzs(str6)) {
                    if ("_err".equals(zzawVar.zza)) {
                        return;
                    }
                    zzv().zzN(this.zzF, str6, 11, "_ev", zzawVar.zza, 0);
                    return;
                }
            }
            zzam zzamVar4 = this.zze;
            zzal(zzamVar4);
            zzh zzhVarZzj = zzamVar4.zzj(str6);
            if (zzhVarZzj != null) {
                long jAbs = Math.abs(zzav().currentTimeMillis() - Math.max(zzhVarZzj.zzl(), zzhVarZzj.zzc()));
                zzg();
                if (jAbs > ((Long) zzeb.zzy.zza(null)).longValue()) {
                    zzay().zzc().zza("Fetching config for blocked app");
                    zzD(zzhVarZzj);
                    return;
                }
                return;
            }
            return;
        }
        zzep zzepVarZzb = zzep.zzb(zzawVar);
        zzv().zzM(zzepVarZzb, zzg().zzd(str6));
        zzaw zzawVarZza = zzepVarZzb.zza();
        if (Log.isLoggable(zzay().zzq(), 2)) {
            zzay().zzj().zzb("Logging event", this.zzn.zzj().zzc(zzawVarZza));
        }
        zzam zzamVar5 = this.zze;
        zzal(zzamVar5);
        zzamVar5.zzw();
        try {
            zzd(zzqVar);
            boolean z = "ecommerce_purchase".equals(zzawVarZza.zza) || "purchase".equals(zzawVarZza.zza) || "refund".equals(zzawVarZza.zza);
            if ("_iap".equals(zzawVarZza.zza)) {
                strZzg = zzawVarZza.zzb.zzg("currency");
                if (z) {
                    dDoubleValue = zzawVarZza.zzb.zzd("value").doubleValue() * 1000000.0d;
                    if (dDoubleValue == 0.0d) {
                        double dLongValue = zzawVarZza.zzb.zze("value").longValue();
                        Double.isNaN(dLongValue);
                        dDoubleValue = dLongValue * 1000000.0d;
                    }
                    if (dDoubleValue <= 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                        zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeo.zzn(str6), Double.valueOf(dDoubleValue));
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zzC();
                        zzam zzamVar7 = this.zze;
                        zzal(zzamVar7);
                        zzamVar7.zzx();
                        return;
                    }
                    jLongValue = Math.round(dDoubleValue);
                    if ("refund".equals(zzawVarZza.zza)) {
                        jLongValue = -jLongValue;
                    }
                } else {
                    jLongValue = zzawVarZza.zzb.zze("value").longValue();
                }
                if (TextUtils.isEmpty(strZzg)) {
                    str5 = "metadata_fingerprint";
                    str7 = "_err";
                    obj = null;
                } else {
                    upperCase = strZzg.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        strConcat = "_ltv_".concat(String.valueOf(upperCase));
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        zzleVarZzp = zzamVar8.zzp(str6, strConcat);
                        if (zzleVarZzp != null) {
                            obj2 = zzleVarZzp.zze;
                            if (obj2 instanceof Long) {
                                obj = null;
                                zzleVar = new zzle(str6, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(((Long) obj2).longValue() + jLongValue));
                            } else {
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                int iZze = zzg().zze(str6, zzeb.zzD) - 1;
                                Preconditions.checkNotEmpty(str6);
                                zzamVar.zzg();
                                zzamVar.zzW();
                                try {
                                    SQLiteDatabase sQLiteDatabaseZzh = zzamVar.zzh();
                                    String[] strArr = new String[3];
                                    try {
                                        strArr[0] = str6;
                                        strArr[1] = str6;
                                        strArr[2] = String.valueOf(iZze);
                                        sQLiteDatabaseZzh.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr);
                                    } catch (SQLiteException e) {
                                        e = e;
                                        zzamVar.zzs.zzay().zzd().zzc("Error pruning currencies. appId", zzeo.zzn(str6), e);
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                }
                                obj = null;
                                zzleVar = new zzle(str6, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                            }
                        } else {
                            zzamVar = this.zze;
                            zzal(zzamVar);
                            int iZze2 = zzg().zze(str6, zzeb.zzD) - 1;
                            Preconditions.checkNotEmpty(str6);
                            zzamVar.zzg();
                            zzamVar.zzW();
                            SQLiteDatabase sQLiteDatabaseZzh2 = zzamVar.zzh();
                            String[] strArr2 = new String[3];
                            strArr2[0] = str6;
                            strArr2[1] = str6;
                            strArr2[2] = String.valueOf(iZze2);
                            sQLiteDatabaseZzh2.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr2);
                            obj = null;
                            zzleVar = new zzle(str6, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                        }
                        zzleVar2 = zzleVar;
                        zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        if (!zzamVar2.zzL(zzleVar2)) {
                            zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeo.zzn(str6), this.zzn.zzj().zzf(zzleVar2.zzc), zzleVar2.zze);
                            zzv().zzN(this.zzF, str6, 9, null, null, 0);
                        }
                    } else {
                        str5 = "metadata_fingerprint";
                        str7 = "_err";
                        obj = null;
                    }
                }
            } else if (z) {
                z = true;
                strZzg = zzawVarZza.zzb.zzg("currency");
                if (z) {
                    dDoubleValue = zzawVarZza.zzb.zzd("value").doubleValue() * 1000000.0d;
                    if (dDoubleValue == 0.0d) {
                        double dLongValue2 = zzawVarZza.zzb.zze("value").longValue();
                        Double.isNaN(dLongValue2);
                        dDoubleValue = dLongValue2 * 1000000.0d;
                    }
                    if (dDoubleValue <= 9.223372036854776E18d) {
                    }
                    zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeo.zzn(str6), Double.valueOf(dDoubleValue));
                    zzam zzamVar9 = this.zze;
                    zzal(zzamVar9);
                    zzamVar9.zzC();
                    zzam zzamVar10 = this.zze;
                    zzal(zzamVar10);
                    zzamVar10.zzx();
                    return;
                }
                jLongValue = zzawVarZza.zzb.zze("value").longValue();
                if (TextUtils.isEmpty(strZzg)) {
                    upperCase = strZzg.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        strConcat = "_ltv_".concat(String.valueOf(upperCase));
                        zzam zzamVar11 = this.zze;
                        zzal(zzamVar11);
                        zzleVarZzp = zzamVar11.zzp(str6, strConcat);
                        if (zzleVarZzp != null) {
                            obj2 = zzleVarZzp.zze;
                            if (obj2 instanceof Long) {
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                int iZze3 = zzg().zze(str6, zzeb.zzD) - 1;
                                Preconditions.checkNotEmpty(str6);
                                zzamVar.zzg();
                                zzamVar.zzW();
                                SQLiteDatabase sQLiteDatabaseZzh3 = zzamVar.zzh();
                                String[] strArr3 = new String[3];
                                strArr3[0] = str6;
                                strArr3[1] = str6;
                                strArr3[2] = String.valueOf(iZze3);
                                sQLiteDatabaseZzh3.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr3);
                                obj = null;
                                zzleVar = new zzle(str6, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                            } else {
                                obj = null;
                                zzleVar = new zzle(str6, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(((Long) obj2).longValue() + jLongValue));
                            }
                        } else {
                            zzamVar = this.zze;
                            zzal(zzamVar);
                            int iZze4 = zzg().zze(str6, zzeb.zzD) - 1;
                            Preconditions.checkNotEmpty(str6);
                            zzamVar.zzg();
                            zzamVar.zzW();
                            SQLiteDatabase sQLiteDatabaseZzh4 = zzamVar.zzh();
                            String[] strArr4 = new String[3];
                            strArr4[0] = str6;
                            strArr4[1] = str6;
                            strArr4[2] = String.valueOf(iZze4);
                            sQLiteDatabaseZzh4.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr4);
                            obj = null;
                            zzleVar = new zzle(str6, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                        }
                        zzleVar2 = zzleVar;
                        zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        if (!zzamVar2.zzL(zzleVar2)) {
                            zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeo.zzn(str6), this.zzn.zzj().zzf(zzleVar2.zzc), zzleVar2.zze);
                            zzv().zzN(this.zzF, str6, 9, null, null, 0);
                        }
                    } else {
                        str5 = "metadata_fingerprint";
                        str7 = "_err";
                        obj = null;
                    }
                } else {
                    str5 = "metadata_fingerprint";
                    str7 = "_err";
                    obj = null;
                }
            } else {
                str5 = "metadata_fingerprint";
                str7 = "_err";
                obj = null;
            }
            boolean zZzai = zzlh.zzai(zzawVarZza.zza);
            boolean zEquals = str7.equals(zzawVarZza.zza);
            zzv();
            zzau zzauVar = zzawVarZza.zzb;
            if (zzauVar == null) {
                length = 0;
            } else {
                zzat zzatVar2 = new zzat(zzauVar);
                length = 0;
                while (zzatVar2.hasNext()) {
                    Object objZzf = zzauVar.zzf(zzatVar2.next());
                    if (objZzf instanceof Parcelable[]) {
                        length += (long) ((Parcelable[]) objZzf).length;
                    }
                }
            }
            zzam zzamVar12 = this.zze;
            zzal(zzamVar12);
            zzak zzakVarZzm = zzamVar12.zzm(zza(), str6, length + 1, true, zZzai, false, zEquals, false);
            long j = zzakVarZzm.zzb;
            zzg();
            long jIntValue = j - ((long) ((Integer) zzeb.zzj.zza(obj)).intValue());
            if (jIntValue > 0) {
                if (jIntValue % 1000 == 1) {
                    zzay().zzd().zzc("Data loss. Too many events logged. appId, count", zzeo.zzn(str6), Long.valueOf(zzakVarZzm.zzb));
                }
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                zzamVar13.zzC();
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                zzamVar14.zzx();
                return;
            }
            if (zZzai) {
                long j2 = zzakVarZzm.zza;
                zzg();
                long jIntValue2 = j2 - ((long) ((Integer) zzeb.zzl.zza(obj)).intValue());
                if (jIntValue2 > 0) {
                    if (jIntValue2 % 1000 == 1) {
                        zzay().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeo.zzn(str6), Long.valueOf(zzakVarZzm.zza));
                    }
                    zzv().zzN(this.zzF, str6, 16, "_ev", zzawVarZza.zza, 0);
                    zzam zzamVar15 = this.zze;
                    zzal(zzamVar15);
                    zzamVar15.zzC();
                    zzam zzamVar16 = this.zze;
                    zzal(zzamVar16);
                    zzamVar16.zzx();
                    return;
                }
            }
            if (zEquals) {
                str = str6;
                long jMax = zzakVarZzm.zzd - ((long) Math.max(0, Math.min(DurationKt.NANOS_IN_MILLIS, zzg().zze(zzqVar.zza, zzeb.zzk))));
                if (jMax > 0) {
                    if (jMax == 1) {
                        zzay().zzd().zzc("Too many error events logged. appId, count", zzeo.zzn(str), Long.valueOf(zzakVarZzm.zzd));
                    }
                    zzam zzamVar17 = this.zze;
                    zzal(zzamVar17);
                    zzamVar17.zzC();
                    zzam zzamVar18 = this.zze;
                    zzal(zzamVar18);
                    zzamVar18.zzx();
                    return;
                }
            } else {
                str = str6;
            }
            Bundle bundleZzc = zzawVarZza.zzb.zzc();
            zzv().zzO(bundleZzc, "_o", zzawVarZza.zzc);
            String str8 = str;
            if (zzv().zzae(str8)) {
                zzv().zzO(bundleZzc, "_dbg", 1L);
                zzv().zzO(bundleZzc, "_r", 1L);
            }
            if ("_s".equals(zzawVarZza.zza)) {
                zzam zzamVar19 = this.zze;
                zzal(zzamVar19);
                zzle zzleVarZzp2 = zzamVar19.zzp(zzqVar.zza, "_sno");
                if (zzleVarZzp2 != null && (zzleVarZzp2.zze instanceof Long)) {
                    zzv().zzO(bundleZzc, "_sno", zzleVarZzp2.zze);
                }
            }
            zzam zzamVar20 = this.zze;
            zzal(zzamVar20);
            Preconditions.checkNotEmpty(str8);
            zzamVar20.zzg();
            zzamVar20.zzW();
            try {
                try {
                    try {
                        try {
                            str2 = "raw_events";
                            try {
                                jDelete = zzamVar20.zzh().delete(str2, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str8, String.valueOf(Math.max(0, Math.min(DurationKt.NANOS_IN_MILLIS, zzamVar20.zzs.zzf().zze(str8, zzeb.zzo))))});
                                while (true) {
                                    if (!zzatVar.hasNext()) {
                                        zzfp zzfpVar4 = this.zzc;
                                        zzal(zzfpVar4);
                                        boolean zZzq = zzfpVar4.zzq(zzarVar.zza, zzarVar.zzb);
                                        zzam zzamVar21 = this.zze;
                                        zzal(zzamVar21);
                                        zzak zzakVarZzl = zzamVar21.zzl(zza(), zzarVar.zza, false, false, false, false, false);
                                        if (!zZzq || zzakVarZzl.zze >= zzg().zze(zzarVar.zza, zzeb.zzn)) {
                                            i = 0;
                                            break;
                                        }
                                    } else if ("_r".equals(zzatVar.next())) {
                                    }
                                    i = 1;
                                    break;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                zzamVar20.zzs.zzay().zzd().zzc("Error deleting over the limit events. appId", zzeo.zzn(str8), e);
                                jDelete = 0;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            str2 = "raw_events";
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        str2 = "raw_events";
                    }
                    zzamVar3.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                    zzam zzamVar22 = this.zze;
                    zzal(zzamVar22);
                    zzatVar = new zzat(zzarVar.zzf);
                    zzamVar22.zzg();
                    zzamVar22.zzW();
                    Preconditions.checkNotNull(zzarVar);
                    Preconditions.checkNotEmpty(zzarVar.zza);
                    zzlb zzlbVar = zzamVar22.zzf.zzi;
                    zzal(zzlbVar);
                    byte[] bArrZzbv = zzlbVar.zzj(zzarVar).zzbv();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", zzarVar.zza);
                    contentValues2.put("name", zzarVar.zzb);
                    contentValues2.put("timestamp", Long.valueOf(zzarVar.zzd));
                    contentValues2.put(str4, Long.valueOf(jZzd));
                    contentValues2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzbv);
                    contentValues2.put("realtime", Integer.valueOf(i));
                    try {
                        if (zzamVar22.zzh().insert(str3, null, contentValues2) == -1) {
                            zzamVar22.zzs.zzay().zzd().zzb("Failed to insert raw event (got -1). appId", zzeo.zzn(zzarVar.zza));
                        } else {
                            this.zza = 0L;
                        }
                    } catch (SQLiteException e6) {
                        zzamVar22.zzs.zzay().zzd().zzc("Error storing raw event. appId", zzeo.zzn(zzarVar.zza), e6);
                    }
                    zzam zzamVar23 = this.zze;
                    zzal(zzamVar23);
                    zzamVar23.zzC();
                    zzam zzamVar24 = this.zze;
                    zzal(zzamVar24);
                    zzamVar24.zzx();
                    zzag();
                    zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                    return;
                } catch (SQLiteException e7) {
                    zzamVar3.zzs.zzay().zzd().zzc("Error storing raw event metadata. appId", zzeo.zzn(zzgcVar.zzx()), e7);
                    throw e7;
                }
                zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzgbVarZzt.zzaE();
                zzamVar3.zzg();
                zzamVar3.zzW();
                Preconditions.checkNotNull(zzgcVar);
                Preconditions.checkNotEmpty(zzgcVar.zzx());
                byte[] bArrZzbv2 = zzgcVar.zzbv();
                zzlb zzlbVar2 = zzamVar3.zzf.zzi;
                zzal(zzlbVar2);
                jZzd = zzlbVar2.zzd(bArrZzbv2);
                contentValues = new ContentValues();
                contentValues.put("app_id", zzgcVar.zzx());
                str4 = str5;
                contentValues.put(str4, Long.valueOf(jZzd));
                contentValues.put("metadata", bArrZzbv2);
            } catch (IOException e8) {
                zzay().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", zzeo.zzn(zzgbVarZzt.zzap()), e8);
            }
            if (jDelete > 0) {
                zzay().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeo.zzn(str8), Long.valueOf(jDelete));
            }
            zzfy zzfyVar = this.zzn;
            String str9 = zzawVarZza.zzc;
            String str10 = zzawVarZza.zza;
            long j3 = zzawVarZza.zzd;
            str3 = str2;
            zzarVar = new zzar(zzfyVar, str9, str8, str10, j3, 0L, bundleZzc);
            zzam zzamVar25 = this.zze;
            zzal(zzamVar25);
            zzas zzasVarZzn = zzamVar25.zzn(str8, zzarVar.zzb);
            if (zzasVarZzn == null) {
                zzam zzamVar26 = this.zze;
                zzal(zzamVar26);
                if (zzamVar26.zzf(str8) >= zzg().zzb(str8) && zZzai) {
                    zzay().zzd().zzd("Too many event names used, ignoring event. appId, name, supported count", zzeo.zzn(str8), this.zzn.zzj().zzd(zzarVar.zzb), Integer.valueOf(zzg().zzb(str8)));
                    zzv().zzN(this.zzF, str8, 8, null, null, 0);
                    zzam zzamVar27 = this.zze;
                    zzal(zzamVar27);
                    zzamVar27.zzx();
                    return;
                }
                zzasVarZzc = new zzas(str8, zzarVar.zzb, 0L, 0L, 0L, zzarVar.zzd, 0L, null, null, null, null);
            } else {
                zzarVar = zzarVar.zza(this.zzn, zzasVarZzn.zzf);
                zzasVarZzc = zzasVarZzn.zzc(zzarVar.zzd);
            }
            zzam zzamVar28 = this.zze;
            zzal(zzamVar28);
            zzamVar28.zzE(zzasVarZzc);
            zzaz().zzg();
            zzB();
            Preconditions.checkNotNull(zzarVar);
            Preconditions.checkNotNull(zzqVar);
            Preconditions.checkNotEmpty(zzarVar.zza);
            Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
            zzgbVarZzt = com.google.android.gms.internal.measurement.zzgc.zzt();
            zzgbVarZzt.zzad(1);
            zzgbVarZzt.zzZ("android");
            if (!TextUtils.isEmpty(zzqVar.zza)) {
                zzgbVarZzt.zzD(zzqVar.zza);
            }
            if (!TextUtils.isEmpty(zzqVar.zzd)) {
                zzgbVarZzt.zzF(zzqVar.zzd);
            }
            if (!TextUtils.isEmpty(zzqVar.zzc)) {
                zzgbVarZzt.zzG(zzqVar.zzc);
            }
            zzoz.zzc();
            if (zzg().zzs(null, zzeb.zzar) && !TextUtils.isEmpty(zzqVar.zzx)) {
                zzgbVarZzt.zzah(zzqVar.zzx);
            }
            long j4 = zzqVar.zzj;
            if (j4 != -2147483648L) {
                zzgbVarZzt.zzH((int) j4);
            }
            zzgbVarZzt.zzV(zzqVar.zze);
            if (!TextUtils.isEmpty(zzqVar.zzb)) {
                zzgbVarZzt.zzU(zzqVar.zzb);
            }
            zzgbVarZzt.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
            if (zzgbVarZzt.zzaq().isEmpty() && !TextUtils.isEmpty(zzqVar.zzq)) {
                zzgbVarZzt.zzC(zzqVar.zzq);
            }
            long j5 = zzqVar.zzf;
            if (j5 != 0) {
                zzgbVarZzt.zzM(j5);
            }
            zzgbVarZzt.zzP(zzqVar.zzs);
            zzlb zzlbVar3 = this.zzi;
            zzal(zzlbVar3);
            Map mapZzc = zzeb.zzc(zzlbVar3.zzf.zzn.zzau());
            if (mapZzc == null || mapZzc.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                int iIntValue = ((Integer) zzeb.zzO.zza(null)).intValue();
                for (Map.Entry entry : mapZzc.entrySet()) {
                    if (((String) entry.getKey()).startsWith("measurement.id.")) {
                        try {
                            int i2 = Integer.parseInt((String) entry.getValue());
                            if (i2 != 0) {
                                arrayList.add(Integer.valueOf(i2));
                                if (arrayList.size() >= iIntValue) {
                                    zzlbVar3.zzs.zzay().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                    break;
                                }
                                continue;
                            } else {
                                continue;
                            }
                        } catch (NumberFormatException e9) {
                            zzlbVar3.zzs.zzay().zzk().zzb("Experiment ID NumberFormatException", e9);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                zzgbVarZzt.zzh(arrayList);
            }
            zzai zzaiVarZzc = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
            if (zzaiVarZzc.zzi(zzah.AD_STORAGE) && zzqVar.zzo) {
                Pair pairZzd = this.zzk.zzd(zzqVar.zza, zzaiVarZzc);
                if (!TextUtils.isEmpty((CharSequence) pairZzd.first) && zzqVar.zzo) {
                    zzgbVarZzt.zzae((String) pairZzd.first);
                    if (pairZzd.second != null) {
                        zzgbVarZzt.zzX(((Boolean) pairZzd.second).booleanValue());
                    }
                }
            }
            this.zzn.zzg().zzu();
            zzgbVarZzt.zzN(Build.MODEL);
            this.zzn.zzg().zzu();
            zzgbVarZzt.zzY(Build.VERSION.RELEASE);
            zzgbVarZzt.zzaj((int) this.zzn.zzg().zzb());
            zzgbVarZzt.zzan(this.zzn.zzg().zzc());
            if (this.zzn.zzJ()) {
                zzgbVarZzt.zzap();
                if (!TextUtils.isEmpty(null)) {
                    zzgbVarZzt.zzO(null);
                }
            }
            zzam zzamVar29 = this.zze;
            zzal(zzamVar29);
            zzh zzhVarZzj2 = zzamVar29.zzj(zzqVar.zza);
            if (zzhVarZzj2 == null) {
                zzhVarZzj2 = new zzh(this.zzn, zzqVar.zza);
                zzhVarZzj2.zzH(zzw(zzaiVarZzc));
                zzhVarZzj2.zzV(zzqVar.zzk);
                zzhVarZzj2.zzW(zzqVar.zzb);
                if (zzaiVarZzc.zzi(zzah.AD_STORAGE)) {
                    zzhVarZzj2.zzae(this.zzk.zzf(zzqVar.zza, zzqVar.zzo));
                }
                zzhVarZzj2.zzaa(0L);
                zzhVarZzj2.zzab(0L);
                zzhVarZzj2.zzZ(0L);
                zzhVarZzj2.zzJ(zzqVar.zzc);
                zzhVarZzj2.zzK(zzqVar.zzj);
                zzhVarZzj2.zzI(zzqVar.zzd);
                zzhVarZzj2.zzX(zzqVar.zze);
                zzhVarZzj2.zzS(zzqVar.zzf);
                zzhVarZzj2.zzac(zzqVar.zzh);
                zzhVarZzj2.zzT(zzqVar.zzs);
                zzam zzamVar30 = this.zze;
                zzal(zzamVar30);
                zzamVar30.zzD(zzhVarZzj2);
            }
            if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzhVarZzj2.zzu())) {
                zzgbVarZzt.zzE((String) Preconditions.checkNotNull(zzhVarZzj2.zzu()));
            }
            if (!TextUtils.isEmpty(zzhVarZzj2.zzx())) {
                zzgbVarZzt.zzT((String) Preconditions.checkNotNull(zzhVarZzj2.zzx()));
            }
            zzam zzamVar31 = this.zze;
            zzal(zzamVar31);
            List listZzu = zzamVar31.zzu(zzqVar.zza);
            for (int i3 = 0; i3 < listZzu.size(); i3++) {
                com.google.android.gms.internal.measurement.zzgk zzgkVarZzd = com.google.android.gms.internal.measurement.zzgl.zzd();
                zzgkVarZzd.zzf(((zzle) listZzu.get(i3)).zzc);
                zzgkVarZzd.zzg(((zzle) listZzu.get(i3)).zzd);
                zzlb zzlbVar4 = this.zzi;
                zzal(zzlbVar4);
                zzlbVar4.zzu(zzgkVarZzd, ((zzle) listZzu.get(i3)).zze);
                zzgbVarZzt.zzl(zzgkVarZzd);
            }
        } catch (Throwable th) {
            zzam zzamVar32 = this.zze;
            zzal(zzamVar32);
            zzamVar32.zzx();
            throw th;
        }
    }

    final boolean zzZ() {
        zzaz().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzay().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzs.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzau().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzw = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzay().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzay().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzay().zzd().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzay().zzd().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzay().zzk().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    final long zza() {
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzju zzjuVar = this.zzk;
        zzjuVar.zzW();
        zzjuVar.zzg();
        long jZza = zzjuVar.zze.zza();
        if (jZza == 0) {
            jZza = ((long) zzjuVar.zzs.zzv().zzG().nextInt(86400000)) + 1;
            zzjuVar.zze.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public final Context zzau() {
        return this.zzn.zzau();
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public final Clock zzav() {
        return ((zzfy) Preconditions.checkNotNull(this.zzn)).zzav();
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public final zzab zzaw() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public final zzeo zzay() {
        return ((zzfy) Preconditions.checkNotNull(this.zzn)).zzay();
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public final zzfv zzaz() {
        return ((zzfy) Preconditions.checkNotNull(this.zzn)).zzaz();
    }

    final zzh zzd(zzq zzqVar) {
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzow.zzc();
        zzkx zzkxVar = null;
        if (zzg().zzs(zzqVar.zza, zzeb.zzat) && !zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzky(this, zzqVar.zzw));
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(zzqVar.zza);
        zzai zzaiVarZzc = zzh(zzqVar.zza).zzc(zzai.zzb(zzqVar.zzv));
        String strZzf = zzaiVarZzc.zzi(zzah.AD_STORAGE) ? this.zzk.zzf(zzqVar.zza, zzqVar.zzo) : "";
        if (zzhVarZzj == null) {
            zzhVarZzj = new zzh(this.zzn, zzqVar.zza);
            if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
                zzhVarZzj.zzH(zzw(zzaiVarZzc));
            }
            if (zzaiVarZzc.zzi(zzah.AD_STORAGE)) {
                zzhVarZzj.zzae(strZzf);
            }
        } else if (zzaiVarZzc.zzi(zzah.AD_STORAGE) && strZzf != null && !strZzf.equals(zzhVarZzj.zzA())) {
            zzhVarZzj.zzae(strZzf);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzaiVarZzc).first)) {
                zzhVarZzj.zzH(zzw(zzaiVarZzc));
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                if (zzamVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzle zzleVar = new zzle(zzqVar.zza, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lair", zzav().currentTimeMillis(), 1L);
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzL(zzleVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzhVarZzj.zzu()) && zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
            zzhVarZzj.zzH(zzw(zzaiVarZzc));
        }
        zzhVarZzj.zzW(zzqVar.zzb);
        zzhVarZzj.zzF(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzhVarZzj.zzV(zzqVar.zzk);
        }
        long j = zzqVar.zze;
        if (j != 0) {
            zzhVarZzj.zzX(j);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzhVarZzj.zzJ(zzqVar.zzc);
        }
        zzhVarZzj.zzK(zzqVar.zzj);
        String str = zzqVar.zzd;
        if (str != null) {
            zzhVarZzj.zzI(str);
        }
        zzhVarZzj.zzS(zzqVar.zzf);
        zzhVarZzj.zzac(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzhVarZzj.zzY(zzqVar.zzg);
        }
        zzhVarZzj.zzG(zzqVar.zzo);
        zzhVarZzj.zzad(zzqVar.zzr);
        zzhVarZzj.zzT(zzqVar.zzs);
        zzoz.zzc();
        if (zzg().zzs(null, zzeb.zzar)) {
            zzhVarZzj.zzag(zzqVar.zzx);
        }
        zzns.zzc();
        if (zzg().zzs(null, zzeb.zzaj)) {
            zzhVarZzj.zzaf(zzqVar.zzt);
        } else {
            zzns.zzc();
            if (zzg().zzs(null, zzeb.zzai)) {
                zzhVarZzj.zzaf(null);
            }
        }
        if (zzhVarZzj.zzaj()) {
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzD(zzhVarZzj);
        }
        return zzhVarZzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzfy) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    final zzai zzh(String str) {
        String string;
        zzai zzaiVar = zzai.zza;
        zzaz().zzg();
        zzB();
        zzai zzaiVar2 = (zzai) this.zzB.get(str);
        if (zzaiVar2 != null) {
            return zzaiVar2;
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        zzamVar.zzg();
        zzamVar.zzW();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzamVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } else {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    string = "G1";
                }
                zzai zzaiVarZzb = zzai.zzb(string);
                zzV(str, zzaiVarZzb);
                return zzaiVarZzb;
            } catch (SQLiteException e) {
                zzamVar.zzs.zzay().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final zzam zzi() {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        return zzamVar;
    }

    public final zzej zzj() {
        return this.zzn.zzj();
    }

    public final zzeu zzl() {
        zzeu zzeuVar = this.zzd;
        zzal(zzeuVar);
        return zzeuVar;
    }

    public final zzew zzm() {
        zzew zzewVar = this.zzf;
        if (zzewVar != null) {
            return zzewVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfp zzo() {
        zzfp zzfpVar = this.zzc;
        zzal(zzfpVar);
        return zzfpVar;
    }

    final zzfy zzq() {
        return this.zzn;
    }

    public final zzii zzr() {
        zzii zziiVar = this.zzj;
        zzal(zziiVar);
        return zziiVar;
    }

    public final zzju zzs() {
        return this.zzk;
    }

    public final zzlb zzu() {
        zzlb zzlbVar = this.zzi;
        zzal(zzlbVar);
        return zzlbVar;
    }

    public final zzlh zzv() {
        return ((zzfy) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    final String zzw(zzai zzaiVar) {
        if (!zzaiVar.zzi(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzv().zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String zzx(zzq zzqVar) {
        try {
            return (String) zzaz().zzh(new zzks(this, zzqVar)).get(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzay().zzd().zzc("Failed to get app instance id. appId", zzeo.zzn(zzqVar.zza), e);
            return null;
        }
    }

    final void zzz(Runnable runnable) {
        zzaz().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
