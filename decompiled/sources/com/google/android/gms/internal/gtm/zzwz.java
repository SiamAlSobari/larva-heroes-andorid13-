package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzwz {
    DOUBLE(0, 1, zzxv.DOUBLE),
    FLOAT(1, 1, zzxv.FLOAT),
    INT64(2, 1, zzxv.LONG),
    UINT64(3, 1, zzxv.LONG),
    INT32(4, 1, zzxv.INT),
    FIXED64(5, 1, zzxv.LONG),
    FIXED32(6, 1, zzxv.INT),
    BOOL(7, 1, zzxv.BOOLEAN),
    STRING(8, 1, zzxv.STRING),
    MESSAGE(9, 1, zzxv.MESSAGE),
    BYTES(10, 1, zzxv.BYTE_STRING),
    UINT32(11, 1, zzxv.INT),
    ENUM(12, 1, zzxv.ENUM),
    SFIXED32(13, 1, zzxv.INT),
    SFIXED64(14, 1, zzxv.LONG),
    SINT32(15, 1, zzxv.INT),
    SINT64(16, 1, zzxv.LONG),
    GROUP(17, 1, zzxv.MESSAGE),
    DOUBLE_LIST(18, 2, zzxv.DOUBLE),
    FLOAT_LIST(19, 2, zzxv.FLOAT),
    INT64_LIST(20, 2, zzxv.LONG),
    UINT64_LIST(21, 2, zzxv.LONG),
    INT32_LIST(22, 2, zzxv.INT),
    FIXED64_LIST(23, 2, zzxv.LONG),
    FIXED32_LIST(24, 2, zzxv.INT),
    BOOL_LIST(25, 2, zzxv.BOOLEAN),
    STRING_LIST(26, 2, zzxv.STRING),
    MESSAGE_LIST(27, 2, zzxv.MESSAGE),
    BYTES_LIST(28, 2, zzxv.BYTE_STRING),
    UINT32_LIST(29, 2, zzxv.INT),
    ENUM_LIST(30, 2, zzxv.ENUM),
    SFIXED32_LIST(31, 2, zzxv.INT),
    SFIXED64_LIST(32, 2, zzxv.LONG),
    SINT32_LIST(33, 2, zzxv.INT),
    SINT64_LIST(34, 2, zzxv.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzxv.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzxv.FLOAT),
    INT64_LIST_PACKED(37, 3, zzxv.LONG),
    UINT64_LIST_PACKED(38, 3, zzxv.LONG),
    INT32_LIST_PACKED(39, 3, zzxv.INT),
    FIXED64_LIST_PACKED(40, 3, zzxv.LONG),
    FIXED32_LIST_PACKED(41, 3, zzxv.INT),
    BOOL_LIST_PACKED(42, 3, zzxv.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzxv.INT),
    ENUM_LIST_PACKED(44, 3, zzxv.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzxv.INT),
    SFIXED64_LIST_PACKED(46, 3, zzxv.LONG),
    SINT32_LIST_PACKED(47, 3, zzxv.INT),
    SINT64_LIST_PACKED(48, 3, zzxv.LONG),
    GROUP_LIST(49, 2, zzxv.MESSAGE),
    MAP(50, 4, zzxv.VOID);

    private static final zzwz[] zzZ;
    private final zzxv zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzwz[] zzwzVarArrValues = values();
        zzZ = new zzwz[zzwzVarArrValues.length];
        for (zzwz zzwzVar : zzwzVarArrValues) {
            zzZ[zzwzVar.zzac] = zzwzVar;
        }
    }

    zzwz(int i, int i2, zzxv zzxvVar) {
        this.zzac = i;
        this.zzab = zzxvVar;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            this.zzad = zzxvVar.zza();
        } else {
            this.zzad = null;
        }
        if (i2 == 1) {
            zzxv zzxvVar2 = zzxv.VOID;
            zzxvVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
