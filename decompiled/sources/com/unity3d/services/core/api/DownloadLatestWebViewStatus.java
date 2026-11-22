package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes2.dex */
public enum DownloadLatestWebViewStatus {
    INIT_QUEUE_NULL(0),
    INIT_QUEUE_NOT_EMPTY(1),
    MISSING_LATEST_CONFIG(2),
    BACKGROUND_DOWNLOAD_STARTED(3);

    private final int b;

    DownloadLatestWebViewStatus(int i) {
        this.b = i;
    }

    public int getValue() {
        return this.b;
    }
}
