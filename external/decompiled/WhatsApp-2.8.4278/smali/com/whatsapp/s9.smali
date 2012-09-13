.class Lcom/whatsapp/s9;
.super Ljava/lang/Thread;
.source "s9.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field a:Landroid/os/Handler;

.field b:Z

.field c:Z

.field d:I

.field final e:Lcom/whatsapp/RegisterName;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v1, 0x5a

    const/16 v3, 0x49

    const/16 v2, 0x34

    const/16 v4, 0x1c

    const/4 v6, 0x0

    const/16 v0, 0x9

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "(\u0002S o.\u0002F\'}7\u0002\u001b.y4HQ;n5\u0015"

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

    const-string v0, ")\u001eZ*3(\u0002S o.\u0002F\u0016o#\tW\u0016~;\u0013W!"

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

    const-string v0, "(\u0002S o.\u0002F\'}7\u0002\u001b!h.\u0017\u001b,n(\u0008F"

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

    const-string v0, "(\u0002S o.\u0002F\'}7\u0002\u001b,n(\u0008F"

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

    const/4 v10, 0x4

    const-string v0, "(\u0002S o.\u0002F\'}7\u0002\u001b su\u0002F;s("

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_4
    if-gt v7, v8, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, "(\u0002S o.\u0002F\'}7\u0002\u001b1q6\u0017U;o?\u0015\u001b,n(\u0008F"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_5
    if-gt v7, v8, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x6

    const-string v0, "zO"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_6
    if-gt v7, v8, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x7

    const-string v0, "z\u0015Q/i)\u0002P"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_7
    if-gt v7, v8, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v8, 0x8

    const-string v0, "(\u0002S o.\u0002F\'}7\u0002\u001b*s4\u0013U*h)HW&i4\u0013\u0014"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_8
    if-gt v6, v7, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/s9;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_9
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_9

    :pswitch_1
    const/16 v0, 0x67

    goto :goto_9

    :pswitch_2
    move v0, v2

    goto :goto_9

    :pswitch_3
    move v0, v3

    goto :goto_9

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_a

    :pswitch_5
    const/16 v0, 0x67

    goto :goto_a

    :pswitch_6
    move v0, v2

    goto :goto_a

    :pswitch_7
    move v0, v3

    goto :goto_a

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_b

    :pswitch_9
    const/16 v0, 0x67

    goto :goto_b

    :pswitch_a
    move v0, v2

    goto :goto_b

    :pswitch_b
    move v0, v3

    goto :goto_b

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_c

    :pswitch_d
    const/16 v0, 0x67

    goto :goto_c

    :pswitch_e
    move v0, v2

    goto :goto_c

    :pswitch_f
    move v0, v3

    goto :goto_c

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_d

    :pswitch_11
    const/16 v0, 0x67

    goto :goto_d

    :pswitch_12
    move v0, v2

    goto :goto_d

    :pswitch_13
    move v0, v3

    goto :goto_d

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_e

    :pswitch_15
    const/16 v0, 0x67

    goto :goto_e

    :pswitch_16
    move v0, v2

    goto :goto_e

    :pswitch_17
    move v0, v3

    goto :goto_e

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_f

    :pswitch_19
    const/16 v0, 0x67

    goto :goto_f

    :pswitch_1a
    move v0, v2

    goto :goto_f

    :pswitch_1b
    move v0, v3

    goto :goto_f

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_10

    :pswitch_1d
    const/16 v0, 0x67

    goto :goto_10

    :pswitch_1e
    move v0, v2

    goto :goto_10

    :pswitch_1f
    move v0, v3

    goto :goto_10

    :cond_8
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_11
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_11

    :pswitch_21
    const/16 v0, 0x67

    goto :goto_11

    :pswitch_22
    move v0, v2

    goto :goto_11

    :pswitch_23
    move v0, v3

    goto :goto_11

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

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_23
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/RegisterName;Landroid/os/Handler;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 18
    iput-object p1, p0, Lcom/whatsapp/s9;->e:Lcom/whatsapp/RegisterName;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 42
    iput-boolean v0, p0, Lcom/whatsapp/s9;->b:Z

    .line 33
    iput-boolean v0, p0, Lcom/whatsapp/s9;->c:Z

    .line 22
    iput v0, p0, Lcom/whatsapp/s9;->d:I

    .line 55
    iput-object p2, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    .line 64
    invoke-virtual {p0}, Lcom/whatsapp/s9;->start()V

    .line 3
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 83
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 34
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    .line 20
    :cond_0
    return-void
.end method

.method public a(Landroid/os/Handler;)V
    .locals 1
    .parameter

    .prologue
    .line 78
    iget-boolean v0, p0, Lcom/whatsapp/s9;->b:Z

    if-eqz v0, :cond_0

    .line 41
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 88
    :cond_0
    iput-object p1, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    .line 5
    return-void
.end method

