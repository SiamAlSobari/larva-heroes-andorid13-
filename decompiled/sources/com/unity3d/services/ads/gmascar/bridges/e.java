package com.unity3d.services.ads.gmascar.bridges;

import android.content.Context;
import com.google.ads.AdRequest;
import java.util.HashMap;

/* JADX INFO: compiled from: MobileAdsBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends com.unity3d.services.core.reflection.a {

    /* JADX INFO: compiled from: MobileAdsBridge.java */
    class a extends HashMap<String, Class<?>[]> {
        a() throws Error, RuntimeException {
            try {
                put("initialize", new Class[]{Context.class, Class.forName("com.google.android.gms.ads.initialization.OnInitializationCompleteListener")});
            } catch (ClassNotFoundException e) {
                com.unity3d.services.core.log.a.a("Could not find class \"com.google.android.gms.ads.initialization.OnInitializationCompleteListener\" %s", e.getLocalizedMessage());
            }
            put("getInitializationStatus", new Class[0]);
            put("getVersionString", new Class[0]);
        }
    }

    public e() {
        super(new a());
    }

    public void a(Context context, Object obj) {
        b("initialize", null, context, obj);
    }

    @Override // com.unity3d.services.core.reflection.a
    public String g() {
        return "com.google.android.gms.ads.MobileAds";
    }

    public Object i() {
        return a("getInitializationStatus", (Object) null, new Object[0]);
    }

    public String j() {
        Object objA = a("getVersionString", (Object) null, new Object[0]);
        return objA == null ? AdRequest.VERSION : objA.toString();
    }
}
