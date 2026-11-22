package com.unity3d.services.banners.view;

/* JADX INFO: compiled from: BannerPosition.java */
/* JADX INFO: loaded from: classes2.dex */
public enum a {
    TOP_LEFT(new int[]{10, 9}, 51),
    TOP_CENTER(new int[]{10, 14}, 49),
    TOP_RIGHT(new int[]{10, 11}, 53),
    BOTTOM_LEFT(new int[]{12, 9}, 83),
    BOTTOM_CENTER(new int[]{12, 14}, 81),
    BOTTOM_RIGHT(new int[]{12, 11}, 85),
    CENTER(new int[]{13}, 17),
    NONE(new int[0], 0);

    private final int[] j;
    private int k;

    a(int[] iArr, int i2) {
        this.j = iArr;
        this.k = i2;
    }

    public int a() {
        return this.k;
    }
}
