package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: DeviceInfoReaderBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private final ConfigurationReader a;
    private PrivacyConfigStorage b;

    public a(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage) {
        this.a = configurationReader;
        this.b = privacyConfigStorage;
    }

    private Experiments b() {
        ConfigurationReader configurationReader = this.a;
        return (configurationReader == null || configurationReader.getCurrentConfiguration() == null) ? new Experiments() : this.a.getCurrentConfiguration().getExperiments();
    }

    private com.unity3d.services.core.misc.f c() {
        return new com.unity3d.services.core.misc.f(Arrays.asList("privacy", "gdpr", "framework", "adapter", "mediation", "unity", "pipl", "configuration", "user", "unifiedconfig"), Collections.singletonList("value"), Arrays.asList("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }

    public p a() {
        com.unity3d.services.core.device.f fVarA = com.unity3d.services.core.device.i.a(com.unity3d.services.core.device.i.a.PRIVATE);
        com.unity3d.services.core.device.f fVarA2 = com.unity3d.services.core.device.i.a(com.unity3d.services.core.device.i.a.PUBLIC);
        com.unity3d.services.core.misc.h hVar = new com.unity3d.services.core.misc.h(Arrays.asList(fVarA2, fVarA));
        e eVar = new e(fVarA);
        m mVar = new m(new h(new d(a(InitRequestType.TOKEN)), com.unity3d.services.core.lifecycle.a.a()), c(), fVarA, fVarA2);
        com.unity3d.services.core.device.reader.pii.f fVar = new com.unity3d.services.core.device.reader.pii.f(hVar);
        return new i(new g((this.b == null || !b().isPrivacyRequestEnabled()) ? new j(mVar, new com.unity3d.services.core.device.reader.pii.c(fVar, fVarA, b()), new com.unity3d.services.core.device.reader.pii.b()) : new k(mVar, this.b, new com.unity3d.services.core.device.reader.pii.b(), fVar), eVar.a()));
    }

    protected p a(InitRequestType initRequestType) {
        return new l(new q(), initRequestType);
    }
}
