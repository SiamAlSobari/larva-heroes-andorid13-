package com.mrgames.larvaheroesfree.gptouchplus;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.app.ActivityCompat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.games.Games;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mrgames.larvaheroesfree.Natives;
import com.mrgames.larvaheroesfree.R;
import com.mrgames.larvaheroesfree.billingClient.BillingManager;
import com.mrgames.larvaheroesfree.googleplay.GameHelper;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public class GpTouchActivity extends Activity implements GameHelper.GameHelperListener {
    public static final int CLIENT_ALL = 7;
    public static final int CLIENT_APPSTATE = 4;
    public static final int CLIENT_GAMES = 1;
    public static final int CLIENT_PLUS = 2;
    private static final String MERCHANT_ID = null;
    private static final String TAG = "Natives";
    public static Context mContext = null;
    private static FirebaseAnalytics mFirebaseAnalytics = null;
    public static Tracker mGaTracker = null;
    protected static GameHelper mGmsHelper = null;
    public static String mPakageName = null;
    public static int mRequestedClients = 1;
    public static Bundle mSaveInstanceState = null;
    public static String mVersionName = null;
    public static GpTouchActivity myActivity = null;
    public static String s_name = "";
    public String deviceId;
    public GoogleAnalytics mGaInstance;
    private boolean mIsBackKeyPressed = false;
    private long mCurTime = 0;
    public boolean bBuyItem = false;
    private boolean earnedCurrency = false;
    public boolean bCheckVungleStart = false;
    private final UnityAdsListener unityAdsListener = new UnityAdsListener();
    public boolean curGooglePlayState = false;
    private BillingManager mBillingManager = null;
    private Boolean testMode = false;
    private String adUnitId = "rewardedVideo";
    private IUnityAdsLoadListener loadListener = new IUnityAdsLoadListener() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity.1
        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
            UnityAds.show(GpTouchActivity.myActivity, GpTouchActivity.this.adUnitId, new UnityAdsShowOptions(), GpTouchActivity.this.showListener);
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            Log.e("UnityAdsExample", "Unity Ads failed to load ad for " + str + " with error: [" + unityAdsLoadError + "] " + str2);
            GpTouchGameInit.SetUnityAdState(2);
        }
    };
    private IUnityAdsShowListener showListener = new IUnityAdsShowListener() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity.2
        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(String str) {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(String str) {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            GpTouchGameInit.SetUnityAdState(2);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            Log.v("UnityAdsExample", "onUnityAdsShowComplete: " + str);
            if (unityAdsShowCompletionState.equals(UnityAds.UnityAdsShowCompletionState.COMPLETED)) {
                GpTouchGameInit.SetADMobRewardCloseState(1);
                GpTouchGameInit.SetADMobRewardState(2);
                GpTouchGameInit.SetUnityAdCloseState(1);
                GpTouchGameInit.SetUnityAdState(3);
                GpTouchGameInit.SetADLoaded(false);
                GpTouchGameInit.SetUnityADLoaded(false);
                return;
            }
            Log.d("UnityAD skipped", "Video was skipped!");
            GpTouchGameInit.SetADMobRewardState(2);
            GpTouchGameInit.SetUnityAdState(3);
            GpTouchGameInit.SetADLoaded(false);
            GpTouchGameInit.SetUnityADLoaded(false);
            GpTouchGameInit.SetUnityAdCloseState(0);
            GpTouchGameInit.SetADMobRewardCloseState(0);
        }
    };
    private Handler mTimerHandler = new Handler() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            GpTouchActivity.this.mIsBackKeyPressed = false;
        }
    };

    public static void GCM_reRegister() {
    }

    public static void GCM_unRegister() {
    }

    public static boolean KakaoTalkLinkForApp(String str, String str2) throws UnsupportedEncodingException {
        return true;
    }

    public static boolean KakaoTalkLinkForURL(String str, String str2) throws UnsupportedEncodingException {
        return true;
    }

    public void HideNotice() {
    }

    public void InitADMob() {
    }

    public void callShowOffers() {
    }

    public void callSpendCurrency(int i) {
    }

    public void initAD_Interstitial() {
    }

    @Override // com.mrgames.larvaheroesfree.googleplay.GameHelper.GameHelperListener
    public void onSignInFailed() {
    }

    public class UnityAdsListener extends Activity implements IUnityAdsInitializationListener {
        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        }

        public UnityAdsListener() {
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            GpTouchGameInit.SetUnityAdState(1);
            GpTouchGameInit.SetUnityADLoaded(true);
            GpTouchGameInit.SetADMobRewardState(1);
            GpTouchGameInit.SetADLoaded(true);
            Log.w("unityad", "onUnityAdsReady");
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mSaveInstanceState = bundle;
        myActivity = this;
        mContext = getApplicationContext();
        FirebaseApp.initializeApp(this);
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                this.f$0.m312x1c8ae07a(initializationStatus);
            }
        });
        UnityAds.initialize(this, "4077325", this.unityAdsListener);
        GoogleAnalytics googleAnalytics = GoogleAnalytics.getInstance(myActivity);
        this.mGaInstance = googleAnalytics;
        mGaTracker = googleAnalytics.newTracker("UA-49734846-1");
        GoogleAnalytics.getInstance(myActivity).setLocalDispatchPeriod(2);
        mGaTracker.setScreenName("Game Start_2");
        mGaTracker.send(new HitBuilders.AppViewBuilder().build());
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(myActivity);
        mFirebaseAnalytics = firebaseAnalytics;
        firebaseAnalytics.setCurrentScreen(myActivity, "Game Start", null);
        this.mBillingManager = new BillingManager(this);
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel(getString(R.string.default_notification_channel_id), "LarvaDefence", 2));
        }
        FirebaseMessaging.getInstance().subscribeToTopic("ALL");
        if (myActivity.getResources().getConfiguration().locale.getCountry().compareTo("KR") == 0) {
            FirebaseMessaging.getInstance().subscribeToTopic("kr");
        } else {
            FirebaseMessaging.getInstance().subscribeToTopic("en");
        }
    }

    /* JADX INFO: renamed from: lambda$onCreate$0$com-mrgames-larvaheroesfree-gptouchplus-GpTouchActivity, reason: not valid java name */
    /* synthetic */ void m312x1c8ae07a(InitializationStatus initializationStatus) {
        initAD_Interstitial();
    }

    public void setSubscribeTopic(boolean z) {
        if (z) {
            FirebaseMessaging.getInstance().subscribeToTopic("ALL");
            if (myActivity.getResources().getConfiguration().locale.getCountry().compareTo("KR") == 0) {
                FirebaseMessaging.getInstance().subscribeToTopic("kr");
                return;
            } else {
                FirebaseMessaging.getInstance().subscribeToTopic("en");
                return;
            }
        }
        FirebaseMessaging.getInstance().unsubscribeFromTopic("ALL");
        if (myActivity.getResources().getConfiguration().locale.getCountry().compareTo("KR") == 0) {
            FirebaseMessaging.getInstance().unsubscribeFromTopic("kr");
        } else {
            FirebaseMessaging.getInstance().unsubscribeFromTopic("en");
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        GoogleAnalytics.getInstance(myActivity).reportActivityStart(myActivity);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        GoogleAnalytics.getInstance(myActivity).reportActivityStop(myActivity);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (GpTouchGameInit.GetActivityCallCheck() == 1) {
            GpTouchGameInit.SetActivityCallCheck(0);
        } else if (GpTouchGameInit.GetActivityCallCheck() == 2) {
            GpTouchGameInit.SetActivityCallCheck(0);
        }
    }

    @Override // com.mrgames.larvaheroesfree.googleplay.GameHelper.GameHelperListener
    public void onSignInSucceeded() {
        this.curGooglePlayState = true;
    }

    public void requestPurchase(int i, String str, byte[] bArr) {
        BillingManager billingManager = this.mBillingManager;
        if (billingManager != null) {
            billingManager.requestPurchase(i);
        }
    }

    public void bpDestory() {
        BillingManager billingManager = this.mBillingManager;
        if (billingManager != null) {
            billingManager.destroy();
        }
    }

    public void loadRewardVidowAd() {
        SetReloadUnityAd();
    }

    public void SetUnityAdView(boolean z) {
        if (GpTouchGameInit.GetUnityAdState() == 1) {
            GpTouchGameInit.SetUnityAdCloseState(0);
            GpTouchGameInit.SetADMobRewardCloseState(0);
            Log.w("unityad", "onUnityAdsStart");
            UnityAds.load(this.adUnitId, this.loadListener);
        }
    }

    public void SetReloadUnityAd() {
        if (GpTouchGameInit.GetUnityAdState() != 1) {
            GpTouchGameInit.SetUnityAdState(4);
            GpTouchGameInit.SetUnityAdCloseState(0);
            GpTouchGameInit.SetUnityADLoaded(false);
            GpTouchGameInit.SetADMobRewardCloseState(0);
            Log.w(TAG, "SetReloadUnityAd");
        }
    }

    public boolean getUnityCanShow() {
        return GpTouchGameInit.GetUnityAdState() == 1;
    }

    public static void InitGPlus() {
        GameHelper gameHelper = new GameHelper(myActivity, mRequestedClients);
        mGmsHelper = gameHelper;
        gameHelper.enableDebugLog(true);
        mGmsHelper.setup(myActivity);
    }

    public static void gpOnStop() {
        mGmsHelper.onStop();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (GpTouchGameInit.IsUseArm() && !GpTouchGameInit.IsArmPassed() && GpTouchGameInit.IsShowAlert()) {
                myActivity.destroyApp();
                return false;
            }
            if (Natives.nativeCheckGameState() == 1) {
                GpTouchRenderer.mRenderer.handleAtcionClear(0, -8.0f, 0.0f);
            }
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (i == 24) {
            audioManager.adjustStreamVolume(3, 1, 1);
            return true;
        }
        if (i == 25) {
            audioManager.adjustStreamVolume(3, -1, 1);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void backKeyPressed() {
        if (this.mIsBackKeyPressed) {
            if (Calendar.getInstance().getTimeInMillis() <= this.mCurTime + 2000) {
                finish();
            }
        } else {
            this.mIsBackKeyPressed = true;
            this.mCurTime = Calendar.getInstance().getTimeInMillis();
            backKeyStartTimer();
        }
    }

    private void backKeyStartTimer() {
        this.mTimerHandler.sendEmptyMessageDelayed(1, 2000L);
    }

    private void showExitDialog() {
        new AlertDialog.Builder(this).setTitle("Notice").setMessage("Do you want quit?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                GpTouchActivity.myActivity.destroyApp();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).create().show();
    }

    private void showDialog(String str, String str2) {
        new AlertDialog.Builder(this).setTitle(str).setMessage(str2).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).create().show();
    }

    public void showDialogExitForUPlus(String str, String str2) {
        new AlertDialog.Builder(this).setTitle(str).setMessage(str2).setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                GpTouchActivity.this.finish();
            }
        }).create().show();
    }

    public void destroyApp() {
        finish();
    }

    protected void setPackgeName(String str) {
        PackageManager packageManager = getApplication().getPackageManager();
        mPakageName = str;
        try {
            packageManager.getApplicationInfo(str, 0);
            mVersionName = packageManager.getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to locate assets, aborting...");
        }
    }

    public static void initGoogleAnalytics() {
        try {
            if (mGaTracker == null) {
                mGaTracker = GoogleAnalytics.getInstance(myActivity).newTracker("UA-49734846-1");
                GoogleAnalytics.getInstance(myActivity).setLocalDispatchPeriod(2);
            }
        } catch (Exception unused) {
        }
    }

    public static void SendEventGoogleAnalytics(int i) {
        String[] strArr = {"영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "영웅레벨업", "월드오픈", "월드오픈", "월드오픈", "월드오픈", "월드오픈", "월드오픈", "월드오픈", "월드오픈", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "앱다운로드", "추천게임", "VIDEO_AD", "VIDEO_AD", "자체광고", "자체광고", "펫구매", "광고펫오픈", "보스티켓구매", "보스던전입장", "라바_YouTube", "라바_YouTube_KID", "다운로드", "다운로드", "다운로드", "다운로드", "라바게임체널_Youtube", "다운로드", "다운로드", "다운로드", "다운로드", "다운로드"};
        String[] strArr2 = {"영웅_레벨업_10", "영웅_레벨업_20", "영웅_레벨업_30", "영웅_레벨업_40", "영웅_레벨업_50", "영웅_레벨업_60", "영웅_레벨업_70", "영웅_레벨업_80", "영웅_레벨업_90", "영웅_레벨업_100", "영웅_레벨업_110", "영웅_레벨업_120", "영웅_레벨업_130", "영웅_레벨업_140", "영웅_레벨업_150", "월드오픈_2", "월드오픈_3", "월드오픈_4", "월드오픈_5", "월드오픈_6", "월드오픈_7", "월드오픈_8", "월드오픈_9", "버드 링크", "포켓 단어 맞추기", "블럭 퍼즐 클래식 2017", "블럭 퍼즐 헥사 S", "벽돌깨기 S", "벽돌깨기 스페이스2", "버블 몬스터", "버블슈터 야구", "버블 슈터 히어로", "버블 스페이스", "쿠키 요리왕(3매치)", "도트 히어로Ⅱ", "도트 패밀리 디펜스", "도트 히어로", "환생만이살길", "젤리 퀸(3매치)", "쥬얼리 클래식", "보석 링크 클래식", "모두의 양궁(양궁게임)", "포켓 솔리테어", "진격의 용사", "뱀주사위 클래식", "탭보스: 천일전쟁", "언블럭 아케이드", "포켓 단어찾기", "포켓 단어왕", "포켓천자문", "포켓사자성어", "포켓단어찾기2", "쿠키왕클래식", "라바액션파이터", "추천게임_라바히어로즈2", "VIDE_ADMOB", "VIDE_UNITY", "자체광고_Banner", "자체베너광고_Half", "펫구매", "광고펫오픈", "보스티켓구매", "보스던전입장", "라바_YouTube", "라바_YouTube_KID", "라바단어찾기_다운로드", "라바드로잉_다운로드", "라바블럭퍼즐_다운로드", "라바퍼즐컬렉션_다운로드", "라바게임체널_Youtube", "라바벽돌깨기_다운로드", "라바틀린그림찾기_다운로드", "플라잉라바_다운로드", "라바버블팝_다운로드", "주얼리클래식_다운로드"};
        initGoogleAnalytics();
        mGaTracker.send(new HitBuilders.EventBuilder().setCategory(strArr[i]).setAction(strArr2[i]).build());
        Bundle bundle = new Bundle();
        bundle.putString(strArr[i], strArr2[i]);
        mFirebaseAnalytics.logEvent("LOG_EVENT", bundle);
    }

    public static String getSendPhoneNumber(Context context) {
        String deviceId;
        String line1Number;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            if (ActivityCompat.checkSelfPermission(mContext, "android.permission.READ_PHONE_STATE") != 0 || telephonyManager.getLine1Number() == null) {
                line1Number = "";
            } else {
                line1Number = telephonyManager.getLine1Number();
                if (line1Number.length() <= 0) {
                    line1Number = getDeviceId(context);
                }
            }
            deviceId = "0" + line1Number.substring(line1Number.length() - 10, line1Number.length());
        } catch (Exception unused) {
            deviceId = getDeviceId(context);
        }
        Log.d("Phone Number ", deviceId);
        return deviceId;
    }

    public static String getDeviceId(Context context) {
        ActivityCompat.checkSelfPermission(mContext, "android.permission.READ_PHONE_STATE");
        return "";
    }

    public void ShowNotice() {
        getFilesDir();
    }

    public boolean checkInstallApp(String str) {
        try {
            getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void getPackageAppStart(String str) {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(str);
        launchIntentForPackage.addFlags(DriveFile.MODE_READ_ONLY);
        myActivity.startActivity(launchIntentForPackage);
    }

    public void getUniqueID() {
        ActivityCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE");
        GpTouchGameInit.SetNetworkUniqueID("" + Settings.Secure.getString(getContentResolver(), "android_id"));
    }

    public void InitNAS() {
        getUniqueID();
    }

    public void connectToTapjoy() {
        getUniqueID();
    }

    public void onConnectSuccess() {
        Log.i(TAG, "Tapjoy SDK connected");
    }

    public void onConnectFail() {
        Log.e(TAG, "Tapjoy connect call failed");
    }

    public static void callGPlusApi() {
        mGmsHelper.onStart(myActivity);
    }

    public GoogleApiClient getGamesClient() {
        return mGmsHelper.getApiClient();
    }

    public boolean isSignedIn() {
        return mGmsHelper.isSignedIn();
    }

    public void beginUserInitiatedSignIn() {
        if (!mGmsHelper.getApiClient().isConnected() && mGmsHelper.mConnectOnStart) {
            mGmsHelper.onStart(myActivity);
        } else {
            mGmsHelper.beginUserInitiatedSignIn();
        }
    }

    public void googleSignOut() {
        mGmsHelper.signOut();
    }

    public void getLeadBoard() {
        startActivityForResult(Games.Leaderboards.getAllLeaderboardsIntent(mGmsHelper.getApiClient()), 1000);
    }

    public void getAchievement() {
        startActivityForResult(Games.Achievements.getAchievementsIntent(mGmsHelper.getApiClient()), 1000);
    }

    public boolean isClientConnected() {
        return getGamesClient().isConnected();
    }

    public void setGameScore(int i) {
        Games.Leaderboards.submitScore(mGmsHelper.getApiClient(), getString(R.string.total_score), i);
    }

    public void setUnlockAchievement(int i) {
        String string;
        if (i == 0) {
            string = getString(R.string.hero_trans_10);
        } else if (i == 1) {
            string = getString(R.string.hero_trans_30);
        } else if (i == 2) {
            string = getString(R.string.hero_friend);
        } else if (i == 3) {
            string = getString(R.string.stage_clear_10);
        } else if (i == 4) {
            string = getString(R.string.stage_clear_50);
        } else if (i == 5) {
            string = getString(R.string.stage_clear_100);
        } else if (i == 6) {
            string = getString(R.string.magiccandy_100);
        } else if (i == 7) {
            string = getString(R.string.gold_100000);
        } else if (i == 8) {
            string = getString(R.string.boss_3);
        } else if (i == 9) {
            string = getString(R.string.boss_5);
        } else if (i == 10) {
            string = getString(R.string.boss_7);
        } else if (i == 11) {
            string = getString(R.string.boss_9);
        } else if (i == 12) {
            string = getString(R.string.perfect_clear);
        } else if (i == 13) {
            string = getString(R.string.full_level);
        } else {
            string = i == 14 ? getString(R.string.captain_jack) : "";
        }
        Games.Achievements.unlock(mGmsHelper.getApiClient(), string);
    }
}
