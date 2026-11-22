package com.unity3d.services.core.request.metrics;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ISDKMetrics.java */
/* JADX INFO: loaded from: classes2.dex */
public interface c {
    void a(d dVar);

    void a(String str, Map<String, String> map);

    void a(List<d> list);

    boolean a();

    String b();

    void sendMetric(d dVar);
}
