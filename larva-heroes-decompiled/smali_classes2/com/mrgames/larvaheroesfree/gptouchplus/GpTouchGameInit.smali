.class public Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;
.super Ljava/lang/Object;
.source "GpTouchGameInit.java"


# static fields
.field private static ItemCode:Ljava/lang/String; = null

.field private static final PHONE_SIZE_LARGE:I = 0x2

.field private static final PHONE_SIZE_NORMAL:I = 0x1

.field private static final PHONE_SIZE_middle:I = 0x3

.field private static TapyoyRubeCount:I = 0x0

.field private static activityResutCallCheck:I = 0x0

.field private static bArmPassed:Z = false

.field private static final bFullNetwork:Z = false

.field private static bNetworkState:I = 0x0

.field private static bNicknametextView:Z = false

.field private static bPhoneModel:I = 0x1

.field private static bPushItem:I = 0x0

.field private static bShowAdMob:Z = true

.field private static bShowAdMob2:Z = false

.field private static bShowAdMob3:Z = false

.field private static bShowAlert:Z = false

.field private static bTapjoyListView:Z = false

.field private static final bUseAdMob:Z = true

.field private static final bUseArm:Z = false

.field private static bWebview:Z = false

.field private static curADLoaded:Z = false

.field private static curADMobRewardCloseState:I = 0x0

.field private static curADMobRewardState:I = 0x0

.field private static curBannerAdLevelViewState:I = 0x0

.field private static curBannerAdState:I = 0x0

.field private static curBannerAdState2:I = 0x0

.field private static curFullAdState:I = 0x0

.field private static curNASPoint:I = 0x0

.field private static curNASState:Z = false

.field private static curPermissionState1:I = 0x0

.field private static curPermissionState2:I = 0x0

.field private static curTapjoyState:I = 0x0

.field private static curUnityADLoaded:Z = false

.field private static curUnityAdCloseState:I = 0x0

.field private static curUnityAdState:I = 0x0

.field private static curVungleCloseState:I = 0x0

.field private static curVungleState:I = 0x0

.field private static final nBpPort:I = 0x3715

.field private static nationCode:I = 0x0

.field private static sPublickey:Ljava/lang/String; = ""

.field private static sPurchaseCode:Ljava/lang/String; = ""

.field private static sSignatureCode:Ljava/lang/String; = ""

.field private static final szAppId:Ljava/lang/String; = "OA00356138"

.field private static final szBpIp:Ljava/lang/String; = "211.108.62.19"

.field private static uniqueID:Ljava/lang/String; = ""


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static GetADLoaded()Z
    .locals 1

    .line 212
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curADLoaded:Z

    return v0
.end method

.method public static GetADMobRewardCloseState()I
    .locals 1

    .line 209
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curADMobRewardCloseState:I

    return v0
.end method

.method public static GetADMobRewardState()I
    .locals 1

    .line 207
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curADMobRewardState:I

    return v0
.end method

.method public static GetActivityCallCheck()I
    .locals 1

    .line 153
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->activityResutCallCheck:I

    return v0
.end method

.method public static GetAppId()Ljava/lang/String;
    .locals 1

    const-string v0, "OA00356138"

    return-object v0
.end method

.method public static GetBannerAdLevelViewState()I
    .locals 1

    .line 167
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curBannerAdLevelViewState:I

    return v0
.end method

.method public static GetBannerAdState()I
    .locals 1

    .line 143
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curBannerAdState:I

    return v0
.end method

.method public static GetBannerAdState2()I
    .locals 1

    .line 145
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curBannerAdState2:I

    return v0
.end method

.method public static GetBpIp()Ljava/lang/String;
    .locals 1

    const-string v0, "211.108.62.19"

    return-object v0
.end method

.method public static GetBpPort()I
    .locals 1

    const/16 v0, 0x3715

    return v0
.end method

.method public static GetFullAdState()I
    .locals 1

    .line 149
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curFullAdState:I

    return v0
.end method

.method public static GetNASPoint()I
    .locals 1

    .line 176
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curNASPoint:I

    return v0
.end method

.method public static GetNASState()Z
    .locals 1

    .line 179
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curNASState:Z

    return v0
.end method

