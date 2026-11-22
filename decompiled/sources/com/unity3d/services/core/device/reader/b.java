package com.unity3d.services.core.device.reader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: DeviceInfoReaderCompressor.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements n {
    private final p a;

    public b(p pVar) {
        this.a = pVar;
    }

    @Override // com.unity3d.services.core.device.reader.o
    public Map<String, Object> a() {
        return this.a.a();
    }

    public byte[] b() {
        return a(a());
    }

    @Override // com.unity3d.services.core.device.reader.n
    public byte[] a(Map<String, Object> map) {
        if (map != null) {
            String string = new JSONObject(map).toString();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(string.length());
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(string.getBytes());
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                com.unity3d.services.core.log.a.c("Error occurred while trying to compress device data.");
            }
        } else {
            com.unity3d.services.core.log.a.c("Invalid DeviceInfoData: Expected non null map provided by reader");
        }
        return null;
    }
}
