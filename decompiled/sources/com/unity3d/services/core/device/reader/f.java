package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: DeviceInfoReaderPrivacyBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends a {
    public f(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage) {
        super(configurationReader, privacyConfigStorage);
    }

    private com.unity3d.services.core.misc.f d() {
        return new com.unity3d.services.core.misc.f(Arrays.asList("privacy", "gdpr", "unity", "pipl"), Collections.singletonList("value"), Arrays.asList("ts", "exclude", "mode"));
    }

    @Override // com.unity3d.services.core.device.reader.a
    public p a() {
        com.unity3d.services.core.device.f fVarA = com.unity3d.services.core.device.i.a(com.unity3d.services.core.device.i.a.PRIVATE);
        return new g(new m(a(InitRequestType.PRIVACY), d(), fVarA, com.unity3d.services.core.device.i.a(com.unity3d.services.core.device.i.a.PUBLIC)), new e(fVarA).a());
    }
}
