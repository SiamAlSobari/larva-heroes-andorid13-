package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzgri {
    DOUBLE(0, 1, zzgse.DOUBLE),
    FLOAT(1, 1, zzgse.FLOAT),
    INT64(2, 1, zzgse.LONG),
    UINT64(3, 1, zzgse.LONG),
    INT32(4, 1, zzgse.INT),
    FIXED64(5, 1, zzgse.LONG),
    FIXED32(6, 1, zzgse.INT),
    BOOL(7, 1, zzgse.BOOLEAN),
    STRING(8, 1, zzgse.STRING),
    MESSAGE(9, 1, zzgse.MESSAGE),
    BYTES(10, 1, zzgse.BYTE_STRING),
    UINT32(11, 1, zzgse.INT),
    ENUM(12, 1, zzgse.ENUM),
    SFIXED32(13, 1, zzgse.INT),
    SFIXED64(14, 1, zzgse.LONG),
    SINT32(15, 1, zzgse.INT),
    SINT64(16, 1, zzgse.LONG),
    GROUP(17, 1, zzgse.MESSAGE),
    DOUBLE_LIST(18, 2, zzgse.DOUBLE),
    FLOAT_LIST(19, 2, zzgse.FLOAT),
    INT64_LIST(20, 2, zzgse.LONG),
    UINT64_LIST(21, 2, zzgse.LONG),
    INT32_LIST(22, 2, zzgse.INT),
    FIXED64_LIST(23, 2, zzgse.LONG),
    FIXED32_LIST(24, 2, zzgse.INT),
    BOOL_LIST(25, 2, zzgse.BOOLEAN),
    STRING_LIST(26, 2, zzgse.STRING),
    MESSAGE_LIST(27, 2, zzgse.MESSAGE),
    BYTES_LIST(28, 2, zzgse.BYTE_STRING),
    UINT32_LIST(29, 2, zzgse.INT),
    ENUM_LIST(30, 2, zzgse.ENUM),
    SFIXED32_LIST(31, 2, zzgse.INT),
    SFIXED64_LIST(32, 2, zzgse.LONG),
    SINT32_LIST(33, 2, zzgse.INT),
    SINT64_LIST(34, 2, zzgse.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzgse.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzgse.FLOAT),
    INT64_LIST_PACKED(37, 3, zzgse.LONG),
    UINT64_LIST_PACKED(38, 3, zzgse.LONG),
    INT32_LIST_PACKED(39, 3, zzgse.INT),
    FIXED64_LIST_PACKED(40, 3, zzgse.LONG),
    FIXED32_LIST_PACKED(41, 3, zzgse.INT),
    BOOL_LIST_PACKED(42, 3, zzgse.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzgse.INT),
    ENUM_LIST_PACKED(44, 3, zzgse.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzgse.INT),
    SFIXED64_LIST_PACKED(46, 3, zzgse.LONG),
    SINT32_LIST_PACKED(47, 3, zzgse.INT),
    SINT64_LIST_PACKED(48, 3, zzgse.LONG),
    GROUP_LIST(49, 2, zzgse.MESSAGE),
    MAP(50, 4, zzgse.VOID);

    private static final zzgri[] zzZ;
    private final zzgse zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzgri[] zzgriVarArrValues = values();
        zzZ = new zzgri[zzgriVarArrValues.length];
        for (zzgri zzgriVar : zzgriVarArrValues) {
            zzZ[zzgriVar.zzac] = zzgriVar;
        }
    }

    zzgri(int i, int i2, zzgse zzgseVar) {
        this.zzac = i;
        this.zzab = zzgseVar;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            this.zzad = zzgseVar.zza();
        } else {
            this.zzad = null;
        }
        if (i2 == 1) {
            zzgse zzgseVar2 = zzgse.VOID;
            zzgseVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
