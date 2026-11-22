package com.unity3d.services.core.preferences;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: AndroidPreferences.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static Boolean a(String str, String str2) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            } catch (ClassCastException e) {
                com.unity3d.services.core.log.a.c("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    public static Float b(String str, String str2) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Float.valueOf(sharedPreferences.getFloat(str2, Float.NaN));
            } catch (ClassCastException e) {
                com.unity3d.services.core.log.a.c("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    public static Integer c(String str, String str2) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Integer.valueOf(sharedPreferences.getInt(str2, -1));
            } catch (ClassCastException e) {
                com.unity3d.services.core.log.a.c("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    public static Long d(String str, String str2) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str2, -1L));
            } catch (ClassCastException e) {
                com.unity3d.services.core.log.a.c("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    public static String e(String str, String str2) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return sharedPreferences.getString(str2, "");
            } catch (ClassCastException e) {
                com.unity3d.services.core.log.a.c("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    public static boolean f(String str, String str2) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        return sharedPreferences != null && sharedPreferences.contains(str2);
    }

    public static void g(String str, String str2) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(str2);
            editorEdit.commit();
        }
    }

    public static void a(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(str2, str3);
            editorEdit.commit();
        }
    }

    public static void a(String str, String str2, Integer num) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt(str2, num.intValue());
            editorEdit.commit();
        }
    }

    public static void a(String str, String str2, Long l) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong(str2, l.longValue());
            editorEdit.commit();
        }
    }

    public static void a(String str, String str2, Boolean bool) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(str2, bool.booleanValue());
            editorEdit.commit();
        }
    }

    public static void a(String str, String str2, Double d) {
        SharedPreferences sharedPreferences = com.unity3d.services.core.properties.a.e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putFloat(str2, d.floatValue());
            editorEdit.commit();
        }
    }
}
