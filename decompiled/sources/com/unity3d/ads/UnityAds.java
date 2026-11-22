package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class UnityAds {

    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    static class a implements IUnityAdsLoadListener {
        a() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAdsLoadError unityAdsLoadError, String str2) {
        }
    }

    public static boolean getDebugMode() {
        return com.unity3d.services.ads.a.a();
    }

    public static String getToken() {
        return com.unity3d.services.ads.a.b();
    }

    public static String getVersion() {
        return com.unity3d.services.ads.a.c();
    }

    public static void initialize(Context context, String str) {
        com.unity3d.services.ads.a.a(context, str, false, (IUnityAdsInitializationListener) null);
    }

    public static boolean isInitialized() {
        return com.unity3d.services.a.c();
    }

    public static boolean isSupported() {
        return com.unity3d.services.ads.a.e();
    }

    @Deprecated
    public static void load(String str) {
        load(str, new a());
    }

    public static void setDebugMode(boolean z) {
        com.unity3d.services.ads.a.a(z);
    }

    @Deprecated
    public static void show(Activity activity, String str) {
        com.unity3d.services.ads.a.a(activity, str, (IUnityAdsShowListener) null);
    }

    public static void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        com.unity3d.services.ads.a.a(iUnityAdsTokenListener);
    }

    public static void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        com.unity3d.services.ads.a.a(context, str, false, iUnityAdsInitializationListener);
    }

    public static void load(String str, IUnityAdsLoadListener iUnityAdsLoadListener) {
        com.unity3d.services.ads.a.a(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
    }

    public static void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        com.unity3d.services.ads.a.a(activity, str, iUnityAdsShowListener);
    }

    public static void initialize(Context context, String str, boolean z) {
        com.unity3d.services.ads.a.a(context, str, z, (IUnityAdsInitializationListener) null);
    }

    public static void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        com.unity3d.services.ads.a.a(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    @Deprecated
    public static void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        com.unity3d.services.ads.a.a(activity, str, unityAdsShowOptions, (IUnityAdsShowListener) null);
    }

    public static void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        com.unity3d.services.ads.a.a(context, str, z, iUnityAdsInitializationListener);
    }

    public static void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        com.unity3d.services.ads.a.a(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }
}
