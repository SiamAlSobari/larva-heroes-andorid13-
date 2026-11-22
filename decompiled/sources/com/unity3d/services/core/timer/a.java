package com.unity3d.services.core.timer;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: BaseTimer.java */
/* JADX INFO: loaded from: classes2.dex */
public class a implements c, com.unity3d.services.core.lifecycle.b {
    private final com.unity3d.services.core.lifecycle.c a;
    final Integer b;
    final Integer c;
    Integer d;
    private g e;
    private ScheduledFuture<?> f;
    private ScheduledExecutorService g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;

    /* JADX INFO: renamed from: com.unity3d.services.core.timer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseTimer.java */
    class RunnableC0048a implements Runnable {
        RunnableC0048a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.d = Integer.valueOf(aVar.d.intValue() - a.this.c.intValue());
            a.this.d();
        }
    }

    /* JADX INFO: compiled from: BaseTimer.java */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.unity3d.services.core.lifecycle.e.values().length];
            a = iArr;
            try {
                iArr[com.unity3d.services.core.lifecycle.e.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.unity3d.services.core.lifecycle.e.RESUMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(Integer num, g gVar, com.unity3d.services.core.lifecycle.c cVar) {
        this.c = 1000;
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.b = num;
        this.d = num;
        this.e = gVar;
        this.a = cVar;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    private void c() {
        g gVar = this.e;
        if (gVar != null) {
            gVar.a();
        }
    }

    private void g() {
        try {
            this.f = this.g.scheduleAtFixedRate(new RunnableC0048a(), this.c.intValue(), this.c.intValue(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException | RejectedExecutionException e) {
            com.unity3d.services.core.log.a.b("ERROR: IntervalTimer failed to start due to exception " + e.getLocalizedMessage());
        }
    }

    @Override // com.unity3d.services.core.timer.c
    public void a(ScheduledExecutorService scheduledExecutorService) {
        if (this.h.compareAndSet(false, true)) {
            this.g = scheduledExecutorService;
            g();
        }
    }

    public boolean b() {
        return this.h.get();
    }

    public void d() {
        if (this.d.intValue() <= 0) {
            c();
            a();
        }
    }

    public boolean e() {
        boolean z;
        ScheduledFuture<?> scheduledFuture = this.f;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            z = false;
        } else {
            z = true;
            this.f.cancel(true);
            this.f = null;
        }
        this.h.getAndSet(false);
        return z;
    }

    public boolean f() {
        boolean z;
        ScheduledExecutorService scheduledExecutorService = this.g;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            z = false;
        } else {
            g();
            z = true;
        }
        this.h.getAndSet(z);
        return z;
    }

    public void h() {
        ScheduledExecutorService scheduledExecutorService = this.g;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.g.shutdown();
            this.g = null;
        }
        this.h.getAndSet(false);
    }

    @Override // com.unity3d.services.core.timer.c
    public void a() {
        h();
        com.unity3d.services.core.lifecycle.c cVar = this.a;
        if (cVar != null) {
            cVar.b(this);
        }
        this.e = null;
    }

    @Override // com.unity3d.services.core.lifecycle.b
    public void a(com.unity3d.services.core.lifecycle.e eVar) {
        int i = b.a[eVar.ordinal()];
        if (i != 1) {
            if (i == 2 && this.i.get()) {
                this.i.getAndSet(false);
                f();
                return;
            }
            return;
        }
        if (b()) {
            e();
            this.i.getAndSet(true);
        }
    }

    public a(Integer num, g gVar) {
        this(num, gVar, com.unity3d.services.core.lifecycle.a.a());
    }
}
