package com.mrgames.larvaheroesfree;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.firebase.messaging.Constants;
import com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity;
import com.mrgames.larvaheroesfree.gptouchplus.GpTouchGLSurfaceView;
import com.mrgames.larvaheroesfree.gptouchplus.GpTouchGameInit;
import com.mrgames.larvaheroesfree.gptouchplus.GpTouchRenderer;
import com.mrgames.larvaheroesfree.gptouchplus.GpTouchSound;
import com.mrgames.larvaheroesfree.network.GpTouchNetwork;
import com.mrgames.larvaheroesfree.spritetext.EchoEditText;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class Natives extends GpTouchActivity {
    private static final String AD_UNIT_ID = "ca-app-pub-1272300599065219/2854007202";
    static final int REQUEST_GET_ACCOUNTS = 102;
    static final int REQUEST_PHONE_STATE = 101;
    private static final String TAG = "Natives";
    private static boolean adIsLoading = false;
    public static LinearLayout adLayout = null;
    public static LinearLayout adLayout2 = null;
    public static LinearLayout adLayout3 = null;
    public static AdView adview = null;
    public static AdView adview2 = null;
    public static AdView adview3 = null;
    public static boolean bPaused = false;
    public static int checkCntInterstitialAd = 1;
    public static int checkCurrInterstitialAd = 1;
    static ConnectivityManager connectivityManager = null;
    static long cur_stage = 0;
    public static EditText etext_Email = null;
    public static EditText etext_Nickname = null;
    public static EditText etext_test = null;
    public static String gdata = null;
    public static int gdata1 = 0;
    public static int gdata2 = 0;
    public static int gdata3 = 0;
    public static int gdata4 = 0;
    public static String[] getString = null;
    public static String gstelecom = "";
    private static InterstitialAd interstitialAd = null;
    static long kill_count = 0;
    private static FrameLayout layout = null;
    public static int mAdHalfHeight = 0;
    public static int mAdHalfWidth = 0;
    public static int mAdHeight = 0;
    public static int mAdWidth = 0;
    public static TextView mAverageSpeed = null;
    public static View mCellMessage = null;
    public static View mDashboard = null;
    private static int mHeight = 0;
    private static EchoEditText mInputText = null;
    private static Natives mInstance = null;
    public static ProgressBar mPB = null;
    private static String mPackageName = "";
    public static Button mPauseButton = null;
    public static TextView mProgressFraction = null;
    public static TextView mProgressPercent = null;
    public static Bundle mSaveInstanceState = null;
    public static float mScaleH = 1.0f;
    public static float mScaleW = 1.0f;
    public static TextView mStatusText = null;
    public static TextView mTimeRemaining = null;
    private static FrameLayout mVideoLayout = null;
    public static Button mWiFiSettingsButton = null;
    private static int mWidth = 0;
    public static PackageManager manager = null;
    public static AdManagerInterstitialAd mgrInterstitialAd = null;
    public static GpTouchNetwork network = null;
    public static String phonenumber = null;
    static long play_time = 0;
    static long player_level = 0;
    private static byte[] receiveData = null;
    private static int receiveLength = 0;
    public static String s_Email = "";
    public static String s_NickName = "";
    public static int screenHeight;
    public static int screenWidth;
    public static int totalLineCnt;
    static long total_score;
    private String Msg;
    private GLSurfaceView mGLView;
    private FrameLayout mLayout;
    float m_nRealScrHeight;
    float m_nRealScrWidth;
    float m_scaleDX;
    float m_scaleDY;
    ProgressBar pBar;
    public boolean adLoadingCheck1 = false;
    public boolean adLoadingCheck2 = false;
    public boolean adLoadingCheck3 = false;
    private boolean testInterstitial = false;
    boolean isSetADView = false;
    String NoticeHtml = "";
    int noticeVer = 0;
    int maxVer = 0;
    public Handler handler = new Handler() { // from class: com.mrgames.larvaheroesfree.Natives.11
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Natives.this.DownNotice();
            } else {
                if (i != 1) {
                    return;
                }
                GpTouchRenderer.mRenderer.handleAtcionClear(0, -8.0f, 0.0f);
            }
        }
    };
    String addr = "http://115.68.42.99:5900/notice.asp?";
    StringBuilder html = new StringBuilder();

    private static void OnSetBGMVolume(int i) {
    }

    public static void OnSetNickname(boolean z) {
    }

    public static void SetADMobRewardView(boolean z) {
    }

    private static void deleteGLTextLabel(int i) {
    }

    private static void drawGLTextLabel(int i, int i2, int i3, int i4) {
    }

    private static int getGLTextLabelWidth(int i, int i2) {
        return 0;
    }

    public static boolean getSDcardResourcePosition() {
        return true;
    }

    private static void initGLTextLabel(String str, int i, int i2, int i3, int i4, int i5) {
    }

    private static void initGLTextMultiLabel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, int i3, int i4, int i5, int i6) {
    }

    public static native void initializeJNIGlobalRef();

    public static native int nativeCheckGameState();

    public static native void nativeDestroy();

    public static native void nativeInit(int i, int i2);

    public static native void nativePause();

    public static native void nativePlusTapjoyReward(int i);

    public static native void nativePurchaseState(int i, int i2);

    public static native void nativeReloadTexture();

    public static native void nativeRender();

    public static native void nativeResize(int i, int i2);

    public static native void nativeResume();

    public static native void nativeSetAppInit(int i);

    public static native void nativeSetDataForSize(byte[] bArr);

    public static native void nativeSetGplusLoginFirst();

    public static native void nativeSetGplusLoginSuccess();

    public static native void nativeSetPaths(String str);

    public static native void nativeSetString(byte[] bArr);

    public static native void nativeSetTexture(byte[] bArr);

    public static native void nativeTextEnter(int i, int i2);

    public static native void nativeTouchesBegin(int i, float f, float f2);

    public static native void nativeTouchesCancel(float f, float f2);

    public static native void nativeTouchesClear(int i, float f, float f2);

    public static native void nativeTouchesEnd(int i, float f, float f2);

    public static native void nativeTouchesMove(int[] iArr, float[] fArr, float[] fArr2);

    private static native String setPublicKey();

    public static native void setTextureEx(byte[] bArr, int i, int i2, int i3);

    @Override // com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mSaveInstanceState = bundle;
        String packageName = getApplication().getPackageName();
        mPackageName = packageName;
        super.setPackgeName(packageName);
        getWindow().setFlags(1024, 1024);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        setContentView(R.layout.main);
        manager = getPackageManager();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        layout = (FrameLayout) findViewById(R.id.FrameLayout);
        GpTouchGLSurfaceView gpTouchGLSurfaceView = new GpTouchGLSurfaceView(this);
        this.mGLView = gpTouchGLSurfaceView;
        layout.addView(gpTouchGLSurfaceView);
        mInstance = this;
        mWidth = getWindowManager().getDefaultDisplay().getWidth();
        int height = getWindowManager().getDefaultDisplay().getHeight();
        mHeight = height;
        mScaleW = mWidth / 800.0f;
        mScaleH = height / 480.0f;
        mAdWidth = AdSize.BANNER.getWidthInPixels(this);
        mAdHeight = AdSize.BANNER.getHeightInPixels(this);
        mAdHalfWidth = AdSize.MEDIUM_RECTANGLE.getWidthInPixels(this);
        mAdHalfHeight = AdSize.MEDIUM_RECTANGLE.getHeightInPixels(this);
        InitADMob();
        GpTouchGameInit.SetADMobRewardState(4);
        GpTouchGameInit.SetADMobRewardCloseState(0);
        loadRewardVidowAd();
        adview = (AdView) findViewById(R.id.adMobView);
        adview.loadAd(new AdRequest.Builder().build());
        adview.setBackgroundColor(0);
        adview.setEnabled(false);
        adview.setVisibility(8);
        adview.setAdListener(new AdListener() { // from class: com.mrgames.larvaheroesfree.Natives.1
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                if (Natives.this.adLoadingCheck1) {
                    return;
                }
                Natives.this.adLoadingCheck1 = true;
                GpTouchGameInit.SetBannerAdState(3);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                GpTouchGameInit.SetBannerAdState(1);
                Natives.this.adLoadingCheck1 = true;
            }
        });
        adview2 = (AdView) findViewById(R.id.adMobPlayView);
        adview2.loadAd(new AdRequest.Builder().build());
        adview2.setBackgroundColor(0);
        adview2.setEnabled(false);
        adview2.setVisibility(8);
        adview2.setAdListener(new AdListener() { // from class: com.mrgames.larvaheroesfree.Natives.2
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                if (Natives.this.adLoadingCheck2) {
                    return;
                }
                Natives.this.adLoadingCheck2 = true;
                GpTouchGameInit.SetBannerAdState2(3);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                GpTouchGameInit.SetBannerAdState2(1);
                Natives.this.adLoadingCheck2 = true;
            }
        });
        adview3 = (AdView) findViewById(R.id.adMobLevelView);
        adview3.loadAd(new AdRequest.Builder().build());
        adview3.setBackgroundColor(0);
        adview3.setEnabled(false);
        adview3.setVisibility(8);
        adview3.setAdListener(new AdListener() { // from class: com.mrgames.larvaheroesfree.Natives.3
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.d("ADMOB", Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                if (Natives.this.adLoadingCheck3) {
                    return;
                }
                Natives.this.adLoadingCheck3 = true;
                GpTouchGameInit.SetBannerAdLevelViewState(3);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                Log.d("LOG_TAG", "onAdLoaded_Level_View");
                GpTouchGameInit.SetBannerAdLevelViewState(1);
                Natives.this.adLoadingCheck3 = true;
            }
        });
        GpTouchSound.initSFXSounds(10);
        GpTouchGameInit.SetShowAlert(false);
        network = new GpTouchNetwork(GpTouchGameInit.IsFullNetwork());
        super.getWindow().addFlags(128);
        super.getWindow().addFlags(1024);
        connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        GpTouchGameInit.SetNationCode(OnGetPVPNation());
        hideSystemBar();
    }

    @Override // com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity
    public void initAD_Interstitial() {
        GpTouchGameInit.SetFullAdState(0);
        super.initAD_Interstitial();
        loadAd_Interstitial();
        if (this.isSetADView) {
            return;
        }
        this.isSetADView = true;
    }

    public void loadAd_Interstitial() {
        Log.d(TAG, "loadAd_Interstitial");
        if (adIsLoading || mgrInterstitialAd != null) {
            return;
        }
        int i = checkCurrInterstitialAd + 1;
        checkCurrInterstitialAd = i;
        if (i < checkCntInterstitialAd) {
            return;
        }
        checkCurrInterstitialAd = 0;
        adIsLoading = true;
        AdManagerInterstitialAd.load(GpTouchActivity.myActivity, AD_UNIT_ID, new AdManagerAdRequest.Builder().build(), new AdManagerInterstitialAdLoadCallback() { // from class: com.mrgames.larvaheroesfree.Natives.4
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
                Natives.mgrInterstitialAd = adManagerInterstitialAd;
                boolean unused = Natives.adIsLoading = false;
                Log.i(Natives.TAG, "onAdLoaded");
                GpTouchGameInit.SetFullAdState(1);
                Natives.mgrInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.mrgames.larvaheroesfree.Natives.4.1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        Log.d(Natives.TAG, "The ad was dismissed.");
                        Natives.mgrInterstitialAd = null;
                        GpTouchGameInit.SetFullAdState(3);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        Log.d(Natives.TAG, "The ad failed to show.");
                        Natives.mgrInterstitialAd = null;
                        GpTouchGameInit.SetFullAdState(2);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        Log.d(Natives.TAG, "The ad was shown.");
                    }
                });
                if (Natives.this.testInterstitial) {
                    Natives.this.showInterstitial();
                }
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.i(Natives.TAG, loadAdError.getMessage());
                Natives.mgrInterstitialAd = null;
                boolean unused = Natives.adIsLoading = false;
                GpTouchGameInit.SetFullAdState(2);
            }
        });
    }

    public void showInterstitial() {
        AdManagerInterstitialAd adManagerInterstitialAd = mgrInterstitialAd;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.show(GpTouchActivity.myActivity);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            hideSystemBar();
        }
    }

    void hideSystemBar() {
        View decorView = getWindow().getDecorView();
        if (decorView != null) {
            decorView.setSystemUiVisibility(7943);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 101) {
            if (iArr.length == 1 && iArr[0] == 0) {
                GpTouchGameInit.SetPermission1(2);
                return;
            } else {
                GpTouchGameInit.SetPermission1(3);
                return;
            }
        }
        if (i == 102) {
            if (iArr.length == 1 && iArr[0] == 0) {
                GpTouchGameInit.SetPermission2(2);
            } else {
                GpTouchGameInit.SetPermission2(3);
            }
        }
    }

    public static void onSetAppPermission1() {
        GpTouchGameInit.SetPermission1(1);
        if (ActivityCompat.checkSelfPermission(GpTouchActivity.myActivity, "android.permission.READ_PHONE_STATE") != 0) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(GpTouchActivity.myActivity, "android.permission.READ_PHONE_STATE")) {
                ActivityCompat.requestPermissions(GpTouchActivity.myActivity, new String[]{"android.permission.READ_PHONE_STATE"}, 101);
                return;
            } else {
                ActivityCompat.requestPermissions(GpTouchActivity.myActivity, new String[]{"android.permission.READ_PHONE_STATE"}, 101);
                return;
            }
        }
        GpTouchGameInit.SetPermission1(2);
    }

    public static int getPermission1State() {
        return GpTouchGameInit.GetPermission1();
    }

    public static void onSetAppPermission2() {
        GpTouchGameInit.SetPermission2(1);
        if (ActivityCompat.checkSelfPermission(GpTouchActivity.myActivity, "android.permission.GET_ACCOUNTS") != 0) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(GpTouchActivity.myActivity, "android.permission.GET_ACCOUNTS")) {
                ActivityCompat.requestPermissions(GpTouchActivity.myActivity, new String[]{"android.permission.GET_ACCOUNTS"}, 102);
                return;
            } else {
                ActivityCompat.requestPermissions(GpTouchActivity.myActivity, new String[]{"android.permission.GET_ACCOUNTS"}, 102);
                return;
            }
        }
        GpTouchGameInit.SetPermission2(2);
    }

    public static int getPermission2State() {
        return GpTouchGameInit.GetPermission2();
    }

    public static boolean onGetPermissionVersion() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @Override // com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onPause() {
        AdView adView = adview;
        if (adView != null) {
            adView.pause();
        }
        AdView adView2 = adview2;
        if (adView2 != null) {
            adView2.pause();
        }
        AdView adView3 = adview3;
        if (adView3 != null) {
            adView3.pause();
        }
        super.onPause();
        System.out.println("<<//////// onPause ////////>>");
        nativePause();
        GpTouchSound.stopAllSound();
        bPaused = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        AdView adView = adview;
        if (adView != null) {
            adView.resume();
        }
        AdView adView2 = adview2;
        if (adView2 != null) {
            adView2.resume();
        }
        AdView adView3 = adview3;
        if (adView3 != null) {
            adView3.resume();
        }
        super.onResume();
        System.out.println("<<//////// onResume ////////>>");
        if (bPaused) {
            bPaused = false;
            nativeResume();
        }
        hideSystemBar();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        GpTouchActivity.myActivity.bpDestory();
        super.onDestroy();
        System.out.println("<<//////// onDestroy ////////>>");
        GpTouchSound.stopAllSound();
        GpTouchSound.releaseAll();
        nativeDestroy();
        GpTouchActivity.myActivity = null;
        GpTouchRenderer.mRenderer = null;
        if (network != null) {
            network = null;
        }
        Process.killProcess(Process.myPid());
    }

    static {
        System.loadLibrary("LarvaHeroesGame");
        kill_count = 0L;
        play_time = 0L;
        total_score = 0L;
        cur_stage = 0L;
        player_level = 0L;
    }

    public static int OnGetFullAdState() {
        return GpTouchGameInit.GetFullAdState();
    }

    public static int OnGetADMobRewardState() {
        return GpTouchGameInit.GetADMobRewardState();
    }

    public static int OnGetADMobRewardCloseState() {
        return GpTouchGameInit.GetADMobRewardCloseState();
    }

    public static void OnSetADMobRewardView(boolean z) {
        SetADMobRewardView(z);
    }

    public static boolean onGetADMobRewardCanShow() {
        return getADMobRewardCanShow();
    }

    public static int OnGetUnityAdState() {
        return GpTouchGameInit.GetUnityAdState();
    }

    public static int OnGetUnityAdCloseState() {
        return GpTouchGameInit.GetUnityAdCloseState();
    }

    public static void OnSetUnityAdView(boolean z) {
        GpTouchActivity.myActivity.SetUnityAdView(z);
    }

    public static boolean onGetUnityCanShow() {
        return GpTouchGameInit.GetUnityADLoaded();
    }

    public static void setRewardADInit() {
        GpTouchGameInit.SetUnityAdCloseState(0);
        GpTouchGameInit.SetADMobRewardCloseState(0);
    }

    public static int OnGetVungleState() {
        return GpTouchGameInit.GetVungleState();
    }

    public static int OnGetVungleCloseState() {
        return GpTouchGameInit.GetVungleCloseState();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.InputStream] */
    private static int loadTextureFromImage(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e;
        FileNotFoundException e2;
        ?? r1 = 0;
        ?? r2 = 0;
        try {
            try {
                try {
                    str = GpTouchActivity.myActivity.getAssets().open(str);
                    try {
                        byte[] bArr = new byte[str.available()];
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                int i = str.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            } catch (FileNotFoundException e3) {
                                e2 = e3;
                                e2.printStackTrace();
                                if (str != 0) {
                                    try {
                                        str.close();
                                    } catch (Exception e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                return 0;
                            } catch (IOException e5) {
                                e = e5;
                                e.printStackTrace();
                                if (str != 0) {
                                    try {
                                        str.close();
                                    } catch (Exception e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                return 0;
                            }
                        }
                        str.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        nativeSetTexture(byteArray);
                        if (str != 0) {
                            try {
                                str.close();
                            } catch (Exception e7) {
                                e7.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            return 1;
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            return 1;
                        }
                    } catch (FileNotFoundException e9) {
                        byteArrayOutputStream = null;
                        e2 = e9;
                    } catch (IOException e10) {
                        byteArrayOutputStream = null;
                        e = e10;
                    } catch (Throwable th) {
                        th = th;
                        r1 = str;
                        if (r1 != 0) {
                            try {
                                r1.close();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        if (r1 != 0) {
                            throw th;
                        }
                        try {
                            (r2 == true ? 1 : 0).close();
                            throw th;
                        } catch (Exception e12) {
                            e12.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e13) {
                byteArrayOutputStream = null;
                e2 = e13;
                str = 0;
            } catch (IOException e14) {
                byteArrayOutputStream = null;
                e = e14;
                str = 0;
            } catch (Throwable th3) {
                th = th3;
                if (r1 != 0) {
                    r1.close();
                }
                if (r1 != 0) {
                    throw th;
                }
                (r2 == true ? 1 : 0).close();
                throw th;
            }
        } catch (Exception e15) {
            e15.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.InputStream] */
    private static int getResFileSize(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e;
        FileNotFoundException e2;
        ?? r1 = 0;
        ?? r2 = 0;
        try {
            try {
                try {
                    str = GpTouchActivity.myActivity.getAssets().open(str);
                    try {
                        byte[] bArr = new byte[str.available()];
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                int i = str.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            } catch (FileNotFoundException e3) {
                                e2 = e3;
                                e2.printStackTrace();
                                if (str != 0) {
                                    try {
                                        str.close();
                                    } catch (Exception e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                return 0;
                            } catch (IOException e5) {
                                e = e5;
                                e.printStackTrace();
                                if (str != 0) {
                                    try {
                                        str.close();
                                    } catch (Exception e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                return 0;
                            }
                        }
                        str.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        nativeSetDataForSize(byteArray);
                        if (str != 0) {
                            try {
                                str.close();
                            } catch (Exception e7) {
                                e7.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            return 1;
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            return 1;
                        }
                    } catch (FileNotFoundException e9) {
                        byteArrayOutputStream = null;
                        e2 = e9;
                    } catch (IOException e10) {
                        byteArrayOutputStream = null;
                        e = e10;
                    } catch (Throwable th) {
                        th = th;
                        r1 = str;
                        if (r1 != 0) {
                            try {
                                r1.close();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        if (r1 != 0) {
                            throw th;
                        }
                        try {
                            (r2 == true ? 1 : 0).close();
                            throw th;
                        } catch (Exception e12) {
                            e12.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e13) {
                byteArrayOutputStream = null;
                e2 = e13;
                str = 0;
            } catch (IOException e14) {
                byteArrayOutputStream = null;
                e = e14;
                str = 0;
            } catch (Throwable th3) {
                th = th3;
                if (r1 != 0) {
                    r1.close();
                }
                if (r1 != 0) {
                    throw th;
                }
                (r2 == true ? 1 : 0).close();
                throw th;
            }
        } catch (Exception e15) {
            e15.printStackTrace();
        }
    }

    public static int loadTextureFromSDCardImage(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpen = GpTouchActivity.myActivity.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStreamOpen.available()];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i = inputStreamOpen.read(bArr);
                        if (i != -1) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        } else {
                            inputStreamOpen.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            nativeSetTexture(byteArray);
                            return 1;
                        }
                    } catch (IOException unused) {
                        inputStream = inputStreamOpen;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        return 0;
                    }
                }
            } catch (IOException unused4) {
                byteArrayOutputStream = null;
            }
        } catch (IOException unused5) {
            byteArrayOutputStream = null;
        }
    }

    public static int getSDCardFileSize(String str) {
        try {
            int i = manager.getPackageInfo(mPackageName, 0).versionCode;
            return 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static int isAssetExist(String str) {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = GpTouchActivity.myActivity.getAssets().open(str);
            return inputStreamOpen.available();
        } catch (IOException unused) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
            }
            return 0;
        }
    }

    private static byte[] readAssete(String str) {
        InputStream inputStreamOpen;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            inputStreamOpen = GpTouchActivity.myActivity.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStreamOpen.available()];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i = inputStreamOpen.read(bArr);
                        if (i != -1) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        } else {
                            inputStreamOpen.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            return byteArray;
                        }
                    } catch (IOException unused) {
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        return null;
                    }
                }
            } catch (IOException unused4) {
                byteArrayOutputStream = null;
            }
        } catch (IOException unused5) {
            inputStreamOpen = null;
            byteArrayOutputStream = null;
        }
    }

    private static int isFileExist(String str) {
        FileInputStream fileInputStreamOpenFileInput = null;
        try {
            fileInputStreamOpenFileInput = GpTouchActivity.myActivity.openFileInput(str);
            return fileInputStreamOpenFileInput.available();
        } catch (FileNotFoundException unused) {
            if (fileInputStreamOpenFileInput != null) {
                try {
                    fileInputStreamOpenFileInput.close();
                } catch (IOException unused2) {
                }
            }
            return 0;
        } catch (IOException unused3) {
            return 0;
        }
    }

    private static int readTextFile(String str) {
        getString = null;
        totalLineCnt = 0;
        try {
            InputStream inputStreamOpen = GpTouchActivity.myActivity.getAssets().open(str);
            Vector vector = new Vector();
            if (inputStreamOpen.available() > 0) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen, "euc-kr");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    String line = bufferedReader.readLine();
                    System.out.println("==== readTextFile: " + line + "  ====");
                    if (line == null) {
                        break;
                    }
                    vector.addElement(line);
                }
                inputStreamReader.close();
                bufferedReader.close();
                int size = vector.size();
                totalLineCnt = size;
                getString = new String[size];
                for (int i = 0; i < totalLineCnt; i++) {
                    getString[i] = (String) vector.elementAt(i);
                }
                vector.removeAllElements();
            }
            inputStreamOpen.close();
        } catch (IOException unused) {
            System.out.println("==== readTextFile: " + str + " read error ====");
        }
        return totalLineCnt;
    }

    private static void getJavaString(String str) {
        try {
            nativeSetString(str.getBytes("KSC5601"));
        } catch (Exception unused) {
        }
    }

    private static void saveFile(String str, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(GpTouchActivity.myActivity.getFilesDir().getAbsolutePath() + "/" + str));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    private static byte[] loadFile(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(GpTouchActivity.myActivity.getFilesDir().getAbsolutePath() + "/" + str));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[fileInputStream.available()];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    fileInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (FileNotFoundException unused) {
            System.out.println("FileNotFoundException");
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    private static String getAbsolueFilePath() {
        return GpTouchActivity.myActivity.getFilesDir().getAbsolutePath();
    }

    private static String getAbsoluteFilePathForSDCard(String str) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return "null";
        }
        String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + str;
        System.out.println("getAbsoluteFilePathForSDCard : " + str2);
        File file = new File(str2);
        if (file.isDirectory()) {
            return str2;
        }
        file.mkdirs();
        return str2;
    }

    public static void OnSoundMakeList(String[] strArr, int i) {
        Log.d("MY_LOG", "OnSoundMakeList@#@#@#@#@#@#@");
        GpTouchSound.makeSoundList(strArr, i);
    }

    private static void OnSoundLoad(int i, boolean z) {
        System.out.println("===== OnSoundLoad(0) sndID:" + i + ",isLoop:" + z);
        GpTouchSound.loadSoundEx(i, z);
    }

    private static void OnSoundRelease() {
        GpTouchSound.stopAllSound();
        GpTouchSound.releaseSFXSound();
    }

    private static void OnSoundPlay(int i, boolean z) {
        if (GpTouchSound.getVolume() == 0.0f && z) {
            GpTouchSound.stopBGMSound();
        } else {
            GpTouchSound.playIdxSound(i, z);
        }
    }

    private static void OnSoundPlayNoLoop(int i) {
        if (GpTouchSound.getVolume() == 0.0f) {
            return;
        }
        GpTouchSound.playIdxSoundNoLoop(i);
    }

    private static void OnSoundPlaySfx(int i) {
        if (GpTouchSound.getVolume() == 0.0f) {
            return;
        }
        GpTouchSound.playIdxSoundSfx(i);
    }

    private static void OnSoundPlayBGMforPath(String str, int i, boolean z) {
        if (i == 0 && z) {
            return;
        }
        GpTouchSound.setVolume(i / 10);
        GpTouchSound.playPathSound(str, z);
    }

    private static void OnStopSound() {
        GpTouchSound.stopAllSound();
    }

    private static void OnVibrate(int i) {
        System.out.println("===== OnVibrate() time:" + i);
        GpTouchSound.Vibrator(i);
    }

    public static int OnADWidth() {
        return mAdWidth;
    }

    public static int OnADHeight() {
        return mAdHeight;
    }

    public static int OnADHalfWidth() {
        return mAdHalfWidth;
    }

    public static int OnADHalfHeight() {
        return mAdHalfHeight;
    }

    public static int OnGetAdViewState() {
        if (adview.isLoading()) {
            return 0;
        }
        return GpTouchGameInit.GetBannerAdState();
    }

    public static int OnGetAdViewState2() {
        if (adview2.isLoading()) {
            return 0;
        }
        return GpTouchGameInit.GetBannerAdState2();
    }

    public static int OnGetAdLevelViewState() {
        if (adview3.isLoading()) {
            return 0;
        }
        return GpTouchGameInit.GetBannerAdLevelViewState();
    }

    public static void OnSetAbMob(boolean z) {
        if (GpTouchGameInit.IsUseAdMob()) {
            GpTouchGameInit.SetShowAdMob(z);
            GpTouchActivity.myActivity.runOnUiThread(new Runnable() { // from class: com.mrgames.larvaheroesfree.Natives.5
                @Override // java.lang.Runnable
                public void run() {
                    if (GpTouchGameInit.isShowAdMob()) {
                        Natives.adview.setEnabled(true);
                        Natives.adview.setVisibility(0);
                    } else {
                        Natives.adview.setEnabled(false);
                        Natives.adview.setVisibility(8);
                    }
                }
            });
        }
    }

    public static void OnSetAbMob2(boolean z) {
        if (GpTouchGameInit.IsUseAdMob()) {
            GpTouchGameInit.SetShowAdMob(z);
            GpTouchActivity.myActivity.runOnUiThread(new Runnable() { // from class: com.mrgames.larvaheroesfree.Natives.6
                @Override // java.lang.Runnable
                public void run() {
                    if (GpTouchGameInit.isShowAdMob()) {
                        Natives.adview2.setEnabled(true);
                        Natives.adview2.setVisibility(0);
                    } else {
                        Natives.adview2.setEnabled(false);
                        Natives.adview2.setVisibility(8);
                    }
                }
            });
        }
    }

    public static void OnSetAbMobPlay(boolean z) {
        if (GpTouchGameInit.IsUseAdMob()) {
            GpTouchGameInit.SetShowAdMob2(z);
            GpTouchActivity.myActivity.runOnUiThread(new Runnable() { // from class: com.mrgames.larvaheroesfree.Natives.7
                @Override // java.lang.Runnable
                public void run() {
                    if (GpTouchGameInit.isShowAdMob2()) {
                        Natives.adview2.setEnabled(true);
                        Natives.adview2.setVisibility(0);
                    } else {
                        Natives.adview2.setEnabled(false);
                        Natives.adview2.setVisibility(8);
                    }
                }
            });
        }
    }

    public static void OnSetAbMobLevelView(boolean z) {
        if (GpTouchGameInit.IsUseAdMob()) {
            GpTouchGameInit.SetShowAdMob3(z);
            GpTouchActivity.myActivity.runOnUiThread(new Runnable() { // from class: com.mrgames.larvaheroesfree.Natives.8
                @Override // java.lang.Runnable
                public void run() {
                    if (GpTouchGameInit.isShowAdMob3()) {
                        Natives.adview3.setEnabled(true);
                        Natives.adview3.setVisibility(0);
                    } else {
                        Natives.adview3.setEnabled(false);
                        Natives.adview3.setVisibility(8);
                    }
                }
            });
        }
    }

    public static void OnSetFullAdMob(boolean z) {
        GpTouchActivity.myActivity.runOnUiThread(new Runnable() { // from class: com.mrgames.larvaheroesfree.Natives.9
            @Override // java.lang.Runnable
            public void run() {
                GpTouchGameInit.SetFullAdState(0);
                Natives.mInstance.loadAd_Interstitial();
            }
        });
    }

    public static void OnSetSubscribeTopic(boolean z) {
        GpTouchActivity.myActivity.setSubscribeTopic(z);
    }

    public static void getADMobRewardLoading() {
        GpTouchActivity.myActivity.loadRewardVidowAd();
    }

    public static boolean getADMobRewardCanShow() {
        return GpTouchGameInit.GetADLoaded();
    }

    public static void OnSetFullAdView(boolean z) {
        GpTouchActivity.myActivity.runOnUiThread(new Runnable() { // from class: com.mrgames.larvaheroesfree.Natives.10
            @Override // java.lang.Runnable
            public void run() {
                Natives.mInstance.showInterstitial();
            }
        });
    }

    public static void jumpToURL(String str) {
        System.out.println("===== jumpToURL() ");
        try {
            GpTouchActivity.myActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
        }
    }

    public static void jumpToOzstoreUpdate(String str) {
        System.out.println("===== jumpToOzstoreUpdate() ");
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("ozstore.external.linked");
        intent.setData(uri);
        myActivity.startActivity(intent);
    }

    public static int GetPhoneModel() {
        return GpTouchGameInit.GetPhoneModel();
    }

    private static void GpTouchRequestPurchase(int i, String str, byte[] bArr) {
        GpTouchActivity.myActivity.requestPurchase(i, str, bArr);
    }

    private static byte[] getPurchaseCode() {
        return GpTouchGameInit.GetPurchaseCode().getBytes();
    }

    private static byte[] getSignatureCode() {
        return GpTouchGameInit.GetSignatureCode().getBytes();
    }

    private static byte[] getNickName() {
        try {
            return s_NickName.getBytes("KSC5601");
        } catch (Exception unused) {
            return null;
        }
    }

    public static void getTextEdit(String str) {
        s_NickName = str;
    }

    private static byte[] getPushItem() {
        return GpTouchGameInit.GetPushItemCode().getBytes();
    }

    public static int OnGetPushItemState() {
        return GpTouchGameInit.GetPushItem();
    }

    public static void OnsetPushItemState() {
        GpTouchGameInit.SetPushItem(0);
    }

    public static void setAutomataEnable(boolean z) {
        EchoEditText echoEditText = mInputText;
        if (echoEditText != null) {
            echoEditText.setEnable(z);
        }
    }

    public static void setAutomataChangable(boolean z) {
        EchoEditText echoEditText = mInputText;
        if (echoEditText != null) {
            echoEditText.setChangable(z);
        }
    }

    public static void setAutomataMode(int i) {
        EchoEditText echoEditText = mInputText;
        if (echoEditText != null) {
            echoEditText.setMode(i);
        }
    }

    public static void setAutomataText(byte[] bArr) {
        EchoEditText echoEditText = mInputText;
        if (echoEditText != null) {
            echoEditText.setText(bArr);
        }
    }

    public static void setAutomataMaxTextSize(int i) {
        EchoEditText echoEditText = mInputText;
        if (echoEditText != null) {
            echoEditText.setMaxTextSize(i);
        }
    }

    public static boolean CallKakaoTalkLink(String str, String str2) throws UnsupportedEncodingException {
        GpTouchActivity gpTouchActivity = GpTouchActivity.myActivity;
        return GpTouchActivity.KakaoTalkLinkForApp(str, str2);
    }

    public static long AppTotalMemory() {
        return Debug.getNativeHeapSize();
    }

    public static long AppFreeMemory() {
        return Debug.getNativeHeapFreeSize();
    }

    public static long AppAllocMemory() {
        return Debug.getNativeHeapAllocatedSize();
    }

    public static void OnDestroyApp() {
        Log.d("OnDestroyApp", "OnDestroyApp_OnDestroyApp_OnDestroyApp");
        GpTouchActivity.myActivity.destroyApp();
    }

    public static boolean OnGetAppFlag() {
        return GpTouchGameInit.IsArmPassed();
    }

    public static int OnGetSystemYear() {
        return new GregorianCalendar().get(1);
    }

    public static int OnGetSystemMonth() {
        return new GregorianCalendar().get(2) + 1;
    }

    public static int OnGetSystemDay() {
        return new GregorianCalendar().get(5);
    }

    public static int OnGetSystemHour() {
        return new GregorianCalendar().get(11);
    }

    public static int OnGetSystemDayofWeek() {
        return new GregorianCalendar().get(7);
    }

    public static boolean checkInstallPackage(String str) {
        return myActivity.checkInstallApp(str);
    }

    public static void callExternalAppStart(String str) {
        myActivity.getPackageAppStart(str);
    }

    public static int OnGetNation() {
        Locale locale = GpTouchActivity.myActivity.getResources().getConfiguration().locale;
        if (locale.getCountry().compareTo("KR") == 0) {
            return 0;
        }
        if (locale.getCountry().compareTo("JP") == 0) {
            return 2;
        }
        if (locale.getCountry().compareTo("ID") == 0) {
            return 3;
        }
        if (locale.getCountry().compareTo("DE") == 0) {
            return 4;
        }
        return locale.getCountry().compareTo("FR") == 0 ? 5 : 1;
    }

    public static int OnGetPVPNation() {
        String[] strArr = {"GH", "GA", "GY", "GM", "GP", "GT", "GU", "GD", "GE", "GR", "GL", "GN", "GW", "NA", "NR", "NG", "AQ", "ZA", "NL", "AN", "NP", "NO", "NF", "NC", "NZ", "NU", "NE", "NI", "KR", "DK", "DM", "DO", "DE", "TL", "LA", "LR", "LV", "RU", "LB", "LS", "RE", "RO", "LU", "RW", "LY", "LT", "LI", "MG", "MQ", "MH", "YT", "MO", "MK", "MW", "MY", "ML", "MX", "MC", RequestConfiguration.MAX_AD_CONTENT_RATING_MA, "MU", "MR", "MZ", "MS", "MD", "MV", "MT", "MN", "US", "UM", "VI", "MM", "FM", "VU", "BH", "BB", "VA", "BS", "BD", "BM", "BJ", "VE", "VN", "BE", "BY", "BZ", "BA", "BW", "BO", "BI", "BF", "BV", "BT", "MP", "BG", "BR", "BN", "WS", "SA", "GS", "SM", "ST", "PM", "EH", "SN", "CS", "SC", "LC", "VC", "KN", "SH", "SO", "SB", "SD", "SR", "LK", "SJ", "SZ", "SE", "CH", "ES", "SK", "SI", "SY", "SL", "SG", "AE", "AW", "AM", "AR", "AS", "IS", "HT", "IE", "AZ", "AF", "AD", "AL", "DZ", "AO", "AG", "AI", "ER", "EE", "EC", "ET", "SV", "GB", "VG", "IO", "YE", "OM", "AU", "AT", "HN", "AX", "JO", "UG", "UY", "UZ", "UA", "WF", "IQ", "IR", "IL", "EG", "IT", "ID", "IN", "JP", "JM", "ZM", "GQ", "KP", "CF", "TW", "CN", "DJ", "GI", "ZW", "TD", "CZ", "CL", "CM", "CV", "KZ", "QA", "KH", "CA", "KE", "KY", "KM", "CR", "CC", "CI", "CO", "CG", "CD", "CU", "KW", "CK", "HR", "CX", "KG", "KI", "CY", "TH", "TJ", "TZ", "TC", "TR", "TG", "TK", "TO", "TM", "TV", "TN", "TT", "PA", "PY", "PK", RequestConfiguration.MAX_AD_CONTENT_RATING_PG, "PW", "PS", "FO", "PE", "PT", "FK", "PL", "PR", "FR", "GF", "TF", "PF", "FJ", "FI", "PH", "PN", "HM", "HU", "HK"};
        Locale locale = GpTouchActivity.myActivity.getResources().getConfiguration().locale;
        locale.getCountry();
        for (int i = 0; i < 240; i++) {
            if (locale.getCountry().compareTo(strArr[i]) == 0) {
                return i;
            }
        }
        return 67;
    }

    public static int getNationCode() {
        return GpTouchGameInit.GetNationCode();
    }

    public static int OnGetCountry() {
        return GpTouchActivity.myActivity.getResources().getConfiguration().locale.getCountry().compareTo("KR") == 0 ? 1 : 2;
    }

    public void SetNotice(FrameLayout frameLayout) {
        new FrameLayout.LayoutParams(-1, -1);
        WindowManager windowManager = (WindowManager) getSystemService("window");
        this.m_nRealScrWidth = windowManager.getDefaultDisplay().getWidth();
        float height = windowManager.getDefaultDisplay().getHeight();
        this.m_nRealScrHeight = height;
        float f = this.m_nRealScrWidth;
        this.m_scaleDX = f / 480.0f;
        this.m_scaleDY = height / 800.0f;
        int i = (((int) f) * 12) / 480;
        int i2 = (((int) height) * 88) / 800;
        new LinearLayout(GpTouchActivity.myActivity.getBaseContext()).setPadding(i, i2 - (((int) (this.m_nRealScrHeight * 34.0f)) / 800), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DownNotice() {
        if (OnGetNation() == 0) {
            this.addr += "gamecode=1&ver=" + Integer.toString(this.noticeVer);
        } else {
            this.addr += "gamecode=2&ver=" + Integer.toString(this.noticeVer);
        }
        new Thread(new Runnable() { // from class: com.mrgames.larvaheroesfree.Natives.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Natives.this.addr).openConnection();
                    if (httpURLConnection != null) {
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setUseCaches(false);
                        if (httpURLConnection.getResponseCode() == 200) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                Natives.this.html.append(line + '\n');
                            }
                            bufferedReader.close();
                            Natives natives = Natives.this;
                            natives.CheckNoticeVersion(natives.html.toString());
                        }
                        httpURLConnection.disconnect();
                    }
                } catch (Exception e) {
                    Log.d("DEBUG", "conn : " + e.toString());
                }
            }
        }).start();
    }

    private int getNoticeVersion() {
        String str;
        try {
            FileInputStream fileInputStreamOpenFileInput = openFileInput("noticever");
            byte[] bArr = new byte[fileInputStreamOpenFileInput.available()];
            if (fileInputStreamOpenFileInput.available() == 0) {
                fileInputStreamOpenFileInput.close();
                return 0;
            }
            while (fileInputStreamOpenFileInput.read(bArr) != -1) {
            }
            fileInputStreamOpenFileInput.close();
            str = new String(bArr);
            return Integer.parseInt(str);
        } catch (Exception unused) {
            str = "0";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CheckNoticeVersion(String str) {
        int length = str.length();
        int i = Integer.parseInt(str.substring(0, 1)) + 1;
        this.maxVer = Integer.parseInt(str.substring(1, i));
        String strSubstring = str.substring(i, length);
        int noticeVersion = getNoticeVersion();
        this.noticeVer = noticeVersion;
        if (noticeVersion < this.maxVer) {
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = openFileOutput("notice.html", 3);
                fileOutputStreamOpenFileOutput.write(strSubstring.getBytes());
                fileOutputStreamOpenFileOutput.close();
            } catch (Exception unused) {
            }
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput2 = openFileOutput("noticever", 3);
            fileOutputStreamOpenFileOutput2.write(Integer.toString(this.maxVer).getBytes());
            fileOutputStreamOpenFileOutput2.close();
        } catch (Exception unused2) {
        }
    }

    public static void SetWebView(boolean z) {
        GpTouchGameInit.SetWebview(z);
        GpTouchActivity.myActivity.runOnUiThread(new Runnable() { // from class: com.mrgames.larvaheroesfree.Natives.13
            @Override // java.lang.Runnable
            public void run() {
                if (GpTouchGameInit.GetWebview()) {
                    GpTouchActivity.myActivity.ShowNotice();
                } else {
                    GpTouchActivity.myActivity.HideNotice();
                }
            }
        });
    }

    public static String getDeviceId(Context context) {
        ActivityCompat.checkSelfPermission(GpTouchActivity.myActivity.getBaseContext(), "android.permission.READ_PHONE_STATE");
        Log.d("getDeviceId ", "");
        return "";
    }

    private static byte[] GpTouchReceiveData() {
        return receiveData;
    }

    private static int GpTouchReceiveLength() {
        return receiveLength;
    }

    private static int GpTouchResponseHandler() {
        return GpTouchGameInit.GetNetworkState();
    }

    public static void set_RunGCM(boolean z) {
        if (z) {
            GCM_reRegister();
        } else {
            GCM_unRegister();
        }
    }

    public static void OnCallGPlusApi() {
        nativeSetGplusLoginFirst();
        GpTouchActivity.callGPlusApi();
    }

    public static boolean getGooglePlusLoginState() {
        return GpTouchActivity.myActivity.isSignedIn();
    }

    public static void setGooglePlusLogin() {
        GpTouchGameInit.SetActivityCallCheck(2);
        GpTouchActivity.myActivity.beginUserInitiatedSignIn();
    }

    public static void setGooglePlusLogout() {
        GpTouchGameInit.SetActivityCallCheck(2);
        GpTouchActivity.myActivity.googleSignOut();
    }

    public static void callLeadBoard() {
        GpTouchGameInit.SetActivityCallCheck(2);
        GpTouchActivity.myActivity.getLeadBoard();
    }

    public static void callAchievement() {
        GpTouchGameInit.SetActivityCallCheck(2);
        GpTouchActivity.myActivity.getAchievement();
    }

    public static boolean getClientConnectState() {
        return GpTouchActivity.myActivity.isClientConnected();
    }

    public static void callSendScore(int i) {
        GpTouchGameInit.SetActivityCallCheck(2);
        GpTouchActivity.myActivity.setGameScore(i);
    }

    public static void callUnlockSchievement(int i) {
        GpTouchGameInit.SetActivityCallCheck(2);
        GpTouchActivity.myActivity.setUnlockAchievement(i);
    }

    public static void callInitNAS() {
        GpTouchActivity.myActivity.InitNAS();
    }

    public static byte[] getNetworkUniqueID() {
        return GpTouchGameInit.GetNetworkUniqueiD().getBytes();
    }

    public static void callInitTapjoy() {
        GpTouchActivity.myActivity.connectToTapjoy();
    }

    public static void callTapjoyOffWall() {
        GpTouchActivity.myActivity.callShowOffers();
    }

    public static void setTapjoyListViewState(boolean z) {
        GpTouchGameInit.SetTapjoyListView(z);
    }

    public static boolean getTapjoyListViewState() {
        return GpTouchGameInit.GetTapjoyListView();
    }

    public static void SendGoogleAnalyticsEvent(int i) {
        GpTouchActivity.SendEventGoogleAnalytics(i);
    }

    public static int getTapjoyState() {
        return GpTouchGameInit.GetTapjoyState();
    }
}
