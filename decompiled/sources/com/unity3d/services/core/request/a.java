package com.unity3d.services.core.request;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: CancelableThreadPoolExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends ThreadPoolExecutor {
    private final List<Runnable> a;

    public a(int i, int i2, long j, TimeUnit timeUnit, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        super(i, i2, j, timeUnit, linkedBlockingQueue);
        this.a = new LinkedList();
    }

    public synchronized void a() {
        for (Runnable runnable : this.a) {
            if (runnable instanceof k) {
                ((k) runnable).a(true);
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected synchronized void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        this.a.remove(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected synchronized void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.a.add(runnable);
    }
}
