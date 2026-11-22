package com.mrgames.larvaheroesfree.googleplay;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseGameActivity extends FragmentActivity implements GameHelper.GameHelperListener {
    public static final int CLIENT_ALL = 7;
    public static final int CLIENT_APPSTATE = 4;
    public static final int CLIENT_GAMES = 1;
    public static final int CLIENT_PLUS = 2;
    private static final String TAG = "BaseGameActivity";
    protected GameHelper mHelper;
    protected int mRequestedClients = 1;
    protected boolean mDebugLog = false;

    protected BaseGameActivity() {
    }

    protected BaseGameActivity(int i) {
        setRequestedClients(i);
    }

    protected void setRequestedClients(int i) {
        this.mRequestedClients = i;
    }

    public GameHelper getGameHelper() {
        if (this.mHelper == null) {
            GameHelper gameHelper = new GameHelper(this, this.mRequestedClients);
            this.mHelper = gameHelper;
            gameHelper.enableDebugLog(this.mDebugLog);
        }
        return this.mHelper;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.mHelper == null) {
            getGameHelper();
        }
        this.mHelper.setup(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.mHelper.onStart(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mHelper.onStop();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.mHelper.onActivityResult(i, i2, intent);
    }

    protected GoogleApiClient getApiClient() {
        return this.mHelper.getApiClient();
    }

    protected boolean isSignedIn() {
        return this.mHelper.isSignedIn();
    }

    protected void beginUserInitiatedSignIn() {
        this.mHelper.beginUserInitiatedSignIn();
    }

    protected void signOut() {
        this.mHelper.signOut();
    }

    protected void showAlert(String str) {
        this.mHelper.makeSimpleDialog(str).show();
    }

    protected void showAlert(String str, String str2) {
        this.mHelper.makeSimpleDialog(str, str2).show();
    }

    protected void enableDebugLog(boolean z) {
        this.mDebugLog = true;
        GameHelper gameHelper = this.mHelper;
        if (gameHelper != null) {
            gameHelper.enableDebugLog(z);
        }
    }

    @Deprecated
    protected void enableDebugLog(boolean z, String str) {
        Log.w(TAG, "BaseGameActivity.enabledDebugLog(bool,String) is deprecated. Use enableDebugLog(boolean)");
        enableDebugLog(z);
    }

    protected String getInvitationId() {
        return this.mHelper.getInvitationId();
    }

    protected void reconnectClient() {
        this.mHelper.reconnectClient();
    }

    protected boolean hasSignInError() {
        return this.mHelper.hasSignInError();
    }

    protected GameHelper.SignInFailureReason getSignInError() {
        return this.mHelper.getSignInError();
    }
}
