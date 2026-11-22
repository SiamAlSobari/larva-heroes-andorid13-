package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfvz {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfrj zzfrjVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzfvw)) {
                set.getClass();
                return new zzfvw(set, zzfrjVar);
            }
            zzfvw zzfvwVar = (zzfvw) set;
            return new zzfvw(zzfvwVar.zza, zzfrm.zza(zzfvwVar.zzb, zzfrjVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzfvw)) {
            sortedSet.getClass();
            return new zzfvx(sortedSet, zzfrjVar);
        }
        zzfvw zzfvwVar2 = (zzfvw) sortedSet;
        return new zzfvx((SortedSet) zzfvwVar2.zza, zzfrm.zza(zzfvwVar2.zzb, zzfrjVar));
    }

    static boolean zzc(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean zze(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean zzd(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfvj) {
            collection = ((zzfvj) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
