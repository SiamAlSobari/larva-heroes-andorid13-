package com.unity3d.services.ads.adunit;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: AdUnitRelativeLayout.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends RelativeLayout {
    private final ArrayList<c> a;
    private int b;
    private boolean c;

    public e(Context context) {
        super(context);
        this.a = new ArrayList<>();
        this.b = 10000;
        this.c = false;
    }

    public void a(int i) {
        this.b = i;
        this.c = true;
    }

    public void b() {
        this.c = false;
    }

    public int getCurrentEventCount() {
        int size;
        synchronized (this.a) {
            size = this.a.size();
        }
        return size;
    }

    public int getMaxEventCount() {
        return this.b;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        if (!this.c || this.a.size() >= this.b) {
            return false;
        }
        boolean z = (motionEvent.getFlags() & 1) != 0;
        synchronized (this.a) {
            this.a.add(new c(motionEvent.getActionMasked(), z, motionEvent.getToolType(0), motionEvent.getSource(), motionEvent.getDeviceId(), motionEvent.getX(0), motionEvent.getY(0), motionEvent.getEventTime(), motionEvent.getPressure(0), motionEvent.getSize(0)));
        }
        return false;
    }

    public void a() {
        synchronized (this.a) {
            this.a.clear();
        }
    }

    public SparseArray<SparseArray<c>> a(SparseArray<ArrayList<Integer>> sparseArray) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseArray<SparseArray<c>> sparseArray2 = new SparseArray<>();
        synchronized (this.a) {
            for (c cVar : this.a) {
                ArrayList<Integer> arrayList = sparseArray.get(cVar.a());
                if (arrayList != null) {
                    int iIntValue = arrayList.get(0).intValue();
                    if (sparseIntArray.get(cVar.a(), 0) == iIntValue) {
                        if (sparseArray2.get(cVar.a()) == null) {
                            sparseArray2.put(cVar.a(), new SparseArray<>());
                        }
                        sparseArray2.get(cVar.a()).put(iIntValue, cVar);
                        arrayList.remove(0);
                    }
                    sparseIntArray.put(cVar.a(), sparseIntArray.get(cVar.a()) + 1);
                }
            }
        }
        return sparseArray2;
    }

    public SparseIntArray a(ArrayList<Integer> arrayList) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        synchronized (this.a) {
            for (c cVar : this.a) {
                for (Integer num : arrayList) {
                    if (cVar.a() == num.intValue()) {
                        sparseIntArray.put(num.intValue(), sparseIntArray.get(num.intValue(), 0) + 1);
                        break;
                    }
                }
            }
        }
        return sparseIntArray;
    }
}
