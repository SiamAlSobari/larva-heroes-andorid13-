package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaml implements zzakz {
    private final zzamk zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaml(zzamk zzamkVar, int i) {
        this.zzc = zzamkVar;
    }

    static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    static long zzf(InputStream inputStream) throws IOException {
        return (((long) zzn(inputStream)) & 255) | ((((long) zzn(inputStream)) & 255) << 8) | ((((long) zzn(inputStream)) & 255) << 16) | ((((long) zzn(inputStream)) & 255) << 24) | ((((long) zzn(inputStream)) & 255) << 32) | ((((long) zzn(inputStream)) & 255) << 40) | ((((long) zzn(inputStream)) & 255) << 48) | ((((long) zzn(inputStream)) & 255) << 56);
    }

    static String zzh(zzamj zzamjVar) throws IOException {
        return new String(zzm(zzamjVar, zzf(zzamjVar)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzamj zzamjVar, long j) throws IOException {
        long jZza = zzamjVar.zza();
        if (j >= 0 && j <= jZza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzamjVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + jZza);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzami zzamiVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzamiVar.zza - ((zzami) this.zza.get(str)).zza;
        } else {
            this.zzb += zzamiVar.zza;
        }
        this.zza.put(str, zzamiVar);
    }

    private final void zzp(String str) {
        zzami zzamiVar = (zzami) this.zza.remove(str);
        if (zzamiVar != null) {
            this.zzb -= zzamiVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzakz
    public final synchronized zzaky zza(String str) {
        zzami zzamiVar = (zzami) this.zza.get(str);
        if (zzamiVar == null) {
            return null;
        }
        File fileZzg = zzg(str);
        try {
            zzamj zzamjVar = new zzamj(new BufferedInputStream(new FileInputStream(fileZzg)), fileZzg.length());
            try {
                zzami zzamiVarZza = zzami.zza(zzamjVar);
                if (!TextUtils.equals(str, zzamiVarZza.zzb)) {
                    zzamb.zza("%s: key=%s, found=%s", fileZzg.getAbsolutePath(), str, zzamiVarZza.zzb);
                    zzp(str);
                    zzamjVar.close();
                    return null;
                }
                byte[] bArrZzm = zzm(zzamjVar, zzamjVar.zza());
                zzaky zzakyVar = new zzaky();
                zzakyVar.zza = bArrZzm;
                zzakyVar.zzb = zzamiVar.zzc;
                zzakyVar.zzc = zzamiVar.zzd;
                zzakyVar.zzd = zzamiVar.zze;
                zzakyVar.zze = zzamiVar.zzf;
                zzakyVar.zzf = zzamiVar.zzg;
                List<zzalh> list = zzamiVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzalh zzalhVar : list) {
                    treeMap.put(zzalhVar.zza(), zzalhVar.zzb());
                }
                zzakyVar.zzg = treeMap;
                zzakyVar.zzh = Collections.unmodifiableList(zzamiVar.zzh);
                zzamjVar.close();
                return zzakyVar;
            } catch (Throwable th) {
                zzamjVar.close();
                throw th;
            }
        } catch (IOException e) {
            zzamb.zza("%s: %s", fileZzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakz
    public final synchronized void zzb() {
        File fileZza = this.zzc.zza();
        if (!fileZza.exists()) {
            if (fileZza.mkdirs()) {
                return;
            }
            zzamb.zzb("Unable to create cache dir %s", fileZza.getAbsolutePath());
            return;
        }
        File[] fileArrListFiles = fileZza.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                try {
                    long length = file.length();
                    zzamj zzamjVar = new zzamj(new BufferedInputStream(new FileInputStream(file)), length);
                    try {
                        zzami zzamiVarZza = zzami.zza(zzamjVar);
                        zzamiVarZza.zza = length;
                        zzo(zzamiVarZza.zzb, zzamiVarZza);
                        zzamjVar.close();
                    } catch (Throwable th) {
                        zzamjVar.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakz
    public final synchronized void zzc(String str, boolean z) {
        zzaky zzakyVarZza = zza(str);
        if (zzakyVarZza != null) {
            zzakyVarZza.zzf = 0L;
            zzakyVarZza.zze = 0L;
            zzd(str, zzakyVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakz
    public final synchronized void zzd(String str, zzaky zzakyVar) {
        long j = this.zzb;
        int length = zzakyVar.zza.length;
        long j2 = j + ((long) length);
        int i = this.zzd;
        if (j2 <= i || length <= i * 0.9f) {
            File fileZzg = zzg(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzg));
                zzami zzamiVar = new zzami(str, zzakyVar);
                try {
                    zzj(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzamiVar.zzb);
                    String str2 = zzamiVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzk(bufferedOutputStream, zzamiVar.zzd);
                    zzk(bufferedOutputStream, zzamiVar.zze);
                    zzk(bufferedOutputStream, zzamiVar.zzf);
                    zzk(bufferedOutputStream, zzamiVar.zzg);
                    List<zzalh> list = zzamiVar.zzh;
                    if (list != null) {
                        zzj(bufferedOutputStream, list.size());
                        for (zzalh zzalhVar : list) {
                            zzl(bufferedOutputStream, zzalhVar.zza());
                            zzl(bufferedOutputStream, zzalhVar.zzb());
                        }
                    } else {
                        zzj(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzakyVar.zza);
                    bufferedOutputStream.close();
                    zzamiVar.zza = fileZzg.length();
                    zzo(str, zzamiVar);
                    if (this.zzb >= this.zzd) {
                        if (zzamb.zzb) {
                            zzamb.zzd("Pruning old cache entries.", new Object[0]);
                        }
                        long j3 = this.zzb;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.zza.entrySet().iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                jElapsedRealtime = jElapsedRealtime;
                                break;
                            }
                            zzami zzamiVar2 = (zzami) ((Map.Entry) it.next()).getValue();
                            if (zzg(zzamiVar2.zzb).delete()) {
                                this.zzb -= zzamiVar2.zza;
                            } else {
                                String str3 = zzamiVar2.zzb;
                                zzamb.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i2++;
                            if (this.zzb < this.zzd * 0.9f) {
                                break;
                            } else {
                                jElapsedRealtime = jElapsedRealtime;
                            }
                        }
                        if (zzamb.zzb) {
                            zzamb.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzb - j3), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } catch (IOException e) {
                    zzamb.zza("%s", e.toString());
                    bufferedOutputStream.close();
                    zzamb.zza("Failed to write header for %s", fileZzg.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!fileZzg.delete()) {
                    zzamb.zza("Could not clean up file %s", fileZzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzamb.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                }
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean zDelete = zzg(str).delete();
        zzp(str);
        if (zDelete) {
            return;
        }
        zzamb.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzaml(File file, int i) {
        this.zzc = new zzamh(this, file);
    }
}