.method public run()V
    .locals 12

    .prologue
    const/16 v11, 0xfa

    const/4 v3, 0x1

    const/4 v1, 0x0

    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 29
    const/4 v0, 0x1

    :try_start_0
    sput-boolean v0, Lcom/whatsapp/tp;->a:Z

    .line 40
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 95
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->e()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Lorg/apache/http/HttpException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    move-result v6

    .line 38
    const/16 v2, 0x3e9

    .line 10
    const/4 v0, 0x2

    :try_start_1
    invoke-static {v0}, Lcom/whatsapp/tp;->c(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Lorg/apache/http/HttpException; {:try_start_1 .. :try_end_1} :catch_4

    move-result v0

    move v2, v0

    .line 37
    :goto_0
    :try_start_2
    iget-object v7, p0, Lcom/whatsapp/s9;->e:Lcom/whatsapp/RegisterName;

    const/16 v0, 0x3e8

    if-gt v2, v0, :cond_d

    move v0, v3

    :goto_1
    invoke-static {v7, v0}, Lcom/whatsapp/App;->a(Landroid/content/Context;Z)V

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/whatsapp/s9;->z:[Ljava/lang/String;

    const/16 v8, 0x8

    aget-object v7, v7, v8

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/s9;->z:[Ljava/lang/String;

    const/4 v7, 0x6

    aget-object v2, v2, v7

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/s9;->e:Lcom/whatsapp/RegisterName;

    invoke-static {v2}, Lcom/whatsapp/App;->i(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    invoke-static {v5, v0}, Lcom/whatsapp/tp;->a(Ljava/util/HashMap;Landroid/content/ContentResolver;)Z

    .line 66
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/s9;->z:[Ljava/lang/String;

    const/4 v7, 0x1

    aget-object v2, v2, v7

    invoke-static {v0, v2}, Lcom/whatsapp/zq;->a(Ljava/util/Collection;Ljava/lang/String;)V

    .line 101
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    invoke-static {v0, v5}, Lcom/whatsapp/yp;->a(Lcom/whatsapp/App$Me;Ljava/util/HashMap;)V

    .line 8
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v2}, Lcom/whatsapp/qp;->a(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 52
    sget-object v0, Lcom/whatsapp/App;->lc:Lcom/whatsapp/g;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/whatsapp/g;->b(Z)V

    .line 31
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v0, v7, v8}, Lcom/whatsapp/App;->b(J)V

    .line 96
    invoke-static {}, Lcom/whatsapp/accountsync/PerformSyncManager;->b()V

    .line 49
    new-instance v0, Lcom/whatsapp/t9;

    invoke-direct {v0, p0}, Lcom/whatsapp/t9;-><init>(Lcom/whatsapp/s9;)V

    .line 82
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setPriority(I)V

    .line 86
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    new-instance v0, Lcom/whatsapp/u9;

    invoke-direct {v0, p0}, Lcom/whatsapp/u9;-><init>(Lcom/whatsapp/s9;)V

    .line 69
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setPriority(I)V

    .line 59
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 47
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V

    .line 72
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v2, v1

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedList;

    .line 54
    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 79
    iget-boolean v9, v0, Lcom/whatsapp/zq;->k:Z

    if-eqz v9, :cond_11

    .line 16
    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x2

    invoke-static {v0, v9, v10}, Lcom/whatsapp/App;->a(Ljava/lang/String;II)V

    .line 46
    add-int/lit8 v0, v2, 0x1

    .line 57
    if-le v0, v11, :cond_0

    .line 35
    if-eqz v4, :cond_1

    :cond_0
    :goto_4
    if-eqz v4, :cond_10

    .line 23
    :cond_1
    :goto_5
    if-le v0, v11, :cond_2

    .line 53
    if-eqz v4, :cond_3

    :cond_2
    if-eqz v4, :cond_f

    .line 61
    :cond_3
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    .line 81
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->i()Ljava/util/ArrayList;

    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 76
    invoke-virtual {v0}, Lcom/whatsapp/zq;->p()Z

    move-result v5

    if-nez v5, :cond_5

    .line 4
    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v7, 0x2

    invoke-static {v0, v5, v7}, Lcom/whatsapp/App;->a(Ljava/lang/String;II)V

    :cond_5
    if-eqz v4, :cond_4

    .line 65
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/s9;->e:Lcom/whatsapp/RegisterName;

    invoke-static {v0}, Lcom/whatsapp/RegisterName;->b(Lcom/whatsapp/RegisterName;)Lcom/whatsapp/zq;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/zq;->o:I

    if-nez v0, :cond_7

    .line 27
    iget-object v0, p0, Lcom/whatsapp/s9;->e:Lcom/whatsapp/RegisterName;

    invoke-static {v0}, Lcom/whatsapp/RegisterName;->b(Lcom/whatsapp/RegisterName;)Lcom/whatsapp/zq;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v5, 0x1

    invoke-static {v0, v2, v5}, Lcom/whatsapp/App;->a(Ljava/lang/String;II)V

    :cond_7
    move v0, v1

    .line 73
    :cond_8
    :goto_6
    sget-object v2, Lcom/whatsapp/App;->U:Lcom/whatsapp/c5;

    invoke-virtual {v2}, Lcom/whatsapp/c5;->b()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Lorg/apache/http/HttpException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    move-result v2

    if-nez v2, :cond_9

    const/16 v2, 0x4e20

    if-ge v0, v2, :cond_9

    .line 44
    add-int/lit16 v0, v0, 0xc8

    .line 91
    const-wide/16 v7, 0xc8

    :try_start_3
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lorg/apache/http/HttpException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    goto :goto_6

    .line 21
    :catch_0
    move-exception v2

    .line 99
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 71
    if-eqz v4, :cond_8

    .line 45
    :cond_9
    invoke-static {v6}, Lcom/whatsapp/g;->a(I)V

    .line 63
    sget-object v0, Lcom/whatsapp/App;->Ib:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 80
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/s9;->c:Z

    .line 89
    iget-object v0, p0, Lcom/whatsapp/s9;->e:Lcom/whatsapp/RegisterName;

    const/4 v2, 0x3

    invoke-static {v0, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Lorg/apache/http/HttpException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    .line 6
    iput-boolean v3, p0, Lcom/whatsapp/s9;->b:Z

    .line 32
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    if-eqz v0, :cond_a

    .line 62
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 9
    :cond_a
    :goto_7
    sput-boolean v1, Lcom/whatsapp/tp;->a:Z

    .line 39
    return-void

    .line 11
    :catch_1
    move-exception v0

    .line 2
    :try_start_5
    sget-object v7, Lcom/whatsapp/s9;->z:[Ljava/lang/String;

    const/4 v8, 0x3

    aget-object v7, v7, v8

    invoke-static {v7, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Lorg/apache/http/HttpException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto/16 :goto_0

    .line 60
    :catch_2
    move-exception v0

    .line 98
    :try_start_6
    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    .line 24
    if-eqz v2, :cond_b

    sget-object v5, Lcom/whatsapp/s9;->z:[Ljava/lang/String;

    const/4 v6, 0x7

    aget-object v5, v5, v6

    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 30
    const/4 v2, 0x3

    iput v2, p0, Lcom/whatsapp/s9;->d:I

    if-eqz v4, :cond_c

    .line 36
    :cond_b
    const/4 v2, 0x1

    iput v2, p0, Lcom/whatsapp/s9;->d:I

    .line 70
    :cond_c
    sget-object v2, Lcom/whatsapp/s9;->z:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v2, v2, v4

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 6
    iput-boolean v3, p0, Lcom/whatsapp/s9;->b:Z

    .line 32
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    if-eqz v0, :cond_a

    .line 62
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_7

    :cond_d
    move v0, v1

    .line 37
    goto/16 :goto_1

    .line 100
    :catch_3
    move-exception v0

    .line 84
    const/4 v2, 0x1

    :try_start_7
    iput v2, p0, Lcom/whatsapp/s9;->d:I

    .line 26
    sget-object v2, Lcom/whatsapp/s9;->z:[Ljava/lang/String;

    const/4 v4, 0x5

    aget-object v2, v2, v4

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 6
    iput-boolean v3, p0, Lcom/whatsapp/s9;->b:Z

    .line 32
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    if-eqz v0, :cond_a

    .line 62
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_7

    .line 7
    :catch_4
    move-exception v0

    .line 94
    const/4 v2, 0x3

    :try_start_8
    iput v2, p0, Lcom/whatsapp/s9;->d:I

    .line 74
    sget-object v2, Lcom/whatsapp/s9;->z:[Ljava/lang/String;

    const/4 v4, 0x2

    aget-object v2, v2, v4

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 6
    iput-boolean v3, p0, Lcom/whatsapp/s9;->b:Z

    .line 32
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    if-eqz v0, :cond_a

    .line 62
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_7

    .line 85
    :catch_5
    move-exception v0

    .line 13
    const/4 v2, 0x3

    :try_start_9
    iput v2, p0, Lcom/whatsapp/s9;->d:I

    .line 77
    sget-object v2, Lcom/whatsapp/s9;->z:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v2, v2, v4

    invoke-static {v2, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 6
    iput-boolean v3, p0, Lcom/whatsapp/s9;->b:Z

    .line 32
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    if-eqz v0, :cond_a

    .line 62
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_7

    .line 6
    :catchall_0
    move-exception v0

    iput-boolean v3, p0, Lcom/whatsapp/s9;->b:Z

    .line 32
    iget-object v2, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    if-eqz v2, :cond_e

    .line 62
    iget-object v2, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 9
    :cond_e
    sput-boolean v1, Lcom/whatsapp/tp;->a:Z

    .line 6
    throw v0

    .line 56
    :catch_6
    move-exception v0

    .line 6
    iput-boolean v3, p0, Lcom/whatsapp/s9;->b:Z

    .line 32
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    if-eqz v0, :cond_a

    .line 62
    iget-object v0, p0, Lcom/whatsapp/s9;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_7

    :cond_f
    move v2, v0

    goto/16 :goto_2

    :cond_10
    move v2, v0

    goto/16 :goto_3

    :cond_11
    move v0, v2

    goto/16 :goto_4

    :cond_12
    move v0, v2

    goto/16 :goto_5
.end method
