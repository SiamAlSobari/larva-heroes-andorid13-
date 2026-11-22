package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaqu implements zzaqt {
    protected static volatile zzary zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzarq zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    protected zzaqu(Context context) {
        try {
            zzapm.zzd();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
                this.zzr = new zzarq();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba A[Catch: Exception -> 0x00f9, TryCatch #1 {Exception -> 0x00f9, blocks: (B:44:0x00ad, B:47:0x00ba, B:55:0x00e2, B:56:0x00f3), top: B:72:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3 A[Catch: Exception -> 0x00f9, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f9, blocks: (B:44:0x00ad, B:47:0x00ba, B:55:0x00e2, B:56:0x00f3), top: B:72:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final String zzm(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzaqs zzaqsVarZzd;
        String str2;
        int i2;
        Exception exc;
        int i3;
        int i4;
        long jCurrentTimeMillis;
        String strZza;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcn)).booleanValue();
        zzanv zzanvVarZzc = null;
        if (zBooleanValue) {
            zzaqsVarZzd = zza != null ? zza.zzd() : null;
            str2 = "be";
        } else {
            zzaqsVarZzd = null;
            str2 = null;
        }
        try {
            if (i8 == 3) {
                zzanvVarZzc = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i7 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (!zBooleanValue) {
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzanvVarZzc != null) {
                        try {
                            if (((zzaos) zzanvVarZzc.zzal()).zzaz() == 0) {
                                strZza = Integer.toString(5);
                            } else {
                                zzaos zzaosVar = (zzaos) zzanvVarZzc.zzal();
                                int i9 = zzapm.zzc;
                                strZza = zzapm.zza(zzaosVar.zzax(), str);
                                if (zBooleanValue) {
                                    if (i8 == i2) {
                                        i5 = PointerIconCompat.TYPE_CELL;
                                    } else if (i8 == i3) {
                                        i5 = PointerIconCompat.TYPE_ALIAS;
                                    } else {
                                        i5 = PointerIconCompat.TYPE_WAIT;
                                    }
                                    zzaqsVarZzd.zzc(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                                }
                            }
                        } catch (Exception e2) {
                            strZza = Integer.toString(7);
                            if (zBooleanValue && zzaqsVarZzd != null) {
                                if (i8 == i2) {
                                    i6 = PointerIconCompat.TYPE_CROSSHAIR;
                                } else {
                                    i6 = i8 == i3 ? PointerIconCompat.TYPE_COPY : 1005;
                                }
                                zzaqsVarZzd.zzc(i6, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e2);
                            }
                        }
                    } else {
                        strZza = Integer.toString(5);
                    }
                    return strZza;
                }
            } else if (i8 == 2) {
                zzanvVarZzc = zzd(context, view, activity);
                i7 = PointerIconCompat.TYPE_TEXT;
            } else {
                zzanvVarZzc = zzc(context, null);
                i7 = 1000;
            }
            if (!zBooleanValue || zzaqsVarZzd == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    zzaqsVarZzd.zzc(i7, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    if (!zBooleanValue && zzaqsVarZzd != null) {
                        if (i8 == i2) {
                            i3 = 2;
                            i4 = PointerIconCompat.TYPE_HELP;
                        } else {
                            i3 = 2;
                            if (i8 == 2) {
                                i4 = PointerIconCompat.TYPE_VERTICAL_TEXT;
                            } else {
                                i8 = 1;
                                i4 = 1001;
                            }
                        }
                        zzaqsVarZzd.zzc(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzanvVarZzc != null) {
                        strZza = Integer.toString(5);
                    } else if (((zzaos) zzanvVarZzc.zzal()).zzaz() == 0) {
                        strZza = Integer.toString(5);
                    } else {
                        zzaos zzaosVar2 = (zzaos) zzanvVarZzc.zzal();
                        int i10 = zzapm.zzc;
                        strZza = zzapm.zza(zzaosVar2.zzax(), str);
                        if (zBooleanValue) {
                            if (i8 == i2) {
                                i5 = PointerIconCompat.TYPE_CELL;
                            } else if (i8 == i3) {
                                i5 = PointerIconCompat.TYPE_ALIAS;
                            } else {
                                i5 = PointerIconCompat.TYPE_WAIT;
                            }
                            zzaqsVarZzd.zzc(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                        }
                    }
                    return strZza;
                }
            }
        } catch (Exception e4) {
            e = e4;
            i2 = 3;
        }
        i3 = 2;
        jCurrentTimeMillis = System.currentTimeMillis();
        if (zzanvVarZzc != null) {
            strZza = Integer.toString(5);
        } else if (((zzaos) zzanvVarZzc.zzal()).zzaz() == 0) {
            strZza = Integer.toString(5);
        } else {
            zzaos zzaosVar3 = (zzaos) zzanvVarZzc.zzal();
            int i11 = zzapm.zzc;
            strZza = zzapm.zza(zzaosVar3.zzax(), str);
            if (zBooleanValue && zzaqsVarZzd != null) {
                if (i8 == i2) {
                    i5 = PointerIconCompat.TYPE_CELL;
                } else if (i8 == i3) {
                    i5 = PointerIconCompat.TYPE_ALIAS;
                } else {
                    i5 = PointerIconCompat.TYPE_WAIT;
                }
                zzaqsVarZzd.zzc(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        }
        return strZza;
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzaro;

    protected abstract zzanv zzb(Context context, View view, Activity activity);

    protected abstract zzanv zzc(Context context, zzano zzanoVar);

    protected abstract zzanv zzd(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zze(Context context, String str, View view) {
        return zzm(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzg(Context context) {
        if (zzasb.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzm(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    protected abstract zzasa zzi(MotionEvent motionEvent) throws zzaro;

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        if (this.zzu) {
            zzj();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.zzs;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.zzt;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.zzk += Math.sqrt((d2 * d2) + (d4 * d4));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.zzb = motionEventObtain;
                    this.zzc.add(motionEventObtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += (long) (motionEvent.getHistorySize() + 1);
                    zzasa zzasaVarZzi = zzi(motionEvent);
                    Long l2 = zzasaVarZzi.zzd;
                    if (l2 != null && zzasaVarZzi.zzg != null) {
                        this.zzi += l2.longValue() + zzasaVarZzi.zzg.longValue();
                    }
                    if (this.zzq != null && (l = zzasaVarZzi.zze) != null && zzasaVarZzi.zzh != null) {
                        this.zzj += l.longValue() + zzasaVarZzi.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzaro unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcl)).booleanValue()) {
                zzj();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            this.zzb = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, this.zzq.density * i2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzarq zzarqVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcv)).booleanValue() || (zzarqVar = this.zzr) == null) {
            return;
        }
        zzarqVar.zzb(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public void zzo(View view) {
    }
}
