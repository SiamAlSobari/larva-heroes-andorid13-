package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfbe {
    public final String zzA;
    public final zzbwy zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfcd zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbsi zzae;
    public final com.google.android.gms.ads.internal.client.zzs zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final String zzaq;
    public final boolean zzar;
    public final int zzas;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzbvp zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzfbk zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Code duplicated, block: B:228:0x0601 A[PHI: r24 r77
  0x0601: PHI (r24v78 java.util.List) = 
  (r24v5 java.util.List)
  (r24v6 java.util.List)
  (r24v7 java.util.List)
  (r24v8 java.util.List)
  (r24v9 java.util.List)
  (r24v10 java.util.List)
  (r24v11 java.util.List)
  (r24v12 java.util.List)
  (r24v13 java.util.List)
  (r24v14 java.util.List)
  (r24v15 java.util.List)
  (r24v16 java.util.List)
  (r24v17 java.util.List)
  (r24v18 java.util.List)
  (r24v19 java.util.List)
  (r24v20 java.util.List)
  (r24v21 java.util.List)
  (r24v22 java.util.List)
  (r24v23 java.util.List)
  (r24v24 java.util.List)
  (r24v25 java.util.List)
  (r24v26 java.util.List)
  (r24v27 java.util.List)
  (r24v28 java.util.List)
  (r24v29 java.util.List)
  (r24v30 java.util.List)
  (r24v31 java.util.List)
  (r24v32 java.util.List)
  (r24v33 java.util.List)
  (r24v34 java.util.List)
  (r24v35 java.util.List)
  (r24v36 java.util.List)
  (r24v37 java.util.List)
  (r24v38 java.util.List)
  (r24v39 java.util.List)
  (r24v40 java.util.List)
  (r24v41 java.util.List)
  (r24v42 java.util.List)
  (r24v43 java.util.List)
  (r24v44 java.util.List)
  (r24v45 java.util.List)
  (r24v46 java.util.List)
  (r24v47 java.util.List)
  (r24v48 java.util.List)
  (r24v49 java.util.List)
  (r24v50 java.util.List)
  (r24v51 java.util.List)
  (r24v52 java.util.List)
  (r24v53 java.util.List)
  (r24v54 java.util.List)
  (r24v55 java.util.List)
  (r24v56 java.util.List)
  (r24v57 java.util.List)
  (r24v58 java.util.List)
  (r24v59 java.util.List)
  (r24v60 java.util.List)
  (r24v61 java.util.List)
  (r24v62 java.util.List)
  (r24v63 java.util.List)
  (r24v64 java.util.List)
  (r24v65 java.util.List)
  (r24v66 java.util.List)
  (r24v67 java.util.List)
  (r24v68 java.util.List)
  (r24v69 java.util.List)
  (r24v70 java.util.List)
  (r24v71 java.util.List)
  (r24v72 java.util.List)
  (r24v73 java.util.List)
  (r24v74 java.util.List)
  (r24v75 java.util.List)
  (r24v76 java.util.List)
  (r24v79 java.util.List)
 binds: [B:226:0x05fc, B:223:0x05eb, B:220:0x05da, B:217:0x05c9, B:214:0x05b8, B:211:0x05a7, B:208:0x0595, B:205:0x0583, B:202:0x0571, B:199:0x055f, B:196:0x054d, B:193:0x053b, B:190:0x0529, B:187:0x0517, B:184:0x0505, B:181:0x04f3, B:178:0x04e1, B:175:0x04cf, B:172:0x04bd, B:169:0x04ab, B:166:0x0499, B:163:0x0487, B:160:0x0475, B:157:0x0464, B:154:0x0452, B:151:0x0440, B:148:0x042e, B:145:0x041c, B:142:0x040a, B:139:0x03f8, B:136:0x03e6, B:133:0x03d5, B:130:0x03c3, B:127:0x03b2, B:124:0x03a0, B:121:0x038e, B:118:0x037c, B:115:0x036a, B:112:0x0358, B:109:0x0346, B:106:0x0334, B:103:0x0322, B:100:0x0310, B:97:0x02fe, B:94:0x02ec, B:91:0x02da, B:88:0x02c8, B:85:0x02b6, B:82:0x02a4, B:79:0x0292, B:76:0x0281, B:73:0x026f, B:70:0x025d, B:67:0x024b, B:64:0x0239, B:61:0x0227, B:58:0x0216, B:55:0x0204, B:52:0x01f2, B:49:0x01e0, B:46:0x01ce, B:43:0x01bc, B:40:0x01aa, B:37:0x0198, B:34:0x0187, B:31:0x0175, B:28:0x0164, B:25:0x0152, B:22:0x0141, B:19:0x012f, B:16:0x011d, B:13:0x010b, B:11:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x0601: PHI (r77v74 java.util.List) = 
  (r77v1 java.util.List)
  (r77v2 java.util.List)
  (r77v3 java.util.List)
  (r77v4 java.util.List)
  (r77v5 java.util.List)
  (r77v6 java.util.List)
  (r77v7 java.util.List)
  (r77v8 java.util.List)
  (r77v9 java.util.List)
  (r77v10 java.util.List)
  (r77v11 java.util.List)
  (r77v12 java.util.List)
  (r77v13 java.util.List)
  (r77v14 java.util.List)
  (r77v15 java.util.List)
  (r77v16 java.util.List)
  (r77v17 java.util.List)
  (r77v18 java.util.List)
  (r77v19 java.util.List)
  (r77v20 java.util.List)
  (r77v21 java.util.List)
  (r77v22 java.util.List)
  (r77v23 java.util.List)
  (r77v24 java.util.List)
  (r77v25 java.util.List)
  (r77v26 java.util.List)
  (r77v27 java.util.List)
  (r77v28 java.util.List)
  (r77v29 java.util.List)
  (r77v30 java.util.List)
  (r77v31 java.util.List)
  (r77v32 java.util.List)
  (r77v33 java.util.List)
  (r77v34 java.util.List)
  (r77v35 java.util.List)
  (r77v36 java.util.List)
  (r77v37 java.util.List)
  (r77v38 java.util.List)
  (r77v39 java.util.List)
  (r77v40 java.util.List)
  (r77v41 java.util.List)
  (r77v42 java.util.List)
  (r77v43 java.util.List)
  (r77v44 java.util.List)
  (r77v45 java.util.List)
  (r77v46 java.util.List)
  (r77v47 java.util.List)
  (r77v48 java.util.List)
  (r77v49 java.util.List)
  (r77v50 java.util.List)
  (r77v51 java.util.List)
  (r77v52 java.util.List)
  (r77v53 java.util.List)
  (r77v54 java.util.List)
  (r77v55 java.util.List)
  (r77v56 java.util.List)
  (r77v57 java.util.List)
  (r77v58 java.util.List)
  (r77v59 java.util.List)
  (r77v60 java.util.List)
  (r77v61 java.util.List)
  (r77v62 java.util.List)
  (r77v63 java.util.List)
  (r77v64 java.util.List)
  (r77v65 java.util.List)
  (r77v66 java.util.List)
  (r77v67 java.util.List)
  (r77v68 java.util.List)
  (r77v69 java.util.List)
  (r77v70 java.util.List)
  (r77v71 java.util.List)
  (r77v72 java.util.List)
  (r77v75 java.util.List)
 binds: [B:226:0x05fc, B:223:0x05eb, B:220:0x05da, B:217:0x05c9, B:214:0x05b8, B:211:0x05a7, B:208:0x0595, B:205:0x0583, B:202:0x0571, B:199:0x055f, B:196:0x054d, B:193:0x053b, B:190:0x0529, B:187:0x0517, B:184:0x0505, B:181:0x04f3, B:178:0x04e1, B:175:0x04cf, B:172:0x04bd, B:169:0x04ab, B:166:0x0499, B:163:0x0487, B:160:0x0475, B:157:0x0464, B:154:0x0452, B:151:0x0440, B:148:0x042e, B:145:0x041c, B:142:0x040a, B:139:0x03f8, B:136:0x03e6, B:133:0x03d5, B:130:0x03c3, B:127:0x03b2, B:124:0x03a0, B:121:0x038e, B:118:0x037c, B:115:0x036a, B:112:0x0358, B:109:0x0346, B:106:0x0334, B:103:0x0322, B:100:0x0310, B:97:0x02fe, B:94:0x02ec, B:91:0x02da, B:88:0x02c8, B:85:0x02b6, B:82:0x02a4, B:79:0x0292, B:76:0x0281, B:73:0x026f, B:70:0x025d, B:67:0x024b, B:64:0x0239, B:61:0x0227, B:58:0x0216, B:55:0x0204, B:52:0x01f2, B:49:0x01e0, B:46:0x01ce, B:43:0x01bc, B:40:0x01aa, B:37:0x0198, B:34:0x0187, B:31:0x0175, B:28:0x0164, B:25:0x0152, B:22:0x0141, B:19:0x012f, B:16:0x011d, B:13:0x010b, B:11:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    zzfbe(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List list;
        List list2;
        byte b;
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        List listEmptyList4 = Collections.emptyList();
        List listEmptyList5 = Collections.emptyList();
        List listEmptyList6 = Collections.emptyList();
        List listEmptyList7 = Collections.emptyList();
        List listEmptyList8 = Collections.emptyList();
        List listEmptyList9 = Collections.emptyList();
        List listEmptyList10 = Collections.emptyList();
        List listEmptyList11 = Collections.emptyList();
        List listEmptyList12 = Collections.emptyList();
        List listEmptyList13 = Collections.emptyList();
        List listEmptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfud zzfudVarZzl = zzfud.zzl();
        jsonReader.beginObject();
        JSONObject jSONObjectZzh = jSONObject2;
        JSONObject jSONObjectZzh2 = jSONObject3;
        JSONObject jSONObjectZzh3 = jSONObject4;
        JSONObject jSONObjectZzh4 = jSONObject5;
        JSONObject jSONObjectZzh5 = jSONObject6;
        List listZzd = zzfudVarZzl;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String string = strNextString3;
        String strNextString4 = string;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        zzfbk zzfbkVar = null;
        zzbwy zzbwyVarZza = null;
        zzbsi zzbsiVarZza = null;
        com.google.android.gms.ads.internal.client.zzs zzsVarZza = null;
        String strNextString17 = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int iZzd = -1;
        int iNextInt2 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt3 = 0;
        int iNextInt4 = -1;
        boolean zNextBoolean11 = false;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        int iNextInt5 = 0;
        List listZzd2 = listEmptyList11;
        List listZza = listEmptyList12;
        List listZzd3 = listEmptyList13;
        List listZza2 = listEmptyList14;
        JSONObject jSONObjectZzh6 = jSONObject;
        String strNextString18 = strNextString16;
        String strNextString19 = strNextString18;
        zzbvp zzbvpVarZza = null;
        int iZzb = 0;
        int iZzc = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_instance_name")) {
                        b = -1;
                    } else {
                        b = 59;
                    }
                    break;
                case -1980587809:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("debug_signals")) {
                        b = -1;
                    } else {
                        b = Ascii.FS;
                    }
                    break;
                case -1965512151:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("omid_settings")) {
                        b = -1;
                    } else {
                        b = 41;
                    }
                    break;
                case -1871425831:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("recursive_server_response_data")) {
                        b = -1;
                    } else {
                        b = 69;
                    }
                    break;
                case -1843156475:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_consent")) {
                        b = -1;
                    } else {
                        b = 70;
                    }
                    break;
                case -1812055556:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("play_prewarm_options")) {
                        b = -1;
                    } else {
                        b = 49;
                    }
                    break;
                case -1776946669:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_name")) {
                        b = -1;
                    } else {
                        b = 57;
                    }
                    break;
                case -1662989631:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_interscroller")) {
                        b = -1;
                    } else {
                        b = 53;
                    }
                    break;
                case -1620470467:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("backend_query_id")) {
                        b = -1;
                    } else {
                        b = 47;
                    }
                    break;
                case -1550155393:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("nofill_urls")) {
                        b = -1;
                    } else {
                        b = Ascii.CR;
                    }
                    break;
                case -1440104884:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_custom_close_blocked")) {
                        b = -1;
                    } else {
                        b = 35;
                    }
                    break;
                case -1439500848:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("orientation")) {
                        b = -1;
                    } else {
                        b = 37;
                    }
                    break;
                case -1428969291:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("enable_omid")) {
                        b = -1;
                    } else {
                        b = 39;
                    }
                    break;
                case -1406227629:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("buffer_click_url_as_ready_to_ping")) {
                        b = -1;
                    } else {
                        b = 67;
                    }
                    break;
                case -1403779768:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("showable_impression_type")) {
                        b = -1;
                    } else {
                        b = 44;
                    }
                    break;
                case -1375413093:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_cover")) {
                        b = -1;
                    } else {
                        b = 54;
                    }
                    break;
                case -1360811658:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_sizes")) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case -1306015996:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("adapters")) {
                        b = -1;
                    } else {
                        b = Ascii.DC4;
                    }
                    break;
                case -1303332046:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("test_mode_enabled")) {
                        b = -1;
                    } else {
                        b = 34;
                    }
                    break;
                case -1289032093:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("extras")) {
                        b = -1;
                    } else {
                        b = Ascii.GS;
                    }
                    break;
                case -1240082064:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_event_value")) {
                        b = -1;
                    } else {
                        b = 51;
                    }
                    break;
                case -1234181075:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allow_pub_rendered_attribution")) {
                        b = -1;
                    } else {
                        b = Ascii.RS;
                    }
                    break;
                case -1168140544:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("presentation_error_urls")) {
                        b = -1;
                    } else {
                        b = Ascii.SO;
                    }
                    break;
                case -1152230954:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_type")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1146534047:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_scroll_aware")) {
                        b = -1;
                    } else {
                        b = 43;
                    }
                    break;
                case -1115838944:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("fill_urls")) {
                        b = -1;
                    } else {
                        b = Ascii.FF;
                    }
                    break;
                case -1081936678:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allocation_id")) {
                        b = -1;
                    } else {
                        b = Ascii.NAK;
                    }
                    break;
                case -1078050970:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("video_complete_urls")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case -1051269058:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("active_view")) {
                        b = -1;
                    } else {
                        b = Ascii.EM;
                    }
                    break;
                case -982608540:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("valid_from_timestamp")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case -972056451:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_instance_id")) {
                        b = -1;
                    } else {
                        b = 60;
                    }
                    break;
                case -776859333:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("click_urls")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -544216775:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("safe_browsing")) {
                        b = -1;
                    } else {
                        b = Ascii.SUB;
                    }
                    break;
                case -437057161:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("imp_urls")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -404433734:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("rtb_native_required_assets")) {
                        b = -1;
                    } else {
                        b = 62;
                    }
                    break;
                case -404326515:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("render_timeout_ms")) {
                        b = -1;
                    } else {
                        b = 38;
                    }
                    break;
                case -397704715:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_close_time_ms")) {
                        b = -1;
                    } else {
                        b = 45;
                    }
                    break;
                case -388807511:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("content_url")) {
                        b = -1;
                    } else {
                        b = SignedBytes.MAX_POWER_OF_TWO;
                    }
                    break;
                case -369773488:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_close_button_enabled")) {
                        b = -1;
                    } else {
                        b = 50;
                    }
                    break;
                case -213449460:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("force_disable_hardware_acceleration")) {
                        b = -1;
                    } else {
                        b = 65;
                    }
                    break;
                case -213424028:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("watermark")) {
                        b = -1;
                    } else {
                        b = 46;
                    }
                    break;
                case -180214626:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("native_required_asset_viewability")) {
                        b = -1;
                    } else {
                        b = 63;
                    }
                    break;
                case -154616268:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_offline_ad")) {
                        b = -1;
                    } else {
                        b = Base64.padSymbol;
                    }
                    break;
                case -29338502:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allow_custom_click_gesture")) {
                        b = -1;
                    } else {
                        b = 32;
                    }
                    break;
                case 3107:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad")) {
                        b = -1;
                    } else {
                        b = Ascii.DC2;
                    }
                    break;
                case 3355:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("id")) {
                        b = -1;
                    } else {
                        b = Ascii.ETB;
                    }
                    break;
                case 3076010:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                        b = -1;
                    } else {
                        b = Ascii.SYN;
                    }
                    break;
                case 37109963:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("request_id")) {
                        b = -1;
                    } else {
                        b = 68;
                    }
                    break;
                case 63195984:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("render_test_label")) {
                        b = -1;
                    } else {
                        b = 33;
                    }
                    break;
                case 107433883:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("qdata")) {
                        b = -1;
                    } else {
                        b = Ascii.CAN;
                    }
                    break;
                case 230323073:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_load_urls")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 418392395:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_closable_area_disabled")) {
                        b = -1;
                    } else {
                        b = 36;
                    }
                    break;
                case 542250332:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("consent_form_action_identifier")) {
                        b = -1;
                    } else {
                        b = 71;
                    }
                    break;
                case 549176928:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("presentation_error_timeout_ms")) {
                        b = -1;
                    } else {
                        b = Ascii.DLE;
                    }
                    break;
                case 597473788:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("debug_dialog_string")) {
                        b = -1;
                    } else {
                        b = Ascii.ESC;
                    }
                    break;
                case 754887508:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("container_sizes")) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 791122864:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("impression_type")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 1010584092:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals(FirebaseAnalytics.Param.TRANSACTION_ID)) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1100650276:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("rewards")) {
                        b = -1;
                    } else {
                        b = Ascii.VT;
                    }
                    break;
                case 1141602460:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("adapter_response_info_key")) {
                        b = -1;
                    } else {
                        b = 56;
                    }
                    break;
                case 1186014765:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("cache_hit_urls")) {
                        b = -1;
                    } else {
                        b = 66;
                    }
                    break;
                case 1321720943:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("allow_pub_owned_ad_view")) {
                        b = -1;
                    } else {
                        b = Ascii.US;
                    }
                    break;
                case 1437255331:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_source_id")) {
                        b = -1;
                    } else {
                        b = 58;
                    }
                    break;
                case 1637553475:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("bid_response")) {
                        b = -1;
                    } else {
                        b = 40;
                    }
                    break;
                case 1638957285:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("video_start_urls")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 1686319423:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("ad_network_class_name")) {
                        b = -1;
                    } else {
                        b = 55;
                    }
                    break;
                case 1688341040:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("video_reward_urls")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1799285870:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("use_third_party_container_height")) {
                        b = -1;
                    } else {
                        b = 48;
                    }
                    break;
                case 1839650832:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("renderers")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 1875425491:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("is_analytics_logging_enabled")) {
                        b = -1;
                    } else {
                        b = 42;
                    }
                    break;
                case 2068142375:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    if (!str.equals("rule_line_external_id")) {
                        b = -1;
                    } else {
                        b = 52;
                    }
                    break;
                case 2072888499:
                    list2 = listEmptyList10;
                    list = listEmptyList9;
                    if (!str.equals("manual_tracking_urls")) {
                        b = -1;
                    } else {
                        b = Ascii.SI;
                    }
                    break;
                default:
                    list = listEmptyList9;
                    list2 = listEmptyList10;
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    listEmptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 1:
                    iZzb = zzb(jsonReader.nextString());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 2:
                    listEmptyList2 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 3:
                    listEmptyList3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 4:
                    listEmptyList4 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 5:
                    iZzc = zzc(jsonReader.nextInt());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 6:
                    listEmptyList5 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 7:
                    listEmptyList6 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 8:
                    listEmptyList7 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 9:
                    strNextString19 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 10:
                    strNextString18 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 11:
                    zzbvpVarZza = zzbvp.zza(com.google.android.gms.ads.internal.util.zzbu.zze(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 12:
                    listEmptyList8 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 13:
                    listEmptyList9 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    break;
                case 14:
                    listEmptyList10 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 15:
                    listZzd2 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 16:
                    iNextInt = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 17:
                    listZza = zzfbf.zza(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 18:
                    zzfbkVar = new zzfbk(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 19:
                    listZza2 = zzfbf.zza(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 20:
                    listZzd3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 21:
                    strNextString = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 22:
                    jSONObjectZzh6 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 23:
                    strNextString2 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 24:
                    strNextString3 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 25:
                    string = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader).toString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 26:
                    zzbwyVarZza = zzbwy.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 27:
                    strNextString4 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 28:
                    jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 29:
                    jSONObjectZzh2 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 30:
                    zNextBoolean = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 31:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 32:
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 33:
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 34:
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 35:
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 36:
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 37:
                    iZzd = zzd(jsonReader.nextString());
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 38:
                    iNextInt2 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 39:
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 40:
                    strNextString5 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 41:
                    jSONObjectZzh3 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 42:
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 43:
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 44:
                    iNextInt3 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 45:
                    iNextInt4 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 46:
                    strNextString6 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 47:
                    strNextString7 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 48:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 49:
                    zzbsiVarZza = zzbsi.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 50:
                    jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 51:
                    zzsVarZza = com.google.android.gms.ads.internal.client.zzs.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 52:
                    strNextString8 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 53:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 54:
                    jSONObjectZzh4 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 55:
                    strNextString9 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 56:
                    strNextString16 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 57:
                    if (((Boolean) zzbbr.zzgG.zzl()).booleanValue()) {
                        strNextString10 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 58:
                    if (((Boolean) zzbbr.zzgG.zzl()).booleanValue()) {
                        strNextString11 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 59:
                    if (((Boolean) zzbbr.zzgG.zzl()).booleanValue()) {
                        strNextString12 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 60:
                    if (((Boolean) zzbbr.zzgG.zzl()).booleanValue()) {
                        strNextString13 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 61:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 62:
                    jSONObjectZzh5 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 63:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 64:
                    strNextString17 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 65:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 66:
                    listZzd = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 67:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 68:
                    strNextString14 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 69:
                    strNextString15 = jsonReader.nextString();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 70:
                    zNextBoolean17 = jsonReader.nextBoolean();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                case 71:
                    iNextInt5 = jsonReader.nextInt();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    listEmptyList10 = list2;
                    listEmptyList9 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = listEmptyList;
        this.zzb = iZzb;
        this.zzc = listEmptyList2;
        this.zzd = listEmptyList3;
        this.zzg = listEmptyList4;
        this.zzf = iZzc;
        this.zzh = listEmptyList5;
        this.zzi = listEmptyList6;
        this.zzj = listEmptyList7;
        this.zzk = strNextString19;
        this.zzl = strNextString18;
        this.zzm = zzbvpVarZza;
        this.zzn = listEmptyList8;
        this.zzo = listEmptyList9;
        this.zzp = listEmptyList10;
        this.zzq = listZzd2;
        this.zzr = iNextInt;
        this.zzs = listZza;
        this.zzt = zzfbkVar;
        this.zzu = listZzd3;
        this.zzv = listZza2;
        this.zzx = strNextString;
        this.zzw = jSONObjectZzh6;
        this.zzy = strNextString2;
        this.zzz = strNextString3;
        this.zzA = string;
        this.zzB = zzbwyVarZza;
        this.zzC = strNextString4;
        this.zzD = jSONObjectZzh;
        this.zzE = jSONObjectZzh2;
        this.zzK = zNextBoolean;
        this.zzL = zNextBoolean2;
        this.zzM = zNextBoolean3;
        this.zzN = zNextBoolean4;
        this.zzO = zNextBoolean5;
        this.zzP = zNextBoolean6;
        this.zzQ = zNextBoolean7;
        this.zzR = iZzd;
        this.zzS = iNextInt2;
        this.zzU = zNextBoolean8;
        this.zzV = strNextString5;
        this.zzW = new zzfcd(jSONObjectZzh3);
        this.zzX = zNextBoolean9;
        this.zzY = zNextBoolean10;
        this.zzZ = iNextInt3;
        this.zzaa = strNextString6;
        this.zzab = iNextInt4;
        this.zzac = strNextString7;
        this.zzad = zNextBoolean11;
        this.zzae = zzbsiVarZza;
        this.zzaf = zzsVarZza;
        this.zzag = strNextString8;
        this.zzah = zNextBoolean12;
        this.zzai = jSONObjectZzh4;
        this.zzF = strNextString9;
        this.zzG = strNextString10;
        this.zzH = strNextString11;
        this.zzI = strNextString12;
        this.zzJ = strNextString13;
        this.zzaj = zNextBoolean13;
        this.zzak = jSONObjectZzh5;
        this.zzal = zNextBoolean14;
        this.zzam = strNextString17;
        this.zzan = zNextBoolean15;
        this.zze = listZzd;
        this.zzT = zNextBoolean16;
        this.zzao = strNextString14;
        this.zzap = strNextString15;
        this.zzaq = strNextString16;
        this.zzar = zNextBoolean17;
        this.zzas = iNextInt5;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i) {
        if (i == 0 || i == 1 || i == 3) {
            return i;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
