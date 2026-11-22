package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzge {
    private static final zzge zzb = new zzge(true);
    final zziy zza = new zzio(16);
    private boolean zzc;
    private boolean zzd;

    private zzge() {
    }

    public static int zza(zzgd zzgdVar, Object obj) {
        int iZzd;
        int iZzy;
        zzjv zzjvVarZzd = zzgdVar.zzd();
        int iZza = zzgdVar.zza();
        zzgdVar.zzg();
        int i = zzfk.zzb;
        int iZzy2 = zzfk.zzy(iZza << 3);
        if (zzjvVarZzd == zzjv.GROUP) {
            zzhy zzhyVar = (zzhy) obj;
            byte[] bArr = zzgw.zzd;
            if (zzhyVar instanceof zzej) {
                throw null;
            }
            iZzy2 += iZzy2;
        }
        zzjw zzjwVar = zzjw.INT;
        int iZzz = 4;
        switch (zzjvVarZzd) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iZzz = 8;
                return iZzy2 + iZzz;
            case FLOAT:
                ((Float) obj).floatValue();
                return iZzy2 + iZzz;
            case INT64:
                iZzz = zzfk.zzz(((Long) obj).longValue());
                return iZzy2 + iZzz;
            case UINT64:
                iZzz = zzfk.zzz(((Long) obj).longValue());
                return iZzy2 + iZzz;
            case INT32:
                iZzz = zzfk.zzu(((Integer) obj).intValue());
                return iZzy2 + iZzz;
            case FIXED64:
                ((Long) obj).longValue();
                iZzz = 8;
                return iZzy2 + iZzz;
            case FIXED32:
                ((Integer) obj).intValue();
                return iZzy2 + iZzz;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iZzz = 1;
                return iZzy2 + iZzz;
            case STRING:
                if (obj instanceof zzez) {
                    iZzd = ((zzez) obj).zzd();
                    iZzy = zzfk.zzy(iZzd);
                    iZzz = iZzy + iZzd;
                } else {
                    iZzz = zzfk.zzx((String) obj);
                }
                return iZzy2 + iZzz;
            case GROUP:
                iZzz = ((zzhy) obj).zzn();
                return iZzy2 + iZzz;
            case MESSAGE:
                if (obj instanceof zzhd) {
                    iZzd = ((zzhd) obj).zza();
                    iZzy = zzfk.zzy(iZzd);
                    iZzz = iZzy + iZzd;
                } else {
                    iZzz = zzfk.zzv((zzhy) obj);
                }
                return iZzy2 + iZzz;
            case BYTES:
                if (obj instanceof zzez) {
                    iZzd = ((zzez) obj).zzd();
                    iZzy = zzfk.zzy(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzy = zzfk.zzy(iZzd);
                }
                iZzz = iZzy + iZzd;
                return iZzy2 + iZzz;
            case UINT32:
                iZzz = zzfk.zzy(((Integer) obj).intValue());
                return iZzy2 + iZzz;
            case ENUM:
                iZzz = obj instanceof zzgq ? zzfk.zzu(((zzgq) obj).zza()) : zzfk.zzu(((Integer) obj).intValue());
                return iZzy2 + iZzz;
            case SFIXED32:
                ((Integer) obj).intValue();
                return iZzy2 + iZzz;
            case SFIXED64:
                ((Long) obj).longValue();
                iZzz = 8;
                return iZzy2 + iZzz;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                iZzz = zzfk.zzy((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzy2 + iZzz;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                iZzz = zzfk.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzy2 + iZzz;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzge zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzid) {
            return ((zzid) obj).zzd();
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

    private final void zzm(Map.Entry entry) {
        zzhy zzhyVarZzj;
        zzgd zzgdVar = (zzgd) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzhd) {
            throw null;
        }
        zzgdVar.zzg();
        if (zzgdVar.zze() != zzjw.MESSAGE) {
            this.zza.put(zzgdVar, zzl(value));
            return;
        }
        Object objZze = zze(zzgdVar);
        if (objZze == null) {
            this.zza.put(zzgdVar, zzl(value));
            return;
        }
        if (objZze instanceof zzid) {
            zzhyVarZzj = zzgdVar.zzc((zzid) objZze, (zzid) value);
        } else {
            zzhx zzhxVarZzW = ((zzhy) objZze).zzW();
            zzgdVar.zzb(zzhxVarZzW, (zzhy) value);
            zzhyVarZzj = zzhxVarZzW.zzj();
        }
        this.zza.put(zzgdVar, zzhyVarZzj);
    }

    private static boolean zzn(Map.Entry entry) {
        zzgd zzgdVar = (zzgd) entry.getKey();
        if (zzgdVar.zze() != zzjw.MESSAGE) {
            return true;
        }
        zzgdVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzhz) {
            return ((zzhz) value).zzo();
        }
        if (value instanceof zzhd) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        zzgd zzgdVar = (zzgd) entry.getKey();
        Object value = entry.getValue();
        if (zzgdVar.zze() != zzjw.MESSAGE) {
            return zza(zzgdVar, value);
        }
        zzgdVar.zzg();
        zzgdVar.zzf();
        if (!(value instanceof zzhd)) {
            int iZzy = zzfk.zzy(((zzgd) entry.getKey()).zza());
            int iZzy2 = zzfk.zzy(24) + zzfk.zzv((zzhy) value);
            int iZzy3 = zzfk.zzy(16);
            int iZzy4 = zzfk.zzy(8);
            return iZzy4 + iZzy4 + iZzy3 + iZzy + iZzy2;
        }
        int iZzy5 = zzfk.zzy(((zzgd) entry.getKey()).zza());
        int iZza = ((zzhd) value).zza();
        int iZzy6 = zzfk.zzy(iZza) + iZza;
        int iZzy7 = zzfk.zzy(24);
        int iZzy8 = zzfk.zzy(16);
        int iZzy9 = zzfk.zzy(8);
        return iZzy9 + iZzy9 + iZzy8 + iZzy5 + iZzy7 + iZzy6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzge) {
            return this.zza.equals(((zzge) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzo = 0;
        for (int i = 0; i < this.zza.zzb(); i++) {
            iZzo += zzo(this.zza.zzg(i));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzge clone() {
        zzge zzgeVar = new zzge();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzgeVar.zzi((zzgd) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgeVar.zzi((zzgd) entry.getKey(), entry.getValue());
        }
        zzgeVar.zzd = this.zzd;
        return zzgeVar;
    }

    public final Object zze(zzgd zzgdVar) {
        Object obj = this.zza.get(zzgdVar);
        if (!(obj instanceof zzhd)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zzd ? new zzhc(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            if (entryZzg.getValue() instanceof zzgo) {
                ((zzgo) entryZzg.getValue()).zzA();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzge zzgeVar) {
        for (int i = 0; i < zzgeVar.zza.zzb(); i++) {
            zzm(zzgeVar.zza.zzg(i));
        }
        Iterator it = zzgeVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzgq) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzhd) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzgd zzgdVar, Object obj) {
        boolean z;
        zzgdVar.zzg();
        zzgdVar.zzd();
        byte[] bArr = zzgw.zzd;
        obj.getClass();
        zzjv zzjvVar = zzjv.DOUBLE;
        zzjw zzjwVar = zzjw.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof zzez)) {
                    break;
                }
                if (obj instanceof zzhd) {
                    this.zzd = true;
                }
                this.zza.put(zzgdVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zzhd) {
                    this.zzd = true;
                }
                this.zza.put(zzgdVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zzhy)) {
                    break;
                }
                if (obj instanceof zzhd) {
                    this.zzd = true;
                }
                this.zza.put(zzgdVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgdVar.zza()), zzgdVar.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzn(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzge(boolean z) {
        zzg();
        zzg();
    }
}
