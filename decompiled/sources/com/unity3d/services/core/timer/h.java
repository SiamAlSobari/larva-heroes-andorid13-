package com.unity3d.services.core.timer;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: IntervalTimer.java */
/* JADX INFO: loaded from: classes2.dex */
public class h extends a implements d {
    private final Integer j;
    private final Integer k;
    private Integer l;
    private f m;
    private final AtomicInteger n;

    public h(Integer num, Integer num2, f fVar, com.unity3d.services.core.lifecycle.c cVar) {
        super(num, null, cVar);
        this.n = new AtomicInteger(0);
        this.j = num2;
        this.m = fVar;
        int iIntValue = num2.intValue();
        int iIntValue2 = num.intValue();
        Integer numValueOf = Integer.valueOf(iIntValue != 0 ? iIntValue2 / num2.intValue() : iIntValue2);
        this.k = numValueOf;
        this.l = numValueOf;
    }

    @Override // com.unity3d.services.core.timer.a, com.unity3d.services.core.timer.c
    public void a() {
        super.a();
        this.m = null;
    }

    @Override // com.unity3d.services.core.timer.a
    public void d() {
        if (this.n.addAndGet(this.c.intValue()) >= this.l.intValue()) {
            i();
        }
        super.d();
    }

    public void i() {
        f fVar = this.m;
        if (fVar != null) {
            fVar.a();
        }
        this.l = Integer.valueOf(this.l.intValue() + this.k.intValue());
    }
}
