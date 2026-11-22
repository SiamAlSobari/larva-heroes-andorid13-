package com.unity3d.services.core.misc;

import java.util.Queue;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: EventSubject.java */
/* JADX INFO: loaded from: classes2.dex */
public class a<T> {
    com.unity3d.services.core.timer.d a;
    Queue<T> b;
    private b<T> c;

    /* JADX INFO: renamed from: com.unity3d.services.core.misc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EventSubject.java */
    class C0046a implements com.unity3d.services.core.timer.f {
        C0046a() {
        }

        @Override // com.unity3d.services.core.timer.f
        public void a() {
            a.this.c();
        }
    }

    public a(Queue<T> queue, Integer num, com.unity3d.services.core.timer.e eVar) {
        this.b = queue;
        this.a = eVar.a(num, Integer.valueOf(queue.size()), new C0046a());
    }

    private void b() {
        com.unity3d.services.core.timer.d dVar = this.a;
        if (dVar != null) {
            dVar.a();
            this.a = null;
        }
    }

    private void d() {
        com.unity3d.services.core.timer.d dVar = this.a;
        if (dVar != null) {
            dVar.a(Executors.newSingleThreadScheduledExecutor());
        }
    }

    public void a(b<T> bVar) {
        Queue<T> queue = this.b;
        if (queue == null || queue.size() <= 0 || this.a == null || bVar == null) {
            return;
        }
        this.c = bVar;
        d();
    }

    public void c() {
        b<T> bVar = this.c;
        if (bVar != null) {
            bVar.a(this.b.remove());
        }
        if (this.b.size() <= 0) {
            e();
        }
    }

    public void e() {
        b();
        this.c = null;
    }

    public boolean a() {
        return this.b.isEmpty();
    }
}
