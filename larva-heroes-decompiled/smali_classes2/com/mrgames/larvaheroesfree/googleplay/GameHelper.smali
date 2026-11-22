.class public Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;
.super Ljava/lang/Object;
.source "GameHelper.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;,
        Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;
    }
.end annotation


# static fields
.field public static final CLIENT_ALL:I = 0x7

.field public static final CLIENT_APPSTATE:I = 0x4

.field public static final CLIENT_GAMES:I = 0x1

.field public static final CLIENT_NONE:I = 0x0

.field public static final CLIENT_PLUS:I = 0x2

.field static final DEFAULT_MAX_SIGN_IN_ATTEMPTS:I = 0x3

.field static final RC_RESOLVE:I = 0x2329

.field static final RC_UNUSED:I = 0x232a

.field static final TAG:Ljava/lang/String; = "GameHelper"


# instance fields
.field private final GAMEHELPER_SHARED_PREFS:Ljava/lang/String;

.field private final KEY_SIGN_IN_CANCELLATIONS:Ljava/lang/String;

.field mActivity:Landroid/app/Activity;

.field mAppContext:Landroid/content/Context;

.field public mConnectOnStart:Z

.field private mConnecting:Z

.field mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

.field mDebugLog:Z

.field mExpectingResolution:Z

.field mGamesApiOptions:Lcom/google/android/gms/games/Games$GamesOptions;

.field mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

.field mHandler:Landroid/os/Handler;

.field mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

.field mListener:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;

.field mMaxAutoSignInAttempts:I

.field mPlusApiOptions:Lcom/google/android/gms/plus/Plus$PlusOptions;

.field mRequestedClients:I

.field mRequests:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/gms/games/request/GameRequest;",
            ">;"
        }
    .end annotation
.end field

.field private mSetupDone:Z

.field mShowErrorDialogs:Z

.field mSignInCancelled:Z

.field mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

.field mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

.field mUserInitiatedSignIn:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;I)V
    .locals 3

    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 84
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSetupDone:Z

    .line 87
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    .line 90
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mExpectingResolution:Z

    .line 94
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInCancelled:Z

    const/4 v1, 0x0

    .line 101
    iput-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mActivity:Landroid/app/Activity;

    .line 104
    iput-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mAppContext:Landroid/content/Context;

    .line 114
    iput-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 117
    invoke-static {}, Lcom/google/android/gms/games/Games$GamesOptions;->builder()Lcom/google/android/gms/games/Games$GamesOptions$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/games/Games$GamesOptions$Builder;->build()Lcom/google/android/gms/games/Games$GamesOptions;

    move-result-object v2

    iput-object v2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGamesApiOptions:Lcom/google/android/gms/games/Games$GamesOptions;

    .line 118
    iput-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mPlusApiOptions:Lcom/google/android/gms/plus/Plus$PlusOptions;

    .line 122
    iput-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 133
    iput v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mRequestedClients:I

    const/4 v2, 0x1

    .line 138
    iput-boolean v2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectOnStart:Z

    .line 146
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mUserInitiatedSignIn:Z

    .line 149
    iput-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    .line 152
    iput-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    .line 155
    iput-boolean v2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mShowErrorDialogs:Z

    .line 158
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mDebugLog:Z

    .line 181
    iput-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mListener:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;

    const/4 v0, 0x3

    .line 187
    iput v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mMaxAutoSignInAttempts:I

    const-string v0, "GAMEHELPER_SHARED_PREFS"

    .line 771
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->GAMEHELPER_SHARED_PREFS:Ljava/lang/String;

    const-string v0, "KEY_SIGN_IN_CANCELLATIONS"

    .line 772
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->KEY_SIGN_IN_CANCELLATIONS:Ljava/lang/String;

    .line 199
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mActivity:Landroid/app/Activity;

    .line 200
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mAppContext:Landroid/content/Context;

    .line 201
    iput p2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mRequestedClients:I

    .line 202
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method private doApiOptionsPreCheck()V
    .locals 2

    .line 230
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "GameHelper: you cannot call set*ApiOptions after the client builder has been created. Call it before calling createApiClientBuilder() or setup()."

    .line 234
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->logError(Ljava/lang/String;)V

    .line 235
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method static makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 1

    .line 1000
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const p1, 0x104000a

    const/4 v0, 0x0

    .line 1001
    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    return-object p0
