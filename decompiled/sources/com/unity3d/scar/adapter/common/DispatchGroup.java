package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes2.dex */
public class DispatchGroup {
    private int a = 0;
    private Runnable b;

    private void a() {
        Runnable runnable;
        if (this.a > 0 || (runnable = this.b) == null) {
            return;
        }
        runnable.run();
    }

    public synchronized void enter() {
        this.a++;
    }

    public synchronized void leave() {
        this.a--;
        a();
    }

    public void notify(Runnable runnable) {
        this.b = runnable;
        a();
    }
}
