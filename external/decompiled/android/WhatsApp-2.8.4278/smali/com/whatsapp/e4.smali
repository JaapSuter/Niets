.class public Lcom/whatsapp/e4;
.super Ljava/lang/Object;
.source "e4.java"


# static fields
.field public static a:Lcom/whatsapp/Statistics$Data;

.field private static b:Ljava/io/File;

.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x58

    const/16 v1, 0x56

    const/16 v3, 0x40

    const/16 v4, 0x26

    const/4 v6, 0x0

    const/4 v0, 0x5

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u00013*)G\u001e?\"!R\u001b96`C\u0000$72\u0006Z\u0005,!R\u001b%,)E\u0001x\u001c!R\u0013\u007f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_0
    if-gt v7, v8, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v6

    const/4 v10, 0x1

    const-string v0, "\u0001\"94O\u0001\"1#U"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1
    if-gt v7, v8, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, "\u0001\"94O\u0001\"1#UR"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2
    if-gt v7, v8, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "\u0017$*/TR:7!B\u001b8?`U\u00067,)U\u0006?;3\u0006\u0014?4%"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3
    if-gt v7, v8, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v8, 0x4

    const-string v0, "\u0017$*/TR%96O\u001c1x3R\u0013\"13R\u001b5+`@\u001b:="

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_4
    if-gt v6, v7, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/e4;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_5
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x72

    goto :goto_5

    :pswitch_1
    move v0, v1

    goto :goto_5

    :pswitch_2
    move v0, v2

    goto :goto_5

    :pswitch_3
    move v0, v3

    goto :goto_5

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_6
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    const/16 v0, 0x72

    goto :goto_6

    :pswitch_5
    move v0, v1

    goto :goto_6

    :pswitch_6
    move v0, v2

    goto :goto_6

    :pswitch_7
    move v0, v3

    goto :goto_6

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_7
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x72

    goto :goto_7

    :pswitch_9
    move v0, v1

    goto :goto_7

    :pswitch_a
    move v0, v2

    goto :goto_7

    :pswitch_b
    move v0, v3

    goto :goto_7

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_8
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x72

    goto :goto_8

    :pswitch_d
    move v0, v1

    goto :goto_8

    :pswitch_e
    move v0, v2

    goto :goto_8

    :pswitch_f
    move v0, v3

    goto :goto_8

    :cond_4
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_9
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x72

    goto :goto_9

    :pswitch_11
    move v0, v1

    goto :goto_9

    :pswitch_12
    move v0, v2

    goto :goto_9

    :pswitch_13
    move v0, v3

    goto :goto_9

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch
.end method

