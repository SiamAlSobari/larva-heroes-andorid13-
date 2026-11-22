.class public Lcom/unity3d/services/core/cache/a;
.super Ljava/lang/Object;
.source "CacheDirectory.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:Ljava/io/File;

.field private d:Lcom/unity3d/services/core/cache/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/unity3d/services/core/cache/a;->b:Z

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/unity3d/services/core/cache/a;->c:Ljava/io/File;

    .line 4
    iput-object v0, p0, Lcom/unity3d/services/core/cache/a;->d:Lcom/unity3d/services/core/cache/b;

    .line 7
    iput-object p1, p0, Lcom/unity3d/services/core/cache/a;->a:Ljava/lang/String;

    return-void
.end method

.method private a(Ljava/io/File;)V
    .locals 2

    .line 44
    new-instance v0, Ljava/io/File;

    const-string v1, ".nomedia"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 47
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Successfully created .nomedia file"

    .line 50
    invoke-static {p1}, Lcom/unity3d/services/core/log/a;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Using existing .nomedia file"

    .line 52
    invoke-static {p1}, Lcom/unity3d/services/core/log/a;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to create .nomedia file"

    .line 55
    invoke-static {v0, p1}, Lcom/unity3d/services/core/log/a;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a()Lcom/unity3d/services/core/cache/b;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/unity3d/services/core/cache/a;->d:Lcom/unity3d/services/core/cache/b;

    return-object v0
.end method

.method public declared-synchronized a(Landroid/content/Context;)Ljava/io/File;
    .locals 5

    const-string v0, "Unity Ads is using external cache directory: "

    const-string v1, "Unity Ads is using internal cache directory: "

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v2, p0, Lcom/unity3d/services/core/cache/a;->b:Z

    if-eqz v2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/unity3d/services/core/cache/a;->c:Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    const/4 v2, 0x1

    .line 4
    :try_start_1
    iput-boolean v2, p0, Lcom/unity3d/services/core/cache/a;->b:Z

    .line 7
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    const-string v3, "mounted"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 10
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v2

    iget-object v4, p0, Lcom/unity3d/services/core/cache/a;->a:Ljava/lang/String;

    invoke-virtual {p0, v2, v4}, Lcom/unity3d/services/core/cache/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_3
    const-string v4, "Creating external cache directory failed"

    .line 13
    invoke-static {v4, v2}, Lcom/unity3d/services/core/log/a;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    move-object v2, v3

    .line 16
    :goto_0
    invoke-virtual {p0, v2}, Lcom/unity3d/services/core/cache/a;->b(Ljava/io/File;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 17
    invoke-direct {p0, v2}, Lcom/unity3d/services/core/cache/a;->a(Ljava/io/File;)V

    .line 19
    iput-object v2, p0, Lcom/unity3d/services/core/cache/a;->c:Ljava/io/File;

    .line 20
    sget-object p1, Lcom/unity3d/services/core/cache/b;->a:Lcom/unity3d/services/core/cache/b;

    iput-object p1, p0, Lcom/unity3d/services/core/cache/a;->d:Lcom/unity3d/services/core/cache/b;

    .line 21
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/unity3d/services/core/log/a;->b(Ljava/lang/String;)V

    .line 22
    iget-object p1, p0, Lcom/unity3d/services/core/cache/a;->c:Ljava/io/File;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_1
    :try_start_4
    const-string v0, "External media not mounted"

    .line 25
    invoke-static {v0}, Lcom/unity3d/services/core/log/a;->b(Ljava/lang/String;)V

    .line 29
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Lcom/unity3d/services/core/cache/a;->b(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 31
    iput-object p1, p0, Lcom/unity3d/services/core/cache/a;->c:Ljava/io/File;

    .line 32
    sget-object v0, Lcom/unity3d/services/core/cache/b;->b:Lcom/unity3d/services/core/cache/b;

    iput-object v0, p0, Lcom/unity3d/services/core/cache/a;->d:Lcom/unity3d/services/core/cache/b;

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/unity3d/services/core/log/a;->b(Ljava/lang/String;)V

    .line 34
    iget-object p1, p0, Lcom/unity3d/services/core/cache/a;->c:Ljava/io/File;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_3
    :try_start_5
    const-string p1, "Unity Ads failed to initialize cache directory"

    .line 37
    invoke-static {p1}, Lcom/unity3d/services/core/log/a;->c(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-object v3

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 39
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 41
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 43
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_1

    return-object v1

    :cond_1
    return-object v0
.end method

.method public b(Ljava/io/File;)Z
    .locals 9

    const-string v0, "UTF-8"

    const-string v1, "test"

    const-string v2, "Failed to delete testfile "

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v4

    .line 7
    array-length v5, v4

    new-array v6, v5, [B

    .line 8
    new-instance v7, Ljava/io/File;

    const-string v8, "UnityAdsTest.txt"

    invoke-direct {v7, p1, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    new-instance v8, Ljava/io/FileOutputStream;

    invoke-direct {v8, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 11
    invoke-virtual {v8, v4}, Ljava/io/FileOutputStream;->write([B)V

    .line 12
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->flush()V

    .line 13
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V

    .line 15
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v7}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 16
    invoke-virtual {v4, v6, v3, v5}, Ljava/io/FileInputStream;->read([BII)I

    move-result v8

    .line 17
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V

    .line 19
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v4

    if-nez v4, :cond_1

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unity3d/services/core/log/a;->b(Ljava/lang/String;)V

    return v3

    :cond_1
    if-eq v8, v5, :cond_2

    const-string v0, "Read buffer size mismatch"

    .line 25
    invoke-static {v0}, Lcom/unity3d/services/core/log/a;->b(Ljava/lang/String;)V

    return v3

    .line 29
    :cond_2
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v6, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 31
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    const-string v0, "Read buffer content mismatch"

    .line 34
    invoke-static {v0}, Lcom/unity3d/services/core/log/a;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :catch_0
    move-exception v0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unity Ads exception while testing cache directory "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/unity3d/services/core/log/a;->b(Ljava/lang/String;)V

    :cond_4
    :goto_0
    return v3
.end method
