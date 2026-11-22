package com.unity3d.services.core.api;

import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.util.SparseArray;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.c;
import com.unity3d.services.core.device.d;
import com.unity3d.services.core.device.k;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceInfo {
    private static SparseArray<d> a;

    public enum DeviceInfoEvent {
        VOLUME_CHANGED
    }

    public enum StorageType {
        EXTERNAL,
        INTERNAL
    }

    static class a implements d {
        private int a;
        final /* synthetic */ Integer b;

        a(Integer num) {
            this.b = num;
            this.a = num.intValue();
        }

        @Override // com.unity3d.services.core.device.d
        public void a(int i) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(a()), Integer.valueOf(i), Integer.valueOf(com.unity3d.services.core.device.b.a(this.a)));
        }

        @Override // com.unity3d.services.core.device.d
        public int a() {
            return this.a;
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[StorageType.values().length];
            a = iArr;
            try {
                iArr[StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static StorageType a(String str) {
        try {
            return StorageType.valueOf(str);
        } catch (IllegalArgumentException e) {
            com.unity3d.services.core.log.a.a("Illegal argument: " + str, e);
            return null;
        }
    }

    @WebViewExposed
    public static void getAdvertisingTrackingId(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.a());
    }

    @WebViewExposed
    public static void getApiLevel(l lVar) {
        lVar.a(Integer.valueOf(com.unity3d.services.core.device.b.b()));
    }

    @WebViewExposed
    public static void getApkDigest(l lVar) {
        try {
            lVar.a(com.unity3d.services.core.device.b.c());
        } catch (Exception e) {
            lVar.a(c.COULDNT_GET_DIGEST, e.toString());
        }
    }

    @WebViewExposed
    public static void getBatteryLevel(l lVar) {
        lVar.a(Float.valueOf(com.unity3d.services.core.device.b.d()));
    }

    @WebViewExposed
    public static void getBatteryStatus(l lVar) {
        lVar.a(Integer.valueOf(com.unity3d.services.core.device.b.e()));
    }

    @WebViewExposed
    public static void getBoard(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.f());
    }

    @WebViewExposed
    public static void getBootloader(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.g());
    }

    @WebViewExposed
    public static void getBrand(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.h());
    }

    @WebViewExposed
    public static void getBuildId(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.i());
    }

    @WebViewExposed
    public static void getBuildVersionIncremental(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.j());
    }

    @WebViewExposed
    public static void getCPUCount(l lVar) {
        lVar.a(Long.valueOf(com.unity3d.services.core.device.b.k()));
    }

    @WebViewExposed
    public static void getCertificateFingerprint(l lVar) {
        String strL = com.unity3d.services.core.device.b.l();
        if (strL != null) {
            lVar.a(strL);
        } else {
            lVar.a(c.COULDNT_GET_FINGERPRINT, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getConnectionType(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.m());
    }

    @WebViewExposed
    public static void getDevice(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.n());
    }

    @WebViewExposed
    public static void getDeviceMaxVolume(Integer num, l lVar) {
        int iA = com.unity3d.services.core.device.b.a(num.intValue());
        if (iA > -1) {
            lVar.a(Integer.valueOf(iA));
            return;
        }
        if (iA == -2) {
            lVar.a(c.AUDIOMANAGER_NULL, Integer.valueOf(iA));
        } else {
            if (iA == -1) {
                lVar.a(c.APPLICATION_CONTEXT_NULL, Integer.valueOf(iA));
                return;
            }
            com.unity3d.services.core.log.a.c("Unhandled deviceMaxVolume error: " + iA);
        }
    }

    @WebViewExposed
    public static void getDeviceVolume(Integer num, l lVar) {
        int iB = com.unity3d.services.core.device.b.b(num.intValue());
        if (iB > -1) {
            lVar.a(Integer.valueOf(iB));
            return;
        }
        if (iB == -2) {
            lVar.a(c.AUDIOMANAGER_NULL, Integer.valueOf(iB));
        } else {
            if (iB == -1) {
                lVar.a(c.APPLICATION_CONTEXT_NULL, Integer.valueOf(iB));
                return;
            }
            com.unity3d.services.core.log.a.c("Unhandled deviceVolume error: " + iB);
        }
    }

    @WebViewExposed
    public static void getDisplayMetricDensity(l lVar) {
        lVar.a(Float.valueOf(com.unity3d.services.core.device.b.o()));
    }

    @WebViewExposed
    public static void getElapsedRealtime(l lVar) {
        lVar.a(Long.valueOf(com.unity3d.services.core.device.b.p()));
    }

    @WebViewExposed
    public static void getFingerprint(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.q());
    }

    @WebViewExposed
    public static void getFreeMemory(l lVar) {
        lVar.a(Long.valueOf(com.unity3d.services.core.device.b.r()));
    }

    @WebViewExposed
    public static void getFreeSpace(String str, l lVar) {
        StorageType storageTypeA = a(str);
        if (storageTypeA == null) {
            lVar.a(c.INVALID_STORAGETYPE, str);
            return;
        }
        long jA = com.unity3d.services.core.device.b.a(a(storageTypeA));
        if (jA > -1) {
            lVar.a(Long.valueOf(jA));
        } else {
            lVar.a(c.COULDNT_GET_STORAGE_LOCATION, Long.valueOf(jA));
        }
    }

    @WebViewExposed
    public static void getGLVersion(l lVar) {
        String strS = com.unity3d.services.core.device.b.s();
        if (strS != null) {
            lVar.a(strS);
        } else {
            lVar.a(c.COULDNT_GET_GL_VERSION, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getHardware(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.t());
    }

    @WebViewExposed
    public static void getHeadset(l lVar) {
        lVar.a(Boolean.valueOf(com.unity3d.services.core.device.b.b0()));
    }

    @WebViewExposed
    public static void getHost(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.u());
    }

    @WebViewExposed
    public static void getLimitAdTrackingFlag(l lVar) {
        lVar.a(Boolean.valueOf(com.unity3d.services.core.device.b.W()));
    }

    @WebViewExposed
    public static void getLimitOpenAdTrackingFlag(l lVar) {
        lVar.a(Boolean.valueOf(com.unity3d.services.core.device.b.X()));
    }

    @WebViewExposed
    public static void getManufacturer(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.w());
    }

    @WebViewExposed
    public static void getModel(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.x());
    }

    @WebViewExposed
    public static void getNetworkCountryISO(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.y());
    }

    @WebViewExposed
    public static void getNetworkMetered(l lVar) {
        lVar.a(Boolean.valueOf(com.unity3d.services.core.device.b.z()));
    }

    @WebViewExposed
    public static void getNetworkOperator(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.A());
    }

    @WebViewExposed
    public static void getNetworkOperatorName(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.B());
    }

    @WebViewExposed
    public static void getNetworkType(l lVar) {
        lVar.a(Integer.valueOf(com.unity3d.services.core.device.b.C()));
    }

    @WebViewExposed
    public static void getOpenAdvertisingTrackingId(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.F());
    }

    @WebViewExposed
    public static void getOsVersion(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.G());
    }

    @WebViewExposed
    public static void getPackageInfo(l lVar) {
        if (com.unity3d.services.core.properties.a.e() == null) {
            lVar.a(c.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        String strB = com.unity3d.services.core.properties.a.b();
        try {
            lVar.a(com.unity3d.services.core.device.b.a(com.unity3d.services.core.properties.a.e().getPackageManager()));
        } catch (PackageManager.NameNotFoundException unused) {
            lVar.a(c.APPLICATION_INFO_NOT_AVAILABLE, strB);
        } catch (JSONException e) {
            lVar.a(c.JSON_ERROR, e.getMessage());
        }
    }

    @WebViewExposed
    public static void getProcessInfo(l lVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> mapH = com.unity3d.services.core.device.b.H();
        if (mapH != null) {
            try {
                if (mapH.containsKey("stat")) {
                    jSONObject.put("stat", mapH.get("stat"));
                }
                if (mapH.containsKey("uptime")) {
                    jSONObject.put("uptime", mapH.get("uptime"));
                }
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Error while constructing process info", e);
            }
        }
        lVar.a(jSONObject);
    }

    @WebViewExposed
    public static void getProduct(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.I());
    }

    @WebViewExposed
    public static void getRingerMode(l lVar) {
        int iJ = com.unity3d.services.core.device.b.J();
        if (iJ > -1) {
            lVar.a(Integer.valueOf(iJ));
            return;
        }
        if (iJ == -2) {
            lVar.a(c.AUDIOMANAGER_NULL, Integer.valueOf(iJ));
        } else {
            if (iJ == -1) {
                lVar.a(c.APPLICATION_CONTEXT_NULL, Integer.valueOf(iJ));
                return;
            }
            com.unity3d.services.core.log.a.c("Unhandled ringerMode error: " + iJ);
        }
    }

    @WebViewExposed
    public static void getScreenBrightness(l lVar) {
        int iK = com.unity3d.services.core.device.b.K();
        if (iK > -1) {
            lVar.a(Integer.valueOf(iK));
        } else {
            if (iK == -1) {
                lVar.a(c.APPLICATION_CONTEXT_NULL, Integer.valueOf(iK));
                return;
            }
            com.unity3d.services.core.log.a.c("Unhandled screenBrightness error: " + iK);
        }
    }

    @WebViewExposed
    public static void getScreenDensity(l lVar) {
        lVar.a(Integer.valueOf(com.unity3d.services.core.device.b.L()));
    }

    @WebViewExposed
    public static void getScreenHeight(l lVar) {
        lVar.a(Integer.valueOf(com.unity3d.services.core.device.b.M()));
    }

    @WebViewExposed
    public static void getScreenLayout(l lVar) {
        lVar.a(Integer.valueOf(com.unity3d.services.core.device.b.N()));
    }

    @WebViewExposed
    public static void getScreenWidth(l lVar) {
        lVar.a(Integer.valueOf(com.unity3d.services.core.device.b.O()));
    }

    @WebViewExposed
    public static void getSensorList(l lVar) {
        JSONArray jSONArray = new JSONArray();
        List<Sensor> listP = com.unity3d.services.core.device.b.P();
        if (listP != null) {
            for (Sensor sensor : listP) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", sensor.getName());
                    jSONObject.put("type", sensor.getType());
                    jSONObject.put("vendor", sensor.getVendor());
                    jSONObject.put("maximumRange", sensor.getMaximumRange());
                    jSONObject.put("power", sensor.getPower());
                    jSONObject.put(MediationMetaData.KEY_VERSION, sensor.getVersion());
                    jSONObject.put("resolution", sensor.getResolution());
                    jSONObject.put("minDelay", sensor.getMinDelay());
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    lVar.a(c.JSON_ERROR, e.getMessage());
                    return;
                }
            }
        }
        lVar.a(jSONArray);
    }

    @WebViewExposed
    public static void getSupportedAbis(l lVar) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = com.unity3d.services.core.device.b.Q().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        lVar.a(jSONArray);
    }

    @WebViewExposed
    public static void getSystemLanguage(l lVar) {
        lVar.a(Locale.getDefault().toString());
    }

    @WebViewExposed
    public static void getSystemProperty(String str, String str2, l lVar) {
        lVar.a(com.unity3d.services.core.device.b.a(str, str2));
    }

    @WebViewExposed
    public static void getTimeZone(Boolean bool, l lVar) {
        lVar.a(TimeZone.getDefault().getDisplayName(bool.booleanValue(), 0, Locale.US));
    }

    @WebViewExposed
    public static void getTimeZoneOffset(l lVar) {
        lVar.a(Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000));
    }

    @WebViewExposed
    public static void getTotalMemory(l lVar) {
        lVar.a(Long.valueOf(com.unity3d.services.core.device.b.R()));
    }

    @WebViewExposed
    public static void getTotalSpace(String str, l lVar) {
        StorageType storageTypeA = a(str);
        if (storageTypeA == null) {
            lVar.a(c.INVALID_STORAGETYPE, str);
            return;
        }
        long jB = com.unity3d.services.core.device.b.b(a(storageTypeA));
        if (jB > -1) {
            lVar.a(Long.valueOf(jB));
        } else {
            lVar.a(c.COULDNT_GET_STORAGE_LOCATION, Long.valueOf(jB));
        }
    }

    @WebViewExposed
    public static void getUniqueEventId(l lVar) {
        lVar.a(com.unity3d.services.core.device.b.S());
    }

    @WebViewExposed
    public static void getUptime(l lVar) {
        lVar.a(Long.valueOf(com.unity3d.services.core.device.b.T()));
    }

    @WebViewExposed
    public static void isAdbEnabled(l lVar) {
        Boolean boolV = com.unity3d.services.core.device.b.V();
        if (boolV != null) {
            lVar.a(boolV);
        } else {
            lVar.a(c.COULDNT_GET_ADB_STATUS, new Object[0]);
        }
    }

    @WebViewExposed
    public static void isRooted(l lVar) {
        lVar.a(Boolean.valueOf(com.unity3d.services.core.device.b.Y()));
    }

    @WebViewExposed
    public static void isUSBConnected(l lVar) {
        lVar.a(Boolean.valueOf(com.unity3d.services.core.device.b.Z()));
    }

    @WebViewExposed
    public static void registerVolumeChangeListener(Integer num, l lVar) {
        if (a == null) {
            a = new SparseArray<>();
        }
        if (a.get(num.intValue()) == null) {
            a aVar = new a(num);
            a.append(num.intValue(), aVar);
            k.a(aVar);
        }
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void unregisterVolumeChangeListener(Integer num, l lVar) {
        SparseArray<d> sparseArray = a;
        if (sparseArray != null && sparseArray.get(num.intValue()) != null) {
            k.b(a.get(num.intValue()));
            a.remove(num.intValue());
        }
        lVar.a(new Object[0]);
    }

    private static File a(StorageType storageType) {
        int i = b.a[storageType.ordinal()];
        if (i == 1) {
            return com.unity3d.services.core.properties.a.e().getCacheDir();
        }
        if (i != 2) {
            com.unity3d.services.core.log.a.c("Unhandled storagetype: " + storageType);
            return null;
        }
        return com.unity3d.services.core.properties.a.e().getExternalCacheDir();
    }
}