.method public static GetNationCode()I
    .locals 1

    .line 191
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->nationCode:I

    return v0
.end method

.method public static GetNetworkState()I
    .locals 1

    .line 140
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bNetworkState:I

    return v0
.end method

.method public static GetNetworkUniqueiD()Ljava/lang/String;
    .locals 1

    .line 188
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->uniqueID:Ljava/lang/String;

    return-object v0
.end method

.method public static GetNicknameTextView()Z
    .locals 1

    .line 117
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bNicknametextView:Z

    return v0
.end method

.method public static GetPermission1()I
    .locals 1

    .line 170
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curPermissionState1:I

    return v0
.end method

.method public static GetPermission2()I
    .locals 1

    .line 173
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curPermissionState2:I

    return v0
.end method

.method public static GetPhoneModel()I
    .locals 1

    .line 112
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bPhoneModel:I

    return v0
.end method

.method public static GetPurchaseCode()Ljava/lang/String;
    .locals 1

    .line 157
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->sPurchaseCode:Ljava/lang/String;

    return-object v0
.end method

.method public static GetPushItem()I
    .locals 1

    .line 135
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bPushItem:I

    return v0
.end method

.method public static GetPushItemCode()Ljava/lang/String;
    .locals 1

    .line 137
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->ItemCode:Ljava/lang/String;

    return-object v0
.end method

.method public static GetSignatureCode()Ljava/lang/String;
    .locals 1

    .line 160
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->sSignatureCode:Ljava/lang/String;

    return-object v0
.end method

.method public static GetTapjoyListView()Z
    .locals 1

    .line 182
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bTapjoyListView:Z

    return v0
.end method

.method public static GetTapjoyRubyCount()I
    .locals 1

    .line 185
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->TapyoyRubeCount:I

    return v0
.end method

.method public static GetTapjoyState()I
    .locals 1

    .line 215
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curTapjoyState:I

    return v0
.end method

.method public static GetUnityADLoaded()Z
    .locals 1

    .line 199
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curUnityADLoaded:Z

    return v0
.end method

.method public static GetUnityAdCloseState()I
    .locals 1

    .line 196
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curUnityAdCloseState:I

    return v0
.end method

.method public static GetUnityAdState()I
    .locals 1

    .line 194
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curUnityAdState:I

    return v0
.end method

.method public static GetVungleCloseState()I
    .locals 1

    .line 204
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curVungleCloseState:I

    return v0
.end method

.method public static GetVungleState()I
    .locals 1

    .line 202
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curVungleState:I

    return v0
.end method

.method public static GetWebview()Z
    .locals 1

    .line 131
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bWebview:Z

    return v0
.end method

.method public static Get_PublicKey()Ljava/lang/String;
    .locals 1

    .line 164
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->sPublickey:Ljava/lang/String;

    return-object v0
.end method

.method public static IsArmPassed()Z
    .locals 1

    .line 120
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bArmPassed:Z

    return v0
.end method

.method public static IsFullNetwork()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static IsShowAlert()Z
    .locals 1

    .line 122
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bShowAlert:Z

    return v0
.end method

.method public static IsUseAdMob()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static IsUseArm()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static SetADLoaded(Z)V
    .locals 0

    .line 211
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curADLoaded:Z

    return-void
.end method

.method public static SetADMobRewardCloseState(I)V
    .locals 0

    .line 208
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curADMobRewardCloseState:I

    return-void
.end method

.method public static SetADMobRewardState(I)V
    .locals 0

    .line 206
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curADMobRewardState:I

    return-void
.end method

.method public static SetActivityCallCheck(I)V
    .locals 0

    .line 152
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->activityResutCallCheck:I

    return-void
.end method

.method public static SetArmPassed(Z)V
    .locals 0

    .line 121
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bArmPassed:Z

    return-void
.end method

.method public static SetBannerAdLevelViewState(I)V
    .locals 0

    .line 166
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curBannerAdLevelViewState:I

    return-void
.end method

.method public static SetBannerAdState(I)V
    .locals 0

    .line 142
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curBannerAdState:I

    return-void
.end method

.method public static SetBannerAdState2(I)V
    .locals 0

    .line 144
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curBannerAdState2:I

    return-void
.end method

