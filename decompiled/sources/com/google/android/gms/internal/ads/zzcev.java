package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcev extends zzcca implements zzhk, zzma {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzceg zzc;
    private final zzxd zzd;
    private final zzcci zze;
    private final WeakReference zzf;
    private final zzuy zzg;
    private zziw zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcei zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code duplicated, block: B:21:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e9  */
    public zzcev(Context context, zzcci zzcciVar, zzccj zzccjVar, Integer num) {
        final boolean z;
        final zzgh zzghVar;
        this.zzb = context;
        this.zze = zzcciVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzccjVar);
        zzceg zzcegVar = new zzceg();
        this.zzc = zzcegVar;
        zzxd zzxdVar = new zzxd(context);
        this.zzd = zzxdVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzD().incrementAndGet();
        zzls zzlsVar = new zzls(context, new zzcer(this));
        zzlsVar.zzb(zzxdVar);
        zzlsVar.zza(zzcegVar);
        zzlt zzltVarZzc = zzlsVar.zzc();
        this.zzh = zzltVarZzc;
        zzltVarZzc.zzz(this);
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzfre.zzd(zzccjVar != null ? zzccjVar.zzbl() : null).zzb("");
        this.zzp = zzccjVar != null ? zzccjVar.zzf() : 0;
        final String strZzc = com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzccjVar.zzn().zza);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbV)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue()) {
                    z = zzcciVar.zzj ? false : true;
                }
            } else if (zzcciVar.zzj) {
            }
            final zzgh zzghVar2 = zzcciVar.zzm ? new zzgh() { // from class: com.google.android.gms.internal.ads.zzcem
                @Override // com.google.android.gms.internal.ads.zzgh
                public final zzgi zza() {
                    return this.zza.zzW(strZzc, z);
                }
            } : zzcciVar.zzi > 0 ? new zzgh() { // from class: com.google.android.gms.internal.ads.zzcen
                @Override // com.google.android.gms.internal.ads.zzgh
                public final zzgi zza() {
                    return this.zza.zzX(strZzc, z);
                }
            } : new zzgh() { // from class: com.google.android.gms.internal.ads.zzceo
                @Override // com.google.android.gms.internal.ads.zzgh
                public final zzgi zza() {
                    return this.zza.zzY(strZzc, z);
                }
            };
            zzghVar = zzcciVar.zzj ? new zzgh() { // from class: com.google.android.gms.internal.ads.zzcep
                @Override // com.google.android.gms.internal.ads.zzgh
                public final zzgi zza() {
                    return this.zza.zzZ(zzghVar2);
                }
            } : zzghVar2;
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzi.limit()];
                this.zzi.get(bArr);
                zzghVar = new zzgh() { // from class: com.google.android.gms.internal.ads.zzceq
                    @Override // com.google.android.gms.internal.ads.zzgh
                    public final zzgi zza() {
                        zzgh zzghVar3 = zzghVar;
                        byte[] bArr2 = bArr;
                        int i = zzcev.zza;
                        return new zzcej(new zzgd(bArr2), bArr2.length, zzghVar3.zza());
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.zzi.limit()];
            this.zzi.get(bArr2);
            zzghVar = new zzgh() { // from class: com.google.android.gms.internal.ads.zzcek
                @Override // com.google.android.gms.internal.ads.zzgh
                public final zzgi zza() {
                    return new zzgd(bArr2);
                }
            };
        }
        this.zzg = new zzuy(zzghVar, new zzux(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzo)).booleanValue() ? new zzabi() { // from class: com.google.android.gms.internal.ads.zzcet
            @Override // com.google.android.gms.internal.ads.zzabi
            public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
                int i = zzabh.zza;
                int i2 = zzcev.zza;
                return new zzabb[]{new zzahc(0), new zzafu(0), new zzagx(0, null)};
            }
        } : new zzabi() { // from class: com.google.android.gms.internal.ads.zzceu
            @Override // com.google.android.gms.internal.ads.zzabi
            public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
                int i = zzabh.zza;
                int i2 = zzcev.zza;
                return new zzabb[]{new zzahc(0), new zzafu(0)};
            }
        }));
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j = this.zzn;
                Map mapZze = ((zzhf) this.zzs.remove(0)).zze();
                long j2 = 0;
                if (mapZze != null) {
                    for (Map.Entry entry : mapZze.entrySet()) {
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzfqo.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j + j2;
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzH() {
        zziw zziwVar = this.zzh;
        if (zziwVar != null) {
            zziwVar.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzI(long j) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzd(), j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzJ(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzK(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzL(zzcbz zzcbzVar) {
        this.zzk = zzcbzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzM(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzN(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzO(boolean z) {
        this.zzh.zzr(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzQ(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzy();
            if (i >= 2) {
                return;
            }
            zzxd zzxdVar = this.zzd;
            zzwp zzwpVarZzc = zzxdVar.zzd().zzc();
            zzwpVarZzc.zzo(i, !z);
            zzxdVar.zzk(zzwpVarZzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzR(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcef zzcefVar = (zzcef) ((WeakReference) it.next()).get();
            if (zzcefVar != null) {
                zzcefVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzS(Surface surface, boolean z) {
        zziw zziwVar = this.zzh;
        if (zziwVar != null) {
            zziwVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzT(float f, boolean z) {
        zziw zziwVar = this.zzh;
        if (zziwVar != null) {
            zziwVar.zzt(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final boolean zzV() {
        return this.zzh != null;
    }

    final /* synthetic */ zzgi zzW(String str, boolean z) {
        zzcci zzcciVar = this.zze;
        return new zzcey(str, true != z ? null : this, zzcciVar.zzd, zzcciVar.zzf, zzcciVar.zzn, zzcciVar.zzo);
    }

    final /* synthetic */ zzgi zzX(String str, boolean z) {
        zzcci zzcciVar = this.zze;
        zzcef zzcefVar = new zzcef(str, true != z ? null : this, zzcciVar.zzd, zzcciVar.zzf, zzcciVar.zzi);
        this.zzu.add(new WeakReference(zzcefVar));
        return zzcefVar;
    }

    final /* synthetic */ zzgi zzY(String str, boolean z) {
        zzgq zzgqVar = new zzgq();
        zzgqVar.zzf(str);
        zzgqVar.zze(true != z ? null : this);
        zzgqVar.zzc(this.zze.zzd);
        zzgqVar.zzd(this.zze.zzf);
        zzgqVar.zzb(true);
        return zzgqVar.zza();
    }

    final /* synthetic */ zzgi zzZ(zzgh zzghVar) {
        return new zzcei(this.zzb, zzghVar.zza(), this.zzo, this.zzp, this, new zzcel(this));
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zza(zzgi zzgiVar, zzgn zzgnVar, boolean z, int i) {
        this.zzl += i;
    }

    final zztu zzaa(Uri uri) {
        zzar zzarVar = new zzar();
        zzarVar.zzb(uri);
        zzbp zzbpVarZzc = zzarVar.zzc();
        zzuy zzuyVar = this.zzg;
        zzuyVar.zza(this.zze.zzg);
        return zzuyVar.zzb(zzbpVarZzc);
    }

    final /* synthetic */ void zzab(boolean z, long j) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzi(z, j);
        }
    }

    final /* synthetic */ zzln[] zzac(Handler handler, zzzw zzzwVar, zzoy zzoyVar, zzvv zzvvVar, zzss zzssVar) {
        Context context = this.zzb;
        zzsc zzscVar = zzsc.zzb;
        zzoj zzojVar = zzoj.zza;
        zzdr[] zzdrVarArr = new zzdr[0];
        zzps zzpsVar = new zzps();
        zzoj zzojVar2 = zzoj.zza;
        if (zzojVar == null) {
            if (zzojVar2 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            zzojVar = zzojVar2;
        }
        zzpsVar.zzc(zzojVar);
        zzpsVar.zzd(zzdrVarArr);
        return new zzln[]{new zzqk(context, zzrs.zza, zzscVar, false, handler, zzoyVar, zzpsVar.zze()), new zzyz(this.zzb, zzrs.zza, zzsc.zzb, 0L, false, handler, zzzwVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzb(zzgi zzgiVar, zzgn zzgnVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzc(zzgi zzgiVar, zzgn zzgnVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzd(zzgi zzgiVar, zzgn zzgnVar, boolean z) {
        if (zzgiVar instanceof zzhf) {
            synchronized (this.zzq) {
                this.zzs.add((zzhf) zzgiVar);
            }
        } else if (zzgiVar instanceof zzcei) {
            this.zzt = (zzcei) zzgiVar;
            final zzccj zzccjVar = (zzccj) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && zzccjVar != null && this.zzt.zzn()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzces
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzccj zzccjVar2 = zzccjVar;
                        Map map2 = map;
                        int i = zzcev.zza;
                        zzccjVar2.zzd("onGcacheInfoEvent", map2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zze(zzly zzlyVar, zzam zzamVar, zzie zzieVar) {
        zzccj zzccjVar = (zzccj) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() || zzccjVar == null || zzamVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzamVar.zzl;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzccjVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzf(zzly zzlyVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzg(zzly zzlyVar, zzto zztoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzh(zzly zzlyVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzi(zzcp zzcpVar, zzlz zzlzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzj(zzly zzlyVar, zztj zztjVar, zzto zztoVar, IOException iOException, boolean z) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            if (this.zze.zzk) {
                zzcbzVar.zzl("onLoadException", iOException);
            } else {
                zzcbzVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzk(zzly zzlyVar, int i) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzl(zzly zzlyVar, zzcf zzcfVar) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzk("onPlayerError", zzcfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzm(zzly zzlyVar, zzco zzcoVar, zzco zzcoVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzn(zzly zzlyVar, Object obj, long j) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final /* synthetic */ void zzo(zzly zzlyVar, zzid zzidVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzp(zzly zzlyVar, zzam zzamVar, zzie zzieVar) {
        zzccj zzccjVar = (zzccj) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() || zzccjVar == null || zzamVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzamVar.zzt));
        map.put("bitRate", String.valueOf(zzamVar.zzi));
        map.put("resolution", zzamVar.zzr + "x" + zzamVar.zzs);
        String str = zzamVar.zzl;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzccjVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzq(zzly zzlyVar, zzdn zzdnVar) {
        zzcbz zzcbzVar = this.zzk;
        if (zzcbzVar != null) {
            zzcbzVar.zzD(zzdnVar.zzc, zzdnVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final long zzz() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zztu zzukVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzukVar = zzaa(uriArr[0]);
            } else {
                zztu[] zztuVarArr = new zztu[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zztuVarArr[i] = zzaa(uriArr[i]);
                }
                zzukVar = new zzuk(false, false, zztuVarArr);
            }
            this.zzh.zzB(zzukVar);
            this.zzh.zzp();
            zzE().incrementAndGet();
        }
    }
}
