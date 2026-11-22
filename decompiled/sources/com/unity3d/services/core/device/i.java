package com.unity3d.services.core.device;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: StorageManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class i {
    private static final Map<a, String> a = Collections.synchronizedMap(new HashMap());
    private static final List<f> b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: StorageManager.java */
    public enum a {
        PRIVATE,
        PUBLIC
    }

    public static boolean a(Context context) {
        File filesDir;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return false;
        }
        a aVar = a.PUBLIC;
        a(aVar, filesDir + "/" + com.unity3d.services.core.properties.d.l() + "public-data.json");
        if (!d(aVar)) {
            return false;
        }
        a aVar2 = a.PRIVATE;
        a(aVar2, filesDir + "/" + com.unity3d.services.core.properties.d.l() + "private-data.json");
        return d(aVar2);
    }

    public static boolean b(a aVar) {
        List<f> list = b;
        if (list == null) {
            return false;
        }
        synchronized (list) {
            Iterator<f> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().b().equals(aVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void c(a aVar) {
        if (b(aVar)) {
            f fVarA = a(aVar);
            if (fVarA != null) {
                fVarA.c();
                return;
            }
            return;
        }
        Map<a, String> map = a;
        if (map.containsKey(aVar)) {
            f fVar = new f(map.get(aVar), aVar);
            fVar.c();
            b.add(fVar);
        }
    }

    private static boolean d(a aVar) {
        if (b(aVar)) {
            return true;
        }
        c(aVar);
        f fVarA = a(aVar);
        if (fVarA != null && !fVarA.e()) {
            fVarA.f();
        }
        return fVarA != null;
    }

    public static f a(a aVar) {
        List<f> list = b;
        if (list == null) {
            return null;
        }
        synchronized (list) {
            for (f fVar : list) {
                if (fVar.b().equals(aVar)) {
                    return fVar;
                }
            }
            return null;
        }
    }

    public static synchronized void a(a aVar, String str) {
        Map<a, String> map = a;
        if (!map.containsKey(aVar)) {
            map.put(aVar, str);
        }
    }
}
