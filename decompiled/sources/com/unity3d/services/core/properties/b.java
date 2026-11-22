package com.unity3d.services.core.properties;

/* JADX INFO: compiled from: InitializationStatusReader.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: compiled from: InitializationStatusReader.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.a.values().length];
            a = iArr;
            try {
                iArr[d.a.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.a.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.a.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.a.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public String a(d.a aVar) {
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            return "not_initialized";
        }
        if (i == 2) {
            return "initializing";
        }
        if (i == 3) {
            return "initialized_successfully";
        }
        if (i != 4) {
            return null;
        }
        return "initialized_failed";
    }
}
