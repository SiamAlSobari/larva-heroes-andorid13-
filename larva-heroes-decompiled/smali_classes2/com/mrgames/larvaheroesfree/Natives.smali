.class public Lcom/mrgames/larvaheroesfree/Natives;
.super Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;
.source "Natives.java"


# static fields
.field private static final AD_UNIT_ID:Ljava/lang/String; = "ca-app-pub-1272300599065219/2854007202"

.field static final REQUEST_GET_ACCOUNTS:I = 0x66

.field static final REQUEST_PHONE_STATE:I = 0x65

.field private static final TAG:Ljava/lang/String; = "Natives"

.field private static adIsLoading:Z = false

.field public static adLayout:Landroid/widget/LinearLayout; = null

.field public static adLayout2:Landroid/widget/LinearLayout; = null

.field public static adLayout3:Landroid/widget/LinearLayout; = null

.field public static adview:Lcom/google/android/gms/ads/AdView; = null

.field public static adview2:Lcom/google/android/gms/ads/AdView; = null

.field public static adview3:Lcom/google/android/gms/ads/AdView; = null

.field public static bPaused:Z = false

.field public static checkCntInterstitialAd:I = 0x1

.field public static checkCurrInterstitialAd:I = 0x1

.field static connectivityManager:Landroid/net/ConnectivityManager; = null

.field static cur_stage:J = 0x0L

.field public static etext_Email:Landroid/widget/EditText; = null

.field public static etext_Nickname:Landroid/widget/EditText; = null

.field public static etext_test:Landroid/widget/EditText; = null

.field public static gdata:Ljava/lang/String; = null

.field public static gdata1:I = 0x0

.field public static gdata2:I = 0x0

.field public static gdata3:I = 0x0

.field public static gdata4:I = 0x0

