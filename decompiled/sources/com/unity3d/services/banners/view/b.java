package com.unity3d.services.banners.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.webplayer.f;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.misc.k;
import org.json.JSONObject;

/* JADX INFO: compiled from: BannerWebPlayerContainer.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends RelativeLayout {
    private f a;
    private int b;
    private UnityBannerSize c;
    private String d;
    private JSONObject e;
    private JSONObject f;
    private JSONObject g;
    private Runnable h;

    /* JADX INFO: compiled from: BannerWebPlayerContainer.java */
    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            b.this.a(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.banners.view.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerWebPlayerContainer.java */
    class RunnableC0039b implements Runnable {
        final /* synthetic */ View.OnLayoutChangeListener a;

        RunnableC0039b(View.OnLayoutChangeListener onLayoutChangeListener) {
            this.a = onLayoutChangeListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.removeOnLayoutChangeListener(this.a);
        }
    }

    /* JADX INFO: compiled from: BannerWebPlayerContainer.java */
    class c implements Runnable {
        final /* synthetic */ b a;

        c(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.removeAllViews();
            ViewParent parent = this.a.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.a);
            }
            if (this.a.a != null) {
                this.a.a.destroy();
            }
            this.a.a = null;
        }
    }

    public b(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, UnityBannerSize unityBannerSize) {
        super(context);
        this.b = -1;
        this.h = null;
        this.c = unityBannerSize;
        this.d = str;
        this.e = jSONObject;
        this.f = jSONObject2;
        this.g = jSONObject3;
        f fVar = new f(context, str, this.e, this.f);
        this.a = fVar;
        fVar.setEventSettings(this.g);
        c();
        addView(this.a);
        b();
    }

    private void b() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(k.b(getContext(), this.c.getWidth())), Math.round(k.b(getContext(), this.c.getHeight()))));
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this.a.setLayoutParams(layoutParams);
    }

    private void c() {
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        a aVar = new a();
        addOnLayoutChangeListener(aVar);
        this.h = new RunnableC0039b(aVar);
    }

    public f getWebPlayer() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.unity3d.services.banners.bridge.a.b(this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.unity3d.services.banners.bridge.a.c(this.d);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 == 0 && i4 == 0) {
            return;
        }
        com.unity3d.services.banners.bridge.a.a(this.d, getLeft(), getRight(), i, i2, getAlpha());
        Rect rect = new Rect();
        getHitRect(rect);
        if (((View) getParent()).getLocalVisibleRect(rect)) {
            onVisibilityChanged(this, 8);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        if (view == this) {
            int i2 = this.b;
            if (i2 == -1) {
                this.b = i;
                return;
            }
            if (i != 0 && i2 == 0) {
                com.unity3d.services.banners.bridge.a.a(this.d, i);
            }
            this.b = i;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        a(this, getLeft(), getTop(), getRight(), getBottom(), getLeft(), getTop(), getRight(), getBottom());
    }

    public void setWebPlayerEventSettings(JSONObject jSONObject) {
        this.g = jSONObject;
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.e = jSONObject;
        this.f = jSONObject2;
    }

    public void a() {
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        j.a(new c(this));
    }

    public void a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        com.unity3d.services.banners.bridge.a.a(this.d, i, i2, i3, i4, getAlpha());
        if (getParent() != null) {
            Rect rect = new Rect();
            getHitRect(rect);
            if (!(getParent() instanceof View) || ((View) getParent()).getLocalVisibleRect(rect)) {
                return;
            }
            onVisibilityChanged(this, 8);
        }
    }
}
