package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.signals.ISignalCollectionListener;

/* JADX INFO: compiled from: SignalsHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class d implements ISignalCollectionListener {
    @Override // com.unity3d.scar.adapter.common.signals.ISignalCollectionListener
    public void onSignalsCollected(String str) {
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.GMA, GMAEvent.SIGNALS, str);
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalCollectionListener
    public void onSignalsCollectionFailed(String str) {
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.GMA, GMAEvent.SIGNALS_ERROR, str);
    }
}
