package com.unity3d.services.ads.adunit;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.ads.configuration.IAdsModuleConfiguration;
import com.unity3d.services.core.api.Intent;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.misc.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class AdUnitActivity extends Activity {
    protected e a;
    private String[] b;
    private int c = -1;
    private int d;
    private int e;
    private ArrayList<Integer> f;
    boolean g;
    private Map<String, f> h;
    private int i;

    /* JADX WARN: Code duplicated, block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public void a(String str, int i, int i2, int i3, int i4) {
        View viewB;
        f fVarC = c(str);
        if (!str.equals("adunit")) {
            viewB = fVarC != null ? fVarC.b() : null;
            if (viewB != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
                layoutParams.setMargins(i, i2, 0, 0);
                viewB.setLayoutParams(layoutParams);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i3, i4);
        layoutParams2.setMargins(i, i2, 0, 0);
        this.a.setLayoutParams(layoutParams2);
        if (viewB != null) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i3, i4);
            layoutParams3.setMargins(i, i2, 0, 0);
            viewB.setLayoutParams(layoutParams3);
        }
    }

    public e b() {
        return this.a;
    }

    public String[] c() {
        return this.b;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        b bVar;
        super.onCreate(bundle);
        if (com.unity3d.services.core.webview.a.c() == null) {
            com.unity3d.services.core.log.a.c("Unity Ads web app is null, closing Unity Ads activity from onCreate");
            finish();
            return;
        }
        AdUnit.setAdUnitActivity(this);
        Intent.setActiveActivity(this);
        a();
        k.a(this.a);
        e eVar = this.a;
        addContentView(eVar, eVar.getLayoutParams());
        if (bundle == null) {
            this.b = getIntent().getStringArrayExtra("views");
            this.f = getIntent().getIntegerArrayListExtra("keyEvents");
            if (getIntent().hasExtra("orientation")) {
                this.c = getIntent().getIntExtra("orientation", -1);
            }
            if (getIntent().hasExtra("systemUiVisibility")) {
                this.d = getIntent().getIntExtra("systemUiVisibility", 0);
            }
            if (getIntent().hasExtra("activityId")) {
                this.e = getIntent().getIntExtra("activityId", -1);
            }
            if (getIntent().hasExtra("displayCutoutMode")) {
                this.i = getIntent().getIntExtra("displayCutoutMode", 0);
            }
            bVar = b.ON_CREATE;
        } else {
            this.b = bundle.getStringArray("views");
            this.c = bundle.getInt("orientation", -1);
            this.d = bundle.getInt("systemUiVisibility", 0);
            this.f = bundle.getIntegerArrayList("keyEvents");
            this.g = bundle.getBoolean("keepScreenOn");
            this.e = bundle.getInt("activityId", -1);
            this.i = bundle.getInt("displayCutoutMode", 0);
            a(this.g);
            bVar = b.ON_RESTORE;
        }
        b(this.c);
        c(this.d);
        a(this.i);
        String[] strArr = this.b;
        if (strArr != null) {
            for (String str : strArr) {
                f fVarC = c(str);
                if (fVarC != null) {
                    fVarC.a(this, bundle);
                }
            }
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.ADUNIT, bVar, Integer.valueOf(this.e));
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (com.unity3d.services.core.webview.a.c() == null) {
            if (isFinishing()) {
                return;
            }
            com.unity3d.services.core.log.a.c("Unity Ads web app is null, closing Unity Ads activity from onDestroy");
            finish();
            return;
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.ADUNIT, b.ON_DESTROY, Boolean.valueOf(isFinishing()), Integer.valueOf(this.e));
        Map<String, f> map = this.h;
        if (map != null) {
            for (Map.Entry<String, f> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().f(this);
                }
            }
        }
        if (AdUnit.getCurrentAdUnitActivityId() == this.e) {
            AdUnit.setAdUnitActivity(null);
        }
        Intent.removeActiveActivity(this);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ArrayList<Integer> arrayList = this.f;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(i))) {
            return false;
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.ADUNIT, b.KEY_DOWN, Integer.valueOf(i), Long.valueOf(keyEvent.getEventTime()), Long.valueOf(keyEvent.getDownTime()), Integer.valueOf(keyEvent.getRepeatCount()), Integer.valueOf(this.e));
        return true;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (com.unity3d.services.core.webview.a.c() == null) {
            if (isFinishing()) {
                return;
            }
            com.unity3d.services.core.log.a.c("Unity Ads web app is null, closing Unity Ads activity from onPause");
            finish();
            return;
        }
        if (com.unity3d.services.core.webview.a.c().g() == null) {
            com.unity3d.services.core.log.a.e("Unity Ads web view is null, from onPause");
        } else if (isFinishing()) {
            k.a(com.unity3d.services.core.webview.a.c().g());
        }
        Map<String, f> map = this.h;
        if (map != null) {
            for (Map.Entry<String, f> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().b(this);
                }
            }
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.ADUNIT, b.ON_PAUSE, Boolean.valueOf(isFinishing()), Integer.valueOf(this.e));
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            for (int i2 : iArr) {
                jSONArray2.put(i2);
            }
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.PERMISSIONS, g.PERMISSIONS_RESULT, Integer.valueOf(i), jSONArray, jSONArray2);
        } catch (Exception e) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.PERMISSIONS, g.PERMISSIONS_ERROR, e.getMessage());
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.unity3d.services.core.webview.a.c() == null) {
            if (isFinishing()) {
                return;
            }
            com.unity3d.services.core.log.a.c("Unity Ads web app is null, closing Unity Ads activity from onResume");
            finish();
            return;
        }
        a(this.b);
        Map<String, f> map = this.h;
        if (map != null) {
            for (Map.Entry<String, f> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().c(this);
                }
            }
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.ADUNIT, b.ON_RESUME, Integer.valueOf(this.e));
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("orientation", this.c);
        bundle.putInt("systemUiVisibility", this.d);
        bundle.putIntegerArrayList("keyEvents", this.f);
        bundle.putBoolean("keepScreenOn", this.g);
        bundle.putStringArray("views", this.b);
        bundle.putInt("activityId", this.e);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (com.unity3d.services.core.webview.a.c() == null) {
            if (isFinishing()) {
                return;
            }
            com.unity3d.services.core.log.a.c("Unity Ads web app is null, closing Unity Ads activity from onStart");
            finish();
            return;
        }
        Map<String, f> map = this.h;
        if (map != null) {
            for (Map.Entry<String, f> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().d(this);
                }
            }
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.ADUNIT, b.ON_START, Integer.valueOf(this.e));
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (com.unity3d.services.core.webview.a.c() == null) {
            if (isFinishing()) {
                return;
            }
            com.unity3d.services.core.log.a.c("Unity Ads web app is null, closing Unity Ads activity from onStop");
            finish();
            return;
        }
        Map<String, f> map = this.h;
        if (map != null) {
            for (Map.Entry<String, f> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().a(this);
                }
            }
        }
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.ADUNIT, b.ON_STOP, Integer.valueOf(this.e));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (z) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.ADUNIT, b.ON_FOCUS_GAINED, Integer.valueOf(this.e));
        } else {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.ADUNIT, b.ON_FOCUS_LOST, Integer.valueOf(this.e));
        }
        super.onWindowFocusChanged(z);
    }

    public Map<String, Integer> b(String str) {
        f fVarC = c(str);
        if (str.equals("adunit")) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
            HashMap map = new HashMap();
            map.put("x", Integer.valueOf(layoutParams.leftMargin));
            map.put("y", Integer.valueOf(layoutParams.topMargin));
            map.put("width", Integer.valueOf(this.a.getWidth()));
            map.put("height", Integer.valueOf(this.a.getHeight()));
            return map;
        }
        View viewB = fVarC != null ? fVarC.b() : null;
        if (viewB == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewB.getLayoutParams();
        HashMap map2 = new HashMap();
        map2.put("x", Integer.valueOf(layoutParams2.leftMargin));
        map2.put("y", Integer.valueOf(layoutParams2.topMargin));
        map2.put("width", Integer.valueOf(viewB.getWidth()));
        map2.put("height", Integer.valueOf(viewB.getHeight()));
        return map2;
    }

    public boolean c(int i) {
        this.d = i;
        try {
            getWindow().getDecorView().setSystemUiVisibility(i);
            return true;
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("Error while setting SystemUIVisibility", e);
            return false;
        }
    }

    public f c(String str) {
        Map<String, f> map = this.h;
        if (map != null && map.containsKey(str)) {
            return this.h.get(str);
        }
        f fVarA = a(str);
        if (fVarA != null) {
            if (this.h == null) {
                this.h = new HashMap();
            }
            this.h.put(str, fVarA);
        }
        return fVarA;
    }

    public void a(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        if (this.b == null) {
            this.b = new String[0];
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(this.b));
        arrayList2.removeAll(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            c((String) it.next()).a();
        }
        this.b = strArr;
        for (String str : strArr) {
            if (str != null) {
                f fVarC = c(str);
                fVarC.e(this);
                if (!a(fVarC.b())) {
                    return;
                }
            }
        }
    }

    public void b(int i) {
        this.c = i;
        setRequestedOrientation(i);
    }

    private boolean a(View view) {
        if (view == null) {
            finish();
            com.unity3d.services.core.log.a.c("Could not place view because it is null, finishing activity");
            return false;
        }
        if (view.getParent() != null && view.getParent().equals(this.a)) {
            this.a.bringChildToFront(view);
            return true;
        }
        k.a(view);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.setMargins(0, 0, 0, 0);
        view.setPadding(0, 0, 0, 0);
        this.a.addView(view, layoutParams);
        return true;
    }

    public boolean a(boolean z) {
        this.g = z;
        if (getWindow() == null) {
            return false;
        }
        if (z) {
            getWindow().addFlags(128);
            return true;
        }
        getWindow().clearFlags(128);
        return true;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.f = arrayList;
    }

    public void a(int i) {
        this.i = i;
        if (Build.VERSION.SDK_INT < 28 || getWindow() == null) {
            return;
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        try {
            attributes.getClass().getField("layoutInDisplayCutoutMode").setInt(attributes, i);
        } catch (IllegalAccessException e) {
            com.unity3d.services.core.log.a.a("Error setting layoutInDisplayCutoutMode", e);
        } catch (NoSuchFieldException e2) {
            com.unity3d.services.core.log.a.a("Error getting layoutInDisplayCutoutMode", e2);
        }
    }

    protected void a() {
        if (this.a != null) {
            return;
        }
        e eVar = new e(this);
        this.a = eVar;
        eVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        k.a(this.a, new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
    }

    private f a(String str) {
        Map<String, Class> adUnitViewHandlers;
        if (com.unity3d.services.core.webview.a.c() != null) {
            Configuration configurationB = com.unity3d.services.core.webview.a.c().b();
            for (String str2 : configurationB.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = configurationB.getModuleConfiguration(str2);
                if ((moduleConfiguration instanceof IAdsModuleConfiguration) && (adUnitViewHandlers = ((IAdsModuleConfiguration) moduleConfiguration).getAdUnitViewHandlers()) != null && adUnitViewHandlers.containsKey(str)) {
                    try {
                        return (f) adUnitViewHandlers.get(str).newInstance();
                    } catch (Exception unused) {
                        com.unity3d.services.core.log.a.c("Error creating view: " + str);
                        return null;
                    }
                }
            }
        }
        return null;
    }
}
