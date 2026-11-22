.class public Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;
.super Ljava/lang/Object;
.source "GameHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mrgames/larvaheroesfree/googleplay/GameHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SignInFailureReason"
.end annotation


# static fields
.field public static final NO_ACTIVITY_RESULT_CODE:I = -0x64


# instance fields
.field mActivityResultCode:I

.field mServiceErrorCode:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/16 v0, -0x64

    .line 1061
    invoke-direct {p0, p1, v0}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1055
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1056
    iput p1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;->mServiceErrorCode:I

    .line 1057
    iput p2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;->mActivityResultCode:I

    return-void
.end method


# virtual methods
.method public getActivityResultCode()I
    .locals 1

    .line 1052
    iget v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;->mActivityResultCode:I

    return v0
.end method

.method public getServiceErrorCode()I
    .locals 1

    .line 1048
    iget v0, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;->mServiceErrorCode:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1066
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SignInFailureReason(serviceErrorCode:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;->mServiceErrorCode:I

    .line 1067
    invoke-static {v1}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelperUtils;->errorCodeToString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1068
    iget v1, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;->mActivityResultCode:I

    const/16 v2, -0x64

    const-string v3, ")"

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 1069
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ",activityResultCode:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/mrgames/larvaheroesfree/googleplay/GameHelper$SignInFailureReason;->mActivityResultCode:I

    .line 1071
    invoke-static {v2}, Lcom/mrgames/larvaheroesfree/googleplay/GameHelperUtils;->activityResponseCodeToString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
