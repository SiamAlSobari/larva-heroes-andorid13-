package com.unity3d.services.core.device.reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DeviceInfoReaderFilterProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    private com.unity3d.services.core.misc.c a;

    public e(com.unity3d.services.core.misc.c cVar) {
        this.a = cVar;
    }

    public List<String> a() {
        Object objOpt;
        ArrayList arrayList = new ArrayList();
        com.unity3d.services.core.misc.c cVar = this.a;
        if (cVar == null || cVar.getData() == null || (objOpt = this.a.getData().opt("unifiedconfig")) == null || !(objOpt instanceof JSONObject)) {
            return arrayList;
        }
        Object objOpt2 = ((JSONObject) objOpt).opt("exclude");
        return objOpt2 instanceof String ? a(Arrays.asList(((String) objOpt2).split(","))) : arrayList;
    }

    private List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trim());
        }
        return arrayList;
    }
}
