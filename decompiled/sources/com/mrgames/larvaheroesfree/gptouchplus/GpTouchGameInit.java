package com.mrgames.larvaheroesfree.gptouchplus;

/* JADX INFO: loaded from: classes2.dex */
public class GpTouchGameInit {
    private static String ItemCode = null;
    private static final int PHONE_SIZE_LARGE = 2;
    private static final int PHONE_SIZE_NORMAL = 1;
    private static final int PHONE_SIZE_middle = 3;
    private static int TapyoyRubeCount = 0;
    private static int activityResutCallCheck = 0;
    private static boolean bArmPassed = false;
    private static final boolean bFullNetwork = false;
    private static int bNetworkState = 0;
    private static boolean bNicknametextView = false;
    private static int bPhoneModel = 1;
    private static int bPushItem = 0;
    private static boolean bShowAdMob = true;
    private static boolean bShowAdMob2 = false;
    private static boolean bShowAdMob3 = false;
    private static boolean bShowAlert = false;
    private static boolean bTapjoyListView = false;
    private static final boolean bUseAdMob = true;
    private static final boolean bUseArm = false;
    private static boolean bWebview = false;
    private static boolean curADLoaded = false;
    private static int curADMobRewardCloseState = 0;
    private static int curADMobRewardState = 0;
    private static int curBannerAdLevelViewState = 0;
    private static int curBannerAdState = 0;
    private static int curBannerAdState2 = 0;
    private static int curFullAdState = 0;
    private static int curNASPoint = 0;
    private static boolean curNASState = false;
    private static int curPermissionState1 = 0;
    private static int curPermissionState2 = 0;
    private static int curTapjoyState = 0;
    private static boolean curUnityADLoaded = false;
    private static int curUnityAdCloseState = 0;
    private static int curUnityAdState = 0;
    private static int curVungleCloseState = 0;
    private static int curVungleState = 0;
    private static final int nBpPort = 14101;
    private static int nationCode = 0;
    private static String sPublickey = "";
    private static String sPurchaseCode = "";
    private static String sSignatureCode = "";
    private static final String szAppId = "OA00356138";
    private static final String szBpIp = "211.108.62.19";
    private static String uniqueID = "";

    public static String GetAppId() {
        return szAppId;
    }

    public static String GetBpIp() {
        return szBpIp;
    }

    public static int GetBpPort() {
        return nBpPort;
    }

    public static boolean IsFullNetwork() {
        return false;
    }

    public static boolean IsUseAdMob() {
        return bUseAdMob;
    }

    public static boolean IsUseArm() {
        return false;
    }

    public static boolean isShowAdMob() {
        return bShowAdMob;
    }

    public static void SetShowAdMob(boolean z) {
        bShowAdMob = z;
    }

    public static boolean isShowAdMob2() {
        return bShowAdMob2;
    }

    public static void SetShowAdMob2(boolean z) {
        bShowAdMob2 = z;
    }

    public static boolean isShowAdMob3() {
        return bShowAdMob3;
    }

    public static void SetShowAdMob3(boolean z) {
        bShowAdMob3 = z;
    }

    public static void SetPhoneModel(int i) {
        bPhoneModel = i;
    }

    public static int GetPhoneModel() {
        return bPhoneModel;
    }

    public static void SetNicknameTextView(boolean z) {
        bNicknametextView = z;
    }

    public static boolean GetNicknameTextView() {
        return bNicknametextView;
    }

    public static boolean IsArmPassed() {
        return bArmPassed;
    }

    public static void SetArmPassed(boolean z) {
        bArmPassed = z;
    }

    public static boolean IsShowAlert() {
        return bShowAlert;
    }

    public static void SetShowAlert(boolean z) {
        bShowAlert = z;
    }

    public static void SetWebview(boolean z) {
        bWebview = z;
    }

    public static boolean GetWebview() {
        return bWebview;
    }

    public static void SetPushItem(int i) {
        bPushItem = i;
    }

    public static int GetPushItem() {
        return bPushItem;
    }

    public static void SetPushItemCode(String str) {
        ItemCode = str;
    }

    public static String GetPushItemCode() {
        return ItemCode;
    }

