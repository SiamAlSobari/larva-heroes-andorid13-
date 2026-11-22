package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaei {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzaei";

    private zzaei() {
    }

    public static Object zza(String str, Type type) throws zzaca {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzaek) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
                } catch (Exception e) {
                    throw new zzaca("Json conversion failed! ".concat(String.valueOf(e.getMessage())), e);
                }
            } catch (Exception e2) {
                throw new zzaca("Instantiation of JsonResponse failed! ".concat(type.toString()), e2);
            }
        }
        try {
            zzaga zzagaVar = new zzaga();
            zzagaVar.zzb(str);
            if (zzagaVar.zzd()) {
                return zzagaVar.zzc();
            }
            throw new zzaca("No error message: " + str);
        } catch (Exception e3) {
            throw new zzaca("Json conversion failed! ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
