package com.unity3d.services.core.misc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: ViewUtilities.java */
/* JADX INFO: loaded from: classes2.dex */
public class k {
    public static void a(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        try {
            ((ViewGroup) view.getParent()).removeView(view);
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Error while removing view from it's parent", e);
        }
    }

    public static float b(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static void a(View view, Drawable drawable) {
        try {
            View.class.getMethod("setBackground", Drawable.class).invoke(view, drawable);
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Couldn't run".concat("setBackground"), e);
        }
    }

    public static float a(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }
}
