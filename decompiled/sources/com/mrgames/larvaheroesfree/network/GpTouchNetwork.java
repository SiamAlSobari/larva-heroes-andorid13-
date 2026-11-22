package com.mrgames.larvaheroesfree.network;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import com.google.common.base.Ascii;
import com.google.firebase.messaging.ServiceStarter;
import com.mrgames.larvaheroesfree.gptouchplus.GpTouchActivity;
import com.mrgames.larvaheroesfree.gptouchplus.GpTouchGameInit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class GpTouchNetwork implements GpTouchConstants, Runnable {
    private static final String INSERT_PAGE = "http://115.68.42.98:5509/itembuy.asp";
    private static boolean PURCHASE_DEBUG = true;
    static final int RC_REQUEST = 10001;
    private static final int SEND_PACKET_HEADER_SIZE = 0;
    protected static String ServerIP = "211.108.62.19";
    protected static int ServerPort = 14101;
    private static final String TAG = "MrgamesPurchase";
    protected static Context appContext = null;
    private static boolean doRecvPacket = false;
    private static boolean doSendPacket = false;
    protected static byte errorCounter = 0;
    protected static DataInputStream inputStream = null;
    private static boolean isBigEndian = false;
    private static boolean isFullNetwork = false;
    private static boolean isRequestPurchase = false;
    protected static boolean isRunning = false;
    private static boolean isUseServerPayCode = true;
    private static String mAid = "";
    private static String mBpinfo = "";
    private static Button mButton = null;
    private static String mPid = "";
    private static String mPname = "";
    private static ProgressDialog mProgressDialog = null;
    private static String mRequestId = null;
    private static String mTid = "";
    protected static GpTouchActivity myActivity = null;
    protected static String myAppId = null;
    protected static String myBPIp = null;
    protected static int myBPPort = 0;
    private static int nResultCode = 99;
    protected static long nextSyncTime = 0;
    protected static DataOutputStream outputStream = null;
    private static int pItemBuySeq = 0;
    private static String pItemName = null;
    public static String pItemPaycode = null;
    private static String pItemServerCode = null;
    protected static short recvCmd = 0;
    protected static int recvLength = 0;
    public static byte[] recvPacket = null;
    private static int recvPayCodeOffset = 10;
    public static int recvlength = 0;
    protected static short sendCmd = 0;
    protected static short sendLength = 0;
    private static String sendPayCode = null;
    private static int sendPayCodeOffset = 4;
    protected static Socket socketConnection;
    private static Thread thread;
    private static Handler mHandler = new Handler();
    private static GpTouchNetwork self = null;
    protected Vector<byte[]> result = new Vector<>();
    protected Vector<byte[]> requestQueue = new Vector<>();
    private Vector<Integer> purchaseSequenceQueue = new Vector<>();
    private Vector<cPurchaseItem> purchaseItemQueue = new Vector<>();

    public static byte[] getLittleInt16(int i) {
        return new byte[]{(byte) ((i >> 0) & 255), (byte) ((i >> 8) & 255)};
    }

    public static byte[] getLittleInt32(int i) {
        return new byte[]{(byte) ((i >> 0) & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] getLittleInt64(long j) {
        return new byte[]{(byte) ((j >> 0) & 255), (byte) ((j >> 8) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 56) & 255)};
    }

    public static byte[] getLittleInt8(int i) {
        return new byte[]{(byte) i};
    }

    public class cPurchaseItem {
        String itemName;
        int itemNameSeq;
        String payCode;

        cPurchaseItem() {
        }

        cPurchaseItem(String str, String str2) {
            this.payCode = str;
            this.itemName = str2;
        }

        cPurchaseItem(int i, String str, String str2) {
            this.itemNameSeq = i;
            this.payCode = str;
            this.itemName = str2;
        }
    }

    public GpTouchNetwork(boolean z) {
        self = this;
        GpTouchActivity gpTouchActivity = GpTouchActivity.myActivity;
        myActivity = gpTouchActivity;
        appContext = gpTouchActivity.getBaseContext();
        isFullNetwork = z;
        myAppId = GpTouchGameInit.GetAppId();
        myBPIp = GpTouchGameInit.GetBpIp();
        myBPPort = GpTouchGameInit.GetBpPort();
    }

    public static void setAppId(String str) {
        myAppId = str;
    }

    public static void setBpIp(String str) {
        myBPIp = str;
    }

    public static void setBpPort(int i) {
        myBPPort = i;
    }

    public static void setRunning(boolean z) {
        isRunning = z;
        if (z) {
            Thread thread2 = new Thread(self);
            thread = thread2;
            thread2.setDaemon(true);
            thread.start();
            return;
        }
        try {
            thread.join();
            thread = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setServerEndian(boolean z) {
        isBigEndian = z;
    }

    public static void setFullNetwork(boolean z) {
        isFullNetwork = z;
    }

    public static void serverInfo(String str, int i) {
        ServerIP = str;
        ServerPort = i;
    }

    public static int getRecvLength() {
        return recvLength;
    }

    public void doSendTCP(byte[] bArr) {
        this.requestQueue.addElement(bArr);
    }

    public byte[] getResponse() {
        if (!this.result.isEmpty()) {
            byte[] bArrFirstElement = this.result.firstElement();
            this.result.removeElementAt(0);
            if (bArrFirstElement instanceof byte[]) {
                return bArrFirstElement;
            }
        }
        return null;
    }

    public boolean isBusy() {
        return (this.requestQueue.isEmpty() && this.result.isEmpty()) ? false : true;
    }

    public boolean isNotRecvYet() {
        return doSendPacket && !doRecvPacket;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                boolean z = isRunning;
                if (z && z) {
                    if (isFullNetwork) {
                        if (this.requestQueue.size() != 0) {
                            this.result.addElement(sendTCPRequest(this.requestQueue.elementAt(0)));
                            this.requestQueue.removeElementAt(0);
                            try {
                                Thread.sleep(ServiceStarter.ERROR_UNKNOWN << errorCounter);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else if (System.currentTimeMillis() > nextSyncTime && !isBusy()) {
                            nextSyncTime = System.currentTimeMillis() + 5000;
                        }
                    } else {
                        if (!this.requestQueue.isEmpty()) {
                            byte[] bArrElementAt = this.requestQueue.elementAt(0);
                            byte[] bArrSendTCPRequest = sendTCPRequest(bArrElementAt);
                            checkOutputPurchaseSequence(bArrElementAt);
                            this.requestQueue.removeElementAt(0);
                            if (bArrSendTCPRequest != null) {
                                this.result.addElement(bArrSendTCPRequest);
                            }
                        }
                        if (isNotRecvYet()) {
                            try {
                                byte[] tCPInput = readTCPInput(inputStream);
                                if (tCPInput != null) {
                                    this.result.addElement(tCPInput);
                                }
                            } catch (SocketTimeoutException e2) {
                                System.out.println("[GPTOUCHSemiNetwork][DEBUG] GPTOUCHNetwork Socket TimeOut!!");
                                e2.printStackTrace();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                }
                return;
            } catch (Exception e4) {
                e4.printStackTrace();
                return;
            }
        }
    }

    private static int parseHeader(DataInputStream dataInputStream) throws Exception {
        byte[] bArr = new byte[9];
        recvLength = 0;
        try {
            dataInputStream.read(bArr, 0, 9);
            recvLength = byte2short(bArr, 5);
            recvCmd = byte2short(bArr, 3);
            System.out.println("[GPTOUCHSemiNetwork][DEBUG] parseHeader========= length:" + recvLength + " cmd:" + ((int) recvCmd));
            return recvLength;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static byte[] readTCPInput(DataInputStream dataInputStream) throws Exception {
        int i;
        try {
            int iAvailable = dataInputStream.available();
            System.out.println("[GPTOUCHFullNetwork][DEBUG] readTCPInput available" + iAvailable);
            boolean z = false;
            if (iAvailable <= 0) {
                dataInputStream.read(new byte[0]);
                Thread.sleep(500L);
                return null;
            }
            int header = parseHeader(dataInputStream);
            System.out.println("[GPTOUCHFullNetwork][DEBUG] readTCPInput datalen" + header);
            if (header < 0) {
                return null;
            }
            if (header == 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[header];
            System.out.println("[GPTOUCHFullNetwork][DEBUG] readTCPInput recvLength9");
            int i2 = 0;
            int i3 = 9;
            while (true) {
                boolean z2 = true;
                if (!z) {
                    int i4 = i2 * 1024;
                    if (i4 + 1024 >= header) {
                        i = header - i4;
                    } else {
                        i2++;
                        z2 = z;
                        i = 1024;
                    }
                    i3 += i;
                    dataInputStream.read(bArr, i4, i);
                    System.out.println("[GPTOUCHFullNetwork][DEBUG] readTCPInput recvLength Size" + i3);
                    System.out.println("[GPTOUCHFullNetwork][DEBUG] readTCPInput datalen Size" + header);
                    System.out.println("[GPTOUCHFullNetwork][DEBUG] readTCPInput isEnd!!!!!" + z2);
                    Thread.yield();
                    z = z2;
                } else {
                    doRecvPacket = true;
                    return bArr;
                }
            }
        } catch (SocketTimeoutException e) {
            System.out.println("[GPTOUCHFullNetwork][DEBUG] readTCPInput Socket Time Out!!!");
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static byte[] getTCPData(byte[] bArr) {
        try {
            if (outputStream == null) {
                outputStream = new DataOutputStream(socketConnection.getOutputStream());
                System.out.println("[GPTOUCHFullNetwork][DEBUG] outputStream Create!!!");
            }
            outputStream.write(bArr);
            outputStream.flush();
            doSendPacket = true;
            doRecvPacket = false;
            if (inputStream == null) {
                inputStream = new DataInputStream(socketConnection.getInputStream());
                System.out.println("[GPTOUCHFullNetwork][DEBUG] inputStream Create!!!");
            }
            return readTCPInput(inputStream);
        } catch (SocketTimeoutException e) {
            System.out.println("[GPTOUCHFullNetwork][DEBUG] getTCPData Socket Time Out!!!");
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private static byte[] insertPacketHeader(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length + 0];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static byte[] sendTCPRequest(byte[] bArr) {
        byte[] bArrInsertPacketHeader = insertPacketHeader(bArr);
        try {
            openTCPConnection();
            return getTCPData(bArrInsertPacketHeader);
        } catch (Exception e) {
            errorCounter = (byte) (errorCounter + 1);
            e.printStackTrace();
            return null;
        }
    }

    private static boolean commonNetAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) appContext.getSystemService("connectivity");
        return connectivityManager.getNetworkInfo(0).isConnected() || connectivityManager.getNetworkInfo(1).isConnected();
    }

    public static boolean openTCPConnection() {
        Log.i("openTCPConnection", "@ openTCPConnectionopenTCPConnectionopenTCPConnection =" + ServerIP);
        if (socketConnection != null) {
            Log.i("openTCPConnection", "@ openTCPConnectionopenTCPConnectionopenTCPConnection =" + ServerIP);
            return true;
        }
        try {
            Socket socket = new Socket(InetAddress.getByName(ServerIP), ServerPort);
            socketConnection = socket;
            socket.setSoTimeout(10000);
            if (socketConnection != null) {
                System.out.println("[GPTOUCHNetwork][DEBUG] openTCPConnection IP : " + ServerIP + " PORT : " + ServerPort + " Success!!");
            }
            return true;
        } catch (SocketTimeoutException e) {
            System.out.println("[GPTOUCHNetwork][DEBUG] openTCPConnection Socket TimeOut!!");
            e.printStackTrace();
            closeTCPConnection();
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            closeTCPConnection();
            return false;
        }
    }

    public static boolean closeTCPConnection() {
        try {
            DataOutputStream dataOutputStream = outputStream;
            if (dataOutputStream != null) {
                dataOutputStream.close();
                outputStream = null;
            }
            DataInputStream dataInputStream = inputStream;
            if (dataInputStream != null) {
                dataInputStream.close();
                inputStream = null;
            }
            Socket socket = socketConnection;
            if (socket != null) {
                socket.close();
                socketConnection = null;
            }
            System.out.println("[GPTOUCHNetwork][DEBUG] GPTOUCHDisconnection Success!!");
            Thread.sleep(500L);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            outputStream = null;
            inputStream = null;
            socketConnection = null;
            return false;
        } finally {
            setRunning(false);
        }
    }

    public static boolean GpTouchServer(String str, int i) {
        errorCounter = (byte) 0;
        recvLength = 0;
        serverInfo(str, i);
        return GpTouchNetworkConnect();
    }

    public void initPurchaseSequenceQueue(int[] iArr) {
        for (int i : iArr) {
            this.purchaseSequenceQueue.addElement(Integer.valueOf(i));
        }
    }

    private boolean isPurchaseSequence(int i) {
        if (this.purchaseSequenceQueue.isEmpty()) {
            return false;
        }
        Enumeration<Integer> enumerationElements = this.purchaseSequenceQueue.elements();
        while (enumerationElements.hasMoreElements()) {
            if (i == enumerationElements.nextElement().intValue()) {
                return true;
            }
        }
        return false;
    }

    public void setPayCodeOffsetInPacket(int i, int i2) {
        sendPayCodeOffset = i;
        recvPayCodeOffset = i2;
    }

    private void checkOutputPurchaseSequence(byte[] bArr) {
        if (isUseServerPayCode || !isPurchaseSequence(sendCmd)) {
            return;
        }
        sendPayCode = new String(bArr, sendPayCodeOffset, 10);
    }

    private boolean checkInputPurchaseSequence(byte[] bArr) {
        String str;
        if (!isPurchaseSequence(recvCmd) || bArr[9] != 1) {
            return false;
        }
        byte2int(bArr, 10);
        if (isUseServerPayCode) {
            str = new String(bArr, recvPayCodeOffset, 10);
        } else {
            str = sendPayCode;
        }
        if (getPurchaseItemQueue(str) == null) {
            return false;
        }
        System.out.println("[GPTOUCHSemiNetwork][DEBUG] requestPurchase!!");
        return true;
    }

    public void initPurchaseItemQueue(int[] iArr, String[] strArr, String[] strArr2) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            this.purchaseItemQueue.addElement(new cPurchaseItem(iArr[i], strArr[i], strArr2[i]));
        }
    }

    public void initPurchaseItemQueue(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            this.purchaseItemQueue.addElement(new cPurchaseItem(strArr[i], strArr2[i]));
        }
    }

    private cPurchaseItem getPurchaseItemQueue(String str) {
        if (this.purchaseItemQueue.isEmpty()) {
            return null;
        }
        Enumeration<cPurchaseItem> enumerationElements = this.purchaseItemQueue.elements();
        while (enumerationElements.hasMoreElements()) {
            cPurchaseItem cpurchaseitemNextElement = enumerationElements.nextElement();
            if (cpurchaseitemNextElement.payCode.equals(str)) {
                return cpurchaseitemNextElement;
            }
        }
        return null;
    }

    public boolean isRequestPurchase() {
        return isRequestPurchase;
    }

    public void setUseServerPayCode(boolean z) {
        isUseServerPayCode = z;
    }

    public static boolean GpTouchNetConnect() {
        return commonNetAvailable();
    }

    public static boolean GpTouchNetworkConnect() {
        if (!GpTouchNetConnect()) {
            return false;
        }
        setRunning(true);
        return openTCPConnection();
    }

    public static boolean GpTouchNetworkDisconnect() {
        return closeTCPConnection();
    }

    public static void GpTouchRequestPurchase(int i, String str, byte[] bArr) {
        String str2;
        try {
            str2 = new String(bArr, "KSC5601");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str2 = null;
        }
        System.out.println("[GPTOUCHNetwork][GPTOUCHRequestPurchase] requestPurchase id:" + i + " code:" + str + " name:" + bArr);
        requestPurchase(i, str, str2);
    }

    static void requestPurchase(int i, String str, String str2) {
        isRequestPurchase = true;
        pItemBuySeq = i;
        pItemServerCode = "" + i;
        pItemPaycode = str;
        pItemName = str2;
    }

    public static final byte[] int2byte(int i) {
        byte[] bArr = new byte[4];
        if (isBigEndian) {
            bArr[3] = (byte) (i & 255);
            bArr[2] = (byte) ((i >>> 8) & 255);
            bArr[1] = (byte) ((i >>> 16) & 255);
            bArr[0] = (byte) ((i >>> 24) & 255);
        } else {
            bArr[0] = (byte) (i & 255);
            bArr[1] = (byte) ((i >>> 8) & 255);
            bArr[2] = (byte) ((i >>> 16) & 255);
            bArr[3] = (byte) ((i >>> 24) & 255);
        }
        return bArr;
    }

    public static final int byte2int(byte[] bArr, int i) {
        int i2;
        byte b;
        if (isBigEndian) {
            i2 = ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
            b = bArr[i + 3];
        } else {
            i2 = ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
            b = bArr[i];
        }
        return (b & 255) | i2;
    }

    public static final byte[] short2byte(short s) {
        byte[] bArr = new byte[2];
        if (isBigEndian) {
            bArr[1] = (byte) (s & 255);
            bArr[0] = (byte) ((s >>> 8) & 255);
        } else {
            bArr[0] = (byte) (s & 255);
            bArr[1] = (byte) ((s >>> 8) & 255);
        }
        return bArr;
    }

    public static final short byte2short(byte[] bArr, int i) {
        int i2;
        byte b;
        if (isBigEndian) {
            i2 = (bArr[i] & 255) << 8;
            b = bArr[i + 1];
        } else {
            i2 = (bArr[i + 1] & 255) << 8;
            b = bArr[i];
        }
        return (short) ((b & 255) | i2);
    }

    public static int parseInt(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static void SendPurchaseData() {
        new Thread(new Runnable() { // from class: com.mrgames.larvaheroesfree.network.GpTouchNetwork.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    GpTouchActivity gpTouchActivity = GpTouchNetwork.myActivity;
                    String sendPhoneNumber = GpTouchActivity.getSendPhoneNumber(GpTouchNetwork.appContext);
                    GpTouchNetwork.myActivity.getPackageName();
                    if (sendPhoneNumber == "") {
                        return;
                    }
                    byte[] bytes = sendPhoneNumber.getBytes();
                    bytes[0] = (byte) (bytes[0] + 33);
                    bytes[1] = (byte) (bytes[1] + 47);
                    bytes[2] = (byte) (bytes[2] + Ascii.SI);
                    bytes[3] = (byte) (bytes[3] + 17);
                    bytes[4] = (byte) (bytes[4] + 19);
                    bytes[5] = (byte) (bytes[5] + Ascii.NAK);
                    bytes[6] = (byte) (bytes[6] + Ascii.ETB);
                    bytes[7] = (byte) (bytes[7] + Ascii.EM);
                    bytes[8] = (byte) (bytes[8] + Ascii.ESC);
                    bytes[9] = (byte) (bytes[9] + Ascii.GS);
                    if (sendPhoneNumber.length() > 10) {
                        bytes[10] = (byte) (bytes[10] + Ascii.US);
                    }
                    new String(bytes);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