.method public static a(JI)V
    .locals 4
    .parameter
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 65
    packed-switch p2, :pswitch_data_0

    .line 3
    :cond_0
    :goto_0
    return-void

    .line 9
    :pswitch_0
    sget-object v1, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v2, v1, Lcom/whatsapp/Statistics$Data;->rx_media_bytes:J

    add-long/2addr v2, p0

    iput-wide v2, v1, Lcom/whatsapp/Statistics$Data;->rx_media_bytes:J

    .line 55
    if-eqz v0, :cond_0

    .line 43
    :pswitch_1
    sget-object v1, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v2, v1, Lcom/whatsapp/Statistics$Data;->rx_cold_sync_bytes:J

    add-long/2addr v2, p0

    iput-wide v2, v1, Lcom/whatsapp/Statistics$Data;->rx_cold_sync_bytes:J

    .line 70
    if-eqz v0, :cond_0

    .line 13
    :pswitch_2
    sget-object v0, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v1, v0, Lcom/whatsapp/Statistics$Data;->rx_message_service_bytes:J

    add-long/2addr v1, p0

    iput-wide v1, v0, Lcom/whatsapp/Statistics$Data;->rx_message_service_bytes:J

    goto :goto_0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Lcom/whatsapp/sz;)V
    .locals 9
    .parameter

    .prologue
    const-wide/16 v7, 0x1

    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/whatsapp/sz;->i:J

    sub-long/2addr v0, v2

    .line 23
    const-wide/16 v2, 0x3e8

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    .line 12
    sget-object v2, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    sget-object v3, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v3, v3, Lcom/whatsapp/Statistics$Data;->rx_offline_delay:J

    sget-object v5, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v5, v5, Lcom/whatsapp/Statistics$Data;->rx_offline_msgs:J

    mul-long/2addr v3, v5

    add-long/2addr v0, v3

    sget-object v3, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v4, v3, Lcom/whatsapp/Statistics$Data;->rx_offline_msgs:J

    add-long/2addr v4, v7

    iput-wide v4, v3, Lcom/whatsapp/Statistics$Data;->rx_offline_msgs:J

    div-long/2addr v0, v4

    iput-wide v0, v2, Lcom/whatsapp/Statistics$Data;->rx_offline_delay:J

    .line 29
    :cond_0
    iget-byte v0, p0, Lcom/whatsapp/sz;->l:B

    if-nez v0, :cond_1

    .line 24
    sget-object v0, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v1, v0, Lcom/whatsapp/Statistics$Data;->rx_text_msgs:J

    add-long/2addr v1, v7

    iput-wide v1, v0, Lcom/whatsapp/Statistics$Data;->rx_text_msgs:J

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_2

    .line 54
    :cond_1
    sget-object v0, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v1, v0, Lcom/whatsapp/Statistics$Data;->rx_media_msgs:J

    add-long/2addr v1, v7

    iput-wide v1, v0, Lcom/whatsapp/Statistics$Data;->rx_media_msgs:J

    .line 61
    :cond_2
    return-void
.end method

