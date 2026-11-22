package com.unity3d.services.store.gpbl;

/* JADX INFO: compiled from: BillingResultResponseCode.java */
/* JADX INFO: loaded from: classes2.dex */
public enum a {
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8);

    private final int n;

    a(int i) {
        this.n = i;
    }

    public int a() {
        return this.n;
    }

    public static a a(int i) {
        for (a aVar : values()) {
            if (aVar.a() == i) {
                return aVar;
            }
        }
        return null;
    }
}
