package com.mrgames.larvaheroesfree.gptouchplus;

import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Vibrator;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class GpTouchSound {
    public static final int MAX_VOLUME = 80;
    private static boolean bInitSoundList = false;
    private static boolean isSoundON = true;
    private static boolean isVibrationON = true;
    private static MediaPlayer mBgmPlayer = null;
    private static MediaPlayer mPlayer = null;
    private static MediaPlayer mPlayer2 = null;
    private static SoundPool mSfxSoundPool = null;
    private static HashMap<Integer, Integer> mSoundPoolMap = null;
    private static float nMaxVolume = 80.0f;
    private static int nSfxStreamID;
    private static int nSoundMax;
    private static float nVolume;
    private static String[] szSoundList;

    public static void releaseAll() {
        SoundPool soundPool = mSfxSoundPool;
        if (soundPool != null) {
            soundPool.release();
            mSfxSoundPool = null;
        }
        HashMap<Integer, Integer> map = mSoundPoolMap;
        if (map != null) {
            map.clear();
            mSoundPoolMap = null;
        }
        MediaPlayer mediaPlayer = mBgmPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mBgmPlayer = null;
        }
        MediaPlayer mediaPlayer2 = mPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            mPlayer = null;
        }
        MediaPlayer mediaPlayer3 = mPlayer2;
        if (mediaPlayer3 != null) {
            mediaPlayer3.release();
            mPlayer2 = null;
        }
    }

    public static void makeSoundList(String[] strArr, int i) {
        szSoundList = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            Log.i("#JAVA", "#### loadSound path=" + strArr[i2]);
            szSoundList[i2] = strArr[i2];
        }
        bInitSoundList = true;
    }

    public static boolean loadSound(String str, boolean z) {
        Log.i("#JAVA", "#### loadSound path=" + str);
        if (z) {
            stopBGMSound();
            try {
                mBgmPlayer = new MediaPlayer();
                AssetFileDescriptor assetFileDescriptorOpenFd = GpTouchActivity.myActivity.getAssets().openFd(str);
                mBgmPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                mBgmPlayer.prepare();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        stopSound();
        try {
            mPlayer = new MediaPlayer();
            AssetFileDescriptor assetFileDescriptorOpenFd2 = GpTouchActivity.myActivity.getAssets().openFd(str);
            mPlayer.setDataSource(assetFileDescriptorOpenFd2.getFileDescriptor(), assetFileDescriptorOpenFd2.getStartOffset(), assetFileDescriptorOpenFd2.getLength());
            mPlayer.prepare();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean loadSoundEx(int i, boolean z) {
        if (!bInitSoundList || (i < 0 && i >= nSoundMax)) {
            return false;
        }
        if (z) {
            String str = szSoundList[i];
            stopBGMSound();
            try {
                mBgmPlayer = new MediaPlayer();
                AssetFileDescriptor assetFileDescriptorOpenFd = GpTouchActivity.myActivity.getAssets().openFd(str);
                mBgmPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                mBgmPlayer.prepare();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        if (mSfxSoundPool == null) {
            mSfxSoundPool = new SoundPool(10, 3, 0);
            System.out.println("loadSoundEx ============= sndID:" + i + "mSfxSoundPool is null new SoundPool!!!");
        }
        if (mSoundPoolMap == null) {
            mSoundPoolMap = new HashMap<>();
            System.out.println("loadSoundEx ============= sndID:" + i + "mSoundPoolMap is null new HashMap!!!");
        }
        addSFXSound(i, i);
        return true;
    }

    public static void playPathSound(String str, boolean z) {
        if (isSoundON && loadSound(str, z)) {
            if (z) {
                try {
                    MediaPlayer mediaPlayer = mBgmPlayer;
                    float f = nVolume;
                    mediaPlayer.setVolume(f, f);
                    mBgmPlayer.start();
                    mBgmPlayer.setLooping(z);
                    return;
                } catch (Exception unused) {
                    Log.e("SOUND", "playBackgroundMusic: error state");
                    return;
                }
            }
            try {
                MediaPlayer mediaPlayer2 = mPlayer;
                float f2 = nVolume;
                mediaPlayer2.setVolume(f2, f2);
                mPlayer.start();
                mPlayer.setLooping(z);
            } catch (Exception unused2) {
                Log.e("SOUND", "playBackgroundMusic: error state");
            }
        }
    }

    public static void playIdxSound(int i, boolean z) {
        if (bInitSoundList) {
            if (i >= 0 || i < nSoundMax) {
                String str = szSoundList[i];
                if (isSoundON && loadSound(str, z)) {
                    if (z) {
                        try {
                            MediaPlayer mediaPlayer = mBgmPlayer;
                            float f = nVolume;
                            mediaPlayer.setVolume(f, f);
                            mBgmPlayer.start();
                            mBgmPlayer.setLooping(z);
                            return;
                        } catch (Exception unused) {
                            Log.e("SOUND", "playBackgroundMusic: error state");
                            return;
                        }
                    }
                    try {
                        MediaPlayer mediaPlayer2 = mPlayer;
                        float f2 = nVolume;
                        mediaPlayer2.setVolume(f2, f2);
                        mPlayer.start();
                        mPlayer.setLooping(z);
                    } catch (Exception unused2) {
                        Log.e("SOUND", "playBackgroundMusic: error state");
                    }
                }
            }
        }
    }

    public static void playIdxSoundNoLoop(int i) {
        if (bInitSoundList) {
            if (i >= 0 || i < nSoundMax) {
                String str = szSoundList[i];
                System.out.println("===== playIdxSoundNoLoop(0) sndID:" + i + " path:" + str);
                if (isSoundON) {
                    MediaPlayer mediaPlayer = mPlayer2;
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                        mPlayer2 = null;
                    }
                    try {
                        mPlayer2 = new MediaPlayer();
                        AssetFileDescriptor assetFileDescriptorOpenFd = GpTouchActivity.myActivity.getAssets().openFd(str);
                        mPlayer2.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                        mPlayer2.prepare();
                        mPlayer2.setLooping(false);
                        MediaPlayer mediaPlayer2 = mPlayer2;
                        float f = nVolume;
                        mediaPlayer2.setVolume(f, f);
                        mPlayer2.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void playIdxSoundSfx(int i) {
        if (bInitSoundList) {
            if ((i >= 0 || i < nSoundMax) && isSoundON) {
                playSFXSound(i);
            }
        }
    }

    public static void initSFXSounds(int i) {
        releaseAll();
        mSfxSoundPool = new SoundPool(i, 3, 0);
        mSoundPoolMap = new HashMap<>();
        nVolume = 1.0f;
    }

    public static void addSFXSound(int i, int i2) {
        if (mSoundPoolMap == null || !bInitSoundList) {
            return;
        }
        if (i2 >= 0 || i2 < nSoundMax) {
            try {
                mSoundPoolMap.put(Integer.valueOf(i), Integer.valueOf(mSfxSoundPool.load(GpTouchActivity.myActivity.getAssets().openFd(szSoundList[i2]), 1)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void addSFXSound(int i, String str) {
        if (mSoundPoolMap != null) {
            try {
                mSoundPoolMap.put(Integer.valueOf(i), Integer.valueOf(mSfxSoundPool.load(GpTouchActivity.myActivity.getAssets().openFd(str), 1)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void playSFXSound(int i) {
        SoundPool soundPool;
        if (!isSoundON || (soundPool = mSfxSoundPool) == null) {
            return;
        }
        int iIntValue = mSoundPoolMap.get(Integer.valueOf(i)).intValue();
        float f = nVolume;
        nSfxStreamID = soundPool.play(iIntValue, f, f, 1, 0, 1.0f);
    }

    public static void releaseSFXSound() {
        SoundPool soundPool = mSfxSoundPool;
        if (soundPool != null) {
            soundPool.release();
            mSfxSoundPool = null;
        }
        HashMap<Integer, Integer> map = mSoundPoolMap;
        if (map != null) {
            map.clear();
            mSoundPoolMap = null;
        }
    }

    public static boolean isPlaying() {
        MediaPlayer mediaPlayer = mPlayer;
        if (mediaPlayer == null) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    public static boolean isBGMPlaying() {
        MediaPlayer mediaPlayer = mBgmPlayer;
        if (mediaPlayer == null) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    public static void stopSfxSound() {
        SoundPool soundPool = mSfxSoundPool;
        if (soundPool != null) {
            soundPool.stop(nSfxStreamID);
        }
    }

    public static synchronized void stopBGMSound() {
        MediaPlayer mediaPlayer = mBgmPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mBgmPlayer = null;
        }
    }

    public static synchronized void stopSound() {
        MediaPlayer mediaPlayer = mPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mPlayer = null;
        }
    }

    public static void stopAllSound() {
        stopSfxSound();
        stopBGMSound();
        stopSound();
        MediaPlayer mediaPlayer = mPlayer2;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mPlayer2 = null;
        }
    }

    public static void setVolume(int i) {
        Log.i("#JAVA", "#### setVolume vol=" + i);
        int i2 = i / 10;
        isSoundON = i2 > 0;
        if (i2 < 0) {
            i2 = 0;
        }
        float f = i2;
        float f2 = nMaxVolume;
        if (f > f2) {
            i2 = (int) f2;
        }
        nVolume = i2;
    }

    public static float getVolume() {
        return nVolume;
    }

    public static void setSoundON(boolean z) {
        isSoundON = z;
    }

    public static boolean isSoundON() {
        return isSoundON;
    }

    public static void setIsVibtationON(boolean z) {
        isVibrationON = z;
    }

    public static boolean isVibrationON() {
        return isVibrationON;
    }

    public static int getMaxVolume() {
        nMaxVolume = 80.0f;
        AudioManager audioManager = (AudioManager) GpTouchActivity.myActivity.getBaseContext().getSystemService("audio");
        float streamVolume = audioManager.getStreamVolume(3);
        float streamMaxVolume = audioManager.getStreamMaxVolume(3);
        Log.i("#JAVA", "#### getMaxVolume vol=" + (streamVolume / streamMaxVolume) + ", maxVol=" + streamMaxVolume);
        nMaxVolume = streamMaxVolume;
        return (int) (streamMaxVolume * 10.0f);
    }

    public static void Vibrator(int i) {
        if (isVibrationON) {
            ((Vibrator) GpTouchActivity.myActivity.getSystemService("vibrator")).vibrate(i);
        }
    }
}
