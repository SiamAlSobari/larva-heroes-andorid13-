package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements ac {
    private static final Object a = new Object();
    private volatile ac b;
    private volatile Object c = a;

    private z(ac acVar) {
        this.b = acVar;
    }

    @Override // com.google.android.play.integrity.internal.ac
    public final Object a() {
        Object objA = this.c;
        Object obj = a;
        if (objA == obj) {
            synchronized (this) {
                objA = this.c;
                if (objA == obj) {
                    objA = this.b.a();
                    Object obj2 = this.c;
                    if (obj2 != obj && obj2 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.c = objA;
                    this.b = null;
                }
            }
        }
        return objA;
    }

    public static ac b(ac acVar) {
        acVar.getClass();
        return acVar instanceof z ? acVar : new z(acVar);
    }
}
