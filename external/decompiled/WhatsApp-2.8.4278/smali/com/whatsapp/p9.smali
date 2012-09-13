.class Lcom/whatsapp/p9;
.super Ljava/lang/Thread;
.source "p9.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/ow;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v3, 0x32

    const/16 v1, 0x18

    const/4 v2, 0x6

    const/4 v4, 0x4

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0007}b[e\u000bmr]`\u0005oh^k\u000b|)Vk\u001dvj]e\u000e8"

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

    const/4 v8, 0x1

    const-string v0, "\u0007}b[e\u000bmr]`\u0005oh^k\u000b|)Vk\u001dvj]e\u000e8`Sm\u0006}b\u0012"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/p9;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_2
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x6a

    goto :goto_2

    :pswitch_1
    move v0, v1

    goto :goto_2

    :pswitch_2
    move v0, v2

    goto :goto_2

    :pswitch_3
    move v0, v3

    goto :goto_2

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    const/16 v0, 0x6a

    goto :goto_3

    :pswitch_5
    move v0, v1

    goto :goto_3

    :pswitch_6
    move v0, v2

    goto :goto_3

    :pswitch_7
    move v0, v3

    goto :goto_3

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
.end method

.method constructor <init>(Lcom/whatsapp/ow;)V
    .locals 0
    .parameter

    .prologue
    .line 19
    iput-object p1, p0, Lcom/whatsapp/p9;->a:Lcom/whatsapp/ow;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .prologue
    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 33
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/p9;->a:Lcom/whatsapp/ow;

    invoke-static {v0}, Lcom/whatsapp/ow;->a(Lcom/whatsapp/ow;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 14
    iget-object v0, p0, Lcom/whatsapp/p9;->a:Lcom/whatsapp/ow;

    invoke-static {v0}, Lcom/whatsapp/ow;->a(Lcom/whatsapp/ow;)Ljava/util/Stack;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :try_start_1
    iget-object v0, p0, Lcom/whatsapp/p9;->a:Lcom/whatsapp/ow;

    invoke-static {v0}, Lcom/whatsapp/ow;->a(Lcom/whatsapp/ow;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 24
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    :cond_1
    const-wide/16 v0, 0x3e8

    :try_start_2
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 32
    iget-object v0, p0, Lcom/whatsapp/p9;->a:Lcom/whatsapp/ow;

    invoke-static {v0}, Lcom/whatsapp/ow;->a(Lcom/whatsapp/ow;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 30
    iget-object v0, p0, Lcom/whatsapp/p9;->a:Lcom/whatsapp/ow;

    invoke-static {v0}, Lcom/whatsapp/ow;->a(Lcom/whatsapp/ow;)Ljava/util/Stack;

    move-result-object v1

    monitor-enter v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 21
    :try_start_3
    iget-object v0, p0, Lcom/whatsapp/p9;->a:Lcom/whatsapp/ow;

    invoke-static {v0}, Lcom/whatsapp/ow;->a(Lcom/whatsapp/ow;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/p9;->z:[Ljava/lang/String;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, v0, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 23
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 22
    :try_start_4
    iget-object v1, v0, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v1, Lcom/whatsapp/MediaData;

    .line 13
    invoke-static {v0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/sz;)Ljava/io/File;

    move-result-object v2

    iput-object v2, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 2
    sget-object v2, Lcom/whatsapp/yf;->a:Lcom/whatsapp/yf;
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 25
    :try_start_5
    new-instance v4, Lcom/whatsapp/ob;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lcom/whatsapp/ob;-><init>(Lcom/whatsapp/sz;Landroid/app/Activity;)V

    iput-object v4, v1, Lcom/whatsapp/MediaData;->downloader:Lcom/whatsapp/ob;

    .line 28
    iget-object v0, v1, Lcom/whatsapp/MediaData;->downloader:Lcom/whatsapp/ob;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/io/OutputStream;

    const/4 v5, 0x0

    new-instance v6, Lcom/whatsapp/pf;

    sget-object v7, Lcom/whatsapp/App;->B:Lcom/whatsapp/w5;

    iget-object v8, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-direct {v6, v7, v8}, Lcom/whatsapp/pf;-><init>(Lcom/whatsapp/w5;Ljava/io/File;)V

    aput-object v6, v4, v5

    invoke-virtual {v0, v4}, Lcom/whatsapp/ob;->a([Ljava/io/OutputStream;)Lcom/whatsapp/yf;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0

    move-result-object v0

    .line 5
    :goto_0
    :try_start_6
    iget-object v1, v1, Lcom/whatsapp/MediaData;->downloader:Lcom/whatsapp/ob;

    invoke-virtual {v1, v0}, Lcom/whatsapp/ob;->a(Lcom/whatsapp/yf;)V

    .line 17
    :cond_2
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    :goto_1
    return-void

    .line 24
    :catchall_0
    move-exception v0

    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    throw v0
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_0

    .line 10
    :catch_0
    move-exception v0

    .line 6
    iget-object v0, p0, Lcom/whatsapp/p9;->a:Lcom/whatsapp/ow;

    invoke-static {v0}, Lcom/whatsapp/ow;->a(Lcom/whatsapp/ow;)Ljava/util/Stack;

    move-result-object v1

    monitor-enter v1

    .line 29
    :cond_3
    :try_start_9
    iget-object v0, p0, Lcom/whatsapp/p9;->a:Lcom/whatsapp/ow;

    invoke-static {v0}, Lcom/whatsapp/ow;->a(Lcom/whatsapp/ow;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1
    iget-object v0, p0, Lcom/whatsapp/p9;->a:Lcom/whatsapp/ow;

    invoke-static {v0}, Lcom/whatsapp/ow;->a(Lcom/whatsapp/ow;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 16
    iget-object v0, v0, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 31
    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/whatsapp/MediaData;->transferring:Z

    .line 18
    const-wide/16 v4, 0x0

    iput-wide v4, v0, Lcom/whatsapp/MediaData;->progress:J

    .line 8
    if-eqz v3, :cond_3

    .line 9
    :cond_4
    monitor-exit v1

    goto :goto_1

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw v0

    .line 23
    :catchall_2
    move-exception v0

    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :try_start_b
    throw v0

    .line 11
    :catch_1
    move-exception v0

    .line 12
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/p9;->z:[Ljava/lang/String;

    const/4 v6, 0x1

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_0

    move-object v0, v2

    goto :goto_0
.end method
