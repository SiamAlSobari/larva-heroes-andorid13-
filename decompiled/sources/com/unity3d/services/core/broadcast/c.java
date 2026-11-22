package com.unity3d.services.core.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BroadcastEventReceiver.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends BroadcastReceiver {
    private String a;

    public c(String str) {
        this.a = str;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String dataString = intent.getDataString() != null ? intent.getDataString() : "";
        JSONObject jSONObject = new JSONObject();
        try {
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                for (String str : extras.keySet()) {
                    jSONObject.put(str, extras.get(str));
                }
            }
        } catch (JSONException e) {
            com.unity3d.services.core.log.a.b("JSONException when composing extras for broadcast action " + action + ": " + e.getMessage());
        }
        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
        if (aVarC == null || !aVarC.i()) {
            return;
        }
        aVarC.a(com.unity3d.services.core.webview.b.BROADCAST, b.ACTION, this.a, action, dataString, jSONObject);
    }
}
