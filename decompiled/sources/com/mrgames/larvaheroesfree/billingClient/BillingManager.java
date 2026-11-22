package com.mrgames.larvaheroesfree.billingClient;

import android.app.Activity;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.mrgames.larvaheroesfree.gptouchplus.GpTouchGameInit;
import com.mrgames.larvaheroesfree.gptouchplus.GpTouchRenderer;
import com.mrgames.larvaheroesfree.network.GpTouchConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BillingManager implements PurchasesUpdatedListener {
    public static final int BILLING_MANAGER_NOT_INITIALIZED = -1;
    private static final String TAG = "BillingManager";
    BillingFlowParams consumeParams;
    private Activity mActivity;
    private BillingClient mBillingClient;
    private ConsumeResponseListener mConsumeResListnere;
    private SkuDetails skuID_1_Details;
    private SkuDetails skuID_2_Details;
    private SkuDetails skuID_3_Details;
    private SkuDetails skuID_4_Details;
    private SkuDetails skuID_5_Details;
    private SkuDetails skuID_6_Details;
    private SkuDetails skuID_7_Details;
    public connectStatusTypes connectStatus = connectStatusTypes.waiting;
    boolean bConsumeCheck = false;
    private String skuID_1 = "larvadef_f_1000";
    private String skuID_2 = "larvadef_f_3000";
    private String skuID_3 = "larvadef_f_10000";
    private String skuID_4 = "larvadef_f_30000";
    private String skuID_5 = "larvadef_p_3000";
    private String skuID_6 = "larvadef_ticket_1000";
    private String skuID_7 = "larvadef_s_1100";

    public enum connectStatusTypes {
        waiting,
        connected,
        fail,
        disconnected
    }

    public BillingManager(Activity activity) {
        this.mActivity = activity;
        Log.d(TAG, "Billing Init()");
        BillingClient billingClientBuild = BillingClient.newBuilder(this.mActivity).enablePendingPurchases().setListener(this).build();
        this.mBillingClient = billingClientBuild;
        billingClientBuild.startConnection(new BillingClientStateListener() { // from class: com.mrgames.larvaheroesfree.billingClient.BillingManager.1
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                if (billingResult.getResponseCode() == 0) {
                    BillingManager.this.connectStatus = connectStatusTypes.connected;
                    Log.d(BillingManager.TAG, "Google Billing Server Success : " + billingResult.getResponseCode());
                    BillingManager.this.GetSkuDetailList(0);
                    BillingManager.this.GetSkuDetailList(1);
                    BillingManager.this.GetSkuDetailList(2);
                    BillingManager.this.GetSkuDetailList(3);
                    BillingManager.this.GetSkuDetailList(4);
                    BillingManager.this.GetSkuDetailList(5);
                    BillingManager.this.GetSkuDetailList(6);
                    return;
                }
                BillingManager.this.connectStatus = connectStatusTypes.fail;
                Log.d(BillingManager.TAG, "Google Billing Server Fail : " + billingResult.getResponseCode());
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                BillingManager.this.connectStatus = connectStatusTypes.disconnected;
                Log.d(BillingManager.TAG, "Google Billing Server Disconnected");
            }
        });
        this.mConsumeResListnere = new ConsumeResponseListener() { // from class: com.mrgames.larvaheroesfree.billingClient.BillingManager.2
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public void onConsumeResponse(BillingResult billingResult, String str) {
                if (billingResult.getResponseCode() == 0) {
                    Log.d(BillingManager.TAG, "Google Billing Consume Success.");
                    if (BillingManager.this.bConsumeCheck) {
                        BillingManager.this.bConsumeCheck = false;
                        BillingManager.this.mBillingClient.launchBillingFlow(BillingManager.this.mActivity, BillingManager.this.consumeParams);
                        return;
                    }
                    return;
                }
                Log.d(BillingManager.TAG, "Google Billing Consume Fail.");
            }
        };
    }

    public void GetSkuDetailList(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            arrayList.add(this.skuID_1);
        } else if (i == 1) {
            arrayList.add(this.skuID_2);
        } else if (i == 2) {
            arrayList.add(this.skuID_3);
        } else if (i == 3) {
            arrayList.add(this.skuID_4);
        } else if (i == 4) {
            arrayList.add(this.skuID_5);
        } else if (i == 5) {
            arrayList.add(this.skuID_6);
        } else if (i == 6) {
            arrayList.add(this.skuID_7);
        }
        SkuDetailsParams.Builder builderNewBuilder = SkuDetailsParams.newBuilder();
        builderNewBuilder.setSkusList(arrayList).setType("inapp");
        this.mBillingClient.querySkuDetailsAsync(builderNewBuilder.build(), new SkuDetailsResponseListener() { // from class: com.mrgames.larvaheroesfree.billingClient.BillingManager.3
            @Override // com.android.billingclient.api.SkuDetailsResponseListener
            public void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
                if (billingResult.getResponseCode() != 0) {
                    Log.d(BillingManager.TAG, "Billing SkuList Get Fail.");
                    return;
                }
                if (list == null) {
                    Log.d(BillingManager.TAG, "No Billing SkuList.");
                    return;
                }
                for (SkuDetails skuDetails : list) {
                    String sku = skuDetails.getSku();
                    if (BillingManager.this.skuID_1.equals(sku)) {
                        BillingManager.this.skuID_1_Details = skuDetails;
                        Log.d(BillingManager.TAG, "Get skuID_1_Details Success");
                    } else if (BillingManager.this.skuID_2.equals(sku)) {
                        BillingManager.this.skuID_2_Details = skuDetails;
                        Log.d(BillingManager.TAG, "Get skuID_2_Details Success");
                    } else if (BillingManager.this.skuID_3.equals(sku)) {
                        BillingManager.this.skuID_3_Details = skuDetails;
                        Log.d(BillingManager.TAG, "Get skuID_3_Details Success");
                    } else if (BillingManager.this.skuID_4.equals(sku)) {
                        BillingManager.this.skuID_4_Details = skuDetails;
                        Log.d(BillingManager.TAG, "Get skuID_4_Details Success");
                    } else if (BillingManager.this.skuID_5.equals(sku)) {
                        BillingManager.this.skuID_5_Details = skuDetails;
                        Log.d(BillingManager.TAG, "Get skuID_5_Details Success");
                    } else if (BillingManager.this.skuID_6.equals(sku)) {
                        BillingManager.this.skuID_6_Details = skuDetails;
                        Log.d(BillingManager.TAG, "Get skuID_6_Details Success");
                    } else if (BillingManager.this.skuID_7.equals(sku)) {
                        BillingManager.this.skuID_7_Details = skuDetails;
                        Log.d(BillingManager.TAG, "Get skuID_7_Details Success");
                    }
                }
            }
        });
    }

    public void requestPurchase(int i) {
        BillingFlowParams billingFlowParamsBuild;
        this.bConsumeCheck = false;
        if (i == 2) {
            if (this.skuID_1_Details == null) {
                return;
            } else {
                billingFlowParamsBuild = BillingFlowParams.newBuilder().setSkuDetails(this.skuID_1_Details).build();
            }
        } else if (i == 3) {
            if (this.skuID_2_Details == null) {
                return;
            } else {
                billingFlowParamsBuild = BillingFlowParams.newBuilder().setSkuDetails(this.skuID_2_Details).build();
            }
        } else if (i == 4) {
            if (this.skuID_3_Details == null) {
                return;
            } else {
                billingFlowParamsBuild = BillingFlowParams.newBuilder().setSkuDetails(this.skuID_3_Details).build();
            }
        } else if (i == 5) {
            if (this.skuID_4_Details == null) {
                return;
            } else {
                billingFlowParamsBuild = BillingFlowParams.newBuilder().setSkuDetails(this.skuID_4_Details).build();
            }
        } else if (i == 6) {
            if (this.skuID_5_Details == null) {
                return;
            } else {
                billingFlowParamsBuild = BillingFlowParams.newBuilder().setSkuDetails(this.skuID_5_Details).build();
            }
        } else if (i == 7) {
            if (this.skuID_6_Details == null) {
                return;
            } else {
                billingFlowParamsBuild = BillingFlowParams.newBuilder().setSkuDetails(this.skuID_6_Details).build();
            }
        } else if (i != 8) {
            billingFlowParamsBuild = null;
        } else if (this.skuID_7_Details == null) {
            return;
        } else {
            billingFlowParamsBuild = BillingFlowParams.newBuilder().setSkuDetails(this.skuID_7_Details).build();
        }
        if (billingFlowParamsBuild == null) {
            return;
        }
        this.consumeParams = billingFlowParamsBuild;
        BillingResult billingResultLaunchBillingFlow = this.mBillingClient.launchBillingFlow(this.mActivity, billingFlowParamsBuild);
        Log.d(TAG, "requestPurchase result :" + billingResultLaunchBillingFlow.getResponseCode());
        Log.d(TAG, "requestPurchase responseString :" + billingResultLaunchBillingFlow.getDebugMessage());
        billingResultLaunchBillingFlow.getResponseCode();
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        if (billingResult.getResponseCode() == 0 && list != null) {
            for (Purchase purchase : list) {
                Log.d(TAG, "Billing Success.");
                handlePurchase(purchase);
            }
            return;
        }
        if (billingResult.getResponseCode() == 1) {
            Log.d(TAG, "Billing Canceled.");
            new GpTouchRenderer().handlePurchaseState(GpTouchConstants.GPTOUCH_IAP_DLG_ERROR_EVENT, -1);
        } else {
            Log.d(TAG, "Billing Another Fail : " + billingResult.getResponseCode());
            new GpTouchRenderer().handlePurchaseState(GpTouchConstants.GPTOUCH_IAP_DLG_ERROR_EVENT, -1);
        }
    }

    private void handlePurchase(Purchase purchase) {
        ConsumeParams consumeParamsBuild = ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
        ConsumeResponseListener consumeResponseListener = new ConsumeResponseListener() { // from class: com.mrgames.larvaheroesfree.billingClient.BillingManager.4
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public void onConsumeResponse(BillingResult billingResult, String str) {
                billingResult.getResponseCode();
            }
        };
        GpTouchGameInit.SetPurchaseCode(purchase.getOriginalJson());
        GpTouchGameInit.SetSignatureCode(purchase.getSignature());
        new GpTouchRenderer().handlePurchaseState(1024, 1);
        this.mBillingClient.consumeAsync(consumeParamsBuild, consumeResponseListener);
    }

    public void destroy() {
        BillingClient billingClient = this.mBillingClient;
        if (billingClient == null || !billingClient.isReady()) {
            return;
        }
        this.mBillingClient.endConnection();
        this.mBillingClient = null;
    }
}
