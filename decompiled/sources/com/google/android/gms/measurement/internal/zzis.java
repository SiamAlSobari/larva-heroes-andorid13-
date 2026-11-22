package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzis extends zzf {
    protected zzik zza;
    private volatile zzik zzb;
    private volatile zzik zzc;
    private final Map zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zzik zzg;
    private zzik zzh;
    private boolean zzi;
    private final Object zzj;

    public zzis(zzfy zzfyVar) {
        super(zzfyVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzA(zzik zzikVar, zzik zzikVar2, long j, boolean z, Bundle bundle) {
        long j2;
        zzg();
        boolean z2 = false;
        boolean z3 = (zzikVar2 != null && zzikVar2.zzc == zzikVar.zzc && zzil.zza(zzikVar2.zzb, zzikVar.zzb) && zzil.zza(zzikVar2.zza, zzikVar.zza)) ? false : true;
        if (z && this.zza != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzlh.zzK(zzikVar, bundle2, true);
            if (zzikVar2 != null) {
                String str = zzikVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzikVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzikVar2.zzc);
            }
            if (z2) {
                zzkg zzkgVar = this.zzs.zzu().zzb;
                long j3 = j - zzkgVar.zzb;
                zzkgVar.zzb = j;
                if (j3 > 0) {
                    this.zzs.zzv().zzI(bundle2, j3);
                }
            }
            if (!this.zzs.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zzikVar.zze ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "app";
            long jCurrentTimeMillis = this.zzs.zzav().currentTimeMillis();
            if (zzikVar.zze) {
                long j4 = zzikVar.zzf;
                if (j4 != 0) {
                    j2 = j4;
                }
                this.zzs.zzq().zzH(str3, "_vs", j2, bundle2);
            }
            j2 = jCurrentTimeMillis;
            this.zzs.zzq().zzH(str3, "_vs", j2, bundle2);
        }
        if (z2) {
            zzB(this.zza, true, j);
        }
        this.zza = zzikVar;
        if (zzikVar.zze) {
            this.zzh = zzikVar;
        }
        this.zzs.zzt().zzG(zzikVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzB(zzik zzikVar, boolean z, long j) {
        this.zzs.zzd().zzf(this.zzs.zzav().elapsedRealtime());
        if (!this.zzs.zzu().zzb.zzd(zzikVar != null && zzikVar.zzd, z, j) || zzikVar == null) {
            return;
        }
        zzikVar.zzd = false;
    }

    static /* bridge */ /* synthetic */ void zzp(zzis zzisVar, Bundle bundle, zzik zzikVar, zzik zzikVar2, long j) {
        bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        zzisVar.zzA(zzikVar, zzikVar2, j, true, zzisVar.zzs.zzv().zzy(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    private final zzik zzy(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzik zzikVar = (zzik) this.zzd.get(activity);
        if (zzikVar == null) {
            zzik zzikVar2 = new zzik(null, zzl(activity.getClass(), "Activity"), this.zzs.zzv().zzq());
            this.zzd.put(activity, zzikVar2);
            zzikVar = zzikVar2;
        }
        return this.zzg != null ? this.zzg : zzikVar;
    }

    private final void zzz(Activity activity, zzik zzikVar, boolean z) {
        zzik zzikVar2;
        zzik zzikVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzikVar.zzb == null) {
            zzikVar2 = new zzik(zzikVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zzikVar.zzc, zzikVar.zze, zzikVar.zzf);
        } else {
            zzikVar2 = zzikVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzikVar2;
        this.zzs.zzaz().zzp(new zzin(this, zzikVar2, zzikVar3, this.zzs.zzav().elapsedRealtime(), z));
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final zzik zzi() {
        return this.zzb;
    }

    public final zzik zzj(boolean z) {
        zza();
        zzg();
        if (!z) {
            return this.zza;
        }
        zzik zzikVar = this.zza;
        return zzikVar != null ? zzikVar : this.zzh;
    }

    final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str2.length();
        this.zzs.zzf();
        if (length2 <= 100) {
            return str2;
        }
        this.zzs.zzf();
        return str2.substring(0, 100);
    }

    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzs.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzik(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (this.zzs.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long jElapsedRealtime = this.zzs.zzav().elapsedRealtime();
        if (!this.zzs.zzf().zzu()) {
            this.zzb = null;
            this.zzs.zzaz().zzp(new zzip(this, jElapsedRealtime));
        } else {
            zzik zzikVarZzy = zzy(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            this.zzs.zzaz().zzp(new zziq(this, zzikVarZzy, jElapsedRealtime));
        }
    }

    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzs.zzf().zzu()) {
                    this.zzg = null;
                    this.zzs.zzaz().zzp(new zzir(this));
                }
            }
        }
        if (!this.zzs.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzs.zzaz().zzp(new zzio(this));
        } else {
            zzz(activity, zzy(activity), false);
            zzd zzdVarZzd = this.zzs.zzd();
            zzdVarZzd.zzs.zzaz().zzp(new zzc(zzdVarZzd, zzdVarZzd.zzs.zzav().elapsedRealtime()));
        }
    }

    public final void zzv(Activity activity, Bundle bundle) {
        zzik zzikVar;
        if (!this.zzs.zzf().zzu() || bundle == null || (zzikVar = (zzik) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzikVar.zzc);
        bundle2.putString("name", zzikVar.zza);
        bundle2.putString("referrer_name", zzikVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r5.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r6.length() <= 100) goto L39;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzw(Activity activity, String str, String str2) {
        if (!this.zzs.zzf().zzu()) {
            this.zzs.zzay().zzl().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzik zzikVar = this.zzb;
        if (zzikVar == null) {
            this.zzs.zzay().zzl().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.zzd.get(activity) == null) {
            this.zzs.zzay().zzl().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzl(activity.getClass(), "Activity");
        }
        boolean zZza = zzil.zza(zzikVar.zzb, str2);
        boolean zZza2 = zzil.zza(zzikVar.zza, str);
        if (zZza && zZza2) {
            this.zzs.zzay().zzl().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                this.zzs.zzf();
            }
            this.zzs.zzay().zzl().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                this.zzs.zzf();
            }
            this.zzs.zzay().zzl().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        this.zzs.zzay().zzj().zzc("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzik zzikVar2 = new zzik(str, str2, this.zzs.zzv().zzq());
        this.zzd.put(activity, zzikVar2);
        zzz(activity, zzikVar2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r2 > 100) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r4 > 100) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzx(Bundle bundle, long j) {
        String strZzl;
        synchronized (this.zzj) {
            if (!this.zzi) {
                this.zzs.zzay().zzl().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
            if (string != null) {
                if (string.length() > 0) {
                    int length = string.length();
                    this.zzs.zzf();
                }
                this.zzs.zzay().zzl().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                return;
            }
            String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
            if (string2 != null) {
                if (string2.length() > 0) {
                    int length2 = string2.length();
                    this.zzs.zzf();
                }
                this.zzs.zzay().zzl().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                return;
            }
            if (string2 == null) {
                Activity activity = this.zze;
                strZzl = activity != null ? zzl(activity.getClass(), "Activity") : "Activity";
            } else {
                strZzl = string2;
            }
            zzik zzikVar = this.zzb;
            if (this.zzf && zzikVar != null) {
                this.zzf = false;
                boolean zZza = zzil.zza(zzikVar.zzb, strZzl);
                boolean zZza2 = zzil.zza(zzikVar.zza, string);
                if (zZza && zZza2) {
                    this.zzs.zzay().zzl().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            this.zzs.zzay().zzj().zzc("Logging screen view with name, class", string == null ? "null" : string, strZzl == null ? "null" : strZzl);
            zzik zzikVar2 = this.zzb == null ? this.zzc : this.zzb;
            zzik zzikVar3 = new zzik(string, strZzl, this.zzs.zzv().zzq(), true, j);
            this.zzb = zzikVar3;
            this.zzc = zzikVar2;
            this.zzg = zzikVar3;
            this.zzs.zzaz().zzp(new zzim(this, bundle, zzikVar3, zzikVar2, this.zzs.zzav().elapsedRealtime()));
        }
    }
}
