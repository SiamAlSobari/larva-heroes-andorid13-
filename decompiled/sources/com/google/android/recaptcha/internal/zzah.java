package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzah {
    public static final zzag zza = new zzag(null);
    private static zzkj zzb;
    private final String zzc;
    private final zzs zzd;
    private final zzku zze;
    private final long zzf;

    public zzah(zzaf zzafVar, String str, zzs zzsVar) {
        this.zzc = str;
        this.zzd = zzsVar;
        zzku zzkuVarZzi = zzkx.zzi();
        this.zze = zzkuVarZzi;
        this.zzf = System.currentTimeMillis();
        zzkuVarZzi.zzq(zzafVar.zza());
        zzkuVarZzi.zze(zzafVar.zzb());
        zzkuVarZzi.zzs(zzafVar.zzc());
        zzkuVarZzi.zzv(zzafVar.zzd());
        zzkuVarZzi.zzu(zzka.zzc(zzka.zzb(System.currentTimeMillis())));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:26:0x0047
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private static final com.google.android.recaptcha.internal.zzkj zzd(android.content.Context r8) {
        /*
            java.lang.String r0 = "unknown"
            r1 = 33
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            java.lang.String r3 = "com.google.android.gms.version"
            r4 = -1
            if (r2 < r1) goto L2b
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            java.lang.String r5 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            r6 = 128(0x80, double:6.3E-322)
            android.content.pm.PackageManager$ApplicationInfoFlags r6 = kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            android.content.pm.ApplicationInfo r2 = kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(r2, r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            int r2 = r2.getInt(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            if (r2 != r4) goto L26
            goto L47
        L26:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            goto L48
        L2b:
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            java.lang.String r5 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            int r2 = r2.getInt(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            if (r2 != r4) goto L42
            goto L47
        L42:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47
            goto L48
        L47:
            r2 = r0
        L48:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            if (r3 < r1) goto L67
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            r3 = 0
            android.content.pm.PackageManager$PackageInfoFlags r3 = kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0.m1540m(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            android.content.pm.PackageInfo r8 = kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(r1, r8, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            long r3 = kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            goto L95
        L67:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            r3 = 28
            r4 = 0
            if (r1 < r3) goto L83
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r8, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            long r3 = kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            goto L95
        L83:
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r8, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            int r8 = r8.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
        L95:
            com.google.android.recaptcha.internal.zzki r8 = com.google.android.recaptcha.internal.zzkj.zzf()
            int r1 = android.os.Build.VERSION.SDK_INT
            r8.zzd(r1)
            r8.zzq(r2)
            java.lang.String r1 = "18.1.2"
            r8.zzs(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r8.zzp(r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r8.zzr(r1)
            r8.zze(r0)
            com.google.android.recaptcha.internal.zzgo r8 = r8.zzj()
            com.google.android.recaptcha.internal.zzkj r8 = (com.google.android.recaptcha.internal.zzkj) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzah.zzd(android.content.Context):com.google.android.recaptcha.internal.zzkj");
    }

    public final long zza() {
        return this.zzf;
    }

    public final zzku zzb() {
        return this.zze;
    }

    public final zzkx zzc(int i, zzkm zzkmVar, Context context) {
        zzku zzkuVar = this.zze;
        zzkuVar.zzp(System.currentTimeMillis() - this.zzf);
        zzkuVar.zzw(i);
        if (zzkmVar != null) {
            this.zze.zzr(zzkmVar);
        }
        if (zzb == null) {
            zzb = zzd(context);
        }
        zzku zzkuVar2 = this.zze;
        zzli zzliVarZzf = zzlj.zzf();
        zzliVarZzf.zzq(this.zzc);
        zzkj zzkjVarZzd = zzb;
        if (zzkjVarZzd == null) {
            zzkjVarZzd = zzd(context);
        }
        zzliVarZzf.zzd(zzkjVarZzd);
        zzliVarZzf.zzp(Locale.getDefault().getISO3Language());
        zzliVarZzf.zze(Locale.getDefault().getISO3Country());
        zzkuVar2.zzt((zzlj) zzliVarZzf.zzj());
        return (zzkx) this.zze.zzj();
    }
}
