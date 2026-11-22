package com.unity3d.services.ads.api;

import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.WindowInsets;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.ads.adunit.AdUnitSoftwareActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentSoftwareActivity;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AdUnit {
    private static AdUnitActivity a = null;
    private static int b = -1;

    static class a implements Runnable {
        final /* synthetic */ JSONArray a;

        a(JSONArray jSONArray) {
            this.a = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                try {
                    AdUnit.getAdUnitActivity().a(AdUnit.c(this.a));
                } catch (Exception e) {
                    com.unity3d.services.core.log.a.a("Corrupted viewlist", e);
                }
            }
        }
    }

    static class b implements Runnable {
        final /* synthetic */ Integer a;

        b(Integer num) {
            this.a = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().b(this.a.intValue());
            }
        }
    }

    static class c implements Runnable {
        final /* synthetic */ Boolean a;

        c(Boolean bool) {
            this.a = bool;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().a(this.a.booleanValue());
            }
        }
    }

    static class d implements Runnable {
        final /* synthetic */ Integer a;

        d(Integer num) {
            this.a = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().c(this.a.intValue());
            }
        }
    }

    static class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Integer b;
        final /* synthetic */ Integer c;
        final /* synthetic */ Integer d;
        final /* synthetic */ Integer e;

        e(String str, Integer num, Integer num2, Integer num3, Integer num4) {
            this.a = str;
            this.b = num;
            this.c = num2;
            this.d = num3;
            this.e = num4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().a(this.a, this.b.intValue(), this.c.intValue(), this.d.intValue(), this.e.intValue());
            }
        }
    }

    static class f implements Runnable {
        final /* synthetic */ Integer a;

        f(Integer num) {
            this.a = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().a(this.a.intValue());
            }
        }
    }

    private AdUnit() {
    }

    private static ArrayList<Integer> b(JSONArray jSONArray) throws JSONException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer numValueOf = 0; numValueOf.intValue() < jSONArray.length(); numValueOf = Integer.valueOf(numValueOf.intValue() + 1)) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(numValueOf.intValue())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] c(JSONArray jSONArray) throws JSONException {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    @WebViewExposed
    public static void clearMotionEventCapture(l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().b() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.LAYOUT_NULL, new Object[0]);
        } else {
            getAdUnitActivity().b().a();
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void close(l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        } else {
            getAdUnitActivity().finish();
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void endMotionEventCapture(l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().b() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.LAYOUT_NULL, new Object[0]);
        } else {
            getAdUnitActivity().b().b();
            lVar.a(new Object[0]);
        }
    }

    public static AdUnitActivity getAdUnitActivity() {
        return a;
    }

    public static int getCurrentAdUnitActivityId() {
        return b;
    }

    @WebViewExposed
    public static void getCurrentMotionEventCount(l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().b() != null) {
            lVar.a(Integer.valueOf(getAdUnitActivity().b().getCurrentEventCount()));
        } else {
            lVar.a(com.unity3d.services.ads.adunit.a.LAYOUT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getMotionEventCount(JSONArray jSONArray, l lVar) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            } catch (Exception e2) {
                com.unity3d.services.core.log.a.a("Error retrieving int from eventTypes", e2);
            }
        }
        if (getAdUnitActivity() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
            return;
        }
        if (getAdUnitActivity().b() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.LAYOUT_NULL, new Object[0]);
            return;
        }
        if (getAdUnitActivity().b().getCurrentEventCount() >= getAdUnitActivity().b().getMaxEventCount()) {
            lVar.a(com.unity3d.services.ads.adunit.a.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
            return;
        }
        SparseIntArray sparseIntArrayA = getAdUnitActivity().b().a(arrayList);
        JSONObject jSONObject = new JSONObject();
        for (int i2 = 0; i2 < sparseIntArrayA.size(); i2++) {
            int iKeyAt = sparseIntArrayA.keyAt(i2);
            try {
                jSONObject.put(Integer.toString(iKeyAt), sparseIntArrayA.get(iKeyAt));
            } catch (Exception e3) {
                com.unity3d.services.core.log.a.a("Error building response JSON", e3);
            }
        }
        lVar.a(jSONObject);
    }

    @WebViewExposed
    public static void getMotionEventData(JSONObject jSONObject, l lVar) {
        JSONArray jSONArray;
        Iterator<String> itKeys = jSONObject.keys();
        SparseArray<ArrayList<Integer>> sparseArray = new SparseArray<>();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            int i = Integer.parseInt(next);
            if (sparseArray.get(i) == null) {
                sparseArray.put(i, new ArrayList<>());
            }
            try {
                jSONArray = jSONObject.getJSONArray(next);
            } catch (Exception e2) {
                com.unity3d.services.core.log.a.a("Couldn't fetch keyIndices", e2);
                jSONArray = null;
            }
            if (jSONArray != null) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        sparseArray.get(i).add(Integer.valueOf(jSONArray.getInt(i2)));
                    } catch (Exception e3) {
                        com.unity3d.services.core.log.a.a("Couldn't add value to requested infos", e3);
                    }
                }
            }
        }
        if (getAdUnitActivity() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
            return;
        }
        if (getAdUnitActivity().b() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.LAYOUT_NULL, new Object[0]);
            return;
        }
        if (getAdUnitActivity().b().getCurrentEventCount() >= getAdUnitActivity().b().getMaxEventCount()) {
            lVar.a(com.unity3d.services.ads.adunit.a.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
            return;
        }
        SparseArray<SparseArray<com.unity3d.services.ads.adunit.c>> sparseArrayA = getAdUnitActivity().b().a(sparseArray);
        JSONObject jSONObject2 = new JSONObject();
        for (int i3 = 0; i3 < sparseArrayA.size(); i3++) {
            int iKeyAt = sparseArrayA.keyAt(i3);
            SparseArray<com.unity3d.services.ads.adunit.c> sparseArray2 = sparseArrayA.get(iKeyAt);
            JSONObject jSONObject3 = new JSONObject();
            for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
                JSONObject jSONObject4 = new JSONObject();
                int iKeyAt2 = sparseArray2.keyAt(i4);
                com.unity3d.services.ads.adunit.c cVar = sparseArray2.get(iKeyAt2);
                try {
                    jSONObject4.put("action", cVar.a());
                    jSONObject4.put("isObscured", cVar.j());
                    jSONObject4.put("toolType", cVar.g());
                    jSONObject4.put("source", cVar.f());
                    jSONObject4.put("deviceId", cVar.b());
                    jSONObject4.put("x", cVar.h());
                    jSONObject4.put("y", cVar.i());
                    jSONObject4.put("eventTime", cVar.c());
                    jSONObject4.put("pressure", cVar.d());
                    jSONObject4.put("size", cVar.e());
                    jSONObject3.put(Integer.toString(iKeyAt2), jSONObject4);
                } catch (Exception e4) {
                    com.unity3d.services.core.log.a.a("Couldn't construct event info", e4);
                }
            }
            try {
                jSONObject2.put(Integer.toString(iKeyAt), jSONObject3);
            } catch (Exception e5) {
                com.unity3d.services.core.log.a.a("Couldn't construct info object", e5);
            }
        }
        lVar.a(jSONObject2);
    }

    @WebViewExposed
    public static void getOrientation(l lVar) {
        if (getAdUnitActivity() != null) {
            lVar.a(Integer.valueOf(getAdUnitActivity().getRequestedOrientation()));
        } else {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getSafeAreaInsets(l lVar) {
        if (getAdUnitActivity() == null || getAdUnitActivity().b() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            lVar.a(com.unity3d.services.ads.adunit.a.API_LEVEL_ERROR, new Object[0]);
            return;
        }
        WindowInsets rootWindowInsets = getAdUnitActivity().b().getRootWindowInsets();
        if (rootWindowInsets == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Object objInvoke = rootWindowInsets.getClass().getMethod("getDisplayCutout", new Class[0]).invoke(rootWindowInsets, new Object[0]);
            if (objInvoke != null) {
                Object objInvoke2 = objInvoke.getClass().getMethod("getSafeInsetTop", new Class[0]).invoke(objInvoke, new Object[0]);
                Object objInvoke3 = objInvoke.getClass().getMethod("getSafeInsetRight", new Class[0]).invoke(objInvoke, new Object[0]);
                Object objInvoke4 = objInvoke.getClass().getMethod("getSafeInsetBottom", new Class[0]).invoke(objInvoke, new Object[0]);
                Object objInvoke5 = objInvoke.getClass().getMethod("getSafeInsetLeft", new Class[0]).invoke(objInvoke, new Object[0]);
                jSONObject.put("top", objInvoke2);
                jSONObject.put("right", objInvoke3);
                jSONObject.put("bottom", objInvoke4);
                jSONObject.put("left", objInvoke5);
                lVar.a(jSONObject);
            } else {
                lVar.a(com.unity3d.services.ads.adunit.a.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
            }
        } catch (IllegalAccessException e2) {
            e = e2;
            lVar.a(com.unity3d.services.ads.adunit.a.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
            com.unity3d.services.core.log.a.a("Error while calling displayCutout getter", e);
        } catch (NoSuchMethodException e3) {
            lVar.a(com.unity3d.services.ads.adunit.a.DISPLAY_CUTOUT_METHOD_NOT_AVAILABLE, new Object[0]);
            com.unity3d.services.core.log.a.a("Method getDisplayCutout not found", e3);
        } catch (InvocationTargetException e4) {
            e = e4;
            lVar.a(com.unity3d.services.ads.adunit.a.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
            com.unity3d.services.core.log.a.a("Error while calling displayCutout getter", e);
        } catch (JSONException e5) {
            lVar.a(com.unity3d.services.ads.adunit.a.DISPLAY_CUTOUT_JSON_ERROR, new Object[0]);
            com.unity3d.services.core.log.a.a("JSON error while constructing display cutout object", e5);
        }
    }

    @WebViewExposed
    public static void getViewFrame(String str, l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().b(str) == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.UNKNOWN_VIEW, new Object[0]);
        } else {
            Map<String, Integer> mapB = getAdUnitActivity().b(str);
            lVar.a(mapB.get("x"), mapB.get("y"), mapB.get("width"), mapB.get("height"));
        }
    }

    @WebViewExposed
    public static void getViews(l lVar) {
        if (getAdUnitActivity() != null) {
            lVar.a(new JSONArray((Collection) Arrays.asList(getAdUnitActivity().c())));
        } else {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, l lVar) {
        open(num, jSONArray, num2, null, lVar);
    }

    public static void setAdUnitActivity(AdUnitActivity adUnitActivity) {
        a = adUnitActivity;
    }

    public static void setCurrentAdUnitActivityId(int i) {
        b = i;
    }

    @WebViewExposed
    public static void setKeepScreenOn(Boolean bool, l lVar) {
        j.a(new c(bool));
        if (getAdUnitActivity() != null) {
            lVar.a(new Object[0]);
        } else {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setKeyEventList(JSONArray jSONArray, l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
            return;
        }
        try {
            getAdUnitActivity().a(b(jSONArray));
            lVar.a(jSONArray);
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Error parsing views from viewList", e2);
            lVar.a(com.unity3d.services.ads.adunit.a.CORRUPTED_KEYEVENTLIST, jSONArray, e2.getMessage());
        }
    }

    @WebViewExposed
    public static void setLayoutInDisplayCutoutMode(Integer num, l lVar) {
        j.a(new f(num));
        if (getAdUnitActivity() != null) {
            lVar.a(num);
        } else {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setOrientation(Integer num, l lVar) {
        j.a(new b(num));
        if (getAdUnitActivity() != null) {
            lVar.a(num);
        } else {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setSystemUiVisibility(Integer num, l lVar) {
        j.a(new d(num));
        if (getAdUnitActivity() != null) {
            lVar.a(num);
        } else {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setViewFrame(String str, Integer num, Integer num2, Integer num3, Integer num4, l lVar) {
        j.a(new e(str, num, num2, num3, num4));
        if (getAdUnitActivity() != null) {
            lVar.a(new Object[0]);
        } else {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setViews(JSONArray jSONArray, l lVar) {
        boolean z;
        try {
            c(jSONArray);
            z = false;
        } catch (JSONException unused) {
            lVar.a(com.unity3d.services.ads.adunit.a.CORRUPTED_VIEWLIST, jSONArray);
            z = true;
        }
        if (!z) {
            j.a(new a(jSONArray));
        }
        if (getAdUnitActivity() != null) {
            lVar.a(jSONArray);
        } else {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void startMotionEventCapture(Integer num, l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().b() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.LAYOUT_NULL, new Object[0]);
        } else {
            getAdUnitActivity().b().a(num.intValue());
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, l lVar) {
        open(num, jSONArray, num2, jSONArray2, 0, Boolean.TRUE, lVar);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, l lVar) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, Boolean.FALSE, lVar);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, l lVar) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, bool2, 0, lVar);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, Integer num4, l lVar) {
        Intent intent;
        if (!bool.booleanValue() && bool2.booleanValue()) {
            com.unity3d.services.core.log.a.b("Unity Ads opening new transparent ad unit activity, hardware acceleration disabled");
            intent = new Intent(com.unity3d.services.core.properties.a.a(), (Class<?>) AdUnitTransparentSoftwareActivity.class);
        } else if (bool.booleanValue() && !bool2.booleanValue()) {
            com.unity3d.services.core.log.a.b("Unity Ads opening new hardware accelerated ad unit activity");
            intent = new Intent(com.unity3d.services.core.properties.a.a(), (Class<?>) AdUnitActivity.class);
        } else if (bool.booleanValue() && bool2.booleanValue()) {
            com.unity3d.services.core.log.a.b("Unity Ads opening new hardware accelerated transparent ad unit activity");
            intent = new Intent(com.unity3d.services.core.properties.a.a(), (Class<?>) AdUnitTransparentActivity.class);
        } else {
            com.unity3d.services.core.log.a.b("Unity Ads opening new ad unit activity, hardware acceleration disabled");
            intent = new Intent(com.unity3d.services.core.properties.a.a(), (Class<?>) AdUnitSoftwareActivity.class);
        }
        intent.addFlags(268500992);
        if (num != null) {
            try {
                intent.putExtra("activityId", num.intValue());
                setCurrentAdUnitActivityId(num.intValue());
                try {
                    intent.putExtra("views", c(jSONArray));
                    if (jSONArray2 != null) {
                        try {
                            intent.putExtra("keyEvents", b(jSONArray2));
                        } catch (Exception e2) {
                            com.unity3d.services.core.log.a.a("Error parsing views from viewList", e2);
                            lVar.a(com.unity3d.services.ads.adunit.a.CORRUPTED_KEYEVENTLIST, jSONArray2, e2.getMessage());
                            return;
                        }
                    }
                    intent.putExtra("systemUiVisibility", num3);
                    intent.putExtra("orientation", num2);
                    intent.putExtra("displayCutoutMode", num4);
                    com.unity3d.services.core.properties.a.a().startActivity(intent);
                    com.unity3d.services.core.log.a.b("Opened AdUnitActivity with: " + jSONArray.toString());
                    lVar.a(new Object[0]);
                    return;
                } catch (Exception e3) {
                    com.unity3d.services.core.log.a.a("Error parsing views from viewList", e3);
                    lVar.a(com.unity3d.services.ads.adunit.a.CORRUPTED_VIEWLIST, jSONArray, e3.getMessage());
                    return;
                }
            } catch (Exception e4) {
                com.unity3d.services.core.log.a.a("Could not set activityId for intent", e4);
                lVar.a(com.unity3d.services.ads.adunit.a.ACTIVITY_ID, Integer.valueOf(num.intValue()), e4.getMessage());
                return;
            }
        }
        com.unity3d.services.core.log.a.c("Activity ID is NULL");
        lVar.a(com.unity3d.services.ads.adunit.a.ACTIVITY_ID, "Activity ID NULL");
    }
}