.end method

.method static makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 1

    .line 1006
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    .line 1007
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    const p1, 0x104000a

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    .line 1008
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    return-object p0
.end method

.method public static showFailureDialog(Landroid/app/Activity;II)V
    .locals 2

    const-string v0, "GameHelper"

    if-nez p0, :cond_0

    const-string p0, "*** No Activity. Can\'t show failure dialog!"

    .line 960
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    packed-switch p1, :pswitch_data_0

    const/16 p1, 0x232a

    const/4 v1, 0x0

    .line 981
    invoke-static {p2, p0, p1, v1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->getErrorDialog(ILandroid/app/Activity;ILandroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "No standard error dialog available. Making fallback dialog."

    .line 985
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 987
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v0, 0x0

    .line 989
    invoke-static {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 992
    invoke-static {p2}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelperUtils;->errorCodeToString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 987
    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object p0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x2

    .line 967
    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object p0

    goto :goto_0

    :pswitch_1
    const/4 p1, 0x3

    .line 975
    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object p0

    goto :goto_0

    :pswitch_2
    const/4 p1, 0x1

    .line 971
    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object p0

    goto :goto_0

    :cond_1
    move-object p0, p1

    .line 996
    :goto_0
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return-void

    :pswitch_data_0
    .packed-switch 0x2712
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method assertConfigured(Ljava/lang/String;)V
    .locals 2

    .line 220
    iget-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSetupDone:Z

    if-eqz v0, :cond_0

    return-void

    .line 221
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GameHelper error: Operation attempted without setup: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". The setup() method must be called before attempting any other operation."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 224
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->logError(Ljava/lang/String;)V

    .line 225
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public beginUserInitiatedSignIn()V
    .locals 2

    const-string v0, "beginUserInitiatedSignIn: resetting attempt count."

    .line 659
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 660
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->resetSignInCancellations()V

    const/4 v0, 0x0

    .line 661
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInCancelled:Z

    const/4 v0, 0x1

    .line 662
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectOnStart:Z

    .line 664
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "beginUserInitiatedSignIn() called when already connected. Calling listener directly to notify of success."

    .line 666
    invoke-virtual {p0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->logWarn(Ljava/lang/String;)V

    .line 668
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->notifyListener(Z)V

    return-void

    .line 670
    :cond_0
    iget-boolean v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    if-eqz v1, :cond_1

    const-string v0, "beginUserInitiatedSignIn() called when already connecting. Be patient! You can only call this method after you get an onSignInSucceeded() or onSignInFailed() callback. Suggestion: disable the sign-in button on startup and also when it\'s clicked, and re-enable when you get the callback."

    .line 671
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->logWarn(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v1, "Starting USER-INITIATED sign-in flow."

    .line 681
    invoke-virtual {p0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 686
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mUserInitiatedSignIn:Z

    .line 688
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz v1, :cond_2

    const-string v1, "beginUserInitiatedSignIn: continuing pending sign-in flow."

    .line 691
    invoke-virtual {p0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 692
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    .line 693
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->resolveConnectionResult()V

    goto :goto_0

    :cond_2
    const-string v1, "beginUserInitiatedSignIn: starting new sign-in flow."

    .line 696
    invoke-virtual {p0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 697
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    .line 698
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->connect()V

    :goto_0
    return-void
.end method

.method public clearInvitation()V
    .locals 1

    const/4 v0, 0x0

    .line 486
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    return-void
.end method

.method public clearRequests()V
    .locals 1

    const/4 v0, 0x0

    .line 494
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mRequests:Ljava/util/ArrayList;

    return-void
.end method

.method public clearTurnBasedMatch()V
    .locals 1

    const/4 v0, 0x0

    .line 490
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    return-void
.end method

.method connect()V
    .locals 1

    .line 703
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Already connected."

    .line 704
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "Starting connection."

    .line 707
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 708
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    const/4 v0, 0x0

    .line 709
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    .line 710
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    .line 711
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method public createApiClientBuilder()Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    .locals 4

    .line 273
    iget-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSetupDone:Z

    if-nez v0, :cond_0

    .line 280
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mActivity:Landroid/app/Activity;

    invoke-direct {v0, v1, p0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    .line 281
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 299
    sget-object v1, Lcom/google/android/gms/plus/Plus;->API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/games/Games;->API:Lcom/google/android/gms/common/api/Api;

    invoke-static {}, Lcom/google/android/gms/games/Games$GamesOptions;->builder()Lcom/google/android/gms/games/Games$GamesOptions$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/games/Games$GamesOptions$Builder;->build()Lcom/google/android/gms/games/Games$GamesOptions;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/games/Games;->SCOPE_GAMES:Lcom/google/android/gms/common/api/Scope;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 301
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    return-object v0

    :cond_0
    const-string v0, "GameHelper: you called GameHelper.createApiClientBuilder() after calling setup. You can only get a client builder BEFORE performing setup."

    .line 276
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->logError(Ljava/lang/String;)V

    .line 277
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method debugLog(Ljava/lang/String;)V
    .locals 2

    .line 1028
    iget-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mDebugLog:Z

    if-eqz v0, :cond_0

    .line 1029
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GameHelper: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GameHelper"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public disconnect()V
    .locals 2

    .line 900
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Disconnecting client."

    .line 901
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 902
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    goto :goto_0

    :cond_0
    const-string v0, "GameHelper"

    const-string v1, "disconnect() called when client was already disconnected."

    .line 904
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public enableDebugLog(Z)V
    .locals 0

    .line 534
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mDebugLog:Z

    if-eqz p1, :cond_0

    const-string p1, "Debug log enabled."

    .line 536
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public enableDebugLog(ZLjava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string p2, "GameHelper"

    const-string v0, "GameHelper.enableDebugLog(boolean,String) is deprecated. Use GameHelper.enableDebugLog(boolean)"

    .line 542
    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 544
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->enableDebugLog(Z)V

    return-void
.end method

.method public getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 2

    .line 353
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    return-object v0

    .line 354
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No GoogleApiClient. Did you call setup()?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getInvitation()Lcom/google/android/gms/games/multiplayer/Invitation;
    .locals 2

    .line 465
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GameHelper"

    const-string v1, "Warning: getInvitation() should only be called when signed in, that is, after getting onSignInSuceeded()"

    .line 466
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 470
    :cond_0
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    return-object v0
.end method

.method public getInvitationId()Ljava/lang/String;
    .locals 2

    .line 447
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GameHelper"

    const-string v1, "Warning: getInvitationId() should only be called when signed in, that is, after getting onSignInSuceeded()"

    .line 448
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 452
    :cond_0
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getRequests()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/gms/games/request/GameRequest;",
            ">;"
        }
    .end annotation

    .line 524
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GameHelper"

    const-string v1, "Warning: getRequests() should only be called when signed in, that is, after getting onSignInSuceeded()"

    .line 525
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 529
    :cond_0
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mRequests:Ljava/util/ArrayList;

    return-object v0
.end method

.method getSignInCancellations()I
    .locals 3

    .line 777
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mAppContext:Landroid/content/Context;

    const-string v1, "GAMEHELPER_SHARED_PREFS"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "KEY_SIGN_IN_CANCELLATIONS"

    .line 779
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getSignInError()Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;
    .locals 1

    .line 383
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    return-object v0
.end method

.method public getTurnBasedMatch()Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    .locals 2

    .line 506
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GameHelper"

    const-string v1, "Warning: getTurnBasedMatch() should only be called when signed in, that is, after getting onSignInSuceeded()"

    .line 507
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 511
    :cond_0
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    return-object v0
.end method

.method giveUp(Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;)V
    .locals 2

    const/4 v0, 0x0

    .line 917
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectOnStart:Z

    .line 918
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->disconnect()V

    .line 919
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    .line 921
    iget p1, p1, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;->mActivityResultCode:I

    const/16 v1, 0x2714

    if-ne p1, v1, :cond_0

    .line 923
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mAppContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelperUtils;->printMisconfiguredDebugInfo(Landroid/content/Context;)V

    .line 926
    :cond_0
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->showFailureDialog()V

    .line 927
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    .line 928
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->notifyListener(Z)V

    return-void
.end method

.method public hasInvitation()Z
    .locals 1

    .line 474
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasRequests()Z
    .locals 1

    .line 482
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mRequests:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasSignInError()Z
    .locals 1

    .line 375
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasTurnBasedMatch()Z
    .locals 1

    .line 478
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method incrementSignInCancellations()I
    .locals 4

    .line 786
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getSignInCancellations()I

    move-result v0

    .line 787
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mAppContext:Landroid/content/Context;

    const-string v2, "GAMEHELPER_SHARED_PREFS"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 788
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    const-string v2, "KEY_SIGN_IN_CANCELLATIONS"

    .line 789
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 790
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return v0
.end method

.method public isConnecting()Z
    .locals 1

    .line 367
    iget-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    return v0
.end method

.method public isSignedIn()Z
    .locals 1

    .line 362
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method logError(Ljava/lang/String;)V
    .locals 2

    .line 1038
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "*** GameHelper ERROR: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GameHelper"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method logWarn(Ljava/lang/String;)V
    .locals 2

    .line 1034
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "!!! GameHelper WARNING: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GameHelper"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public makeSimpleDialog(Ljava/lang/String;)Landroid/app/Dialog;
    .locals 1

    .line 1012
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mActivity:Landroid/app/Activity;

    if-nez v0, :cond_0

    const-string p1, "*** makeSimpleDialog failed: no current Activity!"

    .line 1013
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->logError(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 1016
    :cond_0
    invoke-static {v0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object p1

    return-object p1
.end method

.method public makeSimpleDialog(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 1

    .line 1020
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mActivity:Landroid/app/Activity;

    if-nez v0, :cond_0

    const-string p1, "*** makeSimpleDialog failed: no current Activity!"

    .line 1021
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->logError(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 1024
    :cond_0
    invoke-static {v0, p1, p2}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object p1

    return-object p1
.end method

.method notifyListener(Z)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "SUCCESS"

    goto :goto_0

    .line 641
    :cond_0
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    if-eqz v0, :cond_1

    const-string v0, "FAILURE (error)"

    goto :goto_0

    :cond_1
    const-string v0, "FAILURE (no error)"

    :goto_0
    const-string v1, "Notifying LISTENER of sign-in "

    .line 642
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 639
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 643
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mListener:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    .line 645
    invoke-interface {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;->onSignInSucceeded()V

    goto :goto_1

    .line 647
    :cond_2
    invoke-interface {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;->onSignInFailed()V

    :cond_3
    :goto_1
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 583
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "onActivityResult: req="

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x2329

    if-ne p1, v0, :cond_0

    const-string v1, "RC_RESOLVE"

    goto :goto_0

    .line 585
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", resp="

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    invoke-static {p2}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelperUtils;->activityResponseCodeToString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 583
    invoke-virtual {p0, p3}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    if-eq p1, v0, :cond_1

    const-string p1, "onActivityResult: request code not meant for us. Ignoring."

    .line 588
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 593
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mExpectingResolution:Z

    .line 595
    iget-boolean p3, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    if-nez p3, :cond_2

    const-string p1, "onActivityResult: ignoring because we are not connecting."

    .line 596
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 p3, -0x1

    if-ne p2, p3, :cond_3

    const-string p1, "onAR: Resolution was RESULT_OK, so connecting current client again."

    .line 604
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 605
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->connect()V

    goto/16 :goto_1

    :cond_3
    const/16 p3, 0x2711

    if-ne p2, p3, :cond_4

    const-string p1, "onAR: Resolution was RECONNECT_REQUIRED, so reconnecting."

    .line 607
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 608
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->connect()V

    goto :goto_1

    :cond_4
    if-nez p2, :cond_5

    const-string p2, "onAR: Got a cancellation result, so disconnecting."

    .line 611
    invoke-virtual {p0, p2}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 612
    iput-boolean p2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInCancelled:Z

    .line 613
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectOnStart:Z

    .line 614
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mUserInitiatedSignIn:Z

    const/4 p2, 0x0

    .line 615
    iput-object p2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    .line 616
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    .line 617
    iget-object p2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 620
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getSignInCancellations()I

    move-result p2

    .line 621
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->incrementSignInCancellations()I

    move-result p3

    .line 622
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onAR: # of cancellations "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " --> "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", max "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mMaxAutoSignInAttempts:I

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 625
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->notifyListener(Z)V

    goto :goto_1

    .line 629
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "onAR: responseCode="

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 631
    invoke-static {p2}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelperUtils;->activityResponseCodeToString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", so giving up."

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 629
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 633
    new-instance p1, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    iget-object p3, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {p3}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I

    move-result p3

    invoke-direct {p1, p3, p2}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;-><init>(II)V

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->giveUp(Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;)V

    :goto_1
    return-void
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "onConnected: connected!"

    .line 731
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    const-string v0, "onConnected: connection hint provided. Checking for invite."

    .line 734
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    const-string v0, "invitation"

    .line 736
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/Invitation;

    if-eqz v0, :cond_0

    .line 737
    invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "onConnected: connection hint has a room invite!"

    .line 739
    invoke-virtual {p0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 740
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    .line 741
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invitation ID: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;

    invoke-interface {v1}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 745
    :cond_0
    sget-object v0, Lcom/google/android/gms/games/Games;->Requests:Lcom/google/android/gms/games/request/Requests;

    .line 746
    invoke-interface {v0, p1}, Lcom/google/android/gms/games/request/Requests;->getGameRequestsFromBundle(Landroid/os/Bundle;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mRequests:Ljava/util/ArrayList;

    .line 747
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 749
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onConnected: connection hint has "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mRequests:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " request(s)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    :cond_1
    const-string v0, "onConnected: connection hint provided. Checking for TBMP game."

    .line 753
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    const-string v0, "turn_based_match"

    .line 755
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;

    .line 759
    :cond_2
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->succeedSignIn()V

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 5

    const-string v0, "onConnectionFailed"

    .line 807
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 809
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    const-string v0, "Connection failure:"

    .line 810
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 811
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "   - code: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    .line 813
    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I

    move-result v1

    .line 812
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelperUtils;->errorCodeToString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 811
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 814
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "   - resolvable: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 815
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "   - details: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 817
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getSignInCancellations()I

    move-result v0

    .line 820
    iget-boolean v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mUserInitiatedSignIn:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const-string v0, "onConnectionFailed: WILL resolve because user initiated sign-in."

    .line 821
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    goto :goto_1

    .line 823
    :cond_0
    iget-boolean v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInCancelled:Z

    if-eqz v1, :cond_1

    const-string v0, "onConnectionFailed WILL NOT resolve (user already cancelled once)."

    .line 824
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    :goto_0
    const/4 v2, 0x0

    goto :goto_1

    .line 826
    :cond_1
    iget v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mMaxAutoSignInAttempts:I

    if-ge v0, v1, :cond_2

    .line 827
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "onConnectionFailed: WILL resolve because we have below the max# of attempts, "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " < "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mMaxAutoSignInAttempts:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    goto :goto_1

    .line 835
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onConnectionFailed: Will NOT resolve; not user-initiated and max attempts reached: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " >= "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mMaxAutoSignInAttempts:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    if-nez v2, :cond_3

    const-string v0, "onConnectionFailed: since we won\'t resolve, failing now."

    .line 844
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 845
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    .line 846
    iput-boolean v3, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    .line 847
    invoke-virtual {p0, v3}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->notifyListener(Z)V

    return-void

    :cond_3
    const-string p1, "onConnectionFailed: resolving problem..."

    .line 851
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 856
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->resolveConnectionResult()V

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 2

    .line 934
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onConnectionSuspended, cause="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 935
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->disconnect()V

    const/4 p1, 0x0

    .line 936
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    const-string p1, "Making extraordinary call to onSignInFailed callback"

    .line 937
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 938
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    .line 939
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->notifyListener(Z)V

    return-void
.end method

.method public onStart(Landroid/app/Activity;)V
    .locals 3

    .line 393
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mActivity:Landroid/app/Activity;

    .line 394
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mAppContext:Landroid/content/Context;

    const-string p1, "onStart"

    .line 396
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 397
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->assertConfigured(Ljava/lang/String;)V

    .line 399
    iget-boolean p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectOnStart:Z

    if-eqz p1, :cond_1

    .line 400
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "GameHelper"

    const-string v0, "GameHelper: client was already connected on onStart()"

    .line 401
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string p1, "Connecting client."

    .line 404
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 405
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    .line 406
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    goto :goto_0

    :cond_1
    const-string p1, "Not attempting to connect becase mConnectOnStart=false"

    .line 409
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    const-string p1, "Instead, reporting a sign-in failure."

    .line 410
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 411
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$1;

    invoke-direct {v0, p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$1;-><init>(Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method

.method public onStop()V
    .locals 1

    const-string v0, "onStop"

    .line 422
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 423
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->assertConfigured(Ljava/lang/String;)V

    .line 424
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Disconnecting client due to onStop"

    .line 425
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 426
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    goto :goto_0

    :cond_0
    const-string v0, "Client already disconnected when we got onStop."

    .line 428
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    .line 430
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    .line 431
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mExpectingResolution:Z

    const/4 v0, 0x0

    .line 434
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mActivity:Landroid/app/Activity;

    return-void
.end method

.method public reconnectClient()V
    .locals 2

    .line 718
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GameHelper"

    const-string v1, "reconnectClient() called when client is not connected."

    .line 719
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 721
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->connect()V

    goto :goto_0

    :cond_0
    const-string v0, "Reconnecting client."

    .line 723
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 724
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->reconnect()V

    :goto_0
    return-void
.end method

.method resetSignInCancellations()V
    .locals 3

    .line 797
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mAppContext:Landroid/content/Context;

    const-string v1, "GAMEHELPER_SHARED_PREFS"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 798
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "KEY_SIGN_IN_CANCELLATIONS"

    .line 799
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 800
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method resolveConnectionResult()V
    .locals 3

    .line 866
    iget-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mExpectingResolution:Z

    if-eqz v0, :cond_0

    const-string v0, "We\'re already expecting the result of a previous resolution."

    .line 867
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    return-void

    .line 871
    :cond_0
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mActivity:Landroid/app/Activity;

    if-nez v0, :cond_1

    return-void

    .line 875
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "resolveConnectionResult: trying to resolve result: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 877
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Result has resolution. Starting it."

    .line 879
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 883
    :try_start_0
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mExpectingResolution:Z

    .line 884
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mActivity:Landroid/app/Activity;

    const/16 v2, 0x2329

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;->startResolutionForResult(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "SendIntentException, so connecting again."

    .line 888
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 889
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->connect()V

    goto :goto_0

    :cond_2
    const-string v0, "resolveConnectionResult: result has no resolution. Giving up."

    .line 894
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 895
    new-instance v0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->giveUp(Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;)V

    :goto_0
    return-void
.end method

.method public setConnectOnStart(Z)V
    .locals 2

    .line 1081
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Forcing mConnectOnStart="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 1082
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectOnStart:Z

    return-void
.end method

.method public setGamesApiOptions(Lcom/google/android/gms/games/Games$GamesOptions;)V
    .locals 0

    .line 244
    invoke-direct {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->doApiOptionsPreCheck()V

    .line 245
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGamesApiOptions:Lcom/google/android/gms/games/Games$GamesOptions;

    return-void
.end method

.method public setMaxAutoSignInAttempts(I)V
    .locals 0

    .line 216
    iput p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mMaxAutoSignInAttempts:I

    return-void
.end method

.method public setPlusApiOptions(Lcom/google/android/gms/plus/Plus$PlusOptions;)V
    .locals 0

    .line 262
    invoke-direct {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->doApiOptionsPreCheck()V

    .line 263
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mPlusApiOptions:Lcom/google/android/gms/plus/Plus$PlusOptions;

    return-void
.end method

.method public setShowErrorDialogs(Z)V
    .locals 0

    .line 388
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mShowErrorDialogs:Z

    return-void
.end method

.method public setup(Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;)V
    .locals 1

    .line 321
    iget-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSetupDone:Z

    if-nez v0, :cond_1

    .line 326
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mListener:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;

    .line 327
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Setup: requested clients: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mRequestedClients:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 329
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    if-nez p1, :cond_0

    .line 331
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->createApiClientBuilder()Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    .line 334
    :cond_0
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/4 p1, 0x0

    .line 344
    iput-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    const/4 p1, 0x1

    .line 345
    iput-boolean p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSetupDone:Z

    return-void

    :cond_1
    const-string p1, "GameHelper: you cannot call GameHelper.setup() more than once!"

    .line 323
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->logError(Ljava/lang/String;)V

    .line 324
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public showFailureDialog()V
    .locals 3

    .line 943
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    if-eqz v0, :cond_1

    .line 944
    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;->getServiceErrorCode()I

    move-result v0

    .line 945
    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    invoke-virtual {v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;->getActivityResultCode()I

    move-result v1

    .line 947
    iget-boolean v2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mShowErrorDialogs:Z

    if-eqz v2, :cond_0

    .line 948
    iget-object v2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mActivity:Landroid/app/Activity;

    invoke-static {v2, v1, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->showFailureDialog(Landroid/app/Activity;II)V

    goto :goto_0

    .line 950
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not showing error dialog because mShowErrorDialogs==false. Error was: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public signOut()V
    .locals 2

    .line 549
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "signOut: was already disconnected, ignoring."

    .line 551
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    return-void

    .line 557
    :cond_0
    iget v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mRequestedClients:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    const-string v0, "Clearing default account on PlusClient."

    .line 558
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 559
    sget-object v0, Lcom/google/android/gms/plus/Plus;->AccountApi:Lcom/google/android/gms/plus/Account;

    iget-object v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1}, Lcom/google/android/gms/plus/Account;->clearDefaultAccount(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    .line 564
    :cond_1
    iget v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mRequestedClients:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    const-string v0, "Signing out from the Google API Client."

    .line 565
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    .line 566
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-static {v0}, Lcom/google/android/gms/games/Games;->signOut(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    :cond_2
    const-string v0, "Disconnecting client."

    .line 570
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 571
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectOnStart:Z

    .line 572
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    .line 573
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    return-void
.end method

.method succeedSignIn()V
    .locals 2

    const-string v0, "succeedSignIn"

    .line 763
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->debugLog(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 764
    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mSignInFailureReason:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    const/4 v0, 0x1

    .line 765
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnectOnStart:Z

    const/4 v1, 0x0

    .line 766
    iput-boolean v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mUserInitiatedSignIn:Z

    .line 767
    iput-boolean v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->mConnecting:Z

    .line 768
    invoke-virtual {p0, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->notifyListener(Z)V

    return-void
.end method
