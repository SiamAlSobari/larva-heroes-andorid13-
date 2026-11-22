.class public Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;
.super Ljava/lang/Object;
.source "GpTouchSound.java"


# static fields
.field public static final MAX_VOLUME:I = 0x50

.field private static bInitSoundList:Z = false

.field private static isSoundON:Z = true

.field private static isVibrationON:Z = true

.field private static mBgmPlayer:Landroid/media/MediaPlayer; = null

.field private static mPlayer:Landroid/media/MediaPlayer; = null

.field private static mPlayer2:Landroid/media/MediaPlayer; = null

.field private static mSfxSoundPool:Landroid/media/SoundPool; = null

.field private static mSoundPoolMap:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static nMaxVolume:F = 80.0f

.field private static nSfxStreamID:I

.field private static nSoundMax:I

.field private static nVolume:F

.field private static szSoundList:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static Vibrator(I)V
    .locals 3

    .line 454
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->isVibrationON:Z

    if-eqz v0, :cond_0

    .line 456
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    const-string v1, "vibrator"

    invoke-virtual {v0, v1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V

    :cond_0
    return-void
.end method

.method public static addSFXSound(II)V
    .locals 3

    .line 298
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 299
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->bInitSoundList:Z

    if-eqz v0, :cond_1

    if-gez p1, :cond_0

    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nSoundMax:I

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 302
    :cond_0
    :try_start_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->szSoundList:[Ljava/lang/String;

    aget-object p1, v0, p1

    .line 304
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 305
    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    .line 306
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSfxSoundPool:Landroid/media/SoundPool;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 308
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static addSFXSound(ILjava/lang/String;)V
    .locals 3

    .line 315
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 319
    :try_start_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 320
    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    .line 321
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSfxSoundPool:Landroid/media/SoundPool;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 323
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public static getMaxVolume()I
    .locals 4

    const/high16 v0, 0x42a00000    # 80.0f

    .line 442
    sput v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nMaxVolume:F

    .line 443
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {v0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    const/4 v1, 0x3

    .line 444
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v2

    int-to-float v2, v2

    .line 445
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v2, v0

    .line 447
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "#### getMaxVolume vol="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", maxVol="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "#JAVA"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 448
    sput v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nMaxVolume:F

    const/high16 v1, 0x41200000    # 10.0f

    mul-float v0, v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static getVolume()F
    .locals 1

    .line 422
    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nVolume:F

    return v0
.end method

.method public static initSFXSounds(I)V
    .locals 3

    .line 290
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->releaseAll()V

    .line 291
    new-instance v0, Landroid/media/SoundPool;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Landroid/media/SoundPool;-><init>(III)V

    sput-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSfxSoundPool:Landroid/media/SoundPool;

    .line 292
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    sput-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    const/high16 p0, 0x3f800000    # 1.0f

    .line 294
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nVolume:F

    return-void
.end method

.method public static isBGMPlaying()Z
    .locals 1

    .line 363
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 364
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    return v0
.end method

.method public static isPlaying()Z
    .locals 1

    .line 356
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 357
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    return v0
.end method

.method public static isSoundON()Z
    .locals 1

    .line 430
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->isSoundON:Z

    return v0
.end method

.method public static isVibrationON()Z
    .locals 1

    .line 438
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->isVibrationON:Z

    return v0
.end method

.method public static loadSound(Ljava/lang/String;Z)Z
    .locals 7

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "#### loadSound path="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "#JAVA"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 99
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->stopBGMSound()V

    .line 101
    :try_start_0
    new-instance p1, Landroid/media/MediaPlayer;

    invoke-direct {p1}, Landroid/media/MediaPlayer;-><init>()V

    sput-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    .line 102
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    .line 103
    invoke-virtual {p1, p0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p0

    .line 104
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v3

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v5

    invoke-virtual/range {v1 .. v6}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 105
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 108
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return v0

    .line 114
    :cond_0
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->stopSound()V

    .line 116
    :try_start_1
    new-instance p1, Landroid/media/MediaPlayer;

    invoke-direct {p1}, Landroid/media/MediaPlayer;-><init>()V

    sput-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    .line 117
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    .line 118
    invoke-virtual {p1, p0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p0

    .line 119
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v3

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v5

    invoke-virtual/range {v1 .. v6}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 120
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :catch_1
    move-exception p0

    .line 123
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return v0
.end method

.method public static loadSoundEx(IZ)Z
    .locals 8

    .line 134
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->bInitSoundList:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    if-gez p0, :cond_0

    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nSoundMax:I

    if-lt p0, v0, :cond_0

    goto/16 :goto_1

    :cond_0
    if-eqz p1, :cond_1

    .line 139
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->szSoundList:[Ljava/lang/String;

    aget-object p0, p1, p0

    .line 141
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->stopBGMSound()V

    .line 143
    :try_start_0
    new-instance p1, Landroid/media/MediaPlayer;

    invoke-direct {p1}, Landroid/media/MediaPlayer;-><init>()V

    sput-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    .line 144
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    .line 145
    invoke-virtual {p1, p0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p0

    .line 146
    sget-object v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v3

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v4

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v6

    invoke-virtual/range {v2 .. v7}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 147
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 150
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return v1

    .line 156
    :cond_1
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSfxSoundPool:Landroid/media/SoundPool;

    const-string v0, "loadSoundEx ============= sndID:"

    if-nez p1, :cond_2

    .line 158
    new-instance p1, Landroid/media/SoundPool;

    const/16 v2, 0xa

    const/4 v3, 0x3

    invoke-direct {p1, v2, v3, v1}, Landroid/media/SoundPool;-><init>(III)V

    sput-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSfxSoundPool:Landroid/media/SoundPool;

    .line 159
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "mSfxSoundPool is null new SoundPool!!!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 162
    :cond_2
    sget-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    if-nez p1, :cond_3

    .line 164
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    sput-object p1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    .line 165
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "mSoundPoolMap is null new HashMap!!!"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 168
    :cond_3
    invoke-static {p0, p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->addSFXSound(II)V

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_1
    return v1
.end method

.method public static makeSoundList([Ljava/lang/String;I)V
    .locals 3

    .line 83
    new-array v0, p1, [Ljava/lang/String;

    sput-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->szSoundList:[Ljava/lang/String;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#### loadSound path="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v2, p0, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "#JAVA"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->szSoundList:[Ljava/lang/String;

    aget-object v2, p0, v0

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    .line 90
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->bInitSoundList:Z

    return-void
.end method

.method public static playIdxSound(IZ)V
    .locals 3

    .line 207
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->bInitSoundList:Z

    if-eqz v0, :cond_2

    if-gez p0, :cond_0

    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nSoundMax:I

    if-lt p0, v0, :cond_0

    goto :goto_0

    .line 212
    :cond_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->szSoundList:[Ljava/lang/String;

    aget-object p0, v0, p0

    .line 214
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->isSoundON:Z

    if-eqz v0, :cond_2

    .line 216
    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->loadSound(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "playBackgroundMusic: error state"

    const-string v0, "SOUND"

    if-eqz p1, :cond_1

    .line 221
    :try_start_0
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    sget v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nVolume:F

    invoke-virtual {v1, v2, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 222
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V

    .line 223
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1, p1}, Landroid/media/MediaPlayer;->setLooping(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 225
    :catch_0
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 231
    :cond_1
    :try_start_1
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    sget v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nVolume:F

    invoke-virtual {v1, v2, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 232
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V

    .line 233
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1, p1}, Landroid/media/MediaPlayer;->setLooping(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 235
    :catch_1
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    :goto_0
    return-void
.end method

.method public static playIdxSoundNoLoop(I)V
    .locals 6

    .line 244
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->bInitSoundList:Z

    if-eqz v0, :cond_2

    if-gez p0, :cond_0

    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nSoundMax:I

    if-lt p0, v0, :cond_0

    goto :goto_0

    .line 247
    :cond_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->szSoundList:[Ljava/lang/String;

    aget-object v0, v0, p0

    .line 249
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "===== playIdxSoundNoLoop(0) sndID:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " path:"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 251
    sget-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->isSoundON:Z

    if-eqz p0, :cond_2

    .line 253
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    if-eqz p0, :cond_1

    .line 255
    invoke-virtual {p0}, Landroid/media/MediaPlayer;->release()V

    const/4 p0, 0x0

    .line 256
    sput-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    .line 260
    :cond_1
    :try_start_0
    new-instance p0, Landroid/media/MediaPlayer;

    invoke-direct {p0}, Landroid/media/MediaPlayer;-><init>()V

    sput-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    .line 261
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->myActivity:Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;

    invoke-virtual {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    .line 262
    invoke-virtual {p0, v0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p0

    .line 263
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 264
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Landroid/media/MediaPlayer;->prepare()V

    .line 266
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 267
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nVolume:F

    invoke-virtual {p0, v0, v0}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 268
    sget-object p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Landroid/media/MediaPlayer;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 271
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static playIdxSoundSfx(I)V
    .locals 1

    .line 278
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->bInitSoundList:Z

    if-eqz v0, :cond_1

    if-gez p0, :cond_0

    sget v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nSoundMax:I

    if-lt p0, v0, :cond_0

    goto :goto_0

    .line 283
    :cond_0
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->isSoundON:Z

    if-eqz v0, :cond_1

    .line 285
    invoke-static {p0}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->playSFXSound(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static playPathSound(Ljava/lang/String;Z)V
    .locals 3

    .line 176
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->isSoundON:Z

    if-eqz v0, :cond_1

    .line 178
    invoke-static {p0, p1}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->loadSound(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "playBackgroundMusic: error state"

    const-string v0, "SOUND"

    if-eqz p1, :cond_0

    .line 184
    :try_start_0
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    sget v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nVolume:F

    invoke-virtual {v1, v2, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 185
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V

    .line 186
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1, p1}, Landroid/media/MediaPlayer;->setLooping(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 188
    :catch_0
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 194
    :cond_0
    :try_start_1
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    sget v2, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nVolume:F

    invoke-virtual {v1, v2, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 195
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V

    .line 196
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1, p1}, Landroid/media/MediaPlayer;->setLooping(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 198
    :catch_1
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public static playSFXSound(I)V
    .locals 8

    .line 330
    sget-boolean v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->isSoundON:Z

    if-eqz v0, :cond_0

    .line 331
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSfxSoundPool:Landroid/media/SoundPool;

    if-eqz v1, :cond_0

    .line 333
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sget v4, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nVolume:F

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    move v3, v4

    invoke-virtual/range {v1 .. v7}, Landroid/media/SoundPool;->play(IFFIIF)I

    move-result p0

    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nSfxStreamID:I

    :cond_0
    return-void
.end method

.method public static releaseAll()V
    .locals 2

    .line 51
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSfxSoundPool:Landroid/media/SoundPool;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 53
    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V

    .line 54
    sput-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSfxSoundPool:Landroid/media/SoundPool;

    .line 57
    :cond_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 59
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 60
    sput-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    .line 63
    :cond_1
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_2

    .line 65
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 66
    sput-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    .line 69
    :cond_2
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_3

    .line 71
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 72
    sput-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    .line 75
    :cond_3
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_4

    .line 77
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 78
    sput-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    :cond_4
    return-void
.end method

.method public static releaseSFXSound()V
    .locals 2

    .line 341
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSfxSoundPool:Landroid/media/SoundPool;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 343
    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V

    .line 344
    sput-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSfxSoundPool:Landroid/media/SoundPool;

    .line 347
    :cond_0
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 349
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 350
    sput-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSoundPoolMap:Ljava/util/HashMap;

    :cond_1
    return-void
.end method

.method public static setIsVibtationON(Z)V
    .locals 0

    .line 434
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->isVibrationON:Z

    return-void
.end method

.method public static setSoundON(Z)V
    .locals 0

    .line 426
    sput-boolean p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->isSoundON:Z

    return-void
.end method

.method public static setVolume(I)V
    .locals 2

    .line 412
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "#### setVolume vol="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "#JAVA"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 413
    div-int/lit8 p0, p0, 0xa

    const/4 v0, 0x0

    if-lez p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 414
    :goto_0
    sput-boolean v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->isSoundON:Z

    if-gez p0, :cond_1

    const/4 p0, 0x0

    :cond_1
    int-to-float v0, p0

    .line 416
    sget v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nMaxVolume:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    float-to-int p0, v1

    :cond_2
    int-to-float p0, p0

    .line 417
    sput p0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nVolume:F

    return-void
.end method

.method public static stopAllSound()V
    .locals 1

    .line 399
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->stopSfxSound()V

    .line 400
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->stopBGMSound()V

    .line 401
    invoke-static {}, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->stopSound()V

    .line 403
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 405
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    .line 406
    sput-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer2:Landroid/media/MediaPlayer;

    :cond_0
    return-void
.end method

.method public static declared-synchronized stopBGMSound()V
    .locals 2

    const-class v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;

    monitor-enter v0

    .line 376
    :try_start_0
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_0

    .line 378
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V

    const/4 v1, 0x0

    .line 379
    sput-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mBgmPlayer:Landroid/media/MediaPlayer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 381
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static stopSfxSound()V
    .locals 2

    .line 369
    sget-object v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mSfxSoundPool:Landroid/media/SoundPool;

    if-eqz v0, :cond_0

    .line 370
    sget v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->nSfxStreamID:I

    invoke-virtual {v0, v1}, Landroid/media/SoundPool;->stop(I)V

    :cond_0
    return-void
.end method

.method public static declared-synchronized stopSound()V
    .locals 2

    const-class v0, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;

    monitor-enter v0

    .line 385
    :try_start_0
    sget-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_0

    .line 387
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V

    const/4 v1, 0x0

    .line 388
    sput-object v1, Lcom/mrgames/larvaheroesfree/gptouchplus/GpTouchSound;->mPlayer:Landroid/media/MediaPlayer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 396
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
