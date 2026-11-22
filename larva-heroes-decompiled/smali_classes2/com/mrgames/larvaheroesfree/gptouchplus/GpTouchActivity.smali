.class public Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;
.super Landroid/app/Activity;
.source "GpTouchActivity.java"

# interfaces
.implements Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$UnityAdsListener;
    }
.end annotation


# static fields
.field public static final CLIENT_ALL:I = 0x7

.field public static final CLIENT_APPSTATE:I = 0x4

.field public static final CLIENT_GAMES:I = 0x1

.field public static final CLIENT_PLUS:I = 0x2

.field private static final MERCHANT_ID:Ljava/lang/String; = null

.field private static final TAG:Ljava/lang/String; = "Natives"

.field public static mContext:Landroid/content/Context; = null

.field private static mFirebaseAnalytics:Lcom/google/firebase/analytics/FirebaseAnalytics; = null

.field public static mGaTracker:Lcom/google/android/gms/analytics/Tracker; = null

.field protected static mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper; = null

.field public static mPakageName:Ljava/lang/String; = null

.field public static mRequestedClients:I = 0x1

.field public static mSaveInstanceState:Landroid/os/Bundle; = null

.field public static mVersionName:Ljava/lang/String; = null

.field public static myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity; = null

.field public static s_name:Ljava/lang/String; = ""


# instance fields
.field private adUnitId:Ljava/lang/String;

.field public bBuyItem:Z

.field public bCheckVungleStart:Z

.field public curGooglePlayState:Z

.field public deviceId:Ljava/lang/String;

.field private earnedCurrency:Z

.field private loadListener:Lcom/unity3d/ads/IUnityAdsLoadListener;

.field private mBillingManager:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

.field private mCurTime:J

.field public mGaInstance:Lcom/google/android/gms/analytics/GoogleAnalytics;

.field private mIsBackKeyPressed:Z

.field private mTimerHandler:Landroid/os/Handler;

.field private showListener:Lcom/unity3d/ads/IUnityAdsShowListener;

.field private testMode:Ljava/lang/Boolean;

