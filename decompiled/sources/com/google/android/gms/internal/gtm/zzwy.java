package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwy {
    private static final zzwy zzb = new zzwy(true);
    final zzzu zza = new zzzk(16);
    private boolean zzc;
    private boolean zzd;

    private zzwy() {
    }

    static int zza(zzaao zzaaoVar, int i, Object obj) {
        int iZzd;
        int iZzD;
        int i2 = zzuq.zzf;
        int iZzD2 = zzuq.zzD(i << 3);
        if (zzaaoVar == zzaao.GROUP) {
            zzyu zzyuVar = (zzyu) obj;
            byte[] bArr = zzxs.zzd;
            if (zzyuVar instanceof zztm) {
                throw null;
            }
            iZzD2 += iZzD2;
        }
        zzaap zzaapVar = zzaap.INT;
        int iZzE = 4;
        switch (zzaaoVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iZzE = 8;
                return iZzD2 + iZzE;
            case FLOAT:
                ((Float) obj).floatValue();
                return iZzD2 + iZzE;
            case INT64:
                iZzE = zzuq.zzE(((Long) obj).longValue());
                return iZzD2 + iZzE;
            case UINT64:
                iZzE = zzuq.zzE(((Long) obj).longValue());
                return iZzD2 + iZzE;
            case INT32:
                iZzE = zzuq.zzz(((Integer) obj).intValue());
                return iZzD2 + iZzE;
            case FIXED64:
                ((Long) obj).longValue();
                iZzE = 8;
                return iZzD2 + iZzE;
            case FIXED32:
                ((Integer) obj).intValue();
                return iZzD2 + iZzE;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iZzE = 1;
                return iZzD2 + iZzE;
            case STRING:
                if (obj instanceof zzud) {
                    iZzd = ((zzud) obj).zzd();
                    iZzD = zzuq.zzD(iZzd);
                    iZzE = iZzD + iZzd;
                } else {
                    iZzE = zzuq.zzC((String) obj);
                }
                return iZzD2 + iZzE;
            case GROUP:
                iZzE = ((zzyu) obj).zzX();
                return iZzD2 + iZzE;
            case MESSAGE:
                if (obj instanceof zzxz) {
                    iZzd = ((zzxz) obj).zza();
                    iZzD = zzuq.zzD(iZzd);
                    iZzE = iZzD + iZzd;
                } else {
                    iZzE = zzuq.zzA((zzyu) obj);
                }
                return iZzD2 + iZzE;
            case BYTES:
                if (obj instanceof zzud) {
                    iZzd = ((zzud) obj).zzd();
                    iZzD = zzuq.zzD(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzD = zzuq.zzD(iZzd);
                }
                iZzE = iZzD + iZzd;
                return iZzD2 + iZzE;
            case UINT32:
                iZzE = zzuq.zzD(((Integer) obj).intValue());
                return iZzD2 + iZzE;
            case ENUM:
                iZzE = obj instanceof zzxl ? zzuq.zzz(((zzxl) obj).zza()) : zzuq.zzz(((Integer) obj).intValue());
                return iZzD2 + iZzE;
            case SFIXED32:
                ((Integer) obj).intValue();
                return iZzD2 + iZzE;
            case SFIXED64:
                ((Long) obj).longValue();
                iZzE = 8;
                return iZzD2 + iZzE;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                iZzE = zzuq.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzD2 + iZzE;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                iZzE = zzuq.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzD2 + iZzE;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzwx zzwxVar, Object obj) {
        zzaao zzaaoVarZzd = zzwxVar.zzd();
        int iZza = zzwxVar.zza();
        if (!zzwxVar.zzg()) {
            return zza(zzaaoVarZzd, iZza, obj);
        }
        zzwxVar.zzf();
        Iterator it = ((List) obj).iterator();
        int iZza2 = 0;
        while (it.hasNext()) {
            iZza2 += zza(zzaaoVarZzd, iZza, it.next());
        }
        return iZza2;
    }

    public static zzwy zze() {
        return zzb;
    }

    private static Object zzn(Object obj) {
        if (obj instanceof zzyz) {
            return ((zzyz) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzo(Map.Entry entry) {
        zzyu zzyuVarZzD;
        zzwx zzwxVar = (zzwx) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzxz) {
            throw null;
        }
        if (zzwxVar.zzg()) {
            Object objZzf = zzf(zzwxVar);
            if (objZzf == null) {
                objZzf = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZzf).add(zzn(it.next()));
            }
            this.zza.put(zzwxVar, objZzf);
            return;
        }
        if (zzwxVar.zze() != zzaap.MESSAGE) {
            this.zza.put(zzwxVar, zzn(value));
            return;
        }
        Object objZzf2 = zzf(zzwxVar);
        if (objZzf2 == null) {
            this.zza.put(zzwxVar, zzn(value));
            return;
        }
        if (objZzf2 instanceof zzyz) {
            zzyuVarZzD = zzwxVar.zzc((zzyz) objZzf2, (zzyz) value);
        } else {
            zzyt zzytVarZzav = ((zzyu) objZzf2).zzav();
            zzwxVar.zzb(zzytVarZzav, (zzyu) value);
            zzyuVarZzD = zzytVarZzav.zzD();
        }
        this.zza.put(zzwxVar, zzyuVarZzD);
    }

    private static boolean zzp(Map.Entry entry) {
        zzwx zzwxVar = (zzwx) entry.getKey();
        if (zzwxVar.zze() != zzaap.MESSAGE) {
            return true;
        }
        if (!zzwxVar.zzg()) {
            return zzq(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!zzq(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzq(Object obj) {
        if (obj instanceof zzyv) {
            return ((zzyv) obj).zzay();
        }
        if (obj instanceof zzxz) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzr(Map.Entry entry) {
        zzwx zzwxVar = (zzwx) entry.getKey();
        Object value = entry.getValue();
        if (zzwxVar.zze() != zzaap.MESSAGE || zzwxVar.zzg()) {
            return zzb(zzwxVar, value);
        }
        zzwxVar.zzf();
        if (!(value instanceof zzxz)) {
            int iZzD = zzuq.zzD(((zzwx) entry.getKey()).zza());
            int iZzD2 = zzuq.zzD(24) + zzuq.zzA((zzyu) value);
            int iZzD3 = zzuq.zzD(16);
            int iZzD4 = zzuq.zzD(8);
            return iZzD4 + iZzD4 + iZzD3 + iZzD + iZzD2;
        }
        int iZzD5 = zzuq.zzD(((zzwx) entry.getKey()).zza());
        int iZza = ((zzxz) value).zza();
        int iZzD6 = zzuq.zzD(iZza) + iZza;
        int iZzD7 = zzuq.zzD(24);
        int iZzD8 = zzuq.zzD(16);
        int iZzD9 = zzuq.zzD(8);
        return iZzD9 + iZzD9 + iZzD8 + iZzD5 + iZzD7 + iZzD6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzs(zzwx zzwxVar, Object obj) {
        boolean z;
        zzwxVar.zzd();
        byte[] bArr = zzxs.zzd;
        obj.getClass();
        zzaao zzaaoVar = zzaao.DOUBLE;
        zzaap zzaapVar = zzaap.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzwxVar.zza()), zzwxVar.zzd().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzwxVar.zza()), zzwxVar.zzd().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzwxVar.zza()), zzwxVar.zzd().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzwxVar.zza()), zzwxVar.zzd().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzwxVar.zza()), zzwxVar.zzd().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzwxVar.zza()), zzwxVar.zzd().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzud) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzwxVar.zza()), zzwxVar.zzd().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzxl)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzwxVar.zza()), zzwxVar.zzd().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzyu) || (obj instanceof zzxz)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzwxVar.zza()), zzwxVar.zzd().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzwxVar.zza()), zzwxVar.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzwy) {
            return this.zza.equals(((zzwy) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int iZzr = 0;
        for (int i = 0; i < this.zza.zzb(); i++) {
            iZzr += zzr(this.zza.zzg(i));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzr += zzr((Map.Entry) it.next());
        }
        return iZzr;
    }

    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzwy clone() {
        zzwy zzwyVar = new zzwy();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzwyVar.zzk((zzwx) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzwyVar.zzk((zzwx) entry.getKey(), entry.getValue());
        }
        zzwyVar.zzd = this.zzd;
        return zzwyVar;
    }

    public final Object zzf(zzwx zzwxVar) {
        Object obj = this.zza.get(zzwxVar);
        if (!(obj instanceof zzxz)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzg() {
        return this.zzd ? new zzxy(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzh(zzwx zzwxVar, Object obj) {
        List arrayList;
        if (!((zzxg) zzwxVar).zzd) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        zzs(zzwxVar, obj);
        Object objZzf = zzf(zzwxVar);
        if (objZzf == null) {
            arrayList = new ArrayList();
            this.zza.put(zzwxVar, arrayList);
        } else {
            arrayList = (List) objZzf;
        }
        arrayList.add(obj);
    }

    public final void zzi() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            if (entryZzg.getValue() instanceof zzxj) {
                ((zzxj) entryZzg.getValue()).zzal();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzj(zzwy zzwyVar) {
        for (int i = 0; i < zzwyVar.zza.zzb(); i++) {
            zzo(zzwyVar.zza.zzg(i));
        }
        Iterator it = zzwyVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzo((Map.Entry) it.next());
        }
    }

    public final void zzk(zzwx zzwxVar, Object obj) {
        if (!zzwxVar.zzg()) {
            zzs(zzwxVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzs(zzwxVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof zzxz) {
            this.zzd = true;
        }
        this.zza.put(zzwxVar, obj);
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final boolean zzm() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzp(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzp((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzwy(boolean z) {
        zzi();
        zzi();
    }
}