.field public static getString:[Ljava/lang/String; = null

.field public static gstelecom:Ljava/lang/String; = ""

.field private static interstitialAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd; = null

.field static kill_count:J = 0x0L

.field private static layout:Landroid/widget/FrameLayout; = null

.field public static mAdHalfHeight:I = 0x0

.field public static mAdHalfWidth:I = 0x0

.field public static mAdHeight:I = 0x0

.field public static mAdWidth:I = 0x0

.field public static mAverageSpeed:Landroid/widget/TextView; = null

.field public static mCellMessage:Landroid/view/View; = null

.field public static mDashboard:Landroid/view/View; = null

.field private static mHeight:I = 0x0

.field private static mInputText:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText; = null

.field private static mInstance:Lcom/mrgames/larvaheroesfree/Natives; = null

.field public static mPB:Landroid/widget/ProgressBar; = null

.field private static mPackageName:Ljava/lang/String; = ""

.field public static mPauseButton:Landroid/widget/Button; = null

.field public static mProgressFraction:Landroid/widget/TextView; = null

.field public static mProgressPercent:Landroid/widget/TextView; = null

.field public static mSaveInstanceState:Landroid/os/Bundle; = null

.field public static mScaleH:F = 1.0f

.field public static mScaleW:F = 1.0f

.field public static mStatusText:Landroid/widget/TextView; = null

.field public static mTimeRemaining:Landroid/widget/TextView; = null

.field private static mVideoLayout:Landroid/widget/FrameLayout; = null

.field public static mWiFiSettingsButton:Landroid/widget/Button; = null

.field private static mWidth:I = 0x0

.field public static manager:Landroid/content/pm/PackageManager; = null

.field public static mgrInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd; = null

.field public static network:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork; = null

.field public static phonenumber:Ljava/lang/String; = null

.field static play_time:J = 0x0L

.field static player_level:J = 0x0L

.field private static receiveData:[B = null

.field private static receiveLength:I = 0x0

.field public static s_Email:Ljava/lang/String; = ""

.field public static s_NickName:Ljava/lang/String; = ""

.field public static screenHeight:I

.field public static screenWidth:I

.field public static totalLineCnt:I

.field static total_score:J


# instance fields
.field private Msg:Ljava/lang/String;

.field NoticeHtml:Ljava/lang/String;

.field public adLoadingCheck1:Z

.field public adLoadingCheck2:Z

.field public adLoadingCheck3:Z

.field addr:Ljava/lang/String;

.field public handler:Landroid/os/Handler;

.field html:Ljava/lang/StringBuilder;

.field isSetADView:Z

.field private mGLView:Landroid/opengl/GLSurfaceView;

.field private mLayout:Landroid/widget/FrameLayout;

.field m_nRealScrHeight:F

.field m_nRealScrWidth:F

.field m_scaleDX:F

.field m_scaleDY:F

.field maxVer:I

.field noticeVer:I

.field pBar:Landroid/widget/ProgressBar;

.field private testInterstitial:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "LarvaHeroesGame"

    .line 780
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    .line 2087
    sput-wide v0, Lcom/mrgames/larvaheroesfree/Natives;->kill_count:J

    .line 2088
    sput-wide v0, Lcom/mrgames/larvaheroesfree/Natives;->play_time:J

    .line 2089
    sput-wide v0, Lcom/mrgames/larvaheroesfree/Natives;->total_score:J

    .line 2090
    sput-wide v0, Lcom/mrgames/larvaheroesfree/Natives;->cur_stage:J

    .line 2091
    sput-wide v0, Lcom/mrgames/larvaheroesfree/Natives;->player_level:J

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 88
    invoke-direct {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;-><init>()V

    const/4 v0, 0x0

    .line 168
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->adLoadingCheck1:Z

    .line 169
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->adLoadingCheck2:Z

    .line 170
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->adLoadingCheck3:Z

    .line 463
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->testInterstitial:Z

    .line 464
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->isSetADView:Z

    const-string v1, ""

    .line 1902
    iput-object v1, p0, Lcom/mrgames/larvaheroesfree/Natives;->NoticeHtml:Ljava/lang/String;

    .line 1904
    iput v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->noticeVer:I

    .line 1905
    iput v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->maxVer:I

    .line 1908
    new-instance v0, Lcom/mrgames/larvaheroesfree/Natives$11;

    invoke-direct {v0, p0}, Lcom/mrgames/larvaheroesfree/Natives$11;-><init>(Lcom/mrgames/larvaheroesfree/Natives;)V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->handler:Landroid/os/Handler;

    const-string v0, "http://115.68.42.99:5900/notice.asp?"

    .line 1953
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->addr:Ljava/lang/String;

    .line 1954
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->html:Ljava/lang/StringBuilder;

    return-void
.end method

.method public static AppAllocMemory()J
    .locals 2

    .line 1703
    invoke-static {}, Landroid/os/Debug;->getNativeHeapAllocatedSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public static AppFreeMemory()J
    .locals 2

    .line 1698
    invoke-static {}, Landroid/os/Debug;->getNativeHeapFreeSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public static AppTotalMemory()J
    .locals 2

    .line 1693
    invoke-static {}, Landroid/os/Debug;->getNativeHeapSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public static CallKakaoTalkLink(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 1687
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->KakaoTalkLinkForApp(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private CheckNoticeVersion(Ljava/lang/String;)V
    .locals 3

    .line 2026
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 2027
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v1, v2

    .line 2028
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/mrgames/larvaheroesfree/Natives;->maxVer:I

    .line 2029
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 2030
    invoke-direct {p0}, Lcom/mrgames/larvaheroesfree/Natives;->getNoticeVersion()I

    move-result v0

    iput v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->noticeVer:I

    .line 2031
    iget v1, p0, Lcom/mrgames/larvaheroesfree/Natives;->maxVer:I

    const/4 v2, 0x3

    if-ge v0, v1, :cond_0

    :try_start_0
    const-string v0, "notice.html"

    .line 2034
    invoke-virtual {p0, v0, v2}, Lcom/mrgames/larvaheroesfree/Natives;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    .line 2035
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 2036
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    :try_start_1
    const-string p1, "noticever"

    .line 2043
    invoke-virtual {p0, p1, v2}, Lcom/mrgames/larvaheroesfree/Natives;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object p1

    .line 2044
    iget v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->maxVer:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 2045
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method

.method private DownNotice()V
    .locals 2

    .line 1959
    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->OnGetNation()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/Natives;->addr:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "gamecode=1&ver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mrgames/larvaheroesfree/Natives;->noticeVer:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->addr:Ljava/lang/String;

    goto :goto_0

    .line 1960
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/Natives;->addr:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "gamecode=2&ver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/mrgames/larvaheroesfree/Natives;->noticeVer:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->addr:Ljava/lang/String;

    .line 1962
    :goto_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/mrgames/larvaheroesfree/Natives$12;

    invoke-direct {v1, p0}, Lcom/mrgames/larvaheroesfree/Natives$12;-><init>(Lcom/mrgames/larvaheroesfree/Natives;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1990
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static GetPhoneModel()I
    .locals 1

    .line 1600
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetPhoneModel()I

    move-result v0

    return v0
.end method

.method private static GpTouchReceiveData()[B
    .locals 1

    .line 2095
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->receiveData:[B

    return-object v0
.end method

.method private static GpTouchReceiveLength()I
    .locals 1

    .line 2099
    sget v0, Lcom/mrgames/larvaheroesfree/Natives;->receiveLength:I

    return v0
.end method

.method private static GpTouchRequestPurchase(ILjava/lang/String;[B)V
    .locals 1

    .line 1608
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, p0, p1, p2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->requestPurchase(ILjava/lang/String;[B)V

    return-void
.end method

.method private static GpTouchResponseHandler()I
    .locals 1

    .line 2103
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetNetworkState()I

    move-result v0

    return v0
.end method

.method public static OnADHalfHeight()I
    .locals 1

    .line 1371
    sget v0, Lcom/mrgames/larvaheroesfree/Natives;->mAdHalfHeight:I

    return v0
.end method

.method public static OnADHalfWidth()I
    .locals 1

    .line 1367
    sget v0, Lcom/mrgames/larvaheroesfree/Natives;->mAdHalfWidth:I

    return v0
.end method

.method public static OnADHeight()I
    .locals 1

    .line 1363
    sget v0, Lcom/mrgames/larvaheroesfree/Natives;->mAdHeight:I

    return v0
.end method

.method public static OnADWidth()I
    .locals 1

    .line 1359
    sget v0, Lcom/mrgames/larvaheroesfree/Natives;->mAdWidth:I

    return v0
.end method

.method public static OnCallGPlusApi()V
    .locals 0

    .line 2115
    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->nativeSetGplusLoginFirst()V

    .line 2116
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->callGPlusApi()V

    return-void
.end method

.method public static OnDestroyApp()V
    .locals 2

    const-string v0, "OnDestroyApp"

    const-string v1, "OnDestroyApp_OnDestroyApp_OnDestroyApp"

    .line 1707
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1708
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->destroyApp()V

    return-void
.end method

.method public static OnGetADMobRewardCloseState()I
    .locals 1

    .line 793
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetADMobRewardCloseState()I

    move-result v0

    return v0
.end method

.method public static OnGetADMobRewardState()I
    .locals 1

    .line 789
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetADMobRewardState()I

    move-result v0

    return v0
.end method

.method public static OnGetAdLevelViewState()I
    .locals 1

    .line 1389
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview3:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 1392
    :cond_0
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetBannerAdLevelViewState()I

    move-result v0

    return v0
.end method

.method public static OnGetAdViewState()I
    .locals 1

    .line 1375
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 1378
    :cond_0
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetBannerAdState()I

    move-result v0

    return v0
.end method

.method public static OnGetAdViewState2()I
    .locals 1

    .line 1382
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview2:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 1385
    :cond_0
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetBannerAdState2()I

    move-result v0

    return v0
.end method

.method public static OnGetAppFlag()Z
    .locals 1

    .line 1712
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->IsArmPassed()Z

    move-result v0

    return v0
.end method

.method public static OnGetCountry()I
    .locals 2

    .line 1825
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1826
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v1, "KR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x2

    return v0
.end method

.method public static OnGetFullAdState()I
    .locals 1

    .line 784
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetFullAdState()I

    move-result v0

    return v0
.end method

.method public static OnGetNation()I
    .locals 3

    .line 1761
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1763
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    const-string v2, "KR"

    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 1765
    :cond_0
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    const-string v2, "JP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x2

    return v0

    .line 1767
    :cond_1
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ID"

    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_2

    const/4 v0, 0x3

    return v0

    .line 1769
    :cond_2
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_3

    const/4 v0, 0x4

    return v0

    .line 1771
    :cond_3
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x5

    return v0

    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public static OnGetPVPNation()I
    .locals 7

    const/16 v0, 0xf0

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "GH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    const-string v4, "GA"

    aput-object v4, v1, v2

    const/4 v2, 0x2

    const-string v4, "GY"

    aput-object v4, v1, v2

    const/4 v2, 0x3

    const-string v4, "GM"

    aput-object v4, v1, v2

    const/4 v2, 0x4

    const-string v4, "GP"

    aput-object v4, v1, v2

    const/4 v2, 0x5

    const-string v4, "GT"

    aput-object v4, v1, v2

    const/4 v2, 0x6

    const-string v4, "GU"

    aput-object v4, v1, v2

    const/4 v2, 0x7

    const-string v4, "GD"

    aput-object v4, v1, v2

    const/16 v2, 0x8

    const-string v4, "GE"

    aput-object v4, v1, v2

    const/16 v2, 0x9

    const-string v4, "GR"

    aput-object v4, v1, v2

    const/16 v2, 0xa

    const-string v4, "GL"

    aput-object v4, v1, v2

    const/16 v2, 0xb

    const-string v4, "GN"

    aput-object v4, v1, v2

    const/16 v2, 0xc

    const-string v4, "GW"

    aput-object v4, v1, v2

    const/16 v2, 0xd

    const-string v4, "NA"

    aput-object v4, v1, v2

    const/16 v2, 0xe

    const-string v4, "NR"

    aput-object v4, v1, v2

    const/16 v2, 0xf

    const-string v4, "NG"

    aput-object v4, v1, v2

    const/16 v2, 0x10

    const-string v4, "AQ"

    aput-object v4, v1, v2

    const/16 v2, 0x11

    const-string v4, "ZA"

    aput-object v4, v1, v2

    const/16 v2, 0x12

    const-string v4, "NL"

    aput-object v4, v1, v2

    const/16 v2, 0x13

    const-string v4, "AN"

    aput-object v4, v1, v2

    const/16 v2, 0x14

    const-string v4, "NP"

    aput-object v4, v1, v2

    const/16 v2, 0x15

    const-string v4, "NO"

    aput-object v4, v1, v2

    const/16 v2, 0x16

    const-string v4, "NF"

    aput-object v4, v1, v2

    const/16 v2, 0x17

    const-string v4, "NC"

    aput-object v4, v1, v2

    const/16 v2, 0x18

    const-string v4, "NZ"

    aput-object v4, v1, v2

    const/16 v2, 0x19

    const-string v4, "NU"

    aput-object v4, v1, v2

    const/16 v2, 0x1a

    const-string v4, "NE"

    aput-object v4, v1, v2

    const/16 v2, 0x1b

    const-string v4, "NI"

    aput-object v4, v1, v2

    const/16 v2, 0x1c

    const-string v4, "KR"

    aput-object v4, v1, v2

    const/16 v2, 0x1d

    const-string v4, "DK"

    aput-object v4, v1, v2

    const/16 v2, 0x1e

    const-string v4, "DM"

    aput-object v4, v1, v2

    const/16 v2, 0x1f

    const-string v4, "DO"

    aput-object v4, v1, v2

    const/16 v2, 0x20

    const-string v4, "DE"

    aput-object v4, v1, v2

    const/16 v2, 0x21

    const-string v4, "TL"

    aput-object v4, v1, v2

    const/16 v2, 0x22

    const-string v4, "LA"

    aput-object v4, v1, v2

    const/16 v2, 0x23

    const-string v4, "LR"

    aput-object v4, v1, v2

    const/16 v2, 0x24

    const-string v4, "LV"

    aput-object v4, v1, v2

    const/16 v2, 0x25

    const-string v4, "RU"

    aput-object v4, v1, v2

    const/16 v2, 0x26

    const-string v4, "LB"

    aput-object v4, v1, v2

    const/16 v2, 0x27

    const-string v4, "LS"

    aput-object v4, v1, v2

    const/16 v2, 0x28

    const-string v4, "RE"

    aput-object v4, v1, v2

    const/16 v2, 0x29

    const-string v4, "RO"

    aput-object v4, v1, v2

    const/16 v2, 0x2a

    const-string v4, "LU"

    aput-object v4, v1, v2

    const/16 v2, 0x2b

    const-string v4, "RW"

    aput-object v4, v1, v2

    const/16 v2, 0x2c

    const-string v4, "LY"

    aput-object v4, v1, v2

    const/16 v2, 0x2d

    const-string v4, "LT"

    aput-object v4, v1, v2

    const/16 v2, 0x2e

    const-string v4, "LI"

    aput-object v4, v1, v2

    const/16 v2, 0x2f

    const-string v4, "MG"

    aput-object v4, v1, v2

    const/16 v2, 0x30

    const-string v4, "MQ"

    aput-object v4, v1, v2

    const/16 v2, 0x31

    const-string v4, "MH"

    aput-object v4, v1, v2

    const/16 v2, 0x32

    const-string v4, "YT"

    aput-object v4, v1, v2

    const/16 v2, 0x33

    const-string v4, "MO"

    aput-object v4, v1, v2

    const/16 v2, 0x34

    const-string v4, "MK"

    aput-object v4, v1, v2

    const/16 v2, 0x35

    const-string v4, "MW"

    aput-object v4, v1, v2

    const/16 v2, 0x36

    const-string v4, "MY"

    aput-object v4, v1, v2

    const/16 v2, 0x37

    const-string v4, "ML"

    aput-object v4, v1, v2

    const/16 v2, 0x38

    const-string v4, "MX"

    aput-object v4, v1, v2

    const/16 v2, 0x39

    const-string v4, "MC"

    aput-object v4, v1, v2

    const/16 v2, 0x3a

    const-string v4, "MA"

    aput-object v4, v1, v2

    const/16 v2, 0x3b

    const-string v4, "MU"

    aput-object v4, v1, v2

    const/16 v2, 0x3c

    const-string v4, "MR"

    aput-object v4, v1, v2

    const/16 v2, 0x3d

    const-string v4, "MZ"

    aput-object v4, v1, v2

    const/16 v2, 0x3e

    const-string v4, "MS"

    aput-object v4, v1, v2

    const/16 v2, 0x3f

    const-string v4, "MD"

    aput-object v4, v1, v2

    const/16 v2, 0x40

    const-string v4, "MV"

    aput-object v4, v1, v2

    const/16 v2, 0x41

    const-string v4, "MT"

    aput-object v4, v1, v2

    const/16 v2, 0x42

    const-string v4, "MN"

    aput-object v4, v1, v2

    const-string v2, "US"

    const/16 v4, 0x43

    aput-object v2, v1, v4

    const/16 v2, 0x44

    const-string v5, "UM"

    aput-object v5, v1, v2

    const/16 v2, 0x45

    const-string v5, "VI"

    aput-object v5, v1, v2

    const/16 v2, 0x46

    const-string v5, "MM"

    aput-object v5, v1, v2

    const/16 v2, 0x47

    const-string v5, "FM"

    aput-object v5, v1, v2

    const/16 v2, 0x48

    const-string v5, "VU"

    aput-object v5, v1, v2

    const/16 v2, 0x49

    const-string v5, "BH"

    aput-object v5, v1, v2

    const/16 v2, 0x4a

    const-string v5, "BB"

    aput-object v5, v1, v2

    const/16 v2, 0x4b

    const-string v5, "VA"

    aput-object v5, v1, v2

    const/16 v2, 0x4c

    const-string v5, "BS"

    aput-object v5, v1, v2

    const/16 v2, 0x4d

    const-string v5, "BD"

    aput-object v5, v1, v2

    const/16 v2, 0x4e

    const-string v5, "BM"

    aput-object v5, v1, v2

    const/16 v2, 0x4f

    const-string v5, "BJ"

    aput-object v5, v1, v2

    const/16 v2, 0x50

    const-string v5, "VE"

    aput-object v5, v1, v2

    const/16 v2, 0x51

    const-string v5, "VN"

    aput-object v5, v1, v2

    const/16 v2, 0x52

    const-string v5, "BE"

    aput-object v5, v1, v2

    const/16 v2, 0x53

    const-string v5, "BY"

    aput-object v5, v1, v2

    const/16 v2, 0x54

    const-string v5, "BZ"

    aput-object v5, v1, v2

    const/16 v2, 0x55

    const-string v5, "BA"

    aput-object v5, v1, v2

    const/16 v2, 0x56

    const-string v5, "BW"

    aput-object v5, v1, v2

    const/16 v2, 0x57

    const-string v5, "BO"

    aput-object v5, v1, v2

    const/16 v2, 0x58

    const-string v5, "BI"

    aput-object v5, v1, v2

    const/16 v2, 0x59

    const-string v5, "BF"

    aput-object v5, v1, v2

    const/16 v2, 0x5a

    const-string v5, "BV"

    aput-object v5, v1, v2

    const/16 v2, 0x5b

    const-string v5, "BT"

    aput-object v5, v1, v2

    const/16 v2, 0x5c

    const-string v5, "MP"

    aput-object v5, v1, v2

    const/16 v2, 0x5d

    const-string v5, "BG"

    aput-object v5, v1, v2

    const/16 v2, 0x5e

    const-string v5, "BR"

    aput-object v5, v1, v2

    const/16 v2, 0x5f

    const-string v5, "BN"

    aput-object v5, v1, v2

    const/16 v2, 0x60

    const-string v5, "WS"

    aput-object v5, v1, v2

    const/16 v2, 0x61

    const-string v5, "SA"

    aput-object v5, v1, v2

    const/16 v2, 0x62

    const-string v5, "GS"

    aput-object v5, v1, v2

    const/16 v2, 0x63

    const-string v5, "SM"

    aput-object v5, v1, v2

    const/16 v2, 0x64

    const-string v5, "ST"

    aput-object v5, v1, v2

    const/16 v2, 0x65

    const-string v5, "PM"

    aput-object v5, v1, v2

    const/16 v2, 0x66

    const-string v5, "EH"

    aput-object v5, v1, v2

    const/16 v2, 0x67

    const-string v5, "SN"

    aput-object v5, v1, v2

    const/16 v2, 0x68

    const-string v5, "CS"

    aput-object v5, v1, v2

    const/16 v2, 0x69

    const-string v5, "SC"

    aput-object v5, v1, v2

    const/16 v2, 0x6a

    const-string v5, "LC"

    aput-object v5, v1, v2

    const/16 v2, 0x6b

    const-string v5, "VC"

    aput-object v5, v1, v2

    const/16 v2, 0x6c

    const-string v5, "KN"

    aput-object v5, v1, v2

    const/16 v2, 0x6d

    const-string v5, "SH"

    aput-object v5, v1, v2

    const/16 v2, 0x6e

    const-string v5, "SO"

    aput-object v5, v1, v2

    const/16 v2, 0x6f

    const-string v5, "SB"

    aput-object v5, v1, v2

    const/16 v2, 0x70

    const-string v5, "SD"

    aput-object v5, v1, v2

    const/16 v2, 0x71

    const-string v5, "SR"

    aput-object v5, v1, v2

    const/16 v2, 0x72

    const-string v5, "LK"

    aput-object v5, v1, v2

    const/16 v2, 0x73

    const-string v5, "SJ"

    aput-object v5, v1, v2

    const/16 v2, 0x74

    const-string v5, "SZ"

    aput-object v5, v1, v2

    const/16 v2, 0x75

    const-string v5, "SE"

    aput-object v5, v1, v2

    const/16 v2, 0x76

    const-string v5, "CH"

    aput-object v5, v1, v2

    const/16 v2, 0x77

    const-string v5, "ES"

    aput-object v5, v1, v2

    const/16 v2, 0x78

    const-string v5, "SK"

    aput-object v5, v1, v2

    const/16 v2, 0x79

    const-string v5, "SI"

    aput-object v5, v1, v2

    const/16 v2, 0x7a

    const-string v5, "SY"

    aput-object v5, v1, v2

    const/16 v2, 0x7b

    const-string v5, "SL"

    aput-object v5, v1, v2

    const/16 v2, 0x7c

    const-string v5, "SG"

    aput-object v5, v1, v2

    const/16 v2, 0x7d

    const-string v5, "AE"

    aput-object v5, v1, v2

    const/16 v2, 0x7e

    const-string v5, "AW"

    aput-object v5, v1, v2

    const/16 v2, 0x7f

    const-string v5, "AM"

    aput-object v5, v1, v2

    const/16 v2, 0x80

    const-string v5, "AR"

    aput-object v5, v1, v2

    const/16 v2, 0x81

    const-string v5, "AS"

    aput-object v5, v1, v2

    const/16 v2, 0x82

    const-string v5, "IS"

    aput-object v5, v1, v2

    const/16 v2, 0x83

    const-string v5, "HT"

    aput-object v5, v1, v2

    const/16 v2, 0x84

    const-string v5, "IE"

    aput-object v5, v1, v2

    const/16 v2, 0x85

    const-string v5, "AZ"

    aput-object v5, v1, v2

    const/16 v2, 0x86

    const-string v5, "AF"

    aput-object v5, v1, v2

    const/16 v2, 0x87

    const-string v5, "AD"

    aput-object v5, v1, v2

    const/16 v2, 0x88

    const-string v5, "AL"

    aput-object v5, v1, v2

    const/16 v2, 0x89

    const-string v5, "DZ"

    aput-object v5, v1, v2

    const/16 v2, 0x8a

    const-string v5, "AO"

    aput-object v5, v1, v2

    const/16 v2, 0x8b

    const-string v5, "AG"

    aput-object v5, v1, v2

    const/16 v2, 0x8c

    const-string v5, "AI"

    aput-object v5, v1, v2

    const/16 v2, 0x8d

    const-string v5, "ER"

    aput-object v5, v1, v2

    const/16 v2, 0x8e

    const-string v5, "EE"

    aput-object v5, v1, v2

    const/16 v2, 0x8f

    const-string v5, "EC"

    aput-object v5, v1, v2

    const/16 v2, 0x90

    const-string v5, "ET"

    aput-object v5, v1, v2

    const/16 v2, 0x91

    const-string v5, "SV"

    aput-object v5, v1, v2

    const/16 v2, 0x92

    const-string v5, "GB"

    aput-object v5, v1, v2

    const/16 v2, 0x93

    const-string v5, "VG"

    aput-object v5, v1, v2

    const/16 v2, 0x94

    const-string v5, "IO"

    aput-object v5, v1, v2

    const/16 v2, 0x95

    const-string v5, "YE"

    aput-object v5, v1, v2

    const/16 v2, 0x96

    const-string v5, "OM"

    aput-object v5, v1, v2

    const/16 v2, 0x97

    const-string v5, "AU"

    aput-object v5, v1, v2

    const/16 v2, 0x98

    const-string v5, "AT"

    aput-object v5, v1, v2

    const/16 v2, 0x99

    const-string v5, "HN"

    aput-object v5, v1, v2

    const/16 v2, 0x9a

    const-string v5, "AX"

    aput-object v5, v1, v2

    const/16 v2, 0x9b

    const-string v5, "JO"

    aput-object v5, v1, v2

    const/16 v2, 0x9c

    const-string v5, "UG"

    aput-object v5, v1, v2

    const/16 v2, 0x9d

    const-string v5, "UY"

    aput-object v5, v1, v2

    const/16 v2, 0x9e

    const-string v5, "UZ"

    aput-object v5, v1, v2

    const/16 v2, 0x9f

    const-string v5, "UA"

    aput-object v5, v1, v2

    const/16 v2, 0xa0

    const-string v5, "WF"

    aput-object v5, v1, v2

    const/16 v2, 0xa1

    const-string v5, "IQ"

    aput-object v5, v1, v2

    const/16 v2, 0xa2

    const-string v5, "IR"

    aput-object v5, v1, v2

    const/16 v2, 0xa3

    const-string v5, "IL"

    aput-object v5, v1, v2

    const/16 v2, 0xa4

    const-string v5, "EG"

    aput-object v5, v1, v2

    const/16 v2, 0xa5

    const-string v5, "IT"

    aput-object v5, v1, v2

    const/16 v2, 0xa6

    const-string v5, "ID"

    aput-object v5, v1, v2

    const/16 v2, 0xa7

    const-string v5, "IN"

    aput-object v5, v1, v2

    const/16 v2, 0xa8

    const-string v5, "JP"

    aput-object v5, v1, v2

    const/16 v2, 0xa9

    const-string v5, "JM"

    aput-object v5, v1, v2

    const/16 v2, 0xaa

    const-string v5, "ZM"

    aput-object v5, v1, v2

    const/16 v2, 0xab

    const-string v5, "GQ"

    aput-object v5, v1, v2

    const/16 v2, 0xac

    const-string v5, "KP"

    aput-object v5, v1, v2

    const/16 v2, 0xad

    const-string v5, "CF"

    aput-object v5, v1, v2

    const/16 v2, 0xae

    const-string v5, "TW"

    aput-object v5, v1, v2

    const/16 v2, 0xaf

    const-string v5, "CN"

    aput-object v5, v1, v2

    const/16 v2, 0xb0

    const-string v5, "DJ"

    aput-object v5, v1, v2

    const/16 v2, 0xb1

    const-string v5, "GI"

    aput-object v5, v1, v2

    const/16 v2, 0xb2

    const-string v5, "ZW"

    aput-object v5, v1, v2

    const/16 v2, 0xb3

    const-string v5, "TD"

    aput-object v5, v1, v2

    const/16 v2, 0xb4

    const-string v5, "CZ"

    aput-object v5, v1, v2

    const/16 v2, 0xb5

    const-string v5, "CL"

    aput-object v5, v1, v2

    const/16 v2, 0xb6

    const-string v5, "CM"

    aput-object v5, v1, v2

    const/16 v2, 0xb7

    const-string v5, "CV"

    aput-object v5, v1, v2

    const/16 v2, 0xb8

    const-string v5, "KZ"

    aput-object v5, v1, v2

    const/16 v2, 0xb9

    const-string v5, "QA"

    aput-object v5, v1, v2

    const/16 v2, 0xba

    const-string v5, "KH"

    aput-object v5, v1, v2

    const/16 v2, 0xbb

    const-string v5, "CA"

    aput-object v5, v1, v2

    const/16 v2, 0xbc

    const-string v5, "KE"

    aput-object v5, v1, v2

    const/16 v2, 0xbd

    const-string v5, "KY"

    aput-object v5, v1, v2

    const/16 v2, 0xbe

    const-string v5, "KM"

    aput-object v5, v1, v2

    const/16 v2, 0xbf

    const-string v5, "CR"

    aput-object v5, v1, v2

    const/16 v2, 0xc0

    const-string v5, "CC"

    aput-object v5, v1, v2

    const/16 v2, 0xc1

    const-string v5, "CI"

    aput-object v5, v1, v2

    const/16 v2, 0xc2

    const-string v5, "CO"

    aput-object v5, v1, v2

    const/16 v2, 0xc3

    const-string v5, "CG"

    aput-object v5, v1, v2

    const/16 v2, 0xc4

    const-string v5, "CD"

    aput-object v5, v1, v2

    const/16 v2, 0xc5

    const-string v5, "CU"

    aput-object v5, v1, v2

    const/16 v2, 0xc6

    const-string v5, "KW"

    aput-object v5, v1, v2

    const/16 v2, 0xc7

    const-string v5, "CK"

    aput-object v5, v1, v2

    const/16 v2, 0xc8

    const-string v5, "HR"

    aput-object v5, v1, v2

    const/16 v2, 0xc9

    const-string v5, "CX"

    aput-object v5, v1, v2

    const/16 v2, 0xca

    const-string v5, "KG"

    aput-object v5, v1, v2

    const/16 v2, 0xcb

    const-string v5, "KI"

    aput-object v5, v1, v2

    const/16 v2, 0xcc

    const-string v5, "CY"

    aput-object v5, v1, v2

    const/16 v2, 0xcd

    const-string v5, "TH"

    aput-object v5, v1, v2

    const/16 v2, 0xce

    const-string v5, "TJ"

    aput-object v5, v1, v2

    const/16 v2, 0xcf

    const-string v5, "TZ"

    aput-object v5, v1, v2

    const/16 v2, 0xd0

    const-string v5, "TC"

    aput-object v5, v1, v2

    const/16 v2, 0xd1

    const-string v5, "TR"

    aput-object v5, v1, v2

    const/16 v2, 0xd2

    const-string v5, "TG"

    aput-object v5, v1, v2

    const/16 v2, 0xd3

    const-string v5, "TK"

    aput-object v5, v1, v2

    const/16 v2, 0xd4

    const-string v5, "TO"

    aput-object v5, v1, v2

    const/16 v2, 0xd5

    const-string v5, "TM"

    aput-object v5, v1, v2

    const/16 v2, 0xd6

    const-string v5, "TV"

    aput-object v5, v1, v2

    const/16 v2, 0xd7

    const-string v5, "TN"

    aput-object v5, v1, v2

    const/16 v2, 0xd8

    const-string v5, "TT"

    aput-object v5, v1, v2

    const/16 v2, 0xd9

    const-string v5, "PA"

    aput-object v5, v1, v2

    const/16 v2, 0xda

    const-string v5, "PY"

    aput-object v5, v1, v2

    const/16 v2, 0xdb

    const-string v5, "PK"

    aput-object v5, v1, v2

    const/16 v2, 0xdc

    const-string v5, "PG"

    aput-object v5, v1, v2

    const/16 v2, 0xdd

    const-string v5, "PW"

    aput-object v5, v1, v2

    const/16 v2, 0xde

    const-string v5, "PS"

    aput-object v5, v1, v2

    const/16 v2, 0xdf

    const-string v5, "FO"

    aput-object v5, v1, v2

    const/16 v2, 0xe0

    const-string v5, "PE"

    aput-object v5, v1, v2

    const/16 v2, 0xe1

    const-string v5, "PT"

    aput-object v5, v1, v2

    const/16 v2, 0xe2

    const-string v5, "FK"

    aput-object v5, v1, v2

    const/16 v2, 0xe3

    const-string v5, "PL"

    aput-object v5, v1, v2

    const/16 v2, 0xe4

    const-string v5, "PR"

    aput-object v5, v1, v2

    const/16 v2, 0xe5

    const-string v5, "FR"

    aput-object v5, v1, v2

    const/16 v2, 0xe6

    const-string v5, "GF"

    aput-object v5, v1, v2

    const/16 v2, 0xe7

    const-string v5, "TF"

    aput-object v5, v1, v2

    const/16 v2, 0xe8

    const-string v5, "PF"

    aput-object v5, v1, v2

    const/16 v2, 0xe9

    const-string v5, "FJ"

    aput-object v5, v1, v2

    const/16 v2, 0xea

    const-string v5, "FI"

    aput-object v5, v1, v2

    const/16 v2, 0xeb

    const-string v5, "PH"

    aput-object v5, v1, v2

    const/16 v2, 0xec

    const-string v5, "PN"

    aput-object v5, v1, v2

    const/16 v2, 0xed

    const-string v5, "HM"

    aput-object v5, v1, v2

    const/16 v2, 0xee

    const-string v5, "HU"

    aput-object v5, v1, v2

    const/16 v2, 0xef

    const-string v5, "HK"

    aput-object v5, v1, v2

    .line 1806
    sget-object v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget-object v2, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1807
    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    :goto_0
    if-ge v3, v0, :cond_1

    .line 1811
    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v5

    aget-object v6, v1, v3

    invoke-virtual {v5, v6}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_0

    move v4, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v4
.end method

.method public static OnGetPushItemState()I
    .locals 1

    .line 1649
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetPushItem()I

    move-result v0

    return v0
.end method

.method public static OnGetSystemDay()I
    .locals 2

    .line 1730
    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    const/4 v1, 0x5

    .line 1731
    invoke-virtual {v0, v1}, Ljava/util/GregorianCalendar;->get(I)I

    move-result v0

    return v0
.end method

.method public static OnGetSystemDayofWeek()I
    .locals 2

    .line 1744
    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    const/4 v1, 0x7

    .line 1745
    invoke-virtual {v0, v1}, Ljava/util/GregorianCalendar;->get(I)I

    move-result v0

    return v0
.end method

.method public static OnGetSystemHour()I
    .locals 2

    .line 1737
    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    const/16 v1, 0xb

    .line 1738
    invoke-virtual {v0, v1}, Ljava/util/GregorianCalendar;->get(I)I

    move-result v0

    return v0
.end method

.method public static OnGetSystemMonth()I
    .locals 2

    .line 1723
    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    const/4 v1, 0x2

    .line 1724
    invoke-virtual {v0, v1}, Ljava/util/GregorianCalendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static OnGetSystemYear()I
    .locals 2

    .line 1716
    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    const/4 v1, 0x1

    .line 1717
    invoke-virtual {v0, v1}, Ljava/util/GregorianCalendar;->get(I)I

    move-result v0

    return v0
.end method

.method public static OnGetUnityAdCloseState()I
    .locals 1

    .line 809
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetUnityAdCloseState()I

    move-result v0

    return v0
.end method

.method public static OnGetUnityAdState()I
    .locals 1

    .line 805
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetUnityAdState()I

    move-result v0

    return v0
.end method

.method public static OnGetVungleCloseState()I
    .locals 1

    .line 836
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetVungleCloseState()I

    move-result v0

    return v0
.end method

.method public static OnGetVungleState()I
    .locals 1

    .line 832
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetVungleState()I

    move-result v0

    return v0
.end method

.method public static OnSetADMobRewardView(Z)V
    .locals 0

    .line 797
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/Natives;->SetADMobRewardView(Z)V

    return-void
.end method

.method public static OnSetAbMob(Z)V
    .locals 1

    .line 1397
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->IsUseAdMob()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1398
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetShowAdMob(Z)V

    .line 1399
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v0, Lcom/mrgames/larvaheroesfree/Natives$5;

    invoke-direct {v0}, Lcom/mrgames/larvaheroesfree/Natives$5;-><init>()V

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static OnSetAbMob2(Z)V
    .locals 1

    .line 1422
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->IsUseAdMob()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1423
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetShowAdMob(Z)V

    .line 1424
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v0, Lcom/mrgames/larvaheroesfree/Natives$6;

    invoke-direct {v0}, Lcom/mrgames/larvaheroesfree/Natives$6;-><init>()V

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static OnSetAbMobLevelView(Z)V
    .locals 1

    .line 1473
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->IsUseAdMob()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1474
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetShowAdMob3(Z)V

    .line 1475
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v0, Lcom/mrgames/larvaheroesfree/Natives$8;

    invoke-direct {v0}, Lcom/mrgames/larvaheroesfree/Natives$8;-><init>()V

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static OnSetAbMobPlay(Z)V
    .locals 1

    .line 1448
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->IsUseAdMob()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1449
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetShowAdMob2(Z)V

    .line 1450
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v0, Lcom/mrgames/larvaheroesfree/Natives$7;

    invoke-direct {v0}, Lcom/mrgames/larvaheroesfree/Natives$7;-><init>()V

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private static OnSetBGMVolume(I)V
    .locals 0

    return-void
.end method

.method public static OnSetFullAdMob(Z)V
    .locals 1

    .line 1497
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v0, Lcom/mrgames/larvaheroesfree/Natives$9;

    invoke-direct {v0}, Lcom/mrgames/larvaheroesfree/Natives$9;-><init>()V

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static OnSetFullAdView(Z)V
    .locals 1

    .line 1561
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v0, Lcom/mrgames/larvaheroesfree/Natives$10;

    invoke-direct {v0}, Lcom/mrgames/larvaheroesfree/Natives$10;-><init>()V

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static OnSetNickname(Z)V
    .locals 0

    return-void
.end method

.method public static OnSetSubscribeTopic(Z)V
    .locals 1

    .line 1513
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->setSubscribeTopic(Z)V

    return-void
.end method

.method public static OnSetUnityAdView(Z)V
    .locals 1

    .line 813
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->SetUnityAdView(Z)V

    return-void
.end method

.method private static OnSoundLoad(IZ)V
    .locals 3

    .line 1295
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "===== OnSoundLoad(0) sndID:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",isLoop:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1296
    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->loadSoundEx(IZ)Z

    return-void
.end method

.method public static OnSoundMakeList([Ljava/lang/String;I)V
    .locals 2

    const-string v0, "MY_LOG"

    const-string v1, "OnSoundMakeList@#@#@#@#@#@#@"

    .line 1290
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1291
    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->makeSoundList([Ljava/lang/String;I)V

    return-void
.end method

.method private static OnSoundPlay(IZ)V
    .locals 2

    .line 1306
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->getVolume()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 1308
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->stopBGMSound()V

    return-void

    .line 1312
    :cond_0
    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->playIdxSound(IZ)V

    return-void
.end method

.method private static OnSoundPlayBGMforPath(Ljava/lang/String;IZ)V
    .locals 0

    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    return-void

    .line 1339
    :cond_0
    div-int/lit8 p1, p1, 0xa

    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->setVolume(I)V

    .line 1341
    invoke-static {p0, p2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->playPathSound(Ljava/lang/String;Z)V

    return-void
.end method

.method private static OnSoundPlayNoLoop(I)V
    .locals 2

    .line 1317
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->getVolume()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    return-void

    .line 1320
    :cond_0
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->playIdxSoundNoLoop(I)V

    return-void
.end method

.method private static OnSoundPlaySfx(I)V
    .locals 2

    .line 1325
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->getVolume()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    return-void

    .line 1330
    :cond_0
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->playIdxSoundSfx(I)V

    return-void
.end method

.method private static OnSoundRelease()V
    .locals 0

    .line 1300
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->stopAllSound()V

    .line 1301
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->releaseSFXSound()V

    return-void
.end method

.method private static OnStopSound()V
    .locals 0

    .line 1345
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->stopAllSound()V

    return-void
.end method

.method private static OnVibrate(I)V
    .locals 3

    .line 1349
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "===== OnVibrate() time:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1350
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->Vibrator(I)V

    return-void
.end method

.method public static OnsetPushItemState()V
    .locals 1

    const/4 v0, 0x0

    .line 1654
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetPushItem(I)V

    return-void
.end method

.method public static SendGoogleAnalyticsEvent(I)V
    .locals 0

    .line 2250
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->SendEventGoogleAnalytics(I)V

    return-void
.end method

.method public static SetADMobRewardView(Z)V
    .locals 0

    return-void
.end method

.method public static SetWebView(Z)V
    .locals 1

    .line 2052
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetWebview(Z)V

    .line 2053
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v0, Lcom/mrgames/larvaheroesfree/Natives$13;

    invoke-direct {v0}, Lcom/mrgames/larvaheroesfree/Natives$13;-><init>()V

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic access$002(Z)Z
    .locals 0

    .line 88
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/Natives;->adIsLoading:Z

    return p0
.end method

.method static synthetic access$100(Lcom/mrgames/larvaheroesfree/Natives;)Z
    .locals 0

    .line 88
    iget-boolean p0, p0, Lcom/mrgames/larvaheroesfree/Natives;->testInterstitial:Z

    return p0
.end method

.method static synthetic access$200()Lcom/mrgames/larvaheroesfree/Natives;
    .locals 1

    .line 88
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->mInstance:Lcom/mrgames/larvaheroesfree/Natives;

    return-object v0
.end method

.method static synthetic access$300(Lcom/mrgames/larvaheroesfree/Natives;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lcom/mrgames/larvaheroesfree/Natives;->DownNotice()V

    return-void
.end method

.method static synthetic access$400(Lcom/mrgames/larvaheroesfree/Natives;Ljava/lang/String;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lcom/mrgames/larvaheroesfree/Natives;->CheckNoticeVersion(Ljava/lang/String;)V

    return-void
.end method

.method public static callAchievement()V
    .locals 1

    const/4 v0, 0x2

    .line 2145
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetActivityCallCheck(I)V

    .line 2146
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAchievement()V

    return-void
.end method

.method public static callExternalAppStart(Ljava/lang/String;)V
    .locals 1

    .line 1757
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getPackageAppStart(Ljava/lang/String;)V

    return-void
.end method

.method public static callInitNAS()V
    .locals 1

    .line 2171
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->InitNAS()V

    return-void
.end method

.method public static callInitTapjoy()V
    .locals 1

    .line 2229
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->connectToTapjoy()V

    return-void
.end method

.method public static callLeadBoard()V
    .locals 1

    const/4 v0, 0x2

    .line 2139
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetActivityCallCheck(I)V

    .line 2140
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getLeadBoard()V

    return-void
.end method

.method public static callSendScore(I)V
    .locals 1

    const/4 v0, 0x2

    .line 2157
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetActivityCallCheck(I)V

    .line 2158
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->setGameScore(I)V

    return-void
.end method

.method public static callTapjoyOffWall()V
    .locals 1

    .line 2234
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->callShowOffers()V

    return-void
.end method

.method public static callUnlockSchievement(I)V
    .locals 1

    const/4 v0, 0x2

    .line 2163
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetActivityCallCheck(I)V

    .line 2164
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->setUnlockAchievement(I)V

    return-void
.end method

.method public static checkInstallPackage(Ljava/lang/String;)Z
    .locals 1

    .line 1752
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->checkInstallApp(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static deleteGLTextLabel(I)V
    .locals 0

    return-void
.end method

.method private static drawGLTextLabel(IIII)V
    .locals 0

    return-void
.end method

.method public static getADMobRewardCanShow()Z
    .locals 1

    .line 1536
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetADLoaded()Z

    move-result v0

    return v0
.end method

.method public static getADMobRewardLoading()V
    .locals 1

    .line 1517
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->loadRewardVidowAd()V

    return-void
.end method

.method private static getAbsolueFilePath()Ljava/lang/String;
    .locals 1

    .line 1259
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getAbsoluteFilePathForSDCard(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1266
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getFilesDir()Ljava/io/File;

    move-result-object v1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    :cond_1
    const-string p0, "null"

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static getClientConnectState()Z
    .locals 1

    .line 2151
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->isClientConnected()Z

    move-result v0

    return v0
.end method

.method public static getDeviceId(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const-string v0, "phone"

    .line 2067
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 2070
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-static {p0, v0}, Landroidx/core/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    const-string p0, "getDeviceId "

    const-string v0, ""

    .line 2081
    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method private static getGLTextLabelWidth(II)I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public static getGooglePlusLoginState()Z
    .locals 1

    .line 2121
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->isSignedIn()Z

    move-result v0

    return v0
.end method

.method private static getJavaString(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    const-string v0, "KSC5601"

    .line 1197
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    .line 1198
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/Natives;->nativeSetString([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static getNationCode()I
    .locals 1

    .line 1821
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetNationCode()I

    move-result v0

    return v0
.end method

.method public static getNetworkUniqueID()[B
    .locals 1

    .line 2176
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetNetworkUniqueiD()Ljava/lang/String;

    move-result-object v0

    .line 2177
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    return-object v0
.end method

.method private static getNickName()[B
    .locals 2

    .line 1631
    :try_start_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->s_NickName:Ljava/lang/String;

    const-string v1, "KSC5601"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private getNoticeVersion()I
    .locals 4

    :try_start_0
    const-string v0, "noticever"

    .line 1999
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/Natives;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    .line 2000
    invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I

    move-result v1

    new-array v1, v1, [B

    .line 2002
    invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I

    move-result v2

    if-nez v2, :cond_0

    .line 2003
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    const/4 v0, 0x0

    return v0

    .line 2007
    :cond_0
    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/FileInputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 2010
    :cond_1
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 2012
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v0, "0"

    .line 2016
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static getPermission1State()I
    .locals 1

    .line 668
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetPermission1()I

    move-result v0

    return v0
.end method

.method public static getPermission2State()I
    .locals 1

    .line 687
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetPermission2()I

    move-result v0

    return v0
.end method

.method private static getPurchaseCode()[B
    .locals 1

    .line 1614
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetPurchaseCode()Ljava/lang/String;

    move-result-object v0

    .line 1615
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    return-object v0
.end method

.method private static getPushItem()[B
    .locals 1

    .line 1645
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetPushItemCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    return-object v0
.end method

.method private static getResFileSize(Ljava/lang/String;)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 916
    :try_start_0
    sget-object v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 918
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v2

    new-array v2, v2, [B

    .line 919
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 922
    :goto_0
    :try_start_2
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v4, -0x1

    if-eq v1, v4, :cond_0

    .line 923
    invoke-virtual {v3, v2, v0, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 926
    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 927
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 928
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 930
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/Natives;->nativeSetDataForSize([B)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz p0, :cond_1

    .line 943
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 945
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    .line 950
    :cond_1
    :goto_1
    :try_start_4
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_2

    :catch_1
    move-exception p0

    .line 952
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    const/4 p0, 0x1

    return p0

    :catch_2
    move-exception v1

    goto :goto_3

    :catch_3
    move-exception v1

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object v3, v1

    goto :goto_8

    :catch_4
    move-exception v2

    move-object v3, v1

    move-object v1, v2

    goto :goto_3

    :catch_5
    move-exception v2

    move-object v3, v1

    move-object v1, v2

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v3, v1

    goto :goto_9

    :catch_6
    move-exception p0

    move-object v3, v1

    move-object v1, p0

    move-object p0, v3

    .line 936
    :goto_3
    :try_start_5
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz p0, :cond_2

    .line 943
    :try_start_6
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    goto :goto_4

    :catch_7
    move-exception p0

    .line 945
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_4
    if-eqz v3, :cond_4

    .line 950
    :try_start_7
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_a

    goto :goto_7

    :catch_8
    move-exception p0

    move-object v3, v1

    move-object v1, p0

    move-object p0, v3

    .line 934
    :goto_5
    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-eqz p0, :cond_3

    .line 943
    :try_start_9
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_6

    :catch_9
    move-exception p0

    .line 945
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_6
    if-eqz v3, :cond_4

    .line 950
    :try_start_a
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    goto :goto_7

    :catch_a
    move-exception p0

    .line 952
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_7
    return v0

    :catchall_2
    move-exception v0

    :goto_8
    move-object v1, p0

    :goto_9
    if-eqz v1, :cond_5

    .line 943
    :try_start_b
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_a

    :catch_b
    move-exception p0

    .line 945
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_a
    if-eqz v3, :cond_6

    .line 950
    :try_start_c
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    goto :goto_b

    :catch_c
    move-exception p0

    .line 952
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    .line 955
    :cond_6
    :goto_b
    goto :goto_d

    :goto_c
    throw v0

    :goto_d
    goto :goto_c
.end method

.method public static getSDCardFileSize(Ljava/lang/String;)I
    .locals 2

    const/4 p0, 0x0

    .line 1003
    :try_start_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->manager:Landroid/content/pm/PackageManager;

    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->mPackageName:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1009
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    return p0

    :catch_0
    move-exception v0

    .line 1005
    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    return p0
.end method

.method public static getSDcardResourcePosition()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static getSignatureCode()[B
    .locals 1

    .line 1622
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetSignatureCode()Ljava/lang/String;

    move-result-object v0

    .line 1623
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    return-object v0
.end method

.method public static getTapjoyListViewState()Z
    .locals 1

    .line 2244
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetTapjoyListView()Z

    move-result v0

    return v0
.end method

.method public static getTapjoyState()I
    .locals 1

    .line 2254
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetTapjoyState()I

    move-result v0

    return v0
.end method

.method public static getTextEdit(Ljava/lang/String;)V
    .locals 0

    .line 1640
    sput-object p0, Lcom/mrgames/larvaheroesfree/Natives;->s_NickName:Ljava/lang/String;

    return-void
.end method

.method private static initGLTextLabel(Ljava/lang/String;IIIII)V
    .locals 0

    return-void
.end method

.method private static initGLTextMultiLabel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIII)V
    .locals 0

    return-void
.end method

.method public static native initializeJNIGlobalRef()V
.end method

.method private static isAssetExist(Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    .line 1053
    :try_start_0
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 1054
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const/4 p0, 0x0

    if-eqz v0, :cond_0

    .line 1061
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    nop

    :catch_1
    :cond_0
    return p0
.end method

.method private static isFileExist(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1114
    :try_start_0
    sget-object v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v2, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v1

    .line 1115
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return v0

    :catch_1
    if-eqz v1, :cond_0

    .line 1119
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    :catch_2
    :cond_0
    return v0
.end method

.method public static jumpToOzstoreUpdate(Ljava/lang/String;)V
    .locals 2

    .line 1589
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "===== jumpToOzstoreUpdate() "

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1591
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    .line 1592
    new-instance v0, Landroid/content/Intent;

    const-string v1, "ozstore.external.linked"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1593
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1594
    sget-object p0, Lcom/mrgames/larvaheroesfree/Natives;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static jumpToURL(Ljava/lang/String;)V
    .locals 2

    .line 1578
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "===== jumpToURL() "

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1579
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    .line 1580
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1582
    :try_start_0
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private static loadFile(Ljava/lang/String;)[B
    .locals 4

    .line 1225
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 1226
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1231
    :try_start_0
    new-instance p0, Ljava/io/FileInputStream;

    invoke-direct {p0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 1232
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1233
    invoke-virtual {p0}, Ljava/io/FileInputStream;->available()I

    move-result v1

    new-array v1, v1, [B

    .line 1236
    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/FileInputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    .line 1237
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 1240
    :cond_0
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V

    .line 1242
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    .line 1243
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-object p0

    .line 1250
    :catch_0
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "FileNotFoundException"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :catch_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static loadTextureFromImage(Ljava/lang/String;)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 865
    :try_start_0
    sget-object v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 867
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v2

    new-array v2, v2, [B

    .line 868
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 871
    :goto_0
    :try_start_2
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v4, -0x1

    if-eq v1, v4, :cond_0

    .line 872
    invoke-virtual {v3, v2, v0, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 875
    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 876
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 877
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 879
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/Natives;->nativeSetTexture([B)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz p0, :cond_1

    .line 892
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 894
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    .line 899
    :cond_1
    :goto_1
    :try_start_4
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_2

    :catch_1
    move-exception p0

    .line 901
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    const/4 p0, 0x1

    return p0

    :catch_2
    move-exception v1

    goto :goto_3

    :catch_3
    move-exception v1

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object v3, v1

    goto :goto_8

    :catch_4
    move-exception v2

    move-object v3, v1

    move-object v1, v2

    goto :goto_3

    :catch_5
    move-exception v2

    move-object v3, v1

    move-object v1, v2

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v3, v1

    goto :goto_9

    :catch_6
    move-exception p0

    move-object v3, v1

    move-object v1, p0

    move-object p0, v3

    .line 885
    :goto_3
    :try_start_5
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz p0, :cond_2

    .line 892
    :try_start_6
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    goto :goto_4

    :catch_7
    move-exception p0

    .line 894
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_4
    if-eqz v3, :cond_4

    .line 899
    :try_start_7
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_a

    goto :goto_7

    :catch_8
    move-exception p0

    move-object v3, v1

    move-object v1, p0

    move-object p0, v3

    .line 883
    :goto_5
    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-eqz p0, :cond_3

    .line 892
    :try_start_9
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_6

    :catch_9
    move-exception p0

    .line 894
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_6
    if-eqz v3, :cond_4

    .line 899
    :try_start_a
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    goto :goto_7

    :catch_a
    move-exception p0

    .line 901
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_7
    return v0

    :catchall_2
    move-exception v0

    :goto_8
    move-object v1, p0

    :goto_9
    if-eqz v1, :cond_5

    .line 892
    :try_start_b
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_a

    :catch_b
    move-exception p0

    .line 894
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_a
    if-eqz v3, :cond_6

    .line 899
    :try_start_c
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    goto :goto_b

    :catch_c
    move-exception p0

    .line 901
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    .line 904
    :cond_6
    :goto_b
    goto :goto_d

    :goto_c
    throw v0

    :goto_d
    goto :goto_c
.end method

.method public static loadTextureFromSDCardImage(Ljava/lang/String;)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 965
    :try_start_0
    sget-object v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 967
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v2

    new-array v2, v2, [B

    .line 968
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 971
    :goto_0
    :try_start_2
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v4, -0x1

    if-eq v1, v4, :cond_0

    .line 972
    invoke-virtual {v3, v2, v0, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 975
    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 976
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 977
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 979
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/Natives;->nativeSetTexture([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    const/4 p0, 0x1

    return p0

    :catch_0
    move-object v3, v1

    :catch_1
    move-object v1, p0

    goto :goto_1

    :catch_2
    move-object v3, v1

    :goto_1
    if-eqz v1, :cond_1

    .line 986
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_2

    :catch_3
    nop

    :cond_1
    :goto_2
    if-eqz v3, :cond_2

    .line 991
    :try_start_4
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :cond_2
    return v0
.end method

.method public static native nativeCheckGameState()I
.end method

.method public static native nativeDestroy()V
.end method

.method public static native nativeInit(II)V
.end method

.method public static native nativePause()V
.end method

.method public static native nativePlusTapjoyReward(I)V
.end method

.method public static native nativePurchaseState(II)V
.end method

.method public static native nativeReloadTexture()V
.end method

.method public static native nativeRender()V
.end method

.method public static native nativeResize(II)V
.end method

.method public static native nativeResume()V
.end method

.method public static native nativeSetAppInit(I)V
.end method

.method public static native nativeSetDataForSize([B)V
.end method

.method public static native nativeSetGplusLoginFirst()V
.end method

.method public static native nativeSetGplusLoginSuccess()V
.end method

.method public static native nativeSetPaths(Ljava/lang/String;)V
.end method

.method public static native nativeSetString([B)V
.end method

.method public static native nativeSetTexture([B)V
.end method

.method public static native nativeTextEnter(II)V
.end method

.method public static native nativeTouchesBegin(IFF)V
.end method

.method public static native nativeTouchesCancel(FF)V
.end method

.method public static native nativeTouchesClear(IFF)V
.end method

.method public static native nativeTouchesEnd(IFF)V
.end method

.method public static native nativeTouchesMove([I[F[F)V
.end method

.method public static onGetADMobRewardCanShow()Z
    .locals 1

    .line 801
    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->getADMobRewardCanShow()Z

    move-result v0

    return v0
.end method

.method public static onGetPermissionVersion()Z
    .locals 2

    .line 691
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static onGetUnityCanShow()Z
    .locals 1

    .line 820
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetUnityADLoaded()Z

    move-result v0

    return v0
.end method

.method public static onSetAppPermission1()V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetPermission1(I)V

    return-void
.end method

.method public static onSetAppPermission2()V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetPermission2(I)V

    return-void
.end method

.method private static readAssete(Ljava/lang/String;)[B
    .locals 5

    const/4 v0, 0x0

    .line 1078
    :try_start_0
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1080
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v1

    new-array v1, v1, [B

    .line 1081
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1084
    :goto_0
    :try_start_2
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    const/4 v4, 0x0

    .line 1085
    invoke-virtual {v2, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 1088
    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 1089
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 1090
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    return-object v1

    :catch_0
    move-object v2, v0

    goto :goto_1

    :catch_1
    move-object p0, v0

    move-object v2, p0

    :catch_2
    :goto_1
    if-eqz p0, :cond_1

    .line 1097
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_2

    :catch_3
    nop

    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    .line 1102
    :try_start_4
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :cond_2
    return-object v0
.end method

.method private static readTextFile(Ljava/lang/String;)I
    .locals 10

    const-string v0, "==== readTextFile: "

    const/4 v1, 0x0

    .line 1136
    sput-object v1, Lcom/mrgames/larvaheroesfree/Natives;->getString:[Ljava/lang/String;

    const/4 v1, 0x0

    .line 1137
    sput v1, Lcom/mrgames/larvaheroesfree/Natives;->totalLineCnt:I

    .line 1142
    :try_start_0
    sget-object v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    .line 1143
    new-instance v3, Ljava/util/Vector;

    invoke-direct {v3}, Ljava/util/Vector;-><init>()V

    .line 1146
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v4

    if-lez v4, :cond_2

    .line 1148
    new-instance v4, Ljava/io/InputStreamReader;

    const-string v5, "euc-kr"

    invoke-direct {v4, v2, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 1150
    new-instance v5, Ljava/io/BufferedReader;

    invoke-direct {v5, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 1156
    :goto_0
    invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    .line 1157
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "  ===="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    if-nez v6, :cond_1

    .line 1165
    invoke-virtual {v4}, Ljava/io/InputStreamReader;->close()V

    .line 1167
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V

    .line 1170
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v4

    sput v4, Lcom/mrgames/larvaheroesfree/Natives;->totalLineCnt:I

    .line 1171
    new-array v4, v4, [Ljava/lang/String;

    sput-object v4, Lcom/mrgames/larvaheroesfree/Natives;->getString:[Ljava/lang/String;

    .line 1173
    :goto_1
    sget v4, Lcom/mrgames/larvaheroesfree/Natives;->totalLineCnt:I

    if-ge v1, v4, :cond_0

    .line 1174
    sget-object v4, Lcom/mrgames/larvaheroesfree/Natives;->getString:[Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    aput-object v5, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1176
    :cond_0
    invoke-virtual {v3}, Ljava/util/Vector;->removeAllElements()V

    goto :goto_2

    .line 1161
    :cond_1
    invoke-virtual {v3, v6}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_0

    .line 1181
    :cond_2
    :goto_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 1185
    :catch_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " read error ===="

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1188
    :goto_3
    sget p0, Lcom/mrgames/larvaheroesfree/Natives;->totalLineCnt:I

    return p0
.end method

.method private static saveFile(Ljava/lang/String;[B)V
    .locals 3

    .line 1208
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 1209
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1213
    :try_start_0
    new-instance p0, Ljava/io/FileOutputStream;

    invoke-direct {p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 1215
    invoke-virtual {p0, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 1216
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static setAutomataChangable(Z)V
    .locals 1

    .line 1664
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->mInputText:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    if-eqz v0, :cond_0

    .line 1665
    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setChangable(Z)V

    :cond_0
    return-void
.end method

.method public static setAutomataEnable(Z)V
    .locals 1

    .line 1659
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->mInputText:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    if-eqz v0, :cond_0

    .line 1660
    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setEnable(Z)V

    :cond_0
    return-void
.end method

.method public static setAutomataMaxTextSize(I)V
    .locals 1

    .line 1679
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->mInputText:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    if-eqz v0, :cond_0

    .line 1680
    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setMaxTextSize(I)V

    :cond_0
    return-void
.end method

.method public static setAutomataMode(I)V
    .locals 1

    .line 1669
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->mInputText:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    if-eqz v0, :cond_0

    .line 1670
    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setMode(I)V

    :cond_0
    return-void
.end method

.method public static setAutomataText([B)V
    .locals 1

    .line 1674
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->mInputText:Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;

    if-eqz v0, :cond_0

    .line 1675
    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/spritetext/EchoEditText;->setText([B)V

    :cond_0
    return-void
.end method

.method public static setGooglePlusLogin()V
    .locals 1

    const/4 v0, 0x2

    .line 2127
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetActivityCallCheck(I)V

    .line 2128
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->beginUserInitiatedSignIn()V

    return-void
.end method

.method public static setGooglePlusLogout()V
    .locals 1

    const/4 v0, 0x2

    .line 2133
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetActivityCallCheck(I)V

    .line 2134
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->googleSignOut()V

    return-void
.end method

.method private static native setPublicKey()Ljava/lang/String;
.end method

.method public static setRewardADInit()V
    .locals 1

    const/4 v0, 0x0

    .line 827
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityAdCloseState(I)V

    .line 828
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetADMobRewardCloseState(I)V

    return-void
.end method

.method public static setTapjoyListViewState(Z)V
    .locals 0

    .line 2239
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetTapjoyListView(Z)V

    return-void
.end method

.method public static native setTextureEx([BIII)V
.end method

.method public static set_RunGCM(Z)V
    .locals 0

    if-eqz p0, :cond_0

    .line 2108
    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->GCM_reRegister()V

    goto :goto_0

    .line 2109
    :cond_0
    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->GCM_unRegister()V

    :goto_0
    return-void
.end method


# virtual methods
.method public SetNotice(Landroid/widget/FrameLayout;)V
    .locals 4

    .line 1931
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const-string p1, "window"

    .line 1934
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/Natives;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    .line 1936
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->m_nRealScrWidth:F

    .line 1937
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Display;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/mrgames/larvaheroesfree/Natives;->m_nRealScrHeight:F

    .line 1939
    iget v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->m_nRealScrWidth:F

    const/high16 v1, 0x43f00000    # 480.0f

    div-float v1, v0, v1

    iput v1, p0, Lcom/mrgames/larvaheroesfree/Natives;->m_scaleDX:F

    const/high16 v1, 0x44480000    # 800.0f

    div-float v1, p1, v1

    .line 1940
    iput v1, p0, Lcom/mrgames/larvaheroesfree/Natives;->m_scaleDY:F

    float-to-int v0, v0

    mul-int/lit8 v0, v0, 0xc

    .line 1942
    div-int/lit16 v0, v0, 0x1e0

    float-to-int p1, p1

    mul-int/lit8 p1, p1, 0x58

    .line 1943
    div-int/lit16 p1, p1, 0x320

    .line 1945
    new-instance v1, Landroid/widget/LinearLayout;

    sget-object v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/high16 v2, 0x42080000    # 34.0f

    .line 1947
    iget v3, p0, Lcom/mrgames/larvaheroesfree/Natives;->m_nRealScrHeight:F

    mul-float v3, v3, v2

    float-to-int v2, v3

    div-int/lit16 v2, v2, 0x320

    sub-int v2, p1, v2

    .line 1949
    invoke-virtual {v1, v0, v2, v0, p1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    return-void
.end method

.method hideSystemBar()V
    .locals 2

    .line 617
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x1f07

    .line 619
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    return-void
.end method

.method public initAD_Interstitial()V
    .locals 1

    const/4 v0, 0x0

    .line 467
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetFullAdState(I)V

    .line 470
    invoke-super {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->initAD_Interstitial()V

    .line 472
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->loadAd_Interstitial()V

    .line 474
    iget-boolean v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->isSetADView:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 476
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/Natives;->isSetADView:Z

    :cond_0
    return-void
.end method

.method public loadAd_Interstitial()V
    .locals 4

    const-string v0, "Natives"

    const-string v1, "loadAd_Interstitial"

    .line 489
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 494
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/Natives;->adIsLoading:Z

    if-nez v0, :cond_2

    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->mgrInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 497
    :cond_0
    sget v0, Lcom/mrgames/larvaheroesfree/Natives;->checkCurrInterstitialAd:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    sput v0, Lcom/mrgames/larvaheroesfree/Natives;->checkCurrInterstitialAd:I

    .line 498
    sget v2, Lcom/mrgames/larvaheroesfree/Natives;->checkCntInterstitialAd:I

    if-ge v0, v2, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 503
    sput v0, Lcom/mrgames/larvaheroesfree/Natives;->checkCurrInterstitialAd:I

    .line 505
    sput-boolean v1, Lcom/mrgames/larvaheroesfree/Natives;->adIsLoading:Z

    .line 506
    new-instance v0, Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;->build()Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;

    move-result-object v0

    .line 507
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    new-instance v2, Lcom/mrgames/larvaheroesfree/Natives$4;

    invoke-direct {v2, p0}, Lcom/mrgames/larvaheroesfree/Natives$4;-><init>(Lcom/mrgames/larvaheroesfree/Natives;)V

    const-string v3, "ca-app-pub-1272300599065219/2854007202"

    invoke-static {v1, v3, v0, v2}, Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAdLoadCallback;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 177
    invoke-super {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->onCreate(Landroid/os/Bundle;)V

    .line 179
    sput-object p1, Lcom/mrgames/larvaheroesfree/Natives;->mSaveInstanceState:Landroid/os/Bundle;

    .line 181
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->getApplication()Landroid/app/Application;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/mrgames/larvaheroesfree/Natives;->mPackageName:Ljava/lang/String;

    .line 183
    invoke-super {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->setPackgeName(Ljava/lang/String;)V

    .line 185
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x400

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    .line 186
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt p1, v1, :cond_0

    .line 187
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lcom/android/billingclient/api/zzg$$ExternalSyntheticApiModelOutline0;->m(Landroid/view/WindowManager$LayoutParams;I)V

    :cond_0
    const p1, 0x7f0b0020

    .line 189
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/Natives;->setContentView(I)V

    .line 191
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    sput-object p1, Lcom/mrgames/larvaheroesfree/Natives;->manager:Landroid/content/pm/PackageManager;

    .line 195
    new-instance p1, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {p1}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {p1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object p1

    invoke-static {p1}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    const p1, 0x7f080003

    .line 198
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/Natives;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    sput-object p1, Lcom/mrgames/larvaheroesfree/Natives;->layout:Landroid/widget/FrameLayout;

    .line 201
    new-instance p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;

    invoke-direct {p1, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGLSurfaceView;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/Natives;->mGLView:Landroid/opengl/GLSurfaceView;

    .line 203
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->layout:Landroid/widget/FrameLayout;

    invoke-virtual {v1, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 205
    sput-object p0, Lcom/mrgames/larvaheroesfree/Natives;->mInstance:Lcom/mrgames/larvaheroesfree/Natives;

    .line 207
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Display;->getWidth()I

    move-result p1

    sput p1, Lcom/mrgames/larvaheroesfree/Natives;->mWidth:I

    .line 208
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Display;->getHeight()I

    move-result p1

    sput p1, Lcom/mrgames/larvaheroesfree/Natives;->mHeight:I

    .line 210
    sget v1, Lcom/mrgames/larvaheroesfree/Natives;->mWidth:I

    int-to-float v1, v1

    const/high16 v2, 0x44480000    # 800.0f

    div-float/2addr v1, v2

    sput v1, Lcom/mrgames/larvaheroesfree/Natives;->mScaleW:F

    int-to-float p1, p1

    const/high16 v1, 0x43f00000    # 480.0f

    div-float/2addr p1, v1

    .line 211
    sput p1, Lcom/mrgames/larvaheroesfree/Natives;->mScaleH:F

    .line 213
    sget-object p1, Lcom/google/android/gms/ads/AdSize;->BANNER:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/ads/AdSize;->getWidthInPixels(Landroid/content/Context;)I

    move-result p1

    sput p1, Lcom/mrgames/larvaheroesfree/Natives;->mAdWidth:I

    .line 214
    sget-object p1, Lcom/google/android/gms/ads/AdSize;->BANNER:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/ads/AdSize;->getHeightInPixels(Landroid/content/Context;)I

    move-result p1

    sput p1, Lcom/mrgames/larvaheroesfree/Natives;->mAdHeight:I

    .line 215
    sget-object p1, Lcom/google/android/gms/ads/AdSize;->MEDIUM_RECTANGLE:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/ads/AdSize;->getWidthInPixels(Landroid/content/Context;)I

    move-result p1

    sput p1, Lcom/mrgames/larvaheroesfree/Natives;->mAdHalfWidth:I

    .line 216
    sget-object p1, Lcom/google/android/gms/ads/AdSize;->MEDIUM_RECTANGLE:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/ads/AdSize;->getHeightInPixels(Landroid/content/Context;)I

    move-result p1

    sput p1, Lcom/mrgames/larvaheroesfree/Natives;->mAdHalfHeight:I

    .line 218
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->InitADMob()V

    const/4 p1, 0x4

    .line 221
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetADMobRewardState(I)V

    const/4 p1, 0x0

    .line 222
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetADMobRewardCloseState(I)V

    .line 223
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->loadRewardVidowAd()V

    const v1, 0x7f08003d

    .line 285
    invoke-virtual {p0, v1}, Lcom/mrgames/larvaheroesfree/Natives;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/ads/AdView;

    sput-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    .line 288
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 289
    sget-object v2, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 290
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/AdView;->setBackgroundColor(I)V

    .line 291
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/AdView;->setEnabled(Z)V

    .line 292
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    .line 294
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    new-instance v3, Lcom/mrgames/larvaheroesfree/Natives$1;

    invoke-direct {v3, p0}, Lcom/mrgames/larvaheroesfree/Natives$1;-><init>(Lcom/mrgames/larvaheroesfree/Natives;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    const v1, 0x7f08003c

    .line 341
    invoke-virtual {p0, v1}, Lcom/mrgames/larvaheroesfree/Natives;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/ads/AdView;

    sput-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview2:Lcom/google/android/gms/ads/AdView;

    .line 344
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 345
    sget-object v3, Lcom/mrgames/larvaheroesfree/Natives;->adview2:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 346
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview2:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/AdView;->setBackgroundColor(I)V

    .line 347
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview2:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/AdView;->setEnabled(Z)V

    .line 348
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview2:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    .line 350
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview2:Lcom/google/android/gms/ads/AdView;

    new-instance v3, Lcom/mrgames/larvaheroesfree/Natives$2;

    invoke-direct {v3, p0}, Lcom/mrgames/larvaheroesfree/Natives$2;-><init>(Lcom/mrgames/larvaheroesfree/Natives;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    const v1, 0x7f08003b

    .line 396
    invoke-virtual {p0, v1}, Lcom/mrgames/larvaheroesfree/Natives;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/ads/AdView;

    sput-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview3:Lcom/google/android/gms/ads/AdView;

    .line 399
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 400
    sget-object v3, Lcom/mrgames/larvaheroesfree/Natives;->adview3:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 401
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview3:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/AdView;->setBackgroundColor(I)V

    .line 402
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview3:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/ads/AdView;->setEnabled(Z)V

    .line 403
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview3:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    .line 405
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->adview3:Lcom/google/android/gms/ads/AdView;

    new-instance v2, Lcom/mrgames/larvaheroesfree/Natives$3;

    invoke-direct {v2, p0}, Lcom/mrgames/larvaheroesfree/Natives$3;-><init>(Lcom/mrgames/larvaheroesfree/Natives;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    const/16 v1, 0xa

    .line 441
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->initSFXSounds(I)V

    .line 443
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetShowAlert(Z)V

    .line 446
    new-instance p1, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;

    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->IsFullNetwork()Z

    move-result v1

    invoke-direct {p1, v1}, Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;-><init>(Z)V

    sput-object p1, Lcom/mrgames/larvaheroesfree/Natives;->network:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;

    .line 449
    invoke-super {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v1, 0x80

    invoke-virtual {p1, v1}, Landroid/view/Window;->addFlags(I)V

    .line 450
    invoke-super {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    const-string p1, "connectivity"

    .line 452
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/Natives;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    sput-object p1, Lcom/mrgames/larvaheroesfree/Natives;->connectivityManager:Landroid/net/ConnectivityManager;

    .line 454
    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->OnGetPVPNation()I

    move-result p1

    .line 455
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetNationCode(I)V

    .line 457
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->hideSystemBar()V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 754
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->bpDestory()V

    .line 755
    invoke-super {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->onDestroy()V

    .line 757
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "<<//////// onDestroy ////////>>"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 759
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->stopAllSound()V

    .line 760
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->releaseAll()V

    .line 765
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->sNativeInitDone:Z

    if-eqz v0, :cond_destroy_skip

    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->nativeDestroy()V

    :cond_destroy_skip
    const/4 v0, 0x0

    .line 769
    sput-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    .line 770
    sput-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->mRenderer:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    .line 772
    sget-object v1, Lcom/mrgames/larvaheroesfree/Natives;->network:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;

    if-eqz v1, :cond_0

    .line 773
    sput-object v0, Lcom/mrgames/larvaheroesfree/Natives;->network:Lcom/mrgames/larvaheroesfree/network/GpTouchNetwork;

    .line 775
    :cond_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 711
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->pause()V

    .line 712
    :cond_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview2:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->pause()V

    .line 713
    :cond_1
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview3:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->pause()V

    .line 715
    :cond_2
    invoke-super {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->onPause()V

    .line 718
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "<<//////// onPause ////////>>"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 719
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->sNativeInitDone:Z

    if-eqz v0, :cond_pause_skip

    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->nativePause()V

    .line 721
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->stopAllSound()V

    const/4 v0, 0x1

    .line 723
    sput-boolean v0, Lcom/mrgames/larvaheroesfree/Natives;->bPaused:Z

    :cond_pause_skip
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    const/16 p2, 0x65

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-ne p1, p2, :cond_1

    .line 635
    array-length p1, p3

    if-ne p1, v3, :cond_0

    aget p1, p3, v1

    if-nez p1, :cond_0

    .line 637
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetPermission1(I)V

    goto :goto_0

    .line 639
    :cond_0
    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetPermission1(I)V

    goto :goto_0

    :cond_1
    const/16 p2, 0x66

    if-ne p1, p2, :cond_3

    .line 643
    array-length p1, p3

    if-ne p1, v3, :cond_2

    aget p1, p3, v1

    if-nez p1, :cond_2

    .line 645
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetPermission2(I)V

    goto :goto_0

    .line 647
    :cond_2
    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetPermission2(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 728
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->resume()V

    .line 729
    :cond_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview2:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->resume()V

    .line 730
    :cond_1
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->adview3:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->resume()V

    .line 732
    :cond_2
    invoke-super {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->onResume()V

    .line 735
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "<<//////// onResume ////////>>"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 739
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/Natives;->bPaused:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    .line 740
    sput-boolean v0, Lcom/mrgames/larvaheroesfree/Natives;->bPaused:Z

    .line 741
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->sNativeInitDone:Z

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->nativeResume()V

    .line 744
    :cond_3
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->hideSystemBar()V

    return-void
.end method

.method public onStart()V
    .locals 0

    .line 700
    invoke-super {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 0

    .line 706
    invoke-super {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->onStop()V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .line 608
    invoke-super {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    .line 611
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/Natives;->hideSystemBar()V

    :cond_0
    return-void
.end method

.method public showInterstitial()V
    .locals 2

    .line 592
    sget-object v0, Lcom/mrgames/larvaheroesfree/Natives;->mgrInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    if-eqz v0, :cond_0

    .line 593
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;->show(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method
