package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzail implements zzajz {
    private final List zza;

    public zzail() {
        this(0);
    }

    public zzail(int i, List list) {
        this.zza = list;
    }

    private final zzajp zzb(zzajy zzajyVar) {
        return new zzajp(zzd(zzajyVar));
    }

    private final zzakd zzc(zzajy zzajyVar) {
        return new zzakd(zzd(zzajyVar));
    }

    private final List zzd(zzajy zzajyVar) {
        String str;
        int i;
        List listSingletonList;
        zzfb zzfbVar = new zzfb(zzajyVar.zzd);
        List arrayList = this.zza;
        while (zzfbVar.zza() > 0) {
            int iZzl = zzfbVar.zzl();
            int iZzc = zzfbVar.zzc() + zzfbVar.zzl();
            if (iZzl == 134) {
                arrayList = new ArrayList();
                int iZzl2 = zzfbVar.zzl() & 31;
                for (int i2 = 0; i2 < iZzl2; i2++) {
                    String strZzy = zzfbVar.zzy(3, zzfqu.zzc);
                    int iZzl3 = zzfbVar.zzl();
                    boolean z = (iZzl3 & 128) != 0;
                    if (z) {
                        i = iZzl3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZzl = (byte) zzfbVar.zzl();
                    zzfbVar.zzH(1);
                    if (z) {
                        int i3 = bZzl & SignedBytes.MAX_POWER_OF_TWO;
                        int i4 = zzea.zza;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzak zzakVar = new zzak();
                    zzakVar.zzS(str);
                    zzakVar.zzK(strZzy);
                    zzakVar.zzu(i);
                    zzakVar.zzI(listSingletonList);
                    arrayList.add(zzakVar.zzY());
                }
            }
            zzfbVar.zzG(iZzc);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final zzakb zza(int i, zzajy zzajyVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzajf(new zzajc(zzajyVar.zzb));
            }
            if (i == 21) {
                return new zzajf(new zzaja());
            }
            if (i == 27) {
                return new zzajf(new zzaix(zzb(zzajyVar), false, false));
            }
            if (i == 36) {
                return new zzajf(new zzaiz(zzb(zzajyVar)));
            }
            if (i == 89) {
                return new zzajf(new zzain(zzajyVar.zzc));
            }
            if (i == 138) {
                return new zzajf(new zzaim(zzajyVar.zzb));
            }
            if (i == 172) {
                return new zzajf(new zzaih(zzajyVar.zzb));
            }
            if (i == 257) {
                return new zzajo(new zzaje("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new zzajo(new zzaje("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new zzajf(new zzaik(false, zzajyVar.zzb));
                            case 16:
                                return new zzajf(new zzait(zzc(zzajyVar)));
                            case 17:
                                return new zzajf(new zzajb(zzajyVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzajf(new zzaie(zzajyVar.zzb));
            }
        }
        return new zzajf(new zzaiq(zzc(zzajyVar)));
    }

    public zzail(int i) {
        this.zza = zzfud.zzl();
    }
}
