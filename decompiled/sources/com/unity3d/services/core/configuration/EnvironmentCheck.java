package com.unity3d.services.core.configuration;

import android.webkit.JavascriptInterface;
import com.unity3d.services.core.log.a;
import com.unity3d.services.core.properties.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class EnvironmentCheck {
    public static boolean isEnvironmentOk() {
        return testProGuard() && testCacheDirectory();
    }

    public static boolean testCacheDirectory() {
        if (d.a() != null) {
            a.b("Unity Ads cache directory check OK");
            return true;
        }
        a.c("Unity Ads cache directory check fail: no working cache directory available");
        return false;
    }

    public static boolean testProGuard() {
        try {
            Class<?> cls = Class.forName("com.unity3d.services.core.webview.bridge.i");
            Method method = cls.getMethod("handleInvocation", String.class);
            Method method2 = cls.getMethod("handleCallback", String.class, String.class, String.class);
            if (a(method) && a(method2)) {
                a.b("Unity Ads ProGuard check OK");
                return true;
            }
            a.c("Unity Ads ProGuard check fail: missing @JavascriptInterface annotations in Unity Ads web bridge");
            return false;
        } catch (ClassNotFoundException e) {
            a.a("Unity Ads ProGuard check fail: Unity Ads web bridge class not found", e);
            return false;
        } catch (NoSuchMethodException e2) {
            a.a("Unity Ads ProGuard check fail: Unity Ads web bridge methods not found", e2);
            return false;
        } catch (Exception e3) {
            a.a("Unknown exception during Unity Ads ProGuard check: " + e3.getMessage(), e3);
            return true;
        }
    }

    private static boolean a(Method method) {
        Annotation[] annotations = method.getAnnotations();
        if (annotations != null) {
            for (Annotation annotation : annotations) {
                if (annotation instanceof JavascriptInterface) {
                    return true;
                }
            }
        }
        return false;
    }
}
