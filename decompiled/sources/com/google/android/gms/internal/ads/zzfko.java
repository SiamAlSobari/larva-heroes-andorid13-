package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfko implements zzfjp {
    private static final zzfko zza = new zzfko();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfkk();
    private static final Runnable zze = new zzfkl();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfkh zzk = new zzfkh();
    private final zzfjr zzj = new zzfjr();
    private final zzfki zzl = new zzfki(new zzfkr());

    zzfko() {
    }

    public static zzfko zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfko zzfkoVar) {
        zzfkoVar.zzg = 0;
        zzfkoVar.zzi.clear();
        zzfkoVar.zzh = false;
        for (zzfit zzfitVar : zzfjh.zza().zzb()) {
        }
        zzfkoVar.zzm = System.nanoTime();
        zzfkoVar.zzk.zzi();
        long jNanoTime = System.nanoTime();
        zzfjq zzfjqVarZza = zzfkoVar.zzj.zza();
        if (zzfkoVar.zzk.zze().size() > 0) {
            for (String str : zzfkoVar.zzk.zze()) {
                JSONObject jSONObjectZza = zzfjqVarZza.zza(null);
                View viewZza = zzfkoVar.zzk.zza(str);
                zzfjq zzfjqVarZzb = zzfkoVar.zzj.zzb();
                String strZzc = zzfkoVar.zzk.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfjqVarZzb.zza(viewZza);
                    zzfjz.zzb(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e) {
                        zzfka.zza("Error with setting not visible reason", e);
                    }
                    zzfjz.zzc(jSONObjectZza, jSONObjectZza2);
                }
                zzfjz.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfkoVar.zzl.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (zzfkoVar.zzk.zzf().size() > 0) {
            JSONObject jSONObjectZza3 = zzfjqVarZza.zza(null);
            zzfkoVar.zzk(null, zzfjqVarZza, jSONObjectZza3, 1, false);
            zzfjz.zzf(jSONObjectZza3);
            zzfkoVar.zzl.zzd(jSONObjectZza3, zzfkoVar.zzk.zzf(), jNanoTime);
            boolean z = zzfkoVar.zzh;
        } else {
            zzfkoVar.zzl.zzb();
        }
        zzfkoVar.zzk.zzg();
        long jNanoTime2 = System.nanoTime() - zzfkoVar.zzm;
        if (zzfkoVar.zzf.size() > 0) {
            for (zzfkn zzfknVar : zzfkoVar.zzf) {
                int i = zzfkoVar.zzg;
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfknVar.zzb();
                if (zzfknVar instanceof zzfkm) {
                    int i2 = zzfkoVar.zzg;
                    ((zzfkm) zzfknVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfjq zzfjqVar, JSONObject jSONObject, int i, boolean z) {
        zzfjqVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjp
    public final void zza(View view, zzfjq zzfjqVar, JSONObject jSONObject, boolean z) {
        int iZzk;
        boolean z2;
        if (zzfkf.zzb(view) != null || (iZzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfjqVar.zza(view);
        zzfjz.zzc(jSONObject, jSONObjectZza);
        String strZzd = this.zzk.zzd(view);
        if (strZzd != null) {
            zzfjz.zzb(jSONObjectZza, strZzd);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
            } catch (JSONException e) {
                zzfka.zza("Error with setting has window focus", e);
            }
            this.zzk.zzh();
        } else {
            zzfkg zzfkgVarZzb = this.zzk.zzb(view);
            if (zzfkgVarZzb != null) {
                zzfjk zzfjkVarZza = zzfkgVarZzb.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzb = zzfkgVarZzb.zzb();
                int size = arrayListZzb.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) arrayListZzb.get(i));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfjkVarZza.zzd());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfjkVarZza.zza());
                    jSONObjectZza.put("friendlyObstructionReason", zzfjkVarZza.zzc());
                } catch (JSONException e2) {
                    zzfka.zza("Error with setting friendly obstruction", e2);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfjqVar, jSONObjectZza, iZzk, z || z2);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfkj(this));
    }
}
