package com.unity3d.services.core.configuration;

import com.unity3d.services.core.request.metrics.d;
import com.unity3d.services.core.request.metrics.i;
import com.unity3d.services.core.request.metrics.j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class InitializeEventsMetricSender implements IInitializeEventsMetricSender, IInitializationListener {
    private static InitializeEventsMetricSender a;
    private long b = 0;
    private long c = 0;
    private long d = 0;
    private long e = 0;
    private int f = 0;
    private int g = 0;
    private boolean h = false;
    private boolean i = false;

    class a extends HashMap<String, String> {
        a() {
            put("c_retry", String.valueOf(InitializeEventsMetricSender.this.f));
            put("wv_retry", String.valueOf(InitializeEventsMetricSender.this.g));
        }
    }

    private InitializeEventsMetricSender() {
        InitializationNotificationCenter.getInstance().addListener(this);
    }

    public static IInitializeEventsMetricSender getInstance() {
        if (a == null) {
            a = new InitializeEventsMetricSender();
        }
        return a;
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didConfigRequestStart() {
        this.e = System.nanoTime();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didInitStart() {
        this.b = System.nanoTime();
        this.f = 0;
        this.g = 0;
        sendMetric(j.b());
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didPrivacyConfigRequestEnd(boolean z) {
        this.d = System.nanoTime();
        a(z);
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didPrivacyConfigRequestStart() {
        this.c = System.nanoTime();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long duration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.b));
    }

    public Map<String, String> getErrorStateTags(ErrorState errorState) {
        Map<String, String> retryTags = getRetryTags();
        retryTags.put("stt", errorState.getMetricName());
        return retryTags;
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Map<String, String> getRetryTags() {
        return new a();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long initializationStartTimeStamp() {
        return Long.valueOf(this.b);
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void onRetryConfig() {
        this.f++;
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void onRetryWebview() {
        this.g++;
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
        sdkInitializeFailed(str, errorState);
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitialized() {
        sdkDidInitialize();
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long privacyConfigDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.d - this.c));
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkDidInitialize() {
        if (initializationStartTimeStamp().longValue() == 0) {
            com.unity3d.services.core.log.a.b("sdkDidInitialize called before didInitStart, skipping metric");
            return;
        }
        if (!this.h) {
            sendMetric(j.b(duration(), getRetryTags()));
            this.h = true;
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkInitializeFailed(String str, ErrorState errorState) {
        if (this.b == 0) {
            com.unity3d.services.core.log.a.b("sdkInitializeFailed called before didInitStart, skipping metric");
            return;
        }
        if (!this.h) {
            sendMetric(j.a(duration(), getErrorStateTags(errorState)));
            this.h = true;
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public synchronized void sdkTokenDidBecomeAvailableWithConfig(boolean z) {
        if (!this.i) {
            b(z);
            if (z) {
                a();
            }
            this.i = true;
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void sendMetric(d dVar) {
        i.a().sendMetric(dVar);
    }

    @Override // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long tokenDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.e));
    }

    private void a() {
        if (this.e == 0) {
            com.unity3d.services.core.log.a.b("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else {
            sendMetric(j.e(tokenDuration(), getRetryTags()));
        }
    }

    private void b(boolean z) {
        if (this.b == 0) {
            com.unity3d.services.core.log.a.b("sendTokenAvailabilityMetricWithConfig called before didInitStart, skipping metric");
            return;
        }
        Long lValueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.b));
        Map<String, String> retryTags = getRetryTags();
        sendMetric(z ? j.c(lValueOf, retryTags) : j.d(lValueOf, retryTags));
    }

    private void a(boolean z) {
        if (this.c == 0 || this.d == 0) {
            com.unity3d.services.core.log.a.b("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else if (z) {
            sendMetric(j.d(privacyConfigDuration()));
        } else {
            sendMetric(j.c(privacyConfigDuration()));
        }
    }
}
