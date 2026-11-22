package com.unity3d.services.core.log;

import android.util.Log;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: compiled from: DeviceLog.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static boolean a = true;
    private static boolean b = true;
    private static boolean c = true;
    private static boolean d = true;
    private static boolean e = false;
    private static final HashMap<b, c> f;

    /* JADX INFO: renamed from: com.unity3d.services.core.log.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DeviceLog.java */
    static /* synthetic */ class C0045a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: DeviceLog.java */
    public enum b {
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    static {
        HashMap<b, c> map = new HashMap<>();
        f = map;
        if (map.size() == 0) {
            map.put(b.INFO, new c("i"));
            map.put(b.DEBUG, new c("d"));
            map.put(b.WARNING, new c("w"));
            map.put(b.ERROR, new c("e"));
        }
        if (new File("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
            e = true;
        }
    }

    public static void a(int i) {
        if (i >= 8) {
            a = true;
            b = true;
            c = true;
            d = true;
            return;
        }
        if (i >= 4) {
            a = true;
            b = true;
            c = true;
            d = false;
            return;
        }
        if (i >= 2) {
            a = true;
            b = true;
            c = false;
            d = false;
            return;
        }
        if (i >= 1) {
            a = true;
            b = false;
            c = false;
            d = false;
            return;
        }
        a = false;
        b = false;
        c = false;
        d = false;
    }

    public static void b(String str) {
        if (b()) {
            if (str.length() <= 3072) {
                b(b.DEBUG, a(str));
                return;
            }
            b(str.substring(0, 3072));
            if (str.length() < 30720) {
                b(str.substring(3072));
            }
        }
    }

    public static void c(String str, Object... objArr) {
        e(String.format(str, objArr));
    }

    public static void d(String str) {
        b(b.INFO, a(str));
    }

    public static void e(String str) {
        b(b.WARNING, a(str));
    }

    public static void c(String str) {
        b(b.ERROR, a(str));
    }

    private static boolean b() {
        return d || e;
    }

    public static void b(String str, Object... objArr) {
        c(String.format(str, objArr));
    }

    private static void b(b bVar, String str) {
        boolean z;
        int i = C0045a.a[bVar.ordinal()];
        if (i == 1) {
            z = c;
        } else if (i == 2) {
            z = d;
        } else if (i != 3) {
            z = i != 4 ? true : a;
        } else {
            z = b;
        }
        if (e ? true : z) {
            a(a(bVar, str));
        }
    }

    public static void a() {
        b("ENTERED METHOD");
    }

    public static void a(String str, Object... objArr) {
        if (b()) {
            b(String.format(str, objArr));
        }
    }

    public static void a(String str, Exception exc) {
        String str2 = "";
        if (str != null) {
            str2 = "" + str;
        }
        if (exc != null) {
            str2 = str2 + ": " + exc.getMessage();
        }
        if (exc != null && exc.getCause() != null) {
            str2 = str2 + ": " + exc.getCause().getMessage();
        }
        b(b.ERROR, str2);
    }

    private static String a(String str) {
        return (str == null || str.length() == 0) ? "DO NOT USE EMPTY MESSAGES, use DeviceLog.entered() instead" : str;
    }

    private static c a(b bVar) {
        return f.get(bVar);
    }

    private static com.unity3d.services.core.log.b a(b bVar, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        c cVarA = a(bVar);
        if (cVarA == null) {
            return null;
        }
        int i = 0;
        boolean z = false;
        while (i < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if (stackTraceElement.getClassName().equals(a.class.getName())) {
                z = true;
            }
            if (!stackTraceElement.getClassName().equals(a.class.getName()) && z) {
                break;
            }
            i++;
        }
        StackTraceElement stackTraceElement2 = i < stackTrace.length ? stackTrace[i] : null;
        if (stackTraceElement2 != null) {
            return new com.unity3d.services.core.log.b(cVarA, str, stackTraceElement2);
        }
        return null;
    }

    private static void a(com.unity3d.services.core.log.b bVar) {
        Method method;
        if (bVar == null || bVar.a() == null) {
            return;
        }
        try {
            method = Log.class.getMethod(bVar.a().b(), String.class, String.class);
        } catch (Exception e2) {
            Log.e("UnityAds", "Writing to log failed!", e2);
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(null, bVar.a().a(), bVar.b());
            } catch (Exception e3) {
                Log.e("UnityAds", "Writing to log failed!", e3);
            }
        }
    }
}