.field private final unityAdsListener:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$UnityAdsListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 74
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    .line 89
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mIsBackKeyPressed:Z

    const-wide/16 v1, 0x0

    .line 90
    iput-wide v1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mCurTime:J

    .line 99
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->bBuyItem:Z

    .line 103
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->earnedCurrency:Z

    .line 110
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->bCheckVungleStart:Z

    .line 115
    new-instance v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$UnityAdsListener;

    invoke-direct {v1, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$UnityAdsListener;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)V

    iput-object v1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->unityAdsListener:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$UnityAdsListener;

    .line 144
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->curGooglePlayState:Z

    const/4 v1, 0x0

    .line 148
    iput-object v1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mBillingManager:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    .line 339
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->testMode:Ljava/lang/Boolean;

    const-string v0, "rewardedVideo"

    .line 340
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->adUnitId:Ljava/lang/String;

    .line 342
    new-instance v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$1;

    invoke-direct {v0, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$1;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->loadListener:Lcom/unity3d/ads/IUnityAdsLoadListener;

    .line 360
    new-instance v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$2;

    invoke-direct {v0, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$2;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->showListener:Lcom/unity3d/ads/IUnityAdsShowListener;

    .line 687
    new-instance v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$3;

    invoke-direct {v0, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$3;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mTimerHandler:Landroid/os/Handler;

    return-void
.end method

.method public static GCM_reRegister()V
    .locals 0

    return-void
.end method

.method public static GCM_unRegister()V
    .locals 0

    return-void
.end method

.method public static InitGPlus()V
    .locals 3

    .line 601
    new-instance v0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    sget v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mRequestedClients:I

    invoke-direct {v0, v1, v2}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;-><init>(Landroid/app/Activity;I)V

    sput-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    const/4 v1, 0x1

    .line 602
    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->enableDebugLog(Z)V

    .line 603
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->setup(Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;)V

    return-void
.end method

.method public static KakaoTalkLinkForApp(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const/4 p0, 0x1

    return p0
.end method

.method public static KakaoTalkLinkForURL(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const/4 p0, 0x1

    return p0
.end method

.method public static SendEventGoogleAnalytics(I)V
    .locals 76

    const-string v0, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v1, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v2, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v3, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v4, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v5, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v6, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v7, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v8, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v9, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v10, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v11, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v12, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v13, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v14, "\uc601\uc6c5\ub808\ubca8\uc5c5"

    const-string v15, "\uc6d4\ub4dc\uc624\ud508"

    const-string v16, "\uc6d4\ub4dc\uc624\ud508"

    const-string v17, "\uc6d4\ub4dc\uc624\ud508"

    const-string v18, "\uc6d4\ub4dc\uc624\ud508"

    const-string v19, "\uc6d4\ub4dc\uc624\ud508"

    const-string v20, "\uc6d4\ub4dc\uc624\ud508"

    const-string v21, "\uc6d4\ub4dc\uc624\ud508"

    const-string v22, "\uc6d4\ub4dc\uc624\ud508"

    const-string v23, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v24, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v25, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v26, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v27, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v28, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v29, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v30, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v31, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v32, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v33, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v34, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v35, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v36, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v37, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v38, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v39, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v40, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v41, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v42, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v43, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v44, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v45, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v46, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v47, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v48, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v49, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v50, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v51, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v52, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v53, "\uc571\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v54, "\ucd94\ucc9c\uac8c\uc784"

    const-string v55, "VIDEO_AD"

    const-string v56, "VIDEO_AD"

    const-string v57, "\uc790\uccb4\uad11\uace0"

    const-string v58, "\uc790\uccb4\uad11\uace0"

    const-string v59, "\ud3ab\uad6c\ub9e4"

    const-string v60, "\uad11\uace0\ud3ab\uc624\ud508"

    const-string v61, "\ubcf4\uc2a4\ud2f0\ucf13\uad6c\ub9e4"

    const-string v62, "\ubcf4\uc2a4\ub358\uc804\uc785\uc7a5"

    const-string v63, "\ub77c\ubc14_YouTube"

    const-string v64, "\ub77c\ubc14_YouTube_KID"

    const-string v65, "\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v66, "\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v67, "\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v68, "\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v69, "\ub77c\ubc14\uac8c\uc784\uccb4\ub110_Youtube"

    const-string v70, "\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v71, "\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v72, "\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v73, "\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v74, "\ub2e4\uc6b4\ub85c\ub4dc"

    .line 832
    filled-new-array/range {v0 .. v74}, [Ljava/lang/String;

    move-result-object v0

    const-string v1, "\uc601\uc6c5_\ub808\ubca8\uc5c5_10"

    const-string v2, "\uc601\uc6c5_\ub808\ubca8\uc5c5_20"

    const-string v3, "\uc601\uc6c5_\ub808\ubca8\uc5c5_30"

    const-string v4, "\uc601\uc6c5_\ub808\ubca8\uc5c5_40"

    const-string v5, "\uc601\uc6c5_\ub808\ubca8\uc5c5_50"

    const-string v6, "\uc601\uc6c5_\ub808\ubca8\uc5c5_60"

    const-string v7, "\uc601\uc6c5_\ub808\ubca8\uc5c5_70"

    const-string v8, "\uc601\uc6c5_\ub808\ubca8\uc5c5_80"

    const-string v9, "\uc601\uc6c5_\ub808\ubca8\uc5c5_90"

    const-string v10, "\uc601\uc6c5_\ub808\ubca8\uc5c5_100"

    const-string v11, "\uc601\uc6c5_\ub808\ubca8\uc5c5_110"

    const-string v12, "\uc601\uc6c5_\ub808\ubca8\uc5c5_120"

    const-string v13, "\uc601\uc6c5_\ub808\ubca8\uc5c5_130"

    const-string v14, "\uc601\uc6c5_\ub808\ubca8\uc5c5_140"

    const-string v15, "\uc601\uc6c5_\ub808\ubca8\uc5c5_150"

    const-string v16, "\uc6d4\ub4dc\uc624\ud508_2"

    const-string v17, "\uc6d4\ub4dc\uc624\ud508_3"

    const-string v18, "\uc6d4\ub4dc\uc624\ud508_4"

    const-string v19, "\uc6d4\ub4dc\uc624\ud508_5"

    const-string v20, "\uc6d4\ub4dc\uc624\ud508_6"

    const-string v21, "\uc6d4\ub4dc\uc624\ud508_7"

    const-string v22, "\uc6d4\ub4dc\uc624\ud508_8"

    const-string v23, "\uc6d4\ub4dc\uc624\ud508_9"

    const-string v24, "\ubc84\ub4dc \ub9c1\ud06c"

    const-string v25, "\ud3ec\ucf13 \ub2e8\uc5b4 \ub9de\ucd94\uae30"

    const-string v26, "\ube14\ub7ed \ud37c\uc990 \ud074\ub798\uc2dd 2017"

    const-string v27, "\ube14\ub7ed \ud37c\uc990 \ud5e5\uc0ac S"

    const-string v28, "\ubcbd\ub3cc\uae68\uae30 S"

    const-string v29, "\ubcbd\ub3cc\uae68\uae30 \uc2a4\ud398\uc774\uc2a42"

    const-string v30, "\ubc84\ube14 \ubaac\uc2a4\ud130"

    const-string v31, "\ubc84\ube14\uc288\ud130 \uc57c\uad6c"

    const-string v32, "\ubc84\ube14 \uc288\ud130 \ud788\uc5b4\ub85c"

    const-string v33, "\ubc84\ube14 \uc2a4\ud398\uc774\uc2a4"

    const-string v34, "\ucfe0\ud0a4 \uc694\ub9ac\uc655(3\ub9e4\uce58)"

    const-string v35, "\ub3c4\ud2b8 \ud788\uc5b4\ub85c\u2161"

    const-string v36, "\ub3c4\ud2b8 \ud328\ubc00\ub9ac \ub514\ud39c\uc2a4"

    const-string v37, "\ub3c4\ud2b8 \ud788\uc5b4\ub85c"

    const-string v38, "\ud658\uc0dd\ub9cc\uc774\uc0b4\uae38"

    const-string v39, "\uc824\ub9ac \ud038(3\ub9e4\uce58)"

    const-string v40, "\uc96c\uc5bc\ub9ac \ud074\ub798\uc2dd"

    const-string v41, "\ubcf4\uc11d \ub9c1\ud06c \ud074\ub798\uc2dd"

    const-string v42, "\ubaa8\ub450\uc758 \uc591\uad81(\uc591\uad81\uac8c\uc784)"

    const-string v43, "\ud3ec\ucf13 \uc194\ub9ac\ud14c\uc5b4"

    const-string v44, "\uc9c4\uaca9\uc758 \uc6a9\uc0ac"

    const-string v45, "\ubc40\uc8fc\uc0ac\uc704 \ud074\ub798\uc2dd"

    const-string v46, "\ud0ed\ubcf4\uc2a4: \ucc9c\uc77c\uc804\uc7c1"

    const-string v47, "\uc5b8\ube14\ub7ed \uc544\ucf00\uc774\ub4dc"

    const-string v48, "\ud3ec\ucf13 \ub2e8\uc5b4\ucc3e\uae30"

    const-string v49, "\ud3ec\ucf13 \ub2e8\uc5b4\uc655"

    const-string v50, "\ud3ec\ucf13\ucc9c\uc790\ubb38"

    const-string v51, "\ud3ec\ucf13\uc0ac\uc790\uc131\uc5b4"

    const-string v52, "\ud3ec\ucf13\ub2e8\uc5b4\ucc3e\uae302"

    const-string v53, "\ucfe0\ud0a4\uc655\ud074\ub798\uc2dd"

    const-string v54, "\ub77c\ubc14\uc561\uc158\ud30c\uc774\ud130"

    const-string v55, "\ucd94\ucc9c\uac8c\uc784_\ub77c\ubc14\ud788\uc5b4\ub85c\uc9882"

    const-string v56, "VIDE_ADMOB"

    const-string v57, "VIDE_UNITY"

    const-string v58, "\uc790\uccb4\uad11\uace0_Banner"

    const-string v59, "\uc790\uccb4\ubca0\ub108\uad11\uace0_Half"

    const-string v60, "\ud3ab\uad6c\ub9e4"

    const-string v61, "\uad11\uace0\ud3ab\uc624\ud508"

    const-string v62, "\ubcf4\uc2a4\ud2f0\ucf13\uad6c\ub9e4"

    const-string v63, "\ubcf4\uc2a4\ub358\uc804\uc785\uc7a5"

    const-string v64, "\ub77c\ubc14_YouTube"

    const-string v65, "\ub77c\ubc14_YouTube_KID"

    const-string v66, "\ub77c\ubc14\ub2e8\uc5b4\ucc3e\uae30_\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v67, "\ub77c\ubc14\ub4dc\ub85c\uc789_\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v68, "\ub77c\ubc14\ube14\ub7ed\ud37c\uc990_\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v69, "\ub77c\ubc14\ud37c\uc990\uceec\ub809\uc158_\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v70, "\ub77c\ubc14\uac8c\uc784\uccb4\ub110_Youtube"

    const-string v71, "\ub77c\ubc14\ubcbd\ub3cc\uae68\uae30_\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v72, "\ub77c\ubc14\ud2c0\ub9b0\uadf8\ub9bc\ucc3e\uae30_\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v73, "\ud50c\ub77c\uc789\ub77c\ubc14_\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v74, "\ub77c\ubc14\ubc84\ube14\ud31d_\ub2e4\uc6b4\ub85c\ub4dc"

    const-string v75, "\uc8fc\uc5bc\ub9ac\ud074\ub798\uc2dd_\ub2e4\uc6b4\ub85c\ub4dc"

    .line 845
    filled-new-array/range {v1 .. v75}, [Ljava/lang/String;

    move-result-object v1

    .line 858
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->initGoogleAnalytics()V

    .line 860
    sget-object v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGaTracker:Lcom/google/android/gms/analytics/Tracker;

    new-instance v3, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    invoke-direct {v3}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;-><init>()V

    aget-object v4, v0, p0

    .line 861
    invoke-virtual {v3, v4}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->setCategory(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    move-result-object v3

    aget-object v4, v1, p0

    .line 862
    invoke-virtual {v3, v4}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->setAction(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    move-result-object v3

    .line 863
    invoke-virtual {v3}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->build()Ljava/util/Map;

    move-result-object v3

    .line 860
    invoke-virtual {v2, v3}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    .line 865
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 866
    aget-object v0, v0, p0

    aget-object v1, v1, p0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 867
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mFirebaseAnalytics:Lcom/google/firebase/analytics/FirebaseAnalytics;

    const-string v1, "LOG_EVENT"

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->logEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$000(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)Ljava/lang/String;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->adUnitId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)Lcom/unity3d/ads/IUnityAdsShowListener;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->showListener:Lcom/unity3d/ads/IUnityAdsShowListener;

    return-object p0
.end method

.method static synthetic access$202(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;Z)Z
    .locals 0

    .line 74
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mIsBackKeyPressed:Z

    return p1
.end method

.method private backKeyPressed()V
    .locals 6

    .line 671
    iget-boolean v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mIsBackKeyPressed:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 672
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mIsBackKeyPressed:Z

    .line 673
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mCurTime:J

    .line 675
    invoke-direct {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->backKeyStartTimer()V

    goto :goto_0

    .line 677
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mCurTime:J

    const-wide/16 v4, 0x7d0

    add-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    .line 678
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->finish()V

    :cond_1
    :goto_0
    return-void
.end method

.method private backKeyStartTimer()V
    .locals 4

    .line 684
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mTimerHandler:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public static callGPlusApi()V
    .locals 2

    .line 1166
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->onStart(Landroid/app/Activity;)V

    return-void
.end method

.method public static getDeviceId(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const-string v0, "phone"

    .line 900
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 902
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mContext:Landroid/content/Context;

    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-static {p0, v0}, Landroidx/core/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    const-string p0, ""

    return-object p0
.end method

.method public static getSendPhoneNumber(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const-string v0, "0"

    const-string v1, "phone"

    .line 871
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 874
    :try_start_0
    sget-object v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mContext:Landroid/content/Context;

    const-string v3, "android.permission.READ_PHONE_STATE"

    invoke-static {v2, v3}, Landroidx/core/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_0

    .line 882
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 883
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v1

    .line 884
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-gtz v2, :cond_1

    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    const-string v1, ""

    .line 888
    :cond_1
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0xa

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 889
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 891
    :catch_0
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    :goto_1
    const-string v0, "Phone Number "

    .line 894
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0
.end method

.method public static gpOnStop()V
    .locals 1

    .line 607
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->onStop()V

    return-void
.end method

.method public static initGoogleAnalytics()V
    .locals 2

    .line 821
    :try_start_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGaTracker:Lcom/google/android/gms/analytics/Tracker;

    if-nez v0, :cond_0

    .line 822
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    const-string v1, "UA-49734846-1"

    .line 823
    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->newTracker(Ljava/lang/String;)Lcom/google/android/gms/analytics/Tracker;

    move-result-object v0

    sput-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGaTracker:Lcom/google/android/gms/analytics/Tracker;

    .line 824
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->setLocalDispatchPeriod(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private showDialog(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 718
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 719
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 720
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$6;

    invoke-direct {p2, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$6;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)V

    const-string v0, "OK"

    .line 721
    invoke-virtual {p1, v0, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 728
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 730
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method private showExitDialog()V
    .locals 3

    .line 699
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "Notice"

    .line 700
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Do you want quit?"

    .line 701
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$5;

    invoke-direct {v1, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$5;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)V

    const-string v2, "Yes"

    .line 702
    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$4;

    invoke-direct {v1, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$4;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)V

    const-string v2, "No"

    .line 708
    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 712
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 714
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method


# virtual methods
.method public HideNotice()V
    .locals 0

    return-void
.end method

.method public InitADMob()V
    .locals 0

    return-void
.end method

.method public InitNAS()V
    .locals 0

    .line 974
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getUniqueID()V

    return-void
.end method

.method public SetReloadUnityAd()V
    .locals 2

    .line 427
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetUnityAdState()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x4

    .line 429
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityAdState(I)V

    const/4 v0, 0x0

    .line 430
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityAdCloseState(I)V

    .line 431
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityADLoaded(Z)V

    .line 432
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetADMobRewardCloseState(I)V

    const-string v0, "Natives"

    const-string v1, "SetReloadUnityAd"

    .line 433
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public SetUnityAdView(Z)V
    .locals 1

    .line 417
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetUnityAdState()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 418
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetUnityAdCloseState(I)V

    .line 419
    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetADMobRewardCloseState(I)V

    const-string p1, "unityad"

    const-string v0, "onUnityAdsStart"

    .line 420
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 422
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->adUnitId:Ljava/lang/String;

    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->loadListener:Lcom/unity3d/ads/IUnityAdsLoadListener;

    invoke-static {p1, v0}, Lcom/unity3d/ads/UnityAds;->load(Ljava/lang/String;Lcom/unity3d/ads/IUnityAdsLoadListener;)V

    :cond_0
    return-void
.end method

.method public ShowNotice()V
    .locals 0

    .line 923
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getFilesDir()Ljava/io/File;

    return-void
.end method

.method public beginUserInitiatedSignIn()V
    .locals 2

    .line 1181
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    iget-boolean v0, v0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectOnStart:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1182
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->onStart(Landroid/app/Activity;)V

    goto :goto_0

    .line 1184
    :cond_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->beginUserInitiatedSignIn()V

    :goto_0
    return-void
.end method

.method public bpDestory()V
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mBillingManager:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    if-eqz v0, :cond_0

    .line 281
    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->destroy()V

    :cond_0
    return-void
.end method

.method public callShowOffers()V
    .locals 0

    return-void
.end method

.method public callSpendCurrency(I)V
    .locals 0

    return-void
.end method

.method public checkInstallApp(Ljava/lang/String;)Z
    .locals 2

    .line 928
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    .line 931
    :try_start_0
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    return v1
.end method

.method public connectToTapjoy()V
    .locals 0

    .line 978
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getUniqueID()V

    return-void
.end method

.method public destroyApp()V
    .locals 0

    .line 752
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->finish()V

    return-void
.end method

.method public getAchievement()V
    .locals 2

    .line 1199
    sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/games/achievement/Achievements;->getAchievementsIntent(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {p0, v0, v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public getGamesClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 1

    .line 1171
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    return-object v0
.end method

.method public getLeadBoard()V
    .locals 2

    .line 1194
    sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->getAllLeaderboardsIntent(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {p0, v0, v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public getPackageAppStart(Ljava/lang/String;)V
    .locals 1

    .line 942
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x10000000

    .line 943
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 944
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public getUniqueID()V
    .locals 3

    .line 948
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 951
    invoke-static {p0, v0}, Landroidx/core/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 963
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "android_id"

    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 968
    invoke-static {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetNetworkUniqueID(Ljava/lang/String;)V

    return-void
.end method

.method public getUnityCanShow()Z
    .locals 2

    .line 438
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetUnityAdState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public googleSignOut()V
    .locals 1

    .line 1189
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->signOut()V

    return-void
.end method

.method public initAD_Interstitial()V
    .locals 0

    return-void
.end method

.method public isClientConnected()Z
    .locals 1

    .line 1204
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getGamesClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    return v0
.end method

.method public isSignedIn()Z
    .locals 1

    .line 1176
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->isSignedIn()Z

    move-result v0

    return v0
.end method

.method synthetic lambda$onCreate$0$com-mrgames-larvaheroesfree-gptouchplus-GpTouchActivity(Lcom/google/android/gms/ads/initialization/InitializationStatus;)V
    .locals 0

    .line 166
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->initAD_Interstitial()V

    return-void
.end method

.method public loadRewardVidowAd()V
    .locals 0

    .line 288
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->SetReloadUnityAd()V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 242
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 253
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetActivityCallCheck()I

    move-result p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-ne p1, p2, :cond_0

    .line 255
    invoke-static {p3}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetActivityCallCheck(I)V

    goto :goto_0

    .line 256
    :cond_0
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->GetActivityCallCheck()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    .line 258
    invoke-static {p3}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->SetActivityCallCheck(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onConnectFail()V
    .locals 2

    const-string v0, "Natives"

    const-string v1, "Tapjoy connect call failed"

    .line 1066
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onConnectSuccess()V
    .locals 2

    const-string v0, "Natives"

    const-string v1, "Tapjoy SDK connected"

    .line 1012
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 154
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 155
    sput-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mSaveInstanceState:Landroid/os/Bundle;

    .line 158
    sput-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    .line 160
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sput-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mContext:Landroid/content/Context;

    .line 161
    invoke-static {p0}, Lcom/google/firebase/FirebaseApp;->initializeApp(Landroid/content/Context;)Lcom/google/firebase/FirebaseApp;

    .line 164
    new-instance p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$$ExternalSyntheticLambda1;

    invoke-direct {p1, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$$ExternalSyntheticLambda1;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)V

    invoke-static {p0, p1}, Lcom/google/android/gms/ads/MobileAds;->initialize(Landroid/content/Context;Lcom/google/android/gms/ads/initialization/OnInitializationCompleteListener;)V

    const-string p1, "4077325"

    .line 169
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->unityAdsListener:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$UnityAdsListener;

    invoke-static {p0, p1, v0}, Lcom/unity3d/ads/UnityAds;->initialize(Landroid/content/Context;Ljava/lang/String;Lcom/unity3d/ads/IUnityAdsInitializationListener;)V

    .line 171
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-static {p1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object p1

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGaInstance:Lcom/google/android/gms/analytics/GoogleAnalytics;

    const-string v0, "UA-49734846-1"

    .line 172
    invoke-virtual {p1, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->newTracker(Ljava/lang/String;)Lcom/google/android/gms/analytics/Tracker;

    move-result-object p1

    sput-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGaTracker:Lcom/google/android/gms/analytics/Tracker;

    .line 173
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-static {p1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->setLocalDispatchPeriod(I)V

    .line 174
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGaTracker:Lcom/google/android/gms/analytics/Tracker;

    const-string v1, "Game Start_2"

    invoke-virtual {p1, v1}, Lcom/google/android/gms/analytics/Tracker;->setScreenName(Ljava/lang/String;)V

    .line 175
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGaTracker:Lcom/google/android/gms/analytics/Tracker;

    new-instance v1, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;->build()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    .line 178
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-static {p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object p1

    sput-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mFirebaseAnalytics:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 180
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    const-string v2, "Game Start"

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/firebase/analytics/FirebaseAnalytics;->setCurrentScreen(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    new-instance p1, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    invoke-direct {p1, p0}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;-><init>(Landroid/app/Activity;)V

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mBillingManager:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    .line 184
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt p1, v1, :cond_0

    const p1, 0x7f0e0050

    .line 186
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 188
    const-class v1, Landroid/app/NotificationManager;

    .line 189
    invoke-static {p0, v1}, Lkotlin/io/path/PathTreeWalk$$ExternalSyntheticApiModelOutline0;->m(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    .line 190
    new-instance v2, Landroid/app/NotificationChannel;

    const-string v3, "LarvaDefence"

    invoke-direct {v2, p1, v3, v0}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-static {v1, v2}, Landroidx/activity/ComponentDialog$$ExternalSyntheticApiModelOutline0;->m(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 193
    :cond_0
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    const-string v0, "ALL"

    invoke-virtual {p1, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->subscribeToTopic(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 194
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 195
    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    const-string v0, "KR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_1

    .line 196
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    const-string v0, "kr"

    invoke-virtual {p1, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->subscribeToTopic(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    .line 198
    :cond_1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    const-string v0, "en"

    invoke-virtual {p1, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->subscribeToTopic(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    :goto_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    const-string v0, "audio"

    .line 656
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    const/16 v1, 0x18

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq p1, v1, :cond_1

    const/16 v1, 0x19

    if-eq p1, v1, :cond_0

    .line 667
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    .line 663
    invoke-virtual {v0, v2, p1, v3}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    return v3

    .line 659
    :cond_1
    invoke-virtual {v0, v2, v3, v3}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    return v3
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    .line 649
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 632
    :cond_0
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->IsUseArm()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    .line 633
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->IsArmPassed()Z

    move-result p1

    if-nez p1, :cond_1

    .line 634
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->IsShowAlert()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 635
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->destroyApp()V

    return p2

    .line 641
    :cond_1
    invoke-static {}, Lcom/mrgames/larvaheroesfree/Natives;->nativeCheckGameState()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 643
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->mRenderer:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;

    const/high16 v1, -0x3f000000    # -8.0f

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchRenderer;->handleAtcionClear(IFF)V

    :cond_2
    return v0
.end method

.method public onSignInFailed()V
    .locals 0

    return-void
.end method

.method public onSignInSucceeded()V
    .locals 1

    const/4 v0, 0x1

    .line 269
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->curGooglePlayState:Z

    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 230
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 231
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->reportActivityStart(Landroid/app/Activity;)V

    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 236
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 237
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->reportActivityStop(Landroid/app/Activity;)V

    return-void
.end method

.method public requestPurchase(ILjava/lang/String;[B)V
    .locals 0

    .line 275
    iget-object p2, p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mBillingManager:Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;

    if-eqz p2, :cond_0

    .line 276
    invoke-virtual {p2, p1}, Lcom/mrgames/larvaheroesfree/billingClient/BillingManager;->requestPurchase(I)V

    :cond_0
    return-void
.end method

.method public setGameScore(I)V
    .locals 5

    .line 1210
    sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    const v2, 0x7f0e0093

    invoke-virtual {p0, v2}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    int-to-long v3, p1

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->submitScore(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;J)V

    return-void
.end method

.method protected setPackgeName(Ljava/lang/String;)V
    .locals 2

    .line 807
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 809
    sput-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mPakageName:Ljava/lang/String;

    const/4 v1, 0x0

    .line 811
    :try_start_0
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 812
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    sput-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mVersionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 814
    invoke-virtual {p1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 815
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Unable to locate assets, aborting..."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSubscribeTopic(Z)V
    .locals 4

    const-string v0, "kr"

    const-string v1, "en"

    const-string v2, "KR"

    const-string v3, "ALL"

    if-eqz p1, :cond_1

    .line 210
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/google/firebase/messaging/FirebaseMessaging;->subscribeToTopic(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 211
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 212
    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    .line 213
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->subscribeToTopic(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    .line 215
    :cond_0
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->subscribeToTopic(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    .line 219
    :cond_1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/google/firebase/messaging/FirebaseMessaging;->unsubscribeFromTopic(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 220
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 221
    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_2

    .line 222
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->unsubscribeFromTopic(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    .line 224
    :cond_2
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->unsubscribeFromTopic(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    :goto_0
    return-void
.end method

.method public setUnlockAchievement(I)V
    .locals 2

    if-nez p1, :cond_0

    const p1, 0x7f0e0065

    .line 1216
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const p1, 0x7f0e0066

    .line 1217
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    const p1, 0x7f0e0064

    .line 1218
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    :cond_2
    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    const p1, 0x7f0e0083

    .line 1219
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    :cond_3
    const/4 v0, 0x4

    if-ne p1, v0, :cond_4

    const p1, 0x7f0e0085

    .line 1220
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    :cond_4
    const/4 v0, 0x5

    if-ne p1, v0, :cond_5

    const p1, 0x7f0e0084

    .line 1221
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    :cond_5
    const/4 v0, 0x6

    if-ne p1, v0, :cond_6

    const p1, 0x7f0e0068

    .line 1222
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_6
    const/4 v0, 0x7

    if-ne p1, v0, :cond_7

    const p1, 0x7f0e005f

    .line 1223
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_7
    const/16 v0, 0x8

    if-ne p1, v0, :cond_8

    const p1, 0x7f0e001f

    .line 1224
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_8
    const/16 v0, 0x9

    if-ne p1, v0, :cond_9

    const p1, 0x7f0e0020

    .line 1225
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_9
    const/16 v0, 0xa

    if-ne p1, v0, :cond_a

    const p1, 0x7f0e0021

    .line 1226
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_a
    const/16 v0, 0xb

    if-ne p1, v0, :cond_b

    const p1, 0x7f0e0022

    .line 1227
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_b
    const/16 v0, 0xc

    if-ne p1, v0, :cond_c

    const p1, 0x7f0e0076

    .line 1228
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_c
    const/16 v0, 0xd

    if-ne p1, v0, :cond_d

    const p1, 0x7f0e0058

    .line 1229
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_d
    const/16 v0, 0xe

    if-ne p1, v0, :cond_e

    const p1, 0x7f0e0023

    .line 1230
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_e
    const-string p1, ""

    .line 1231
    :goto_0
    sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->mGmsHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/games/achievement/Achievements;->unlock(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V

    return-void
.end method

.method public showDialogExitForUPlus(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 734
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 735
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 736
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 737
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$7;

    invoke-direct {p2, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity$7;-><init>(Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;)V

    const-string v0, "OK"

    .line 738
    invoke-virtual {p1, v0, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 745
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 747
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method
