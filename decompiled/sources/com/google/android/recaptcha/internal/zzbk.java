package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbk {
    public static final zzbk zza = new zzbk();

    private zzbk() {
    }

    public static final Class zza(Object obj) throws zzt {
        Class<zzcr> cls;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (!(obj instanceof Integer)) {
            if (!(obj instanceof String)) {
                throw new zzt(6, 8, null);
            }
            String str = (String) obj;
            if (!zzbj.zzc(str)) {
                throw new zzt(6, 47, null);
            }
            try {
                return Class.forName(str);
            } catch (Exception e) {
                throw new zzt(6, 8, e);
            }
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == 1) {
            cls = Integer.TYPE;
        } else if (iIntValue == 2) {
            cls = Short.TYPE;
        } else if (iIntValue == 3) {
            cls = Byte.TYPE;
        } else if (iIntValue == 4) {
            cls = Long.TYPE;
        } else if (iIntValue == 5) {
            cls = Character.TYPE;
        } else if (iIntValue == 6) {
            cls = Float.TYPE;
        } else if (iIntValue == 7) {
            cls = Double.TYPE;
        } else if (iIntValue == 8) {
            cls = Boolean.TYPE;
        } else {
            cls = iIntValue == 9 ? zzcr.class : null;
        }
        if (cls != null) {
            return cls;
        }
        throw new zzt(4, 6, null);
    }
}
