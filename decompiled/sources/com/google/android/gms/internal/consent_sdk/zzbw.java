package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbw {
    public String zza;
    public String zzb;
    public String zzc;
    public int zzf = 1;
    public List<String> zzd = Collections.emptyList();
    public List<zzbv> zze = Collections.emptyList();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f9  */
    public static zzbw zza(JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        byte b3;
        int i;
        zzbw zzbwVar = new zzbw();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            byte b4 = 0;
            int i2 = 5;
            switch (jsonReader.nextName()) {
                case "consent_signal":
                    b = 0;
                    break;
                case "error_message":
                    b = 3;
                    break;
                case "consent_form_base_url":
                    b = 2;
                    break;
                case "actions":
                    b = 5;
                    break;
                case "request_info_keys":
                    b = 4;
                    break;
                case "consent_form_payload":
                    b = 1;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                String strNextString = jsonReader.nextString();
                switch (strNextString.hashCode()) {
                    case -2058725357:
                        if (!strNextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                            b4 = -1;
                        } else {
                            b4 = 4;
                        }
                        break;
                    case -1969035850:
                        if (!strNextString.equals("CONSENT_SIGNAL_ERROR")) {
                            b4 = -1;
                        } else {
                            b4 = 6;
                        }
                        break;
                    case -1263695752:
                        if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                            b4 = -1;
                        }
                        break;
                    case -954325659:
                        if (!strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                            b4 = -1;
                        } else {
                            b4 = 2;
                        }
                        break;
                    case -918677260:
                        if (!strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                            b4 = -1;
                        } else {
                            b4 = 7;
                        }
                        break;
                    case 429411856:
                        if (!strNextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                            b4 = -1;
                        } else {
                            b4 = 3;
                        }
                        break;
                    case 467888915:
                        if (!strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                            b4 = -1;
                        } else {
                            b4 = 1;
                        }
                        break;
                    case 1725474845:
                        if (!strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                            b4 = -1;
                        } else {
                            b4 = 5;
                        }
                        break;
                    default:
                        b4 = -1;
                        break;
                }
                switch (b4) {
                    case 0:
                        i2 = 1;
                        zzbwVar.zzf = i2;
                        break;
                    case 1:
                        i2 = 2;
                        zzbwVar.zzf = i2;
                        break;
                    case 2:
                        i2 = 3;
                        zzbwVar.zzf = i2;
                        break;
                    case 3:
                        i2 = 4;
                        zzbwVar.zzf = i2;
                        break;
                    case 4:
                        zzbwVar.zzf = i2;
                        break;
                    case 5:
                        i2 = 6;
                        zzbwVar.zzf = i2;
                        break;
                    case 6:
                        i2 = 7;
                        zzbwVar.zzf = i2;
                        break;
                    case 7:
                        i2 = 8;
                        zzbwVar.zzf = i2;
                        break;
                    default:
                        String strValueOf = String.valueOf(strNextString);
                        throw new IOException(strValueOf.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strValueOf) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: "));
                }
            } else if (b == 1) {
                zzbwVar.zza = jsonReader.nextString();
            } else if (b == 2) {
                zzbwVar.zzb = jsonReader.nextString();
            } else if (b == 3) {
                zzbwVar.zzc = jsonReader.nextString();
            } else if (b == 4) {
                zzbwVar.zzd = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    zzbwVar.zzd.add(jsonReader.nextString());
                }
                jsonReader.endArray();
            } else if (b != 5) {
                jsonReader.skipValue();
            } else {
                zzbwVar.zze = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    zzbv zzbvVar = new zzbv();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        int iHashCode = strNextName.hashCode();
                        if (iHashCode != -2105551094) {
                            if (iHashCode == 1583758243 && strNextName.equals("action_type")) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                        } else if (strNextName.equals("args_json")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                        if (b2 == 0) {
                            String strNextString2 = jsonReader.nextString();
                            int iHashCode2 = strNextString2.hashCode();
                            if (iHashCode2 != 64208429) {
                                if (iHashCode2 != 82862015) {
                                    if (iHashCode2 == 1856333582 && strNextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                        b3 = 0;
                                    } else {
                                        b3 = -1;
                                    }
                                } else if (strNextString2.equals("WRITE")) {
                                    b3 = 1;
                                } else {
                                    b3 = -1;
                                }
                            } else if (strNextString2.equals("CLEAR")) {
                                b3 = 2;
                            } else {
                                b3 = -1;
                            }
                            if (b3 == 0) {
                                i = 1;
                            } else if (b3 == 1) {
                                i = 2;
                            } else {
                                if (b3 != 2) {
                                    String strValueOf2 = String.valueOf(strNextString2);
                                    throw new IOException(strValueOf2.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strValueOf2) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: "));
                                }
                                i = 3;
                            }
                            zzbvVar.zzb = i;
                        } else if (b2 != 1) {
                            jsonReader.skipValue();
                        } else {
                            zzbvVar.zza = jsonReader.nextString();
                        }
                    }
                    jsonReader.endObject();
                    zzbwVar.zze.add(zzbvVar);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return zzbwVar;
    }
}
