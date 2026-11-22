package com.unity3d.services.ads.api;

import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;

/* JADX INFO: loaded from: classes2.dex */
public class VideoPlayer {
    private static com.unity3d.services.ads.video.c a;

    static class a implements Runnable {
        final /* synthetic */ Integer a;

        a(Integer num) {
            this.a = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().setProgressEventInterval(this.a.intValue());
            }
        }
    }

    static class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Double b;
        final /* synthetic */ Integer c;

        b(String str, Double d, Integer num) {
            this.a = str;
            this.b = d;
            this.c = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().a(this.a, this.b.floatValue(), this.c.intValue());
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().a();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().pause();
            }
        }
    }

    static class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().c();
            }
        }
    }

    static class f implements Runnable {
        final /* synthetic */ Integer a;

        f(Integer num) {
            this.a = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().seekTo(this.a.intValue());
            }
        }
    }

    @WebViewExposed
    public static void getCurrentPosition(l lVar) {
        if (getVideoPlayerView() != null) {
            lVar.a(Integer.valueOf(getVideoPlayerView().getCurrentPosition()));
        } else {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getProgressEventInterval(l lVar) {
        if (getVideoPlayerView() != null) {
            lVar.a(Integer.valueOf(getVideoPlayerView().getProgressEventInterval()));
        } else {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    public static com.unity3d.services.ads.video.c getVideoPlayerView() {
        return a;
    }

    @WebViewExposed
    public static void getVideoViewRectangle(l lVar) {
        com.unity3d.services.ads.video.c videoPlayerView = getVideoPlayerView();
        if (videoPlayerView == null) {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        } else {
            int[] videoViewRectangle = videoPlayerView.getVideoViewRectangle();
            lVar.a(Integer.valueOf(videoViewRectangle[0]), Integer.valueOf(videoViewRectangle[1]), Integer.valueOf(videoViewRectangle[2]), Integer.valueOf(videoViewRectangle[3]));
        }
    }

    @WebViewExposed
    public static void getVolume(l lVar) {
        if (getVideoPlayerView() != null) {
            lVar.a(Float.valueOf(getVideoPlayerView().getVolume()));
        } else {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void pause(l lVar) {
        com.unity3d.services.core.log.a.b("Pausing current video");
        j.a(new d());
        if (getVideoPlayerView() != null) {
            lVar.a(new Object[0]);
        } else {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void play(l lVar) {
        com.unity3d.services.core.log.a.b("Starting playback of prepared video");
        j.a(new c());
        if (getVideoPlayerView() != null) {
            lVar.a(new Object[0]);
        } else {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void prepare(String str, Double d2, l lVar) {
        prepare(str, d2, 0, lVar);
    }

    @WebViewExposed
    public static void seekTo(Integer num, l lVar) {
        com.unity3d.services.core.log.a.b("Seeking video to time: " + num);
        j.a(new f(num));
        if (getVideoPlayerView() != null) {
            lVar.a(new Object[0]);
        } else {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setProgressEventInterval(Integer num, l lVar) {
        j.a(new a(num));
        if (getVideoPlayerView() != null) {
            lVar.a(new Object[0]);
        } else {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    public static void setVideoPlayerView(com.unity3d.services.ads.video.c cVar) {
        a = cVar;
    }

    @WebViewExposed
    public static void setVolume(Double d2, l lVar) {
        com.unity3d.services.core.log.a.b("Setting video volume: " + d2);
        if (getVideoPlayerView() == null) {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        } else {
            getVideoPlayerView().setVolume(Float.valueOf(d2.floatValue()));
            lVar.a(d2);
        }
    }

    @WebViewExposed
    public static void stop(l lVar) {
        com.unity3d.services.core.log.a.b("Stopping current video");
        j.a(new e());
        if (getVideoPlayerView() != null) {
            lVar.a(new Object[0]);
        } else {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void prepare(String str, Double d2, Integer num, l lVar) {
        com.unity3d.services.core.log.a.b("Preparing video for playback: " + str);
        j.a(new b(str, d2, num));
        if (getVideoPlayerView() != null) {
            lVar.a(str);
        } else {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setInfoListenerEnabled(boolean z, l lVar) {
        if (getVideoPlayerView() == null) {
            lVar.a(com.unity3d.services.ads.video.a.VIDEOVIEW_NULL, new Object[0]);
        } else {
            getVideoPlayerView().setInfoListenerEnabled(z);
            lVar.a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.INFO, Boolean.valueOf(z));
        }
    }
}
