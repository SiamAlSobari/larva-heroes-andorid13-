package com.unity3d.services.core.configuration;

import com.unity3d.services.core.misc.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class InitializationNotificationCenter implements IInitializationNotificationCenter {
    private static InitializationNotificationCenter a;
    private HashMap<Integer, IInitializationListener> b = new HashMap<>();

    class a implements Runnable {
        final /* synthetic */ Map.Entry a;

        a(Map.Entry entry) {
            this.a = entry;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((IInitializationListener) this.a.getValue()).onSdkInitialized();
        }
    }

    class b implements Runnable {
        final /* synthetic */ Map.Entry a;
        final /* synthetic */ String b;
        final /* synthetic */ ErrorState c;
        final /* synthetic */ int d;

        b(Map.Entry entry, String str, ErrorState errorState, int i) {
            this.a = entry;
            this.b = str;
            this.c = errorState;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((IInitializationListener) this.a.getValue()).onSdkInitializationFailed(this.b, this.c, this.d);
        }
    }

    private void a(Integer num) {
        this.b.remove(num);
    }

    public static InitializationNotificationCenter getInstance() {
        if (a == null) {
            a = new InitializationNotificationCenter();
        }
        return a;
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void addListener(IInitializationListener iInitializationListener) {
        synchronized (this.b) {
            if (iInitializationListener != null) {
                this.b.put(new Integer(iInitializationListener.hashCode()), iInitializationListener);
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void removeListener(IInitializationListener iInitializationListener) {
        synchronized (this.b) {
            if (iInitializationListener != null) {
                a(new Integer(iInitializationListener.hashCode()));
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitializationFailed(String str, ErrorState errorState, int i) {
        synchronized (this.b) {
            String str2 = "SDK Failed to Initialize due to " + str;
            com.unity3d.services.core.log.a.c(str2);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Integer, IInitializationListener> entry : this.b.entrySet()) {
                if (entry.getValue() != null) {
                    j.a(new b(entry, str2, errorState, i));
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.b.remove((Integer) it.next());
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitialized() {
        synchronized (this.b) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Integer, IInitializationListener> entry : this.b.entrySet()) {
                if (entry.getValue() != null) {
                    j.a(new a(entry));
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.b.remove((Integer) it.next());
            }
        }
    }
}
