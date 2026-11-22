package com.unity3d.services.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: LifecycleListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class f implements Application.ActivityLifecycleCallbacks {
    private ArrayList<String> a;

    public f(ArrayList<String> arrayList) {
        this.a = arrayList;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.a.contains("onActivityCreated") || com.unity3d.services.core.webview.a.c() == null) {
            return;
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.LIFECYCLE, e.CREATED, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (!this.a.contains("onActivityDestroyed") || com.unity3d.services.core.webview.a.c() == null) {
            return;
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.LIFECYCLE, e.DESTROYED, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!this.a.contains("onActivityPaused") || com.unity3d.services.core.webview.a.c() == null) {
            return;
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.LIFECYCLE, e.PAUSED, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (!this.a.contains("onActivityResumed") || com.unity3d.services.core.webview.a.c() == null) {
            return;
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.LIFECYCLE, e.RESUMED, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (!this.a.contains("onActivitySaveInstanceState") || com.unity3d.services.core.webview.a.c() == null) {
            return;
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.LIFECYCLE, e.SAVE_INSTANCE_STATE, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (!this.a.contains("onActivityStarted") || com.unity3d.services.core.webview.a.c() == null) {
            return;
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.LIFECYCLE, e.STARTED, activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (!this.a.contains("onActivityStopped") || com.unity3d.services.core.webview.a.c() == null) {
            return;
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.LIFECYCLE, e.STOPPED, activity.getClass().getName());
    }
}
