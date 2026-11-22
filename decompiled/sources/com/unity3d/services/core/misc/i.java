package com.unity3d.services.core.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Observable.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i<T> {
    private final List<d<T>> a = new ArrayList();

    protected synchronized void a(T t) {
        Iterator<d<T>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(t);
        }
    }

    public synchronized void registerObserver(d<T> dVar) {
        if (this.a.contains(dVar)) {
            return;
        }
        this.a.add(dVar);
    }

    public synchronized void unregisterObserver(d<T> dVar) {
        if (this.a.contains(dVar)) {
            this.a.remove(dVar);
        }
    }
}
