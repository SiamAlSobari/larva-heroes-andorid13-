package com.unity3d.services.core.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: OpenAdvertisingId.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    private static e a;
    private String b = null;
    private boolean c = false;

    /* JADX INFO: compiled from: OpenAdvertisingId.java */
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

    private static e a() {
        if (a == null) {
            a = new e();
        }
        return a;
    }

    public static void b(Context context) {
        if (Build.MANUFACTURER.toUpperCase().equals("HUAWEI")) {
            a().a(context);
        }
    }

    public static String c() {
        return a().b;
    }

    public static boolean b() {
        return a().c;
    }

    private void a(Context context) {
        c cVar = new c();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            if (context.bindService(intent, cVar, 1)) {
                try {
                    try {
                        b bVarA = b.a.a(cVar.a());
                        this.b = bVarA.a();
                        this.c = bVarA.a(true);
                    } catch (Exception e) {
                        com.unity3d.services.core.log.a.a("Couldn't get openAdvertising info", e);
                    }
                } finally {
                    context.unbindService(cVar);
                }
            }
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Couldn't bind to identifier service intent", e2);
        }
    }

    /* JADX INFO: compiled from: OpenAdvertisingId.java */
    private interface b extends IInterface {
        String a() throws RemoteException;

        boolean a(boolean z) throws RemoteException;

        /* JADX INFO: compiled from: OpenAdvertisingId.java */
        public static abstract class a extends Binder implements b {
            public static b a(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0044a(iBinder) : (b) iInterfaceQueryLocalInterface;
            }

            /* JADX INFO: renamed from: com.unity3d.services.core.device.e$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: OpenAdvertisingId.java */
            private static class C0044a implements b {
                private final IBinder a;

                C0044a(IBinder iBinder) {
                    this.a = iBinder;
                }

                @Override // com.unity3d.services.core.device.e.b
                public String a() throws RemoteException {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
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

                @Override // com.unity3d.services.core.device.e.b
                public boolean a(boolean z) throws RemoteException {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
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
