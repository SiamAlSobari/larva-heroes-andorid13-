package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzgva {
    DOUBLE(zzgvb.DOUBLE, 1),
    FLOAT(zzgvb.FLOAT, 5),
    INT64(zzgvb.LONG, 0),
    UINT64(zzgvb.LONG, 0),
    INT32(zzgvb.INT, 0),
    FIXED64(zzgvb.LONG, 1),
    FIXED32(zzgvb.INT, 5),
    BOOL(zzgvb.BOOLEAN, 0),
    STRING(zzgvb.STRING, 2),
    GROUP(zzgvb.MESSAGE, 3),
    MESSAGE(zzgvb.MESSAGE, 2),
    BYTES(zzgvb.BYTE_STRING, 2),
    UINT32(zzgvb.INT, 0),
    ENUM(zzgvb.ENUM, 0),
    SFIXED32(zzgvb.INT, 5),
    SFIXED64(zzgvb.LONG, 1),
    SINT32(zzgvb.INT, 0),
    SINT64(zzgvb.LONG, 0);

    private final zzgvb zzt;

    zzgva(zzgvb zzgvbVar, int i) {
        this.zzt = zzgvbVar;
    }

    public final zzgvb zza() {
        return this.zzt;
    }
}
