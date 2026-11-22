package com.unity3d.services.ads.operation;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.Configuration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: OperationState.java */
/* JADX INFO: loaded from: classes2.dex */
public class e implements com.unity3d.services.core.webview.bridge.d {
    private static String a = "";
    public String b;
    public String c;
    public Configuration d;
    public ConditionVariable e;
    public long f;
    public com.unity3d.services.core.timer.a g;

    public e(String str, Configuration configuration) {
        this.c = str == null ? a : str;
        this.d = configuration;
        this.e = new ConditionVariable();
        this.b = UUID.randomUUID().toString();
    }

    @Override // com.unity3d.services.core.webview.bridge.d
    public String a() {
        return this.b;
    }

    public long d() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f);
    }

    public void e() {
        this.f = System.nanoTime();
    }
}
