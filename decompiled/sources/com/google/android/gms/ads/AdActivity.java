package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzcaa;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbsc zza;

    private final void zza() {
        zzbsc zzbscVar = this.zza;
        if (zzbscVar != null) {
            try {
                zzbscVar.zzx();
            } catch (RemoteException e) {
                zzcaa.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null) {
                zzbscVar.zzh(i, i2, intent);
            }
        } catch (Exception e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null && !zzbscVar.zzG()) {
                return;
            }
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbsc zzbscVar2 = this.zza;
            if (zzbscVar2 != null) {
                zzbscVar2.zzi();
            }
        } catch (RemoteException e2) {
            zzcaa.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null) {
                zzbscVar.zzk(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbsc zzbscVarZzo = zzay.zza().zzo(this);
        this.zza = zzbscVarZzo;
        if (zzbscVarZzo == null) {
            zzcaa.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbscVarZzo.zzl(bundle);
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null) {
                zzbscVar.zzm();
            }
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null) {
                zzbscVar.zzo();
            }
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null) {
                zzbscVar.zzp(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null) {
                zzbscVar.zzq();
            }
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null) {
                zzbscVar.zzr();
            }
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null) {
                zzbscVar.zzs(bundle);
            }
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null) {
                zzbscVar.zzt();
            }
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null) {
                zzbscVar.zzu();
            }
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbsc zzbscVar = this.zza;
            if (zzbscVar != null) {
                zzbscVar.zzv();
            }
        } catch (RemoteException e) {
            zzcaa.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
