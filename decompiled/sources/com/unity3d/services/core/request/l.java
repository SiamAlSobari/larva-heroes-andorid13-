package com.unity3d.services.core.request;

import android.os.ConditionVariable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WebRequestThread.java */
/* JADX INFO: loaded from: classes2.dex */
public class l {
    private static boolean a = false;
    private static LinkedBlockingQueue<Runnable> b = null;
    private static com.unity3d.services.core.request.a c = null;
    private static int d = 1;
    private static int e = 1;
    private static long f = 1000;
    private static final Object g = new Object();

    /* JADX INFO: compiled from: WebRequestThread.java */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean unused = l.a = true;
            synchronized (l.g) {
                l.g.notify();
            }
        }
    }

    /* JADX INFO: compiled from: WebRequestThread.java */
    static class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ com.unity3d.services.core.request.b b;

        /* JADX INFO: compiled from: WebRequestThread.java */
        class a implements Runnable {
            final /* synthetic */ ConditionVariable a;

            a(ConditionVariable conditionVariable) {
                this.a = conditionVariable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String hostAddress = InetAddress.getByName(b.this.a).getHostAddress();
                    b bVar = b.this;
                    bVar.b.a(bVar.a, hostAddress);
                } catch (UnknownHostException e) {
                    com.unity3d.services.core.log.a.a("Unknown host", e);
                    b bVar2 = b.this;
                    bVar2.b.a(bVar2.a, f.UNKNOWN_HOST, e.getMessage());
                }
                this.a.open();
            }
        }

        b(String str, com.unity3d.services.core.request.b bVar) {
            this.a = str;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Exception e;
            Thread thread;
            ConditionVariable conditionVariable = new ConditionVariable();
            try {
                thread = new Thread(new a(conditionVariable));
                try {
                    thread.start();
                } catch (Exception e2) {
                    e = e2;
                    com.unity3d.services.core.log.a.a("Exception while resolving host", e);
                    this.b.a(this.a, f.UNEXPECTED_EXCEPTION, e.getMessage());
                }
            } catch (Exception e3) {
                e = e3;
                thread = null;
            }
            if (conditionVariable.block(20000L) || thread == null) {
                return;
            }
            thread.interrupt();
            this.b.a(this.a, f.TIMEOUT, "Timeout");
        }
    }

    public static synchronized void b() {
        com.unity3d.services.core.request.a aVar = c;
        if (aVar != null) {
            aVar.a();
            for (Runnable runnable : b) {
                if (runnable instanceof k) {
                    ((k) runnable).a(true);
                }
            }
            b.clear();
            c.purge();
        }
    }

    private static synchronized void c() {
        b = new LinkedBlockingQueue<>();
        com.unity3d.services.core.request.a aVar = new com.unity3d.services.core.request.a(d, e, f, TimeUnit.MILLISECONDS, b);
        c = aVar;
        aVar.prestartAllCoreThreads();
        b.add(new a());
        while (!a) {
            try {
                Object obj = g;
                synchronized (obj) {
                    obj.wait();
                }
            } catch (InterruptedException unused) {
                com.unity3d.services.core.log.a.b("Couldn't synchronize thread");
                return;
            }
        }
    }

    public static synchronized void a(String str, h.a aVar, Map<String, List<String>> map, Integer num, Integer num2, c cVar) {
        a(str, aVar, map, null, num, num2, cVar);
    }

    public static synchronized void a(String str, h.a aVar, Map<String, List<String>> map, String str2, Integer num, Integer num2, c cVar) {
        if (!a) {
            c();
        }
        if (str != null && str.length() >= 3) {
            b.add(new k(str, aVar.name(), str2, num.intValue(), num2.intValue(), map, cVar));
            return;
        }
        cVar.a(str, "Request is NULL or too short");
    }

    public static synchronized void b(int i) {
        e = i;
        com.unity3d.services.core.request.a aVar = c;
        if (aVar != null) {
            aVar.setMaximumPoolSize(i);
        }
    }

    public static synchronized void a(int i) {
        d = i;
        e = i;
        com.unity3d.services.core.request.a aVar = c;
        if (aVar != null) {
            aVar.setCorePoolSize(i);
            c.setMaximumPoolSize(e);
        }
    }

    public static synchronized void a(long j) {
        f = j;
        com.unity3d.services.core.request.a aVar = c;
        if (aVar != null) {
            aVar.setKeepAliveTime(j, TimeUnit.MILLISECONDS);
        }
    }

    public static synchronized boolean a(String str, com.unity3d.services.core.request.b bVar) {
        if (str != null) {
            if (str.length() >= 3) {
                new Thread(new b(str, bVar)).start();
                return true;
            }
        }
        bVar.a(str, f.INVALID_HOST, "Host is NULL");
        return false;
    }
}
