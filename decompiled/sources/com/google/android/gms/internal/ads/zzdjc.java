package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdjc {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfca zzc;
    private final zzdih zzd;
    private final zzdic zze;
    private final zzdjo zzf;
    private final zzdjw zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbek zzj;
    private final zzdhz zzk;

    public zzdjc(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfca zzfcaVar, zzdih zzdihVar, zzdic zzdicVar, zzdjo zzdjoVar, zzdjw zzdjwVar, Executor executor, Executor executor2, zzdhz zzdhzVar) {
        this.zzb = zzgVar;
        this.zzc = zzfcaVar;
        this.zzj = zzfcaVar.zzi;
        this.zzd = zzdihVar;
        this.zze = zzdicVar;
        this.zzf = zzdjoVar;
        this.zzg = zzdjwVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdhzVar;
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View viewZzf = z ? this.zze.zzf() : this.zze.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdF)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdic zzdicVar = this.zze;
        if (zzdicVar.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdicVar.zzc() == 2 || zzdicVar.zzc() == 1) {
                this.zzb.zzJ(this.zzc.zzf, String.valueOf(zzdicVar.zzc()), z);
            } else if (zzdicVar.zzc() == 6) {
                this.zzb.zzJ(this.zzc.zzf, "2", z);
                this.zzb.zzJ(this.zzc.zzf, "1", z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0195  */
    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzb(zzdjy zzdjyVar) {
        ViewGroup viewGroup;
        View viewZze;
        final ViewGroup viewGroup2;
        zzbet zzbetVarZza;
        Drawable drawable;
        if (!this.zzd.zzf() && !this.zzd.zze()) {
            viewGroup = null;
            break;
        }
        String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
        int i = 0;
        while (true) {
            if (i >= 2) {
                viewGroup = null;
                break;
            }
            View viewZzg = zzdjyVar.zzg(strArr[i]);
            if (viewZzg != null && (viewZzg instanceof ViewGroup)) {
                viewGroup = (ViewGroup) viewZzg;
                break;
            }
            i++;
        }
        Context context = zzdjyVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdic zzdicVar = this.zze;
        if (zzdicVar.zze() != null) {
            viewZze = zzdicVar.zze();
            zzbek zzbekVar = this.zzj;
            if (zzbekVar != null && viewGroup == null) {
                zzh(layoutParams, zzbekVar.zze);
                viewZze.setLayoutParams(layoutParams);
            }
        } else if (zzdicVar.zzl() instanceof zzbef) {
            zzbef zzbefVar = (zzbef) zzdicVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbefVar.zzc());
            }
            View zzbegVar = new zzbeg(context, zzbefVar, layoutParams);
            zzbegVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdD));
            viewZze = zzbegVar;
        } else {
            viewZze = null;
        }
        if (viewZze != null) {
            if (viewZze.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewZze.getParent()).removeView(viewZze);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewZze);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdjyVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(viewZze);
                FrameLayout frameLayoutZzh = zzdjyVar.zzh();
                if (frameLayoutZzh != null) {
                    frameLayoutZzh.addView(zzaVar);
                }
            }
            zzdjyVar.zzq(zzdjyVar.zzk(), viewZze, true);
        }
        zzfud zzfudVar = zzdiy.zza;
        int size = zzfudVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewZzg2 = zzdjyVar.zzg((String) zzfudVar.get(i2));
            i2++;
            if (viewZzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewZzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            zzdic zzdicVar2 = this.zze;
            if (zzdicVar2.zzs() != null) {
                zzdicVar2.zzs().zzao(new zzdjb(zzdjyVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjn)).booleanValue() && zzi(viewGroup2, false)) {
            zzdic zzdicVar3 = this.zze;
            if (zzdicVar3.zzq() != null) {
                zzdicVar3.zzq().zzao(new zzdjb(zzdjyVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzf = zzdjyVar.zzf();
        Context context2 = viewZzf != null ? viewZzf.getContext() : null;
        if (context2 == null || (zzbetVarZza = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper iObjectWrapperZzi = zzbetVarZza.zzi();
            if (iObjectWrapperZzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper iObjectWrapperZzj = zzdjyVar.zzj();
            if (iObjectWrapperZzj == null) {
                imageView.setScaleType(zza);
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzga)).booleanValue()) {
                imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzj));
            } else {
                imageView.setScaleType(zza);
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            zzcaa.zzj("Could not get main image drawable");
        }
    }

    public final void zzc(zzdjy zzdjyVar) {
        if (zzdjyVar == null || this.zzf == null || zzdjyVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdjyVar.zzh().addView(this.zzf.zza());
        } catch (zzcft e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdjy zzdjyVar) {
        if (zzdjyVar == null) {
            return;
        }
        Context context = zzdjyVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbx.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                zzcaa.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdjyVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdjyVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbx.zzb());
            } catch (zzcft e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdjy zzdjyVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdja
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzdjyVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
