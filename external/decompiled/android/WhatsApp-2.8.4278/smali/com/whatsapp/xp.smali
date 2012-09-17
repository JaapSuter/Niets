.class public Lcom/whatsapp/xp;
.super Ljava/lang/Object;
.source "xp.java"


# static fields
.field private static a:Z

.field static b:Ljava/io/File;

.field static c:Ljava/io/File;

.field static d:Z

.field private static final e:Ljava/lang/Thread;

.field private static f:Ljava/lang/Thread;

.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v1, 0x44

    const/16 v2, 0x40

    const/16 v4, 0x25

    const/16 v3, 0x1c

    const/4 v8, 0x0

    const/4 v0, 0x5

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0004%4}H\t#2}QO74}W\u0014k!pW\u0005%$e\u0008\u00130!nQ\u0005 "

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_0
    if-gt v6, v7, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    const/4 v10, 0x1

    const-string v0, "\u0003+.hD\u000303"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, "\u0001*$nJ\t \u001f\u007fJ\u000e0!\u007fQ\u0013"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2
    if-gt v6, v7, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "\u0004%4}H\t#2}QO-.uQ\u0004&"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3
    if-gt v6, v7, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, "\t*)ha\"k%nW\u000f6"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_4
    if-gt v6, v7, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    sput-object v9, Lcom/whatsapp/xp;->z:[Ljava/lang/String;

    .line 38
    sput-boolean v8, Lcom/whatsapp/xp;->a:Z

    .line 54
    sput-boolean v8, Lcom/whatsapp/xp;->d:Z

    .line 45
    new-instance v0, Lcom/whatsapp/f9;

    invoke-direct {v0}, Lcom/whatsapp/f9;-><init>()V

    sput-object v0, Lcom/whatsapp/xp;->e:Ljava/lang/Thread;

    .line 63
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/xp;->f:Ljava/lang/Thread;

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_5
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_0

    :pswitch_0
    const/16 v0, 0x60

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
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_6
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x60

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
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_7
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x60

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
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_8
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x60

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
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_9
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x60

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

.method public static a()V
    .locals 2

    .prologue
    .line 28
    sget-boolean v0, Lcom/whatsapp/xp;->a:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/whatsapp/xp;->d:Z

    if-eqz v0, :cond_1

    .line 2
    :cond_0
    sget-object v0, Lcom/whatsapp/xp;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    sget v0, Lcom/whatsapp/yq;->e:I

    if-eqz v0, :cond_2

    .line 62
    :cond_1
    sget-object v0, Lcom/whatsapp/xp;->e:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 13
    const/4 v0, 0x1

    sput-boolean v0, Lcom/whatsapp/xp;->d:Z

    .line 41
    :cond_2
    return-void
.end method

.method static a(Z)Z
    .locals 0
    .parameter

    .prologue
    .line 20
    sput-boolean p0, Lcom/whatsapp/xp;->a:Z

    return p0
.end method

.method public static b()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x1

    sput-boolean v0, Lcom/whatsapp/xp;->a:Z

    .line 43
    return-void
.end method

.method public static c()V
    .locals 1

    .prologue
    .line 30
    sget-boolean v0, Lcom/whatsapp/xp;->a:Z

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lcom/whatsapp/g9;

    invoke-direct {v0}, Lcom/whatsapp/g9;-><init>()V

    sput-object v0, Lcom/whatsapp/xp;->f:Ljava/lang/Thread;

    .line 52
    sget-object v0, Lcom/whatsapp/xp;->f:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 39
    :cond_0
    return-void
.end method

.method public static d()Z
    .locals 1

    .prologue
    .line 15
    sget-boolean v0, Lcom/whatsapp/xp;->a:Z

    if-nez v0, :cond_0

    .line 59
    :try_start_0
    sget-object v0, Lcom/whatsapp/xp;->e:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->join()V

    .line 48
    sget-object v0, Lcom/whatsapp/xp;->f:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    .line 19
    sget-object v0, Lcom/whatsapp/xp;->f:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :cond_0
    :goto_0
    sget-boolean v0, Lcom/whatsapp/xp;->a:Z

    return v0

    .line 4
    :catch_0
    move-exception v0

    .line 16
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0
.end method

.method public static e()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 36
    sget-object v2, Lcom/whatsapp/xp;->f:Ljava/lang/Thread;

    if-eqz v2, :cond_2

    .line 5
    sget-object v2, Lcom/whatsapp/xp;->f:Ljava/lang/Thread;

    invoke-virtual {v2}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v2

    sget-object v3, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-ne v2, v3, :cond_1

    .line 14
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 5
    goto :goto_0

    .line 14
    :cond_2
    sget-object v2, Lcom/whatsapp/xp;->e:Ljava/lang/Thread;

    invoke-virtual {v2}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v2

    sget-object v3, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-eq v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public static f()Z
    .locals 1

    .prologue
    .line 11
    sget-boolean v0, Lcom/whatsapp/xp;->a:Z

    return v0
.end method

.method private static g()Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 10
    :try_start_0
    sget-object v2, Lcom/whatsapp/xp;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 7
    const/4 v2, 0x1

    sput-boolean v2, Lcom/whatsapp/tp;->a:Z

    .line 60
    const/4 v2, 0x1

    sput-boolean v2, Lcom/whatsapp/eu;->h:Z

    .line 3
    const/4 v2, 0x1

    sput-boolean v2, Lcom/whatsapp/eu;->j:Z

    .line 9
    sget-object v2, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/whatsapp/qp;->a(Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 37
    sget-object v3, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v3}, Lcom/whatsapp/qp;->e()I

    move-result v3

    .line 29
    sget-object v4, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-static {v2, v4}, Lcom/whatsapp/tp;->a(Ljava/util/HashMap;Landroid/content/ContentResolver;)Z

    .line 22
    sget-object v4, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    invoke-static {v4, v2}, Lcom/whatsapp/yp;->a(Lcom/whatsapp/App$Me;Ljava/util/HashMap;)V

    .line 46
    sget-object v4, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, Lcom/whatsapp/qp;->a(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 34
    sget-object v4, Lcom/whatsapp/App;->Ib:Landroid/os/Handler;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 8
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 33
    const/4 v2, 0x0

    sput-boolean v2, Lcom/whatsapp/tp;->a:Z

    .line 24
    sget-object v2, Lcom/whatsapp/App;->lc:Lcom/whatsapp/g;

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Lcom/whatsapp/g;->b(Z)V

    .line 56
    invoke-static {v3}, Lcom/whatsapp/g;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    :goto_0
    return v0

    .line 17
    :catch_0
    move-exception v0

    .line 35
    sget-object v2, Lcom/whatsapp/xp;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    .line 25
    goto :goto_0
.end method

.method public static h()V
    .locals 6

    .prologue
    const/4 v0, 0x0

    sget v1, Lcom/whatsapp/yq;->e:I

    .line 61
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v3, Lcom/whatsapp/xp;->z:[Ljava/lang/String;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v2, v3, v0}, Lcom/whatsapp/App;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v2

    sput-object v2, Lcom/whatsapp/xp;->b:Ljava/io/File;

    .line 42
    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v3}, Lcom/whatsapp/App;->getFilesDir()Ljava/io/File;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/xp;->z:[Ljava/lang/String;

    const/4 v5, 0x2

    aget-object v4, v4, v5

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v2, Lcom/whatsapp/xp;->c:Ljava/io/File;

    .line 55
    sget-object v2, Lcom/whatsapp/xp;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 23
    sget-object v2, Lcom/whatsapp/xp;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 18
    if-eqz v2, :cond_1

    .line 26
    array-length v3, v2

    :cond_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 57
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 21
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 27
    :cond_1
    sget-object v0, Lcom/whatsapp/xp;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 47
    :cond_2
    sget-object v0, Lcom/whatsapp/xp;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 53
    sget-object v0, Lcom/whatsapp/xp;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 44
    :cond_3
    return-void
.end method

.method public static i()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 58
    sput-boolean v0, Lcom/whatsapp/xp;->a:Z

    .line 40
    sput-boolean v0, Lcom/whatsapp/xp;->d:Z

    .line 49
    return-void
.end method

.method static j()Z
    .locals 1

    .prologue
    .line 51
    invoke-static {}, Lcom/whatsapp/xp;->g()Z

    move-result v0

    return v0
.end method
