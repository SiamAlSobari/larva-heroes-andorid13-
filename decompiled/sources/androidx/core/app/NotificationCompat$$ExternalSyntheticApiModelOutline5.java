package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannelGroup;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraManager;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class NotificationCompat$$ExternalSyntheticApiModelOutline5 {
    public static /* bridge */ /* synthetic */ NotificationChannelGroup m(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.app.RemoteInput m52m(Object obj) {
        return (android.app.RemoteInput) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Icon m54m(Object obj) {
        return (Icon) obj;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return Notification.MessagingStyle.class;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m63m(Object obj) {
        return obj instanceof Icon;
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return Notification.DecoratedCustomViewStyle.class;
    }

    public static /* bridge */ /* synthetic */ Class m$10() {
        return TelecomManager.class;
    }

    public static /* bridge */ /* synthetic */ Class m$11() {
        return TvInputManager.class;
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return SubscriptionManager.class;
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return UsageStatsManager.class;
    }

    public static /* bridge */ /* synthetic */ Class m$4() {
        return CameraManager.class;
    }

    public static /* bridge */ /* synthetic */ Class m$5() {
        return JobScheduler.class;
    }

    public static /* bridge */ /* synthetic */ Class m$6() {
        return LauncherApps.class;
    }

    public static /* bridge */ /* synthetic */ Class m$7() {
        return MediaProjectionManager.class;
    }

    public static /* bridge */ /* synthetic */ Class m$8() {
        return MediaSessionManager.class;
    }

    public static /* bridge */ /* synthetic */ Class m$9() {
        return RestrictionsManager.class;
    }
}
