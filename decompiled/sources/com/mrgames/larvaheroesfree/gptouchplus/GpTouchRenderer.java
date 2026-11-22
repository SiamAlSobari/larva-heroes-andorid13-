package com.mrgames.larvaheroesfree.gptouchplus;

import android.opengl.GLSurfaceView;
import com.mrgames.larvaheroesfree.Natives;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public class GpTouchRenderer implements GLSurfaceView.Renderer {
    public static GpTouchRenderer mRenderer;
    private GL10 mGL = null;
    public boolean bfirstNativeInit = false;

    public static void setAnimationInterval(double d) {
    }

    public void handleActionCancel(int[] iArr, float[] fArr, float[] fArr2) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }

    public GpTouchRenderer() {
        mRenderer = this;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        if (this.bfirstNativeInit) {
            return;
        }
        this.bfirstNativeInit = true;
        Natives.nativeInit(i, i2);
        Natives.screenWidth = i;
        Natives.screenHeight = i2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        Natives.nativeRender();
    }

    public void handleActionDown(int i, float f, float f2) {
        Natives.nativeTouchesBegin(i, f, f2);
    }

    public void handleActionUp(int i, float f, float f2) {
        Natives.nativeTouchesEnd(i, f, f2);
    }

    public void handleAtcionClear(int i, float f, float f2) {
        Natives.nativeTouchesClear(i, f, f2);
    }

    public void handleActionMove(int[] iArr, float[] fArr, float[] fArr2) {
        Natives.nativeTouchesMove(iArr, fArr, fArr2);
    }

    public void handlePurchaseState(int i, int i2) {
        Natives.nativePurchaseState(i, i2);
    }
}
