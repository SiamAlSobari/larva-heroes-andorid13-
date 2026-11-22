package com.unity3d.services.core.api;

import com.unity3d.services.core.request.b;
import com.unity3d.services.core.request.f;
import com.unity3d.services.core.request.g;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;

/* JADX INFO: loaded from: classes2.dex */
public class Resolve {
    @WebViewExposed
    public static void resolve(String str, String str2, l lVar) {
        if (com.unity3d.services.core.request.l.a(str2, new a(str))) {
            lVar.a(str);
        } else {
            lVar.a(f.INVALID_HOST, str);
        }
    }

    static class a implements b {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.unity3d.services.core.request.b
        public void a(String str, String str2) {
            if (com.unity3d.services.core.webview.a.c() != null) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.RESOLVE, g.COMPLETE, this.a, str, str2);
            }
        }

        @Override // com.unity3d.services.core.request.b
        public void a(String str, f fVar, String str2) {
            if (com.unity3d.services.core.webview.a.c() != null) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.RESOLVE, g.FAILED, this.a, str, fVar.name(), str2);
            }
        }
    }
}