    public static void SetNetworkState(int i) {
        bNetworkState = i;
    }

    public static int GetNetworkState() {
        return bNetworkState;
    }

    public static void SetBannerAdState(int i) {
        curBannerAdState = i;
    }

    public static int GetBannerAdState() {
        return curBannerAdState;
    }

    public static void SetBannerAdState2(int i) {
        curBannerAdState2 = i;
    }

    public static int GetBannerAdState2() {
        return curBannerAdState2;
    }

    public static void SetFullAdState(int i) {
        curFullAdState = i;
    }

    public static int GetFullAdState() {
        return curFullAdState;
    }

    public static void SetActivityCallCheck(int i) {
        activityResutCallCheck = i;
    }

    public static int GetActivityCallCheck() {
        return activityResutCallCheck;
    }

    public static void SetPurchaseCode(String str) {
        sPurchaseCode = str;
    }

    public static String GetPurchaseCode() {
        return sPurchaseCode;
    }

    public static void SetSignatureCode(String str) {
        sSignatureCode = str;
    }

    public static String GetSignatureCode() {
        return sSignatureCode;
    }

    public static void Set_PublicKey(String str) {
        sPublickey = str;
    }

    public static String Get_PublicKey() {
        return sPublickey;
    }

    public static void SetBannerAdLevelViewState(int i) {
        curBannerAdLevelViewState = i;
    }

    public static int GetBannerAdLevelViewState() {
        return curBannerAdLevelViewState;
    }

    public static void SetPermission1(int i) {
        curPermissionState1 = i;
    }

    public static int GetPermission1() {
        return curPermissionState1;
    }

    public static void SetPermission2(int i) {
        curPermissionState2 = i;
    }

    public static int GetPermission2() {
        return curPermissionState2;
    }

    public static void SetNASPoint(int i) {
        curNASPoint = i;
    }

    public static int GetNASPoint() {
        return curNASPoint;
    }

    public static void SetNASState(boolean z) {
        curNASState = z;
    }

    public static boolean GetNASState() {
        return curNASState;
    }

    public static void SetTapjoyListView(boolean z) {
        bTapjoyListView = z;
    }

    public static boolean GetTapjoyListView() {
        return bTapjoyListView;
    }

    public static void SetTapjoyRubyCount(int i) {
        TapyoyRubeCount = i;
    }

    public static int GetTapjoyRubyCount() {
        return TapyoyRubeCount;
    }

    public static void SetNetworkUniqueID(String str) {
        uniqueID = str;
    }

    public static String GetNetworkUniqueiD() {
        return uniqueID;
    }

    public static void SetNationCode(int i) {
        nationCode = i;
    }

    public static int GetNationCode() {
        return nationCode;
    }

    public static void SetUnityAdState(int i) {
        curUnityAdState = i;
    }

    public static int GetUnityAdState() {
        return curUnityAdState;
    }

    public static void SetUnityAdCloseState(int i) {
        curUnityAdCloseState = i;
    }

    public static int GetUnityAdCloseState() {
        return curUnityAdCloseState;
    }

    public static void SetUnityADLoaded(boolean z) {
        curUnityADLoaded = z;
    }

    public static boolean GetUnityADLoaded() {
        return curUnityADLoaded;
    }

    public static void SetVungleState(int i) {
        curVungleState = i;
    }

    public static int GetVungleState() {
        return curVungleState;
    }

    public static void SetVungleCloseState(int i) {
        curVungleCloseState = i;
    }

    public static int GetVungleCloseState() {
        return curVungleCloseState;
    }

    public static void SetADMobRewardState(int i) {
        curADMobRewardState = i;
    }

    public static int GetADMobRewardState() {
        return curADMobRewardState;
    }

    public static void SetADMobRewardCloseState(int i) {
        curADMobRewardCloseState = i;
    }

    public static int GetADMobRewardCloseState() {
        return curADMobRewardCloseState;
    }

    public static void SetADLoaded(boolean z) {
        curADLoaded = z;
    }

    public static boolean GetADLoaded() {
        return curADLoaded;
    }

    public static void SetTapjoyState(int i) {
        curTapjoyState = i;
    }

    public static int GetTapjoyState() {
        return curTapjoyState;
    }
}
