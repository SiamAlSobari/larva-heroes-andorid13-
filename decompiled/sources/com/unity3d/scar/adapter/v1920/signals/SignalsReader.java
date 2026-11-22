package com.unity3d.scar.adapter.v1920.signals;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.DispatchGroup;
import com.unity3d.scar.adapter.common.signals.ISignalCollectionListener;
import com.unity3d.scar.adapter.common.signals.ISignalsReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SignalsReader implements ISignalsReader {
    private static SignalsStorage a;

    private class a implements Runnable {
        private ISignalCollectionListener a;

        public a(ISignalCollectionListener iSignalCollectionListener) {
            this.a = iSignalCollectionListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap();
            Iterator<Map.Entry<String, QueryInfoMetadata>> it = SignalsReader.a.getPlacementQueryInfoMap().entrySet().iterator();
            String error = null;
            while (it.hasNext()) {
                QueryInfoMetadata value = it.next().getValue();
                map.put(value.getPlacementId(), value.getQueryStr());
                if (value.getError() != null) {
                    error = value.getError();
                }
            }
            if (map.size() > 0) {
                this.a.onSignalsCollected(new JSONObject(map).toString());
            } else if (error == null) {
                this.a.onSignalsCollected("");
            } else {
                this.a.onSignalsCollectionFailed(error);
            }
        }
    }

    public SignalsReader(SignalsStorage signalsStorage) {
        a = signalsStorage;
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalsReader
    public void getSCARSignals(Context context, String[] strArr, String[] strArr2, ISignalCollectionListener iSignalCollectionListener) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        for (String str : strArr) {
            dispatchGroup.enter();
            a(context, str, AdFormat.INTERSTITIAL, dispatchGroup);
        }
        for (String str2 : strArr2) {
            dispatchGroup.enter();
            a(context, str2, AdFormat.REWARDED, dispatchGroup);
        }
        dispatchGroup.notify(new a(iSignalCollectionListener));
    }

    private void a(Context context, String str, AdFormat adFormat, DispatchGroup dispatchGroup) {
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        QueryInfoMetadata queryInfoMetadata = new QueryInfoMetadata(str);
        QueryInfoCallback queryInfoCallback = new QueryInfoCallback(queryInfoMetadata, dispatchGroup);
        a.put(str, queryInfoMetadata);
        QueryInfo.generate(context, adFormat, adRequestBuild, queryInfoCallback);
    }
}