.method public static a(Ljava/io/File;)V
    .locals 6
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 46
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/whatsapp/e4;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-direct {v0, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Lcom/whatsapp/e4;->b:Ljava/io/File;

    .line 18
    :try_start_0
    invoke-static {}, Lcom/whatsapp/e4;->a()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 38
    :goto_0
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    .line 10
    new-instance v3, Lcom/whatsapp/f4;

    invoke-direct {v3, v2}, Lcom/whatsapp/f4;-><init>(Landroid/os/Handler;)V

    const-wide/32 v4, 0xdbba0

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 51
    if-nez v0, :cond_0

    .line 59
    new-instance v0, Lcom/whatsapp/Statistics$Data;

    invoke-direct {v0, v1}, Lcom/whatsapp/Statistics$Data;-><init>(Z)V

    sput-object v0, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    .line 45
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/e4;->z:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    invoke-virtual {v1}, Lcom/whatsapp/Statistics$Data;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 2
    return-void

    .line 31
    :catch_0
    move-exception v0

    .line 4
    sget-object v2, Lcom/whatsapp/e4;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    goto :goto_0
.end method

.method public static a()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 67
    sget-object v0, Lcom/whatsapp/e4;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    const/4 v3, 0x0

    .line 30
    :try_start_0
    new-instance v2, Ljava/io/ObjectInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    sget-object v4, Lcom/whatsapp/e4;->b:Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/InvalidClassException; {:try_start_0 .. :try_end_0} :catch_1

    .line 36
    :try_start_1
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/Statistics$Data;

    sput-object v0, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/InvalidClassException; {:try_start_1 .. :try_end_1} :catch_2

    .line 68
    if-eqz v2, :cond_0

    .line 22
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V

    .line 26
    :cond_0
    const/4 v0, 0x1

    .line 41
    :goto_0
    return v0

    .line 64
    :catch_0
    move-exception v0

    move-object v2, v3

    .line 25
    :goto_1
    :try_start_2
    sget-object v3, Lcom/whatsapp/e4;->z:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-static {v3, v0}, Lcom/whatsapp/g5;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    sget-object v0, Lcom/whatsapp/e4;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    if-eqz v2, :cond_1

    .line 8
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V

    :cond_1
    move v0, v1

    goto :goto_0

    .line 69
    :catch_1
    move-exception v0

    .line 16
    :goto_2
    :try_start_3
    sget-object v2, Lcom/whatsapp/e4;->z:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v2, v2, v4

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    sget-object v0, Lcom/whatsapp/e4;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 73
    if-eqz v3, :cond_2

    .line 41
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V

    :cond_2
    move v0, v1

    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v3, :cond_3

    .line 44
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V

    :cond_3
    throw v0

    :cond_4
    move v0, v1

    .line 34
    goto :goto_0

    .line 63
    :catchall_1
    move-exception v0

    move-object v3, v2

    goto :goto_3

    .line 69
    :catch_2
    move-exception v0

    move-object v3, v2

    goto :goto_2

    .line 64
    :catch_3
    move-exception v0

    goto :goto_1
.end method

.method public static b()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 7
    const/4 v2, 0x0

    .line 33
    :try_start_0
    new-instance v1, Ljava/io/ObjectOutputStream;

    new-instance v0, Lcom/whatsapp/pf;

    sget-object v3, Lcom/whatsapp/App;->C:Lcom/whatsapp/w5;

    sget-object v4, Lcom/whatsapp/e4;->b:Ljava/io/File;

    invoke-direct {v0, v3, v4}, Lcom/whatsapp/pf;-><init>(Lcom/whatsapp/w5;Ljava/io/File;)V

    invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    :try_start_1
    sget-object v0, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    invoke-virtual {v1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    if-eqz v1, :cond_0

    .line 20
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V

    .line 71
    :cond_0
    return-void

    .line 21
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 35
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V

    :cond_1
    throw v0

    .line 21
    :catchall_1
    move-exception v0

    goto :goto_0
.end method

.method public static b(JI)V
    .locals 4
    .parameter
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 57
    packed-switch p2, :pswitch_data_0

    .line 27
    :cond_0
    :goto_0
    return-void

    .line 32
    :pswitch_0
    sget-object v1, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v2, v1, Lcom/whatsapp/Statistics$Data;->tx_media_bytes:J

    add-long/2addr v2, p0

    iput-wide v2, v1, Lcom/whatsapp/Statistics$Data;->tx_media_bytes:J

    .line 19
    if-eqz v0, :cond_0

    .line 49
    :pswitch_1
    sget-object v1, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v2, v1, Lcom/whatsapp/Statistics$Data;->tx_cold_sync_bytes:J

    add-long/2addr v2, p0

    iput-wide v2, v1, Lcom/whatsapp/Statistics$Data;->tx_cold_sync_bytes:J

    .line 62
    if-eqz v0, :cond_0

    .line 48
    :pswitch_2
    sget-object v0, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v1, v0, Lcom/whatsapp/Statistics$Data;->tx_message_service_bytes:J

    add-long/2addr v1, p0

    iput-wide v1, v0, Lcom/whatsapp/Statistics$Data;->tx_message_service_bytes:J

    goto :goto_0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static b(Lcom/whatsapp/sz;)V
    .locals 5
    .parameter

    .prologue
    const-wide/16 v3, 0x1

    .line 14
    iget-byte v0, p0, Lcom/whatsapp/sz;->l:B

    if-nez v0, :cond_0

    .line 42
    sget-object v0, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v1, v0, Lcom/whatsapp/Statistics$Data;->tx_text_msgs:J

    add-long/2addr v1, v3

    iput-wide v1, v0, Lcom/whatsapp/Statistics$Data;->tx_text_msgs:J

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 60
    :cond_0
    sget-object v0, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    iget-wide v1, v0, Lcom/whatsapp/Statistics$Data;->tx_media_msgs:J

    add-long/2addr v1, v3

    iput-wide v1, v0, Lcom/whatsapp/Statistics$Data;->tx_media_msgs:J

    .line 28
    :cond_1
    return-void
.end method

.method public static c()V
    .locals 3

    .prologue
    .line 58
    new-instance v0, Lcom/whatsapp/Statistics$Data;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/whatsapp/Statistics$Data;-><init>(Z)V

    sput-object v0, Lcom/whatsapp/e4;->a:Lcom/whatsapp/Statistics$Data;

    .line 1
    :try_start_0
    invoke-static {}, Lcom/whatsapp/e4;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    :goto_0
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    sget-object v1, Lcom/whatsapp/e4;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
