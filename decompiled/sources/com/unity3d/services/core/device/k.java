package com.unity3d.services.core.device;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: compiled from: VolumeChange.java */
/* JADX INFO: loaded from: classes2.dex */
public class k {
    private static ContentObserver a;
    private static ArrayList<d> b;

    /* JADX INFO: compiled from: VolumeChange.java */
    static class a extends ContentObserver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            k.e();
        }
    }

    public static void b(d dVar) {
        if (b.contains(dVar)) {
            b.remove(dVar);
        }
        ArrayList<d> arrayList = b;
        if (arrayList == null || arrayList.size() == 0) {
            d();
        }
    }

    public static void c() {
        ContentResolver contentResolver;
        if (a == null) {
            a = new a(new Handler(Looper.getMainLooper()));
            Context contextE = com.unity3d.services.core.properties.a.e();
            if (contextE == null || (contentResolver = contextE.getContentResolver()) == null) {
                return;
            }
            contentResolver.registerContentObserver(Settings.System.CONTENT_URI, true, a);
        }
    }

    public static void d() {
        ContentResolver contentResolver;
        if (a != null) {
            Context contextE = com.unity3d.services.core.properties.a.e();
            if (contextE != null && (contentResolver = contextE.getContentResolver()) != null) {
                contentResolver.unregisterContentObserver(a);
            }
            a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        ArrayList<d> arrayList = b;
        if (arrayList != null) {
            for (d dVar : arrayList) {
                dVar.a(b.b(dVar.a()));
            }
        }
    }

    public static void a(d dVar) {
        if (b == null) {
            b = new ArrayList<>();
        }
        if (b.contains(dVar)) {
            return;
        }
        c();
        b.add(dVar);
    }

    public static void b() {
        ArrayList<d> arrayList = b;
        if (arrayList != null) {
            arrayList.clear();
        }
        d();
        b = null;
    }
}
