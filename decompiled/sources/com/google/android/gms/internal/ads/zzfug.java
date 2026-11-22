package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfug implements Map, Serializable {

    @CheckForNull
    private transient zzfui zza;

    @CheckForNull
    private transient zzfui zzb;

    @CheckForNull
    private transient zzfty zzc;

    zzfug() {
    }

    public static zzfug zzc(Map map) {
        Set setEntrySet = map.entrySet();
        zzfuf zzfufVar = new zzfuf(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzfufVar.zzb(setEntrySet);
        return zzfufVar.zzc();
    }

    public static zzfug zzd() {
        return zzfvs.zza;
    }

    public static zzfug zze(Object obj, Object obj2) {
        zzfta.zzb("dialog_not_shown_reason", obj2);
        return zzfvs.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return zzfuy.zzb(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfvz.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfta.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    abstract zzfty zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfty values() {
        zzfty zzftyVar = this.zzc;
        if (zzftyVar != null) {
            return zzftyVar;
        }
        zzfty zzftyVarZza = zza();
        this.zzc = zzftyVarZza;
        return zzftyVarZza;
    }

    abstract zzfui zzf();

    abstract zzfui zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfui entrySet() {
        zzfui zzfuiVar = this.zza;
        if (zzfuiVar != null) {
            return zzfuiVar;
        }
        zzfui zzfuiVarZzf = zzf();
        this.zza = zzfuiVarZzf;
        return zzfuiVarZzf;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzfui keySet() {
        zzfui zzfuiVar = this.zzb;
        if (zzfuiVar != null) {
            return zzfuiVar;
        }
        zzfui zzfuiVarZzg = zzg();
        this.zzb = zzfuiVarZzg;
        return zzfuiVarZzg;
    }
}
