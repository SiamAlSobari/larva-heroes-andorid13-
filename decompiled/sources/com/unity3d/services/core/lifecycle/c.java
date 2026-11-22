package com.unity3d.services.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: LifecycleCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class c implements Application.ActivityLifecycleCallbacks {
    private e a = e.RESUMED;
    private boolean b = true;
    private Set<b> c = new HashSet();

    public boolean a() {
        return this.b;
    }

    public synchronized void b() {
        e eVar = this.b ? e.RESUMED : e.PAUSED;
        Iterator<b> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(eVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.a = e.CREATED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.a = e.DESTROYED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.a = e.PAUSED;
        this.b = false;
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.a = e.RESUMED;
        this.b = true;
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.a = e.SAVE_INSTANCE_STATE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.a = e.STARTED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.a = e.STOPPED;
    }

    public synchronized void a(b bVar) {
        this.c.add(bVar);
    }

    public synchronized void b(b bVar) {
        this.c.remove(bVar);
    }
}
