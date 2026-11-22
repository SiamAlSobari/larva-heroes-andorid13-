package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzave extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzauv zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzave() {
        zzauv zzauvVar = new zzauv();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzauvVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbdc.zzd.zze()).intValue();
        this.zzg = ((Long) zzbdc.zza.zze()).intValue();
        this.zzh = ((Long) zzbdc.zze.zze()).intValue();
        this.zzi = ((Long) zzbdc.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzT)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzU)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzV)).intValue();
        this.zze = ((Long) zzbdc.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzX);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzY)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzZ)).booleanValue();
        this.zzp = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaa)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ee */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:67:0x00dc->B:72:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        while (true) {
            try {
                Context contextZzb = com.google.android.gms.ads.internal.zzt.zzb().zzb();
                try {
                    if (contextZzb != null) {
                        ActivityManager activityManager = (ActivityManager) contextZzb.getSystemService("activity");
                        KeyguardManager keyguardManager = (KeyguardManager) contextZzb.getSystemService("keyguard");
                        if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ActivityManager.RunningAppProcessInfo next = it.next();
                                    if (Process.myPid() == next.pid) {
                                        if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) contextZzb.getSystemService("power")) != null && powerManager.isScreenOn()) {
                                            Activity activityZza = com.google.android.gms.ads.internal.zzt.zzb().zza();
                                            if (activityZza == null) {
                                                zzcaa.zze("ContentFetchThread: no activity. Sleeping.");
                                                zzf();
                                            } else {
                                                View viewFindViewById = null;
                                                try {
                                                    if (activityZza.getWindow() != null && activityZza.getWindow().getDecorView() != null) {
                                                        viewFindViewById = activityZza.getWindow().getDecorView().findViewById(R.id.content);
                                                    }
                                                } catch (Exception e) {
                                                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "ContentFetchTask.extractContent");
                                                    zzcaa.zze("Failed getting root view of activity. Content not extracted.");
                                                }
                                                if (viewFindViewById != null) {
                                                    viewFindViewById.post(new zzava(this, viewFindViewById));
                                                }
                                            }
                                        }
                                        Thread.sleep(this.zze * 1000);
                                    }
                                }
                            }
                        }
                        synchronized (this.zzc) {
                            while (this.zzb) {
                                try {
                                    zzcaa.zze("ContentFetchTask: waiting");
                                    this.zzc.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    }
                    zzcaa.zze("ContentFetchTask: sleeping");
                    zzf();
                    Thread.sleep(this.zze * 1000);
                } catch (InterruptedException e2) {
                    zzcaa.zzh("Error in ContentFetchTask", e2);
                } catch (Exception e3) {
                    zzcaa.zzh("Error in ContentFetchTask", e3);
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e3, "ContentFetchTask.run");
                }
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "ContentFetchTask.isInForeground");
            }
            synchronized (this.zzc) {
                while (this.zzb) {
                    zzcaa.zze("ContentFetchTask: waiting");
                    this.zzc.wait();
                }
            }
        }
    }

    public final zzauu zza() {
        return this.zzd.zza(this.zzp);
    }

    final zzavd zzb(View view, zzauu zzauuVar) {
        if (view == null) {
            return new zzavd(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzavd(this, 0, 0);
            }
            zzauuVar.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzavd(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcfi)) {
            WebView webView = (WebView) view;
            if (!PlatformVersion.isAtLeastKitKat()) {
                return new zzavd(this, 0, 0);
            }
            zzauuVar.zzh();
            webView.post(new zzavc(this, zzauuVar, webView, globalVisibleRect));
            return new zzavd(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzavd(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            zzavd zzavdVarZzb = zzb(viewGroup.getChildAt(i3), zzauuVar);
            i += zzavdVarZzb.zza;
            i2 += zzavdVarZzb.zzb;
        }
        return new zzavd(this, i, i2);
    }

    final void zzc(View view) {
        try {
            zzauu zzauuVar = new zzauu(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZzb = com.google.android.gms.ads.internal.zzt.zzb().zzb();
            if (contextZzb != null && !TextUtils.isEmpty(this.zzm)) {
                String str = (String) view.getTag(contextZzb.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzW), "id", contextZzb.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            zzavd zzavdVarZzb = zzb(view, zzauuVar);
            zzauuVar.zzm();
            if (zzavdVarZzb.zza == 0 && zzavdVarZzb.zzb == 0) {
                return;
            }
            int i = zzavdVarZzb.zzb;
            if (i != 0) {
                if (i == 0) {
                }
                this.zzd.zzb(zzauuVar);
            } else if (zzauuVar.zzc() == 0) {
                return;
            }
            if (this.zzd.zzd(zzauuVar)) {
                return;
            }
            this.zzd.zzb(zzauuVar);
        } catch (Exception e) {
            zzcaa.zzh("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "ContentFetchTask.fetchContent");
        }
    }

    final void zzd(zzauu zzauuVar, WebView webView, String str, boolean z) {
        zzauuVar.zzg();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzauuVar.zzl(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzauuVar.zzl(webView.getTitle() + "\n" + strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzauuVar.zzo()) {
                this.zzd.zzc(zzauuVar);
            }
        } catch (JSONException unused) {
            zzcaa.zze("Json string may be malformed.");
        } catch (Throwable th) {
            zzcaa.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            if (this.zza) {
                zzcaa.zze("Content hash thread already started, quitting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = true;
            zzcaa.zze("ContentFetchThread: paused, pause = true");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            zzcaa.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}
