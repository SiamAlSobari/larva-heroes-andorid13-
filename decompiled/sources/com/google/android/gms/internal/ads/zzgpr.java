package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgpq;
import com.google.android.gms.internal.ads.zzgpr;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgpr<MessageType extends zzgpr<MessageType, BuilderType>, BuilderType extends zzgpq<MessageType, BuilderType>> implements zzgta {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static void zzav(Iterable iterable, List list) {
        byte[] bArr = zzgsa.zzd;
        iterable.getClass();
        if (iterable instanceof zzgsi) {
            List listZzh = ((zzgsi) iterable).zzh();
            zzgsi zzgsiVar = (zzgsi) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String str = "Element at index " + (zzgsiVar.size() - size) + " is null.";
                    int size2 = zzgsiVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        zzgsiVar.remove(size2);
                    }
                } else if (obj instanceof zzgqi) {
                    zzgsiVar.zzi((zzgqi) obj);
                } else {
                    zzgsiVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzgth) {
            list.addAll(iterable);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(str2);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    int zzat(zzgtt zzgttVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final zzgqi zzau() {
        try {
            int iZzaz = zzaz();
            zzgqi zzgqiVar = zzgqi.zzb;
            byte[] bArr = new byte[iZzaz];
            zzgqx zzgqxVarZzC = zzgqx.zzC(bArr, 0, iZzaz);
            zzaW(zzgqxVarZzC);
            zzgqxVarZzC.zzD();
            return new zzgqe(bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final void zzaw(OutputStream outputStream) throws IOException {
        int iZzaz = zzaz();
        int i = zzgqx.zzf;
        if (iZzaz > 4096) {
            iZzaz = 4096;
        }
        zzgqv zzgqvVar = new zzgqv(outputStream, iZzaz);
        zzaW(zzgqvVar);
        zzgqvVar.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final byte[] zzax() {
        try {
            int iZzaz = zzaz();
            byte[] bArr = new byte[iZzaz];
            zzgqx zzgqxVarZzC = zzgqx.zzC(bArr, 0, iZzaz);
            zzaW(zzgqxVarZzC);
            zzgqxVarZzC.zzD();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
