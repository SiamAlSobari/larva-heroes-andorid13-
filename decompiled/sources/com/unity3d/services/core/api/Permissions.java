package com.unity3d.services.core.api;

import android.content.Context;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.device.c;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import java.util.ArrayList;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class Permissions {
    @WebViewExposed
    public static void checkPermission(String str, l lVar) {
        if (com.unity3d.services.core.properties.a.e() == null) {
            lVar.a(c.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        try {
            Context contextE = com.unity3d.services.core.properties.a.e();
            lVar.a(Integer.valueOf(contextE.getPackageManager().checkPermission(str, contextE.getPackageName())));
        } catch (Exception e) {
            lVar.a(a.ERROR_CHECKING_PERMISSION, e.getMessage());
        }
    }

    @WebViewExposed
    public static void getPermissions(l lVar) {
        if (com.unity3d.services.core.properties.a.e() == null) {
            lVar.a(c.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Context contextE = com.unity3d.services.core.properties.a.e();
            String[] strArr = contextE.getPackageManager().getPackageInfo(contextE.getPackageName(), 4096).requestedPermissions;
            if (strArr == null) {
                lVar.a(a.NO_REQUESTED_PERMISSIONS, new Object[0]);
                return;
            }
            for (String str : strArr) {
                jSONArray.put(str);
            }
            lVar.a(jSONArray);
        } catch (Exception e) {
            lVar.a(a.COULDNT_GET_PERMISSIONS, e.getMessage());
        }
    }

    @WebViewExposed
    public static void requestPermissions(JSONArray jSONArray, Integer num, l lVar) {
        if (AdUnit.getAdUnitActivity() == null) {
            lVar.a(com.unity3d.services.ads.adunit.a.ADUNIT_NULL, new Object[0]);
            return;
        }
        if (jSONArray == null || jSONArray.length() < 1) {
            lVar.a(a.NO_REQUESTED_PERMISSIONS, new Object[0]);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            AdUnit.getAdUnitActivity().requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), num.intValue());
            lVar.a(new Object[0]);
        } catch (Exception e) {
            lVar.a(a.ERROR_REQUESTING_PERMISSIONS, e.getMessage());
        }
    }
}
