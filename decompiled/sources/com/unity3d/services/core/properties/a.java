package com.unity3d.services.core.properties;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: ClientProperties.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static final X500Principal a = new X500Principal("CN=Android Debug,O=Android,C=US");
    private static WeakReference<Activity> b;
    private static Context c;
    private static Application d;
    private static String e;

    public static Activity a() {
        return b.get();
    }

    public static String b() {
        return c.getPackageName();
    }

    public static String c() {
        String packageName = e().getPackageName();
        PackageManager packageManager = e().getPackageManager();
        try {
            return packageManager.getPackageInfo(packageName, 0).versionName == null ? "FakeVersionName" : packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            com.unity3d.services.core.log.a.a("Error getting package info", e2);
            return null;
        }
    }

    public static Application d() {
        return d;
    }

    public static Context e() {
        return c;
    }

    public static String f() {
        return e;
    }

    public static boolean g() {
        boolean zEquals;
        if (e() == null) {
            return false;
        }
        PackageManager packageManager = e().getPackageManager();
        String packageName = e().getPackageName();
        boolean z = true;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            z = false;
            zEquals = i != 0;
        } catch (PackageManager.NameNotFoundException e2) {
            com.unity3d.services.core.log.a.a("Could not find name", e2);
        }
        if (z) {
            try {
                for (Signature signature : packageManager.getPackageInfo(packageName, 64).signatures) {
                    zEquals = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals(a);
                    if (zEquals) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e3) {
                com.unity3d.services.core.log.a.a("Could not find name", e3);
            } catch (CertificateException e4) {
                com.unity3d.services.core.log.a.a("Certificate exception", e4);
            }
        }
        return zEquals;
    }

    public static void a(Activity activity) {
        b = new WeakReference<>(activity);
    }

    public static void a(Context context) {
        c = context;
    }

    public static void a(Application application) {
        d = application;
    }

    public static void a(String str) {
        e = str;
    }
}
