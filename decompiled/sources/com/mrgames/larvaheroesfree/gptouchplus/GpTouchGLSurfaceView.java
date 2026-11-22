package com.mrgames.larvaheroesfree.gptouchplus;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class GpTouchGLSurfaceView extends GLSurfaceView {
    private static Method mFindPointerIndex = null;
    private static Method mGetPointerId = null;
    private static Method mGetX = null;
    private static Method mGetY = null;
    public static boolean mIsMultiTouchSupported = true;
    public int mActivePointerId;
    private SurfaceHolder mHolder;
    public int mMovePointerId;
    public int mPointX;
    public int mPointY;
    GpTouchRenderer mRenderer;

    public GpTouchGLSurfaceView(Context context) {
        super(context);
        this.mActivePointerId = -1;
        this.mMovePointerId = -1;
        setEGLContextClientVersion(2);
        GpTouchRenderer gpTouchRenderer = new GpTouchRenderer();
        this.mRenderer = gpTouchRenderer;
        setRenderer(gpTouchRenderer);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        init();
    }

    private void init() {
        SurfaceHolder holder = getHolder();
        this.mHolder = holder;
        holder.setType(2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (mIsMultiTouchSupported) {
            int action = motionEvent.getAction();
            int pointerCount = motionEvent.getPointerCount();
            final int[] iArr = new int[pointerCount];
            final float[] fArr = new float[pointerCount];
            final float[] fArr2 = new float[pointerCount];
            for (int i = 0; i < pointerCount; i++) {
                iArr[i] = motionEvent.getPointerId(i);
                fArr[i] = motionEvent.getX(i);
                fArr2[i] = motionEvent.getY(i);
            }
            int i2 = action & 255;
            if (i2 == 0) {
                final int pointerId = motionEvent.getPointerId(0);
                final float f = fArr[0];
                final float f2 = fArr2[0];
                queueEvent(new Runnable() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchGLSurfaceView.2
                    @Override // java.lang.Runnable
                    public void run() {
                        GpTouchGLSurfaceView.this.mRenderer.handleActionDown(pointerId, f, f2);
                    }
                });
            } else if (i2 == 1) {
                final int pointerId2 = motionEvent.getPointerId(0);
                final float f3 = fArr[0];
                final float f4 = fArr2[0];
                queueEvent(new Runnable() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchGLSurfaceView.5
                    @Override // java.lang.Runnable
                    public void run() {
                        GpTouchGLSurfaceView.this.mRenderer.handleActionUp(pointerId2, f3, f4);
                    }
                });
            } else if (i2 == 2) {
                queueEvent(new Runnable() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchGLSurfaceView.3
                    @Override // java.lang.Runnable
                    public void run() {
                        GpTouchGLSurfaceView.this.mRenderer.handleActionMove(iArr, fArr, fArr2);
                    }
                });
            } else if (i2 == 3) {
                queueEvent(new Runnable() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchGLSurfaceView.6
                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
            } else if (i2 == 5) {
                int i3 = action >> 8;
                final int pointerId3 = motionEvent.getPointerId(i3);
                final float x = motionEvent.getX(i3);
                final float y = motionEvent.getY(i3);
                queueEvent(new Runnable() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchGLSurfaceView.1
                    @Override // java.lang.Runnable
                    public void run() {
                        GpTouchGLSurfaceView.this.mRenderer.handleActionDown(pointerId3, x, y);
                    }
                });
            } else if (i2 == 6) {
                int i4 = action >> 8;
                final int pointerId4 = motionEvent.getPointerId(i4);
                final float x2 = motionEvent.getX(i4);
                final float y2 = motionEvent.getY(i4);
                queueEvent(new Runnable() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchGLSurfaceView.4
                    @Override // java.lang.Runnable
                    public void run() {
                        GpTouchGLSurfaceView.this.mRenderer.handleActionUp(pointerId4, x2, y2);
                    }
                });
            }
        } else {
            final float x3 = motionEvent.getX();
            final float y3 = motionEvent.getY();
            final int[] iArr2 = new int[1];
            final float[] fArr3 = new float[1];
            final float[] fArr4 = new float[1];
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                queueEvent(new Runnable() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchGLSurfaceView.7
                    @Override // java.lang.Runnable
                    public void run() {
                        GpTouchGLSurfaceView.this.mRenderer.handleActionDown(0, x3, y3);
                    }
                });
            } else if (action2 == 1) {
                queueEvent(new Runnable() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchGLSurfaceView.8
                    @Override // java.lang.Runnable
                    public void run() {
                        GpTouchGLSurfaceView.this.mRenderer.handleActionUp(0, x3, y3);
                    }
                });
            } else if (action2 == 2) {
                queueEvent(new Runnable() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchGLSurfaceView.9
                    @Override // java.lang.Runnable
                    public void run() {
                        iArr2[0] = 0;
                        fArr3[0] = x3;
                        fArr4[0] = y3;
                        GpTouchGLSurfaceView.this.mRenderer.handleActionMove(iArr2, fArr3, fArr4);
                    }
                });
            }
        }
        return true;
    }
}
