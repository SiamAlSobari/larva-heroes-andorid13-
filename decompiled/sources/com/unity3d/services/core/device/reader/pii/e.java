package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;

/* JADX INFO: compiled from: PiiPrivacyMode.java */
/* JADX INFO: loaded from: classes2.dex */
public enum e {
    APP,
    NONE,
    MIXED,
    UNDEFINED,
    NULL;

    public static e a(String str) {
        if (str == null) {
            return NULL;
        }
        e eVar = UNDEFINED;
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return eVar;
        }
    }
}
