package com.unity3d.services.store.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.unity3d.services.store.listeners.e;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: StoreLifecycleListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private final ArrayList<String> a;
    private final com.unity3d.services.store.gpbl.c b;
    private final e c = new e(com.unity3d.services.store.b.PURCHASES_ON_RESUME_RESULT, com.unity3d.services.store.b.PURCHASES_ON_RESUME_ERROR);

    public b(ArrayList<String> arrayList, com.unity3d.services.store.gpbl.c cVar) {
        this.a = arrayList;
        this.b = cVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        try {
            Iterator<String> it = this.a.iterator();
            while (it.hasNext()) {
                this.b.a(it.next(), this.c);
            }
        } catch (ClassNotFoundException e) {
            com.unity3d.services.core.log.a.e("Couldn't fetch purchases onActivityResumed. " + e.getMessage());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
