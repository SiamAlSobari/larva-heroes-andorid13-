package com.unity3d.scar.adapter.common.scarads;

/* JADX INFO: loaded from: classes2.dex */
public class ScarAdMetadata {
    private String a;
    private String b;
    private String c;
    private String d;
    private Integer e;

    public ScarAdMetadata(String str, String str2) {
        this(str, str2, null, null, null);
    }

    public String getAdString() {
        return this.d;
    }

    public String getAdUnitId() {
        return this.c;
    }

    public String getPlacementId() {
        return this.a;
    }

    public String getQueryId() {
        return this.b;
    }

    public Integer getVideoLengthMs() {
        return this.e;
    }

    public ScarAdMetadata(String str, String str2, String str3, String str4, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
    }
}
