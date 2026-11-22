package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzavo {
    static long zza(long j, int i) {
        if (i == 1) {
            return j;
        }
        return ((i & 1) == 0 ? zza((j * j) % 1073807359, i >> 1) : j * (zza((j * j) % 1073807359, i >> 1) % 1073807359)) % 1073807359;
    }

    static String zzb(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            zzcaa.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static void zzc(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        int i3 = 6;
        if (length < 6) {
            zzd(i, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzd(i, jZze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i4 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i4 >= length2 - 5) {
                return;
            }
            long jZza = zzavk.zza(strArr[i4 - 1]);
            long jZza2 = zzavk.zza(strArr[i4 + 5]);
            String strZzb = zzb(strArr, i4, i3);
            jZze = ((((((jZze + 1073807359) - ((zza(16785407L, 5) * ((jZza + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jZza2 + 2147483647L) % 1073807359)) % 1073807359;
            zzd(i, jZze, strZzb, length2, priorityQueue);
            i4++;
            i3 = 6;
        }
    }

    static void zzd(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzavn zzavnVar = new zzavn(j, str, i2);
        if ((priorityQueue.size() != i || (((zzavn) priorityQueue.peek()).zzc <= zzavnVar.zzc && ((zzavn) priorityQueue.peek()).zza <= zzavnVar.zza)) && !priorityQueue.contains(zzavnVar)) {
            priorityQueue.add(zzavnVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i, int i2) {
        long jZza = (((long) zzavk.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jZza = (((jZza * 16785407) % 1073807359) + ((((long) zzavk.zza(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
