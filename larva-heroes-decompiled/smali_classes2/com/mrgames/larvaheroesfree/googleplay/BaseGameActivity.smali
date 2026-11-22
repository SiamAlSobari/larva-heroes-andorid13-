.class public abstract Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source "BaseGameActivity.java"

# interfaces
.implements Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;


# static fields
.field public static final CLIENT_ALL:I = 0x7

.field public static final CLIENT_APPSTATE:I = 0x4

.field public static final CLIENT_GAMES:I = 0x1

.field public static final CLIENT_PLUS:I = 0x2

.field private static final TAG:Ljava/lang/String; = "BaseGameActivity"


# instance fields
.field protected mDebugLog:Z

.field protected mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

.field protected mRequestedClients:I


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;-><init>()V

    const/4 v0, 0x1

    .line 57
    iput v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mRequestedClients:I

    const/4 v0, 0x0

    .line 60
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mDebugLog:Z

    return-void
.end method

.method protected constructor <init>(I)V
    .locals 1

    .line 73
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;-><init>()V

    const/4 v0, 0x1

    .line 57
    iput v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mRequestedClients:I

    const/4 v0, 0x0

    .line 60
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mDebugLog:Z

    .line 74
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->setRequestedClients(I)V

    return-void
.end method


# virtual methods
.method protected beginUserInitiatedSignIn()V
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->beginUserInitiatedSignIn()V

    return-void
.end method

.method protected enableDebugLog(Z)V
    .locals 1

    const/4 v0, 0x1

    .line 151
    iput-boolean v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mDebugLog:Z

    .line 152
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    if-eqz v0, :cond_0

    .line 153
    invoke-virtual {v0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->enableDebugLog(Z)V

    :cond_0
    return-void
.end method

.method protected enableDebugLog(ZLjava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string p2, "BaseGameActivity"

    const-string v0, "BaseGameActivity.enabledDebugLog(bool,String) is deprecated. Use enableDebugLog(boolean)"

    .line 159
    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    invoke-virtual {p0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->enableDebugLog(Z)V

    return-void
.end method

.method protected getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    return-object v0
.end method

.method public getGameHelper()Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    if-nez v0, :cond_0

    .line 93
    new-instance v0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    iget v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mRequestedClients:I

    invoke-direct {v0, p0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;-><init>(Landroid/app/Activity;I)V

    iput-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    .line 94
    iget-boolean v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mDebugLog:Z

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->enableDebugLog(Z)V

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    return-object v0
.end method

.method protected getInvitationId()Ljava/lang/String;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getInvitationId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getSignInError()Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->getSignInError()Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;

    move-result-object v0

    return-object v0
.end method

.method protected hasSignInError()Z
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->hasSignInError()Z

    move-result v0

    return v0
.end method

.method protected isSignedIn()Z
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->isSignedIn()Z

    move-result v0

    return v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 122
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 123
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 101
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 102
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    if-nez p1, :cond_0

    .line 103
    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->getGameHelper()Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    .line 105
    :cond_0
    iget-object p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {p1, p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->setup(Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$GameHelperListener;)V

    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 110
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStart()V

    .line 111
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0, p0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->onStart(Landroid/app/Activity;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 116
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStop()V

    .line 117
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->onStop()V

    return-void
.end method

.method protected reconnectClient()V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->reconnectClient()V

    return-void
.end method

.method protected setRequestedClients(I)V
    .locals 0

    .line 88
    iput p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mRequestedClients:I

    return-void
.end method

.method protected showAlert(Ljava/lang/String;)V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0, p1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->makeSimpleDialog(Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method protected showAlert(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0, p1, p2}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->makeSimpleDialog(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method protected signOut()V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/BaseGameActivity;->mHelper:Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;->signOut()V

    return-void
.end method
