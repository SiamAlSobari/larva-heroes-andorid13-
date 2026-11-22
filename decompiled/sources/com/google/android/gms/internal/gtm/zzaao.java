package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzaao {
    DOUBLE(zzaap.DOUBLE, 1),
    FLOAT(zzaap.FLOAT, 5),
    INT64(zzaap.LONG, 0),
    UINT64(zzaap.LONG, 0),
    INT32(zzaap.INT, 0),
    FIXED64(zzaap.LONG, 1),
    FIXED32(zzaap.INT, 5),
    BOOL(zzaap.BOOLEAN, 0),
    STRING(zzaap.STRING, 2),
    GROUP(zzaap.MESSAGE, 3),
    MESSAGE(zzaap.MESSAGE, 2),
    BYTES(zzaap.BYTE_STRING, 2),
    UINT32(zzaap.INT, 0),
    ENUM(zzaap.ENUM, 0),
    SFIXED32(zzaap.INT, 5),
    SFIXED64(zzaap.LONG, 1),
    SINT32(zzaap.INT, 0),
    SINT64(zzaap.LONG, 0);

    private final zzaap zzt;

    zzaao(zzaap zzaapVar, int i) {
        this.zzt = zzaapVar;
    }

    public final zzaap zza() {
        return this.zzt;
    }
}
