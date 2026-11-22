package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaaw implements zzabi {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final zzaav zzc = new zzaav(new zzaau() { // from class: com.google.android.gms.internal.ads.zzaas
        @Override // com.google.android.gms.internal.ads.zzaau
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzabb.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzaav zzd = new zzaav(new zzaau() { // from class: com.google.android.gms.internal.ads.zzaat
        @Override // com.google.android.gms.internal.ads.zzaau
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzabb.class).getConstructor(new Class[0]);
        }
    });
    private zzfud zze;
    private final zzaib zzf = new zzaib();

    /* JADX WARN: Code duplicated, block: B:118:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzabi
    public final synchronized zzabb[] zza(Uri uri, Map map) {
        byte b;
        byte b2;
        int i;
        zzabb[] zzabbVarArr;
        ArrayList arrayList = new ArrayList(16);
        List list = (List) map.get(HttpHeaders.CONTENT_TYPE);
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        }
        int i2 = 2;
        if (str != null) {
            int i3 = zzcc.zza;
            int iHashCode = str.hashCode();
            if (iHashCode != -1007807498) {
                if (iHashCode != -586683234) {
                    if (iHashCode == 187090231 && str.equals("audio/mp3")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("audio/x-wav")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("audio/x-flac")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                str = "audio/flac";
            } else if (b == 1) {
                str = "audio/mpeg";
            } else if (b == 2) {
                str = "audio/wav";
            }
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1662384011:
                    if (str.equals("video/mp2p")) {
                        b2 = Ascii.DC4;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1662384007:
                    if (str.equals("video/mp2t")) {
                        b2 = Ascii.NAK;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1662095187:
                    if (str.equals("video/webm")) {
                        b2 = Ascii.FF;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1606874997:
                    if (str.equals("audio/amr-wb")) {
                        b2 = 6;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1487394660:
                    if (str.equals("image/jpeg")) {
                        b2 = Ascii.CAN;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1248337486:
                    if (str.equals("application/mp4")) {
                        b2 = Ascii.DC2;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1079884372:
                    if (str.equals("video/x-msvideo")) {
                        b2 = Ascii.EM;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        b2 = Ascii.ETB;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -387023398:
                    if (str.equals("audio/x-matroska")) {
                        b2 = Ascii.VT;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -43467528:
                    if (str.equals("application/webm")) {
                        b2 = Ascii.SO;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 13915911:
                    if (str.equals("video/x-flv")) {
                        b2 = 8;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 187078669:
                    if (str.equals("audio/amr")) {
                        b2 = 4;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 187090232:
                    if (str.equals("audio/mp4")) {
                        b2 = 17;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 187091926:
                    if (str.equals("audio/ogg")) {
                        b2 = 19;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 187099443:
                    if (str.equals("audio/wav")) {
                        b2 = Ascii.SYN;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1331848029:
                    if (str.equals("video/mp4")) {
                        b2 = Ascii.DLE;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1503095341:
                    if (str.equals("audio/3gpp")) {
                        b2 = 5;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1504619009:
                    if (str.equals("audio/flac")) {
                        b2 = 7;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1504824762:
                    if (str.equals("audio/midi")) {
                        b2 = 9;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1504831518:
                    if (str.equals("audio/mpeg")) {
                        b2 = Ascii.SI;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1505118770:
                    if (str.equals("audio/webm")) {
                        b2 = Ascii.CR;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 2039520277:
                    if (str.equals("video/x-matroska")) {
                        b2 = 10;
                    } else {
                        b2 = -1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 1:
                case 2:
                    i = 0;
                    break;
                case 3:
                    i = 1;
                    break;
                case 4:
                case 5:
                case 6:
                    i = 3;
                    break;
                case 7:
                    i = 4;
                    break;
                case 8:
                    i = 5;
                    break;
                case 9:
                    i = 15;
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    i = 6;
                    break;
                case 15:
                    i = 7;
                    break;
                case 16:
                case 17:
                case 18:
                    i = 8;
                    break;
                case 19:
                    i = 9;
                    break;
                case 20:
                    i = 10;
                    break;
                case 21:
                    i = 11;
                    break;
                case 22:
                    i = 12;
                    break;
                case 23:
                    i = 13;
                    break;
                case 24:
                    i = 14;
                    break;
                case 25:
                    i = 16;
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            zzb(i, arrayList);
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            i2 = -1;
        } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            i2 = 0;
        } else if (lastPathSegment.endsWith(".ac4")) {
            i2 = 1;
        } else if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
            if (lastPathSegment.endsWith(".amr")) {
                i2 = 3;
            } else if (lastPathSegment.endsWith(".flac")) {
                i2 = 4;
            } else if (lastPathSegment.endsWith(".flv")) {
                i2 = 5;
            } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                i2 = 15;
            } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                i2 = 6;
            } else if (lastPathSegment.endsWith(".mp3")) {
                i2 = 7;
            } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                i2 = 8;
            } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                i2 = 9;
            } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                i2 = 10;
            } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                i2 = 11;
            } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                i2 = 12;
            } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                i2 = 13;
            } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                i2 = 14;
            } else if (lastPathSegment.endsWith(".avi")) {
                i2 = 16;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1 && i2 != i) {
            zzb(i2, arrayList);
        }
        int[] iArr = zza;
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = iArr[i4];
            if (i5 != i && i5 != i2) {
                zzb(i5, arrayList);
            }
        }
        zzabbVarArr = new zzabb[arrayList.size()];
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            zzabbVarArr[i6] = (zzabb) arrayList.get(i6);
        }
        return zzabbVarArr;
    }

    private final void zzb(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzaid());
                break;
            case 1:
                list.add(new zzaig());
                break;
            case 2:
                list.add(new zzaij(0));
                break;
            case 3:
                list.add(new zzacm(0));
                break;
            case 4:
                zzabb zzabbVarZza = zzc.zza(0);
                if (zzabbVarZza == null) {
                    list.add(new zzadd(0));
                } else {
                    list.add(zzabbVarZza);
                }
                break;
            case 5:
                list.add(new zzadg());
                break;
            case 6:
                list.add(new zzafu(0));
                break;
            case 7:
                list.add(new zzagc(0));
                break;
            case 8:
                list.add(new zzagx(0, null));
                list.add(new zzahc(0));
                break;
            case 9:
                list.add(new zzahq());
                break;
            case 10:
                list.add(new zzajm());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfud.zzl();
                }
                list.add(new zzajw(1, new zzfi(0L), new zzail(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaki());
                break;
            case 14:
                list.add(new zzadl());
                break;
            case 15:
                zzabb zzabbVarZza2 = zzd.zza(new Object[0]);
                if (zzabbVarZza2 != null) {
                    list.add(zzabbVarZza2);
                }
                break;
            case 16:
                list.add(new zzacr());
                break;
        }
    }
}