.method public static SetFullAdState(I)V
    .locals 0

    .line 148
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curFullAdState:I

    return-void
.end method

.method public static SetNASPoint(I)V
    .locals 0

    .line 175
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curNASPoint:I

    return-void
.end method

.method public static SetNASState(Z)V
    .locals 0

    .line 178
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curNASState:Z

    return-void
.end method

.method public static SetNationCode(I)V
    .locals 0

    .line 190
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->nationCode:I

    return-void
.end method

.method public static SetNetworkState(I)V
    .locals 0

    .line 139
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bNetworkState:I

    return-void
.end method

.method public static SetNetworkUniqueID(Ljava/lang/String;)V
    .locals 0

    .line 187
    sput-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->uniqueID:Ljava/lang/String;

    return-void
.end method

.method public static SetNicknameTextView(Z)V
    .locals 0

    .line 116
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bNicknametextView:Z

    return-void
.end method

.method public static SetPermission1(I)V
    .locals 0

    .line 169
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curPermissionState1:I

    return-void
.end method

.method public static SetPermission2(I)V
    .locals 0

    .line 172
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curPermissionState2:I

    return-void
.end method

.method public static SetPhoneModel(I)V
    .locals 0

    .line 108
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bPhoneModel:I

    return-void
.end method

.method public static SetPurchaseCode(Ljava/lang/String;)V
    .locals 0

    .line 156
    sput-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->sPurchaseCode:Ljava/lang/String;

    return-void
.end method

.method public static SetPushItem(I)V
    .locals 0

    .line 134
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bPushItem:I

    return-void
.end method

.method public static SetPushItemCode(Ljava/lang/String;)V
    .locals 0

    .line 136
    sput-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->ItemCode:Ljava/lang/String;

    return-void
.end method

.method public static SetShowAdMob(Z)V
    .locals 0

    .line 87
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bShowAdMob:Z

    return-void
.end method

.method public static SetShowAdMob2(Z)V
    .locals 0

    .line 95
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bShowAdMob2:Z

    return-void
.end method

.method public static SetShowAdMob3(Z)V
    .locals 0

    .line 103
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bShowAdMob3:Z

    return-void
.end method

.method public static SetShowAlert(Z)V
    .locals 0

    .line 123
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bShowAlert:Z

    return-void
.end method

.method public static SetSignatureCode(Ljava/lang/String;)V
    .locals 0

    .line 159
    sput-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->sSignatureCode:Ljava/lang/String;

    return-void
.end method

.method public static SetTapjoyListView(Z)V
    .locals 0

    .line 181
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bTapjoyListView:Z

    return-void
.end method

.method public static SetTapjoyRubyCount(I)V
    .locals 0

    .line 184
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->TapyoyRubeCount:I

    return-void
.end method

.method public static SetTapjoyState(I)V
    .locals 0

    .line 214
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curTapjoyState:I

    return-void
.end method

.method public static SetUnityADLoaded(Z)V
    .locals 0

    .line 198
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curUnityADLoaded:Z

    return-void
.end method

.method public static SetUnityAdCloseState(I)V
    .locals 0

    .line 195
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curUnityAdCloseState:I

    return-void
.end method

.method public static SetUnityAdState(I)V
    .locals 0

    .line 193
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curUnityAdState:I

    return-void
.end method

.method public static SetVungleCloseState(I)V
    .locals 0

    .line 203
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curVungleCloseState:I

    return-void
.end method

.method public static SetVungleState(I)V
    .locals 0

    .line 201
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->curVungleState:I

    return-void
.end method

.method public static SetWebview(Z)V
    .locals 0

    .line 130
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bWebview:Z

    return-void
.end method

.method public static Set_PublicKey(Ljava/lang/String;)V
    .locals 0

    .line 163
    sput-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->sPublickey:Ljava/lang/String;

    return-void
.end method

.method public static isShowAdMob()Z
    .locals 1

    .line 83
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bShowAdMob:Z

    return v0
.end method

.method public static isShowAdMob2()Z
    .locals 1

    .line 91
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bShowAdMob2:Z

    return v0
.end method

.method public static isShowAdMob3()Z
    .locals 1

    .line 99
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchGameInit;->bShowAdMob3:Z

    return v0
.end method
