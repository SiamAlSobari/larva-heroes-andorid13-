package com.unity3d.services.core.device.reader;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DeviceInfoReaderWithFilter.java */
/* JADX INFO: loaded from: classes2.dex */
public class g implements p {
    p a;
    List<String> b;

    public g(p pVar, List<String> list) {
        this.a = pVar;
        this.b = list;
    }

    @Override // com.unity3d.services.core.device.reader.p
    public Map<String, Object> a() {
        Map<String, Object> mapA = this.a.a();
        List<String> list = this.b;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                mapA.remove(it.next());
            }
        }
        return mapA;
    }
}
