package com.unity3d.services.ads.video;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.widget.VideoView;
import com.google.firebase.messaging.ServiceStarter;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: VideoPlayerView.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends VideoView {
    private String a;
    private Timer b;
    private Timer c;
    private int d;
    private MediaPlayer e;
    private Float f;
    private boolean g;
    private AudioManager h;

    /* JADX INFO: compiled from: VideoPlayerView.java */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            boolean zIsPlaying;
            try {
                zIsPlaying = c.this.isPlaying();
                try {
                    com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.PROGRESS, Integer.valueOf(c.this.getCurrentPosition()));
                } catch (IllegalStateException e) {
                    e = e;
                    com.unity3d.services.core.log.a.a("Exception while sending current position to webapp", e);
                    com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.ILLEGAL_STATE, com.unity3d.services.ads.video.b.PROGRESS, c.this.a, Boolean.valueOf(zIsPlaying));
                }
            } catch (IllegalStateException e2) {
                e = e2;
                zIsPlaying = false;
            }
        }
    }

    /* JADX INFO: compiled from: VideoPlayerView.java */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (c.this.isPlaying()) {
                return;
            }
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.PREPARE_TIMEOUT, c.this.a);
            com.unity3d.services.core.log.a.c("Video player prepare timeout: " + c.this.a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.ads.video.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VideoPlayerView.java */
    class C0035c implements MediaPlayer.OnPreparedListener {
        final /* synthetic */ float a;

        C0035c(float f) {
            this.a = f;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            c.this.d();
            if (mediaPlayer != null) {
                c.this.e = mediaPlayer;
            }
            c.this.setVolume(Float.valueOf(this.a));
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.PREPARED, c.this.a, Integer.valueOf(mediaPlayer.getDuration()), Integer.valueOf(mediaPlayer.getVideoWidth()), Integer.valueOf(mediaPlayer.getVideoHeight()));
        }
    }

    /* JADX INFO: compiled from: VideoPlayerView.java */
    class d implements MediaPlayer.OnErrorListener {
        d() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            c.this.d();
            if (mediaPlayer != null) {
                c.this.e = mediaPlayer;
            }
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.GENERIC_ERROR, c.this.a, Integer.valueOf(i), Integer.valueOf(i2));
            c.this.e();
            return true;
        }
    }

    /* JADX INFO: compiled from: VideoPlayerView.java */
    class e implements MediaPlayer.OnCompletionListener {
        e() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (mediaPlayer != null) {
                c.this.e = mediaPlayer;
            }
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.COMPLETED, c.this.a);
            c.this.e();
        }
    }

    /* JADX INFO: compiled from: VideoPlayerView.java */
    class f implements MediaPlayer.OnInfoListener {
        f() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.INFO, c.this.a, Integer.valueOf(i), Integer.valueOf(i2));
            return true;
        }
    }

    public c(Context context) {
        super(context);
        this.d = ServiceStarter.ERROR_UNKNOWN;
        this.e = null;
        this.f = null;
        this.g = true;
        this.h = null;
    }

    private void b() {
        Timer timer = new Timer();
        this.b = timer;
        a aVar = new a();
        long j = this.d;
        timer.scheduleAtFixedRate(aVar, j, j);
    }

    public void c() {
        stopPlayback();
        e();
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager audioManager = this.h;
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
        } else {
            setAudioFocusRequest(0);
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.STOP, this.a);
    }

    public void d() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c.purge();
            this.c = null;
        }
    }

    public void e() {
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
            this.b.purge();
            this.b = null;
        }
    }

    public int getProgressEventInterval() {
        return this.d;
    }

    public float getVolume() {
        return this.f.floatValue();
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public void pause() {
        try {
            super.pause();
            if (Build.VERSION.SDK_INT < 26) {
                AudioManager audioManager = this.h;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus(null);
                }
            } else {
                setAudioFocusRequest(0);
            }
            e();
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.PAUSE, this.a);
        } catch (Exception e2) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.PAUSE_ERROR, this.a);
            com.unity3d.services.core.log.a.a("Error pausing video", e2);
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        try {
            super.seekTo(i);
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.SEEKTO, this.a);
        } catch (Exception e2) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.SEEKTO_ERROR, this.a);
            com.unity3d.services.core.log.a.a("Error seeking video", e2);
        }
    }

    public void setInfoListenerEnabled(boolean z) {
        this.g = z;
        if (z) {
            setOnInfoListener(new f());
        } else {
            setOnInfoListener(null);
        }
    }

    public void setProgressEventInterval(int i) {
        this.d = i;
        if (this.b != null) {
            e();
            b();
        }
    }

    public void setVolume(Float f2) {
        try {
            this.e.setVolume(f2.floatValue(), f2.floatValue());
            this.f = f2;
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("MediaPlayer generic error", e2);
        }
    }

    public int[] getVideoViewRectangle() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        return new int[]{iArr[0], iArr[1], getMeasuredWidth(), getMeasuredHeight()};
    }

    private void a(long j) {
        Timer timer = new Timer();
        this.c = timer;
        timer.schedule(new b(), j);
    }

    public boolean a(String str, float f2, int i) {
        com.unity3d.services.core.log.a.a();
        this.a = str;
        setOnPreparedListener(new C0035c(f2));
        setOnErrorListener(new d());
        setInfoListenerEnabled(this.g);
        if (i > 0) {
            a(i);
        }
        try {
            if (Build.VERSION.SDK_INT < 26) {
                AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
                this.h = audioManager;
                if (audioManager != null) {
                    audioManager.requestAudioFocus(null, 3, 2);
                }
            } else {
                setAudioFocusRequest(2);
            }
            setVideoPath(this.a);
            return true;
        } catch (Exception e2) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.PREPARE_ERROR, this.a);
            com.unity3d.services.core.log.a.a("Error preparing video: " + this.a, e2);
            return false;
        }
    }

    public void a() {
        com.unity3d.services.core.log.a.a();
        setOnCompletionListener(new e());
        try {
            start();
            e();
            b();
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.PLAY, this.a);
        } catch (IllegalStateException unused) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.VIDEOPLAYER, com.unity3d.services.ads.video.b.ILLEGAL_STATE, this.a, Boolean.FALSE);
        }
    }
}
