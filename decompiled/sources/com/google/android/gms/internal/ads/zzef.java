package com.google.android.gms.internal.ads;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzef {
    public static int zza() throws zzeg {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        zzeh.zza();
        return iArr[0];
    }

    public static EGLContext zzb(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) throws zzeg {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, zzl(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            zzeh.zza();
            return eGLContextEglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new zzeg("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i);
    }

    public static EGLContext zzc() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay zzd() throws zzeg {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        zzeh.zzb(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        zzeh.zzb(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        zzeh.zza();
        return eGLDisplayEglGetDisplay;
    }

    public static EGLSurface zze(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws zzeg {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, zzl(eGLDisplay, iArr), iArr2, 0);
        zzg("Error creating a new EGL Pbuffer surface");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static EGLSurface zzf(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws zzeg {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, zzl(eGLDisplay, iArr), obj, iArr2, 0);
        zzg("Error creating a new EGL surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    public static void zzg(String str) throws zzeg {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new zzeg(str + ", error code: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void zzh(EGLDisplay eGLDisplay, EGLContext eGLContext) throws zzeg {
        if (eGLDisplay == null) {
            return;
        }
        EGL14.eglMakeCurrent(eGLDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        zzg("Error releasing context");
        if (eGLContext != null) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            zzg("Error destroying context");
        }
        EGL14.eglReleaseThread();
        zzg("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        zzg("Error terminating display");
    }

    public static void zzi(EGLDisplay eGLDisplay, EGLSurface eGLSurface) throws zzeg {
        if (eGLDisplay == null || eGLSurface == null) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        zzg("Error destroying surface");
    }

    public static void zzj(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws zzeg {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        zzg("Error making context current");
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        zzeh.zza();
        GLES20.glViewport(0, 0, i2, i3);
        zzeh.zza();
    }

    public static boolean zzk(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    private static EGLConfig zzl(EGLDisplay eGLDisplay, int[] iArr) throws zzeg {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new zzeg("eglChooseConfig failed.");
    }
}
