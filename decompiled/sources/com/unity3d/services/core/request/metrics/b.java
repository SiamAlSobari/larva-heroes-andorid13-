package com.unity3d.services.core.request.metrics;

import androidx.core.os.EnvironmentCompat;
import com.unity3d.ads.UnityAds;
import java.util.HashMap;

/* JADX INFO: compiled from: AdOperationMetric.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: compiled from: AdOperationMetric.java */
    static class a extends HashMap<String, String> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
            put("reason", str);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.request.metrics.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdOperationMetric.java */
    static /* synthetic */ class C0047b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            b = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            a = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static d a() {
        return new d("native_load_started", null, null);
    }

    public static d b() {
        return new d("native_show_started", null, null);
    }

    public static d a(Long l) {
        return new d("native_load_time_success", l, null);
    }

    public static d b(Long l) {
        return new d("native_show_time_success", l, null);
    }

    public static d a(com.unity3d.services.core.request.metrics.a aVar, Long l) {
        return new d("native_load_time_failure", l, a(aVar));
    }

    public static d b(com.unity3d.services.core.request.metrics.a aVar, Long l) {
        return new d("native_show_time_failure", l, a(aVar));
    }

    public static d a(UnityAds.UnityAdsLoadError unityAdsLoadError, Long l) {
        return a(a(unityAdsLoadError), l);
    }

    public static d a(UnityAds.UnityAdsShowError unityAdsShowError, Long l) {
        return b(a(unityAdsShowError), l);
    }

    private static HashMap<String, String> a(com.unity3d.services.core.request.metrics.a aVar) {
        return new a(aVar == null ? EnvironmentCompat.MEDIA_UNKNOWN : aVar.toString());
    }

    private static com.unity3d.services.core.request.metrics.a a(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i = C0047b.a[unityAdsLoadError.ordinal()];
        if (i == 1) {
            return com.unity3d.services.core.request.metrics.a.init_failed;
        }
        if (i == 2) {
            return com.unity3d.services.core.request.metrics.a.internal;
        }
        if (i == 3) {
            return com.unity3d.services.core.request.metrics.a.invalid;
        }
        if (i == 4) {
            return com.unity3d.services.core.request.metrics.a.no_fill;
        }
        if (i != 5) {
            return null;
        }
        return com.unity3d.services.core.request.metrics.a.timeout;
    }

    private static com.unity3d.services.core.request.metrics.a a(UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (C0047b.b[unityAdsShowError.ordinal()]) {
            case 1:
                return com.unity3d.services.core.request.metrics.a.init_failed;
            case 2:
                return com.unity3d.services.core.request.metrics.a.not_ready;
            case 3:
                return com.unity3d.services.core.request.metrics.a.player;
            case 4:
                return com.unity3d.services.core.request.metrics.a.invalid;
            case 5:
                return com.unity3d.services.core.request.metrics.a.no_connection;
            case 6:
                return com.unity3d.services.core.request.metrics.a.already_showing;
            case 7:
                return com.unity3d.services.core.request.metrics.a.internal;
            default:
                return null;
        }
    }
}
