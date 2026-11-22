package com.unity3d.services.core.api;

import com.unity3d.services.core.request.h;
import com.unity3d.services.core.request.i;
import com.unity3d.services.core.request.j;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class Request {
    @WebViewExposed
    public static void get(String str, String str2, JSONArray jSONArray, Integer num, Integer num2, l lVar) {
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            com.unity3d.services.core.request.l.a(str2, h.a.GET, getHeadersMap(jSONArray), null, num, num2, new a(str));
            lVar.a(str);
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Error mapping headers for the request", e);
            lVar.a(i.MAPPING_HEADERS_FAILED, str);
        }
    }

    public static HashMap<String, List<String>> getHeadersMap(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = (JSONArray) jSONArray.get(i);
            List<String> arrayList = map.get(jSONArray2.getString(0));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(jSONArray2.getString(1));
            map.put(jSONArray2.getString(0), arrayList);
        }
        return map;
    }

    public static JSONArray getResponseHeadersMap(Map<String, List<String>> map) {
        JSONArray jSONArray = new JSONArray();
        if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                JSONArray jSONArray2 = null;
                for (String str2 : map.get(str)) {
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(str);
                    jSONArray3.put(str2);
                    jSONArray2 = jSONArray3;
                }
                jSONArray.put(jSONArray2);
            }
        }
        return jSONArray;
    }

    @WebViewExposed
    public static void head(String str, String str2, JSONArray jSONArray, Integer num, Integer num2, l lVar) {
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            com.unity3d.services.core.request.l.a(str2, h.a.HEAD, getHeadersMap(jSONArray), num, num2, new c(str));
            lVar.a(str);
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Error mapping headers for the request", e);
            lVar.a(i.MAPPING_HEADERS_FAILED, str);
        }
    }

    @WebViewExposed
    public static void post(String str, String str2, String str3, JSONArray jSONArray, Integer num, Integer num2, l lVar) {
        String str4 = (str3 == null || str3.length() != 0) ? str3 : null;
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            com.unity3d.services.core.request.l.a(str2, h.a.POST, getHeadersMap(jSONArray), str4, num, num2, new b(str));
            lVar.a(str);
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Error mapping headers for the request", e);
            lVar.a(i.MAPPING_HEADERS_FAILED, str);
        }
    }

    @WebViewExposed
    public static void setConcurrentRequestCount(Integer num, l lVar) {
        com.unity3d.services.core.request.l.a(num.intValue());
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void setKeepAliveTime(Integer num, l lVar) {
        com.unity3d.services.core.request.l.a(num.longValue());
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void setMaximumPoolSize(Integer num, l lVar) {
        com.unity3d.services.core.request.l.b(num.intValue());
        lVar.a(new Object[0]);
    }

    static class a implements com.unity3d.services.core.request.c {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.unity3d.services.core.request.c
        public void a(String str, String str2, int i, Map<String, List<String>> map) {
            try {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.REQUEST, j.COMPLETE, this.a, str, str2, Integer.valueOf(i), Request.getResponseHeadersMap(map));
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Error parsing response headers", e);
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.REQUEST, j.FAILED, this.a, str, "Error parsing response headers");
            }
        }

        @Override // com.unity3d.services.core.request.c
        public void a(String str, String str2) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.REQUEST, j.FAILED, this.a, str, str2);
        }
    }

    static class b implements com.unity3d.services.core.request.c {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // com.unity3d.services.core.request.c
        public void a(String str, String str2, int i, Map<String, List<String>> map) {
            try {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.REQUEST, j.COMPLETE, this.a, str, str2, Integer.valueOf(i), Request.getResponseHeadersMap(map));
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Error parsing response headers", e);
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.REQUEST, j.FAILED, this.a, str, "Error parsing response headers");
            }
        }

        @Override // com.unity3d.services.core.request.c
        public void a(String str, String str2) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.REQUEST, j.FAILED, this.a, str, str2);
        }
    }

    static class c implements com.unity3d.services.core.request.c {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // com.unity3d.services.core.request.c
        public void a(String str, String str2, int i, Map<String, List<String>> map) {
            try {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.REQUEST, j.COMPLETE, this.a, str, str2, Integer.valueOf(i), Request.getResponseHeadersMap(map));
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Error parsing response headers", e);
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.REQUEST, j.FAILED, this.a, str, "Error parsing response headers");
            }
        }

        @Override // com.unity3d.services.core.request.c
        public void a(String str, String str2) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.REQUEST, j.FAILED, this.a, str, str2);
        }
    }
}
