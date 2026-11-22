package com.unity3d.services.banners;

import android.content.Context;
import android.content.res.Resources;
import com.unity3d.services.core.misc.k;

/* JADX INFO: loaded from: classes2.dex */
public class UnityBannerSize {
    private int a;
    private int b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.BANNER_SIZE_STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.BANNER_SIZE_LEADERBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.BANNER_SIZE_IAB_STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private enum b {
        BANNER_SIZE_STANDARD,
        BANNER_SIZE_LEADERBOARD,
        BANNER_SIZE_IAB_STANDARD,
        BANNER_SIZE_DYNAMIC;

        /* JADX INFO: Access modifiers changed from: private */
        public int c(Context context) {
            int i = a.a[b(context).ordinal()];
            if (i != 2) {
                return i != 3 ? 320 : 468;
            }
            return 728;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a(Context context) {
            int i = a.a[b(context).ordinal()];
            if (i != 2) {
                return i != 3 ? 50 : 60;
            }
            return 90;
        }

        private b b(Context context) {
            if (this != BANNER_SIZE_DYNAMIC) {
                return this;
            }
            int iRound = Math.round(k.a(context, Resources.getSystem().getDisplayMetrics().widthPixels));
            if (iRound >= 728) {
                return BANNER_SIZE_LEADERBOARD;
            }
            return iRound >= 468 ? BANNER_SIZE_IAB_STANDARD : BANNER_SIZE_STANDARD;
        }
    }

    public UnityBannerSize(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static UnityBannerSize getDynamicSize(Context context) {
        b bVar = b.BANNER_SIZE_DYNAMIC;
        return new UnityBannerSize(bVar.c(context), bVar.a(context));
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.a;
    }
}
