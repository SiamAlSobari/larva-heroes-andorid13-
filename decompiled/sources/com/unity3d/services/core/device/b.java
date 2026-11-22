package com.unity3d.services.core.device;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Device.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: compiled from: Device.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0043b.values().length];
            a = iArr;
            try {
                iArr[EnumC0043b.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0043b.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.device.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Device.java */
    public enum EnumC0043b {
        TOTAL_MEMORY,
        FREE_MEMORY
    }

    public static String A() {
        return com.unity3d.services.core.properties.a.e() != null ? ((TelephonyManager) com.unity3d.services.core.properties.a.e().getSystemService("phone")).getNetworkOperator() : "";
    }

    public static String B() {
        return com.unity3d.services.core.properties.a.e() != null ? ((TelephonyManager) com.unity3d.services.core.properties.a.e().getSystemService("phone")).getNetworkOperatorName() : "";
    }

    public static int C() {
        if (com.unity3d.services.core.properties.a.e() == null) {
            return -1;
        }
        try {
            return ((TelephonyManager) com.unity3d.services.core.properties.a.e().getSystemService("phone")).getNetworkType();
        } catch (SecurityException unused) {
            com.unity3d.services.core.log.a.e("Unity Ads was not able to get current network type due to missing permission");
            return -1;
        }
    }

    private static ArrayList<String> D() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(Build.SUPPORTED_ABIS));
        return arrayList;
    }

    private static ArrayList<String> E() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(Build.CPU_ABI);
        arrayList.add(Build.CPU_ABI2);
        return arrayList;
    }

    public static String F() {
        return e.c();
    }

    public static String G() {
        return Build.VERSION.RELEASE;
    }

    public static Map<String, String> H() throws Throwable {
        RandomAccessFile randomAccessFile;
        HashMap map = new HashMap();
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                try {
                    randomAccessFile = new RandomAccessFile("/proc/self/stat", "r");
                    try {
                        map.put("stat", randomAccessFile.readLine());
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e = e;
                        randomAccessFile2 = randomAccessFile;
                        com.unity3d.services.core.log.a.a("Error while reading processor info: ", e);
                        randomAccessFile2.close();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            randomAccessFile.close();
                        } catch (IOException e2) {
                            com.unity3d.services.core.log.a.a("Error closing RandomAccessFile", e2);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
            }
        } catch (IOException e4) {
            com.unity3d.services.core.log.a.a("Error closing RandomAccessFile", e4);
        }
        return map;
    }

    public static String I() {
        return Build.PRODUCT;
    }

    public static int J() {
        if (com.unity3d.services.core.properties.a.e() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) com.unity3d.services.core.properties.a.e().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public static int K() {
        if (com.unity3d.services.core.properties.a.e() != null) {
            return Settings.System.getInt(com.unity3d.services.core.properties.a.e().getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    public static int L() {
        if (com.unity3d.services.core.properties.a.e() != null) {
            return com.unity3d.services.core.properties.a.e().getResources().getDisplayMetrics().densityDpi;
        }
        return -1;
    }

    public static int M() {
        if (com.unity3d.services.core.properties.a.e() != null) {
            return com.unity3d.services.core.properties.a.e().getResources().getDisplayMetrics().heightPixels;
        }
        return -1;
    }

    public static int N() {
        if (com.unity3d.services.core.properties.a.e() != null) {
            return com.unity3d.services.core.properties.a.e().getResources().getConfiguration().screenLayout;
        }
        return -1;
    }

    public static int O() {
        if (com.unity3d.services.core.properties.a.e() != null) {
            return com.unity3d.services.core.properties.a.e().getResources().getDisplayMetrics().widthPixels;
        }
        return -1;
    }

    public static List<Sensor> P() {
        if (com.unity3d.services.core.properties.a.e() != null) {
            return ((SensorManager) com.unity3d.services.core.properties.a.e().getSystemService("sensor")).getSensorList(-1);
        }
        return null;
    }

    public static ArrayList<String> Q() {
        return b() < 21 ? E() : D();
    }

    public static long R() {
        return a(EnumC0043b.TOTAL_MEMORY);
    }

    public static String S() {
        return UUID.randomUUID().toString();
    }

    public static long T() {
        return SystemClock.uptimeMillis();
    }

    public static boolean U() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (com.unity3d.services.core.properties.a.e() == null || (connectivityManager = (ConnectivityManager) com.unity3d.services.core.properties.a.e().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static Boolean V() {
        return b() < 17 ? d0() : c0();
    }

    public static boolean W() {
        return com.unity3d.services.core.device.a.c();
    }

    public static boolean X() {
        return e.b();
    }

    public static boolean Y() {
        try {
            return b("su");
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Rooted check failed", e);
            return false;
        }
    }

    public static boolean Z() {
        Intent intentRegisterReceiver;
        if (com.unity3d.services.core.properties.a.e() == null || (intentRegisterReceiver = com.unity3d.services.core.properties.a.e().registerReceiver(null, new IntentFilter("android.hardware.usb.action.USB_STATE"))) == null) {
            return false;
        }
        return intentRegisterReceiver.getBooleanExtra("connected", false);
    }

    public static String a() {
        return com.unity3d.services.core.device.a.a();
    }

    public static boolean a0() {
        ConnectivityManager connectivityManager;
        if (com.unity3d.services.core.properties.a.e() == null || (connectivityManager = (ConnectivityManager) com.unity3d.services.core.properties.a.e().getSystemService("connectivity")) == null) {
            return false;
        }
        TelephonyManager telephonyManager = (TelephonyManager) com.unity3d.services.core.properties.a.e().getSystemService("phone");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && connectivityManager.getActiveNetworkInfo().isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    public static int b() {
        return Build.VERSION.SDK_INT;
    }

    public static boolean b0() {
        if (com.unity3d.services.core.properties.a.e() != null) {
            return ((AudioManager) com.unity3d.services.core.properties.a.e().getSystemService("audio")).isWiredHeadsetOn();
        }
        return false;
    }

    public static String c() throws Exception {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(com.unity3d.services.core.properties.a.e().getPackageCodePath()));
            try {
                String strA = com.unity3d.services.core.misc.j.a(fileInputStream);
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return strA;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    private static Boolean c0() {
        try {
            return Boolean.valueOf(1 == Settings.Global.getInt(com.unity3d.services.core.properties.a.e().getContentResolver(), "adb_enabled", 0));
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Problems fetching adb enabled status", e);
            return null;
        }
    }

    public static float d() {
        Intent intentRegisterReceiver;
        if (com.unity3d.services.core.properties.a.e() == null || (intentRegisterReceiver = com.unity3d.services.core.properties.a.e().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1.0f;
        }
        return intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / intentRegisterReceiver.getIntExtra("scale", -1);
    }

    private static Boolean d0() {
        try {
            return Boolean.valueOf(1 == Settings.Secure.getInt(com.unity3d.services.core.properties.a.e().getContentResolver(), "adb_enabled", 0));
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Problems fetching adb enabled status", e);
            return null;
        }
    }

    public static int e() {
        Intent intentRegisterReceiver;
        if (com.unity3d.services.core.properties.a.e() == null || (intentRegisterReceiver = com.unity3d.services.core.properties.a.e().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1;
        }
        return intentRegisterReceiver.getIntExtra("status", -1);
    }

    public static String f() {
        return Build.BOARD;
    }

    public static String g() {
        return Build.BOOTLOADER;
    }

    public static String h() {
        return Build.BRAND;
    }

    public static String i() {
        return Build.ID;
    }

    public static String j() {
        return Build.VERSION.INCREMENTAL;
    }

    public static long k() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static String l() {
        try {
            Signature[] signatureArr = com.unity3d.services.core.properties.a.e().getPackageManager().getPackageInfo(com.unity3d.services.core.properties.a.e().getPackageName(), 64).signatures;
            if (signatureArr != null && signatureArr.length >= 1) {
                return com.unity3d.services.core.misc.j.b(MessageDigest.getInstance("SHA-1").digest(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded()));
            }
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Exception when signing certificate fingerprint", e);
        }
        return null;
    }

    public static String m() {
        if (a0()) {
            return "wifi";
        }
        return U() ? "cellular" : DevicePublicKeyStringDef.NONE;
    }

    public static String n() {
        return Build.DEVICE;
    }

    public static float o() {
        if (com.unity3d.services.core.properties.a.e() != null) {
            return com.unity3d.services.core.properties.a.e().getResources().getDisplayMetrics().density;
        }
        return -1.0f;
    }

    public static long p() {
        return SystemClock.elapsedRealtime();
    }

    public static String q() {
        return Build.FINGERPRINT;
    }

    public static long r() {
        return a(EnumC0043b.FREE_MEMORY);
    }

    public static String s() {
        ActivityManager activityManager;
        ConfigurationInfo deviceConfigurationInfo;
        if (com.unity3d.services.core.properties.a.e() == null || (activityManager = (ActivityManager) com.unity3d.services.core.properties.a.e().getSystemService("activity")) == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) {
            return null;
        }
        return deviceConfigurationInfo.getGlEsVersion();
    }

    public static String t() {
        return Build.HARDWARE;
    }

    public static String u() {
        return Build.HOST;
    }

    public static String v() {
        String strE = com.unity3d.services.core.preferences.a.e("unityads-installinfo", "unityads-idfi");
        if (strE != null) {
            return strE;
        }
        String strS = S();
        com.unity3d.services.core.preferences.a.a("unityads-installinfo", "unityads-idfi", strS);
        return strS;
    }

    public static String w() {
        return Build.MANUFACTURER;
    }

    public static String x() {
        return Build.MODEL;
    }

    public static String y() {
        return com.unity3d.services.core.properties.a.e() != null ? ((TelephonyManager) com.unity3d.services.core.properties.a.e().getSystemService("phone")).getNetworkCountryIso() : "";
    }

    public static boolean z() {
        ConnectivityManager connectivityManager;
        if (com.unity3d.services.core.properties.a.e() == null || (connectivityManager = (ConnectivityManager) com.unity3d.services.core.properties.a.e().getSystemService("connectivity")) == null) {
            return false;
        }
        return connectivityManager.isActiveNetworkMetered();
    }

    public static String a(String str, String str2) {
        return str2 != null ? System.getProperty(str, str2) : System.getProperty(str);
    }

    public static int b(int i) {
        if (com.unity3d.services.core.properties.a.e() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) com.unity3d.services.core.properties.a.e().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamVolume(i);
        }
        return -2;
    }

    public static int a(int i) {
        if (com.unity3d.services.core.properties.a.e() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) com.unity3d.services.core.properties.a.e().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(i);
        }
        return -2;
    }

    public static long b(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round(file.getTotalSpace() / 1024);
    }

    private static boolean b(String str) {
        File[] fileArrListFiles;
        for (String str2 : System.getenv("PATH").split(":")) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.getName().equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static long a(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round(file.getFreeSpace() / 1024);
    }

    private static long a(EnumC0043b enumC0043b) throws Throwable {
        int i = a.a[enumC0043b.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = -1;
            }
        }
        RandomAccessFile randomAccessFile = null;
        String line = null;
        randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile("/proc/meminfo", "r");
            for (int i3 = 0; i3 < i2; i3++) {
                try {
                    line = randomAccessFile2.readLine();
                } catch (IOException e) {
                    e = e;
                    randomAccessFile = randomAccessFile2;
                    com.unity3d.services.core.log.a.a("Error while reading memory info: " + enumC0043b, e);
                    try {
                        randomAccessFile.close();
                        return -1L;
                    } catch (IOException e2) {
                        com.unity3d.services.core.log.a.a("Error closing RandomAccessFile", e2);
                        return -1L;
                    }
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    try {
                        randomAccessFile.close();
                    } catch (IOException e3) {
                        com.unity3d.services.core.log.a.a("Error closing RandomAccessFile", e3);
                    }
                    throw th;
                }
            }
            long jA = a(line);
            try {
                randomAccessFile2.close();
            } catch (IOException e4) {
                com.unity3d.services.core.log.a.a("Error closing RandomAccessFile", e4);
            }
            return jA;
        } catch (IOException e5) {
            e = e5;
        }
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String strGroup = "";
        while (matcher.find()) {
            strGroup = matcher.group(1);
        }
        return Long.parseLong(strGroup);
    }

    public static JSONObject a(PackageManager packageManager) throws JSONException, PackageManager.NameNotFoundException {
        String strB = com.unity3d.services.core.properties.a.b();
        PackageInfo packageInfo = packageManager.getPackageInfo(strB, 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("installer", packageManager.getInstallerPackageName(strB));
        jSONObject.put("firstInstallTime", packageInfo.firstInstallTime);
        jSONObject.put("lastUpdateTime", packageInfo.lastUpdateTime);
        jSONObject.put("versionCode", packageInfo.versionCode);
        jSONObject.put("versionName", packageInfo.versionName);
        jSONObject.put("packageName", packageInfo.packageName);
        return jSONObject;
    }
}
