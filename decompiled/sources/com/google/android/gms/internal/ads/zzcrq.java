package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcrq extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcrq(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcrq zza(Context context, View view, zzfbe zzfbeVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcrq zzcrqVar = new zzcrq(context);
        if (!zzfbeVar.zzv.isEmpty() && (resources = zzcrqVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfbf zzfbfVar = (zzfbf) zzfbeVar.zzv.get(0);
            zzcrqVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfbfVar.zza * displayMetrics.density), (int) (zzfbfVar.zzb * displayMetrics.density)));
        }
        zzcrqVar.zzb = view;
        zzcrqVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcba.zzb(zzcrqVar, zzcrqVar);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcba.zza(zzcrqVar, zzcrqVar);
        JSONObject jSONObject = zzfbeVar.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(zzcrqVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcrqVar.zzc(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcrqVar.zzc(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcrqVar.addView(relativeLayout);
        return zzcrqVar;
    }

    private final int zzb(double d) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbzt.zzx(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzb, 0, iZzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
