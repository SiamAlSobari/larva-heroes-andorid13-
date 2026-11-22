package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.google.firebase.analytics.FirebaseAnalytics;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ff A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0208 A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0211 A[Catch: all -> 0x021a, TRY_ENTER, TryCatch #6 {, blocks: (B:32:0x00b2, B:34:0x00b8, B:35:0x00ba, B:105:0x0211, B:106:0x0219), top: B:162:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x029c A[Catch: all -> 0x02df, TryCatch #8 {all -> 0x02df, blocks: (B:5:0x0035, B:9:0x007e, B:14:0x0086, B:17:0x008c, B:29:0x00ad, B:112:0x0220, B:113:0x022b, B:124:0x0241, B:126:0x025f, B:128:0x026f, B:138:0x0293, B:139:0x029b, B:116:0x022f, B:118:0x0231, B:119:0x023b, B:140:0x029c, B:141:0x02b0, B:142:0x02b1, B:143:0x02de), top: B:163:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x008c A[Catch: all -> 0x02df, TRY_LEAVE, TryCatch #8 {all -> 0x02df, blocks: (B:5:0x0035, B:9:0x007e, B:14:0x0086, B:17:0x008c, B:29:0x00ad, B:112:0x0220, B:113:0x022b, B:124:0x0241, B:126:0x025f, B:128:0x026f, B:138:0x0293, B:139:0x029b, B:116:0x022f, B:118:0x0231, B:119:0x023b, B:140:0x029c, B:141:0x02b0, B:142:0x02b1, B:143:0x02de), top: B:163:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0094  */
    /* JADX WARN: Code duplicated, block: B:21:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8 A[Catch: all -> 0x021a, TryCatch #6 {, blocks: (B:32:0x00b2, B:34:0x00b8, B:35:0x00ba, B:105:0x0211, B:106:0x0219), top: B:162:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4 A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5 A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x015c A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0168 A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0187 A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x018e A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0196 A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5 A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01b0 A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c0 A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d5 A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TRY_LEAVE, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f6 A[Catch: all -> 0x021d, LoadingException -> 0x022c, RemoteException -> 0x0230, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0230, LoadingException -> 0x022c, all -> 0x021d, blocks: (B:31:0x00b1, B:37:0x00bd, B:39:0x00c4, B:40:0x00df, B:44:0x00e5, B:46:0x00ed, B:48:0x00f1, B:49:0x00fe, B:56:0x010b, B:58:0x0111, B:60:0x0138, B:62:0x0140, B:63:0x0147, B:64:0x014f, B:59:0x0125, B:67:0x0152, B:68:0x0153, B:69:0x015b, B:70:0x015c, B:71:0x0164, B:74:0x0167, B:75:0x0168, B:77:0x0187, B:79:0x018e, B:81:0x0196, B:87:0x01cf, B:89:0x01d5, B:99:0x01f6, B:100:0x01fe, B:82:0x01a5, B:83:0x01ad, B:85:0x01b0, B:86:0x01c0, B:101:0x01ff, B:102:0x0207, B:103:0x0208, B:104:0x0210, B:109:0x021c), top: B:164:0x00b1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x029c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00c4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0168, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.dynamite.DynamiteModule$VersionPolicy] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.content.Context] */
    @ResultIgnorabilityUnspecified
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        int i;
        int i2;
        Boolean bool;
        zzq zzqVarZzg;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        zzn zznVar;
        Cursor cursor;
        zzr zzrVar;
        zzn zznVar2;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzg;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn(null);
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = zzh;
        long jLongValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + selectionResultSelectModule.localVersion + " and remote module " + str + ":" + selectionResultSelectModule.remoteVersion);
            int i3 = selectionResultSelectModule.selection;
            if (i3 != 0) {
                ?? r2 = -1;
                if (i3 != -1) {
                    if (i3 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i3 == -1) {
                            DynamiteModule dynamiteModuleZzc = zzc(applicationContext, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(jLongValue));
                            }
                            cursor2 = zznVar4.zza;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(zznVar3);
                            return dynamiteModuleZzc;
                        }
                        if (i3 == 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                        }
                        try {
                            try {
                                i2 = selectionResultSelectModule.remoteVersion;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (zzf(context)) {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                        bool = zzb;
                                    }
                                    if (bool != null) {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                        synchronized (DynamiteModule.class) {
                                            zzrVar = zzl;
                                        }
                                        if (zzrVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zznVar2 = (zzn) threadLocal.get();
                                        if (zznVar2 != null || zznVar2.zza == null) {
                                            throw new LoadingException("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor3 = zznVar2.zza;
                                        ObjectWrapper.wrap(null);
                                        synchronized (DynamiteModule.class) {
                                            boolValueOf = Boolean.valueOf(zze >= 2);
                                        }
                                        if (boolValueOf.booleanValue()) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            iObjectWrapperZze = zzrVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i2, ObjectWrapper.wrap(cursor3));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            iObjectWrapperZze = zzrVar.zze(ObjectWrapper.wrap(applicationContext2), str, i2, ObjectWrapper.wrap(cursor3));
                                        }
                                        Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context", null);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                        zzqVarZzg = zzg(context);
                                        if (zzqVarZzg != null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                        iZze = zzqVarZzg.zze();
                                        if (iZze >= 3) {
                                            zznVar = (zzn) threadLocal.get();
                                            if (zznVar != null) {
                                                throw new LoadingException("No cached result cursor holder", null);
                                            }
                                            iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i2, ObjectWrapper.wrap(zznVar.zza));
                                        } else if (iZze == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i2);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i2);
                                        }
                                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                        if (objUnwrap != null) {
                                            throw new LoadingException("Failed to load remote module.", null);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                    }
                                    if (jLongValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(jLongValue));
                                    }
                                    cursor = zznVar4.zza;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    threadLocal.set(zznVar3);
                                    return dynamiteModule;
                                } catch (RemoteException e) {
                                    throw new LoadingException("Failed to load remote module.", e, null);
                                } catch (LoadingException e2) {
                                    throw e2;
                                } catch (Throwable th) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                                    throw new LoadingException("Failed to load remote module.", th, null);
                                }
                            } catch (LoadingException e3) {
                                e = e3;
                                r2 = context;
                                Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                                i = selectionResultSelectModule.localVersion;
                                if (i != 0 || versionPolicy.selectModule(r2, str, new zzo(i, 0)).selection != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                                }
                                DynamiteModule dynamiteModuleZzc2 = zzc(applicationContext, str);
                                if (jLongValue == 0) {
                                    zzh.remove();
                                } else {
                                    zzh.set(Long.valueOf(jLongValue));
                                }
                                Cursor cursor4 = zznVar4.zza;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                zzg.set(zznVar3);
                                return dynamiteModuleZzc2;
                            }
                        } catch (LoadingException e4) {
                            e = e4;
                            Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                            i = selectionResultSelectModule.localVersion;
                            if (i != 0) {
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                        }
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i3 = -1;
                    if (i3 == 1) {
                    }
                    if (i3 == -1) {
                        DynamiteModule dynamiteModuleZzc3 = zzc(applicationContext, str);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor2 = zznVar4.zza;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(zznVar3);
                        return dynamiteModuleZzc3;
                    }
                    if (i3 == 1) {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                    }
                    i2 = selectionResultSelectModule.remoteVersion;
                    synchronized (DynamiteModule.class) {
                        if (zzf(context)) {
                            throw new LoadingException("Remote loading disabled", null);
                        }
                        bool = zzb;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                            synchronized (DynamiteModule.class) {
                                zzrVar = zzl;
                                if (zzrVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                }
                                zznVar2 = (zzn) threadLocal.get();
                                if (zznVar2 != null) {
                                }
                                throw new LoadingException("No result cursor", null);
                            }
                        }
                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                        zzqVarZzg = zzg(context);
                        if (zzqVarZzg != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                        }
                        iZze = zzqVarZzg.zze();
                        if (iZze >= 3) {
                            zznVar = (zzn) threadLocal.get();
                            if (zznVar != null) {
                                throw new LoadingException("No cached result cursor holder", null);
                            }
                            iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i2, ObjectWrapper.wrap(zznVar.zza));
                        } else if (iZze == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i2);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i2);
                        }
                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                        if (objUnwrap != null) {
                            throw new LoadingException("Failed to load remote module.", null);
                        }
                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor = zznVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar3);
                        return dynamiteModule;
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".", null);
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                zzh.remove();
            } else {
                zzh.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = zznVar4.zza;
            if (cursor5 != null) {
                cursor5.close();
            }
            zzg.set(zznVar3);
            throw th2;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:137:0x01b8 */
    /* JADX WARN: Code duplicated, block: B:94:0x0168 A[Catch: all -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x01c4, blocks: (B:3:0x0002, B:61:0x00db, B:63:0x00e1, B:68:0x0102, B:90:0x015a, B:94:0x0168, B:115:0x01bd, B:116:0x01c0, B:110:0x01b5, B:66:0x00e7, B:119:0x01c3, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:59:0x00d8, B:19:0x0046, B:41:0x009a, B:44:0x009d, B:52:0x00b6, B:60:0x00da, B:58:0x00bc), top: B:128:0x0002, inners: #0, #11 }] */
    public static int zza(Context context, String str, boolean z) {
        Throwable th;
        RemoteException e;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    zzd(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!zzf(context)) {
                                    return 0;
                                }
                                if (zzd || Boolean.TRUE.equals(null)) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        int iZzb = zzb(context, str, z, true);
                                        String str2 = zzc;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader classLoaderZza = zzb.zza();
                                            if (classLoaderZza == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = zzc;
                                                    Preconditions.checkNotNull(str3);
                                                    classLoaderZza = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = zzc;
                                                    Preconditions.checkNotNull(str4);
                                                    classLoaderZza = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            zzd(classLoaderZza);
                                            declaredField.set(null, classLoaderZza);
                                            zzb = Boolean.TRUE;
                                            return iZzb;
                                        }
                                        return iZzb;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            zzb = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z, false);
                    } catch (LoadingException e3) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                        return 0;
                    }
                }
                zzq zzqVarZzg = zzg(context);
                try {
                    if (zzqVarZzg != null) {
                        try {
                            int iZze = zzqVarZzg.zze();
                            if (iZze >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzqVarZzg.zzk(ObjectWrapper.wrap(context), str, z, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i = cursor3.getInt(0);
                                                cursor2 = (i <= 0 || !zze(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzqVarZzg.zzg(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzqVarZzg.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                    }
                    return iZzf;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int zzb(Context context, String str, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception e;
        ?? r0 = 0;
        ?? r1 = 0;
        ?? r2 = 0;
        ?? r3 = 0;
        try {
            try {
                boolean z3 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) zzh.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z4 = false;
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    zzc = cursorQuery.getString(2);
                                    int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        zze = cursorQuery.getInt(columnIndex);
                                    }
                                    int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (cursorQuery.getInt(columnIndex2) == 0) {
                                            z3 = false;
                                        }
                                        zzd = z3;
                                        z4 = z3;
                                    }
                                }
                                if (zze(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", r2 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        throw new LoadingException("V2 version check failed: " + e.getMessage(), e, r1 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", r3 == true ? 1 : 0);
            } catch (Throwable th2) {
                th = th2;
                r0 = context;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(zzf)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            zzf = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    public Context getModuleContext() {
        return this.zzj;
    }

    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
