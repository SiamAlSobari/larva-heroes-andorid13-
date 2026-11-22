package com.unity3d.services.core.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: AdvertisingId.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static a a;
    private String b = null;
    private boolean c = false;

    /* JADX INFO: compiled from: AdvertisingId.java */
    private class c implements ServiceConnection {
        boolean a;
        private final BlockingQueue<IBinder> b;

        private c() {
            this.a = false;
            this.b = new LinkedBlockingQueue();
        }

        public IBinder a() throws InterruptedException {
            if (this.a) {
                throw new IllegalStateException();
            }
            this.a = true;
            return this.b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
                com.unity3d.services.core.log.a.b("Couldn't put service to binder que");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static String a() {
        return b().b;
    }

    private static a b() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public static boolean c() {
        return b().c;
    }

    private void a(Context context) {
        boolean zBindService;
        c cVar = new c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            zBindService = context.bindService(intent, cVar, 1);
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Couldn't bind to identifier service intent", e);
            zBindService = false;
        }
        try {
            if (zBindService) {
                b bVarA = b.AbstractBinderC0041a.a(cVar.a());
                this.b = bVarA.a();
                this.c = bVarA.a(true);
            }
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Couldn't get advertising info", e2);
        } finally {
            if (zBindService) {
                context.unbindService(cVar);
            }
        }
    }

    public static void b(Context context) {
        b().a(context);
    }

    /* JADX INFO: compiled from: AdvertisingId.java */
    private interface b extends IInterface {
        String a() throws RemoteException;

        boolean a(boolean z) throws RemoteException;

        /* JADX INFO: renamed from: com.unity3d.services.core.device.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AdvertisingId.java */
        public static abstract class AbstractBinderC0041a extends Binder implements b {
            public static b a(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0042a(iBinder) : (b) iInterfaceQueryLocalInterface;
            }

            /* JADX INFO: renamed from: com.unity3d.services.core.device.a$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: AdvertisingId.java */
            private static class C0042a implements b {
                private final IBinder a;

                C0042a(IBinder iBinder) {
                    this.a = iBinder;
                }

                @Override // com.unity3d.services.core.device.a.b
                public String a() throws RemoteException {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        this.a.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return this.a;
                }

                @Override // com.unity3d.services.core.device.a.b
                public boolean a(boolean z) throws RemoteException {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        parcelObtain.writeInt(z ? 1 : 0);
                        this.a.transact(2, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readInt() != 0;
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
            }
        }
    }
}
