package com.unity3d.services.core.webview.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: WebViewCallback.java */
/* JADX INFO: loaded from: classes2.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();
    private boolean a;
    private int b;
    private String c;

    /* JADX INFO: compiled from: WebViewCallback.java */
    static class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i) {
            return new l[i];
        }
    }

    public l(String str, int i) {
        this.c = str;
        this.b = i;
    }

    public void a(Object... objArr) {
        a(com.unity3d.services.core.webview.bridge.a.OK, null, objArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 45678;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.b);
    }

    private void a(com.unity3d.services.core.webview.bridge.a aVar, Enum r4, Object... objArr) {
        String str;
        if (this.a || (str = this.c) == null || str.length() == 0) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        arrayList.add(0, this.c);
        e eVarA = e.a(this.b);
        if (eVarA != null) {
            eVarA.a(aVar, r4, arrayList.toArray());
            return;
        }
        com.unity3d.services.core.log.a.c("Couldn't get batch with id: " + a());
    }

    public l(Parcel parcel) {
        this.c = parcel.readString();
        this.a = parcel.readByte() != 0;
        this.b = parcel.readInt();
    }

    public void a(Enum r2, Object... objArr) {
        a(com.unity3d.services.core.webview.bridge.a.ERROR, r2, objArr);
    }

    public int a() {
        return this.b;
    }
}
