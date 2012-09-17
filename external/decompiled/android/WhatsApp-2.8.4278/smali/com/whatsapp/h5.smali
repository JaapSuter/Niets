.class public Lcom/whatsapp/h5;
.super Ljava/lang/Object;
.source "h5.java"


# static fields
.field private static final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "9\u0018r"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/h5;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0xc

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x17

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x7f

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x8

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x61

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static a(Ljava/io/File;)Ljava/io/File;
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 20
    sget-object v0, Lcom/whatsapp/h5;->z:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/whatsapp/s4;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/io/File;I)Ljava/util/ArrayList;
    .locals 1
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "I)",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .prologue
    .line 19
    sget-object v0, Lcom/whatsapp/h5;->z:Ljava/lang/String;

    invoke-static {p0, p1, v0}, Lcom/whatsapp/s4;->a(Ljava/io/File;ILjava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/io/File;Ljava/io/File;)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 15
    invoke-static {p0, p1}, Lcom/whatsapp/s4;->a(Ljava/io/File;Ljava/io/File;)Z

    move-result v0

    return v0
.end method

.method public static b(Ljava/io/File;Ljava/io/File;)Ljava/io/File;
    .locals 5
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 27
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    sget-object v2, Lcom/whatsapp/h5;->z:Ljava/lang/String;

    invoke-static {p0, v0, v2}, Lcom/whatsapp/s4;->a(Ljava/io/File;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 17
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-direct {v0, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 25
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 26
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v3, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 13
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 5
    invoke-static {v3}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 6
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    .line 2
    :try_start_2
    invoke-static {v2, v3}, Lcom/whatsapp/s4;->a(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 7
    if-eqz v2, :cond_0

    .line 16
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->close()V

    .line 8
    :cond_0
    if-eqz v3, :cond_1

    .line 23
    :goto_0
    invoke-interface {v3}, Ljava/nio/channels/WritableByteChannel;->close()V

    .line 14
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 21
    :goto_1
    return-object v0

    .line 7
    :catchall_0
    move-exception v0

    move-object v3, v1

    :goto_2
    if-eqz v1, :cond_2

    .line 16
    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->close()V

    .line 8
    :cond_2
    if-eqz v3, :cond_3

    .line 23
    invoke-interface {v3}, Ljava/nio/channels/WritableByteChannel;->close()V

    .line 7
    :cond_3
    throw v0

    :cond_4
    move-object v0, v1

    .line 4
    goto :goto_1

    .line 12
    :catch_0
    move-exception v2

    move-object v2, v1

    move-object v3, v1

    .line 7
    :goto_3
    if-eqz v2, :cond_5

    .line 16
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->close()V

    .line 8
    :cond_5
    if-eqz v3, :cond_1

    goto :goto_0

    .line 7
    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v1, v2

    goto :goto_2

    .line 12
    :catch_1
    move-exception v2

    move-object v2, v1

    goto :goto_3

    :catch_2
    move-exception v4

    goto :goto_3
.end method

.method public static b(Ljava/io/File;I)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 10
    sget-object v0, Lcom/whatsapp/h5;->z:Ljava/lang/String;

    invoke-static {p0, p1, v0}, Lcom/whatsapp/s4;->b(Ljava/io/File;ILjava/lang/String;)V

    .line 9
    return-void
.end method
