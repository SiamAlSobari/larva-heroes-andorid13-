package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.a;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.properties.d;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigurationReader {
    private Configuration a;

    private Configuration a() {
        Configuration configuration = this.a;
        if (configuration != null) {
            return configuration;
        }
        File file = new File(d.k());
        if (file.exists()) {
            try {
                this.a = new Configuration(new JSONObject(new String(j.a(file))));
            } catch (IOException | JSONException unused) {
                a.b("Unable to read configuration from storage");
                this.a = null;
            }
        }
        return this.a;
    }

    private Configuration b() {
        if (com.unity3d.services.core.webview.a.c() == null) {
            return null;
        }
        return com.unity3d.services.core.webview.a.c().b();
    }

    public Configuration getCurrentConfiguration() {
        return b() != null ? b() : a();
    }
}
