package com.unity3d.services.core.api;

import android.app.Activity;
import android.net.Uri;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Intent {
    private static WeakReference<Activity> a;

    public enum IntentError {
        COULDNT_PARSE_EXTRAS,
        COULDNT_PARSE_CATEGORIES,
        INTENT_WAS_NULL,
        JSON_EXCEPTION,
        ACTIVITY_WAS_NULL
    }

    private static class a extends Exception {
        private IntentError a;
        private Object b;

        public a(IntentError intentError, Object obj) {
            this.a = intentError;
            this.b = obj;
        }

        public IntentError a() {
            return this.a;
        }

        public Object b() {
            return this.b;
        }
    }

    private static boolean a(android.content.Intent intent, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return true;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                intent.addCategory(jSONArray.getString(i));
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Couldn't parse categories for intent", e);
                return false;
            }
        }
        return true;
    }

    private static boolean b(android.content.Intent intent, JSONArray jSONArray) {
        if (jSONArray == null) {
            return true;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!a(intent, jSONObject.getString("key"), jSONObject.get("value"))) {
                    return false;
                }
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Couldn't parse extras", e);
                return false;
            }
        }
        return true;
    }

    @WebViewExposed
    public static void canOpenIntent(JSONObject jSONObject, l lVar) {
        try {
            lVar.a(Boolean.valueOf(a(a(jSONObject))));
        } catch (a e) {
            com.unity3d.services.core.log.a.a("Couldn't resolve intent", e);
            lVar.a(e.a(), e.b());
        }
    }

    @WebViewExposed
    public static void canOpenIntents(JSONArray jSONArray, l lVar) {
        JSONObject jSONObject = new JSONObject();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            try {
                jSONObject.put(jSONObjectOptJSONObject.optString("id"), a(a(jSONObjectOptJSONObject)));
            } catch (a e) {
                com.unity3d.services.core.log.a.a("Exception parsing intent", e);
                lVar.a(e.a(), e.b());
                return;
            } catch (JSONException e2) {
                lVar.a(IntentError.JSON_EXCEPTION, e2.getMessage());
                return;
            }
        }
        lVar.a(jSONObject);
    }

    @WebViewExposed
    public static void launch(JSONObject jSONObject, l lVar) {
        android.content.Intent launchIntentForPackage;
        String str = (String) jSONObject.opt("className");
        String str2 = (String) jSONObject.opt("packageName");
        String str3 = (String) jSONObject.opt("action");
        String str4 = (String) jSONObject.opt("uri");
        String str5 = (String) jSONObject.opt("mimeType");
        JSONArray jSONArray = (JSONArray) jSONObject.opt("categories");
        Integer num = (Integer) jSONObject.opt("flags");
        JSONArray jSONArray2 = (JSONArray) jSONObject.opt("extras");
        if (str2 != null && str == null && str3 == null && str5 == null) {
            launchIntentForPackage = com.unity3d.services.core.properties.a.e().getPackageManager().getLaunchIntentForPackage(str2);
            if (launchIntentForPackage != null && num.intValue() > -1) {
                launchIntentForPackage.addFlags(num.intValue());
            }
        } else {
            android.content.Intent intent = new android.content.Intent();
            if (str != null && str2 != null) {
                intent.setClassName(str2, str);
            }
            if (str3 != null) {
                intent.setAction(str3);
            }
            if (str4 != null && str5 != null) {
                intent.setDataAndType(Uri.parse(str4), str5);
            } else if (str4 != null) {
                intent.setData(Uri.parse(str4));
            } else if (str5 != null) {
                intent.setType(str5);
            }
            if (num != null && num.intValue() > -1) {
                intent.setFlags(num.intValue());
            }
            if (!a(intent, jSONArray)) {
                lVar.a(IntentError.COULDNT_PARSE_CATEGORIES, jSONArray);
            }
            if (!b(intent, jSONArray2)) {
                lVar.a(IntentError.COULDNT_PARSE_EXTRAS, jSONArray2);
            }
            launchIntentForPackage = intent;
        }
        if (launchIntentForPackage == null) {
            lVar.a(IntentError.INTENT_WAS_NULL, new Object[0]);
        } else if (a() == null) {
            lVar.a(IntentError.ACTIVITY_WAS_NULL, new Object[0]);
        } else {
            a().startActivity(launchIntentForPackage);
            lVar.a(new Object[0]);
        }
    }

    public static void removeActiveActivity(Activity activity) {
        WeakReference<Activity> weakReference = a;
        if (weakReference == null || weakReference.get() == null || activity == null || !activity.equals(a.get())) {
            return;
        }
        a = null;
    }

    public static void setActiveActivity(Activity activity) {
        if (activity == null) {
            a = null;
        } else {
            a = new WeakReference<>(activity);
        }
    }

    private static boolean a(android.content.Intent intent, String str, Object obj) {
        if (obj instanceof String) {
            intent.putExtra(str, (String) obj);
            return true;
        }
        if (obj instanceof Integer) {
            intent.putExtra(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Double) {
            intent.putExtra(str, ((Double) obj).doubleValue());
            return true;
        }
        if (obj instanceof Boolean) {
            intent.putExtra(str, ((Boolean) obj).booleanValue());
            return true;
        }
        com.unity3d.services.core.log.a.c("Unable to parse launch intent extra " + str);
        return false;
    }

    private static Activity a() {
        WeakReference<Activity> weakReference = a;
        if (weakReference != null && weakReference.get() != null) {
            return a.get();
        }
        if (com.unity3d.services.core.properties.a.a() != null) {
            return com.unity3d.services.core.properties.a.a();
        }
        return null;
    }

    private static boolean a(android.content.Intent intent) {
        return com.unity3d.services.core.properties.a.e().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private static android.content.Intent a(JSONObject jSONObject) throws a {
        String str = (String) jSONObject.opt("className");
        String str2 = (String) jSONObject.opt("packageName");
        String str3 = (String) jSONObject.opt("action");
        String str4 = (String) jSONObject.opt("uri");
        String str5 = (String) jSONObject.opt("mimeType");
        JSONArray jSONArray = (JSONArray) jSONObject.opt("categories");
        Integer num = (Integer) jSONObject.opt("flags");
        JSONArray jSONArray2 = (JSONArray) jSONObject.opt("extras");
        if (str2 != null && str == null && str3 == null && str5 == null) {
            android.content.Intent launchIntentForPackage = com.unity3d.services.core.properties.a.e().getPackageManager().getLaunchIntentForPackage(str2);
            if (launchIntentForPackage == null || num.intValue() <= -1) {
                return launchIntentForPackage;
            }
            launchIntentForPackage.addFlags(num.intValue());
            return launchIntentForPackage;
        }
        android.content.Intent intent = new android.content.Intent();
        if (str != null && str2 != null) {
            intent.setClassName(str2, str);
        }
        if (str3 != null) {
            intent.setAction(str3);
        }
        if (str4 != null) {
            intent.setData(Uri.parse(str4));
        }
        if (str5 != null) {
            intent.setType(str5);
        }
        if (num != null && num.intValue() > -1) {
            intent.setFlags(num.intValue());
        }
        if (a(intent, jSONArray)) {
            if (b(intent, jSONArray2)) {
                return intent;
            }
            throw new a(IntentError.COULDNT_PARSE_EXTRAS, jSONArray2);
        }
        throw new a(IntentError.COULDNT_PARSE_CATEGORIES, jSONArray);
    }
}
