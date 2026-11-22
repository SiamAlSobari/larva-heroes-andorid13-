package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqz extends zzbrf {
    static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcfi zzk;
    private final Activity zzl;
    private zzcgx zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbrg zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbqz(zzcfi zzcfiVar, zzbrg zzbrgVar) {
        super(zzcfiVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcfiVar;
        this.zzl = zzcfiVar.zzi();
        this.zzp = zzbrgVar;
    }

    public final void zza(boolean z) {
        synchronized (this.zzj) {
            PopupWindow popupWindow = this.zzq;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.zzr.removeView((View) this.zzk);
                ViewGroup viewGroup = this.zzs;
                if (viewGroup != null) {
                    viewGroup.removeView(this.zzn);
                    this.zzs.addView((View) this.zzk);
                    this.zzk.zzag(this.zzm);
                }
                if (z) {
                    zzk("default");
                    zzbrg zzbrgVar = this.zzp;
                    if (zzbrgVar != null) {
                        zzbrgVar.zzb();
                    }
                }
                this.zzq = null;
                this.zzr = null;
                this.zzs = null;
                this.zzo = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:159:0x037c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0183  */
    public final void zzb(Map map) {
        byte b;
        int i;
        byte b2;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this.zzj) {
            if (this.zzl == null) {
                zzg("Not an activity context. Cannot resize.");
                return;
            }
            if (this.zzk.zzO() == null) {
                zzg("Webview is not yet available, size is not set.");
                return;
            }
            if (this.zzk.zzO().zzi()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.zzk.zzaA()) {
                zzg("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzi = com.google.android.gms.ads.internal.util.zzs.zzL((String) map.get("width"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzL((String) map.get("height"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzL((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzL((String) map.get("offsetY"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.zzc = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zzb = str;
            }
            if (this.zzi < 0 || this.zzf < 0) {
                zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.zzl.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] iArrZzS = com.google.android.gms.ads.internal.util.zzs.zzS(this.zzl);
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] iArrZzO = com.google.android.gms.ads.internal.util.zzs.zzO(this.zzl);
                int i6 = iArrZzS[0];
                int i7 = iArrZzS[1];
                int i8 = this.zzi;
                int[] iArr = null;
                if (i8 < 50 || i8 > i6) {
                    zzcaa.zzj("Width is too small or too large.");
                } else {
                    int i9 = this.zzf;
                    if (i9 < 50 || i9 > i7) {
                        zzcaa.zzj("Height is too small or too large.");
                    } else if (i9 == i7 && i8 == i6) {
                        zzcaa.zzj("Cannot resize to a full-screen ad.");
                    } else if (this.zzc) {
                        switch (this.zzb) {
                            case "center":
                                b2 = 2;
                                break;
                            case "top-left":
                                b2 = 0;
                                break;
                            case "bottom-left":
                                b2 = 3;
                                break;
                            case "bottom-right":
                                b2 = 5;
                                break;
                            case "bottom-center":
                                b2 = 4;
                                break;
                            case "top-center":
                                b2 = 1;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        if (b2 == 0) {
                            i2 = this.zzd + this.zzg;
                            i3 = this.zze;
                        } else if (b2 != 1) {
                            if (b2 != 2) {
                                if (b2 == 3) {
                                    i2 = this.zzd + this.zzg;
                                    i5 = this.zze;
                                } else if (b2 == 4) {
                                    i2 = ((this.zzd + this.zzg) + (i8 >> 1)) - 25;
                                    i5 = this.zze;
                                } else if (b2 != 5) {
                                    i2 = ((this.zzd + this.zzg) + i8) - 50;
                                    i3 = this.zze;
                                } else {
                                    i2 = ((this.zzd + this.zzg) + i8) - 50;
                                    i5 = this.zze;
                                }
                                i4 = ((i5 + this.zzh) + i9) - 50;
                            } else {
                                i2 = ((this.zzd + this.zzg) + (i8 >> 1)) - 25;
                                i4 = ((this.zze + this.zzh) + (i9 >> 1)) - 25;
                            }
                            if (i2 >= 0 && i2 + 50 <= i6 && i4 >= iArrZzO[0] && i4 + 50 <= iArrZzO[1]) {
                                iArr = new int[]{this.zzd + this.zzg, this.zze + this.zzh};
                            }
                        } else {
                            i2 = ((this.zzd + this.zzg) + (i8 >> 1)) - 25;
                            i3 = this.zze;
                        }
                        i4 = i3 + this.zzh;
                        if (i2 >= 0) {
                            iArr = new int[]{this.zzd + this.zzg, this.zze + this.zzh};
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzt.zzp();
                        int[] iArrZzS2 = com.google.android.gms.ads.internal.util.zzs.zzS(this.zzl);
                        com.google.android.gms.ads.internal.zzt.zzp();
                        int[] iArrZzO2 = com.google.android.gms.ads.internal.util.zzs.zzO(this.zzl);
                        int i10 = iArrZzS2[0];
                        int i11 = this.zzd + this.zzg;
                        int i12 = this.zze + this.zzh;
                        if (i11 < 0) {
                            i = 0;
                        } else {
                            int i13 = this.zzi;
                            i = i11 + i13 > i10 ? i10 - i13 : i11;
                        }
                        int i14 = iArrZzO2[0];
                        if (i12 < i14) {
                            i12 = i14;
                        } else {
                            int i15 = this.zzf;
                            int i16 = i12 + i15;
                            int i17 = iArrZzO2[1];
                            if (i16 > i17) {
                                i12 = i17 - i15;
                            }
                        }
                        iArr = new int[]{i, i12};
                    }
                }
                if (iArr == null) {
                    zzg("Resize location out of screen or close button is not visible.");
                    return;
                }
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int iZzx = zzbzt.zzx(this.zzl, this.zzi);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int iZzx2 = zzbzt.zzx(this.zzl, this.zzf);
                ViewParent parent = ((View) this.zzk).getParent();
                if (parent == null || !(parent instanceof ViewGroup)) {
                    zzg("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.removeView((View) this.zzk);
                PopupWindow popupWindow = this.zzq;
                if (popupWindow == null) {
                    this.zzs = viewGroup;
                    com.google.android.gms.ads.internal.zzt.zzp();
                    Object obj = this.zzk;
                    ((View) obj).setDrawingCacheEnabled(true);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                    ((View) obj).setDrawingCacheEnabled(false);
                    ImageView imageView = new ImageView(this.zzl);
                    this.zzn = imageView;
                    imageView.setImageBitmap(bitmapCreateBitmap);
                    this.zzm = this.zzk.zzO();
                    this.zzs.addView(this.zzn);
                } else {
                    popupWindow.dismiss();
                }
                RelativeLayout relativeLayout = new RelativeLayout(this.zzl);
                this.zzr = relativeLayout;
                relativeLayout.setBackgroundColor(0);
                this.zzr.setLayoutParams(new ViewGroup.LayoutParams(iZzx, iZzx2));
                com.google.android.gms.ads.internal.zzt.zzp();
                PopupWindow popupWindow2 = new PopupWindow((View) this.zzr, iZzx, iZzx2, false);
                this.zzq = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.zzq.setTouchable(true);
                this.zzq.setClippingEnabled(!this.zzc);
                this.zzr.addView((View) this.zzk, -1, -1);
                this.zzo = new LinearLayout(this.zzl);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int iZzx3 = zzbzt.zzx(this.zzl, 50);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZzx3, zzbzt.zzx(this.zzl, 50));
                switch (this.zzb) {
                    case "center":
                        b = 2;
                        break;
                    case "top-left":
                        b = 0;
                        break;
                    case "bottom-left":
                        b = 3;
                        break;
                    case "bottom-right":
                        b = 5;
                        break;
                    case "bottom-center":
                        b = 4;
                        break;
                    case "top-center":
                        b = 1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                } else if (b == 1) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(14);
                } else if (b == 2) {
                    layoutParams.addRule(13);
                } else if (b == 3) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                } else if (b == 4) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                } else if (b != 5) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                }
                this.zzo.setOnClickListener(new zzbqy(this));
                this.zzo.setContentDescription("Close button");
                this.zzr.addView(this.zzo, layoutParams);
                try {
                    PopupWindow popupWindow3 = this.zzq;
                    View decorView = window.getDecorView();
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    int iZzx4 = zzbzt.zzx(this.zzl, iArr[0]);
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    popupWindow3.showAtLocation(decorView, 0, iZzx4, zzbzt.zzx(this.zzl, iArr[1]));
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    zzbrg zzbrgVar = this.zzp;
                    if (zzbrgVar != null) {
                        zzbrgVar.zza(i18, i19, this.zzi, this.zzf);
                    }
                    this.zzk.zzag(zzcgx.zzb(iZzx, iZzx2));
                    int i20 = iArr[0];
                    int i21 = iArr[1];
                    com.google.android.gms.ads.internal.zzt.zzp();
                    zzj(i20, i21 - com.google.android.gms.ads.internal.util.zzs.zzO(this.zzl)[0], this.zzi, this.zzf);
                    zzk("resized");
                    return;
                } catch (RuntimeException e) {
                    zzg("Cannot show popup window: " + e.getMessage());
                    this.zzr.removeView((View) this.zzk);
                    ViewGroup viewGroup2 = this.zzs;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(this.zzn);
                        this.zzs.addView((View) this.zzk);
                        this.zzk.zzag(this.zzm);
                    }
                    return;
                }
            }
            zzg("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i;
            this.zze = i2;
        }
    }

    public final void zzd(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean zze() {
        boolean z;
        synchronized (this.zzj) {
            z = this.zzq != null;
        }
        return z;
    }
}
